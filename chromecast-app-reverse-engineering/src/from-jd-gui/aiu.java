import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebView;
import org.json.JSONException;
import org.json.JSONObject;

public class aiu
  extends ajq
{
  private static final String f = aiu.class.getName();
  private boolean g;
  
  public aiu(Context paramContext, String paramString1, String paramString2)
  {
    super(paramContext, paramString1);
    this.a = paramString2;
  }
  
  protected final Bundle a(String paramString)
  {
    Bundle localBundle = aji.b(Uri.parse(paramString).getQuery());
    paramString = localBundle.getString("bridge_args");
    localBundle.remove("bridge_args");
    if (!aji.a(paramString)) {}
    try
    {
      localObject = new org/json/JSONObject;
      ((JSONObject)localObject).<init>(paramString);
      localBundle.putBundle("com.facebook.platform.protocol.BRIDGE_ARGS", aib.a((JSONObject)localObject));
      localObject = localBundle.getString("method_results");
      localBundle.remove("method_results");
      if (!aji.a((String)localObject))
      {
        paramString = (String)localObject;
        if (aji.a((String)localObject)) {
          paramString = "{}";
        }
      }
    }
    catch (JSONException paramString)
    {
      try
      {
        Object localObject = new org/json/JSONObject;
        ((JSONObject)localObject).<init>(paramString);
        localBundle.putBundle("com.facebook.platform.protocol.RESULT_ARGS", aib.a((JSONObject)localObject));
        localBundle.remove("version");
        localBundle.putInt("com.facebook.platform.protocol.PROTOCOL_VERSION", aix.a());
        return localBundle;
        paramString = paramString;
        aji.a(f, "Unable to parse bridge_args JSON", paramString);
      }
      catch (JSONException paramString)
      {
        for (;;)
        {
          aji.a(f, "Unable to parse bridge_args JSON", paramString);
        }
      }
    }
  }
  
  public void cancel()
  {
    WebView localWebView = this.c;
    if ((!this.e) || (this.d) || (localWebView == null) || (!localWebView.isShown()))
    {
      super.cancel();
      return;
    }
    if (!this.g)
    {
      this.g = true;
      str = String.valueOf("(function() {  var event = document.createEvent('Event');  event.initEvent('fbPlatformDialogMustClose',true,true);  document.dispatchEvent(event);})();");
      if (str.length() == 0) {
        break label100;
      }
    }
    label100:
    for (String str = "javascript:".concat(str);; str = new String("javascript:"))
    {
      localWebView.loadUrl(str);
      new Handler(Looper.getMainLooper()).postDelayed(new aiv(this), 1500L);
      break;
      break;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\aiu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */