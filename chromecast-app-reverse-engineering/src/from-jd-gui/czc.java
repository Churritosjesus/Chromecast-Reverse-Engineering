import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

final class czc
  extends cvf
{
  private static final String b = cip.k.toString();
  private static final String c = cit.q.toString();
  private static final String d = cit.b.toString();
  private final czd e;
  
  public czc(czd paramczd)
  {
    super(b, new String[] { c });
    this.e = paramczd;
  }
  
  public final cje a(Map paramMap)
  {
    String str = cyh.a((cje)paramMap.get(c));
    HashMap localHashMap = new HashMap();
    paramMap = (cje)paramMap.get(d);
    if (paramMap != null)
    {
      paramMap = cyh.e(paramMap);
      if (!(paramMap instanceof Map))
      {
        cuh.b("FunctionCallMacro: expected ADDITIONAL_PARAMS to be a map.");
        paramMap = cyh.f();
      }
    }
    for (;;)
    {
      return paramMap;
      paramMap = ((Map)paramMap).entrySet().iterator();
      while (paramMap.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)paramMap.next();
        localHashMap.put(localEntry.getKey().toString(), localEntry.getValue());
      }
      try
      {
        paramMap = cyh.a(this.e.a(str, localHashMap));
      }
      catch (Exception paramMap)
      {
        cuh.b("Custom macro/tag " + str + " threw exception " + paramMap.getMessage());
        paramMap = cyh.f();
      }
    }
  }
  
  public final boolean a()
  {
    return false;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\czc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */