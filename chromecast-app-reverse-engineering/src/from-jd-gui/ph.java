import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;

public final class ph
{
  public Context a;
  
  private ph(Context paramContext)
  {
    this.a = paramContext;
  }
  
  public static ph a(Context paramContext)
  {
    return new ph(paramContext);
  }
  
  public final boolean a()
  {
    if (this.a.getApplicationInfo().targetSdkVersion >= 16) {}
    for (boolean bool = this.a.getResources().getBoolean(a.U);; bool = this.a.getResources().getBoolean(a.V)) {
      return bool;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\ph.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */