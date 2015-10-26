public final class dci
  extends dew
{
  private static volatile dci[] d;
  public Boolean a = null;
  public dca[] b = dca.b();
  public String c = null;
  private Integer e = null;
  private Long f = null;
  private dby[] g = dby.b();
  private dcb[] h = dcb.b();
  private Boolean i = null;
  private Integer j = null;
  
  public dci()
  {
    this.t = -1;
  }
  
  public static dci[] b()
  {
    if (d == null) {}
    synchronized (deu.a)
    {
      if (d == null) {
        d = new dci[0];
      }
      return d;
    }
  }
  
  protected final int a()
  {
    int i1 = 0;
    int m = super.a();
    int k = m;
    if (this.e != null) {
      k = m + dep.b(1, this.e.intValue());
    }
    m = k;
    if (this.a != null)
    {
      this.a.booleanValue();
      m = k + (dep.b(2) + 1);
    }
    k = m;
    int n;
    Object localObject;
    if (this.g != null)
    {
      k = m;
      if (this.g.length > 0)
      {
        k = m;
        n = 0;
        while (n < this.g.length)
        {
          localObject = this.g[n];
          m = k;
          if (localObject != null) {
            m = k + dep.b(3, (dew)localObject);
          }
          n++;
          k = m;
        }
      }
    }
    m = k;
    if (this.b != null)
    {
      m = k;
      if (this.b.length > 0)
      {
        m = 0;
        while (m < this.b.length)
        {
          localObject = this.b[m];
          n = k;
          if (localObject != null) {
            n = k + dep.b(4, (dew)localObject);
          }
          m++;
          k = n;
        }
        m = k;
      }
    }
    k = m;
    if (this.f != null) {
      k = m + dep.b(5, this.f.longValue());
    }
    m = k;
    if (this.c != null) {
      m = k + dep.b(7, this.c);
    }
    k = m;
    if (this.i != null)
    {
      this.i.booleanValue();
      k = m + (dep.b(8) + 1);
    }
    m = k;
    if (this.h != null)
    {
      m = k;
      if (this.h.length > 0)
      {
        n = i1;
        for (;;)
        {
          m = k;
          if (n >= this.h.length) {
            break;
          }
          localObject = this.h[n];
          m = k;
          if (localObject != null) {
            m = k + dep.b(9, (dew)localObject);
          }
          n++;
          k = m;
        }
      }
    }
    k = m;
    if (this.j != null) {
      k = m + dep.b(10, this.j.intValue());
    }
    return k;
  }
  
  public final void a(dep paramdep)
  {
    int m = 0;
    if (this.e != null) {
      paramdep.a(1, this.e.intValue());
    }
    if (this.a != null) {
      paramdep.a(2, this.a.booleanValue());
    }
    int k;
    Object localObject;
    if ((this.g != null) && (this.g.length > 0)) {
      for (k = 0; k < this.g.length; k++)
      {
        localObject = this.g[k];
        if (localObject != null) {
          paramdep.a(3, (dew)localObject);
        }
      }
    }
    if ((this.b != null) && (this.b.length > 0)) {
      for (k = 0; k < this.b.length; k++)
      {
        localObject = this.b[k];
        if (localObject != null) {
          paramdep.a(4, (dew)localObject);
        }
      }
    }
    if (this.f != null) {
      paramdep.a(5, this.f.longValue());
    }
    if (this.c != null) {
      paramdep.a(7, this.c);
    }
    if (this.i != null) {
      paramdep.a(8, this.i.booleanValue());
    }
    if ((this.h != null) && (this.h.length > 0)) {
      for (k = m; k < this.h.length; k++)
      {
        localObject = this.h[k];
        if (localObject != null) {
          paramdep.a(9, (dew)localObject);
        }
      }
    }
    if (this.j != null) {
      paramdep.a(10, this.j.intValue());
    }
    super.a(paramdep);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dci.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */