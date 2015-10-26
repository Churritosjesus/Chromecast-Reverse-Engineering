import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class cph
  extends cov
{
  public final List a = new ArrayList();
  public final List b = new ArrayList();
  public final Map c = new HashMap();
  public bqa d;
  
  public final String toString()
  {
    HashMap localHashMap = new HashMap();
    if (!this.a.isEmpty()) {
      localHashMap.put("products", this.a);
    }
    if (!this.b.isEmpty()) {
      localHashMap.put("promotions", this.b);
    }
    if (!this.c.isEmpty()) {
      localHashMap.put("impressions", this.c);
    }
    localHashMap.put("productAction", this.d);
    return a(localHashMap);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cph.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */