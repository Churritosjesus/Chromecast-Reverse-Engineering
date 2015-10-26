public final class dff
{
  public final String a;
  public final String b;
  
  public dff(String paramString1, String paramString2)
  {
    this.a = paramString1;
    this.b = paramString2;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (((paramObject instanceof dff)) && (dgs.a(this.a, ((dff)paramObject).a)) && (dgs.a(this.b, ((dff)paramObject).b))) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public final int hashCode()
  {
    int j = 0;
    if (this.b != null) {}
    for (int i = this.b.hashCode();; i = 0)
    {
      if (this.a != null) {
        j = this.a.hashCode();
      }
      return (i + 899) * 31 + j;
    }
  }
  
  public final String toString()
  {
    return this.a + " realm=\"" + this.b + "\"";
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dff.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */