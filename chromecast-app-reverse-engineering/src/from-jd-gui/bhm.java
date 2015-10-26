import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Spinner;

final class bhm
  implements AdapterView.OnItemSelectedListener
{
  bhm(bhf parambhf) {}
  
  public final void onItemSelected(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    if (bhf.f(this.a).getSelectedItemPosition() == 0) {
      bhf.a(this.a, bdk.a);
    }
    for (;;)
    {
      return;
      bhf.a(this.a, bdk.b);
    }
  }
  
  public final void onNothingSelected(AdapterView paramAdapterView) {}
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bhm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */