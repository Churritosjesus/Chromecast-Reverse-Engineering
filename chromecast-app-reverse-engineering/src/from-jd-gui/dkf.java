import java.util.zip.Deflater;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

public final class dkf
  implements dku
{
  private final dkc a;
  private final Deflater b;
  private boolean c;
  
  private dkf(dkc paramdkc, Deflater paramDeflater)
  {
    if (paramdkc == null) {
      throw new IllegalArgumentException("source == null");
    }
    if (paramDeflater == null) {
      throw new IllegalArgumentException("inflater == null");
    }
    this.a = paramdkc;
    this.b = paramDeflater;
  }
  
  public dkf(dku paramdku, Deflater paramDeflater)
  {
    this(dkk.a(paramdku), paramDeflater);
  }
  
  @IgnoreJRERequirement
  private void a(boolean paramBoolean)
  {
    djz localdjz = this.a.b();
    dks localdks;
    label115:
    do
    {
      localdks = localdjz.e(1);
      if (paramBoolean) {}
      for (int i = this.b.deflate(localdks.a, localdks.c, 2048 - localdks.c, 2);; i = this.b.deflate(localdks.a, localdks.c, 2048 - localdks.c))
      {
        if (i <= 0) {
          break label115;
        }
        localdks.c += i;
        localdjz.b += i;
        this.a.r();
        break;
      }
    } while (!this.b.needsInput());
    if (localdks.b == localdks.c)
    {
      localdjz.a = localdks.a();
      dkt.a(localdks);
    }
  }
  
  public final dkw a()
  {
    return this.a.a();
  }
  
  public final void a_(djz paramdjz, long paramLong)
  {
    dky.a(paramdjz.b, 0L, paramLong);
    while (paramLong > 0L)
    {
      dks localdks = paramdjz.a;
      int i = (int)Math.min(paramLong, localdks.c - localdks.b);
      this.b.setInput(localdks.a, localdks.b, i);
      a(false);
      paramdjz.b -= i;
      localdks.b += i;
      if (localdks.b == localdks.c)
      {
        paramdjz.a = localdks.a();
        dkt.a(localdks);
      }
      paramLong -= i;
    }
  }
  
  public final void close()
  {
    if (this.c) {}
    for (;;)
    {
      return;
      Object localObject2 = null;
      try
      {
        this.b.finish();
        a(false);
        try
        {
          this.b.end();
          localObject1 = localObject2;
        }
        catch (Throwable localThrowable1)
        {
          for (;;)
          {
            Object localObject1;
            label42:
            if (localThrowable3 != null) {
              localThrowable2 = localThrowable3;
            }
          }
        }
        try
        {
          this.a.close();
          localObject2 = localObject1;
        }
        catch (Throwable localThrowable4)
        {
          Object localObject3 = localThrowable2;
          if (localThrowable2 != null) {
            break label42;
          }
          localObject3 = localThrowable4;
          break label42;
        }
        this.c = true;
        if (localObject2 == null) {
          continue;
        }
        dky.a((Throwable)localObject2);
      }
      catch (Throwable localThrowable3)
      {
        for (;;) {}
      }
    }
  }
  
  public final void flush()
  {
    a(true);
    this.a.flush();
  }
  
  public final String toString()
  {
    return "DeflaterSink(" + this.a + ")";
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dkf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */