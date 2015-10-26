import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.locks.Lock;

public final class bws
  implements bxj
{
  final bwz a;
  final Lock b;
  int c;
  cls d;
  boolean e;
  boolean f;
  bzf g;
  boolean h;
  boolean i;
  private final Context j;
  private ConnectionResult k;
  private int l;
  private int m = 0;
  private boolean n = false;
  private final Bundle o = new Bundle();
  private final Set p = new HashSet();
  private int q;
  private final byl r;
  private final Map s;
  private final bwd t;
  
  public bws(bwz parambwz, byl parambyl, Map paramMap, bwd parambwd, Lock paramLock, Context paramContext)
  {
    this.a = parambwz;
    this.r = parambyl;
    this.s = paramMap;
    this.t = parambwd;
    this.b = paramLock;
    this.j = paramContext;
  }
  
  private void a(boolean paramBoolean)
  {
    if (this.d != null)
    {
      if (this.d.k())
      {
        if (paramBoolean) {
          this.d.i_();
        }
        this.d.a();
      }
      this.g = null;
    }
  }
  
  private static String c(int paramInt)
  {
    String str;
    switch (paramInt)
    {
    default: 
      str = "UNKNOWN";
    }
    for (;;)
    {
      return str;
      str = "STEP_GETTING_SERVICE_BINDINGS";
      continue;
      str = "STEP_VALIDATING_ACCOUNT";
      continue;
      str = "STEP_AUTHENTICATING";
      continue;
      str = "STEP_GETTING_REMOTE_SERVICE";
    }
  }
  
  /* Error */
  private void i()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 60	bws:a	Lbwz;
    //   4: astore_1
    //   5: aload_1
    //   6: getfield 101	bwz:a	Ljava/util/concurrent/locks/Lock;
    //   9: invokeinterface 106 1 0
    //   14: aload_1
    //   15: invokevirtual 108	bwz:g	()Z
    //   18: pop
    //   19: new 110	bwr
    //   22: astore_2
    //   23: aload_2
    //   24: aload_1
    //   25: invokespecial 113	bwr:<init>	(Lbwz;)V
    //   28: aload_1
    //   29: aload_2
    //   30: putfield 116	bwz:p	Lbxj;
    //   33: aload_1
    //   34: getfield 116	bwz:p	Lbxj;
    //   37: invokeinterface 117 1 0
    //   42: aload_1
    //   43: getfield 120	bwz:b	Ljava/util/concurrent/locks/Condition;
    //   46: invokeinterface 125 1 0
    //   51: aload_1
    //   52: getfield 101	bwz:a	Ljava/util/concurrent/locks/Lock;
    //   55: invokeinterface 128 1 0
    //   60: aload_0
    //   61: getfield 74	bws:d	Lcls;
    //   64: ifnull +32 -> 96
    //   67: aload_0
    //   68: getfield 130	bws:h	Z
    //   71: ifeq +20 -> 91
    //   74: aload_0
    //   75: getfield 74	bws:d	Lcls;
    //   78: aload_0
    //   79: getfield 86	bws:g	Lbzf;
    //   82: aload_0
    //   83: getfield 132	bws:i	Z
    //   86: invokeinterface 135 3 0
    //   91: aload_0
    //   92: iconst_0
    //   93: invokespecial 137	bws:a	(Z)V
    //   96: aload_0
    //   97: getfield 60	bws:a	Lbwz;
    //   100: getfield 139	bwz:k	Ljava/util/Map;
    //   103: invokeinterface 145 1 0
    //   108: invokeinterface 151 1 0
    //   113: astore_1
    //   114: aload_1
    //   115: invokeinterface 156 1 0
    //   120: ifeq +49 -> 169
    //   123: aload_1
    //   124: invokeinterface 160 1 0
    //   129: checkcast 162	bwe
    //   132: astore_2
    //   133: aload_0
    //   134: getfield 60	bws:a	Lbwz;
    //   137: getfield 164	bwz:j	Ljava/util/Map;
    //   140: aload_2
    //   141: invokeinterface 168 2 0
    //   146: checkcast 170	bwc
    //   149: invokeinterface 171 1 0
    //   154: goto -40 -> 114
    //   157: astore_2
    //   158: aload_1
    //   159: getfield 101	bwz:a	Ljava/util/concurrent/locks/Lock;
    //   162: invokeinterface 128 1 0
    //   167: aload_2
    //   168: athrow
    //   169: aload_0
    //   170: getfield 48	bws:n	Z
    //   173: ifeq +14 -> 187
    //   176: aload_0
    //   177: iconst_0
    //   178: putfield 48	bws:n	Z
    //   181: aload_0
    //   182: iconst_m1
    //   183: invokevirtual 174	bws:a	(I)V
    //   186: return
    //   187: aload_0
    //   188: getfield 53	bws:o	Landroid/os/Bundle;
    //   191: invokevirtual 177	android/os/Bundle:isEmpty	()Z
    //   194: ifeq +19 -> 213
    //   197: aconst_null
    //   198: astore_1
    //   199: aload_0
    //   200: getfield 60	bws:a	Lbwz;
    //   203: getfield 180	bwz:c	Lbyx;
    //   206: aload_1
    //   207: invokevirtual 185	byx:a	(Landroid/os/Bundle;)V
    //   210: goto -24 -> 186
    //   213: aload_0
    //   214: getfield 53	bws:o	Landroid/os/Bundle;
    //   217: astore_1
    //   218: goto -19 -> 199
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	221	0	this	bws
    //   4	214	1	localObject1	Object
    //   22	119	2	localObject2	Object
    //   157	11	2	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   14	51	157	finally
  }
  
  private Set j()
  {
    HashSet localHashSet = new HashSet(this.r.b);
    Map localMap = this.r.d;
    Iterator localIterator = localMap.keySet().iterator();
    while (localIterator.hasNext())
    {
      bvz localbvz = (bvz)localIterator.next();
      if (!this.a.k.containsKey(localbvz.b()))
      {
        localMap.get(localbvz);
        localHashSet.addAll(null);
      }
    }
    return localHashSet;
  }
  
  public final bwp a(bwp parambwp)
  {
    this.a.f.add(parambwp);
    return parambwp;
  }
  
  public final void a()
  {
    this.a.c.e = true;
    this.a.k.clear();
    this.n = false;
    this.e = false;
    this.k = null;
    this.m = 0;
    this.q = 2;
    this.f = false;
    this.h = false;
    Object localObject = this.s.keySet().iterator();
    while (((Iterator)localObject).hasNext())
    {
      bvz localbvz = (bvz)((Iterator)localObject).next();
      ((bwc)this.a.j.get(localbvz.b())).a(new bwi(this, localbvz, ((Integer)this.s.get(localbvz)).intValue()));
      localbvz.a();
    }
    if (this.e)
    {
      this.r.h = Integer.valueOf(System.identityHashCode(this.a));
      localObject = new bwx(this);
      this.d = ((cls)this.t.a(this.j, this.a.e, this.r, this.r.g, (bwg)localObject, (bwh)localObject));
      this.d.j();
    }
    this.c = this.a.j.size();
    localObject = this.a.j.values().iterator();
    while (((Iterator)localObject).hasNext()) {
      ((bwc)((Iterator)localObject).next()).j();
    }
  }
  
  public final void a(int paramInt)
  {
    if (paramInt == -1)
    {
      Iterator localIterator = this.a.f.iterator();
      while (localIterator.hasNext())
      {
        ((bxi)localIterator.next()).b();
        localIterator.remove();
      }
      this.a.f();
      if ((this.k == null) && (!this.a.f.isEmpty())) {
        this.n = true;
      }
    }
    for (;;)
    {
      return;
      this.a.k.clear();
      this.k = null;
      a(true);
      this.a.a(this.k);
    }
  }
  
  public final void a(Bundle paramBundle)
  {
    if (!b(3)) {}
    for (;;)
    {
      return;
      if (paramBundle != null) {
        this.o.putAll(paramBundle);
      }
      if (d()) {
        i();
      }
    }
  }
  
  public final void a(ConnectionResult paramConnectionResult, bvz parambvz, int paramInt)
  {
    if (!b(3)) {}
    for (;;)
    {
      return;
      b(paramConnectionResult, parambvz, paramInt);
      if (d()) {
        i();
      }
    }
  }
  
  boolean a(ConnectionResult paramConnectionResult)
  {
    boolean bool2 = true;
    boolean bool1 = bool2;
    if (this.q != 2) {
      if ((this.q != 1) || (paramConnectionResult.a())) {
        break label31;
      }
    }
    label31:
    for (bool1 = bool2;; bool1 = false) {
      return bool1;
    }
  }
  
  public final bwp b(bwp parambwp)
  {
    throw new IllegalStateException("GoogleApiClient is not connected yet.");
  }
  
  public final void b()
  {
    this.n = false;
  }
  
  void b(ConnectionResult paramConnectionResult)
  {
    boolean bool = false;
    this.n = false;
    this.a.l.clear();
    if (!paramConnectionResult.a()) {
      bool = true;
    }
    a(bool);
    a(3);
    if ((!this.a.g) || (!bvt.b(this.j, paramConnectionResult.c)))
    {
      this.a.g();
      this.a.c.a(paramConnectionResult);
    }
    this.a.c.a();
  }
  
  void b(ConnectionResult paramConnectionResult, bvz parambvz, int paramInt)
  {
    int i1 = 1;
    if (paramInt != 2)
    {
      parambvz.a();
      if (paramInt == 1)
      {
        if (!paramConnectionResult.a()) {
          break label89;
        }
        paramInt = 1;
        if (paramInt == 0) {
          break label109;
        }
      }
      paramInt = i1;
      if (this.k != null) {
        if (Integer.MAX_VALUE >= this.l) {
          break label109;
        }
      }
    }
    label89:
    label109:
    for (paramInt = i1;; paramInt = 0)
    {
      if (paramInt != 0)
      {
        this.k = paramConnectionResult;
        this.l = Integer.MAX_VALUE;
      }
      this.a.k.put(parambvz.b(), paramConnectionResult);
      return;
      if (bvt.a(paramConnectionResult.c) != null)
      {
        paramInt = 1;
        break;
      }
      paramInt = 0;
      break;
    }
  }
  
  boolean b(int paramInt)
  {
    if (this.m != paramInt)
    {
      Log.wtf("GoogleApiClientConnecting", "GoogleApiClient connecting is in step " + c(this.m) + " but received callback for step " + c(paramInt));
      b(new ConnectionResult(8, null));
    }
    for (boolean bool = false;; bool = true) {
      return bool;
    }
  }
  
  public final String c()
  {
    return "CONNECTING";
  }
  
  boolean d()
  {
    boolean bool = false;
    this.c -= 1;
    if (this.c > 0) {}
    for (;;)
    {
      return bool;
      if (this.k != null) {
        b(this.k);
      } else {
        bool = true;
      }
    }
  }
  
  void e()
  {
    if ((this.f) && (this.c == 0))
    {
      this.m = 1;
      this.c = this.a.j.size();
      Iterator localIterator = this.a.j.keySet().iterator();
      while (localIterator.hasNext())
      {
        bwe localbwe = (bwe)localIterator.next();
        if (this.a.k.containsKey(localbwe))
        {
          if (d()) {
            f();
          }
        }
        else {
          ((bwc)this.a.j.get(localbwe)).a(this.g);
        }
      }
    }
  }
  
  void f()
  {
    this.m = 2;
    this.a.l = j();
    this.d.a(this.g, this.a.l, new bwt(this));
  }
  
  void g()
  {
    Set localSet = this.a.l;
    if (localSet.isEmpty()) {
      localSet = j();
    }
    for (;;)
    {
      this.m = 3;
      this.c = this.a.j.size();
      Iterator localIterator = this.a.j.keySet().iterator();
      while (localIterator.hasNext())
      {
        bwe localbwe = (bwe)localIterator.next();
        if (this.a.k.containsKey(localbwe))
        {
          if (d()) {
            i();
          }
        }
        else {
          ((bwc)this.a.j.get(localbwe)).a(this.g, localSet);
        }
      }
      return;
    }
  }
  
  void h()
  {
    this.e = false;
    this.a.l.clear();
    Iterator localIterator = this.p.iterator();
    while (localIterator.hasNext())
    {
      bwe localbwe = (bwe)localIterator.next();
      if (!this.a.k.containsKey(localbwe)) {
        this.a.k.put(localbwe, new ConnectionResult(17, null));
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bws.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */