	private  Z
	private blp a
	private alm aa
	private tz b
	private ua c
	private  d
	
	    public aqu()
	    {
	        return;
	    }
	
	
	    static synthetic long a(aqu p2)
	    {
	        return p2.d;
	    }
	
	
	    static synthetic blp b(aqu p1)
	    {
	        return p1.a;
	    }
	
	
	    static synthetic alm c(aqu p1)
	    {
	        return p1.aa;
	    }
	
	
	    private void p()
	    {
	        this.Z = 0;
	        if ((this.b != null) && (this.c != null)) {
	            int v0_2 = aqi.a();
	            if (v0_2.a) {
	                v0_2.a = 0;
	            }
	            this.b.a(this.c);
	            this.c = 0;
	        }
	        return;
	    }
	
	
	    public final void a(android.os.Bundle p3)
	    {
	        super.a(p3);
	        this.a = new blp("BackdropDeviceScanner");
	        this.c(1);
	        this.b = tz.a(this.y);
	        this.aa = com.google.android.apps.chromecast.app.SetupApplication.a().b();
	        return;
	    }
	
	
	    public final void g_()
	    {
	        super.g_();
	        return;
	    }
	
	
	    public final void j()
	    {
	        super.j();
	        if (!this.Z) {
	            this.Z = 1;
	            tx v0_4 = new ty().a("com.google.android.gms.cast.CATEGORY_CAST").a();
	            this.c = new aqv(this);
	            tz v1_3 = aqi.a();
	            if (!v1_3.a) {
	                v1_3.a = 1;
	            }
	            this.d = android.os.SystemClock.elapsedRealtime();
	            this.b.a(v0_4, this.c, 1);
	        }
	        return;
	    }
	
	
	    public final void k()
	    {
	        super.k();
	        if (android.os.Build$VERSION.SDK_INT < 11) {
	            if (this.y.isFinishing()) {
	                this.p();
	            }
	        } else {
	            if (!this.y.isChangingConfigurations()) {
	                this.p();
	            }
	        }
	        return;
	    }
	
