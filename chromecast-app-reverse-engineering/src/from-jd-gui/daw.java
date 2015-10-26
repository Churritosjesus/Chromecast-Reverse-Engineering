public final class daw
  extends dew
{
  private static volatile daw[] g;
  public dbj a = null;
  public String b = null;
  public String c = null;
  public String d = null;
  public String e = null;
  public String f = null;
  
  public daw()
  {
    this.t = -1;
  }
  
  public static daw[] b()
  {
    if (g == null) {}
    synchronized (deu.a)
    {
      if (g == null) {
        g = new daw[0];
      }
      return g;
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
    int k = j;
    if (this.d != null) {
      k = j + dep.b(3, this.d);
    }
    i = k;
    if (this.e != null) {
      i = k + dep.b(4, this.e);
    }
    j = i;
    if (this.c != null) {
      j = i + dep.b(5, this.c);
    }
    i = j;
    if (this.f != null) {
      i = j + dep.b(6, this.f);
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
    if (this.d != null) {
      paramdep.a(3, this.d);
    }
    if (this.e != null) {
      paramdep.a(4, this.e);
    }
    if (this.c != null) {
      paramdep.a(5, this.c);
    }
    if (this.f != null) {
      paramdep.a(6, this.f);
    }
    super.a(paramdep);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\daw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */