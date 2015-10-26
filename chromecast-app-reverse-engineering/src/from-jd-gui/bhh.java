import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import java.util.List;

final class bhh
  implements AdapterView.OnItemSelectedListener
{
  bhh(bhf parambhf, List paramList) {}
  
  public final void onItemSelected(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    bhf.a(this.b, (bdb)this.a.get(paramInt));
  }
  
  public final void onNothingSelected(AdapterView paramAdapterView) {}
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bhh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */