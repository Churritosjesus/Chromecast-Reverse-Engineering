import android.database.DataSetObserver;
import android.support.v4.view.ViewPager;
import com.google.android.libraries.view.pagingindicator.PagingIndicator;

public final class czt
  extends DataSetObserver
{
  public czt(PagingIndicator paramPagingIndicator) {}
  
  public final void onChanged()
  {
    PagingIndicator.a(this.a, PagingIndicator.a(this.a).a.a());
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\czt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */