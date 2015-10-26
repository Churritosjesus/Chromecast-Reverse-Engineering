import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class cma
{
  public final List a = new ArrayList();
  public String b = "";
  public int c = 0;
  private final Map d = new HashMap();
  
  public final clz a()
  {
    return new clz(this.a, this.d, this.b, this.c);
  }
  
  public final cma a(clx paramclx)
  {
    String str = cyh.a((cje)Collections.unmodifiableMap(paramclx.a).get(cit.u.toString()));
    List localList = (List)this.d.get(str);
    Object localObject = localList;
    if (localList == null)
    {
      localObject = new ArrayList();
      this.d.put(str, localObject);
    }
    ((List)localObject).add(paramclx);
    return this;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cma.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */