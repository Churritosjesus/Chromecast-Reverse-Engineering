public final class dam
  extends dew
{
  public dal[] a = dal.b();
  
  public dam()
  {
    this.t = -1;
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
          dal localdal = this.a[j];
          k = i;
          if (localdal != null) {
            k = i + dep.b(1, localdal);
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
        dal localdal = this.a[i];
        if (localdal != null) {
          paramdep.a(1, localdal);
        }
      }
    }
    super.a(paramdep);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dam.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */