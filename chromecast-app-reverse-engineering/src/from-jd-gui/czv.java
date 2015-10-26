import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.libraries.view.pagingindicator.PagingIndicator;

public final class czv
  extends AnimatorListenerAdapter
{
  public czv(PagingIndicator paramPagingIndicator) {}
  
  public final void onAnimationEnd(Animator paramAnimator)
  {
    PagingIndicator.b(this.a, true);
  }
  
  public final void onAnimationStart(Animator paramAnimator)
  {
    PagingIndicator.b(this.a, false);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\czv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */