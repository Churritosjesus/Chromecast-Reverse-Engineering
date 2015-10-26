public final class dbd
  extends dew
{
  private static volatile dbd[] c;
  public String a = null;
  public String b = null;
  
  public dbd()
  {
    this.t = -1;
  }
  
  public static dbd[] b()
  {
    if (c == null) {}
    synchronized (deu.a)
    {
      if (c == null) {
        c = new dbd[0];
      }
      return c;
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
    return j;
  }
  
  public final void a(dep paramdep)
  {
    if (this.a != null) {
      paramdep.a(1, this.a);
    }
    if (this.b != null) {
      paramdep.a(2, this.b);
    }
    super.a(paramdep);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dbd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */