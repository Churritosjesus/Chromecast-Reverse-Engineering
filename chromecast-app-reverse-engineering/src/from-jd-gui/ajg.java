import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

final class ajg
{
  private static final ConcurrentHashMap a = new ConcurrentHashMap();
  
  public static JSONObject a(String paramString)
  {
    return (JSONObject)a.get(paramString);
  }
  
  public static void a(String paramString, JSONObject paramJSONObject)
  {
    a.put(paramString, paramJSONObject);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\ajg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */