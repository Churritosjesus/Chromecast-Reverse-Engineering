import android.content.Context;
import java.util.Map;
import org.json.JSONObject;

public final class ahu
{
  private static final Map a = new ahv();
  
  public static JSONObject a(ahw paramahw, ahx paramahx, String paramString, boolean paramBoolean, Context paramContext)
  {
    JSONObject localJSONObject = new JSONObject();
    localJSONObject.put("event", a.get(paramahw));
    aji.a(localJSONObject, paramahx, paramString, paramBoolean);
    try
    {
      aji.a(localJSONObject, paramContext);
      localJSONObject.put("application_package_name", paramContext.getPackageName());
      return localJSONObject;
    }
    catch (Exception paramahw)
    {
      for (;;)
      {
        aiw.a(ags.e, "AppEvents", "Fetching extended device info parameters failed: '%s'", new Object[] { paramahw.toString() });
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\ahu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */