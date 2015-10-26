	private static brb i
	final android.content.Context a
	final android.content.Context b
	public final cac c
	final brz d
	final bql e
	final bse f
	final bqp g
	public final bsd h
	private final cox j
	private final bqu k
	private final bqt l
	private final bpo m
	private final brt n
	private final bqf o
	private final brm p
	
	    private brb(brd p8)
	    {
	        brn v0_0 = p8.a;
	        a.f(v0_0, "Application context can\'t be null");
	        a.b((v0_0 instanceof android.app.Application), "getApplicationContext didn\'t return the application");
	        bqu v1_2 = p8.b;
	        a.c(v1_2);
	        this.a = v0_0;
	        this.b = v1_2;
	        this.c = cad.c();
	        this.d = brd.b(this);
	        bqu v1_6 = new bql(this);
	        v1_6.s();
	        this.e = v1_6;
	        if (!byk.a) {
	            this.a().d(new StringBuilder("Google Analytics 4.5.0/").append(7327).append(" is starting up. To enable debug logging on a device run:\n").append("  adb shell setprop log.tag.GAv4 DEBUG\n  adb logcat -s GAv4").toString());
	        } else {
	            this.a().d(new StringBuilder("Google Analytics 4.5.0/").append(7327).append(" is starting up.").toString());
	        }
	        bqu v1_10 = brd.f(this);
	        v1_10.s();
	        this.g = v1_10;
	        bqu v1_12 = new bqt(this);
	        v1_12.s();
	        this.l = v1_12;
	        bqu v1_14 = new bqu(this, p8);
	        int v2_12 = brd.a(this);
	        bpr v3_6 = new bqf(this);
	        int v4_2 = new brm(this);
	        bsd v5_1 = new bsd(this);
	        brn v0_1 = cox.a(v0_0);
	        v0_1.c = new brc(this);
	        this.j = v0_1;
	        brn v0_3 = new bpo(this);
	        v2_12.s();
	        this.n = v2_12;
	        v3_6.s();
	        this.o = v3_6;
	        v4_2.s();
	        this.p = v4_2;
	        v5_1.s();
	        this.h = v5_1;
	        int v2_13 = brd.e(this);
	        v2_13.s();
	        this.f = v2_13;
	        v1_14.s();
	        this.k = v1_14;
	        if (byk.a) {
	            this.a().b("Device AnalyticsService version", this.c().b);
	        }
	        int v2_17 = v0_3.a.e();
	        if (v2_17.d()) {
	            bqk.a().a(v2_17.e());
	        }
	        if (v2_17.h()) {
	            v0_3.d = v2_17.i();
	        }
	        if (v2_17.d()) {
	            bpr v3_13 = bqk.a();
	            if (v3_13 != null) {
	                v3_13.a(v2_17.e());
	            }
	        }
	        v0_3.c = 1;
	        this.m = v0_3;
	        v1_14.a.b();
	        return;
	    }
	
	
	    public static brb a(android.content.Context p8)
	    {
	        a.c(p8);
	        if (brb.i == null) {
	            if (brb.i == null) {
	                bql v0_2 = cad.c();
	                Long v2_0 = v0_2.b();
	                String v4_2 = new brb(new brd(p8.getApplicationContext()));
	                brb.i = v4_2;
	                bpo.b();
	                Long v2_1 = (v0_2.b() - v2_0);
	                long v6_1 = ((Long) bqd.E.a()).longValue();
	                if (v2_1 > v6_1) {
	                    v4_2.a().c("Slow initialization (ms)", Long.valueOf(v2_1), Long.valueOf(v6_1));
	                }
	            }
	        }
	        return brb.i;
	    }
	
	
	    static void a(bra p2)
	    {
	        a.f(p2, "Analytics service not created/initialized");
	        a.b(p2.q(), "Analytics service not initialized");
	        return;
	    }
	
	
	    public static void i()
	    {
	        cox.b();
	        return;
	    }
	
	
	    public final bql a()
	    {
	        brb.a(this.e);
	        return this.e;
	    }
	
	
	    public final cox b()
	    {
	        a.c(this.j);
	        return this.j;
	    }
	
	
	    public final bqu c()
	    {
	        brb.a(this.k);
	        return this.k;
	    }
	
	
	    public final bpo d()
	    {
	        bpo v0_3;
	        a.c(this.m);
	        if (!this.m.c) {
	            v0_3 = 0;
	        } else {
	            v0_3 = 1;
	        }
	        a.b(v0_3, "Analytics instance not initialized");
	        return this.m;
	    }
	
	
	    public final bqt e()
	    {
	        brb.a(this.l);
	        return this.l;
	    }
	
	
	    public final bqf f()
	    {
	        brb.a(this.o);
	        return this.o;
	    }
	
	
	    public final brt g()
	    {
	        brb.a(this.n);
	        return this.n;
	    }
	
	
	    public final brm h()
	    {
	        brb.a(this.p);
	        return this.p;
	    }
	
