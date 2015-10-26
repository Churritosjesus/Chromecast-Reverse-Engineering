import java.io.IOException;

public abstract class ddh
  implements deb
{
  private ddh a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    try
    {
      paramArrayOfByte = ddn.a(paramArrayOfByte, 0, paramInt2);
      a(paramArrayOfByte, ddp.a());
      paramArrayOfByte.a(0);
      return this;
    }
    catch (ddx paramArrayOfByte)
    {
      throw paramArrayOfByte;
    }
    catch (IOException paramArrayOfByte)
    {
      throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).", paramArrayOfByte);
    }
  }
  
  public abstract ddh a();
  
  public abstract ddh a(ddn paramddn, ddp paramddp);
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\ddh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */