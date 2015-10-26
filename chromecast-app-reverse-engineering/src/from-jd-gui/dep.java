import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;

public final class dep
{
  public final ByteBuffer a;
  
  private dep(ByteBuffer paramByteBuffer)
  {
    this.a = paramByteBuffer;
    this.a.order(ByteOrder.LITTLE_ENDIAN);
  }
  
  private dep(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    this(ByteBuffer.wrap(paramArrayOfByte, paramInt1, paramInt2));
  }
  
  public static int a(int paramInt)
  {
    if (paramInt >= 0) {}
    for (paramInt = d(paramInt);; paramInt = 10) {
      return paramInt;
    }
  }
  
  private static int a(CharSequence paramCharSequence)
  {
    int k = 0;
    int n = paramCharSequence.length();
    for (int j = 0; (j < n) && (paramCharSequence.charAt(j) < ''); j++) {}
    for (;;)
    {
      int i;
      if (j < n)
      {
        int m = paramCharSequence.charAt(j);
        if (m < 2048)
        {
          i += (127 - m >>> 31);
          j++;
        }
        else
        {
          int i2 = paramCharSequence.length();
          if (j < i2)
          {
            int i3 = paramCharSequence.charAt(j);
            if (i3 < 2048)
            {
              k += (127 - i3 >>> 31);
              m = j;
            }
            for (;;)
            {
              j = m + 1;
              break;
              int i1 = k + 2;
              m = j;
              k = i1;
              if (55296 <= i3)
              {
                m = j;
                k = i1;
                if (i3 <= 57343)
                {
                  if (Character.codePointAt(paramCharSequence, j) < 65536) {
                    throw new IllegalArgumentException(39 + "Unpaired surrogate at index " + j);
                  }
                  m = j + 1;
                  k = i1;
                }
              }
            }
          }
          i += k;
        }
      }
      else
      {
        for (;;)
        {
          if (i < n)
          {
            long l = i;
            throw new IllegalArgumentException(54 + "UTF-8 length does not fit in int: " + (l + 4294967296L));
          }
          return i;
        }
        i = n;
      }
    }
  }
  
  private static int a(CharSequence paramCharSequence, byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int k = paramCharSequence.length();
    int j = 0;
    int m = paramInt1 + paramInt2;
    for (paramInt2 = j; (paramInt2 < k) && (paramInt2 + paramInt1 < m); paramInt2++)
    {
      j = paramCharSequence.charAt(paramInt2);
      if (j >= 128) {
        break;
      }
      paramArrayOfByte[(paramInt1 + paramInt2)] = ((byte)j);
    }
    if (paramInt2 == k) {
      paramInt1 += k;
    }
    for (;;)
    {
      return paramInt1;
      paramInt1 += paramInt2;
      if (paramInt2 < k)
      {
        int i = paramCharSequence.charAt(paramInt2);
        if ((i < 128) && (paramInt1 < m))
        {
          j = paramInt1 + 1;
          paramArrayOfByte[paramInt1] = ((byte)i);
          paramInt1 = j;
        }
        for (;;)
        {
          paramInt2++;
          break;
          if ((i < 2048) && (paramInt1 <= m - 2))
          {
            j = paramInt1 + 1;
            paramArrayOfByte[paramInt1] = ((byte)(i >>> 6 | 0x3C0));
            paramInt1 = j + 1;
            paramArrayOfByte[j] = ((byte)(i & 0x3F | 0x80));
          }
          else
          {
            int n;
            if (((i < 55296) || (57343 < i)) && (paramInt1 <= m - 3))
            {
              n = paramInt1 + 1;
              paramArrayOfByte[paramInt1] = ((byte)(i >>> 12 | 0x1E0));
              j = n + 1;
              paramArrayOfByte[n] = ((byte)(i >>> 6 & 0x3F | 0x80));
              paramInt1 = j + 1;
              paramArrayOfByte[j] = ((byte)(i & 0x3F | 0x80));
            }
            else
            {
              if (paramInt1 > m - 4) {
                break label443;
              }
              j = paramInt2;
              char c;
              if (paramInt2 + 1 != paramCharSequence.length())
              {
                paramInt2++;
                c = paramCharSequence.charAt(paramInt2);
                if (!Character.isSurrogatePair(i, c)) {
                  j = paramInt2;
                }
              }
              else
              {
                throw new IllegalArgumentException(39 + "Unpaired surrogate at index " + (j - 1));
              }
              j = Character.toCodePoint(i, c);
              n = paramInt1 + 1;
              paramArrayOfByte[paramInt1] = ((byte)(j >>> 18 | 0xF0));
              paramInt1 = n + 1;
              paramArrayOfByte[n] = ((byte)(j >>> 12 & 0x3F | 0x80));
              n = paramInt1 + 1;
              paramArrayOfByte[paramInt1] = ((byte)(j >>> 6 & 0x3F | 0x80));
              paramInt1 = n + 1;
              paramArrayOfByte[n] = ((byte)(j & 0x3F | 0x80));
            }
          }
        }
        label443:
        throw new ArrayIndexOutOfBoundsException(37 + "Failed writing " + i + " at index " + paramInt1);
      }
    }
  }
  
  public static int a(String paramString)
  {
    int i = a(paramString);
    return i + d(i);
  }
  
  public static dep a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    return new dep(paramArrayOfByte, paramInt1, paramInt2);
  }
  
  private static void a(CharSequence paramCharSequence, ByteBuffer paramByteBuffer)
  {
    if (paramByteBuffer.isReadOnly()) {
      throw new ReadOnlyBufferException();
    }
    if (paramByteBuffer.hasArray()) {}
    for (;;)
    {
      try
      {
        paramByteBuffer.position(a(paramCharSequence, paramByteBuffer.array(), paramByteBuffer.arrayOffset() + paramByteBuffer.position(), paramByteBuffer.remaining()) - paramByteBuffer.arrayOffset());
        return;
      }
      catch (ArrayIndexOutOfBoundsException paramByteBuffer)
      {
        paramCharSequence = new BufferOverflowException();
        paramCharSequence.initCause(paramByteBuffer);
        throw paramCharSequence;
      }
      b(paramCharSequence, paramByteBuffer);
    }
  }
  
  public static int b(int paramInt)
  {
    return d(dey.a(paramInt, 0));
  }
  
  public static int b(int paramInt1, int paramInt2)
  {
    return b(paramInt1) + a(paramInt2);
  }
  
  public static int b(int paramInt, long paramLong)
  {
    int i = b(paramInt);
    if ((0xFFFFFFFFFFFFFF80 & paramLong) == 0L) {
      paramInt = 1;
    }
    for (;;)
    {
      return paramInt + i;
      if ((0xFFFFFFFFFFFFC000 & paramLong) == 0L) {
        paramInt = 2;
      } else if ((0xFFFFFFFFFFE00000 & paramLong) == 0L) {
        paramInt = 3;
      } else if ((0xFFFFFFFFF0000000 & paramLong) == 0L) {
        paramInt = 4;
      } else if ((0xFFFFFFF800000000 & paramLong) == 0L) {
        paramInt = 5;
      } else if ((0xFFFFFC0000000000 & paramLong) == 0L) {
        paramInt = 6;
      } else if ((0xFFFE000000000000 & paramLong) == 0L) {
        paramInt = 7;
      } else if ((0xFF00000000000000 & paramLong) == 0L) {
        paramInt = 8;
      } else if ((0x8000000000000000 & paramLong) == 0L) {
        paramInt = 9;
      } else {
        paramInt = 10;
      }
    }
  }
  
  public static int b(int paramInt, dew paramdew)
  {
    paramInt = b(paramInt);
    int i = paramdew.d();
    return paramInt + (i + d(i));
  }
  
  public static int b(int paramInt, String paramString)
  {
    return b(paramInt) + a(paramString);
  }
  
  private void b(long paramLong)
  {
    for (;;)
    {
      if ((0xFFFFFFFFFFFFFF80 & paramLong) == 0L)
      {
        e((int)paramLong);
        return;
      }
      e((int)paramLong & 0x7F | 0x80);
      paramLong >>>= 7;
    }
  }
  
  private static void b(CharSequence paramCharSequence, ByteBuffer paramByteBuffer)
  {
    int m = paramCharSequence.length();
    int j = 0;
    if (j < m)
    {
      int i = paramCharSequence.charAt(j);
      if (i < 128) {
        paramByteBuffer.put((byte)i);
      }
      for (;;)
      {
        j++;
        break;
        if (i < 2048)
        {
          paramByteBuffer.put((byte)(i >>> 6 | 0x3C0));
          paramByteBuffer.put((byte)(i & 0x3F | 0x80));
        }
        else if ((i < 55296) || (57343 < i))
        {
          paramByteBuffer.put((byte)(i >>> 12 | 0x1E0));
          paramByteBuffer.put((byte)(i >>> 6 & 0x3F | 0x80));
          paramByteBuffer.put((byte)(i & 0x3F | 0x80));
        }
        else
        {
          int k = j;
          char c;
          if (j + 1 != paramCharSequence.length())
          {
            k = j + 1;
            c = paramCharSequence.charAt(k);
            if (Character.isSurrogatePair(i, c)) {}
          }
          else
          {
            throw new IllegalArgumentException(39 + "Unpaired surrogate at index " + (k - 1));
          }
          j = Character.toCodePoint(i, c);
          paramByteBuffer.put((byte)(j >>> 18 | 0xF0));
          paramByteBuffer.put((byte)(j >>> 12 & 0x3F | 0x80));
          paramByteBuffer.put((byte)(j >>> 6 & 0x3F | 0x80));
          paramByteBuffer.put((byte)(j & 0x3F | 0x80));
          j = k;
        }
      }
    }
  }
  
  public static int d(int paramInt)
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
  
  private void e(int paramInt)
  {
    byte b = (byte)paramInt;
    if (!this.a.hasRemaining()) {
      throw new deq(this.a.position(), this.a.limit());
    }
    this.a.put(b);
  }
  
  public final void a(int paramInt, double paramDouble)
  {
    c(paramInt, 1);
    a(Double.doubleToLongBits(paramDouble));
  }
  
  public final void a(int paramInt1, int paramInt2)
  {
    c(paramInt1, 0);
    if (paramInt2 >= 0) {
      c(paramInt2);
    }
    for (;;)
    {
      return;
      b(paramInt2);
    }
  }
  
  public final void a(int paramInt, long paramLong)
  {
    c(paramInt, 0);
    b(paramLong);
  }
  
  public final void a(int paramInt, dew paramdew)
  {
    c(paramInt, 2);
    if (paramdew.t < 0) {
      paramdew.d();
    }
    c(paramdew.t);
    paramdew.a(this);
  }
  
  public final void a(int paramInt, String paramString)
  {
    c(paramInt, 2);
    int i;
    try
    {
      paramInt = d(paramString.length());
      if (paramInt != d(paramString.length() * 3)) {
        break label160;
      }
      i = this.a.position();
      if (this.a.remaining() < paramInt)
      {
        paramString = new deq;
        paramString.<init>(paramInt + i, this.a.limit());
        throw paramString;
      }
    }
    catch (BufferOverflowException paramString)
    {
      deq localdeq = new deq(this.a.position(), this.a.limit());
      localdeq.initCause(paramString);
      throw localdeq;
    }
    this.a.position(i + paramInt);
    a(paramString, this.a);
    int j = this.a.position();
    this.a.position(i);
    c(j - i - paramInt);
    this.a.position(j);
    for (;;)
    {
      return;
      label160:
      c(a(paramString));
      a(paramString, this.a);
    }
  }
  
  public final void a(int paramInt, boolean paramBoolean)
  {
    int i = 0;
    c(paramInt, 0);
    paramInt = i;
    if (paramBoolean) {
      paramInt = 1;
    }
    e(paramInt);
  }
  
  public final void a(long paramLong)
  {
    if (this.a.remaining() < 8) {
      throw new deq(this.a.position(), this.a.limit());
    }
    this.a.putLong(paramLong);
  }
  
  public final void c(int paramInt)
  {
    for (;;)
    {
      if ((paramInt & 0xFFFFFF80) == 0)
      {
        e(paramInt);
        return;
      }
      e(paramInt & 0x7F | 0x80);
      paramInt >>>= 7;
    }
  }
  
  public final void c(int paramInt1, int paramInt2)
  {
    c(dey.a(paramInt1, paramInt2));
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dep.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */