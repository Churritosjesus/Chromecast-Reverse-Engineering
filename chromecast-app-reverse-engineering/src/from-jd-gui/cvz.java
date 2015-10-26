final class cvz
  implements cwq
{
  private final long a = 900000L;
  private final long b = 5000L;
  private final int c = 30;
  private double d = this.c;
  private long e;
  private final Object f = new Object();
  private final String g;
  private final cac h;
  
  public cvz(int paramInt, long paramLong1, long paramLong2, String paramString, cac paramcac)
  {
    this.g = paramString;
    this.h = paramcac;
  }
  
  public final boolean a()
  {
    boolean bool = false;
    for (;;)
    {
      synchronized (this.f)
      {
        long l = this.h.a();
        if (l - this.e < this.b)
        {
          StringBuilder localStringBuilder1 = new java/lang/StringBuilder;
          localStringBuilder1.<init>("Excessive ");
          cuh.b(this.g + " detected; call ignored.");
          return bool;
        }
        if (this.d < this.c)
        {
          double d1 = (l - this.e) / this.a;
          if (d1 > 0.0D) {
            this.d = Math.min(this.c, d1 + this.d);
          }
        }
        this.e = l;
        if (this.d >= 1.0D)
        {
          this.d -= 1.0D;
          bool = true;
        }
      }
      StringBuilder localStringBuilder2 = new java/lang/StringBuilder;
      localStringBuilder2.<init>("Excessive ");
      cuh.b(this.g + " detected; call ignored.");
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cvz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */