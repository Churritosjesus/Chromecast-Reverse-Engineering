import java.util.Arrays;

final class czl
{
  final String a;
  final byte[] b;
  
  czl(String paramString, byte[] paramArrayOfByte)
  {
    this.a = paramString;
    this.b = paramArrayOfByte;
  }
  
  public final String toString()
  {
    return "KeyAndSerialized: key = " + this.a + " serialized hash = " + Arrays.hashCode(this.b);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\czl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */