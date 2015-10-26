public final class dch
  extends dew
{
  public String[] a = dey.b;
  private dbv[] b = dbv.b();
  
  public dch()
  {
    this.t = -1;
  }
  
  protected final int a()
  {
    int i1 = 0;
    int i2 = super.a();
    int j;
    int k;
    Object localObject;
    if ((this.a != null) && (this.a.length > 0))
    {
      int m = 0;
      j = 0;
      for (k = 0; m < this.a.length; k = i)
      {
        localObject = this.a[m];
        int n = j;
        i = k;
        if (localObject != null)
        {
          i = k + 1;
          n = j + dep.a((String)localObject);
        }
        m++;
        j = n;
      }
    }
    for (int i = i2 + j + k * 1;; i = i2)
    {
      k = i;
      if (this.b != null)
      {
        k = i;
        if (this.b.length > 0)
        {
          j = i1;
          for (;;)
          {
            k = i;
            if (j >= this.b.length) {
              break;
            }
            localObject = this.b[j];
            k = i;
            if (localObject != null) {
              k = i + dep.b(2, (dew)localObject);
            }
            j++;
            i = k;
          }
        }
      }
      return k;
    }
  }
  
  public final void a(dep paramdep)
  {
    int j = 0;
    int i;
    Object localObject;
    if ((this.a != null) && (this.a.length > 0)) {
      for (i = 0; i < this.a.length; i++)
      {
        localObject = this.a[i];
        if (localObject != null) {
          paramdep.a(1, (String)localObject);
        }
      }
    }
    if ((this.b != null) && (this.b.length > 0)) {
      for (i = j; i < this.b.length; i++)
      {
        localObject = this.b[i];
        if (localObject != null) {
          paramdep.a(2, (dew)localObject);
        }
      }
    }
    super.a(paramdep);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dch.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */