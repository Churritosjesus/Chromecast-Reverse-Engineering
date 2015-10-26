import java.io.IOException;
import java.io.InterruptedIOException;

public class dju
  extends dkw
{
  private static dju a;
  private boolean c;
  private dju d;
  private long e;
  
  private static void a(dju paramdju, long paramLong, boolean paramBoolean)
  {
    for (;;)
    {
      try
      {
        if (a == null)
        {
          localObject = new dju;
          ((dju)localObject).<init>();
          a = (dju)localObject;
          localObject = new djx;
          ((djx)localObject).<init>();
          ((djx)localObject).start();
        }
        long l = System.nanoTime();
        if ((paramLong != 0L) && (paramBoolean))
        {
          paramdju.e = (Math.min(paramLong, paramdju.c() - l) + l);
          paramLong = paramdju.e;
          localObject = a;
          if ((((dju)localObject).d != null) && (paramLong - l >= ((dju)localObject).d.e - l)) {
            break label189;
          }
          paramdju.d = ((dju)localObject).d;
          ((dju)localObject).d = paramdju;
          if (localObject == a) {
            dju.class.notify();
          }
          return;
        }
        if (paramLong != 0L)
        {
          paramdju.e = (l + paramLong);
          continue;
        }
        if (!paramBoolean) {
          break label179;
        }
      }
      finally {}
      paramdju.e = paramdju.c();
      continue;
      label179:
      paramdju = new java/lang/AssertionError;
      paramdju.<init>();
      throw paramdju;
      label189:
      Object localObject = ((dju)localObject).d;
    }
  }
  
  /* Error */
  private static boolean a(dju paramdju)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: getstatic 19	dju:a	Ldju;
    //   6: astore_1
    //   7: aload_1
    //   8: ifnull +39 -> 47
    //   11: aload_1
    //   12: getfield 44	dju:d	Ldju;
    //   15: aload_0
    //   16: if_acmpne +23 -> 39
    //   19: aload_1
    //   20: aload_0
    //   21: getfield 44	dju:d	Ldju;
    //   24: putfield 44	dju:d	Ldju;
    //   27: aload_0
    //   28: aconst_null
    //   29: putfield 44	dju:d	Ldju;
    //   32: iconst_0
    //   33: istore_2
    //   34: ldc 2
    //   36: monitorexit
    //   37: iload_2
    //   38: ireturn
    //   39: aload_1
    //   40: getfield 44	dju:d	Ldju;
    //   43: astore_1
    //   44: goto -37 -> 7
    //   47: iconst_1
    //   48: istore_2
    //   49: goto -15 -> 34
    //   52: astore_0
    //   53: ldc 2
    //   55: monitorexit
    //   56: aload_0
    //   57: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	58	0	paramdju	dju
    //   6	38	1	localdju	dju
    //   33	16	2	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   3	7	52	finally
    //   11	32	52	finally
    //   39	44	52	finally
  }
  
  private static dju g()
  {
    Object localObject3 = null;
    for (;;)
    {
      try
      {
        Object localObject1 = a.d;
        if (localObject1 == null)
        {
          dju.class.wait();
          localObject1 = localObject3;
          return (dju)localObject1;
        }
        long l1 = System.nanoTime();
        long l2 = ((dju)localObject1).e - l1;
        if (l2 > 0L)
        {
          l1 = l2 / 1000000L;
          dju.class.wait(l1, (int)(l2 - 1000000L * l1));
          localObject1 = localObject3;
          continue;
        }
        a.d = ((dju)localObject2).d;
      }
      finally {}
      ((dju)localObject2).d = null;
    }
  }
  
  final IOException a(IOException paramIOException)
  {
    if (!k_()) {}
    for (;;)
    {
      return paramIOException;
      InterruptedIOException localInterruptedIOException = new InterruptedIOException("timeout");
      localInterruptedIOException.initCause(paramIOException);
      paramIOException = localInterruptedIOException;
    }
  }
  
  public void a() {}
  
  final void a(boolean paramBoolean)
  {
    if ((k_()) && (paramBoolean)) {
      throw new InterruptedIOException("timeout");
    }
  }
  
  public final void j_()
  {
    if (this.c) {
      throw new IllegalStateException("Unbalanced enter/exit");
    }
    long l = l_();
    boolean bool = m_();
    if ((l == 0L) && (!bool)) {}
    for (;;)
    {
      return;
      this.c = true;
      a(this, l, bool);
    }
  }
  
  public final boolean k_()
  {
    boolean bool = false;
    if (!this.c) {}
    for (;;)
    {
      return bool;
      this.c = false;
      bool = a(this);
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dju.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */