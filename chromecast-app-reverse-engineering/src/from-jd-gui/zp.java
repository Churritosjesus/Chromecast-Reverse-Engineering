import android.view.View;
import java.util.ArrayList;
import java.util.List;

public final class zp
{
  int a = -1;
  public ed b = new ed();
  public ed c = new ed();
  public ed d = new ed();
  public final List e = new ArrayList();
  public int f = 0;
  public int g = 0;
  public int h = 0;
  public boolean i = false;
  public boolean j = false;
  public boolean k = false;
  public boolean l = false;
  
  public final int a()
  {
    if (this.j) {}
    for (int m = this.g - this.h;; m = this.f) {
      return m;
    }
  }
  
  final void a(View paramView)
  {
    this.e.remove(paramView);
  }
  
  final void a(zr paramzr)
  {
    this.b.remove(paramzr);
    this.c.remove(paramzr);
    ed localed;
    if (this.d != null) {
      localed = this.d;
    }
    for (int m = localed.size() - 1;; m--) {
      if (m >= 0)
      {
        if (paramzr == localed.c(m)) {
          localed.d(m);
        }
      }
      else
      {
        this.e.remove(paramzr.a);
        return;
      }
    }
  }
  
  final void b(View paramView)
  {
    if (!this.e.contains(paramView)) {
      this.e.add(paramView);
    }
  }
  
  public final String toString()
  {
    return "State{mTargetPosition=" + this.a + ", mPreLayoutHolderMap=" + this.b + ", mPostLayoutHolderMap=" + this.c + ", mData=" + null + ", mItemCount=" + this.f + ", mPreviousLayoutItemCount=" + this.g + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.h + ", mStructureChanged=" + this.i + ", mInPreLayout=" + this.j + ", mRunSimpleAnimations=" + this.k + ", mRunPredictiveAnimations=" + this.l + '}';
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\zp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */