import android.support.v7.internal.widget.ActionBarContainer;
import android.support.v7.internal.widget.ActionBarOverlayLayout;

public final class ri
  implements Runnable
{
  public ri(ActionBarOverlayLayout paramActionBarOverlayLayout) {}
  
  public final void run()
  {
    ActionBarOverlayLayout.a(this.a);
    ActionBarOverlayLayout.a(this.a, gt.o(ActionBarOverlayLayout.c(this.a)).c(-ActionBarOverlayLayout.c(this.a).getHeight()).a(ActionBarOverlayLayout.b(this.a)));
    if ((ActionBarOverlayLayout.d(this.a) != null) && (ActionBarOverlayLayout.d(this.a).getVisibility() != 8)) {
      ActionBarOverlayLayout.b(this.a, gt.o(ActionBarOverlayLayout.d(this.a)).c(ActionBarOverlayLayout.d(this.a).getHeight()).a(ActionBarOverlayLayout.e(this.a)));
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\ri.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */