import java.io.IOException;
import java.util.concurrent.TimeUnit;

public final class dhi
  implements dkv
{
  private boolean a;
  
  public dhi(dhg paramdhg, dkd paramdkd, s params, dkc paramdkc) {}
  
  public final long a(djz paramdjz, long paramLong)
  {
    for (;;)
    {
      try
      {
        paramLong = this.b.a(paramdjz, paramLong);
        if (paramLong == -1L)
        {
          if (!this.a)
          {
            this.a = true;
            this.d.close();
          }
          paramLong = -1L;
          return paramLong;
        }
      }
      catch (IOException paramdjz)
      {
        if (!this.a) {
          this.a = true;
        }
        throw paramdjz;
      }
      paramdjz.a(this.d.b(), paramdjz.b - paramLong, paramLong);
      this.d.r();
    }
  }
  
  public final dkw a()
  {
    return this.b.a();
  }
  
  public final void close()
  {
    if ((!this.a) && (!dgs.a(this, 100, TimeUnit.MILLISECONDS))) {
      this.a = true;
    }
    this.b.close();
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dhi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */