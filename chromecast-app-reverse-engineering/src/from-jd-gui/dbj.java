public final class dbj
  extends dew
{
  public String a = null;
  public Integer b = null;
  public Integer c = null;
  
  public dbj()
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
    if (this.b != null) {
      i = j + dep.b(2, this.b.intValue());
    }
    j = i;
    if (this.c != null) {
      j = i + dep.b(3, this.c.intValue());
    }
    return j;
  }
  
  public final void a(dep paramdep)
  {
    if (this.a != null) {
      paramdep.a(1, this.a);
    }
    if (this.b != null) {
      paramdep.a(2, this.b.intValue());
    }
    if (this.c != null) {
      paramdep.a(3, this.c.intValue());
    }
    super.a(paramdep);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dbj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */