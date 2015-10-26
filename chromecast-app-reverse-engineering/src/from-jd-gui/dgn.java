import java.io.PrintStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.List;
import javax.net.ssl.SSLSocket;

public class dgn
{
  private static final dgn a = ;
  
  public static dgn a()
  {
    return a;
  }
  
  public static void a(String paramString)
  {
    System.out.println(paramString);
  }
  
  public static String b()
  {
    return "OkHttp";
  }
  
  /* Error */
  private static dgn c()
  {
    // Byte code:
    //   0: ldc 40
    //   2: invokestatic 46	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
    //   5: pop
    //   6: new 48	dgm
    //   9: astore 6
    //   11: aload 6
    //   13: aconst_null
    //   14: ldc 50
    //   16: iconst_1
    //   17: anewarray 42	java/lang/Class
    //   20: dup
    //   21: iconst_0
    //   22: getstatic 56	java/lang/Boolean:TYPE	Ljava/lang/Class;
    //   25: aastore
    //   26: invokespecial 59	dgm:<init>	(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)V
    //   29: new 48	dgm
    //   32: astore 5
    //   34: aload 5
    //   36: aconst_null
    //   37: ldc 61
    //   39: iconst_1
    //   40: anewarray 42	java/lang/Class
    //   43: dup
    //   44: iconst_0
    //   45: ldc 63
    //   47: aastore
    //   48: invokespecial 59	dgm:<init>	(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)V
    //   51: ldc 65
    //   53: invokestatic 46	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
    //   56: astore_0
    //   57: aload_0
    //   58: ldc 67
    //   60: iconst_1
    //   61: anewarray 42	java/lang/Class
    //   64: dup
    //   65: iconst_0
    //   66: ldc 69
    //   68: aastore
    //   69: invokevirtual 73	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   72: astore_1
    //   73: aload_0
    //   74: ldc 75
    //   76: iconst_1
    //   77: anewarray 42	java/lang/Class
    //   80: dup
    //   81: iconst_0
    //   82: ldc 69
    //   84: aastore
    //   85: invokevirtual 73	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   88: astore_2
    //   89: ldc 77
    //   91: invokestatic 46	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
    //   94: pop
    //   95: new 48	dgm
    //   98: astore_0
    //   99: aload_0
    //   100: ldc 79
    //   102: ldc 81
    //   104: iconst_0
    //   105: anewarray 42	java/lang/Class
    //   108: invokespecial 59	dgm:<init>	(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)V
    //   111: new 48	dgm
    //   114: astore_3
    //   115: aload_3
    //   116: aconst_null
    //   117: ldc 83
    //   119: iconst_1
    //   120: anewarray 42	java/lang/Class
    //   123: dup
    //   124: iconst_0
    //   125: ldc 79
    //   127: aastore
    //   128: invokespecial 59	dgm:<init>	(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)V
    //   131: aload_1
    //   132: astore 4
    //   134: aload_0
    //   135: astore_1
    //   136: aload 4
    //   138: astore_0
    //   139: new 85	dgo
    //   142: astore 4
    //   144: aload 4
    //   146: aload 6
    //   148: aload 5
    //   150: aload_0
    //   151: aload_2
    //   152: aload_1
    //   153: aload_3
    //   154: invokespecial 88	dgo:<init>	(Ldgm;Ldgm;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ldgm;Ldgm;)V
    //   157: aload 4
    //   159: astore_0
    //   160: aload_0
    //   161: areturn
    //   162: astore_0
    //   163: ldc 90
    //   165: invokestatic 46	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
    //   168: pop
    //   169: goto -163 -> 6
    //   172: astore_0
    //   173: ldc 92
    //   175: invokestatic 46	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
    //   178: astore_0
    //   179: new 94	java/lang/StringBuilder
    //   182: astore_1
    //   183: aload_1
    //   184: invokespecial 95	java/lang/StringBuilder:<init>	()V
    //   187: aload_1
    //   188: ldc 92
    //   190: invokevirtual 99	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   193: ldc 101
    //   195: invokevirtual 99	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   198: invokevirtual 104	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   201: invokestatic 46	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
    //   204: astore_3
    //   205: new 94	java/lang/StringBuilder
    //   208: astore_1
    //   209: aload_1
    //   210: invokespecial 95	java/lang/StringBuilder:<init>	()V
    //   213: aload_1
    //   214: ldc 92
    //   216: invokevirtual 99	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   219: ldc 106
    //   221: invokevirtual 99	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   224: invokevirtual 104	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   227: invokestatic 46	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
    //   230: astore_1
    //   231: new 94	java/lang/StringBuilder
    //   234: astore_2
    //   235: aload_2
    //   236: invokespecial 95	java/lang/StringBuilder:<init>	()V
    //   239: aload_2
    //   240: ldc 92
    //   242: invokevirtual 99	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   245: ldc 108
    //   247: invokevirtual 99	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   250: invokevirtual 104	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   253: invokestatic 46	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
    //   256: astore_2
    //   257: aload_0
    //   258: ldc 110
    //   260: iconst_2
    //   261: anewarray 42	java/lang/Class
    //   264: dup
    //   265: iconst_0
    //   266: ldc 112
    //   268: aastore
    //   269: dup
    //   270: iconst_1
    //   271: aload_3
    //   272: aastore
    //   273: invokevirtual 73	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   276: astore 4
    //   278: aload_0
    //   279: ldc 114
    //   281: iconst_1
    //   282: anewarray 42	java/lang/Class
    //   285: dup
    //   286: iconst_0
    //   287: ldc 112
    //   289: aastore
    //   290: invokevirtual 73	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   293: astore_3
    //   294: aload_0
    //   295: ldc 116
    //   297: iconst_1
    //   298: anewarray 42	java/lang/Class
    //   301: dup
    //   302: iconst_0
    //   303: ldc 112
    //   305: aastore
    //   306: invokevirtual 73	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   309: astore 5
    //   311: new 118	dgp
    //   314: astore_0
    //   315: aload_0
    //   316: aload 4
    //   318: aload_3
    //   319: aload 5
    //   321: aload_1
    //   322: aload_2
    //   323: invokespecial 121	dgp:<init>	(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/Class;Ljava/lang/Class;)V
    //   326: goto -166 -> 160
    //   329: astore_0
    //   330: new 2	dgn
    //   333: dup
    //   334: invokespecial 122	dgn:<init>	()V
    //   337: astore_0
    //   338: goto -178 -> 160
    //   341: astore_0
    //   342: aconst_null
    //   343: astore_0
    //   344: aconst_null
    //   345: astore 4
    //   347: aload_1
    //   348: astore_3
    //   349: aload_0
    //   350: astore_1
    //   351: aload_3
    //   352: astore_0
    //   353: aload 4
    //   355: astore_3
    //   356: goto -217 -> 139
    //   359: astore_0
    //   360: aconst_null
    //   361: astore_0
    //   362: aconst_null
    //   363: astore_2
    //   364: aconst_null
    //   365: astore_3
    //   366: aload_0
    //   367: astore_1
    //   368: aload_3
    //   369: astore_0
    //   370: aconst_null
    //   371: astore 4
    //   373: aload_1
    //   374: astore_3
    //   375: aload_0
    //   376: astore_1
    //   377: aload_3
    //   378: astore_0
    //   379: aload 4
    //   381: astore_3
    //   382: goto -243 -> 139
    //   385: astore_0
    //   386: goto -56 -> 330
    //   389: astore_0
    //   390: aload_1
    //   391: astore_0
    //   392: goto -30 -> 362
    //   395: astore_0
    //   396: aconst_null
    //   397: astore_0
    //   398: aconst_null
    //   399: astore_2
    //   400: aconst_null
    //   401: astore_1
    //   402: goto -32 -> 370
    //   405: astore_0
    //   406: aconst_null
    //   407: astore_0
    //   408: aconst_null
    //   409: astore_2
    //   410: goto -40 -> 370
    //   413: astore_0
    //   414: aconst_null
    //   415: astore_0
    //   416: goto -46 -> 370
    //   419: astore_3
    //   420: goto -50 -> 370
    //   423: astore_3
    //   424: goto -80 -> 344
    // Local variable table:
    //   start	length	slot	name	signature
    //   56	105	0	localObject1	Object
    //   162	1	0	localClassNotFoundException1	ClassNotFoundException
    //   172	1	0	localClassNotFoundException2	ClassNotFoundException
    //   178	138	0	localObject2	Object
    //   329	1	0	localClassNotFoundException3	ClassNotFoundException
    //   337	1	0	localdgn	dgn
    //   341	1	0	localClassNotFoundException4	ClassNotFoundException
    //   343	10	0	localObject3	Object
    //   359	1	0	localClassNotFoundException5	ClassNotFoundException
    //   361	18	0	localObject4	Object
    //   385	1	0	localNoSuchMethodException1	NoSuchMethodException
    //   389	1	0	localClassNotFoundException6	ClassNotFoundException
    //   391	1	0	localObject5	Object
    //   395	1	0	localNoSuchMethodException2	NoSuchMethodException
    //   397	1	0	localObject6	Object
    //   405	1	0	localNoSuchMethodException3	NoSuchMethodException
    //   407	1	0	localObject7	Object
    //   413	1	0	localNoSuchMethodException4	NoSuchMethodException
    //   415	1	0	localObject8	Object
    //   72	330	1	localObject9	Object
    //   88	322	2	localObject10	Object
    //   114	268	3	localObject11	Object
    //   419	1	3	localNoSuchMethodException5	NoSuchMethodException
    //   423	1	3	localClassNotFoundException7	ClassNotFoundException
    //   132	248	4	localObject12	Object
    //   32	288	5	localObject13	Object
    //   9	138	6	localdgm	dgm
    // Exception table:
    //   from	to	target	type
    //   0	6	162	java/lang/ClassNotFoundException
    //   6	51	172	java/lang/ClassNotFoundException
    //   139	157	172	java/lang/ClassNotFoundException
    //   163	169	172	java/lang/ClassNotFoundException
    //   173	326	329	java/lang/ClassNotFoundException
    //   89	111	341	java/lang/ClassNotFoundException
    //   51	73	359	java/lang/ClassNotFoundException
    //   173	326	385	java/lang/NoSuchMethodException
    //   73	89	389	java/lang/ClassNotFoundException
    //   51	73	395	java/lang/NoSuchMethodException
    //   73	89	405	java/lang/NoSuchMethodException
    //   89	111	413	java/lang/NoSuchMethodException
    //   111	131	419	java/lang/NoSuchMethodException
    //   111	131	423	java/lang/ClassNotFoundException
  }
  
  public void a(Socket paramSocket) {}
  
  public void a(Socket paramSocket, InetSocketAddress paramInetSocketAddress, int paramInt)
  {
    paramSocket.connect(paramInetSocketAddress, paramInt);
  }
  
  public void a(SSLSocket paramSSLSocket) {}
  
  public void a(SSLSocket paramSSLSocket, String paramString, List paramList) {}
  
  public String b(SSLSocket paramSSLSocket)
  {
    return null;
  }
  
  public void b(Socket paramSocket) {}
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dgn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */