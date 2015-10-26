import android.text.TextUtils;
import android.webkit.WebView;
import android.webkit.WebViewClient;

final class bcb
  extends WebViewClient
{
  bcb(bbx parambbx) {}
  
  public final boolean shouldOverrideUrlLoading(WebView paramWebView, String paramString)
  {
    if ((!TextUtils.isEmpty(bbx.d(this.a))) && (paramString.startsWith(bbx.d(this.a))))
    {
      bbx.e(this.a).stopLoading();
      bbx.e(this.a).setVisibility(8);
      bbx.a(this.a, paramString);
    }
    for (boolean bool = true;; bool = false)
    {
      return bool;
      paramWebView.loadUrl(paramString);
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bcb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */