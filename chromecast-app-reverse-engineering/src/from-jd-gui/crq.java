import java.util.Iterator;
import java.util.NoSuchElementException;

public final class crq
  implements Iterable, Iterator
{
  public final boolean hasNext()
  {
    return false;
  }
  
  public final Iterator iterator()
  {
    return this;
  }
  
  public final Object next()
  {
    throw new NoSuchElementException();
  }
  
  public final void remove()
  {
    throw new UnsupportedOperationException();
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\crq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */