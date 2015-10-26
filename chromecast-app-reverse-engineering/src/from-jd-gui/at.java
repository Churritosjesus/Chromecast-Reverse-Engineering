import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build.VERSION;

public final class at
{
  private static final au a;
  
  static
  {
    if (Build.VERSION.SDK_INT >= 16) {}
    for (a = new av();; a = new au()) {
      return;
    }
  }
  
  public static Intent a(Activity paramActivity)
  {
    return a.a(paramActivity);
  }
  
  public static Intent a(Context paramContext, ComponentName paramComponentName)
  {
    String str = b(paramContext, paramComponentName);
    if (str == null) {
      paramContext = null;
    }
    for (;;)
    {
      return paramContext;
      paramComponentName = new ComponentName(paramComponentName.getPackageName(), str);
      if (b(paramContext, paramComponentName) == null) {
        paramContext = be.a(paramComponentName);
      } else {
        paramContext = new Intent().setComponent(paramComponentName);
      }
    }
  }
  
  public static boolean a(Activity paramActivity, Intent paramIntent)
  {
    return a.a(paramActivity, paramIntent);
  }
  
  public static String b(Activity paramActivity)
  {
    try
    {
      paramActivity = b(paramActivity, paramActivity.getComponentName());
      return paramActivity;
    }
    catch (PackageManager.NameNotFoundException paramActivity)
    {
      throw new IllegalArgumentException(paramActivity);
    }
  }
  
  public static String b(Context paramContext, ComponentName paramComponentName)
  {
    paramComponentName = paramContext.getPackageManager().getActivityInfo(paramComponentName, 128);
    return a.a(paramContext, paramComponentName);
  }
  
  public static void b(Activity paramActivity, Intent paramIntent)
  {
    a.b(paramActivity, paramIntent);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\at.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */