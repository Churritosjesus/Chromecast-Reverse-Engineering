import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.gms.people.accountswitcherview.SelectedAccountNavigationView;

public final class cqy
  extends AnimatorListenerAdapter
{
  public cqy(SelectedAccountNavigationView paramSelectedAccountNavigationView) {}
  
  public final void onAnimationEnd(Animator paramAnimator)
  {
    SelectedAccountNavigationView.d(this.a);
    SelectedAccountNavigationView.b(this.a);
    SelectedAccountNavigationView.c(this.a);
    SelectedAccountNavigationView.a(this.a, null);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cqy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */