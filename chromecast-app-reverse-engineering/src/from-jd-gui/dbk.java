public final class dbk
  extends dew
{
  private static volatile dbk[] e;
  public String a = null;
  public dbj b = null;
  public String c = null;
  public Integer d = null;
  private String f = null;
  private String g = null;
  
  public dbk()
  {
    this.t = -1;
  }
  
  public static dbk[] b()
  {
    if (e == null) {}
    synchronized (deu.a)
    {
      if (e == null) {
        e = new dbk[0];
      }
      return e;
    }
  }
  
  protected final int a()
  {
    int i = super.a();
    int j = i;
    if (this.a != null) {
      j = i + dep.b(1, this.a);
    }
    i = j;
    if (this.b != null) {
      i = j + dep.b(2, this.b);
    }
    j = i;
    if (this.c != null) {
      j = i + dep.b(3, this.c);
    }
    int k = j;
    if (this.f != null) {
      k = j + dep.b(4, this.f);
    }
    i = k;
    if (this.g != null) {
      i = k + dep.b(5, this.g);
    }
    j = i;
    if (this.d != null) {
      j = i + dep.b(6, this.d.intValue());
    }
    return j;
  }
  
  public final void a(dep paramdep)
  {
    if (this.a != null) {
      paramdep.a(1, this.a);
    }
    if (this.b != null) {
      paramdep.a(2, this.b);
    }
    if (this.c != null) {
      paramdep.a(3, this.c);
    }
    if (this.f != null) {
      paramdep.a(4, this.f);
    }
    if (this.g != null) {
      paramdep.a(5, this.g);
    }
    if (this.d != null) {
      paramdep.a(6, this.d.intValue());
    }
    super.a(paramdep);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dbk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */