import java.util.concurrent.TimeUnit;

final class ckk
{
  private int a = 0;
  
  public final void a()
  {
    try
    {
      this.a += 1;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final boolean a(long paramLong, TimeUnit paramTimeUnit)
  {
    long l1 = System.currentTimeMillis();
    paramLong = TimeUnit.MILLISECONDS.convert(10L, paramTimeUnit);
    for (;;)
    {
      try
      {
        boolean bool;
        if (this.a == 0)
        {
          bool = true;
          return bool;
        }
        if (paramLong <= 0L)
        {
          bool = false;
          continue;
        }
        wait(paramLong);
      }
      finally {}
      long l2 = System.currentTimeMillis();
      paramLong -= l2 - l1;
    }
  }
  
  public final void b()
  {
    try
    {
      if (this.a == 0)
      {
        RuntimeException localRuntimeException = new java/lang/RuntimeException;
        localRuntimeException.<init>("too many decrements");
        throw localRuntimeException;
      }
    }
    finally {}
    this.a -= 1;
    if (this.a == 0) {
      notifyAll();
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\ckk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */