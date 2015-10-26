import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

final class el
  implements Set
{
  el(ei paramei) {}
  
  public final boolean add(Object paramObject)
  {
    throw new UnsupportedOperationException();
  }
  
  public final boolean addAll(Collection paramCollection)
  {
    throw new UnsupportedOperationException();
  }
  
  public final void clear()
  {
    this.a.c();
  }
  
  public final boolean contains(Object paramObject)
  {
    if (this.a.a(paramObject) >= 0) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public final boolean containsAll(Collection paramCollection)
  {
    Map localMap = this.a.b();
    paramCollection = paramCollection.iterator();
    do
    {
      if (!paramCollection.hasNext()) {
        break;
      }
    } while (localMap.containsKey(paramCollection.next()));
    for (boolean bool = false;; bool = true) {
      return bool;
    }
  }
  
  public final boolean equals(Object paramObject)
  {
    return ei.a(this, paramObject);
  }
  
  public final int hashCode()
  {
    int i = this.a.a() - 1;
    int j = 0;
    if (i >= 0)
    {
      Object localObject = this.a.a(i, 0);
      if (localObject == null) {}
      for (int k = 0;; k = localObject.hashCode())
      {
        j += k;
        i--;
        break;
      }
    }
    return j;
  }
  
  public final boolean isEmpty()
  {
    if (this.a.a() == 0) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public final Iterator iterator()
  {
    return new ej(this.a, 0);
  }
  
  public final boolean remove(Object paramObject)
  {
    int i = this.a.a(paramObject);
    if (i >= 0) {
      this.a.a(i);
    }
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public final boolean removeAll(Collection paramCollection)
  {
    Map localMap = this.a.b();
    int i = localMap.size();
    paramCollection = paramCollection.iterator();
    while (paramCollection.hasNext()) {
      localMap.remove(paramCollection.next());
    }
    if (i != localMap.size()) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public final boolean retainAll(Collection paramCollection)
  {
    return ei.a(this.a.b(), paramCollection);
  }
  
  public final int size()
  {
    return this.a.a();
  }
  
  public final Object[] toArray()
  {
    return this.a.b(0);
  }
  
  public final Object[] toArray(Object[] paramArrayOfObject)
  {
    return this.a.a(paramArrayOfObject, 0);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\el.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */