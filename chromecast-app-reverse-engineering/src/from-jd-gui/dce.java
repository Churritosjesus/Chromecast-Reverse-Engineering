public final class dce
  extends dew
{
  private static volatile dce[] b;
  public String a = null;
  
  public dce()
  {
    this.t = -1;
  }
  
  public static dce[] b()
  {
    if (b == null) {}
    synchronized (deu.a)
    {
      if (b == null) {
        b = new dce[0];
      }
      return b;
    }
  }
  
  protected final int a()
  {
    int j = super.a();
    int i = j;
    if (this.a != null) {
      i = j + dep.b(1, this.a);
    }
    return i;
  }
  
  public final void a(dep paramdep)
  {
    if (this.a != null) {
      paramdep.a(1, this.a);
    }
    super.a(paramdep);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dce.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */