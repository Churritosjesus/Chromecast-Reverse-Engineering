import java.io.IOException;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

public final class bdo
  extends bfp
{
  String a;
  String b;
  private final String j;
  
  public bdo(String paramString1, String paramString2)
  {
    super(paramString1);
    this.j = paramString2;
  }
  
  public final int a()
  {
    int k = -3;
    Object localObject = new JSONObject();
    try
    {
      ((JSONObject)localObject).put("app_id", this.j);
      try
      {
        localObject = a("get_app_device_id", bfc.a((JSONObject)localObject), c).c();
        i = k;
        if (localObject != null)
        {
          if ("application/json".equals(((bfc)localObject).b)) {
            break label79;
          }
          i = k;
        }
      }
      catch (IOException localIOException)
      {
        for (;;)
        {
          i = -1;
        }
      }
      catch (TimeoutException localTimeoutException)
      {
        for (;;)
        {
          int i = -2;
          continue;
          String str = localTimeoutException.a();
          i = k;
          if (str != null) {
            try
            {
              JSONObject localJSONObject = new org/json/JSONObject;
              localJSONObject.<init>(str);
              this.a = localJSONObject.optString("app_device_id", null);
              this.b = localJSONObject.optString("certificate", null);
              localJSONObject.optString("signed_data", null);
              i = 0;
            }
            catch (JSONException localJSONException1)
            {
              i = k;
            }
          }
        }
      }
      return i;
    }
    catch (JSONException localJSONException2)
    {
      label79:
      for (;;) {}
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bdo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */