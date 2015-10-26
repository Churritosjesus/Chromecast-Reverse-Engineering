import java.util.Arrays;

final class dex
{
  final int a;
  final byte[] b;
  
  dex(int paramInt, byte[] paramArrayOfByte)
  {
    this.a = paramInt;
    this.b = paramArrayOfByte;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {}
    for (;;)
    {
      return bool;
      if (!(paramObject instanceof dex))
      {
        bool = false;
      }
      else
      {
        paramObject = (dex)paramObject;
        if ((this.a != ((dex)paramObject).a) || (!Arrays.equals(this.b, ((dex)paramObject).b))) {
          bool = false;
        }
      }
    }
  }
  
  public final int hashCode()
  {
    return (this.a + 527) * 31 + Arrays.hashCode(this.b);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dex.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */