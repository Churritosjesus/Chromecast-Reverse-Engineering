import android.media.MediaRouter;
import android.os.Build.VERSION;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class uk
{
  private Method a;
  
  public uk()
  {
    if ((Build.VERSION.SDK_INT < 16) || (Build.VERSION.SDK_INT > 17)) {
      throw new UnsupportedOperationException();
    }
    try
    {
      this.a = MediaRouter.class.getMethod("getSystemAudioRoute", new Class[0]);
      return;
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      for (;;) {}
    }
  }
  
  public final Object a(Object paramObject)
  {
    MediaRouter localMediaRouter = (MediaRouter)paramObject;
    if (this.a != null) {}
    try
    {
      paramObject = this.a.invoke(localMediaRouter, new Object[0]);
      return paramObject;
    }
    catch (InvocationTargetException paramObject)
    {
      for (;;)
      {
        paramObject = localMediaRouter.getRouteAt(0);
      }
    }
    catch (IllegalAccessException paramObject)
    {
      for (;;) {}
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\uk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */