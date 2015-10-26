public final class dbp
  extends dew
{
  public dbf[] a = dbf.b();
  private dbb b = null;
  
  public dbp()
  {
    this.t = -1;
  }
  
  public static dbp a(byte[] paramArrayOfByte)
  {
    return (dbp)dew.a(new dbp(), paramArrayOfByte);
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
          dbf localdbf = this.a[k];
          j = i;
          if (localdbf != null) {
            j = i + dep.b(2, localdbf);
          }
          k++;
          i = j;
        }
        j = i;
      }
    }
    return j;
  }
  
  public final void a(dep paramdep)
  {
    if (this.b != null) {
      paramdep.a(1, this.b);
    }
    if ((this.a != null) && (this.a.length > 0)) {
      for (int i = 0; i < this.a.length; i++)
      {
        dbf localdbf = this.a[i];
        if (localdbf != null) {
          paramdep.a(2, localdbf);
        }
      }
    }
    super.a(paramdep);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dbp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */