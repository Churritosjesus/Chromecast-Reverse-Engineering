import android.os.RemoteException;
import android.util.Log;

final class de
  extends dc
{
  private cq a;
  
  public de(cq paramcq)
  {
    this.a = paramcq;
  }
  
  public final void a()
  {
    try
    {
      this.a.g();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Log.e("MediaControllerCompat", "Dead object in play. " + localRemoteException);
      }
    }
  }
  
  public final void b()
  {
    try
    {
      this.a.h();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Log.e("MediaControllerCompat", "Dead object in pause. " + localRemoteException);
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\de.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */