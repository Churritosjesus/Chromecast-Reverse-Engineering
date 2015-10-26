import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;

public final class zm
  extends zb
{
  public zm(RecyclerView paramRecyclerView) {}
  
  private void b()
  {
    if ((RecyclerView.m(this.a)) && (RecyclerView.n(this.a)) && (RecyclerView.o(this.a))) {
      gt.a(this.a, RecyclerView.p(this.a));
    }
    for (;;)
    {
      return;
      RecyclerView.b(this.a, true);
      this.a.requestLayout();
    }
  }
  
  public final void a()
  {
    this.a.a(null);
    RecyclerView.f(this.a);
    this.a.n.i = true;
    RecyclerView.l(this.a);
    if (!this.a.b.d()) {
      this.a.requestLayout();
    }
  }
  
  public final void a(int paramInt1, int paramInt2)
  {
    int i = 1;
    this.a.a(null);
    wh localwh = this.a.b;
    localwh.a.add(localwh.a(2, paramInt1, paramInt2));
    if (localwh.a.size() == 1) {}
    for (paramInt1 = i;; paramInt1 = 0)
    {
      if (paramInt1 != 0) {
        b();
      }
      return;
    }
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3)
  {
    paramInt3 = 1;
    this.a.a(null);
    wh localwh = this.a.b;
    if (paramInt1 != paramInt2)
    {
      localwh.a.add(localwh.a(3, paramInt1, paramInt2));
      if (localwh.a.size() != 1) {}
    }
    for (paramInt1 = paramInt3;; paramInt1 = 0)
    {
      if (paramInt1 != 0) {
        b();
      }
      return;
    }
  }
  
  public final void b(int paramInt1, int paramInt2)
  {
    int i = 1;
    this.a.a(null);
    wh localwh = this.a.b;
    localwh.a.add(localwh.a(0, paramInt1, paramInt2));
    if (localwh.a.size() == 1) {}
    for (paramInt1 = i;; paramInt1 = 0)
    {
      if (paramInt1 != 0) {
        b();
      }
      return;
    }
  }
  
  public final void c(int paramInt1, int paramInt2)
  {
    int i = 1;
    this.a.a(null);
    wh localwh = this.a.b;
    localwh.a.add(localwh.a(1, paramInt1, paramInt2));
    if (localwh.a.size() == 1) {}
    for (paramInt1 = i;; paramInt1 = 0)
    {
      if (paramInt1 != 0) {
        b();
      }
      return;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\zm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */