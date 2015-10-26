import android.content.Context;
import android.os.Handler;

abstract class bsb
{
  private static volatile Handler d;
  final brb a;
  final Runnable b;
  volatile long c;
  
  bsb(brb parambrb)
  {
    a.c(parambrb);
    this.a = parambrb;
    this.b = new bsc(this);
  }
  
  public abstract void a();
  
  public final void a(long paramLong)
  {
    c();
    if (paramLong >= 0L)
    {
      this.c = this.a.c.a();
      if (!d().postDelayed(this.b, paramLong)) {
        this.a.a().e("Failed to schedule delayed post. time", Long.valueOf(paramLong));
      }
    }
  }
  
  public final boolean b()
  {
    if (this.c != 0L) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public final void c()
  {
    this.c = 0L;
    d().removeCallbacks(this.b);
  }
  
  Handler d()
  {
    Handler localHandler;
    if (d != null) {
      localHandler = d;
    }
    for (;;)
    {
      return localHandler;
      try
      {
        if (d == null)
        {
          localHandler = new android/os/Handler;
          localHandler.<init>(this.a.a.getMainLooper());
          d = localHandler;
        }
        localHandler = d;
      }
      finally {}
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bsb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */