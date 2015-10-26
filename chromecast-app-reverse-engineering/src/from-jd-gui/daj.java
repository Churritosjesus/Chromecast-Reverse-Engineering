import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.Uri;

public final class daj
{
  static
  {
    Uri.parse("http://play.google.com/store/apps/details");
  }
  
  public static String a()
  {
    return 35 + 1 + ".2.1";
  }
  
  public static String a(Context paramContext)
  {
    try
    {
      paramContext = paramContext.getPackageManager().getPackageInfo(paramContext.getPackageName(), 0).versionName;
      return paramContext;
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      throw new IllegalStateException("Cannot retrieve calling Context's PackageInfo", paramContext);
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\daj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */