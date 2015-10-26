import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageView;

final class ajw
  extends WebViewClient
{
  ajw(ajq paramajq) {}
  
  public final void onPageFinished(WebView paramWebView, String paramString)
  {
    super.onPageFinished(paramWebView, paramString);
    if (!ajq.b(this.a)) {
      ajq.c(this.a).dismiss();
    }
    ajq.d(this.a).setBackgroundColor(0);
    ajq.e(this.a).setVisibility(0);
    ajq.f(this.a).setVisibility(0);
    ajq.a(this.a, true);
  }
  
  public final void onPageStarted(WebView paramWebView, String paramString, Bitmap paramBitmap)
  {
    String str = String.valueOf(paramString);
    if (str.length() != 0) {}
    for (str = "Webview loading URL: ".concat(str);; str = new String("Webview loading URL: "))
    {
      aji.a("FacebookSDK.WebDialog", str);
      super.onPageStarted(paramWebView, paramString, paramBitmap);
      if (!ajq.b(this.a)) {
        ajq.c(this.a).show();
      }
      return;
    }
  }
  
  public final void onReceivedError(WebView paramWebView, int paramInt, String paramString1, String paramString2)
  {
    super.onReceivedError(paramWebView, paramInt, paramString1, paramString2);
    this.a.a(new afp(paramString1, paramInt, paramString2));
  }
  
  public final void onReceivedSslError(WebView paramWebView, SslErrorHandler paramSslErrorHandler, SslError paramSslError)
  {
    super.onReceivedSslError(paramWebView, paramSslErrorHandler, paramSslError);
    paramSslErrorHandler.cancel();
    this.a.a(new afp(null, -11, null));
  }
  
  public final boolean shouldOverrideUrlLoading(WebView paramWebView, String paramString)
  {
    paramWebView = String.valueOf(paramString);
    Bundle localBundle;
    Object localObject;
    if (paramWebView.length() != 0)
    {
      paramWebView = "Redirect URL: ".concat(paramWebView);
      aji.a("FacebookSDK.WebDialog", paramWebView);
      if (!paramString.startsWith(ajq.a(this.a))) {
        break label295;
      }
      localBundle = this.a.a(paramString);
      paramWebView = localBundle.getString("error");
      paramString = paramWebView;
      if (paramWebView == null) {
        paramString = localBundle.getString("error_type");
      }
      localObject = localBundle.getString("error_msg");
      paramWebView = (WebView)localObject;
      if (localObject == null) {
        paramWebView = localBundle.getString("error_message");
      }
      localObject = paramWebView;
      if (paramWebView == null) {
        localObject = localBundle.getString("error_description");
      }
      paramWebView = localBundle.getString("error_code");
      if (aji.a(paramWebView)) {
        break label361;
      }
    }
    for (;;)
    {
      int i;
      boolean bool;
      try
      {
        i = Integer.parseInt(paramWebView);
        if ((aji.a(paramString)) && (aji.a((String)localObject)) && (i == -1))
        {
          paramWebView = this.a;
          if ((paramWebView.b != null) && (!paramWebView.d))
          {
            paramWebView.d = true;
            paramWebView.b.a(localBundle, null);
            paramWebView.dismiss();
          }
          bool = true;
          return bool;
          paramWebView = new String("Redirect URL: ");
        }
      }
      catch (NumberFormatException paramWebView)
      {
        i = -1;
        continue;
        if ((paramString != null) && ((paramString.equals("access_denied")) || (paramString.equals("OAuthAccessDeniedException"))))
        {
          this.a.cancel();
          continue;
        }
        if (i == 4201)
        {
          this.a.cancel();
          continue;
        }
        paramWebView = new afs(i, paramString, (String)localObject);
        this.a.a(new afz(paramWebView, (String)localObject));
        continue;
      }
      label295:
      if (paramString.startsWith("fbconnect://cancel"))
      {
        this.a.cancel();
        bool = true;
      }
      else if (paramString.contains("touch"))
      {
        bool = false;
      }
      else
      {
        this.a.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(paramString)));
        bool = true;
        continue;
        label361:
        i = -1;
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\ajw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */