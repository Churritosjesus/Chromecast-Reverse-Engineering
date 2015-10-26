public final class dba
  extends dew
{
  private static volatile dba[] c;
  public String a = null;
  public String b = null;
  private String d = null;
  private Boolean e = null;
  private String f = null;
  
  public dba()
  {
    this.t = -1;
  }
  
  public static dba[] b()
  {
    if (c == null) {}
    synchronized (deu.a)
    {
      if (c == null) {
        c = new dba[0];
      }
      return c;
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
    if (this.e != null)
    {
      this.e.booleanValue();
      i = j + (dep.b(2) + 1);
    }
    j = i;
    if (this.f != null) {
      j = i + dep.b(3, this.f);
    }
    i = j;
    if (this.b != null) {
      i = j + dep.b(4, this.b);
    }
    j = i;
    if (this.d != null) {
      j = i + dep.b(5, this.d);
    }
    return j;
  }
  
  public final void a(dep paramdep)
  {
    if (this.a != null) {
      paramdep.a(1, this.a);
    }
    if (this.e != null) {
      paramdep.a(2, this.e.booleanValue());
    }
    if (this.f != null) {
      paramdep.a(3, this.f);
    }
    if (this.b != null) {
      paramdep.a(4, this.b);
    }
    if (this.d != null) {
      paramdep.a(5, this.d);
    }
    super.a(paramdep);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dba.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */