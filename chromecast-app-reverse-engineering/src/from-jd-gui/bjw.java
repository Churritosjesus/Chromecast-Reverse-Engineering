import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.Button;
import com.google.android.apps.chromecast.app.tutorial.TutorialActivity;

public final class bjw
  extends AnimatorListenerAdapter
{
  public bjw(TutorialActivity paramTutorialActivity, boolean paramBoolean) {}
  
  public final void onAnimationEnd(Animator paramAnimator)
  {
    if (TutorialActivity.a(this.b) == paramAnimator)
    {
      TutorialActivity.a(this.b, null);
      if (!this.a) {
        this.b.g.setVisibility(4);
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bjw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */