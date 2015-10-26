import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.Iterator;
import java.util.Set;

public final class bzd
  implements ServiceConnection
{
  public bzd(bzc parambzc) {}
  
  public final void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    synchronized (bza.a(this.a.h))
    {
      this.a.e = paramIBinder;
      this.a.g = paramComponentName;
      Iterator localIterator = this.a.b.iterator();
      if (localIterator.hasNext()) {
        ((ServiceConnection)localIterator.next()).onServiceConnected(paramComponentName, paramIBinder);
      }
    }
    this.a.c = 1;
  }
  
  public final void onServiceDisconnected(ComponentName paramComponentName)
  {
    synchronized (bza.a(this.a.h))
    {
      this.a.e = null;
      this.a.g = paramComponentName;
      Iterator localIterator = this.a.b.iterator();
      if (localIterator.hasNext()) {
        ((ServiceConnection)localIterator.next()).onServiceDisconnected(paramComponentName);
      }
    }
    this.a.c = 2;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bzd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */