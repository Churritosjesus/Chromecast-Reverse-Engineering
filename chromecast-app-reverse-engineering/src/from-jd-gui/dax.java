public final class dax
  extends dew
{
  public Integer a = null;
  public String[] b = dey.b;
  public int c = Integer.MIN_VALUE;
  public String d = null;
  private String e = null;
  
  public dax()
  {
    this.t = -1;
  }
  
  protected final int a()
  {
    int n = 0;
    int j = super.a();
    int i = j;
    if (this.a != null) {
      i = j + dep.b(1, this.a.intValue());
    }
    j = i;
    if (this.b != null)
    {
      j = i;
      if (this.b.length > 0)
      {
        int k = 0;
        int m;
        for (j = 0; n < this.b.length; j = m)
        {
          String str = this.b[n];
          int i1 = k;
          m = j;
          if (str != null)
          {
            m = j + 1;
            i1 = k + dep.a(str);
          }
          n++;
          k = i1;
        }
        j = i + k + j * 1;
      }
    }
    i = j;
    if (this.c != Integer.MIN_VALUE) {
      i = j + dep.b(3, this.c);
    }
    j = i;
    if (this.d != null) {
      j = i + dep.b(4, this.d);
    }
    i = j;
    if (this.e != null) {
      i = j + dep.b(5, this.e);
    }
    return i;
  }
  
  public final void a(dep paramdep)
  {
    if (this.a != null) {
      paramdep.a(1, this.a.intValue());
    }
    if ((this.b != null) && (this.b.length > 0)) {
      for (int i = 0; i < this.b.length; i++)
      {
        String str = this.b[i];
        if (str != null) {
          paramdep.a(2, str);
        }
      }
    }
    if (this.c != Integer.MIN_VALUE) {
      paramdep.a(3, this.c);
    }
    if (this.d != null) {
      paramdep.a(4, this.d);
    }
    if (this.e != null) {
      paramdep.a(5, this.e);
    }
    super.a(paramdep);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dax.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */