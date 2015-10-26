public final class dcd
  extends dew
{
  public dce[] a = dce.b();
  private String b = null;
  private String c = null;
  private Integer d = null;
  private String e = null;
  
  public dcd()
  {
    this.t = -1;
  }
  
  public static dcd a(byte[] paramArrayOfByte)
  {
    return (dcd)dew.a(new dcd(), paramArrayOfByte);
  }
  
  protected final int a()
  {
    int j = super.a();
    int i = j;
    if (this.b != null) {
      i = j + dep.b(1, this.b);
    }
    j = i;
    if (this.a != null)
    {
      j = i;
      if (this.a.length > 0)
      {
        int k = 0;
        while (k < this.a.length)
        {
          dce localdce = this.a[k];
          j = i;
          if (localdce != null) {
            j = i + dep.b(2, localdce);
          }
          k++;
          i = j;
        }
        j = i;
      }
    }
    i = j;
    if (this.c != null) {
      i = j + dep.b(3, this.c);
    }
    j = i;
    if (this.d != null) {
      j = i + dep.b(4, this.d.intValue());
    }
    i = j;
    if (this.e != null) {
      i = j + dep.b(5, this.e);
    }
    return i;
  }
  
  public final void a(dep paramdep)
  {
    if (this.b != null) {
      paramdep.a(1, this.b);
    }
    if ((this.a != null) && (this.a.length > 0)) {
      for (int i = 0; i < this.a.length; i++)
      {
        dce localdce = this.a[i];
        if (localdce != null) {
          paramdep.a(2, localdce);
        }
      }
    }
    if (this.c != null) {
      paramdep.a(3, this.c);
    }
    if (this.d != null) {
      paramdep.a(4, this.d.intValue());
    }
    if (this.e != null) {
      paramdep.a(5, this.e);
    }
    super.a(paramdep);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dcd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */