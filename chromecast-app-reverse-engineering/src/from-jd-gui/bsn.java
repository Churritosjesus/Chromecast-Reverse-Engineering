import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;

public final class bsn
{
  private static String a;
  private static final ComponentName b;
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    i = Build.VERSION.SDK_INT;
    a = "androidPackageName";
    b = new ComponentName("com.google.android.gms", "com.google.android.gms.auth.GetToken");
    new ComponentName("com.google.android.gms", "com.google.android.gms.recovery.RecoveryService");
  }
  
  /* Error */
  private static Bundle a(Context paramContext, Account paramAccount, String paramString, Bundle paramBundle, Boolean paramBoolean)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 50	android/content/Context:getApplicationContext	()Landroid/content/Context;
    //   4: astore 5
    //   6: ldc 52
    //   8: invokestatic 57	a:h	(Ljava/lang/String;)V
    //   11: aload 5
    //   13: invokestatic 62	bvt:b	(Landroid/content/Context;)V
    //   16: aload_3
    //   17: ifnonnull +200 -> 217
    //   20: new 64	android/os/Bundle
    //   23: dup
    //   24: invokespecial 66	android/os/Bundle:<init>	()V
    //   27: astore_3
    //   28: aload_0
    //   29: invokevirtual 70	android/content/Context:getApplicationInfo	()Landroid/content/pm/ApplicationInfo;
    //   32: getfield 75	android/content/pm/ApplicationInfo:packageName	Ljava/lang/String;
    //   35: astore_0
    //   36: aload_3
    //   37: ldc 77
    //   39: aload_0
    //   40: invokevirtual 80	android/os/Bundle:putString	(Ljava/lang/String;Ljava/lang/String;)V
    //   43: aload_3
    //   44: getstatic 20	bsn:a	Ljava/lang/String;
    //   47: invokevirtual 84	android/os/Bundle:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   50: invokestatic 90	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   53: ifeq +11 -> 64
    //   56: aload_3
    //   57: getstatic 20	bsn:a	Ljava/lang/String;
    //   60: aload_0
    //   61: invokevirtual 80	android/os/Bundle:putString	(Ljava/lang/String;Ljava/lang/String;)V
    //   64: aload 4
    //   66: ifnull +14 -> 80
    //   69: aload_3
    //   70: ldc 92
    //   72: aload 4
    //   74: invokevirtual 98	java/lang/Boolean:booleanValue	()Z
    //   77: invokevirtual 102	android/os/Bundle:putBoolean	(Ljava/lang/String;Z)V
    //   80: new 104	caf
    //   83: dup
    //   84: invokespecial 105	caf:<init>	()V
    //   87: astore_0
    //   88: aload 5
    //   90: invokestatic 110	byz:a	(Landroid/content/Context;)Lbyz;
    //   93: astore 4
    //   95: aload 4
    //   97: getstatic 32	bsn:b	Landroid/content/ComponentName;
    //   100: aload_0
    //   101: ldc 112
    //   103: invokevirtual 115	byz:a	(Landroid/content/ComponentName;Landroid/content/ServiceConnection;Ljava/lang/String;)Z
    //   106: ifeq +425 -> 531
    //   109: aload_0
    //   110: invokevirtual 118	caf:a	()Landroid/os/IBinder;
    //   113: invokestatic 123	cln:a	(Landroid/os/IBinder;)Lclm;
    //   116: aload_1
    //   117: aload_2
    //   118: aload_3
    //   119: invokeinterface 128 4 0
    //   124: astore_2
    //   125: aload_2
    //   126: ifnonnull +103 -> 229
    //   129: ldc 112
    //   131: ldc -126
    //   133: invokestatic 136	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   136: pop
    //   137: new 138	bsm
    //   140: astore_1
    //   141: aload_1
    //   142: ldc -116
    //   144: invokespecial 142	bsm:<init>	(Ljava/lang/String;)V
    //   147: aload_1
    //   148: athrow
    //   149: astore_1
    //   150: new 144	java/io/IOException
    //   153: astore_1
    //   154: aload_1
    //   155: ldc -110
    //   157: invokespecial 147	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   160: aload_1
    //   161: athrow
    //   162: astore_1
    //   163: aload 4
    //   165: getstatic 32	bsn:b	Landroid/content/ComponentName;
    //   168: aload_0
    //   169: ldc 112
    //   171: invokevirtual 150	byz:b	(Landroid/content/ComponentName;Landroid/content/ServiceConnection;Ljava/lang/String;)V
    //   174: aload_1
    //   175: athrow
    //   176: astore_0
    //   177: new 152	bso
    //   180: dup
    //   181: aload_0
    //   182: getfield 154	bvs:a	I
    //   185: aload_0
    //   186: invokevirtual 158	bvs:getMessage	()Ljava/lang/String;
    //   189: new 160	android/content/Intent
    //   192: dup
    //   193: aload_0
    //   194: getfield 165	bvw:b	Landroid/content/Intent;
    //   197: invokespecial 168	android/content/Intent:<init>	(Landroid/content/Intent;)V
    //   200: invokespecial 171	bso:<init>	(ILjava/lang/String;Landroid/content/Intent;)V
    //   203: athrow
    //   204: astore_0
    //   205: new 138	bsm
    //   208: dup
    //   209: aload_0
    //   210: invokevirtual 172	bvr:getMessage	()Ljava/lang/String;
    //   213: invokespecial 142	bsm:<init>	(Ljava/lang/String;)V
    //   216: athrow
    //   217: new 64	android/os/Bundle
    //   220: dup
    //   221: aload_3
    //   222: invokespecial 175	android/os/Bundle:<init>	(Landroid/os/Bundle;)V
    //   225: astore_3
    //   226: goto -198 -> 28
    //   229: aload_2
    //   230: ldc -79
    //   232: invokevirtual 84	android/os/Bundle:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   235: invokestatic 90	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   238: istore 7
    //   240: iload 7
    //   242: ifne +16 -> 258
    //   245: aload 4
    //   247: getstatic 32	bsn:b	Landroid/content/ComponentName;
    //   250: aload_0
    //   251: ldc 112
    //   253: invokevirtual 150	byz:b	(Landroid/content/ComponentName;Landroid/content/ServiceConnection;Ljava/lang/String;)V
    //   256: aload_2
    //   257: areturn
    //   258: aload_2
    //   259: ldc -77
    //   261: invokevirtual 84	android/os/Bundle:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   264: astore_1
    //   265: aload_2
    //   266: ldc -75
    //   268: invokevirtual 185	android/os/Bundle:getParcelable	(Ljava/lang/String;)Landroid/os/Parcelable;
    //   271: checkcast 160	android/content/Intent
    //   274: astore_3
    //   275: ldc -69
    //   277: aload_1
    //   278: invokevirtual 193	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   281: ifne +148 -> 429
    //   284: ldc -61
    //   286: aload_1
    //   287: invokevirtual 193	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   290: ifne +139 -> 429
    //   293: ldc -59
    //   295: aload_1
    //   296: invokevirtual 193	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   299: ifne +130 -> 429
    //   302: ldc -57
    //   304: aload_1
    //   305: invokevirtual 193	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   308: ifne +121 -> 429
    //   311: ldc -55
    //   313: aload_1
    //   314: invokevirtual 193	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   317: ifne +112 -> 429
    //   320: ldc -53
    //   322: aload_1
    //   323: invokevirtual 193	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   326: ifne +103 -> 429
    //   329: ldc -51
    //   331: aload_1
    //   332: invokevirtual 193	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   335: ifne +94 -> 429
    //   338: getstatic 210	bsq:b	Lbsq;
    //   341: getfield 212	bsq:h	Ljava/lang/String;
    //   344: aload_1
    //   345: invokevirtual 193	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   348: ifne +81 -> 429
    //   351: getstatic 215	bsq:c	Lbsq;
    //   354: getfield 212	bsq:h	Ljava/lang/String;
    //   357: aload_1
    //   358: invokevirtual 193	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   361: ifne +68 -> 429
    //   364: getstatic 218	bsq:d	Lbsq;
    //   367: getfield 212	bsq:h	Ljava/lang/String;
    //   370: aload_1
    //   371: invokevirtual 193	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   374: ifne +55 -> 429
    //   377: getstatic 221	bsq:e	Lbsq;
    //   380: getfield 212	bsq:h	Ljava/lang/String;
    //   383: aload_1
    //   384: invokevirtual 193	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   387: ifne +42 -> 429
    //   390: getstatic 224	bsq:f	Lbsq;
    //   393: getfield 212	bsq:h	Ljava/lang/String;
    //   396: aload_1
    //   397: invokevirtual 193	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   400: ifne +29 -> 429
    //   403: getstatic 227	bsq:g	Lbsq;
    //   406: getfield 212	bsq:h	Ljava/lang/String;
    //   409: aload_1
    //   410: invokevirtual 193	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   413: ifne +16 -> 429
    //   416: getstatic 229	bsq:a	Lbsq;
    //   419: getfield 212	bsq:h	Ljava/lang/String;
    //   422: aload_1
    //   423: invokevirtual 193	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   426: ifeq +36 -> 462
    //   429: iconst_1
    //   430: istore 6
    //   432: iload 6
    //   434: ifeq +34 -> 468
    //   437: new 231	bsp
    //   440: astore_2
    //   441: aload_2
    //   442: aload_1
    //   443: aload_3
    //   444: invokespecial 234	bsp:<init>	(Ljava/lang/String;Landroid/content/Intent;)V
    //   447: aload_2
    //   448: athrow
    //   449: astore_1
    //   450: new 138	bsm
    //   453: astore_1
    //   454: aload_1
    //   455: ldc -20
    //   457: invokespecial 142	bsm:<init>	(Ljava/lang/String;)V
    //   460: aload_1
    //   461: athrow
    //   462: iconst_0
    //   463: istore 6
    //   465: goto -33 -> 432
    //   468: ldc -18
    //   470: aload_1
    //   471: invokevirtual 193	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   474: ifne +21 -> 495
    //   477: ldc -116
    //   479: aload_1
    //   480: invokevirtual 193	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   483: ifne +12 -> 495
    //   486: ldc -16
    //   488: aload_1
    //   489: invokevirtual 193	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   492: ifeq +22 -> 514
    //   495: iconst_1
    //   496: istore 6
    //   498: iload 6
    //   500: ifeq +20 -> 520
    //   503: new 144	java/io/IOException
    //   506: astore_2
    //   507: aload_2
    //   508: aload_1
    //   509: invokespecial 147	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   512: aload_2
    //   513: athrow
    //   514: iconst_0
    //   515: istore 6
    //   517: goto -19 -> 498
    //   520: new 138	bsm
    //   523: astore_2
    //   524: aload_2
    //   525: aload_1
    //   526: invokespecial 142	bsm:<init>	(Ljava/lang/String;)V
    //   529: aload_2
    //   530: athrow
    //   531: new 144	java/io/IOException
    //   534: dup
    //   535: ldc -14
    //   537: invokespecial 147	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   540: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	541	0	paramContext	Context
    //   0	541	1	paramAccount	Account
    //   0	541	2	paramString	String
    //   0	541	3	paramBundle	Bundle
    //   0	541	4	paramBoolean	Boolean
    //   4	85	5	localContext	Context
    //   430	86	6	i	int
    //   238	3	7	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   109	125	149	android/os/RemoteException
    //   129	149	149	android/os/RemoteException
    //   229	240	149	android/os/RemoteException
    //   258	429	149	android/os/RemoteException
    //   437	449	149	android/os/RemoteException
    //   468	495	149	android/os/RemoteException
    //   503	514	149	android/os/RemoteException
    //   520	531	149	android/os/RemoteException
    //   109	125	162	finally
    //   129	149	162	finally
    //   150	162	162	finally
    //   229	240	162	finally
    //   258	429	162	finally
    //   437	449	162	finally
    //   450	462	162	finally
    //   468	495	162	finally
    //   503	514	162	finally
    //   520	531	162	finally
    //   11	16	176	bvs
    //   11	16	204	bvr
    //   109	125	449	java/lang/InterruptedException
    //   129	149	449	java/lang/InterruptedException
    //   229	240	449	java/lang/InterruptedException
    //   258	429	449	java/lang/InterruptedException
    //   437	449	449	java/lang/InterruptedException
    //   468	495	449	java/lang/InterruptedException
    //   503	514	449	java/lang/InterruptedException
    //   520	531	449	java/lang/InterruptedException
  }
  
  @Deprecated
  public static String a(Context paramContext, String paramString1, String paramString2)
  {
    return a(paramContext, new Account(paramString1, "com.google"), paramString2, new Bundle(), null).getString("authtoken");
  }
  
  @Deprecated
  public static void a(Context paramContext, String paramString)
  {
    AccountManager.get(paramContext).invalidateAuthToken("com.google", paramString);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bsn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */