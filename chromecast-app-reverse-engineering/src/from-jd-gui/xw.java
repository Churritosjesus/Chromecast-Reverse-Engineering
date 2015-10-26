import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.List;

public class xw
  extends zh
{
  int a;
  yq b;
  ya c = null;
  private xz f;
  private boolean g;
  private boolean h = false;
  private boolean i = false;
  private boolean j = false;
  private boolean k = true;
  private int l = -1;
  private int m = Integer.MIN_VALUE;
  private xx n = new xx(this);
  
  private xw(int paramInt, boolean paramBoolean)
  {
    a(1);
    a(null);
    if (this.h)
    {
      this.h = false;
      m();
    }
  }
  
  public xw(Context paramContext)
  {
    this(1, false);
  }
  
  private int a(int paramInt, zl paramzl, zp paramzp, boolean paramBoolean)
  {
    int i1 = this.b.c() - paramInt;
    int i2;
    if (i1 > 0)
    {
      i2 = -d(-i1, paramzl, paramzp);
      i1 = i2;
      if (paramBoolean)
      {
        paramInt = this.b.c() - (paramInt + i2);
        i1 = i2;
        if (paramInt > 0) {
          this.b.a(paramInt);
        }
      }
    }
    for (i1 = i2 + paramInt;; i1 = 0) {
      return i1;
    }
  }
  
  private int a(zl paramzl, xz paramxz, zp paramzp, boolean paramBoolean)
  {
    int i3 = paramxz.c;
    if (paramxz.g != Integer.MIN_VALUE)
    {
      if (paramxz.c < 0) {
        paramxz.g += paramxz.c;
      }
      a(paramzl, paramxz);
    }
    int i2 = paramxz.c + paramxz.h;
    xy localxy = new xy();
    do
    {
      int i1;
      do
      {
        if ((i2 <= 0) || (!paramxz.a(paramzp))) {
          break;
        }
        localxy.a = 0;
        localxy.b = false;
        localxy.c = false;
        localxy.d = false;
        a(paramzl, paramzp, paramxz, localxy);
        if (localxy.b) {
          break;
        }
        paramxz.b += localxy.a * paramxz.f;
        if ((localxy.c) && (this.f.j == null))
        {
          i1 = i2;
          if (paramzp.j) {}
        }
        else
        {
          paramxz.c -= localxy.a;
          i1 = i2 - localxy.a;
        }
        if (paramxz.g != Integer.MIN_VALUE)
        {
          paramxz.g += localxy.a;
          if (paramxz.c < 0) {
            paramxz.g += paramxz.c;
          }
          a(paramzl, paramxz);
        }
        i2 = i1;
      } while (!paramBoolean);
      i2 = i1;
    } while (!localxy.d);
    return i3 - paramxz.c;
  }
  
  private View a(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2)
  {
    l();
    int i2 = this.b.b();
    int i3 = this.b.c();
    if (paramInt2 > paramInt1) {}
    Object localObject1;
    View localView;
    Object localObject2;
    for (int i1 = 1;; i1 = -1)
    {
      localObject1 = null;
      if (paramInt1 == paramInt2) {
        break label138;
      }
      localView = f(paramInt1);
      int i5 = this.b.a(localView);
      int i4 = this.b.b(localView);
      if ((i5 >= i3) || (i4 <= i2)) {
        break label145;
      }
      localObject2 = localView;
      if (paramBoolean1)
      {
        if ((i5 < i2) || (i4 > i3)) {
          break;
        }
        localObject2 = localView;
      }
      label107:
      return (View)localObject2;
    }
    if ((paramBoolean2) && (localObject1 == null)) {
      localObject1 = localView;
    }
    label138:
    label145:
    for (;;)
    {
      paramInt1 += i1;
      break;
      localObject2 = localObject1;
      break label107;
    }
  }
  
  private View a(boolean paramBoolean1, boolean paramBoolean2)
  {
    if (this.i) {}
    for (View localView = a(n() - 1, -1, paramBoolean1, true);; localView = a(0, n(), paramBoolean1, true)) {
      return localView;
    }
  }
  
  private void a(int paramInt1, int paramInt2)
  {
    this.f.c = (this.b.c() - paramInt2);
    xz localxz = this.f;
    if (this.i) {}
    for (int i1 = -1;; i1 = 1)
    {
      localxz.e = i1;
      this.f.d = paramInt1;
      this.f.f = 1;
      this.f.b = paramInt2;
      this.f.g = Integer.MIN_VALUE;
      return;
    }
  }
  
  private void a(int paramInt1, int paramInt2, boolean paramBoolean, zp paramzp)
  {
    int i1 = -1;
    int i2 = 1;
    this.f.h = g(paramzp);
    this.f.f = paramInt1;
    if (paramInt1 == 1)
    {
      paramzp = this.f;
      paramzp.h += this.b.f();
      localObject = w();
      paramzp = this.f;
      if (this.i) {}
      for (paramInt1 = i1;; paramInt1 = 1)
      {
        paramzp.e = paramInt1;
        this.f.d = (a((View)localObject) + this.f.e);
        this.f.b = this.b.b((View)localObject);
        paramInt1 = this.b.b((View)localObject) - this.b.c();
        this.f.c = paramInt2;
        if (paramBoolean)
        {
          paramzp = this.f;
          paramzp.c -= paramInt1;
        }
        this.f.g = paramInt1;
        return;
      }
    }
    paramzp = v();
    Object localObject = this.f;
    ((xz)localObject).h += this.b.b();
    localObject = this.f;
    if (this.i) {}
    for (paramInt1 = i2;; paramInt1 = -1)
    {
      ((xz)localObject).e = paramInt1;
      this.f.d = (a(paramzp) + this.f.e);
      this.f.b = this.b.a(paramzp);
      paramInt1 = -this.b.a(paramzp) + this.b.b();
      break;
    }
  }
  
  private void a(xx paramxx)
  {
    a(paramxx.a, paramxx.b);
  }
  
  private void a(zl paramzl, int paramInt1, int paramInt2)
  {
    if (paramInt1 == paramInt2) {}
    for (;;)
    {
      return;
      int i1 = paramInt1;
      if (paramInt2 > paramInt1)
      {
        paramInt2--;
        while (paramInt2 >= paramInt1)
        {
          a(paramInt2, paramzl);
          paramInt2--;
        }
      }
      else
      {
        while (i1 > paramInt2)
        {
          a(i1, paramzl);
          i1--;
        }
      }
    }
  }
  
  private void a(zl paramzl, xz paramxz)
  {
    if (!paramxz.a) {}
    label90:
    label137:
    label208:
    label251:
    for (;;)
    {
      return;
      int i1;
      int i2;
      int i3;
      if (paramxz.f == -1)
      {
        i1 = paramxz.g;
        i2 = n();
        if (i1 >= 0)
        {
          i3 = this.b.d() - i1;
          if (this.i) {
            for (i1 = 0;; i1++)
            {
              if (i1 >= i2) {
                break label90;
              }
              paramxz = f(i1);
              if (this.b.a(paramxz) < i3)
              {
                a(paramzl, 0, i1);
                break;
              }
            }
          } else {
            for (i1 = i2 - 1;; i1--)
            {
              if (i1 < 0) {
                break label137;
              }
              paramxz = f(i1);
              if (this.b.a(paramxz) < i3)
              {
                a(paramzl, i2 - 1, i1);
                break;
              }
            }
          }
        }
      }
      else
      {
        i2 = paramxz.g;
        if (i2 >= 0)
        {
          i3 = n();
          if (this.i) {
            for (i1 = i3 - 1;; i1--)
            {
              if (i1 < 0) {
                break label208;
              }
              paramxz = f(i1);
              if (this.b.b(paramxz) > i2)
              {
                a(paramzl, i3 - 1, i1);
                break;
              }
            }
          } else {
            for (i1 = 0;; i1++)
            {
              if (i1 >= i3) {
                break label251;
              }
              paramxz = f(i1);
              if (this.b.b(paramxz) > i2)
              {
                a(paramzl, 0, i1);
                break;
              }
            }
          }
        }
      }
    }
  }
  
  private void a(zl paramzl, zp paramzp, int paramInt1, int paramInt2)
  {
    if ((!paramzp.l) || (n() == 0) || (paramzp.j) || (!g())) {
      return;
    }
    int i1 = 0;
    int i2 = 0;
    List localList = paramzl.d;
    int i6 = localList.size();
    int i5 = a(f(0));
    int i3 = 0;
    label63:
    zr localzr;
    int i7;
    label105:
    int i4;
    if (i3 < i6)
    {
      localzr = (zr)localList.get(i3);
      if (localzr.n()) {
        break label342;
      }
      if (localzr.d() < i5)
      {
        i7 = 1;
        if (i7 == this.i) {
          break label179;
        }
        i4 = -1;
        label117:
        if (i4 != -1) {
          break label185;
        }
        i4 = this.b.c(localzr.a) + i1;
        i1 = i2;
        i2 = i4;
      }
    }
    for (;;)
    {
      i4 = i3 + 1;
      i3 = i2;
      i2 = i1;
      i1 = i3;
      i3 = i4;
      break label63;
      i7 = 0;
      break label105;
      label179:
      i4 = 1;
      break label117;
      label185:
      i4 = this.b.c(localzr.a) + i2;
      i2 = i1;
      i1 = i4;
      continue;
      this.f.j = localList;
      if (i1 > 0)
      {
        b(a(v()), paramInt1);
        this.f.h = i1;
        this.f.c = 0;
        this.f.a(null);
        a(paramzl, this.f, paramzp, false);
      }
      if (i2 > 0)
      {
        a(a(w()), paramInt2);
        this.f.h = i2;
        this.f.c = 0;
        this.f.a(null);
        a(paramzl, this.f, paramzp, false);
      }
      this.f.j = null;
      break;
      label342:
      i4 = i2;
      i2 = i1;
      i1 = i4;
    }
  }
  
  private int b(int paramInt, zl paramzl, zp paramzp, boolean paramBoolean)
  {
    int i1 = paramInt - this.b.b();
    int i2;
    if (i1 > 0)
    {
      i2 = -d(i1, paramzl, paramzp);
      i1 = i2;
      if (paramBoolean)
      {
        paramInt = paramInt + i2 - this.b.b();
        i1 = i2;
        if (paramInt > 0) {
          this.b.a(-paramInt);
        }
      }
    }
    for (i1 = i2 - paramInt;; i1 = 0) {
      return i1;
    }
  }
  
  private View b(boolean paramBoolean1, boolean paramBoolean2)
  {
    if (this.i) {}
    for (View localView = a(0, n(), paramBoolean1, true);; localView = a(n() - 1, -1, paramBoolean1, true)) {
      return localView;
    }
  }
  
  private void b(int paramInt1, int paramInt2)
  {
    this.f.c = (paramInt2 - this.b.b());
    this.f.d = paramInt1;
    xz localxz = this.f;
    if (this.i) {}
    for (paramInt1 = 1;; paramInt1 = -1)
    {
      localxz.e = paramInt1;
      this.f.f = -1;
      this.f.b = paramInt2;
      this.f.g = Integer.MIN_VALUE;
      return;
    }
  }
  
  private void b(xx paramxx)
  {
    b(paramxx.a, paramxx.b);
  }
  
  private int d(int paramInt, zl paramzl, zp paramzp)
  {
    if ((n() == 0) || (paramInt == 0)) {
      paramInt = 0;
    }
    for (;;)
    {
      return paramInt;
      this.f.a = true;
      l();
      if (paramInt > 0) {}
      int i2;
      int i3;
      for (int i1 = 1;; i1 = -1)
      {
        i2 = Math.abs(paramInt);
        a(i1, i2, true, paramzp);
        i3 = this.f.g + a(paramzl, this.f, paramzp, false);
        if (i3 >= 0) {
          break label87;
        }
        paramInt = 0;
        break;
      }
      label87:
      if (i2 > i3) {
        paramInt = i1 * i3;
      }
      this.b.a(-paramInt);
      this.f.i = paramInt;
    }
  }
  
  private View d(zl paramzl, zp paramzp)
  {
    if (this.i) {}
    for (paramzl = f(paramzl, paramzp);; paramzl = g(paramzl, paramzp)) {
      return paramzl;
    }
  }
  
  private View e(zl paramzl, zp paramzp)
  {
    if (this.i) {}
    for (paramzl = g(paramzl, paramzp);; paramzl = f(paramzl, paramzp)) {
      return paramzl;
    }
  }
  
  private View f(zl paramzl, zp paramzp)
  {
    return a(paramzl, paramzp, 0, n(), paramzp.a());
  }
  
  private int g(zp paramzp)
  {
    int i2 = 0;
    if (paramzp.a != -1) {}
    for (int i1 = 1;; i1 = 0)
    {
      if (i1 != 0) {
        i2 = this.b.e();
      }
      return i2;
    }
  }
  
  private View g(zl paramzl, zp paramzp)
  {
    return a(paramzl, paramzp, n() - 1, -1, paramzp.a());
  }
  
  private int h(zp paramzp)
  {
    int i1 = 0;
    if (n() == 0) {
      i2 = i1;
    }
    yq localyq;
    boolean bool1;
    label36:
    View localView2;
    label55:
    View localView1;
    boolean bool2;
    do
    {
      do
      {
        do
        {
          do
          {
            return i2;
            l();
            localyq = this.b;
            if (this.k) {
              break;
            }
            bool1 = true;
            localView2 = a(bool1, true);
            if (this.k) {
              break label243;
            }
            bool1 = true;
            localView1 = b(bool1, true);
            bool2 = this.k;
            bool1 = this.i;
            i2 = i1;
          } while (n() == 0);
          i2 = i1;
        } while (paramzp.a() == 0);
        i2 = i1;
      } while (localView2 == null);
      i2 = i1;
    } while (localView1 == null);
    int i2 = Math.min(zh.a(localView2), zh.a(localView1));
    i1 = Math.max(zh.a(localView2), zh.a(localView1));
    if (bool1) {}
    for (i1 = Math.max(0, paramzp.a() - i1 - 1);; i1 = Math.max(0, i2))
    {
      i2 = i1;
      if (!bool2) {
        break;
      }
      int i3 = Math.abs(localyq.b(localView1) - localyq.a(localView2));
      i2 = Math.abs(zh.a(localView2) - zh.a(localView1));
      i2 = Math.round(i3 / (i2 + 1) * i1 + (localyq.b() - localyq.a(localView2)));
      break;
      bool1 = false;
      break label36;
      label243:
      bool1 = false;
      break label55;
    }
  }
  
  private int i(zp paramzp)
  {
    int i2 = 0;
    int i1;
    if (n() == 0) {
      i1 = i2;
    }
    for (;;)
    {
      return i1;
      l();
      yq localyq = this.b;
      label36:
      View localView2;
      if (!this.k)
      {
        bool = true;
        localView2 = a(bool, true);
        if (this.k) {
          break label139;
        }
      }
      View localView1;
      label139:
      for (boolean bool = true;; bool = false)
      {
        localView1 = b(bool, true);
        bool = this.k;
        i1 = i2;
        if (n() == 0) {
          break;
        }
        i1 = i2;
        if (paramzp.a() == 0) {
          break;
        }
        i1 = i2;
        if (localView2 == null) {
          break;
        }
        i1 = i2;
        if (localView1 == null) {
          break;
        }
        if (bool) {
          break label145;
        }
        i1 = Math.abs(zh.a(localView2) - zh.a(localView1)) + 1;
        break;
        bool = false;
        break label36;
      }
      label145:
      i2 = localyq.b(localView1);
      i1 = localyq.a(localView2);
      i1 = Math.min(localyq.e(), i2 - i1);
    }
  }
  
  private int j(zp paramzp)
  {
    int i2 = 0;
    int i1;
    if (n() == 0) {
      i1 = i2;
    }
    for (;;)
    {
      return i1;
      l();
      yq localyq = this.b;
      label36:
      View localView1;
      if (!this.k)
      {
        bool = true;
        localView1 = a(bool, true);
        if (this.k) {
          break label128;
        }
      }
      View localView2;
      label128:
      for (boolean bool = true;; bool = false)
      {
        localView2 = b(bool, true);
        bool = this.k;
        i1 = i2;
        if (n() == 0) {
          break;
        }
        i1 = i2;
        if (paramzp.a() == 0) {
          break;
        }
        i1 = i2;
        if (localView1 == null) {
          break;
        }
        i1 = i2;
        if (localView2 == null) {
          break;
        }
        if (bool) {
          break label134;
        }
        i1 = paramzp.a();
        break;
        bool = false;
        break label36;
      }
      label134:
      i2 = localyq.b(localView2);
      i1 = localyq.a(localView1);
      int i3 = Math.abs(zh.a(localView1) - zh.a(localView2));
      i1 = (int)((i2 - i1) / (i3 + 1) * paramzp.a());
    }
  }
  
  private void u()
  {
    boolean bool = true;
    if ((this.a == 1) || (!k())) {
      bool = this.h;
    }
    for (;;)
    {
      this.i = bool;
      return;
      if (this.h) {
        bool = false;
      }
    }
  }
  
  private View v()
  {
    if (this.i) {}
    for (int i1 = n() - 1;; i1 = 0) {
      return f(i1);
    }
  }
  
  private View w()
  {
    if (this.i) {}
    for (int i1 = 0;; i1 = n() - 1) {
      return f(i1);
    }
  }
  
  public final int a(int paramInt, zl paramzl, zp paramzp)
  {
    if (this.a == 1) {}
    for (paramInt = 0;; paramInt = d(paramInt, paramzl, paramzp)) {
      return paramInt;
    }
  }
  
  public final int a(zp paramzp)
  {
    return h(paramzp);
  }
  
  View a(zl paramzl, zp paramzp, int paramInt1, int paramInt2, int paramInt3)
  {
    paramzp = null;
    l();
    int i2 = this.b.b();
    int i3 = this.b.c();
    int i1;
    label35:
    Object localObject1;
    if (paramInt2 > paramInt1)
    {
      i1 = 1;
      paramzl = null;
      if (paramInt1 == paramInt2) {
        break label159;
      }
      localObject1 = f(paramInt1);
      int i4 = a((View)localObject1);
      if ((i4 < 0) || (i4 >= paramInt3)) {
        break label175;
      }
      if (!((zi)((View)localObject1).getLayoutParams()).c.n()) {
        break label115;
      }
      if (paramzl != null) {
        break label175;
      }
      paramzl = paramzp;
      paramzp = (zp)localObject1;
    }
    for (;;)
    {
      paramInt1 += i1;
      localObject1 = paramzp;
      paramzp = paramzl;
      paramzl = (zl)localObject1;
      break label35;
      i1 = -1;
      break;
      label115:
      if (this.b.a((View)localObject1) < i3)
      {
        localObject2 = localObject1;
        if (this.b.b((View)localObject1) >= i2) {}
      }
      else
      {
        if (paramzp != null) {
          break label175;
        }
        paramzp = paramzl;
        paramzl = (zl)localObject1;
        continue;
        label159:
        if (paramzp == null) {
          break label169;
        }
      }
      label169:
      for (Object localObject2 = paramzp;; localObject2 = paramzl) {
        return (View)localObject2;
      }
      label175:
      localObject1 = paramzl;
      paramzl = paramzp;
      paramzp = (zp)localObject1;
    }
  }
  
  public final void a(int paramInt)
  {
    if ((paramInt != 0) && (paramInt != 1)) {
      throw new IllegalArgumentException("invalid orientation:" + paramInt);
    }
    a(null);
    if (paramInt == this.a) {}
    for (;;)
    {
      return;
      this.a = paramInt;
      this.b = null;
      m();
    }
  }
  
  public final void a(Parcelable paramParcelable)
  {
    if ((paramParcelable instanceof ya))
    {
      this.c = ((ya)paramParcelable);
      m();
    }
  }
  
  public final void a(RecyclerView paramRecyclerView, zl paramzl)
  {
    super.a(paramRecyclerView, paramzl);
  }
  
  public final void a(AccessibilityEvent paramAccessibilityEvent)
  {
    int i2 = -1;
    super.a(paramAccessibilityEvent);
    View localView;
    if (n() > 0)
    {
      paramAccessibilityEvent = iz.a(paramAccessibilityEvent);
      localView = a(0, n(), false, true);
      if (localView != null) {
        break label70;
      }
      i1 = -1;
      paramAccessibilityEvent.b(i1);
      localView = a(n() - 1, -1, false, true);
      if (localView != null) {
        break label78;
      }
    }
    label70:
    label78:
    for (int i1 = i2;; i1 = a(localView))
    {
      paramAccessibilityEvent.c(i1);
      return;
      i1 = a(localView);
      break;
    }
  }
  
  public final void a(String paramString)
  {
    if (this.c == null) {
      super.a(paramString);
    }
  }
  
  void a(zl paramzl, zp paramzp, xx paramxx) {}
  
  void a(zl paramzl, zp paramzp, xz paramxz, xy paramxy)
  {
    paramzl = paramxz.a(paramzl);
    if (paramzl == null)
    {
      paramxy.b = true;
      return;
    }
    zi localzi = (zi)paramzl.getLayoutParams();
    boolean bool2;
    boolean bool1;
    label50:
    label64:
    int i2;
    int i3;
    int i1;
    int i4;
    if (paramxz.j == null)
    {
      bool2 = this.i;
      if (paramxz.f == -1)
      {
        bool1 = true;
        if (bool2 != bool1) {
          break label358;
        }
        super.a(paramzl, -1, false);
        paramzp = (zi)paramzl.getLayoutParams();
        Rect localRect = this.e.c(paramzl);
        i2 = localRect.left;
        i3 = localRect.right;
        i1 = localRect.top;
        i4 = localRect.bottom;
        paramzl.measure(zh.a(o(), i2 + i3 + 0 + (q() + s() + paramzp.leftMargin + paramzp.rightMargin), paramzp.width, i()), zh.a(p(), i4 + i1 + 0 + (r() + t() + paramzp.topMargin + paramzp.bottomMargin), paramzp.height, j()));
        paramxy.a = this.b.c(paramzl);
        if (this.a != 1) {
          break label469;
        }
        if (!k()) {
          break label418;
        }
        i1 = o() - s();
        i2 = i1 - this.b.d(paramzl);
        label250:
        if (paramxz.f != -1) {
          break label440;
        }
        i3 = paramxz.b;
        i4 = paramxz.b - paramxy.a;
      }
    }
    for (;;)
    {
      a(paramzl, i2 + localzi.leftMargin, i4 + localzi.topMargin, i1 - localzi.rightMargin, i3 - localzi.bottomMargin);
      if ((localzi.c.n()) || (localzi.c.l())) {
        paramxy.c = true;
      }
      paramxy.d = paramzl.isFocusable();
      break;
      bool1 = false;
      break label50;
      label358:
      super.a(paramzl, 0, false);
      break label64;
      bool2 = this.i;
      if (paramxz.f == -1) {}
      for (bool1 = true;; bool1 = false)
      {
        if (bool2 != bool1) {
          break label408;
        }
        super.a(paramzl, -1, true);
        break;
      }
      label408:
      super.a(paramzl, 0, true);
      break label64;
      label418:
      i2 = q();
      i1 = this.b.d(paramzl) + i2;
      break label250;
      label440:
      i4 = paramxz.b;
      int i5 = paramxz.b;
      i3 = paramxy.a;
      i3 = i5 + i3;
      continue;
      label469:
      i4 = r();
      i3 = this.b.d(paramzl) + i4;
      if (paramxz.f == -1)
      {
        i1 = paramxz.b;
        i2 = paramxz.b - paramxy.a;
      }
      else
      {
        i2 = paramxz.b;
        i1 = paramxz.b + paramxy.a;
      }
    }
  }
  
  public final int b(int paramInt, zl paramzl, zp paramzp)
  {
    if (this.a == 0) {}
    for (paramInt = 0;; paramInt = d(paramInt, paramzl, paramzp)) {
      return paramInt;
    }
  }
  
  public final int b(zp paramzp)
  {
    return h(paramzp);
  }
  
  public final View b(int paramInt)
  {
    int i2 = n();
    Object localObject;
    if (i2 == 0) {
      localObject = null;
    }
    for (;;)
    {
      return (View)localObject;
      int i1 = paramInt - a(f(0));
      if ((i1 >= 0) && (i1 < i2))
      {
        View localView = f(i1);
        localObject = localView;
        if (a(localView) == paramInt) {}
      }
      else
      {
        localObject = super.b(paramInt);
      }
    }
  }
  
  public final int c(zp paramzp)
  {
    return i(paramzp);
  }
  
  public final View c(int paramInt, zl paramzl, zp paramzp)
  {
    Object localObject2 = null;
    u();
    Object localObject1;
    if (n() == 0) {
      localObject1 = localObject2;
    }
    label83:
    View localView;
    label110:
    do
    {
      do
      {
        return (View)localObject1;
        switch (paramInt)
        {
        default: 
          paramInt = Integer.MIN_VALUE;
          localObject1 = localObject2;
        }
      } while (paramInt == Integer.MIN_VALUE);
      l();
      if (paramInt != -1) {
        break;
      }
      localView = e(paramzl, paramzp);
      localObject1 = localObject2;
    } while (localView == null);
    l();
    a(paramInt, (int)(0.33F * this.b.e()), false, paramzp);
    this.f.g = Integer.MIN_VALUE;
    this.f.a = false;
    a(paramzl, this.f, paramzp, true);
    if (paramInt == -1) {}
    for (paramzl = v();; paramzl = w())
    {
      localObject1 = localObject2;
      if (paramzl == localView) {
        break;
      }
      localObject1 = localObject2;
      if (!paramzl.isFocusable()) {
        break;
      }
      localObject1 = paramzl;
      break;
      paramInt = -1;
      break label83;
      paramInt = 1;
      break label83;
      if (this.a == 1)
      {
        paramInt = -1;
        break label83;
      }
      paramInt = Integer.MIN_VALUE;
      break label83;
      if (this.a == 1)
      {
        paramInt = 1;
        break label83;
      }
      paramInt = Integer.MIN_VALUE;
      break label83;
      if (this.a == 0)
      {
        paramInt = -1;
        break label83;
      }
      paramInt = Integer.MIN_VALUE;
      break label83;
      if (this.a == 0)
      {
        paramInt = 1;
        break label83;
      }
      paramInt = Integer.MIN_VALUE;
      break label83;
      localView = d(paramzl, paramzp);
      break label110;
    }
  }
  
  public final void c(int paramInt)
  {
    this.l = paramInt;
    this.m = Integer.MIN_VALUE;
    if (this.c != null) {
      this.c.a = -1;
    }
    m();
  }
  
  public void c(zl paramzl, zp paramzp)
  {
    if ((this.c != null) && (this.c.a())) {
      this.l = this.c.a;
    }
    l();
    this.f.a = false;
    u();
    Object localObject1 = this.n;
    ((xx)localObject1).a = -1;
    ((xx)localObject1).b = Integer.MIN_VALUE;
    ((xx)localObject1).c = false;
    this.n.c = this.i;
    Object localObject2 = this.n;
    label121:
    label174:
    int i4;
    label203:
    label206:
    int i2;
    label242:
    int i3;
    if ((paramzp.j) || (this.l == -1))
    {
      i1 = 0;
      if (i1 == 0)
      {
        if (n() == 0) {
          break label1263;
        }
        if (this.e != null) {
          break label912;
        }
        localObject1 = null;
        if (localObject1 == null) {
          break label1256;
        }
        zi localzi = (zi)((View)localObject1).getLayoutParams();
        if ((localzi.c.n()) || (localzi.c.d() < 0) || (localzi.c.d() >= paramzp.a())) {
          break label943;
        }
        i1 = 1;
        if (i1 == 0) {
          break label1256;
        }
        i4 = ((xx)localObject2).d.b.a();
        if (i4 < 0) {
          break label949;
        }
        ((xx)localObject2).a((View)localObject1);
        i1 = 1;
        if (i1 == 0)
        {
          ((xx)localObject2).a();
          ((xx)localObject2).a = 0;
        }
      }
      i1 = g(paramzp);
      if (this.f.i < 0) {
        break label1410;
      }
      i2 = 0;
      i3 = i2 + this.b.b();
      i4 = i1 + this.b.f();
      i1 = i4;
      i2 = i3;
      if (paramzp.j)
      {
        i1 = i4;
        i2 = i3;
        if (this.l != -1)
        {
          i1 = i4;
          i2 = i3;
          if (this.m != Integer.MIN_VALUE)
          {
            localObject1 = b(this.l);
            i1 = i4;
            i2 = i3;
            if (localObject1 != null)
            {
              if (!this.i) {
                break label1420;
              }
              i1 = this.b.c() - this.b.b((View)localObject1) - this.m;
              label365:
              if (i1 <= 0) {
                break label1454;
              }
              i2 = i3 + i1;
              i1 = i4;
            }
          }
        }
      }
      label381:
      a(paramzl, paramzp, this.n);
      i3 = n() - 1;
      label399:
      if (i3 < 0) {
        break label1576;
      }
      localObject1 = f(i3);
      localObject2 = RecyclerView.b((View)localObject1);
      if (!((zr)localObject2).b())
      {
        if ((!((zr)localObject2).j()) || (((zr)localObject2).n()) || (((zr)localObject2).l())) {
          break label1468;
        }
        RecyclerView.f(this.e);
        d(i3);
        paramzl.a((zr)localObject2);
      }
    }
    label817:
    label844:
    label850:
    label912:
    label943:
    label949:
    int i5;
    for (;;)
    {
      i3--;
      break label399;
      if ((this.l < 0) || (this.l >= paramzp.a()))
      {
        this.l = -1;
        this.m = Integer.MIN_VALUE;
        i1 = 0;
        break;
      }
      ((xx)localObject2).a = this.l;
      if ((this.c != null) && (this.c.a()))
      {
        ((xx)localObject2).c = this.c.c;
        if (((xx)localObject2).c) {}
        for (((xx)localObject2).b = (this.b.c() - this.c.b);; ((xx)localObject2).b = (this.b.b() + this.c.b))
        {
          i1 = 1;
          break;
        }
      }
      if (this.m == Integer.MIN_VALUE)
      {
        localObject1 = b(this.l);
        if (localObject1 != null) {
          if (this.b.c((View)localObject1) > this.b.e()) {
            ((xx)localObject2).a();
          }
        }
      }
      for (;;)
      {
        i1 = 1;
        break;
        if (this.b.a((View)localObject1) - this.b.b() < 0)
        {
          ((xx)localObject2).b = this.b.b();
          ((xx)localObject2).c = false;
        }
        else if (this.b.c() - this.b.b((View)localObject1) < 0)
        {
          ((xx)localObject2).b = this.b.c();
          ((xx)localObject2).c = true;
        }
        else
        {
          if (((xx)localObject2).c) {}
          for (i1 = this.b.b((View)localObject1) + this.b.a();; i1 = this.b.a((View)localObject1))
          {
            ((xx)localObject2).b = i1;
            i1 = 1;
            break;
          }
          if (n() > 0)
          {
            i1 = a(f(0));
            if (this.l >= i1) {
              break label844;
            }
            bool = true;
            if (bool != this.i) {
              break label850;
            }
          }
          for (boolean bool = true;; bool = false)
          {
            ((xx)localObject2).c = bool;
            ((xx)localObject2).a();
            break;
            bool = false;
            break label817;
          }
          ((xx)localObject2).c = this.i;
          if (this.i) {
            ((xx)localObject2).b = (this.b.c() - this.m);
          } else {
            ((xx)localObject2).b = (this.b.b() + this.m);
          }
        }
      }
      localObject1 = this.e.getFocusedChild();
      if ((localObject1 == null) || (this.d.a((View)localObject1)))
      {
        localObject1 = null;
        break label121;
      }
      break label121;
      i1 = 0;
      break label174;
      ((xx)localObject2).a = a((View)localObject1);
      if (((xx)localObject2).c)
      {
        i1 = ((xx)localObject2).d.b.c() - i4 - ((xx)localObject2).d.b.b((View)localObject1);
        ((xx)localObject2).b = (((xx)localObject2).d.b.c() - i1);
        if (i1 <= 0) {
          break label203;
        }
        i3 = ((xx)localObject2).d.b.c((View)localObject1);
        i4 = ((xx)localObject2).b;
        i2 = ((xx)localObject2).d.b.b();
        i2 = i4 - i3 - (Math.min(((xx)localObject2).d.b.a((View)localObject1) - i2, 0) + i2);
        if (i2 >= 0) {
          break label203;
        }
        i3 = ((xx)localObject2).b;
        ((xx)localObject2).b = (Math.min(i1, -i2) + i3);
        break label203;
      }
      i3 = ((xx)localObject2).d.b.a((View)localObject1);
      i1 = i3 - ((xx)localObject2).d.b.b();
      ((xx)localObject2).b = i3;
      if (i1 <= 0) {
        break label203;
      }
      i2 = ((xx)localObject2).d.b.c((View)localObject1);
      i5 = ((xx)localObject2).d.b.c();
      int i6 = ((xx)localObject2).d.b.b((View)localObject1);
      i2 = ((xx)localObject2).d.b.c() - Math.min(0, i5 - i4 - i6) - (i3 + i2);
      if (i2 >= 0) {
        break label203;
      }
      ((xx)localObject2).b -= Math.min(i1, -i2);
      break label203;
      label1256:
      if (this.g)
      {
        label1263:
        i1 = 0;
        break label206;
      }
      if (((xx)localObject2).c)
      {
        localObject1 = d(paramzl, paramzp);
        label1284:
        if (localObject1 == null) {
          break label1390;
        }
        ((xx)localObject2).a((View)localObject1);
        if ((!paramzp.j) && (g()))
        {
          if ((this.b.a((View)localObject1) < this.b.c()) && (this.b.b((View)localObject1) >= this.b.b())) {
            break label1392;
          }
          i1 = 1;
          label1347:
          if (i1 != 0) {
            if (!((xx)localObject2).c) {
              break label1398;
            }
          }
        }
      }
      label1390:
      label1392:
      label1398:
      for (i1 = this.b.c();; i1 = this.b.b())
      {
        ((xx)localObject2).b = i1;
        i1 = 1;
        break;
        localObject1 = e(paramzl, paramzp);
        break label1284;
        break label1263;
        i1 = 0;
        break label1347;
      }
      label1410:
      i2 = i1;
      i1 = 0;
      break label242;
      label1420:
      i1 = this.b.a((View)localObject1);
      i2 = this.b.b();
      i1 = this.m - (i1 - i2);
      break label365;
      label1454:
      i1 = i4 - i1;
      i2 = i3;
      break label381;
      label1468:
      e(i3);
      localObject1 = RecyclerView.b((View)localObject1);
      ((zr)localObject1).j = paramzl;
      if ((!((zr)localObject1).l()) || (!RecyclerView.h(paramzl.e)))
      {
        if ((((zr)localObject1).j()) && (!((zr)localObject1).n()))
        {
          RecyclerView.f(paramzl.e);
          throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.");
        }
        paramzl.a.add(localObject1);
      }
      else
      {
        if (paramzl.b == null) {
          paramzl.b = new ArrayList();
        }
        paramzl.b.add(localObject1);
      }
    }
    label1576:
    if (this.n.c)
    {
      b(this.n);
      this.f.h = i2;
      a(paramzl, this.f, paramzp, false);
      i4 = this.f.b;
      i5 = this.f.d;
      i2 = i1;
      if (this.f.c > 0) {
        i2 = i1 + this.f.c;
      }
      a(this.n);
      this.f.h = i2;
      localObject1 = this.f;
      ((xz)localObject1).d += this.f.e;
      a(paramzl, this.f, paramzp, false);
      i3 = this.f.b;
      if (this.f.c <= 0) {
        break label2156;
      }
      i1 = this.f.c;
      b(i5, i4);
      this.f.h = i1;
      a(paramzl, this.f, paramzp, false);
    }
    label2107:
    label2156:
    for (int i1 = this.f.b;; i1 = i4)
    {
      i2 = i1;
      i1 = i3;
      i3 = i1;
      i4 = i2;
      if (n() > 0)
      {
        if (!this.i) {
          break label2107;
        }
        i3 = a(i1, paramzl, paramzp, true);
        i4 = i2 + i3;
        i2 = b(i4, paramzl, paramzp, false);
        i4 += i2;
      }
      for (i3 = i1 + i3 + i2;; i3 = i1 + i5)
      {
        a(paramzl, paramzp, i4, i3);
        if (!paramzp.j)
        {
          this.l = -1;
          this.m = Integer.MIN_VALUE;
          paramzl = this.b;
          paramzl.b = paramzl.e();
        }
        this.g = false;
        this.c = null;
        return;
        a(this.n);
        this.f.h = i1;
        a(paramzl, this.f, paramzp, false);
        i3 = this.f.b;
        i5 = this.f.d;
        i1 = i2;
        if (this.f.c > 0) {
          i1 = i2 + this.f.c;
        }
        b(this.n);
        this.f.h = i1;
        localObject1 = this.f;
        ((xz)localObject1).d += this.f.e;
        a(paramzl, this.f, paramzp, false);
        i4 = this.f.b;
        i1 = i3;
        i2 = i4;
        if (this.f.c <= 0) {
          break;
        }
        i1 = this.f.c;
        a(i5, i3);
        this.f.h = i1;
        a(paramzl, this.f, paramzp, false);
        i1 = this.f.b;
        i2 = i4;
        break;
        i3 = b(i2, paramzl, paramzp, true);
        i1 += i3;
        i5 = a(i1, paramzl, paramzp, false);
        i4 = i2 + i3 + i5;
      }
    }
  }
  
  public final int d(zp paramzp)
  {
    return i(paramzp);
  }
  
  public final int e(zp paramzp)
  {
    return j(paramzp);
  }
  
  public final int f(zp paramzp)
  {
    return j(paramzp);
  }
  
  public zi f()
  {
    return new zi(-2, -2);
  }
  
  public boolean g()
  {
    if ((this.c == null) && (!this.g)) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public final Parcelable h()
  {
    ya localya;
    if (this.c != null) {
      localya = new ya(this.c);
    }
    for (;;)
    {
      return localya;
      localya = new ya();
      if (n() > 0)
      {
        l();
        boolean bool = this.g ^ this.i;
        localya.c = bool;
        View localView;
        if (bool)
        {
          localView = w();
          localya.b = (this.b.c() - this.b.b(localView));
          localya.a = a(localView);
        }
        else
        {
          localView = v();
          localya.a = a(localView);
          localya.b = (this.b.a(localView) - this.b.b());
        }
      }
      else
      {
        localya.a = -1;
      }
    }
  }
  
  public final boolean i()
  {
    if (this.a == 0) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public final boolean j()
  {
    boolean bool = true;
    if (this.a == 1) {}
    for (;;)
    {
      return bool;
      bool = false;
    }
  }
  
  protected final boolean k()
  {
    boolean bool = true;
    if (gt.g(this.e) == 1) {}
    for (;;)
    {
      return bool;
      bool = false;
    }
  }
  
  final void l()
  {
    if (this.f == null) {
      this.f = new xz();
    }
    if (this.b == null) {
      switch (this.a)
      {
      default: 
        throw new IllegalArgumentException("invalid orientation");
      }
    }
    for (Object localObject = new yr(this);; localObject = new ys(this))
    {
      this.b = ((yq)localObject);
      return;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\xw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */