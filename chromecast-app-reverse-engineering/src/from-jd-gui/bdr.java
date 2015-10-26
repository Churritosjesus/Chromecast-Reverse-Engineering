import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeoutException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class bdr
  extends bfp
{
  ArrayList a;
  
  public bdr(String paramString)
  {
    super(paramString);
  }
  
  public static ArrayList a(String paramString)
  {
    paramString = new JSONArray(paramString);
    ArrayList localArrayList = new ArrayList();
    int j = paramString.length();
    for (int i = 0; i < j; i++)
    {
      JSONObject localJSONObject = paramString.getJSONObject(i);
      bfs localbfs = new bfs();
      localbfs.a = localJSONObject.getString("ssid");
      localbfs.b = bfu.a(localJSONObject.optInt("wpa_auth", bfu.a.j));
      localbfs.c = bfv.a(localJSONObject.optInt("wpa_cipher", bfv.a.b));
      localbfs.d = localJSONObject.optInt("wpa_id", 0);
      localbfs.i = localJSONObject.getString("bssid");
      localbfs.h = localJSONObject.getInt("signal_level");
      localArrayList.add(localbfs);
    }
    return localArrayList;
  }
  
  public final int a()
  {
    int i = -1;
    try
    {
      Object localObject = a("scan_results", c);
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
            this.a = a(str);
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


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bdr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */