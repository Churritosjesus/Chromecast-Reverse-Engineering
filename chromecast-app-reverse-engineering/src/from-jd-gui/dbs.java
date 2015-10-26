public final class dbs
  extends dew
{
  public dbr[] a = dbr.b();
  private String b = null;
  
  public dbs()
  {
    this.t = -1;
  }
  
  public static dbs a(byte[] paramArrayOfByte)
  {
    return (dbs)dew.a(new dbs(), paramArrayOfByte);
  }
  
  protected final int a()
  {
    int i = super.a();
    int j = i;
    if (this.a != null)
    {
      j = i;
      if (this.a.length > 0)
      {
        int k = 0;
        for (;;)
        {
          j = i;
          if (k >= this.a.length) {
            break;
          }
          dbr localdbr = this.a[k];
          j = i;
          if (localdbr != null) {
            j = i + dep.b(1, localdbr);
          }
          k++;
          i = j;
        }
      }
    }
    i = j;
    if (this.b != null) {
      i = j + dep.b(2, this.b);
    }
    return i;
  }
  
  public final void a(dep paramdep)
  {
    if ((this.a != null) && (this.a.length > 0)) {
      for (int i = 0; i < this.a.length; i++)
      {
        dbr localdbr = this.a[i];
        if (localdbr != null) {
          paramdep.a(1, localdbr);
        }
      }
    }
    if (this.b != null) {
      paramdep.a(2, this.b);
    }
    super.a(paramdep);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dbs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */