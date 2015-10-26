import android.support.v7.widget.RecyclerView;
import android.view.View;
import java.util.ArrayList;

public final class yy
  implements wi
{
  public yy(RecyclerView paramRecyclerView) {}
  
  private void c(wj paramwj)
  {
    switch (paramwj.a)
    {
    }
    for (;;)
    {
      return;
      RecyclerView.d(this.a).a();
      continue;
      RecyclerView.d(this.a).c();
      continue;
      RecyclerView.d(this.a).d();
      continue;
      RecyclerView.d(this.a).e();
    }
  }
  
  public final zr a(int paramInt)
  {
    Object localObject = null;
    RecyclerView localRecyclerView = this.a;
    int j = localRecyclerView.c.b();
    int i = 0;
    zr localzr;
    if (i < j)
    {
      localzr = RecyclerView.b(localRecyclerView.c.c(i));
      if ((localzr != null) && (!localzr.n()) && (localzr.b == paramInt)) {
        label61:
        if (localzr != null) {
          break label78;
        }
      }
    }
    for (;;)
    {
      return (zr)localObject;
      i++;
      break;
      localzr = null;
      break label61;
      label78:
      if (!this.a.c.a(localzr.a)) {
        localObject = localzr;
      }
    }
  }
  
  public final void a(int paramInt1, int paramInt2)
  {
    this.a.a(paramInt1, paramInt2, true);
    this.a.q = true;
    zp localzp = this.a.n;
    localzp.h += paramInt2;
  }
  
  public final void a(wj paramwj)
  {
    c(paramwj);
  }
  
  public final void b(int paramInt1, int paramInt2)
  {
    this.a.a(paramInt1, paramInt2, false);
    this.a.q = true;
  }
  
  public final void b(wj paramwj)
  {
    c(paramwj);
  }
  
  public final void c(int paramInt1, int paramInt2)
  {
    Object localObject2 = this.a;
    int j = ((RecyclerView)localObject2).c.b();
    for (int i = 0; i < j; i++)
    {
      localObject1 = ((RecyclerView)localObject2).c.c(i);
      zr localzr = RecyclerView.b((View)localObject1);
      if ((localzr != null) && (!localzr.b()) && (localzr.b >= paramInt1) && (localzr.b < paramInt1 + paramInt2))
      {
        localzr.a(2);
        if (((RecyclerView)localObject2).g()) {
          localzr.a(64);
        }
        ((zi)((View)localObject1).getLayoutParams()).e = true;
      }
    }
    Object localObject1 = ((RecyclerView)localObject2).a;
    for (i = ((zl)localObject1).c.size() - 1; i >= 0; i--)
    {
      localObject2 = (zr)((zl)localObject1).c.get(i);
      if (localObject2 != null)
      {
        j = ((zr)localObject2).d();
        if ((j >= paramInt1) && (j < paramInt1 + paramInt2))
        {
          ((zr)localObject2).a(2);
          ((zl)localObject1).b(i);
        }
      }
    }
    this.a.r = true;
  }
  
  public final void d(int paramInt1, int paramInt2)
  {
    RecyclerView localRecyclerView = this.a;
    int j = localRecyclerView.c.b();
    zr localzr;
    for (int i = 0; i < j; i++)
    {
      localzr = RecyclerView.b(localRecyclerView.c.c(i));
      if ((localzr != null) && (!localzr.b()) && (localzr.b >= paramInt1))
      {
        localzr.a(paramInt2, false);
        localRecyclerView.n.i = true;
      }
    }
    zl localzl = localRecyclerView.a;
    j = localzl.c.size();
    for (i = 0; i < j; i++)
    {
      localzr = (zr)localzl.c.get(i);
      if ((localzr != null) && (localzr.d() >= paramInt1)) {
        localzr.a(paramInt2, true);
      }
    }
    localRecyclerView.requestLayout();
    this.a.q = true;
  }
  
  public final void e(int paramInt1, int paramInt2)
  {
    int n = -1;
    RecyclerView localRecyclerView = this.a;
    int i1 = localRecyclerView.c.b();
    int j;
    int i;
    int k;
    int m;
    label34:
    zr localzr;
    if (paramInt1 < paramInt2)
    {
      j = -1;
      i = paramInt2;
      k = paramInt1;
      m = 0;
      if (m >= i1) {
        break label135;
      }
      localzr = RecyclerView.b(localRecyclerView.c.c(m));
      if ((localzr != null) && (localzr.b >= k) && (localzr.b <= i))
      {
        if (localzr.b != paramInt1) {
          break label124;
        }
        localzr.a(paramInt2 - paramInt1, false);
      }
    }
    for (;;)
    {
      localRecyclerView.n.i = true;
      m++;
      break label34;
      j = 1;
      i = paramInt1;
      k = paramInt2;
      break;
      label124:
      localzr.a(j, false);
    }
    label135:
    zl localzl = localRecyclerView.a;
    if (paramInt1 < paramInt2)
    {
      j = paramInt2;
      k = paramInt1;
      i = n;
      n = localzl.c.size();
      m = 0;
      label169:
      if (m >= n) {
        break label263;
      }
      localzr = (zr)localzl.c.get(m);
      if ((localzr != null) && (localzr.b >= k) && (localzr.b <= j))
      {
        if (localzr.b != paramInt1) {
          break label252;
        }
        localzr.a(paramInt2 - paramInt1, false);
      }
    }
    for (;;)
    {
      m++;
      break label169;
      i = 1;
      j = paramInt1;
      k = paramInt2;
      break;
      label252:
      localzr.a(i, false);
    }
    label263:
    localRecyclerView.requestLayout();
    this.a.q = true;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\yy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */