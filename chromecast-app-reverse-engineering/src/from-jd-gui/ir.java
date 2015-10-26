import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

public final class ir
  extends AnimatorListenerAdapter
{
  public ir(iu paramiu, View paramView) {}
  
  public final void onAnimationCancel(Animator paramAnimator)
  {
    this.a.c(this.b);
  }
  
  public final void onAnimationEnd(Animator paramAnimator)
  {
    this.a.b(this.b);
  }
  
  public final void onAnimationStart(Animator paramAnimator)
  {
    this.a.a(this.b);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\ir.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */