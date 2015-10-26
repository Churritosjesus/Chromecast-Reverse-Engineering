final class cxs
  implements cwq
{
  private final long a = 2000L;
  private final int b = 60;
  private double c = this.b;
  private long d;
  private final Object e = new Object();
  
  public cxs()
  {
    this(60, 2000L);
  }
  
  private cxs(int paramInt, long paramLong) {}
  
  public final boolean a()
  {
    synchronized (this.e)
    {
      long l = System.currentTimeMillis();
      if (this.c < this.b)
      {
        double d1 = (l - this.d) / this.a;
        if (d1 > 0.0D) {
          this.c = Math.min(this.b, d1 + this.c);
        }
      }
      this.d = l;
      if (this.c >= 1.0D)
      {
        this.c -= 1.0D;
        bool = true;
        return bool;
      }
      cuh.b("No more tokens available.");
      boolean bool = false;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cxs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */