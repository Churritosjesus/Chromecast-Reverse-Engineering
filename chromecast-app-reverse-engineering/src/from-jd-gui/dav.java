public final class dav
  extends dew
{
  public String a = null;
  public String b = null;
  public String c = null;
  public String d = null;
  public daw[] e = daw.b();
  
  public dav()
  {
    this.t = -1;
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
    if (this.c != null) {
      k = j + dep.b(3, this.c);
    }
    i = k;
    if (this.d != null) {
      i = k + dep.b(4, this.d);
    }
    j = i;
    if (this.e != null)
    {
      j = i;
      if (this.e.length > 0)
      {
        j = 0;
        while (j < this.e.length)
        {
          daw localdaw = this.e[j];
          k = i;
          if (localdaw != null) {
            k = i + dep.b(5, localdaw);
          }
          j++;
          i = k;
        }
        j = i;
      }
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
    if ((this.e != null) && (this.e.length > 0)) {
      for (int i = 0; i < this.e.length; i++)
      {
        daw localdaw = this.e[i];
        if (localdaw != null) {
          paramdep.a(5, localdaw);
        }
      }
    }
    super.a(paramdep);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dav.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */