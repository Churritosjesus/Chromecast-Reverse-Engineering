import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ReadOnlyBufferException;

public final class cmk
{
  final ByteBuffer a;
  
  private cmk(ByteBuffer paramByteBuffer)
  {
    this.a = paramByteBuffer;
  }
  
  private cmk(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    this(ByteBuffer.wrap(paramArrayOfByte, paramInt1, paramInt2));
  }
  
  public static int a(int paramInt)
  {
    if (paramInt >= 0) {}
    for (paramInt = e(paramInt);; paramInt = 10) {
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
                    throw new IllegalArgumentException("Unpaired surrogate at index " + j);
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
          if (i < n) {
            throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i + 4294967296L));
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
              j = paramInt1 + 1;
              paramArrayOfByte[paramInt1] = ((byte)(i >>> 12 | 0x1E0));
              n = j + 1;
              paramArrayOfByte[j] = ((byte)(i >>> 6 & 0x3F | 0x80));
              paramInt1 = n + 1;
              paramArrayOfByte[n] = ((byte)(i & 0x3F | 0x80));
            }
            else
            {
              if (paramInt1 > m - 4) {
                break label438;
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
                throw new IllegalArgumentException("Unpaired surrogate at index " + (j - 1));
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
        label438:
        throw new ArrayIndexOutOfBoundsException("Failed writing " + i + " at index " + paramInt1);
      }
    }
  }
  
  public static int a(String paramString)
  {
    int i = a(paramString);
    return i + e(i);
  }
  
  public static int a(byte[] paramArrayOfByte)
  {
    return e(paramArrayOfByte.length) + paramArrayOfByte.length;
  }
  
  public static cmk a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    return new cmk(paramArrayOfByte, paramInt1, paramInt2);
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
  
  public static int b(int paramInt1, int paramInt2)
  {
    return c(paramInt1) + a(paramInt2);
  }
  
  public static int b(int paramInt, long paramLong)
  {
    return c(paramInt) + b(paramLong);
  }
  
  public static int b(int paramInt, cms paramcms)
  {
    int i = c(paramInt);
    paramInt = paramcms.f();
    return i + (paramInt + e(paramInt));
  }
  
  public static int b(int paramInt, String paramString)
  {
    return c(paramInt) + a(paramString);
  }
  
  public static int b(int paramInt, byte[] paramArrayOfByte)
  {
    return c(paramInt) + a(paramArrayOfByte);
  }
  
  public static int b(long paramLong)
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
            j++;
            c = paramCharSequence.charAt(j);
            if (!Character.isSurrogatePair(i, c)) {
              k = j;
            }
          }
          else
          {
            throw new IllegalArgumentException("Unpaired surrogate at index " + (k - 1));
          }
          k = Character.toCodePoint(i, c);
          paramByteBuffer.put((byte)(k >>> 18 | 0xF0));
          paramByteBuffer.put((byte)(k >>> 12 & 0x3F | 0x80));
          paramByteBuffer.put((byte)(k >>> 6 & 0x3F | 0x80));
          paramByteBuffer.put((byte)(k & 0x3F | 0x80));
        }
      }
    }
  }
  
  public static int c(int paramInt)
  {
    return e(cmu.a(paramInt, 0));
  }
  
  public static long c(long paramLong)
  {
    return paramLong << 1 ^ paramLong >> 63;
  }
  
  public static int e(int paramInt)
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
  
  public final void a(int paramInt1, int paramInt2)
  {
    c(paramInt1, 0);
    if (paramInt2 >= 0) {
      d(paramInt2);
    }
    for (;;)
    {
      return;
      a(paramInt2);
    }
  }
  
  public final void a(int paramInt, long paramLong)
  {
    c(paramInt, 0);
    a(paramLong);
  }
  
  public final void a(int paramInt, cms paramcms)
  {
    c(paramInt, 2);
    a(paramcms);
  }
  
  /* Error */
  public final void a(int paramInt, String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: iload_1
    //   2: iconst_2
    //   3: invokevirtual 194	cmk:c	(II)V
    //   6: aload_2
    //   7: invokevirtual 210	java/lang/String:length	()I
    //   10: invokestatic 27	cmk:e	(I)I
    //   13: istore_3
    //   14: iload_3
    //   15: aload_2
    //   16: invokevirtual 210	java/lang/String:length	()I
    //   19: iconst_3
    //   20: imul
    //   21: invokestatic 27	cmk:e	(I)I
    //   24: if_icmpne +69 -> 93
    //   27: aload_0
    //   28: getfield 13	cmk:a	Ljava/nio/ByteBuffer;
    //   31: invokevirtual 122	java/nio/ByteBuffer:position	()I
    //   34: istore_1
    //   35: aload_0
    //   36: getfield 13	cmk:a	Ljava/nio/ByteBuffer;
    //   39: iload_1
    //   40: iload_3
    //   41: iadd
    //   42: invokevirtual 130	java/nio/ByteBuffer:position	(I)Ljava/nio/Buffer;
    //   45: pop
    //   46: aload_2
    //   47: aload_0
    //   48: getfield 13	cmk:a	Ljava/nio/ByteBuffer;
    //   51: invokestatic 212	cmk:a	(Ljava/lang/CharSequence;Ljava/nio/ByteBuffer;)V
    //   54: aload_0
    //   55: getfield 13	cmk:a	Ljava/nio/ByteBuffer;
    //   58: invokevirtual 122	java/nio/ByteBuffer:position	()I
    //   61: istore 4
    //   63: aload_0
    //   64: getfield 13	cmk:a	Ljava/nio/ByteBuffer;
    //   67: iload_1
    //   68: invokevirtual 130	java/nio/ByteBuffer:position	(I)Ljava/nio/Buffer;
    //   71: pop
    //   72: aload_0
    //   73: iload 4
    //   75: iload_1
    //   76: isub
    //   77: iload_3
    //   78: isub
    //   79: invokevirtual 198	cmk:d	(I)V
    //   82: aload_0
    //   83: getfield 13	cmk:a	Ljava/nio/ByteBuffer;
    //   86: iload 4
    //   88: invokevirtual 130	java/nio/ByteBuffer:position	(I)Ljava/nio/Buffer;
    //   91: pop
    //   92: return
    //   93: aload_0
    //   94: aload_2
    //   95: invokestatic 97	cmk:a	(Ljava/lang/CharSequence;)I
    //   98: invokevirtual 198	cmk:d	(I)V
    //   101: aload_2
    //   102: aload_0
    //   103: getfield 13	cmk:a	Ljava/nio/ByteBuffer;
    //   106: invokestatic 212	cmk:a	(Ljava/lang/CharSequence;Ljava/nio/ByteBuffer;)V
    //   109: goto -17 -> 92
    //   112: astore_2
    //   113: new 214	cml
    //   116: dup
    //   117: aload_0
    //   118: getfield 13	cmk:a	Ljava/nio/ByteBuffer;
    //   121: invokevirtual 122	java/nio/ByteBuffer:position	()I
    //   124: aload_0
    //   125: getfield 13	cmk:a	Ljava/nio/ByteBuffer;
    //   128: invokevirtual 217	java/nio/ByteBuffer:limit	()I
    //   131: invokespecial 219	cml:<init>	(II)V
    //   134: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	135	0	this	cmk
    //   0	135	1	paramInt	int
    //   0	135	2	paramString	String
    //   13	66	3	i	int
    //   61	26	4	j	int
    // Exception table:
    //   from	to	target	type
    //   6	92	112	java/nio/BufferOverflowException
    //   93	109	112	java/nio/BufferOverflowException
  }
  
  public final void a(int paramInt, boolean paramBoolean)
  {
    int i = 0;
    c(paramInt, 0);
    paramInt = i;
    if (paramBoolean) {
      paramInt = 1;
    }
    b(paramInt);
  }
  
  public final void a(int paramInt, byte[] paramArrayOfByte)
  {
    c(paramInt, 2);
    d(paramArrayOfByte.length);
    b(paramArrayOfByte);
  }
  
  public final void a(long paramLong)
  {
    for (;;)
    {
      if ((0xFFFFFFFFFFFFFF80 & paramLong) == 0L)
      {
        b((int)paramLong);
        return;
      }
      b((int)paramLong & 0x7F | 0x80);
      paramLong >>>= 7;
    }
  }
  
  public final void a(cms paramcms)
  {
    d(paramcms.e());
    paramcms.a(this);
  }
  
  public final void b(int paramInt)
  {
    byte b = (byte)paramInt;
    if (!this.a.hasRemaining()) {
      throw new cml(this.a.position(), this.a.limit());
    }
    this.a.put(b);
  }
  
  public final void b(byte[] paramArrayOfByte)
  {
    int i = paramArrayOfByte.length;
    if (this.a.remaining() >= i)
    {
      this.a.put(paramArrayOfByte, 0, i);
      return;
    }
    throw new cml(this.a.position(), this.a.limit());
  }
  
  public final void c(int paramInt1, int paramInt2)
  {
    d(cmu.a(paramInt1, paramInt2));
  }
  
  public final void d(int paramInt)
  {
    for (;;)
    {
      if ((paramInt & 0xFFFFFF80) == 0)
      {
        b(paramInt);
        return;
      }
      b(paramInt & 0x7F | 0x80);
      paramInt >>>= 7;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cmk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */