import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class ddo
{
  private static final Logger e = Logger.getLogger(ddo.class.getName());
  final byte[] a;
  final int b;
  int c;
  int d = 0;
  private final OutputStream f = null;
  
  private ddo(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    this.a = paramArrayOfByte;
    this.c = paramInt1;
    this.b = (paramInt1 + paramInt2);
  }
  
  public static int a(int paramInt, long paramLong)
  {
    return b(paramInt) + b(paramLong);
  }
  
  public static int a(int paramInt, ddl paramddl)
  {
    return b(paramInt) + (d(paramddl.b()) + paramddl.b());
  }
  
  public static ddo a(byte[] paramArrayOfByte)
  {
    return new ddo(paramArrayOfByte, 0, paramArrayOfByte.length);
  }
  
  private void a(String paramString)
  {
    int k = d(paramString.length() * 3);
    int i = d(paramString.length());
    j = this.c;
    if (i == k) {}
    for (;;)
    {
      try
      {
        this.c = (j + i);
        k = a.a(paramString, this.a, this.c, this.b - this.c);
        this.c = j;
        i = k - j - i;
        c(i);
        this.c = k;
        this.d = (i + this.d);
        return;
      }
      catch (dem paramString)
      {
        this.c = j;
        throw paramString;
      }
      catch (ArrayIndexOutOfBoundsException paramString)
      {
        throw new cml(paramString);
      }
      i = a.a(paramString);
      c(i);
      this.c = a.a(paramString, this.a, this.c, this.b - this.c);
    }
  }
  
  public static int b(int paramInt)
  {
    return d(den.a(paramInt, 0));
  }
  
  public static int b(int paramInt1, int paramInt2)
  {
    return b(paramInt1) + 4;
  }
  
  public static int b(int paramInt, long paramLong)
  {
    return b(4) + b(paramLong);
  }
  
  public static int b(int paramInt, dea paramdea)
  {
    int i = b(paramInt);
    paramInt = paramdea.a();
    return i + (paramInt + d(paramInt));
  }
  
  public static int b(int paramInt, String paramString)
  {
    return b(paramInt) + b(paramString);
  }
  
  private static int b(long paramLong)
  {
    int i;
    if ((0xFFFFFFFFFFFFFF80 & paramLong) == 0L) {
      i = 1;
    }
    for (;;)
    {
      return i;
      if ((0xFFFFFFFFFFFFC000 & paramLong) == 0L) {
        i = 2;
      } else if ((0xFFFFFFFFFFE00000 & paramLong) == 0L) {
        i = 3;
      } else if ((0xFFFFFFFFF0000000 & paramLong) == 0L) {
        i = 4;
      } else if ((0xFFFFFFF800000000 & paramLong) == 0L) {
        i = 5;
      } else if ((0xFFFFFC0000000000 & paramLong) == 0L) {
        i = 6;
      } else if ((0xFFFE000000000000 & paramLong) == 0L) {
        i = 7;
      } else if ((0xFF00000000000000 & paramLong) == 0L) {
        i = 8;
      } else if ((0x8000000000000000 & paramLong) == 0L) {
        i = 9;
      } else {
        i = 10;
      }
    }
  }
  
  private static int b(String paramString)
  {
    try
    {
      i = a.a(paramString);
      return i + d(i);
    }
    catch (dem localdem)
    {
      for (;;)
      {
        int i = paramString.getBytes(ddv.a).length;
      }
    }
  }
  
  public static int c(int paramInt1, int paramInt2)
  {
    int i = b(paramInt1);
    if (paramInt2 >= 0) {}
    for (paramInt1 = d(paramInt2);; paramInt1 = 10) {
      return paramInt1 + i;
    }
  }
  
  public static int c(int paramInt, long paramLong)
  {
    return b(paramInt) + 8;
  }
  
  private static int d(int paramInt)
  {
    if ((paramInt & 0xFFFFFF80) == 0) {
      paramInt = 1;
    }
    for (;;)
    {
      return paramInt;
      if ((paramInt & 0xC000) == 0) {
        paramInt = 2;
      } else if ((0xFFE00000 & paramInt) == 0) {
        paramInt = 3;
      } else if ((0xF0000000 & paramInt) == 0) {
        paramInt = 4;
      } else {
        paramInt = 5;
      }
    }
  }
  
  public final void a()
  {
    if (this.b - this.c != 0) {
      throw new IllegalStateException("Did not write as much data as expected.");
    }
  }
  
  public final void a(int paramInt)
  {
    int i = (byte)paramInt;
    if (this.c == this.b) {
      throw new cml();
    }
    byte[] arrayOfByte = this.a;
    paramInt = this.c;
    this.c = (paramInt + 1);
    arrayOfByte[paramInt] = i;
    this.d += 1;
  }
  
  public final void a(int paramInt1, int paramInt2)
  {
    d(paramInt1, 0);
    if (paramInt2 >= 0) {
      c(paramInt2);
    }
    for (;;)
    {
      return;
      a(paramInt2);
    }
  }
  
  public final void a(int paramInt, dea paramdea)
  {
    d(paramInt, 2);
    c(paramdea.a());
    paramdea.a(this);
  }
  
  public final void a(int paramInt, String paramString)
  {
    d(paramInt, 2);
    try
    {
      a(paramString);
      return;
    }
    catch (dem localdem)
    {
      for (;;)
      {
        e.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", localdem);
        paramString = paramString.getBytes(ddv.a);
        c(paramString.length);
        paramInt = paramString.length;
        if (this.b - this.c < paramInt) {
          break;
        }
        System.arraycopy(paramString, 0, this.a, this.c, paramInt);
        this.c += paramInt;
        this.d += paramInt;
      }
      paramInt = this.b - this.c;
      System.arraycopy(paramString, 0, this.a, this.c, paramInt);
      this.c = this.b;
      this.d += paramInt;
      throw new cml();
    }
  }
  
  public final void a(long paramLong)
  {
    for (;;)
    {
      if ((0xFFFFFFFFFFFFFF80 & paramLong) == 0L)
      {
        a((int)paramLong);
        return;
      }
      a((int)paramLong & 0x7F | 0x80);
      paramLong >>>= 7;
    }
  }
  
  public final void c(int paramInt)
  {
    for (;;)
    {
      if ((paramInt & 0xFFFFFF80) == 0)
      {
        a(paramInt);
        return;
      }
      a(paramInt & 0x7F | 0x80);
      paramInt >>>= 7;
    }
  }
  
  public final void d(int paramInt1, int paramInt2)
  {
    c(den.a(paramInt1, paramInt2));
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\ddo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */