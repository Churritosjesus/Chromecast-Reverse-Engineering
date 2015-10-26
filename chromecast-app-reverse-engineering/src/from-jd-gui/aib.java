import android.os.Bundle;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public final class aib
{
  private static final Map a;
  
  static
  {
    HashMap localHashMap = new HashMap();
    a = localHashMap;
    localHashMap.put(Boolean.class, new aic());
    a.put(Integer.class, new aid());
    a.put(Long.class, new aie());
    a.put(Double.class, new aif());
    a.put(String.class, new aig());
    a.put(String[].class, new aih());
    a.put(JSONArray.class, new aii());
  }
  
  public static Bundle a(JSONObject paramJSONObject)
  {
    Bundle localBundle = new Bundle();
    Iterator localIterator = paramJSONObject.keys();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      Object localObject = paramJSONObject.get(str);
      if ((localObject != null) && (localObject != JSONObject.NULL)) {
        if ((localObject instanceof JSONObject))
        {
          localBundle.putBundle(str, a((JSONObject)localObject));
        }
        else
        {
          aij localaij = (aij)a.get(localObject.getClass());
          if (localaij == null)
          {
            paramJSONObject = String.valueOf(localObject.getClass());
            throw new IllegalArgumentException(String.valueOf(paramJSONObject).length() + 18 + "Unsupported type: " + paramJSONObject);
          }
          localaij.a(localBundle, str, localObject);
        }
      }
    }
    return localBundle;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\aib.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */