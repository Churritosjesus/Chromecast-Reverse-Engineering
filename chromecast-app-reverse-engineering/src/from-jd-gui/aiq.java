import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

public final class aiq
{
  private static aiq g;
  public final Map a;
  public final Map b;
  public final Map c;
  public final String d;
  public final String e;
  public final String f;
  
  aiq(Map paramMap1, Map paramMap2, Map paramMap3, String paramString1, String paramString2, String paramString3)
  {
    this.a = paramMap1;
    this.b = paramMap2;
    this.c = paramMap3;
    this.d = paramString1;
    this.e = paramString2;
    this.f = paramString3;
  }
  
  public static aiq a()
  {
    try
    {
      if (g == null)
      {
        air localair = new air;
        localair.<init>();
        ais localais = new ais;
        localais.<init>();
        localaiq = new aiq;
        localaiq.<init>(null, localair, localais, null, null, null);
        g = localaiq;
      }
      aiq localaiq = g;
      return localaiq;
    }
    finally {}
  }
  
  static Map a(JSONObject paramJSONObject)
  {
    HashMap localHashMap = null;
    JSONArray localJSONArray1 = paramJSONObject.optJSONArray("items");
    if (localJSONArray1.length() == 0)
    {
      paramJSONObject = localHashMap;
      return paramJSONObject;
    }
    localHashMap = new HashMap();
    int i = 0;
    label31:
    int k;
    if (i < localJSONArray1.length())
    {
      paramJSONObject = localJSONArray1.optJSONObject(i);
      if (paramJSONObject != null)
      {
        k = paramJSONObject.optInt("code");
        if (k != 0)
        {
          JSONArray localJSONArray2 = paramJSONObject.optJSONArray("subcodes");
          if ((localJSONArray2 == null) || (localJSONArray2.length() <= 0)) {
            break label157;
          }
          paramJSONObject = new HashSet();
          for (int j = 0; j < localJSONArray2.length(); j++)
          {
            int m = localJSONArray2.optInt(j);
            if (m != 0) {
              paramJSONObject.add(Integer.valueOf(m));
            }
          }
        }
      }
    }
    for (;;)
    {
      localHashMap.put(Integer.valueOf(k), paramJSONObject);
      i++;
      break label31;
      paramJSONObject = localHashMap;
      break;
      label157:
      paramJSONObject = null;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\aiq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */