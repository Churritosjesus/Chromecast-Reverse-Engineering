import android.support.v7.app.MediaRouteActionProvider;
import java.lang.ref.WeakReference;

public final class oa
  extends ua
{
  private final WeakReference a;
  
  public oa(MediaRouteActionProvider paramMediaRouteActionProvider)
  {
    this.a = new WeakReference(paramMediaRouteActionProvider);
  }
  
  private void d(tz paramtz)
  {
    MediaRouteActionProvider localMediaRouteActionProvider = (MediaRouteActionProvider)this.a.get();
    if (localMediaRouteActionProvider != null) {
      MediaRouteActionProvider.a(localMediaRouteActionProvider);
    }
    for (;;)
    {
      return;
      paramtz.a(this);
    }
  }
  
  public final void a(tz paramtz)
  {
    d(paramtz);
  }
  
  public final void a(tz paramtz, uh paramuh)
  {
    d(paramtz);
  }
  
  public final void b(tz paramtz)
  {
    d(paramtz);
  }
  
  public final void b(tz paramtz, uh paramuh)
  {
    d(paramtz);
  }
  
  public final void c(tz paramtz)
  {
    d(paramtz);
  }
  
  public final void c(tz paramtz, uh paramuh)
  {
    d(paramtz);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\oa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */