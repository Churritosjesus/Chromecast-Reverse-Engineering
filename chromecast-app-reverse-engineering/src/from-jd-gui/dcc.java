public final class dcc
  extends dew
{
  public String a = null;
  public dca b = null;
  public String c = null;
  public Integer d = null;
  public Integer e = null;
  public Integer f = null;
  
  public dcc()
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
      i = j + dep.b(3, this.c);
    }
    j = i;
    if (this.d != null) {
      j = i + dep.b(4, this.d.intValue());
    }
    i = j;
    if (this.e != null) {
      i = j + dep.b(5, this.e.intValue());
    }
    j = i;
    if (this.f != null) {
      j = i + dep.b(6, this.f.intValue());
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
      paramdep.a(4, this.d.intValue());
    }
    if (this.e != null) {
      paramdep.a(5, this.e.intValue());
    }
    if (this.f != null) {
      paramdep.a(6, this.f.intValue());
    }
    super.a(paramdep);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dcc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */