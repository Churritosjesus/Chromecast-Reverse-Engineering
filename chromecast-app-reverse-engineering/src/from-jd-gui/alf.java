import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import com.google.android.apps.chromecast.app.DebugActivity;
import com.google.android.apps.chromecast.app.SetupApplication;
import java.util.List;

public final class alf
  implements AdapterView.OnItemSelectedListener
{
  public alf(DebugActivity paramDebugActivity) {}
  
  public final void onItemSelected(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    a.a(this.a, (String)bld.a.get(paramInt));
    SetupApplication.a().j();
  }
  
  public final void onNothingSelected(AdapterView paramAdapterView)
  {
    a.a(this.a, null);
    SetupApplication.a().j();
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\alf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */