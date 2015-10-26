import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class djb
  implements Closeable
{
  private static final ExecutorService j = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), dgs.a("OkHttp SpdyConnection", true));
  public final dfx a;
  final boolean b;
  long c = 0L;
  long d;
  public final dix e = new dix();
  final dix f = new dix();
  final djr g;
  final Socket h;
  public final did i;
  private final diq k;
  private final Map l = new HashMap();
  private final String m;
  private int n;
  private int o;
  private boolean p;
  private long q = System.nanoTime();
  private final ExecutorService r;
  private final div s;
  private boolean t = false;
  private djk u;
  private final Set v = new LinkedHashSet();
  
  public djb(djj paramdjj)
  {
    this.a = paramdjj.d;
    this.s = paramdjj.e;
    this.b = paramdjj.f;
    this.k = paramdjj.c;
    int i1;
    if (paramdjj.f)
    {
      i1 = 1;
      this.o = i1;
      if ((paramdjj.f) && (this.a == dfx.d)) {
        this.o += 2;
      }
      if (paramdjj.f) {
        this.e.a(7, 0, 16777216);
      }
      this.m = paramdjj.a;
      if (this.a != dfx.d) {
        break label340;
      }
      this.g = new dij();
      this.r = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), dgs.a(String.format("OkHttp %s Push Observer", new Object[] { this.m }), true));
      this.f.a(7, 0, 65535);
      this.f.a(5, 0, 16384);
    }
    for (;;)
    {
      this.d = this.f.c(65536);
      this.h = paramdjj.b;
      this.i = this.g.a(dkk.a(dkk.a(paramdjj.b)), this.b);
      this.u = new djk(this);
      new Thread(this.u).start();
      return;
      i1 = 2;
      break;
      label340:
      if (this.a != dfx.c) {
        break label369;
      }
      this.g = new diy();
      this.r = null;
    }
    label369:
    throw new AssertionError(this.a);
  }
  
  /* Error */
  private void a(dia paramdia1, dia paramdia2)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore 6
    //   3: aload_0
    //   4: getfield 180	djb:i	Ldid;
    //   7: astore_3
    //   8: aload_3
    //   9: monitorenter
    //   10: aload_0
    //   11: monitorenter
    //   12: aload_0
    //   13: getfield 211	djb:p	Z
    //   16: ifeq +110 -> 126
    //   19: aload_0
    //   20: monitorexit
    //   21: aload_3
    //   22: monitorexit
    //   23: aconst_null
    //   24: astore_1
    //   25: aload_0
    //   26: monitorenter
    //   27: aload_0
    //   28: getfield 81	djb:l	Ljava/util/Map;
    //   31: invokeinterface 217 1 0
    //   36: ifne +199 -> 235
    //   39: aload_0
    //   40: getfield 81	djb:l	Ljava/util/Map;
    //   43: invokeinterface 221 1 0
    //   48: aload_0
    //   49: getfield 81	djb:l	Ljava/util/Map;
    //   52: invokeinterface 225 1 0
    //   57: anewarray 227	djn
    //   60: invokeinterface 233 2 0
    //   65: checkcast 235	[Ldjn;
    //   68: astore 4
    //   70: aload_0
    //   71: getfield 81	djb:l	Ljava/util/Map;
    //   74: invokeinterface 238 1 0
    //   79: aload_0
    //   80: iconst_0
    //   81: invokespecial 241	djb:a	(Z)V
    //   84: aload_0
    //   85: monitorexit
    //   86: aload_1
    //   87: astore_3
    //   88: aload 4
    //   90: ifnull +106 -> 196
    //   93: aload 4
    //   95: arraylength
    //   96: istore 7
    //   98: iload 6
    //   100: iload 7
    //   102: if_icmpge +92 -> 194
    //   105: aload 4
    //   107: iload 6
    //   109: aaload
    //   110: astore_3
    //   111: aload_3
    //   112: aload_2
    //   113: invokevirtual 244	djn:a	(Ldia;)V
    //   116: aload_1
    //   117: astore_3
    //   118: iinc 6 1
    //   121: aload_3
    //   122: astore_1
    //   123: goto -25 -> 98
    //   126: aload_0
    //   127: iconst_1
    //   128: putfield 211	djb:p	Z
    //   131: aload_0
    //   132: getfield 246	djb:n	I
    //   135: istore 7
    //   137: aload_0
    //   138: monitorexit
    //   139: aload_0
    //   140: getfield 180	djb:i	Ldid;
    //   143: iload 7
    //   145: aload_1
    //   146: getstatic 249	dgs:a	[B
    //   149: invokeinterface 254 4 0
    //   154: aload_3
    //   155: monitorexit
    //   156: aconst_null
    //   157: astore_1
    //   158: goto -133 -> 25
    //   161: astore_1
    //   162: aload_0
    //   163: monitorexit
    //   164: aload_1
    //   165: athrow
    //   166: astore_1
    //   167: aload_3
    //   168: monitorexit
    //   169: aload_1
    //   170: athrow
    //   171: astore_1
    //   172: goto -147 -> 25
    //   175: astore_1
    //   176: aload_0
    //   177: monitorexit
    //   178: aload_1
    //   179: athrow
    //   180: astore 5
    //   182: aload_1
    //   183: astore_3
    //   184: aload_1
    //   185: ifnull -67 -> 118
    //   188: aload 5
    //   190: astore_3
    //   191: goto -73 -> 118
    //   194: aload_1
    //   195: astore_3
    //   196: aload_0
    //   197: getfield 180	djb:i	Ldid;
    //   200: invokeinterface 257 1 0
    //   205: aload_3
    //   206: astore_1
    //   207: aload_0
    //   208: getfield 165	djb:h	Ljava/net/Socket;
    //   211: invokevirtual 260	java/net/Socket:close	()V
    //   214: aload_1
    //   215: ifnull +15 -> 230
    //   218: aload_1
    //   219: athrow
    //   220: astore_1
    //   221: aload_3
    //   222: ifnull -15 -> 207
    //   225: aload_3
    //   226: astore_1
    //   227: goto -20 -> 207
    //   230: return
    //   231: astore_1
    //   232: goto -18 -> 214
    //   235: aconst_null
    //   236: astore 4
    //   238: goto -154 -> 84
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	241	0	this	djb
    //   0	241	1	paramdia1	dia
    //   0	241	2	paramdia2	dia
    //   7	219	3	localObject	Object
    //   68	169	4	arrayOfdjn	djn[]
    //   180	9	5	localIOException	IOException
    //   1	118	6	i1	int
    //   96	48	7	i2	int
    // Exception table:
    //   from	to	target	type
    //   12	21	161	finally
    //   126	139	161	finally
    //   162	164	161	finally
    //   10	12	166	finally
    //   21	23	166	finally
    //   139	156	166	finally
    //   164	166	166	finally
    //   167	169	166	finally
    //   3	10	171	java/io/IOException
    //   169	171	171	java/io/IOException
    //   27	84	175	finally
    //   84	86	175	finally
    //   176	178	175	finally
    //   111	116	180	java/io/IOException
    //   196	205	220	java/io/IOException
    //   207	214	231	java/io/IOException
  }
  
  private void a(boolean paramBoolean)
  {
    if (paramBoolean) {}
    for (;;)
    {
      try
      {
        l1 = System.nanoTime();
        this.q = l1;
        return;
      }
      finally {}
      long l1 = Long.MAX_VALUE;
    }
  }
  
  private dh c(int paramInt)
  {
    return null;
  }
  
  final djn a(int paramInt)
  {
    try
    {
      djn localdjn = (djn)this.l.get(Integer.valueOf(paramInt));
      return localdjn;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public djn a(int paramInt, List paramList, boolean paramBoolean1, boolean paramBoolean2)
  {
    boolean bool2 = true;
    boolean bool1;
    if (!paramBoolean1)
    {
      bool1 = true;
      if (paramBoolean2) {
        break label67;
      }
    }
    label67:
    for (paramBoolean2 = bool2;; paramBoolean2 = false)
    {
      synchronized (this.i)
      {
        try
        {
          if (!this.p) {
            break label73;
          }
          paramList = new java/io/IOException;
          paramList.<init>("shutdown");
          throw paramList;
        }
        finally {}
      }
      bool1 = false;
      break;
    }
    label73:
    paramInt = this.o;
    this.o += 2;
    djn localdjn = new djn;
    localdjn.<init>(paramInt, this, bool1, paramBoolean2, paramList);
    if (localdjn.a())
    {
      this.l.put(Integer.valueOf(paramInt), localdjn);
      a(false);
    }
    this.i.a(bool1, paramBoolean2, paramInt, 0, paramList);
    if (!paramBoolean1) {
      this.i.b();
    }
    return localdjn;
  }
  
  final void a(int paramInt, long paramLong)
  {
    j.execute(new djd(this, "OkHttp Window Update %s stream %d", new Object[] { this.m, Integer.valueOf(paramInt) }, paramInt, paramLong));
  }
  
  final void a(int paramInt, dia paramdia)
  {
    j.submit(new djc(this, "OkHttp %s stream %d", new Object[] { this.m, Integer.valueOf(paramInt) }, paramInt, paramdia));
  }
  
  public final void a(int paramInt, boolean paramBoolean, djz paramdjz, long paramLong)
  {
    long l1 = paramLong;
    if (paramLong == 0L)
    {
      this.i.a(paramBoolean, paramInt, paramdjz, 0);
      return;
    }
    for (;;)
    {
      try
      {
        int i1 = Math.min((int)Math.min(l1, this.d), this.i.c());
        this.d -= i1;
        l1 -= i1;
        did localdid = this.i;
        if ((!paramBoolean) || (l1 != 0L)) {
          break label174;
        }
        bool = true;
        localdid.a(bool, paramInt, paramdjz, i1);
        if (l1 <= 0L) {
          break;
        }
        try
        {
          if (this.d > 0L) {
            continue;
          }
          if (!this.l.containsKey(Integer.valueOf(paramInt)))
          {
            paramdjz = new java/io/IOException;
            paramdjz.<init>("stream closed");
            throw paramdjz;
          }
        }
        catch (InterruptedException paramdjz)
        {
          paramdjz = new java/io/InterruptedIOException;
          paramdjz.<init>();
          throw paramdjz;
        }
        wait();
      }
      finally {}
      continue;
      label174:
      boolean bool = false;
    }
  }
  
  /* Error */
  public final boolean a()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 89	djb:q	J
    //   6: lstore_2
    //   7: lload_2
    //   8: ldc2_w 367
    //   11: lcmp
    //   12: ifeq +11 -> 23
    //   15: iconst_1
    //   16: istore 4
    //   18: aload_0
    //   19: monitorexit
    //   20: iload 4
    //   22: ireturn
    //   23: iconst_0
    //   24: istore 4
    //   26: goto -8 -> 18
    //   29: astore_1
    //   30: aload_0
    //   31: monitorexit
    //   32: aload_1
    //   33: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	34	0	this	djb
    //   29	4	1	localObject	Object
    //   6	2	2	l1	long
    //   16	9	4	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   2	7	29	finally
  }
  
  public final long b()
  {
    try
    {
      long l1 = this.q;
      return l1;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  final djn b(int paramInt)
  {
    try
    {
      djn localdjn = (djn)this.l.remove(Integer.valueOf(paramInt));
      if ((localdjn != null) && (this.l.isEmpty())) {
        a(true);
      }
      notifyAll();
      return localdjn;
    }
    finally {}
  }
  
  final void b(int paramInt, dia paramdia)
  {
    this.i.a(paramInt, paramdia);
  }
  
  public final void c()
  {
    this.i.b();
  }
  
  public final void close()
  {
    a(dia.a, dia.h);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\djb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */