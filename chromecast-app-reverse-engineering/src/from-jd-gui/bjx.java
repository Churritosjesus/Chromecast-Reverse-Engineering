import android.os.Handler;
import android.support.v4.view.ViewPager;
import com.google.android.apps.chromecast.app.tutorial.TutorialOtaActivity;

public final class bjx
  implements Runnable
{
  public bjx(TutorialOtaActivity paramTutorialOtaActivity) {}
  
  public final void run()
  {
    int j = this.a.f.b;
    int i = this.a.e.b.length;
    this.a.f.a((j + 1) % i, true);
    TutorialOtaActivity.c(this.a).postDelayed(TutorialOtaActivity.a(this.a), TutorialOtaActivity.b(this.a));
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bjx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */