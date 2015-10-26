import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

final class y
  implements Animation.AnimationListener
{
  y(t paramt, j paramj) {}
  
  public final void onAnimationEnd(Animation paramAnimation)
  {
    if (this.a.g != null)
    {
      this.a.g = null;
      this.b.a(this.a, this.a.h, 0, 0, false);
    }
  }
  
  public final void onAnimationRepeat(Animation paramAnimation) {}
  
  public final void onAnimationStart(Animation paramAnimation) {}
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */