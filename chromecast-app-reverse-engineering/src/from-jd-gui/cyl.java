import android.content.Context;
import java.util.Map;

final class cyl
  extends cvf
{
  private static final String b = cip.t.toString();
  private static final String c = cit.i.toString();
  private static final String d = cit.j.toString();
  private final Context e;
  
  public cyl(Context paramContext)
  {
    super(b, new String[] { d });
    this.e = paramContext;
  }
  
  public final cje a(Map paramMap)
  {
    Object localObject = (cje)paramMap.get(d);
    if (localObject == null) {
      paramMap = cyh.f();
    }
    for (;;)
    {
      return paramMap;
      localObject = cyh.a((cje)localObject);
      paramMap = (cje)paramMap.get(c);
      if (paramMap != null) {}
      for (paramMap = cyh.a(paramMap);; paramMap = null)
      {
        paramMap = cvr.a(this.e, (String)localObject, paramMap);
        if (paramMap == null) {
          break label77;
        }
        paramMap = cyh.a(paramMap);
        break;
      }
      label77:
      paramMap = cyh.f();
    }
  }
  
  public final boolean a()
  {
    return true;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cyl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */