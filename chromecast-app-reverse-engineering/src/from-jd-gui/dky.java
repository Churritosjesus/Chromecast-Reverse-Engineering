import java.nio.charset.Charset;

final class dky
{
  public static final Charset a = Charset.forName("UTF-8");
  
  public static int a(int paramInt)
  {
    return (0xFF000000 & paramInt) >>> 24 | (0xFF0000 & paramInt) >>> 8 | (0xFF00 & paramInt) << 8 | (paramInt & 0xFF) << 24;
  }
  
  public static short a(short paramShort)
  {
    paramShort = 0xFFFF & paramShort;
    return (short)((paramShort & 0xFF) << 8 | paramShort >>> 8 & 0xFF);
  }
  
  public static void a(long paramLong1, long paramLong2, long paramLong3)
  {
    if (((paramLong2 | paramLong3) < 0L) || (paramLong2 > paramLong1) || (paramLong1 - paramLong2 < paramLong3)) {
      throw new ArrayIndexOutOfBoundsException(String.format("size=%s offset=%s byteCount=%s", new Object[] { Long.valueOf(paramLong1), Long.valueOf(paramLong2), Long.valueOf(paramLong3) }));
    }
  }
  
  public static void a(Throwable paramThrowable)
  {
    throw paramThrowable;
  }
  
  public static boolean a(byte[] paramArrayOfByte1, int paramInt1, byte[] paramArrayOfByte2, int paramInt2, int paramInt3)
  {
    boolean bool = false;
    int i = 0;
    if (i < paramInt3) {
      if (paramArrayOfByte1[(i + paramInt1)] == paramArrayOfByte2[(i + paramInt2)]) {}
    }
    for (;;)
    {
      return bool;
      i++;
      break;
      bool = true;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dky.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */