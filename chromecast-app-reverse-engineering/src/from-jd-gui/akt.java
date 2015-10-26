import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

public final class akt
{
  final ahe a;
  public String b;
  
  public akt(Context paramContext, String paramString)
  {
    this.b = paramString;
    this.a = ahe.a(paramContext, paramString);
  }
  
  static Bundle a(String paramString)
  {
    Bundle localBundle = new Bundle();
    localBundle.putLong("1_timestamp_ms", System.currentTimeMillis());
    localBundle.putString("0_auth_logger_id", paramString);
    localBundle.putString("3_method", "");
    localBundle.putString("2_result", "");
    localBundle.putString("5_error_message", "");
    localBundle.putString("4_error_code", "");
    localBundle.putString("6_extras", "");
    return localBundle;
  }
  
  public final void a(akl paramakl)
  {
    Bundle localBundle = a(paramakl.e);
    try
    {
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>();
      localJSONObject.put("login_behavior", paramakl.a.toString());
      localJSONObject.put("request_code", akh.b());
      localJSONObject.put("permissions", TextUtils.join(",", paramakl.b));
      localJSONObject.put("default_audience", paramakl.c.toString());
      localJSONObject.put("isReauthorize", paramakl.f);
      localBundle.putString("6_extras", localJSONObject.toString());
      this.a.a("fb_mobile_login_start", null, localBundle);
      return;
    }
    catch (JSONException paramakl)
    {
      for (;;) {}
    }
  }
  
  public final void a(String paramString1, String paramString2, String paramString3)
  {
    Bundle localBundle = a("");
    localBundle.putString("2_result", akp.c.d);
    localBundle.putString("5_error_message", paramString2);
    localBundle.putString("3_method", paramString3);
    this.a.a(paramString1, null, localBundle);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\akt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */