	final java.util.concurrent.locks.Lock a
	final java.util.concurrent.locks.Condition b
	final byx c
	final android.content.Context d
	final android.os.Looper e
	final java.util.Queue f
	bridge  g
	final bxe h
	 android.content.BroadcastReceiver i
	final java.util.Map j
	final java.util.Map k
	 java.util.Set l
	final byl m
	final java.util.Map n
	final bwd o
	bridge bxj p
	final java.util.Set q
	private  r
	private  s
	private final java.util.Set t
	private final bxg u
	private final bwg v
	private final byy w
	
	    public bwz(android.content.Context p11, android.os.Looper p12, byl p13, bwd p14, java.util.Map p15, java.util.Set p16, java.util.Set p17, int p18, int p19)
	    {
	        this.a = new java.util.concurrent.locks.ReentrantLock();
	        this.f = new java.util.LinkedList();
	        this.r = 120000;
	        this.s = 5000;
	        this.j = new java.util.HashMap();
	        this.k = new java.util.HashMap();
	        this.l = new java.util.HashSet();
	        this.t = java.util.Collections.newSetFromMap(new java.util.WeakHashMap());
	        this.q = java.util.Collections.newSetFromMap(new java.util.concurrent.ConcurrentHashMap(16, 1061158912, 2));
	        this.u = new bxa(this);
	        this.v = new bxb(this);
	        this.w = new bxc(this);
	        this.d = p11;
	        this.c = new byx(p12, this.w);
	        this.e = p12;
	        this.h = new bxe(this, p12);
	        this.n = new java.util.HashMap();
	        this.b = this.a.newCondition();
	        this.p = new bwy(this);
	        java.util.Map v1_2 = p16.iterator();
	        while (v1_2.hasNext()) {
	            this.c.a(((bwg) v1_2.next()));
	        }
	        java.util.Map v1_3 = p17.iterator();
	        while (v1_3.hasNext()) {
	            this.c.a(((bwh) v1_3.next()));
	        }
	        java.util.Map v8 = p13.d;
	        java.util.Iterator v9 = p15.keySet().iterator();
	        while (v9.hasNext()) {
	            java.util.Map v1_5;
	            bvz v7_1 = ((bvz) v9.next());
	            Object v4 = p15.get(v7_1);
	            if (v8.get(v7_1) == null) {
	                v1_5 = 0;
	            } else {
	                v8.get(v7_1);
	                v1_5 = 2;
	            }
	            this.n.put(v7_1, Integer.valueOf(v1_5));
	            this.j.put(v7_1.b(), v7_1.a().a(p11, p12, p13, v4, this.v, this.a(v7_1, v1_5)));
	        }
	        this.m = p13;
	        this.o = p14;
	        return;
	    }
	
	
	    private final bwh a(bvz p2, int p3)
	    {
	        return new bxd(this, p2, p3);
	    }
	
	
	    static synthetic bxj a(bwz p1)
	    {
	        return p1.p;
	    }
	
	
	    private void a(int p3)
	    {
	        this.a.lock();
	        try {
	            this.p.a(p3);
	            this.a.unlock();
	            return;
	        } catch (Throwable v0_3) {
	            this.a.unlock();
	            throw v0_3;
	        }
	    }
	
	
	    static synthetic void a(bwz p0, int p1)
	    {
	        p0.a(p1);
	        return;
	    }
	
	
	    static synthetic boolean a(bwz p1, boolean p2)
	    {
	        p1.g = 1;
	        return 1;
	    }
	
	
	    static synthetic java.util.concurrent.locks.Lock b(bwz p1)
	    {
	        return p1.a;
	    }
	
	
	    static synthetic android.content.Context c(bwz p1)
	    {
	        return p1.d;
	    }
	
	
	    static synthetic long d(bwz p2)
	    {
	        return p2.r;
	    }
	
	
	    static synthetic long e(bwz p2)
	    {
	        return p2.s;
	    }
	
	
	    static synthetic void f(bwz p2)
	    {
	        p2.a.lock();
	        try {
	            if (p2.g) {
	                p2.b();
	            }
	        } catch (java.util.concurrent.locks.Lock v0_2) {
	            p2.a.unlock();
	            throw v0_2;
	        }
	        p2.a.unlock();
	        return;
	    }
	
	
	    static synthetic void g(bwz p2)
	    {
	        p2.a.lock();
	        try {
	            if (p2.g()) {
	                p2.b();
	            }
	        } catch (java.util.concurrent.locks.Lock v0_2) {
	            p2.a.unlock();
	            throw v0_2;
	        }
	        p2.a.unlock();
	        return;
	    }
	
	
	    public final android.os.Looper a()
	    {
	        return this.e;
	    }
	
	
	    public final bwc a(bwe p3)
	    {
	        bwc v0_2 = ((bwc) this.j.get(p3));
	        a.f(v0_2, "Appropriate Api was not requested.");
	        return v0_2;
	    }
	
	
	    public final bwp a(bwp p3)
	    {
	        Throwable v0_1;
	        if (p3.f == null) {
	            v0_1 = 0;
	        } else {
	            v0_1 = 1;
	        }
	        a.b(v0_1, "This task can not be enqueued (it\'s probably a Batch or malformed)");
	        a.b(this.j.containsKey(p3.f), "GoogleApiClient is not configured to use the API required for this call.");
	        this.a.lock();
	        try {
	            Throwable v0_6 = this.p.a(p3);
	            this.a.unlock();
	            return v0_6;
	        } catch (Throwable v0_7) {
	            this.a.unlock();
	            throw v0_7;
	        }
	    }
	
	
	    public final void a(bwg p2)
	    {
	        this.c.a(p2);
	        return;
	    }
	
	
	    public final void a(bwh p2)
	    {
	        this.c.a(p2);
	        return;
	    }
	
	
	    final void a(bxi p2)
	    {
	        this.q.add(p2);
	        p2.a(this.u);
	        return;
	    }
	
	
	    final void a(com.google.android.gms.common.ConnectionResult p3)
	    {
	        this.a.lock();
	        try {
	            this.p = new bwy(this);
	            this.p.a();
	            this.b.signalAll();
	            this.a.unlock();
	            return;
	        } catch (Throwable v0_6) {
	            this.a.unlock();
	            throw v0_6;
	        }
	    }
	
	
	    public final void a(String p4, java.io.FileDescriptor p5, java.io.PrintWriter p6, String[] p7)
	    {
	        p6.append(p4).println("GoogleApiClient:");
	        String v1_2 = new StringBuilder().append(p4).append("  ").toString();
	        p6.append(v1_2).append("mState=").append(this.p.c());
	        p6.append(" mResuming=").print(this.g);
	        p6.append(" mWorkQueue.size()=").print(this.f.size());
	        p6.append(" mUnconsumedRunners.size()=").println(this.q.size());
	        java.util.Iterator v2_8 = this.j.values().iterator();
	        while (v2_8.hasNext()) {
	            ((bwc) v2_8.next()).a(v1_2, p6);
	        }
	        return;
	    }
	
	
	    public final bwp b(bwp p3)
	    {
	        java.util.concurrent.locks.Lock v0_1;
	        if (p3.f == null) {
	            v0_1 = 0;
	        } else {
	            v0_1 = 1;
	        }
	        a.b(v0_1, "This task can not be executed (it\'s probably a Batch or malformed)");
	        this.a.lock();
	        try {
	            if (!this.g) {
	                p3 = this.p.b(p3);
	                this.a.unlock();
	            } else {
	                this.f.add(p3);
	                while (!this.f.isEmpty()) {
	                    java.util.concurrent.locks.Lock v0_13 = ((bxi) this.f.remove());
	                    this.a(v0_13);
	                    v0_13.d(com.google.android.gms.common.api.Status.b);
	                }
	                this.a.unlock();
	            }
	        } catch (java.util.concurrent.locks.Lock v0_9) {
	            this.a.unlock();
	            throw v0_9;
	        }
	        return p3;
	    }
	
	
	    public final void b()
	    {
	        this.a.lock();
	        try {
	            this.p.b();
	            this.a.unlock();
	            return;
	        } catch (Throwable v0_3) {
	            this.a.unlock();
	            throw v0_3;
	        }
	    }
	
	
	    public final void b(bwg p5)
	    {
	        java.util.ArrayList v0_0 = this.c;
	        a.c(p5);
	        try {
	            if (v0_0.b.remove(p5)) {
	                if (v0_0.f) {
	                    v0_0.c.add(p5);
	                }
	            } else {
	                android.util.Log.w("GmsClientEvents", new StringBuilder("unregisterConnectionCallbacks(): listener ").append(p5).append(" not found").toString());
	            }
	        } catch (java.util.ArrayList v0_3) {
	            throw v0_3;
	        }
	        return;
	    }
	
	
	    public final void b(bwh p5)
	    {
	        String v0_0 = this.c;
	        a.c(p5);
	        try {
	            if (!v0_0.d.remove(p5)) {
	                android.util.Log.w("GmsClientEvents", new StringBuilder("unregisterConnectionFailedListener(): listener ").append(p5).append(" not found").toString());
	            }
	        } catch (String v0_4) {
	            throw v0_4;
	        }
	        return;
	    }
	
	
	    public final void c()
	    {
	        this.g();
	        this.a(-1);
	        return;
	    }
	
	
	    public final boolean d()
	    {
	        return (this.p instanceof bwr);
	    }
	
	
	    public final boolean e()
	    {
	        return (this.p instanceof bws);
	    }
	
	
	    final void f()
	    {
	        java.util.Iterator v1_0 = this.q.iterator();
	        while (v1_0.hasNext()) {
	            java.util.Set v0_10 = ((bxi) v1_0.next());
	            v0_10.a(0);
	            v0_10.b();
	        }
	        this.q.clear();
	        java.util.Iterator v1_1 = this.t.iterator();
	        while (v1_1.hasNext()) {
	            ((dh) v1_1.next()).f();
	        }
	        this.t.clear();
	        this.l.clear();
	        return;
	    }
	
	
	    final boolean g()
	    {
	        java.util.concurrent.locks.Lock v0_0 = 0;
	        this.a.lock();
	        try {
	            if (this.g) {
	                this.g = 0;
	                this.h.removeMessages(2);
	                this.h.removeMessages(1);
	                if (this.i != null) {
	                    this.d.getApplicationContext().unregisterReceiver(this.i);
	                    this.i = 0;
	                }
	                this.a.unlock();
	                v0_0 = 1;
	            } else {
	                this.a.unlock();
	            }
	        } catch (java.util.concurrent.locks.Lock v0_8) {
	            this.a.unlock();
	            throw v0_8;
	        }
	        return v0_0;
	    }
	
