import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;

final class ye
  implements AdapterView.OnItemSelectedListener
{
  ye(yc paramyc) {}
  
  public final void onItemSelected(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    if (paramInt != -1)
    {
      paramAdapterView = yc.a(this.a);
      if (paramAdapterView != null) {
        yf.a(paramAdapterView, false);
      }
    }
  }
  
  public final void onNothingSelected(AdapterView paramAdapterView) {}
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\ye.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */