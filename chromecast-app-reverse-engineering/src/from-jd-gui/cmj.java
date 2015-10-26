public final class cmj
{
  final byte[] a;
  int b;
  int c;
  int d = 64;
  private int e;
  private int f;
  private int g;
  private int h;
  private int i = Integer.MAX_VALUE;
  
  private cmj(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    this.a = paramArrayOfByte;
    this.b = paramInt1;
    this.e = (paramInt1 + paramInt2);
    this.g = paramInt1;
  }
  
  public static cmj a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    return new cmj(paramArrayOfByte, paramInt1, paramInt2);
  }
  
  private byte[] f(int paramInt)
  {
    if (paramInt < 0) {
      throw cmr.b();
    }
    if (this.g + paramInt > this.i)
    {
      g(this.i - this.g);
      throw cmr.a();
    }
    if (paramInt <= this.e - this.g)
    {
      byte[] arrayOfByte = new byte[paramInt];
      System.arraycopy(this.a, this.g, arrayOfByte, 0, paramInt);
      this.g += paramInt;
      return arrayOfByte;
    }
    throw cmr.a();
  }
  
  private void g(int paramInt)
  {
    if (paramInt < 0) {
      throw cmr.b();
    }
    if (this.g + paramInt > this.i)
    {
      g(this.i - this.g);
      throw cmr.a();
    }
    if (paramInt <= this.e - this.g)
    {
      this.g += paramInt;
      return;
    }
    throw cmr.a();
  }
  
  private void j()
  {
    this.e += this.f;
    int j = this.e;
    if (j > this.i)
    {
      this.f = (j - this.i);
      this.e -= this.f;
    }
    for (;;)
    {
      return;
      this.f = 0;
    }
  }
  
  private byte k()
  {
    if (this.g == this.e) {
      throw cmr.a();
    }
    byte[] arrayOfByte = this.a;
    int j = this.g;
    this.g = (j + 1);
    return arrayOfByte[j];
  }
  
  public final int a()
  {
    int k = 0;
    if (this.g == this.e)
    {
      j = 1;
      if (j == 0) {
        break label33;
      }
      this.h = 0;
    }
    for (int j = k;; j = this.h)
    {
      return j;
      j = 0;
      break;
      label33:
      this.h = e();
      if (this.h == 0) {
        throw cmr.d();
      }
    }
  }
  
  public final void a(int paramInt)
  {
    if (this.h != paramInt) {
      throw cmr.e();
    }
  }
  
  public final void a(cms paramcms)
  {
    int j = e();
    if (this.c >= this.d) {
      throw cmr.g();
    }
    j = c(j);
    this.c += 1;
    paramcms.a(this);
    a(0);
    this.c -= 1;
    d(j);
  }
  
  public final boolean b()
  {
    if (e() != 0) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public final boolean b(int paramInt)
  {
    boolean bool;
    switch (cmu.a(paramInt))
    {
    default: 
      throw cmr.f();
    case 0: 
      e();
      bool = true;
    }
    for (;;)
    {
      return bool;
      int m = k();
      int i1 = k();
      int i2 = k();
      int j = k();
      int k = k();
      int i3 = k();
      paramInt = k();
      int n = k();
      long l = m;
      l = i1;
      l = i2;
      l = j;
      l = k;
      l = i3;
      l = paramInt;
      l = n;
      bool = true;
      continue;
      g(e());
      bool = true;
      continue;
      do
      {
        j = a();
      } while ((j != 0) && (b(j)));
      a(cmu.a(cmu.b(paramInt), 4));
      bool = true;
      continue;
      bool = false;
      continue;
      g();
      bool = true;
    }
  }
  
  public final int c(int paramInt)
  {
    if (paramInt < 0) {
      throw cmr.b();
    }
    int j = this.g + paramInt;
    paramInt = this.i;
    if (j > paramInt) {
      throw cmr.a();
    }
    this.i = j;
    j();
    return paramInt;
  }
  
  public final String c()
  {
    int j = e();
    String str;
    if ((j <= this.e - this.g) && (j > 0))
    {
      str = new String(this.a, this.g, j, "UTF-8");
      this.g = (j + this.g);
    }
    for (;;)
    {
      return str;
      str = new String(f(j), "UTF-8");
    }
  }
  
  public final void d(int paramInt)
  {
    this.i = paramInt;
    j();
  }
  
  public final byte[] d()
  {
    int j = e();
    byte[] arrayOfByte;
    if ((j <= this.e - this.g) && (j > 0))
    {
      arrayOfByte = new byte[j];
      System.arraycopy(this.a, this.g, arrayOfByte, 0, j);
      this.g = (j + this.g);
    }
    for (;;)
    {
      return arrayOfByte;
      arrayOfByte = f(j);
    }
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
        k = j & 0x7F;
        j = k();
        if (j >= 0)
        {
          j = k | j << 7;
        }
        else
        {
          j = k | (j & 0x7F) << 7;
          k = k();
          if (k >= 0)
          {
            j |= k << 14;
          }
          else
          {
            j |= (k & 0x7F) << 14;
            m = k();
            if (m < 0) {
              break;
            }
            j |= m << 21;
          }
        }
      }
      k = k();
      m = j | (m & 0x7F) << 21 | k << 28;
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
    throw cmr.c();
  }
  
  public final void e(int paramInt)
  {
    if (paramInt > this.g - this.b) {
      throw new IllegalArgumentException("Position " + paramInt + " is beyond current " + (this.g - this.b));
    }
    if (paramInt < 0) {
      throw new IllegalArgumentException("Bad position " + paramInt);
    }
    this.g = (this.b + paramInt);
  }
  
  public final long f()
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
    throw cmr.c();
  }
  
  public final int g()
  {
    return k() & 0xFF | (k() & 0xFF) << 8 | (k() & 0xFF) << 16 | (k() & 0xFF) << 24;
  }
  
  public final int h()
  {
    if (this.i == Integer.MAX_VALUE) {}
    for (int j = -1;; j = this.i - j)
    {
      return j;
      j = this.g;
    }
  }
  
  public final int i()
  {
    return this.g - this.b;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cmj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */