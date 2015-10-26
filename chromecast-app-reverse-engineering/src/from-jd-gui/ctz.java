import java.util.Arrays;

final class ctz
{
  public final String a;
  public final Object b;
  
  ctz(String paramString, Object paramObject)
  {
    this.a = paramString;
    this.b = paramObject;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool2 = false;
    boolean bool1;
    if (!(paramObject instanceof ctz)) {
      bool1 = bool2;
    }
    for (;;)
    {
      return bool1;
      paramObject = (ctz)paramObject;
      bool1 = bool2;
      if (this.a.equals(((ctz)paramObject).a))
      {
        bool1 = bool2;
        if (this.b.equals(((ctz)paramObject).b)) {
          bool1 = true;
        }
      }
    }
  }
  
  public final int hashCode()
  {
    return Arrays.hashCode(new Integer[] { Integer.valueOf(this.a.hashCode()), Integer.valueOf(this.b.hashCode()) });
  }
  
  public final String toString()
  {
    return "Key: " + this.a + " value: " + this.b.toString();
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\ctz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */