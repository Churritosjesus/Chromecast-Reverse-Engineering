import android.support.v7.internal.widget.ActivityChooserView;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;

public final class rs
  implements ViewTreeObserver.OnGlobalLayoutListener
{
  public rs(ActivityChooserView paramActivityChooserView) {}
  
  public final void onGlobalLayout()
  {
    if (this.a.c())
    {
      if (this.a.isShown()) {
        break label31;
      }
      ActivityChooserView.b(this.a).a();
    }
    for (;;)
    {
      return;
      label31:
      ActivityChooserView.b(this.a).c();
      if (this.a.c != null) {
        this.a.c.a(true);
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\rs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */