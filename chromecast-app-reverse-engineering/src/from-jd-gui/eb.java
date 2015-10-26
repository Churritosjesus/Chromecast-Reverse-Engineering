import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

final class eb
{
  private static Method a;
  private static Method b;
  
  static
  {
    try
    {
      Class localClass = Class.forName("libcore.icu.ICU");
      if (localClass != null)
      {
        a = localClass.getMethod("getScript", new Class[] { String.class });
        b = localClass.getMethod("addLikelySubtags", new Class[] { String.class });
      }
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Log.w("ICUCompatIcs", localException);
      }
    }
  }
  
  public static String a(String paramString)
  {
    try
    {
      if (a != null)
      {
        paramString = (String)a.invoke(null, new Object[] { paramString });
        return paramString;
      }
    }
    catch (IllegalAccessException paramString)
    {
      for (;;)
      {
        Log.w("ICUCompatIcs", paramString);
        paramString = null;
      }
    }
    catch (InvocationTargetException paramString)
    {
      for (;;)
      {
        Log.w("ICUCompatIcs", paramString);
      }
    }
  }
  
  public static String b(String paramString)
  {
    try
    {
      if (b == null) {
        break label37;
      }
      String str = (String)b.invoke(null, new Object[] { paramString });
      paramString = str;
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      for (;;)
      {
        Log.w("ICUCompatIcs", localIllegalAccessException);
      }
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      for (;;)
      {
        label37:
        Log.w("ICUCompatIcs", localInvocationTargetException);
      }
    }
    return paramString;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\eb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */