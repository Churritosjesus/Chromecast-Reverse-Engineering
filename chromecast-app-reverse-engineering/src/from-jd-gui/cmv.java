public final class cmv
  extends cmm
{
  private String[] a = cmu.b;
  private String[] b = cmu.b;
  private int[] c = cmu.a;
  
  public cmv()
  {
    this.m = null;
    this.n = -1;
  }
  
  protected final int a()
  {
    int i2 = 0;
    int i1 = super.a();
    int m;
    int j;
    String str;
    int n;
    int k;
    if ((this.a != null) && (this.a.length > 0))
    {
      m = 0;
      i = 0;
      for (j = 0; m < this.a.length; j = k)
      {
        str = this.a[m];
        n = i;
        k = j;
        if (str != null)
        {
          k = j + 1;
          n = i + cmk.a(str);
        }
        m++;
        i = n;
      }
    }
    for (int i = i1 + i + j * 1;; i = i1)
    {
      j = i;
      if (this.b != null)
      {
        j = i;
        if (this.b.length > 0)
        {
          j = 0;
          m = 0;
          for (k = 0; j < this.b.length; k = n)
          {
            str = this.b[j];
            i1 = m;
            n = k;
            if (str != null)
            {
              n = k + 1;
              i1 = m + cmk.a(str);
            }
            j++;
            m = i1;
          }
          j = i + m + k * 1;
        }
      }
      i = j;
      if (this.c != null)
      {
        i = j;
        if (this.c.length > 0)
        {
          i = 0;
          for (k = i2; k < this.c.length; k++) {
            i += cmk.a(this.c[k]);
          }
          i = j + i + this.c.length * 1;
        }
      }
      return i;
    }
  }
  
  public final void a(cmk paramcmk)
  {
    int j = 0;
    int i;
    String str;
    if ((this.a != null) && (this.a.length > 0)) {
      for (i = 0; i < this.a.length; i++)
      {
        str = this.a[i];
        if (str != null) {
          paramcmk.a(1, str);
        }
      }
    }
    if ((this.b != null) && (this.b.length > 0)) {
      for (i = 0; i < this.b.length; i++)
      {
        str = this.b[i];
        if (str != null) {
          paramcmk.a(2, str);
        }
      }
    }
    if ((this.c != null) && (this.c.length > 0)) {
      for (i = j; i < this.c.length; i++) {
        paramcmk.a(3, this.c[i]);
      }
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
      if ((paramObject instanceof cmv))
      {
        paramObject = (cmv)paramObject;
        bool1 = bool2;
        if (cmq.a(this.a, ((cmv)paramObject).a))
        {
          bool1 = bool2;
          if (cmq.a(this.b, ((cmv)paramObject).b))
          {
            bool1 = bool2;
            if (cmq.a(this.c, ((cmv)paramObject).c)) {
              bool1 = a((cmm)paramObject);
            }
          }
        }
      }
    }
  }
  
  public final int hashCode()
  {
    return (((cmq.a(this.a) + 527) * 31 + cmq.a(this.b)) * 31 + cmq.a(this.c)) * 31 + c();
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cmv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */