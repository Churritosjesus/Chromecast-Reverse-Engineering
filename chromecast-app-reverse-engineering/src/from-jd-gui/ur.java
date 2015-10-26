import android.media.MediaRouter.RouteInfo;
import android.os.Build.VERSION;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class ur
{
  private Method a;
  private int b;
  
  public ur()
  {
    if (Build.VERSION.SDK_INT != 17) {
      throw new UnsupportedOperationException();
    }
    try
    {
      this.b = MediaRouter.RouteInfo.class.getField("STATUS_CONNECTING").getInt(null);
      this.a = MediaRouter.RouteInfo.class.getMethod("getStatusCode", new Class[0]);
      return;
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      for (;;) {}
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      for (;;) {}
    }
    catch (NoSuchFieldException localNoSuchFieldException)
    {
      for (;;) {}
    }
  }
  
  public final boolean a(Object paramObject)
  {
    paramObject = (MediaRouter.RouteInfo)paramObject;
    if (this.a != null) {
      for (;;)
      {
        try
        {
          int i = ((Integer)this.a.invoke(paramObject, new Object[0])).intValue();
          int j = this.b;
          if (i != j) {
            continue;
          }
          bool = true;
        }
        catch (InvocationTargetException paramObject)
        {
          boolean bool = false;
          continue;
        }
        catch (IllegalAccessException paramObject)
        {
          continue;
        }
        return bool;
        bool = false;
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\ur.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */