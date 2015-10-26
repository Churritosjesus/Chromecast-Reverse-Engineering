import android.content.IntentSender;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;

final class ol
  implements View.OnClickListener
{
  ol(oi paramoi) {}
  
  public final void onClick(View paramView)
  {
    int i = paramView.getId();
    if ((i == b.v) || (i == b.n))
    {
      if (oi.d(this.a).a())
      {
        oi.h(this.a);
        if (i == b.v) {}
        for (i = 2; (i < 0) || (i > 3); i = 1) {
          throw new IllegalArgumentException("Unsupported reason to unselect route");
        }
        tz.f();
        tz.a.a(tz.c(), i);
      }
      this.a.dismiss();
    }
    for (;;)
    {
      return;
      if (i == b.s)
      {
        if ((oi.f(this.a) != null) && (oi.i(this.a) != null)) {
          if (oi.i(this.a).a == 3) {
            oi.f(this.a).a().b();
          } else {
            oi.f(this.a).a().a();
          }
        }
      }
      else if (i == b.u)
      {
        paramView = oi.d(this.a).n;
        if (paramView != null) {
          try
          {
            paramView.sendIntent(null, 0, null, null, null);
            this.a.dismiss();
          }
          catch (Exception paramView)
          {
            Log.e("MediaRouteControllerDialog", "Error opening route settings.", paramView);
          }
        }
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\ol.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */