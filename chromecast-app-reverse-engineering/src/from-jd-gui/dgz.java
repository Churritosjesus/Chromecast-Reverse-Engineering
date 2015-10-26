final class dgz
  implements dku
{
  private final dkh a = new dkh(this.c.d.a());
  private boolean b;
  
  dgz(dgx paramdgx) {}
  
  public final dkw a()
  {
    return this.a;
  }
  
  public final void a_(djz paramdjz, long paramLong)
  {
    if (this.b) {
      throw new IllegalStateException("closed");
    }
    if (paramLong == 0L) {}
    for (;;)
    {
      return;
      this.c.d.h(paramLong);
      this.c.d.b("\r\n");
      this.c.d.a_(paramdjz, paramLong);
      this.c.d.b("\r\n");
    }
  }
  
  /* Error */
  public final void close()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 42	dgz:b	Z
    //   6: istore_2
    //   7: iload_2
    //   8: ifeq +6 -> 14
    //   11: aload_0
    //   12: monitorexit
    //   13: return
    //   14: aload_0
    //   15: iconst_1
    //   16: putfield 42	dgz:b	Z
    //   19: aload_0
    //   20: getfield 16	dgz:c	Ldgx;
    //   23: getfield 27	dgx:d	Ldkc;
    //   26: ldc 63
    //   28: invokeinterface 58 2 0
    //   33: pop
    //   34: aload_0
    //   35: getfield 16	dgz:c	Ldgx;
    //   38: aload_0
    //   39: getfield 37	dgz:a	Ldkh;
    //   42: invokestatic 66	dgx:a	(Ldgx;Ldkh;)V
    //   45: aload_0
    //   46: getfield 16	dgz:c	Ldgx;
    //   49: iconst_3
    //   50: putfield 70	dgx:e	I
    //   53: goto -42 -> 11
    //   56: astore_1
    //   57: aload_0
    //   58: monitorexit
    //   59: aload_1
    //   60: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	61	0	this	dgz
    //   56	4	1	localObject	Object
    //   6	2	2	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   2	7	56	finally
    //   14	53	56	finally
  }
  
  /* Error */
  public final void flush()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 42	dgz:b	Z
    //   6: istore_2
    //   7: iload_2
    //   8: ifeq +6 -> 14
    //   11: aload_0
    //   12: monitorexit
    //   13: return
    //   14: aload_0
    //   15: getfield 16	dgz:c	Ldgx;
    //   18: getfield 27	dgx:d	Ldkc;
    //   21: invokeinterface 73 1 0
    //   26: goto -15 -> 11
    //   29: astore_1
    //   30: aload_0
    //   31: monitorexit
    //   32: aload_1
    //   33: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	34	0	this	dgz
    //   29	4	1	localObject	Object
    //   6	2	2	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   2	7	29	finally
    //   14	26	29	finally
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dgz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */