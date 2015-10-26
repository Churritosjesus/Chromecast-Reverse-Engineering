public final class dcg
  extends dew
{
  public Integer a = null;
  public String b = null;
  public dbt[] c = dbt.b();
  private String d = null;
  
  public dcg()
  {
    this.t = -1;
  }
  
  protected final int a()
  {
    int j = super.a();
    int i = j;
    if (this.a != null) {
      i = j + dep.b(1, this.a.intValue());
    }
    j = i;
    if (this.b != null) {
      j = i + dep.b(2, this.b);
    }
    i = j;
    if (this.d != null) {
      i = j + dep.b(3, this.d);
    }
    j = i;
    if (this.c != null)
    {
      j = i;
      if (this.c.length > 0)
      {
        j = 0;
        while (j < this.c.length)
        {
          dbt localdbt = this.c[j];
          int k = i;
          if (localdbt != null) {
            k = i + dep.b(4, localdbt);
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
      paramdep.a(1, this.a.intValue());
    }
    if (this.b != null) {
      paramdep.a(2, this.b);
    }
    if (this.d != null) {
      paramdep.a(3, this.d);
    }
    if ((this.c != null) && (this.c.length > 0)) {
      for (int i = 0; i < this.c.length; i++)
      {
        dbt localdbt = this.c[i];
        if (localdbt != null) {
          paramdep.a(4, localdbt);
        }
      }
    }
    super.a(paramdep);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dcg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */