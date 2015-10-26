import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.Lock;

public class bwi
{
  final WeakReference a;
  final bvz b;
  final int c;
  
  public bwi(bws parambws, bvz parambvz, int paramInt)
  {
    this.a = new WeakReference(parambws);
    this.b = parambvz;
    this.c = paramInt;
  }
  
  /* Error */
  public void a(ConnectionResult paramConnectionResult)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_3
    //   2: aload_0
    //   3: getfield 22	bwi:a	Ljava/lang/ref/WeakReference;
    //   6: invokevirtual 32	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
    //   9: checkcast 34	bws
    //   12: astore_2
    //   13: aload_2
    //   14: ifnonnull +4 -> 18
    //   17: return
    //   18: invokestatic 40	android/os/Looper:myLooper	()Landroid/os/Looper;
    //   21: aload_2
    //   22: getfield 43	bws:a	Lbwz;
    //   25: getfield 49	bwz:e	Landroid/os/Looper;
    //   28: if_acmpne +5 -> 33
    //   31: iconst_1
    //   32: istore_3
    //   33: iload_3
    //   34: ldc 51
    //   36: invokestatic 55	a:a	(ZLjava/lang/Object;)V
    //   39: aload_2
    //   40: getfield 58	bws:b	Ljava/util/concurrent/locks/Lock;
    //   43: invokeinterface 63 1 0
    //   48: aload_2
    //   49: iconst_0
    //   50: invokevirtual 66	bws:b	(I)Z
    //   53: istore_3
    //   54: iload_3
    //   55: ifne +15 -> 70
    //   58: aload_2
    //   59: getfield 58	bws:b	Ljava/util/concurrent/locks/Lock;
    //   62: invokeinterface 69 1 0
    //   67: goto -50 -> 17
    //   70: aload_1
    //   71: invokevirtual 74	com/google/android/gms/common/ConnectionResult:b	()Z
    //   74: ifne +16 -> 90
    //   77: aload_2
    //   78: aload_1
    //   79: aload_0
    //   80: getfield 24	bwi:b	Lbvz;
    //   83: aload_0
    //   84: getfield 26	bwi:c	I
    //   87: invokevirtual 77	bws:b	(Lcom/google/android/gms/common/ConnectionResult;Lbvz;I)V
    //   90: aload_2
    //   91: invokevirtual 80	bws:d	()Z
    //   94: ifeq +14 -> 108
    //   97: aload_2
    //   98: getfield 83	bws:e	Z
    //   101: ifeq +19 -> 120
    //   104: aload_2
    //   105: invokevirtual 85	bws:e	()V
    //   108: aload_2
    //   109: getfield 58	bws:b	Ljava/util/concurrent/locks/Lock;
    //   112: invokeinterface 69 1 0
    //   117: goto -100 -> 17
    //   120: aload_2
    //   121: invokevirtual 88	bws:g	()V
    //   124: goto -16 -> 108
    //   127: astore_1
    //   128: aload_2
    //   129: getfield 58	bws:b	Ljava/util/concurrent/locks/Lock;
    //   132: invokeinterface 69 1 0
    //   137: aload_1
    //   138: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	139	0	this	bwi
    //   0	139	1	paramConnectionResult	ConnectionResult
    //   12	117	2	localbws	bws
    //   1	54	3	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   48	54	127	finally
    //   70	90	127	finally
    //   90	108	127	finally
    //   120	124	127	finally
  }
  
  public void b(ConnectionResult paramConnectionResult)
  {
    boolean bool = true;
    bws localbws = (bws)this.a.get();
    if (localbws == null) {}
    for (;;)
    {
      return;
      if (Looper.myLooper() == localbws.a.e)
      {
        label31:
        a.a(bool, "onReportAccountValidation must be called on the GoogleApiClient handler thread");
        localbws.b.lock();
      }
      try
      {
        bool = localbws.b(1);
        if (!bool)
        {
          localbws.b.unlock();
          continue;
          bool = false;
          break label31;
        }
        if (!paramConnectionResult.b()) {
          localbws.b(paramConnectionResult, this.b, this.c);
        }
        if (localbws.d()) {
          localbws.f();
        }
        localbws.b.unlock();
      }
      finally
      {
        localbws.b.unlock();
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bwi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */