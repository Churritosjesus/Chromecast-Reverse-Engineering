import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.apps.chromecast.app.SetupApplication;
import java.util.List;

final class bmw
  implements View.OnClickListener
{
  bmw(bmu parambmu, aow paramaow) {}
  
  public final void onClick(View paramView)
  {
    paramView = this.a;
    if (paramView.s())
    {
      paramView.m = true;
      paramView.n = (paramView.l.size() - 1);
      paramView.p();
    }
    aow localaow = this.a;
    paramView = SetupApplication.a().j.a(localaow);
    if (paramView != null) {
      paramView.g();
    }
    for (;;)
    {
      this.b.a(this.a);
      return;
      localaow.g();
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bmw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */