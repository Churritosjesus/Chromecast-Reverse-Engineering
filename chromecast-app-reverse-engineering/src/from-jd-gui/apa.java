import android.annotation.SuppressLint;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.print.PrintManager;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient.CustomViewCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.HashMap;

public final class apa
  extends j
{
  private WebView a;
  private View b;
  private WebChromeClient.CustomViewCallback c;
  
  public static apa a(String paramString)
  {
    apa localapa = new apa();
    Bundle localBundle = new Bundle();
    localBundle.putString("url", paramString);
    localapa.f(localBundle);
    return localapa;
  }
  
  private void r()
  {
    ((ViewGroup)this.N).removeView(this.b);
    this.b = null;
    this.c.onCustomViewHidden();
    this.c = null;
    this.a.setVisibility(0);
    ((apc)this.y).f();
  }
  
  @SuppressLint({"SetJavaScriptEnabled"})
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    this.a = new WebView(this.y);
    this.a.setWebChromeClient(new apb(this));
    if (paramBundle == null) {}
    for (paramLayoutInflater = this.m.getString("url");; paramLayoutInflater = paramBundle.getString("url"))
    {
      this.a.setWebViewClient(new WebViewClient());
      paramViewGroup = new HashMap(1);
      paramViewGroup.put("Accept-language", blj.a());
      this.a.getSettings().setJavaScriptEnabled(true);
      this.a.loadUrl(paramLayoutInflater, paramViewGroup);
      return this.a;
    }
  }
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    d(true);
  }
  
  public final boolean a(MenuItem paramMenuItem)
  {
    if (paramMenuItem.getItemId() == f.bP)
    {
      paramMenuItem = a(b.M);
      ((PrintManager)this.y.getSystemService("print")).print(paramMenuItem, this.a.createPrintDocumentAdapter(), null);
    }
    for (boolean bool = true;; bool = super.a(paramMenuItem)) {
      return bool;
    }
  }
  
  public final void e(Bundle paramBundle)
  {
    super.e(paramBundle);
    paramBundle.putString("url", this.a.getUrl());
  }
  
  public final void j()
  {
    super.j();
    if (Build.VERSION.SDK_INT >= 11) {
      this.a.onResume();
    }
  }
  
  public final void k()
  {
    super.k();
    if (Build.VERSION.SDK_INT >= 11) {
      this.a.onPause();
    }
  }
  
  public final boolean p()
  {
    if ((this.b != null) || (this.a.canGoBack())) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public final void q()
  {
    if (this.b != null) {
      r();
    }
    for (;;)
    {
      return;
      this.a.goBack();
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\apa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */