public final class dcj
  extends dew
{
  private static volatile dcj[] u;
  public Integer a = null;
  public Integer b = null;
  public String c = null;
  public String d = null;
  public String[] e = dey.b;
  public String[] f = dey.b;
  public String g = null;
  public String h = null;
  public dcj[] i = b();
  public String j = null;
  public String[] k = dey.b;
  public String l = null;
  public String[] m = dey.b;
  public String[] n = dey.b;
  public String o = null;
  public dcf[] p = dcf.b();
  public Boolean q = null;
  public String r = null;
  public Boolean s = null;
  private int[] v = dey.a;
  private Integer w = null;
  private String[] x = dey.b;
  private Boolean y = null;
  
  public dcj()
  {
    this.t = -1;
  }
  
  public static dcj a(byte[] paramArrayOfByte)
  {
    return (dcj)dew.a(new dcj(), paramArrayOfByte);
  }
  
  private static dcj[] b()
  {
    if (u == null) {}
    synchronized (deu.a)
    {
      if (u == null) {
        u = new dcj[0];
      }
      return u;
    }
  }
  
  protected final int a()
  {
    int i7 = 0;
    int i2 = super.a();
    int i1 = i2;
    if (this.a != null) {
      i1 = i2 + dep.b(1, this.a.intValue());
    }
    i2 = i1;
    if (this.b != null) {
      i2 = i1 + dep.b(2, this.b.intValue());
    }
    i1 = i2;
    if (this.c != null) {
      i1 = i2 + dep.b(3, this.c);
    }
    i2 = i1;
    if (this.d != null) {
      i2 = i1 + dep.b(4, this.d);
    }
    i1 = i2;
    if (this.h != null) {
      i1 = i2 + dep.b(5, this.h);
    }
    i2 = i1;
    Object localObject;
    if (this.i != null)
    {
      i2 = i1;
      if (this.i.length > 0)
      {
        i3 = 0;
        while (i3 < this.i.length)
        {
          localObject = this.i[i3];
          i2 = i1;
          if (localObject != null) {
            i2 = i1 + dep.b(6, (dew)localObject);
          }
          i3++;
          i1 = i2;
        }
        i2 = i1;
      }
    }
    i1 = i2;
    if (this.v != null)
    {
      i1 = i2;
      if (this.v.length > 0)
      {
        i3 = 0;
        i1 = 0;
        while (i3 < this.v.length)
        {
          i1 += dep.a(this.v[i3]);
          i3++;
        }
        i1 = i2 + i1 + this.v.length * 1;
      }
    }
    i2 = i1;
    if (this.w != null) {
      i2 = i1 + dep.b(8, this.w.intValue());
    }
    i1 = i2;
    if (this.j != null) {
      i1 = i2 + dep.b(9, this.j);
    }
    i2 = i1;
    int i4;
    int i5;
    int i6;
    if (this.k != null)
    {
      i2 = i1;
      if (this.k.length > 0)
      {
        i4 = 0;
        i3 = 0;
        for (i5 = 0; i4 < this.k.length; i5 = i2)
        {
          localObject = this.k[i4];
          i6 = i3;
          i2 = i5;
          if (localObject != null)
          {
            i2 = i5 + 1;
            i6 = i3 + dep.a((String)localObject);
          }
          i4++;
          i3 = i6;
        }
        i2 = i1 + i3 + i5 * 1;
      }
    }
    i1 = i2;
    if (this.l != null) {
      i1 = i2 + dep.b(11, this.l);
    }
    int i3 = i1;
    if (this.n != null)
    {
      i3 = i1;
      if (this.n.length > 0)
      {
        i5 = 0;
        i2 = 0;
        for (i3 = 0; i5 < this.n.length; i3 = i4)
        {
          localObject = this.n[i5];
          i6 = i2;
          i4 = i3;
          if (localObject != null)
          {
            i4 = i3 + 1;
            i6 = i2 + dep.a((String)localObject);
          }
          i5++;
          i2 = i6;
        }
        i3 = i1 + i2 + i3 * 1;
      }
    }
    i2 = i3;
    if (this.o != null) {
      i2 = i3 + dep.b(13, this.o);
    }
    i1 = i2;
    if (this.y != null)
    {
      this.y.booleanValue();
      i1 = i2 + (dep.b(14) + 1);
    }
    i2 = i1;
    if (this.p != null)
    {
      i2 = i1;
      if (this.p.length > 0)
      {
        i2 = 0;
        while (i2 < this.p.length)
        {
          localObject = this.p[i2];
          i3 = i1;
          if (localObject != null) {
            i3 = i1 + dep.b(15, (dew)localObject);
          }
          i2++;
          i1 = i3;
        }
        i2 = i1;
      }
    }
    i3 = i2;
    if (this.x != null)
    {
      i3 = i2;
      if (this.x.length > 0)
      {
        i4 = 0;
        i3 = 0;
        for (i1 = 0; i4 < this.x.length; i1 = i5)
        {
          localObject = this.x[i4];
          i6 = i3;
          i5 = i1;
          if (localObject != null)
          {
            i5 = i1 + 1;
            i6 = i3 + dep.a((String)localObject);
          }
          i4++;
          i3 = i6;
        }
        i3 = i2 + i3 + i1 * 2;
      }
    }
    i1 = i3;
    if (this.q != null)
    {
      this.q.booleanValue();
      i1 = i3 + (dep.b(17) + 1);
    }
    i2 = i1;
    if (this.e != null)
    {
      i2 = i1;
      if (this.e.length > 0)
      {
        i3 = 0;
        i2 = 0;
        for (i5 = 0; i3 < this.e.length; i5 = i4)
        {
          localObject = this.e[i3];
          i6 = i2;
          i4 = i5;
          if (localObject != null)
          {
            i4 = i5 + 1;
            i6 = i2 + dep.a((String)localObject);
          }
          i3++;
          i2 = i6;
        }
        i2 = i1 + i2 + i5 * 2;
      }
    }
    i1 = i2;
    if (this.g != null) {
      i1 = i2 + dep.b(19, this.g);
    }
    i2 = i1;
    if (this.f != null)
    {
      i2 = i1;
      if (this.f.length > 0)
      {
        i4 = 0;
        i2 = 0;
        for (i5 = 0; i4 < this.f.length; i5 = i3)
        {
          localObject = this.f[i4];
          i6 = i2;
          i3 = i5;
          if (localObject != null)
          {
            i3 = i5 + 1;
            i6 = i2 + dep.a((String)localObject);
          }
          i4++;
          i2 = i6;
        }
        i2 = i1 + i2 + i5 * 2;
      }
    }
    i1 = i2;
    if (this.r != null) {
      i1 = i2 + dep.b(21, this.r);
    }
    i2 = i1;
    if (this.m != null)
    {
      i2 = i1;
      if (this.m.length > 0)
      {
        i2 = 0;
        i5 = 0;
        i3 = i7;
        while (i3 < this.m.length)
        {
          localObject = this.m[i3];
          i6 = i2;
          i4 = i5;
          if (localObject != null)
          {
            i4 = i5 + 1;
            i6 = i2 + dep.a((String)localObject);
          }
          i3++;
          i2 = i6;
          i5 = i4;
        }
        i2 = i1 + i2 + i5 * 2;
      }
    }
    i1 = i2;
    if (this.s != null)
    {
      this.s.booleanValue();
      i1 = i2 + (dep.b(23) + 1);
    }
    return i1;
  }
  
  public final void a(dep paramdep)
  {
    int i2 = 0;
    if (this.a != null) {
      paramdep.a(1, this.a.intValue());
    }
    if (this.b != null) {
      paramdep.a(2, this.b.intValue());
    }
    if (this.c != null) {
      paramdep.a(3, this.c);
    }
    if (this.d != null) {
      paramdep.a(4, this.d);
    }
    if (this.h != null) {
      paramdep.a(5, this.h);
    }
    int i1;
    Object localObject;
    if ((this.i != null) && (this.i.length > 0)) {
      for (i1 = 0; i1 < this.i.length; i1++)
      {
        localObject = this.i[i1];
        if (localObject != null) {
          paramdep.a(6, (dew)localObject);
        }
      }
    }
    if ((this.v != null) && (this.v.length > 0)) {
      for (i1 = 0; i1 < this.v.length; i1++) {
        paramdep.a(7, this.v[i1]);
      }
    }
    if (this.w != null) {
      paramdep.a(8, this.w.intValue());
    }
    if (this.j != null) {
      paramdep.a(9, this.j);
    }
    if ((this.k != null) && (this.k.length > 0)) {
      for (i1 = 0; i1 < this.k.length; i1++)
      {
        localObject = this.k[i1];
        if (localObject != null) {
          paramdep.a(10, (String)localObject);
        }
      }
    }
    if (this.l != null) {
      paramdep.a(11, this.l);
    }
    if ((this.n != null) && (this.n.length > 0)) {
      for (i1 = 0; i1 < this.n.length; i1++)
      {
        localObject = this.n[i1];
        if (localObject != null) {
          paramdep.a(12, (String)localObject);
        }
      }
    }
    if (this.o != null) {
      paramdep.a(13, this.o);
    }
    if (this.y != null) {
      paramdep.a(14, this.y.booleanValue());
    }
    if ((this.p != null) && (this.p.length > 0)) {
      for (i1 = 0; i1 < this.p.length; i1++)
      {
        localObject = this.p[i1];
        if (localObject != null) {
          paramdep.a(15, (dew)localObject);
        }
      }
    }
    if ((this.x != null) && (this.x.length > 0)) {
      for (i1 = 0; i1 < this.x.length; i1++)
      {
        localObject = this.x[i1];
        if (localObject != null) {
          paramdep.a(16, (String)localObject);
        }
      }
    }
    if (this.q != null) {
      paramdep.a(17, this.q.booleanValue());
    }
    if ((this.e != null) && (this.e.length > 0)) {
      for (i1 = 0; i1 < this.e.length; i1++)
      {
        localObject = this.e[i1];
        if (localObject != null) {
          paramdep.a(18, (String)localObject);
        }
      }
    }
    if (this.g != null) {
      paramdep.a(19, this.g);
    }
    if ((this.f != null) && (this.f.length > 0)) {
      for (i1 = 0; i1 < this.f.length; i1++)
      {
        localObject = this.f[i1];
        if (localObject != null) {
          paramdep.a(20, (String)localObject);
        }
      }
    }
    if (this.r != null) {
      paramdep.a(21, this.r);
    }
    if ((this.m != null) && (this.m.length > 0)) {
      for (i1 = i2; i1 < this.m.length; i1++)
      {
        localObject = this.m[i1];
        if (localObject != null) {
          paramdep.a(22, (String)localObject);
        }
      }
    }
    if (this.s != null) {
      paramdep.a(23, this.s.booleanValue());
    }
    super.a(paramdep);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dcj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */