import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import com.google.android.libraries.view.pagingindicator.PagingIndicator;

public final class czu
  implements ValueAnimator.AnimatorUpdateListener
{
  public czu(PagingIndicator paramPagingIndicator) {}
  
  public final void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    PagingIndicator.a(this.a, ((Float)paramValueAnimator.getAnimatedValue()).floatValue());
    PagingIndicator.c(this.a).a(PagingIndicator.b(this.a));
    this.a.postInvalidateOnAnimation();
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\czu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */