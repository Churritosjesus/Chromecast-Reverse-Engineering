import android.os.Handler;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;

final class da
  implements cy
{
  private cq a;
  private dc b;
  
  public da(dm paramdm)
  {
    this.a = cr.a((IBinder)paramdm.a);
  }
  
  public final dc a()
  {
    if (this.b == null) {
      this.b = new de(this.a);
    }
    return this.b;
  }
  
  public final void a(cu paramcu)
  {
    if (paramcu == null) {
      throw new IllegalArgumentException("callback may not be null.");
    }
    try
    {
      this.a.b((cn)cu.c(paramcu));
      this.a.asBinder().unlinkToDeath(paramcu, 0);
      cu.a(paramcu, false);
      return;
    }
    catch (RemoteException paramcu)
    {
      for (;;)
      {
        Log.e("MediaControllerCompat", "Dead object in unregisterCallback. " + paramcu);
      }
    }
  }
  
  public final void a(cu paramcu, Handler paramHandler)
  {
    if (paramcu == null) {
      throw new IllegalArgumentException("callback may not be null.");
    }
    try
    {
      this.a.asBinder().linkToDeath(paramcu, 0);
      this.a.a((cn)cu.c(paramcu));
      cu.a(paramcu, paramHandler);
      cu.a(paramcu, true);
      return;
    }
    catch (RemoteException paramHandler)
    {
      for (;;)
      {
        Log.e("MediaControllerCompat", "Dead object in registerCallback. " + paramHandler);
        paramcu.a();
      }
    }
  }
  
  public final dq b()
  {
    try
    {
      dq localdq = this.a.o();
      return localdq;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Log.e("MediaControllerCompat", "Dead object in getPlaybackState. " + localRemoteException);
        Object localObject = null;
      }
    }
  }
  
  public final ci c()
  {
    try
    {
      ci localci = this.a.n();
      return localci;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Log.e("MediaControllerCompat", "Dead object in getMetadata. " + localRemoteException);
        Object localObject = null;
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\da.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */