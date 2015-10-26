import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

public final class dkj
  implements dkv
{
  private final dkd a;
  private final Inflater b;
  private int c;
  private boolean d;
  
  dkj(dkd paramdkd, Inflater paramInflater)
  {
    if (paramdkd == null) {
      throw new IllegalArgumentException("source == null");
    }
    if (paramInflater == null) {
      throw new IllegalArgumentException("inflater == null");
    }
    this.a = paramdkd;
    this.b = paramInflater;
  }
  
  public dkj(dkv paramdkv, Inflater paramInflater)
  {
    this(dkk.a(paramdkv), paramInflater);
  }
  
  private void c()
  {
    if (this.c == 0) {}
    for (;;)
    {
      return;
      int i = this.c - this.b.getRemaining();
      this.c -= i;
      this.a.f(i);
    }
  }
  
  public final long a(djz paramdjz, long paramLong)
  {
    long l = 0L;
    if (paramLong < 0L) {
      throw new IllegalArgumentException("byteCount < 0: " + paramLong);
    }
    if (this.d) {
      throw new IllegalStateException("closed");
    }
    if (paramLong == 0L) {
      paramLong = l;
    }
    for (;;)
    {
      return paramLong;
      label61:
      boolean bool = b();
      try
      {
        dks localdks = paramdjz.e(1);
        int i = this.b.inflate(localdks.a, localdks.c, 2048 - localdks.c);
        if (i > 0)
        {
          localdks.c += i;
          paramdjz.b += i;
          paramLong = i;
          continue;
        }
        if ((this.b.finished()) || (this.b.needsDictionary()))
        {
          c();
          if (localdks.b == localdks.c)
          {
            paramdjz.a = localdks.a();
            dkt.a(localdks);
          }
          paramLong = -1L;
          continue;
        }
        if (!bool) {
          break label61;
        }
        paramdjz = new java/io/EOFException;
        paramdjz.<init>("source exhausted prematurely");
        throw paramdjz;
      }
      catch (DataFormatException paramdjz)
      {
        throw new IOException(paramdjz);
      }
    }
  }
  
  public final dkw a()
  {
    return this.a.a();
  }
  
  public final boolean b()
  {
    boolean bool = false;
    if (!this.b.needsInput()) {}
    for (;;)
    {
      return bool;
      c();
      if (this.b.getRemaining() != 0) {
        throw new IllegalStateException("?");
      }
      if (this.a.e())
      {
        bool = true;
      }
      else
      {
        dks localdks = this.a.b().a;
        this.c = (localdks.c - localdks.b);
        this.b.setInput(localdks.a, localdks.b, this.c);
      }
    }
  }
  
  public final void close()
  {
    if (this.d) {}
    for (;;)
    {
      return;
      this.b.end();
      this.d = true;
      this.a.close();
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dkj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */