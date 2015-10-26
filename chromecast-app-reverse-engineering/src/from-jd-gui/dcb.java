public final class dcb
  extends dew
{
  private static volatile dcb[] a;
  private String b = null;
  private Long c = null;
  
  public dcb()
  {
    this.t = -1;
  }
  
  public static dcb[] b()
  {
    if (a == null) {}
    synchronized (deu.a)
    {
      if (a == null) {
        a = new dcb[0];
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
    if (this.c != null) {
      j = i + dep.b(2, this.c.longValue());
    }
    return j;
  }
  
  public final void a(dep paramdep)
  {
    if (this.b != null) {
      paramdep.a(1, this.b);
    }
    if (this.c != null) {
      paramdep.a(2, this.c.longValue());
    }
    super.a(paramdep);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dcb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */