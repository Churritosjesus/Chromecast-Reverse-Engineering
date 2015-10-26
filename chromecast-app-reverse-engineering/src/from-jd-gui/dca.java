public final class dca
  extends dew
{
  private static volatile dca[] c;
  public String a = null;
  public String b = null;
  private String d = null;
  private Long e = null;
  
  public dca()
  {
    this.t = -1;
  }
  
  public static dca[] b()
  {
    if (c == null) {}
    synchronized (deu.a)
    {
      if (c == null) {
        c = new dca[0];
      }
      return c;
    }
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
    if (this.e != null) {
      j = i + dep.b(3, this.e.longValue());
    }
    i = j;
    if (this.b != null) {
      i = j + dep.b(4, this.b);
    }
    return i;
  }
  
  public final void a(dep paramdep)
  {
    if (this.a != null) {
      paramdep.a(1, this.a);
    }
    if (this.d != null) {
      paramdep.a(2, this.d);
    }
    if (this.e != null) {
      paramdep.a(3, this.e.longValue());
    }
    if (this.b != null) {
      paramdep.a(4, this.b);
    }
    super.a(paramdep);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dca.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */