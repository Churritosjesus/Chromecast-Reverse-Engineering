import java.util.HashMap;
import java.util.Map;

public final class cpl
  extends cov
{
  public String a;
  public String b;
  public String c;
  
  public final String toString()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("network", this.a);
    localHashMap.put("action", this.b);
    localHashMap.put("target", this.c);
    return a(localHashMap);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cpl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */