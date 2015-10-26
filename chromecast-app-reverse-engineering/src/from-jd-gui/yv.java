import android.support.v7.widget.RecyclerView;

public final class yv
  implements Runnable
{
  public yv(RecyclerView paramRecyclerView) {}
  
  public final void run()
  {
    if (this.a.m != null) {
      this.a.m.a();
    }
    RecyclerView.a(this.a, false);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\yv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */