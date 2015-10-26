public final class dbg
  extends dew
{
  private static volatile dbg[] k;
  public dbj a = null;
  public String b = null;
  public String c = null;
  public String d = null;
  public String e = null;
  public String f = null;
  public dbb g = null;
  public String h = null;
  public int i = Integer.MIN_VALUE;
  public String j = null;
  private int l = Integer.MIN_VALUE;
  
  public dbg()
  {
    this.t = -1;
  }
  
  public static dbg[] b()
  {
    if (k == null) {}
    synchronized (deu.a)
    {
      if (k == null) {
        k = new dbg[0];
      }
      return k;
    }
  }
  
  protected final int a()
  {
    int n = super.a();
    int m = n;
    if (this.a != null) {
      m = n + dep.b(1, this.a);
    }
    n = m;
    if (this.b != null) {
      n = m + dep.b(2, this.b);
    }
    int i1 = n;
    if (this.l != Integer.MIN_VALUE) {
      i1 = n + dep.b(4, this.l);
    }
    m = i1;
    if (this.g != null) {
      m = i1 + dep.b(5, this.g);
    }
    n = m;
    if (this.f != null) {
      n = m + dep.b(6, this.f);
    }
    m = n;
    if (this.h != null) {
      m = n + dep.b(7, this.h);
    }
    n = m;
    if (this.e != null) {
      n = m + dep.b(8, this.e);
    }
    m = n;
    if (this.i != Integer.MIN_VALUE) {
      m = n + dep.b(9, this.i);
    }
    n = m;
    if (this.j != null) {
      n = m + dep.b(10, this.j);
    }
    m = n;
    if (this.c != null) {
      m = n + dep.b(11, this.c);
    }
    n = m;
    if (this.d != null) {
      n = m + dep.b(12, this.d);
    }
    return n;
  }
  
  public final void a(dep paramdep)
  {
    if (this.a != null) {
      paramdep.a(1, this.a);
    }
    if (this.b != null) {
      paramdep.a(2, this.b);
    }
    if (this.l != Integer.MIN_VALUE) {
      paramdep.a(4, this.l);
    }
    if (this.g != null) {
      paramdep.a(5, this.g);
    }
    if (this.f != null) {
      paramdep.a(6, this.f);
    }
    if (this.h != null) {
      paramdep.a(7, this.h);
    }
    if (this.e != null) {
      paramdep.a(8, this.e);
    }
    if (this.i != Integer.MIN_VALUE) {
      paramdep.a(9, this.i);
    }
    if (this.j != null) {
      paramdep.a(10, this.j);
    }
    if (this.c != null) {
      paramdep.a(11, this.c);
    }
    if (this.d != null) {
      paramdep.a(12, this.d);
    }
    super.a(paramdep);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dbg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */