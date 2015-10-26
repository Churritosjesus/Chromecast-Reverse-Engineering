public final class clv
  extends cmm
{
  public long a = 0L;
  public ciz b = null;
  public cjd c = null;
  
  public clv()
  {
    this.m = null;
    this.n = -1;
  }
  
  protected final int a()
  {
    int j = super.a() + cmk.b(1, this.a);
    int i = j;
    if (this.b != null) {
      i = j + cmk.b(2, this.b);
    }
    j = i;
    if (this.c != null) {
      j = i + cmk.b(3, this.c);
    }
    return j;
  }
  
  public final void a(cmk paramcmk)
  {
    paramcmk.a(1, this.a);
    if (this.b != null) {
      paramcmk.a(2, this.b);
    }
    if (this.c != null) {
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
      if ((paramObject instanceof clv))
      {
        paramObject = (clv)paramObject;
        bool1 = bool2;
        if (this.a == ((clv)paramObject).a)
        {
          if (this.b == null)
          {
            bool1 = bool2;
            if (((clv)paramObject).b != null) {
              continue;
            }
            label55:
            if (this.c != null) {
              break label99;
            }
            bool1 = bool2;
            if (((clv)paramObject).c != null) {
              continue;
            }
          }
          label99:
          while (this.c.equals(((clv)paramObject).c))
          {
            bool1 = a((cmm)paramObject);
            break;
            if (this.b.equals(((clv)paramObject).b)) {
              break label55;
            }
            bool1 = bool2;
            break;
          }
          bool1 = bool2;
        }
      }
    }
  }
  
  public final int hashCode()
  {
    int j = 0;
    int k = (int)(this.a ^ this.a >>> 32);
    int i;
    if (this.b == null)
    {
      i = 0;
      if (this.c != null) {
        break label67;
      }
    }
    for (;;)
    {
      return ((i + (k + 527) * 31) * 31 + j) * 31 + c();
      i = this.b.hashCode();
      break;
      label67:
      j = this.c.hashCode();
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\clv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */