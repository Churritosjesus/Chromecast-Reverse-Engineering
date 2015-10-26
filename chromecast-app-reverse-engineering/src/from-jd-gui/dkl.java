import java.io.OutputStream;

final class dkl
  implements dku
{
  dkl(dkw paramdkw, OutputStream paramOutputStream) {}
  
  public final dkw a()
  {
    return this.a;
  }
  
  public final void a_(djz paramdjz, long paramLong)
  {
    dky.a(paramdjz.b, 0L, paramLong);
    while (paramLong > 0L)
    {
      this.a.f();
      dks localdks = paramdjz.a;
      int i = (int)Math.min(paramLong, localdks.c - localdks.b);
      this.b.write(localdks.a, localdks.b, i);
      localdks.b += i;
      long l = paramLong - i;
      paramdjz.b -= i;
      paramLong = l;
      if (localdks.b == localdks.c)
      {
        paramdjz.a = localdks.a();
        dkt.a(localdks);
        paramLong = l;
      }
    }
  }
  
  public final void close()
  {
    this.b.close();
  }
  
  public final void flush()
  {
    this.b.flush();
  }
  
  public final String toString()
  {
    return "sink(" + this.b + ")";
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dkl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */