import java.util.Map;

public final class adp
{
  public final int a;
  public final byte[] b;
  public final Map c;
  public final boolean d;
  
  public adp(int paramInt, byte[] paramArrayOfByte, Map paramMap, boolean paramBoolean, long paramLong)
  {
    this.a = paramInt;
    this.b = paramArrayOfByte;
    this.c = paramMap;
    this.d = paramBoolean;
  }
  
  public adp(byte[] paramArrayOfByte, Map paramMap)
  {
    this(200, paramArrayOfByte, paramMap, false, 0L);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\adp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */