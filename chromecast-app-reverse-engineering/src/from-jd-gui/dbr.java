public final class dbr
  extends dew
{
  private static volatile dbr[] e;
  public String a = null;
  public String b = null;
  public String c = null;
  public Long d = null;
  
  public dbr()
  {
    this.t = -1;
  }
  
  public static dbr[] b()
  {
    if (e == null) {}
    synchronized (deu.a)
    {
      if (e == null) {
        e = new dbr[0];
      }
      return e;
    }
  }
  
  protected final int a()
  {
    int j = super.a();
    int i = j;
    if (this.a != null) {
      i = j + dep.b(1, this.a);
    }
    j = i;
    if (this.b != null) {
      j = i + dep.b(2, this.b);
    }
    i = j;
    if (this.c != null) {
      i = j + dep.b(3, this.c);
    }
    j = i;
    if (this.d != null) {
      j = i + dep.b(4, this.d.longValue());
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
    if (this.d != null) {
      paramdep.a(4, this.d.longValue());
    }
    super.a(paramdep);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dbr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */