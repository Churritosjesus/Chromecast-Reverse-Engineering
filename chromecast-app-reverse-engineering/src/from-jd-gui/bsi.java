import android.text.TextUtils;
import com.google.android.gms.analytics.internal.Command;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class bsi
{
  final Map a;
  final List b;
  final long c;
  final long d;
  final int e;
  final boolean f;
  private final String g;
  
  public bsi(bqz parambqz, Map paramMap, long paramLong, boolean paramBoolean)
  {
    this(parambqz, paramMap, paramLong, paramBoolean, 0L, 0, null);
  }
  
  public bsi(bqz parambqz, Map paramMap, long paramLong1, boolean paramBoolean, long paramLong2, int paramInt)
  {
    this(parambqz, paramMap, paramLong1, paramBoolean, paramLong2, paramInt, null);
  }
  
  public bsi(bqz parambqz, Map paramMap, long paramLong1, boolean paramBoolean, long paramLong2, int paramInt, List paramList)
  {
    a.c(parambqz);
    a.c(paramMap);
    this.d = paramLong1;
    this.f = paramBoolean;
    this.c = paramLong2;
    this.e = paramInt;
    if (paramList != null) {}
    for (Object localObject = paramList;; localObject = Collections.EMPTY_LIST)
    {
      this.b = ((List)localObject);
      this.g = a(paramList);
      paramList = new HashMap();
      localIterator = paramMap.entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        if (a(localEntry.getKey()))
        {
          localObject = a(parambqz, localEntry.getKey());
          if (localObject != null) {
            paramList.put(localObject, b(parambqz, localEntry.getValue()));
          }
        }
      }
    }
    Iterator localIterator = paramMap.entrySet().iterator();
    while (localIterator.hasNext())
    {
      localObject = (Map.Entry)localIterator.next();
      if (!a(((Map.Entry)localObject).getKey()))
      {
        paramMap = a(parambqz, ((Map.Entry)localObject).getKey());
        if (paramMap != null) {
          paramList.put(paramMap, b(parambqz, ((Map.Entry)localObject).getValue()));
        }
      }
    }
    if (!TextUtils.isEmpty(this.g))
    {
      bqs.a(paramList, "_v", this.g);
      if ((this.g.equals("ma4.0.0")) || (this.g.equals("ma4.0.1"))) {
        paramList.remove("adid");
      }
    }
    this.a = Collections.unmodifiableMap(paramList);
  }
  
  private static String a(bqz parambqz, Object paramObject)
  {
    if (paramObject == null) {
      parambqz = null;
    }
    for (;;)
    {
      return parambqz;
      paramObject = paramObject.toString();
      Object localObject = paramObject;
      if (((String)paramObject).startsWith("&")) {
        localObject = ((String)paramObject).substring(1);
      }
      int i = ((String)localObject).length();
      paramObject = localObject;
      if (i > 256)
      {
        paramObject = ((String)localObject).substring(0, 256);
        parambqz.c("Hit param name is too long and will be trimmed", Integer.valueOf(i), paramObject);
      }
      parambqz = (bqz)paramObject;
      if (TextUtils.isEmpty((CharSequence)paramObject)) {
        parambqz = null;
      }
    }
  }
  
  private static String a(List paramList)
  {
    Object localObject = null;
    if (paramList != null)
    {
      Iterator localIterator = paramList.iterator();
      do
      {
        if (!localIterator.hasNext()) {
          break;
        }
        paramList = (Command)localIterator.next();
      } while (!"appendVersion".equals(paramList.a));
    }
    for (paramList = paramList.b;; paramList = null)
    {
      if (TextUtils.isEmpty(paramList)) {
        paramList = (List)localObject;
      }
      for (;;)
      {
        return paramList;
      }
    }
  }
  
  private static boolean a(Object paramObject)
  {
    if (paramObject == null) {}
    for (boolean bool = false;; bool = paramObject.toString().startsWith("&")) {
      return bool;
    }
  }
  
  private static String b(bqz parambqz, Object paramObject)
  {
    if (paramObject == null) {}
    for (paramObject = "";; paramObject = paramObject.toString())
    {
      int i = ((String)paramObject).length();
      Object localObject = paramObject;
      if (i > 8192)
      {
        localObject = ((String)paramObject).substring(0, 8192);
        parambqz.c("Hit param value is too long and will be trimmed", Integer.valueOf(i), localObject);
      }
      return (String)localObject;
    }
  }
  
  String a(String paramString1, String paramString2)
  {
    a.f(paramString1);
    boolean bool;
    if (!paramString1.startsWith("&"))
    {
      bool = true;
      a.b(bool, "Short param name required");
      paramString1 = (String)this.a.get(paramString1);
      if (paramString1 == null) {
        break label49;
      }
      paramString2 = paramString1;
    }
    label49:
    for (;;)
    {
      return paramString2;
      bool = false;
      break;
    }
  }
  
  public final String toString()
  {
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append("ht=").append(this.d);
    if (this.c != 0L) {
      localStringBuffer.append(", dbId=").append(this.c);
    }
    if (this.e != 0L) {
      localStringBuffer.append(", appUID=").append(this.e);
    }
    Object localObject = new ArrayList(this.a.keySet());
    Collections.sort((List)localObject);
    Iterator localIterator = ((List)localObject).iterator();
    while (localIterator.hasNext())
    {
      localObject = (String)localIterator.next();
      localStringBuffer.append(", ");
      localStringBuffer.append((String)localObject);
      localStringBuffer.append("=");
      localStringBuffer.append((String)this.a.get(localObject));
    }
    return localStringBuffer.toString();
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bsi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */