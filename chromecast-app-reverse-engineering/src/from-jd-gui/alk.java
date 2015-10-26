import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Spinner;
import com.google.android.apps.chromecast.app.DebugActivity;

public final class alk
  implements AdapterView.OnItemSelectedListener
{
  private boolean a = false;
  private int b = this.c.getSelectedItemPosition();
  
  public alk(DebugActivity paramDebugActivity, Spinner paramSpinner, all paramall, String paramString) {}
  
  public final void onItemSelected(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    if ((!this.a) && (paramInt != this.b))
    {
      paramInt = DebugActivity.a((String)paramAdapterView.getItemAtPosition(paramInt), this.d.c());
      paramAdapterView = this.d.d();
      if (paramInt >= 0)
      {
        paramAdapterView = paramAdapterView[paramInt];
        if (!this.e.equals(paramAdapterView)) {
          this.d.a(paramAdapterView);
        }
        if (TextUtils.isEmpty(paramAdapterView))
        {
          paramInt = DebugActivity.a(this.d.a(), this.d.d());
          if (paramInt >= 0)
          {
            this.a = true;
            this.c.setSelection(paramInt);
          }
        }
      }
    }
    for (;;)
    {
      this.b = this.c.getSelectedItemPosition();
      return;
      paramInt = 0;
      break;
      this.a = false;
    }
  }
  
  public final void onNothingSelected(AdapterView paramAdapterView) {}
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\alk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */