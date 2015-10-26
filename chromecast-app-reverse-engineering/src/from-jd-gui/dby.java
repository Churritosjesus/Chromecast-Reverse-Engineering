public final class dby
  extends dew
{
  private static volatile dby[] a;
  private String b = null;
  private Double c = null;
  private Double d = null;
  
  public dby()
  {
    this.t = -1;
  }
  
  public static dby[] b()
  {
    if (a == null) {}
    synchronized (deu.a)
    {
      if (a == null) {
        a = new dby[0];
      }
      return a;
    }
  }
  
  protected final int a()
  {
    int j = super.a();
    int i = j;
    if (this.b != null) {
      i = j + dep.b(1, this.b);
    }
    j = i;
    if (this.c != null)
    {
      this.c.doubleValue();
      j = i + (dep.b(2) + 8);
    }
    i = j;
    if (this.d != null)
    {
      this.d.doubleValue();
      i = j + (dep.b(3) + 8);
    }
    return i;
  }
  
  public final void a(dep paramdep)
  {
    if (this.b != null) {
      paramdep.a(1, this.b);
    }
    if (this.c != null) {
      paramdep.a(2, this.c.doubleValue());
    }
    if (this.d != null) {
      paramdep.a(3, this.d.doubleValue());
    }
    super.a(paramdep);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dby.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */