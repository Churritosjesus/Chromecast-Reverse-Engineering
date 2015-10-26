import android.graphics.Rect;
import android.os.Build.VERSION;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class tm
{
  private static Method a;
  
  static
  {
    if (Build.VERSION.SDK_INT >= 18) {}
    try
    {
      Method localMethod = View.class.getDeclaredMethod("computeFitSystemWindows", new Class[] { Rect.class, Rect.class });
      a = localMethod;
      if (!localMethod.isAccessible()) {
        a.setAccessible(true);
      }
      return;
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      for (;;) {}
    }
  }
  
  public static int a(int paramInt1, int paramInt2)
  {
    return paramInt1 | paramInt2;
  }
  
  public static void a(View paramView, Rect paramRect1, Rect paramRect2)
  {
    if (a != null) {}
    try
    {
      a.invoke(paramView, new Object[] { paramRect1, paramRect2 });
      return;
    }
    catch (Exception paramView)
    {
      for (;;) {}
    }
  }
  
  public static boolean a(View paramView)
  {
    boolean bool = true;
    if (gt.g(paramView) == 1) {}
    for (;;)
    {
      return bool;
      bool = false;
    }
  }
  
  public static void b(View paramView)
  {
    if (Build.VERSION.SDK_INT >= 16) {}
    try
    {
      Method localMethod = paramView.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
      if (!localMethod.isAccessible()) {
        localMethod.setAccessible(true);
      }
      localMethod.invoke(paramView, new Object[0]);
      return;
    }
    catch (IllegalAccessException paramView)
    {
      for (;;) {}
    }
    catch (InvocationTargetException paramView)
    {
      for (;;) {}
    }
    catch (NoSuchMethodException paramView)
    {
      for (;;) {}
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\tm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */