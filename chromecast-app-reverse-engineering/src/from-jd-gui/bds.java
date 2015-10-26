import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeoutException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class bds
  extends bfp
{
  ArrayList a;
  
  public bds(String paramString)
  {
    super(paramString);
  }
  
  public final int a()
  {
    int i = -1;
    try
    {
      Object localObject1 = a("supported_locales", c);
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
              localObject2 = localJSONArray.getJSONObject(i);
              bcz localbcz = new bcz;
              localbcz.<init>(((JSONObject)localObject2).getString("locale"), ((JSONObject)localObject2).getString("display_string"));
              localArrayList.add(localbcz);
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


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bds.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */