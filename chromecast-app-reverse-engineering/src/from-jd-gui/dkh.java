import java.util.concurrent.TimeUnit;

public final class dkh
  extends dkw
{
  public dkw a;
  
  public dkh(dkw paramdkw)
  {
    if (paramdkw == null) {
      throw new IllegalArgumentException("delegate == null");
    }
    this.a = paramdkw;
  }
  
  public final dkw a(long paramLong)
  {
    return this.a.a(paramLong);
  }
  
  public final dkw a(long paramLong, TimeUnit paramTimeUnit)
  {
    return this.a.a(paramLong, paramTimeUnit);
  }
  
  public final long c()
  {
    return this.a.c();
  }
  
  public final dkw d()
  {
    return this.a.d();
  }
  
  public final void f()
  {
    this.a.f();
  }
  
  public final long l_()
  {
    return this.a.l_();
  }
  
  public final boolean m_()
  {
    return this.a.m_();
  }
  
  public final dkw n_()
  {
    return this.a.n_();
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dkh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */