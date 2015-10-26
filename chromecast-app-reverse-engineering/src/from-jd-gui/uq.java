import android.media.MediaRouter;
import android.media.MediaRouter.RouteInfo;

public final class uq
  extends uj
{
  public uq(up paramup)
  {
    super(paramup);
  }
  
  public final void onRoutePresentationDisplayChanged(MediaRouter paramMediaRouter, MediaRouter.RouteInfo paramRouteInfo)
  {
    ((up)this.a).f(paramRouteInfo);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\uq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */