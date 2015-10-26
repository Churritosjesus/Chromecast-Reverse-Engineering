public final class cmz
  extends cmm
{
  private static volatile cmz[] a;
  private String b = "";
  private String c = "";
  
  public cmz()
  {
    this.m = null;
    this.n = -1;
  }
  
  public static cmz[] b()
  {
    if (a == null) {}
    synchronized (cmq.a)
    {
      if (a == null) {
        a = new cmz[0];
      }
      return a;
    }
  }
  
  protected final int a()
  {
    int j = super.a();
    int i = j;
    if (!this.b.equals("")) {
      i = j + cmk.b(1, this.b);
    }
    j = i;
    if (!this.c.equals("")) {
      j = i + cmk.b(2, this.c);
    }
    return j;
  }
  
  public final void a(cmk paramcmk)
  {
    if (!this.b.equals("")) {
      paramcmk.a(1, this.b);
    }
    if (!this.c.equals("")) {
      paramcmk.a(2, this.c);
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
      if ((paramObject instanceof cmz))
      {
        paramObject = (cmz)paramObject;
        if (this.b == null)
        {
          bool1 = bool2;
          if (((cmz)paramObject).b != null) {
            continue;
          }
          label41:
          if (this.c != null) {
            break label85;
          }
          bool1 = bool2;
          if (((cmz)paramObject).c != null) {
            continue;
          }
        }
        label85:
        while (this.c.equals(((cmz)paramObject).c))
        {
          bool1 = a((cmm)paramObject);
          break;
          if (this.b.equals(((cmz)paramObject).b)) {
            break label41;
          }
          bool1 = bool2;
          break;
        }
        bool1 = bool2;
      }
    }
  }
  
  public final int hashCode()
  {
    int j = 0;
    int i;
    if (this.b == null)
    {
      i = 0;
      if (this.c != null) {
        break label48;
      }
    }
    for (;;)
    {
      return ((i + 527) * 31 + j) * 31 + c();
      i = this.b.hashCode();
      break;
      label48:
      j = this.c.hashCode();
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cmz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */