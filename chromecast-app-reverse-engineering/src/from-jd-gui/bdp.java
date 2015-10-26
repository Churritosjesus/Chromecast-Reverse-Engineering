import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeoutException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class bdp
  extends bfp
{
  List a;
  
  public bdp(String paramString)
  {
    super(paramString);
  }
  
  public final int a()
  {
    int i = -1;
    try
    {
      Object localObject1 = a("configured_networks", c);
      if (((bfq)localObject1).b() != 200) {}
      for (;;)
      {
        return i;
        localObject1 = ((bfq)localObject1).c();
        if ((localObject1 != null) && ("application/json".equals(((bfc)localObject1).b))) {
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
        Object localObject2 = localTimeoutException.a();
        if (localObject2 == null) {
          i = -3;
        } else {
          try
          {
            JSONArray localJSONArray = new org/json/JSONArray;
            localJSONArray.<init>((String)localObject2);
            ArrayList localArrayList = new java/util/ArrayList;
            localArrayList.<init>();
            int j = localJSONArray.length();
            for (i = 0; i < j; i++)
            {
              JSONObject localJSONObject = localJSONArray.getJSONObject(i);
              localObject2 = new bfs;
              ((bfs)localObject2).<init>();
              ((bfs)localObject2).a = localJSONObject.getString("ssid");
              ((bfs)localObject2).b = bfu.a(localJSONObject.optInt("wpa_auth", bfu.a.j));
              ((bfs)localObject2).c = bfv.a(localJSONObject.optInt("wpa_cipher", bfv.a.b));
              ((bfs)localObject2).d = localJSONObject.optInt("wpa_id", 0);
              localArrayList.add(localObject2);
            }
            this.a = localArrayList;
            i = 0;
          }
          catch (JSONException localJSONException)
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
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bdp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */