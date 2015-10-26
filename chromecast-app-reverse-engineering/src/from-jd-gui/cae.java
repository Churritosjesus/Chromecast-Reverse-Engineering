import java.util.Iterator;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class cae
{
  static
  {
    Pattern.compile("\\\\.");
    Pattern.compile("[\\\\\"/\b\f\n\r\t]");
  }
  
  public static boolean a(Object paramObject1, Object paramObject2)
  {
    boolean bool2 = false;
    boolean bool1;
    if ((paramObject1 == null) && (paramObject2 == null)) {
      bool1 = true;
    }
    for (;;)
    {
      return bool1;
      bool1 = bool2;
      if (paramObject1 != null)
      {
        bool1 = bool2;
        if (paramObject2 != null)
        {
          label77:
          String str;
          if (((paramObject1 instanceof JSONObject)) && ((paramObject2 instanceof JSONObject)))
          {
            paramObject1 = (JSONObject)paramObject1;
            paramObject2 = (JSONObject)paramObject2;
            bool1 = bool2;
            if (((JSONObject)paramObject1).length() != ((JSONObject)paramObject2).length()) {
              continue;
            }
            Iterator localIterator = ((JSONObject)paramObject1).keys();
            if (localIterator.hasNext())
            {
              str = (String)localIterator.next();
              bool1 = bool2;
              if (!((JSONObject)paramObject2).has(str)) {
                continue;
              }
            }
          }
          try
          {
            bool1 = a(((JSONObject)paramObject1).get(str), ((JSONObject)paramObject2).get(str));
            if (bool1) {
              break label77;
            }
            bool1 = bool2;
          }
          catch (JSONException paramObject1)
          {
            int i;
            bool1 = bool2;
          }
          bool1 = true;
          continue;
          if (((paramObject1 instanceof JSONArray)) && ((paramObject2 instanceof JSONArray)))
          {
            paramObject1 = (JSONArray)paramObject1;
            paramObject2 = (JSONArray)paramObject2;
            bool1 = bool2;
            if (((JSONArray)paramObject1).length() != ((JSONArray)paramObject2).length()) {
              continue;
            }
            i = 0;
            if (i >= ((JSONArray)paramObject1).length()) {}
          }
          try
          {
            boolean bool3 = a(((JSONArray)paramObject1).get(i), ((JSONArray)paramObject2).get(i));
            bool1 = bool2;
            if (!bool3) {
              continue;
            }
            i++;
          }
          catch (JSONException paramObject1)
          {
            bool1 = bool2;
          }
          bool1 = true;
          continue;
          bool1 = paramObject1.equals(paramObject2);
          continue;
        }
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cae.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */