	private final byl a
	private final byz b
	private final java.lang.Object c
	private bzl d
	private  e
	private bwi f
	public final android.content.Context g
	public final android.os.Looper h
	final android.os.Handler i
	private android.os.IInterface j
	private final java.util.ArrayList k
	private byt l
	private  m
	private final java.util.Set n
	private final android.accounts.Account o
	private final byx p
	private final  q
	
	    static byo()
	    {
	        String[] v0_1 = new String[2];
	        v0_1[0] = "service_esmobile";
	        v0_1[1] = "service_googleme";
	        return;
	    }
	
	
	    public byo(android.content.Context p2, android.os.Looper p3, int p4, bwg p5, bwh p6)
	    {
	        this.c = new Object();
	        this.e = 0;
	        this.k = new java.util.ArrayList();
	        this.m = 1;
	        this.g = ((android.content.Context) a.c(p2));
	        this.h = ((android.os.Looper) a.f(p3, "Looper must not be null"));
	        this.b = byz.a(p2);
	        this.p = new byx(p3, this);
	        this.i = new byq(this, p3);
	        this.q = p4;
	        this.o = 0;
	        this.n = java.util.Collections.emptySet();
	        this.a = new bwf(p2).a();
	        this.a(((bwg) a.c(p5)));
	        this.a(((bwh) a.c(p6)));
	        return;
	    }
	
	
	    public byo(android.content.Context p9, android.os.Looper p10, int p11, bwg p12, bwh p13, byl p14)
	    {
	        this(p9, p10, byz.a(p9), p11, p14, p12, p13);
	        return;
	    }
	
	
	    private byo(android.content.Context p2, android.os.Looper p3, byz p4, int p5, byl p6)
	    {
	        this.c = new Object();
	        this.e = 0;
	        this.k = new java.util.ArrayList();
	        this.m = 1;
	        this.g = ((android.content.Context) a.f(p2, "Context must not be null"));
	        this.h = ((android.os.Looper) a.f(p3, "Looper must not be null"));
	        this.b = ((byz) a.f(p4, "Supervisor must not be null"));
	        this.p = new byx(p3, this);
	        this.i = new byq(this, p3);
	        this.q = p5;
	        this.a = ((byl) a.c(p6));
	        this.o = p6.a;
	        this.n = this.a(p6.c);
	        return;
	    }
	
	
	    private byo(android.content.Context p2, android.os.Looper p3, byz p4, int p5, byl p6, bwg p7, bwh p8)
	    {
	        byo v1_1 = this(p2, p3, p4, p5, p6);
	        v1_1.a(((bwg) a.c(p7)));
	        v1_1.a(((bwh) a.c(p8)));
	        return;
	    }
	
	
	    static synthetic bzl a(byo p0, bzl p1)
	    {
	        p0.d = p1;
	        return p1;
	    }
	
	
	    private java.util.Set a(java.util.Set p3)
	    {
	        if (p3 != null) {
	            String v1_0 = p3.iterator();
	            while (v1_0.hasNext()) {
	                if (!p3.contains(((com.google.android.gms.common.api.Scope) v1_0.next()))) {
	                    throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
	                }
	            }
	        }
	        return p3;
	    }
	
	
	    private void a(int p6, android.os.IInterface p7)
	    {
	        int v3_0;
	        android.os.Handler v0_0 = 1;
	        try {
	            if (p6 != 3) {
	                v3_0 = 0;
	            } else {
	                v3_0 = 1;
	            }
	        } catch (android.os.Handler v0_13) {
	            throw v0_13;
	        }
	        android.os.Message v2_1;
	        if (p7 == null) {
	            v2_1 = 0;
	        } else {
	            v2_1 = 1;
	        }
	        if (v3_0 != v2_1) {
	            v0_0 = 0;
	        }
	        a.b(v0_0);
	        this.m = p6;
	        this.j = p7;
	        switch (p6) {
	            case 1:
	                if (this.l == null) {
	                } else {
	                    this.b.b(this.c(), this.l, this.l());
	                    this.l = 0;
	                }
	                break;
	            case 2:
	                if (this.l != null) {
	                    android.util.Log.e("GmsClient", new StringBuilder("Calling connect() while still connected, missing disconnect() for ").append(this.c()).toString());
	                    this.b.b(this.c(), this.l, this.l());
	                }
	                this.l = new byt(this);
	                if (this.b.a(this.c(), this.l, this.l())) {
	                } else {
	                    android.util.Log.e("GmsClient", new StringBuilder("unable to connect to service: ").append(this.c()).toString());
	                    this.i.sendMessage(this.i.obtainMessage(3, Integer.valueOf(9)));
	                }
	                break;
	        }
	        return;
	    }
	
	
	    private void a(bwg p2)
	    {
	        this.p.a(p2);
	        return;
	    }
	
	
	    static synthetic void a(byo p1, int p2, android.os.IInterface p3)
	    {
	        p1.a(p2, 0);
	        return;
	    }
	
	
	    private boolean a(int p3, int p4, android.os.IInterface p5)
	    {
	        try {
	            int v0_1;
	            if (this.m == p3) {
	                this.a(p4, p5);
	                v0_1 = 1;
	            } else {
	                v0_1 = 0;
	            }
	        } catch (int v0_2) {
	            throw v0_2;
	        }
	        return v0_1;
	    }
	
	
	    static synthetic boolean a(byo p1)
	    {
	        return p1.e;
	    }
	
	
	    static synthetic boolean a(byo p1, int p2, int p3, android.os.IInterface p4)
	    {
	        return p1.a(p2, p3, p4);
	    }
	
	
	    static synthetic bwi b(byo p1)
	    {
	        return p1.f;
	    }
	
	
	    static synthetic byx c(byo p1)
	    {
	        return p1.p;
	    }
	
	
	    static synthetic java.util.ArrayList d(byo p1)
	    {
	        return p1.k;
	    }
	
	
	    static synthetic java.util.Set e(byo p1)
	    {
	        return p1.n;
	    }
	
	
	    static synthetic android.content.Context f(byo p1)
	    {
	        return p1.g;
	    }
	
	
	    public void a()
	    {
	        this.p.a();
	        int v3 = this.k.size();
	        int v1_0 = 0;
	        while (v1_0 < v3) {
	            ((byr) this.k.get(v1_0)).d();
	            v1_0++;
	        }
	        this.k.clear();
	        this.a(1, 0);
	        return;
	    }
	
	
	    public final void a(int p5)
	    {
	        this.i.sendMessage(this.i.obtainMessage(4, Integer.valueOf(p5)));
	        return;
	    }
	
	
	    public void a(int p5, android.os.IBinder p6, android.os.Bundle p7)
	    {
	        this.i.sendMessage(this.i.obtainMessage(1, new byu(this, p5, p6, p7)));
	        return;
	    }
	
	
	    public final void a(bwh p2)
	    {
	        this.p.a(p2);
	        return;
	    }
	
	
	    public final void a(bwi p2)
	    {
	        this.f = ((bwi) a.f(p2, "Must provide a non-null ConnectionStatusReportCallbacks"));
	        this.e = 1;
	        return;
	    }
	
	
	    public final void a(bzf p5)
	    {
	        String v2_2 = new com.google.android.gms.common.api.Scope[this.n.size()];
	        try {
	            this.d.a(new bys(this), new com.google.android.gms.common.internal.ValidateAccountRequest(p5, ((com.google.android.gms.common.api.Scope[]) this.n.toArray(v2_2)), this.g.getPackageName(), 0));
	        } catch (android.os.RemoteException v0) {
	            android.util.Log.w("GmsClient", "service died");
	            this.a(1);
	        } catch (android.os.RemoteException v0_4) {
	            android.util.Log.w("GmsClient", "Remote exception occurred", v0_4);
	        }
	        return;
	    }
	
	
	    public final void a(bzf p4, java.util.Set p5)
	    {
	        try {
	            bzl v0_0 = this.e();
	            String v1_1 = new com.google.android.gms.common.internal.GetServiceRequest(this.q);
	            v1_1.d = this.g.getPackageName();
	            v1_1.g = v0_0;
	        } catch (bzl v0_8) {
	            android.util.Log.w("GmsClient", "Remote exception occurred", v0_8);
	            return;
	        } catch (bzl v0) {
	            android.util.Log.w("GmsClient", "service died");
	            this.a(1);
	            return;
	        }
	        if (p5 != null) {
	            bzl v0_2 = new com.google.android.gms.common.api.Scope[p5.size()];
	            v1_1.f = ((com.google.android.gms.common.api.Scope[]) p5.toArray(v0_2));
	        }
	        if (this.p()) {
	            v1_1.h = this.o;
	        }
	        this.d.a(new bys(this), v1_1);
	        return;
	    }
	
	
	    public final void a(String p5, java.io.PrintWriter p6)
	    {
	        p6.append(p5).println("GmsClient:");
	        java.io.PrintWriter v0_5 = new StringBuilder().append(p5).append("  ").toString();
	        p6.append(v0_5).append("mStartServiceAction=").println(this.c());
	        int v2_2 = this.m;
	        android.os.IInterface v3 = this.j;
	        p6.append(v0_5).append("mConnectState=");
	        switch (v2_2) {
	            case 1:
	                p6.print("DISCONNECTED");
	                break;
	            case 2:
	                p6.print("CONNECTING");
	                break;
	            case 3:
	                p6.print("CONNECTED");
	                break;
	            case 4:
	                p6.print("DISCONNECTING");
	                break;
	            default:
	                p6.print("UNKNOWN");
	        }
	        p6.append(" mService=");
	        if (v3 != null) {
	            p6.append(this.d()).append("@").println(Integer.toHexString(System.identityHashCode(v3.asBinder())));
	        } else {
	            p6.println("null");
	        }
	        return;
	    }
	
	
	    public android.os.Bundle b()
	    {
	        return 0;
	    }
	
	
	    public android.os.Bundle e()
	    {
	        return new android.os.Bundle();
	    }
	
	
	    public final void j()
	    {
	        this.p.e = 1;
	        int v0_2 = bvt.a(this.g);
	        if (v0_2 == 0) {
	            this.a(2, 0);
	        } else {
	            this.a(1, 0);
	            this.i.sendMessage(this.i.obtainMessage(3, Integer.valueOf(v0_2)));
	        }
	        return;
	    }
	
	
	    public final boolean k()
	    {
	        try {
	            int v0_1;
	            if (this.m != 3) {
	                v0_1 = 0;
	            } else {
	                v0_1 = 1;
	            }
	        } catch (int v0_2) {
	            throw v0_2;
	        }
	        return v0_1;
	    }
	
	
	    public String l()
	    {
	        return this.a.f;
	    }
	
	
	    public final boolean m()
	    {
	        try {
	            int v0_1;
	            if (this.m != 2) {
	                v0_1 = 0;
	            } else {
	                v0_1 = 1;
	            }
	        } catch (int v0_2) {
	            throw v0_2;
	        }
	        return v0_1;
	    }
	
	
	    public final void n()
	    {
	        if (this.k()) {
	            return;
	        } else {
	            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
	        }
	    }
	
	
	    public final android.os.IInterface o()
	    {
	        try {
	            if (this.m != 4) {
	                android.os.IInterface v0_2;
	                this.n();
	                if (this.j == null) {
	                    v0_2 = 0;
	                } else {
	                    v0_2 = 1;
	                }
	                a.a(v0_2, "Client is connected but service is null");
	                return this.j;
	            } else {
	                throw new android.os.DeadObjectException();
	            }
	        } catch (android.os.IInterface v0_6) {
	            throw v0_6;
	        }
	    }
	
	
	    public boolean p()
	    {
	        return 0;
	    }
	
