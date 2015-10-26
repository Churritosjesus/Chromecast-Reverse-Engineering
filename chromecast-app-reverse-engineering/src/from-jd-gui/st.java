import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;

final class st
  implements ViewTreeObserver.OnGlobalLayoutListener
{
  st(sr paramsr) {}
  
  public final void onGlobalLayout()
  {
    if (!sr.a(this.a).b()) {
      sr.a(this.a).c();
    }
    ViewTreeObserver localViewTreeObserver = this.a.getViewTreeObserver();
    if (localViewTreeObserver != null) {
      localViewTreeObserver.removeGlobalOnLayoutListener(this);
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\st.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */