import android.text.TextUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;

public final class bps
  extends bra
{
  public boolean a;
  final bqj b;
  final bpu c;
  private final Map e = new HashMap();
  private final Map f = new HashMap();
  
  bps(brb parambrb, String paramString, bqj parambqj)
  {
    super(parambrb);
    if (paramString != null) {
      this.e.put("&tid", paramString);
    }
    this.e.put("useSecure", "1");
    this.e.put("&a", Integer.toString(new Random().nextInt(Integer.MAX_VALUE) + 1));
    this.b = new bqj("tracking");
    this.c = new bpu(this, parambrb);
  }
  
  private static String a(Map.Entry paramEntry)
  {
    String str = (String)paramEntry.getKey();
    paramEntry.getValue();
    int i;
    if ((!str.startsWith("&")) || (str.length() < 2))
    {
      i = 0;
      if (i != 0) {
        break label49;
      }
    }
    label49:
    for (paramEntry = null;; paramEntry = ((String)paramEntry.getKey()).substring(1))
    {
      return paramEntry;
      i = 1;
      break;
    }
  }
  
  private void a(String paramString1, String paramString2)
  {
    a.f(paramString1, "Key should be non-null");
    if (TextUtils.isEmpty(paramString1)) {}
    for (;;)
    {
      return;
      this.e.put(paramString1, paramString2);
    }
  }
  
  private static void a(Map paramMap1, Map paramMap2)
  {
    a.c(paramMap2);
    if (paramMap1 == null) {}
    for (;;)
    {
      return;
      Iterator localIterator = paramMap1.entrySet().iterator();
      while (localIterator.hasNext())
      {
        paramMap1 = (Map.Entry)localIterator.next();
        String str = a(paramMap1);
        if (str != null) {
          paramMap2.put(str, paramMap1.getValue());
        }
      }
    }
  }
  
  private static void b(Map paramMap1, Map paramMap2)
  {
    a.c(paramMap2);
    if (paramMap1 == null) {}
    for (;;)
    {
      return;
      Iterator localIterator = paramMap1.entrySet().iterator();
      while (localIterator.hasNext())
      {
        paramMap1 = (Map.Entry)localIterator.next();
        String str = a(paramMap1);
        if ((str != null) && (!paramMap2.containsKey(str))) {
          paramMap2.put(str, paramMap1.getValue());
        }
      }
    }
  }
  
  protected final void a()
  {
    this.c.s();
    String str = this.d.e().c();
    if (str != null) {
      a("&an", str);
    }
    str = this.d.e().b();
    if (str != null) {
      a("&av", str);
    }
  }
  
  public final void a(Map paramMap)
  {
    long l = this.d.c.a();
    if (this.d.d().e) {
      c("AppOptOut is set to true. Not sending Google Analytics hit");
    }
    for (;;)
    {
      return;
      boolean bool3 = this.d.d().d;
      HashMap localHashMap = new HashMap();
      a(this.e, localHashMap);
      a(paramMap, localHashMap);
      boolean bool1 = bqs.a((String)this.e.get("useSecure"), true);
      b(this.f, localHashMap);
      this.f.clear();
      String str = (String)localHashMap.get("t");
      if (TextUtils.isEmpty(str))
      {
        this.d.a().a(localHashMap, "Missing hit type parameter");
        continue;
      }
      paramMap = (String)localHashMap.get("tid");
      if (TextUtils.isEmpty(paramMap))
      {
        this.d.a().a(localHashMap, "Missing tracking id parameter");
        continue;
      }
      boolean bool2 = this.a;
      try
      {
        if (("screenview".equalsIgnoreCase(str)) || ("pageview".equalsIgnoreCase(str)) || ("appview".equalsIgnoreCase(str)) || (TextUtils.isEmpty(str)))
        {
          int j = Integer.parseInt((String)this.e.get("&a")) + 1;
          int i = j;
          if (j >= Integer.MAX_VALUE) {
            i = 1;
          }
          this.e.put("&a", Integer.toString(i));
        }
        this.d.b().a(new bpt(this, localHashMap, bool2, str, l, bool3, bool1, paramMap));
      }
      finally {}
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bps.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */