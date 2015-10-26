import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebChromeClient.CustomViewCallback;
import android.webkit.WebView;

final class apb
  extends WebChromeClient
{
  apb(apa paramapa) {}
  
  public final View getVideoLoadingProgressView()
  {
    View localView = this.a.b(null).inflate(a.gB, null);
    localView.findViewById(f.dd).setVisibility(8);
    return localView;
  }
  
  public final void onHideCustomView()
  {
    if (apa.a(this.a) != null) {
      apa.d(this.a);
    }
  }
  
  public final void onShowCustomView(View paramView, WebChromeClient.CustomViewCallback paramCustomViewCallback)
  {
    ViewGroup localViewGroup = (ViewGroup)this.a.N;
    if (apa.a(this.a) != null)
    {
      localViewGroup.removeView(apa.a(this.a));
      apa.b(this.a).onCustomViewHidden();
    }
    apa.c(this.a).setVisibility(8);
    apa.a(this.a, paramView);
    apa.a(this.a, paramCustomViewCallback);
    localViewGroup.addView(apa.a(this.a));
    ((apc)this.a.y).c_();
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\apb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */