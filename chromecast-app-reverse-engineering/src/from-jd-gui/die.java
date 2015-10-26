public final class die
{
  public static final dke a = dke.a(":status");
  public static final dke b = dke.a(":method");
  public static final dke c = dke.a(":path");
  public static final dke d = dke.a(":scheme");
  public static final dke e = dke.a(":authority");
  public static final dke f = dke.a(":host");
  public static final dke g = dke.a(":version");
  public final dke h;
  public final dke i;
  final int j;
  
  public die(dke paramdke1, dke paramdke2)
  {
    this.h = paramdke1;
    this.i = paramdke2;
    this.j = (paramdke1.b.length + 32 + paramdke2.b.length);
  }
  
  public die(dke paramdke, String paramString)
  {
    this(paramdke, dke.a(paramString));
  }
  
  public die(String paramString1, String paramString2)
  {
    this(dke.a(paramString1), dke.a(paramString2));
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    if ((paramObject instanceof die))
    {
      paramObject = (die)paramObject;
      bool1 = bool2;
      if (this.h.equals(((die)paramObject).h))
      {
        bool1 = bool2;
        if (this.i.equals(((die)paramObject).i)) {
          bool1 = true;
        }
      }
    }
    return bool1;
  }
  
  public final int hashCode()
  {
    return (this.h.hashCode() + 527) * 31 + this.i.hashCode();
  }
  
  public final String toString()
  {
    return String.format("%s: %s", new Object[] { this.h.a(), this.i.a() });
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\die.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */