import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

final class dha
  extends dgy
{
  private long b = -1L;
  private boolean c = true;
  private final dhg d;
  
  dha(dgx paramdgx, dhg paramdhg)
  {
    super(paramdgx, (byte)0);
    this.d = paramdhg;
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
    if (!this.c) {}
    for (;;)
    {
      return l;
      if ((this.b == 0L) || (this.b == -1L))
      {
        if (this.b != -1L) {
          this.e.c.o();
        }
        Object localObject;
        try
        {
          this.b = this.e.c.l();
          localObject = this.e.c.o().trim();
          if ((this.b < 0L) || ((!((String)localObject).isEmpty()) && (!((String)localObject).startsWith(";"))))
          {
            paramdjz = new java/net/ProtocolException;
            StringBuilder localStringBuilder = new java/lang/StringBuilder;
            localStringBuilder.<init>("expected chunk size and optional extensions but was \"");
            paramdjz.<init>(this.b + (String)localObject + "\"");
            throw paramdjz;
          }
        }
        catch (NumberFormatException paramdjz)
        {
          throw new ProtocolException(paramdjz.getMessage());
        }
        if (this.b == 0L)
        {
          this.c = false;
          localObject = new dfp();
          this.e.a((dfp)localObject);
          this.d.a(((dfp)localObject).a());
          a(true);
        }
        if (!this.c) {}
      }
      else
      {
        l = this.e.c.a(paramdjz, Math.min(paramLong, this.b));
        if (l == -1L)
        {
          b();
          throw new IOException("unexpected end of stream");
        }
        this.b -= l;
      }
    }
  }
  
  public final void close()
  {
    if (this.a) {}
    for (;;)
    {
      return;
      if ((this.c) && (!dgs.a(this, 100, TimeUnit.MILLISECONDS))) {
        b();
      }
      this.a = true;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dha.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */