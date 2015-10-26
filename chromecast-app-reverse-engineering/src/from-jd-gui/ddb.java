public final class ddb
  extends der
{
  private Long a = null;
  private Long b = null;
  
  public ddb()
  {
    this.i = null;
    this.t = -1;
  }
  
  protected final int a()
  {
    int j = super.a();
    int i = j;
    if (this.a != null) {
      i = j + dep.b(1, this.a.longValue());
    }
    j = i;
    if (this.b != null) {
      j = i + dep.b(2, this.b.longValue());
    }
    return j;
  }
  
  public final void a(dep paramdep)
  {
    if (this.a != null) {
      paramdep.a(1, this.a.longValue());
    }
    if (this.b != null) {
      paramdep.a(2, this.b.longValue());
    }
    super.a(paramdep);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\ddb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */