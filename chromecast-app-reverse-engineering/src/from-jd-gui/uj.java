import android.media.MediaRouter;
import android.media.MediaRouter.Callback;
import android.media.MediaRouter.RouteGroup;
import android.media.MediaRouter.RouteInfo;

public class uj
  extends MediaRouter.Callback
{
  public final ui a;
  
  public uj(ui paramui)
  {
    this.a = paramui;
  }
  
  public void onRouteAdded(MediaRouter paramMediaRouter, MediaRouter.RouteInfo paramRouteInfo)
  {
    this.a.b(paramRouteInfo);
  }
  
  public void onRouteChanged(MediaRouter paramMediaRouter, MediaRouter.RouteInfo paramRouteInfo)
  {
    this.a.d(paramRouteInfo);
  }
  
  public void onRouteGrouped(MediaRouter paramMediaRouter, MediaRouter.RouteInfo paramRouteInfo, MediaRouter.RouteGroup paramRouteGroup, int paramInt) {}
  
  public void onRouteRemoved(MediaRouter paramMediaRouter, MediaRouter.RouteInfo paramRouteInfo)
  {
    this.a.c(paramRouteInfo);
  }
  
  public void onRouteSelected(MediaRouter paramMediaRouter, int paramInt, MediaRouter.RouteInfo paramRouteInfo)
  {
    this.a.a(paramRouteInfo);
  }
  
  public void onRouteUngrouped(MediaRouter paramMediaRouter, MediaRouter.RouteInfo paramRouteInfo, MediaRouter.RouteGroup paramRouteGroup) {}
  
  public void onRouteUnselected(MediaRouter paramMediaRouter, int paramInt, MediaRouter.RouteInfo paramRouteInfo) {}
  
  public void onRouteVolumeChanged(MediaRouter paramMediaRouter, MediaRouter.RouteInfo paramRouteInfo)
  {
    this.a.e(paramRouteInfo);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\uj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */