import android.os.SystemClock;

public final class buy
{
  public static final Object b = new Object();
  private static final buu f = new buu("RequestTracker");
  long a = -1L;
  private long c = 86400000L;
  private long d = 0L;
  private bux e;
  
  public buy(long paramLong) {}
  
  void a()
  {
    this.a = -1L;
    this.e = null;
    this.d = 0L;
  }
  
  public final void a(long paramLong, bux parambux)
  {
    synchronized (b)
    {
      bux localbux = this.e;
      this.a = paramLong;
      this.e = parambux;
      this.d = SystemClock.elapsedRealtime();
      if (localbux != null) {
        localbux.a();
      }
      return;
    }
  }
  
  public final boolean a(long paramLong)
  {
    synchronized (b)
    {
      if ((this.a != -1L) && (this.a == paramLong))
      {
        bool = true;
        return bool;
      }
      boolean bool = false;
    }
  }
  
  public final boolean a(long paramLong, int paramInt)
  {
    boolean bool = true;
    for (;;)
    {
      synchronized (b)
      {
        if ((this.a != -1L) && (paramLong - this.d >= this.c))
        {
          f.b("request %d timed out", new Object[] { Long.valueOf(this.a) });
          bux localbux = this.e;
          a();
          if (localbux != null) {
            localbux.a(2102, null);
          }
          return bool;
        }
      }
      bool = false;
      Object localObject2 = null;
    }
  }
  
  public final boolean a(long paramLong, int paramInt, Object paramObject)
  {
    boolean bool = true;
    bux localbux = null;
    for (;;)
    {
      synchronized (b)
      {
        if ((this.a != -1L) && (this.a == paramLong))
        {
          f.b("request %d completed", new Object[] { Long.valueOf(this.a) });
          localbux = this.e;
          a();
          if (localbux != null) {
            localbux.a(paramInt, paramObject);
          }
          return bool;
        }
      }
      bool = false;
    }
  }
  
  public final boolean b()
  {
    synchronized (b)
    {
      if (this.a != -1L)
      {
        bool = true;
        return bool;
      }
      boolean bool = false;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\buy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */