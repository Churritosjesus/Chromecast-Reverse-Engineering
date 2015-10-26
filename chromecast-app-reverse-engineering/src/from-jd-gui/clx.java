import java.util.Collections;
import java.util.Map;

public final class clx
{
  public final Map a;
  public final cje b;
  
  clx(Map paramMap, cje paramcje)
  {
    this.a = paramMap;
    this.b = paramcje;
  }
  
  public static cly a()
  {
    return new cly();
  }
  
  public final String toString()
  {
    return "Properties: " + Collections.unmodifiableMap(this.a) + " pushAfterEvaluate: " + this.b;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\clx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */