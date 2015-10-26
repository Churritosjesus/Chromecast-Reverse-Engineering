import android.os.Looper;

final class bsc
  implements Runnable
{
  bsc(bsb parambsb) {}
  
  public final void run()
  {
    if (Looper.myLooper() == Looper.getMainLooper()) {
      bsb.a(this.a).b().a(this);
    }
    for (;;)
    {
      return;
      boolean bool = this.a.b();
      bsb.a(this.a, 0L);
      if ((bool) && (!bsb.b(this.a))) {
        this.a.a();
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bsc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */