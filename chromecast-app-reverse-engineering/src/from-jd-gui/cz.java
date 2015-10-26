import android.content.Context;
import android.media.session.MediaController;
import android.media.session.MediaController.Callback;
import android.media.session.MediaSession.Token;
import android.os.Handler;
import android.os.RemoteException;

final class cz
  implements cy
{
  private final Object a;
  
  public cz(Context paramContext, dm paramdm)
  {
    this.a = new MediaController(paramContext, (MediaSession.Token)paramdm.a);
    if (this.a == null) {
      throw new RemoteException();
    }
  }
  
  public final dc a()
  {
    Object localObject = ((MediaController)this.a).getTransportControls();
    if (localObject != null) {}
    for (localObject = new dd(localObject);; localObject = null) {
      return (dc)localObject;
    }
  }
  
  public final void a(cu paramcu)
  {
    Object localObject = this.a;
    paramcu = cu.c(paramcu);
    ((MediaController)localObject).unregisterCallback((MediaController.Callback)paramcu);
  }
  
  public final void a(cu paramcu, Handler paramHandler)
  {
    Object localObject = this.a;
    paramcu = cu.c(paramcu);
    ((MediaController)localObject).registerCallback((MediaController.Callback)paramcu, paramHandler);
  }
  
  public final dq b()
  {
    Object localObject = ((MediaController)this.a).getPlaybackState();
    if (localObject != null) {}
    for (localObject = dq.a(localObject);; localObject = null) {
      return (dq)localObject;
    }
  }
  
  public final ci c()
  {
    Object localObject = ((MediaController)this.a).getMetadata();
    if (localObject != null) {}
    for (localObject = ci.a(localObject);; localObject = null) {
      return (ci)localObject;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */