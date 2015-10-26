import java.util.logging.Level;
import java.util.logging.Logger;

final class dik
  implements dkv
{
  int a;
  byte b;
  int c;
  int d;
  short e;
  private final dkd f;
  
  public dik(dkd paramdkd)
  {
    this.f = paramdkd;
  }
  
  public final long a(djz paramdjz, long paramLong)
  {
    long l2 = -1L;
    if (this.d == 0)
    {
      this.f.f(this.e);
      this.e = 0;
      if ((this.b & 0x4) != 0) {
        paramLong = l2;
      }
    }
    for (;;)
    {
      return paramLong;
      int i = this.c;
      int j = dij.a(this.f);
      this.d = j;
      this.a = j;
      byte b1 = this.f.g();
      this.b = this.f.g();
      if (dij.b().isLoggable(Level.FINE)) {
        dij.b().fine(dil.a(true, this.c, this.a, b1, this.b));
      }
      this.c = (this.f.i() & 0x7FFFFFFF);
      if (b1 != 9) {
        throw dij.a("%s != TYPE_CONTINUATION", new Object[] { Byte.valueOf(b1) });
      }
      if (this.c == i) {
        break;
      }
      throw dij.a("TYPE_CONTINUATION streamId changed", new Object[0]);
      long l1 = this.f.a(paramdjz, Math.min(paramLong, this.d));
      paramLong = l2;
      if (l1 != -1L)
      {
        this.d = ((int)(this.d - l1));
        paramLong = l1;
      }
    }
  }
  
  public final dkw a()
  {
    return this.f.a();
  }
  
  public final void close() {}
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dik.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */