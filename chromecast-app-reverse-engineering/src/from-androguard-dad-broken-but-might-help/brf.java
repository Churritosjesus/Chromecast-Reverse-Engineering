	final brh a
	private bqg b
	private final bsb c
	private bqr e
	
	    protected brf(brb p3)
	    {
	        this(p3);
	        this.e = new bqr(p3.c);
	        this.a = new brh(this);
	        this.c = new brg(this, p3);
	        return;
	    }
	
	
	    static synthetic void a(brf p1)
	    {
	        brb.i();
	        if (p1.b()) {
	            p1.b("Inactivity, disconnecting from device AnalyticsService");
	            p1.d();
	        }
	        return;
	    }
	
	
	    static synthetic void a(brf p1, android.content.ComponentName p2)
	    {
	        brb.i();
	        if (p1.b != null) {
	            p1.b = 0;
	            p1.a("Disconnected from device AnalyticsService", p2);
	            p1.f();
	        }
	        return;
	    }
	
	
	    static synthetic void a(brf p1, bqg p2)
	    {
	        brb.i();
	        p1.b = p2;
	        p1.e().d.c().d();
	        return;
	    }
	
	
	    private void e()
	    {
	        this.e.a();
	        this.c.a(((Long) bqd.A.a()).longValue());
	        return;
	    }
	
	
	    private void f()
	    {
	        this.d.c().c();
	        return;
	    }
	
	
	    protected final void a()
	    {
	        return;
	    }
	
	
	    public final boolean a(bsi p8)
	    {
	        int v0_1;
	        a.c(p8);
	        brb.i();
	        this.r();
	        int v0_0 = this.b;
	        if (v0_0 != 0) {
	            String v4;
	            if (!p8.f) {
	                v4 = brz.i();
	            } else {
	                v4 = brz.h();
	            }
	            try {
	                v0_0.a(p8.a, p8.d, v4, java.util.Collections.emptyList());
	                this.e();
	                v0_1 = 1;
	            } catch (int v0) {
	                this.b("Failed to send hits to AnalyticsService");
	                v0_1 = 0;
	            }
	        } else {
	            v0_1 = 0;
	        }
	        return v0_1;
	    }
	
	
	    public final boolean b()
	    {
	        int v0_1;
	        brb.i();
	        this.r();
	        if (this.b == null) {
	            v0_1 = 0;
	        } else {
	            v0_1 = 1;
	        }
	        return v0_1;
	    }
	
	
	    public final boolean c()
	    {
	        int v0 = 1;
	        brb.i();
	        this.r();
	        if (this.b == null) {
	            bqg v1_2 = this.a.a();
	            if (v1_2 == null) {
	                v0 = 0;
	            } else {
	                this.b = v1_2;
	                this.e();
	            }
	        }
	        return v0;
	    }
	
	
	    public final void d()
	    {
	        brb.i();
	        this.r();
	        try {
	            bzw.a().a(this.l(), this.a);
	        } catch (bqu v0) {
	        } catch (bqu v0) {
	        }
	        if (this.b != null) {
	            this.b = 0;
	            this.d.c().c();
	        }
	        return;
	    }
	
