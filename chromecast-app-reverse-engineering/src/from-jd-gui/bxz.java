import java.util.Iterator;
import java.util.NoSuchElementException;

public final class bxz
  implements Iterator
{
  private bxv a;
  private int b;
  
  public bxz(bxv parambxv)
  {
    this.a = ((bxv)a.c(parambxv));
    this.b = -1;
  }
  
  public final boolean hasNext()
  {
    if (this.b < this.a.b() - 1) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public final Object next()
  {
    if (!hasNext()) {
      throw new NoSuchElementException("Cannot advance the iterator beyond " + this.b);
    }
    bxv localbxv = this.a;
    int i = this.b + 1;
    this.b = i;
    return localbxv.a(i);
  }
  
  public final void remove()
  {
    throw new UnsupportedOperationException("Cannot remove elements from a DataBufferIterator");
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bxz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */