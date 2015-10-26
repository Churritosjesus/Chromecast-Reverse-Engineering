import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.List;

public abstract class zh
{
  private boolean a = false;
  public xb d;
  public RecyclerView e;
  
  public static int a(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    int j = 1073741824;
    int i = Math.max(0, paramInt1 - paramInt2);
    if (paramBoolean) {
      if (paramInt3 >= 0)
      {
        paramInt1 = paramInt3;
        paramInt2 = j;
      }
    }
    for (;;)
    {
      return View.MeasureSpec.makeMeasureSpec(paramInt1, paramInt2);
      paramInt2 = 0;
      paramInt1 = 0;
      continue;
      paramInt2 = j;
      paramInt1 = paramInt3;
      if (paramInt3 < 0) {
        if (paramInt3 == -1)
        {
          paramInt1 = i;
          paramInt2 = j;
        }
        else if (paramInt3 == -2)
        {
          paramInt2 = Integer.MIN_VALUE;
          paramInt1 = i;
        }
        else
        {
          paramInt2 = 0;
          paramInt1 = 0;
        }
      }
    }
  }
  
  public static int a(View paramView)
  {
    return ((zi)paramView.getLayoutParams()).c.d();
  }
  
  public static void a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    Rect localRect = ((zi)paramView.getLayoutParams()).d;
    paramView.layout(localRect.left + paramInt1, localRect.top + paramInt2, paramInt3 - localRect.right, paramInt4 - localRect.bottom);
  }
  
  public static int b(View paramView)
  {
    Rect localRect = ((zi)paramView.getLayoutParams()).d;
    int i = paramView.getMeasuredWidth();
    int j = localRect.left;
    return localRect.right + (i + j);
  }
  
  public static int c(View paramView)
  {
    Rect localRect = ((zi)paramView.getLayoutParams()).d;
    int j = paramView.getMeasuredHeight();
    int i = localRect.top;
    return localRect.bottom + (j + i);
  }
  
  public static int d(View paramView)
  {
    return ((zi)paramView.getLayoutParams()).d.top;
  }
  
  public static int e(View paramView)
  {
    return ((zi)paramView.getLayoutParams()).d.bottom;
  }
  
  public static int f(View paramView)
  {
    return ((zi)paramView.getLayoutParams()).d.left;
  }
  
  public static int g(View paramView)
  {
    return ((zi)paramView.getLayoutParams()).d.right;
  }
  
  public int a(int paramInt, zl paramzl, zp paramzp)
  {
    return 0;
  }
  
  public int a(zl paramzl, zp paramzp)
  {
    int j = 1;
    int i = j;
    if (this.e != null)
    {
      if (RecyclerView.f(this.e) != null) {
        break label28;
      }
      i = j;
    }
    for (;;)
    {
      return i;
      label28:
      i = j;
      if (j()) {
        i = RecyclerView.f(this.e).a();
      }
    }
  }
  
  public int a(zp paramzp)
  {
    return 0;
  }
  
  public zi a(Context paramContext, AttributeSet paramAttributeSet)
  {
    return new zi(paramContext, paramAttributeSet);
  }
  
  public zi a(ViewGroup.LayoutParams paramLayoutParams)
  {
    if ((paramLayoutParams instanceof zi)) {
      paramLayoutParams = new zi((zi)paramLayoutParams);
    }
    for (;;)
    {
      return paramLayoutParams;
      if ((paramLayoutParams instanceof ViewGroup.MarginLayoutParams)) {
        paramLayoutParams = new zi((ViewGroup.MarginLayoutParams)paramLayoutParams);
      } else {
        paramLayoutParams = new zi(paramLayoutParams);
      }
    }
  }
  
  public void a() {}
  
  public final void a(int paramInt, zl paramzl)
  {
    View localView = f(paramInt);
    d(paramInt);
    paramzl.a(localView);
  }
  
  public void a(Parcelable paramParcelable) {}
  
  public final void a(RecyclerView paramRecyclerView)
  {
    if (paramRecyclerView == null) {
      this.e = null;
    }
    for (this.d = null;; this.d = paramRecyclerView.c)
    {
      return;
      this.e = paramRecyclerView;
    }
  }
  
  public void a(RecyclerView paramRecyclerView, zl paramzl) {}
  
  void a(View paramView, int paramInt, boolean paramBoolean)
  {
    zr localzr = RecyclerView.b(paramView);
    zi localzi1;
    if ((paramBoolean) || (localzr.n()))
    {
      this.e.n.b(paramView);
      localzi1 = (zi)paramView.getLayoutParams();
      if ((!localzr.g()) && (!localzr.e())) {
        break label126;
      }
      if (!localzr.e()) {
        break label118;
      }
      localzr.f();
      label67:
      this.d.a(paramView, paramInt, paramView.getLayoutParams(), false);
    }
    for (;;)
    {
      if (localzi1.f)
      {
        localzr.a.invalidate();
        localzi1.f = false;
      }
      return;
      this.e.n.a(paramView);
      break;
      label118:
      localzr.h();
      break label67;
      label126:
      if (paramView.getParent() == this.e)
      {
        Object localObject = this.d;
        int i = ((xb)localObject).a.a(paramView);
        if (i == -1) {
          i = -1;
        }
        int j;
        for (;;)
        {
          j = paramInt;
          if (paramInt == -1) {
            j = this.d.a();
          }
          if (i != -1) {
            break;
          }
          throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.e.indexOfChild(paramView));
          if (((xb)localObject).b.b(i)) {
            i = -1;
          } else {
            i -= ((xb)localObject).b.d(i);
          }
        }
        if (i != j)
        {
          zh localzh = RecyclerView.d(this.e);
          paramView = localzh.f(i);
          if (paramView == null) {
            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i);
          }
          localzh.e(i);
          zi localzi2 = (zi)paramView.getLayoutParams();
          localObject = RecyclerView.b(paramView);
          if (((zr)localObject).n()) {
            localzh.e.n.b(paramView);
          }
          for (;;)
          {
            localzh.d.a(paramView, j, localzi2, ((zr)localObject).n());
            break;
            localzh.e.n.a(paramView);
          }
        }
      }
      else
      {
        this.d.a(paramView, paramInt, false);
        localzi1.e = true;
      }
    }
  }
  
  final void a(View paramView, jd paramjd)
  {
    zr localzr = RecyclerView.b(paramView);
    if ((localzr != null) && (!localzr.n()) && (!this.d.a(localzr.a))) {
      a(this.e.a, this.e.n, paramView, paramjd);
    }
  }
  
  public void a(AccessibilityEvent paramAccessibilityEvent)
  {
    boolean bool2 = true;
    Object localObject = this.e.a;
    localObject = this.e.n;
    paramAccessibilityEvent = iz.a(paramAccessibilityEvent);
    if (this.e == null) {
      return;
    }
    boolean bool1 = bool2;
    if (!gt.b(this.e, 1))
    {
      bool1 = bool2;
      if (!gt.b(this.e, -1))
      {
        bool1 = bool2;
        if (!gt.a(this.e, -1)) {
          if (!gt.a(this.e, 1)) {
            break label120;
          }
        }
      }
    }
    label120:
    for (bool1 = bool2;; bool1 = false)
    {
      paramAccessibilityEvent.a(bool1);
      if (RecyclerView.f(this.e) == null) {
        break;
      }
      paramAccessibilityEvent.a(RecyclerView.f(this.e).a());
      break;
    }
  }
  
  public void a(String paramString)
  {
    if (this.e != null) {
      this.e.a(paramString);
    }
  }
  
  public final void a(zl paramzl)
  {
    int j = paramzl.a.size();
    for (int i = j - 1; i >= 0; i--)
    {
      View localView = ((zr)paramzl.a.get(i)).a;
      zr localzr = RecyclerView.b(localView);
      if (!localzr.b())
      {
        localzr.a(false);
        if (localzr.o()) {
          this.e.removeDetachedView(localView, false);
        }
        if (this.e.m != null) {
          this.e.m.c(localzr);
        }
        localzr.a(true);
        paramzl.b(localView);
      }
    }
    paramzl.a.clear();
    if (j > 0) {
      this.e.invalidate();
    }
  }
  
  public void a(zl paramzl, zp paramzp, View paramView, jd paramjd)
  {
    int i;
    if (j())
    {
      i = a(paramView);
      if (!i()) {
        break label49;
      }
    }
    label49:
    for (int j = a(paramView);; j = 0)
    {
      paramjd.a(jm.a(i, 1, j, 1, false, false));
      return;
      i = 0;
      break;
    }
  }
  
  public boolean a(zi paramzi)
  {
    if (paramzi != null) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public int b(int paramInt, zl paramzl, zp paramzp)
  {
    return 0;
  }
  
  public int b(zl paramzl, zp paramzp)
  {
    int j = 1;
    int i = j;
    if (this.e != null)
    {
      if (RecyclerView.f(this.e) != null) {
        break label28;
      }
      i = j;
    }
    for (;;)
    {
      return i;
      label28:
      i = j;
      if (i()) {
        i = RecyclerView.f(this.e).a();
      }
    }
  }
  
  public int b(zp paramzp)
  {
    return 0;
  }
  
  public View b(int paramInt)
  {
    int j = n();
    int i = 0;
    View localView2;
    if (i < j)
    {
      localView2 = f(i);
      zr localzr = RecyclerView.b(localView2);
      if ((localzr != null) && (localzr.d() == paramInt) && (!localzr.b()))
      {
        localView1 = localView2;
        if (!this.e.n.j) {
          if (localzr.n()) {
            break label78;
          }
        }
      }
    }
    for (View localView1 = localView2;; localView1 = null)
    {
      return localView1;
      label78:
      i++;
      break;
    }
  }
  
  public void b() {}
  
  public int c(zp paramzp)
  {
    return 0;
  }
  
  public View c(int paramInt, zl paramzl, zp paramzp)
  {
    return null;
  }
  
  public void c() {}
  
  public void c(int paramInt) {}
  
  public void c(zl paramzl, zp paramzp)
  {
    Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
  }
  
  public int d(zp paramzp)
  {
    return 0;
  }
  
  public void d() {}
  
  public final void d(int paramInt)
  {
    if (f(paramInt) != null)
    {
      xb localxb = this.d;
      paramInt = localxb.a(paramInt);
      View localView = localxb.a.b(paramInt);
      if (localView != null)
      {
        if (localxb.b.c(paramInt)) {
          localxb.c.remove(localView);
        }
        localxb.a.a(paramInt);
      }
    }
  }
  
  public int e(zp paramzp)
  {
    return 0;
  }
  
  public void e() {}
  
  public final void e(int paramInt)
  {
    f(paramInt);
    xb localxb = this.d;
    paramInt = localxb.a(paramInt);
    localxb.b.c(paramInt);
    localxb.a.c(paramInt);
  }
  
  public int f(zp paramzp)
  {
    return 0;
  }
  
  public final View f(int paramInt)
  {
    if (this.d != null) {}
    for (View localView = this.d.b(paramInt);; localView = null) {
      return localView;
    }
  }
  
  public abstract zi f();
  
  public boolean g()
  {
    return false;
  }
  
  public Parcelable h()
  {
    return null;
  }
  
  public boolean i()
  {
    return false;
  }
  
  public boolean j()
  {
    return false;
  }
  
  public final void m()
  {
    if (this.e != null) {
      this.e.requestLayout();
    }
  }
  
  public final int n()
  {
    if (this.d != null) {}
    for (int i = this.d.a();; i = 0) {
      return i;
    }
  }
  
  public final int o()
  {
    if (this.e != null) {}
    for (int i = this.e.getWidth();; i = 0) {
      return i;
    }
  }
  
  public final int p()
  {
    if (this.e != null) {}
    for (int i = this.e.getHeight();; i = 0) {
      return i;
    }
  }
  
  public final int q()
  {
    if (this.e != null) {}
    for (int i = this.e.getPaddingLeft();; i = 0) {
      return i;
    }
  }
  
  public final int r()
  {
    if (this.e != null) {}
    for (int i = this.e.getPaddingTop();; i = 0) {
      return i;
    }
  }
  
  public final int s()
  {
    if (this.e != null) {}
    for (int i = this.e.getPaddingRight();; i = 0) {
      return i;
    }
  }
  
  public final int t()
  {
    if (this.e != null) {}
    for (int i = this.e.getPaddingBottom();; i = 0) {
      return i;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\zh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */