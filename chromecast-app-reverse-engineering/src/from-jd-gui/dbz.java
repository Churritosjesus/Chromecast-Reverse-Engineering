public final class dbz
  extends dew
{
  public dbq[] a = dbq.b();
  public String b = null;
  private Integer c = null;
  private String d = null;
  private Boolean e = null;
  
  public dbz()
  {
    this.t = -1;
  }
  
  protected final int a()
  {
    int j = super.a();
    int i = j;
    if (this.c != null) {
      i = j + dep.b(1, this.c.intValue());
    }
    int k = i;
    if (this.a != null)
    {
      k = i;
      if (this.a.length > 0)
      {
        k = 0;
        while (k < this.a.length)
        {
          dbq localdbq = this.a[k];
          j = i;
          if (localdbq != null) {
            j = i + dep.b(2, localdbq);
          }
          k++;
          i = j;
        }
        k = i;
      }
    }
    j = k;
    if (this.b != null) {
      j = k + dep.b(3, this.b);
    }
    i = j;
    if (this.d != null) {
      i = j + dep.b(4, this.d);
    }
    j = i;
    if (this.e != null)
    {
      this.e.booleanValue();
      j = i + (dep.b(5) + 1);
    }
    return j;
  }
  
  public final void a(dep paramdep)
  {
    if (this.c != null) {
      paramdep.a(1, this.c.intValue());
    }
    if ((this.a != null) && (this.a.length > 0)) {
      for (int i = 0; i < this.a.length; i++)
      {
        dbq localdbq = this.a[i];
        if (localdbq != null) {
          paramdep.a(2, localdbq);
        }
      }
    }
    if (this.b != null) {
      paramdep.a(3, this.b);
    }
    if (this.d != null) {
      paramdep.a(4, this.d);
    }
    if (this.e != null) {
      paramdep.a(5, this.e.booleanValue());
    }
    super.a(paramdep);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dbz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */