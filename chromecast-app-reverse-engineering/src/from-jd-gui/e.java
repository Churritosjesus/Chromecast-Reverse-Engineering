import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;

final class e
  implements ViewTreeObserver.OnPreDrawListener
{
  e(c paramc, View paramView, f paramf, int paramInt, Object paramObject) {}
  
  public final boolean onPreDraw()
  {
    this.a.getViewTreeObserver().removeOnPreDrawListener(this);
    c.a(this.e, this.b, this.c, this.d);
    return true;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */