import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

final class cwr
  extends cvf
{
  private static final String b = cip.B.toString();
  private static final String c = cit.f.toString();
  private static final String d = cit.g.toString();
  private static final String e = cit.s.toString();
  private static final String f = cit.r.toString();
  
  public cwr()
  {
    super(b, new String[] { c, d });
  }
  
  public final cje a(Map paramMap)
  {
    Object localObject = (cje)paramMap.get(c);
    cje localcje = (cje)paramMap.get(d);
    if ((localObject == null) || (localObject == cyh.f()) || (localcje == null) || (localcje == cyh.f())) {
      paramMap = cyh.f();
    }
    for (;;)
    {
      return paramMap;
      int i = 64;
      if (cyh.d((cje)paramMap.get(e)).booleanValue()) {
        i = 66;
      }
      paramMap = (cje)paramMap.get(f);
      int j;
      if (paramMap != null)
      {
        paramMap = cyh.c(paramMap);
        if (paramMap == cyh.b())
        {
          paramMap = cyh.f();
          continue;
        }
        int k = paramMap.intValue();
        j = k;
        if (k < 0) {
          paramMap = cyh.f();
        }
      }
      else
      {
        j = 1;
      }
      try
      {
        paramMap = cyh.a((cje)localObject);
        localObject = cyh.a(localcje);
        localcje = null;
        localObject = Pattern.compile((String)localObject, i).matcher(paramMap);
        paramMap = localcje;
        if (((Matcher)localObject).find())
        {
          paramMap = localcje;
          if (((Matcher)localObject).groupCount() >= j) {
            paramMap = ((Matcher)localObject).group(j);
          }
        }
        if (paramMap == null) {
          paramMap = cyh.f();
        } else {
          paramMap = cyh.a(paramMap);
        }
      }
      catch (PatternSyntaxException paramMap)
      {
        paramMap = cyh.f();
      }
    }
  }
  
  public final boolean a()
  {
    return true;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cwr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */