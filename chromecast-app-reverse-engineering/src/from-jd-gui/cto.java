import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Status;

public final class cto
  extends bvx
{
  final cac a;
  final ctt f;
  final Looper g;
  final int h;
  final Context i;
  final cuq j;
  final String k;
  ctv l;
  volatile ctn m;
  volatile boolean n;
  cjd o;
  long p;
  ctu q;
  ctq r;
  private clw s;
  
  private cto(Context paramContext, cuq paramcuq, Looper paramLooper, String paramString, int paramInt, ctv paramctv, ctu paramctu, clw paramclw, cac paramcac, cwq paramcwq) {}
  
  public cto(Context paramContext, cuq paramcuq, Looper paramLooper, String paramString, int paramInt, czb paramczb)
  {
    this(paramContext, paramcuq, paramLooper, paramString, paramInt, new ctv(paramContext, paramString), new cxa(paramContext, paramString, paramczb), new clw(paramContext), cad.c(), new cvz(30, 900000L, 5000L, "refreshing", cad.c()));
  }
  
  /* Error */
  private void a(cjd paramcjd, long paramLong, boolean paramBoolean)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: iload 4
    //   4: ifeq +9 -> 13
    //   7: aload_0
    //   8: getfield 130	cto:n	Z
    //   11: istore 4
    //   13: aload_0
    //   14: invokevirtual 132	cto:a	()Z
    //   17: ifeq +9 -> 26
    //   20: aload_0
    //   21: getfield 134	cto:m	Lctn;
    //   24: astore 5
    //   26: aload_0
    //   27: aload_1
    //   28: putfield 75	cto:o	Lcjd;
    //   31: aload_0
    //   32: lload_2
    //   33: putfield 136	cto:p	J
    //   36: aload_0
    //   37: lconst_0
    //   38: ldc2_w 137
    //   41: aload_0
    //   42: getfield 136	cto:p	J
    //   45: ldc2_w 137
    //   48: ladd
    //   49: aload_0
    //   50: getfield 77	cto:a	Lcac;
    //   53: invokeinterface 143 1 0
    //   58: lsub
    //   59: invokestatic 149	java/lang/Math:min	(JJ)J
    //   62: invokestatic 152	java/lang/Math:max	(JJ)J
    //   65: invokevirtual 155	cto:a	(J)V
    //   68: new 157	ctk
    //   71: astore 5
    //   73: aload 5
    //   75: aload_0
    //   76: getfield 47	cto:i	Landroid/content/Context;
    //   79: aload_0
    //   80: getfield 49	cto:j	Lcuq;
    //   83: getfield 162	cuq:a	Lctw;
    //   86: aload_0
    //   87: getfield 53	cto:k	Ljava/lang/String;
    //   90: lload_2
    //   91: aload_1
    //   92: invokespecial 165	ctk:<init>	(Landroid/content/Context;Lctw;Ljava/lang/String;JLcjd;)V
    //   95: aload_0
    //   96: getfield 134	cto:m	Lctn;
    //   99: ifnonnull +62 -> 161
    //   102: new 167	ctn
    //   105: astore_1
    //   106: aload_1
    //   107: aload_0
    //   108: getfield 49	cto:j	Lcuq;
    //   111: aload_0
    //   112: getfield 51	cto:g	Landroid/os/Looper;
    //   115: aload 5
    //   117: aload_0
    //   118: getfield 68	cto:f	Lctt;
    //   121: invokespecial 170	ctn:<init>	(Lcuq;Landroid/os/Looper;Lctk;Lbb;)V
    //   124: aload_0
    //   125: aload_1
    //   126: putfield 134	cto:m	Lctn;
    //   129: aload_0
    //   130: invokevirtual 132	cto:a	()Z
    //   133: ifne +25 -> 158
    //   136: aload_0
    //   137: getfield 172	cto:r	Lctq;
    //   140: aload 5
    //   142: invokeinterface 177 2 0
    //   147: ifeq +11 -> 158
    //   150: aload_0
    //   151: aload_0
    //   152: getfield 134	cto:m	Lctn;
    //   155: invokevirtual 180	cto:a	(Lbwm;)V
    //   158: aload_0
    //   159: monitorexit
    //   160: return
    //   161: aload_0
    //   162: getfield 134	cto:m	Lctn;
    //   165: aload 5
    //   167: invokevirtual 183	ctn:a	(Lctk;)V
    //   170: goto -41 -> 129
    //   173: astore_1
    //   174: aload_0
    //   175: monitorexit
    //   176: aload_1
    //   177: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	178	0	this	cto
    //   0	178	1	paramcjd	cjd
    //   0	178	2	paramLong	long
    //   0	178	4	paramBoolean	boolean
    //   24	142	5	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   7	13	173	finally
    //   13	26	173	finally
    //   26	129	173	finally
    //   129	158	173	finally
    //   161	170	173	finally
  }
  
  private void a(String paramString)
  {
    try
    {
      if (this.q != null) {
        this.q.a(paramString);
      }
      return;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  /* Error */
  void a(long paramLong)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 59	cto:q	Lctu;
    //   6: ifnonnull +11 -> 17
    //   9: ldc -60
    //   11: invokestatic 200	cuh:b	(Ljava/lang/String;)V
    //   14: aload_0
    //   15: monitorexit
    //   16: return
    //   17: aload_0
    //   18: getfield 59	cto:q	Lctu;
    //   21: lload_1
    //   22: aload_0
    //   23: getfield 75	cto:o	Lcjd;
    //   26: getfield 201	cjd:c	Ljava/lang/String;
    //   29: invokeinterface 204 4 0
    //   34: goto -20 -> 14
    //   37: astore_3
    //   38: aload_0
    //   39: monitorexit
    //   40: aload_3
    //   41: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	42	0	this	cto
    //   0	42	1	paramLong	long
    //   37	4	3	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	14	37	finally
    //   17	34	37	finally
  }
  
  void a(cjd paramcjd)
  {
    try
    {
      if (this.l != null)
      {
        clv localclv = new clv;
        localclv.<init>();
        localclv.a = this.p;
        ciz localciz = new ciz;
        localciz.<init>();
        localclv.b = localciz;
        localclv.c = paramcjd;
        this.l.a(localclv);
      }
      return;
    }
    finally
    {
      paramcjd = finally;
      throw paramcjd;
    }
  }
  
  protected final ctn b(Status paramStatus)
  {
    if (this.m != null) {}
    for (paramStatus = this.m;; paramStatus = new ctn(paramStatus))
    {
      return paramStatus;
      if (paramStatus == Status.c) {
        cuh.a("timer expired: setting result to failure");
      }
    }
  }
  
  boolean e()
  {
    cuk localcuk = cuk.a();
    if (((localcuk.a == cul.b) || (localcuk.a == cul.c)) && (this.k.equals(localcuk.b))) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cto.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */