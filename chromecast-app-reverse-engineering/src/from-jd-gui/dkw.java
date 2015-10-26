import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

public class dkw
{
  public static final dkw b = new dkx();
  private boolean a;
  private long c;
  private long d;
  
  public dkw a(long paramLong)
  {
    this.a = true;
    this.c = paramLong;
    return this;
  }
  
  public dkw a(long paramLong, TimeUnit paramTimeUnit)
  {
    if (paramLong < 0L) {
      throw new IllegalArgumentException("timeout < 0: " + paramLong);
    }
    if (paramTimeUnit == null) {
      throw new IllegalArgumentException("unit == null");
    }
    this.d = paramTimeUnit.toNanos(paramLong);
    return this;
  }
  
  public long c()
  {
    if (!this.a) {
      throw new IllegalStateException("No deadline");
    }
    return this.c;
  }
  
  public dkw d()
  {
    this.d = 0L;
    return this;
  }
  
  public void f()
  {
    if (Thread.interrupted()) {
      throw new InterruptedIOException("thread interrupted");
    }
    if ((this.a) && (this.c - System.nanoTime() <= 0L)) {
      throw new InterruptedIOException("deadline reached");
    }
  }
  
  public long l_()
  {
    return this.d;
  }
  
  public boolean m_()
  {
    return this.a;
  }
  
  public dkw n_()
  {
    this.a = false;
    return this;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dkw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */