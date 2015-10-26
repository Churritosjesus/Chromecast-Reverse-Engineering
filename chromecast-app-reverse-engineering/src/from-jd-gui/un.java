import android.media.MediaRouter.RouteInfo;
import android.media.MediaRouter.VolumeCallback;

public final class un
  extends MediaRouter.VolumeCallback
{
  private um a;
  
  public un(um paramum)
  {
    this.a = paramum;
  }
  
  public final void onVolumeSetRequest(MediaRouter.RouteInfo paramRouteInfo, int paramInt)
  {
    this.a.a(paramRouteInfo, paramInt);
  }
  
  public final void onVolumeUpdateRequest(MediaRouter.RouteInfo paramRouteInfo, int paramInt)
  {
    this.a.b(paramRouteInfo, paramInt);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\un.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */