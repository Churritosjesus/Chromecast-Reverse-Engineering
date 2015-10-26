import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class clz
{
  public final List a;
  public final Map b;
  public final String c;
  
  clz(List paramList, Map paramMap, String paramString, int paramInt)
  {
    this.a = Collections.unmodifiableList(paramList);
    this.b = Collections.unmodifiableMap(paramMap);
    this.c = paramString;
  }
  
  public static cma a()
  {
    return new cma();
  }
  
  public final String toString()
  {
    return "Rules: " + this.a + "  Macros: " + this.b;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\clz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */