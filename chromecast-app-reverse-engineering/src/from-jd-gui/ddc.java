public final class ddc
  extends der
{
  public String a = null;
  public String b = null;
  public Integer c = null;
  public Integer d = null;
  public String e = null;
  public Integer f = null;
  
  public ddc()
  {
    this.i = null;
    this.t = -1;
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
      j = i + dep.b(3, this.c.intValue());
    }
    i = j;
    if (this.d != null) {
      i = j + dep.b(4, this.d.intValue());
    }
    j = i;
    if (this.e != null) {
      j = i + dep.b(7, this.e);
    }
    i = j;
    if (this.f != null) {
      i = j + dep.b(8, this.f.intValue());
    }
    return i;
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
      paramdep.a(4, this.d.intValue());
    }
    if (this.e != null) {
      paramdep.a(7, this.e);
    }
    if (this.f != null) {
      paramdep.a(8, this.f.intValue());
    }
    super.a(paramdep);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\ddc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */