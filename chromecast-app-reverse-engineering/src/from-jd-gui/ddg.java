import java.io.IOException;

public abstract class ddg
  implements dea
{
  public final byte[] e()
  {
    try
    {
      byte[] arrayOfByte = new byte[a()];
      ddo localddo = ddo.a(arrayOfByte);
      a(localddo);
      localddo.a();
      return arrayOfByte;
    }
    catch (IOException localIOException)
    {
      throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", localIOException);
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\ddg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */