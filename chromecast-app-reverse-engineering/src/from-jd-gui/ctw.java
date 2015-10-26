import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class ctw
{
  private static Object a = new Object();
  private static String[] b = "gtm.lifetime".toString().split("\\.");
  private static final Pattern c = Pattern.compile("(\\d+)\\s*([smhd]?)");
  private final ConcurrentHashMap d;
  private final Map e;
  private final ReentrantLock f;
  private final LinkedList g;
  private final cub h;
  private final CountDownLatch i;
  
  ctw()
  {
    this(new ctx());
  }
  
  ctw(cub paramcub)
  {
    this.h = paramcub;
    this.d = new ConcurrentHashMap();
    this.e = new HashMap();
    this.f = new ReentrantLock();
    this.g = new LinkedList();
    this.i = new CountDownLatch(1);
    this.h.a(new cty(this));
  }
  
  public static Map a(Object... paramVarArgs)
  {
    if (paramVarArgs.length % 2 != 0) {
      throw new IllegalArgumentException("expected even number of key-value pairs");
    }
    HashMap localHashMap = new HashMap();
    for (int j = 0; j < paramVarArgs.length; j += 2)
    {
      if (!(paramVarArgs[j] instanceof String)) {
        throw new IllegalArgumentException("key is not a string: " + paramVarArgs[j]);
      }
      localHashMap.put((String)paramVarArgs[j], paramVarArgs[(j + 1)]);
    }
    return localHashMap;
  }
  
  private void a(List paramList1, List paramList2)
  {
    while (paramList2.size() < paramList1.size()) {
      paramList2.add(null);
    }
    int j = 0;
    if (j < paramList1.size())
    {
      Object localObject = paramList1.get(j);
      if ((localObject instanceof List))
      {
        if (!(paramList2.get(j) instanceof List)) {
          paramList2.set(j, new ArrayList());
        }
        a((List)localObject, (List)paramList2.get(j));
      }
      for (;;)
      {
        j++;
        break;
        if ((localObject instanceof Map))
        {
          if (!(paramList2.get(j) instanceof Map)) {
            paramList2.set(j, new HashMap());
          }
          a((Map)localObject, (Map)paramList2.get(j));
        }
        else if (localObject != a)
        {
          paramList2.set(j, localObject);
        }
      }
    }
  }
  
  private void a(Map paramMap, String paramString, Collection paramCollection)
  {
    Iterator localIterator = paramMap.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      StringBuilder localStringBuilder = new StringBuilder().append(paramString);
      if (paramString.length() == 0) {}
      for (paramMap = "";; paramMap = ".")
      {
        paramMap = paramMap + (String)localEntry.getKey();
        if (!(localEntry.getValue() instanceof Map)) {
          break label119;
        }
        a((Map)localEntry.getValue(), paramMap, paramCollection);
        break;
      }
      label119:
      if (!paramMap.equals("gtm.lifetime")) {
        paramCollection.add(new ctz(paramMap, localEntry.getValue()));
      }
    }
  }
  
  private void a(Map paramMap1, Map paramMap2)
  {
    Iterator localIterator = paramMap1.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      Object localObject = paramMap1.get(str);
      if ((localObject instanceof List))
      {
        if (!(paramMap2.get(str) instanceof List)) {
          paramMap2.put(str, new ArrayList());
        }
        a((List)localObject, (List)paramMap2.get(str));
      }
      else if ((localObject instanceof Map))
      {
        if (!(paramMap2.get(str) instanceof Map)) {
          paramMap2.put(str, new HashMap());
        }
        a((Map)localObject, (Map)paramMap2.get(str));
      }
      else
      {
        paramMap2.put(str, localObject);
      }
    }
  }
  
  public static Map b(String paramString, Object paramObject)
  {
    HashMap localHashMap1 = new HashMap();
    String[] arrayOfString = paramString.toString().split("\\.");
    int j = 0;
    HashMap localHashMap2;
    for (paramString = localHashMap1; j < arrayOfString.length - 1; paramString = localHashMap2)
    {
      localHashMap2 = new HashMap();
      paramString.put(arrayOfString[j], localHashMap2);
      j++;
    }
    paramString.put(arrayOfString[(arrayOfString.length - 1)], paramObject);
    return localHashMap1;
  }
  
  private void b(Map paramMap)
  {
    this.f.lock();
    label163:
    for (;;)
    {
      try
      {
        this.g.offer(paramMap);
        if (this.f.getHoldCount() == 1)
        {
          int j = 0;
          localObject = (Map)this.g.poll();
          if (localObject != null)
          {
            d((Map)localObject);
            j++;
            if (j <= 500) {
              break label163;
            }
            this.g.clear();
            paramMap = new java/lang/RuntimeException;
            paramMap.<init>("Seems like an infinite loop of pushing to the data layer");
            throw paramMap;
          }
        }
      }
      finally
      {
        this.f.unlock();
      }
      Object localObject = c(paramMap);
      if (localObject == null) {}
      for (localObject = null;; localObject = c(localObject.toString()))
      {
        if (localObject != null)
        {
          ArrayList localArrayList = new java/util/ArrayList;
          localArrayList.<init>();
          a(paramMap, "", localArrayList);
          localArrayList.remove("gtm.lifetime");
          this.h.a(localArrayList, ((Long)localObject).longValue());
        }
        this.f.unlock();
        return;
      }
    }
  }
  
  private static Long c(String paramString)
  {
    Object localObject1 = null;
    Object localObject2 = c.matcher(paramString);
    if (!((Matcher)localObject2).matches())
    {
      cuh.c("unknown _lifetime: " + paramString);
      paramString = (String)localObject1;
    }
    for (;;)
    {
      return paramString;
      long l;
      try
      {
        l = Long.parseLong(((Matcher)localObject2).group(1));
        if (l <= 0L)
        {
          cuh.c("non-positive _lifetime: " + paramString);
          paramString = (String)localObject1;
        }
      }
      catch (NumberFormatException localNumberFormatException)
      {
        for (;;)
        {
          cuh.b("illegal number in _lifetime value: " + paramString);
          l = 0L;
        }
        localObject2 = ((Matcher)localObject2).group(2);
        if (((String)localObject2).length() == 0)
        {
          paramString = Long.valueOf(l);
          continue;
        }
        switch (((String)localObject2).charAt(0))
        {
        default: 
          cuh.b("unknown units in _lifetime: " + paramString);
          paramString = (String)localObject1;
        }
      }
      continue;
      paramString = Long.valueOf(l * 1000L);
      continue;
      paramString = Long.valueOf(l * 1000L * 60L);
      continue;
      paramString = Long.valueOf(l * 1000L * 60L * 60L);
      continue;
      paramString = Long.valueOf(l * 1000L * 60L * 60L * 24L);
    }
  }
  
  private static Object c(Map paramMap)
  {
    String[] arrayOfString = b;
    int k = arrayOfString.length;
    for (int j = 0;; j++)
    {
      Object localObject = paramMap;
      if (j < k)
      {
        localObject = arrayOfString[j];
        if (!(paramMap instanceof Map)) {
          localObject = null;
        }
      }
      else
      {
        return localObject;
      }
      paramMap = ((Map)paramMap).get(localObject);
    }
  }
  
  private void d(Map paramMap)
  {
    synchronized (this.e)
    {
      Iterator localIterator = paramMap.keySet().iterator();
      if (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        a(b(str, paramMap.get(str)), this.e);
      }
    }
    ??? = this.d.keySet().iterator();
    while (((Iterator)???).hasNext()) {
      ((cua)((Iterator)???).next()).a(paramMap);
    }
  }
  
  final void a(cua paramcua)
  {
    this.d.put(paramcua, Integer.valueOf(0));
  }
  
  public final void a(String paramString)
  {
    a(paramString, null);
    this.h.a(paramString);
  }
  
  public final void a(String paramString, Object paramObject)
  {
    a(b(paramString, paramObject));
  }
  
  public final void a(Map paramMap)
  {
    try
    {
      this.i.await();
      b(paramMap);
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      for (;;)
      {
        cuh.b("DataLayer.push: unexpected InterruptedException");
      }
    }
  }
  
  public final Object b(String paramString)
  {
    synchronized (this.e)
    {
      Map localMap1 = this.e;
      String[] arrayOfString = paramString.split("\\.");
      int k = arrayOfString.length;
      paramString = localMap1;
      for (int j = 0; j < k; j++)
      {
        localMap1 = arrayOfString[j];
        if (!(paramString instanceof Map)) {}
        for (paramString = null;; paramString = null)
        {
          return paramString;
          paramString = ((Map)paramString).get(localMap1);
          if (paramString != null) {
            break;
          }
        }
      }
    }
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder;
    synchronized (this.e)
    {
      localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      Iterator localIterator = this.e.entrySet().iterator();
      if (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        localStringBuilder.append(String.format("{\n\tKey: %s\n\tValue: %s\n}\n", new Object[] { localEntry.getKey(), localEntry.getValue() }));
      }
    }
    String str = localStringBuilder.toString();
    return str;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\ctw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */