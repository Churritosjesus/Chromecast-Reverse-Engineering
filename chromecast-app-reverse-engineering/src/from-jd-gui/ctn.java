import android.os.Looper;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.ConcurrentMap;

public class ctn
  implements bwl, bwm
{
  ctk a;
  ctk b;
  Status c;
  cyy d;
  boolean e;
  cuq f;
  
  public ctn(Status paramStatus)
  {
    this.c = paramStatus;
  }
  
  public ctn(cuq paramcuq, Looper paramLooper, ctk paramctk, bb parambb)
  {
    this.f = paramcuq;
    if (paramLooper == null) {
      Looper.getMainLooper();
    }
    this.a = paramctk;
    this.c = Status.a;
    paramcuq.c.put(this, Boolean.valueOf(true));
  }
  
  /* Error */
  public void a()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 61	ctn:e	Z
    //   6: ifeq +11 -> 17
    //   9: ldc 63
    //   11: invokestatic 68	cuh:a	(Ljava/lang/String;)V
    //   14: aload_0
    //   15: monitorexit
    //   16: return
    //   17: aload_0
    //   18: iconst_1
    //   19: putfield 61	ctn:e	Z
    //   22: aload_0
    //   23: getfield 30	ctn:f	Lcuq;
    //   26: getfield 47	cuq:c	Ljava/util/concurrent/ConcurrentMap;
    //   29: aload_0
    //   30: invokeinterface 72 2 0
    //   35: ifnull +3 -> 38
    //   38: aload_0
    //   39: getfield 38	ctn:a	Lctk;
    //   42: aconst_null
    //   43: putfield 77	ctk:a	Lcxi;
    //   46: aload_0
    //   47: aconst_null
    //   48: putfield 38	ctn:a	Lctk;
    //   51: aload_0
    //   52: aconst_null
    //   53: putfield 79	ctn:b	Lctk;
    //   56: aload_0
    //   57: aconst_null
    //   58: putfield 81	ctn:d	Lcyy;
    //   61: goto -47 -> 14
    //   64: astore_1
    //   65: aload_0
    //   66: monitorexit
    //   67: aload_1
    //   68: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	69	0	this	ctn
    //   64	4	1	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	14	64	finally
    //   17	38	64	finally
    //   38	61	64	finally
  }
  
  /* Error */
  public void a(ctk paramctk)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 61	ctn:e	Z
    //   6: istore_2
    //   7: iload_2
    //   8: ifeq +6 -> 14
    //   11: aload_0
    //   12: monitorexit
    //   13: return
    //   14: aload_0
    //   15: aload_1
    //   16: putfield 79	ctn:b	Lctk;
    //   19: aload_0
    //   20: invokevirtual 84	ctn:d	()V
    //   23: goto -12 -> 11
    //   26: astore_1
    //   27: aload_0
    //   28: monitorexit
    //   29: aload_1
    //   30: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	31	0	this	ctn
    //   0	31	1	paramctk	ctk
    //   6	2	2	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   2	7	26	finally
    //   14	23	26	finally
  }
  
  /* Error */
  public void a(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 61	ctn:e	Z
    //   6: istore_2
    //   7: iload_2
    //   8: ifeq +6 -> 14
    //   11: aload_0
    //   12: monitorexit
    //   13: return
    //   14: aload_0
    //   15: getfield 38	ctn:a	Lctk;
    //   18: invokevirtual 87	ctk:a	()Lcxi;
    //   21: aload_1
    //   22: invokevirtual 90	cxi:a	(Ljava/lang/String;)V
    //   25: goto -14 -> 11
    //   28: astore_1
    //   29: aload_0
    //   30: monitorexit
    //   31: aload_1
    //   32: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	33	0	this	ctn
    //   0	33	1	paramString	String
    //   6	2	2	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   2	7	28	finally
    //   14	25	28	finally
  }
  
  public Status b()
  {
    return this.c;
  }
  
  /* Error */
  public ctk c()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: aload_0
    //   3: monitorenter
    //   4: aload_0
    //   5: getfield 61	ctn:e	Z
    //   8: ifeq +12 -> 20
    //   11: ldc 94
    //   13: invokestatic 68	cuh:a	(Ljava/lang/String;)V
    //   16: aload_0
    //   17: monitorexit
    //   18: aload_1
    //   19: areturn
    //   20: aload_0
    //   21: getfield 79	ctn:b	Lctk;
    //   24: ifnull +16 -> 40
    //   27: aload_0
    //   28: aload_0
    //   29: getfield 79	ctn:b	Lctk;
    //   32: putfield 38	ctn:a	Lctk;
    //   35: aload_0
    //   36: aconst_null
    //   37: putfield 79	ctn:b	Lctk;
    //   40: aload_0
    //   41: getfield 38	ctn:a	Lctk;
    //   44: astore_1
    //   45: goto -29 -> 16
    //   48: astore_1
    //   49: aload_0
    //   50: monitorexit
    //   51: aload_1
    //   52: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	53	0	this	ctn
    //   1	44	1	localctk	ctk
    //   48	4	1	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   4	16	48	finally
    //   20	40	48	finally
    //   40	45	48	finally
  }
  
  void d() {}
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\ctn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */