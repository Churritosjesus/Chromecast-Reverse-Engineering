public class eo
{
  final Object[] a = new Object[30];
  int b;
  
  public eo(int paramInt) {}
  
  public Object a()
  {
    Object localObject;
    if (this.b > 0)
    {
      int i = this.b - 1;
      localObject = this.a[i];
      this.a[i] = null;
      this.b -= 1;
    }
    for (;;)
    {
      return localObject;
      localObject = null;
    }
  }
  
  public boolean a(Object paramObject)
  {
    if (b(paramObject)) {
      throw new IllegalStateException("Already in the pool!");
    }
    if (this.b < this.a.length)
    {
      this.a[this.b] = paramObject;
      this.b += 1;
    }
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  boolean b(Object paramObject)
  {
    boolean bool2 = false;
    for (int i = 0;; i++)
    {
      boolean bool1 = bool2;
      if (i < this.b)
      {
        if (this.a[i] == paramObject) {
          bool1 = true;
        }
      }
      else {
        return bool1;
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\eo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */