	final cac a
	final ctt f
	final android.os.Looper g
	final  h
	final android.content.Context i
	final cuq j
	final java.lang.String k
	 ctv l
	bridge ctn m
	bridge  n
	 cjd o
	  p
	 ctu q
	 ctq r
	private clw s
	
	    private cto(android.content.Context p2, cuq p3, android.os.Looper p4, String p5, int p6, ctv p7, ctu p8, clw p9, cac p10, cwq p11)
	    {
	        String v0_0;
	        if (p4 != null) {
	            v0_0 = p4;
	        } else {
	            v0_0 = android.os.Looper.getMainLooper();
	        }
	        this(v0_0);
	        this.i = p2;
	        this.j = p3;
	        if (p4 == null) {
	            p4 = android.os.Looper.getMainLooper();
	        }
	        this.g = p4;
	        this.k = p5;
	        this.h = p6;
	        this.l = p7;
	        this.q = p8;
	        this.s = p9;
	        this.f = new ctt(this);
	        this.o = new cjd();
	        this.a = p10;
	        if (this.e()) {
	            this.a(cuk.a().c);
	        }
	        return;
	    }
	
	
	    public cto(android.content.Context p15, cuq p16, android.os.Looper p17, String p18, int p19, czb p20)
	    {
	        this(p15, p16, p17, p18, p19, new ctv(p15, p18), new cxa(p15, p18, p20), new clw(p15), cad.c(), new cvz(30, 900000, 5000, "refreshing", cad.c()));
	        return;
	    }
	
	
	    private declared_synchronized void a(cjd p9, long p10, boolean p12)
	    {
	        try {
	            if (p12) {
	            }
	        } catch (ctn v0_7) {
	            throw v0_7;
	        }
	        if (this.a()) {
	        }
	        this.o = p9;
	        this.p = p10;
	        this.a(Math.max(0, Math.min(43200000, ((this.p + 43200000) - this.a.a()))));
	        ctn v0_4 = new ctk(this.i, this.j.a, this.k, p10, p9);
	        if (this.m != null) {
	            this.m.a(v0_4);
	        } else {
	            this.m = new ctn(this.j, this.g, v0_4, this.f);
	        }
	        if ((!this.a()) && (this.r.a(v0_4))) {
	            this.a(this.m);
	        }
	        return;
	    }
	
	
	    static synthetic void a(cto p0, cjd p1, long p2, boolean p4)
	    {
	        p0.a(p1, p2, p4);
	        return;
	    }
	
	
	    private declared_synchronized void a(String p2)
	    {
	        try {
	            if (this.q != null) {
	                this.q.a(p2);
	            }
	        } catch (ctu v0_2) {
	            throw v0_2;
	        }
	        return;
	    }
	
	
	    protected final synthetic bwm a(com.google.android.gms.common.api.Status p2)
	    {
	        return this.b(p2);
	    }
	
	
	    declared_synchronized void a(long p4)
	    {
	        try {
	            if (this.q != null) {
	                this.q.a(p4, this.o.c);
	            } else {
	                cuh.b("Refresh requested, but no network load scheduler.");
	            }
	        } catch (ctu v0_3) {
	            throw v0_3;
	        }
	        return;
	    }
	
	
	    declared_synchronized void a(cjd p5)
	    {
	        try {
	            if (this.l != null) {
	                clv v0_2 = new clv();
	                v0_2.a = this.p;
	                v0_2.b = new ciz();
	                v0_2.c = p5;
	                this.l.a(v0_2);
	            }
	        } catch (clv v0_3) {
	            throw v0_3;
	        }
	        return;
	    }
	
	
	    protected final ctn b(com.google.android.gms.common.api.Status p2)
	    {
	        ctn v0_4;
	        if (this.m == null) {
	            if (p2 == com.google.android.gms.common.api.Status.c) {
	                cuh.a("timer expired: setting result to failure");
	            }
	            v0_4 = new ctn(p2);
	        } else {
	            v0_4 = this.m;
	        }
	        return v0_4;
	    }
	
	
	    boolean e()
	    {
	        int v0_3;
	        int v0_0 = cuk.a();
	        if (((v0_0.a != cul.b) && (v0_0.a != cul.c)) || (!this.k.equals(v0_0.b))) {
	            v0_3 = 0;
	        } else {
	            v0_3 = 1;
	        }
	        return v0_3;
	    }
	
