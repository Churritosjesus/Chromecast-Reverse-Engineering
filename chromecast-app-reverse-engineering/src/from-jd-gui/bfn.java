import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

public final class bfn
  extends bfp
{
  private static final int b = (int)TimeUnit.SECONDS.toMillis(40L);
  public String a;
  private final String j;
  
  public bfn(String paramString1, String paramString2)
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
      ((JSONObject)localObject).put("uuid", this.j);
      try
      {
        localObject = a("send_log_report", bfc.a((JSONObject)localObject), b).c();
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
              this.a = localJSONObject.optString("crash_report_id", null);
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


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bfn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */