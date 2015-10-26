public final class dao
  extends dew
{
  public dan[] a = dan.b();
  
  public dao()
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
          dan localdan = this.a[j];
          k = i;
          if (localdan != null) {
            k = i + dep.b(1, localdan);
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
        dan localdan = this.a[i];
        if (localdan != null) {
          paramdep.a(1, localdan);
        }
      }
    }
    super.a(paramdep);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dao.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */