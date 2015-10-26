public final class dal
  extends dew
{
  private static volatile dal[] m;
  public Long a = null;
  public int b = Integer.MIN_VALUE;
  public int[] c = dey.a;
  public Long d = null;
  public int e = Integer.MIN_VALUE;
  public String f = null;
  public String g = null;
  public dak h = null;
  public dak i = null;
  public int j = Integer.MIN_VALUE;
  public String k = null;
  public Long l = null;
  private int[] n = dey.a;
  private String[] o = dey.b;
  private int p = Integer.MIN_VALUE;
  private int q = Integer.MIN_VALUE;
  private String r = null;
  private int[] s = dey.a;
  private String u = null;
  
  public dal()
  {
    this.t = -1;
  }
  
  public static dal[] b()
  {
    if (m == null) {}
    synchronized (deu.a)
    {
      if (m == null) {
        m = new dal[0];
      }
      return m;
    }
  }
  
  protected final int a()
  {
    int i7 = 0;
    int i2 = super.a() + dep.b(1, this.a.longValue());
    int i1 = i2;
    if (this.b != Integer.MIN_VALUE) {
      i1 = i2 + dep.b(2, this.b);
    }
    i2 = i1;
    if (this.n != null)
    {
      i2 = i1;
      if (this.n.length > 0)
      {
        i2 = 0;
        i3 = 0;
        while (i2 < this.n.length)
        {
          i3 += dep.a(this.n[i2]);
          i2++;
        }
        i2 = i1 + i3 + this.n.length * 1;
      }
    }
    i1 = i2;
    if (this.c != null)
    {
      i1 = i2;
      if (this.c.length > 0)
      {
        i1 = 0;
        i3 = 0;
        while (i1 < this.c.length)
        {
          i3 += dep.a(this.c[i1]);
          i1++;
        }
        i1 = i2 + i3 + this.c.length * 1;
      }
    }
    i2 = i1;
    if (this.o != null)
    {
      i2 = i1;
      if (this.o.length > 0)
      {
        int i5 = 0;
        int i4 = 0;
        for (i2 = 0; i5 < this.o.length; i2 = i3)
        {
          String str = this.o[i5];
          int i6 = i4;
          i3 = i2;
          if (str != null)
          {
            i3 = i2 + 1;
            i6 = i4 + dep.a(str);
          }
          i5++;
          i4 = i6;
        }
        i2 = i1 + i4 + i2 * 1;
      }
    }
    int i3 = i2;
    if (this.p != Integer.MIN_VALUE) {
      i3 = i2 + dep.b(6, this.p);
    }
    i1 = i3;
    if (this.q != Integer.MIN_VALUE) {
      i1 = i3 + dep.b(7, this.q);
    }
    i2 = i1;
    if (this.d != null) {
      i2 = i1 + dep.b(8, this.d.longValue());
    }
    i3 = i2;
    if (this.e != Integer.MIN_VALUE) {
      i3 = i2 + dep.b(9, this.e);
    }
    i1 = i3;
    if (this.f != null) {
      i1 = i3 + dep.b(10, this.f);
    }
    i2 = i1;
    if (this.g != null) {
      i2 = i1 + dep.b(11, this.g);
    }
    i1 = i2;
    if (this.r != null) {
      i1 = i2 + dep.b(12, this.r);
    }
    i2 = i1;
    if (this.s != null)
    {
      i2 = i1;
      if (this.s.length > 0)
      {
        i3 = 0;
        for (i2 = i7; i2 < this.s.length; i2++) {
          i3 += dep.a(this.s[i2]);
        }
        i2 = i1 + i3 + this.s.length * 1;
      }
    }
    i3 = i2;
    if (this.h != null) {
      i3 = i2 + dep.b(14, this.h);
    }
    i1 = i3;
    if (this.i != null) {
      i1 = i3 + dep.b(15, this.i);
    }
    i2 = i1;
    if (this.j != Integer.MIN_VALUE) {
      i2 = i1 + dep.b(16, this.j);
    }
    i1 = i2;
    if (this.k != null) {
      i1 = i2 + dep.b(17, this.k);
    }
    i2 = i1;
    if (this.u != null) {
      i2 = i1 + dep.b(18, this.u);
    }
    i1 = i2;
    if (this.l != null) {
      i1 = i2 + dep.b(19, this.l.longValue());
    }
    return i1;
  }
  
  public final void a(dep paramdep)
  {
    int i2 = 0;
    paramdep.a(1, this.a.longValue());
    if (this.b != Integer.MIN_VALUE) {
      paramdep.a(2, this.b);
    }
    int i1;
    if ((this.n != null) && (this.n.length > 0)) {
      for (i1 = 0; i1 < this.n.length; i1++) {
        paramdep.a(3, this.n[i1]);
      }
    }
    if ((this.c != null) && (this.c.length > 0)) {
      for (i1 = 0; i1 < this.c.length; i1++) {
        paramdep.a(4, this.c[i1]);
      }
    }
    if ((this.o != null) && (this.o.length > 0)) {
      for (i1 = 0; i1 < this.o.length; i1++)
      {
        String str = this.o[i1];
        if (str != null) {
          paramdep.a(5, str);
        }
      }
    }
    if (this.p != Integer.MIN_VALUE) {
      paramdep.a(6, this.p);
    }
    if (this.q != Integer.MIN_VALUE) {
      paramdep.a(7, this.q);
    }
    if (this.d != null) {
      paramdep.a(8, this.d.longValue());
    }
    if (this.e != Integer.MIN_VALUE) {
      paramdep.a(9, this.e);
    }
    if (this.f != null) {
      paramdep.a(10, this.f);
    }
    if (this.g != null) {
      paramdep.a(11, this.g);
    }
    if (this.r != null) {
      paramdep.a(12, this.r);
    }
    if ((this.s != null) && (this.s.length > 0)) {
      for (i1 = i2; i1 < this.s.length; i1++) {
        paramdep.a(13, this.s[i1]);
      }
    }
    if (this.h != null) {
      paramdep.a(14, this.h);
    }
    if (this.i != null) {
      paramdep.a(15, this.i);
    }
    if (this.j != Integer.MIN_VALUE) {
      paramdep.a(16, this.j);
    }
    if (this.k != null) {
      paramdep.a(17, this.k);
    }
    if (this.u != null) {
      paramdep.a(18, this.u);
    }
    if (this.l != null) {
      paramdep.a(19, this.l.longValue());
    }
    super.a(paramdep);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dal.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */