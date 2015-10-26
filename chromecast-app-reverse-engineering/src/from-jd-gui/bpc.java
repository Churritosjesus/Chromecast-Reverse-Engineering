import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

final class bpc
  extends Thread
{
  CountDownLatch a;
  boolean b;
  private WeakReference c;
  private long d;
  
  public bpc(bpa parambpa, long paramLong)
  {
    this.c = new WeakReference(parambpa);
    this.d = paramLong;
    this.a = new CountDownLatch(1);
    this.b = false;
    start();
  }
  
  private void a()
  {
    bpa localbpa = (bpa)this.c.get();
    if (localbpa != null)
    {
      localbpa.a();
      this.b = true;
    }
  }
  
  public final void run()
  {
    try
    {
      if (!this.a.await(this.d, TimeUnit.MILLISECONDS)) {
        a();
      }
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      for (;;)
      {
        a();
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bpc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */