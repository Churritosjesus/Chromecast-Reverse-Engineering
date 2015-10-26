import android.os.Bundle;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

final class ahm
  implements Serializable
{
  private static final HashSet c = new HashSet();
  private static final long serialVersionUID = 1L;
  JSONObject a;
  boolean b;
  
  public ahm(String paramString1, String paramString2, Double paramDouble, Bundle paramBundle, boolean paramBoolean)
  {
    try
    {
      a(paramString2);
      this.b = paramBoolean;
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>();
      this.a = localJSONObject;
      this.a.put("_eventName", paramString2);
      this.a.put("_logTime", System.currentTimeMillis() / 1000L);
      this.a.put("_ui", paramString1);
      if (paramDouble != null) {
        this.a.put("_valueToSum", paramDouble.doubleValue());
      }
      if (this.b) {
        this.a.put("_implicitlyLogged", "1");
      }
      if (paramBundle == null) {
        break label267;
      }
      paramDouble = paramBundle.keySet().iterator();
    }
    catch (JSONException paramString1)
    {
      for (;;)
      {
        aiw.a(ags.e, "AppEvents", "JSON encoding for app event failed: '%s'", new Object[] { paramString1.toString() });
        this.a = null;
        return;
        this.a.put(paramString2, paramString1.toString());
      }
    }
    catch (afq paramString1)
    {
      for (;;)
      {
        aiw.a(ags.e, "AppEvents", "Invalid app event name or parameter:", new Object[] { paramString1.toString() });
        this.a = null;
        continue;
        if (!this.b) {
          aiw.a(ags.e, "AppEvents", "Created app event '%s'", new Object[] { this.a.toString() });
        }
      }
    }
    if (paramDouble.hasNext())
    {
      paramString2 = (String)paramDouble.next();
      a(paramString2);
      paramString1 = paramBundle.get(paramString2);
      if ((!(paramString1 instanceof String)) && (!(paramString1 instanceof Number)))
      {
        paramDouble = new afq;
        paramDouble.<init>(String.format("Parameter value '%s' for key '%s' should be a string or a numeric type.", new Object[] { paramString1, paramString2 }));
        throw paramDouble;
      }
    }
  }
  
  ahm(String paramString, boolean paramBoolean)
  {
    this.a = new JSONObject(paramString);
    this.b = paramBoolean;
  }
  
  private static void a(String paramString)
  {
    if ((paramString == null) || (paramString.length() == 0) || (paramString.length() > 40))
    {
      ??? = paramString;
      if (paramString == null) {
        ??? = "<None Provided>";
      }
      throw new afq(String.format(Locale.ROOT, "Identifier '%s' must be less than %d characters", new Object[] { ???, Integer.valueOf(40) }));
    }
    synchronized (c)
    {
      boolean bool = c.contains(paramString);
      if (!bool) {
        if (!paramString.matches("^[0-9a-zA-Z_]+[0-9a-zA-Z _-]*$")) {
          break label117;
        }
      }
    }
    synchronized (c)
    {
      c.add(paramString);
      return;
      paramString = finally;
      throw paramString;
    }
    label117:
    throw new afq(String.format("Skipping event named '%s' due to illegal name - must be under 40 chars and alphanumeric, _, - or space, and not start with a space or hyphen.", new Object[] { paramString }));
  }
  
  private Object writeReplace()
  {
    return new ahn(this.a.toString(), this.b);
  }
  
  public final String toString()
  {
    return String.format("\"%s\", implicit: %b, json: %s", new Object[] { this.a.optString("_eventName"), Boolean.valueOf(this.b), this.a.toString() });
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\ahm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */