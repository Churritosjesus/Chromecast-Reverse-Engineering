import java.net.ProtocolException;

final class dhb
  implements dku
{
  private final dkh a = new dkh(this.d.d.a());
  private boolean b;
  private long c;
  
  dhb(dgx paramdgx, long paramLong)
  {
    this.c = paramLong;
  }
  
  public final dkw a()
  {
    return this.a;
  }
  
  public final void a_(djz paramdjz, long paramLong)
  {
    if (this.b) {
      throw new IllegalStateException("closed");
    }
    dgs.a(paramdjz.b, 0L, paramLong);
    if (paramLong > this.c) {
      throw new ProtocolException("expected " + this.c + " bytes but received " + paramLong);
    }
    this.d.d.a_(paramdjz, paramLong);
    this.c -= paramLong;
  }
  
  public final void close()
  {
    if (this.b) {}
    for (;;)
    {
      return;
      this.b = true;
      if (this.c > 0L) {
        throw new ProtocolException("unexpected end of stream");
      }
      dgx.a(this.d, this.a);
      this.d.e = 3;
    }
  }
  
  public final void flush()
  {
    if (this.b) {}
    for (;;)
    {
      return;
      this.d.d.flush();
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dhb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */