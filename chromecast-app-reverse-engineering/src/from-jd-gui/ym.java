import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.PopupWindow;

final class ym
  implements View.OnTouchListener
{
  ym(yc paramyc) {}
  
  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    int j = paramMotionEvent.getAction();
    int k = (int)paramMotionEvent.getX();
    int i = (int)paramMotionEvent.getY();
    if ((j == 0) && (yc.b(this.a) != null) && (yc.b(this.a).isShowing()) && (k >= 0) && (k < yc.b(this.a).getWidth()) && (i >= 0) && (i < yc.b(this.a).getHeight())) {
      yc.d(this.a).postDelayed(yc.c(this.a), 250L);
    }
    for (;;)
    {
      return false;
      if (j == 1) {
        yc.d(this.a).removeCallbacks(yc.c(this.a));
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\ym.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */