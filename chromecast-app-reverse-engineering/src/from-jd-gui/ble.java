import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;

public final class ble
{
  private static final Uri a = Uri.parse("content://com.google.settings/partner");
  
  public static boolean a(Context paramContext)
  {
    if (paramContext.getPackageManager().resolveActivity(new Intent("com.google.android.gsf.GOOGLE_APPS_LOCATION_SETTINGS"), 65536) != null) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  /* Error */
  public static int b(Context paramContext)
  {
    // Byte code:
    //   0: iconst_2
    //   1: istore 4
    //   3: aconst_null
    //   4: astore_3
    //   5: aconst_null
    //   6: astore_2
    //   7: aconst_null
    //   8: astore_1
    //   9: aload_0
    //   10: invokevirtual 51	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   13: astore_0
    //   14: aload_0
    //   15: getstatic 18	ble:a	Landroid/net/Uri;
    //   18: iconst_1
    //   19: anewarray 53	java/lang/String
    //   22: dup
    //   23: iconst_0
    //   24: ldc 55
    //   26: aastore
    //   27: ldc 57
    //   29: iconst_1
    //   30: anewarray 53	java/lang/String
    //   33: dup
    //   34: iconst_0
    //   35: ldc 59
    //   37: aastore
    //   38: aconst_null
    //   39: invokevirtual 65	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   42: astore_0
    //   43: aload_1
    //   44: astore_2
    //   45: aload_0
    //   46: ifnull +26 -> 72
    //   49: aload_1
    //   50: astore_2
    //   51: aload_0
    //   52: astore_1
    //   53: aload_0
    //   54: invokeinterface 71 1 0
    //   59: ifeq +13 -> 72
    //   62: aload_0
    //   63: astore_1
    //   64: aload_0
    //   65: iconst_0
    //   66: invokeinterface 75 2 0
    //   71: astore_2
    //   72: aload_2
    //   73: astore_1
    //   74: aload_0
    //   75: ifnull +11 -> 86
    //   78: aload_0
    //   79: invokeinterface 78 1 0
    //   84: aload_2
    //   85: astore_1
    //   86: aload_1
    //   87: ifnonnull +52 -> 139
    //   90: iload 4
    //   92: ireturn
    //   93: astore_2
    //   94: aconst_null
    //   95: astore_0
    //   96: aload_0
    //   97: astore_1
    //   98: ldc 80
    //   100: ldc 82
    //   102: aload_2
    //   103: invokestatic 88	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   106: pop
    //   107: aload_3
    //   108: astore_1
    //   109: aload_0
    //   110: ifnull -24 -> 86
    //   113: aload_0
    //   114: invokeinterface 78 1 0
    //   119: aload_3
    //   120: astore_1
    //   121: goto -35 -> 86
    //   124: astore_0
    //   125: aload_2
    //   126: astore_1
    //   127: aload_1
    //   128: ifnull +9 -> 137
    //   131: aload_1
    //   132: invokeinterface 78 1 0
    //   137: aload_0
    //   138: athrow
    //   139: aload_1
    //   140: invokestatic 94	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   143: istore 4
    //   145: goto -55 -> 90
    //   148: astore_0
    //   149: iconst_2
    //   150: istore 4
    //   152: goto -7 -> 145
    //   155: astore_0
    //   156: goto -29 -> 127
    //   159: astore_2
    //   160: goto -64 -> 96
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	163	0	paramContext	Context
    //   8	132	1	localObject1	Object
    //   6	79	2	localObject2	Object
    //   93	33	2	localRuntimeException1	RuntimeException
    //   159	1	2	localRuntimeException2	RuntimeException
    //   4	116	3	localObject3	Object
    //   1	150	4	i	int
    // Exception table:
    //   from	to	target	type
    //   14	43	93	java/lang/RuntimeException
    //   14	43	124	finally
    //   139	145	148	java/lang/NumberFormatException
    //   53	62	155	finally
    //   64	72	155	finally
    //   98	107	155	finally
    //   53	62	159	java/lang/RuntimeException
    //   64	72	159	java/lang/RuntimeException
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\ble.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */