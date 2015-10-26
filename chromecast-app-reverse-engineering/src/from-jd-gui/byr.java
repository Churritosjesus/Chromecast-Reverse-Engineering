import java.util.ArrayList;

public abstract class byr
{
  private Object a;
  private boolean b;
  
  public byr(byo parambyo, Object paramObject)
  {
    this.a = paramObject;
    this.b = false;
  }
  
  protected abstract void a(Object paramObject);
  
  /* Error */
  public final void b()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 19	byr:a	Ljava/lang/Object;
    //   6: astore_1
    //   7: aload_0
    //   8: getfield 21	byr:b	Z
    //   11: ifeq +32 -> 43
    //   14: new 27	java/lang/StringBuilder
    //   17: astore_2
    //   18: aload_2
    //   19: ldc 29
    //   21: invokespecial 32	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   24: ldc 34
    //   26: aload_2
    //   27: aload_0
    //   28: invokevirtual 38	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   31: ldc 40
    //   33: invokevirtual 43	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   36: invokevirtual 47	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   39: invokestatic 53	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   42: pop
    //   43: aload_0
    //   44: monitorexit
    //   45: aload_1
    //   46: ifnull +8 -> 54
    //   49: aload_0
    //   50: aload_1
    //   51: invokevirtual 55	byr:a	(Ljava/lang/Object;)V
    //   54: aload_0
    //   55: monitorenter
    //   56: aload_0
    //   57: iconst_1
    //   58: putfield 21	byr:b	Z
    //   61: aload_0
    //   62: monitorexit
    //   63: aload_0
    //   64: invokevirtual 57	byr:c	()V
    //   67: return
    //   68: astore_1
    //   69: aload_0
    //   70: monitorexit
    //   71: aload_1
    //   72: athrow
    //   73: astore_1
    //   74: aload_1
    //   75: athrow
    //   76: astore_1
    //   77: aload_0
    //   78: monitorexit
    //   79: aload_1
    //   80: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	81	0	this	byr
    //   6	45	1	localObject1	Object
    //   68	4	1	localObject2	Object
    //   73	2	1	localRuntimeException	RuntimeException
    //   76	4	1	localObject3	Object
    //   17	10	2	localStringBuilder	StringBuilder
    // Exception table:
    //   from	to	target	type
    //   2	43	68	finally
    //   43	45	68	finally
    //   69	71	68	finally
    //   49	54	73	java/lang/RuntimeException
    //   56	63	76	finally
    //   77	79	76	finally
  }
  
  public final void c()
  {
    d();
    synchronized (byo.d(this.c))
    {
      byo.d(this.c).remove(this);
      return;
    }
  }
  
  public final void d()
  {
    try
    {
      this.a = null;
      return;
    }
    finally {}
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\byr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */