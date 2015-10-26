import java.io.UnsupportedEncodingException;
import java.util.Arrays;

abstract class cah
{
  private int a;
  
  protected cah(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte.length == 25) {}
    for (boolean bool = true;; bool = false)
    {
      a.b(bool, "cert hash data has incorrect length");
      this.a = Arrays.hashCode(paramArrayOfByte);
      return;
    }
  }
  
  protected static byte[] a(String paramString)
  {
    try
    {
      paramString = paramString.getBytes("ISO-8859-1");
      return paramString;
    }
    catch (UnsupportedEncodingException paramString)
    {
      throw new AssertionError(paramString);
    }
  }
  
  abstract byte[] a();
  
  public boolean equals(Object paramObject)
  {
    if ((paramObject == null) || (!(paramObject instanceof cah))) {}
    for (boolean bool = false;; bool = Arrays.equals(a(), ((cah)paramObject).a()))
    {
      return bool;
      paramObject = (cah)paramObject;
    }
  }
  
  public int hashCode()
  {
    return this.a;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cah.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */