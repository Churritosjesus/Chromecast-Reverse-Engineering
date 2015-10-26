import java.util.Locale;
import java.util.Map;

public final class cug
  extends cvf
{
  private static final String b = cip.l.toString();
  
  public cug()
  {
    super(b, new String[0]);
  }
  
  public final cje a(Map paramMap)
  {
    paramMap = Locale.getDefault();
    if (paramMap == null) {
      paramMap = cyh.f();
    }
    for (;;)
    {
      return paramMap;
      paramMap = paramMap.getLanguage();
      if (paramMap == null) {
        paramMap = cyh.f();
      } else {
        paramMap = cyh.a(paramMap.toLowerCase());
      }
    }
  }
  
  public final boolean a()
  {
    return false;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cug.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */