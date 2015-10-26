import android.content.Context;
import android.media.MediaRouter;
import android.media.MediaRouter.Callback;
import android.media.MediaRouter.RouteInfo;
import android.media.MediaRouter.UserRouteInfo;
import android.os.Bundle;

final class vk
  extends vj
{
  public vk(Context paramContext, vo paramvo)
  {
    super(paramContext, paramvo);
  }
  
  protected final void a(vh paramvh, to paramto)
  {
    super.a(paramvh, paramto);
    paramvh = ((MediaRouter.RouteInfo)paramvh.a).getDescription();
    if (paramvh != null)
    {
      paramvh = paramvh.toString();
      paramto.a.putString("status", paramvh);
    }
  }
  
  protected final void a(vi paramvi)
  {
    super.a(paramvi);
    Object localObject = paramvi.b;
    paramvi = paramvi.a.d;
    ((MediaRouter.UserRouteInfo)localObject).setDescription(paramvi);
  }
  
  protected final boolean a(vh paramvh)
  {
    return ((MediaRouter.RouteInfo)paramvh.a).isConnecting();
  }
  
  protected final void b()
  {
    int i = 1;
    if (this.m) {
      a.a(this.i, this.j);
    }
    this.m = true;
    Object localObject1 = this.i;
    int j = this.k;
    Object localObject2 = this.j;
    if (this.l) {}
    for (;;)
    {
      ((MediaRouter)localObject1).addCallback(j, (MediaRouter.Callback)localObject2, i | 0x2);
      return;
      i = 0;
    }
  }
  
  protected final Object d()
  {
    return ((MediaRouter)this.i).getDefaultRoute();
  }
  
  protected final void h(Object paramObject)
  {
    ((MediaRouter)this.i).selectRoute(8388611, (MediaRouter.RouteInfo)paramObject);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\vk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */