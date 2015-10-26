import java.util.Collection;
import java.util.Iterator;

final class en
  implements Collection
{
  en(ei paramei) {}
  
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
    if (this.a.b(paramObject) >= 0) {}
    for (boolean bool = true;; bool = false) {
      return bool;
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
  
  public final boolean isEmpty()
  {
    if (this.a.a() == 0) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public final Iterator iterator()
  {
    return new ej(this.a, 1);
  }
  
  public final boolean remove(Object paramObject)
  {
    int i = this.a.b(paramObject);
    if (i >= 0) {
      this.a.a(i);
    }
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public final boolean removeAll(Collection paramCollection)
  {
    int i = 0;
    int j = this.a.a();
    boolean bool = false;
    while (i < j)
    {
      int m = i;
      int k = j;
      if (paramCollection.contains(this.a.a(i, 1)))
      {
        this.a.a(i);
        m = i - 1;
        k = j - 1;
        bool = true;
      }
      i = m + 1;
      j = k;
    }
    return bool;
  }
  
  public final boolean retainAll(Collection paramCollection)
  {
    int i = 0;
    int j = this.a.a();
    boolean bool = false;
    while (i < j)
    {
      int m = i;
      int k = j;
      if (!paramCollection.contains(this.a.a(i, 1)))
      {
        this.a.a(i);
        m = i - 1;
        k = j - 1;
        bool = true;
      }
      i = m + 1;
      j = k;
    }
    return bool;
  }
  
  public final int size()
  {
    return this.a.a();
  }
  
  public final Object[] toArray()
  {
    return this.a.b(1);
  }
  
  public final Object[] toArray(Object[] paramArrayOfObject)
  {
    return this.a.a(paramArrayOfObject, 1);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\en.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */