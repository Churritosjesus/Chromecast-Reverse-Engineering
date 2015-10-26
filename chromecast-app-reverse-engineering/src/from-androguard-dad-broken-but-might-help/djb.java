	private static final java.util.concurrent.ExecutorService j
	public final dfx a
	final  b
	  c
	  d
	public final dix e
	final dix f
	final djr g
	final java.net.Socket h
	public final did i
	private final diq k
	private final java.util.Map l
	private final java.lang.String m
	private  n
	private  o
	private  p
	private  q
	private final java.util.concurrent.ExecutorService r
	private final div s
	private  t
	private djk u
	private final java.util.Set v
	
	    static djb()
	    {
	        djb.j = new java.util.concurrent.ThreadPoolExecutor(0, 2147483647, 60, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.SynchronousQueue(), dgs.a("OkHttp SpdyConnection", 1));
	        return;
	    }
	
	
	    public djb(djj p12)
	    {
	        AssertionError v0_15;
	        this.l = new java.util.HashMap();
	        this.q = System.nanoTime();
	        this.c = 0;
	        this.e = new dix();
	        this.f = new dix();
	        this.t = 0;
	        this.v = new java.util.LinkedHashSet();
	        this.a = p12.d;
	        this.s = p12.e;
	        this.b = p12.f;
	        this.k = p12.c;
	        if (!p12.f) {
	            v0_15 = 2;
	        } else {
	            v0_15 = 1;
	        }
	        this.o = v0_15;
	        if ((p12.f) && (this.a == dfx.d)) {
	            this.o = (this.o + 2);
	        }
	        if (p12.f) {
	            this.e.a(7, 0, 16777216);
	        }
	        this.m = p12.a;
	        if (this.a != dfx.d) {
	            if (this.a != dfx.c) {
	                throw new AssertionError(this.a);
	            } else {
	                this.g = new diy();
	                this.r = 0;
	            }
	        } else {
	            this.g = new dij();
	            java.util.concurrent.LinkedBlockingQueue v7_1 = new java.util.concurrent.LinkedBlockingQueue();
	            java.util.concurrent.ThreadFactory v8_0 = new Object[1];
	            v8_0[0] = this.m;
	            this.r = new java.util.concurrent.ThreadPoolExecutor(0, 1, 60, java.util.concurrent.TimeUnit.SECONDS, v7_1, dgs.a(String.format("OkHttp %s Push Observer", v8_0), 1));
	            this.f.a(7, 0, 65535);
	            this.f.a(5, 0, 16384);
	        }
	        this.d = ((long) this.f.c(65536));
	        this.h = p12.b;
	        this.i = this.g.a(dkk.a(dkk.a(p12.b)), this.b);
	        this.u = new djk(this);
	        new Thread(this.u).start();
	        return;
	    }
	
	
	    static synthetic String a(djb p1)
	    {
	        return p1.m;
	    }
	
	
	    private void a(dia p7, dia p8)
	    {
	        int v2 = 0;
	        try {
	            int v1_3;
	        } catch (int v1_3) {
	            djn[] v3_2;
	            if (this.l.isEmpty()) {
	                v3_2 = 0;
	            } else {
	                djn[] v3_5 = new djn[this.l.size()];
	                int v0_4 = ((djn[]) this.l.values().toArray(v3_5));
	                this.l.clear();
	                this.a(0);
	                v3_2 = v0_4;
	            }
	            if (v3_2 != null) {
	                int v4_1 = v3_2.length;
	                int v0_6 = v1_3;
	                while (v2 < v4_1) {
	                    try {
	                        v3_2[v2].a(p8);
	                    } catch (int v1_8) {
	                        if (v0_6 == 0) {
	                        } else {
	                            v0_6 = v1_8;
	                        }
	                    }
	                    v2++;
	                }
	                v1_3 = v0_6;
	            }
	            try {
	                this.i.close();
	                int v0_8 = v1_3;
	                try {
	                    this.h.close();
	                } catch (int v0_8) {
	                }
	                if (v0_8 == 0) {
	                    return;
	                } else {
	                    throw v0_8;
	                }
	            } catch (int v0_8) {
	                if (v1_3 == 0) {
	                } else {
	                    v0_8 = v1_3;
	                }
	            }
	        }
	        if (!this.p) {
	            this.p = 1;
	            this.i.a(this.n, p7, dgs.a);
	            v1_3 = 0;
	        } else {
	            v1_3 = 0;
	        }
	    }
	
	
	    static synthetic void a(djb p7, int p8, dia p9)
	    {
	        java.util.concurrent.ExecutorService v6 = p7.r;
	        Object[] v3 = new Object[2];
	        v3[0] = p7.m;
	        v3[1] = Integer.valueOf(p8);
	        v6.execute(new dji(p7, "OkHttp %s Push Reset[%s]", v3, p8, p9));
	        return;
	    }
	
	
	    static synthetic void a(djb p9, int p10, dkd p11, int p12, boolean p13)
	    {
	        djz v5_1 = new djz();
	        p11.a(((long) p12));
	        p11.a(v5_1, ((long) p12));
	        if (v5_1.b == ((long) p12)) {
	            java.util.concurrent.ExecutorService v8 = p9.r;
	            Object[] v3 = new Object[2];
	            v3[0] = p9.m;
	            v3[1] = Integer.valueOf(p10);
	            v8.execute(new djh(p9, "OkHttp %s Push Data[%s]", v3, p10, v5_1, p12, p13));
	            return;
	        } else {
	            throw new java.io.IOException(new StringBuilder().append(v5_1.b).append(" != ").append(p12).toString());
	        }
	    }
	
	
	    static synthetic void a(djb p7, int p8, java.util.List p9)
	    {
	        if (!p7.v.contains(Integer.valueOf(p8))) {
	            p7.v.add(Integer.valueOf(p8));
	            java.util.concurrent.ExecutorService v6 = p7.r;
	            Object[] v3 = new Object[2];
	            v3[0] = p7.m;
	            v3[1] = Integer.valueOf(p8);
	            v6.execute(new djf(p7, "OkHttp %s Push Request[%s]", v3, p8, p9));
	        } else {
	            p7.a(p8, dia.b);
	        }
	        return;
	    }
	
	
	    static synthetic void a(djb p8, int p9, java.util.List p10, boolean p11)
	    {
	        java.util.concurrent.ExecutorService v7 = p8.r;
	        Object[] v3 = new Object[2];
	        v3[0] = p8.m;
	        v3[1] = Integer.valueOf(p9);
	        v7.execute(new djg(p8, "OkHttp %s Push Headers[%s]", v3, p9, p10, p11));
	        return;
	    }
	
	
	    static synthetic void a(djb p0, dia p1, dia p2)
	    {
	        p0.a(p1, p2);
	        return;
	    }
	
	
	    static synthetic void a(djb p2, boolean p3, int p4, int p5, dh p6)
	    {
	        try {
	            if (p6 != null) {
	                p6.g();
	            }
	        } catch (Throwable v0_1) {
	            throw v0_1;
	        }
	        p2.i.a(p3, p4, p5);
	        return;
	    }
	
	
	    private declared_synchronized void a(boolean p3)
	    {
	        Throwable v0_0;
	        if (!p3) {
	            v0_0 = nan;
	        } else {
	            try {
	                v0_0 = System.nanoTime();
	            } catch (Throwable v0_1) {
	                throw v0_1;
	            }
	        }
	        this.q = v0_0;
	        return;
	    }
	
	
	    static synthetic boolean a(djb p2, int p3)
	    {
	        if ((p2.a != dfx.d) || ((p3 == 0) || ((p3 & 1) != 0))) {
	            int v0_2 = 0;
	        } else {
	            v0_2 = 1;
	        }
	        return v0_2;
	    }
	
	
	    static synthetic boolean a(djb p1, boolean p2)
	    {
	        p1.t = 1;
	        return 1;
	    }
	
	
	    static synthetic int b(djb p0, int p1)
	    {
	        p0.n = p1;
	        return p1;
	    }
	
	
	    static synthetic void b(djb p9, boolean p10, int p11, int p12, dh p13)
	    {
	        Object[] v3 = new Object[3];
	        v3[0] = p9.m;
	        v3[1] = Integer.valueOf(p11);
	        v3[2] = Integer.valueOf(p12);
	        djb.j.execute(new dje(p9, "OkHttp %s ping %08x%08x", v3, 1, p11, p12, 0));
	        return;
	    }
	
	
	    static synthetic boolean b(djb p1)
	    {
	        return p1.p;
	    }
	
	
	    static synthetic boolean b(djb p1, boolean p2)
	    {
	        p1.p = 1;
	        return 1;
	    }
	
	
	    static synthetic int c(djb p1)
	    {
	        return p1.n;
	    }
	
	
	    private declared_synchronized dh c(int p2)
	    {
	        return 0;
	    }
	
	
	    static synthetic dh c(djb p1, int p2)
	    {
	        return p1.c(p2);
	    }
	
	
	    static synthetic int d(djb p1)
	    {
	        return p1.o;
	    }
	
	
	    static synthetic java.util.concurrent.ExecutorService d()
	    {
	        return djb.j;
	    }
	
	
	    static synthetic java.util.Map e(djb p1)
	    {
	        return p1.l;
	    }
	
	
	    static synthetic diq f(djb p1)
	    {
	        return p1.k;
	    }
	
	
	    static synthetic boolean g(djb p1)
	    {
	        return p1.t;
	    }
	
	
	    static synthetic div h(djb p1)
	    {
	        return p1.s;
	    }
	
	
	    static synthetic java.util.Set i(djb p1)
	    {
	        return p1.v;
	    }
	
	
	    final declared_synchronized djn a(int p3)
	    {
	        try {
	            return ((djn) this.l.get(Integer.valueOf(p3)));
	        } catch (Throwable v0_3) {
	            throw v0_3;
	        }
	    }
	
	
	    public djn a(int p10, java.util.List p11, boolean p12, boolean p13)
	    {
	        int v3;
	        int v4 = 1;
	        if (p12) {
	            v3 = 0;
	        } else {
	            v3 = 1;
	        }
	        if (p13) {
	            v4 = 0;
	        }
	        try {
	        } catch (djn v0_9) {
	            throw v0_9;
	        }
	        if (!this.p) {
	            did v1_0 = this.o;
	            this.o = (this.o + 2);
	            djn v0_5 = new djn(v1_0, this, v3, v4, p11);
	            if (v0_5.a()) {
	                this.l.put(Integer.valueOf(v1_0), v0_5);
	                this.a(0);
	            }
	            this.i.a(v3, v4, v1_0, 0, p11);
	            if (!p12) {
	                this.i.b();
	            }
	            return v0_5;
	        } else {
	            throw new java.io.IOException("shutdown");
	        }
	    }
	
	
	    final void a(int p9, long p10)
	    {
	        Object[] v4 = new Object[2];
	        v4[0] = this.m;
	        v4[1] = Integer.valueOf(p9);
	        djb.j.execute(new djd(this, "OkHttp Window Update %s stream %d", v4, p9, p10));
	        return;
	    }
	
	
	    final void a(int p8, dia p9)
	    {
	        Object[] v3 = new Object[2];
	        v3[0] = this.m;
	        v3[1] = Integer.valueOf(p8);
	        djb.j.submit(new djc(this, "OkHttp %s stream %d", v3, p8, p9));
	        return;
	    }
	
	
	    public final void a(int p11, boolean p12, djz p13, long p14)
	    {
	        if (p14 != 0) {
	            while (p14 > 0) {
	                try {
	                    while (this.d <= 0) {
	                        if (this.l.containsKey(Integer.valueOf(p11))) {
	                            this.wait();
	                        } else {
	                            throw new java.io.IOException("stream closed");
	                        }
	                    }
	                } catch (int v0) {
	                    throw new java.io.InterruptedIOException();
	                } catch (int v0_12) {
	                    throw v0_12;
	                }
	                int v0_5;
	                int v2_5 = Math.min(((int) Math.min(p14, this.d)), this.i.c());
	                this.d = (this.d - ((long) v2_5));
	                p14 -= ((long) v2_5);
	                if ((!p12) || (p14 != 0)) {
	                    v0_5 = 0;
	                } else {
	                    v0_5 = 1;
	                }
	                this.i.a(v0_5, p11, p13, v2_5);
	            }
	        } else {
	            this.i.a(p12, p11, p13, 0);
	        }
	        return;
	    }
	
	
	    public final declared_synchronized boolean a()
	    {
	        try {
	            int v0_3;
	            if (this.q == nan) {
	                v0_3 = 0;
	            } else {
	                v0_3 = 1;
	            }
	        } catch (int v0_2) {
	            throw v0_2;
	        }
	        return v0_3;
	    }
	
	
	    public final declared_synchronized long b()
	    {
	        try {
	            return this.q;
	        } catch (Throwable v0_1) {
	            throw v0_1;
	        }
	    }
	
	
	    final declared_synchronized djn b(int p3)
	    {
	        try {
	            Throwable v0_2 = ((djn) this.l.remove(Integer.valueOf(p3)));
	        } catch (Throwable v0_3) {
	            throw v0_3;
	        }
	        if ((v0_2 != null) && (this.l.isEmpty())) {
	            this.a(1);
	        }
	        this.notifyAll();
	        return v0_2;
	    }
	
	
	    final void b(int p2, dia p3)
	    {
	        this.i.a(p2, p3);
	        return;
	    }
	
	
	    public final void c()
	    {
	        this.i.b();
	        return;
	    }
	
	
	    public final void close()
	    {
	        this.a(dia.a, dia.h);
	        return;
	    }
	
