public final class dak
  extends dew
{
  public String a = null;
  public String b = null;
  public int c = Integer.MIN_VALUE;
  private String d = null;
  private String e = null;
  private Integer f = null;
  private String g = null;
  
  public dak()
  {
    this.t = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    int j = i;
    if (this.d != null) {
      j = i + dep.b(1, this.d);
    }
    i = j;
    if (this.a != null) {
      i = j + dep.b(2, this.a);
    }
    j = i;
    if (this.e != null) {
      j = i + dep.b(3, this.e);
    }
    i = j;
    if (this.b != null) {
      i = j + dep.b(4, this.b);
    }
    j = i;
    if (this.f != null) {
      j = i + dep.b(5, this.f.intValue());
    }
    i = j;
    if (this.g != null) {
      i = j + dep.b(6, this.g);
    }
    j = i;
    if (this.c != Integer.MIN_VALUE) {
      j = i + dep.b(7, this.c);
    }
    return j;
  }
  
  public final void a(dep paramdep)
  {
    if (this.d != null) {
      paramdep.a(1, this.d);
    }
    if (this.a != null) {
      paramdep.a(2, this.a);
    }
    if (this.e != null) {
      paramdep.a(3, this.e);
    }
    if (this.b != null) {
      paramdep.a(4, this.b);
    }
    if (this.f != null) {
      paramdep.a(5, this.f.intValue());
    }
    if (this.g != null) {
      paramdep.a(6, this.g);
    }
    if (this.c != Integer.MIN_VALUE) {
      paramdep.a(7, this.c);
    }
    super.a(paramdep);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dak.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */