import android.support.v7.internal.widget.ActionBarContainer;
import android.support.v7.internal.widget.ActionBarOverlayLayout;

public final class rh
  implements Runnable
{
  public rh(ActionBarOverlayLayout paramActionBarOverlayLayout) {}
  
  public final void run()
  {
    ActionBarOverlayLayout.a(this.a);
    ActionBarOverlayLayout.a(this.a, gt.o(ActionBarOverlayLayout.c(this.a)).c(0.0F).a(ActionBarOverlayLayout.b(this.a)));
    if ((ActionBarOverlayLayout.d(this.a) != null) && (ActionBarOverlayLayout.d(this.a).getVisibility() != 8)) {
      ActionBarOverlayLayout.b(this.a, gt.o(ActionBarOverlayLayout.d(this.a)).c(0.0F).a(ActionBarOverlayLayout.e(this.a)));
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\rh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */