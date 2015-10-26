	final brn a
	final java.lang.String b
	
	    public bqu(brb p2, brd p3)
	    {
	        this(p2);
	        a.c(p3);
	        this.a = p3.c(p2);
	        this.b = this.f();
	        return;
	    }
	
	
	    private String f()
	    {
	        String v0_8;
	        if (byk.a) {
	            try {
	                String v0_6 = String.valueOf(this.d.a.getPackageManager().getPackageInfo(this.d.a.getPackageName(), 0).versionCode);
	            } catch (String v0_7) {
	                this.e("Failed to get service version", v0_7);
	                v0_8 = "0";
	            }
	            if (v0_6.length() > 4) {
	                v0_6 = v0_6.substring(0, 4);
	            }
	            v0_8 = new StringBuilder("4.5.0-").append(v0_6).toString();
	        } else {
	            v0_8 = "";
	        }
	        return v0_8;
	    }
	
	
	    public final long a(bre p5)
	    {
	        this.r();
	        a.c(p5);
	        brb.i();
	        long v0_1 = this.a.a(p5, 1);
	        if (v0_1 == 0) {
	            this.a.a(p5);
	        }
	        return v0_1;
	    }
	
	
	    protected final void a()
	    {
	        this.a.s();
	        return;
	    }
	
	
	    public final void a(bsf p3)
	    {
	        this.r();
	        this.d.b().a(new bqy(this, p3));
	        return;
	    }
	
	
	    public final void a(bsi p3)
	    {
	        a.c(p3);
	        this.r();
	        this.b("Hit delivery requested", p3);
	        this.d.b().a(new bqx(this, p3));
	        return;
	    }
	
	
	    public final void a(String p3, Runnable p4)
	    {
	        a.a(p3, "campaign param can\'t be empty");
	        this.d.b().a(new bqw(this, p3, p4));
	        return;
	    }
	
	
	    public final void a(boolean p3)
	    {
	        this.a("Network connectivity status changed", Boolean.valueOf(p3));
	        this.d.b().a(new bqv(this, p3));
	        return;
	    }
	
	
	    public final void b()
	    {
	        this.r();
	        int v0_1 = this.d.a;
	        if ((!bpe.a(v0_1)) || (!bpf.a(v0_1))) {
	            this.a(0);
	        } else {
	            android.content.Intent v1_3 = new android.content.Intent(v0_1, bpf);
	            v1_3.setAction("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
	            v0_1.startService(v1_3);
	        }
	        return;
	    }
	
	
	    public final void c()
	    {
	        this.r();
	        cox.b();
	        this.a.f();
	        return;
	    }
	
	
	    final void d()
	    {
	        brb.i();
	        this.a.e();
	        return;
	    }
	
	
	    final void e()
	    {
	        brb.i();
	        this.a.d();
	        return;
	    }
	
