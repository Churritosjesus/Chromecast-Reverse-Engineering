public final class dbv
  extends dew
{
  private static volatile dbv[] e;
  public dcj a = null;
  public dck b = null;
  public Long c = null;
  public Integer d = null;
  private String f = null;
  private Boolean g = null;
  private Boolean h = null;
  private String i = null;
  private String j = null;
  
  public dbv()
  {
    this.t = -1;
  }
  
  public static dbv a(byte[] paramArrayOfByte)
  {
    return (dbv)dew.a(new dbv(), paramArrayOfByte);
  }
  
  public static dbv[] b()
  {
    if (e == null) {}
    synchronized (deu.a)
    {
      if (e == null) {
        e = new dbv[0];
      }
      return e;
    }
  }
  
  protected final int a()
  {
    int m = super.a();
    int k = m;
    if (this.g != null)
    {
      this.g.booleanValue();
      k = m + (dep.b(1) + 1);
    }
    m = k;
    if (this.a != null) {
      m = k + dep.b(2, this.a);
    }
    int n = m;
    if (this.b != null) {
      n = m + dep.b(3, this.b);
    }
    k = n;
    if (this.c != null) {
      k = n + dep.b(4, this.c.longValue());
    }
    m = k;
    if (this.h != null)
    {
      this.h.booleanValue();
      m = k + (dep.b(5) + 1);
    }
    n = m;
    if (this.d != null) {
      n = m + dep.b(6, this.d.intValue());
    }
    k = n;
    if (this.i != null) {
      k = n + dep.b(7, this.i);
    }
    m = k;
    if (this.j != null) {
      m = k + dep.b(8, this.j);
    }
    k = m;
    if (this.f != null) {
      k = m + dep.b(9, this.f);
    }
    return k;
  }
  
  public final void a(dep paramdep)
  {
    if (this.g != null) {
      paramdep.a(1, this.g.booleanValue());
    }
    if (this.a != null) {
      paramdep.a(2, this.a);
    }
    if (this.b != null) {
      paramdep.a(3, this.b);
    }
    if (this.c != null) {
      paramdep.a(4, this.c.longValue());
    }
    if (this.h != null) {
      paramdep.a(5, this.h.booleanValue());
    }
    if (this.d != null) {
      paramdep.a(6, this.d.intValue());
    }
    if (this.i != null) {
      paramdep.a(7, this.i);
    }
    if (this.j != null) {
      paramdep.a(8, this.j);
    }
    if (this.f != null) {
      paramdep.a(9, this.f);
    }
    super.a(paramdep);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dbv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */