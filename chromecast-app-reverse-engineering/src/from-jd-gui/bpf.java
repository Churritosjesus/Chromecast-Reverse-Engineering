import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;

public final class bpf
  extends Service
{
  private static Boolean b;
  private final Handler a = new Handler();
  
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
      bool = bqs.a(paramContext, bpf.class);
      b = Boolean.valueOf(bool);
    }
  }
  
  public final IBinder onBind(Intent paramIntent)
  {
    return null;
  }
  
  public final void onCreate()
  {
    super.onCreate();
    bql localbql = brb.a(this).a();
    if (byk.a) {
      localbql.b("Device AnalyticsService is starting up");
    }
    for (;;)
    {
      return;
      localbql.b("Local AnalyticsService is starting up");
    }
  }
  
  public final void onDestroy()
  {
    bql localbql = brb.a(this).a();
    if (byk.a) {
      localbql.b("Device AnalyticsService is shutting down");
    }
    for (;;)
    {
      super.onDestroy();
      return;
      localbql.b("Local AnalyticsService is shutting down");
    }
  }
  
  /* Error */
  public final int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    // Byte code:
    //   0: getstatic 85	bpe:a	Ljava/lang/Object;
    //   3: astore 4
    //   5: aload 4
    //   7: monitorenter
    //   8: getstatic 88	bpe:b	Landroid/os/PowerManager$WakeLock;
    //   11: astore 5
    //   13: aload 5
    //   15: ifnull +16 -> 31
    //   18: aload 5
    //   20: invokevirtual 93	android/os/PowerManager$WakeLock:isHeld	()Z
    //   23: ifeq +8 -> 31
    //   26: aload 5
    //   28: invokevirtual 96	android/os/PowerManager$WakeLock:release	()V
    //   31: aload 4
    //   33: monitorexit
    //   34: aload_0
    //   35: invokestatic 52	brb:a	(Landroid/content/Context;)Lbrb;
    //   38: astore 4
    //   40: aload 4
    //   42: invokevirtual 55	brb:a	()Lbql;
    //   45: astore 5
    //   47: aload_1
    //   48: invokevirtual 102	android/content/Intent:getAction	()Ljava/lang/String;
    //   51: astore_1
    //   52: getstatic 60	byk:a	Z
    //   55: ifeq +60 -> 115
    //   58: aload 5
    //   60: ldc 104
    //   62: iload_3
    //   63: invokestatic 109	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   66: aload_1
    //   67: invokevirtual 112	bql:a	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   70: ldc 114
    //   72: aload_1
    //   73: invokevirtual 120	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   76: ifeq +24 -> 100
    //   79: aload 4
    //   81: invokevirtual 123	brb:c	()Lbqu;
    //   84: new 125	bpg
    //   87: dup
    //   88: aload_0
    //   89: iload_3
    //   90: aload 4
    //   92: aload 5
    //   94: invokespecial 128	bpg:<init>	(Lbpf;ILbrb;Lbql;)V
    //   97: invokevirtual 133	bqu:a	(Lbsf;)V
    //   100: iconst_2
    //   101: ireturn
    //   102: astore 5
    //   104: aload 4
    //   106: monitorexit
    //   107: aload 5
    //   109: athrow
    //   110: astore 4
    //   112: goto -78 -> 34
    //   115: aload 5
    //   117: ldc -121
    //   119: iload_3
    //   120: invokestatic 109	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   123: aload_1
    //   124: invokevirtual 112	bql:a	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   127: goto -57 -> 70
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	130	0	this	bpf
    //   0	130	1	paramIntent	Intent
    //   0	130	2	paramInt1	int
    //   0	130	3	paramInt2	int
    //   110	1	4	localSecurityException	SecurityException
    //   11	82	5	localObject2	Object
    //   102	14	5	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   8	13	102	finally
    //   18	31	102	finally
    //   31	34	102	finally
    //   104	107	102	finally
    //   0	8	110	java/lang/SecurityException
    //   107	110	110	java/lang/SecurityException
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bpf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */