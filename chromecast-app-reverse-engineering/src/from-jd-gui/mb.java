import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

final class mb
  implements Animation.AnimationListener
{
  mb(lw paramlw) {}
  
  public final void onAnimationEnd(Animation paramAnimation)
  {
    if (!lw.f(this.a)) {
      lw.a(this.a, null);
    }
  }
  
  public final void onAnimationRepeat(Animation paramAnimation) {}
  
  public final void onAnimationStart(Animation paramAnimation) {}
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\mb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */