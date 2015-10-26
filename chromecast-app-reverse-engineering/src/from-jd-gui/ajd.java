import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;

public abstract class ajd
  implements ServiceConnection
{
  public final Context a;
  public ajf b;
  public boolean c;
  int d;
  public final int e;
  private final Handler f;
  private Messenger g;
  private int h;
  private final String i;
  
  public ajd(Context paramContext, int paramInt1, int paramInt2, int paramInt3, String paramString)
  {
    Context localContext = paramContext.getApplicationContext();
    if (localContext != null) {
      paramContext = localContext;
    }
    this.a = paramContext;
    this.h = 65536;
    this.d = 65537;
    this.i = paramString;
    this.e = 20121101;
    this.f = new aje(this);
  }
  
  void a(Bundle paramBundle)
  {
    if (!this.c) {}
    for (;;)
    {
      return;
      this.c = false;
      ajf localajf = this.b;
      if (localajf != null) {
        localajf.a(paramBundle);
      }
    }
  }
  
  public void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    this.g = new Messenger(paramIBinder);
    paramComponentName = new Bundle();
    paramComponentName.putString("com.facebook.platform.extra.APPLICATION_ID", this.i);
    paramIBinder = Message.obtain(null, this.h);
    paramIBinder.arg1 = this.e;
    paramIBinder.setData(paramComponentName);
    paramIBinder.replyTo = new Messenger(this.f);
    try
    {
      this.g.send(paramIBinder);
      return;
    }
    catch (RemoteException paramComponentName)
    {
      for (;;)
      {
        a(null);
      }
    }
  }
  
  public void onServiceDisconnected(ComponentName paramComponentName)
  {
    this.g = null;
    try
    {
      this.a.unbindService(this);
      a(null);
      return;
    }
    catch (IllegalArgumentException paramComponentName)
    {
      for (;;) {}
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\ajd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */