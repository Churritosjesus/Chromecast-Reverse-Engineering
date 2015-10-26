import android.content.Context;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.concurrent.LinkedBlockingQueue;

final class cvm
  extends Thread
  implements cvl
{
  private static cvm d;
  private final LinkedBlockingQueue a = new LinkedBlockingQueue();
  private volatile boolean b = false;
  private volatile boolean c = false;
  private volatile cvo e;
  private final Context f;
  
  private cvm(Context paramContext)
  {
    super("GAThread");
    if (paramContext != null) {}
    for (this.f = paramContext.getApplicationContext();; this.f = paramContext)
    {
      start();
      return;
    }
  }
  
  static cvm a(Context paramContext)
  {
    if (d == null) {
      d = new cvm(paramContext);
    }
    return d;
  }
  
  public final void a(Runnable paramRunnable)
  {
    this.a.add(paramRunnable);
  }
  
  public final void a(String paramString)
  {
    a(new cvn(this, this, System.currentTimeMillis(), paramString));
  }
  
  public final void run()
  {
    for (;;)
    {
      boolean bool = this.c;
      try
      {
        Runnable localRunnable = (Runnable)this.a.take();
        if (!this.b) {
          localRunnable.run();
        }
      }
      catch (InterruptedException localInterruptedException)
      {
        cuh.c(localInterruptedException.toString());
      }
      catch (Throwable localThrowable)
      {
        StringBuilder localStringBuilder = new StringBuilder("Error on Google TagManager Thread: ");
        ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream localPrintStream = new PrintStream(localByteArrayOutputStream);
        localThrowable.printStackTrace(localPrintStream);
        localPrintStream.flush();
        cuh.a(new String(localByteArrayOutputStream.toByteArray()));
        cuh.a("Google TagManager is shutting down.");
        this.b = true;
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cvm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */