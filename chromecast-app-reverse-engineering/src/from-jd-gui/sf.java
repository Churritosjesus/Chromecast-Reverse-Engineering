import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public final class sf
{
  public static final Rect a = new Rect();
  private static Class b;
  
  static
  {
    if (Build.VERSION.SDK_INT >= 18) {}
    try
    {
      b = Class.forName("android.graphics.Insets");
      return;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      for (;;) {}
    }
  }
  
  public static Rect a(Drawable paramDrawable)
  {
    if (b != null) {}
    for (;;)
    {
      Object localObject;
      Rect localRect;
      try
      {
        paramDrawable = bo.d(paramDrawable);
        localObject = paramDrawable.getClass().getMethod("getOpticalInsets", new Class[0]).invoke(paramDrawable, new Object[0]);
        if (localObject != null)
        {
          localRect = new android/graphics/Rect;
          localRect.<init>();
          Field[] arrayOfField = b.getFields();
          int k = arrayOfField.length;
          int j = 0;
          paramDrawable = localRect;
          if (j < k)
          {
            paramDrawable = arrayOfField[j];
            String str = paramDrawable.getName();
            int i = -1;
            switch (str.hashCode())
            {
            default: 
              switch (i)
              {
              default: 
                j++;
              }
              break;
            case 3317767: 
              if (!str.equals("left")) {
                continue;
              }
              i = 0;
              break;
            case 115029: 
              if (!str.equals("top")) {
                continue;
              }
              i = 1;
              break;
            case 108511772: 
              if (!str.equals("right")) {
                continue;
              }
              i = 2;
              break;
            case -1383228885: 
              if (!str.equals("bottom")) {
                continue;
              }
              i = 3;
              continue;
              localRect.left = paramDrawable.getInt(localObject);
              break;
            }
          }
        }
        else
        {
          paramDrawable = a;
        }
      }
      catch (Exception paramDrawable)
      {
        Log.e("DrawableUtils", "Couldn't obtain the optical insets. Ignoring.");
      }
      return paramDrawable;
      localRect.top = paramDrawable.getInt(localObject);
      continue;
      localRect.right = paramDrawable.getInt(localObject);
      continue;
      localRect.bottom = paramDrawable.getInt(localObject);
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\sf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */