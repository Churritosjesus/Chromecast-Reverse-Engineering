import android.content.Context;
import android.content.pm.PackageManager;

public final class cab
{
  public static int a(int paramInt)
  {
    return paramInt / 1000;
  }
  
  public static boolean a(Context paramContext)
  {
    return paramContext.getPackageManager().hasSystemFeature("android.hardware.type.watch");
  }
  
  public static boolean b(int paramInt)
  {
    if (paramInt % 1000 / 100 == 3) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */