import java.io.EOFException;
import java.io.InputStream;

final class dkq
  implements dkd
{
  public final djz a;
  public final dkv b;
  boolean c;
  
  public dkq(dkv paramdkv)
  {
    this(paramdkv, new djz());
  }
  
  private dkq(dkv paramdkv, djz paramdjz)
  {
    if (paramdkv == null) {
      throw new IllegalArgumentException("source == null");
    }
    this.a = paramdjz;
    this.b = paramdkv;
  }
  
  private boolean b(long paramLong)
  {
    if (paramLong < 0L) {
      throw new IllegalArgumentException("byteCount < 0: " + paramLong);
    }
    if (this.c) {
      throw new IllegalStateException("closed");
    }
    do
    {
      if (this.a.b >= paramLong) {
        break;
      }
    } while (this.b.a(this.a, 2048L) != -1L);
    for (boolean bool = false;; bool = true) {
      return bool;
    }
  }
  
  public final long a(byte paramByte)
  {
    long l2 = 0L;
    if (this.c) {
      throw new IllegalStateException("closed");
    }
    do
    {
      l1 = l2;
      if (0L < this.a.b) {
        break;
      }
    } while (this.b.a(this.a, 2048L) != -1L);
    long l1 = -1L;
    for (;;)
    {
      return l1;
      do
      {
        l2 = this.a.a(paramByte, l1);
        l1 = l2;
        if (l2 != -1L) {
          break;
        }
        l1 = this.a.b;
      } while (this.b.a(this.a, 2048L) != -1L);
      l1 = -1L;
    }
  }
  
  public final long a(djz paramdjz, long paramLong)
  {
    long l = -1L;
    if (paramdjz == null) {
      throw new IllegalArgumentException("sink == null");
    }
    if (paramLong < 0L) {
      throw new IllegalArgumentException("byteCount < 0: " + paramLong);
    }
    if (this.c) {
      throw new IllegalStateException("closed");
    }
    if ((this.a.b == 0L) && (this.b.a(this.a, 2048L) == -1L)) {}
    for (paramLong = l;; paramLong = this.a.a(paramdjz, paramLong))
    {
      return paramLong;
      paramLong = Math.min(paramLong, this.a.b);
    }
  }
  
  public final dkw a()
  {
    return this.b.a();
  }
  
  public final void a(long paramLong)
  {
    if (!b(paramLong)) {
      throw new EOFException();
    }
  }
  
  public final djz b()
  {
    return this.a;
  }
  
  public final dke c(long paramLong)
  {
    a(paramLong);
    return this.a.c(paramLong);
  }
  
  public final void close()
  {
    if (this.c) {}
    for (;;)
    {
      return;
      this.c = true;
      this.b.close();
      this.a.q();
    }
  }
  
  public final boolean e()
  {
    if (this.c) {
      throw new IllegalStateException("closed");
    }
    if ((this.a.e()) && (this.b.a(this.a, 2048L) == -1L)) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public final byte[] e(long paramLong)
  {
    a(paramLong);
    return this.a.e(paramLong);
  }
  
  public final InputStream f()
  {
    return new dkr(this);
  }
  
  public final void f(long paramLong)
  {
    if (this.c) {
      throw new IllegalStateException("closed");
    }
    do
    {
      long l = Math.min(paramLong, this.a.b);
      this.a.f(l);
      paramLong -= l;
      if (paramLong <= 0L) {
        break;
      }
    } while ((this.a.b != 0L) || (this.b.a(this.a, 2048L) != -1L));
    throw new EOFException();
  }
  
  public final byte g()
  {
    a(1L);
    return this.a.g();
  }
  
  public final short h()
  {
    a(2L);
    return this.a.h();
  }
  
  public final int i()
  {
    a(4L);
    return this.a.i();
  }
  
  public final short j()
  {
    a(2L);
    return dky.a(this.a.h());
  }
  
  public final int k()
  {
    a(4L);
    return dky.a(this.a.i());
  }
  
  public final long l()
  {
    a(1L);
    for (int i = 0; b(i + 1); i++)
    {
      byte b1 = this.a.b(i);
      if (((b1 < 48) || (b1 > 57)) && ((b1 < 97) || (b1 > 102)) && ((b1 < 65) || (b1 > 70)))
      {
        if (i != 0) {
          break;
        }
        throw new NumberFormatException(String.format("Expected leading [0-9a-fA-F] character but was %#x", new Object[] { Byte.valueOf(b1) }));
      }
    }
    return this.a.l();
  }
  
  public final String o()
  {
    long l = a((byte)10);
    if (l == -1L)
    {
      djz localdjz = new djz();
      this.a.a(localdjz, 0L, Math.min(32L, this.a.b));
      throw new EOFException("\\n not found: size=" + this.a.b + " content=" + localdjz.m().b() + "...");
    }
    return this.a.d(l);
  }
  
  public final String toString()
  {
    return "buffer(" + this.b + ")";
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dkq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */