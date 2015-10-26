	private final blp Z
	public azf a
	private bae aa
	private ayf ab
	private ayq ac
	private  ad
	private final alm ae
	private apd af
	private android.os.Handler ag
	private  ah
	private  ai
	private  aj
	private final java.lang.Runnable ak
	private final java.lang.Runnable al
	public  b
	public  c
	public  d
	
	    public ayz()
	    {
	        this.Z = new blp("SetupDeviceScanner");
	        this.ad = 0;
	        this.ak = new aza(this);
	        this.al = new azb(this);
	        this.ae = com.google.android.apps.chromecast.app.SetupApplication.a().b();
	        return;
	    }
	
	
	    static synthetic int a(ayz p0, int p1)
	    {
	        p0.ad = p1;
	        return p1;
	    }
	
	
	    static synthetic void a(ayz p4, aym p5, int p6)
	    {
	        bdq v0_1 = new bdq(p5.b, 8366, 0);
	        aze v2_2 = new bfd[1];
	        v2_2[0] = v0_1;
	        bfe v1_2 = new bfe(v2_2);
	        v1_2.a = new aze(p4, v0_1, p6, p5);
	        v1_2.a();
	        return;
	    }
	
	
	    static synthetic void a(ayz p6, String p7, String p8)
	    {
	        ape.a().a(7, Integer.valueOf(1), Long.valueOf(p6.d));
	        Object[] v1_1 = p6.ae;
	        try {
	            if (!v1_1.i.contains(p8)) {
	                try {
	                    boolean v0_3 = v1_1.d(p8);
	                } catch (boolean v0_6) {
	                    throw v0_6;
	                }
	                if (!v0_3) {
	                    v0_3 = v1_1.a(0);
	                }
	                v0_3.a(p7, p8);
	                Object[] v1_3 = new Object[1];
	                v1_3[0] = v0_3.g();
	            } else {
	                int v3_2 = v1_1.h.iterator();
	                while (v3_2.hasNext()) {
	                    boolean v0_12 = ((aow) v3_2.next());
	                    if ((v0_12.m() != null) && (v0_12.m().equals(p8))) {
	                    }
	                }
	                boolean v0_10 = new aow(v1_1.a);
	                v1_1.d(v0_10);
	                v0_10.a(p7, p8);
	            }
	        } catch (boolean v0_15) {
	            throw v0_15;
	        }
	        return;
	    }
	
	
	    static synthetic boolean a(ayz p1)
	    {
	        return p1.aj;
	    }
	
	
	    static synthetic void b(ayz p1)
	    {
	        void v1_1 = p1.q();
	        if (v1_1.a != null) {
	            v1_1.a.r();
	        }
	        return;
	    }
	
	
	    static synthetic blp c(ayz p1)
	    {
	        return p1.Z;
	    }
	
	
	    static synthetic alm d(ayz p1)
	    {
	        return p1.ae;
	    }
	
	
	    private declared_synchronized void q()
	    {
	        try {
	            if (this.ac != null) {
	                alm v0_2 = this.ac.d();
	                if (v0_2.size() > 0) {
	                    java.util.HashSet v1_2 = new java.util.HashSet(v0_2.size());
	                    java.util.Iterator v2_1 = v0_2.iterator();
	                    while (v2_1.hasNext()) {
	                        v1_2.add(((aym) v2_1.next()).b);
	                    }
	                    this.ae.a(v1_2);
	                }
	            }
	        } catch (alm v0_9) {
	            throw v0_9;
	        }
	        if ((this.ae.f()) && (this.a != null)) {
	            this.a.s();
	        }
	        return;
	    }
	
	
	    public final void a()
	    {
	        super.a();
	        this.aa.b = 0;
	        this.aa = 0;
	        if (this.ab != null) {
	            this.ab.a = 0;
	            this.ab = 0;
	        }
	        return;
	    }
	
	
	    public final void a(android.app.Activity p3)
	    {
	        super.a(p3);
	        bae v0_1 = new bae(this.y);
	        v0_1.b = new azc(this);
	        this.aa = v0_1;
	        blx.a();
	        return;
	    }
	
	
	    public final void a(android.os.Bundle p3)
	    {
	        super.a(p3);
	        this.c(1);
	        this.ag = new android.os.Handler();
	        this.ai = ((long) this.e().getInteger(a.fc));
	        this.ah = ((long) this.e().getInteger(a.fb));
	        return;
	    }
	
	
	    public final void a(boolean p5)
	    {
	        if ((this.aj) && (this.aa != null)) {
	            this.aj = 0;
	            this.ag.removeCallbacks(this.ak);
	            this.ag.removeCallbacks(this.al);
	            if (p5) {
	                this.c = 1;
	            }
	            this.ac.c();
	            this.ac.e();
	            azf v0_7 = this.aa;
	            try {
	                v0_7.a.unregisterReceiver(v0_7.d);
	            } catch (azf v0) {
	            }
	            blx.a();
	            this.q();
	            if (com.google.android.apps.chromecast.app.SetupApplication.a().h) {
	                if (p5) {
	                    this.af.a(1);
	                } else {
	                    if (!this.ae.a()) {
	                        this.af.a(3);
	                    } else {
	                        this.af.a(2);
	                    }
	                }
	                this.af.a(((long) this.ae.b()));
	                ape.a().a(this.af);
	            }
	            if (p5) {
	                if (this.a != null) {
	                    this.a.p();
	                }
	                this.p();
	            }
	        }
	        return;
	    }
	
	
	    public final void j()
	    {
	        super.j();
	        this.p();
	        return;
	    }
	
	
	    public final void k()
	    {
	        super.k();
	        this.a(0);
	        return;
	    }
	
	
	    public void p()
	    {
	        if ((this.b) && ((!this.aj) && (this.aa != null))) {
	            this.af = new apd(6, Integer.valueOf(1));
	            this.aj = 1;
	            this.d = android.os.SystemClock.elapsedRealtime();
	            android.os.Handler v0_6 = this.aa;
	            v0_6.a.registerReceiver(v0_6.d, new android.content.IntentFilter("android.net.wifi.SCAN_RESULTS"));
	            if (!v0_6.c.startScan()) {
	                android.util.Log.w("WifiScanner", "Could not start scan");
	                v0_6.a.unregisterReceiver(v0_6.d);
	            }
	            if (this.ab != null) {
	                this.ab.a();
	            }
	            if (this.ac == null) {
	                this.ad = 0;
	                android.os.Handler v0_13 = new ayq(this.y);
	                v0_13.a(new ayy(new azd(this)));
	                this.ac = v0_13;
	            }
	            if (this.ad != 1) {
	                this.ac.b();
	            }
	            this.ag.postDelayed(this.al, this.ai);
	            this.ag.postDelayed(this.ak, this.ah);
	        }
	        return;
	    }
	
