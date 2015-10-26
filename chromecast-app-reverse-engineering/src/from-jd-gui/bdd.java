import android.text.TextUtils;
import java.io.IOException;
import java.net.SocketException;
import java.util.concurrent.TimeoutException;
import org.apache.http.conn.HttpHostConnectException;
import org.json.JSONException;
import org.json.JSONObject;

public final class bdd
  extends bfp
{
  private final bfs a;
  
  public bdd(String paramString, bfs parambfs)
  {
    super(paramString);
    this.a = parambfs;
  }
  
  public static JSONObject a(bfs parambfs)
  {
    JSONObject localJSONObject = new JSONObject();
    for (;;)
    {
      try
      {
        localJSONObject.put("ssid", parambfs.a);
        localJSONObject.put("wpa_auth", parambfs.b.j);
        if (parambfs.c != null) {
          localJSONObject.put("wpa_cipher", parambfs.c.b);
        }
        localJSONObject.put("wpa_id", parambfs.d);
        if (!parambfs.g) {
          continue;
        }
        i = 1;
        localJSONObject.put("scan_ssid", i);
        if (!TextUtils.isEmpty(parambfs.e))
        {
          if (!parambfs.f) {
            continue;
          }
          str = "enc_passwd";
          localJSONObject.put(str, parambfs.e);
        }
      }
      catch (JSONException parambfs)
      {
        int i;
        String str;
        continue;
      }
      return localJSONObject;
      i = 0;
      continue;
      str = "passwd";
    }
  }
  
  public final int a()
  {
    i = 0;
    JSONObject localJSONObject = a(this.a);
    for (;;)
    {
      try
      {
        int j = a("connect_wifi", bfc.a(localJSONObject), c).b();
        if (j != 200) {
          continue;
        }
      }
      catch (HttpHostConnectException localHttpHostConnectException)
      {
        localHttpHostConnectException.toString();
        i = -1;
        continue;
      }
      catch (IOException localIOException)
      {
        i = -1;
        continue;
      }
      catch (SocketException localSocketException)
      {
        continue;
      }
      catch (TimeoutException localTimeoutException)
      {
        continue;
      }
      return i;
      i = -1;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bdd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */