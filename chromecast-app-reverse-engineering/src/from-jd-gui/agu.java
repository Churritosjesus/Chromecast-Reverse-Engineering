import android.net.Uri;
import org.json.JSONObject;

final class agu
  implements ajo
{
  public final void a(afq paramafq) {}
  
  public final void a(JSONObject paramJSONObject)
  {
    String str1 = paramJSONObject.optString("id");
    if (str1 == null) {
      return;
    }
    String str6 = paramJSONObject.optString("link");
    String str4 = paramJSONObject.optString("first_name");
    String str3 = paramJSONObject.optString("middle_name");
    String str2 = paramJSONObject.optString("last_name");
    String str5 = paramJSONObject.optString("name");
    if (str6 != null) {}
    for (paramJSONObject = Uri.parse(str6);; paramJSONObject = null)
    {
      agt.a(new agt(str1, str4, str3, str2, str5, paramJSONObject));
      break;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\agu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */