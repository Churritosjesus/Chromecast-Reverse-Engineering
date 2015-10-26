import java.util.Map;

abstract class cwi
  extends cuj
{
  public cwi(String paramString)
  {
    super(paramString);
  }
  
  protected final boolean a(cje paramcje1, cje paramcje2, Map paramMap)
  {
    paramcje1 = cyh.b(paramcje1);
    paramcje2 = cyh.b(paramcje2);
    if ((paramcje1 == cyh.d()) || (paramcje2 == cyh.d())) {}
    for (boolean bool = false;; bool = a(paramcje1, paramcje2)) {
      return bool;
    }
  }
  
  protected abstract boolean a(cyg paramcyg1, cyg paramcyg2);
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cwi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */