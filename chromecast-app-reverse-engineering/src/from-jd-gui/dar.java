public final class dar
  extends dew
{
  private static volatile dar[] e;
  public dbj a = null;
  public String b = null;
  public String c = null;
  public dbb d = null;
  private String f = null;
  
  public dar()
  {
    this.t = -1;
  }
  
  public static dar[] b()
  {
    if (e == null) {}
    synchronized (deu.a)
    {
      if (e == null) {
        e = new dar[0];
      }
      return e;
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
    if (this.b != null) {
      i = j + dep.b(2, this.b);
    }
    j = i;
    if (this.d != null) {
      j = i + dep.b(3, this.d);
    }
    i = j;
    if (this.c != null) {
      i = j + dep.b(4, this.c);
    }
    j = i;
    if (this.f != null) {
      j = i + dep.b(5, this.f);
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
    if (this.d != null) {
      paramdep.a(3, this.d);
    }
    if (this.c != null) {
      paramdep.a(4, this.c);
    }
    if (this.f != null) {
      paramdep.a(5, this.f);
    }
    super.a(paramdep);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */