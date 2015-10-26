import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

final class cws
  extends cxz
{
  private static final String b = cip.F.toString();
  private static final String c = cit.s.toString();
  
  public cws()
  {
    super(b);
  }
  
  protected final boolean a(String paramString1, String paramString2, Map paramMap)
  {
    if (cyh.d((cje)paramMap.get(c)).booleanValue()) {}
    for (int i = 66;; i = 64) {
      try
      {
        bool = Pattern.compile(paramString2, i).matcher(paramString1).find();
        return bool;
      }
      catch (PatternSyntaxException paramString1)
      {
        for (;;)
        {
          boolean bool = false;
        }
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cws.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */