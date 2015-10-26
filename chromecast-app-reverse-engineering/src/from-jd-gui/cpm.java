import java.util.HashMap;
import java.util.Map;

public final class cpm
  extends cov
{
  public String a;
  public long b;
  public String c;
  public String d;
  
  public final String toString()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("variableName", this.a);
    localHashMap.put("timeInMillis", Long.valueOf(this.b));
    localHashMap.put("category", this.c);
    localHashMap.put("label", this.d);
    return a(localHashMap);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cpm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */