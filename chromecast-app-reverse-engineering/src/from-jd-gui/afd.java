import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import java.util.Date;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

final class afd
{
  final SharedPreferences a;
  private final afe b;
  private agr c;
  
  public afd()
  {
    this(afv.f().getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0), new afe());
  }
  
  private afd(SharedPreferences paramSharedPreferences, afe paramafe)
  {
    this.a = paramSharedPreferences;
    this.b = paramafe;
  }
  
  private afb c()
  {
    Object localObject3 = null;
    String str = this.a.getString("com.facebook.AccessTokenManager.CachedAccessToken", null);
    Object localObject1 = localObject3;
    if (str != null) {}
    try
    {
      localObject1 = new org/json/JSONObject;
      ((JSONObject)localObject1).<init>(str);
      localObject1 = afb.a((JSONObject)localObject1);
      return (afb)localObject1;
    }
    catch (JSONException localJSONException)
    {
      for (;;)
      {
        Object localObject2 = localObject3;
      }
    }
  }
  
  public final afb a()
  {
    Object localObject3 = null;
    Object localObject2 = null;
    if (this.a.contains("com.facebook.AccessTokenManager.CachedAccessToken")) {
      localObject2 = c();
    }
    for (;;)
    {
      return (afb)localObject2;
      if (afv.c())
      {
        localObject2 = b().a();
        Object localObject1 = localObject3;
        if (localObject2 != null)
        {
          localObject1 = localObject3;
          if (agr.a((Bundle)localObject2)) {
            localObject1 = afb.a((Bundle)localObject2);
          }
        }
        localObject2 = localObject1;
        if (localObject1 != null)
        {
          a((afb)localObject1);
          b().b();
          localObject2 = localObject1;
        }
      }
    }
  }
  
  public final void a(afb paramafb)
  {
    ajp.a(paramafb, "accessToken");
    try
    {
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>();
      localJSONObject.put("version", 1);
      localJSONObject.put("token", paramafb.d);
      localJSONObject.put("expires_at", paramafb.a.getTime());
      JSONArray localJSONArray = new org/json/JSONArray;
      localJSONArray.<init>(paramafb.b);
      localJSONObject.put("permissions", localJSONArray);
      localJSONArray = new org/json/JSONArray;
      localJSONArray.<init>(paramafb.c);
      localJSONObject.put("declined_permissions", localJSONArray);
      localJSONObject.put("last_refresh", paramafb.f.getTime());
      localJSONObject.put("source", paramafb.e.name());
      localJSONObject.put("application_id", paramafb.g);
      localJSONObject.put("user_id", paramafb.h);
      this.a.edit().putString("com.facebook.AccessTokenManager.CachedAccessToken", localJSONObject.toString()).apply();
      return;
    }
    catch (JSONException paramafb)
    {
      for (;;) {}
    }
  }
  
  agr b()
  {
    if (this.c == null) {}
    try
    {
      if (this.c == null)
      {
        agr localagr = new agr;
        localagr.<init>(afv.f());
        this.c = localagr;
      }
      return this.c;
    }
    finally {}
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\afd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */