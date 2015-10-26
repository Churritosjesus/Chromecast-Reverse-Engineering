import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import com.google.android.libraries.view.pagingindicator.PagingIndicator;

final class daa
  implements ValueAnimator.AnimatorUpdateListener
{
  daa(czy paramczy, PagingIndicator paramPagingIndicator) {}
  
  public final void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    PagingIndicator.c(this.a.a, ((Float)paramValueAnimator.getAnimatedValue()).floatValue());
    this.a.a.postInvalidateOnAnimation();
    paramValueAnimator = PagingIndicator.h(this.a.a);
    int j = paramValueAnimator.length;
    for (int i = 0; i < j; i++) {
      paramValueAnimator[i].a(PagingIndicator.j(this.a.a));
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\daa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */