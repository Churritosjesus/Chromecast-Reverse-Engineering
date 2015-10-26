import android.app.AlertDialog.Builder;
import android.webkit.WebView;
import android.webkit.WebViewClient;

final class aog
  extends WebViewClient
{
  aog(and paramand, WebView paramWebView) {}
  
  public final void onPageFinished(WebView paramWebView, String paramString)
  {
    this.b.w();
    new AlertDialog.Builder(this.b).setTitle(b.ci).setView(this.a).setPositiveButton(b.I, null).show();
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\aog.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */