public final class dat
  extends dew
{
  public dau[] a = dau.b();
  
  public dat()
  {
    this.t = -1;
  }
  
  public static dat a(byte[] paramArrayOfByte)
  {
    return (dat)dew.a(new dat(), paramArrayOfByte);
  }
  
  protected final int a()
  {
    int i = super.a();
    int k = i;
    if (this.a != null)
    {
      k = i;
      if (this.a.length > 0)
      {
        int j = 0;
        for (;;)
        {
          k = i;
          if (j >= this.a.length) {
            break;
          }
          dau localdau = this.a[j];
          k = i;
          if (localdau != null) {
            k = i + dep.b(1, localdau);
          }
          j++;
          i = k;
        }
      }
    }
    return k;
  }
  
  public final void a(dep paramdep)
  {
    if ((this.a != null) && (this.a.length > 0)) {
      for (int i = 0; i < this.a.length; i++)
      {
        dau localdau = this.a[i];
        if (localdau != null) {
          paramdep.a(1, localdau);
        }
      }
    }
    super.a(paramdep);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */