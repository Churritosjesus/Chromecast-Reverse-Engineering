import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import com.google.android.libraries.view.pagingindicator.PagingIndicator;

final class dad
  implements ValueAnimator.AnimatorUpdateListener
{
  dad(dac paramdac, PagingIndicator paramPagingIndicator) {}
  
  public final void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    PagingIndicator.b(this.a.a, dac.a(this.a), ((Float)paramValueAnimator.getAnimatedValue()).floatValue());
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dad.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */