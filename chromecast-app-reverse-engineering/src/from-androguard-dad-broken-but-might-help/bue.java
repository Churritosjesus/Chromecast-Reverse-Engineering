	private static final java.lang.Object A
	private static final java.lang.Object B
	private static final buu j
	public com.google.android.gms.cast.ApplicationMetadata a
	public final java.util.Map b
	public  c
	public  d
	public final java.util.concurrent.atomic.AtomicLong e
	public final java.util.Map f
	private final com.google.android.gms.cast.CastDevice k
	private final btc l
	private final  m
	private buh n
	private java.lang.String o
	private  p
	private  q
	private  r
	private  s
	private  t
	private java.lang.String u
	private java.lang.String v
	private android.os.Bundle w
	private final bug x
	private bwq y
	private bwq z
	
	    static bue()
	    {
	        bue.j = new buu("CastClientImpl");
	        bue.A = new Object();
	        bue.B = new Object();
	        return;
	    }
	
	
	    public bue(android.content.Context p7, android.os.Looper p8, com.google.android.gms.cast.CastDevice p9, long p10, btc p12, bwg p13, bwh p14)
	    {
	        this(p7, p8, 10, p13, p14);
	        this.k = p9;
	        this.l = p12;
	        this.m = p10;
	        this.b = new java.util.HashMap();
	        this.e = new java.util.concurrent.atomic.AtomicLong(0);
	        this.f = new java.util.HashMap();
	        this.q();
	        this.x = new bug(this);
	        this.a(this.x);
	        return;
	    }
	
	
	    static synthetic bwq a(bue p1, bwq p2)
	    {
	        p1.y = 0;
	        return 0;
	    }
	
	
	    static synthetic com.google.android.gms.cast.ApplicationMetadata a(bue p0, com.google.android.gms.cast.ApplicationMetadata p1)
	    {
	        p0.a = p1;
	        return p1;
	    }
	
	
	    static synthetic String a(bue p0, String p1)
	    {
	        p0.u = p1;
	        return p1;
	    }
	
	
	    static synthetic void a(bue p0)
	    {
	        p0.r();
	        return;
	    }
	
	
	    static synthetic void a(bue p6, com.google.android.gms.cast.internal.ApplicationStatus p7)
	    {
	        Boolean v0_1;
	        Boolean v0_0 = p7.b;
	        if (a.d(v0_0, p6.o)) {
	            v0_1 = 0;
	        } else {
	            p6.o = v0_0;
	            v0_1 = 1;
	        }
	        Object[] v5_1 = new Object[2];
	        v5_1[0] = Boolean.valueOf(v0_1);
	        v5_1[1] = Boolean.valueOf(p6.p);
	        bue.j.b("hasChanged=%b, mFirstApplicationStatusUpdate=%b", v5_1);
	        p6.p = 0;
	        return;
	    }
	
	
	    static synthetic void a(bue p11, com.google.android.gms.cast.internal.DeviceStatus p12)
	    {
	        Boolean v0_0 = p12.e;
	        if (!a.d(v0_0, p11.a)) {
	            p11.a = v0_0;
	            p11.l.a(p11.a);
	        }
	        Boolean v0_4;
	        String v4_0 = p12.b;
	        if ((v4_0 == nan) || (Math.abs((v4_0 - p11.d)) <= 1e-07)) {
	            v0_4 = 0;
	        } else {
	            p11.d = v4_0;
	            v0_4 = 1;
	        }
	        buu v3_3 = p12.c;
	        if (v3_3 != p11.c) {
	            p11.c = v3_3;
	            v0_4 = 1;
	        }
	        Object[] v5_0 = new Object[2];
	        v5_0[0] = Boolean.valueOf(v0_4);
	        v5_0[1] = Boolean.valueOf(p11.q);
	        bue.j.b("hasVolumeChanged=%b, mFirstDeviceStatusUpdate=%b", v5_0);
	        if ((p11.l != null) && ((v0_4 != null) || (p11.q))) {
	            p11.l.e();
	        }
	        Boolean v0_8;
	        Boolean v0_7 = p12.d;
	        if (v0_7 == p11.s) {
	            v0_8 = 0;
	        } else {
	            p11.s = v0_7;
	            v0_8 = 1;
	        }
	        Boolean v0_13;
	        Object[] v5_1 = new Object[2];
	        v5_1[0] = Boolean.valueOf(v0_8);
	        v5_1[1] = Boolean.valueOf(p11.q);
	        bue.j.b("hasActiveInputChanged=%b, mFirstDeviceStatusUpdate=%b", v5_1);
	        Boolean v0_12 = p12.f;
	        if (v0_12 == p11.t) {
	            v0_13 = 0;
	        } else {
	            p11.t = v0_12;
	            v0_13 = 1;
	        }
	        Object[] v5_2 = new Object[2];
	        v5_2[0] = Boolean.valueOf(v0_13);
	        v5_2[1] = Boolean.valueOf(p11.q);
	        bue.j.b("hasStandbyStateChanged=%b, mFirstDeviceStatusUpdate=%b", v5_2);
	        p11.q = 0;
	        return;
	    }
	
	
	    static synthetic bwq b(bue p1, bwq p2)
	    {
	        p1.z = 0;
	        return 0;
	    }
	
	
	    static synthetic String b(bue p0, String p1)
	    {
	        p0.v = p1;
	        return p1;
	    }
	
	
	    static synthetic void b(bue p0)
	    {
	        p0.q();
	        return;
	    }
	
	
	    static synthetic bwq c(bue p1)
	    {
	        return p1.y;
	    }
	
	
	    static synthetic btc d(bue p1)
	    {
	        return p1.l;
	    }
	
	
	    static synthetic java.util.Map e(bue p1)
	    {
	        return p1.b;
	    }
	
	
	    static synthetic com.google.android.gms.cast.CastDevice f(bue p1)
	    {
	        return p1.k;
	    }
	
	
	    static synthetic buu g()
	    {
	        return bue.j;
	    }
	
	
	    static synthetic java.util.Map g(bue p1)
	    {
	        return p1.f;
	    }
	
	
	    static synthetic bwq h(bue p1)
	    {
	        return p1.z;
	    }
	
	
	    static synthetic Object h()
	    {
	        return bue.A;
	    }
	
	
	    static synthetic Object i()
	    {
	        return bue.B;
	    }
	
	
	    private void q()
	    {
	        this.r = 0;
	        this.s = -1;
	        this.t = -1;
	        this.a = 0;
	        this.o = 0;
	        this.d = 0;
	        this.c = 0;
	        return;
	    }
	
	
	    private void r()
	    {
	        Object[] v2_1 = new Object[0];
	        bue.j.b("removing all MessageReceivedCallbacks", v2_1);
	        try {
	            this.b.clear();
	            return;
	        } catch (Throwable v0_2) {
	            throw v0_2;
	        }
	    }
	
	
	    protected final synthetic android.os.IInterface a(android.os.IBinder p2)
	    {
	        return bup.a(p2);
	    }
	
	
	    public final void a()
	    {
	        String v2_1 = new Object[2];
	        v2_1[0] = this.n;
	        v2_1[1] = Boolean.valueOf(this.k());
	        bue.j.b("disconnect(); ServiceListener=%s, isConnected=%b", v2_1);
	        buo v0_1 = this.n;
	        this.n = 0;
	        if ((v0_1 != null) && (v0_1.a() != null)) {
	            this.r();
	            try {
	                if ((this.k()) || (this.m())) {
	                    ((buo) this.o()).a();
	                }
	            } catch (buo v0_8) {
	                super.a();
	                throw v0_8;
	            } catch (buo v0_7) {
	                Object[] v3_4 = new Object[1];
	                v3_4[0] = v0_7.getMessage();
	                bue.j.a(v0_7, "Error while disconnecting the controller interface: %s", v3_4);
	                super.a();
	            }
	            super.a();
	        } else {
	            String v2_3 = new Object[0];
	            bue.j.b("already disposed, so short-circuiting", v2_3);
	        }
	        return;
	    }
	
	
	    protected final void a(int p8, android.os.IBinder p9, android.os.Bundle p10)
	    {
	        Object[] v3 = new Object[1];
	        v3[0] = Integer.valueOf(p8);
	        bue.j.b("in onPostInitHandler; statusCode=%d", v3);
	        if ((p8 != 0) && (p8 != 1001)) {
	            this.r = 0;
	        } else {
	            this.r = 1;
	            this.p = 1;
	            this.q = 1;
	        }
	        if (p8 == 1001) {
	            this.w = new android.os.Bundle();
	            this.w.putBoolean("com.google.android.gms.cast.EXTRA_APP_NO_LONGER_RUNNING", 1);
	            p8 = 0;
	        }
	        super.a(p8, p9, p10);
	        return;
	    }
	
	
	    public void a(bwq p6)
	    {
	        try {
	            if (this.y != null) {
	                this.y.a(new buf(new com.google.android.gms.common.api.Status(2002)));
	            }
	        } catch (bwq v0_2) {
	            throw v0_2;
	        }
	        this.y = p6;
	        return;
	    }
	
	
	    public final void a(String p7)
	    {
	        if (!android.text.TextUtils.isEmpty(p7)) {
	            if (((btd) this.b.remove(p7)) != null) {
	                try {
	                    ((buo) this.o()).c(p7);
	                } catch (IllegalStateException v0_7) {
	                    Object[] v3_1 = new Object[2];
	                    v3_1[0] = p7;
	                    v3_1[1] = v0_7.getMessage();
	                    bue.j.a(v0_7, "Error unregistering namespace (%s): %s", v3_1);
	                }
	            }
	            return;
	        } else {
	            throw new IllegalArgumentException("Channel namespace cannot be null or empty");
	        }
	    }
	
	
	    public final android.os.Bundle b()
	    {
	        android.os.Bundle v0_1;
	        if (this.w == null) {
	            v0_1 = super.b();
	        } else {
	            v0_1 = this.w;
	            this.w = 0;
	        }
	        return v0_1;
	    }
	
	
	    public void b(bwq p4)
	    {
	        try {
	            if (this.z == null) {
	                this.z = p4;
	            } else {
	                p4.a(new com.google.android.gms.common.api.Status(2001));
	            }
	        } catch (com.google.android.gms.common.api.Status v0_3) {
	            throw v0_3;
	        }
	        return;
	    }
	
	
	    protected final String c()
	    {
	        return "com.google.android.gms.cast.service.BIND_CAST_DEVICE_CONTROLLER_SERVICE";
	    }
	
	
	    protected final String d()
	    {
	        return "com.google.android.gms.cast.internal.ICastDeviceController";
	    }
	
	
	    protected final android.os.Bundle e()
	    {
	        android.os.Bundle v0_1 = new android.os.Bundle();
	        android.os.IBinder v3_1 = new Object[2];
	        v3_1[0] = this.u;
	        v3_1[1] = this.v;
	        bue.j.b("getRemoteService(): mLastApplicationId=%s, mLastSessionId=%s", v3_1);
	        v0_1.putParcelable("com.google.android.gms.cast.EXTRA_CAST_DEVICE", this.k);
	        v0_1.putLong("com.google.android.gms.cast.EXTRA_CAST_FLAGS", this.m);
	        this.n = new buh(this);
	        v0_1.putParcelable("listener", new com.google.android.gms.common.internal.BinderWrapper(this.n.asBinder()));
	        if (this.u != null) {
	            v0_1.putString("last_application_id", this.u);
	            if (this.v != null) {
	                v0_1.putString("last_session_id", this.v);
	            }
	        }
	        return v0_1;
	    }
	
	
	    public void f()
	    {
	        if ((this.r) && (this.n != null)) {
	            int v0_5;
	            if (this.n.a.get() != null) {
	                v0_5 = 0;
	            } else {
	                v0_5 = 1;
	            }
	            if (v0_5 == 0) {
	                return;
	            }
	        }
	        throw new IllegalStateException("Not connected to a device");
	    }
	
