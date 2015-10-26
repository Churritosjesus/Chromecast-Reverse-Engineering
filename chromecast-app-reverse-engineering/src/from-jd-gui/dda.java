public final class dda
  extends der
{
  private static volatile dda[] e;
  public Long a = null;
  public String b = null;
  public int c = Integer.MIN_VALUE;
  public String d = null;
  private ddb f = null;
  
  public dda()
  {
    this.i = null;
    this.t = -1;
  }
  
  public static dda[] b()
  {
    if (e == null) {}
    synchronized (deu.a)
    {
      if (e == null) {
        e = new dda[0];
      }
      return e;
    }
  }
  
  protected final int a()
  {
    int j = super.a();
    int i = j;
    if (this.a != null)
    {
      this.a.longValue();
      i = j + (dep.b(1) + 8);
    }
    j = i;
    if (this.b != null) {
      j = i + dep.b(2, this.b);
    }
    int k = j;
    if (this.c != Integer.MIN_VALUE) {
      k = j + dep.b(3, this.c);
    }
    i = k;
    if (this.f != null) {
      i = k + dep.b(4, this.f);
    }
    j = i;
    if (this.d != null) {
      j = i + dep.b(5, this.d);
    }
    return j;
  }
  
  public final void a(dep paramdep)
  {
    if (this.a != null)
    {
      long l = this.a.longValue();
      paramdep.c(1, 1);
      paramdep.a(l);
    }
    if (this.b != null) {
      paramdep.a(2, this.b);
    }
    if (this.c != Integer.MIN_VALUE) {
      paramdep.a(3, this.c);
    }
    if (this.f != null) {
      paramdep.a(4, this.f);
    }
    if (this.d != null) {
      paramdep.a(5, this.d);
    }
    super.a(paramdep);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dda.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */