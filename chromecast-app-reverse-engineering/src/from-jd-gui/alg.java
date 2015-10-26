import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Spinner;
import com.google.android.apps.chromecast.app.DebugActivity;
import com.google.android.apps.chromecast.app.SetupApplication;

public final class alg
  implements AdapterView.OnItemSelectedListener
{
  public alg(DebugActivity paramDebugActivity, Spinner paramSpinner) {}
  
  public final void onItemSelected(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    paramAdapterView = ((blm)this.a.getSelectedItem()).a;
    a.b(this.b, paramAdapterView);
    SetupApplication.a().j();
  }
  
  public final void onNothingSelected(AdapterView paramAdapterView)
  {
    a.b(this.b, null);
    SetupApplication.a().j();
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\alg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */