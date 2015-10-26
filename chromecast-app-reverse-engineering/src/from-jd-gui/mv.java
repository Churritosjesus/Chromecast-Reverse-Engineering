import android.app.ActionBar;
import android.app.Activity;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.Log;
import android.widget.ImageView;
import java.lang.reflect.Method;

final class mv
{
  private static final int[] a = { 16843531 };
  
  public static Drawable a(Activity paramActivity)
  {
    paramActivity = paramActivity.obtainStyledAttributes(a);
    Drawable localDrawable = paramActivity.getDrawable(0);
    paramActivity.recycle();
    return localDrawable;
  }
  
  public static mw a(Activity paramActivity, Drawable paramDrawable, int paramInt)
  {
    mw localmw = new mw(paramActivity);
    if (localmw.a != null) {}
    for (;;)
    {
      try
      {
        paramActivity = paramActivity.getActionBar();
        localmw.a.invoke(paramActivity, new Object[] { paramDrawable });
        localmw.b.invoke(paramActivity, new Object[] { Integer.valueOf(paramInt) });
        return localmw;
      }
      catch (Exception paramActivity)
      {
        Log.w("ActionBarDrawerToggleHoneycomb", "Couldn't set home-as-up indicator via JB-MR2 API", paramActivity);
        continue;
      }
      if (localmw.c != null) {
        localmw.c.setImageDrawable(paramDrawable);
      } else {
        Log.w("ActionBarDrawerToggleHoneycomb", "Couldn't set home-as-up indicator");
      }
    }
  }
  
  public static mw a(mw parammw, Activity paramActivity, int paramInt)
  {
    mw localmw = parammw;
    if (parammw == null) {
      localmw = new mw(paramActivity);
    }
    if (localmw.a != null) {}
    try
    {
      parammw = paramActivity.getActionBar();
      localmw.b.invoke(parammw, new Object[] { Integer.valueOf(paramInt) });
      if (Build.VERSION.SDK_INT <= 19) {
        parammw.setSubtitle(parammw.getSubtitle());
      }
      return localmw;
    }
    catch (Exception parammw)
    {
      for (;;)
      {
        Log.w("ActionBarDrawerToggleHoneycomb", "Couldn't set content description via JB-MR2 API", parammw);
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\mv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */