import java.util.HashMap;
import java.util.Map;

final class bti
{
  final Map a = new HashMap();
  private final Map b = new HashMap();
  private final Map c = new HashMap();
  
  public final int a(String paramString)
  {
    paramString = (Integer)this.c.get(paramString);
    if (paramString != null) {}
    for (int i = paramString.intValue();; i = 0) {
      return i;
    }
  }
  
  public final bti a(String paramString1, String paramString2, int paramInt)
  {
    this.b.put(paramString1, paramString2);
    this.a.put(paramString2, paramString1);
    this.c.put(paramString1, Integer.valueOf(paramInt));
    return this;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bti.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */