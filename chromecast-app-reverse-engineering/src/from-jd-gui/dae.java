import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.libraries.view.pagingindicator.PagingIndicator;

final class dae
  extends AnimatorListenerAdapter
{
  dae(dac paramdac, PagingIndicator paramPagingIndicator) {}
  
  public final void onAnimationEnd(Animator paramAnimator)
  {
    PagingIndicator.b(this.a.a, dac.a(this.a), 0.0F);
    this.a.a.postInvalidateOnAnimation();
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dae.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */