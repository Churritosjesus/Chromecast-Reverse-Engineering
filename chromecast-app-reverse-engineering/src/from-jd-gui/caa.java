import android.os.SystemClock;
import android.util.Log;

public final class caa
{
  private final long a;
  private final int b;
  private final ep c;
  
  public caa()
  {
    this.a = 60000L;
    this.b = 10;
    this.c = new ep(10);
  }
  
  public caa(int paramInt, long paramLong)
  {
    this.a = paramLong;
    this.b = 1024;
    this.c = new ep();
  }
  
  public final Long a(Long paramLong)
  {
    long l2 = SystemClock.elapsedRealtime();
    long l1 = this.a;
    try
    {
      while (this.c.size() >= this.b)
      {
        for (int i = this.c.size() - 1; i >= 0; i--) {
          if (l2 - ((Long)this.c.c(i)).longValue() > l1) {
            this.c.d(i);
          }
        }
        l1 /= 2L;
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>("The max capacity ");
        Log.w("PassiveTimedConnectionMap", this.b + " is not enough. Current durationThreshold is: " + l1);
      }
      paramLong = (Long)this.c.put(paramLong, Long.valueOf(l2));
      return paramLong;
    }
    finally {}
  }
  
  /* Error */
  public final boolean a(long paramLong)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 27	caa:c	Lep;
    //   6: lload_1
    //   7: invokestatic 89	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   10: invokevirtual 98	ep:remove	(Ljava/lang/Object;)Ljava/lang/Object;
    //   13: ifnull +11 -> 24
    //   16: iconst_1
    //   17: istore 4
    //   19: aload_0
    //   20: monitorexit
    //   21: iload 4
    //   23: ireturn
    //   24: iconst_0
    //   25: istore 4
    //   27: goto -8 -> 19
    //   30: astore_3
    //   31: aload_0
    //   32: monitorexit
    //   33: aload_3
    //   34: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	35	0	this	caa
    //   0	35	1	paramLong	long
    //   30	4	3	localObject	Object
    //   17	9	4	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   2	16	30	finally
    //   19	21	30	finally
    //   31	33	30	finally
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\caa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */