import android.view.View;
import java.lang.ref.WeakReference;

final class ij
  implements Runnable
{
  private WeakReference a;
  private ih b;
  
  ij(ii paramii, ih paramih, View paramView)
  {
    this.a = new WeakReference(paramView);
    this.b = paramih;
  }
  
  public final void run()
  {
    View localView = (View)this.a.get();
    if (localView != null) {
      this.c.c(this.b, localView);
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\ij.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */