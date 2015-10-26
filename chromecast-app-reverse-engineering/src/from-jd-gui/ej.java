import java.util.Iterator;

final class ej
  implements Iterator
{
  private int a;
  private int b;
  private int c;
  private boolean d = false;
  
  ej(ei paramei, int paramInt)
  {
    this.a = paramInt;
    this.b = paramei.a();
  }
  
  public final boolean hasNext()
  {
    if (this.c < this.b) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public final Object next()
  {
    Object localObject = this.e.a(this.c, this.a);
    this.c += 1;
    this.d = true;
    return localObject;
  }
  
  public final void remove()
  {
    if (!this.d) {
      throw new IllegalStateException();
    }
    this.c -= 1;
    this.b -= 1;
    this.d = false;
    this.e.a(this.c);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\ej.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */