import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

final class cxv
  implements cyt
{
  private final Map a = new HashMap();
  private final int b;
  private final cyw c;
  private int d;
  
  cxv(int paramInt, cyw paramcyw)
  {
    this.b = paramInt;
    this.c = paramcyw;
  }
  
  public final Object a(Object paramObject)
  {
    try
    {
      paramObject = this.a.get(paramObject);
      return paramObject;
    }
    finally
    {
      paramObject = finally;
      throw ((Throwable)paramObject);
    }
  }
  
  public final void a(Object paramObject1, Object paramObject2)
  {
    if (paramObject1 == null) {
      try
      {
        paramObject1 = new java/lang/NullPointerException;
        ((NullPointerException)paramObject1).<init>("key == null || value == null");
        throw ((Throwable)paramObject1);
      }
      finally {}
    }
    this.d += this.c.a(paramObject1, paramObject2);
    if (this.d > this.b)
    {
      Iterator localIterator = this.a.entrySet().iterator();
      do
      {
        if (!localIterator.hasNext()) {
          break;
        }
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        this.d -= this.c.a(localEntry.getKey(), localEntry.getValue());
        localIterator.remove();
      } while (this.d > this.b);
    }
    this.a.put(paramObject1, paramObject2);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cxv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */