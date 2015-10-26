import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ed
  extends ep
  implements Map
{
  private ei d;
  
  private ei a()
  {
    if (this.d == null) {
      this.d = new ee(this);
    }
    return this.d;
  }
  
  public Set entrySet()
  {
    ei localei = a();
    if (localei.a == null) {
      localei.a = new ek(localei);
    }
    return localei.a;
  }
  
  public Set keySet()
  {
    ei localei = a();
    if (localei.b == null) {
      localei.b = new el(localei);
    }
    return localei.b;
  }
  
  public void putAll(Map paramMap)
  {
    int i = this.c + paramMap.size();
    Object localObject;
    if (this.a.length < i)
    {
      localObject = this.a;
      Object[] arrayOfObject = this.b;
      super.a(i);
      if (this.c > 0)
      {
        System.arraycopy(localObject, 0, this.a, 0, this.c);
        System.arraycopy(arrayOfObject, 0, this.b, 0, this.c << 1);
      }
      ep.a((int[])localObject, arrayOfObject, this.c);
    }
    paramMap = paramMap.entrySet().iterator();
    while (paramMap.hasNext())
    {
      localObject = (Map.Entry)paramMap.next();
      put(((Map.Entry)localObject).getKey(), ((Map.Entry)localObject).getValue());
    }
  }
  
  public Collection values()
  {
    ei localei = a();
    if (localei.c == null) {
      localei.c = new en(localei);
    }
    return localei.c;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\ed.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */