public final class daz
  extends dew
{
  public Boolean a = null;
  public Boolean b = null;
  public Boolean c = null;
  public String[] d = dey.b;
  public String e = null;
  public dba[] f = dba.b();
  private Boolean g = null;
  
  public daz()
  {
    this.t = -1;
  }
  
  protected final int a()
  {
    int n = 0;
    int i = super.a();
    int j = i;
    if (this.a != null)
    {
      this.a.booleanValue();
      j = i + (dep.b(1) + 1);
    }
    i = j;
    if (this.b != null)
    {
      this.b.booleanValue();
      i = j + (dep.b(2) + 1);
    }
    j = i;
    Object localObject;
    int k;
    if (this.f != null)
    {
      j = i;
      if (this.f.length > 0)
      {
        j = 0;
        while (j < this.f.length)
        {
          localObject = this.f[j];
          k = i;
          if (localObject != null) {
            k = i + dep.b(3, (dew)localObject);
          }
          j++;
          i = k;
        }
        j = i;
      }
    }
    i = j;
    if (this.c != null)
    {
      this.c.booleanValue();
      i = j + (dep.b(4) + 1);
    }
    j = i;
    if (this.g != null)
    {
      this.g.booleanValue();
      j = i + (dep.b(5) + 1);
    }
    i = j;
    if (this.e != null) {
      i = j + dep.b(6, this.e);
    }
    j = i;
    if (this.d != null)
    {
      j = i;
      if (this.d.length > 0)
      {
        j = 0;
        int m = 0;
        k = n;
        while (k < this.d.length)
        {
          localObject = this.d[k];
          int i1 = j;
          n = m;
          if (localObject != null)
          {
            n = m + 1;
            i1 = j + dep.a((String)localObject);
          }
          k++;
          j = i1;
          m = n;
        }
        j = i + j + m * 1;
      }
    }
    return j;
  }
  
  public final void a(dep paramdep)
  {
    int j = 0;
    if (this.a != null) {
      paramdep.a(1, this.a.booleanValue());
    }
    if (this.b != null) {
      paramdep.a(2, this.b.booleanValue());
    }
    int i;
    Object localObject;
    if ((this.f != null) && (this.f.length > 0)) {
      for (i = 0; i < this.f.length; i++)
      {
        localObject = this.f[i];
        if (localObject != null) {
          paramdep.a(3, (dew)localObject);
        }
      }
    }
    if (this.c != null) {
      paramdep.a(4, this.c.booleanValue());
    }
    if (this.g != null) {
      paramdep.a(5, this.g.booleanValue());
    }
    if (this.e != null) {
      paramdep.a(6, this.e);
    }
    if ((this.d != null) && (this.d.length > 0)) {
      for (i = j; i < this.d.length; i++)
      {
        localObject = this.d[i];
        if (localObject != null) {
          paramdep.a(7, (String)localObject);
        }
      }
    }
    super.a(paramdep);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\daz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */