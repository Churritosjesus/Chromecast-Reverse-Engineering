public final class dbl
  extends dew
{
  public dax a = null;
  public String[] b = dey.b;
  
  public dbl()
  {
    this.t = -1;
  }
  
  protected final int a()
  {
    int m = 0;
    int j = super.a();
    int i = j;
    if (this.a != null) {
      i = j + dep.b(1, this.a);
    }
    j = i;
    if (this.b != null)
    {
      j = i;
      if (this.b.length > 0)
      {
        int n = 0;
        int k;
        for (j = 0; m < this.b.length; j = k)
        {
          String str = this.b[m];
          int i1 = n;
          k = j;
          if (str != null)
          {
            k = j + 1;
            i1 = n + dep.a(str);
          }
          m++;
          n = i1;
        }
        j = i + n + j * 1;
      }
    }
    return j;
  }
  
  public final void a(dep paramdep)
  {
    if (this.a != null) {
      paramdep.a(1, this.a);
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
    super.a(paramdep);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dbl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */