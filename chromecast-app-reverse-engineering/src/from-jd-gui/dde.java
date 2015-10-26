public final class dde
  extends der
{
  public Integer a = null;
  public dda b = null;
  
  public dde()
  {
    this.i = null;
    this.t = -1;
  }
  
  protected final int a()
  {
    int j = super.a();
    int i = j;
    if (this.a != null) {
      i = j + dep.b(1, this.a.intValue());
    }
    j = i;
    if (this.b != null) {
      j = i + dep.b(2, this.b);
    }
    return j;
  }
  
  public final void a(dep paramdep)
  {
    if (this.a != null) {
      paramdep.a(1, this.a.intValue());
    }
    if (this.b != null) {
      paramdep.a(2, this.b);
    }
    super.a(paramdep);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dde.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */