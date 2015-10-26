import android.os.SystemClock;

final class buc
  implements Runnable
{
  buc(bub parambub) {}
  
  public final void run()
  {
    this.a.a = false;
    long l = SystemClock.elapsedRealtime();
    boolean bool = this.a.a(l);
    this.a.a(bool);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\buc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */