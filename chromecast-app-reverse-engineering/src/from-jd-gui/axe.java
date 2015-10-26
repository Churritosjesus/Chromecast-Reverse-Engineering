import android.os.SystemClock;

final class axe
  implements Runnable
{
  axe(axd paramaxd) {}
  
  public final void run()
  {
    long l = SystemClock.elapsedRealtime();
    if ((this.a.n) || (this.a.c == null) || (this.a.d == null) || (l > this.a.m + this.a.l))
    {
      this.a.a();
      this.a.b();
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\axe.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */