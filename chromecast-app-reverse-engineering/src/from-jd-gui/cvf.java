import java.util.HashSet;
import java.util.Map;
import java.util.Set;

abstract class cvf
{
  final Set a;
  private final String b;
  
  public cvf(String paramString, String... paramVarArgs)
  {
    this.b = paramString;
    this.a = new HashSet(paramVarArgs.length);
    int j = paramVarArgs.length;
    for (int i = 0; i < j; i++)
    {
      paramString = paramVarArgs[i];
      this.a.add(paramString);
    }
  }
  
  public abstract cje a(Map paramMap);
  
  public abstract boolean a();
  
  public Set b()
  {
    return this.a;
  }
  
  public String c()
  {
    return this.b;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cvf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */