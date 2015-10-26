import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class xe
  extends zc
{
  ArrayList a = new ArrayList();
  ArrayList b = new ArrayList();
  ArrayList c = new ArrayList();
  ArrayList d = new ArrayList();
  ArrayList e = new ArrayList();
  ArrayList f = new ArrayList();
  ArrayList g = new ArrayList();
  private ArrayList n = new ArrayList();
  private ArrayList o = new ArrayList();
  private ArrayList p = new ArrayList();
  private ArrayList q = new ArrayList();
  
  private static void a(List paramList)
  {
    for (int i = paramList.size() - 1; i >= 0; i--) {
      gt.o(((zr)paramList.get(i)).a).a();
    }
  }
  
  private void a(List paramList, zr paramzr)
  {
    for (int i = paramList.size() - 1; i >= 0; i--)
    {
      xn localxn = (xn)paramList.get(i);
      if ((a(localxn, paramzr)) && (localxn.a == null) && (localxn.b == null)) {
        paramList.remove(localxn);
      }
    }
  }
  
  private void a(xn paramxn)
  {
    if (paramxn.a != null) {
      a(paramxn, paramxn.a);
    }
    if (paramxn.b != null) {
      a(paramxn, paramxn.b);
    }
  }
  
  private boolean a(xn paramxn, zr paramzr)
  {
    boolean bool2 = false;
    boolean bool1 = false;
    if (paramxn.b == paramzr) {
      paramxn.b = null;
    }
    for (;;)
    {
      gt.c(paramzr.a, 1.0F);
      gt.a(paramzr.a, 0.0F);
      gt.b(paramzr.a, 0.0F);
      a(paramzr, bool1);
      bool1 = true;
      do
      {
        return bool1;
        bool1 = bool2;
      } while (paramxn.a != paramzr);
      paramxn.a = null;
      bool1 = true;
    }
  }
  
  public final void a()
  {
    int i;
    int j;
    label26:
    int k;
    label39:
    int m;
    if (!this.n.isEmpty())
    {
      i = 1;
      if (this.p.isEmpty()) {
        break label79;
      }
      j = 1;
      if (this.q.isEmpty()) {
        break label85;
      }
      k = 1;
      if (this.o.isEmpty()) {
        break label91;
      }
      m = 1;
      label52:
      if ((i != 0) || (j != 0) || (m != 0) || (k != 0)) {
        break label97;
      }
    }
    for (;;)
    {
      return;
      i = 0;
      break;
      label79:
      j = 0;
      break label26;
      label85:
      k = 0;
      break label39;
      label91:
      m = 0;
      break label52;
      label97:
      Iterator localIterator = this.n.iterator();
      Object localObject2;
      Object localObject1;
      while (localIterator.hasNext())
      {
        localObject2 = (zr)localIterator.next();
        localObject1 = gt.o(((zr)localObject2).a);
        this.f.add(localObject2);
        ((ih)localObject1).a(this.j).a(0.0F).a(new xi(this, (zr)localObject2, (ih)localObject1)).b();
      }
      this.n.clear();
      label254:
      label329:
      long l1;
      label403:
      long l2;
      if (j != 0)
      {
        localObject1 = new ArrayList();
        ((ArrayList)localObject1).addAll(this.p);
        this.b.add(localObject1);
        this.p.clear();
        localObject2 = new xf(this, (ArrayList)localObject1);
        if (i != 0) {
          gt.a(((xo)((ArrayList)localObject1).get(0)).a.a, (Runnable)localObject2, this.j);
        }
      }
      else
      {
        if (k != 0)
        {
          localObject2 = new ArrayList();
          ((ArrayList)localObject2).addAll(this.q);
          this.c.add(localObject2);
          this.q.clear();
          localObject1 = new xg(this, (ArrayList)localObject2);
          if (i == 0) {
            break label466;
          }
          gt.a(((xn)((ArrayList)localObject2).get(0)).a.a, (Runnable)localObject1, this.j);
        }
        if (m == 0) {
          break label473;
        }
        localObject1 = new ArrayList();
        ((ArrayList)localObject1).addAll(this.o);
        this.a.add(localObject1);
        this.o.clear();
        localObject2 = new xh(this, (ArrayList)localObject1);
        if ((i == 0) && (j == 0) && (k == 0)) {
          break label493;
        }
        if (i == 0) {
          break label475;
        }
        l1 = this.j;
        if (j == 0) {
          break label481;
        }
        l2 = this.k;
        label414:
        if (k == 0) {
          break label487;
        }
      }
      label466:
      label473:
      label475:
      label481:
      label487:
      for (long l3 = this.l;; l3 = 0L)
      {
        l2 = Math.max(l2, l3);
        gt.a(((zr)((ArrayList)localObject1).get(0)).a, (Runnable)localObject2, l1 + l2);
        break;
        ((Runnable)localObject2).run();
        break label254;
        ((Runnable)localObject1).run();
        break label329;
        break;
        l1 = 0L;
        break label403;
        l2 = 0L;
        break label414;
      }
      label493:
      ((Runnable)localObject2).run();
    }
  }
  
  public final boolean a(zr paramzr)
  {
    c(paramzr);
    this.n.add(paramzr);
    return true;
  }
  
  public final boolean a(zr paramzr, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    View localView = paramzr.a;
    paramInt1 = (int)(paramInt1 + gt.k(paramzr.a));
    int j = (int)(paramInt2 + gt.l(paramzr.a));
    c(paramzr);
    int i = paramInt3 - paramInt1;
    paramInt2 = paramInt4 - j;
    if ((i == 0) && (paramInt2 == 0)) {
      e(paramzr);
    }
    for (boolean bool = false;; bool = true)
    {
      return bool;
      if (i != 0) {
        gt.a(localView, -i);
      }
      if (paramInt2 != 0) {
        gt.b(localView, -paramInt2);
      }
      this.p.add(new xo(paramzr, paramInt1, j, paramInt3, paramInt4));
    }
  }
  
  public final boolean a(zr paramzr1, zr paramzr2, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    float f3 = gt.k(paramzr1.a);
    float f1 = gt.l(paramzr1.a);
    float f2 = gt.f(paramzr1.a);
    c(paramzr1);
    int i = (int)(paramInt3 - paramInt1 - f3);
    int j = (int)(paramInt4 - paramInt2 - f1);
    gt.a(paramzr1.a, f3);
    gt.b(paramzr1.a, f1);
    gt.c(paramzr1.a, f2);
    if ((paramzr2 != null) && (paramzr2.a != null))
    {
      c(paramzr2);
      gt.a(paramzr2.a, -i);
      gt.b(paramzr2.a, -j);
      gt.c(paramzr2.a, 0.0F);
    }
    this.q.add(new xn(paramzr1, paramzr2, paramInt1, paramInt2, paramInt3, paramInt4));
    return true;
  }
  
  public final boolean b()
  {
    if ((!this.o.isEmpty()) || (!this.q.isEmpty()) || (!this.p.isEmpty()) || (!this.n.isEmpty()) || (!this.e.isEmpty()) || (!this.f.isEmpty()) || (!this.d.isEmpty()) || (!this.g.isEmpty()) || (!this.b.isEmpty()) || (!this.a.isEmpty()) || (!this.c.isEmpty())) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public final boolean b(zr paramzr)
  {
    c(paramzr);
    gt.c(paramzr.a, 0.0F);
    this.o.add(paramzr);
    return true;
  }
  
  void c()
  {
    if (!b()) {
      e();
    }
  }
  
  public final void c(zr paramzr)
  {
    View localView = paramzr.a;
    gt.o(localView).a();
    for (int i = this.p.size() - 1; i >= 0; i--) {
      if (((xo)this.p.get(i)).a == paramzr)
      {
        gt.b(localView, 0.0F);
        gt.a(localView, 0.0F);
        e(paramzr);
        this.p.remove(i);
      }
    }
    a(this.q, paramzr);
    if (this.n.remove(paramzr))
    {
      gt.c(localView, 1.0F);
      d(paramzr);
    }
    if (this.o.remove(paramzr))
    {
      gt.c(localView, 1.0F);
      f(paramzr);
    }
    ArrayList localArrayList;
    for (i = this.c.size() - 1; i >= 0; i--)
    {
      localArrayList = (ArrayList)this.c.get(i);
      a(localArrayList, paramzr);
      if (localArrayList.isEmpty()) {
        this.c.remove(i);
      }
    }
    i = this.b.size() - 1;
    if (i >= 0)
    {
      localArrayList = (ArrayList)this.b.get(i);
      for (int j = localArrayList.size() - 1;; j--)
      {
        if (j >= 0)
        {
          if (((xo)localArrayList.get(j)).a != paramzr) {
            continue;
          }
          gt.b(localView, 0.0F);
          gt.a(localView, 0.0F);
          e(paramzr);
          localArrayList.remove(j);
          if (localArrayList.isEmpty()) {
            this.b.remove(i);
          }
        }
        i--;
        break;
      }
    }
    for (i = this.a.size() - 1; i >= 0; i--)
    {
      localArrayList = (ArrayList)this.a.get(i);
      if (localArrayList.remove(paramzr))
      {
        gt.c(localView, 1.0F);
        f(paramzr);
        if (localArrayList.isEmpty()) {
          this.a.remove(i);
        }
      }
    }
    this.f.remove(paramzr);
    this.d.remove(paramzr);
    this.g.remove(paramzr);
    this.e.remove(paramzr);
    c();
  }
  
  public final void d()
  {
    Object localObject1;
    Object localObject2;
    for (int i = this.p.size() - 1; i >= 0; i--)
    {
      localObject1 = (xo)this.p.get(i);
      localObject2 = ((xo)localObject1).a.a;
      gt.b((View)localObject2, 0.0F);
      gt.a((View)localObject2, 0.0F);
      e(((xo)localObject1).a);
      this.p.remove(i);
    }
    for (i = this.n.size() - 1; i >= 0; i--)
    {
      d((zr)this.n.get(i));
      this.n.remove(i);
    }
    for (i = this.o.size() - 1; i >= 0; i--)
    {
      localObject1 = (zr)this.o.get(i);
      gt.c(((zr)localObject1).a, 1.0F);
      f((zr)localObject1);
      this.o.remove(i);
    }
    for (i = this.q.size() - 1; i >= 0; i--) {
      a((xn)this.q.get(i));
    }
    this.q.clear();
    if (!b()) {}
    for (;;)
    {
      return;
      int j;
      for (i = this.b.size() - 1; i >= 0; i--)
      {
        localObject2 = (ArrayList)this.b.get(i);
        for (j = ((ArrayList)localObject2).size() - 1; j >= 0; j--)
        {
          localObject1 = (xo)((ArrayList)localObject2).get(j);
          View localView = ((xo)localObject1).a.a;
          gt.b(localView, 0.0F);
          gt.a(localView, 0.0F);
          e(((xo)localObject1).a);
          ((ArrayList)localObject2).remove(j);
          if (((ArrayList)localObject2).isEmpty()) {
            this.b.remove(localObject2);
          }
        }
      }
      for (i = this.a.size() - 1; i >= 0; i--)
      {
        localObject1 = (ArrayList)this.a.get(i);
        for (j = ((ArrayList)localObject1).size() - 1; j >= 0; j--)
        {
          localObject2 = (zr)((ArrayList)localObject1).get(j);
          gt.c(((zr)localObject2).a, 1.0F);
          f((zr)localObject2);
          ((ArrayList)localObject1).remove(j);
          if (((ArrayList)localObject1).isEmpty()) {
            this.a.remove(localObject1);
          }
        }
      }
      for (i = this.c.size() - 1; i >= 0; i--)
      {
        localObject1 = (ArrayList)this.c.get(i);
        for (j = ((ArrayList)localObject1).size() - 1; j >= 0; j--)
        {
          a((xn)((ArrayList)localObject1).get(j));
          if (((ArrayList)localObject1).isEmpty()) {
            this.c.remove(localObject1);
          }
        }
      }
      a(this.f);
      a(this.e);
      a(this.d);
      a(this.g);
      e();
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\xe.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */