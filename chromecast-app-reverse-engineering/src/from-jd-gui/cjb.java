public final class cjb
  extends cmm
{
  public static final cmn a = new cmn(11, cjb.class, 810, false);
  public int[] b = cmu.a;
  public int[] c = cmu.a;
  public int[] d = cmu.a;
  public int[] e = cmu.a;
  public int f = 0;
  private int g = 0;
  private int h = 0;
  
  public cjb()
  {
    this.m = null;
    this.n = -1;
  }
  
  protected final int a()
  {
    int m = 0;
    int k = super.a();
    int i;
    if ((this.b != null) && (this.b.length > 0))
    {
      j = 0;
      i = 0;
      while (j < this.b.length)
      {
        i += cmk.a(this.b[j]);
        j++;
      }
    }
    for (int j = k + i + this.b.length * 1;; j = k)
    {
      i = j;
      if (this.c != null)
      {
        i = j;
        if (this.c.length > 0)
        {
          k = 0;
          i = 0;
          while (k < this.c.length)
          {
            i += cmk.a(this.c[k]);
            k++;
          }
          i = j + i + this.c.length * 1;
        }
      }
      j = i;
      if (this.d != null)
      {
        j = i;
        if (this.d.length > 0)
        {
          k = 0;
          j = 0;
          while (k < this.d.length)
          {
            j += cmk.a(this.d[k]);
            k++;
          }
          j = i + j + this.d.length * 1;
        }
      }
      i = j;
      if (this.g != 0) {
        i = j + cmk.b(4, this.g);
      }
      j = i;
      if (this.e != null)
      {
        j = i;
        if (this.e.length > 0)
        {
          j = 0;
          for (k = m; k < this.e.length; k++) {
            j += cmk.a(this.e[k]);
          }
          j = i + j + this.e.length * 1;
        }
      }
      i = j;
      if (this.f != 0) {
        i = j + cmk.b(6, this.f);
      }
      j = i;
      if (this.h != 0) {
        j = i + cmk.b(7, this.h);
      }
      return j;
    }
  }
  
  public final void a(cmk paramcmk)
  {
    int j = 0;
    int i;
    if ((this.b != null) && (this.b.length > 0)) {
      for (i = 0; i < this.b.length; i++) {
        paramcmk.a(1, this.b[i]);
      }
    }
    if ((this.c != null) && (this.c.length > 0)) {
      for (i = 0; i < this.c.length; i++) {
        paramcmk.a(2, this.c[i]);
      }
    }
    if ((this.d != null) && (this.d.length > 0)) {
      for (i = 0; i < this.d.length; i++) {
        paramcmk.a(3, this.d[i]);
      }
    }
    if (this.g != 0) {
      paramcmk.a(4, this.g);
    }
    if ((this.e != null) && (this.e.length > 0)) {
      for (i = j; i < this.e.length; i++) {
        paramcmk.a(5, this.e[i]);
      }
    }
    if (this.f != 0) {
      paramcmk.a(6, this.f);
    }
    if (this.h != 0) {
      paramcmk.a(7, this.h);
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
      if ((paramObject instanceof cjb))
      {
        paramObject = (cjb)paramObject;
        bool1 = bool2;
        if (cmq.a(this.b, ((cjb)paramObject).b))
        {
          bool1 = bool2;
          if (cmq.a(this.c, ((cjb)paramObject).c))
          {
            bool1 = bool2;
            if (cmq.a(this.d, ((cjb)paramObject).d))
            {
              bool1 = bool2;
              if (this.g == ((cjb)paramObject).g)
              {
                bool1 = bool2;
                if (cmq.a(this.e, ((cjb)paramObject).e))
                {
                  bool1 = bool2;
                  if (this.f == ((cjb)paramObject).f)
                  {
                    bool1 = bool2;
                    if (this.h == ((cjb)paramObject).h) {
                      bool1 = a((cmm)paramObject);
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
  }
  
  public final int hashCode()
  {
    return (((((((cmq.a(this.b) + 527) * 31 + cmq.a(this.c)) * 31 + cmq.a(this.d)) * 31 + this.g) * 31 + cmq.a(this.e)) * 31 + this.f) * 31 + this.h) * 31 + c();
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cjb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */