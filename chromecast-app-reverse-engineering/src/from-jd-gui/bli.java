import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.google.android.apps.chromecast.app.SetupApplication;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public final class bli
{
  static final String b = Locale.ENGLISH.getLanguage();
  public static final String[] d = { "Default", "Production", "Dogfood", "Alpha" };
  private static final String[] f = { "", "prod", "dogfood", "alpha" };
  Map a;
  public blp c = new blp("GtmContainerManager", false);
  private Map e = new HashMap();
  
  public bli(Context paramContext)
  {
    try
    {
      int i = a.hk;
      blf.b();
      a(paramContext, i);
      this.a = new HashMap();
      this.a.put("en", Integer.valueOf(a.hf));
      this.a.put("es", Integer.valueOf(a.hg));
      this.a.put("es-MX", Integer.valueOf(a.hh));
      return;
    }
    catch (IOException paramContext)
    {
      for (;;)
      {
        this.c.a("Failed to load default container maps", new Object[0]);
      }
    }
  }
  
  public static int a()
  {
    return a.hk;
  }
  
  public static int a(String paramString, int paramInt)
  {
    if (paramString.equals("prod")) {
      paramInt = a.hk;
    }
    for (;;)
    {
      return paramInt;
      if (paramString.equals("dogfood")) {
        paramInt = a.hj;
      } else if (paramString.equals("alpha")) {
        paramInt = a.hi;
      }
    }
  }
  
  public static String a(boolean paramBoolean)
  {
    String str;
    if (paramBoolean)
    {
      str = PreferenceManager.getDefaultSharedPreferences(SetupApplication.a()).getString("ACM_LEVEL", "");
      if (TextUtils.isEmpty(str)) {}
    }
    for (;;)
    {
      return str;
      str = d[1];
    }
  }
  
  public static String[] c()
  {
    return d;
  }
  
  public static String[] d()
  {
    return f;
  }
  
  public void a(Context paramContext, int paramInt)
  {
    paramContext = paramContext.getResources().openRawResource(paramInt);
    Object localObject = new byte[paramContext.available()];
    paramContext.read((byte[])localObject);
    String[] arrayOfString = new String((byte[])localObject).split("\n");
    int i = arrayOfString.length;
    for (paramInt = 0; paramInt < i; paramInt++)
    {
      localObject = arrayOfString[paramInt].split(",");
      this.e.put(localObject[0], localObject[1]);
    }
    paramContext.close();
  }
  
  public final String b()
  {
    Object localObject = Locale.getDefault();
    if (this.e.containsKey(blj.c((Locale)localObject))) {
      localObject = (String)this.e.get(blj.c((Locale)localObject));
    }
    for (;;)
    {
      return (String)localObject;
      if (this.e.containsKey(blj.b((Locale)localObject))) {
        localObject = (String)this.e.get(blj.b((Locale)localObject));
      } else if (this.e.containsKey(b)) {
        localObject = (String)this.e.get(b);
      } else {
        localObject = null;
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bli.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */