import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;

final class deh
  implements Iterator
{
  private final Stack a = new Stack();
  private ddy b = a(paramddl);
  
  deh(ddl paramddl) {}
  
  private ddy a(ddl paramddl)
  {
    while ((paramddl instanceof deg))
    {
      paramddl = (deg)paramddl;
      this.a.push(paramddl);
      paramddl = deg.a(paramddl);
    }
    return (ddy)paramddl;
  }
  
  private ddy b()
  {
    if (this.a.isEmpty())
    {
      localddy = null;
      label12:
      return localddy;
    }
    ddy localddy = a(deg.b((deg)this.a.pop()));
    if (localddy.b() == 0) {}
    for (int i = 1; i == 0; i = 0) {
      break label12;
    }
  }
  
  public final ddy a()
  {
    if (this.b == null) {
      throw new NoSuchElementException();
    }
    ddy localddy = this.b;
    this.b = b();
    return localddy;
  }
  
  public final boolean hasNext()
  {
    if (this.b != null) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public final void remove()
  {
    throw new UnsupportedOperationException();
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\deh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */