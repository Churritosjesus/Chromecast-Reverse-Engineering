import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.apps.chromecast.app.DeviceSettingsActivity;

final class bnk
  implements View.OnClickListener
{
  bnk(bmu parambmu, dcw paramdcw, aow paramaow, String paramString, View paramView) {}
  
  public final void onClick(View paramView)
  {
    if (this.a.b() == dco.c)
    {
      boolean bool = this.e.e.a(this.b.j);
      paramView = DeviceSettingsActivity.a(this.e.h, this.b.f(), this.b.n(), this.b.c, bool, this.b.j, this.b.k);
      this.e.h.startActivity(paramView);
      return;
    }
    ape localape;
    if (!TextUtils.isEmpty(this.c))
    {
      paramView = asr.a(this.c, this.d.getContext());
      this.d.getContext().startActivity(paramView);
      paramView = this.b.o().e;
      localape = ape.a();
      if (paramView != null) {
        break label169;
      }
    }
    label169:
    for (int i = 0;; i = paramView.b)
    {
      localape.a(new apd(65, Integer.valueOf(i)));
      break;
      break;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bnk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */