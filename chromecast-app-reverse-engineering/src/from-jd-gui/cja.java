public final class cja
  extends cmm
{
  private static volatile cja[] k;
  public int[] a = cmu.a;
  public int[] b = cmu.a;
  public int[] c = cmu.a;
  public int[] d = cmu.a;
  public int[] e = cmu.a;
  public int[] f = cmu.a;
  public int[] g = cmu.a;
  public int[] h = cmu.a;
  public int[] i = cmu.a;
  public int[] j = cmu.a;
  
  public cja()
  {
    this.m = null;
    this.n = -1;
  }
  
  public static cja[] b()
  {
    if (k == null) {}
    synchronized (cmq.a)
    {
      if (k == null) {
        k = new cja[0];
      }
      return k;
    }
  }
  
  protected final int a()
  {
    int i2 = 0;
    int i1 = super.a();
    int n;
    if ((this.a != null) && (this.a.length > 0))
    {
      n = 0;
      m = 0;
      while (n < this.a.length)
      {
        m += cmk.a(this.a[n]);
        n++;
      }
    }
    for (int m = i1 + m + this.a.length * 1;; m = i1)
    {
      n = m;
      if (this.b != null)
      {
        n = m;
        if (this.b.length > 0)
        {
          n = 0;
          i1 = 0;
          while (n < this.b.length)
          {
            i1 += cmk.a(this.b[n]);
            n++;
          }
          n = m + i1 + this.b.length * 1;
        }
      }
      m = n;
      if (this.c != null)
      {
        m = n;
        if (this.c.length > 0)
        {
          i1 = 0;
          m = 0;
          while (i1 < this.c.length)
          {
            m += cmk.a(this.c[i1]);
            i1++;
          }
          m = n + m + this.c.length * 1;
        }
      }
      n = m;
      if (this.d != null)
      {
        n = m;
        if (this.d.length > 0)
        {
          i1 = 0;
          n = 0;
          while (i1 < this.d.length)
          {
            n += cmk.a(this.d[i1]);
            i1++;
          }
          n = m + n + this.d.length * 1;
        }
      }
      m = n;
      if (this.e != null)
      {
        m = n;
        if (this.e.length > 0)
        {
          i1 = 0;
          m = 0;
          while (i1 < this.e.length)
          {
            m += cmk.a(this.e[i1]);
            i1++;
          }
          m = n + m + this.e.length * 1;
        }
      }
      n = m;
      if (this.f != null)
      {
        n = m;
        if (this.f.length > 0)
        {
          i1 = 0;
          n = 0;
          while (i1 < this.f.length)
          {
            n += cmk.a(this.f[i1]);
            i1++;
          }
          n = m + n + this.f.length * 1;
        }
      }
      m = n;
      if (this.g != null)
      {
        m = n;
        if (this.g.length > 0)
        {
          i1 = 0;
          m = 0;
          while (i1 < this.g.length)
          {
            m += cmk.a(this.g[i1]);
            i1++;
          }
          m = n + m + this.g.length * 1;
        }
      }
      n = m;
      if (this.h != null)
      {
        n = m;
        if (this.h.length > 0)
        {
          i1 = 0;
          n = 0;
          while (i1 < this.h.length)
          {
            n += cmk.a(this.h[i1]);
            i1++;
          }
          n = m + n + this.h.length * 1;
        }
      }
      m = n;
      if (this.i != null)
      {
        m = n;
        if (this.i.length > 0)
        {
          i1 = 0;
          m = 0;
          while (i1 < this.i.length)
          {
            m += cmk.a(this.i[i1]);
            i1++;
          }
          m = n + m + this.i.length * 1;
        }
      }
      n = m;
      if (this.j != null)
      {
        n = m;
        if (this.j.length > 0)
        {
          n = 0;
          for (i1 = i2; i1 < this.j.length; i1++) {
            n += cmk.a(this.j[i1]);
          }
          n = m + n + this.j.length * 1;
        }
      }
      return n;
    }
  }
  
  public final void a(cmk paramcmk)
  {
    int n = 0;
    int m;
    if ((this.a != null) && (this.a.length > 0)) {
      for (m = 0; m < this.a.length; m++) {
        paramcmk.a(1, this.a[m]);
      }
    }
    if ((this.b != null) && (this.b.length > 0)) {
      for (m = 0; m < this.b.length; m++) {
        paramcmk.a(2, this.b[m]);
      }
    }
    if ((this.c != null) && (this.c.length > 0)) {
      for (m = 0; m < this.c.length; m++) {
        paramcmk.a(3, this.c[m]);
      }
    }
    if ((this.d != null) && (this.d.length > 0)) {
      for (m = 0; m < this.d.length; m++) {
        paramcmk.a(4, this.d[m]);
      }
    }
    if ((this.e != null) && (this.e.length > 0)) {
      for (m = 0; m < this.e.length; m++) {
        paramcmk.a(5, this.e[m]);
      }
    }
    if ((this.f != null) && (this.f.length > 0)) {
      for (m = 0; m < this.f.length; m++) {
        paramcmk.a(6, this.f[m]);
      }
    }
    if ((this.g != null) && (this.g.length > 0)) {
      for (m = 0; m < this.g.length; m++) {
        paramcmk.a(7, this.g[m]);
      }
    }
    if ((this.h != null) && (this.h.length > 0)) {
      for (m = 0; m < this.h.length; m++) {
        paramcmk.a(8, this.h[m]);
      }
    }
    if ((this.i != null) && (this.i.length > 0)) {
      for (m = 0; m < this.i.length; m++) {
        paramcmk.a(9, this.i[m]);
      }
    }
    if ((this.j != null) && (this.j.length > 0)) {
      for (m = n; m < this.j.length; m++) {
        paramcmk.a(10, this.j[m]);
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
      if ((paramObject instanceof cja))
      {
        paramObject = (cja)paramObject;
        bool1 = bool2;
        if (cmq.a(this.a, ((cja)paramObject).a))
        {
          bool1 = bool2;
          if (cmq.a(this.b, ((cja)paramObject).b))
          {
            bool1 = bool2;
            if (cmq.a(this.c, ((cja)paramObject).c))
            {
              bool1 = bool2;
              if (cmq.a(this.d, ((cja)paramObject).d))
              {
                bool1 = bool2;
                if (cmq.a(this.e, ((cja)paramObject).e))
                {
                  bool1 = bool2;
                  if (cmq.a(this.f, ((cja)paramObject).f))
                  {
                    bool1 = bool2;
                    if (cmq.a(this.g, ((cja)paramObject).g))
                    {
                      bool1 = bool2;
                      if (cmq.a(this.h, ((cja)paramObject).h))
                      {
                        bool1 = bool2;
                        if (cmq.a(this.i, ((cja)paramObject).i))
                        {
                          bool1 = bool2;
                          if (cmq.a(this.j, ((cja)paramObject).j)) {
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
      }
    }
  }
  
  public final int hashCode()
  {
    return ((((((((((cmq.a(this.a) + 527) * 31 + cmq.a(this.b)) * 31 + cmq.a(this.c)) * 31 + cmq.a(this.d)) * 31 + cmq.a(this.e)) * 31 + cmq.a(this.f)) * 31 + cmq.a(this.g)) * 31 + cmq.a(this.h)) * 31 + cmq.a(this.i)) * 31 + cmq.a(this.j)) * 31 + c();
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cja.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */