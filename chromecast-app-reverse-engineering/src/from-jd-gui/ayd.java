import android.support.v7.widget.RecyclerView;

final class ayd
  extends zj
{
  ayd(ayc paramayc) {}
  
  public final void a(int paramInt)
  {
    if (paramInt == 1)
    {
      apg localapg = apg.a(117).b(this.a.b);
      localapg.b = this.a.c.e;
      localapg.b();
    }
  }
  
  public final void a(RecyclerView paramRecyclerView, int paramInt1, int paramInt2)
  {
    super.a(paramRecyclerView, paramInt1, paramInt2);
    if ((this.a.a != null) && (paramInt1 != this.a.a[this.a.b]))
    {
      paramRecyclerView = this.a.a;
      paramInt2 = this.a.b;
      paramRecyclerView[paramInt2] += paramInt1;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\ayd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */