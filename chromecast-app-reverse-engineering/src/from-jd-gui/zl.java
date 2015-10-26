import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.accessibility.AccessibilityManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class zl
{
  public final ArrayList a = new ArrayList();
  public ArrayList b = null;
  public final ArrayList c = new ArrayList();
  final List d = Collections.unmodifiableList(this.a);
  private int f = 2;
  private zk g;
  
  public zl(RecyclerView paramRecyclerView) {}
  
  private zr a(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    int i = 0;
    int j = this.a.size();
    paramInt2 = 0;
    Object localObject1;
    if (paramInt2 < j)
    {
      localObject1 = (zr)this.a.get(paramInt2);
      if ((!((zr)localObject1).g()) && (((zr)localObject1).d() == paramInt1) && (!((zr)localObject1).j()) && ((this.e.n.j) || (!((zr)localObject1).n()))) {
        ((zr)localObject1).a(32);
      }
    }
    for (;;)
    {
      return (zr)localObject1;
      paramInt2++;
      break;
      Object localObject2;
      if (!paramBoolean)
      {
        localObject2 = this.e.c;
        j = ((xb)localObject2).c.size();
        paramInt2 = 0;
        label122:
        if (paramInt2 >= j) {
          break label277;
        }
        localObject1 = (View)((xb)localObject2).c.get(paramInt2);
        zr localzr = ((xb)localObject2).a.b((View)localObject1);
        if ((localzr.d() != paramInt1) || (localzr.j())) {
          break label271;
        }
        label175:
        if (localObject1 != null) {
          this.e.m.c(this.e.a((View)localObject1));
        }
      }
      j = this.c.size();
      for (paramInt2 = i;; paramInt2++)
      {
        if (paramInt2 >= j) {
          break label289;
        }
        localObject2 = (zr)this.c.get(paramInt2);
        if ((!((zr)localObject2).j()) && (((zr)localObject2).d() == paramInt1))
        {
          localObject1 = localObject2;
          if (paramBoolean) {
            break;
          }
          this.c.remove(paramInt2);
          localObject1 = localObject2;
          break;
          label271:
          paramInt2++;
          break label122;
          label277:
          localObject1 = null;
          break label175;
        }
      }
      label289:
      localObject1 = null;
    }
  }
  
  private void a(ViewGroup paramViewGroup, boolean paramBoolean)
  {
    for (int i = paramViewGroup.getChildCount() - 1; i >= 0; i--)
    {
      View localView = paramViewGroup.getChildAt(i);
      if ((localView instanceof ViewGroup)) {
        a((ViewGroup)localView, true);
      }
    }
    if (!paramBoolean) {}
    for (;;)
    {
      return;
      if (paramViewGroup.getVisibility() == 4)
      {
        paramViewGroup.setVisibility(0);
        paramViewGroup.setVisibility(4);
      }
      else
      {
        i = paramViewGroup.getVisibility();
        paramViewGroup.setVisibility(4);
        paramViewGroup.setVisibility(i);
      }
    }
  }
  
  private zr c(int paramInt)
  {
    int j;
    zr localzr;
    if (this.b != null)
    {
      j = this.b.size();
      if (j != 0) {}
    }
    else
    {
      localzr = null;
    }
    for (;;)
    {
      return localzr;
      for (int i = 0;; i++)
      {
        if (i >= j) {
          break label75;
        }
        localzr = (zr)this.b.get(i);
        if ((!localzr.g()) && (localzr.d() == paramInt))
        {
          localzr.a(32);
          break;
        }
      }
      label75:
      RecyclerView.f(this.e);
      localzr = null;
    }
  }
  
  private void c(zr paramzr)
  {
    gt.a(paramzr.a, null);
    if (RecyclerView.s(this.e) != null) {
      RecyclerView.s(this.e);
    }
    if (RecyclerView.f(this.e) != null) {
      RecyclerView.f(this.e);
    }
    if (this.e.n != null) {
      this.e.n.a(paramzr);
    }
    zk localzk = c();
    int i = paramzr.e;
    ArrayList localArrayList2 = (ArrayList)localzk.a.get(i);
    ArrayList localArrayList1 = localArrayList2;
    if (localArrayList2 == null)
    {
      localArrayList2 = new ArrayList();
      localzk.a.put(i, localArrayList2);
      localArrayList1 = localArrayList2;
      if (localzk.b.indexOfKey(i) < 0)
      {
        localzk.b.put(i, 5);
        localArrayList1 = localArrayList2;
      }
    }
    if (localzk.b.get(i) > localArrayList1.size())
    {
      paramzr.p();
      localArrayList1.add(paramzr);
    }
  }
  
  public final int a(int paramInt)
  {
    if ((paramInt < 0) || (paramInt >= this.e.n.a())) {
      throw new IndexOutOfBoundsException("invalid position " + paramInt + ". State item count is " + this.e.n.a());
    }
    if (!this.e.n.j) {}
    for (;;)
    {
      return paramInt;
      paramInt = this.e.b.a(paramInt);
    }
  }
  
  final View a(int paramInt, boolean paramBoolean)
  {
    Object localObject4 = null;
    paramBoolean = true;
    if ((paramInt < 0) || (paramInt >= this.e.n.a())) {
      throw new IndexOutOfBoundsException("Invalid item position " + paramInt + "(" + paramInt + "). Item count:" + this.e.n.a());
    }
    Object localObject2;
    int i;
    if (this.e.n.j)
    {
      localObject2 = c(paramInt);
      if (localObject2 != null) {
        i = 1;
      }
    }
    for (;;)
    {
      Object localObject1 = localObject2;
      int j;
      if (localObject2 == null)
      {
        localObject2 = a(paramInt, -1, false);
        localObject1 = localObject2;
        if (localObject2 != null) {
          if (!((zr)localObject2).n())
          {
            if ((((zr)localObject2).b < 0) || (((zr)localObject2).b >= RecyclerView.f(this.e).a()))
            {
              throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + localObject2);
              i = 0;
              continue;
            }
            if ((!this.e.n.j) && (RecyclerView.f(this.e).a(((zr)localObject2).b) != ((zr)localObject2).e))
            {
              j = 0;
              if (j != 0) {
                break label399;
              }
              ((zr)localObject2).a(4);
              if (!((zr)localObject2).e()) {
                break label383;
              }
              this.e.removeDetachedView(((zr)localObject2).a, false);
              ((zr)localObject2).f();
              label268:
              a((zr)localObject2);
              localObject1 = null;
            }
          }
        }
      }
      for (;;)
      {
        Object localObject3 = localObject1;
        if (localObject1 == null)
        {
          j = this.e.b.a(paramInt);
          if ((j < 0) || (j >= RecyclerView.f(this.e).a()))
          {
            throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + paramInt + "(offset:" + j + ").state:" + this.e.n.a());
            RecyclerView.f(this.e);
            j = 1;
            break;
            label383:
            if (!((zr)localObject2).g()) {
              break label268;
            }
            ((zr)localObject2).h();
            break label268;
            label399:
            i = 1;
            localObject1 = localObject2;
            continue;
          }
          int k = RecyclerView.f(this.e).a(j);
          RecyclerView.f(this.e);
          localObject2 = localObject1;
          if (localObject1 == null)
          {
            localObject2 = (ArrayList)c().a.get(k);
            localObject1 = localObject4;
            if (localObject2 != null)
            {
              localObject1 = localObject4;
              if (!((ArrayList)localObject2).isEmpty())
              {
                j = ((ArrayList)localObject2).size() - 1;
                localObject1 = (zr)((ArrayList)localObject2).get(j);
                ((ArrayList)localObject2).remove(j);
              }
            }
            if (localObject1 != null)
            {
              ((zr)localObject1).p();
              if ((RecyclerView.j()) && ((((zr)localObject1).a instanceof ViewGroup))) {
                a((ViewGroup)((zr)localObject1).a, false);
              }
            }
            localObject2 = localObject1;
          }
          localObject3 = localObject2;
          if (localObject2 == null)
          {
            localObject1 = RecyclerView.f(this.e);
            localObject2 = this.e;
            a.a("RV CreateView");
            localObject2 = ((yz)localObject1).a((ViewGroup)localObject2, k);
            ((zr)localObject2).e = k;
            a.b();
          }
        }
        for (;;)
        {
          if ((this.e.n.j) && (((zr)localObject2).m()))
          {
            ((zr)localObject2).f = paramInt;
            paramInt = 0;
          }
          for (;;)
          {
            localObject1 = ((zr)localObject2).a.getLayoutParams();
            if (localObject1 == null)
            {
              localObject1 = (zi)this.e.generateDefaultLayoutParams();
              ((zr)localObject2).a.setLayoutParams((ViewGroup.LayoutParams)localObject1);
              label651:
              ((zi)localObject1).c = ((zr)localObject2);
              if ((i == 0) || (paramInt == 0)) {
                break label857;
              }
            }
            for (;;)
            {
              ((zi)localObject1).f = paramBoolean;
              return ((zr)localObject2).a;
              if ((((zr)localObject2).m()) && (!((zr)localObject2).k()) && (!((zr)localObject2).j())) {
                break label862;
              }
              j = this.e.b.a(paramInt);
              RecyclerView.f(this.e).b((zr)localObject2, j);
              localObject1 = ((zr)localObject2).a;
              if ((RecyclerView.q(this.e) != null) && (RecyclerView.q(this.e).isEnabled()))
              {
                if (gt.e((View)localObject1) == 0) {
                  gt.c((View)localObject1, 1);
                }
                if (!gt.b((View)localObject1)) {
                  gt.a((View)localObject1, RecyclerView.r(this.e).c);
                }
              }
              if (this.e.n.j) {
                ((zr)localObject2).f = paramInt;
              }
              paramInt = 1;
              break;
              if (!this.e.checkLayoutParams((ViewGroup.LayoutParams)localObject1))
              {
                localObject1 = (zi)this.e.generateLayoutParams((ViewGroup.LayoutParams)localObject1);
                ((zr)localObject2).a.setLayoutParams((ViewGroup.LayoutParams)localObject1);
                break label651;
              }
              localObject1 = (zi)localObject1;
              break label651;
              label857:
              paramBoolean = false;
            }
            label862:
            paramInt = 0;
          }
          localObject2 = localObject3;
        }
      }
      localObject2 = null;
      i = 0;
    }
  }
  
  public final void a()
  {
    this.a.clear();
    b();
  }
  
  public final void a(View paramView)
  {
    zr localzr = RecyclerView.b(paramView);
    if (localzr.o()) {
      this.e.removeDetachedView(paramView, false);
    }
    if (localzr.e()) {
      localzr.f();
    }
    for (;;)
    {
      a(localzr);
      return;
      if (localzr.g()) {
        localzr.h();
      }
    }
  }
  
  public final void a(zr paramzr)
  {
    boolean bool = true;
    int k = 0;
    if ((paramzr.e()) || (paramzr.a.getParent() != null))
    {
      StringBuilder localStringBuilder = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:").append(paramzr.e()).append(" isAttached:");
      if (paramzr.a.getParent() != null) {}
      for (;;)
      {
        throw new IllegalArgumentException(bool);
        bool = false;
      }
    }
    if (paramzr.o()) {
      throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + paramzr);
    }
    if (paramzr.b()) {
      throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.");
    }
    int i;
    if (((paramzr.i & 0x10) == 0) && (gt.c(paramzr.a)))
    {
      i = 1;
      if ((RecyclerView.f(this.e) != null) && (i != 0)) {
        RecyclerView.f(this.e);
      }
      if (paramzr.q()) {
        if ((paramzr.i & 0x4E) == 0) {
          break label279;
        }
      }
    }
    label279:
    for (int j = 1;; j = 0)
    {
      i = k;
      if (j == 0)
      {
        j = this.c.size();
        if ((j == this.f) && (j > 0)) {
          b(0);
        }
        i = k;
        if (j < this.f)
        {
          this.c.add(paramzr);
          i = 1;
        }
      }
      if (i == 0) {
        c(paramzr);
      }
      this.e.n.a(paramzr);
      return;
      i = 0;
      break;
    }
  }
  
  public final void b()
  {
    for (int i = this.c.size() - 1; i >= 0; i--) {
      b(i);
    }
    this.c.clear();
  }
  
  public final void b(int paramInt)
  {
    c((zr)this.c.get(paramInt));
    this.c.remove(paramInt);
  }
  
  final void b(View paramView)
  {
    paramView = RecyclerView.b(paramView);
    paramView.j = null;
    paramView.h();
    a(paramView);
  }
  
  public final void b(zr paramzr)
  {
    if ((!paramzr.l()) || (!RecyclerView.h(this.e)) || (this.b == null)) {
      this.a.remove(paramzr);
    }
    for (;;)
    {
      paramzr.j = null;
      paramzr.h();
      return;
      this.b.remove(paramzr);
    }
  }
  
  public final zk c()
  {
    if (this.g == null) {
      this.g = new zk();
    }
    return this.g;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\zl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */