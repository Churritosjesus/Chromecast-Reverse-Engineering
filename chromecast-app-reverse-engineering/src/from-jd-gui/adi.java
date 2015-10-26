import android.os.Process;
import java.util.concurrent.BlockingQueue;

public final class adi
  extends Thread
{
  private static final boolean b = aeg.a;
  volatile boolean a = false;
  private final BlockingQueue c;
  private final BlockingQueue d;
  private final adg e;
  private final aeb f;
  
  public adi(BlockingQueue paramBlockingQueue1, BlockingQueue paramBlockingQueue2, adg paramadg, aeb paramaeb)
  {
    this.c = paramBlockingQueue1;
    this.d = paramBlockingQueue2;
    this.e = paramadg;
    this.f = paramaeb;
  }
  
  public final void run()
  {
    if (b) {
      aeg.a("start new dispatcher", new Object[0]);
    }
    Process.setThreadPriority(10);
    this.e.a();
    for (;;)
    {
      try
      {
        ads localads = (ads)this.c.take();
        localads.a("cache-queue-take");
        if (!localads.g) {
          break label73;
        }
        localads.b("cache-discard-canceled");
        continue;
        if (!this.a) {
          continue;
        }
      }
      catch (InterruptedException localInterruptedException) {}
      return;
      label73:
      Object localObject2 = this.e.a(localInterruptedException.b);
      if (localObject2 == null)
      {
        localInterruptedException.a("cache-miss");
        this.d.put(localInterruptedException);
      }
      else
      {
        if (((adh)localObject2).e < System.currentTimeMillis()) {}
        for (int i = 1;; i = 0)
        {
          if (i == 0) {
            break label159;
          }
          localInterruptedException.a("cache-hit-expired");
          localInterruptedException.j = ((adh)localObject2);
          this.d.put(localInterruptedException);
          break;
        }
        label159:
        localInterruptedException.a("cache-hit");
        Object localObject1 = new adp;
        ((adp)localObject1).<init>(((adh)localObject2).a, ((adh)localObject2).g);
        localObject1 = localInterruptedException.a((adp)localObject1);
        localInterruptedException.a("cache-hit-parsed");
        if (((adh)localObject2).f < System.currentTimeMillis()) {}
        for (i = 1;; i = 0)
        {
          if (i != 0) {
            break label230;
          }
          this.f.a(localInterruptedException, (ady)localObject1);
          break;
        }
        label230:
        localInterruptedException.a("cache-hit-refresh-needed");
        localInterruptedException.j = ((adh)localObject2);
        ((ady)localObject1).d = true;
        localObject2 = this.f;
        adj localadj = new adj;
        localadj.<init>(this, localInterruptedException);
        ((aeb)localObject2).a(localInterruptedException, (ady)localObject1, localadj);
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\adi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */