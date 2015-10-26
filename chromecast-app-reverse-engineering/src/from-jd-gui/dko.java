import java.io.OutputStream;

final class dko
  implements dkc
{
  public final djz a;
  boolean b;
  private dku c;
  
  public dko(dku paramdku)
  {
    this(paramdku, new djz());
  }
  
  private dko(dku paramdku, djz paramdjz)
  {
    if (paramdku == null) {
      throw new IllegalArgumentException("sink == null");
    }
    this.a = paramdjz;
    this.c = paramdku;
  }
  
  public final long a(dkv paramdkv)
  {
    if (paramdkv == null) {
      throw new IllegalArgumentException("source == null");
    }
    long l1 = 0L;
    for (;;)
    {
      long l2 = paramdkv.a(this.a, 2048L);
      if (l2 == -1L) {
        break;
      }
      l1 += l2;
      r();
    }
    return l1;
  }
  
  public final dkw a()
  {
    return this.c.a();
  }
  
  public final void a_(djz paramdjz, long paramLong)
  {
    if (this.b) {
      throw new IllegalStateException("closed");
    }
    this.a.a_(paramdjz, paramLong);
    r();
  }
  
  public final djz b()
  {
    return this.a;
  }
  
  public final dkc b(dke paramdke)
  {
    if (this.b) {
      throw new IllegalStateException("closed");
    }
    this.a.a(paramdke);
    return r();
  }
  
  public final dkc b(String paramString)
  {
    if (this.b) {
      throw new IllegalStateException("closed");
    }
    this.a.a(paramString);
    return r();
  }
  
  public final dkc b(byte[] paramArrayOfByte)
  {
    if (this.b) {
      throw new IllegalStateException("closed");
    }
    this.a.a(paramArrayOfByte);
    return r();
  }
  
  public final dkc c(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (this.b) {
      throw new IllegalStateException("closed");
    }
    this.a.b(paramArrayOfByte, paramInt1, paramInt2);
    return r();
  }
  
  public final OutputStream c()
  {
    return new dkp(this);
  }
  
  public final void close()
  {
    if (this.b) {}
    for (;;)
    {
      return;
      localObject2 = null;
      localObject1 = localObject2;
      for (;;)
      {
        try
        {
          if (this.a.b > 0L)
          {
            this.c.a_(this.a, this.a.b);
            localObject1 = localObject2;
          }
        }
        catch (Throwable localThrowable1)
        {
          continue;
        }
        try
        {
          this.c.close();
          localObject2 = localObject1;
        }
        catch (Throwable localThrowable2)
        {
          localObject2 = localObject1;
          if (localObject1 != null) {
            continue;
          }
          localObject2 = localThrowable2;
        }
      }
      this.b = true;
      if (localObject2 != null) {
        dky.a((Throwable)localObject2);
      }
    }
  }
  
  public final dkc d()
  {
    if (this.b) {
      throw new IllegalStateException("closed");
    }
    long l = this.a.b;
    if (l > 0L) {
      this.c.a_(this.a, l);
    }
    return this;
  }
  
  public final dkc f(int paramInt)
  {
    if (this.b) {
      throw new IllegalStateException("closed");
    }
    this.a.d(paramInt);
    return r();
  }
  
  public final void flush()
  {
    if (this.b) {
      throw new IllegalStateException("closed");
    }
    if (this.a.b > 0L) {
      this.c.a_(this.a, this.a.b);
    }
    this.c.flush();
  }
  
  public final dkc g(int paramInt)
  {
    if (this.b) {
      throw new IllegalStateException("closed");
    }
    this.a.c(paramInt);
    return r();
  }
  
  public final dkc h(int paramInt)
  {
    if (this.b) {
      throw new IllegalStateException("closed");
    }
    this.a.b(paramInt);
    return r();
  }
  
  public final dkc h(long paramLong)
  {
    if (this.b) {
      throw new IllegalStateException("closed");
    }
    this.a.g(paramLong);
    return r();
  }
  
  public final dkc r()
  {
    if (this.b) {
      throw new IllegalStateException("closed");
    }
    Object localObject = this.a;
    long l2 = ((djz)localObject).b;
    long l1;
    if (l2 == 0L) {
      l1 = 0L;
    }
    for (;;)
    {
      if (l1 > 0L) {
        this.c.a_(this.a, l1);
      }
      return this;
      localObject = ((djz)localObject).a.g;
      l1 = l2;
      if (((dks)localObject).c < 2048)
      {
        l1 = l2;
        if (((dks)localObject).e) {
          l1 = l2 - (((dks)localObject).c - ((dks)localObject).b);
        }
      }
    }
  }
  
  public final String toString()
  {
    return "buffer(" + this.c + ")";
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dko.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */