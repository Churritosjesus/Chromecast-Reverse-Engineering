import java.io.IOException;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

public final class bfi
  extends bfp
{
  private final int a;
  
  public bfi(String paramString, int paramInt)
  {
    super(paramString);
    this.a = paramInt;
  }
  
  public static JSONObject a(int paramInt)
  {
    JSONObject localJSONObject = new JSONObject();
    String str;
    switch (bfj.a[(paramInt - 1)])
    {
    default: 
      str = "now";
    }
    try
    {
      for (;;)
      {
        localJSONObject.put("params", str);
        return localJSONObject;
        str = "fdr";
        continue;
        str = "ota";
        continue;
        str = "idle";
        continue;
        str = "set recovery";
      }
    }
    catch (JSONException localJSONException)
    {
      for (;;) {}
    }
  }
  
  public final int a()
  {
    i = -1;
    JSONObject localJSONObject = a(this.a);
    try
    {
      int j = a("reboot", bfc.a(localJSONObject), c).b();
      if (j == 200) {
        i = 0;
      }
    }
    catch (TimeoutException localTimeoutException)
    {
      for (;;)
      {
        i = -2;
      }
    }
    catch (IOException localIOException)
    {
      for (;;) {}
    }
    return i;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bfi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */