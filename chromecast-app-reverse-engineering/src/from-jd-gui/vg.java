import android.media.MediaRouter.RouteInfo;

public final class vg
  extends tu
{
  private final Object a;
  
  public vg(vf paramvf, Object paramObject)
  {
    this.a = paramObject;
  }
  
  public final void b(int paramInt)
  {
    ((MediaRouter.RouteInfo)this.a).requestSetVolume(paramInt);
  }
  
  public final void c(int paramInt)
  {
    ((MediaRouter.RouteInfo)this.a).requestUpdateVolume(paramInt);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\vg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */