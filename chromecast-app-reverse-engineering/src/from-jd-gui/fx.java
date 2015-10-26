import android.os.Build.VERSION;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;

public final class fx
{
  private static gb a;
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 14) {
      a = new ga();
    }
    for (;;)
    {
      return;
      if (i >= 11) {
        a = new fz();
      } else {
        a = new fy();
      }
    }
  }
  
  public static MenuItem a(MenuItem paramMenuItem, View paramView)
  {
    if ((paramMenuItem instanceof cd)) {}
    for (paramMenuItem = ((cd)paramMenuItem).setActionView(paramView);; paramMenuItem = a.a(paramMenuItem, paramView)) {
      return paramMenuItem;
    }
  }
  
  public static MenuItem a(MenuItem paramMenuItem, fb paramfb)
  {
    if ((paramMenuItem instanceof cd)) {
      paramMenuItem = ((cd)paramMenuItem).a(paramfb);
    }
    for (;;)
    {
      return paramMenuItem;
      Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
    }
  }
  
  public static View a(MenuItem paramMenuItem)
  {
    if ((paramMenuItem instanceof cd)) {}
    for (paramMenuItem = ((cd)paramMenuItem).getActionView();; paramMenuItem = a.a(paramMenuItem)) {
      return paramMenuItem;
    }
  }
  
  public static void a(MenuItem paramMenuItem, int paramInt)
  {
    if ((paramMenuItem instanceof cd)) {
      ((cd)paramMenuItem).setShowAsAction(paramInt);
    }
    for (;;)
    {
      return;
      a.a(paramMenuItem, paramInt);
    }
  }
  
  public static MenuItem b(MenuItem paramMenuItem, int paramInt)
  {
    if ((paramMenuItem instanceof cd)) {}
    for (paramMenuItem = ((cd)paramMenuItem).setActionView(paramInt);; paramMenuItem = a.b(paramMenuItem, paramInt)) {
      return paramMenuItem;
    }
  }
  
  public static boolean b(MenuItem paramMenuItem)
  {
    if ((paramMenuItem instanceof cd)) {}
    for (boolean bool = ((cd)paramMenuItem).expandActionView();; bool = a.b(paramMenuItem)) {
      return bool;
    }
  }
  
  public static boolean c(MenuItem paramMenuItem)
  {
    if ((paramMenuItem instanceof cd)) {}
    for (boolean bool = ((cd)paramMenuItem).isActionViewExpanded();; bool = a.c(paramMenuItem)) {
      return bool;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\fx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */