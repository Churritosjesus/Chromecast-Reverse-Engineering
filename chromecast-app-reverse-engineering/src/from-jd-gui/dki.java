import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

public final class dki
  implements dkv
{
  private int a = 0;
  private final dkd b;
  private final Inflater c;
  private final dkj d;
  private final CRC32 e = new CRC32();
  
  public dki(dkv paramdkv)
  {
    if (paramdkv == null) {
      throw new IllegalArgumentException("source == null");
    }
    this.c = new Inflater(true);
    this.b = dkk.a(paramdkv);
    this.d = new dkj(this.b, this.c);
  }
  
  private void a(djz paramdjz, long paramLong1, long paramLong2)
  {
    Object localObject;
    long l1;
    long l2;
    for (paramdjz = paramdjz.a;; paramdjz = paramdjz.f)
    {
      localObject = paramdjz;
      l1 = paramLong1;
      l2 = paramLong2;
      if (paramLong1 < paramdjz.c - paramdjz.b) {
        break;
      }
      paramLong1 -= paramdjz.c - paramdjz.b;
    }
    while (l2 > 0L)
    {
      int i = (int)(((dks)localObject).b + l1);
      int j = (int)Math.min(((dks)localObject).c - i, l2);
      this.e.update(((dks)localObject).a, i, j);
      l2 -= j;
      localObject = ((dks)localObject).f;
      l1 = 0L;
    }
  }
  
  private static void a(String paramString, int paramInt1, int paramInt2)
  {
    if (paramInt2 != paramInt1) {
      throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", new Object[] { paramString, Integer.valueOf(paramInt2), Integer.valueOf(paramInt1) }));
    }
  }
  
  public final long a(djz paramdjz, long paramLong)
  {
    if (paramLong < 0L) {
      throw new IllegalArgumentException("byteCount < 0: " + paramLong);
    }
    if (paramLong == 0L) {
      paramLong = 0L;
    }
    for (;;)
    {
      return paramLong;
      long l;
      if (this.a == 0)
      {
        this.b.a(10L);
        int j = this.b.b().b(3L);
        if ((j >> 1 & 0x1) == 1) {}
        for (int i = 1;; i = 0)
        {
          if (i != 0) {
            a(this.b.b(), 0L, 10L);
          }
          a("ID1ID2", 8075, this.b.h());
          this.b.f(8L);
          if ((j >> 2 & 0x1) == 1)
          {
            this.b.a(2L);
            if (i != 0) {
              a(this.b.b(), 0L, 2L);
            }
            int k = this.b.b().j();
            this.b.a(k);
            if (i != 0) {
              a(this.b.b(), 0L, k);
            }
            this.b.f(k);
          }
          if ((j >> 3 & 0x1) != 1) {
            break label325;
          }
          l = this.b.a((byte)0);
          if (l != -1L) {
            break;
          }
          throw new EOFException();
        }
        if (i != 0) {
          a(this.b.b(), 0L, 1L + l);
        }
        this.b.f(1L + l);
        label325:
        if ((j >> 4 & 0x1) == 1)
        {
          l = this.b.a((byte)0);
          if (l == -1L) {
            throw new EOFException();
          }
          if (i != 0) {
            a(this.b.b(), 0L, 1L + l);
          }
          this.b.f(1L + l);
        }
        if (i != 0)
        {
          a("FHCRC", this.b.j(), (short)(int)this.e.getValue());
          this.e.reset();
        }
        this.a = 1;
      }
      if (this.a == 1)
      {
        l = paramdjz.b;
        paramLong = this.d.a(paramdjz, paramLong);
        if (paramLong != -1L) {
          a(paramdjz, l, paramLong);
        } else {
          this.a = 2;
        }
      }
      else
      {
        if (this.a == 2)
        {
          a("CRC", this.b.k(), (int)this.e.getValue());
          a("ISIZE", this.b.k(), this.c.getTotalOut());
          this.a = 3;
          if (!this.b.e()) {
            throw new IOException("gzip finished without exhausting source");
          }
        }
        paramLong = -1L;
      }
    }
  }
  
  public final dkw a()
  {
    return this.b.a();
  }
  
  public final void close()
  {
    this.d.close();
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dki.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */