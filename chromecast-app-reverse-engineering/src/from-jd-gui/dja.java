import java.io.IOException;
import java.util.List;
import java.util.zip.Deflater;

final class dja
  implements did
{
  private final dkc a;
  private final djz b;
  private final dkc c;
  private final boolean d;
  private boolean e;
  
  dja(dkc paramdkc, boolean paramBoolean)
  {
    this.a = paramdkc;
    this.d = paramBoolean;
    paramdkc = new Deflater();
    paramdkc.setDictionary(diy.a);
    this.b = new djz();
    this.c = dkk.a(new dkf(this.b, paramdkc));
  }
  
  private void a(List paramList)
  {
    if (this.b.b != 0L) {
      throw new IllegalStateException();
    }
    this.c.f(paramList.size());
    int j = paramList.size();
    for (int i = 0; i < j; i++)
    {
      dke localdke = ((die)paramList.get(i)).h;
      this.c.f(localdke.b.length);
      this.c.b(localdke);
      localdke = ((die)paramList.get(i)).i;
      this.c.f(localdke.b.length);
      this.c.b(localdke);
    }
    this.c.flush();
  }
  
  public final void a() {}
  
  public final void a(int paramInt, long paramLong)
  {
    try
    {
      if (this.e)
      {
        IOException localIOException = new java/io/IOException;
        localIOException.<init>("closed");
        throw localIOException;
      }
    }
    finally {}
    if ((paramLong == 0L) || (paramLong > 2147483647L))
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>("windowSizeIncrement must be between 1 and 0x7fffffff: ");
      localIllegalArgumentException.<init>(paramLong);
      throw localIllegalArgumentException;
    }
    this.a.f(-2147287031);
    this.a.f(8);
    this.a.f(paramInt);
    this.a.f((int)paramLong);
    this.a.flush();
  }
  
  public final void a(int paramInt, dia paramdia)
  {
    try
    {
      if (this.e)
      {
        paramdia = new java/io/IOException;
        paramdia.<init>("closed");
        throw paramdia;
      }
    }
    finally {}
    if (paramdia.j == -1)
    {
      paramdia = new java/lang/IllegalArgumentException;
      paramdia.<init>();
      throw paramdia;
    }
    this.a.f(-2147287037);
    this.a.f(8);
    this.a.f(0x7FFFFFFF & paramInt);
    this.a.f(paramdia.j);
    this.a.flush();
  }
  
  public final void a(int paramInt, dia paramdia, byte[] paramArrayOfByte)
  {
    try
    {
      if (this.e)
      {
        paramdia = new java/io/IOException;
        paramdia.<init>("closed");
        throw paramdia;
      }
    }
    finally {}
    if (paramdia.k == -1)
    {
      paramdia = new java/lang/IllegalArgumentException;
      paramdia.<init>("errorCode.spdyGoAwayCode == -1");
      throw paramdia;
    }
    this.a.f(-2147287033);
    this.a.f(8);
    this.a.f(paramInt);
    this.a.f(paramdia.k);
    this.a.flush();
  }
  
  public final void a(dix paramdix) {}
  
  public final void a(boolean paramBoolean, int paramInt1, int paramInt2)
  {
    boolean bool2 = true;
    try
    {
      if (this.e)
      {
        IOException localIOException = new java/io/IOException;
        localIOException.<init>("closed");
        throw localIOException;
      }
    }
    finally {}
    boolean bool3 = this.d;
    if ((paramInt1 & 0x1) == 1)
    {
      bool1 = true;
      if (bool3 == bool1) {
        break label88;
      }
    }
    label88:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      if (paramBoolean == bool1) {
        break label94;
      }
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("payload != reply");
      throw localIllegalArgumentException;
      bool1 = false;
      break;
    }
    label94:
    this.a.f(-2147287034);
    this.a.f(4);
    this.a.f(paramInt1);
    this.a.flush();
  }
  
  public final void a(boolean paramBoolean, int paramInt1, djz paramdjz, int paramInt2)
  {
    if (paramBoolean) {}
    for (int i = 1;; i = 0) {
      try
      {
        if (!this.e) {
          break;
        }
        paramdjz = new java/io/IOException;
        paramdjz.<init>("closed");
        throw paramdjz;
      }
      finally {}
    }
    if (paramInt2 > 16777215L)
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      paramdjz = new java/lang/StringBuilder;
      paramdjz.<init>("FRAME_TOO_LARGE max size is 16Mib: ");
      localIllegalArgumentException.<init>(paramInt2);
      throw localIllegalArgumentException;
    }
    this.a.f(0x7FFFFFFF & paramInt1);
    this.a.f((i & 0xFF) << 24 | 0xFFFFFF & paramInt2);
    if (paramInt2 > 0) {
      this.a.a_(paramdjz, paramInt2);
    }
  }
  
  public final void a(boolean paramBoolean1, boolean paramBoolean2, int paramInt1, int paramInt2, List paramList)
  {
    int j = 0;
    try
    {
      if (this.e)
      {
        paramList = new java/io/IOException;
        paramList.<init>("closed");
        throw paramList;
      }
    }
    finally {}
    a(paramList);
    int k = (int)(10L + this.b.b);
    if (paramBoolean1) {}
    for (int i = 1;; i = 0)
    {
      if (paramBoolean2) {
        j = 2;
      }
      this.a.f(-2147287039);
      this.a.f(((j | i) & 0xFF) << 24 | k & 0xFFFFFF);
      this.a.f(paramInt1 & 0x7FFFFFFF);
      this.a.f(paramInt2 & 0x7FFFFFFF);
      this.a.g(0);
      this.a.a(this.b);
      this.a.flush();
      return;
    }
  }
  
  public final void b()
  {
    try
    {
      if (this.e)
      {
        IOException localIOException = new java/io/IOException;
        localIOException.<init>("closed");
        throw localIOException;
      }
    }
    finally {}
    this.a.flush();
  }
  
  public final void b(dix paramdix)
  {
    try
    {
      if (this.e)
      {
        paramdix = new java/io/IOException;
        paramdix.<init>("closed");
        throw paramdix;
      }
    }
    finally {}
    int i = Integer.bitCount(paramdix.a);
    this.a.f(-2147287036);
    this.a.f((i << 3) + 4 & 0xFFFFFF | 0x0);
    this.a.f(i);
    for (i = 0; i <= 10; i++) {
      if (paramdix.a(i))
      {
        int j = paramdix.b(i);
        this.a.f((j & 0xFF) << 24 | i & 0xFFFFFF);
        this.a.f(paramdix.d[i]);
      }
    }
    this.a.flush();
  }
  
  public final int c()
  {
    return 16383;
  }
  
  public final void close()
  {
    try
    {
      this.e = true;
      dgs.a(this.a, this.c);
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dja.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */