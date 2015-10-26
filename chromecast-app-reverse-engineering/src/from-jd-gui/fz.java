import android.view.MenuItem;
import android.view.View;

class fz
  implements gb
{
  public final MenuItem a(MenuItem paramMenuItem, View paramView)
  {
    return paramMenuItem.setActionView(paramView);
  }
  
  public final View a(MenuItem paramMenuItem)
  {
    return paramMenuItem.getActionView();
  }
  
  public final void a(MenuItem paramMenuItem, int paramInt)
  {
    paramMenuItem.setShowAsAction(paramInt);
  }
  
  public final MenuItem b(MenuItem paramMenuItem, int paramInt)
  {
    return paramMenuItem.setActionView(paramInt);
  }
  
  public boolean b(MenuItem paramMenuItem)
  {
    return false;
  }
  
  public boolean c(MenuItem paramMenuItem)
  {
    return false;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\fz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */