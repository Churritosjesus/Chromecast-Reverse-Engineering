import android.support.v7.widget.RecyclerView;

public final class yu
  implements Runnable
{
  public yu(RecyclerView paramRecyclerView) {}
  
  public final void run()
  {
    if (!RecyclerView.a(this.a)) {}
    for (;;)
    {
      return;
      if (RecyclerView.b(this.a))
      {
        a.a("RV FullInvalidate");
        this.a.h();
        a.b();
      }
      else if (this.a.b.d())
      {
        a.a("RV PartialInvalidate");
        this.a.a();
        this.a.b.b();
        if (!RecyclerView.c(this.a))
        {
          RecyclerView localRecyclerView = this.a;
          int j = localRecyclerView.c.a();
          int i = 0;
          if (i < j)
          {
            zr localzr = RecyclerView.b(localRecyclerView.c.b(i));
            if ((localzr != null) && (!localzr.b()))
            {
              if ((!localzr.n()) && (!localzr.j())) {
                break label153;
              }
              localRecyclerView.requestLayout();
            }
            for (;;)
            {
              i++;
              break;
              label153:
              if (localzr.k())
              {
                int k = localRecyclerView.d.a(localzr.b);
                if (localzr.e != k) {
                  break label218;
                }
                if ((!localzr.l()) || (!localRecyclerView.g())) {
                  localRecyclerView.d.b(localzr, localzr.b);
                } else {
                  localRecyclerView.requestLayout();
                }
              }
            }
            label218:
            localRecyclerView.requestLayout();
          }
        }
        this.a.a(true);
        a.b();
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\yu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */