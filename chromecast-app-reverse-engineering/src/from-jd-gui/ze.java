import android.support.v7.widget.RecyclerView;

public final class ze
  implements zd
{
  public ze(RecyclerView paramRecyclerView) {}
  
  public final void a(zr paramzr)
  {
    paramzr.a(true);
    if ((!RecyclerView.c(this.a, paramzr.a)) && (paramzr.o())) {
      this.a.removeDetachedView(paramzr.a, false);
    }
  }
  
  public final void b(zr paramzr)
  {
    paramzr.a(true);
    if (!zr.a(paramzr)) {
      RecyclerView.c(this.a, paramzr.a);
    }
  }
  
  public final void c(zr paramzr)
  {
    paramzr.a(true);
    if (!zr.a(paramzr)) {
      RecyclerView.c(this.a, paramzr.a);
    }
  }
  
  public final void d(zr paramzr)
  {
    paramzr.a(true);
    if ((paramzr.g != null) && (paramzr.h == null))
    {
      paramzr.g = null;
      paramzr.a(-65, paramzr.i);
    }
    paramzr.h = null;
    if (!zr.a(paramzr)) {
      RecyclerView.c(this.a, paramzr.a);
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\ze.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */