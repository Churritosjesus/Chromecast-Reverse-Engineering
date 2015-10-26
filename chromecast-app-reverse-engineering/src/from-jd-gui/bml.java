import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import com.google.android.apps.chromecast.app.widget.OverlaidImageView;

public final class bml
  implements ValueAnimator.AnimatorUpdateListener
{
  public bml(OverlaidImageView paramOverlaidImageView) {}
  
  public final void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    OverlaidImageView.a(this.a, (int)(paramValueAnimator.getAnimatedFraction() * 255.0F));
    this.a.invalidate();
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bml.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */