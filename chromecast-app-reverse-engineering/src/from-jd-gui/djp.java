import java.io.EOFException;
import java.io.IOException;

final class djp
  implements dkv
{
  final djz a = new djz();
  final djz b = new djz();
  final long c;
  boolean d;
  private boolean f;
  
  djp(djn paramdjn, long paramLong)
  {
    this.c = paramLong;
  }
  
  /* Error */
  private void b()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 20	djp:e	Ldjn;
    //   4: invokestatic 42	djn:c	(Ldjn;)Ldjq;
    //   7: invokevirtual 47	djq:j_	()V
    //   10: aload_0
    //   11: getfield 30	djp:b	Ldjz;
    //   14: getfield 49	djz:b	J
    //   17: lconst_0
    //   18: lcmp
    //   19: ifne +50 -> 69
    //   22: aload_0
    //   23: getfield 36	djp:d	Z
    //   26: ifne +43 -> 69
    //   29: aload_0
    //   30: getfield 51	djp:f	Z
    //   33: ifne +36 -> 69
    //   36: aload_0
    //   37: getfield 20	djp:e	Ldjn;
    //   40: invokestatic 54	djn:d	(Ldjn;)Ldia;
    //   43: ifnonnull +26 -> 69
    //   46: aload_0
    //   47: getfield 20	djp:e	Ldjn;
    //   50: invokestatic 57	djn:e	(Ldjn;)V
    //   53: goto -43 -> 10
    //   56: astore_1
    //   57: aload_0
    //   58: getfield 20	djp:e	Ldjn;
    //   61: invokestatic 42	djn:c	(Ldjn;)Ldjq;
    //   64: invokevirtual 59	djq:b	()V
    //   67: aload_1
    //   68: athrow
    //   69: aload_0
    //   70: getfield 20	djp:e	Ldjn;
    //   73: invokestatic 42	djn:c	(Ldjn;)Ldjq;
    //   76: invokevirtual 59	djq:b	()V
    //   79: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	80	0	this	djp
    //   56	12	1	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   10	53	56	finally
  }
  
  public final long a(djz arg1, long paramLong)
  {
    if (paramLong < 0L) {
      throw new IllegalArgumentException("byteCount < 0: " + paramLong);
    }
    synchronized (this.e)
    {
      b();
      if (this.f)
      {
        ??? = new java/io/IOException;
        ???.<init>("stream closed");
        throw ???;
      }
    }
    if (djn.d(this.e) != null)
    {
      IOException localIOException = new java/io/IOException;
      ??? = new java/lang/StringBuilder;
      ???.<init>("stream was reset: ");
      localIOException.<init>(djn.d(this.e));
      throw localIOException;
    }
    if (this.b.b == 0L) {
      paramLong = -1L;
    }
    for (;;)
    {
      return paramLong;
      paramLong = this.b.a(???, Math.min(paramLong, this.b.b));
      ??? = this.e;
      ???.a += paramLong;
      if (this.e.a >= djn.a(this.e).e.c(65536) / 2)
      {
        djn.a(this.e).a(djn.b(this.e), this.e.a);
        this.e.a = 0L;
      }
      synchronized (djn.a(this.e))
      {
        ??? = djn.a(this.e);
        ((djb)???).c += paramLong;
        if (djn.a(this.e).c >= djn.a(this.e).e.c(65536) / 2)
        {
          djn.a(this.e).a(0, djn.a(this.e).c);
          djn.a(this.e).c = 0L;
        }
      }
    }
  }
  
  public final dkw a()
  {
    return djn.c(this.e);
  }
  
  final void a(dkd paramdkd, long paramLong)
  {
    if (paramLong > 0L) {}
    int i;
    for (;;)
    {
      boolean bool;
      synchronized (this.e)
      {
        bool = this.d;
        if (this.b.b + paramLong > this.c)
        {
          i = 1;
          if (i != 0)
          {
            paramdkd.f(paramLong);
            this.e.b(dia.f);
          }
        }
        else
        {
          i = 0;
        }
      }
      if (!bool) {
        break;
      }
      paramdkd.f(paramLong);
    }
    long l = paramdkd.a(this.a, paramLong);
    if (l == -1L) {
      throw new EOFException();
    }
    paramLong -= l;
    for (;;)
    {
      synchronized (this.e)
      {
        if (this.b.b == 0L)
        {
          i = 1;
          this.b.a(this.a);
          if (i != 0) {
            this.e.notifyAll();
          }
        }
      }
      i = 0;
    }
  }
  
  public final void close()
  {
    synchronized (this.e)
    {
      this.f = true;
      this.b.q();
      this.e.notifyAll();
      djn.f(this.e);
      return;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\djp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */