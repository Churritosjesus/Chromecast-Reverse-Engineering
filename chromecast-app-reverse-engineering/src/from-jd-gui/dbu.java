public final class dbu
  extends dew
{
  public String a = null;
  public dck b = null;
  private Integer c = null;
  private Long d = null;
  private String e = null;
  private String f = null;
  private Boolean g = null;
  private Integer h = null;
  
  public dbu()
  {
    this.t = -1;
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
      i = j + dep.b(3, this.c.intValue());
    }
    j = i;
    if (this.d != null) {
      j = i + dep.b(4, this.d.longValue());
    }
    i = j;
    if (this.e != null) {
      i = j + dep.b(5, this.e);
    }
    j = i;
    if (this.f != null) {
      j = i + dep.b(6, this.f);
    }
    i = j;
    if (this.h != null) {
      i = j + dep.b(7, this.h.intValue());
    }
    j = i;
    if (this.g != null)
    {
      this.g.booleanValue();
      j = i + (dep.b(8) + 1);
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
      paramdep.a(3, this.c.intValue());
    }
    if (this.d != null) {
      paramdep.a(4, this.d.longValue());
    }
    if (this.e != null) {
      paramdep.a(5, this.e);
    }
    if (this.f != null) {
      paramdep.a(6, this.f);
    }
    if (this.h != null) {
      paramdep.a(7, this.h.intValue());
    }
    if (this.g != null) {
      paramdep.a(8, this.g.booleanValue());
    }
    super.a(paramdep);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dbu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */