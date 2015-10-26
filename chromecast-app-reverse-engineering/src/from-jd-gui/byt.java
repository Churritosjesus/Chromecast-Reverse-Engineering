import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;

public final class byt
  implements ServiceConnection
{
  public byt(byo parambyo) {}
  
  public final void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    a.f(paramIBinder, "Expecting a valid IBinder");
    byo.a(this.a, bzm.a(paramIBinder));
    paramComponentName = this.a;
    paramComponentName.i.sendMessage(paramComponentName.i.obtainMessage(6, new byv(paramComponentName)));
  }
  
  public final void onServiceDisconnected(ComponentName paramComponentName)
  {
    this.a.i.sendMessage(this.a.i.obtainMessage(4, Integer.valueOf(1)));
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\byt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */