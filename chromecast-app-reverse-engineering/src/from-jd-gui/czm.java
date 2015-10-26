import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class czm
  extends cyf
{
  private static final String b = cip.C.toString();
  private static final String c = cit.M.toString();
  private static final String d = cit.h.toString();
  private final ctw e;
  
  public czm(ctw paramctw)
  {
    super(b, new String[] { c });
    this.e = paramctw;
  }
  
  public final void b(Map paramMap)
  {
    Object localObject1 = (cje)paramMap.get(c);
    if ((localObject1 == null) || (localObject1 == cyh.a()))
    {
      paramMap = (cje)paramMap.get(d);
      if ((paramMap != null) && (paramMap != cyh.a())) {
        break label110;
      }
    }
    for (;;)
    {
      return;
      localObject1 = cyh.e((cje)localObject1);
      if (!(localObject1 instanceof List)) {
        break;
      }
      localObject1 = ((List)localObject1).iterator();
      while (((Iterator)localObject1).hasNext())
      {
        Object localObject2 = ((Iterator)localObject1).next();
        if ((localObject2 instanceof Map))
        {
          localObject2 = (Map)localObject2;
          this.e.a((Map)localObject2);
        }
      }
      break;
      label110:
      paramMap = cyh.a(paramMap);
      if (paramMap != cyh.e()) {
        this.e.a(paramMap);
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\czm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */