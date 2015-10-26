import android.os.Bundle;

final class bwx
  implements bwg, bwh
{
  bwx(bws parambws) {}
  
  public final void a(int paramInt) {}
  
  public final void a(Bundle paramBundle)
  {
    this.a.d.a(new bwv(this.a));
  }
  
  /* Error */
  public final void a(com.google.android.gms.common.ConnectionResult paramConnectionResult)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 14	bwx:a	Lbws;
    //   4: getfield 40	bws:b	Ljava/util/concurrent/locks/Lock;
    //   7: invokeinterface 45 1 0
    //   12: aload_0
    //   13: getfield 14	bwx:a	Lbws;
    //   16: aload_1
    //   17: invokevirtual 48	bws:a	(Lcom/google/android/gms/common/ConnectionResult;)Z
    //   20: ifeq +30 -> 50
    //   23: aload_0
    //   24: getfield 14	bwx:a	Lbws;
    //   27: invokevirtual 51	bws:h	()V
    //   30: aload_0
    //   31: getfield 14	bwx:a	Lbws;
    //   34: invokevirtual 54	bws:g	()V
    //   37: aload_0
    //   38: getfield 14	bwx:a	Lbws;
    //   41: getfield 40	bws:b	Ljava/util/concurrent/locks/Lock;
    //   44: invokeinterface 57 1 0
    //   49: return
    //   50: aload_0
    //   51: getfield 14	bwx:a	Lbws;
    //   54: aload_1
    //   55: invokevirtual 59	bws:b	(Lcom/google/android/gms/common/ConnectionResult;)V
    //   58: goto -21 -> 37
    //   61: astore_1
    //   62: aload_0
    //   63: getfield 14	bwx:a	Lbws;
    //   66: getfield 40	bws:b	Ljava/util/concurrent/locks/Lock;
    //   69: invokeinterface 57 1 0
    //   74: aload_1
    //   75: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	76	0	this	bwx
    //   0	76	1	paramConnectionResult	com.google.android.gms.common.ConnectionResult
    // Exception table:
    //   from	to	target	type
    //   12	37	61	finally
    //   50	58	61	finally
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bwx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */