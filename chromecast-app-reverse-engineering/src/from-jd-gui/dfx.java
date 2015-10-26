import java.io.IOException;

public enum dfx
{
  private final String e;
  
  private dfx(String paramString1)
  {
    this.e = paramString1;
  }
  
  public static dfx a(String paramString)
  {
    if (paramString.equals(a.e)) {
      paramString = a;
    }
    for (;;)
    {
      return paramString;
      if (paramString.equals(b.e))
      {
        paramString = b;
      }
      else if (paramString.equals(d.e))
      {
        paramString = d;
      }
      else
      {
        if (!paramString.equals(c.e)) {
          break;
        }
        paramString = c;
      }
    }
    throw new IOException("Unexpected protocol: " + paramString);
  }
  
  public final String toString()
  {
    return this.e;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dfx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */