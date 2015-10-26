import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;

final class cum
  extends cxt
{
  private static final Object a = new Object();
  private static cum n;
  private Context b;
  private cvo c;
  private volatile cvl d;
  private int e = 1800000;
  private boolean f = true;
  private boolean g = false;
  private boolean h = true;
  private boolean i = true;
  private cvp j = new cun(this);
  private Handler k;
  private cwg l;
  private boolean m = false;
  
  public static cum a()
  {
    if (n == null) {
      n = new cum();
    }
    return n;
  }
  
  /* Error */
  final void a(Context paramContext, cvl paramcvl)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 75	cum:b	Landroid/content/Context;
    //   6: astore_3
    //   7: aload_3
    //   8: ifnull +6 -> 14
    //   11: aload_0
    //   12: monitorexit
    //   13: return
    //   14: aload_0
    //   15: aload_1
    //   16: invokevirtual 81	android/content/Context:getApplicationContext	()Landroid/content/Context;
    //   19: putfield 75	cum:b	Landroid/content/Context;
    //   22: aload_0
    //   23: getfield 83	cum:d	Lcvl;
    //   26: ifnonnull -15 -> 11
    //   29: aload_0
    //   30: aload_2
    //   31: putfield 83	cum:d	Lcvl;
    //   34: goto -23 -> 11
    //   37: astore_1
    //   38: aload_0
    //   39: monitorexit
    //   40: aload_1
    //   41: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	42	0	this	cum
    //   0	42	1	paramContext	Context
    //   0	42	2	paramcvl	cvl
    //   6	2	3	localContext	Context
    // Exception table:
    //   from	to	target	type
    //   2	7	37	finally
    //   14	34	37	finally
  }
  
  final void a(boolean paramBoolean)
  {
    try
    {
      a(this.m, paramBoolean);
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  final void a(boolean paramBoolean1, boolean paramBoolean2)
  {
    for (;;)
    {
      try
      {
        if (this.m == paramBoolean1)
        {
          boolean bool = this.h;
          if (bool == paramBoolean2) {
            return;
          }
        }
        if (((paramBoolean1) || (!paramBoolean2)) && (this.e > 0)) {
          this.k.removeMessages(1, a);
        }
        if ((!paramBoolean1) && (paramBoolean2) && (this.e > 0)) {
          this.k.sendMessageDelayed(this.k.obtainMessage(1, a), this.e);
        }
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>("PowerSaveMode ");
        if ((paramBoolean1) || (!paramBoolean2))
        {
          String str1 = "initiated.";
          cuh.e(str1);
          this.m = paramBoolean1;
          this.h = paramBoolean2;
        }
        else
        {
          String str2 = "terminated.";
        }
      }
      finally {}
    }
  }
  
  final cvo b()
  {
    try
    {
      if (this.c != null) {
        break label54;
      }
      if (this.b == null)
      {
        IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
        localIllegalStateException.<init>("Cant get a store unless we have a context");
        throw localIllegalStateException;
      }
    }
    finally {}
    Object localObject2 = new cwl;
    ((cwl)localObject2).<init>(this.j, this.b);
    this.c = ((cvo)localObject2);
    label54:
    Object localObject4;
    Object localObject3;
    if (this.k == null)
    {
      localObject4 = new android/os/Handler;
      localObject3 = this.b.getMainLooper();
      localObject2 = new cuo;
      ((cuo)localObject2).<init>(this);
      ((Handler)localObject4).<init>((Looper)localObject3, (Handler.Callback)localObject2);
      this.k = ((Handler)localObject4);
      if (this.e > 0) {
        this.k.sendMessageDelayed(this.k.obtainMessage(1, a), this.e);
      }
    }
    this.g = true;
    if (this.f)
    {
      c();
      this.f = false;
    }
    if ((this.l == null) && (this.i))
    {
      localObject2 = new cwg;
      ((cwg)localObject2).<init>(this);
      this.l = ((cwg)localObject2);
      localObject3 = this.l;
      localObject2 = this.b;
      localObject4 = new android/content/IntentFilter;
      ((IntentFilter)localObject4).<init>();
      ((IntentFilter)localObject4).addAction("android.net.conn.CONNECTIVITY_CHANGE");
      ((Context)localObject2).registerReceiver((BroadcastReceiver)localObject3, (IntentFilter)localObject4);
      localObject4 = new android/content/IntentFilter;
      ((IntentFilter)localObject4).<init>();
      ((IntentFilter)localObject4).addAction("com.google.analytics.RADIO_POWERED");
      ((IntentFilter)localObject4).addCategory(((Context)localObject2).getPackageName());
      ((Context)localObject2).registerReceiver((BroadcastReceiver)localObject3, (IntentFilter)localObject4);
    }
    localObject2 = this.c;
    return (cvo)localObject2;
  }
  
  /* Error */
  public final void c()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 46	cum:g	Z
    //   6: ifne +16 -> 22
    //   9: ldc -80
    //   11: invokestatic 122	cuh:e	(Ljava/lang/String;)V
    //   14: aload_0
    //   15: iconst_1
    //   16: putfield 44	cum:f	Z
    //   19: aload_0
    //   20: monitorexit
    //   21: return
    //   22: aload_0
    //   23: getfield 83	cum:d	Lcvl;
    //   26: astore_2
    //   27: new 178	cup
    //   30: astore_1
    //   31: aload_1
    //   32: aload_0
    //   33: invokespecial 179	cup:<init>	(Lcum;)V
    //   36: aload_2
    //   37: aload_1
    //   38: invokeinterface 184 2 0
    //   43: goto -24 -> 19
    //   46: astore_1
    //   47: aload_0
    //   48: monitorexit
    //   49: aload_1
    //   50: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	51	0	this	cum
    //   30	8	1	localcup	cup
    //   46	4	1	localObject	Object
    //   26	11	2	localcvl	cvl
    // Exception table:
    //   from	to	target	type
    //   2	19	46	finally
    //   22	43	46	finally
  }
  
  final void d()
  {
    try
    {
      if ((!this.m) && (this.h) && (this.e > 0))
      {
        this.k.removeMessages(1, a);
        this.k.sendMessage(this.k.obtainMessage(1, a));
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cum.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */