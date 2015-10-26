import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.TreeMap;
import org.apache.http.Header;
import org.apache.http.HttpEntity;

public final class aej
  implements adm
{
  private static boolean a = aeg.a;
  private static int b = 3000;
  private static int c = 4096;
  private aep d;
  private aek e;
  
  public aej(aep paramaep)
  {
    this(paramaep, new aek(c));
  }
  
  private aej(aep paramaep, aek paramaek)
  {
    this.d = paramaep;
    this.e = paramaek;
  }
  
  private static Map a(Header[] paramArrayOfHeader)
  {
    TreeMap localTreeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
    for (int i = 0; i < paramArrayOfHeader.length; i++) {
      localTreeMap.put(paramArrayOfHeader[i].getName(), paramArrayOfHeader[i].getValue());
    }
    return localTreeMap;
  }
  
  private static void a(String paramString, ads paramads, aef paramaef)
  {
    aec localaec = paramads.i;
    int i = paramads.f();
    try
    {
      localaec.a(paramaef);
      paramads.a(String.format("%s-retry [timeout=%s]", new Object[] { paramString, Integer.valueOf(i) }));
      return;
    }
    catch (aef paramaef)
    {
      paramads.a(String.format("%s-timeout-giveup [timeout=%s]", new Object[] { paramString, Integer.valueOf(i) }));
      throw paramaef;
    }
  }
  
  private byte[] a(HttpEntity paramHttpEntity)
  {
    afa localafa = new afa(this.e, (int)paramHttpEntity.getContentLength());
    Object localObject2 = null;
    Object localObject1 = localObject2;
    Object localObject4;
    try
    {
      localObject4 = paramHttpEntity.getContent();
      if (localObject4 == null)
      {
        localObject1 = localObject2;
        localObject4 = new aed;
        localObject1 = localObject2;
        ((aed)localObject4).<init>();
        localObject1 = localObject2;
        throw ((Throwable)localObject4);
      }
    }
    finally {}
    try
    {
      paramHttpEntity.consumeContent();
      this.e.a((byte[])localObject1);
      localafa.close();
      throw ((Throwable)localObject3);
      localObject1 = localObject3;
      byte[] arrayOfByte = this.e.a(1024);
      for (;;)
      {
        localObject1 = arrayOfByte;
        int i = ((InputStream)localObject4).read(arrayOfByte);
        if (i == -1) {
          break;
        }
        localObject1 = arrayOfByte;
        localafa.write(arrayOfByte, 0, i);
      }
      localObject1 = arrayOfByte;
      localObject4 = localafa.toByteArray();
      try
      {
        paramHttpEntity.consumeContent();
        this.e.a(arrayOfByte);
        localafa.close();
        return (byte[])localObject4;
      }
      catch (IOException paramHttpEntity)
      {
        for (;;)
        {
          aeg.a("Error occured when calling consumingContent", new Object[0]);
        }
      }
    }
    catch (IOException paramHttpEntity)
    {
      for (;;)
      {
        aeg.a("Error occured when calling consumingContent", new Object[0]);
      }
    }
  }
  
  /* Error */
  public final adp a(ads paramads)
  {
    // Byte code:
    //   0: invokestatic 169	android/os/SystemClock:elapsedRealtime	()J
    //   3: lstore 10
    //   5: aconst_null
    //   6: astore 6
    //   8: invokestatic 175	java/util/Collections:emptyMap	()Ljava/util/Map;
    //   11: astore 4
    //   13: new 177	java/util/HashMap
    //   16: astore_2
    //   17: aload_2
    //   18: invokespecial 178	java/util/HashMap:<init>	()V
    //   21: aload_1
    //   22: getfield 182	ads:j	Ladh;
    //   25: astore 5
    //   27: aload 5
    //   29: ifnull +61 -> 90
    //   32: aload 5
    //   34: getfield 187	adh:b	Ljava/lang/String;
    //   37: ifnull +17 -> 54
    //   40: aload_2
    //   41: ldc -67
    //   43: aload 5
    //   45: getfield 187	adh:b	Ljava/lang/String;
    //   48: invokeinterface 70 3 0
    //   53: pop
    //   54: aload 5
    //   56: getfield 192	adh:d	J
    //   59: lconst_0
    //   60: lcmp
    //   61: ifle +29 -> 90
    //   64: new 194	java/util/Date
    //   67: astore_3
    //   68: aload_3
    //   69: aload 5
    //   71: getfield 192	adh:d	J
    //   74: invokespecial 197	java/util/Date:<init>	(J)V
    //   77: aload_2
    //   78: ldc -57
    //   80: aload_3
    //   81: invokestatic 205	org/apache/http/impl/cookie/DateUtils:formatDate	(Ljava/util/Date;)Ljava/lang/String;
    //   84: invokeinterface 70 3 0
    //   89: pop
    //   90: aload_0
    //   91: getfield 41	aej:d	Laep;
    //   94: aload_1
    //   95: aload_2
    //   96: invokeinterface 210 3 0
    //   101: astore_3
    //   102: aload 4
    //   104: astore_2
    //   105: aload_3
    //   106: invokeinterface 216 1 0
    //   111: astore 5
    //   113: aload 4
    //   115: astore_2
    //   116: aload 5
    //   118: invokeinterface 221 1 0
    //   123: istore 7
    //   125: aload 4
    //   127: astore_2
    //   128: aload_3
    //   129: invokeinterface 225 1 0
    //   134: invokestatic 227	aej:a	([Lorg/apache/http/Header;)Ljava/util/Map;
    //   137: astore 6
    //   139: iload 7
    //   141: sipush 304
    //   144: if_icmpne +100 -> 244
    //   147: aload 6
    //   149: astore_2
    //   150: aload_1
    //   151: getfield 182	ads:j	Ladh;
    //   154: astore 4
    //   156: aload 4
    //   158: ifnonnull +33 -> 191
    //   161: aload 6
    //   163: astore_2
    //   164: new 229	adp
    //   167: dup
    //   168: sipush 304
    //   171: aconst_null
    //   172: aload 6
    //   174: iconst_1
    //   175: invokestatic 169	android/os/SystemClock:elapsedRealtime	()J
    //   178: lload 10
    //   180: lsub
    //   181: invokespecial 232	adp:<init>	(I[BLjava/util/Map;ZJ)V
    //   184: astore 4
    //   186: aload 4
    //   188: astore_1
    //   189: aload_1
    //   190: areturn
    //   191: aload 6
    //   193: astore_2
    //   194: aload 4
    //   196: getfield 236	adh:g	Ljava/util/Map;
    //   199: aload 6
    //   201: invokeinterface 240 2 0
    //   206: aload 6
    //   208: astore_2
    //   209: new 229	adp
    //   212: dup
    //   213: sipush 304
    //   216: aload 4
    //   218: getfield 243	adh:a	[B
    //   221: aload 4
    //   223: getfield 236	adh:g	Ljava/util/Map;
    //   226: iconst_1
    //   227: invokestatic 169	android/os/SystemClock:elapsedRealtime	()J
    //   230: lload 10
    //   232: lsub
    //   233: invokespecial 232	adp:<init>	(I[BLjava/util/Map;ZJ)V
    //   236: astore 4
    //   238: aload 4
    //   240: astore_1
    //   241: goto -52 -> 189
    //   244: aload 6
    //   246: astore_2
    //   247: aload_3
    //   248: invokeinterface 247 1 0
    //   253: ifnull +155 -> 408
    //   256: aload 6
    //   258: astore_2
    //   259: aload_0
    //   260: aload_3
    //   261: invokeinterface 247 1 0
    //   266: invokespecial 249	aej:a	(Lorg/apache/http/HttpEntity;)[B
    //   269: astore 4
    //   271: aload 4
    //   273: astore_2
    //   274: invokestatic 169	android/os/SystemClock:elapsedRealtime	()J
    //   277: lload 10
    //   279: lsub
    //   280: lstore 8
    //   282: getstatic 22	aej:a	Z
    //   285: ifne +13 -> 298
    //   288: lload 8
    //   290: getstatic 24	aej:b	I
    //   293: i2l
    //   294: lcmp
    //   295: ifle +66 -> 361
    //   298: aload_2
    //   299: ifnull +123 -> 422
    //   302: aload_2
    //   303: arraylength
    //   304: invokestatic 96	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   307: astore 4
    //   309: ldc -5
    //   311: iconst_5
    //   312: anewarray 4	java/lang/Object
    //   315: dup
    //   316: iconst_0
    //   317: aload_1
    //   318: aastore
    //   319: dup
    //   320: iconst_1
    //   321: lload 8
    //   323: invokestatic 256	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   326: aastore
    //   327: dup
    //   328: iconst_2
    //   329: aload 4
    //   331: aastore
    //   332: dup
    //   333: iconst_3
    //   334: aload 5
    //   336: invokeinterface 221 1 0
    //   341: invokestatic 96	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   344: aastore
    //   345: dup
    //   346: iconst_4
    //   347: aload_1
    //   348: getfield 79	ads:i	Laec;
    //   351: invokevirtual 258	aec:b	()I
    //   354: invokestatic 96	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   357: aastore
    //   358: invokestatic 260	aeg:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   361: iload 7
    //   363: sipush 200
    //   366: if_icmplt +11 -> 377
    //   369: iload 7
    //   371: sipush 299
    //   374: if_icmple +56 -> 430
    //   377: new 108	java/io/IOException
    //   380: astore 4
    //   382: aload 4
    //   384: invokespecial 261	java/io/IOException:<init>	()V
    //   387: aload 4
    //   389: athrow
    //   390: astore_2
    //   391: ldc_w 263
    //   394: aload_1
    //   395: new 265	aee
    //   398: dup
    //   399: invokespecial 266	aee:<init>	()V
    //   402: invokestatic 268	aej:a	(Ljava/lang/String;Lads;Laef;)V
    //   405: goto -400 -> 5
    //   408: aload 6
    //   410: astore_2
    //   411: iconst_0
    //   412: newarray <illegal type>
    //   414: astore 4
    //   416: aload 4
    //   418: astore_2
    //   419: goto -145 -> 274
    //   422: ldc_w 270
    //   425: astore 4
    //   427: goto -118 -> 309
    //   430: new 229	adp
    //   433: dup
    //   434: iload 7
    //   436: aload_2
    //   437: aload 6
    //   439: iconst_0
    //   440: invokestatic 169	android/os/SystemClock:elapsedRealtime	()J
    //   443: lload 10
    //   445: lsub
    //   446: invokespecial 232	adp:<init>	(I[BLjava/util/Map;ZJ)V
    //   449: astore 4
    //   451: aload 4
    //   453: astore_1
    //   454: goto -265 -> 189
    //   457: astore_2
    //   458: ldc_w 272
    //   461: aload_1
    //   462: new 265	aee
    //   465: dup
    //   466: invokespecial 266	aee:<init>	()V
    //   469: invokestatic 268	aej:a	(Ljava/lang/String;Lads;Laef;)V
    //   472: goto -467 -> 5
    //   475: astore_2
    //   476: new 274	java/lang/RuntimeException
    //   479: dup
    //   480: new 276	java/lang/StringBuilder
    //   483: dup
    //   484: ldc_w 278
    //   487: invokespecial 280	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   490: aload_1
    //   491: getfield 281	ads:b	Ljava/lang/String;
    //   494: invokevirtual 285	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   497: invokevirtual 288	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   500: aload_2
    //   501: invokespecial 291	java/lang/RuntimeException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   504: athrow
    //   505: astore_3
    //   506: aconst_null
    //   507: astore 5
    //   509: aload 4
    //   511: astore_2
    //   512: aload 6
    //   514: astore 4
    //   516: aload 4
    //   518: ifnull +101 -> 619
    //   521: aload 4
    //   523: invokeinterface 216 1 0
    //   528: invokeinterface 221 1 0
    //   533: istore 7
    //   535: ldc_w 293
    //   538: iconst_2
    //   539: anewarray 4	java/lang/Object
    //   542: dup
    //   543: iconst_0
    //   544: iload 7
    //   546: invokestatic 96	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   549: aastore
    //   550: dup
    //   551: iconst_1
    //   552: aload_1
    //   553: getfield 281	ads:b	Ljava/lang/String;
    //   556: aastore
    //   557: invokestatic 295	aeg:c	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   560: aload 5
    //   562: ifnull +75 -> 637
    //   565: new 229	adp
    //   568: dup
    //   569: iload 7
    //   571: aload 5
    //   573: aload_2
    //   574: iconst_0
    //   575: invokestatic 169	android/os/SystemClock:elapsedRealtime	()J
    //   578: lload 10
    //   580: lsub
    //   581: invokespecial 232	adp:<init>	(I[BLjava/util/Map;ZJ)V
    //   584: astore_2
    //   585: iload 7
    //   587: sipush 401
    //   590: if_icmpeq +11 -> 601
    //   593: iload 7
    //   595: sipush 403
    //   598: if_icmpne +30 -> 628
    //   601: ldc_w 297
    //   604: aload_1
    //   605: new 299	adf
    //   608: dup
    //   609: aload_2
    //   610: invokespecial 302	adf:<init>	(Ladp;)V
    //   613: invokestatic 268	aej:a	(Ljava/lang/String;Lads;Laef;)V
    //   616: goto -611 -> 5
    //   619: new 304	adq
    //   622: dup
    //   623: aload_3
    //   624: invokespecial 307	adq:<init>	(Ljava/lang/Throwable;)V
    //   627: athrow
    //   628: new 125	aed
    //   631: dup
    //   632: aload_2
    //   633: invokespecial 308	aed:<init>	(Ladp;)V
    //   636: athrow
    //   637: new 310	ado
    //   640: dup
    //   641: aconst_null
    //   642: invokespecial 311	ado:<init>	(Ladp;)V
    //   645: athrow
    //   646: astore 5
    //   648: aconst_null
    //   649: astore 6
    //   651: aload_3
    //   652: astore 4
    //   654: aload 5
    //   656: astore_3
    //   657: aload 6
    //   659: astore 5
    //   661: goto -145 -> 516
    //   664: astore 5
    //   666: aload_3
    //   667: astore 4
    //   669: aload 5
    //   671: astore_3
    //   672: aload_2
    //   673: astore 5
    //   675: aload 6
    //   677: astore_2
    //   678: goto -162 -> 516
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	681	0	this	aej
    //   0	681	1	paramads	ads
    //   16	287	2	localObject1	Object
    //   390	1	2	localSocketTimeoutException	java.net.SocketTimeoutException
    //   410	27	2	localObject2	Object
    //   457	1	2	localConnectTimeoutException	org.apache.http.conn.ConnectTimeoutException
    //   475	26	2	localMalformedURLException	java.net.MalformedURLException
    //   511	167	2	localObject3	Object
    //   67	194	3	localObject4	Object
    //   505	147	3	localIOException1	IOException
    //   656	16	3	localIOException2	IOException
    //   11	657	4	localObject5	Object
    //   25	547	5	localObject6	Object
    //   646	9	5	localIOException3	IOException
    //   659	1	5	localMap1	Map
    //   664	6	5	localIOException4	IOException
    //   673	1	5	localObject7	Object
    //   6	670	6	localMap2	Map
    //   123	476	7	i	int
    //   280	42	8	l1	long
    //   3	576	10	l2	long
    // Exception table:
    //   from	to	target	type
    //   13	27	390	java/net/SocketTimeoutException
    //   32	54	390	java/net/SocketTimeoutException
    //   54	90	390	java/net/SocketTimeoutException
    //   90	102	390	java/net/SocketTimeoutException
    //   105	113	390	java/net/SocketTimeoutException
    //   116	125	390	java/net/SocketTimeoutException
    //   128	139	390	java/net/SocketTimeoutException
    //   150	156	390	java/net/SocketTimeoutException
    //   164	186	390	java/net/SocketTimeoutException
    //   194	206	390	java/net/SocketTimeoutException
    //   209	238	390	java/net/SocketTimeoutException
    //   247	256	390	java/net/SocketTimeoutException
    //   259	271	390	java/net/SocketTimeoutException
    //   274	298	390	java/net/SocketTimeoutException
    //   302	309	390	java/net/SocketTimeoutException
    //   309	361	390	java/net/SocketTimeoutException
    //   377	390	390	java/net/SocketTimeoutException
    //   411	416	390	java/net/SocketTimeoutException
    //   430	451	390	java/net/SocketTimeoutException
    //   13	27	457	org/apache/http/conn/ConnectTimeoutException
    //   32	54	457	org/apache/http/conn/ConnectTimeoutException
    //   54	90	457	org/apache/http/conn/ConnectTimeoutException
    //   90	102	457	org/apache/http/conn/ConnectTimeoutException
    //   105	113	457	org/apache/http/conn/ConnectTimeoutException
    //   116	125	457	org/apache/http/conn/ConnectTimeoutException
    //   128	139	457	org/apache/http/conn/ConnectTimeoutException
    //   150	156	457	org/apache/http/conn/ConnectTimeoutException
    //   164	186	457	org/apache/http/conn/ConnectTimeoutException
    //   194	206	457	org/apache/http/conn/ConnectTimeoutException
    //   209	238	457	org/apache/http/conn/ConnectTimeoutException
    //   247	256	457	org/apache/http/conn/ConnectTimeoutException
    //   259	271	457	org/apache/http/conn/ConnectTimeoutException
    //   274	298	457	org/apache/http/conn/ConnectTimeoutException
    //   302	309	457	org/apache/http/conn/ConnectTimeoutException
    //   309	361	457	org/apache/http/conn/ConnectTimeoutException
    //   377	390	457	org/apache/http/conn/ConnectTimeoutException
    //   411	416	457	org/apache/http/conn/ConnectTimeoutException
    //   430	451	457	org/apache/http/conn/ConnectTimeoutException
    //   13	27	475	java/net/MalformedURLException
    //   32	54	475	java/net/MalformedURLException
    //   54	90	475	java/net/MalformedURLException
    //   90	102	475	java/net/MalformedURLException
    //   105	113	475	java/net/MalformedURLException
    //   116	125	475	java/net/MalformedURLException
    //   128	139	475	java/net/MalformedURLException
    //   150	156	475	java/net/MalformedURLException
    //   164	186	475	java/net/MalformedURLException
    //   194	206	475	java/net/MalformedURLException
    //   209	238	475	java/net/MalformedURLException
    //   247	256	475	java/net/MalformedURLException
    //   259	271	475	java/net/MalformedURLException
    //   274	298	475	java/net/MalformedURLException
    //   302	309	475	java/net/MalformedURLException
    //   309	361	475	java/net/MalformedURLException
    //   377	390	475	java/net/MalformedURLException
    //   411	416	475	java/net/MalformedURLException
    //   430	451	475	java/net/MalformedURLException
    //   13	27	505	java/io/IOException
    //   32	54	505	java/io/IOException
    //   54	90	505	java/io/IOException
    //   90	102	505	java/io/IOException
    //   105	113	646	java/io/IOException
    //   116	125	646	java/io/IOException
    //   128	139	646	java/io/IOException
    //   150	156	646	java/io/IOException
    //   164	186	646	java/io/IOException
    //   194	206	646	java/io/IOException
    //   209	238	646	java/io/IOException
    //   247	256	646	java/io/IOException
    //   259	271	646	java/io/IOException
    //   411	416	646	java/io/IOException
    //   274	298	664	java/io/IOException
    //   302	309	664	java/io/IOException
    //   309	361	664	java/io/IOException
    //   377	390	664	java/io/IOException
    //   430	451	664	java/io/IOException
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\aej.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */