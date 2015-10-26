import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build.VERSION;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

final class cwz
  implements Runnable
{
  final String a;
  cwb b;
  volatile String c;
  volatile String d;
  private final Context e;
  private final cmi f;
  private final String g;
  private volatile czb h;
  
  private cwz(Context paramContext, String paramString, cmi paramcmi, czb paramczb)
  {
    this.e = paramContext;
    this.f = paramcmi;
    this.g = paramString;
    this.h = paramczb;
    this.a = ("/r?id=" + paramString);
    this.c = this.a;
    this.d = null;
  }
  
  public cwz(Context paramContext, String paramString, czb paramczb)
  {
    this(paramContext, paramString, new cmi(), paramczb);
  }
  
  public final void run()
  {
    if (this.b == null) {
      throw new IllegalStateException("callback must be set before execute");
    }
    Object localObject1 = ((ConnectivityManager)this.e.getSystemService("connectivity")).getActiveNetworkInfo();
    if ((localObject1 == null) || (!((NetworkInfo)localObject1).isConnected())) {
      cuh.e("...no network connectivity");
    }
    for (int i = 0; i == 0; i = 1)
    {
      localObject1 = this.b;
      i = cwc.a;
      ((cwb)localObject1).a();
      return;
    }
    cuh.e("Start loading resource from network ...");
    Object localObject2 = this.h.a + this.c + "&v=a65833898";
    localObject1 = localObject2;
    if (this.d != null)
    {
      localObject1 = localObject2;
      if (!this.d.trim().equals("")) {
        localObject1 = (String)localObject2 + "&pv=" + this.d;
      }
    }
    if (cuk.a().a.equals(cul.c)) {}
    Object localObject4;
    for (localObject2 = (String)localObject1 + "&gtm_debug=x";; localObject4 = localObject1)
    {
      localObject1 = this.f;
      if (Build.VERSION.SDK_INT < 8) {
        localObject1 = new cmf();
      }
      try
      {
        for (;;)
        {
          Object localObject5 = ((cmh)localObject1).a((String)localObject2);
          try
          {
            Object localObject6 = new java/io/ByteArrayOutputStream;
            ((ByteArrayOutputStream)localObject6).<init>();
            a.a((InputStream)localObject5, (OutputStream)localObject6);
            localObject5 = ((ByteArrayOutputStream)localObject6).toByteArray();
            localObject6 = new cjd;
            ((cjd)localObject6).<init>();
            localObject5 = (cjd)cms.a((cms)localObject6, (byte[])localObject5);
            localObject6 = new java/lang/StringBuilder;
            ((StringBuilder)localObject6).<init>("Successfully loaded supplemented resource: ");
            cuh.e(localObject5);
            if ((((cjd)localObject5).b == null) && (((cjd)localObject5).a.length == 0))
            {
              localObject6 = new java/lang/StringBuilder;
              ((StringBuilder)localObject6).<init>("No change for container: ");
              cuh.e(this.g);
            }
            this.b.a(localObject5);
            ((cmh)localObject1).a();
            cuh.e("Load resource from network finished.");
          }
          catch (IOException localIOException1)
          {
            StringBuilder localStringBuilder1;
            StringBuilder localStringBuilder2 = new java/lang/StringBuilder;
            localStringBuilder2.<init>("Error when parsing downloaded resources from url: ");
            cuh.b((String)localObject2 + " " + localIOException1.getMessage(), localIOException1);
            localObject2 = this.b;
            i = cwc.c;
            ((cwb)localObject2).a();
          }
          localObject1 = new cmg();
        }
      }
      catch (FileNotFoundException localFileNotFoundException)
      {
        localStringBuilder1 = new java/lang/StringBuilder;
        localStringBuilder1.<init>("No data is retrieved from the given url: ");
        cuh.b((String)localObject2 + ". Make sure container_id: " + this.g + " is correct.");
        localObject2 = this.b;
        i = cwc.c;
        ((cwb)localObject2).a();
        ((cmh)localObject1).a();
        break;
      }
      catch (IOException localIOException2)
      {
        localStringBuilder1 = new java/lang/StringBuilder;
        localStringBuilder1.<init>("Error when loading resources from url: ");
        cuh.b((String)localObject2 + " " + localIOException2.getMessage(), localIOException2);
        localObject2 = this.b;
        i = cwc.b;
        ((cwb)localObject2).a();
        ((cmh)localObject1).a();
        break;
        break;
      }
      finally
      {
        ((cmh)localObject1).a();
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cwz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */