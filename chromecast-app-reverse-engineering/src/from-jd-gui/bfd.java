import android.net.Uri;
import com.google.android.apps.chromecast.app.SetupApplication;
import java.util.concurrent.TimeUnit;

public abstract class bfd
{
  public static final int c = (int)TimeUnit.SECONDS.toMillis(10L);
  private final blp a = new blp("NetworkRequest", false);
  bfq d;
  final Object e = new Object();
  public boolean f;
  
  private static bfq a(int paramInt)
  {
    return new bfr(SetupApplication.a().i, paramInt, paramInt);
  }
  
  public abstract int a();
  
  public final bfq a(Uri paramUri, int paramInt)
  {
    return a(paramUri, null, paramInt);
  }
  
  /* Error */
  protected final bfq a(Uri arg1, bfc parambfc, int paramInt)
  {
    // Byte code:
    //   0: iload_3
    //   1: invokestatic 72	bfd:a	(I)Lbfq;
    //   4: astore 5
    //   6: aload 5
    //   8: ldc 74
    //   10: ldc 76
    //   12: invokeinterface 81 3 0
    //   17: aload_0
    //   18: getfield 36	bfd:e	Ljava/lang/Object;
    //   21: astore 4
    //   23: aload 4
    //   25: monitorenter
    //   26: aload_0
    //   27: aload 5
    //   29: putfield 83	bfd:d	Lbfq;
    //   32: aload 4
    //   34: monitorexit
    //   35: aload 5
    //   37: aload_1
    //   38: aload_2
    //   39: invokeinterface 86 3 0
    //   44: aload_0
    //   45: getfield 36	bfd:e	Ljava/lang/Object;
    //   48: astore_1
    //   49: aload_1
    //   50: monitorenter
    //   51: aload_0
    //   52: aconst_null
    //   53: putfield 83	bfd:d	Lbfq;
    //   56: aload_1
    //   57: monitorexit
    //   58: aload 5
    //   60: areturn
    //   61: astore_1
    //   62: aload 4
    //   64: monitorexit
    //   65: aload_1
    //   66: athrow
    //   67: astore_1
    //   68: aload_1
    //   69: athrow
    //   70: astore_2
    //   71: aload_0
    //   72: getfield 36	bfd:e	Ljava/lang/Object;
    //   75: astore_1
    //   76: aload_1
    //   77: monitorenter
    //   78: aload_0
    //   79: aconst_null
    //   80: putfield 83	bfd:d	Lbfq;
    //   83: aload_1
    //   84: monitorexit
    //   85: aload_2
    //   86: athrow
    //   87: astore_2
    //   88: aload_1
    //   89: monitorexit
    //   90: aload_2
    //   91: athrow
    //   92: astore_1
    //   93: aload_1
    //   94: athrow
    //   95: astore_2
    //   96: aload_1
    //   97: monitorexit
    //   98: aload_2
    //   99: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	100	0	this	bfd
    //   0	100	2	parambfc	bfc
    //   0	100	3	paramInt	int
    //   4	55	5	localbfq	bfq
    // Exception table:
    //   from	to	target	type
    //   26	35	61	finally
    //   62	65	61	finally
    //   17	26	67	java/io/IOException
    //   35	44	67	java/io/IOException
    //   65	67	67	java/io/IOException
    //   17	26	70	finally
    //   35	44	70	finally
    //   65	67	70	finally
    //   68	70	70	finally
    //   93	95	70	finally
    //   51	58	87	finally
    //   88	90	87	finally
    //   17	26	92	java/util/concurrent/TimeoutException
    //   35	44	92	java/util/concurrent/TimeoutException
    //   65	67	92	java/util/concurrent/TimeoutException
    //   78	85	95	finally
    //   96	98	95	finally
  }
  
  /* Error */
  protected final bfq a(Uri arg1, java.util.Map arg2, int paramInt)
  {
    // Byte code:
    //   0: iload_3
    //   1: invokestatic 72	bfd:a	(I)Lbfq;
    //   4: astore 4
    //   6: aload 4
    //   8: ldc 74
    //   10: ldc 76
    //   12: invokeinterface 81 3 0
    //   17: aload_2
    //   18: ifnull +61 -> 79
    //   21: aload_2
    //   22: invokeinterface 92 1 0
    //   27: invokeinterface 98 1 0
    //   32: astore 6
    //   34: aload 6
    //   36: invokeinterface 104 1 0
    //   41: ifeq +38 -> 79
    //   44: aload 6
    //   46: invokeinterface 108 1 0
    //   51: checkcast 110	java/lang/String
    //   54: astore 5
    //   56: aload 4
    //   58: aload 5
    //   60: aload_2
    //   61: aload 5
    //   63: invokeinterface 114 2 0
    //   68: checkcast 110	java/lang/String
    //   71: invokeinterface 81 3 0
    //   76: goto -42 -> 34
    //   79: aload_0
    //   80: getfield 36	bfd:e	Ljava/lang/Object;
    //   83: astore_2
    //   84: aload_2
    //   85: monitorenter
    //   86: aload_0
    //   87: aload 4
    //   89: putfield 83	bfd:d	Lbfq;
    //   92: aload_2
    //   93: monitorexit
    //   94: aload 4
    //   96: aload_1
    //   97: invokeinterface 117 2 0
    //   102: aload_0
    //   103: getfield 36	bfd:e	Ljava/lang/Object;
    //   106: astore_1
    //   107: aload_1
    //   108: monitorenter
    //   109: aload_0
    //   110: aconst_null
    //   111: putfield 83	bfd:d	Lbfq;
    //   114: aload_1
    //   115: monitorexit
    //   116: aload 4
    //   118: areturn
    //   119: astore_1
    //   120: aload_2
    //   121: monitorexit
    //   122: aload_1
    //   123: athrow
    //   124: astore_1
    //   125: aload_1
    //   126: athrow
    //   127: astore_2
    //   128: aload_0
    //   129: getfield 36	bfd:e	Ljava/lang/Object;
    //   132: astore_1
    //   133: aload_1
    //   134: monitorenter
    //   135: aload_0
    //   136: aconst_null
    //   137: putfield 83	bfd:d	Lbfq;
    //   140: aload_1
    //   141: monitorexit
    //   142: aload_2
    //   143: athrow
    //   144: astore_2
    //   145: aload_1
    //   146: monitorexit
    //   147: aload_2
    //   148: athrow
    //   149: astore_1
    //   150: aload_1
    //   151: athrow
    //   152: astore_2
    //   153: aload_1
    //   154: monitorexit
    //   155: aload_2
    //   156: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	157	0	this	bfd
    //   0	157	3	paramInt	int
    //   4	113	4	localbfq	bfq
    //   54	8	5	str	String
    //   32	13	6	localIterator	java.util.Iterator
    // Exception table:
    //   from	to	target	type
    //   86	94	119	finally
    //   120	122	119	finally
    //   79	86	124	java/io/IOException
    //   94	102	124	java/io/IOException
    //   122	124	124	java/io/IOException
    //   79	86	127	finally
    //   94	102	127	finally
    //   122	124	127	finally
    //   125	127	127	finally
    //   150	152	127	finally
    //   109	116	144	finally
    //   145	147	144	finally
    //   79	86	149	java/util/concurrent/TimeoutException
    //   94	102	149	java/util/concurrent/TimeoutException
    //   122	124	149	java/util/concurrent/TimeoutException
    //   135	142	152	finally
    //   153	155	152	finally
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bfd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */