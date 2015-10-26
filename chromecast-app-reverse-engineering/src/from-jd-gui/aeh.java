import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

final class aeh
{
  public static final boolean a = aeg.a;
  private final List b = new ArrayList();
  private boolean c = false;
  
  /* Error */
  public final void a(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: iconst_1
    //   4: putfield 27	aeh:c	Z
    //   7: aload_0
    //   8: getfield 25	aeh:b	Ljava/util/List;
    //   11: invokeinterface 34 1 0
    //   16: istore_3
    //   17: iload_3
    //   18: ifne +16 -> 34
    //   21: lconst_0
    //   22: lstore 4
    //   24: lload 4
    //   26: lconst_0
    //   27: lcmp
    //   28: ifgt +58 -> 86
    //   31: aload_0
    //   32: monitorexit
    //   33: return
    //   34: aload_0
    //   35: getfield 25	aeh:b	Ljava/util/List;
    //   38: iconst_0
    //   39: invokeinterface 38 2 0
    //   44: checkcast 40	aei
    //   47: getfield 43	aei:c	J
    //   50: lstore 4
    //   52: aload_0
    //   53: getfield 25	aeh:b	Ljava/util/List;
    //   56: aload_0
    //   57: getfield 25	aeh:b	Ljava/util/List;
    //   60: invokeinterface 34 1 0
    //   65: iconst_1
    //   66: isub
    //   67: invokeinterface 38 2 0
    //   72: checkcast 40	aei
    //   75: getfield 43	aei:c	J
    //   78: lload 4
    //   80: lsub
    //   81: lstore 4
    //   83: goto -59 -> 24
    //   86: aload_0
    //   87: getfield 25	aeh:b	Ljava/util/List;
    //   90: iconst_0
    //   91: invokeinterface 38 2 0
    //   96: checkcast 40	aei
    //   99: getfield 43	aei:c	J
    //   102: lstore 6
    //   104: ldc 45
    //   106: iconst_2
    //   107: anewarray 4	java/lang/Object
    //   110: dup
    //   111: iconst_0
    //   112: lload 4
    //   114: invokestatic 51	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   117: aastore
    //   118: dup
    //   119: iconst_1
    //   120: aload_1
    //   121: aastore
    //   122: invokestatic 54	aeg:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   125: aload_0
    //   126: getfield 25	aeh:b	Ljava/util/List;
    //   129: invokeinterface 58 1 0
    //   134: astore_2
    //   135: lload 6
    //   137: lstore 4
    //   139: aload_2
    //   140: invokeinterface 64 1 0
    //   145: ifeq -114 -> 31
    //   148: aload_2
    //   149: invokeinterface 68 1 0
    //   154: checkcast 40	aei
    //   157: astore_1
    //   158: aload_1
    //   159: getfield 43	aei:c	J
    //   162: lstore 6
    //   164: ldc 70
    //   166: iconst_3
    //   167: anewarray 4	java/lang/Object
    //   170: dup
    //   171: iconst_0
    //   172: lload 6
    //   174: lload 4
    //   176: lsub
    //   177: invokestatic 51	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   180: aastore
    //   181: dup
    //   182: iconst_1
    //   183: aload_1
    //   184: getfield 72	aei:b	J
    //   187: invokestatic 51	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   190: aastore
    //   191: dup
    //   192: iconst_2
    //   193: aload_1
    //   194: getfield 75	aei:a	Ljava/lang/String;
    //   197: aastore
    //   198: invokestatic 54	aeg:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   201: lload 6
    //   203: lstore 4
    //   205: goto -66 -> 139
    //   208: astore_1
    //   209: aload_0
    //   210: monitorexit
    //   211: aload_1
    //   212: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	213	0	this	aeh
    //   0	213	1	paramString	String
    //   134	15	2	localIterator	java.util.Iterator
    //   16	2	3	i	int
    //   22	182	4	l1	long
    //   102	100	6	l2	long
    // Exception table:
    //   from	to	target	type
    //   2	17	208	finally
    //   34	83	208	finally
    //   86	135	208	finally
    //   139	201	208	finally
  }
  
  public final void a(String paramString, long paramLong)
  {
    try
    {
      if (this.c)
      {
        paramString = new java/lang/IllegalStateException;
        paramString.<init>("Marker added to finished log");
        throw paramString;
      }
    }
    finally {}
    List localList = this.b;
    aei localaei = new aei;
    localaei.<init>(paramString, paramLong, SystemClock.elapsedRealtime());
    localList.add(localaei);
  }
  
  protected final void finalize()
  {
    if (!this.c)
    {
      a("Request on the loose");
      aeg.c("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\aeh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */