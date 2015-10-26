import java.io.IOException;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

public final class bfg
  extends bfp
{
  String a;
  
  public bfg(String paramString)
  {
    super(paramString);
  }
  
  public final int a()
  {
    j = -3;
    new JSONObject();
    try
    {
      bfc localbfc = a("offer", c).c();
      i = j;
      if (localbfc != null)
      {
        if ("application/json".equals(localbfc.b)) {
          break label64;
        }
        i = j;
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
        i = j;
        if (str != null) {
          try
          {
            JSONObject localJSONObject = new org/json/JSONObject;
            localJSONObject.<init>(str);
            this.a = localJSONObject.optString("token", null);
            i = 0;
          }
          catch (JSONException localJSONException)
          {
            i = j;
          }
        }
      }
    }
    return i;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bfg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */