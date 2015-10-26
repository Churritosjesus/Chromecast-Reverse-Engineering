import java.io.IOException;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

public final class bfh
  extends bfp
{
  private int a;
  
  public bfh(String paramString, int paramInt)
  {
    super(paramString);
    this.a = paramInt;
  }
  
  public final int a()
  {
    int i = -1;
    Object localObject = new JSONObject();
    try
    {
      ((JSONObject)localObject).put("sound_id", this.a);
      try
      {
        localObject = a("play_sound", bfc.a((JSONObject)localObject), c);
        if (((bfq)localObject).b() != 200) {}
        for (;;)
        {
          return i;
          localObject = ((bfq)localObject).c();
          if ((localObject != null) && ("application/json".equals(((bfc)localObject).b))) {
            break;
          }
          i = -3;
        }
      }
      catch (TimeoutException localTimeoutException)
      {
        for (;;)
        {
          i = -2;
          continue;
          String str = localTimeoutException.a();
          if (str == null) {
            i = -3;
          } else {
            try
            {
              JSONObject localJSONObject = new org/json/JSONObject;
              localJSONObject.<init>(str);
              localJSONObject.getDouble("volume");
              localJSONObject.getLong("duration");
              i = 0;
            }
            catch (JSONException localJSONException1)
            {
              i = -3;
            }
          }
        }
      }
      catch (IOException localIOException)
      {
        for (;;) {}
      }
    }
    catch (JSONException localJSONException2)
    {
      for (;;) {}
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bfh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */