import android.os.Handler;
import java.util.concurrent.Executor;

final class adk
  implements Executor
{
  adk(aeb paramaeb, Handler paramHandler) {}
  
  public final void execute(Runnable paramRunnable)
  {
    this.a.post(paramRunnable);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\adk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */