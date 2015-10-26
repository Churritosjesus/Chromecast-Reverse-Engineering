import java.util.Iterator;
import java.util.Map.Entry;

final class em
  implements Iterator, Map.Entry
{
  private int a;
  private int b;
  private boolean c = false;
  
  em(ei paramei)
  {
    this.a = (paramei.a() - 1);
    this.b = -1;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool2 = false;
    if (!this.c) {
      throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }
    boolean bool1;
    if (!(paramObject instanceof Map.Entry)) {
      bool1 = bool2;
    }
    for (;;)
    {
      return bool1;
      paramObject = (Map.Entry)paramObject;
      bool1 = bool2;
      if (ef.a(((Map.Entry)paramObject).getKey(), this.d.a(this.b, 0)))
      {
        bool1 = bool2;
        if (ef.a(((Map.Entry)paramObject).getValue(), this.d.a(this.b, 1))) {
          bool1 = true;
        }
      }
    }
  }
  
  public final Object getKey()
  {
    if (!this.c) {
      throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }
    return this.d.a(this.b, 0);
  }
  
  public final Object getValue()
  {
    if (!this.c) {
      throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }
    return this.d.a(this.b, 1);
  }
  
  public final boolean hasNext()
  {
    if (this.b < this.a) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public final int hashCode()
  {
    int j = 0;
    if (!this.c) {
      throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }
    Object localObject1 = this.d.a(this.b, 0);
    Object localObject2 = this.d.a(this.b, 1);
    int i;
    if (localObject1 == null)
    {
      i = 0;
      if (localObject2 != null) {
        break label69;
      }
    }
    for (;;)
    {
      return j ^ i;
      i = localObject1.hashCode();
      break;
      label69:
      j = localObject2.hashCode();
    }
  }
  
  public final void remove()
  {
    if (!this.c) {
      throw new IllegalStateException();
    }
    this.d.a(this.b);
    this.b -= 1;
    this.a -= 1;
    this.c = false;
  }
  
  public final Object setValue(Object paramObject)
  {
    if (!this.c) {
      throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }
    return this.d.a(this.b, paramObject);
  }
  
  public final String toString()
  {
    return getKey() + "=" + getValue();
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\em.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */