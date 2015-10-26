import java.util.Map;

abstract class cxz
  extends cuj
{
  public cxz(String paramString)
  {
    super(paramString);
  }
  
  protected final boolean a(cje paramcje1, cje paramcje2, Map paramMap)
  {
    paramcje1 = cyh.a(paramcje1);
    paramcje2 = cyh.a(paramcje2);
    if ((paramcje1 == cyh.e()) || (paramcje2 == cyh.e())) {}
    for (boolean bool = false;; bool = a(paramcje1, paramcje2, paramMap)) {
      return bool;
    }
  }
  
  protected abstract boolean a(String paramString1, String paramString2, Map paramMap);
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cxz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */