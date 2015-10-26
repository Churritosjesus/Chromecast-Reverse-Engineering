import java.net.Proxy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public final class dhl
{
  public static final String a = e + "-Sent-Millis";
  public static final String b = e + "-Received-Millis";
  public static final String c = e + "-Selected-Protocol";
  private static final Comparator d = new dhm();
  private static String e;
  
  static
  {
    dgn.a();
    e = dgn.b();
  }
  
  public static long a(dfo paramdfo)
  {
    return b(paramdfo.a("Content-Length"));
  }
  
  public static long a(dfy paramdfy)
  {
    return a(paramdfy.c);
  }
  
  public static long a(dgc paramdgc)
  {
    return a(paramdgc.f);
  }
  
  public static dfy a(dfa paramdfa, dgc paramdgc, Proxy paramProxy)
  {
    if (paramdgc.c == 407) {}
    for (paramdfa = paramdfa.b(paramProxy, paramdgc);; paramdfa = paramdfa.a(paramProxy, paramdgc)) {
      return paramdfa;
    }
  }
  
  public static Map a(dfo paramdfo, String paramString)
  {
    TreeMap localTreeMap = new TreeMap(d);
    int j = paramdfo.a.length / 2;
    for (int i = 0; i < j; i++)
    {
      String str2 = paramdfo.a(i);
      String str1 = paramdfo.b(i);
      ArrayList localArrayList = new ArrayList();
      List localList = (List)localTreeMap.get(str2);
      if (localList != null) {
        localArrayList.addAll(localList);
      }
      localArrayList.add(str1);
      localTreeMap.put(str2, Collections.unmodifiableList(localArrayList));
    }
    if (paramString != null) {
      localTreeMap.put(null, Collections.unmodifiableList(Collections.singletonList(paramString)));
    }
    return Collections.unmodifiableMap(localTreeMap);
  }
  
  public static void a(dfz paramdfz, Map paramMap)
  {
    Iterator localIterator = paramMap.entrySet().iterator();
    while (localIterator.hasNext())
    {
      paramMap = (Map.Entry)localIterator.next();
      String str = (String)paramMap.getKey();
      if ((("Cookie".equalsIgnoreCase(str)) || ("Cookie2".equalsIgnoreCase(str))) && (!((List)paramMap.getValue()).isEmpty()))
      {
        List localList = (List)paramMap.getValue();
        if (localList.size() == 1) {}
        for (paramMap = (String)localList.get(0);; paramMap = paramMap.toString())
        {
          paramdfz.b(str, paramMap);
          break;
          paramMap = new StringBuilder();
          int j = localList.size();
          for (int i = 0; i < j; i++)
          {
            if (i > 0) {
              paramMap.append("; ");
            }
            paramMap.append((String)localList.get(i));
          }
        }
      }
    }
  }
  
  static boolean a(String paramString)
  {
    if ((!"Connection".equalsIgnoreCase(paramString)) && (!"Keep-Alive".equalsIgnoreCase(paramString)) && (!"Proxy-Authenticate".equalsIgnoreCase(paramString)) && (!"Proxy-Authorization".equalsIgnoreCase(paramString)) && (!"TE".equalsIgnoreCase(paramString)) && (!"Trailers".equalsIgnoreCase(paramString)) && (!"Transfer-Encoding".equalsIgnoreCase(paramString)) && (!"Upgrade".equalsIgnoreCase(paramString))) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  private static long b(String paramString)
  {
    long l1 = -1L;
    if (paramString == null) {}
    for (;;)
    {
      return l1;
      try
      {
        long l2 = Long.parseLong(paramString);
        l1 = l2;
      }
      catch (NumberFormatException paramString) {}
    }
  }
  
  public static List b(dfo paramdfo, String paramString)
  {
    ArrayList localArrayList = new ArrayList();
    int k = paramdfo.a.length / 2;
    for (int i = 0; i < k; i++) {
      if (paramString.equalsIgnoreCase(paramdfo.a(i)))
      {
        String str3 = paramdfo.b(i);
        int j = 0;
        while (j < str3.length())
        {
          int m = a.a(str3, j, " ");
          String str2 = str3.substring(j, m).trim();
          j = a.b(str3, m);
          if (!str3.regionMatches(true, j, "realm=\"", 0, 7)) {
            break;
          }
          m = j + 7;
          j = a.a(str3, m, "\"");
          String str1 = str3.substring(m, j);
          j = a.b(str3, a.a(str3, j + 1, ",") + 1);
          localArrayList.add(new dff(str2, str1));
        }
      }
    }
    return localArrayList;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dhl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */