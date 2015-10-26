import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;

final class qj
  extends px
  implements gc
{
  qj(qg paramqg, MenuItem.OnActionExpandListener paramOnActionExpandListener)
  {
    super(paramOnActionExpandListener);
  }
  
  public final boolean a(MenuItem paramMenuItem)
  {
    return ((MenuItem.OnActionExpandListener)this.d).onMenuItemActionExpand(this.a.a(paramMenuItem));
  }
  
  public final boolean b(MenuItem paramMenuItem)
  {
    return ((MenuItem.OnActionExpandListener)this.d).onMenuItemActionCollapse(this.a.a(paramMenuItem));
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\qj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */