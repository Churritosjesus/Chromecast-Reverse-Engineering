import android.util.Log;
import java.util.concurrent.FutureTask;

final class cpa
  extends FutureTask
{
  cpa(coz paramcoz, Runnable paramRunnable, Object paramObject)
  {
    super(paramRunnable, paramObject);
  }
  
  protected final void setException(Throwable paramThrowable)
  {
    Thread.UncaughtExceptionHandler localUncaughtExceptionHandler = cox.b(this.a.a);
    if (localUncaughtExceptionHandler != null) {
      localUncaughtExceptionHandler.uncaughtException(Thread.currentThread(), paramThrowable);
    }
    for (;;)
    {
      super.setException(paramThrowable);
      return;
      if (Log.isLoggable("GAv4", 6)) {
        Log.e("GAv4", "MeasurementExecutor: job failed with " + paramThrowable);
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cpa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */