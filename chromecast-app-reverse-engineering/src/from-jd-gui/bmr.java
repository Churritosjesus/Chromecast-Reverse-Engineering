import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import com.google.android.apps.chromecast.app.SetupApplication;

final class bmr
  implements SeekBar.OnSeekBarChangeListener
{
  bmr(bmn parambmn) {}
  
  public final void onProgressChanged(SeekBar paramSeekBar, int paramInt, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      paramSeekBar = bmn.a(this.a);
      double d = bmn.a(this.a, paramInt);
      if (paramSeekBar.o().d != null)
      {
        paramSeekBar = SetupApplication.a().j.a(paramSeekBar);
        if (paramSeekBar != null) {
          paramSeekBar.a(d);
        }
      }
    }
  }
  
  public final void onStartTrackingTouch(SeekBar paramSeekBar) {}
  
  public final void onStopTrackingTouch(SeekBar paramSeekBar) {}
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bmr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */