import android.content.Context;
import android.media.MediaRouter.RouteInfo;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.Display;
import java.util.ArrayList;

class vj
  extends vf
  implements up
{
  private uo o;
  private ur p;
  
  public vj(Context paramContext, vo paramvo)
  {
    super(paramContext, paramvo);
  }
  
  protected void a(vh paramvh, to paramto)
  {
    super.a(paramvh, paramto);
    if (!((MediaRouter.RouteInfo)paramvh.a).isEnabled()) {
      paramto.a.putBoolean("enabled", false);
    }
    if (a(paramvh)) {
      paramto.a.putBoolean("connecting", true);
    }
    paramvh = ((MediaRouter.RouteInfo)paramvh.a).getPresentationDisplay();
    if (paramvh != null) {
      paramto.f(paramvh.getDisplayId());
    }
  }
  
  protected boolean a(vh paramvh)
  {
    if (this.p == null) {
      this.p = new ur();
    }
    return this.p.a(paramvh.a);
  }
  
  protected void b()
  {
    super.b();
    if (this.o == null) {
      this.o = new uo(this.a, this.c);
    }
    uo localuo = this.o;
    int i;
    if (this.l)
    {
      i = this.k;
      if ((i & 0x2) == 0) {
        break label98;
      }
      if (!localuo.c)
      {
        if (localuo.b == null) {
          break label87;
        }
        localuo.c = true;
        localuo.a.post(localuo);
      }
    }
    for (;;)
    {
      return;
      i = 0;
      break;
      label87:
      Log.w("MediaRouterJellybeanMr1", "Cannot scan for wifi displays because the DisplayManager.scanWifiDisplays() method is not available on this device.");
      continue;
      label98:
      if (localuo.c)
      {
        localuo.c = false;
        localuo.a.removeCallbacks(localuo);
      }
    }
  }
  
  protected final Object c()
  {
    return new uq(this);
  }
  
  public final void f(Object paramObject)
  {
    int i = g(paramObject);
    vh localvh;
    if (i >= 0)
    {
      localvh = (vh)this.n.get(i);
      paramObject = ((MediaRouter.RouteInfo)paramObject).getPresentationDisplay();
      if (paramObject == null) {
        break label77;
      }
    }
    label77:
    for (i = ((Display)paramObject).getDisplayId();; i = -1)
    {
      if (i != localvh.c.o())
      {
        localvh.c = new to(localvh.c).f(i).a();
        a();
      }
      return;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\vj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */