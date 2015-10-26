import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class coz
  extends ThreadPoolExecutor
{
  public coz(cox paramcox)
  {
    super(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());
    setThreadFactory(new cpb());
  }
  
  protected final RunnableFuture newTaskFor(Runnable paramRunnable, Object paramObject)
  {
    return new cpa(this, paramRunnable, paramObject);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\coz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */