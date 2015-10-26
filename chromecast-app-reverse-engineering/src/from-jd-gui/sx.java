import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListAdapter;

final class sx
  implements AdapterView.OnItemClickListener
{
  sx(sw paramsw, sr paramsr) {}
  
  public final void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    this.a.a.a(paramInt);
    if (this.a.a.l != null) {
      this.a.a.a(paramView, paramInt, sw.a(this.a).getItemId(paramInt));
    }
    this.a.a();
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\sx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */