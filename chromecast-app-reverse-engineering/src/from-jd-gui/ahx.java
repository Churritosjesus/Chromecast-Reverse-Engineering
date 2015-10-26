import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.Looper;
import java.lang.reflect.Method;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;

public class ahx
{
  private static final String e = ahx.class.getCanonicalName();
  private static ahx g;
  String a;
  String b;
  String c;
  boolean d;
  private long f;
  
  /* Error */
  public static ahx a(Context paramContext)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 4
    //   3: getstatic 34	ahx:g	Lahx;
    //   6: ifnull +26 -> 32
    //   9: invokestatic 40	java/lang/System:currentTimeMillis	()J
    //   12: getstatic 34	ahx:g	Lahx;
    //   15: getfield 42	ahx:f	J
    //   18: lsub
    //   19: ldc2_w 43
    //   22: lcmp
    //   23: ifge +9 -> 32
    //   26: getstatic 34	ahx:g	Lahx;
    //   29: astore_3
    //   30: aload_3
    //   31: areturn
    //   32: aload_0
    //   33: invokestatic 46	ahx:b	(Landroid/content/Context;)Lahx;
    //   36: pop
    //   37: aload_0
    //   38: invokestatic 48	ahx:c	(Landroid/content/Context;)Lahx;
    //   41: astore_1
    //   42: aload_1
    //   43: ifnonnull +373 -> 416
    //   46: new 2	ahx
    //   49: dup
    //   50: invokespecial 49	ahx:<init>	()V
    //   53: astore_1
    //   54: aload_0
    //   55: invokevirtual 55	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   58: ldc 57
    //   60: iconst_0
    //   61: invokevirtual 63	android/content/pm/PackageManager:resolveContentProvider	(Ljava/lang/String;I)Landroid/content/pm/ProviderInfo;
    //   64: ifnull +109 -> 173
    //   67: ldc 65
    //   69: invokestatic 71	android/net/Uri:parse	(Ljava/lang/String;)Landroid/net/Uri;
    //   72: astore_2
    //   73: aload_0
    //   74: invokevirtual 55	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   77: astore_3
    //   78: aload_3
    //   79: ifnull +116 -> 195
    //   82: aload_3
    //   83: aload_0
    //   84: invokevirtual 74	android/content/Context:getPackageName	()Ljava/lang/String;
    //   87: invokevirtual 78	android/content/pm/PackageManager:getInstallerPackageName	(Ljava/lang/String;)Ljava/lang/String;
    //   90: astore_3
    //   91: aload_3
    //   92: ifnull +8 -> 100
    //   95: aload_1
    //   96: aload_3
    //   97: putfield 80	ahx:c	Ljava/lang/String;
    //   100: aload_1
    //   101: astore_3
    //   102: aload_2
    //   103: ifnull -73 -> 30
    //   106: aload_0
    //   107: invokevirtual 84	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   110: aload_2
    //   111: iconst_3
    //   112: anewarray 86	java/lang/String
    //   115: dup
    //   116: iconst_0
    //   117: ldc 88
    //   119: aastore
    //   120: dup
    //   121: iconst_1
    //   122: ldc 90
    //   124: aastore
    //   125: dup
    //   126: iconst_2
    //   127: ldc 92
    //   129: aastore
    //   130: aconst_null
    //   131: aconst_null
    //   132: aconst_null
    //   133: invokevirtual 98	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   136: astore_2
    //   137: aload_2
    //   138: ifnull +18 -> 156
    //   141: aload_2
    //   142: astore_0
    //   143: aload_2
    //   144: invokeinterface 104 1 0
    //   149: istore 8
    //   151: iload 8
    //   153: ifne +47 -> 200
    //   156: aload_1
    //   157: astore_3
    //   158: aload_2
    //   159: ifnull -129 -> 30
    //   162: aload_2
    //   163: invokeinterface 107 1 0
    //   168: aload_1
    //   169: astore_3
    //   170: goto -140 -> 30
    //   173: aload_0
    //   174: invokevirtual 55	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   177: ldc 109
    //   179: iconst_0
    //   180: invokevirtual 63	android/content/pm/PackageManager:resolveContentProvider	(Ljava/lang/String;I)Landroid/content/pm/ProviderInfo;
    //   183: ifnull +228 -> 411
    //   186: ldc 111
    //   188: invokestatic 71	android/net/Uri:parse	(Ljava/lang/String;)Landroid/net/Uri;
    //   191: astore_2
    //   192: goto -119 -> 73
    //   195: aconst_null
    //   196: astore_3
    //   197: goto -106 -> 91
    //   200: aload_2
    //   201: astore_0
    //   202: aload_2
    //   203: ldc 88
    //   205: invokeinterface 115 2 0
    //   210: istore 6
    //   212: aload_2
    //   213: astore_0
    //   214: aload_2
    //   215: ldc 90
    //   217: invokeinterface 115 2 0
    //   222: istore 5
    //   224: aload_2
    //   225: astore_0
    //   226: aload_2
    //   227: ldc 92
    //   229: invokeinterface 115 2 0
    //   234: istore 7
    //   236: aload_2
    //   237: astore_0
    //   238: aload_1
    //   239: aload_2
    //   240: iload 6
    //   242: invokeinterface 119 2 0
    //   247: putfield 121	ahx:a	Ljava/lang/String;
    //   250: iload 5
    //   252: ifle +48 -> 300
    //   255: iload 7
    //   257: ifle +43 -> 300
    //   260: aload_2
    //   261: astore_0
    //   262: aload_1
    //   263: getfield 123	ahx:b	Ljava/lang/String;
    //   266: ifnonnull +34 -> 300
    //   269: aload_2
    //   270: astore_0
    //   271: aload_1
    //   272: aload_2
    //   273: iload 5
    //   275: invokeinterface 119 2 0
    //   280: putfield 123	ahx:b	Ljava/lang/String;
    //   283: aload_2
    //   284: astore_0
    //   285: aload_1
    //   286: aload_2
    //   287: iload 7
    //   289: invokeinterface 119 2 0
    //   294: invokestatic 129	java/lang/Boolean:parseBoolean	(Ljava/lang/String;)Z
    //   297: putfield 131	ahx:d	Z
    //   300: aload_2
    //   301: ifnull +9 -> 310
    //   304: aload_2
    //   305: invokeinterface 107 1 0
    //   310: aload_1
    //   311: invokestatic 40	java/lang/System:currentTimeMillis	()J
    //   314: putfield 42	ahx:f	J
    //   317: aload_1
    //   318: putstatic 34	ahx:g	Lahx;
    //   321: aload_1
    //   322: astore_3
    //   323: goto -293 -> 30
    //   326: astore_1
    //   327: aconst_null
    //   328: astore_2
    //   329: aload_2
    //   330: astore_0
    //   331: aload_1
    //   332: invokevirtual 134	java/lang/Exception:toString	()Ljava/lang/String;
    //   335: invokestatic 138	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   338: astore_1
    //   339: aload_2
    //   340: astore_0
    //   341: aload_1
    //   342: invokevirtual 142	java/lang/String:length	()I
    //   345: ifeq +27 -> 372
    //   348: aload_2
    //   349: astore_0
    //   350: ldc -112
    //   352: aload_1
    //   353: invokevirtual 147	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   356: pop
    //   357: aload_2
    //   358: ifnull +9 -> 367
    //   361: aload_2
    //   362: invokeinterface 107 1 0
    //   367: aconst_null
    //   368: astore_3
    //   369: goto -339 -> 30
    //   372: aload_2
    //   373: astore_0
    //   374: new 86	java/lang/String
    //   377: dup
    //   378: ldc -112
    //   380: invokespecial 150	java/lang/String:<init>	(Ljava/lang/String;)V
    //   383: pop
    //   384: goto -27 -> 357
    //   387: astore_1
    //   388: aload_0
    //   389: ifnull +9 -> 398
    //   392: aload_0
    //   393: invokeinterface 107 1 0
    //   398: aload_1
    //   399: athrow
    //   400: astore_1
    //   401: aload 4
    //   403: astore_0
    //   404: goto -16 -> 388
    //   407: astore_1
    //   408: goto -79 -> 329
    //   411: aconst_null
    //   412: astore_2
    //   413: goto -340 -> 73
    //   416: goto -362 -> 54
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	419	0	paramContext	Context
    //   41	281	1	localahx	ahx
    //   326	6	1	localException1	Exception
    //   338	15	1	str	String
    //   387	12	1	localObject1	Object
    //   400	1	1	localObject2	Object
    //   407	1	1	localException2	Exception
    //   72	341	2	localObject3	Object
    //   29	340	3	localObject4	Object
    //   1	401	4	localObject5	Object
    //   222	52	5	i	int
    //   210	31	6	j	int
    //   234	54	7	k	int
    //   149	3	8	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   54	73	326	java/lang/Exception
    //   73	78	326	java/lang/Exception
    //   82	91	326	java/lang/Exception
    //   95	100	326	java/lang/Exception
    //   106	137	326	java/lang/Exception
    //   173	192	326	java/lang/Exception
    //   143	151	387	finally
    //   202	212	387	finally
    //   214	224	387	finally
    //   226	236	387	finally
    //   238	250	387	finally
    //   262	269	387	finally
    //   271	283	387	finally
    //   285	300	387	finally
    //   331	339	387	finally
    //   341	348	387	finally
    //   350	357	387	finally
    //   374	384	387	finally
    //   54	73	400	finally
    //   73	78	400	finally
    //   82	91	400	finally
    //   95	100	400	finally
    //   106	137	400	finally
    //   173	192	400	finally
    //   143	151	407	java/lang/Exception
    //   202	212	407	java/lang/Exception
    //   214	224	407	java/lang/Exception
    //   226	236	407	java/lang/Exception
    //   238	250	407	java/lang/Exception
    //   262	269	407	java/lang/Exception
    //   271	283	407	java/lang/Exception
    //   285	300	407	java/lang/Exception
  }
  
  private static ahx b(Context paramContext)
  {
    try
    {
      if (Looper.myLooper() == Looper.getMainLooper())
      {
        paramContext = new afq;
        paramContext.<init>("getAndroidId cannot be called on the main thread.");
        throw paramContext;
      }
    }
    catch (Exception paramContext)
    {
      aji.a("android_id", paramContext);
    }
    for (;;)
    {
      return null;
      Object localObject1 = aji.a("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", new Class[] { Context.class });
      if (localObject1 != null)
      {
        localObject1 = aji.a(null, (Method)localObject1, new Object[] { paramContext });
        if (((localObject1 instanceof Integer)) && (((Integer)localObject1).intValue() == 0))
        {
          localObject1 = aji.a("com.google.android.gms.ads.identifier.AdvertisingIdClient", "getAdvertisingIdInfo", new Class[] { Context.class });
          if (localObject1 != null)
          {
            Object localObject2 = aji.a(null, (Method)localObject1, new Object[] { paramContext });
            if (localObject2 != null)
            {
              Method localMethod = aji.a(localObject2.getClass(), "getId", new Class[0]);
              paramContext = aji.a(localObject2.getClass(), "isLimitAdTrackingEnabled", new Class[0]);
              if ((localMethod != null) && (paramContext != null))
              {
                localObject1 = new ahx;
                ((ahx)localObject1).<init>();
                ((ahx)localObject1).b = ((String)aji.a(localObject2, localMethod, new Object[0]));
                ((ahx)localObject1).d = ((Boolean)aji.a(localObject2, paramContext, new Object[0])).booleanValue();
              }
            }
          }
        }
      }
    }
  }
  
  private static ahx c(Context paramContext)
  {
    ahz localahz = new ahz();
    Object localObject1 = new Intent("com.google.android.gms.ads.identifier.service.START");
    ((Intent)localObject1).setPackage("com.google.android.gms");
    if (paramContext.bindService((Intent)localObject1, localahz, 1)) {}
    try
    {
      localahy = new ahy;
      if (localahz.a.compareAndSet(true, true))
      {
        localObject1 = new java/lang/IllegalStateException;
        ((IllegalStateException)localObject1).<init>("Binder already consumed");
        throw ((Throwable)localObject1);
      }
    }
    catch (Exception localException)
    {
      ahy localahy;
      aji.a("android_id", localException);
      paramContext.unbindService(localahz);
      ahx localahx;
      for (paramContext = null;; paramContext = localahx)
      {
        return paramContext;
        localahy.<init>((IBinder)localahz.b.take());
        localahx = new ahx;
        localahx.<init>();
        localahx.b = localahy.a();
        localahx.d = localahy.b();
        paramContext.unbindService(localahz);
      }
    }
    finally
    {
      paramContext.unbindService(localahz);
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\ahx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */