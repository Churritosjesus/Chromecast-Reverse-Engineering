import android.app.ActionBar;
import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.lang.reflect.Method;

final class mw
{
  public Method a;
  public Method b;
  public ImageView c;
  
  mw(Activity paramActivity)
  {
    label115:
    label116:
    for (;;)
    {
      Object localObject;
      try
      {
        this.a = ActionBar.class.getDeclaredMethod("setHomeAsUpIndicator", new Class[] { Drawable.class });
        this.b = ActionBar.class.getDeclaredMethod("setHomeActionContentDescription", new Class[] { Integer.TYPE });
        return;
      }
      catch (NoSuchMethodException localNoSuchMethodException)
      {
        paramActivity = paramActivity.findViewById(16908332);
        if (paramActivity == null) {
          continue;
        }
        localObject = (ViewGroup)paramActivity.getParent();
        if (((ViewGroup)localObject).getChildCount() != 2) {
          continue;
        }
        paramActivity = ((ViewGroup)localObject).getChildAt(0);
        localObject = ((ViewGroup)localObject).getChildAt(1);
        if (paramActivity.getId() != 16908332) {
          break label115;
        }
      }
      paramActivity = (Activity)localObject;
      for (;;)
      {
        if (!(paramActivity instanceof ImageView)) {
          break label116;
        }
        this.c = ((ImageView)paramActivity);
        break;
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\mw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */