import android.support.v7.widget.SearchView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;

public final class zz
  implements AdapterView.OnItemSelectedListener
{
  public zz(SearchView paramSearchView) {}
  
  public final void onItemSelected(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    SearchView.a(this.a, paramInt);
  }
  
  public final void onNothingSelected(AdapterView paramAdapterView) {}
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\zz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */