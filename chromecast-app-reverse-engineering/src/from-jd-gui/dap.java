public final class dap
  extends dew
{
  private static volatile dap[] d;
  public String a = null;
  public String b = null;
  public String c = null;
  private String e = null;
  private String f = null;
  private String g = null;
  private String h = null;
  private int i = Integer.MIN_VALUE;
  
  public dap()
  {
    this.t = -1;
  }
  
  public static dap[] b()
  {
    if (d == null) {}
    synchronized (deu.a)
    {
      if (d == null) {
        d = new dap[0];
      }
      return d;
    }
  }
  
  protected final int a()
  {
    int k = super.a();
    int j = k;
    if (this.a != null) {
      j = k + dep.b(1, this.a);
    }
    k = j;
    if (this.e != null) {
      k = j + dep.b(2, this.e);
    }
    j = k;
    if (this.b != null) {
      j = k + dep.b(3, this.b);
    }
    k = j;
    if (this.f != null) {
      k = j + dep.b(4, this.f);
    }
    j = k;
    if (this.c != null) {
      j = k + dep.b(5, this.c);
    }
    k = j;
    if (this.g != null) {
      k = j + dep.b(6, this.g);
    }
    j = k;
    if (this.h != null) {
      j = k + dep.b(7, this.h);
    }
    k = j;
    if (this.i != Integer.MIN_VALUE) {
      k = j + dep.b(8, this.i);
    }
    return k;
  }
  
  public final void a(dep paramdep)
  {
    if (this.a != null) {
      paramdep.a(1, this.a);
    }
    if (this.e != null) {
      paramdep.a(2, this.e);
    }
    if (this.b != null) {
      paramdep.a(3, this.b);
    }
    if (this.f != null) {
      paramdep.a(4, this.f);
    }
    if (this.c != null) {
      paramdep.a(5, this.c);
    }
    if (this.g != null) {
      paramdep.a(6, this.g);
    }
    if (this.h != null) {
      paramdep.a(7, this.h);
    }
    if (this.i != Integer.MIN_VALUE) {
      paramdep.a(8, this.i);
    }
    super.a(paramdep);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dap.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */