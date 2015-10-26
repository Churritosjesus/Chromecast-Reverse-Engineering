import java.util.Collection;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

final class ek
  implements Set
{
  ek(ei paramei) {}
  
  public final boolean addAll(Collection paramCollection)
  {
    int i = this.a.a();
    paramCollection = paramCollection.iterator();
    while (paramCollection.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)paramCollection.next();
      this.a.a(localEntry.getKey(), localEntry.getValue());
    }
    if (i != this.a.a()) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public final void clear()
  {
    this.a.c();
  }
  
  public final boolean contains(Object paramObject)
  {
    boolean bool = false;
    if (!(paramObject instanceof Map.Entry)) {}
    for (;;)
    {
      return bool;
      paramObject = (Map.Entry)paramObject;
      int i = this.a.a(((Map.Entry)paramObject).getKey());
      if (i >= 0) {
        bool = ef.a(this.a.a(i, 1), ((Map.Entry)paramObject).getValue());
      }
    }
  }
  
  public final boolean containsAll(Collection paramCollection)
  {
    paramCollection = paramCollection.iterator();
    do
    {
      if (!paramCollection.hasNext()) {
        break;
      }
    } while (contains(paramCollection.next()));
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
    int j = this.a.a() - 1;
    int i = 0;
    if (j >= 0)
    {
      Object localObject1 = this.a.a(j, 0);
      Object localObject2 = this.a.a(j, 1);
      int k;
      if (localObject1 == null)
      {
        k = 0;
        label47:
        if (localObject2 != null) {
          break label77;
        }
      }
      label77:
      for (int m = 0;; m = localObject2.hashCode())
      {
        j--;
        i += (m ^ k);
        break;
        k = localObject1.hashCode();
        break label47;
      }
    }
    return i;
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
    return new em(this.a);
  }
  
  public final boolean remove(Object paramObject)
  {
    throw new UnsupportedOperationException();
  }
  
  public final boolean removeAll(Collection paramCollection)
  {
    throw new UnsupportedOperationException();
  }
  
  public final boolean retainAll(Collection paramCollection)
  {
    throw new UnsupportedOperationException();
  }
  
  public final int size()
  {
    return this.a.a();
  }
  
  public final Object[] toArray()
  {
    throw new UnsupportedOperationException();
  }
  
  public final Object[] toArray(Object[] paramArrayOfObject)
  {
    throw new UnsupportedOperationException();
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\ek.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */