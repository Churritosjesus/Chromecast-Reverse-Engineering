import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.widget.ImageView;
import com.google.android.gms.people.accountswitcherview.SelectedAccountNavigationView;

public final class cqx
  extends AnimatorListenerAdapter
{
  public cqx(SelectedAccountNavigationView paramSelectedAccountNavigationView) {}
  
  public final void onAnimationEnd(Animator paramAnimator)
  {
    SelectedAccountNavigationView.a(this.a).q.setVisibility(8);
    SelectedAccountNavigationView.a(this.a).n.setVisibility(8);
    if (SelectedAccountNavigationView.a(this.a).r != null) {
      SelectedAccountNavigationView.a(this.a).r.setVisibility(8);
    }
    SelectedAccountNavigationView.b(this.a);
    SelectedAccountNavigationView.c(this.a);
    SelectedAccountNavigationView.a(this.a, null);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cqx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */