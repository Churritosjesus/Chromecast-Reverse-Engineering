public final class cjc
  extends cmm
{
  private static volatile cjc[] c;
  public String a = "";
  public cix b = null;
  private cje d = null;
  
  public cjc()
  {
    this.m = null;
    this.n = -1;
  }
  
  public static cjc[] b()
  {
    if (c == null) {}
    synchronized (cmq.a)
    {
      if (c == null) {
        c = new cjc[0];
      }
      return c;
    }
  }
  
  protected final int a()
  {
    int i = super.a();
    int j = i;
    if (!this.a.equals("")) {
      j = i + cmk.b(1, this.a);
    }
    i = j;
    if (this.d != null) {
      i = j + cmk.b(2, this.d);
    }
    j = i;
    if (this.b != null) {
      j = i + cmk.b(3, this.b);
    }
    return j;
  }
  
  public final void a(cmk paramcmk)
  {
    if (!this.a.equals("")) {
      paramcmk.a(1, this.a);
    }
    if (this.d != null) {
      paramcmk.a(2, this.d);
    }
    if (this.b != null) {
      paramcmk.a(3, this.b);
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
      if ((paramObject instanceof cjc))
      {
        paramObject = (cjc)paramObject;
        if (this.a == null)
        {
          bool1 = bool2;
          if (((cjc)paramObject).a != null) {
            continue;
          }
          label41:
          if (this.d != null) {
            break label101;
          }
          bool1 = bool2;
          if (((cjc)paramObject).d != null) {
            continue;
          }
          label57:
          if (this.b != null) {
            break label120;
          }
          bool1 = bool2;
          if (((cjc)paramObject).b != null) {
            continue;
          }
        }
        label101:
        label120:
        while (this.b.equals(((cjc)paramObject).b))
        {
          bool1 = a((cmm)paramObject);
          break;
          if (this.a.equals(((cjc)paramObject).a)) {
            break label41;
          }
          bool1 = bool2;
          break;
          if (this.d.equals(((cjc)paramObject).d)) {
            break label57;
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
    int k = 0;
    int i;
    int j;
    if (this.a == null)
    {
      i = 0;
      if (this.d != null) {
        break label62;
      }
      j = 0;
      label20:
      if (this.b != null) {
        break label73;
      }
    }
    for (;;)
    {
      return ((j + (i + 527) * 31) * 31 + k) * 31 + c();
      i = this.a.hashCode();
      break;
      label62:
      j = this.d.hashCode();
      break label20;
      label73:
      k = this.b.hashCode();
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cjc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */