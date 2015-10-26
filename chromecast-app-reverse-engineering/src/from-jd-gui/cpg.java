import java.util.HashMap;
import java.util.Map;

public final class cpg
  extends cov
{
  public String a;
  public int b;
  public int c;
  public int d;
  public int e;
  public int f;
  
  public final String toString()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("language", this.a);
    localHashMap.put("screenColors", Integer.valueOf(this.b));
    localHashMap.put("screenWidth", Integer.valueOf(this.c));
    localHashMap.put("screenHeight", Integer.valueOf(this.d));
    localHashMap.put("viewportWidth", Integer.valueOf(this.e));
    localHashMap.put("viewportHeight", Integer.valueOf(this.f));
    return a(localHashMap);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cpg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */