import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

final class aju
  implements View.OnTouchListener
{
  aju(ajq paramajq) {}
  
  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    if (!paramView.hasFocus()) {
      paramView.requestFocus();
    }
    return false;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\aju.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */