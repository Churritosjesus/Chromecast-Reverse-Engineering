import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.google.android.apps.chromecast.app.tutorial.TutorialOtaActivity;

public final class bjz
  implements View.OnTouchListener
{
  public bjz(TutorialOtaActivity paramTutorialOtaActivity) {}
  
  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    TutorialOtaActivity.f(this.a);
    return false;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bjz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */