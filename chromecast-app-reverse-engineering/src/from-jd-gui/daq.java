public final class daq
  extends dew
{
  public dbj a = null;
  public String b = null;
  public String c = null;
  public Boolean d = null;
  public String e = null;
  public String f = null;
  public String g = null;
  public dar[] h = dar.b();
  
  public daq()
  {
    this.t = -1;
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
    int k = i;
    if (this.c != null) {
      k = i + dep.b(3, this.c);
    }
    j = k;
    if (this.e != null) {
      j = k + dep.b(4, this.e);
    }
    i = j;
    if (this.f != null) {
      i = j + dep.b(5, this.f);
    }
    j = i;
    if (this.h != null)
    {
      j = i;
      if (this.h.length > 0)
      {
        k = 0;
        while (k < this.h.length)
        {
          dar localdar = this.h[k];
          j = i;
          if (localdar != null) {
            j = i + dep.b(6, localdar);
          }
          k++;
          i = j;
        }
        j = i;
      }
    }
    i = j;
    if (this.d != null)
    {
      this.d.booleanValue();
      i = j + (dep.b(7) + 1);
    }
    j = i;
    if (this.g != null) {
      j = i + dep.b(8, this.g);
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
    if (this.e != null) {
      paramdep.a(4, this.e);
    }
    if (this.f != null) {
      paramdep.a(5, this.f);
    }
    if ((this.h != null) && (this.h.length > 0)) {
      for (int i = 0; i < this.h.length; i++)
      {
        dar localdar = this.h[i];
        if (localdar != null) {
          paramdep.a(6, localdar);
        }
      }
    }
    if (this.d != null) {
      paramdep.a(7, this.d.booleanValue());
    }
    if (this.g != null) {
      paramdep.a(8, this.g);
    }
    super.a(paramdep);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\daq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */