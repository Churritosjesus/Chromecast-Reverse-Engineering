import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import java.util.Map;

final class cyo
  extends cvf
{
  private static final String b = cip.e.toString();
  private final Context c;
  
  public cyo(Context paramContext)
  {
    super(b, new String[0]);
    this.c = paramContext;
  }
  
  public final cje a(Map paramMap)
  {
    try
    {
      paramMap = cyh.a(Integer.valueOf(this.c.getPackageManager().getPackageInfo(this.c.getPackageName(), 0).versionCode));
      return paramMap;
    }
    catch (PackageManager.NameNotFoundException paramMap)
    {
      for (;;)
      {
        cuh.a("Package name " + this.c.getPackageName() + " not found. " + paramMap.getMessage());
        paramMap = cyh.f();
      }
    }
  }
  
  public final boolean a()
  {
    return true;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cyo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */