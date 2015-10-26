import android.content.Context;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import java.util.Arrays;

public final class xq
  extends xw
{
  private static int f = View.MeasureSpec.makeMeasureSpec(0, 0);
  private boolean g = false;
  private int h = -1;
  private int[] i;
  private View[] j;
  private SparseIntArray k = new SparseIntArray();
  private SparseIntArray l = new SparseIntArray();
  private xt m = new xr();
  private Rect n = new Rect();
  
  public xq(Context paramContext, int paramInt)
  {
    super(paramContext);
    if (paramInt != this.h)
    {
      this.g = true;
      if (paramInt <= 0) {
        throw new IllegalArgumentException("Span count should be at least 1. Provided " + paramInt);
      }
      this.h = paramInt;
      this.m.a.clear();
    }
  }
  
  private static int a(int paramInt1, int paramInt2, int paramInt3)
  {
    int i1;
    if ((paramInt2 == 0) && (paramInt3 == 0)) {
      i1 = paramInt1;
    }
    for (;;)
    {
      return i1;
      int i2 = View.MeasureSpec.getMode(paramInt1);
      if (i2 != Integer.MIN_VALUE)
      {
        i1 = paramInt1;
        if (i2 != 1073741824) {}
      }
      else
      {
        i1 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(paramInt1) - paramInt2 - paramInt3, i2);
      }
    }
  }
  
  private int a(zl paramzl, zp paramzp, int paramInt)
  {
    if (!paramzp.j) {
      paramInt = this.m.b(paramInt, this.h);
    }
    for (;;)
    {
      return paramInt;
      int i1 = paramzl.a(paramInt);
      if (i1 == -1)
      {
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + paramInt);
        paramInt = 0;
      }
      else
      {
        paramInt = this.m.b(i1, this.h);
      }
    }
  }
  
  private void a(View paramView, int paramInt1, int paramInt2)
  {
    Object localObject = this.n;
    if (this.e == null) {
      ((Rect)localObject).set(0, 0, 0, 0);
    }
    for (;;)
    {
      localObject = (zi)paramView.getLayoutParams();
      paramView.measure(a(paramInt1, ((zi)localObject).leftMargin + this.n.left, ((zi)localObject).rightMargin + this.n.right), a(paramInt2, ((zi)localObject).topMargin + this.n.top, ((zi)localObject).bottomMargin + this.n.bottom));
      return;
      ((Rect)localObject).set(this.e.c(paramView));
    }
  }
  
  private void a(zl paramzl, zp paramzp, int paramInt, boolean paramBoolean)
  {
    int i2;
    int i1;
    int i3;
    int i4;
    label43:
    label53:
    xs localxs;
    if (paramBoolean)
    {
      i2 = 1;
      i1 = 0;
      i3 = paramInt;
      paramInt = i1;
      if ((this.a != 1) || (!k())) {
        break label159;
      }
      i1 = this.h - 1;
      i4 = -1;
      int i5 = i1;
      i1 = paramInt;
      paramInt = i5;
      if (i1 == i3) {
        return;
      }
      View localView = this.j[i1];
      localxs = (xs)localView.getLayoutParams();
      xs.a(localxs, c(paramzl, paramzp, a(localView)));
      if ((i4 != -1) || (xs.b(localxs) <= 1)) {
        break label168;
      }
      xs.b(localxs, paramInt - (xs.b(localxs) - 1));
    }
    for (;;)
    {
      paramInt += xs.b(localxs) * i4;
      i1 += i2;
      break label53;
      paramInt--;
      i2 = -1;
      i3 = -1;
      break;
      label159:
      i1 = 0;
      i4 = 1;
      break label43;
      label168:
      xs.b(localxs, paramInt);
    }
  }
  
  private int b(zl paramzl, zp paramzp, int paramInt)
  {
    int i1;
    if (!paramzp.j) {
      i1 = this.m.a(paramInt, this.h);
    }
    for (;;)
    {
      return i1;
      int i2 = this.l.get(paramInt, -1);
      i1 = i2;
      if (i2 == -1)
      {
        i1 = paramzl.a(paramInt);
        if (i1 == -1)
        {
          Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + paramInt);
          i1 = 0;
        }
        else
        {
          i1 = this.m.a(i1, this.h);
        }
      }
    }
  }
  
  private int c(zl paramzl, zp paramzp, int paramInt)
  {
    int i2 = 1;
    int i1;
    if (!paramzp.j) {
      i1 = i2;
    }
    for (;;)
    {
      return i1;
      i1 = this.k.get(paramInt, -1);
      if (i1 == -1)
      {
        i1 = i2;
        if (paramzl.a(paramInt) == -1)
        {
          Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + paramInt);
          i1 = i2;
        }
      }
    }
  }
  
  private static int g(int paramInt)
  {
    if (paramInt < 0) {}
    for (paramInt = f;; paramInt = View.MeasureSpec.makeMeasureSpec(paramInt, 1073741824)) {
      return paramInt;
    }
  }
  
  public final int a(zl paramzl, zp paramzp)
  {
    int i1;
    if (this.a == 0) {
      i1 = this.h;
    }
    for (;;)
    {
      return i1;
      if (paramzp.a() <= 0) {
        i1 = 0;
      } else {
        i1 = a(paramzl, paramzp, paramzp.a() - 1);
      }
    }
  }
  
  final View a(zl paramzl, zp paramzp, int paramInt1, int paramInt2, int paramInt3)
  {
    Object localObject2 = null;
    l();
    int i3 = this.b.b();
    int i2 = this.b.c();
    int i1;
    Object localObject1;
    label37:
    Object localObject3;
    if (paramInt2 > paramInt1)
    {
      i1 = 1;
      localObject1 = null;
      if (paramInt1 == paramInt2) {
        break label184;
      }
      localObject3 = f(paramInt1);
      int i4 = a((View)localObject3);
      if ((i4 < 0) || (i4 >= paramInt3) || (b(paramzl, paramzp, i4) != 0)) {
        break label203;
      }
      if (!((zi)((View)localObject3).getLayoutParams()).c.n()) {
        break label136;
      }
      if (localObject1 != null) {
        break label203;
      }
      localObject1 = localObject2;
      localObject2 = localObject3;
    }
    for (;;)
    {
      paramInt1 += i1;
      localObject3 = localObject2;
      localObject2 = localObject1;
      localObject1 = localObject3;
      break label37;
      i1 = -1;
      break;
      label136:
      if (this.b.a((View)localObject3) < i2)
      {
        localObject4 = localObject3;
        if (this.b.b((View)localObject3) >= i3) {}
      }
      else
      {
        if (localObject2 != null) {
          break label203;
        }
        localObject2 = localObject1;
        localObject1 = localObject3;
        continue;
        label184:
        if (localObject2 == null) {
          break label196;
        }
      }
      label196:
      for (Object localObject4 = localObject2;; localObject4 = localObject1) {
        return (View)localObject4;
      }
      label203:
      localObject3 = localObject2;
      localObject2 = localObject1;
      localObject1 = localObject3;
    }
  }
  
  public final zi a(Context paramContext, AttributeSet paramAttributeSet)
  {
    return new xs(paramContext, paramAttributeSet);
  }
  
  public final zi a(ViewGroup.LayoutParams paramLayoutParams)
  {
    if ((paramLayoutParams instanceof ViewGroup.MarginLayoutParams)) {}
    for (paramLayoutParams = new xs((ViewGroup.MarginLayoutParams)paramLayoutParams);; paramLayoutParams = new xs(paramLayoutParams)) {
      return paramLayoutParams;
    }
  }
  
  public final void a()
  {
    this.m.a.clear();
  }
  
  public final void a(zl paramzl, zp paramzp, View paramView, jd paramjd)
  {
    ViewGroup.LayoutParams localLayoutParams = paramView.getLayoutParams();
    if (!(localLayoutParams instanceof xs))
    {
      super.a(paramView, paramjd);
      return;
    }
    paramView = (xs)localLayoutParams;
    int i1 = a(paramzl, paramzp, paramView.c.d());
    if (this.a == 0)
    {
      i2 = paramView.a;
      i3 = paramView.b;
      if ((this.h > 1) && (paramView.b == this.h)) {}
      for (bool = true;; bool = false)
      {
        paramjd.a(jm.a(i2, i3, i1, 1, bool, false));
        break;
      }
    }
    int i3 = paramView.a;
    int i2 = paramView.b;
    if ((this.h > 1) && (paramView.b == this.h)) {}
    for (boolean bool = true;; bool = false)
    {
      paramjd.a(jm.a(i1, 1, i3, i2, bool, false));
      break;
    }
  }
  
  final void a(zl paramzl, zp paramzp, xx paramxx)
  {
    int i2 = 0;
    super.a(paramzl, paramzp, paramxx);
    int i1;
    int i5;
    int i3;
    if (this.a == 1)
    {
      i1 = o() - s() - q();
      if ((this.i == null) || (this.i.length != this.h + 1) || (this.i[(this.i.length - 1)] != i1)) {
        this.i = new int[this.h + 1];
      }
      this.i[0] = 0;
      i5 = i1 / this.h;
      int i6 = i1 % this.h;
      i3 = 1;
      i1 = 0;
      label115:
      if (i3 > this.h) {
        break label204;
      }
      i1 += i6;
      if ((i1 <= 0) || (this.h - i1 >= i6)) {
        break label298;
      }
      i1 -= this.h;
    }
    label204:
    label298:
    for (int i4 = i5 + 1;; i4 = i5)
    {
      i2 += i4;
      this.i[i3] = i2;
      i3++;
      break label115;
      i1 = p() - t() - r();
      break;
      if ((paramzp.a() > 0) && (!paramzp.j)) {
        for (i1 = b(paramzl, paramzp, paramxx.a); (i1 > 0) && (paramxx.a > 0); i1 = b(paramzl, paramzp, paramxx.a)) {
          paramxx.a -= 1;
        }
      }
      if ((this.j == null) || (this.j.length != this.h)) {
        this.j = new View[this.h];
      }
      return;
    }
  }
  
  final void a(zl paramzl, zp paramzp, xz paramxz, xy paramxy)
  {
    boolean bool;
    if (paramxz.e == 1)
    {
      bool = true;
      i2 = 0;
      i1 = this.h;
      i5 = i2;
      if (!bool) {
        i1 = b(paramzl, paramzp, paramxz.d) + c(paramzl, paramzp, paramxz.d);
      }
    }
    int i3;
    for (int i5 = i2;; i5++)
    {
      if ((i5 >= this.h) || (!paramxz.a(paramzp)) || (i1 <= 0)) {
        break label204;
      }
      i2 = paramxz.d;
      i3 = c(paramzl, paramzp, i2);
      if (i3 > this.h)
      {
        throw new IllegalArgumentException("Item at position " + i2 + " requires " + i3 + " spans but GridLayoutManager has only " + this.h + " spans.");
        bool = false;
        break;
      }
      i1 -= i3;
      if (i1 < 0) {
        break label204;
      }
      View localView = paramxz.a(paramzl);
      if (localView == null) {
        break label204;
      }
      this.j[i5] = localView;
    }
    label204:
    if (i5 == 0)
    {
      paramxy.b = true;
      return;
    }
    int i1 = 0;
    a(paramzl, paramzp, i5, bool);
    int i2 = 0;
    label232:
    if (i2 < i5)
    {
      paramzp = this.j[i2];
      if (paramxz.j == null) {
        if (bool)
        {
          super.a(paramzp, -1, false);
          label266:
          paramzl = (xs)paramzp.getLayoutParams();
          i3 = View.MeasureSpec.makeMeasureSpec(this.i[(xs.a(paramzl) + xs.b(paramzl))] - this.i[xs.a(paramzl)], 1073741824);
          if (this.a != 1) {
            break label389;
          }
          a(paramzp, i3, g(paramzl.height));
          label327:
          i3 = this.b.c(paramzp);
          if (i3 <= i1) {
            break label849;
          }
          i1 = i3;
        }
      }
    }
    label389:
    label506:
    label593:
    label802:
    label838:
    label849:
    for (;;)
    {
      i2++;
      break label232;
      super.a(paramzp, 0, false);
      break label266;
      if (bool)
      {
        super.a(paramzp, -1, true);
        break label266;
      }
      super.a(paramzp, 0, true);
      break label266;
      a(paramzp, g(paramzl.width), i3);
      break label327;
      i3 = g(i1);
      i2 = 0;
      if (i2 < i5)
      {
        paramzp = this.j[i2];
        if (this.b.c(paramzp) != i1)
        {
          paramzl = (xs)paramzp.getLayoutParams();
          i4 = View.MeasureSpec.makeMeasureSpec(this.i[(xs.a(paramzl) + xs.b(paramzl))] - this.i[xs.a(paramzl)], 1073741824);
          if (this.a != 1) {
            break label506;
          }
          a(paramzp, i4, i3);
        }
        for (;;)
        {
          i2++;
          break;
          a(paramzp, i3, i4);
        }
      }
      paramxy.a = i1;
      int i4 = 0;
      i3 = 0;
      int i6;
      if (this.a == 1) {
        if (paramxz.f == -1)
        {
          i3 = paramxz.b;
          i4 = i3 - i1;
          i1 = 0;
          i2 = 0;
          int i8 = 0;
          i6 = i1;
          int i7 = i3;
          i1 = i8;
          i3 = i6;
          i6 = i4;
          i4 = i7;
          if (i1 >= i5) {
            break label838;
          }
          paramzl = this.j[i1];
          paramzp = (xs)paramzl.getLayoutParams();
          if (this.a != 1) {
            break label802;
          }
          i2 = q();
          i2 = this.i[xs.a(paramzp)] + i2;
          i3 = this.b.d(paramzl) + i2;
        }
      }
      for (;;)
      {
        a(paramzl, paramzp.leftMargin + i2, paramzp.topMargin + i6, i3 - paramzp.rightMargin, i4 - paramzp.bottomMargin);
        if ((paramzp.c.n()) || (paramzp.c.l())) {
          paramxy.c = true;
        }
        paramxy.d |= paramzl.isFocusable();
        i1++;
        break label593;
        i4 = paramxz.b;
        i3 = i4 + i1;
        i1 = 0;
        i2 = 0;
        break;
        if (paramxz.f == -1)
        {
          i6 = paramxz.b;
          i2 = i6 - i1;
          i1 = i6;
          break;
        }
        i2 = paramxz.b;
        i1 += i2;
        break;
        i4 = r();
        i6 = this.i[xs.a(paramzp)] + i4;
        i4 = this.b.d(paramzl) + i6;
      }
      Arrays.fill(this.j, null);
      break;
    }
  }
  
  public final boolean a(zi paramzi)
  {
    return paramzi instanceof xs;
  }
  
  public final int b(zl paramzl, zp paramzp)
  {
    int i1;
    if (this.a == 1) {
      i1 = this.h;
    }
    for (;;)
    {
      return i1;
      if (paramzp.a() <= 0) {
        i1 = 0;
      } else {
        i1 = a(paramzl, paramzp, paramzp.a() - 1);
      }
    }
  }
  
  public final void b()
  {
    this.m.a.clear();
  }
  
  public final void c()
  {
    this.m.a.clear();
  }
  
  public final void c(zl paramzl, zp paramzp)
  {
    if (paramzp.j)
    {
      int i2 = n();
      for (int i1 = 0; i1 < i2; i1++)
      {
        xs localxs = (xs)f(i1).getLayoutParams();
        int i3 = localxs.c.d();
        this.k.put(i3, localxs.b);
        this.l.put(i3, localxs.a);
      }
    }
    super.c(paramzl, paramzp);
    this.k.clear();
    this.l.clear();
    if (!paramzp.j) {
      this.g = false;
    }
  }
  
  public final void d()
  {
    this.m.a.clear();
  }
  
  public final void e()
  {
    this.m.a.clear();
  }
  
  public final zi f()
  {
    return new xs(-2, -2);
  }
  
  public final boolean g()
  {
    if ((this.c == null) && (!this.g)) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\xq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */