import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicBoolean;

final class ahz
  implements ServiceConnection
{
  AtomicBoolean a = new AtomicBoolean(false);
  final BlockingQueue b = new LinkedBlockingDeque();
  
  public final void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    try
    {
      this.b.put(paramIBinder);
      return;
    }
    catch (InterruptedException paramComponentName)
    {
      for (;;) {}
    }
  }
  
  public final void onServiceDisconnected(ComponentName paramComponentName) {}
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\ahz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */