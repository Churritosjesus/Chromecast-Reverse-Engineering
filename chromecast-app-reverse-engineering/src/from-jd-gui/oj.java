import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;

final class oj
  implements SeekBar.OnSeekBarChangeListener
{
  private final Runnable b = new ok(this);
  
  oj(oi paramoi) {}
  
  public final void onProgressChanged(SeekBar paramSeekBar, int paramInt, boolean paramBoolean)
  {
    if (paramBoolean) {
      oi.d(this.a).a(paramInt);
    }
  }
  
  public final void onStartTrackingTouch(SeekBar paramSeekBar)
  {
    if (oi.a(this.a)) {
      oi.c(this.a).removeCallbacks(this.b);
    }
    for (;;)
    {
      return;
      oi.a(this.a, true);
    }
  }
  
  public final void onStopTrackingTouch(SeekBar paramSeekBar)
  {
    oi.c(this.a).postDelayed(this.b, 250L);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\oj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */