import java.util.AbstractList;
import java.util.Collection;

abstract class ddk
  extends AbstractList
  implements ddw
{
  boolean a = true;
  
  public final boolean a()
  {
    return this.a;
  }
  
  public void add(int paramInt, Object paramObject)
  {
    c();
    super.add(paramInt, paramObject);
  }
  
  public boolean add(Object paramObject)
  {
    c();
    return super.add(paramObject);
  }
  
  public boolean addAll(int paramInt, Collection paramCollection)
  {
    c();
    return super.addAll(paramInt, paramCollection);
  }
  
  public boolean addAll(Collection paramCollection)
  {
    c();
    return super.addAll(paramCollection);
  }
  
  public final void b()
  {
    this.a = false;
  }
  
  protected final void c()
  {
    if (!this.a) {
      throw new UnsupportedOperationException();
    }
  }
  
  public void clear()
  {
    c();
    super.clear();
  }
  
  public Object remove(int paramInt)
  {
    c();
    return super.remove(paramInt);
  }
  
  public boolean remove(Object paramObject)
  {
    c();
    return super.remove(paramObject);
  }
  
  public boolean removeAll(Collection paramCollection)
  {
    c();
    return super.removeAll(paramCollection);
  }
  
  public boolean retainAll(Collection paramCollection)
  {
    c();
    return super.retainAll(paramCollection);
  }
  
  public Object set(int paramInt, Object paramObject)
  {
    c();
    return super.set(paramInt, paramObject);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\ddk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */