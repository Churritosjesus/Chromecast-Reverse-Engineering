import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

final class cpb
  implements ThreadFactory
{
  private static final AtomicInteger a = new AtomicInteger();
  
  public final Thread newThread(Runnable paramRunnable)
  {
    return new cpc(paramRunnable, "measurement-" + a.incrementAndGet());
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cpb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */