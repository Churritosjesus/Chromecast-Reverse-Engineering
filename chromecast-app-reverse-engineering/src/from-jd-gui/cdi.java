import java.util.Arrays;

final class cdi
  extends cah
{
  private final byte[] a;
  
  cdi(byte[] paramArrayOfByte)
  {
    super(Arrays.copyOfRange(paramArrayOfByte, 0, 25));
    this.a = paramArrayOfByte;
  }
  
  final byte[] a()
  {
    return this.a;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cdi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */