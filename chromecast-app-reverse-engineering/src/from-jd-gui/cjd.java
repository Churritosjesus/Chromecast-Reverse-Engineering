public final class cjd
  extends cmm
{
  public cjc[] a = cjc.b();
  public ciz b = null;
  public String c = "";
  
  public cjd()
  {
    this.m = null;
    this.n = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    int j = i;
    if (this.a != null)
    {
      j = i;
      if (this.a.length > 0)
      {
        int k = 0;
        for (;;)
        {
          j = i;
          if (k >= this.a.length) {
            break;
          }
          cjc localcjc = this.a[k];
          j = i;
          if (localcjc != null) {
            j = i + cmk.b(1, localcjc);
          }
          k++;
          i = j;
        }
      }
    }
    i = j;
    if (this.b != null) {
      i = j + cmk.b(2, this.b);
    }
    j = i;
    if (!this.c.equals("")) {
      j = i + cmk.b(3, this.c);
    }
    return j;
  }
  
  public final void a(cmk paramcmk)
  {
    if ((this.a != null) && (this.a.length > 0)) {
      for (int i = 0; i < this.a.length; i++)
      {
        cjc localcjc = this.a[i];
        if (localcjc != null) {
          paramcmk.a(1, localcjc);
        }
      }
    }
    if (this.b != null) {
      paramcmk.a(2, this.b);
    }
    if (!this.c.equals("")) {
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
      if ((paramObject instanceof cjd))
      {
        paramObject = (cjd)paramObject;
        bool1 = bool2;
        if (cmq.a(this.a, ((cjd)paramObject).a))
        {
          if (this.b == null)
          {
            bool1 = bool2;
            if (((cjd)paramObject).b != null) {
              continue;
            }
            label57:
            if (this.c != null) {
              break label101;
            }
            bool1 = bool2;
            if (((cjd)paramObject).c != null) {
              continue;
            }
          }
          label101:
          while (this.c.equals(((cjd)paramObject).c))
          {
            bool1 = a((cmm)paramObject);
            break;
            if (this.b.equals(((cjd)paramObject).b)) {
              break label57;
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
    int k = cmq.a(this.a);
    int i;
    if (this.b == null)
    {
      i = 0;
      if (this.c != null) {
        break label61;
      }
    }
    for (;;)
    {
      return ((i + (k + 527) * 31) * 31 + j) * 31 + c();
      i = this.b.hashCode();
      break;
      label61:
      j = this.c.hashCode();
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cjd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */