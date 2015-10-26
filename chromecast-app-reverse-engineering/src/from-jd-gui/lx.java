import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

final class lx
  implements Animation.AnimationListener
{
  lx(lw paramlw) {}
  
  public final void onAnimationEnd(Animation paramAnimation)
  {
    if (lw.a(this.a))
    {
      lw.b(this.a).setAlpha(255);
      lw.b(this.a).start();
      if ((lw.c(this.a)) && (lw.d(this.a) != null)) {
        lw.d(this.a).a();
      }
    }
    for (;;)
    {
      lw.b(this.a, lw.e(this.a).getTop());
      return;
      lw.b(this.a).stop();
      lw.e(this.a).setVisibility(8);
      lw.a(this.a, 255);
      if (lw.f(this.a)) {
        lw.a(this.a, 0.0F);
      } else {
        lw.a(this.a, this.a.d - lw.g(this.a), true);
      }
    }
  }
  
  public final void onAnimationRepeat(Animation paramAnimation) {}
  
  public final void onAnimationStart(Animation paramAnimation) {}
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\lx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */