public final class dbt
  extends dew
{
  private static volatile dbt[] d;
  public String a = null;
  public String b = null;
  public String c = null;
  
  public dbt()
  {
    this.t = -1;
  }
  
  public static dbt[] b()
  {
    if (d == null) {}
    synchronized (deu.a)
    {
      if (d == null) {
        d = new dbt[0];
      }
      return d;
    }
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
      paramdep.a(3, this.c);
    }
    super.a(paramdep);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dbt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */