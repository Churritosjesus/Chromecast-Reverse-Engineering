import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class cyh
{
  private static final Object a = null;
  private static Long b = new Long(0L);
  private static cyg c;
  private static String d;
  private static Boolean e;
  private static cje f = a(d);
  
  static
  {
    new Double(0.0D);
    c = cyg.a(0L);
    d = new String("");
    e = new Boolean(false);
    new ArrayList(0);
    new HashMap();
  }
  
  public static cje a(Object paramObject)
  {
    boolean bool = false;
    Object localObject1 = new cje();
    if ((paramObject instanceof cje))
    {
      paramObject = (cje)paramObject;
      return (cje)paramObject;
    }
    if ((paramObject instanceof String))
    {
      ((cje)localObject1).a = 1;
      ((cje)localObject1).b = ((String)paramObject);
    }
    for (;;)
    {
      ((cje)localObject1).l = bool;
      paramObject = localObject1;
      break;
      Object localObject2;
      Object localObject3;
      if ((paramObject instanceof List))
      {
        ((cje)localObject1).a = 2;
        localObject2 = (List)paramObject;
        paramObject = new ArrayList(((List)localObject2).size());
        localObject2 = ((List)localObject2).iterator();
        bool = false;
        if (((Iterator)localObject2).hasNext())
        {
          localObject3 = a(((Iterator)localObject2).next());
          if (localObject3 == f)
          {
            paramObject = f;
            break;
          }
          if ((bool) || (((cje)localObject3).l)) {}
          for (bool = true;; bool = false)
          {
            ((List)paramObject).add(localObject3);
            break;
          }
        }
        ((cje)localObject1).c = ((cje[])((List)paramObject).toArray(new cje[0]));
        continue;
      }
      if ((paramObject instanceof Map))
      {
        ((cje)localObject1).a = 3;
        localObject3 = ((Map)paramObject).entrySet();
        paramObject = new ArrayList(((Set)localObject3).size());
        localObject2 = new ArrayList(((Set)localObject3).size());
        Iterator localIterator = ((Set)localObject3).iterator();
        bool = false;
        if (localIterator.hasNext())
        {
          Object localObject4 = (Map.Entry)localIterator.next();
          localObject3 = a(((Map.Entry)localObject4).getKey());
          localObject4 = a(((Map.Entry)localObject4).getValue());
          if ((localObject3 == f) || (localObject4 == f))
          {
            paramObject = f;
            break;
          }
          if ((bool) || (((cje)localObject3).l) || (((cje)localObject4).l)) {}
          for (bool = true;; bool = false)
          {
            ((List)paramObject).add(localObject3);
            ((List)localObject2).add(localObject4);
            break;
          }
        }
        ((cje)localObject1).d = ((cje[])((List)paramObject).toArray(new cje[0]));
        ((cje)localObject1).e = ((cje[])((List)localObject2).toArray(new cje[0]));
        continue;
      }
      if (c(paramObject))
      {
        ((cje)localObject1).a = 1;
        ((cje)localObject1).b = paramObject.toString();
      }
      else if (d(paramObject))
      {
        ((cje)localObject1).a = 6;
        ((cje)localObject1).h = e(paramObject);
      }
      else
      {
        if (!(paramObject instanceof Boolean)) {
          break label470;
        }
        ((cje)localObject1).a = 8;
        ((cje)localObject1).i = ((Boolean)paramObject).booleanValue();
      }
    }
    label470:
    localObject1 = new StringBuilder("Converting to Value from unknown object type: ");
    if (paramObject == null) {}
    for (paramObject = "null";; paramObject = paramObject.getClass().toString())
    {
      cuh.a((String)paramObject);
      paramObject = f;
      break;
    }
  }
  
  public static cje a(String paramString)
  {
    cje localcje = new cje();
    localcje.a = 5;
    localcje.g = paramString;
    return localcje;
  }
  
  public static Object a()
  {
    return null;
  }
  
  public static String a(cje paramcje)
  {
    return b(e(paramcje));
  }
  
  public static cyg b(cje paramcje)
  {
    paramcje = e(paramcje);
    if ((paramcje instanceof cyg)) {
      paramcje = (cyg)paramcje;
    }
    for (;;)
    {
      return paramcje;
      if (d(paramcje))
      {
        paramcje = cyg.a(e(paramcje));
      }
      else
      {
        if (c(paramcje))
        {
          if ((paramcje instanceof Number)) {}
          for (double d1 = ((Number)paramcje).doubleValue();; d1 = 0.0D)
          {
            paramcje = cyg.a(Double.valueOf(d1));
            break;
            cuh.a("getDouble received non-Number");
          }
        }
        paramcje = b(b(paramcje));
      }
    }
  }
  
  private static cyg b(String paramString)
  {
    try
    {
      cyg localcyg = cyg.a(paramString);
      paramString = localcyg;
    }
    catch (NumberFormatException localNumberFormatException)
    {
      for (;;)
      {
        cuh.a("Failed to convert '" + paramString + "' to a number.");
        paramString = c;
      }
    }
    return paramString;
  }
  
  public static Long b()
  {
    return b;
  }
  
  private static String b(Object paramObject)
  {
    if (paramObject == null) {}
    for (paramObject = d;; paramObject = paramObject.toString()) {
      return (String)paramObject;
    }
  }
  
  public static Boolean c()
  {
    return e;
  }
  
  public static Long c(cje paramcje)
  {
    paramcje = e(paramcje);
    if (d(paramcje)) {
      paramcje = Long.valueOf(e(paramcje));
    }
    for (;;)
    {
      return paramcje;
      paramcje = b(b(paramcje));
      if (paramcje == c) {
        paramcje = b;
      } else {
        paramcje = Long.valueOf(paramcje.longValue());
      }
    }
  }
  
  private static boolean c(Object paramObject)
  {
    boolean bool2 = false;
    boolean bool1;
    if ((!(paramObject instanceof Double)) && (!(paramObject instanceof Float)))
    {
      bool1 = bool2;
      if (!(paramObject instanceof cyg)) {
        break label45;
      }
      if (((cyg)paramObject).a) {
        break label47;
      }
    }
    label45:
    label47:
    for (int i = 1;; i = 0)
    {
      bool1 = bool2;
      if (i != 0) {
        bool1 = true;
      }
      return bool1;
    }
  }
  
  public static cyg d()
  {
    return c;
  }
  
  public static Boolean d(cje paramcje)
  {
    paramcje = e(paramcje);
    if ((paramcje instanceof Boolean)) {
      paramcje = (Boolean)paramcje;
    }
    for (;;)
    {
      return paramcje;
      paramcje = b(paramcje);
      if ("true".equalsIgnoreCase(paramcje)) {
        paramcje = Boolean.TRUE;
      } else if ("false".equalsIgnoreCase(paramcje)) {
        paramcje = Boolean.FALSE;
      } else {
        paramcje = e;
      }
    }
  }
  
  private static boolean d(Object paramObject)
  {
    if (((paramObject instanceof Byte)) || ((paramObject instanceof Short)) || ((paramObject instanceof Integer)) || ((paramObject instanceof Long)) || (((paramObject instanceof cyg)) && (((cyg)paramObject).a))) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  private static long e(Object paramObject)
  {
    if ((paramObject instanceof Number)) {}
    for (long l = ((Number)paramObject).longValue();; l = 0L)
    {
      return l;
      cuh.a("getInt64 received non-Number");
    }
  }
  
  public static Object e(cje paramcje)
  {
    int k = 0;
    int j = 0;
    int i = 0;
    if (paramcje == null) {
      paramcje = null;
    }
    for (;;)
    {
      return paramcje;
      Object localObject1;
      Object localObject2;
      switch (paramcje.a)
      {
      default: 
        cuh.a("Failed to convert a value of type: " + paramcje.a);
        paramcje = null;
        break;
      case 1: 
        paramcje = paramcje.b;
        break;
      case 2: 
        localObject1 = new ArrayList(paramcje.c.length);
        paramcje = paramcje.c;
        j = paramcje.length;
        for (;;)
        {
          if (i >= j) {
            break label162;
          }
          localObject2 = e(paramcje[i]);
          if (localObject2 == null)
          {
            paramcje = null;
            break;
          }
          ((ArrayList)localObject1).add(localObject2);
          i++;
        }
        paramcje = (cje)localObject1;
        break;
      case 3: 
        if (paramcje.d.length != paramcje.e.length)
        {
          cuh.a("Converting an invalid value to object: " + paramcje.toString());
          paramcje = null;
        }
        else
        {
          localObject1 = new HashMap(paramcje.e.length);
          for (i = k;; i++)
          {
            if (i >= paramcje.d.length) {
              break label285;
            }
            Object localObject3 = e(paramcje.d[i]);
            localObject2 = e(paramcje.e[i]);
            if ((localObject3 == null) || (localObject2 == null))
            {
              paramcje = null;
              break;
            }
            ((Map)localObject1).put(localObject3, localObject2);
          }
          paramcje = (cje)localObject1;
        }
        break;
      case 4: 
        cuh.a("Trying to convert a macro reference to object");
        paramcje = null;
        break;
      case 5: 
        cuh.a("Trying to convert a function id to object");
        paramcje = null;
        break;
      case 6: 
        paramcje = Long.valueOf(paramcje.h);
        break;
      case 7: 
        localObject1 = new StringBuffer();
        paramcje = paramcje.j;
        k = paramcje.length;
        for (i = j;; i++)
        {
          if (i >= k) {
            break label383;
          }
          localObject2 = a(paramcje[i]);
          if (localObject2 == d)
          {
            paramcje = null;
            break;
          }
          ((StringBuffer)localObject1).append((String)localObject2);
        }
        paramcje = ((StringBuffer)localObject1).toString();
        break;
      case 8: 
        label162:
        label285:
        label383:
        paramcje = Boolean.valueOf(paramcje.i);
      }
    }
  }
  
  public static String e()
  {
    return d;
  }
  
  public static cje f()
  {
    return f;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cyh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */