import java.net.ProtocolException;

public final class dhp
  implements dku
{
  public final djz a = new djz();
  private boolean b;
  private final int c;
  
  public dhp()
  {
    this(-1);
  }
  
  public dhp(int paramInt)
  {
    this.c = paramInt;
  }
  
  public final dkw a()
  {
    return dkw.b;
  }
  
  public final void a(dku paramdku)
  {
    djz localdjz = new djz();
    this.a.a(localdjz, 0L, this.a.b);
    paramdku.a_(localdjz, localdjz.b);
  }
  
  public final void a_(djz paramdjz, long paramLong)
  {
    if (this.b) {
      throw new IllegalStateException("closed");
    }
    dgs.a(paramdjz.b, 0L, paramLong);
    if ((this.c != -1) && (this.a.b > this.c - paramLong)) {
      throw new ProtocolException("exceeded content-length limit of " + this.c + " bytes");
    }
    this.a.a_(paramdjz, paramLong);
  }
  
  public final void close()
  {
    if (this.b) {}
    do
    {
      return;
      this.b = true;
    } while (this.a.b >= this.c);
    throw new ProtocolException("content-length promised " + this.c + " bytes, but received " + this.a.b);
  }
  
  public final void flush() {}
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dhp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */