import java.util.ArrayList;
import java.util.List;

public final class def
  extends ddk
{
  private static final def b;
  private final List c;
  
  static
  {
    def localdef = new def();
    b = localdef;
    localdef.a = false;
  }
  
  public def()
  {
    this.c = new ArrayList();
  }
  
  def(List paramList)
  {
    this.c = new ArrayList(paramList);
  }
  
  public static def d()
  {
    return b;
  }
  
  public final void add(int paramInt, Object paramObject)
  {
    c();
    this.c.add(paramInt, paramObject);
    this.modCount += 1;
  }
  
  public final Object get(int paramInt)
  {
    return this.c.get(paramInt);
  }
  
  public final Object remove(int paramInt)
  {
    c();
    Object localObject = this.c.remove(paramInt);
    this.modCount += 1;
    return localObject;
  }
  
  public final Object set(int paramInt, Object paramObject)
  {
    c();
    paramObject = this.c.set(paramInt, paramObject);
    this.modCount += 1;
    return paramObject;
  }
  
  public final int size()
  {
    return this.c.size();
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\def.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */