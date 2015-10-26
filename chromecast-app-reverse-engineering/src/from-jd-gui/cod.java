import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.location.copresence.internal.CopresenceApiOptions;

public final class cod
  extends cno
{
  public final coa b = new coa(paramContext, this.a);
  
  public cod(Context paramContext, Looper paramLooper, bwg parambwg, bwh parambwh, String paramString, byl parambyl)
  {
    this(paramContext, paramLooper, parambwg, parambwh, paramString, parambyl, CopresenceApiOptions.a);
  }
  
  private cod(Context paramContext, Looper paramLooper, bwg parambwg, bwh parambwh, String paramString, byl parambyl, CopresenceApiOptions paramCopresenceApiOptions)
  {
    super(paramContext, paramLooper, parambwg, parambwh, paramString, parambyl);
    if (parambyl.a != null) {}
    for (paramLooper = parambyl.a.name;; paramLooper = null)
    {
      new cnn(paramContext, paramLooper, parambyl.e, this.a, paramCopresenceApiOptions);
      return;
    }
  }
  
  /* Error */
  public final void a()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 30	cod:b	Lcoa;
    //   4: astore_1
    //   5: aload_1
    //   6: monitorenter
    //   7: aload_0
    //   8: invokevirtual 58	cod:k	()Z
    //   11: istore 6
    //   13: iload 6
    //   15: ifeq +110 -> 125
    //   18: aload_0
    //   19: getfield 30	cod:b	Lcoa;
    //   22: astore_3
    //   23: aload_3
    //   24: getfield 62	coa:c	Ljava/util/Map;
    //   27: astore_2
    //   28: aload_2
    //   29: monitorenter
    //   30: aload_3
    //   31: getfield 62	coa:c	Ljava/util/Map;
    //   34: invokeinterface 68 1 0
    //   39: invokeinterface 74 1 0
    //   44: astore 5
    //   46: aload 5
    //   48: invokeinterface 79 1 0
    //   53: ifeq +79 -> 132
    //   56: aload 5
    //   58: invokeinterface 83 1 0
    //   63: checkcast 85	coc
    //   66: astore 4
    //   68: aload 4
    //   70: ifnull -24 -> 46
    //   73: aload_3
    //   74: getfield 86	coa:a	Lcoh;
    //   77: invokeinterface 91 1 0
    //   82: checkcast 93	cnu
    //   85: aload 4
    //   87: invokestatic 98	com/google/android/gms/location/internal/LocationRequestUpdateData:a	(Lcon;)Lcom/google/android/gms/location/internal/LocationRequestUpdateData;
    //   90: invokeinterface 101 2 0
    //   95: goto -49 -> 46
    //   98: astore_3
    //   99: aload_2
    //   100: monitorexit
    //   101: aload_3
    //   102: athrow
    //   103: astore_3
    //   104: new 103	java/lang/IllegalStateException
    //   107: astore_2
    //   108: aload_2
    //   109: aload_3
    //   110: invokespecial 106	java/lang/IllegalStateException:<init>	(Ljava/lang/Throwable;)V
    //   113: aload_2
    //   114: athrow
    //   115: astore_2
    //   116: ldc 108
    //   118: ldc 110
    //   120: aload_2
    //   121: invokestatic 115	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   124: pop
    //   125: aload_0
    //   126: invokespecial 117	cno:a	()V
    //   129: aload_1
    //   130: monitorexit
    //   131: return
    //   132: aload_3
    //   133: getfield 62	coa:c	Ljava/util/Map;
    //   136: invokeinterface 120 1 0
    //   141: aload_3
    //   142: getfield 123	coa:d	Ljava/util/Map;
    //   145: invokeinterface 68 1 0
    //   150: invokeinterface 74 1 0
    //   155: astore 5
    //   157: aload 5
    //   159: invokeinterface 79 1 0
    //   164: ifeq +45 -> 209
    //   167: aload 5
    //   169: invokeinterface 83 1 0
    //   174: checkcast 125	cob
    //   177: astore 4
    //   179: aload 4
    //   181: ifnull -24 -> 157
    //   184: aload_3
    //   185: getfield 86	coa:a	Lcoh;
    //   188: invokeinterface 91 1 0
    //   193: checkcast 93	cnu
    //   196: aload 4
    //   198: invokestatic 128	com/google/android/gms/location/internal/LocationRequestUpdateData:a	(Lcok;)Lcom/google/android/gms/location/internal/LocationRequestUpdateData;
    //   201: invokeinterface 101 2 0
    //   206: goto -49 -> 157
    //   209: aload_3
    //   210: getfield 123	coa:d	Ljava/util/Map;
    //   213: invokeinterface 120 1 0
    //   218: aload_2
    //   219: monitorexit
    //   220: aload_0
    //   221: getfield 30	cod:b	Lcoa;
    //   224: astore_2
    //   225: aload_2
    //   226: getfield 131	coa:b	Z
    //   229: istore 6
    //   231: iload 6
    //   233: ifeq -108 -> 125
    //   236: aload_2
    //   237: getfield 86	coa:a	Lcoh;
    //   240: invokeinterface 132 1 0
    //   245: aload_2
    //   246: getfield 86	coa:a	Lcoh;
    //   249: invokeinterface 91 1 0
    //   254: checkcast 93	cnu
    //   257: iconst_0
    //   258: invokeinterface 135 2 0
    //   263: aload_2
    //   264: iconst_0
    //   265: putfield 131	coa:b	Z
    //   268: goto -143 -> 125
    //   271: astore_2
    //   272: new 103	java/lang/IllegalStateException
    //   275: astore_3
    //   276: aload_3
    //   277: aload_2
    //   278: invokespecial 106	java/lang/IllegalStateException:<init>	(Ljava/lang/Throwable;)V
    //   281: aload_3
    //   282: athrow
    //   283: astore_2
    //   284: aload_1
    //   285: monitorexit
    //   286: aload_2
    //   287: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	288	0	this	cod
    //   4	281	1	localcoa1	coa
    //   115	104	2	localException	Exception
    //   224	40	2	localcoa2	coa
    //   271	7	2	localRemoteException1	android.os.RemoteException
    //   283	4	2	localObject2	Object
    //   22	52	3	localcoa3	coa
    //   98	4	3	localObject3	Object
    //   103	107	3	localRemoteException2	android.os.RemoteException
    //   275	7	3	localIllegalStateException	IllegalStateException
    //   66	131	4	localObject4	Object
    //   44	124	5	localIterator	java.util.Iterator
    //   11	221	6	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   30	46	98	finally
    //   46	68	98	finally
    //   73	95	98	finally
    //   99	101	98	finally
    //   132	157	98	finally
    //   157	179	98	finally
    //   184	206	98	finally
    //   209	220	98	finally
    //   23	30	103	android/os/RemoteException
    //   101	103	103	android/os/RemoteException
    //   18	23	115	java/lang/Exception
    //   23	30	115	java/lang/Exception
    //   101	103	115	java/lang/Exception
    //   104	115	115	java/lang/Exception
    //   220	231	115	java/lang/Exception
    //   236	268	115	java/lang/Exception
    //   272	283	115	java/lang/Exception
    //   236	268	271	android/os/RemoteException
    //   7	13	283	finally
    //   18	23	283	finally
    //   23	30	283	finally
    //   101	103	283	finally
    //   104	115	283	finally
    //   116	125	283	finally
    //   125	131	283	finally
    //   220	231	283	finally
    //   236	268	283	finally
    //   272	283	283	finally
    //   284	286	283	finally
  }
  
  public final boolean p()
  {
    return true;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cod.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */