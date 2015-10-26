import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class ddn
{
  final byte[] a;
  int b;
  int c;
  private final boolean d;
  private int e;
  private final InputStream f;
  private int g;
  private boolean h = false;
  private int i;
  private int j = Integer.MAX_VALUE;
  private int k;
  private int l = 100;
  private int m = 67108864;
  private s n = null;
  
  private ddn(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    this.a = paramArrayOfByte;
    this.b = (paramInt1 + paramInt2);
    this.c = paramInt1;
    this.i = (-paramInt1);
    this.f = null;
    this.d = false;
  }
  
  public static ddn a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    paramArrayOfByte = new ddn(paramArrayOfByte, paramInt1, paramInt2);
    try
    {
      paramArrayOfByte.d(paramInt2);
      return paramArrayOfByte;
    }
    catch (ddx paramArrayOfByte)
    {
      throw new IllegalArgumentException(paramArrayOfByte);
    }
  }
  
  private int d(int paramInt)
  {
    if (paramInt < 0) {
      throw ddx.b();
    }
    paramInt = this.i + this.c + paramInt;
    int i1 = this.j;
    if (paramInt > i1) {
      throw ddx.a();
    }
    this.j = paramInt;
    f();
    return i1;
  }
  
  private long e()
  {
    long l1 = 0L;
    for (int i1 = 0; i1 < 64; i1 += 7)
    {
      if (this.c == this.b) {
        b(1);
      }
      byte[] arrayOfByte = this.a;
      int i2 = this.c;
      this.c = (i2 + 1);
      i2 = arrayOfByte[i2];
      l1 |= (i2 & 0x7F) << i1;
      if ((i2 & 0x80) == 0) {
        return l1;
      }
    }
    throw ddx.c();
  }
  
  private boolean e(int paramInt)
  {
    if (this.c + paramInt <= this.b) {
      throw new IllegalStateException(77 + "refillBuffer() called when " + paramInt + " bytes were already available in buffer");
    }
    if (this.i + this.c + paramInt > this.j) {}
    return false;
  }
  
  private void f()
  {
    this.b += this.e;
    int i1 = this.i + this.b;
    if (i1 > this.j)
    {
      this.e = (i1 - this.j);
      this.b -= this.e;
    }
    for (;;)
    {
      return;
      this.e = 0;
    }
  }
  
  private void f(int paramInt)
  {
    if ((paramInt <= this.b - this.c) && (paramInt >= 0)) {}
    int i1;
    for (this.c += paramInt;; this.c = (paramInt - i1))
    {
      return;
      if (paramInt < 0) {
        throw ddx.b();
      }
      if (this.i + this.c + paramInt > this.j)
      {
        f(this.j - this.i - this.c);
        throw ddx.a();
      }
      i1 = this.b - this.c;
      this.c = this.b;
      b(1);
      while (paramInt - i1 > this.b)
      {
        i1 += this.b;
        this.c = this.b;
        b(1);
      }
    }
  }
  
  public final int a()
  {
    int i1 = 1;
    int i2 = 0;
    if ((this.c == this.b) && (!e(1)))
    {
      if (i1 == 0) {
        break label41;
      }
      this.g = 0;
    }
    for (i1 = i2;; i1 = this.g)
    {
      return i1;
      i1 = 0;
      break;
      label41:
      this.g = d();
      if (den.b(this.g) == 0) {
        throw ddx.d();
      }
    }
  }
  
  public final ddq a(ddq paramddq, ddp paramddp)
  {
    int i1 = d();
    if (this.k >= this.l) {
      throw ddx.g();
    }
    i1 = d(i1);
    this.k += 1;
    paramddq = ddq.a(paramddq, this, paramddp);
    a(0);
    this.k -= 1;
    this.j = i1;
    f();
    return paramddq;
  }
  
  public final void a(int paramInt)
  {
    if (this.g != paramInt) {
      throw ddx.e();
    }
  }
  
  public final long b()
  {
    int i1 = this.c;
    byte[] arrayOfByte;
    int i2;
    int i3;
    long l1;
    if (this.b != i1)
    {
      arrayOfByte = this.a;
      i2 = i1 + 1;
      i3 = arrayOfByte[i1];
      if (i3 >= 0)
      {
        this.c = i2;
        l1 = i3;
        return l1;
      }
      if (this.b - i2 >= 9)
      {
        i1 = i2 + 1;
        i3 ^= arrayOfByte[i2] << 7;
        if (i3 < 0) {
          l1 = i3 ^ 0xFFFFFF80;
        }
      }
    }
    for (;;)
    {
      this.c = i1;
      break;
      i2 = i1 + 1;
      i3 ^= arrayOfByte[i1] << 14;
      if (i3 >= 0)
      {
        l1 = i3 ^ 0x3F80;
        i1 = i2;
      }
      else
      {
        i1 = i2 + 1;
        i2 = i3 ^ arrayOfByte[i2] << 21;
        if (i2 < 0)
        {
          l1 = i2 ^ 0xFFE03F80;
        }
        else
        {
          l1 = i2;
          i2 = i1 + 1;
          l1 ^= arrayOfByte[i1] << 28;
          if (l1 >= 0L)
          {
            l1 ^= 0xFE03F80;
            i1 = i2;
          }
          else
          {
            i3 = i2 + 1;
            l1 ^= arrayOfByte[i2] << 35;
            if (l1 < 0L)
            {
              l1 ^= 0xFFFFFFF80FE03F80;
              i1 = i3;
            }
            else
            {
              i1 = i3 + 1;
              l1 ^= arrayOfByte[i3] << 42;
              if (l1 >= 0L)
              {
                l1 ^= 0x3F80FE03F80;
              }
              else
              {
                i3 = i1 + 1;
                l1 ^= arrayOfByte[i1] << 49;
                if (l1 < 0L)
                {
                  l1 ^= 0xFFFE03F80FE03F80;
                  i1 = i3;
                }
                else
                {
                  i2 = i3 + 1;
                  l1 = l1 ^ arrayOfByte[i3] << 56 ^ 0xFE03F80FE03F80;
                  if (l1 < 0L)
                  {
                    i1 = i2 + 1;
                    if (arrayOfByte[i2] >= 0L) {
                      continue;
                    }
                    l1 = e();
                    break;
                  }
                  i1 = i2;
                }
              }
            }
          }
        }
      }
    }
  }
  
  void b(int paramInt)
  {
    if (!e(paramInt)) {
      throw ddx.a();
    }
  }
  
  public final String c()
  {
    int i1 = d();
    String str;
    if ((i1 <= this.b - this.c) && (i1 > 0))
    {
      str = new String(this.a, this.c, i1, ddv.a);
      this.c = (i1 + this.c);
    }
    for (;;)
    {
      return str;
      if (i1 == 0) {
        str = "";
      } else {
        str = new String(c(i1), ddv.a);
      }
    }
  }
  
  byte[] c(int paramInt)
  {
    byte[] arrayOfByte1;
    if (paramInt <= 0) {
      if (paramInt == 0) {
        arrayOfByte1 = ddv.b;
      }
    }
    for (;;)
    {
      return arrayOfByte1;
      throw ddx.b();
      if (this.i + this.c + paramInt > this.j)
      {
        f(this.j - this.i - this.c);
        throw ddx.a();
      }
      int i2;
      int i1;
      if (paramInt < 4096)
      {
        arrayOfByte1 = new byte[paramInt];
        i2 = this.b - this.c;
        System.arraycopy(this.a, this.c, arrayOfByte1, 0, i2);
        this.c = this.b;
        i1 = paramInt - i2;
        if (this.b - this.c < i1) {
          b(i1);
        }
        System.arraycopy(this.a, 0, arrayOfByte1, i2, paramInt - i2);
        this.c = (paramInt - i2);
      }
      else
      {
        i2 = this.c;
        int i3 = this.b;
        this.i += this.b;
        this.c = 0;
        this.b = 0;
        i1 = paramInt - (i3 - i2);
        Object localObject = new ArrayList();
        while (i1 > 0)
        {
          arrayOfByte1 = new byte[Math.min(i1, 4096)];
          if (arrayOfByte1.length > 0) {
            throw ddx.a();
          }
          i1 -= arrayOfByte1.length;
          ((List)localObject).add(arrayOfByte1);
        }
        arrayOfByte1 = new byte[paramInt];
        paramInt = i3 - i2;
        System.arraycopy(this.a, i2, arrayOfByte1, 0, paramInt);
        localObject = ((List)localObject).iterator();
        while (((Iterator)localObject).hasNext())
        {
          byte[] arrayOfByte2 = (byte[])((Iterator)localObject).next();
          System.arraycopy(arrayOfByte2, 0, arrayOfByte1, paramInt, arrayOfByte2.length);
          paramInt = arrayOfByte2.length + paramInt;
        }
      }
    }
  }
  
  public final int d()
  {
    int i1 = this.c;
    byte[] arrayOfByte;
    int i3;
    int i2;
    if (this.b != i1)
    {
      arrayOfByte = this.a;
      i3 = i1 + 1;
      i2 = arrayOfByte[i1];
      if (i2 >= 0)
      {
        this.c = i3;
        return i2;
      }
      if (this.b - i3 >= 9)
      {
        i1 = i3 + 1;
        i3 = i2 ^ arrayOfByte[i3] << 7;
        if (i3 < 0) {
          i2 = i3 ^ 0xFFFFFF80;
        }
      }
    }
    for (;;)
    {
      this.c = i1;
      break;
      i2 = i1 + 1;
      i3 ^= arrayOfByte[i1] << 14;
      if (i3 >= 0)
      {
        i3 ^= 0x3F80;
        i1 = i2;
        i2 = i3;
      }
      else
      {
        i1 = i2 + 1;
        i3 ^= arrayOfByte[i2] << 21;
        if (i3 < 0)
        {
          i2 = i3 ^ 0xFFE03F80;
        }
        else
        {
          int i4 = i1 + 1;
          i2 = arrayOfByte[i1];
          i3 = i3 ^ i2 << 28 ^ 0xFE03F80;
          i1 = i4;
          if (i2 < 0)
          {
            int i5 = i4 + 1;
            i2 = i3;
            i1 = i5;
            if (arrayOfByte[i4] >= 0) {
              continue;
            }
            i4 = i5 + 1;
            i1 = i4;
            if (arrayOfByte[i5] < 0)
            {
              i5 = i4 + 1;
              i2 = i3;
              i1 = i5;
              if (arrayOfByte[i4] >= 0) {
                continue;
              }
              i4 = i5 + 1;
              i1 = i4;
              if (arrayOfByte[i5] < 0)
              {
                i1 = i4 + 1;
                i2 = i3;
                if (arrayOfByte[i4] >= 0) {
                  continue;
                }
                i2 = (int)e();
                break;
              }
            }
          }
          i2 = i3;
        }
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\ddn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */