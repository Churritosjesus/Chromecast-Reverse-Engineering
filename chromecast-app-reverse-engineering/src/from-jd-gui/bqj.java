public final class bqj
{
  private final long a = 2000L;
  private final int b = 60;
  private double c = this.b;
  private long d;
  private final Object e = new Object();
  private final String f;
  
  private bqj(int paramInt, long paramLong, String paramString)
  {
    this.f = paramString;
  }
  
  public bqj(String paramString)
  {
    this(60, 2000L, paramString);
  }
  
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
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>("Excessive ");
      bqk.a(this.f + " detected; call ignored.");
      boolean bool = false;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bqj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */