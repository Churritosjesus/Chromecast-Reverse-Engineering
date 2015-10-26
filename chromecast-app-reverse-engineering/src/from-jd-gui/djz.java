import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public final class djz
  implements dkc, dkd, Cloneable
{
  private static final byte[] c = { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102 };
  dks a;
  public long b;
  
  private String a(long paramLong, Charset paramCharset)
  {
    dky.a(this.b, 0L, paramLong);
    if (paramCharset == null) {
      throw new IllegalArgumentException("charset == null");
    }
    if (paramLong > 2147483647L) {
      throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + paramLong);
    }
    if (paramLong == 0L) {
      paramCharset = "";
    }
    for (;;)
    {
      return paramCharset;
      dks localdks = this.a;
      if (localdks.b + paramLong > localdks.c)
      {
        paramCharset = new String(e(paramLong), paramCharset);
      }
      else
      {
        String str = new String(localdks.a, localdks.b, (int)paramLong, paramCharset);
        localdks.b = ((int)(localdks.b + paramLong));
        this.b -= paramLong;
        paramCharset = str;
        if (localdks.b == localdks.c)
        {
          this.a = localdks.a();
          dkt.a(localdks);
          paramCharset = str;
        }
      }
    }
  }
  
  private void c(byte[] paramArrayOfByte)
  {
    int i = 0;
    while (i < paramArrayOfByte.length)
    {
      int j = a(paramArrayOfByte, i, paramArrayOfByte.length - i);
      if (j == -1) {
        throw new EOFException();
      }
      i += j;
    }
  }
  
  private String i(long paramLong)
  {
    return a(paramLong, dky.a);
  }
  
  private djz s()
  {
    djz localdjz = new djz();
    if (this.b == 0L) {}
    for (;;)
    {
      return localdjz;
      localdjz.a = new dks(this.a);
      dks localdks3 = localdjz.a;
      dks localdks2 = localdjz.a;
      dks localdks1 = localdjz.a;
      localdks2.g = localdks1;
      localdks3.f = localdks1;
      for (localdks1 = this.a.f; localdks1 != this.a; localdks1 = localdks1.f) {
        localdjz.a.g.a(new dks(localdks1));
      }
      localdjz.b = this.b;
    }
  }
  
  public final int a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    dky.a(paramArrayOfByte.length, paramInt1, paramInt2);
    dks localdks = this.a;
    if (localdks == null) {
      paramInt1 = -1;
    }
    for (;;)
    {
      return paramInt1;
      paramInt2 = Math.min(paramInt2, localdks.c - localdks.b);
      System.arraycopy(localdks.a, localdks.b, paramArrayOfByte, paramInt1, paramInt2);
      localdks.b += paramInt2;
      this.b -= paramInt2;
      paramInt1 = paramInt2;
      if (localdks.b == localdks.c)
      {
        this.a = localdks.a();
        dkt.a(localdks);
        paramInt1 = paramInt2;
      }
    }
  }
  
  public final long a(byte paramByte)
  {
    return a(paramByte, 0L);
  }
  
  public final long a(byte paramByte, long paramLong)
  {
    if (paramLong < 0L) {
      throw new IllegalArgumentException("fromIndex < 0");
    }
    Object localObject1 = this.a;
    if (localObject1 == null)
    {
      paramLong = -1L;
      return paramLong;
    }
    long l1 = 0L;
    label36:
    int i = ((dks)localObject1).c - ((dks)localObject1).b;
    if (paramLong >= i) {}
    label160:
    for (paramLong -= i;; paramLong = 0L)
    {
      l1 += i;
      Object localObject2 = ((dks)localObject1).f;
      localObject1 = localObject2;
      if (localObject2 != this.a) {
        break label36;
      }
      paramLong = -1L;
      break;
      localObject2 = ((dks)localObject1).a;
      paramLong = ((dks)localObject1).b + paramLong;
      long l2 = ((dks)localObject1).c;
      for (;;)
      {
        if (paramLong >= l2) {
          break label160;
        }
        if (localObject2[((int)paramLong)] == paramByte)
        {
          paramLong = l1 + paramLong - ((dks)localObject1).b;
          break;
        }
        paramLong += 1L;
      }
    }
  }
  
  public final long a(djz paramdjz, long paramLong)
  {
    if (paramdjz == null) {
      throw new IllegalArgumentException("sink == null");
    }
    if (paramLong < 0L) {
      throw new IllegalArgumentException("byteCount < 0: " + paramLong);
    }
    long l;
    if (this.b == 0L) {
      l = -1L;
    }
    for (;;)
    {
      return l;
      l = paramLong;
      if (paramLong > this.b) {
        l = this.b;
      }
      paramdjz.a_(this, l);
    }
  }
  
  public final long a(dkv paramdkv)
  {
    if (paramdkv == null) {
      throw new IllegalArgumentException("source == null");
    }
    long l2;
    for (long l1 = 0L;; l1 += l2)
    {
      l2 = paramdkv.a(this, 2048L);
      if (l2 == -1L) {
        break;
      }
    }
    return l1;
  }
  
  public final djz a(int paramInt)
  {
    if (paramInt < 128) {
      b(paramInt);
    }
    for (;;)
    {
      return this;
      if (paramInt < 2048)
      {
        b(paramInt >> 6 | 0xC0);
        b(paramInt & 0x3F | 0x80);
      }
      else if (paramInt < 65536)
      {
        if ((paramInt >= 55296) && (paramInt <= 57343)) {
          throw new IllegalArgumentException("Unexpected code point: " + Integer.toHexString(paramInt));
        }
        b(paramInt >> 12 | 0xE0);
        b(paramInt >> 6 & 0x3F | 0x80);
        b(paramInt & 0x3F | 0x80);
      }
      else
      {
        if (paramInt > 1114111) {
          break;
        }
        b(paramInt >> 18 | 0xF0);
        b(paramInt >> 12 & 0x3F | 0x80);
        b(paramInt >> 6 & 0x3F | 0x80);
        b(paramInt & 0x3F | 0x80);
      }
    }
    throw new IllegalArgumentException("Unexpected code point: " + Integer.toHexString(paramInt));
  }
  
  public final djz a(djz paramdjz, long paramLong1, long paramLong2)
  {
    if (paramdjz == null) {
      throw new IllegalArgumentException("out == null");
    }
    dky.a(this.b, paramLong1, paramLong2);
    if (paramLong2 == 0L) {
      return this;
    }
    paramdjz.b += paramLong2;
    dks localdks2;
    long l1;
    long l2;
    for (dks localdks1 = this.a;; localdks1 = localdks1.f)
    {
      localdks2 = localdks1;
      l1 = paramLong1;
      l2 = paramLong2;
      if (paramLong1 < localdks1.c - localdks1.b) {
        break;
      }
      paramLong1 -= localdks1.c - localdks1.b;
    }
    label103:
    if (l2 > 0L)
    {
      localdks1 = new dks(localdks2);
      localdks1.b = ((int)(localdks1.b + l1));
      localdks1.c = Math.min(localdks1.b + (int)l2, localdks1.c);
      if (paramdjz.a != null) {
        break label215;
      }
      localdks1.g = localdks1;
      localdks1.f = localdks1;
      paramdjz.a = localdks1;
    }
    for (;;)
    {
      l2 -= localdks1.c - localdks1.b;
      localdks2 = localdks2.f;
      l1 = 0L;
      break label103;
      break;
      label215:
      paramdjz.a.g.a(localdks1);
    }
  }
  
  public final djz a(dke paramdke)
  {
    if (paramdke == null) {
      throw new IllegalArgumentException("byteString == null");
    }
    b(paramdke.b, 0, paramdke.b.length);
    return this;
  }
  
  public final djz a(String paramString)
  {
    return a(paramString, 0, paramString.length());
  }
  
  public final djz a(String paramString, int paramInt1, int paramInt2)
  {
    if (paramString == null) {
      throw new IllegalArgumentException("string == null");
    }
    if (paramInt1 < 0) {
      throw new IllegalAccessError("beginIndex < 0: " + paramInt1);
    }
    if (paramInt2 < paramInt1) {
      throw new IllegalArgumentException("endIndex < beginIndex: " + paramInt2 + " < " + paramInt1);
    }
    int m;
    dks localdks;
    int i;
    if (paramInt2 > paramString.length())
    {
      throw new IllegalArgumentException("endIndex > string.length: " + paramInt2 + " > " + paramString.length());
      i = paramInt1 + m - localdks.c;
      localdks.c += i;
      this.b += i;
    }
    for (;;)
    {
      if (paramInt1 >= paramInt2) {
        return this;
      }
      int j = paramString.charAt(paramInt1);
      if (j < 128)
      {
        localdks = e(1);
        byte[] arrayOfByte = localdks.a;
        m = localdks.c - paramInt1;
        int k = Math.min(paramInt2, 2048 - m);
        i = paramInt1 + 1;
        arrayOfByte[(m + paramInt1)] = ((byte)j);
        for (paramInt1 = i;; paramInt1++)
        {
          if (paramInt1 >= k) {
            break label269;
          }
          i = paramString.charAt(paramInt1);
          if (i >= 128) {
            break;
          }
          arrayOfByte[(paramInt1 + m)] = ((byte)i);
        }
        label269:
        break;
      }
      if (j < 2048)
      {
        b(j >> 6 | 0xC0);
        b(j & 0x3F | 0x80);
        paramInt1++;
      }
      else if ((j < 55296) || (j > 57343))
      {
        b(j >> 12 | 0xE0);
        b(j >> 6 & 0x3F | 0x80);
        b(j & 0x3F | 0x80);
        paramInt1++;
      }
      else
      {
        if (paramInt1 + 1 < paramInt2) {}
        for (i = paramString.charAt(paramInt1 + 1);; i = 0)
        {
          if ((j <= 56319) && (i >= 56320) && (i <= 57343)) {
            break label434;
          }
          b(63);
          paramInt1++;
          break;
        }
        label434:
        i = (i & 0xFFFF23FF | (j & 0xFFFF27FF) << 10) + 65536;
        b(i >> 18 | 0xF0);
        b(i >> 12 & 0x3F | 0x80);
        b(i >> 6 & 0x3F | 0x80);
        b(i & 0x3F | 0x80);
        paramInt1 += 2;
      }
    }
    return this;
  }
  
  public final djz a(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null) {
      throw new IllegalArgumentException("source == null");
    }
    return b(paramArrayOfByte, 0, paramArrayOfByte.length);
  }
  
  public final dkw a()
  {
    return dkw.b;
  }
  
  public final void a(long paramLong)
  {
    if (this.b < paramLong) {
      throw new EOFException();
    }
  }
  
  public final void a_(djz paramdjz, long paramLong)
  {
    if (paramdjz == null) {
      throw new IllegalArgumentException("source == null");
    }
    if (paramdjz == this) {
      throw new IllegalArgumentException("source == this");
    }
    dky.a(paramdjz.b, 0L, paramLong);
    if (paramLong > 0L)
    {
      if (paramLong >= paramdjz.a.c - paramdjz.a.b) {
        break label269;
      }
      if (this.a == null) {
        break label160;
      }
      localdks1 = this.a.g;
      if ((localdks1 == null) || (!localdks1.e)) {
        break label176;
      }
      l = localdks1.c;
      if (!localdks1.d) {
        break label166;
      }
    }
    label160:
    label166:
    for (int i = 0;; i = localdks1.b)
    {
      if (l + paramLong - i > 2048L) {
        break label176;
      }
      paramdjz.a.a(localdks1, (int)paramLong);
      paramdjz.b -= paramLong;
      this.b += paramLong;
      return;
      localdks1 = null;
      break;
    }
    label176:
    dks localdks1 = paramdjz.a;
    i = (int)paramLong;
    if ((i <= 0) || (i > localdks1.c - localdks1.b)) {
      throw new IllegalArgumentException();
    }
    dks localdks2 = new dks(localdks1);
    localdks2.c = (localdks2.b + i);
    localdks1.b = (i + localdks1.b);
    localdks1.g.a(localdks2);
    paramdjz.a = localdks2;
    label269:
    localdks1 = paramdjz.a;
    long l = localdks1.c - localdks1.b;
    paramdjz.a = localdks1.a();
    if (this.a == null)
    {
      this.a = localdks1;
      localdks1 = this.a;
      localdks2 = this.a;
      dks localdks3 = this.a;
      localdks2.g = localdks3;
      localdks1.f = localdks3;
    }
    label504:
    for (;;)
    {
      paramdjz.b -= l;
      this.b += l;
      paramLong -= l;
      break;
      localdks1 = this.a.g.a(localdks1);
      if (localdks1.g == localdks1) {
        throw new IllegalStateException();
      }
      if (localdks1.g.e)
      {
        int j = localdks1.c - localdks1.b;
        int k = localdks1.g.c;
        if (localdks1.g.d) {}
        for (i = 0;; i = localdks1.g.b)
        {
          if (j > i + (2048 - k)) {
            break label504;
          }
          localdks1.a(localdks1.g, j);
          localdks1.a();
          dkt.a(localdks1);
          break;
        }
      }
    }
  }
  
  public final byte b(long paramLong)
  {
    dky.a(this.b, paramLong, 1L);
    for (dks localdks = this.a;; localdks = localdks.f)
    {
      int i = localdks.c - localdks.b;
      if (paramLong < i) {
        return localdks.a[(localdks.b + (int)paramLong)];
      }
      paramLong -= i;
    }
  }
  
  public final djz b()
  {
    return this;
  }
  
  public final djz b(int paramInt)
  {
    dks localdks = e(1);
    byte[] arrayOfByte = localdks.a;
    int i = localdks.c;
    localdks.c = (i + 1);
    arrayOfByte[i] = ((byte)paramInt);
    this.b += 1L;
    return this;
  }
  
  public final djz b(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (paramArrayOfByte == null) {
      throw new IllegalArgumentException("source == null");
    }
    dky.a(paramArrayOfByte.length, paramInt1, paramInt2);
    int i = paramInt1 + paramInt2;
    while (paramInt1 < i)
    {
      dks localdks = e(1);
      int j = Math.min(i - paramInt1, 2048 - localdks.c);
      System.arraycopy(paramArrayOfByte, paramInt1, localdks.a, localdks.c, j);
      paramInt1 += j;
      localdks.c = (j + localdks.c);
    }
    this.b += paramInt2;
    return this;
  }
  
  public final djz c(int paramInt)
  {
    dks localdks = e(2);
    byte[] arrayOfByte = localdks.a;
    int j = localdks.c;
    int i = j + 1;
    arrayOfByte[j] = ((byte)(paramInt >>> 8));
    arrayOfByte[i] = ((byte)paramInt);
    localdks.c = (i + 1);
    this.b += 2L;
    return this;
  }
  
  public final dke c(long paramLong)
  {
    return new dke(e(paramLong));
  }
  
  public final OutputStream c()
  {
    return new dka(this);
  }
  
  public final void close() {}
  
  public final djz d(int paramInt)
  {
    dks localdks = e(4);
    byte[] arrayOfByte = localdks.a;
    int j = localdks.c;
    int i = j + 1;
    arrayOfByte[j] = ((byte)(paramInt >>> 24));
    j = i + 1;
    arrayOfByte[i] = ((byte)(paramInt >>> 16));
    i = j + 1;
    arrayOfByte[j] = ((byte)(paramInt >>> 8));
    arrayOfByte[i] = ((byte)paramInt);
    localdks.c = (i + 1);
    this.b += 4L;
    return this;
  }
  
  public final dkc d()
  {
    return this;
  }
  
  final String d(long paramLong)
  {
    String str;
    if ((paramLong > 0L) && (b(paramLong - 1L) == 13))
    {
      str = i(paramLong - 1L);
      f(2L);
    }
    for (;;)
    {
      return str;
      str = i(paramLong);
      f(1L);
    }
  }
  
  final dks e(int paramInt)
  {
    if ((paramInt <= 0) || (paramInt > 2048)) {
      throw new IllegalArgumentException();
    }
    dks localdks2;
    dks localdks1;
    if (this.a == null)
    {
      this.a = dkt.a();
      dks localdks3 = this.a;
      localdks2 = this.a;
      localdks1 = this.a;
      localdks2.g = localdks1;
      localdks3.f = localdks1;
    }
    for (;;)
    {
      return localdks1;
      localdks2 = this.a.g;
      if (localdks2.c + paramInt <= 2048)
      {
        localdks1 = localdks2;
        if (localdks2.e) {}
      }
      else
      {
        localdks1 = localdks2.a(dkt.a());
      }
    }
  }
  
  public final boolean e()
  {
    if (this.b == 0L) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public final byte[] e(long paramLong)
  {
    dky.a(this.b, 0L, paramLong);
    if (paramLong > 2147483647L) {
      throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + paramLong);
    }
    byte[] arrayOfByte = new byte[(int)paramLong];
    c(arrayOfByte);
    return arrayOfByte;
  }
  
  public final boolean equals(Object paramObject)
  {
    long l1 = 0L;
    boolean bool;
    if (this == paramObject) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      if (!(paramObject instanceof djz))
      {
        bool = false;
      }
      else
      {
        paramObject = (djz)paramObject;
        if (this.b != ((djz)paramObject).b)
        {
          bool = false;
        }
        else if (this.b == 0L)
        {
          bool = true;
        }
        else
        {
          Object localObject2 = this.a;
          Object localObject1 = ((djz)paramObject).a;
          int j = ((dks)localObject2).b;
          int i = ((dks)localObject1).b;
          for (;;)
          {
            if (l1 >= this.b) {
              break label238;
            }
            long l2 = Math.min(((dks)localObject2).c - j, ((dks)localObject1).c - i);
            int k = 0;
            for (;;)
            {
              if (k >= l2) {
                break label164;
              }
              if (localObject2.a[j] != localObject1.a[i])
              {
                bool = false;
                break;
              }
              k++;
              i++;
              j++;
            }
            label164:
            k = j;
            paramObject = localObject2;
            if (j == ((dks)localObject2).c)
            {
              paramObject = ((dks)localObject2).f;
              k = ((dks)paramObject).b;
            }
            j = i;
            localObject2 = localObject1;
            if (i == ((dks)localObject1).c)
            {
              localObject2 = ((dks)localObject1).f;
              j = ((dks)localObject2).b;
            }
            l1 += l2;
            i = j;
            j = k;
            localObject1 = localObject2;
            localObject2 = paramObject;
          }
          label238:
          bool = true;
        }
      }
    }
  }
  
  public final InputStream f()
  {
    return new dkb(this);
  }
  
  public final void f(long paramLong)
  {
    while (paramLong > 0L)
    {
      if (this.a == null) {
        throw new EOFException();
      }
      int i = (int)Math.min(paramLong, this.a.c - this.a.b);
      this.b -= i;
      long l = paramLong - i;
      dks localdks = this.a;
      localdks.b = (i + localdks.b);
      paramLong = l;
      if (this.a.b == this.a.c)
      {
        localdks = this.a;
        this.a = localdks.a();
        dkt.a(localdks);
        paramLong = l;
      }
    }
  }
  
  public final void flush() {}
  
  public final byte g()
  {
    if (this.b == 0L) {
      throw new IllegalStateException("size == 0");
    }
    dks localdks = this.a;
    int i = localdks.b;
    int j = localdks.c;
    byte[] arrayOfByte = localdks.a;
    int k = i + 1;
    byte b1 = arrayOfByte[i];
    this.b -= 1L;
    if (k == j)
    {
      this.a = localdks.a();
      dkt.a(localdks);
    }
    for (;;)
    {
      return b1;
      localdks.b = k;
    }
  }
  
  public final djz g(long paramLong)
  {
    if (paramLong == 0L) {}
    for (Object localObject = b(48);; localObject = this)
    {
      return (djz)localObject;
      int j = Long.numberOfTrailingZeros(Long.highestOneBit(paramLong)) / 4 + 1;
      dks localdks = e(j);
      localObject = localdks.a;
      int i = localdks.c + j - 1;
      int k = localdks.c;
      while (i >= k)
      {
        localObject[i] = c[((int)(0xF & paramLong))];
        paramLong >>>= 4;
        i--;
      }
      localdks.c += j;
      paramLong = this.b;
      this.b = (j + paramLong);
    }
  }
  
  public final short h()
  {
    if (this.b < 2L) {
      throw new IllegalStateException("size < 2: " + this.b);
    }
    dks localdks = this.a;
    int j = localdks.b;
    int i = localdks.c;
    short s;
    if (i - j < 2)
    {
      s = (short)((g() & 0xFF) << 8 | g() & 0xFF);
      return s;
    }
    byte[] arrayOfByte = localdks.a;
    int k = j + 1;
    int m = arrayOfByte[j];
    j = k + 1;
    k = arrayOfByte[k];
    this.b -= 2L;
    if (j == i)
    {
      this.a = localdks.a();
      dkt.a(localdks);
    }
    for (;;)
    {
      s = (short)((m & 0xFF) << 8 | k & 0xFF);
      break;
      localdks.b = j;
    }
  }
  
  public final int hashCode()
  {
    Object localObject = this.a;
    int i;
    if (localObject == null) {
      i = 0;
    }
    for (;;)
    {
      return i;
      int j = 1;
      dks localdks;
      do
      {
        int k = ((dks)localObject).b;
        int m = ((dks)localObject).c;
        for (i = j; k < m; i = j + i * 31)
        {
          j = localObject.a[k];
          k++;
        }
        localdks = ((dks)localObject).f;
        j = i;
        localObject = localdks;
      } while (localdks != this.a);
    }
  }
  
  public final int i()
  {
    if (this.b < 4L) {
      throw new IllegalStateException("size < 4: " + this.b);
    }
    dks localdks = this.a;
    int i = localdks.b;
    int j = localdks.c;
    if (j - i < 4) {
      i = (g() & 0xFF) << 24 | (g() & 0xFF) << 16 | (g() & 0xFF) << 8 | g() & 0xFF;
    }
    for (;;)
    {
      return i;
      byte[] arrayOfByte = localdks.a;
      int k = i + 1;
      i = arrayOfByte[i];
      int n = k + 1;
      int m = arrayOfByte[k];
      k = n + 1;
      int i1 = arrayOfByte[n];
      n = k + 1;
      i = (i & 0xFF) << 24 | (m & 0xFF) << 16 | (i1 & 0xFF) << 8 | arrayOfByte[k] & 0xFF;
      this.b -= 4L;
      if (n == j)
      {
        this.a = localdks.a();
        dkt.a(localdks);
      }
      else
      {
        localdks.b = n;
      }
    }
  }
  
  public final short j()
  {
    return dky.a(h());
  }
  
  public final int k()
  {
    return dky.a(i());
  }
  
  public final long l()
  {
    if (this.b == 0L) {
      throw new IllegalStateException("size == 0");
    }
    long l2 = 0L;
    int i = 0;
    int j = 0;
    Object localObject = this.a;
    byte[] arrayOfByte = ((dks)localObject).a;
    int k = ((dks)localObject).b;
    int n = ((dks)localObject).c;
    long l1 = l2;
    int m = i;
    label57:
    i = j;
    if (k < n)
    {
      int i1 = arrayOfByte[k];
      if ((i1 >= 48) && (i1 <= 57)) {
        i = i1 - 48;
      }
      for (;;)
      {
        if ((0xF000000000000000 & l1) == 0L) {
          break label293;
        }
        localObject = new djz().g(l1).b(i1);
        throw new NumberFormatException("Number too large: " + ((djz)localObject).n());
        if ((i1 >= 97) && (i1 <= 102))
        {
          i = i1 - 97 + 10;
        }
        else
        {
          if ((i1 < 65) || (i1 > 70)) {
            break;
          }
          i = i1 - 65 + 10;
        }
      }
      if (m == 0) {
        throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x" + Integer.toHexString(i1));
      }
      i = 1;
    }
    if (k == n)
    {
      this.a = ((dks)localObject).a();
      dkt.a((dks)localObject);
    }
    for (;;)
    {
      if (i == 0)
      {
        j = i;
        i = m;
        l2 = l1;
        if (this.a != null) {
          break;
        }
      }
      this.b -= m;
      return l1;
      label293:
      l2 = i;
      m++;
      k++;
      l1 = l2 | l1 << 4;
      break label57;
      ((dks)localObject).b = k;
    }
  }
  
  public final dke m()
  {
    return new dke(p());
  }
  
  public final String n()
  {
    try
    {
      String str = a(this.b, dky.a);
      return str;
    }
    catch (EOFException localEOFException)
    {
      throw new AssertionError(localEOFException);
    }
  }
  
  public final String o()
  {
    long l = a((byte)10, 0L);
    if (l == -1L)
    {
      djz localdjz = new djz();
      a(localdjz, 0L, Math.min(32L, this.b));
      throw new EOFException("\\n not found: size=" + this.b + " content=" + localdjz.m().b() + "...");
    }
    return d(l);
  }
  
  public final byte[] p()
  {
    try
    {
      byte[] arrayOfByte = e(this.b);
      return arrayOfByte;
    }
    catch (EOFException localEOFException)
    {
      throw new AssertionError(localEOFException);
    }
  }
  
  public final void q()
  {
    try
    {
      f(this.b);
      return;
    }
    catch (EOFException localEOFException)
    {
      throw new AssertionError(localEOFException);
    }
  }
  
  public final String toString()
  {
    Object localObject;
    if (this.b == 0L) {
      localObject = "Buffer[size=0]";
    }
    for (;;)
    {
      return (String)localObject;
      if (this.b <= 16L)
      {
        localObject = s().m();
        localObject = String.format("Buffer[size=%s data=%s]", new Object[] { Long.valueOf(this.b), ((dke)localObject).b() });
        continue;
      }
      try
      {
        MessageDigest localMessageDigest = MessageDigest.getInstance("MD5");
        localMessageDigest.update(this.a.a, this.a.b, this.a.c - this.a.b);
        for (localObject = this.a.f; localObject != this.a; localObject = ((dks)localObject).f) {
          localMessageDigest.update(((dks)localObject).a, ((dks)localObject).b, ((dks)localObject).c - ((dks)localObject).b);
        }
        localObject = String.format("Buffer[size=%s md5=%s]", new Object[] { Long.valueOf(this.b), dke.a(localMessageDigest.digest()).b() });
      }
      catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
      {
        throw new AssertionError();
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\djz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */