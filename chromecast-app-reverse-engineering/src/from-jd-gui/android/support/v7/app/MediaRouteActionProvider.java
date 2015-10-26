package android.support.v7.app;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import fb;
import oa;
import ob;
import op;
import tx;
import tz;

public class MediaRouteActionProvider
  extends fb
{
  public ob c;
  private final tz d;
  private tx e = tx.c;
  private op f = op.a();
  
  public MediaRouteActionProvider(Context paramContext)
  {
    super(paramContext);
    this.d = tz.a(paramContext);
    new oa(this);
  }
  
  public View a()
  {
    if (this.c != null) {
      Log.e("MediaRouteActionProvider", "onCreateActionView: this ActionProvider is already associated with a menu item. Don't reuse MediaRouteActionProvider instances! Abandoning the old menu item...");
    }
    this.c = new ob(this.a);
    this.c.e = true;
    ob localob = this.c;
    tx localtx = this.e;
    if (localtx == null) {
      throw new IllegalArgumentException("selector must not be null");
    }
    if (!localob.c.equals(localtx))
    {
      if (localob.d)
      {
        if (!localob.c.c()) {
          localob.a.a(localob.b);
        }
        if (!localtx.c()) {
          localob.a.a(localtx, localob.b, 0);
        }
      }
      localob.c = localtx;
      localob.b();
    }
    this.c.a(this.f);
    this.c.setLayoutParams(new ViewGroup.LayoutParams(-2, -1));
    return this.c;
  }
  
  public final boolean b()
  {
    return true;
  }
  
  public final boolean c()
  {
    return tz.a(this.e, 1);
  }
  
  public final boolean e()
  {
    if (this.c != null) {}
    for (boolean bool = this.c.a();; bool = false) {
      return bool;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\android\support\v7\app\MediaRouteActionProvider.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */