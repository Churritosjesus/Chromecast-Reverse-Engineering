import java.io.InputStream;

final class dkm
  implements dkv
{
  dkm(dkw paramdkw, InputStream paramInputStream) {}
  
  public final long a(djz paramdjz, long paramLong)
  {
    long l = 0L;
    if (paramLong < 0L) {
      throw new IllegalArgumentException("byteCount < 0: " + paramLong);
    }
    if (paramLong == 0L) {
      paramLong = l;
    }
    for (;;)
    {
      return paramLong;
      this.a.f();
      dks localdks = paramdjz.e(1);
      int i = (int)Math.min(paramLong, 2048 - localdks.c);
      i = this.b.read(localdks.a, localdks.c, i);
      if (i == -1)
      {
        paramLong = -1L;
      }
      else
      {
        localdks.c += i;
        paramdjz.b += i;
        paramLong = i;
      }
    }
  }
  
  public final dkw a()
  {
    return this.a;
  }
  
  public final void close()
  {
    this.b.close();
  }
  
  public final String toString()
  {
    return "source(" + this.b + ")";
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dkm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */