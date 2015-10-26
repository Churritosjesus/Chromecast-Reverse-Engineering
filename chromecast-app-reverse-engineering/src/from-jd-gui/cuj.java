import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

public abstract class cuj
  extends cvf
{
  private static final String b = cit.f.toString();
  private static final String c = cit.g.toString();
  
  public cuj(String paramString)
  {
    super(paramString, new String[] { b, c });
  }
  
  public final cje a(Map paramMap)
  {
    Object localObject = paramMap.values().iterator();
    while (((Iterator)localObject).hasNext()) {
      if ((cje)((Iterator)localObject).next() == cyh.f())
      {
        paramMap = cyh.a(Boolean.valueOf(false));
        return paramMap;
      }
    }
    localObject = (cje)paramMap.get(b);
    cje localcje = (cje)paramMap.get(c);
    if ((localObject == null) || (localcje == null)) {}
    for (boolean bool = false;; bool = a((cje)localObject, localcje, paramMap))
    {
      paramMap = cyh.a(Boolean.valueOf(bool));
      break;
    }
  }
  
  public final boolean a()
  {
    return true;
  }
  
  protected abstract boolean a(cje paramcje1, cje paramcje2, Map paramMap);
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cuj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */