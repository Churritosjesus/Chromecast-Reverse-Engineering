import android.content.Context;
import java.util.HashMap;
import java.util.Map;

final class ahs
{
  private static Object b = new Object();
  HashMap a = new HashMap();
  private Context c;
  
  private ahs(Context paramContext)
  {
    this.c = paramContext;
  }
  
  /* Error */
  public static ahs a(Context paramContext)
  {
    // Byte code:
    //   0: getstatic 17	ahs:b	Ljava/lang/Object;
    //   3: astore_3
    //   4: aload_3
    //   5: monitorenter
    //   6: new 2	ahs
    //   9: astore 4
    //   11: aload 4
    //   13: aload_0
    //   14: invokespecial 33	ahs:<init>	(Landroid/content/Context;)V
    //   17: aconst_null
    //   18: astore_1
    //   19: new 35	java/io/ObjectInputStream
    //   22: astore_0
    //   23: new 37	java/io/BufferedInputStream
    //   26: astore_2
    //   27: aload_2
    //   28: aload 4
    //   30: getfield 26	ahs:c	Landroid/content/Context;
    //   33: ldc 39
    //   35: invokevirtual 45	android/content/Context:openFileInput	(Ljava/lang/String;)Ljava/io/FileInputStream;
    //   38: invokespecial 48	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   41: aload_0
    //   42: aload_2
    //   43: invokespecial 49	java/io/ObjectInputStream:<init>	(Ljava/io/InputStream;)V
    //   46: aload_0
    //   47: astore_1
    //   48: aload_0
    //   49: invokevirtual 53	java/io/ObjectInputStream:readObject	()Ljava/lang/Object;
    //   52: checkcast 21	java/util/HashMap
    //   55: astore_2
    //   56: aload_0
    //   57: astore_1
    //   58: aload 4
    //   60: getfield 26	ahs:c	Landroid/content/Context;
    //   63: ldc 39
    //   65: invokevirtual 57	android/content/Context:getFileStreamPath	(Ljava/lang/String;)Ljava/io/File;
    //   68: invokevirtual 63	java/io/File:delete	()Z
    //   71: pop
    //   72: aload_0
    //   73: astore_1
    //   74: aload 4
    //   76: aload_2
    //   77: putfield 24	ahs:a	Ljava/util/HashMap;
    //   80: aload_0
    //   81: invokestatic 68	aji:a	(Ljava/io/Closeable;)V
    //   84: aload_3
    //   85: monitorexit
    //   86: aload 4
    //   88: areturn
    //   89: astore_0
    //   90: aload_1
    //   91: astore_0
    //   92: aload_0
    //   93: invokestatic 68	aji:a	(Ljava/io/Closeable;)V
    //   96: goto -12 -> 84
    //   99: astore_0
    //   100: aload_3
    //   101: monitorexit
    //   102: aload_0
    //   103: athrow
    //   104: astore_2
    //   105: aconst_null
    //   106: astore_0
    //   107: aload_0
    //   108: astore_1
    //   109: invokestatic 74	ahe:f	()Ljava/lang/String;
    //   112: pop
    //   113: aload_0
    //   114: astore_1
    //   115: aload_2
    //   116: invokevirtual 77	java/lang/Exception:toString	()Ljava/lang/String;
    //   119: invokestatic 83	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   122: astore_2
    //   123: aload_0
    //   124: astore_1
    //   125: aload_2
    //   126: invokevirtual 87	java/lang/String:length	()I
    //   129: ifeq +19 -> 148
    //   132: aload_0
    //   133: astore_1
    //   134: ldc 89
    //   136: aload_2
    //   137: invokevirtual 93	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   140: pop
    //   141: aload_0
    //   142: invokestatic 68	aji:a	(Ljava/io/Closeable;)V
    //   145: goto -61 -> 84
    //   148: aload_0
    //   149: astore_1
    //   150: new 79	java/lang/String
    //   153: dup
    //   154: ldc 89
    //   156: invokespecial 96	java/lang/String:<init>	(Ljava/lang/String;)V
    //   159: pop
    //   160: goto -19 -> 141
    //   163: astore_0
    //   164: aload_1
    //   165: invokestatic 68	aji:a	(Ljava/io/Closeable;)V
    //   168: aload_0
    //   169: athrow
    //   170: astore_0
    //   171: aconst_null
    //   172: astore_1
    //   173: goto -9 -> 164
    //   176: astore_2
    //   177: goto -70 -> 107
    //   180: astore_1
    //   181: goto -89 -> 92
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	184	0	paramContext	Context
    //   18	155	1	localContext	Context
    //   180	1	1	localFileNotFoundException	java.io.FileNotFoundException
    //   26	51	2	localObject1	Object
    //   104	12	2	localException1	Exception
    //   122	15	2	str	String
    //   176	1	2	localException2	Exception
    //   3	98	3	localObject2	Object
    //   9	78	4	localahs	ahs
    // Exception table:
    //   from	to	target	type
    //   19	46	89	java/io/FileNotFoundException
    //   6	17	99	finally
    //   80	84	99	finally
    //   84	86	99	finally
    //   92	96	99	finally
    //   100	102	99	finally
    //   141	145	99	finally
    //   164	170	99	finally
    //   19	46	104	java/lang/Exception
    //   48	56	163	finally
    //   58	72	163	finally
    //   74	80	163	finally
    //   109	113	163	finally
    //   115	123	163	finally
    //   125	132	163	finally
    //   134	141	163	finally
    //   150	160	163	finally
    //   19	46	170	finally
    //   48	56	176	java/lang/Exception
    //   58	72	176	java/lang/Exception
    //   74	80	176	java/lang/Exception
    //   48	56	180	java/io/FileNotFoundException
    //   58	72	180	java/io/FileNotFoundException
    //   74	80	180	java/io/FileNotFoundException
  }
  
  public static void a(Context paramContext, ahk paramahk, aht paramaht)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put(paramahk, paramaht);
    a(paramContext, localHashMap);
  }
  
  /* Error */
  private static void a(Context paramContext, Map paramMap)
  {
    // Byte code:
    //   0: getstatic 17	ahs:b	Ljava/lang/Object;
    //   3: astore_3
    //   4: aload_3
    //   5: monitorenter
    //   6: aload_0
    //   7: invokestatic 108	ahs:a	(Landroid/content/Context;)Lahs;
    //   10: astore_2
    //   11: aload_1
    //   12: invokeinterface 112 1 0
    //   17: invokeinterface 118 1 0
    //   22: astore_0
    //   23: aload_0
    //   24: invokeinterface 123 1 0
    //   29: ifeq +114 -> 143
    //   32: aload_0
    //   33: invokeinterface 126 1 0
    //   38: checkcast 128	java/util/Map$Entry
    //   41: astore 4
    //   43: aload 4
    //   45: invokeinterface 131 1 0
    //   50: checkcast 133	aht
    //   53: invokevirtual 136	aht:b	()Ljava/util/List;
    //   56: astore_1
    //   57: aload_1
    //   58: invokeinterface 141 1 0
    //   63: ifeq -40 -> 23
    //   66: aload 4
    //   68: invokeinterface 144 1 0
    //   73: checkcast 146	ahk
    //   76: astore 5
    //   78: aload_2
    //   79: getfield 24	ahs:a	Ljava/util/HashMap;
    //   82: aload 5
    //   84: invokevirtual 150	java/util/HashMap:containsKey	(Ljava/lang/Object;)Z
    //   87: ifne +29 -> 116
    //   90: aload_2
    //   91: getfield 24	ahs:a	Ljava/util/HashMap;
    //   94: astore 4
    //   96: new 152	java/util/ArrayList
    //   99: astore 6
    //   101: aload 6
    //   103: invokespecial 153	java/util/ArrayList:<init>	()V
    //   106: aload 4
    //   108: aload 5
    //   110: aload 6
    //   112: invokevirtual 154	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   115: pop
    //   116: aload_2
    //   117: getfield 24	ahs:a	Ljava/util/HashMap;
    //   120: aload 5
    //   122: invokevirtual 158	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   125: checkcast 138	java/util/List
    //   128: aload_1
    //   129: invokeinterface 162 2 0
    //   134: pop
    //   135: goto -112 -> 23
    //   138: astore_0
    //   139: aload_3
    //   140: monitorexit
    //   141: aload_0
    //   142: athrow
    //   143: new 164	java/io/ObjectOutputStream
    //   146: astore_1
    //   147: new 166	java/io/BufferedOutputStream
    //   150: astore_0
    //   151: aload_0
    //   152: aload_2
    //   153: getfield 26	ahs:c	Landroid/content/Context;
    //   156: ldc 39
    //   158: iconst_0
    //   159: invokevirtual 170	android/content/Context:openFileOutput	(Ljava/lang/String;I)Ljava/io/FileOutputStream;
    //   162: invokespecial 173	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   165: aload_1
    //   166: aload_0
    //   167: invokespecial 174	java/io/ObjectOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   170: aload_1
    //   171: astore_0
    //   172: aload_1
    //   173: aload_2
    //   174: getfield 24	ahs:a	Ljava/util/HashMap;
    //   177: invokevirtual 178	java/io/ObjectOutputStream:writeObject	(Ljava/lang/Object;)V
    //   180: aload_1
    //   181: invokestatic 68	aji:a	(Ljava/io/Closeable;)V
    //   184: aload_3
    //   185: monitorexit
    //   186: return
    //   187: astore_2
    //   188: aconst_null
    //   189: astore_1
    //   190: aload_1
    //   191: astore_0
    //   192: invokestatic 74	ahe:f	()Ljava/lang/String;
    //   195: pop
    //   196: aload_1
    //   197: astore_0
    //   198: aload_2
    //   199: invokevirtual 77	java/lang/Exception:toString	()Ljava/lang/String;
    //   202: invokestatic 83	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   205: astore_2
    //   206: aload_1
    //   207: astore_0
    //   208: aload_2
    //   209: invokevirtual 87	java/lang/String:length	()I
    //   212: ifeq +19 -> 231
    //   215: aload_1
    //   216: astore_0
    //   217: ldc 89
    //   219: aload_2
    //   220: invokevirtual 93	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   223: pop
    //   224: aload_1
    //   225: invokestatic 68	aji:a	(Ljava/io/Closeable;)V
    //   228: goto -44 -> 184
    //   231: aload_1
    //   232: astore_0
    //   233: new 79	java/lang/String
    //   236: dup
    //   237: ldc 89
    //   239: invokespecial 96	java/lang/String:<init>	(Ljava/lang/String;)V
    //   242: pop
    //   243: goto -19 -> 224
    //   246: astore_1
    //   247: aload_0
    //   248: invokestatic 68	aji:a	(Ljava/io/Closeable;)V
    //   251: aload_1
    //   252: athrow
    //   253: astore_1
    //   254: aconst_null
    //   255: astore_0
    //   256: goto -9 -> 247
    //   259: astore_2
    //   260: goto -70 -> 190
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	263	0	paramContext	Context
    //   0	263	1	paramMap	Map
    //   10	164	2	localahs	ahs
    //   187	12	2	localException1	Exception
    //   205	15	2	str	String
    //   259	1	2	localException2	Exception
    //   3	182	3	localObject1	Object
    //   41	66	4	localObject2	Object
    //   76	45	5	localahk	ahk
    //   99	12	6	localArrayList	java.util.ArrayList
    // Exception table:
    //   from	to	target	type
    //   6	23	138	finally
    //   23	116	138	finally
    //   116	135	138	finally
    //   139	141	138	finally
    //   180	184	138	finally
    //   184	186	138	finally
    //   224	228	138	finally
    //   247	253	138	finally
    //   143	170	187	java/lang/Exception
    //   172	180	246	finally
    //   192	196	246	finally
    //   198	206	246	finally
    //   208	215	246	finally
    //   217	224	246	finally
    //   233	243	246	finally
    //   143	170	253	finally
    //   172	180	259	java/lang/Exception
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\ahs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */