import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Spinner;

final class bgy
  implements AdapterView.OnItemSelectedListener
{
  bgy(bgv parambgv) {}
  
  public final void onItemSelected(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    bgv.a(this.a, ((blm)bgv.c(this.a).getSelectedItem()).a);
  }
  
  public final void onNothingSelected(AdapterView paramAdapterView)
  {
    bgv.a(this.a, null);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bgy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */