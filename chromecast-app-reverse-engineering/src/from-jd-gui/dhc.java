import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

final class dhc
  extends dgy
{
  private long b;
  
  public dhc(dgx paramdgx, long paramLong)
  {
    super(paramdgx, (byte)0);
    this.b = paramLong;
    if (this.b == 0L) {
      a(true);
    }
  }
  
  public final long a(djz paramdjz, long paramLong)
  {
    long l = -1L;
    if (paramLong < 0L) {
      throw new IllegalArgumentException("byteCount < 0: " + paramLong);
    }
    if (this.a) {
      throw new IllegalStateException("closed");
    }
    if (this.b == 0L) {
      paramLong = l;
    }
    for (;;)
    {
      return paramLong;
      paramLong = this.c.c.a(paramdjz, Math.min(this.b, paramLong));
      if (paramLong == -1L)
      {
        b();
        throw new ProtocolException("unexpected end of stream");
      }
      this.b -= paramLong;
      if (this.b == 0L) {
        a(true);
      }
    }
  }
  
  public final void close()
  {
    if (this.a) {}
    for (;;)
    {
      return;
      if ((this.b != 0L) && (!dgs.a(this, 100, TimeUnit.MILLISECONDS))) {
        b();
      }
      this.a = true;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dhc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */