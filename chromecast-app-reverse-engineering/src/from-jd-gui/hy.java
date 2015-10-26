import android.database.DataSetObserver;
import android.support.v4.view.ViewPager;

public final class hy
  extends DataSetObserver
{
  public hy(ViewPager paramViewPager) {}
  
  public final void onChanged()
  {
    this.a.a();
  }
  
  public final void onInvalidated()
  {
    this.a.a();
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\hy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */