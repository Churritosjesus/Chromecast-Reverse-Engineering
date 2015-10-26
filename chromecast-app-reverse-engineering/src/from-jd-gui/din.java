import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

final class din
  implements did
{
  private final dkc a;
  private final boolean b;
  private final djz c;
  private final dii d;
  private int e;
  private boolean f;
  
  din(dkc paramdkc, boolean paramBoolean)
  {
    this.a = paramdkc;
    this.b = paramBoolean;
    this.c = new djz();
    this.d = new dii(this.c);
    this.e = 16384;
  }
  
  private void a(int paramInt1, int paramInt2, byte paramByte1, byte paramByte2)
  {
    if (dij.b().isLoggable(Level.FINE)) {
      dij.b().fine(dil.a(false, paramInt1, paramInt2, paramByte1, paramByte2));
    }
    if (paramInt2 > this.e) {
      throw dij.b("FRAME_SIZE_ERROR length > %d: %d", new Object[] { Integer.valueOf(this.e), Integer.valueOf(paramInt2) });
    }
    if ((0x80000000 & paramInt1) != 0) {
      throw dij.b("reserved bit set: %s", new Object[] { Integer.valueOf(paramInt1) });
    }
    dij.a(this.a, paramInt2);
    this.a.h(paramByte1 & 0xFF);
    this.a.h(paramByte2 & 0xFF);
    this.a.f(0x7FFFFFFF & paramInt1);
  }
  
  private void b(int paramInt, long paramLong)
  {
    if (paramLong > 0L)
    {
      int i = (int)Math.min(this.e, paramLong);
      paramLong -= i;
      if (paramLong == 0L) {}
      for (byte b1 = 4;; b1 = 0)
      {
        a(paramInt, i, (byte)9, b1);
        this.a.a_(this.c, i);
        break;
      }
    }
  }
  
  public final void a()
  {
    try
    {
      if (this.f)
      {
        IOException localIOException = new java/io/IOException;
        localIOException.<init>("closed");
        throw localIOException;
      }
    }
    finally {}
    boolean bool = this.b;
    if (!bool) {}
    for (;;)
    {
      return;
      if (dij.b().isLoggable(Level.FINE)) {
        dij.b().fine(String.format(">> CONNECTION %s", new Object[] { dij.a().b() }));
      }
      this.a.b(dij.a().d());
      this.a.flush();
    }
  }
  
  public final void a(int paramInt, long paramLong)
  {
    try
    {
      if (this.f)
      {
        IOException localIOException = new java/io/IOException;
        localIOException.<init>("closed");
        throw localIOException;
      }
    }
    finally {}
    if ((paramLong == 0L) || (paramLong > 2147483647L)) {
      throw dij.b("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", new Object[] { Long.valueOf(paramLong) });
    }
    a(paramInt, 4, (byte)8, (byte)0);
    this.a.f((int)paramLong);
    this.a.flush();
  }
  
  public final void a(int paramInt, dia paramdia)
  {
    try
    {
      if (this.f)
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
    a(paramInt, 4, (byte)3, (byte)0);
    this.a.f(paramdia.i);
    this.a.flush();
  }
  
  public final void a(int paramInt, dia paramdia, byte[] paramArrayOfByte)
  {
    try
    {
      if (this.f)
      {
        paramdia = new java/io/IOException;
        paramdia.<init>("closed");
        throw paramdia;
      }
    }
    finally {}
    if (paramdia.i == -1) {
      throw dij.b("errorCode.httpCode == -1", new Object[0]);
    }
    a(0, paramArrayOfByte.length + 8, (byte)7, (byte)0);
    this.a.f(paramInt);
    this.a.f(paramdia.i);
    if (paramArrayOfByte.length > 0) {
      this.a.b(paramArrayOfByte);
    }
    this.a.flush();
  }
  
  public final void a(dix paramdix)
  {
    try
    {
      if (this.f)
      {
        paramdix = new java/io/IOException;
        paramdix.<init>("closed");
        throw paramdix;
      }
    }
    finally {}
    int i = this.e;
    if ((paramdix.a & 0x20) != 0) {
      i = paramdix.d[5];
    }
    this.e = i;
    a(0, 0, (byte)4, (byte)1);
    this.a.flush();
  }
  
  public final void a(boolean paramBoolean, int paramInt1, int paramInt2)
  {
    byte b1 = 0;
    try
    {
      if (this.f)
      {
        IOException localIOException = new java/io/IOException;
        localIOException.<init>("closed");
        throw localIOException;
      }
    }
    finally {}
    if (paramBoolean) {
      b1 = 1;
    }
    a(0, 8, (byte)6, b1);
    this.a.f(paramInt1);
    this.a.f(paramInt2);
    this.a.flush();
  }
  
  public final void a(boolean paramBoolean, int paramInt1, djz paramdjz, int paramInt2)
  {
    byte b1 = 0;
    try
    {
      if (this.f)
      {
        paramdjz = new java/io/IOException;
        paramdjz.<init>("closed");
        throw paramdjz;
      }
    }
    finally {}
    if (paramBoolean) {
      b1 = 1;
    }
    a(paramInt1, paramInt2, (byte)0, b1);
    if (paramInt2 > 0) {
      this.a.a_(paramdjz, paramInt2);
    }
  }
  
  public final void a(boolean paramBoolean1, boolean paramBoolean2, int paramInt1, int paramInt2, List paramList)
  {
    if (paramBoolean2) {
      try
      {
        paramList = new java/lang/UnsupportedOperationException;
        paramList.<init>();
        throw paramList;
      }
      finally {}
    }
    if (this.f)
    {
      paramList = new java/io/IOException;
      paramList.<init>("closed");
      throw paramList;
    }
    if (this.f)
    {
      paramList = new java/io/IOException;
      paramList.<init>("closed");
      throw paramList;
    }
    if (this.c.b != 0L)
    {
      paramList = new java/lang/IllegalStateException;
      paramList.<init>();
      throw paramList;
    }
    this.d.a(paramList);
    long l = this.c.b;
    paramInt2 = (int)Math.min(this.e, l);
    if (l == paramInt2) {}
    for (byte b1 = 4;; b1 = 0)
    {
      byte b2 = b1;
      if (paramBoolean1) {
        b2 = (byte)(b1 | 0x1);
      }
      a(paramInt1, paramInt2, (byte)1, b2);
      this.a.a_(this.c, paramInt2);
      if (l > paramInt2) {
        b(paramInt1, l - paramInt2);
      }
      return;
    }
  }
  
  public final void b()
  {
    try
    {
      if (this.f)
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
    int i = 0;
    try
    {
      if (this.f)
      {
        paramdix = new java/io/IOException;
        paramdix.<init>("closed");
        throw paramdix;
      }
    }
    finally {}
    a(0, Integer.bitCount(paramdix.a) * 6, (byte)4, (byte)0);
    int j;
    if (i < 10) {
      if (paramdix.a(i))
      {
        if (i != 4) {
          break label99;
        }
        j = 3;
      }
    }
    for (;;)
    {
      this.a.g(j);
      this.a.f(paramdix.d[i]);
      i++;
      break;
      label99:
      if (i == 7)
      {
        j = 4;
        continue;
        this.a.flush();
      }
      else
      {
        j = i;
      }
    }
  }
  
  public final int c()
  {
    return this.e;
  }
  
  public final void close()
  {
    try
    {
      this.f = true;
      this.a.close();
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\din.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */