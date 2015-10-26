public final class dbq
  extends dew
{
  private static volatile dbq[] f;
  public Long a = null;
  public String b = null;
  public String c = null;
  public Integer d = null;
  public String e = null;
  private String g = null;
  private String h = null;
  private String i = null;
  
  public dbq()
  {
    this.t = -1;
  }
  
  public static dbq[] b()
  {
    if (f == null) {}
    synchronized (deu.a)
    {
      if (f == null) {
        f = new dbq[0];
      }
      return f;
    }
  }
  
  protected final int a()
  {
    int k = super.a();
    int j = k;
    if (this.a != null) {
      j = k + dep.b(1, this.a.longValue());
    }
    k = j;
    if (this.b != null) {
      k = j + dep.b(2, this.b);
    }
    j = k;
    if (this.c != null) {
      j = k + dep.b(3, this.c);
    }
    k = j;
    if (this.d != null) {
      k = j + dep.b(4, this.d.intValue());
    }
    j = k;
    if (this.g != null) {
      j = k + dep.b(5, this.g);
    }
    k = j;
    if (this.h != null) {
      k = j + dep.b(6, this.h);
    }
    j = k;
    if (this.i != null) {
      j = k + dep.b(7, this.i);
    }
    k = j;
    if (this.e != null) {
      k = j + dep.b(8, this.e);
    }
    return k;
  }
  
  public final void a(dep paramdep)
  {
    if (this.a != null) {
      paramdep.a(1, this.a.longValue());
    }
    if (this.b != null) {
      paramdep.a(2, this.b);
    }
    if (this.c != null) {
      paramdep.a(3, this.c);
    }
    if (this.d != null) {
      paramdep.a(4, this.d.intValue());
    }
    if (this.g != null) {
      paramdep.a(5, this.g);
    }
    if (this.h != null) {
      paramdep.a(6, this.h);
    }
    if (this.i != null) {
      paramdep.a(7, this.i);
    }
    if (this.e != null) {
      paramdep.a(8, this.e);
    }
    super.a(paramdep);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dbq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */