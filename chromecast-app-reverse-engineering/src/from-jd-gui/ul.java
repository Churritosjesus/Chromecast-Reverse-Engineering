import android.media.MediaRouter;
import android.media.MediaRouter.RouteInfo;
import android.os.Build.VERSION;
import java.lang.reflect.Method;

public final class ul
{
  Method a;
  
  public ul()
  {
    if ((Build.VERSION.SDK_INT < 16) || (Build.VERSION.SDK_INT > 17)) {
      throw new UnsupportedOperationException();
    }
    try
    {
      this.a = MediaRouter.class.getMethod("selectRouteInt", new Class[] { Integer.TYPE, MediaRouter.RouteInfo.class });
      return;
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      for (;;) {}
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\ul.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */