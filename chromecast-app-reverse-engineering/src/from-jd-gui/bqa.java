import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class bqa
{
  private Map a = new HashMap();
  
  public bqa(String paramString)
  {
    a("&pa", paramString);
  }
  
  public final Map a()
  {
    return new HashMap(this.a);
  }
  
  public final void a(String paramString1, String paramString2)
  {
    a.f(paramString1, "Name should be non-null");
    this.a.put(paramString1, paramString2);
  }
  
  public final String toString()
  {
    HashMap localHashMap = new HashMap();
    Iterator localIterator = this.a.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      if (((String)localEntry.getKey()).startsWith("&")) {
        localHashMap.put(((String)localEntry.getKey()).substring(1), localEntry.getValue());
      } else {
        localHashMap.put(localEntry.getKey(), localEntry.getValue());
      }
    }
    return cov.a(localHashMap);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bqa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */