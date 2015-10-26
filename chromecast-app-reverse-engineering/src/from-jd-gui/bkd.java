import android.os.Bundle;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.widget.ImageView;
import com.google.android.apps.chromecast.app.SetupApplication;

final class bkd
  implements ViewTreeObserver.OnPreDrawListener
{
  bkd(bkc parambkc) {}
  
  public final boolean onPreDraw()
  {
    int i = bkc.a(this.a).getMeasuredHeight();
    String str = this.a.m.getString("tutorialImageUrl");
    SetupApplication.i().a(bks.a(0, i, str), this.a);
    return true;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bkd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */