import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Build.VERSION;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

final class bqn
  extends bra
{
  private static final byte[] c = "\n".getBytes();
  private final String a = String.format("%s/%s (Linux; U; Android %s; %s; %s Build/%s)", new Object[] { "GoogleAnalytics", "4.5.0", Build.VERSION.RELEASE, bqs.a(Locale.getDefault()), Build.MODEL, Build.ID });
  private final bqr b;
  
  bqn(brb parambrb)
  {
    super(parambrb);
    this.b = new bqr(parambrb.c);
  }
  
  private int a(URL paramURL)
  {
    a.c(paramURL);
    b("GET request", paramURL);
    localObject = null;
    localURL = null;
    try
    {
      paramURL = b(paramURL);
      localURL = paramURL;
      localObject = paramURL;
      paramURL.connect();
      localURL = paramURL;
      localObject = paramURL;
      a(paramURL);
      localURL = paramURL;
      localObject = paramURL;
      int j = paramURL.getResponseCode();
      if (j == 200)
      {
        localURL = paramURL;
        localObject = paramURL;
        this.d.c().e();
      }
      localURL = paramURL;
      localObject = paramURL;
      b("GET status", Integer.valueOf(j));
      i = j;
      if (paramURL != null)
      {
        paramURL.disconnect();
        i = j;
      }
    }
    catch (IOException paramURL)
    {
      for (;;)
      {
        localObject = localURL;
        d("Network GET connection error", paramURL);
        if (localURL != null) {
          localURL.disconnect();
        }
        int i = 0;
      }
    }
    finally
    {
      if (localObject == null) {
        break label138;
      }
      ((HttpURLConnection)localObject).disconnect();
    }
    return i;
  }
  
  /* Error */
  private int a(URL paramURL, byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 4
    //   3: aconst_null
    //   4: astore 6
    //   6: aconst_null
    //   7: astore 7
    //   9: aconst_null
    //   10: astore 5
    //   12: aload_1
    //   13: invokestatic 84	a:c	(Ljava/lang/Object;)Ljava/lang/Object;
    //   16: pop
    //   17: aload_2
    //   18: invokestatic 84	a:c	(Ljava/lang/Object;)Ljava/lang/Object;
    //   21: pop
    //   22: aload_0
    //   23: ldc -120
    //   25: aload_2
    //   26: arraylength
    //   27: invokestatic 126	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   30: aload_1
    //   31: invokevirtual 139	bqn:b	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   34: invokestatic 143	bqn:p	()Z
    //   37: ifeq +17 -> 54
    //   40: aload_0
    //   41: ldc -111
    //   43: new 16	java/lang/String
    //   46: dup
    //   47: aload_2
    //   48: invokespecial 148	java/lang/String:<init>	([B)V
    //   51: invokevirtual 150	bqn:a	(Ljava/lang/String;Ljava/lang/Object;)V
    //   54: aload_0
    //   55: aload_1
    //   56: invokespecial 92	bqn:b	(Ljava/net/URL;)Ljava/net/HttpURLConnection;
    //   59: astore_1
    //   60: aload_1
    //   61: astore 4
    //   63: aload 6
    //   65: astore_1
    //   66: aload 4
    //   68: astore_3
    //   69: aload 7
    //   71: astore 5
    //   73: aload 4
    //   75: iconst_1
    //   76: invokevirtual 154	java/net/HttpURLConnection:setDoOutput	(Z)V
    //   79: aload 6
    //   81: astore_1
    //   82: aload 4
    //   84: astore_3
    //   85: aload 7
    //   87: astore 5
    //   89: aload 4
    //   91: aload_2
    //   92: arraylength
    //   93: invokevirtual 158	java/net/HttpURLConnection:setFixedLengthStreamingMode	(I)V
    //   96: aload 6
    //   98: astore_1
    //   99: aload 4
    //   101: astore_3
    //   102: aload 7
    //   104: astore 5
    //   106: aload 4
    //   108: invokevirtual 97	java/net/HttpURLConnection:connect	()V
    //   111: aload 6
    //   113: astore_1
    //   114: aload 4
    //   116: astore_3
    //   117: aload 7
    //   119: astore 5
    //   121: aload 4
    //   123: invokevirtual 162	java/net/HttpURLConnection:getOutputStream	()Ljava/io/OutputStream;
    //   126: astore 6
    //   128: aload 6
    //   130: astore_1
    //   131: aload 4
    //   133: astore_3
    //   134: aload 6
    //   136: astore 5
    //   138: aload 6
    //   140: aload_2
    //   141: invokevirtual 167	java/io/OutputStream:write	([B)V
    //   144: aload 6
    //   146: astore_1
    //   147: aload 4
    //   149: astore_3
    //   150: aload 6
    //   152: astore 5
    //   154: aload_0
    //   155: aload 4
    //   157: invokespecial 100	bqn:a	(Ljava/net/HttpURLConnection;)V
    //   160: aload 6
    //   162: astore_1
    //   163: aload 4
    //   165: astore_3
    //   166: aload 6
    //   168: astore 5
    //   170: aload 4
    //   172: invokevirtual 104	java/net/HttpURLConnection:getResponseCode	()I
    //   175: istore 9
    //   177: iload 9
    //   179: sipush 200
    //   182: if_icmpne +23 -> 205
    //   185: aload 6
    //   187: astore_1
    //   188: aload 4
    //   190: astore_3
    //   191: aload 6
    //   193: astore 5
    //   195: aload_0
    //   196: getfield 110	bqz:d	Lbrb;
    //   199: invokevirtual 113	brb:c	()Lbqu;
    //   202: invokevirtual 118	bqu:e	()V
    //   205: aload 6
    //   207: astore_1
    //   208: aload 4
    //   210: astore_3
    //   211: aload 6
    //   213: astore 5
    //   215: aload_0
    //   216: ldc -87
    //   218: iload 9
    //   220: invokestatic 126	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   223: invokevirtual 89	bqn:b	(Ljava/lang/String;Ljava/lang/Object;)V
    //   226: aload 6
    //   228: ifnull +8 -> 236
    //   231: aload 6
    //   233: invokevirtual 172	java/io/OutputStream:close	()V
    //   236: iload 9
    //   238: istore 8
    //   240: aload 4
    //   242: ifnull +12 -> 254
    //   245: aload 4
    //   247: invokevirtual 129	java/net/HttpURLConnection:disconnect	()V
    //   250: iload 9
    //   252: istore 8
    //   254: iload 8
    //   256: ireturn
    //   257: astore_1
    //   258: aload_0
    //   259: ldc -82
    //   261: aload_1
    //   262: invokevirtual 176	bqn:e	(Ljava/lang/String;Ljava/lang/Object;)V
    //   265: goto -29 -> 236
    //   268: astore_2
    //   269: aconst_null
    //   270: astore 4
    //   272: aload 5
    //   274: astore_1
    //   275: aload 4
    //   277: astore_3
    //   278: aload_0
    //   279: ldc -78
    //   281: aload_2
    //   282: invokevirtual 133	bqn:d	(Ljava/lang/String;Ljava/lang/Object;)V
    //   285: aload 5
    //   287: ifnull +8 -> 295
    //   290: aload 5
    //   292: invokevirtual 172	java/io/OutputStream:close	()V
    //   295: aload 4
    //   297: ifnull +8 -> 305
    //   300: aload 4
    //   302: invokevirtual 129	java/net/HttpURLConnection:disconnect	()V
    //   305: iconst_0
    //   306: istore 8
    //   308: goto -54 -> 254
    //   311: astore_1
    //   312: aload_0
    //   313: ldc -82
    //   315: aload_1
    //   316: invokevirtual 176	bqn:e	(Ljava/lang/String;Ljava/lang/Object;)V
    //   319: goto -24 -> 295
    //   322: astore_2
    //   323: aconst_null
    //   324: astore_3
    //   325: aload 4
    //   327: astore_1
    //   328: aload_1
    //   329: ifnull +7 -> 336
    //   332: aload_1
    //   333: invokevirtual 172	java/io/OutputStream:close	()V
    //   336: aload_3
    //   337: ifnull +7 -> 344
    //   340: aload_3
    //   341: invokevirtual 129	java/net/HttpURLConnection:disconnect	()V
    //   344: aload_2
    //   345: athrow
    //   346: astore_1
    //   347: aload_0
    //   348: ldc -82
    //   350: aload_1
    //   351: invokevirtual 176	bqn:e	(Ljava/lang/String;Ljava/lang/Object;)V
    //   354: goto -18 -> 336
    //   357: astore_2
    //   358: goto -30 -> 328
    //   361: astore_2
    //   362: goto -90 -> 272
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	365	0	this	bqn
    //   0	365	1	paramURL	URL
    //   0	365	2	paramArrayOfByte	byte[]
    //   68	273	3	localURL1	URL
    //   1	325	4	localURL2	URL
    //   10	281	5	localObject1	Object
    //   4	228	6	localOutputStream	java.io.OutputStream
    //   7	111	7	localObject2	Object
    //   238	69	8	i	int
    //   175	76	9	j	int
    // Exception table:
    //   from	to	target	type
    //   231	236	257	java/io/IOException
    //   54	60	268	java/io/IOException
    //   290	295	311	java/io/IOException
    //   54	60	322	finally
    //   332	336	346	java/io/IOException
    //   73	79	357	finally
    //   89	96	357	finally
    //   106	111	357	finally
    //   121	128	357	finally
    //   138	144	357	finally
    //   154	160	357	finally
    //   170	177	357	finally
    //   195	205	357	finally
    //   215	226	357	finally
    //   278	285	357	finally
    //   73	79	361	java/io/IOException
    //   89	96	361	java/io/IOException
    //   106	111	361	java/io/IOException
    //   121	128	361	java/io/IOException
    //   138	144	361	java/io/IOException
    //   154	160	361	java/io/IOException
    //   170	177	361	java/io/IOException
    //   195	205	361	java/io/IOException
    //   215	226	361	java/io/IOException
  }
  
  private URL a(bsi parambsi)
  {
    if (parambsi.f) {}
    for (parambsi = brz.h() + brz.j();; parambsi = brz.i() + brz.j())
    {
      try
      {
        URL localURL = new java/net/URL;
        localURL.<init>(parambsi);
        parambsi = localURL;
      }
      catch (MalformedURLException parambsi)
      {
        for (;;)
        {
          e("Error trying to parse the hardcoded host url", parambsi);
          parambsi = null;
        }
      }
      return parambsi;
    }
  }
  
  private URL a(bsi parambsi, String paramString)
  {
    if (parambsi.f) {}
    for (parambsi = brz.h() + brz.j() + "?" + paramString;; parambsi = brz.i() + brz.j() + "?" + paramString)
    {
      try
      {
        paramString = new java/net/URL;
        paramString.<init>(parambsi);
        parambsi = paramString;
      }
      catch (MalformedURLException parambsi)
      {
        for (;;)
        {
          e("Error trying to parse the hardcoded host url", parambsi);
          parambsi = null;
        }
      }
      return parambsi;
    }
  }
  
  private static void a(StringBuilder paramStringBuilder, String paramString1, String paramString2)
  {
    if (paramStringBuilder.length() != 0) {
      paramStringBuilder.append('&');
    }
    paramStringBuilder.append(URLEncoder.encode(paramString1, "UTF-8"));
    paramStringBuilder.append('=');
    paramStringBuilder.append(URLEncoder.encode(paramString2, "UTF-8"));
  }
  
  private void a(HttpURLConnection paramHttpURLConnection)
  {
    localHttpURLConnection = null;
    try
    {
      paramHttpURLConnection = paramHttpURLConnection.getInputStream();
      localHttpURLConnection = paramHttpURLConnection;
      byte[] arrayOfByte = new byte['Ѐ'];
      int i;
      do
      {
        localHttpURLConnection = paramHttpURLConnection;
        i = paramHttpURLConnection.read(arrayOfByte);
      } while (i > 0);
      if (paramHttpURLConnection != null) {}
      try
      {
        paramHttpURLConnection.close();
        return;
      }
      catch (IOException paramHttpURLConnection)
      {
        for (;;)
        {
          e("Error closing http connection input stream", paramHttpURLConnection);
        }
      }
      try
      {
        localHttpURLConnection.close();
        throw paramHttpURLConnection;
      }
      catch (IOException localIOException)
      {
        for (;;)
        {
          e("Error closing http connection input stream", localIOException);
        }
      }
    }
    finally
    {
      if (localHttpURLConnection == null) {}
    }
  }
  
  /* Error */
  private int b(URL paramURL, byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 4
    //   3: aconst_null
    //   4: astore_3
    //   5: aload_1
    //   6: invokestatic 84	a:c	(Ljava/lang/Object;)Ljava/lang/Object;
    //   9: pop
    //   10: aload_2
    //   11: invokestatic 84	a:c	(Ljava/lang/Object;)Ljava/lang/Object;
    //   14: pop
    //   15: new 250	java/io/ByteArrayOutputStream
    //   18: astore 5
    //   20: aload 5
    //   22: invokespecial 251	java/io/ByteArrayOutputStream:<init>	()V
    //   25: new 253	java/util/zip/GZIPOutputStream
    //   28: astore 6
    //   30: aload 6
    //   32: aload 5
    //   34: invokespecial 256	java/util/zip/GZIPOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   37: aload 6
    //   39: aload_2
    //   40: invokevirtual 257	java/util/zip/GZIPOutputStream:write	([B)V
    //   43: aload 6
    //   45: invokevirtual 258	java/util/zip/GZIPOutputStream:close	()V
    //   48: aload 5
    //   50: invokevirtual 259	java/io/ByteArrayOutputStream:close	()V
    //   53: aload 5
    //   55: invokevirtual 262	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   58: astore 5
    //   60: aload_0
    //   61: ldc_w 264
    //   64: aload 5
    //   66: arraylength
    //   67: invokestatic 126	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   70: ldc2_w 265
    //   73: aload 5
    //   75: arraylength
    //   76: i2l
    //   77: lmul
    //   78: aload_2
    //   79: arraylength
    //   80: i2l
    //   81: ldiv
    //   82: invokestatic 271	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   85: aload_1
    //   86: invokevirtual 274	bqn:a	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   89: aload 5
    //   91: arraylength
    //   92: aload_2
    //   93: arraylength
    //   94: if_icmple +21 -> 115
    //   97: aload_0
    //   98: ldc_w 276
    //   101: aload 5
    //   103: arraylength
    //   104: invokestatic 126	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   107: aload_2
    //   108: arraylength
    //   109: invokestatic 126	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   112: invokevirtual 278	bqn:c	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   115: invokestatic 143	bqn:p	()Z
    //   118: ifeq +43 -> 161
    //   121: new 189	java/lang/StringBuilder
    //   124: astore 7
    //   126: aload 7
    //   128: ldc 14
    //   130: invokespecial 279	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   133: new 16	java/lang/String
    //   136: astore 6
    //   138: aload 6
    //   140: aload_2
    //   141: invokespecial 148	java/lang/String:<init>	([B)V
    //   144: aload_0
    //   145: ldc_w 281
    //   148: aload 7
    //   150: aload 6
    //   152: invokevirtual 201	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   155: invokevirtual 207	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   158: invokevirtual 150	bqn:a	(Ljava/lang/String;Ljava/lang/Object;)V
    //   161: aload_0
    //   162: aload_1
    //   163: invokespecial 92	bqn:b	(Ljava/net/URL;)Ljava/net/HttpURLConnection;
    //   166: astore_1
    //   167: aload_1
    //   168: iconst_1
    //   169: invokevirtual 154	java/net/HttpURLConnection:setDoOutput	(Z)V
    //   172: aload_1
    //   173: ldc_w 283
    //   176: ldc_w 285
    //   179: invokevirtual 289	java/net/HttpURLConnection:addRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   182: aload_1
    //   183: aload 5
    //   185: arraylength
    //   186: invokevirtual 158	java/net/HttpURLConnection:setFixedLengthStreamingMode	(I)V
    //   189: aload_1
    //   190: invokevirtual 97	java/net/HttpURLConnection:connect	()V
    //   193: aload_1
    //   194: invokevirtual 162	java/net/HttpURLConnection:getOutputStream	()Ljava/io/OutputStream;
    //   197: astore_2
    //   198: aload_2
    //   199: aload 5
    //   201: invokevirtual 167	java/io/OutputStream:write	([B)V
    //   204: aload_2
    //   205: invokevirtual 172	java/io/OutputStream:close	()V
    //   208: aload_0
    //   209: aload_1
    //   210: invokespecial 100	bqn:a	(Ljava/net/HttpURLConnection;)V
    //   213: aload_1
    //   214: invokevirtual 104	java/net/HttpURLConnection:getResponseCode	()I
    //   217: istore 9
    //   219: iload 9
    //   221: sipush 200
    //   224: if_icmpne +13 -> 237
    //   227: aload_0
    //   228: getfield 110	bqz:d	Lbrb;
    //   231: invokevirtual 113	brb:c	()Lbqu;
    //   234: invokevirtual 118	bqu:e	()V
    //   237: aload_0
    //   238: ldc -87
    //   240: iload 9
    //   242: invokestatic 126	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   245: invokevirtual 89	bqn:b	(Ljava/lang/String;Ljava/lang/Object;)V
    //   248: iload 9
    //   250: istore 8
    //   252: aload_1
    //   253: ifnull +11 -> 264
    //   256: aload_1
    //   257: invokevirtual 129	java/net/HttpURLConnection:disconnect	()V
    //   260: iload 9
    //   262: istore 8
    //   264: iload 8
    //   266: ireturn
    //   267: astore_2
    //   268: aconst_null
    //   269: astore_1
    //   270: aload_0
    //   271: ldc_w 291
    //   274: aload_2
    //   275: invokevirtual 133	bqn:d	(Ljava/lang/String;Ljava/lang/Object;)V
    //   278: aload_3
    //   279: ifnull +7 -> 286
    //   282: aload_3
    //   283: invokevirtual 172	java/io/OutputStream:close	()V
    //   286: aload_1
    //   287: ifnull +7 -> 294
    //   290: aload_1
    //   291: invokevirtual 129	java/net/HttpURLConnection:disconnect	()V
    //   294: iconst_0
    //   295: istore 8
    //   297: goto -33 -> 264
    //   300: astore_2
    //   301: aload_0
    //   302: ldc_w 293
    //   305: aload_2
    //   306: invokevirtual 176	bqn:e	(Ljava/lang/String;Ljava/lang/Object;)V
    //   309: goto -23 -> 286
    //   312: astore_2
    //   313: aconst_null
    //   314: astore_1
    //   315: aload 4
    //   317: astore_3
    //   318: aload_3
    //   319: ifnull +7 -> 326
    //   322: aload_3
    //   323: invokevirtual 172	java/io/OutputStream:close	()V
    //   326: aload_1
    //   327: ifnull +7 -> 334
    //   330: aload_1
    //   331: invokevirtual 129	java/net/HttpURLConnection:disconnect	()V
    //   334: aload_2
    //   335: athrow
    //   336: astore_3
    //   337: aload_0
    //   338: ldc_w 293
    //   341: aload_3
    //   342: invokevirtual 176	bqn:e	(Ljava/lang/String;Ljava/lang/Object;)V
    //   345: goto -19 -> 326
    //   348: astore_2
    //   349: aload 4
    //   351: astore_3
    //   352: goto -34 -> 318
    //   355: astore_3
    //   356: aload_2
    //   357: astore 4
    //   359: aload_3
    //   360: astore_2
    //   361: aload 4
    //   363: astore_3
    //   364: goto -46 -> 318
    //   367: astore_2
    //   368: goto -50 -> 318
    //   371: astore_2
    //   372: goto -102 -> 270
    //   375: astore_3
    //   376: aload_2
    //   377: astore 4
    //   379: aload_3
    //   380: astore_2
    //   381: aload 4
    //   383: astore_3
    //   384: goto -114 -> 270
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	387	0	this	bqn
    //   0	387	1	paramURL	URL
    //   0	387	2	paramArrayOfByte	byte[]
    //   4	319	3	arrayOfByte1	byte[]
    //   336	6	3	localIOException1	IOException
    //   351	1	3	arrayOfByte2	byte[]
    //   355	5	3	localObject1	Object
    //   363	1	3	arrayOfByte3	byte[]
    //   375	5	3	localIOException2	IOException
    //   383	1	3	arrayOfByte4	byte[]
    //   1	381	4	arrayOfByte5	byte[]
    //   18	182	5	localObject2	Object
    //   28	123	6	localObject3	Object
    //   124	25	7	localStringBuilder	StringBuilder
    //   250	46	8	i	int
    //   217	44	9	j	int
    // Exception table:
    //   from	to	target	type
    //   15	115	267	java/io/IOException
    //   115	161	267	java/io/IOException
    //   161	167	267	java/io/IOException
    //   282	286	300	java/io/IOException
    //   15	115	312	finally
    //   115	161	312	finally
    //   161	167	312	finally
    //   322	326	336	java/io/IOException
    //   167	198	348	finally
    //   208	219	348	finally
    //   227	237	348	finally
    //   237	248	348	finally
    //   198	208	355	finally
    //   270	278	367	finally
    //   167	198	371	java/io/IOException
    //   208	219	371	java/io/IOException
    //   227	237	371	java/io/IOException
    //   237	248	371	java/io/IOException
    //   198	208	375	java/io/IOException
  }
  
  private HttpURLConnection b(URL paramURL)
  {
    paramURL = paramURL.openConnection();
    if (!(paramURL instanceof HttpURLConnection)) {
      throw new IOException("Failed to obtain http connection");
    }
    paramURL = (HttpURLConnection)paramURL;
    paramURL.setDefaultUseCaches(false);
    paramURL.setConnectTimeout(((Integer)bqd.w.a()).intValue());
    paramURL.setReadTimeout(((Integer)bqd.x.a()).intValue());
    paramURL.setInstanceFollowRedirects(false);
    paramURL.setRequestProperty("User-Agent", this.a);
    paramURL.setDoInput(true);
    return paramURL;
  }
  
  private List b(List paramList)
  {
    ArrayList localArrayList = new ArrayList(paramList.size());
    Iterator localIterator = paramList.iterator();
    boolean bool;
    label55:
    Object localObject;
    int i;
    if (localIterator.hasNext())
    {
      paramList = (bsi)localIterator.next();
      a.c(paramList);
      if (paramList.f) {
        break label119;
      }
      bool = true;
      localObject = a(paramList, bool);
      if (localObject != null) {
        break label125;
      }
      this.d.a().a(paramList, "Error formatting hit for upload");
      i = 1;
    }
    for (;;)
    {
      if (i != 0)
      {
        localArrayList.add(Long.valueOf(paramList.c));
        if (localArrayList.size() < brz.f()) {
          break;
        }
      }
      return localArrayList;
      label119:
      bool = false;
      break label55;
      label125:
      if (((String)localObject).length() <= ((Integer)bqd.o.a()).intValue())
      {
        localObject = a(paramList, (String)localObject);
        if (localObject == null) {
          f("Failed to build collect GET endpoint url");
        }
      }
      URL localURL;
      label296:
      do
      {
        for (;;)
        {
          i = 0;
          break;
          if (a((URL)localObject) == 200)
          {
            i = 1;
            break;
          }
          i = 0;
          break;
          localObject = a(paramList, false);
          if (localObject == null)
          {
            this.d.a().a(paramList, "Error formatting hit for POST upload");
            i = 1;
            break;
          }
          localObject = ((String)localObject).getBytes();
          if (localObject.length > ((Integer)bqd.s.a()).intValue())
          {
            this.d.a().a(paramList, "Hit payload exceeds size limit");
            i = 1;
            break;
          }
          localURL = a(paramList);
          if (localURL != null) {
            break label296;
          }
          f("Failed to build collect POST endpoint url");
        }
      } while (a(localURL, (byte[])localObject) != 200);
      i = 1;
    }
  }
  
  private URL d()
  {
    String str = brz.h() + (String)bqd.n.a();
    try
    {
      URL localURL = new java/net/URL;
      localURL.<init>(str);
      return localURL;
    }
    catch (MalformedURLException localMalformedURLException)
    {
      for (;;)
      {
        e("Error trying to parse the hardcoded host url", localMalformedURLException);
        Object localObject = null;
      }
    }
  }
  
  final String a(bsi parambsi, boolean paramBoolean)
  {
    a.c(parambsi);
    StringBuilder localStringBuilder = new StringBuilder();
    try
    {
      Iterator localIterator = parambsi.a.entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        String str = (String)localEntry.getKey();
        if ((!"ht".equals(str)) && (!"qt".equals(str)) && (!"AppUID".equals(str)) && (!"z".equals(str)) && (!"_gmsv".equals(str)))
        {
          a(localStringBuilder, str, (String)localEntry.getValue());
          continue;
          return parambsi;
        }
      }
    }
    catch (UnsupportedEncodingException parambsi)
    {
      e("Failed to encode name or value", parambsi);
      parambsi = null;
    }
    a(localStringBuilder, "ht", String.valueOf(parambsi.d));
    a(localStringBuilder, "qt", String.valueOf(this.d.c.a() - parambsi.d));
    if (byk.a) {
      a(localStringBuilder, "_gmsv", this.d.c().b);
    }
    long l;
    if (paramBoolean)
    {
      l = bqs.a(parambsi.a("_s", "0"));
      if (l == 0L) {
        break label262;
      }
    }
    for (parambsi = String.valueOf(l);; parambsi = String.valueOf(l))
    {
      a(localStringBuilder, "z", parambsi);
      parambsi = localStringBuilder.toString();
      break;
      label262:
      l = parambsi.c;
    }
  }
  
  public final List a(List paramList)
  {
    boolean bool2 = true;
    brb.i();
    r();
    a.c(paramList);
    int j;
    boolean bool1;
    int i;
    if ((m().k().isEmpty()) || (!this.b.a(((Integer)bqd.v.a()).intValue() * 1000L)))
    {
      j = 0;
      bool1 = false;
      i = j;
      label67:
      if (i == 0) {
        break label385;
      }
      if (paramList.isEmpty()) {
        break label233;
      }
    }
    bqo localbqo;
    ArrayList localArrayList;
    for (;;)
    {
      a.b(bool2);
      a("Uploading batched hits. compression, count", Boolean.valueOf(bool1), Integer.valueOf(paramList.size()));
      localbqo = new bqo(this);
      localArrayList = new ArrayList();
      Iterator localIterator = paramList.iterator();
      while (localIterator.hasNext())
      {
        paramList = (bsi)localIterator.next();
        if (!localbqo.a(paramList)) {
          break;
        }
        localArrayList.add(Long.valueOf(paramList.c));
      }
      if (brs.a((String)bqd.p.a()) != brs.a) {}
      for (i = 1;; i = 0)
      {
        j = i;
        if (brw.a((String)bqd.q.a()) != brw.a) {
          break;
        }
        bool1 = true;
        break label67;
      }
      label233:
      bool2 = false;
    }
    if (localbqo.a == 0) {
      paramList = localArrayList;
    }
    for (;;)
    {
      return paramList;
      paramList = d();
      if (paramList == null) {
        f("Failed to build batching endpoint url");
      }
      for (;;)
      {
        paramList = Collections.emptyList();
        break;
        if (bool1) {}
        for (i = b(paramList, localbqo.b.toByteArray());; i = a(paramList, localbqo.b.toByteArray()))
        {
          if (200 != i) {
            break label336;
          }
          a("Batched upload completed. Hits batched", Integer.valueOf(localbqo.a));
          paramList = localArrayList;
          break;
        }
        label336:
        a("Network error uploading hits. status code", Integer.valueOf(i));
        if (m().k().contains(Integer.valueOf(i)))
        {
          e("Server instructed the client to stop batching");
          this.b.a();
        }
      }
      label385:
      paramList = b(paramList);
    }
  }
  
  protected final void a()
  {
    a("Network initialized. User agent", this.a);
  }
  
  public final boolean b()
  {
    brb.i();
    r();
    Object localObject1 = (ConnectivityManager)this.d.a.getSystemService("connectivity");
    try
    {
      localObject1 = ((ConnectivityManager)localObject1).getActiveNetworkInfo();
      if ((localObject1 == null) || (!((NetworkInfo)localObject1).isConnected()))
      {
        b("No network connectivity");
        bool = false;
        return bool;
      }
    }
    catch (SecurityException localSecurityException)
    {
      for (;;)
      {
        Object localObject2 = null;
        continue;
        boolean bool = true;
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bqn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */