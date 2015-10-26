import android.util.Log;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class gv
  extends gu
{
  public final void a(ViewGroup paramViewGroup, boolean paramBoolean)
  {
    if (a.f == null) {}
    try
    {
      a.f = ViewGroup.class.getDeclaredMethod("setChildrenDrawingOrderEnabled", new Class[] { Boolean.TYPE });
      a.f.setAccessible(true);
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      try
      {
        a.f.invoke(paramViewGroup, new Object[] { Boolean.valueOf(paramBoolean) });
        return;
        localNoSuchMethodException = localNoSuchMethodException;
        Log.e("ViewCompat", "Unable to find childrenDrawingOrderEnabled", localNoSuchMethodException);
      }
      catch (IllegalAccessException paramViewGroup)
      {
        for (;;)
        {
          Log.e("ViewCompat", "Unable to invoke childrenDrawingOrderEnabled", paramViewGroup);
        }
      }
      catch (IllegalArgumentException paramViewGroup)
      {
        for (;;)
        {
          Log.e("ViewCompat", "Unable to invoke childrenDrawingOrderEnabled", paramViewGroup);
        }
      }
      catch (InvocationTargetException paramViewGroup)
      {
        for (;;)
        {
          Log.e("ViewCompat", "Unable to invoke childrenDrawingOrderEnabled", paramViewGroup);
        }
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\gv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */