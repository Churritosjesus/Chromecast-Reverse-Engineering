import java.util.Iterator;
import java.util.NoSuchElementException;

abstract class bkz
  implements Iterator
{
  int a = bla.b;
  private Object b;
  
  protected abstract Object a();
  
  public final boolean hasNext()
  {
    boolean bool2 = false;
    if (this.a == bla.d) {
      throw new IllegalStateException();
    }
    boolean bool1 = bool2;
    switch (bkt.a[(this.a - 1)])
    {
    default: 
      this.a = bla.d;
      this.b = a();
      bool1 = bool2;
      if (this.a != bla.c) {
        this.a = bla.a;
      }
      break;
    }
    for (bool1 = true;; bool1 = true) {
      return bool1;
    }
  }
  
  public final Object next()
  {
    if (!hasNext()) {
      throw new NoSuchElementException();
    }
    this.a = bla.b;
    return this.b;
  }
  
  public void remove()
  {
    throw new UnsupportedOperationException();
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bkz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */