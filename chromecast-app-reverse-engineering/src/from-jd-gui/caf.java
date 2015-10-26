import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public final class caf
  implements ServiceConnection
{
  private boolean a = false;
  private final BlockingQueue b = new LinkedBlockingQueue();
  
  public final IBinder a()
  {
    if (Looper.myLooper() == Looper.getMainLooper()) {
      throw new IllegalStateException("BlockingServiceConnection.getService() called on main thread");
    }
    if (this.a) {
      throw new IllegalStateException();
    }
    this.a = true;
    return (IBinder)this.b.take();
  }
  
  public final void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    this.b.add(paramIBinder);
  }
  
  public final void onServiceDisconnected(ComponentName paramComponentName) {}
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\caf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */