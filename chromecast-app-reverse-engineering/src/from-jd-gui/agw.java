import android.content.Context;
import android.content.SharedPreferences;
import org.json.JSONException;
import org.json.JSONObject;

final class agw
{
  final SharedPreferences a = afv.f().getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0);
  
  final agt a()
  {
    Object localObject1 = this.a.getString("com.facebook.ProfileManager.CachedProfile", null);
    if (localObject1 != null) {}
    for (;;)
    {
      try
      {
        JSONObject localJSONObject = new org/json/JSONObject;
        localJSONObject.<init>((String)localObject1);
        localObject1 = new agt;
        ((agt)localObject1).<init>(localJSONObject);
        return (agt)localObject1;
      }
      catch (JSONException localJSONException) {}
      Object localObject2 = null;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\agw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */