import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class czp
{
  public static final Uri a = Uri.parse("content://com.google.android.gsf.gservices");
  private static Uri b = Uri.parse("content://com.google.android.gsf.gservices/prefix");
  private static Pattern c = Pattern.compile("^(1|true|t|on|yes|y)$", 2);
  private static Pattern d = Pattern.compile("^(0|false|f|off|no|n)$", 2);
  private static HashMap e;
  private static Object f;
  private static String[] g = new String[0];
  private static Context h = null;
  
  public static int a(ContentResolver paramContentResolver, String paramString, int paramInt)
  {
    paramContentResolver = a(paramContentResolver, paramString, null);
    int i = paramInt;
    if (paramContentResolver != null) {}
    try
    {
      i = Integer.parseInt(paramContentResolver);
      return i;
    }
    catch (NumberFormatException paramContentResolver)
    {
      for (;;)
      {
        i = paramInt;
      }
    }
  }
  
  public static long a(ContentResolver paramContentResolver, String paramString, long paramLong)
  {
    paramContentResolver = a(paramContentResolver, paramString, null);
    long l = paramLong;
    if (paramContentResolver != null) {}
    try
    {
      l = Long.parseLong(paramContentResolver);
      return l;
    }
    catch (NumberFormatException paramContentResolver)
    {
      for (;;)
      {
        l = paramLong;
      }
    }
  }
  
  /* Error */
  public static String a(ContentResolver paramContentResolver, String paramString1, String paramString2)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: aload_0
    //   4: invokestatic 83	czp:a	(Landroid/content/ContentResolver;)V
    //   7: getstatic 80	czp:f	Ljava/lang/Object;
    //   10: astore 5
    //   12: getstatic 85	czp:e	Ljava/util/HashMap;
    //   15: aload_1
    //   16: invokevirtual 91	java/util/HashMap:containsKey	(Ljava/lang/Object;)Z
    //   19: ifeq +27 -> 46
    //   22: getstatic 85	czp:e	Ljava/util/HashMap;
    //   25: aload_1
    //   26: invokevirtual 94	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   29: checkcast 50	java/lang/String
    //   32: astore_0
    //   33: aload_0
    //   34: ifnull +5 -> 39
    //   37: aload_0
    //   38: astore_2
    //   39: ldc 2
    //   41: monitorexit
    //   42: aload_2
    //   43: astore_3
    //   44: aload_3
    //   45: areturn
    //   46: ldc 2
    //   48: monitorexit
    //   49: getstatic 52	czp:g	[Ljava/lang/String;
    //   52: astore 4
    //   54: aload 4
    //   56: arraylength
    //   57: istore 7
    //   59: iconst_0
    //   60: istore 6
    //   62: iload 6
    //   64: iload 7
    //   66: if_icmpge +29 -> 95
    //   69: aload_2
    //   70: astore_3
    //   71: aload_1
    //   72: aload 4
    //   74: iload 6
    //   76: aaload
    //   77: invokevirtual 98	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   80: ifne -36 -> 44
    //   83: iinc 6 1
    //   86: goto -24 -> 62
    //   89: astore_0
    //   90: ldc 2
    //   92: monitorexit
    //   93: aload_0
    //   94: athrow
    //   95: aload_0
    //   96: getstatic 30	czp:a	Landroid/net/Uri;
    //   99: aconst_null
    //   100: aconst_null
    //   101: iconst_1
    //   102: anewarray 50	java/lang/String
    //   105: dup
    //   106: iconst_0
    //   107: aload_1
    //   108: aastore
    //   109: aconst_null
    //   110: invokevirtual 104	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   113: astore 4
    //   115: aload 4
    //   117: ifnull +13 -> 130
    //   120: aload 4
    //   122: invokeinterface 110 1 0
    //   127: ifne +31 -> 158
    //   130: getstatic 85	czp:e	Ljava/util/HashMap;
    //   133: aload_1
    //   134: aconst_null
    //   135: invokevirtual 114	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   138: pop
    //   139: aload_2
    //   140: astore_3
    //   141: aload 4
    //   143: ifnull -99 -> 44
    //   146: aload 4
    //   148: invokeinterface 117 1 0
    //   153: aload_2
    //   154: astore_3
    //   155: goto -111 -> 44
    //   158: aload 4
    //   160: iconst_1
    //   161: invokeinterface 121 2 0
    //   166: astore_0
    //   167: ldc 2
    //   169: monitorenter
    //   170: aload 5
    //   172: getstatic 80	czp:f	Ljava/lang/Object;
    //   175: if_acmpne +12 -> 187
    //   178: getstatic 85	czp:e	Ljava/util/HashMap;
    //   181: aload_1
    //   182: aload_0
    //   183: invokevirtual 114	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   186: pop
    //   187: ldc 2
    //   189: monitorexit
    //   190: aload_0
    //   191: ifnull +5 -> 196
    //   194: aload_0
    //   195: astore_2
    //   196: aload_2
    //   197: astore_3
    //   198: aload 4
    //   200: ifnull -156 -> 44
    //   203: aload 4
    //   205: invokeinterface 117 1 0
    //   210: aload_2
    //   211: astore_3
    //   212: goto -168 -> 44
    //   215: astore_0
    //   216: ldc 2
    //   218: monitorexit
    //   219: aload_0
    //   220: athrow
    //   221: astore_0
    //   222: aload 4
    //   224: ifnull +10 -> 234
    //   227: aload 4
    //   229: invokeinterface 117 1 0
    //   234: aload_0
    //   235: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	236	0	paramContentResolver	ContentResolver
    //   0	236	1	paramString1	String
    //   0	236	2	paramString2	String
    //   43	169	3	str	String
    //   52	176	4	localObject1	Object
    //   10	161	5	localObject2	Object
    //   60	24	6	i	int
    //   57	10	7	j	int
    // Exception table:
    //   from	to	target	type
    //   3	33	89	finally
    //   39	42	89	finally
    //   46	49	89	finally
    //   90	93	89	finally
    //   170	187	215	finally
    //   187	190	215	finally
    //   216	219	215	finally
    //   120	130	221	finally
    //   130	139	221	finally
    //   158	170	221	finally
    //   219	221	221	finally
  }
  
  private static void a(ContentResolver paramContentResolver)
  {
    if (e == null)
    {
      e = new HashMap();
      f = new Object();
      new czq("Gservices", paramContentResolver).start();
    }
  }
  
  public static void a(ContentResolver paramContentResolver, String... paramVarArgs)
  {
    Map localMap = b(paramContentResolver, paramVarArgs);
    try
    {
      a(paramContentResolver);
      g = paramVarArgs;
      paramVarArgs = localMap.entrySet().iterator();
      while (paramVarArgs.hasNext())
      {
        paramContentResolver = (Map.Entry)paramVarArgs.next();
        e.put(paramContentResolver.getKey(), paramContentResolver.getValue());
      }
    }
    finally {}
  }
  
  public static boolean a(ContentResolver paramContentResolver, String paramString, boolean paramBoolean)
  {
    paramContentResolver = a(paramContentResolver, paramString, null);
    boolean bool = paramBoolean;
    if (paramContentResolver != null)
    {
      if (!paramContentResolver.equals("")) {
        break label26;
      }
      bool = paramBoolean;
    }
    for (;;)
    {
      return bool;
      label26:
      if (c.matcher(paramContentResolver).matches())
      {
        bool = true;
      }
      else if (d.matcher(paramContentResolver).matches())
      {
        bool = false;
      }
      else
      {
        Log.w("Gservices", "attempt to read gservices key " + paramString + " (value \"" + paramContentResolver + "\") as boolean");
        bool = paramBoolean;
      }
    }
  }
  
  private static Map b(ContentResolver paramContentResolver, String... paramVarArgs)
  {
    paramContentResolver = paramContentResolver.query(b, null, null, paramVarArgs, null);
    paramVarArgs = new TreeMap();
    if (paramContentResolver == null) {}
    for (;;)
    {
      return paramVarArgs;
      try
      {
        while (paramContentResolver.moveToNext()) {
          paramVarArgs.put(paramContentResolver.getString(0), paramContentResolver.getString(1));
        }
      }
      finally
      {
        paramContentResolver.close();
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\czp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */