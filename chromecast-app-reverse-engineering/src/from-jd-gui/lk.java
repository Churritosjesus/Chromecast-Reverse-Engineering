import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

final class lk
  implements Animation.AnimationListener
{
  lk(li paramli, lm paramlm) {}
  
  public final void onAnimationEnd(Animation paramAnimation) {}
  
  public final void onAnimationRepeat(Animation paramAnimation)
  {
    this.a.b();
    lm locallm = this.a;
    locallm.a(locallm.a());
    this.a.a(this.a.e);
    if (this.b.b)
    {
      this.b.b = false;
      paramAnimation.setDuration(1332L);
      this.a.a(false);
    }
    for (;;)
    {
      return;
      li.a(this.b, (li.a(this.b) + 1.0F) % 5.0F);
    }
  }
  
  public final void onAnimationStart(Animation paramAnimation)
  {
    li.a(this.b, 0.0F);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\lk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */