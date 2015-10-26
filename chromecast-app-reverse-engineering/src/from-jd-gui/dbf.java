public final class dbf
  extends dew
{
  private static volatile dbf[] h;
  public dbj a = null;
  public String b = null;
  public String c = null;
  public String d = null;
  public String e = null;
  public int f = Integer.MIN_VALUE;
  public dbg[] g = dbg.b();
  
  public dbf()
  {
    this.t = -1;
  }
  
  public static dbf[] b()
  {
    if (h == null) {}
    synchronized (deu.a)
    {
      if (h == null) {
        h = new dbf[0];
      }
      return h;
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
    if (this.c != null) {
      j = i + dep.b(3, this.c);
    }
    i = j;
    if (this.d != null) {
      i = j + dep.b(4, this.d);
    }
    j = i;
    if (this.g != null)
    {
      j = i;
      if (this.g.length > 0)
      {
        int k = 0;
        while (k < this.g.length)
        {
          dbg localdbg = this.g[k];
          j = i;
          if (localdbg != null) {
            j = i + dep.b(5, localdbg);
          }
          k++;
          i = j;
        }
        j = i;
      }
    }
    i = j;
    if (this.f != Integer.MIN_VALUE) {
      i = j + dep.b(6, this.f);
    }
    j = i;
    if (this.e != null) {
      j = i + dep.b(7, this.e);
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
    if (this.c != null) {
      paramdep.a(3, this.c);
    }
    if (this.d != null) {
      paramdep.a(4, this.d);
    }
    if ((this.g != null) && (this.g.length > 0)) {
      for (int i = 0; i < this.g.length; i++)
      {
        dbg localdbg = this.g[i];
        if (localdbg != null) {
          paramdep.a(5, localdbg);
        }
      }
    }
    if (this.f != Integer.MIN_VALUE) {
      paramdep.a(6, this.f);
    }
    if (this.e != null) {
      paramdep.a(7, this.e);
    }
    super.a(paramdep);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dbf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */