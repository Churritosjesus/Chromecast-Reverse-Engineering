public final class dan
  extends dew
{
  private static volatile dan[] i;
  public Long a = null;
  public Long b = null;
  public int c = Integer.MIN_VALUE;
  public int[] d = dey.a;
  public String[] e = dey.b;
  public int[] f = dey.a;
  public dap[] g = dap.b();
  public String h = null;
  private int[] j = dey.a;
  private String k = null;
  
  public dan()
  {
    this.t = -1;
  }
  
  public static dan[] b()
  {
    if (i == null) {}
    synchronized (deu.a)
    {
      if (i == null) {
        i = new dan[0];
      }
      return i;
    }
  }
  
  protected final int a()
  {
    int i5 = 0;
    int n = super.a() + dep.b(1, this.a.longValue());
    int m = n;
    if (this.c != Integer.MIN_VALUE) {
      m = n + dep.b(2, this.c);
    }
    n = m;
    int i1;
    if (this.j != null)
    {
      n = m;
      if (this.j.length > 0)
      {
        n = 0;
        i1 = 0;
        while (n < this.j.length)
        {
          i1 += dep.a(this.j[n]);
          n++;
        }
        n = m + i1 + this.j.length * 1;
      }
    }
    m = n;
    if (this.d != null)
    {
      m = n;
      if (this.d.length > 0)
      {
        m = 0;
        i1 = 0;
        while (m < this.d.length)
        {
          i1 += dep.a(this.d[m]);
          m++;
        }
        m = n + i1 + this.d.length * 1;
      }
    }
    n = m;
    Object localObject;
    if (this.e != null)
    {
      n = m;
      if (this.e.length > 0)
      {
        int i3 = 0;
        i1 = 0;
        for (int i2 = 0; i3 < this.e.length; i2 = n)
        {
          localObject = this.e[i3];
          int i4 = i1;
          n = i2;
          if (localObject != null)
          {
            n = i2 + 1;
            i4 = i1 + dep.a((String)localObject);
          }
          i3++;
          i1 = i4;
        }
        n = m + i1 + i2 * 1;
      }
    }
    m = n;
    if (this.f != null)
    {
      m = n;
      if (this.f.length > 0)
      {
        i1 = 0;
        m = 0;
        while (i1 < this.f.length)
        {
          m += dep.a(this.f[i1]);
          i1++;
        }
        m = n + m + this.f.length * 1;
      }
    }
    n = m;
    if (this.g != null)
    {
      n = m;
      if (this.g.length > 0)
      {
        i1 = i5;
        for (;;)
        {
          n = m;
          if (i1 >= this.g.length) {
            break;
          }
          localObject = this.g[i1];
          n = m;
          if (localObject != null) {
            n = m + dep.b(7, (dew)localObject);
          }
          i1++;
          m = n;
        }
      }
    }
    m = n;
    if (this.h != null) {
      m = n + dep.b(9, this.h);
    }
    n = m;
    if (this.k != null) {
      n = m + dep.b(10, this.k);
    }
    m = n;
    if (this.b != null) {
      m = n + dep.b(11, this.b.longValue());
    }
    return m;
  }
  
  public final void a(dep paramdep)
  {
    int n = 0;
    paramdep.a(1, this.a.longValue());
    if (this.c != Integer.MIN_VALUE) {
      paramdep.a(2, this.c);
    }
    int m;
    if ((this.j != null) && (this.j.length > 0)) {
      for (m = 0; m < this.j.length; m++) {
        paramdep.a(3, this.j[m]);
      }
    }
    if ((this.d != null) && (this.d.length > 0)) {
      for (m = 0; m < this.d.length; m++) {
        paramdep.a(4, this.d[m]);
      }
    }
    Object localObject;
    if ((this.e != null) && (this.e.length > 0)) {
      for (m = 0; m < this.e.length; m++)
      {
        localObject = this.e[m];
        if (localObject != null) {
          paramdep.a(5, (String)localObject);
        }
      }
    }
    if ((this.f != null) && (this.f.length > 0)) {
      for (m = 0; m < this.f.length; m++) {
        paramdep.a(6, this.f[m]);
      }
    }
    if ((this.g != null) && (this.g.length > 0)) {
      for (m = n; m < this.g.length; m++)
      {
        localObject = this.g[m];
        if (localObject != null) {
          paramdep.a(7, (dew)localObject);
        }
      }
    }
    if (this.h != null) {
      paramdep.a(9, this.h);
    }
    if (this.k != null) {
      paramdep.a(10, this.k);
    }
    if (this.b != null) {
      paramdep.a(11, this.b.longValue());
    }
    super.a(paramdep);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dan.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */