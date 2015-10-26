import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;

public class bpk
  extends Service
{
  private static Boolean b;
  private Handler a;
  
  public static boolean a(Context paramContext)
  {
    a.c(paramContext);
    boolean bool;
    if (b != null) {
      bool = b.booleanValue();
    }
    for (;;)
    {
      return bool;
      bool = bqs.a(paramContext, bpk.class);
      b = Boolean.valueOf(bool);
    }
  }
  
  protected final void a(bql parambql, Handler paramHandler, int paramInt)
  {
    paramHandler.post(new bpn(this, paramInt, parambql));
  }
  
  public IBinder onBind(Intent paramIntent)
  {
    return null;
  }
  
  public void onCreate()
  {
    super.onCreate();
    brb.a(this).a().b("CampaignTrackingService is starting up");
  }
  
  public void onDestroy()
  {
    brb.a(this).a().b("CampaignTrackingService is shutting down");
    super.onDestroy();
  }
  
  /* Error */
  public int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    // Byte code:
    //   0: getstatic 82	bpj:a	Ljava/lang/Object;
    //   3: astore 4
    //   5: aload 4
    //   7: monitorenter
    //   8: getstatic 85	bpj:b	Landroid/os/PowerManager$WakeLock;
    //   11: astore 5
    //   13: aload 5
    //   15: ifnull +16 -> 31
    //   18: aload 5
    //   20: invokevirtual 90	android/os/PowerManager$WakeLock:isHeld	()Z
    //   23: ifeq +8 -> 31
    //   26: aload 5
    //   28: invokevirtual 93	android/os/PowerManager$WakeLock:release	()V
    //   31: aload 4
    //   33: monitorexit
    //   34: aload_0
    //   35: invokestatic 58	brb:a	(Landroid/content/Context;)Lbrb;
    //   38: astore 7
    //   40: aload 7
    //   42: invokevirtual 61	brb:a	()Lbql;
    //   45: astore 6
    //   47: aconst_null
    //   48: astore 4
    //   50: getstatic 98	byk:a	Z
    //   53: ifeq +103 -> 156
    //   56: aload 6
    //   58: ldc 100
    //   60: invokevirtual 103	bql:f	(Ljava/lang/String;)V
    //   63: aload 4
    //   65: astore_1
    //   66: aload_0
    //   67: getfield 105	bpk:a	Landroid/os/Handler;
    //   70: astore 5
    //   72: aload 5
    //   74: astore 4
    //   76: aload 5
    //   78: ifnonnull +22 -> 100
    //   81: new 44	android/os/Handler
    //   84: dup
    //   85: aload_0
    //   86: invokevirtual 109	bpk:getMainLooper	()Landroid/os/Looper;
    //   89: invokespecial 112	android/os/Handler:<init>	(Landroid/os/Looper;)V
    //   92: astore 4
    //   94: aload_0
    //   95: aload 4
    //   97: putfield 105	bpk:a	Landroid/os/Handler;
    //   100: aload_1
    //   101: invokestatic 118	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   104: ifeq +62 -> 166
    //   107: getstatic 98	byk:a	Z
    //   110: ifne +10 -> 120
    //   113: aload 6
    //   115: ldc 120
    //   117: invokevirtual 123	bql:e	(Ljava/lang/String;)V
    //   120: aload 7
    //   122: invokevirtual 126	brb:b	()Lcox;
    //   125: new 128	bpl
    //   128: dup
    //   129: aload_0
    //   130: aload 6
    //   132: aload 4
    //   134: iload_3
    //   135: invokespecial 131	bpl:<init>	(Lbpk;Lbql;Landroid/os/Handler;I)V
    //   138: invokevirtual 136	cox:a	(Ljava/lang/Runnable;)V
    //   141: iconst_2
    //   142: ireturn
    //   143: astore 5
    //   145: aload 4
    //   147: monitorexit
    //   148: aload 5
    //   150: athrow
    //   151: astore 4
    //   153: goto -119 -> 34
    //   156: aload_1
    //   157: ldc -118
    //   159: invokevirtual 144	android/content/Intent:getStringExtra	(Ljava/lang/String;)Ljava/lang/String;
    //   162: astore_1
    //   163: goto -97 -> 66
    //   166: invokestatic 149	brz:c	()I
    //   169: istore_2
    //   170: aload_1
    //   171: invokevirtual 154	java/lang/String:length	()I
    //   174: iload_2
    //   175: if_icmpgt +40 -> 215
    //   178: aload 6
    //   180: ldc -100
    //   182: iload_3
    //   183: invokestatic 161	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   186: aload_1
    //   187: invokevirtual 164	bql:a	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   190: aload 7
    //   192: invokevirtual 167	brb:c	()Lbqu;
    //   195: aload_1
    //   196: new 169	bpm
    //   199: dup
    //   200: aload_0
    //   201: aload 6
    //   203: aload 4
    //   205: iload_3
    //   206: invokespecial 170	bpm:<init>	(Lbpk;Lbql;Landroid/os/Handler;I)V
    //   209: invokevirtual 175	bqu:a	(Ljava/lang/String;Ljava/lang/Runnable;)V
    //   212: goto -71 -> 141
    //   215: aload 6
    //   217: ldc -79
    //   219: aload_1
    //   220: invokevirtual 154	java/lang/String:length	()I
    //   223: invokestatic 161	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   226: iload_2
    //   227: invokestatic 161	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   230: invokevirtual 179	bql:c	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   233: aload_1
    //   234: iconst_0
    //   235: iload_2
    //   236: invokevirtual 183	java/lang/String:substring	(II)Ljava/lang/String;
    //   239: astore_1
    //   240: goto -62 -> 178
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	243	0	this	bpk
    //   0	243	1	paramIntent	Intent
    //   0	243	2	paramInt1	int
    //   0	243	3	paramInt2	int
    //   151	53	4	localSecurityException	SecurityException
    //   11	66	5	localObject2	Object
    //   143	6	5	localObject3	Object
    //   45	171	6	localbql	bql
    //   38	153	7	localbrb	brb
    // Exception table:
    //   from	to	target	type
    //   8	13	143	finally
    //   18	31	143	finally
    //   31	34	143	finally
    //   145	148	143	finally
    //   0	8	151	java/lang/SecurityException
    //   148	151	151	java/lang/SecurityException
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bpk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */