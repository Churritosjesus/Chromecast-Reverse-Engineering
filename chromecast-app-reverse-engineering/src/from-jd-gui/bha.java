import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;

public final class bha
  extends j
{
  private azv Z;
  String a;
  private String aa;
  private blp b = new blp("DeviceHotspotManager", false);
  private Handler c = new Handler();
  private Runnable d;
  
  public static bha a(String paramString1, String paramString2)
  {
    bha localbha = new bha();
    Bundle localBundle = new Bundle();
    localBundle.putString("deviceHotspotSsid", paramString1);
    localBundle.putString("androidWifiSsid", paramString2);
    localbha.f(localBundle);
    return localbha;
  }
  
  public final void a(Activity paramActivity)
  {
    super.a(paramActivity);
    if (this.d != null) {
      this.c.removeCallbacks(this.d);
    }
    if (this.Z != null)
    {
      this.Z.a();
      this.Z = null;
    }
  }
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    c(true);
    this.aa = this.m.getString("deviceHotspotSsid");
    if (paramBundle != null) {}
    for (this.a = paramBundle.getString("androidWifiSsid");; this.a = this.m.getString("androidWifiSsid")) {
      return;
    }
  }
  
  public final void e(Bundle paramBundle)
  {
    super.e(paramBundle);
    paramBundle.putString("androidWifiSsid", this.a);
  }
  
  public final void h_()
  {
    super.h_();
    String str = this.a;
    if (TextUtils.isEmpty(str)) {}
    for (;;)
    {
      return;
      this.d = new bhb(this, str, this.y.getApplicationContext());
      this.c.postDelayed(this.d, e().getInteger(a.fl));
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bha.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */