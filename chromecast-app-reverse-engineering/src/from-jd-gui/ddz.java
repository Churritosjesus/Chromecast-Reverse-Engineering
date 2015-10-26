import java.util.NoSuchElementException;

final class ddz
  implements ddm
{
  private int a = 0;
  private final int b;
  
  ddz(ddy paramddy)
  {
    this.b = paramddy.b();
  }
  
  public final byte a()
  {
    try
    {
      byte[] arrayOfByte = this.c.b;
      int i = this.a;
      this.a = (i + 1);
      byte b1 = arrayOfByte[i];
      return b1;
    }
    catch (ArrayIndexOutOfBoundsException localArrayIndexOutOfBoundsException)
    {
      throw new NoSuchElementException(localArrayIndexOutOfBoundsException.getMessage());
    }
  }
  
  public final boolean hasNext()
  {
    if (this.a < this.b) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public final void remove()
  {
    throw new UnsupportedOperationException();
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\ddz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */