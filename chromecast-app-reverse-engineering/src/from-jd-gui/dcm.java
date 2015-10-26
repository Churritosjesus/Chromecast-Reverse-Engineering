public final class dcm
  extends dew
{
  public String a = null;
  public String b = null;
  public Long c = null;
  private String d = null;
  private String e = null;
  
  public dcm()
  {
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
    if (this.d != null) {
      i = j + dep.b(2, this.d);
    }
    j = i;
    if (this.b != null) {
      j = i + dep.b(3, this.b);
    }
    i = j;
    if (this.c != null) {
      i = j + dep.b(4, this.c.longValue());
    }
    j = i;
    if (this.e != null) {
      j = i + dep.b(5, this.e);
    }
    return j;
  }
  
  public final void a(dep paramdep)
  {
    if (this.a != null) {
      paramdep.a(1, this.a);
    }
    if (this.d != null) {
      paramdep.a(2, this.d);
    }
    if (this.b != null) {
      paramdep.a(3, this.b);
    }
    if (this.c != null) {
      paramdep.a(4, this.c.longValue());
    }
    if (this.e != null) {
      paramdep.a(5, this.e);
    }
    super.a(paramdep);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dcm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */