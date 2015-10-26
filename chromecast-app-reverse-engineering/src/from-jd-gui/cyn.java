import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import java.util.Map;

final class cyn
  extends cvf
{
  private static final String b = cip.d.toString();
  private final Context c;
  
  public cyn(Context paramContext)
  {
    super(b, new String[0]);
    this.c = paramContext;
  }
  
  public final cje a(Map paramMap)
  {
    try
    {
      paramMap = this.c.getPackageManager();
      paramMap = cyh.a(paramMap.getApplicationLabel(paramMap.getApplicationInfo(this.c.getPackageName(), 0)).toString());
      return paramMap;
    }
    catch (PackageManager.NameNotFoundException paramMap)
    {
      for (;;)
      {
        cuh.a("App name is not found.", paramMap);
        paramMap = cyh.f();
      }
    }
  }
  
  public final boolean a()
  {
    return true;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cyn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */