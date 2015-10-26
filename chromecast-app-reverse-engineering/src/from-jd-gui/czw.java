import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import com.google.android.libraries.view.pagingindicator.PagingIndicator;

public final class czw
  implements ValueAnimator.AnimatorUpdateListener
{
  public czw(PagingIndicator paramPagingIndicator, int paramInt) {}
  
  public final void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    PagingIndicator.a(this.b, this.a, paramValueAnimator.getAnimatedFraction());
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\czw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */