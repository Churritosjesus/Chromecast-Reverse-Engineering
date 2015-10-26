import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import com.google.android.apps.chromecast.app.widget.OverlaidImageView;

public final class bmm
  implements Animator.AnimatorListener
{
  public bmm(OverlaidImageView paramOverlaidImageView) {}
  
  public final void onAnimationCancel(Animator paramAnimator) {}
  
  public final void onAnimationEnd(Animator paramAnimator)
  {
    OverlaidImageView.a(this.a, OverlaidImageView.a(this.a));
    OverlaidImageView.b(this.a, OverlaidImageView.b(this.a));
    OverlaidImageView.a(this.a, OverlaidImageView.c(this.a));
    OverlaidImageView.b(this.a, OverlaidImageView.d(this.a));
    OverlaidImageView.a(this.a, 0);
  }
  
  public final void onAnimationRepeat(Animator paramAnimator) {}
  
  public final void onAnimationStart(Animator paramAnimator) {}
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bmm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */