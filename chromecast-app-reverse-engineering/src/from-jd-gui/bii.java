import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.apps.chromecast.app.DeviceSettingsActivity;
import java.util.ArrayList;
import java.util.Iterator;

final class bii
  implements View.OnClickListener
{
  bii(bhf parambhf) {}
  
  public final void onClick(View paramView)
  {
    bhf.a(this.a).u = false;
    bhf.a(this.a).x();
    boolean bool = bhf.a(this.a).t();
    Object localObject1 = this.a;
    Object localObject2 = this.a;
    Iterator localIterator = ((bhf)localObject2).a.iterator();
    while (localIterator.hasNext())
    {
      paramView = (bfs)localIterator.next();
      if (paramView.a.equals(((bhf)localObject2).q().y))
      {
        bhf.a((bhf)localObject1, bmi.a(bool, paramView));
        bhf.c(this.a).a(bhf.a(this.a).b, "networkSelectorFragment");
        if (!bool) {
          break label144;
        }
        bhf.a(this.a).y();
      }
    }
    for (;;)
    {
      return;
      paramView = null;
      break;
      label144:
      localObject2 = bhf.a(this.a);
      localObject1 = bhf.a(this.a).p;
      paramView = new bij(this);
      if (((and)localObject2).t()) {
        paramView.a();
      } else {
        ((bdm)localObject1).a(4096, null, false, new anf((and)localObject2, (bdm)localObject1, paramView));
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bii.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */