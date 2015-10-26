import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.apps.chromecast.app.SetupApplication;

public final class aqu
  extends j
{
  private boolean Z;
  private blp a;
  private alm aa;
  private tz b;
  private ua c;
  private long d;
  
  private void p()
  {
    this.Z = false;
    if ((this.b != null) && (this.c != null))
    {
      aqi localaqi = aqi.a();
      if (localaqi.a) {
        localaqi.a = false;
      }
      this.b.a(this.c);
      this.c = null;
    }
  }
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    this.a = new blp("BackdropDeviceScanner");
    c(true);
    this.b = tz.a(this.y);
    this.aa = SetupApplication.a().b();
  }
  
  public final void g_()
  {
    super.g_();
  }
  
  public final void j()
  {
    super.j();
    if (!this.Z)
    {
      this.Z = true;
      tx localtx = new ty().a("com.google.android.gms.cast.CATEGORY_CAST").a();
      this.c = new aqv(this);
      aqi localaqi = aqi.a();
      if (!localaqi.a) {
        localaqi.a = true;
      }
      this.d = SystemClock.elapsedRealtime();
      this.b.a(localtx, this.c, 1);
    }
  }
  
  public final void k()
  {
    super.k();
    if (Build.VERSION.SDK_INT >= 11) {
      if (!this.y.isChangingConfigurations()) {
        p();
      }
    }
    for (;;)
    {
      return;
      if (this.y.isFinishing()) {
        p();
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\aqu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */