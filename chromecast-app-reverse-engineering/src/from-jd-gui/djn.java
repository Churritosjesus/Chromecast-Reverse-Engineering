import java.io.InterruptedIOException;
import java.util.List;

public final class djn
{
  long a = 0L;
  long b;
  final int c;
  final djb d;
  List e;
  public final djp f;
  final djo g;
  public final djq h = new djq(this);
  private final djq i = new djq(this);
  private dia j = null;
  
  djn(int paramInt, djb paramdjb, boolean paramBoolean1, boolean paramBoolean2, List paramList)
  {
    if (paramdjb == null) {
      throw new NullPointerException("connection == null");
    }
    if (paramList == null) {
      throw new NullPointerException("requestHeaders == null");
    }
    this.c = paramInt;
    this.d = paramdjb;
    this.b = paramdjb.f.c(65536);
    this.f = new djp(this, paramdjb.e.c(65536));
    this.g = new djo(this);
    djp.a(this.f, paramBoolean2);
    djo.a(this.g, paramBoolean1);
  }
  
  private boolean d(dia paramdia)
  {
    boolean bool = false;
    for (;;)
    {
      try
      {
        if (this.j != null) {
          return bool;
        }
        if ((djp.a(this.f)) && (djo.a(this.g))) {
          continue;
        }
        this.j = paramdia;
      }
      finally {}
      notifyAll();
      this.d.b(this.c);
      bool = true;
    }
  }
  
  private void f()
  {
    try
    {
      wait();
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      throw new InterruptedIOException();
    }
  }
  
  final void a(long paramLong)
  {
    this.b += paramLong;
    if (paramLong > 0L) {
      notifyAll();
    }
  }
  
  public final void a(dia paramdia)
  {
    if (!d(paramdia)) {}
    for (;;)
    {
      return;
      this.d.b(this.c, paramdia);
    }
  }
  
  /* Error */
  public final boolean a()
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: aload_0
    //   3: monitorenter
    //   4: aload_0
    //   5: getfield 40	djn:j	Ldia;
    //   8: astore_1
    //   9: aload_1
    //   10: ifnull +7 -> 17
    //   13: aload_0
    //   14: monitorexit
    //   15: iload_2
    //   16: ireturn
    //   17: aload_0
    //   18: getfield 75	djn:f	Ldjp;
    //   21: invokestatic 95	djp:a	(Ldjp;)Z
    //   24: ifne +13 -> 37
    //   27: aload_0
    //   28: getfield 75	djn:f	Ldjp;
    //   31: invokestatic 116	djp:b	(Ldjp;)Z
    //   34: ifeq +32 -> 66
    //   37: aload_0
    //   38: getfield 80	djn:g	Ldjo;
    //   41: invokestatic 98	djo:a	(Ldjo;)Z
    //   44: ifne +13 -> 57
    //   47: aload_0
    //   48: getfield 80	djn:g	Ldjo;
    //   51: invokestatic 118	djo:b	(Ldjo;)Z
    //   54: ifeq +12 -> 66
    //   57: aload_0
    //   58: getfield 156	djn:e	Ljava/util/List;
    //   61: astore_1
    //   62: aload_1
    //   63: ifnonnull -50 -> 13
    //   66: iconst_1
    //   67: istore_2
    //   68: goto -55 -> 13
    //   71: astore_1
    //   72: aload_0
    //   73: monitorexit
    //   74: aload_1
    //   75: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	76	0	this	djn
    //   8	55	1	localObject1	Object
    //   71	4	1	localObject2	Object
    //   1	67	2	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   4	9	71	finally
    //   17	37	71	finally
    //   37	57	71	finally
    //   57	62	71	finally
  }
  
  public final void b(dia paramdia)
  {
    if (!d(paramdia)) {}
    for (;;)
    {
      return;
      this.d.a(this.c, paramdia);
    }
  }
  
  public final boolean b()
  {
    boolean bool2 = true;
    if ((this.c & 0x1) == 1)
    {
      bool1 = true;
      if (this.d.b != bool1) {
        break label34;
      }
    }
    label34:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      return bool1;
      bool1 = false;
      break;
    }
  }
  
  /* Error */
  public final List c()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 36	djn:h	Ldjq;
    //   6: invokevirtual 165	djq:j_	()V
    //   9: aload_0
    //   10: getfield 156	djn:e	Ljava/util/List;
    //   13: ifnonnull +32 -> 45
    //   16: aload_0
    //   17: getfield 40	djn:j	Ldia;
    //   20: ifnonnull +25 -> 45
    //   23: aload_0
    //   24: invokespecial 106	djn:f	()V
    //   27: goto -18 -> 9
    //   30: astore_1
    //   31: aload_0
    //   32: getfield 36	djn:h	Ldjq;
    //   35: invokevirtual 167	djq:b	()V
    //   38: aload_1
    //   39: athrow
    //   40: astore_1
    //   41: aload_0
    //   42: monitorexit
    //   43: aload_1
    //   44: athrow
    //   45: aload_0
    //   46: getfield 36	djn:h	Ldjq;
    //   49: invokevirtual 167	djq:b	()V
    //   52: aload_0
    //   53: getfield 156	djn:e	Ljava/util/List;
    //   56: ifnull +12 -> 68
    //   59: aload_0
    //   60: getfield 156	djn:e	Ljava/util/List;
    //   63: astore_1
    //   64: aload_0
    //   65: monitorexit
    //   66: aload_1
    //   67: areturn
    //   68: new 130	java/io/IOException
    //   71: astore_2
    //   72: new 137	java/lang/StringBuilder
    //   75: astore_1
    //   76: aload_1
    //   77: ldc -117
    //   79: invokespecial 140	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   82: aload_2
    //   83: aload_1
    //   84: aload_0
    //   85: getfield 40	djn:j	Ldia;
    //   88: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   91: invokevirtual 148	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   94: invokespecial 133	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   97: aload_2
    //   98: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	99	0	this	djn
    //   30	9	1	localObject1	Object
    //   40	4	1	localObject2	Object
    //   63	21	1	localObject3	Object
    //   71	27	2	localIOException	java.io.IOException
    // Exception table:
    //   from	to	target	type
    //   9	27	30	finally
    //   2	9	40	finally
    //   31	40	40	finally
    //   45	64	40	finally
    //   68	99	40	finally
  }
  
  final void c(dia paramdia)
  {
    try
    {
      if (this.j == null)
      {
        this.j = paramdia;
        notifyAll();
      }
      return;
    }
    finally
    {
      paramdia = finally;
      throw paramdia;
    }
  }
  
  public final dku d()
  {
    try
    {
      if ((this.e == null) && (!b()))
      {
        IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
        localIllegalStateException.<init>("reply before requesting the sink");
        throw localIllegalStateException;
      }
    }
    finally {}
    return this.g;
  }
  
  final void e()
  {
    try
    {
      djp.a(this.f, true);
      boolean bool = a();
      notifyAll();
      if (!bool) {
        this.d.b(this.c);
      }
      return;
    }
    finally {}
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\djn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */