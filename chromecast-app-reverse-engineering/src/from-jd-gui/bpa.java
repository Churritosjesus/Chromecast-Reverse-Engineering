import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import java.io.IOException;

public final class bpa
{
  private caf a;
  private ciq b;
  private boolean c;
  private Object d = new Object();
  private bpc e;
  private final Context f;
  private long g;
  
  private bpa(Context paramContext, long paramLong)
  {
    a.c(paramContext);
    this.f = paramContext;
    this.c = false;
    this.g = -1L;
  }
  
  public static bpb a(Context paramContext)
  {
    paramContext = new bpa(paramContext, -1L);
    try
    {
      paramContext.a(false);
      bpb localbpb = paramContext.b();
      return localbpb;
    }
    finally
    {
      paramContext.a();
    }
  }
  
  private static ciq a(caf paramcaf)
  {
    try
    {
      paramcaf = cir.a(paramcaf.a());
      return paramcaf;
    }
    catch (InterruptedException paramcaf)
    {
      throw new IOException("Interrupted exception");
    }
  }
  
  private void a(boolean paramBoolean)
  {
    a.h("Calling this from your main thread can lead to deadlock");
    try
    {
      if (this.c) {
        a();
      }
      this.a = b(this.f);
      this.b = a(this.a);
      this.c = true;
      return;
    }
    finally {}
  }
  
  /* Error */
  private bpb b()
  {
    // Byte code:
    //   0: ldc 71
    //   2: invokestatic 74	a:h	(Ljava/lang/String;)V
    //   5: aload_0
    //   6: monitorenter
    //   7: aload_0
    //   8: getfield 33	bpa:c	Z
    //   11: ifne +89 -> 100
    //   14: aload_0
    //   15: getfield 25	bpa:d	Ljava/lang/Object;
    //   18: astore_1
    //   19: aload_1
    //   20: monitorenter
    //   21: aload_0
    //   22: getfield 89	bpa:e	Lbpc;
    //   25: ifnull +13 -> 38
    //   28: aload_0
    //   29: getfield 89	bpa:e	Lbpc;
    //   32: getfield 93	bpc:b	Z
    //   35: ifne +25 -> 60
    //   38: new 64	java/io/IOException
    //   41: astore_2
    //   42: aload_2
    //   43: ldc 95
    //   45: invokespecial 69	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   48: aload_2
    //   49: athrow
    //   50: astore_2
    //   51: aload_1
    //   52: monitorexit
    //   53: aload_2
    //   54: athrow
    //   55: astore_1
    //   56: aload_0
    //   57: monitorexit
    //   58: aload_1
    //   59: athrow
    //   60: aload_1
    //   61: monitorexit
    //   62: aload_0
    //   63: iconst_0
    //   64: invokespecial 44	bpa:a	(Z)V
    //   67: aload_0
    //   68: getfield 33	bpa:c	Z
    //   71: ifne +29 -> 100
    //   74: new 64	java/io/IOException
    //   77: astore_1
    //   78: aload_1
    //   79: ldc 97
    //   81: invokespecial 69	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   84: aload_1
    //   85: athrow
    //   86: astore_2
    //   87: new 64	java/io/IOException
    //   90: astore_1
    //   91: aload_1
    //   92: ldc 97
    //   94: aload_2
    //   95: invokespecial 100	java/io/IOException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   98: aload_1
    //   99: athrow
    //   100: aload_0
    //   101: getfield 79	bpa:a	Lcaf;
    //   104: invokestatic 29	a:c	(Ljava/lang/Object;)Ljava/lang/Object;
    //   107: pop
    //   108: aload_0
    //   109: getfield 83	bpa:b	Lciq;
    //   112: invokestatic 29	a:c	(Ljava/lang/Object;)Ljava/lang/Object;
    //   115: pop
    //   116: new 102	bpb
    //   119: astore_2
    //   120: aload_2
    //   121: aload_0
    //   122: getfield 83	bpa:b	Lciq;
    //   125: invokeinterface 107 1 0
    //   130: aload_0
    //   131: getfield 83	bpa:b	Lciq;
    //   134: iconst_1
    //   135: invokeinterface 110 2 0
    //   140: invokespecial 113	bpb:<init>	(Ljava/lang/String;Z)V
    //   143: aload_0
    //   144: monitorexit
    //   145: aload_0
    //   146: getfield 25	bpa:d	Ljava/lang/Object;
    //   149: astore_1
    //   150: aload_1
    //   151: monitorenter
    //   152: aload_0
    //   153: getfield 89	bpa:e	Lbpc;
    //   156: ifnull +20 -> 176
    //   159: aload_0
    //   160: getfield 89	bpa:e	Lbpc;
    //   163: getfield 116	bpc:a	Ljava/util/concurrent/CountDownLatch;
    //   166: invokevirtual 121	java/util/concurrent/CountDownLatch:countDown	()V
    //   169: aload_0
    //   170: getfield 89	bpa:e	Lbpc;
    //   173: invokevirtual 124	bpc:join	()V
    //   176: aload_0
    //   177: getfield 37	bpa:g	J
    //   180: lconst_0
    //   181: lcmp
    //   182: ifle +21 -> 203
    //   185: new 91	bpc
    //   188: astore_3
    //   189: aload_3
    //   190: aload_0
    //   191: aload_0
    //   192: getfield 37	bpa:g	J
    //   195: invokespecial 127	bpc:<init>	(Lbpa;J)V
    //   198: aload_0
    //   199: aload_3
    //   200: putfield 89	bpa:e	Lbpc;
    //   203: aload_1
    //   204: monitorexit
    //   205: aload_2
    //   206: areturn
    //   207: astore_1
    //   208: new 64	java/io/IOException
    //   211: astore_1
    //   212: aload_1
    //   213: ldc -127
    //   215: invokespecial 69	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   218: aload_1
    //   219: athrow
    //   220: astore_2
    //   221: aload_1
    //   222: monitorexit
    //   223: aload_2
    //   224: athrow
    //   225: astore_3
    //   226: goto -50 -> 176
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	229	0	this	bpa
    //   18	34	1	localObject1	Object
    //   55	6	1	localObject2	Object
    //   207	1	1	localRemoteException	android.os.RemoteException
    //   211	11	1	localIOException1	IOException
    //   41	8	2	localIOException2	IOException
    //   50	4	2	localObject4	Object
    //   86	9	2	localException	Exception
    //   119	87	2	localbpb	bpb
    //   220	4	2	localObject5	Object
    //   188	12	3	localbpc	bpc
    //   225	1	3	localInterruptedException	InterruptedException
    // Exception table:
    //   from	to	target	type
    //   21	38	50	finally
    //   38	50	50	finally
    //   51	53	50	finally
    //   60	62	50	finally
    //   7	21	55	finally
    //   53	55	55	finally
    //   56	58	55	finally
    //   62	67	55	finally
    //   67	86	55	finally
    //   87	100	55	finally
    //   100	116	55	finally
    //   116	143	55	finally
    //   143	145	55	finally
    //   208	220	55	finally
    //   62	67	86	java/lang/Exception
    //   116	143	207	android/os/RemoteException
    //   152	169	220	finally
    //   169	176	220	finally
    //   176	203	220	finally
    //   203	205	220	finally
    //   221	223	220	finally
    //   169	176	225	java/lang/InterruptedException
  }
  
  private static caf b(Context paramContext)
  {
    try
    {
      paramContext.getPackageManager().getPackageInfo("com.android.vending", 0);
      caf localcaf;
      Intent localIntent;
      throw new IOException("Connection failure");
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      try
      {
        bvt.b(paramContext);
        localcaf = new caf();
        localIntent = new Intent("com.google.android.gms.ads.identifier.service.START");
        localIntent.setPackage("com.google.android.gms");
        if (!bzw.a().a(paramContext, localIntent, localcaf, 1)) {
          break label76;
        }
        return localcaf;
      }
      catch (bvr paramContext)
      {
        throw new IOException(paramContext);
      }
      paramContext = paramContext;
      throw new bvr(9);
    }
  }
  
  /* Error */
  public final void a()
  {
    // Byte code:
    //   0: ldc 71
    //   2: invokestatic 74	a:h	(Ljava/lang/String;)V
    //   5: aload_0
    //   6: monitorenter
    //   7: aload_0
    //   8: getfield 31	bpa:f	Landroid/content/Context;
    //   11: ifnull +10 -> 21
    //   14: aload_0
    //   15: getfield 79	bpa:a	Lcaf;
    //   18: ifnonnull +6 -> 24
    //   21: aload_0
    //   22: monitorexit
    //   23: return
    //   24: aload_0
    //   25: getfield 33	bpa:c	Z
    //   28: ifeq +17 -> 45
    //   31: invokestatic 169	bzw:a	()Lbzw;
    //   34: aload_0
    //   35: getfield 31	bpa:f	Landroid/content/Context;
    //   38: aload_0
    //   39: getfield 79	bpa:a	Lcaf;
    //   42: invokevirtual 185	bzw:a	(Landroid/content/Context;Landroid/content/ServiceConnection;)V
    //   45: aload_0
    //   46: iconst_0
    //   47: putfield 33	bpa:c	Z
    //   50: aload_0
    //   51: aconst_null
    //   52: putfield 83	bpa:b	Lciq;
    //   55: aload_0
    //   56: aconst_null
    //   57: putfield 79	bpa:a	Lcaf;
    //   60: aload_0
    //   61: monitorexit
    //   62: goto -39 -> 23
    //   65: astore_1
    //   66: aload_0
    //   67: monitorexit
    //   68: aload_1
    //   69: athrow
    //   70: astore_1
    //   71: goto -26 -> 45
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	74	0	this	bpa
    //   65	4	1	localObject	Object
    //   70	1	1	localIllegalArgumentException	IllegalArgumentException
    // Exception table:
    //   from	to	target	type
    //   7	21	65	finally
    //   21	23	65	finally
    //   24	45	65	finally
    //   45	62	65	finally
    //   66	68	65	finally
    //   24	45	70	java/lang/IllegalArgumentException
  }
  
  protected final void finalize()
  {
    a();
    super.finalize();
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bpa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */