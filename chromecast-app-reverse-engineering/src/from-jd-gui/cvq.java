import android.content.Context;
import java.util.Map;

final class cvq
  extends cvf
{
  private static final String b = cip.y.toString();
  private static final String c = cit.i.toString();
  private final Context d;
  
  public cvq(Context paramContext)
  {
    super(b, new String[0]);
    this.d = paramContext;
  }
  
  public final cje a(Map paramMap)
  {
    if ((cje)paramMap.get(c) != null)
    {
      paramMap = cyh.a((cje)paramMap.get(c));
      paramMap = cvr.a(this.d, paramMap);
      if (paramMap == null) {
        break label56;
      }
    }
    label56:
    for (paramMap = cyh.a(paramMap);; paramMap = cyh.f())
    {
      return paramMap;
      paramMap = null;
      break;
    }
  }
  
  public final boolean a()
  {
    return true;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cvq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */