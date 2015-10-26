import android.os.Bundle;
import org.json.JSONException;
import org.json.JSONObject;

final class akc
  implements ajo
{
  akc(aka paramaka, Bundle paramBundle, akl paramakl) {}
  
  public final void a(afq paramafq)
  {
    this.c.b.b(akn.a(this.c.b.f, "Caught exception", paramafq.getMessage()));
  }
  
  public final void a(JSONObject paramJSONObject)
  {
    try
    {
      paramJSONObject = paramJSONObject.getString("id");
      this.a.putString("com.facebook.platform.extra.USER_ID", paramJSONObject);
      this.c.b(this.b, this.a);
      return;
    }
    catch (JSONException paramJSONObject)
    {
      for (;;)
      {
        this.c.b.b(akn.a(this.c.b.f, "Caught exception", paramJSONObject.getMessage()));
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\akc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */