import android.content.Context;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.UUID;
import java.util.concurrent.Future;

public final class brt
  extends bra
{
  private volatile String a;
  private Future b;
  
  protected brt(brb parambrb)
  {
    super(parambrb);
  }
  
  /* Error */
  private String a(Context paramContext)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 5
    //   3: ldc 20
    //   5: invokestatic 25	a:h	(Ljava/lang/String;)V
    //   8: aload_1
    //   9: ldc 27
    //   11: invokevirtual 33	android/content/Context:openFileInput	(Ljava/lang/String;)Ljava/io/FileInputStream;
    //   14: astore_2
    //   15: aload_2
    //   16: astore_3
    //   17: bipush 36
    //   19: newarray <illegal type>
    //   21: astore 6
    //   23: aload_2
    //   24: astore_3
    //   25: aload_2
    //   26: aload 6
    //   28: iconst_0
    //   29: bipush 36
    //   31: invokevirtual 39	java/io/FileInputStream:read	([BII)I
    //   34: istore 7
    //   36: aload_2
    //   37: astore_3
    //   38: aload_2
    //   39: invokevirtual 43	java/io/FileInputStream:available	()I
    //   42: ifle +56 -> 98
    //   45: aload_2
    //   46: astore_3
    //   47: aload_0
    //   48: ldc 45
    //   50: invokevirtual 48	brt:e	(Ljava/lang/String;)V
    //   53: aload_2
    //   54: astore_3
    //   55: aload_2
    //   56: invokevirtual 52	java/io/FileInputStream:close	()V
    //   59: aload_2
    //   60: astore_3
    //   61: aload_1
    //   62: ldc 27
    //   64: invokevirtual 56	android/content/Context:deleteFile	(Ljava/lang/String;)Z
    //   67: pop
    //   68: aload 5
    //   70: astore_1
    //   71: aload_2
    //   72: ifnull +10 -> 82
    //   75: aload_2
    //   76: invokevirtual 52	java/io/FileInputStream:close	()V
    //   79: aload 5
    //   81: astore_1
    //   82: aload_1
    //   83: areturn
    //   84: astore_1
    //   85: aload_0
    //   86: ldc 58
    //   88: aload_1
    //   89: invokevirtual 61	brt:e	(Ljava/lang/String;Ljava/lang/Object;)V
    //   92: aload 5
    //   94: astore_1
    //   95: goto -13 -> 82
    //   98: iload 7
    //   100: bipush 14
    //   102: if_icmpge +57 -> 159
    //   105: aload_2
    //   106: astore_3
    //   107: aload_0
    //   108: ldc 63
    //   110: invokevirtual 48	brt:e	(Ljava/lang/String;)V
    //   113: aload_2
    //   114: astore_3
    //   115: aload_2
    //   116: invokevirtual 52	java/io/FileInputStream:close	()V
    //   119: aload_2
    //   120: astore_3
    //   121: aload_1
    //   122: ldc 27
    //   124: invokevirtual 56	android/content/Context:deleteFile	(Ljava/lang/String;)Z
    //   127: pop
    //   128: aload 5
    //   130: astore_1
    //   131: aload_2
    //   132: ifnull -50 -> 82
    //   135: aload_2
    //   136: invokevirtual 52	java/io/FileInputStream:close	()V
    //   139: aload 5
    //   141: astore_1
    //   142: goto -60 -> 82
    //   145: astore_1
    //   146: aload_0
    //   147: ldc 58
    //   149: aload_1
    //   150: invokevirtual 61	brt:e	(Ljava/lang/String;Ljava/lang/Object;)V
    //   153: aload 5
    //   155: astore_1
    //   156: goto -74 -> 82
    //   159: aload_2
    //   160: astore_3
    //   161: aload_2
    //   162: invokevirtual 52	java/io/FileInputStream:close	()V
    //   165: aload_2
    //   166: astore_3
    //   167: new 65	java/lang/String
    //   170: astore 4
    //   172: aload_2
    //   173: astore_3
    //   174: aload 4
    //   176: aload 6
    //   178: iconst_0
    //   179: iload 7
    //   181: invokespecial 68	java/lang/String:<init>	([BII)V
    //   184: aload_2
    //   185: astore_3
    //   186: aload_0
    //   187: ldc 70
    //   189: aload 4
    //   191: invokevirtual 72	brt:a	(Ljava/lang/String;Ljava/lang/Object;)V
    //   194: aload_2
    //   195: ifnull +7 -> 202
    //   198: aload_2
    //   199: invokevirtual 52	java/io/FileInputStream:close	()V
    //   202: aload 4
    //   204: astore_1
    //   205: goto -123 -> 82
    //   208: astore_1
    //   209: aload_0
    //   210: ldc 58
    //   212: aload_1
    //   213: invokevirtual 61	brt:e	(Ljava/lang/String;Ljava/lang/Object;)V
    //   216: goto -14 -> 202
    //   219: astore_1
    //   220: aconst_null
    //   221: astore_2
    //   222: aload 5
    //   224: astore_1
    //   225: aload_2
    //   226: ifnull -144 -> 82
    //   229: aload_2
    //   230: invokevirtual 52	java/io/FileInputStream:close	()V
    //   233: aload 5
    //   235: astore_1
    //   236: goto -154 -> 82
    //   239: astore_1
    //   240: aload_0
    //   241: ldc 58
    //   243: aload_1
    //   244: invokevirtual 61	brt:e	(Ljava/lang/String;Ljava/lang/Object;)V
    //   247: aload 5
    //   249: astore_1
    //   250: goto -168 -> 82
    //   253: astore 4
    //   255: aconst_null
    //   256: astore_2
    //   257: aload_2
    //   258: astore_3
    //   259: aload_0
    //   260: ldc 74
    //   262: aload 4
    //   264: invokevirtual 61	brt:e	(Ljava/lang/String;Ljava/lang/Object;)V
    //   267: aload_2
    //   268: astore_3
    //   269: aload_1
    //   270: ldc 27
    //   272: invokevirtual 56	android/content/Context:deleteFile	(Ljava/lang/String;)Z
    //   275: pop
    //   276: aload 5
    //   278: astore_1
    //   279: aload_2
    //   280: ifnull -198 -> 82
    //   283: aload_2
    //   284: invokevirtual 52	java/io/FileInputStream:close	()V
    //   287: aload 5
    //   289: astore_1
    //   290: goto -208 -> 82
    //   293: astore_1
    //   294: aload_0
    //   295: ldc 58
    //   297: aload_1
    //   298: invokevirtual 61	brt:e	(Ljava/lang/String;Ljava/lang/Object;)V
    //   301: aload 5
    //   303: astore_1
    //   304: goto -222 -> 82
    //   307: astore_1
    //   308: aconst_null
    //   309: astore_3
    //   310: aload_3
    //   311: ifnull +7 -> 318
    //   314: aload_3
    //   315: invokevirtual 52	java/io/FileInputStream:close	()V
    //   318: aload_1
    //   319: athrow
    //   320: astore_2
    //   321: aload_0
    //   322: ldc 58
    //   324: aload_2
    //   325: invokevirtual 61	brt:e	(Ljava/lang/String;Ljava/lang/Object;)V
    //   328: goto -10 -> 318
    //   331: astore_1
    //   332: goto -22 -> 310
    //   335: astore 4
    //   337: goto -80 -> 257
    //   340: astore_1
    //   341: goto -119 -> 222
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	344	0	this	brt
    //   0	344	1	paramContext	Context
    //   14	270	2	localFileInputStream1	java.io.FileInputStream
    //   320	5	2	localIOException1	IOException
    //   16	299	3	localFileInputStream2	java.io.FileInputStream
    //   170	33	4	str	String
    //   253	10	4	localIOException2	IOException
    //   335	1	4	localIOException3	IOException
    //   1	301	5	localObject	Object
    //   21	156	6	arrayOfByte	byte[]
    //   34	146	7	i	int
    // Exception table:
    //   from	to	target	type
    //   75	79	84	java/io/IOException
    //   135	139	145	java/io/IOException
    //   198	202	208	java/io/IOException
    //   8	15	219	java/io/FileNotFoundException
    //   229	233	239	java/io/IOException
    //   8	15	253	java/io/IOException
    //   283	287	293	java/io/IOException
    //   8	15	307	finally
    //   314	318	320	java/io/IOException
    //   17	23	331	finally
    //   25	36	331	finally
    //   38	45	331	finally
    //   47	53	331	finally
    //   55	59	331	finally
    //   61	68	331	finally
    //   107	113	331	finally
    //   115	119	331	finally
    //   121	128	331	finally
    //   161	165	331	finally
    //   167	172	331	finally
    //   174	184	331	finally
    //   186	194	331	finally
    //   259	267	331	finally
    //   269	276	331	finally
    //   17	23	335	java/io/IOException
    //   25	36	335	java/io/IOException
    //   38	45	335	java/io/IOException
    //   47	53	335	java/io/IOException
    //   55	59	335	java/io/IOException
    //   61	68	335	java/io/IOException
    //   107	113	335	java/io/IOException
    //   115	119	335	java/io/IOException
    //   121	128	335	java/io/IOException
    //   161	165	335	java/io/IOException
    //   167	172	335	java/io/IOException
    //   174	184	335	java/io/IOException
    //   186	194	335	java/io/IOException
    //   17	23	340	java/io/FileNotFoundException
    //   25	36	340	java/io/FileNotFoundException
    //   38	45	340	java/io/FileNotFoundException
    //   47	53	340	java/io/FileNotFoundException
    //   55	59	340	java/io/FileNotFoundException
    //   61	68	340	java/io/FileNotFoundException
    //   107	113	340	java/io/FileNotFoundException
    //   115	119	340	java/io/FileNotFoundException
    //   121	128	340	java/io/FileNotFoundException
    //   161	165	340	java/io/FileNotFoundException
    //   167	172	340	java/io/FileNotFoundException
    //   174	184	340	java/io/FileNotFoundException
    //   186	194	340	java/io/FileNotFoundException
  }
  
  private boolean a(Context paramContext, String paramString)
  {
    boolean bool2 = false;
    a.f(paramString);
    a.h("ClientId should be saved from worker thread");
    Object localObject5 = null;
    Object localObject6 = null;
    Object localObject4 = null;
    Object localObject2 = localObject4;
    Object localObject3 = localObject5;
    Object localObject1 = localObject6;
    for (;;)
    {
      try
      {
        a("Storing clientId", paramString);
        localObject2 = localObject4;
        localObject3 = localObject5;
        localObject1 = localObject6;
        paramContext = paramContext.openFileOutput("gaClientId", 0);
        localObject2 = paramContext;
        localObject3 = paramContext;
        localObject1 = paramContext;
        paramContext.write(paramString.getBytes());
      }
      catch (FileNotFoundException paramContext)
      {
        localObject1 = localObject2;
        e("Error creating clientId file", paramContext);
        bool1 = bool2;
        if (localObject2 == null) {
          continue;
        }
        try
        {
          ((FileOutputStream)localObject2).close();
          bool1 = bool2;
        }
        catch (IOException paramContext)
        {
          e("Failed to close clientId writing stream", paramContext);
          bool1 = bool2;
        }
        continue;
      }
      catch (IOException paramContext)
      {
        localObject1 = localObject3;
        e("Error writing to clientId file", paramContext);
        boolean bool1 = bool2;
        if (localObject3 == null) {
          continue;
        }
        try
        {
          ((FileOutputStream)localObject3).close();
          bool1 = bool2;
        }
        catch (IOException paramContext)
        {
          e("Failed to close clientId writing stream", paramContext);
          bool1 = bool2;
        }
        continue;
      }
      finally
      {
        if (localObject1 == null) {
          break label203;
        }
      }
      try
      {
        paramContext.close();
        bool1 = true;
        return bool1;
      }
      catch (IOException paramContext)
      {
        e("Failed to close clientId writing stream", paramContext);
      }
    }
    try
    {
      ((FileOutputStream)localObject1).close();
      label203:
      throw paramContext;
    }
    catch (IOException paramString)
    {
      for (;;)
      {
        e("Failed to close clientId writing stream", paramString);
      }
    }
  }
  
  protected final void a() {}
  
  /* Error */
  public final String b()
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 112	brt:r	()V
    //   4: aload_0
    //   5: monitorenter
    //   6: aload_0
    //   7: getfield 114	brt:a	Ljava/lang/String;
    //   10: ifnonnull +29 -> 39
    //   13: aload_0
    //   14: getfield 120	bqz:d	Lbrb;
    //   17: invokevirtual 125	brb:b	()Lcox;
    //   20: astore_2
    //   21: new 127	bru
    //   24: astore_1
    //   25: aload_1
    //   26: aload_0
    //   27: invokespecial 130	bru:<init>	(Lbrt;)V
    //   30: aload_0
    //   31: aload_2
    //   32: aload_1
    //   33: invokevirtual 135	cox:a	(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;
    //   36: putfield 137	brt:b	Ljava/util/concurrent/Future;
    //   39: aload_0
    //   40: getfield 137	brt:b	Ljava/util/concurrent/Future;
    //   43: astore_1
    //   44: aload_1
    //   45: ifnull +47 -> 92
    //   48: aload_0
    //   49: aload_0
    //   50: getfield 137	brt:b	Ljava/util/concurrent/Future;
    //   53: invokeinterface 143 1 0
    //   58: checkcast 65	java/lang/String
    //   61: putfield 114	brt:a	Ljava/lang/String;
    //   64: aload_0
    //   65: getfield 114	brt:a	Ljava/lang/String;
    //   68: ifnonnull +9 -> 77
    //   71: aload_0
    //   72: ldc -111
    //   74: putfield 114	brt:a	Ljava/lang/String;
    //   77: aload_0
    //   78: ldc -109
    //   80: aload_0
    //   81: getfield 114	brt:a	Ljava/lang/String;
    //   84: invokevirtual 72	brt:a	(Ljava/lang/String;Ljava/lang/Object;)V
    //   87: aload_0
    //   88: aconst_null
    //   89: putfield 137	brt:b	Ljava/util/concurrent/Future;
    //   92: aload_0
    //   93: getfield 114	brt:a	Ljava/lang/String;
    //   96: astore_1
    //   97: aload_0
    //   98: monitorexit
    //   99: aload_1
    //   100: areturn
    //   101: astore_1
    //   102: aload_0
    //   103: ldc -107
    //   105: aload_1
    //   106: invokevirtual 151	brt:d	(Ljava/lang/String;Ljava/lang/Object;)V
    //   109: aload_0
    //   110: ldc -111
    //   112: putfield 114	brt:a	Ljava/lang/String;
    //   115: goto -51 -> 64
    //   118: astore_1
    //   119: aload_0
    //   120: monitorexit
    //   121: aload_1
    //   122: athrow
    //   123: astore_1
    //   124: aload_0
    //   125: ldc -103
    //   127: aload_1
    //   128: invokevirtual 61	brt:e	(Ljava/lang/String;Ljava/lang/Object;)V
    //   131: aload_0
    //   132: ldc -111
    //   134: putfield 114	brt:a	Ljava/lang/String;
    //   137: goto -73 -> 64
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	140	0	this	brt
    //   24	76	1	localObject1	Object
    //   101	5	1	localInterruptedException	InterruptedException
    //   118	4	1	localObject2	Object
    //   123	5	1	localExecutionException	java.util.concurrent.ExecutionException
    //   20	12	2	localcox	cox
    // Exception table:
    //   from	to	target	type
    //   48	64	101	java/lang/InterruptedException
    //   6	39	118	finally
    //   39	44	118	finally
    //   48	64	118	finally
    //   64	77	118	finally
    //   77	92	118	finally
    //   92	99	118	finally
    //   102	115	118	finally
    //   119	121	118	finally
    //   124	137	118	finally
    //   48	64	123	java/util/concurrent/ExecutionException
  }
  
  final String c()
  {
    try
    {
      this.a = null;
      cox localcox = this.d.b();
      brv localbrv = new brv;
      localbrv.<init>(this);
      this.b = localcox.a(localbrv);
      return b();
    }
    finally {}
  }
  
  final String d()
  {
    String str2 = a(this.d.b().a);
    String str1 = str2;
    if (str2 == null) {
      str1 = e();
    }
    return str1;
  }
  
  String e()
  {
    String str3 = UUID.randomUUID().toString().toLowerCase();
    String str1 = str3;
    try
    {
      if (!a(this.d.b().a, str3)) {
        str1 = "0";
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        e("Error saving clientId file", localException);
        String str2 = "0";
      }
    }
    return str1;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\brt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */