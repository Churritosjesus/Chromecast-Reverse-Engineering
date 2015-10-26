public final class dbe
  extends dew
{
  private static volatile dbe[] f;
  public dbj a = null;
  public String b = null;
  public String c = null;
  public String d = null;
  public String e = null;
  private String g = null;
  
  public dbe()
  {
    this.t = -1;
  }
  
  public static dbe[] b()
  {
    if (f == null) {}
    synchronized (deu.a)
    {
      if (f == null) {
        f = new dbe[0];
      }
      return f;
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
    if (this.g != null) {
      i = j + dep.b(2, this.g);
    }
    j = i;
    if (this.b != null) {
      j = i + dep.b(3, this.b);
    }
    i = j;
    if (this.c != null) {
      i = j + dep.b(4, this.c);
    }
    j = i;
    if (this.d != null) {
      j = i + dep.b(5, this.d);
    }
    i = j;
    if (this.e != null) {
      i = j + dep.b(6, this.e);
    }
    return i;
  }
  
  public final void a(dep paramdep)
  {
    if (this.a != null) {
      paramdep.a(1, this.a);
    }
    if (this.g != null) {
      paramdep.a(2, this.g);
    }
    if (this.b != null) {
      paramdep.a(3, this.b);
    }
    if (this.c != null) {
      paramdep.a(4, this.c);
    }
    if (this.d != null) {
      paramdep.a(5, this.d);
    }
    if (this.e != null) {
      paramdep.a(6, this.e);
    }
    super.a(paramdep);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dbe.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */