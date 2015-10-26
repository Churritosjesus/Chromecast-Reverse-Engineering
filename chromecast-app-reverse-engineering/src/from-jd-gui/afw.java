import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

final class afw
  implements ThreadFactory
{
  private final AtomicInteger a = new AtomicInteger(0);
  
  public final Thread newThread(Runnable paramRunnable)
  {
    int i = this.a.incrementAndGet();
    return new Thread(paramRunnable, 24 + "FacebookSdk #" + i);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\afw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */