import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.os.ParcelFileDescriptor.AutoCloseInputStream;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;

final class agk
  implements agg
{
  private final OutputStream a;
  private final aiw b;
  private boolean c = true;
  private boolean d = false;
  
  public agk(OutputStream paramOutputStream, aiw paramaiw, boolean paramBoolean)
  {
    this.a = paramOutputStream;
    this.b = paramaiw;
    this.d = paramBoolean;
  }
  
  private static RuntimeException a()
  {
    return new IllegalArgumentException("value is not a supported type.");
  }
  
  private void a(String paramString1, Uri paramUri, String paramString2)
  {
    String str = paramString2;
    if (paramString2 == null) {
      str = "content/unknown";
    }
    a(paramString1, paramString1, str);
    paramString2 = afv.f().getContentResolver().openInputStream(paramUri);
    int i;
    if ((this.a instanceof agy))
    {
      long l = aji.a(paramUri);
      ((agy)this.a).a(l);
      i = 0;
      b("", new Object[0]);
      b();
      if (this.b != null)
      {
        paramUri = this.b;
        paramString1 = String.valueOf(paramString1);
        if (paramString1.length() == 0) {
          break label147;
        }
      }
    }
    label147:
    for (paramString1 = "    ".concat(paramString1);; paramString1 = new String("    "))
    {
      paramUri.a(paramString1, String.format(Locale.ROOT, "<Data: %d>", new Object[] { Integer.valueOf(i) }));
      return;
      i = aji.a(paramString2, this.a) + 0;
      break;
    }
  }
  
  private void a(String paramString1, ParcelFileDescriptor paramParcelFileDescriptor, String paramString2)
  {
    String str = paramString2;
    if (paramString2 == null) {
      str = "content/unknown";
    }
    a(paramString1, paramString1, str);
    int i;
    if ((this.a instanceof agy))
    {
      ((agy)this.a).a(paramParcelFileDescriptor.getStatSize());
      i = 0;
      b("", new Object[0]);
      b();
      if (this.b != null)
      {
        paramParcelFileDescriptor = this.b;
        paramString1 = String.valueOf(paramString1);
        if (paramString1.length() == 0) {
          break label139;
        }
      }
    }
    label139:
    for (paramString1 = "    ".concat(paramString1);; paramString1 = new String("    "))
    {
      paramParcelFileDescriptor.a(paramString1, String.format(Locale.ROOT, "<Data: %d>", new Object[] { Integer.valueOf(i) }));
      return;
      i = aji.a(new ParcelFileDescriptor.AutoCloseInputStream(paramParcelFileDescriptor), this.a) + 0;
      break;
    }
  }
  
  private void a(String paramString1, String paramString2, String paramString3)
  {
    if (!this.d)
    {
      a("Content-Disposition: form-data; name=\"%s\"", new Object[] { paramString1 });
      if (paramString2 != null) {
        a("; filename=\"%s\"", new Object[] { paramString2 });
      }
      b("", new Object[0]);
      if (paramString3 != null) {
        b("%s: %s", new Object[] { "Content-Type", paramString3 });
      }
      b("", new Object[0]);
    }
    for (;;)
    {
      return;
      this.a.write(String.format("%s=", new Object[] { paramString1 }).getBytes());
    }
  }
  
  private void a(String paramString, Object... paramVarArgs)
  {
    if (!this.d)
    {
      if (this.c)
      {
        this.a.write("--".getBytes());
        this.a.write("3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f".getBytes());
        this.a.write("\r\n".getBytes());
        this.c = false;
      }
      this.a.write(String.format(paramString, paramVarArgs).getBytes());
    }
    for (;;)
    {
      return;
      this.a.write(URLEncoder.encode(String.format(Locale.US, paramString, paramVarArgs), "UTF-8").getBytes());
    }
  }
  
  private void b()
  {
    if (!this.d) {
      b("--%s", new Object[] { "3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f" });
    }
    for (;;)
    {
      return;
      this.a.write("&".getBytes());
    }
  }
  
  private void b(String paramString, Object... paramVarArgs)
  {
    a(paramString, paramVarArgs);
    if (!this.d) {
      a("\r\n", new Object[0]);
    }
  }
  
  public final void a(String paramString, Object paramObject, aga paramaga)
  {
    if ((this.a instanceof ahb)) {
      ((ahb)this.a).a(paramaga);
    }
    if (aga.a(paramObject)) {
      a(paramString, aga.b(paramObject));
    }
    for (;;)
    {
      return;
      if ((paramObject instanceof Bitmap))
      {
        paramObject = (Bitmap)paramObject;
        a(paramString, paramString, "image/png");
        ((Bitmap)paramObject).compress(Bitmap.CompressFormat.PNG, 100, this.a);
        b("", new Object[0]);
        b();
        if (this.b != null)
        {
          paramObject = this.b;
          paramString = String.valueOf(paramString);
          if (paramString.length() != 0) {}
          for (paramString = "    ".concat(paramString);; paramString = new String("    "))
          {
            ((aiw)paramObject).a(paramString, "<Image>");
            break;
          }
        }
      }
      else if ((paramObject instanceof byte[]))
      {
        paramObject = (byte[])paramObject;
        a(paramString, paramString, "content/unknown");
        this.a.write((byte[])paramObject);
        b("", new Object[0]);
        b();
        if (this.b != null)
        {
          paramaga = this.b;
          paramString = String.valueOf(paramString);
          if (paramString.length() != 0) {}
          for (paramString = "    ".concat(paramString);; paramString = new String("    "))
          {
            paramaga.a(paramString, String.format(Locale.ROOT, "<Data: %d>", new Object[] { Integer.valueOf(paramObject.length) }));
            break;
          }
        }
      }
      else if ((paramObject instanceof Uri))
      {
        a(paramString, (Uri)paramObject, null);
      }
      else if ((paramObject instanceof ParcelFileDescriptor))
      {
        a(paramString, (ParcelFileDescriptor)paramObject, null);
      }
      else
      {
        if (!(paramObject instanceof agi)) {
          break label362;
        }
        paramaga = (agi)paramObject;
        paramObject = paramaga.b;
        paramaga = paramaga.a;
        if ((paramObject instanceof ParcelFileDescriptor))
        {
          a(paramString, (ParcelFileDescriptor)paramObject, paramaga);
        }
        else
        {
          if (!(paramObject instanceof Uri)) {
            break;
          }
          a(paramString, (Uri)paramObject, paramaga);
        }
      }
    }
    throw a();
    label362:
    throw a();
  }
  
  public final void a(String paramString1, String paramString2)
  {
    a(paramString1, null, null);
    b("%s", new Object[] { paramString2 });
    b();
    aiw localaiw;
    if (this.b != null)
    {
      localaiw = this.b;
      paramString1 = String.valueOf(paramString1);
      if (paramString1.length() == 0) {
        break label63;
      }
    }
    label63:
    for (paramString1 = "    ".concat(paramString1);; paramString1 = new String("    "))
    {
      localaiw.a(paramString1, paramString2);
      return;
    }
  }
  
  public final void a(String paramString, JSONArray paramJSONArray, Collection paramCollection)
  {
    if (!(this.a instanceof ahb)) {
      a(paramString, paramJSONArray.toString());
    }
    do
    {
      return;
      ahb localahb = (ahb)this.a;
      a(paramString, null, null);
      a("[", new Object[0]);
      Iterator localIterator = paramCollection.iterator();
      int i = 0;
      if (localIterator.hasNext())
      {
        paramCollection = (aga)localIterator.next();
        JSONObject localJSONObject = paramJSONArray.getJSONObject(i);
        localahb.a(paramCollection);
        if (i > 0) {
          a(",%s", new Object[] { localJSONObject.toString() });
        }
        for (;;)
        {
          i++;
          break;
          a("%s", new Object[] { localJSONObject.toString() });
        }
      }
      a("]", new Object[0]);
    } while (this.b == null);
    paramCollection = this.b;
    paramString = String.valueOf(paramString);
    if (paramString.length() != 0) {}
    for (paramString = "    ".concat(paramString);; paramString = new String("    "))
    {
      paramCollection.a(paramString, paramJSONArray.toString());
      break;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\agk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */