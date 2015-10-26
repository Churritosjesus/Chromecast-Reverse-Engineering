import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build.VERSION;
import android.os.Handler;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class uo
  implements Runnable
{
  final Handler a;
  Method b;
  boolean c;
  private final DisplayManager d;
  
  public uo(Context paramContext, Handler paramHandler)
  {
    if (Build.VERSION.SDK_INT != 17) {
      throw new UnsupportedOperationException();
    }
    this.d = ((DisplayManager)paramContext.getSystemService("display"));
    this.a = paramHandler;
    try
    {
      this.b = DisplayManager.class.getMethod("scanWifiDisplays", new Class[0]);
      return;
    }
    catch (NoSuchMethodException paramContext)
    {
      for (;;) {}
    }
  }
  
  public final void run()
  {
    if (this.c) {}
    try
    {
      this.b.invoke(this.d, new Object[0]);
      this.a.postDelayed(this, 15000L);
      return;
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      for (;;)
      {
        Log.w("MediaRouterJellybeanMr1", "Cannot scan for wifi displays.", localIllegalAccessException);
      }
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      for (;;)
      {
        Log.w("MediaRouterJellybeanMr1", "Cannot scan for wifi displays.", localInvocationTargetException);
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\uo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */