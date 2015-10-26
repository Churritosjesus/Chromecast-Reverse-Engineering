import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.widget.Adapter;

final class ry
  extends DataSetObserver
{
  private Parcelable a = null;
  
  ry(rx paramrx) {}
  
  public final void onChanged()
  {
    this.b.m = true;
    this.b.s = this.b.r;
    this.b.r = this.b.c().getCount();
    if ((this.b.c().hasStableIds()) && (this.a != null) && (this.b.s == 0) && (this.b.r > 0))
    {
      rx.a(this.b, this.a);
      this.a = null;
    }
    rx localrx;
    for (;;)
    {
      this.b.d();
      this.b.requestLayout();
      return;
      localrx = this.b;
      if (localrx.getChildCount() > 0)
      {
        localrx.i = true;
        if (localrx.p < 0) {
          break;
        }
        localObject = localrx.getChildAt(localrx.p - localrx.f);
        localrx.h = localrx.o;
        localrx.g = localrx.n;
        if (localObject != null) {
          ((View)localObject).getTop();
        }
        localrx.j = 0;
      }
    }
    View localView = localrx.getChildAt(0);
    Object localObject = localrx.c();
    if ((localrx.f >= 0) && (localrx.f < ((Adapter)localObject).getCount())) {}
    for (localrx.h = ((Adapter)localObject).getItemId(localrx.f);; localrx.h = -1L)
    {
      localrx.g = localrx.f;
      if (localView != null) {
        localView.getTop();
      }
      localrx.j = 1;
      break;
    }
  }
  
  public final void onInvalidated()
  {
    this.b.m = true;
    if (this.b.c().hasStableIds()) {
      this.a = rx.a(this.b);
    }
    this.b.s = this.b.r;
    this.b.r = 0;
    this.b.p = -1;
    this.b.q = Long.MIN_VALUE;
    this.b.n = -1;
    this.b.o = Long.MIN_VALUE;
    this.b.i = false;
    this.b.d();
    this.b.requestLayout();
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\ry.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */