public final class deo
{
  final byte[] a;
  int b;
  private int c;
  private int d;
  private int e;
  private int f;
  private int g = Integer.MAX_VALUE;
  private int h;
  private int i = 64;
  
  deo(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    this.a = paramArrayOfByte;
    this.b = paramInt1;
    this.c = (paramInt1 + paramInt2);
    this.e = paramInt1;
  }
  
  private void f(int paramInt)
  {
    if (paramInt < 0) {
      throw dev.b();
    }
    if (this.e + paramInt > this.g)
    {
      f(this.g - this.e);
      throw dev.a();
    }
    if (paramInt <= this.c - this.e)
    {
      this.e += paramInt;
      return;
    }
    throw dev.a();
  }
  
  private void j()
  {
    this.c += this.d;
    int j = this.c;
    if (j > this.g)
    {
      this.d = (j - this.g);
      this.c -= this.d;
    }
    for (;;)
    {
      return;
      this.d = 0;
    }
  }
  
  private byte k()
  {
    if (this.e == this.c) {
      throw dev.a();
    }
    byte[] arrayOfByte = this.a;
    int j = this.e;
    this.e = (j + 1);
    return arrayOfByte[j];
  }
  
  public final int a()
  {
    int k = 0;
    if (this.e == this.c)
    {
      j = 1;
      if (j == 0) {
        break label33;
      }
      this.f = 0;
    }
    for (int j = k;; j = this.f)
    {
      return j;
      j = 0;
      break;
      label33:
      this.f = e();
      if (this.f == 0) {
        throw dev.d();
      }
    }
  }
  
  public final void a(int paramInt)
  {
    if (this.f != paramInt) {
      throw dev.e();
    }
  }
  
  public final void a(dew paramdew)
  {
    int j = e();
    if (this.h >= this.i) {
      throw dev.g();
    }
    j = c(j);
    this.h += 1;
    paramdew.a(this);
    a(0);
    this.h -= 1;
    d(j);
  }
  
  public final long b()
  {
    int j = 0;
    long l = 0L;
    while (j < 64)
    {
      int k = k();
      l |= (k & 0x7F) << j;
      if ((k & 0x80) == 0) {
        return l;
      }
      j += 7;
    }
    throw dev.c();
  }
  
  public final boolean b(int paramInt)
  {
    boolean bool = true;
    switch (dey.a(paramInt))
    {
    default: 
      throw dev.f();
    case 0: 
      e();
    }
    for (;;)
    {
      return bool;
      g();
      continue;
      f(e());
      continue;
      int j;
      do
      {
        j = a();
      } while ((j != 0) && (b(j)));
      a(dey.a(dey.b(paramInt), 4));
      continue;
      bool = false;
      continue;
      f();
    }
  }
  
  public final int c(int paramInt)
  {
    if (paramInt < 0) {
      throw dev.b();
    }
    int j = this.e + paramInt;
    paramInt = this.g;
    if (j > paramInt) {
      throw dev.a();
    }
    this.g = j;
    j();
    return paramInt;
  }
  
  public final boolean c()
  {
    if (e() != 0) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public final String d()
  {
    int j = e();
    Object localObject;
    if ((j <= this.c - this.e) && (j > 0))
    {
      localObject = new String(this.a, this.e, j, "UTF-8");
      this.e = (j + this.e);
    }
    for (;;)
    {
      return (String)localObject;
      if (j < 0) {
        throw dev.b();
      }
      if (this.e + j > this.g)
      {
        f(this.g - this.e);
        throw dev.a();
      }
      if (j > this.c - this.e) {
        break;
      }
      localObject = new byte[j];
      System.arraycopy(this.a, this.e, localObject, 0, j);
      this.e = (j + this.e);
      localObject = new String((byte[])localObject, "UTF-8");
    }
    throw dev.a();
  }
  
  public final void d(int paramInt)
  {
    this.g = paramInt;
    j();
  }
  
  public final int e()
  {
    int j = k();
    if (j >= 0) {}
    int m;
    do
    {
      for (;;)
      {
        return j;
        j &= 0x7F;
        k = k();
        if (k >= 0)
        {
          j |= k << 7;
        }
        else
        {
          j |= (k & 0x7F) << 7;
          k = k();
          if (k >= 0)
          {
            j |= k << 14;
          }
          else
          {
            m = j | (k & 0x7F) << 14;
            j = k();
            if (j < 0) {
              break;
            }
            j = m | j << 21;
          }
        }
      }
      k = k();
      m = m | (j & 0x7F) << 21 | k << 28;
      j = m;
    } while (k >= 0);
    for (int k = 0;; k++)
    {
      if (k >= 5) {
        break label141;
      }
      j = m;
      if (k() >= 0) {
        break;
      }
    }
    label141:
    throw dev.c();
  }
  
  public final void e(int paramInt)
  {
    if (paramInt > this.e - this.b)
    {
      int k = this.e;
      int j = this.b;
      throw new IllegalArgumentException(50 + "Position " + paramInt + " is beyond current " + (k - j));
    }
    if (paramInt < 0) {
      throw new IllegalArgumentException(24 + "Bad position " + paramInt);
    }
    this.e = (this.b + paramInt);
  }
  
  public final int f()
  {
    return k() & 0xFF | (k() & 0xFF) << 8 | (k() & 0xFF) << 16 | (k() & 0xFF) << 24;
  }
  
  public final long g()
  {
    int k = k();
    int n = k();
    int i3 = k();
    int i4 = k();
    int j = k();
    int i1 = k();
    int m = k();
    int i2 = k();
    long l = k;
    return (n & 0xFF) << 8 | l & 0xFF | (i3 & 0xFF) << 16 | (i4 & 0xFF) << 24 | (j & 0xFF) << 32 | (i1 & 0xFF) << 40 | (m & 0xFF) << 48 | (i2 & 0xFF) << 56;
  }
  
  public final int h()
  {
    if (this.g == Integer.MAX_VALUE) {}
    for (int j = -1;; j = this.g - j)
    {
      return j;
      j = this.e;
    }
  }
  
  public final int i()
  {
    return this.e - this.b;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\deo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */