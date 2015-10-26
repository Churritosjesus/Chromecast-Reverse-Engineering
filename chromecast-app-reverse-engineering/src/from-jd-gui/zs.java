import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

public final class zs
  extends er
{
  final RecyclerView b;
  final er c = new zt(this);
  
  public zs(RecyclerView paramRecyclerView)
  {
    this.b = paramRecyclerView;
  }
  
  public final void a(View paramView, jd paramjd)
  {
    super.a(paramView, paramjd);
    paramjd.a(RecyclerView.class.getName());
    if ((!a()) && (this.b.e != null))
    {
      zh localzh = this.b.e;
      zl localzl = localzh.e.a;
      paramView = localzh.e.n;
      if ((gt.b(localzh.e, -1)) || (gt.a(localzh.e, -1)))
      {
        paramjd.a(8192);
        paramjd.c(true);
      }
      if ((gt.b(localzh.e, 1)) || (gt.a(localzh.e, 1)))
      {
        paramjd.a(4096);
        paramjd.c(true);
      }
      int j = localzh.a(localzl, paramView);
      int i = localzh.b(localzl, paramView);
      paramView = new jl(jd.k().a(j, i, false, 0));
      jd.a.a(paramjd.b, ((jl)paramView).a);
    }
  }
  
  boolean a()
  {
    RecyclerView localRecyclerView = this.b;
    if ((!localRecyclerView.g) || (localRecyclerView.h) || (localRecyclerView.b.d())) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public final boolean a(View paramView, int paramInt, Bundle paramBundle)
  {
    boolean bool2 = false;
    boolean bool1;
    if (super.a(paramView, paramInt, paramBundle)) {
      bool1 = true;
    }
    int i;
    for (;;)
    {
      return bool1;
      bool1 = bool2;
      if (!a())
      {
        bool1 = bool2;
        if (this.b.e != null)
        {
          paramView = this.b.e;
          paramBundle = paramView.e.a;
          paramBundle = paramView.e.n;
          bool1 = bool2;
          if (paramView.e != null) {
            switch (paramInt)
            {
            default: 
              paramInt = 0;
              i = 0;
              if (i == 0)
              {
                bool1 = bool2;
                if (paramInt == 0) {}
              }
              else
              {
                paramView.e.scrollBy(paramInt, i);
                bool1 = true;
              }
              break;
            }
          }
        }
      }
    }
    if (gt.b(paramView.e, -1)) {}
    for (paramInt = -(paramView.p() - paramView.r() - paramView.t());; paramInt = 0)
    {
      i = paramInt;
      int j;
      if (gt.a(paramView.e, -1))
      {
        j = -(paramView.o() - paramView.q() - paramView.s());
        i = paramInt;
        paramInt = j;
        break;
        if (!gt.b(paramView.e, 1)) {
          break label287;
        }
      }
      label287:
      for (paramInt = paramView.p() - paramView.r() - paramView.t();; paramInt = 0)
      {
        i = paramInt;
        if (gt.a(paramView.e, 1))
        {
          j = paramView.o();
          int m = paramView.q();
          int k = paramView.s();
          i = paramInt;
          paramInt = j - m - k;
          break;
        }
        paramInt = 0;
        break;
      }
    }
  }
  
  public final void d(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    super.d(paramView, paramAccessibilityEvent);
    paramAccessibilityEvent.setClassName(RecyclerView.class.getName());
    if (((paramView instanceof RecyclerView)) && (!a()))
    {
      paramView = (RecyclerView)paramView;
      if (paramView.e != null) {
        paramView.e.a(paramAccessibilityEvent);
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\zs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */