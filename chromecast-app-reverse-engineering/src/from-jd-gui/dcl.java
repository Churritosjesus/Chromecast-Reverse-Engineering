public final class dcl
  extends dew
{
  public String a = null;
  public String b = null;
  public Boolean c = null;
  public dcm d = null;
  public String e = null;
  private Integer f = null;
  
  public dcl()
  {
    this.t = -1;
  }
  
  protected final int a()
  {
    int j = super.a();
    int i = j;
    if (this.f != null) {
      i = j + dep.b(1, this.f.intValue());
    }
    j = i;
    if (this.a != null) {
      j = i + dep.b(2, this.a);
    }
    i = j;
    if (this.b != null) {
      i = j + dep.b(3, this.b);
    }
    j = i;
    if (this.c != null)
    {
      this.c.booleanValue();
      j = i + (dep.b(4) + 1);
    }
    i = j;
    if (this.d != null) {
      i = j + dep.b(5, this.d);
    }
    j = i;
    if (this.e != null) {
      j = i + dep.b(6, this.e);
    }
    return j;
  }
  
  public final void a(dep paramdep)
  {
    if (this.f != null) {
      paramdep.a(1, this.f.intValue());
    }
    if (this.a != null) {
      paramdep.a(2, this.a);
    }
    if (this.b != null) {
      paramdep.a(3, this.b);
    }
    if (this.c != null) {
      paramdep.a(4, this.c.booleanValue());
    }
    if (this.d != null) {
      paramdep.a(5, this.d);
    }
    if (this.e != null) {
      paramdep.a(6, this.e);
    }
    super.a(paramdep);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dcl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */