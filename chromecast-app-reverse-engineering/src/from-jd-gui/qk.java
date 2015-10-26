import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;

final class qk
  extends px
  implements MenuItem.OnMenuItemClickListener
{
  qk(qg paramqg, MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    super(paramOnMenuItemClickListener);
  }
  
  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    return ((MenuItem.OnMenuItemClickListener)this.d).onMenuItemClick(this.a.a(paramMenuItem));
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\qk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */