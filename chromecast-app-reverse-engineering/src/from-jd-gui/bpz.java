import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class bpz
{
  private Map a = new HashMap();
  
  public final Map a(String paramString)
  {
    HashMap localHashMap = new HashMap();
    Iterator localIterator = this.a.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      localHashMap.put(paramString + (String)localEntry.getKey(), localEntry.getValue());
    }
    return localHashMap;
  }
  
  public final void a(String paramString1, String paramString2)
  {
    a.f(paramString1, "Name should be non-null");
    this.a.put(paramString1, paramString2);
  }
  
  public final String toString()
  {
    return cov.a(this.a);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bpz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */