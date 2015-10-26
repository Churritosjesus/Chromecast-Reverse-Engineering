import android.os.SystemClock;
import java.io.EOFException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class aem
  implements adg
{
  private final Map a = new LinkedHashMap(16, 0.75F, true);
  private long b = 0L;
  private final File c;
  private final int d;
  
  public aem(File paramFile)
  {
    this(paramFile, 5242880);
  }
  
  private aem(File paramFile, int paramInt)
  {
    this.c = paramFile;
    this.d = 5242880;
  }
  
  static int a(InputStream paramInputStream)
  {
    return e(paramInputStream) | 0x0 | e(paramInputStream) << 8 | e(paramInputStream) << 16 | e(paramInputStream) << 24;
  }
  
  static void a(OutputStream paramOutputStream, int paramInt)
  {
    paramOutputStream.write(paramInt & 0xFF);
    paramOutputStream.write(paramInt >> 8 & 0xFF);
    paramOutputStream.write(paramInt >> 16 & 0xFF);
    paramOutputStream.write(paramInt >>> 24);
  }
  
  static void a(OutputStream paramOutputStream, long paramLong)
  {
    paramOutputStream.write((byte)(int)paramLong);
    paramOutputStream.write((byte)(int)(paramLong >>> 8));
    paramOutputStream.write((byte)(int)(paramLong >>> 16));
    paramOutputStream.write((byte)(int)(paramLong >>> 24));
    paramOutputStream.write((byte)(int)(paramLong >>> 32));
    paramOutputStream.write((byte)(int)(paramLong >>> 40));
    paramOutputStream.write((byte)(int)(paramLong >>> 48));
    paramOutputStream.write((byte)(int)(paramLong >>> 56));
  }
  
  static void a(OutputStream paramOutputStream, String paramString)
  {
    paramString = paramString.getBytes("UTF-8");
    a(paramOutputStream, paramString.length);
    paramOutputStream.write(paramString, 0, paramString.length);
  }
  
  private void a(String paramString, aen paramaen)
  {
    if (!this.a.containsKey(paramString)) {}
    aen localaen;
    long l;
    for (this.b += paramaen.a;; this.b = (paramaen.a - localaen.a + l))
    {
      this.a.put(paramString, paramaen);
      return;
      localaen = (aen)this.a.get(paramString);
      l = this.b;
    }
  }
  
  private static byte[] a(InputStream paramInputStream, int paramInt)
  {
    byte[] arrayOfByte = new byte[paramInt];
    int i = 0;
    while (i < paramInt)
    {
      int j = paramInputStream.read(arrayOfByte, i, paramInt - i);
      if (j == -1) {
        break;
      }
      i += j;
    }
    if (i != paramInt) {
      throw new IOException("Expected " + paramInt + " bytes, read " + i + " bytes");
    }
    return arrayOfByte;
  }
  
  static long b(InputStream paramInputStream)
  {
    return 0L | e(paramInputStream) & 0xFF | (e(paramInputStream) & 0xFF) << 8 | (e(paramInputStream) & 0xFF) << 16 | (e(paramInputStream) & 0xFF) << 24 | (e(paramInputStream) & 0xFF) << 32 | (e(paramInputStream) & 0xFF) << 40 | (e(paramInputStream) & 0xFF) << 48 | (e(paramInputStream) & 0xFF) << 56;
  }
  
  private void b(String paramString)
  {
    try
    {
      boolean bool = d(paramString).delete();
      aen localaen = (aen)this.a.get(paramString);
      if (localaen != null)
      {
        this.b -= localaen.a;
        this.a.remove(paramString);
      }
      if (!bool) {
        aeg.b("Could not delete cache entry for key=%s, filename=%s", new Object[] { paramString, c(paramString) });
      }
      return;
    }
    finally {}
  }
  
  static String c(InputStream paramInputStream)
  {
    return new String(a(paramInputStream, (int)b(paramInputStream)), "UTF-8");
  }
  
  private static String c(String paramString)
  {
    int j = paramString.length() / 2;
    int i = paramString.substring(0, j).hashCode();
    return String.valueOf(i) + String.valueOf(paramString.substring(j).hashCode());
  }
  
  private File d(String paramString)
  {
    return new File(this.c, c(paramString));
  }
  
  static Map d(InputStream paramInputStream)
  {
    int j = a(paramInputStream);
    if (j == 0) {}
    for (Object localObject = Collections.emptyMap();; localObject = new HashMap(j)) {
      for (int i = 0; i < j; i++) {
        ((Map)localObject).put(c(paramInputStream).intern(), c(paramInputStream).intern());
      }
    }
    return (Map)localObject;
  }
  
  private static int e(InputStream paramInputStream)
  {
    int i = paramInputStream.read();
    if (i == -1) {
      throw new EOFException();
    }
    return i;
  }
  
  /* Error */
  public final adh a(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 32	aem:a	Ljava/util/Map;
    //   6: aload_1
    //   7: invokeinterface 83 2 0
    //   12: checkcast 73	aen
    //   15: astore 5
    //   17: aload 5
    //   19: ifnonnull +9 -> 28
    //   22: aconst_null
    //   23: astore_1
    //   24: aload_0
    //   25: monitorexit
    //   26: aload_1
    //   27: areturn
    //   28: aload_0
    //   29: aload_1
    //   30: invokespecial 121	aem:d	(Ljava/lang/String;)Ljava/io/File;
    //   33: astore 4
    //   35: new 195	aeo
    //   38: astore_2
    //   39: new 197	java/io/FileInputStream
    //   42: astore_3
    //   43: aload_3
    //   44: aload 4
    //   46: invokespecial 199	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   49: aload_2
    //   50: aload_3
    //   51: invokespecial 202	aeo:<init>	(Ljava/io/InputStream;)V
    //   54: aload_2
    //   55: invokestatic 205	aen:a	(Ljava/io/InputStream;)Laen;
    //   58: pop
    //   59: aload_2
    //   60: aload 4
    //   62: invokevirtual 208	java/io/File:length	()J
    //   65: aload_2
    //   66: invokestatic 211	aeo:a	(Laeo;)I
    //   69: i2l
    //   70: lsub
    //   71: l2i
    //   72: invokestatic 145	aem:a	(Ljava/io/InputStream;I)[B
    //   75: astore 6
    //   77: new 213	adh
    //   80: astore_3
    //   81: aload_3
    //   82: invokespecial 214	adh:<init>	()V
    //   85: aload_3
    //   86: aload 6
    //   88: putfield 217	adh:a	[B
    //   91: aload_3
    //   92: aload 5
    //   94: getfield 220	aen:c	Ljava/lang/String;
    //   97: putfield 222	adh:b	Ljava/lang/String;
    //   100: aload_3
    //   101: aload 5
    //   103: getfield 224	aen:d	J
    //   106: putfield 226	adh:c	J
    //   109: aload_3
    //   110: aload 5
    //   112: getfield 228	aen:e	J
    //   115: putfield 229	adh:d	J
    //   118: aload_3
    //   119: aload 5
    //   121: getfield 232	aen:f	J
    //   124: putfield 233	adh:e	J
    //   127: aload_3
    //   128: aload 5
    //   130: getfield 236	aen:g	J
    //   133: putfield 237	adh:f	J
    //   136: aload_3
    //   137: aload 5
    //   139: getfield 240	aen:h	Ljava/util/Map;
    //   142: putfield 242	adh:g	Ljava/util/Map;
    //   145: aload_2
    //   146: invokevirtual 245	aeo:close	()V
    //   149: aload_3
    //   150: astore_1
    //   151: goto -127 -> 24
    //   154: astore_1
    //   155: aconst_null
    //   156: astore_1
    //   157: goto -133 -> 24
    //   160: astore_3
    //   161: aconst_null
    //   162: astore_2
    //   163: ldc -9
    //   165: iconst_2
    //   166: anewarray 4	java/lang/Object
    //   169: dup
    //   170: iconst_0
    //   171: aload 4
    //   173: invokevirtual 250	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   176: aastore
    //   177: dup
    //   178: iconst_1
    //   179: aload_3
    //   180: invokevirtual 251	java/io/IOException:toString	()Ljava/lang/String;
    //   183: aastore
    //   184: invokestatic 140	aeg:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   187: aload_0
    //   188: aload_1
    //   189: invokespecial 253	aem:b	(Ljava/lang/String;)V
    //   192: aload_2
    //   193: ifnull +7 -> 200
    //   196: aload_2
    //   197: invokevirtual 245	aeo:close	()V
    //   200: aconst_null
    //   201: astore_1
    //   202: goto -178 -> 24
    //   205: astore_1
    //   206: aconst_null
    //   207: astore_1
    //   208: goto -184 -> 24
    //   211: astore_1
    //   212: aconst_null
    //   213: astore_2
    //   214: aload_2
    //   215: ifnull +7 -> 222
    //   218: aload_2
    //   219: invokevirtual 245	aeo:close	()V
    //   222: aload_1
    //   223: athrow
    //   224: astore_1
    //   225: aload_0
    //   226: monitorexit
    //   227: aload_1
    //   228: athrow
    //   229: astore_1
    //   230: aconst_null
    //   231: astore_1
    //   232: goto -208 -> 24
    //   235: astore_1
    //   236: goto -22 -> 214
    //   239: astore_1
    //   240: goto -26 -> 214
    //   243: astore_3
    //   244: goto -81 -> 163
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	247	0	this	aem
    //   0	247	1	paramString	String
    //   38	181	2	localaeo	aeo
    //   42	108	3	localObject	Object
    //   160	20	3	localIOException1	IOException
    //   243	1	3	localIOException2	IOException
    //   33	139	4	localFile	File
    //   15	123	5	localaen	aen
    //   75	12	6	arrayOfByte	byte[]
    // Exception table:
    //   from	to	target	type
    //   145	149	154	java/io/IOException
    //   35	54	160	java/io/IOException
    //   196	200	205	java/io/IOException
    //   35	54	211	finally
    //   2	17	224	finally
    //   28	35	224	finally
    //   145	149	224	finally
    //   196	200	224	finally
    //   218	222	224	finally
    //   222	224	224	finally
    //   218	222	229	java/io/IOException
    //   54	145	235	finally
    //   163	192	239	finally
    //   54	145	243	java/io/IOException
  }
  
  /* Error */
  public final void a()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 36	aem:c	Ljava/io/File;
    //   6: invokevirtual 256	java/io/File:exists	()Z
    //   9: ifne +36 -> 45
    //   12: aload_0
    //   13: getfield 36	aem:c	Ljava/io/File;
    //   16: invokevirtual 259	java/io/File:mkdirs	()Z
    //   19: ifne +23 -> 42
    //   22: ldc_w 261
    //   25: iconst_1
    //   26: anewarray 4	java/lang/Object
    //   29: dup
    //   30: iconst_0
    //   31: aload_0
    //   32: getfield 36	aem:c	Ljava/io/File;
    //   35: invokevirtual 250	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   38: aastore
    //   39: invokestatic 263	aeg:c	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   42: aload_0
    //   43: monitorexit
    //   44: return
    //   45: aload_0
    //   46: getfield 36	aem:c	Ljava/io/File;
    //   49: invokevirtual 267	java/io/File:listFiles	()[Ljava/io/File;
    //   52: astore_3
    //   53: aload_3
    //   54: ifnull -12 -> 42
    //   57: aload_3
    //   58: arraylength
    //   59: istore 7
    //   61: iconst_0
    //   62: istore 6
    //   64: iload 6
    //   66: iload 7
    //   68: if_icmpge -26 -> 42
    //   71: aload_3
    //   72: iload 6
    //   74: aaload
    //   75: astore 4
    //   77: aconst_null
    //   78: astore_1
    //   79: new 269	java/io/BufferedInputStream
    //   82: astore_2
    //   83: new 197	java/io/FileInputStream
    //   86: astore 5
    //   88: aload 5
    //   90: aload 4
    //   92: invokespecial 199	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   95: aload_2
    //   96: aload 5
    //   98: invokespecial 270	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   101: aload_2
    //   102: astore_1
    //   103: aload_2
    //   104: invokestatic 205	aen:a	(Ljava/io/InputStream;)Laen;
    //   107: astore 5
    //   109: aload_2
    //   110: astore_1
    //   111: aload 5
    //   113: aload 4
    //   115: invokevirtual 208	java/io/File:length	()J
    //   118: putfield 75	aen:a	J
    //   121: aload_2
    //   122: astore_1
    //   123: aload_0
    //   124: aload 5
    //   126: getfield 271	aen:b	Ljava/lang/String;
    //   129: aload 5
    //   131: invokespecial 273	aem:a	(Ljava/lang/String;Laen;)V
    //   134: aload_2
    //   135: invokevirtual 274	java/io/BufferedInputStream:close	()V
    //   138: iinc 6 1
    //   141: goto -77 -> 64
    //   144: astore_1
    //   145: aconst_null
    //   146: astore_2
    //   147: aload 4
    //   149: ifnull +11 -> 160
    //   152: aload_2
    //   153: astore_1
    //   154: aload 4
    //   156: invokevirtual 127	java/io/File:delete	()Z
    //   159: pop
    //   160: aload_2
    //   161: ifnull -23 -> 138
    //   164: aload_2
    //   165: invokevirtual 274	java/io/BufferedInputStream:close	()V
    //   168: goto -30 -> 138
    //   171: astore_1
    //   172: goto -34 -> 138
    //   175: astore_2
    //   176: aload_1
    //   177: ifnull +7 -> 184
    //   180: aload_1
    //   181: invokevirtual 274	java/io/BufferedInputStream:close	()V
    //   184: aload_2
    //   185: athrow
    //   186: astore_1
    //   187: aload_0
    //   188: monitorexit
    //   189: aload_1
    //   190: athrow
    //   191: astore_1
    //   192: goto -54 -> 138
    //   195: astore_1
    //   196: goto -12 -> 184
    //   199: astore_2
    //   200: goto -24 -> 176
    //   203: astore_1
    //   204: goto -57 -> 147
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	207	0	this	aem
    //   78	45	1	localObject1	Object
    //   144	1	1	localIOException1	IOException
    //   153	1	1	localObject2	Object
    //   171	10	1	localIOException2	IOException
    //   186	4	1	localObject3	Object
    //   191	1	1	localIOException3	IOException
    //   195	1	1	localIOException4	IOException
    //   203	1	1	localIOException5	IOException
    //   82	83	2	localBufferedInputStream	java.io.BufferedInputStream
    //   175	10	2	localObject4	Object
    //   199	1	2	localObject5	Object
    //   52	20	3	arrayOfFile	File[]
    //   75	80	4	localFile	File
    //   86	44	5	localObject6	Object
    //   62	77	6	i	int
    //   59	10	7	j	int
    // Exception table:
    //   from	to	target	type
    //   79	101	144	java/io/IOException
    //   164	168	171	java/io/IOException
    //   79	101	175	finally
    //   2	42	186	finally
    //   45	53	186	finally
    //   57	61	186	finally
    //   134	138	186	finally
    //   164	168	186	finally
    //   180	184	186	finally
    //   184	186	186	finally
    //   134	138	191	java/io/IOException
    //   180	184	195	java/io/IOException
    //   103	109	199	finally
    //   111	121	199	finally
    //   123	134	199	finally
    //   154	160	199	finally
    //   103	109	203	java/io/IOException
    //   111	121	203	java/io/IOException
    //   123	134	203	java/io/IOException
  }
  
  public final void a(String paramString, adh paramadh)
  {
    int i = 0;
    long l2;
    long l1;
    Object localObject2;
    try
    {
      int k = paramadh.a.length;
      if (this.b + k < this.d) {
        break label258;
      }
      if (aeg.a) {
        aeg.a("Pruning old cache entries.", new Object[0]);
      }
      l2 = this.b;
      l1 = SystemClock.elapsedRealtime();
      localObject1 = this.a.entrySet().iterator();
      if (((Iterator)localObject1).hasNext())
      {
        localObject2 = (aen)((Map.Entry)((Iterator)localObject1).next()).getValue();
        if (d(((aen)localObject2).b).delete()) {
          this.b -= ((aen)localObject2).a;
        }
        for (;;)
        {
          ((Iterator)localObject1).remove();
          int j = i + 1;
          i = j;
          if ((float)(this.b + k) < this.d * 0.9F) {
            break label209;
          }
          i = j;
          break;
          aeg.b("Could not delete cache entry for key=%s, filename=%s", new Object[] { ((aen)localObject2).b, c(((aen)localObject2).b) });
        }
      }
      if (!aeg.a) {
        break label258;
      }
    }
    finally {}
    label209:
    aeg.a("pruned %d files, %d bytes, %d ms", new Object[] { Integer.valueOf(i), Long.valueOf(this.b - l2), Long.valueOf(SystemClock.elapsedRealtime() - l1) });
    label258:
    Object localObject1 = d(paramString);
    aen localaen;
    try
    {
      localObject2 = new java/io/FileOutputStream;
      ((FileOutputStream)localObject2).<init>((File)localObject1);
      localaen = new aen;
      localaen.<init>(paramString, paramadh);
      if (!localaen.a((OutputStream)localObject2))
      {
        ((FileOutputStream)localObject2).close();
        aeg.b("Failed to write header for %s", new Object[] { ((File)localObject1).getAbsolutePath() });
        paramString = new java/io/IOException;
        paramString.<init>();
        throw paramString;
      }
    }
    catch (IOException paramString)
    {
      if (!((File)localObject1).delete()) {
        aeg.b("Could not clean up file %s", new Object[] { ((File)localObject1).getAbsolutePath() });
      }
    }
    for (;;)
    {
      return;
      ((FileOutputStream)localObject2).write(paramadh.a);
      ((FileOutputStream)localObject2).close();
      a(paramString, localaen);
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\aem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */