import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.libraries.view.pagingindicator.PagingIndicator;

final class dab
  extends AnimatorListenerAdapter
{
  dab(czy paramczy, PagingIndicator paramPagingIndicator, int[] paramArrayOfInt, float paramFloat1, float paramFloat2) {}
  
  public final void onAnimationEnd(Animator paramAnimator)
  {
    PagingIndicator.b(this.d.a, -1.0F);
    PagingIndicator.c(this.d.a, -1.0F);
    this.d.a.postInvalidateOnAnimation();
  }
  
  public final void onAnimationStart(Animator paramAnimator)
  {
    PagingIndicator.k(this.d.a);
    PagingIndicator.l(this.d.a);
    for (int k : this.a) {
      PagingIndicator.b(this.d.a, k, 1.0E-5F);
    }
    PagingIndicator.b(this.d.a, this.b);
    PagingIndicator.c(this.d.a, this.c);
    this.d.a.postInvalidateOnAnimation();
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */