import java.util.HashMap;
import java.util.Map;

public final class cpf
  extends cov
{
  public String a;
  public String b;
  public String c;
  public String d;
  public String e;
  public String f;
  public String g;
  public String h;
  public String i;
  public String j;
  
  public final String toString()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("name", this.a);
    localHashMap.put("source", this.b);
    localHashMap.put("medium", this.c);
    localHashMap.put("keyword", this.d);
    localHashMap.put("content", this.e);
    localHashMap.put("id", this.f);
    localHashMap.put("adNetworkId", this.g);
    localHashMap.put("gclid", this.h);
    localHashMap.put("dclid", this.i);
    localHashMap.put("aclid", this.j);
    return a(localHashMap);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cpf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */