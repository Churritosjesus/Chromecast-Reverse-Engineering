import java.io.IOException;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

public final class bfl
  extends bfp
{
  bdj a = null;
  
  public bfl(String paramString)
  {
    super(paramString);
  }
  
  public static boolean a(bdf parambdf)
  {
    if (parambdf.a >= 4) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public final int a()
  {
    int i = -1;
    try
    {
      Object localObject = a("save_wifi", null, c);
      if (((bfq)localObject).b() != 200) {}
      for (;;)
      {
        return i;
        localObject = ((bfq)localObject).c();
        if ((localObject != null) && ("application/json".equals(((bfc)localObject).b))) {
          break;
        }
        i = 0;
      }
    }
    catch (TimeoutException localTimeoutException)
    {
      for (;;)
      {
        i = -2;
        continue;
        String str = localTimeoutException.a();
        if (str == null)
        {
          i = 0;
          continue;
        }
        try
        {
          JSONObject localJSONObject = new org/json/JSONObject;
          localJSONObject.<init>(str);
          if (localJSONObject.has("setup_state")) {
            this.a = bdj.a(localJSONObject.optInt("setup_state", bdj.a.r));
          }
          i = 0;
        }
        catch (JSONException localJSONException)
        {
          for (;;) {}
        }
      }
    }
    catch (IOException localIOException)
    {
      for (;;) {}
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bfl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */