public final class atd
{
  private int a;
  private String b;
  
  public atd(int paramInt, String paramString)
  {
    this.a = paramInt;
    this.b = paramString;
  }
  
  public final boolean equals(Object paramObject)
  {
    atd localatd = (atd)paramObject;
    if (((paramObject instanceof atd)) && (this.a == localatd.a) && (this.b.equals(localatd.b))) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public final int hashCode()
  {
    return (this.b.hashCode() ^ this.b.hashCode() >>> 16) * 31 + 31 + this.a;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\atd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */