import java.net.ProtocolException;

public final class dhv
{
  public final dfx a;
  public final int b;
  public final String c;
  
  private dhv(dfx paramdfx, int paramInt, String paramString)
  {
    this.a = paramdfx;
    this.b = paramInt;
    this.c = paramString;
  }
  
  public static dhv a(dgc paramdgc)
  {
    return new dhv(paramdgc.b, paramdgc.c, paramdgc.d);
  }
  
  public static dhv a(String paramString)
  {
    int i = 9;
    int j;
    dfx localdfx;
    if (paramString.startsWith("HTTP/1."))
    {
      if ((paramString.length() < 9) || (paramString.charAt(8) != ' ')) {
        throw new ProtocolException("Unexpected status line: " + paramString);
      }
      j = paramString.charAt(7) - '0';
      if (j == 0) {
        localdfx = dfx.a;
      }
    }
    while (paramString.length() < i + 3)
    {
      throw new ProtocolException("Unexpected status line: " + paramString);
      if (j == 1)
      {
        localdfx = dfx.b;
      }
      else
      {
        throw new ProtocolException("Unexpected status line: " + paramString);
        if (paramString.startsWith("ICY "))
        {
          localdfx = dfx.a;
          i = 4;
        }
        else
        {
          throw new ProtocolException("Unexpected status line: " + paramString);
        }
      }
    }
    try
    {
      j = Integer.parseInt(paramString.substring(i, i + 3));
      if (paramString.length() > i + 3) {
        if (paramString.charAt(i + 3) != ' ') {
          throw new ProtocolException("Unexpected status line: " + paramString);
        }
      }
    }
    catch (NumberFormatException localNumberFormatException)
    {
      throw new ProtocolException("Unexpected status line: " + paramString);
    }
    for (paramString = paramString.substring(i + 4);; paramString = "") {
      return new dhv(localNumberFormatException, j, paramString);
    }
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    if (this.a == dfx.a) {}
    for (String str = "HTTP/1.0";; str = "HTTP/1.1")
    {
      localStringBuilder.append(str);
      localStringBuilder.append(' ').append(this.b);
      if (this.c != null) {
        localStringBuilder.append(' ').append(this.c);
      }
      return localStringBuilder.toString();
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dhv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */