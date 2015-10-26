public final class ast
{
  public final String a;
  public final String b;
  public final String c;
  public final long d;
  
  public ast(dbr paramdbr)
  {
    this.a = paramdbr.a;
    this.b = paramdbr.b;
    this.c = paramdbr.c;
    if (paramdbr.d == null) {}
    for (long l = 0L;; l = paramdbr.d.longValue())
    {
      this.d = l;
      return;
    }
  }
  
  public ast(dbt paramdbt, String paramString)
  {
    this.a = paramString;
    this.b = paramdbt.a;
    this.c = paramdbt.b;
    this.d = System.currentTimeMillis();
  }
  
  public final String toString()
  {
    return this.c;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\ast.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */