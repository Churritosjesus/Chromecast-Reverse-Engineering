import android.content.ComponentName;
import android.content.ServiceConnection;

public final class brh
  implements ServiceConnection
{
  private volatile bqg b;
  private volatile boolean c;
  
  protected brh(brf parambrf) {}
  
  /* Error */
  public final bqg a()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: aload_0
    //   3: getfield 16	brh:a	Lbrf;
    //   6: astore_2
    //   7: invokestatic 28	brb:i	()V
    //   10: new 30	android/content/Intent
    //   13: dup
    //   14: ldc 32
    //   16: invokespecial 35	android/content/Intent:<init>	(Ljava/lang/String;)V
    //   19: astore 4
    //   21: aload 4
    //   23: new 37	android/content/ComponentName
    //   26: dup
    //   27: ldc 39
    //   29: ldc 41
    //   31: invokespecial 44	android/content/ComponentName:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   34: invokevirtual 48	android/content/Intent:setComponent	(Landroid/content/ComponentName;)Landroid/content/Intent;
    //   37: pop
    //   38: aload_0
    //   39: getfield 16	brh:a	Lbrf;
    //   42: invokevirtual 54	brf:l	()Landroid/content/Context;
    //   45: astore_3
    //   46: aload 4
    //   48: ldc 56
    //   50: aload_3
    //   51: invokevirtual 62	android/content/Context:getPackageName	()Ljava/lang/String;
    //   54: invokevirtual 66	android/content/Intent:putExtra	(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   57: pop
    //   58: invokestatic 71	bzw:a	()Lbzw;
    //   61: astore_2
    //   62: aload_0
    //   63: monitorenter
    //   64: aload_0
    //   65: aconst_null
    //   66: putfield 73	brh:b	Lbqg;
    //   69: aload_0
    //   70: iconst_1
    //   71: putfield 75	brh:c	Z
    //   74: aload_2
    //   75: aload_3
    //   76: aload 4
    //   78: aload_0
    //   79: getfield 16	brh:a	Lbrf;
    //   82: getfield 78	brf:a	Lbrh;
    //   85: sipush 129
    //   88: invokevirtual 81	bzw:a	(Landroid/content/Context;Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z
    //   91: istore 5
    //   93: aload_0
    //   94: getfield 16	brh:a	Lbrf;
    //   97: ldc 83
    //   99: iload 5
    //   101: invokestatic 89	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   104: invokevirtual 92	brf:a	(Ljava/lang/String;Ljava/lang/Object;)V
    //   107: iload 5
    //   109: ifne +12 -> 121
    //   112: aload_0
    //   113: iconst_0
    //   114: putfield 75	brh:c	Z
    //   117: aload_0
    //   118: monitorexit
    //   119: aload_1
    //   120: areturn
    //   121: aload_0
    //   122: getstatic 98	bqd:B	Lbqe;
    //   125: invokevirtual 103	bqe:a	()Ljava/lang/Object;
    //   128: checkcast 105	java/lang/Long
    //   131: invokevirtual 109	java/lang/Long:longValue	()J
    //   134: invokevirtual 113	java/lang/Object:wait	(J)V
    //   137: aload_0
    //   138: iconst_0
    //   139: putfield 75	brh:c	Z
    //   142: aload_0
    //   143: getfield 73	brh:b	Lbqg;
    //   146: astore_1
    //   147: aload_0
    //   148: aconst_null
    //   149: putfield 73	brh:b	Lbqg;
    //   152: aload_1
    //   153: ifnonnull +12 -> 165
    //   156: aload_0
    //   157: getfield 16	brh:a	Lbrf;
    //   160: ldc 115
    //   162: invokevirtual 118	brf:f	(Ljava/lang/String;)V
    //   165: aload_0
    //   166: monitorexit
    //   167: goto -48 -> 119
    //   170: astore_1
    //   171: aload_0
    //   172: monitorexit
    //   173: aload_1
    //   174: athrow
    //   175: astore_1
    //   176: aload_0
    //   177: getfield 16	brh:a	Lbrf;
    //   180: ldc 120
    //   182: invokevirtual 123	brf:e	(Ljava/lang/String;)V
    //   185: goto -48 -> 137
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	188	0	this	brh
    //   1	152	1	localbqg	bqg
    //   170	4	1	localObject1	Object
    //   175	1	1	localInterruptedException	InterruptedException
    //   6	69	2	localObject2	Object
    //   45	31	3	localContext	android.content.Context
    //   19	58	4	localIntent	android.content.Intent
    //   91	17	5	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   64	107	170	finally
    //   112	119	170	finally
    //   121	137	170	finally
    //   137	152	170	finally
    //   156	165	170	finally
    //   165	167	170	finally
    //   171	173	170	finally
    //   176	185	170	finally
    //   121	137	175	java/lang/InterruptedException
  }
  
  /* Error */
  public final void onServiceConnected(ComponentName paramComponentName, android.os.IBinder paramIBinder)
  {
    // Byte code:
    //   0: ldc -125
    //   2: invokestatic 135	a:g	(Ljava/lang/String;)V
    //   5: aload_0
    //   6: monitorenter
    //   7: aload_2
    //   8: ifnonnull +19 -> 27
    //   11: aload_0
    //   12: getfield 16	brh:a	Lbrf;
    //   15: ldc -119
    //   17: invokevirtual 118	brf:f	(Ljava/lang/String;)V
    //   20: aload_0
    //   21: invokevirtual 140	java/lang/Object:notifyAll	()V
    //   24: aload_0
    //   25: monitorexit
    //   26: return
    //   27: aconst_null
    //   28: astore 4
    //   30: aconst_null
    //   31: astore_3
    //   32: aload 4
    //   34: astore_1
    //   35: aload_2
    //   36: invokeinterface 145 1 0
    //   41: astore 5
    //   43: aload 4
    //   45: astore_1
    //   46: ldc -109
    //   48: aload 5
    //   50: invokevirtual 153	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   53: ifeq +62 -> 115
    //   56: aload 4
    //   58: astore_1
    //   59: aload_2
    //   60: invokestatic 158	bqh:a	(Landroid/os/IBinder;)Lbqg;
    //   63: astore_2
    //   64: aload_2
    //   65: astore_1
    //   66: aload_0
    //   67: getfield 16	brh:a	Lbrf;
    //   70: ldc -96
    //   72: invokevirtual 162	brf:b	(Ljava/lang/String;)V
    //   75: aload_2
    //   76: astore_1
    //   77: aload_1
    //   78: ifnonnull +76 -> 154
    //   81: invokestatic 71	bzw:a	()Lbzw;
    //   84: aload_0
    //   85: getfield 16	brh:a	Lbrf;
    //   88: invokevirtual 54	brf:l	()Landroid/content/Context;
    //   91: aload_0
    //   92: getfield 16	brh:a	Lbrf;
    //   95: getfield 78	brf:a	Lbrh;
    //   98: invokevirtual 165	bzw:a	(Landroid/content/Context;Landroid/content/ServiceConnection;)V
    //   101: aload_0
    //   102: invokevirtual 140	java/lang/Object:notifyAll	()V
    //   105: aload_0
    //   106: monitorexit
    //   107: goto -81 -> 26
    //   110: astore_1
    //   111: aload_0
    //   112: monitorexit
    //   113: aload_1
    //   114: athrow
    //   115: aload 4
    //   117: astore_1
    //   118: aload_0
    //   119: getfield 16	brh:a	Lbrf;
    //   122: ldc -89
    //   124: aload 5
    //   126: invokevirtual 169	brf:e	(Ljava/lang/String;Ljava/lang/Object;)V
    //   129: aload_3
    //   130: astore_1
    //   131: goto -54 -> 77
    //   134: astore_2
    //   135: aload_0
    //   136: getfield 16	brh:a	Lbrf;
    //   139: ldc -85
    //   141: invokevirtual 118	brf:f	(Ljava/lang/String;)V
    //   144: goto -67 -> 77
    //   147: astore_1
    //   148: aload_0
    //   149: invokevirtual 140	java/lang/Object:notifyAll	()V
    //   152: aload_1
    //   153: athrow
    //   154: aload_0
    //   155: getfield 75	brh:c	Z
    //   158: ifne +41 -> 199
    //   161: aload_0
    //   162: getfield 16	brh:a	Lbrf;
    //   165: ldc -83
    //   167: invokevirtual 123	brf:e	(Ljava/lang/String;)V
    //   170: aload_0
    //   171: getfield 16	brh:a	Lbrf;
    //   174: getfield 179	bqz:d	Lbrb;
    //   177: invokevirtual 182	brb:b	()Lcox;
    //   180: astore_2
    //   181: new 184	bri
    //   184: astore_3
    //   185: aload_3
    //   186: aload_0
    //   187: aload_1
    //   188: invokespecial 187	bri:<init>	(Lbrh;Lbqg;)V
    //   191: aload_2
    //   192: aload_3
    //   193: invokevirtual 192	cox:a	(Ljava/lang/Runnable;)V
    //   196: goto -95 -> 101
    //   199: aload_0
    //   200: aload_1
    //   201: putfield 73	brh:b	Lbqg;
    //   204: goto -103 -> 101
    //   207: astore_1
    //   208: goto -107 -> 101
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	211	0	this	brh
    //   0	211	1	paramComponentName	ComponentName
    //   0	211	2	paramIBinder	android.os.IBinder
    //   31	162	3	localbri	bri
    //   28	88	4	localObject	Object
    //   41	84	5	str	String
    // Exception table:
    //   from	to	target	type
    //   20	26	110	finally
    //   101	107	110	finally
    //   111	113	110	finally
    //   148	154	110	finally
    //   35	43	134	android/os/RemoteException
    //   46	56	134	android/os/RemoteException
    //   59	64	134	android/os/RemoteException
    //   66	75	134	android/os/RemoteException
    //   118	129	134	android/os/RemoteException
    //   11	20	147	finally
    //   35	43	147	finally
    //   46	56	147	finally
    //   59	64	147	finally
    //   66	75	147	finally
    //   81	101	147	finally
    //   118	129	147	finally
    //   135	144	147	finally
    //   154	196	147	finally
    //   199	204	147	finally
    //   81	101	207	java/lang/IllegalArgumentException
  }
  
  public final void onServiceDisconnected(ComponentName paramComponentName)
  {
    a.g("AnalyticsServiceConnection.onServiceDisconnected");
    this.a.d.b().a(new brj(this, paramComponentName));
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\brh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */