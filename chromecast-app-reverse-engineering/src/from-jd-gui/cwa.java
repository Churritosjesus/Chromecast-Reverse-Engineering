import android.content.Context;
import java.util.Map;

final class cwa
  extends cvf
{
  private static final String b = cip.a.toString();
  private final cuv c;
  
  public cwa(Context paramContext)
  {
    this(cuv.a(paramContext));
  }
  
  private cwa(cuv paramcuv)
  {
    super(b, new String[0]);
    this.c = paramcuv;
  }
  
  public final cje a(Map paramMap)
  {
    paramMap = this.c;
    paramMap.a();
    if (paramMap.a == null)
    {
      paramMap = null;
      if (paramMap != null) {
        break label39;
      }
    }
    label39:
    for (paramMap = cyh.f();; paramMap = cyh.a(paramMap))
    {
      return paramMap;
      paramMap = paramMap.a.a;
      break;
    }
  }
  
  public final boolean a()
  {
    return false;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cwa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */