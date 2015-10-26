import android.support.v7.widget.SearchView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

public final class zy
  implements AdapterView.OnItemClickListener
{
  public zy(SearchView paramSearchView) {}
  
  public final void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    SearchView.a(this.a, paramInt, 0, null);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\zy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */