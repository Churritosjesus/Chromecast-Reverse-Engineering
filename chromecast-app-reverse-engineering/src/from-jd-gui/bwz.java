import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

final class bwz
  implements GoogleApiClient
{
  final Lock a = new ReentrantLock();
  final Condition b;
  final byx c;
  final Context d;
  final Looper e;
  final Queue f = new LinkedList();
  volatile boolean g;
  final bxe h;
  BroadcastReceiver i;
  final Map j = new HashMap();
  final Map k = new HashMap();
  Set l = new HashSet();
  final byl m;
  final Map n;
  final bwd o;
  volatile bxj p;
  final Set q = Collections.newSetFromMap(new ConcurrentHashMap(16, 0.75F, 2));
  private long r = 120000L;
  private long s = 5000L;
  private final Set t = Collections.newSetFromMap(new WeakHashMap());
  private final bxg u = new bxa(this);
  private final bwg v = new bxb(this);
  private final byy w = new bxc(this);
  
  public bwz(Context paramContext, Looper paramLooper, byl parambyl, bwd parambwd, Map paramMap, Set paramSet1, Set paramSet2, int paramInt1, int paramInt2)
  {
    this.d = paramContext;
    this.c = new byx(paramLooper, this.w);
    this.e = paramLooper;
    this.h = new bxe(this, paramLooper);
    this.n = new HashMap();
    this.b = this.a.newCondition();
    this.p = new bwy(this);
    Iterator localIterator = paramSet1.iterator();
    while (localIterator.hasNext())
    {
      paramSet1 = (bwg)localIterator.next();
      this.c.a(paramSet1);
    }
    paramSet1 = paramSet2.iterator();
    while (paramSet1.hasNext())
    {
      paramSet2 = (bwh)paramSet1.next();
      this.c.a(paramSet2);
    }
    paramSet2 = parambyl.d;
    localIterator = paramMap.keySet().iterator();
    Object localObject;
    if (localIterator.hasNext())
    {
      paramSet1 = (bvz)localIterator.next();
      localObject = paramMap.get(paramSet1);
      if (paramSet2.get(paramSet1) == null) {
        break label459;
      }
      paramSet2.get(paramSet1);
    }
    label459:
    for (paramInt1 = 2;; paramInt1 = 0)
    {
      this.n.put(paramSet1, Integer.valueOf(paramInt1));
      localObject = paramSet1.a().a(paramContext, paramLooper, parambyl, localObject, this.v, a(paramSet1, paramInt1));
      this.j.put(paramSet1.b(), localObject);
      break;
      this.m = parambyl;
      this.o = parambwd;
      return;
    }
  }
  
  private final bwh a(bvz parambvz, int paramInt)
  {
    return new bxd(this, parambvz, paramInt);
  }
  
  private void a(int paramInt)
  {
    this.a.lock();
    try
    {
      this.p.a(paramInt);
      return;
    }
    finally
    {
      this.a.unlock();
    }
  }
  
  public final Looper a()
  {
    return this.e;
  }
  
  public final bwc a(bwe parambwe)
  {
    parambwe = (bwc)this.j.get(parambwe);
    a.f(parambwe, "Appropriate Api was not requested.");
    return parambwe;
  }
  
  public final bwp a(bwp parambwp)
  {
    if (parambwp.f != null) {}
    for (boolean bool = true;; bool = false)
    {
      a.b(bool, "This task can not be enqueued (it's probably a Batch or malformed)");
      a.b(this.j.containsKey(parambwp.f), "GoogleApiClient is not configured to use the API required for this call.");
      this.a.lock();
      try
      {
        parambwp = this.p.a(parambwp);
        return parambwp;
      }
      finally
      {
        this.a.unlock();
      }
    }
  }
  
  public final void a(bwg parambwg)
  {
    this.c.a(parambwg);
  }
  
  public final void a(bwh parambwh)
  {
    this.c.a(parambwh);
  }
  
  final void a(bxi parambxi)
  {
    this.q.add(parambxi);
    parambxi.a(this.u);
  }
  
  final void a(ConnectionResult paramConnectionResult)
  {
    this.a.lock();
    try
    {
      paramConnectionResult = new bwy;
      paramConnectionResult.<init>(this);
      this.p = paramConnectionResult;
      this.p.a();
      this.b.signalAll();
      return;
    }
    finally
    {
      this.a.unlock();
    }
  }
  
  public final void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    paramPrintWriter.append(paramString).println("GoogleApiClient:");
    paramString = paramString + "  ";
    paramPrintWriter.append(paramString).append("mState=").append(this.p.c());
    paramPrintWriter.append(" mResuming=").print(this.g);
    paramPrintWriter.append(" mWorkQueue.size()=").print(this.f.size());
    paramPrintWriter.append(" mUnconsumedRunners.size()=").println(this.q.size());
    paramFileDescriptor = this.j.values().iterator();
    while (paramFileDescriptor.hasNext()) {
      ((bwc)paramFileDescriptor.next()).a(paramString, paramPrintWriter);
    }
  }
  
  public final bwp b(bwp parambwp)
  {
    boolean bool;
    if (parambwp.f != null) {
      bool = true;
    }
    for (;;)
    {
      a.b(bool, "This task can not be executed (it's probably a Batch or malformed)");
      this.a.lock();
      try
      {
        if (!this.g) {
          break label113;
        }
        this.f.add(parambwp);
        while (!this.f.isEmpty())
        {
          bxi localbxi = (bxi)this.f.remove();
          a(localbxi);
          localbxi.d(Status.b);
        }
        bool = false;
      }
      finally
      {
        this.a.unlock();
      }
    }
    this.a.unlock();
    for (;;)
    {
      return parambwp;
      label113:
      parambwp = this.p.b(parambwp);
      this.a.unlock();
    }
  }
  
  public final void b()
  {
    this.a.lock();
    try
    {
      this.p.b();
      return;
    }
    finally
    {
      this.a.unlock();
    }
  }
  
  public final void b(bwg parambwg)
  {
    Object localObject2 = this.c;
    a.c(parambwg);
    synchronized (((byx)localObject2).g)
    {
      if (!((byx)localObject2).b.remove(parambwg))
      {
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>("unregisterConnectionCallbacks(): listener ");
        Log.w("GmsClientEvents", parambwg + " not found");
      }
      while (!((byx)localObject2).f) {
        return;
      }
      ((byx)localObject2).c.add(parambwg);
    }
  }
  
  public final void b(bwh parambwh)
  {
    Object localObject2 = this.c;
    a.c(parambwh);
    synchronized (((byx)localObject2).g)
    {
      if (!((byx)localObject2).d.remove(parambwh))
      {
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>("unregisterConnectionFailedListener(): listener ");
        Log.w("GmsClientEvents", parambwh + " not found");
      }
      return;
    }
  }
  
  public final void c()
  {
    g();
    a(-1);
  }
  
  public final boolean d()
  {
    return this.p instanceof bwr;
  }
  
  public final boolean e()
  {
    return this.p instanceof bws;
  }
  
  final void f()
  {
    Iterator localIterator = this.q.iterator();
    while (localIterator.hasNext())
    {
      bxi localbxi = (bxi)localIterator.next();
      localbxi.a(null);
      localbxi.b();
    }
    this.q.clear();
    localIterator = this.t.iterator();
    while (localIterator.hasNext()) {
      ((dh)localIterator.next()).f();
    }
    this.t.clear();
    this.l.clear();
  }
  
  /* Error */
  final boolean g()
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: aload_0
    //   3: getfield 57	bwz:a	Ljava/util/concurrent/locks/Lock;
    //   6: invokeinterface 232 1 0
    //   11: aload_0
    //   12: getfield 244	bwz:g	Z
    //   15: istore_3
    //   16: iload_3
    //   17: ifne +14 -> 31
    //   20: aload_0
    //   21: getfield 57	bwz:a	Ljava/util/concurrent/locks/Lock;
    //   24: invokeinterface 239 1 0
    //   29: iload_2
    //   30: ireturn
    //   31: aload_0
    //   32: iconst_0
    //   33: putfield 244	bwz:g	Z
    //   36: aload_0
    //   37: getfield 136	bwz:h	Lbxe;
    //   40: iconst_2
    //   41: invokevirtual 430	bxe:removeMessages	(I)V
    //   44: aload_0
    //   45: getfield 136	bwz:h	Lbxe;
    //   48: iconst_1
    //   49: invokevirtual 430	bxe:removeMessages	(I)V
    //   52: aload_0
    //   53: getfield 432	bwz:i	Landroid/content/BroadcastReceiver;
    //   56: ifnull +22 -> 78
    //   59: aload_0
    //   60: getfield 120	bwz:d	Landroid/content/Context;
    //   63: invokevirtual 438	android/content/Context:getApplicationContext	()Landroid/content/Context;
    //   66: aload_0
    //   67: getfield 432	bwz:i	Landroid/content/BroadcastReceiver;
    //   70: invokevirtual 442	android/content/Context:unregisterReceiver	(Landroid/content/BroadcastReceiver;)V
    //   73: aload_0
    //   74: aconst_null
    //   75: putfield 432	bwz:i	Landroid/content/BroadcastReceiver;
    //   78: aload_0
    //   79: getfield 57	bwz:a	Ljava/util/concurrent/locks/Lock;
    //   82: invokeinterface 239 1 0
    //   87: iconst_1
    //   88: istore_2
    //   89: goto -60 -> 29
    //   92: astore_1
    //   93: aload_0
    //   94: getfield 57	bwz:a	Ljava/util/concurrent/locks/Lock;
    //   97: invokeinterface 239 1 0
    //   102: aload_1
    //   103: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	104	0	this	bwz
    //   92	11	1	localObject	Object
    //   1	88	2	bool1	boolean
    //   15	2	3	bool2	boolean
    // Exception table:
    //   from	to	target	type
    //   11	16	92	finally
    //   31	78	92	finally
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bwz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */