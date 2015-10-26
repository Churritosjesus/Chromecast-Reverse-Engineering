import java.util.Map;

final class cwp
  extends cvf
{
  private static final String b = cip.o.toString();
  private static final String c = cit.A.toString();
  private static final String d = cit.z.toString();
  
  public cwp()
  {
    super(b, new String[0]);
  }
  
  public final cje a(Map paramMap)
  {
    Object localObject = (cje)paramMap.get(c);
    paramMap = (cje)paramMap.get(d);
    double d2;
    double d1;
    if ((localObject != null) && (localObject != cyh.f()) && (paramMap != null) && (paramMap != cyh.f()))
    {
      localObject = cyh.b((cje)localObject);
      paramMap = cyh.b(paramMap);
      if ((localObject != cyh.d()) && (paramMap != cyh.d()))
      {
        d2 = ((cyg)localObject).doubleValue();
        d1 = paramMap.doubleValue();
        if (d2 > d1) {}
      }
    }
    for (;;)
    {
      return cyh.a(Long.valueOf(Math.round((d1 - d2) * Math.random() + d2)));
      d1 = 2.147483647E9D;
      d2 = 0.0D;
    }
  }
  
  public final boolean a()
  {
    return false;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cwp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */