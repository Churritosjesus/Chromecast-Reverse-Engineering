public final class ciu
  extends cmm
{
  private int a = 1;
  private int b = 0;
  private int c = 0;
  
  public ciu()
  {
    this.m = null;
    this.n = -1;
  }
  
  protected final int a()
  {
    int j = super.a();
    int i = j;
    if (this.a != 1) {
      i = j + cmk.b(1, this.a);
    }
    j = i;
    if (this.b != 0) {
      j = i + cmk.b(2, this.b);
    }
    i = j;
    if (this.c != 0) {
      i = j + cmk.b(3, this.c);
    }
    return i;
  }
  
  public final void a(cmk paramcmk)
  {
    if (this.a != 1) {
      paramcmk.a(1, this.a);
    }
    if (this.b != 0) {
      paramcmk.a(2, this.b);
    }
    if (this.c != 0) {
      paramcmk.a(3, this.c);
    }
    super.a(paramcmk);
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool2 = false;
    boolean bool1;
    if (paramObject == this) {
      bool1 = true;
    }
    for (;;)
    {
      return bool1;
      bool1 = bool2;
      if ((paramObject instanceof ciu))
      {
        paramObject = (ciu)paramObject;
        bool1 = bool2;
        if (this.a == ((ciu)paramObject).a)
        {
          bool1 = bool2;
          if (this.b == ((ciu)paramObject).b)
          {
            bool1 = bool2;
            if (this.c == ((ciu)paramObject).c) {
              bool1 = a((cmm)paramObject);
            }
          }
        }
      }
    }
  }
  
  public final int hashCode()
  {
    return (((this.a + 527) * 31 + this.b) * 31 + this.c) * 31 + c();
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\ciu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */