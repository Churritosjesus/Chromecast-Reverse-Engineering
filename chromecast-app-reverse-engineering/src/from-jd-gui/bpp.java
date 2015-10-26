import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class bpp
{
  public Map a = new HashMap();
  public bqa b;
  public Map c = new HashMap();
  public List d = new ArrayList();
  public List e = new ArrayList();
  
  public final bpp a(String paramString1, String paramString2)
  {
    this.a.put(paramString1, paramString2);
    return this;
  }
  
  public Map a()
  {
    HashMap localHashMap = new HashMap(this.a);
    if (this.b != null) {
      localHashMap.putAll(this.b.a());
    }
    Object localObject1 = this.d.iterator();
    for (int i = 1; ((Iterator)localObject1).hasNext(); i++) {
      localHashMap.putAll(((bqb)((Iterator)localObject1).next()).a(a.a("&promo", i)));
    }
    localObject1 = this.e.iterator();
    for (i = 1; ((Iterator)localObject1).hasNext(); i++) {
      localHashMap.putAll(((bpz)((Iterator)localObject1).next()).a(a.a("&pr", i)));
    }
    Iterator localIterator = this.c.entrySet().iterator();
    for (i = 1; localIterator.hasNext(); i++)
    {
      localObject1 = (Map.Entry)localIterator.next();
      Object localObject2 = (List)((Map.Entry)localObject1).getValue();
      String str = a.a("&il", i);
      localObject2 = ((List)localObject2).iterator();
      for (int j = 1; ((Iterator)localObject2).hasNext(); j++) {
        localHashMap.putAll(((bpz)((Iterator)localObject2).next()).a(str + a.a("pi", j)));
      }
      if (!TextUtils.isEmpty((CharSequence)((Map.Entry)localObject1).getKey())) {
        localHashMap.put(str + "nm", ((Map.Entry)localObject1).getKey());
      }
    }
    return localHashMap;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bpp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */