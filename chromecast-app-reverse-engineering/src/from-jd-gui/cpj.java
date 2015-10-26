import java.util.HashMap;
import java.util.Map;

public final class cpj
  extends cov
{
  public String a;
  public boolean b;
  
  public final String toString()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("description", this.a);
    localHashMap.put("fatal", Boolean.valueOf(this.b));
    return a(localHashMap);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cpj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */