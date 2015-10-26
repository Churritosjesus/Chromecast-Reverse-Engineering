import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import java.util.ArrayList;

final class d
  implements ViewTreeObserver.OnPreDrawListener
{
  d(c paramc, View paramView, Object paramObject, ArrayList paramArrayList, f paramf, boolean paramBoolean, j paramj1, j paramj2) {}
  
  public final boolean onPreDraw()
  {
    this.a.getViewTreeObserver().removeOnPreDrawListener(this);
    if (this.b != null)
    {
      a.a(this.b, this.c);
      this.c.clear();
      ed localed = c.a(this.h, this.d, this.e, this.f);
      this.c.add(this.d.d);
      this.c.addAll(localed.values());
      a.b(this.b, this.c);
      c.a(this.h, localed, this.d);
      c.a(this.h, this.d, this.f, this.g, this.e, localed);
    }
    return true;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */