public final class dbb
  extends dew
{
  public dbj a = null;
  public String b = null;
  public dbj c = null;
  public String d = null;
  public String e = null;
  public String f = null;
  public String g = null;
  public dbc[] h = dbc.b();
  public dbd[] i = dbd.b();
  public dbe[] j = dbe.b();
  
  public dbb()
  {
    this.t = -1;
  }
  
  protected final int a()
  {
    int i1 = 0;
    int k = super.a();
    int m = k;
    if (this.a != null) {
      m = k + dep.b(1, this.a);
    }
    k = m;
    if (this.b != null) {
      k = m + dep.b(2, this.b);
    }
    m = k;
    if (this.c != null) {
      m = k + dep.b(3, this.c);
    }
    k = m;
    if (this.d != null) {
      k = m + dep.b(4, this.d);
    }
    m = k;
    if (this.e != null) {
      m = k + dep.b(5, this.e);
    }
    k = m;
    if (this.f != null) {
      k = m + dep.b(6, this.f);
    }
    m = k;
    int n;
    Object localObject;
    if (this.i != null)
    {
      m = k;
      if (this.i.length > 0)
      {
        n = 0;
        while (n < this.i.length)
        {
          localObject = this.i[n];
          m = k;
          if (localObject != null) {
            m = k + dep.b(7, (dew)localObject);
          }
          n++;
          k = m;
        }
        m = k;
      }
    }
    k = m;
    if (this.j != null)
    {
      k = m;
      if (this.j.length > 0)
      {
        k = m;
        n = 0;
        while (n < this.j.length)
        {
          localObject = this.j[n];
          m = k;
          if (localObject != null) {
            m = k + dep.b(8, (dew)localObject);
          }
          n++;
          k = m;
        }
      }
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
    if (this.g != null) {
      k = m + dep.b(10, this.g);
    }
    return k;
  }
  
  public final void a(dep paramdep)
  {
    int m = 0;
    if (this.a != null) {
      paramdep.a(1, this.a);
    }
    if (this.b != null) {
      paramdep.a(2, this.b);
    }
    if (this.c != null) {
      paramdep.a(3, this.c);
    }
    if (this.d != null) {
      paramdep.a(4, this.d);
    }
    if (this.e != null) {
      paramdep.a(5, this.e);
    }
    if (this.f != null) {
      paramdep.a(6, this.f);
    }
    int k;
    Object localObject;
    if ((this.i != null) && (this.i.length > 0)) {
      for (k = 0; k < this.i.length; k++)
      {
        localObject = this.i[k];
        if (localObject != null) {
          paramdep.a(7, (dew)localObject);
        }
      }
    }
    if ((this.j != null) && (this.j.length > 0)) {
      for (k = 0; k < this.j.length; k++)
      {
        localObject = this.j[k];
        if (localObject != null) {
          paramdep.a(8, (dew)localObject);
        }
      }
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
    if (this.g != null) {
      paramdep.a(10, this.g);
    }
    super.a(paramdep);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dbb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */