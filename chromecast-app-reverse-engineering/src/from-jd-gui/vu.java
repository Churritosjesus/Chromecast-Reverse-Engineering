import android.content.Context;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.support.v7.internal.view.menu.ActionMenuItemView;
import android.support.v7.widget.ActionMenuView;
import android.util.DisplayMetrics;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import java.util.ArrayList;

public final class vu
  extends pv
  implements fc
{
  View f;
  public int g;
  public boolean h;
  public boolean i;
  wa j;
  vv k;
  public vx l;
  final wb m = new wb(this);
  private boolean n;
  private boolean o;
  private int p;
  private int q;
  private boolean r;
  private boolean s;
  private int t;
  private final SparseBooleanArray u = new SparseBooleanArray();
  private View v;
  private vw w;
  
  public vu(Context paramContext)
  {
    super(paramContext, a.bD, a.bC);
  }
  
  public final View a(qe paramqe, View paramView, ViewGroup paramViewGroup)
  {
    View localView = paramqe.getActionView();
    if ((localView == null) || (paramqe.i())) {
      localView = super.a(paramqe, paramView, paramViewGroup);
    }
    if (paramqe.isActionViewExpanded()) {}
    for (int i1 = 8;; i1 = 0)
    {
      localView.setVisibility(i1);
      paramqe = (ActionMenuView)paramViewGroup;
      paramView = localView.getLayoutParams();
      if (!paramqe.checkLayoutParams(paramView)) {
        localView.setLayoutParams(paramqe.a(paramView));
      }
      return localView;
    }
  }
  
  public final qr a(ViewGroup paramViewGroup)
  {
    paramViewGroup = super.a(paramViewGroup);
    ((ActionMenuView)paramViewGroup).a(this);
    return paramViewGroup;
  }
  
  public final void a(Context paramContext, qa paramqa)
  {
    boolean bool = true;
    super.a(paramContext, paramqa);
    paramqa = paramContext.getResources();
    paramContext = ph.a(paramContext);
    int i1;
    if (!this.o)
    {
      if (Build.VERSION.SDK_INT >= 19) {
        this.n = bool;
      }
    }
    else
    {
      if (!this.s) {
        this.p = (paramContext.a.getResources().getDisplayMetrics().widthPixels / 2);
      }
      if (!this.h) {
        this.g = paramContext.a.getResources().getInteger(a.bA);
      }
      i1 = this.p;
      if (!this.n) {
        break label198;
      }
      if (this.f == null)
      {
        this.f = new vy(this, this.a);
        int i2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f.measure(i2, i2);
      }
      i1 -= this.f.getMeasuredWidth();
    }
    for (;;)
    {
      this.q = i1;
      this.t = ((int)(56.0F * paramqa.getDisplayMetrics().density));
      this.v = null;
      return;
      if (!hf.b(ViewConfiguration.get(paramContext.a))) {
        break;
      }
      bool = false;
      break;
      label198:
      this.f = null;
    }
  }
  
  public final void a(ActionMenuView paramActionMenuView)
  {
    this.e = paramActionMenuView;
    paramActionMenuView.a = this.c;
  }
  
  public final void a(qa paramqa, boolean paramBoolean)
  {
    d();
    super.a(paramqa, paramBoolean);
  }
  
  public final void a(qe paramqe, qs paramqs)
  {
    paramqs.a(paramqe, 0);
    paramqe = (ActionMenuView)this.e;
    paramqs = (ActionMenuItemView)paramqs;
    paramqs.a = paramqe;
    if (this.w == null) {
      this.w = new vw(this);
    }
    paramqs.b = this.w;
  }
  
  public final void a(boolean paramBoolean)
  {
    if (paramBoolean) {
      super.a(null);
    }
    for (;;)
    {
      return;
      this.c.a(false);
    }
  }
  
  public final boolean a()
  {
    ArrayList localArrayList = this.c.h();
    int i10 = localArrayList.size();
    int i1 = this.g;
    int i8 = this.q;
    int i9 = View.MeasureSpec.makeMeasureSpec(0, 0);
    ViewGroup localViewGroup = (ViewGroup)this.e;
    int i3 = 0;
    int i4 = 0;
    int i5 = 0;
    int i2 = 0;
    Object localObject1;
    if (i2 < i10)
    {
      localObject1 = (qe)localArrayList.get(i2);
      if (((qe)localObject1).h())
      {
        i3++;
        label80:
        if ((!this.i) || (!((qe)localObject1).isActionViewExpanded())) {
          break label892;
        }
        i1 = 0;
      }
    }
    label316:
    label486:
    label546:
    label553:
    label595:
    label686:
    label698:
    label704:
    label865:
    label868:
    label883:
    label892:
    for (;;)
    {
      i2++;
      break;
      if (((qe)localObject1).g())
      {
        i4++;
        break label80;
      }
      i5 = 1;
      break label80;
      i2 = i1;
      if (this.n) {
        if (i5 == 0)
        {
          i2 = i1;
          if (i3 + i4 <= i1) {}
        }
        else
        {
          i2 = i1 - 1;
        }
      }
      i2 -= i3;
      localObject1 = this.u;
      ((SparseBooleanArray)localObject1).clear();
      i1 = 0;
      if (this.r)
      {
        i1 = i8 / this.t;
        i4 = this.t;
        i3 = this.t;
      }
      for (int i6 = i8 % i4 / i1 + i3;; i6 = 0)
      {
        int i7 = 0;
        i5 = 0;
        i3 = i1;
        i1 = i2;
        i4 = i8;
        i2 = i5;
        qe localqe;
        Object localObject2;
        if (i7 < i10)
        {
          localqe = (qe)localArrayList.get(i7);
          if (localqe.h())
          {
            localObject2 = a(localqe, this.v, localViewGroup);
            if (this.v == null) {
              this.v = ((View)localObject2);
            }
            if (this.r)
            {
              i5 = i3 - ActionMenuView.a((View)localObject2, i6, i3, i9, 0);
              i3 = ((View)localObject2).getMeasuredWidth();
              if (i2 != 0) {
                break label883;
              }
              i2 = i3;
            }
          }
        }
        for (;;)
        {
          i8 = localqe.getGroupId();
          if (i8 != 0) {
            ((SparseBooleanArray)localObject1).put(i8, true);
          }
          localqe.d(true);
          i8 = i4 - i3;
          i3 = i1;
          i1 = i2;
          i4 = i5;
          i2 = i8;
          i8 = i7 + 1;
          i7 = i2;
          i5 = i3;
          i3 = i4;
          i2 = i1;
          i4 = i7;
          i1 = i5;
          i7 = i8;
          break;
          ((View)localObject2).measure(i9, i9);
          i5 = i3;
          break label316;
          int i11;
          boolean bool;
          int i12;
          if (localqe.g())
          {
            i11 = localqe.getGroupId();
            bool = ((SparseBooleanArray)localObject1).get(i11);
            if (((i1 > 0) || (bool)) && (i4 > 0) && ((!this.r) || (i3 > 0)))
            {
              i12 = 1;
              if (i12 == 0) {
                break label868;
              }
              localObject2 = a(localqe, this.v, localViewGroup);
              if (this.v == null) {
                this.v = ((View)localObject2);
              }
              if (!this.r) {
                break label686;
              }
              i5 = ActionMenuView.a((View)localObject2, i6, i3, i9, 0);
              if (i5 != 0) {
                break label865;
              }
              i12 = 0;
              i3 -= i5;
              i5 = ((View)localObject2).getMeasuredWidth();
              i8 = i4 - i5;
              i4 = i2;
              if (i2 == 0) {
                i4 = i5;
              }
              if (!this.r) {
                break label704;
              }
              if (i8 < 0) {
                break label698;
              }
              i2 = 1;
              i12 &= i2;
              i5 = i4;
              i2 = i3;
              i4 = i8;
              i3 = i5;
            }
          }
          for (;;)
          {
            if ((i12 != 0) && (i11 != 0)) {
              ((SparseBooleanArray)localObject1).put(i11, true);
            }
            for (;;)
            {
              i5 = i1;
              if (i12 != 0) {
                i5 = i1 - 1;
              }
              localqe.d(i12);
              i1 = i3;
              i3 = i5;
              i5 = i2;
              i2 = i4;
              i4 = i5;
              break;
              int i13 = 0;
              break label486;
              ((View)localObject2).measure(i9, i9);
              break label553;
              i2 = 0;
              break label595;
              if (i8 + i4 > 0) {}
              for (i2 = 1;; i2 = 0)
              {
                i13 &= i2;
                i2 = i3;
                i3 = i4;
                i4 = i8;
                break;
              }
              if (bool)
              {
                ((SparseBooleanArray)localObject1).put(i11, false);
                i8 = 0;
                for (;;)
                {
                  if (i8 < i7)
                  {
                    localObject2 = (qe)localArrayList.get(i8);
                    i5 = i1;
                    if (((qe)localObject2).getGroupId() == i11)
                    {
                      i5 = i1;
                      if (((qe)localObject2).f()) {
                        i5 = i1 + 1;
                      }
                      ((qe)localObject2).d(false);
                    }
                    i8++;
                    i1 = i5;
                    continue;
                    localqe.d(false);
                    i5 = i2;
                    i2 = i4;
                    i8 = i1;
                    i4 = i3;
                    i1 = i5;
                    i3 = i8;
                    break;
                    return true;
                  }
                }
              }
            }
            break label546;
            i5 = i2;
            i2 = i3;
            i3 = i5;
          }
        }
      }
    }
  }
  
  public final boolean a(ViewGroup paramViewGroup, int paramInt)
  {
    if (paramViewGroup.getChildAt(paramInt) == this.f) {}
    for (boolean bool = false;; bool = super.a(paramViewGroup, paramInt)) {
      return bool;
    }
  }
  
  public final boolean a(qe paramqe)
  {
    return paramqe.f();
  }
  
  public final boolean a(qu paramqu)
  {
    boolean bool;
    if (!paramqu.hasVisibleItems()) {
      bool = false;
    }
    for (;;)
    {
      return bool;
      for (Object localObject1 = paramqu; ((qu)localObject1).k != this.c; localObject1 = (qu)((qu)localObject1).k) {}
      Object localObject2 = ((qu)localObject1).getItem();
      ViewGroup localViewGroup = (ViewGroup)this.e;
      int i1;
      if (localViewGroup != null)
      {
        int i2 = localViewGroup.getChildCount();
        i1 = 0;
        label66:
        if (i1 < i2)
        {
          localObject1 = localViewGroup.getChildAt(i1);
          if ((!(localObject1 instanceof qs)) || (((qs)localObject1).a() != localObject2)) {}
        }
      }
      for (;;)
      {
        localObject2 = localObject1;
        if (localObject1 != null) {
          break label136;
        }
        if (this.f != null) {
          break label131;
        }
        bool = false;
        break;
        i1++;
        break label66;
        localObject1 = null;
      }
      label131:
      localObject2 = this.f;
      label136:
      paramqu.getItem().getItemId();
      this.k = new vv(this, this.b, paramqu);
      this.k.b = ((View)localObject2);
      this.k.b();
      super.a(paramqu);
      bool = true;
    }
  }
  
  public final void b(boolean paramBoolean)
  {
    int i2 = 1;
    int i3 = 0;
    ((View)this.e).getParent();
    super.b(paramBoolean);
    ((View)this.e).requestLayout();
    Object localObject;
    int i1;
    if (this.c != null)
    {
      localObject = this.c;
      ((qa)localObject).i();
      ArrayList localArrayList = ((qa)localObject).d;
      int i4 = localArrayList.size();
      for (i1 = 0; i1 < i4; i1++)
      {
        localObject = ((qe)localArrayList.get(i1)).d;
        if (localObject != null) {
          ((fb)localObject).b = this;
        }
      }
    }
    if (this.c != null)
    {
      localObject = this.c.j();
      i1 = i3;
      if (this.n)
      {
        i1 = i3;
        if (localObject != null)
        {
          i1 = ((ArrayList)localObject).size();
          if (i1 != 1) {
            break label265;
          }
          if (((qe)((ArrayList)localObject).get(0)).isActionViewExpanded()) {
            break label259;
          }
          i1 = 1;
        }
      }
      label160:
      if (i1 == 0) {
        break label283;
      }
      if (this.f == null) {
        this.f = new vy(this, this.a);
      }
      localObject = (ViewGroup)this.f.getParent();
      if (localObject != this.e)
      {
        if (localObject != null) {
          ((ViewGroup)localObject).removeView(this.f);
        }
        localObject = (ActionMenuView)this.e;
        ((ActionMenuView)localObject).addView(this.f, ((ActionMenuView)localObject).a());
      }
    }
    for (;;)
    {
      ((ActionMenuView)this.e).b = this.n;
      return;
      localObject = null;
      break;
      label259:
      i1 = 0;
      break label160;
      label265:
      if (i1 > 0) {}
      for (i1 = i2;; i1 = 0) {
        break;
      }
      label283:
      if ((this.f != null) && (this.f.getParent() == this.e)) {
        ((ViewGroup)this.e).removeView(this.f);
      }
    }
  }
  
  public final boolean b()
  {
    boolean bool = true;
    if ((this.n) && (!f()) && (this.c != null) && (this.e != null) && (this.l == null) && (!this.c.j().isEmpty()))
    {
      this.l = new vx(this, new wa(this, this.b, this.c, this.f, true));
      ((View)this.e).post(this.l);
      super.a(null);
    }
    for (;;)
    {
      return bool;
      bool = false;
    }
  }
  
  public final void c(boolean paramBoolean)
  {
    this.n = true;
    this.o = true;
  }
  
  public final boolean c()
  {
    boolean bool;
    if ((this.l != null) && (this.e != null))
    {
      ((View)this.e).removeCallbacks(this.l);
      this.l = null;
      bool = true;
    }
    for (;;)
    {
      return bool;
      wa localwa = this.j;
      if (localwa != null)
      {
        localwa.d();
        bool = true;
      }
      else
      {
        bool = false;
      }
    }
  }
  
  public final boolean d()
  {
    return c() | e();
  }
  
  public final boolean e()
  {
    if (this.k != null) {
      this.k.d();
    }
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public final boolean f()
  {
    if ((this.j != null) && (this.j.e())) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\vu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */