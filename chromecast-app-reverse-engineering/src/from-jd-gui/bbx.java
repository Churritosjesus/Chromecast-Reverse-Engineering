import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import android.webkit.WebView;

public final class bbx
  extends j
{
  private String Z;
  private final blp a = new blp("OAuthFragment", false);
  private String aa;
  private String ab;
  private WebView ac;
  private bca ad;
  private r b;
  private String c;
  private String d;
  
  public static bbx a(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    bbx localbbx = new bbx();
    Bundle localBundle = new Bundle();
    localBundle.putString("appDeviceId", paramString1);
    localBundle.putString("oauthUrl", paramString2);
    localBundle.putString("webviewInterceptKeyword", paramString4);
    localBundle.putString("backdropDisplayId", paramString3);
    localbbx.f(localBundle);
    return localbbx;
  }
  
  @SuppressLint({"SetJavaScriptEnabled"})
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    paramLayoutInflater = paramLayoutInflater.inflate(a.go, null, false);
    this.ac = ((WebView)paramLayoutInflater.findViewById(f.cu));
    this.ac.getSettings().setJavaScriptEnabled(true);
    this.ac.setWebViewClient(new bcb(this));
    if (paramBundle != null) {
      this.ac.restoreState(paramBundle);
    }
    for (;;)
    {
      this.ac.setVisibility(0);
      return paramLayoutInflater;
      this.ac.loadUrl(this.Z);
    }
  }
  
  public final void a()
  {
    super.a();
    this.ad = null;
  }
  
  public final void a(Activity paramActivity)
  {
    super.a(paramActivity);
    this.ad = ((bca)paramActivity);
    paramActivity = CookieManager.getInstance();
    if (Build.VERSION.SDK_INT >= 21) {
      paramActivity.removeAllCookies(null);
    }
    for (;;)
    {
      return;
      paramActivity.removeAllCookie();
    }
  }
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    this.d = blf.z(this.y);
    this.b = this.x;
    this.Z = this.m.getString("oauthUrl");
    this.aa = this.m.getString("webviewInterceptKeyword");
    this.c = this.m.getString("appDeviceId");
    this.ab = this.m.getString("backdropDisplayId");
  }
  
  public final void e(Bundle paramBundle)
  {
    super.e(paramBundle);
    if (this.ac != null) {
      this.ac.saveState(paramBundle);
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bbx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */