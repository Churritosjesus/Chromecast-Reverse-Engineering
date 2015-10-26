	private  Z
	private blp a
	private aqd aa
	private android.os.Handler ab
	private apd ac
	private  ad
	private java.lang.String ae
	private aqc b
	private android.content.Context c
	private java.lang.String d
	
	    public apu()
	    {
	        return;
	    }
	
	
	    public static apu a(String p3, boolean p4)
	    {
	        apu v0_1 = new apu();
	        android.os.Bundle v1_1 = new android.os.Bundle();
	        v1_1.putString("ipAddress", p3);
	        v1_1.putBoolean("optInDeviceId", p4);
	        v0_1.f(v1_1);
	        return v0_1;
	    }
	
	
	    static synthetic void a(apu p0)
	    {
	        p0.p();
	        return;
	    }
	
	
	    static synthetic void a(apu p1, String p2)
	    {
	        p1.a(0);
	        return;
	    }
	
	
	    private void a(String p2)
	    {
	        if (this.b != null) {
	            this.b.b(p2);
	        }
	        return;
	    }
	
	
	    static synthetic boolean a(apu p1, boolean p2)
	    {
	        p1.ad = 0;
	        return 0;
	    }
	
	
	    static synthetic void b(apu p3)
	    {
	        if (!p3.aa.h.a("urn:x-cast:offers", new aqa(p3))) {
	            p3.q();
	        }
	        return;
	    }
	
	
	    static synthetic void b(apu p5, String p6)
	    {
	        aqc v0_1 = blf.e(p5.c);
	        if (!android.text.TextUtils.isEmpty(p6)) {
	            int v1_1 = String.valueOf(v0_1);
	            aqc v0_2 = String.valueOf(p6);
	            if (v0_2.length() == 0) {
	                v0_1 = new String(v1_1);
	            } else {
	                v0_1 = v1_1.concat(v0_2);
	            }
	        }
	        if (!android.webkit.URLUtil.isValidUrl(v0_1)) {
	            p5.q();
	        } else {
	            p5.c.startActivity(new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(v0_1)));
	            p5.ac.a(1);
	            ape.a().a(p5.ac);
	            aqc v0_7 = new Object[1];
	            v0_7[0] = Long.valueOf(p5.ac.c.longValue());
	            p5.b.b(0);
	        }
	        return;
	    }
	
	
	    static synthetic void c(apu p0)
	    {
	        p0.q();
	        return;
	    }
	
	
	    static synthetic aqd d(apu p1)
	    {
	        return p1.aa;
	    }
	
	
	    static synthetic blp e(apu p1)
	    {
	        return p1.a;
	    }
	
	
	    private void p()
	    {
	        this.ac = new apd(63);
	        this.ad = 1;
	        this.r();
	        apz v1_1 = this.aa;
	        v1_1.e = new apy(this);
	        v1_1.i = 0;
	        v1_1.j = 0;
	        v1_1.f = tz.a(v1_1.b);
	        long v2_1 = tz.b().iterator();
	        while (v2_1.hasNext()) {
	            boolean v0_8 = ((ug) v2_1.next());
	            if (v0_8.b().getClassName().equals("com.google.android.gms.cast.media.CastMediaRouteProviderService")) {
	            }
	            if (!v0_8) {
	                boolean v0_15 = new ty().a(a.c(v1_1.c)).a();
	                v1_1.g = new aqe(v1_1, 1);
	                v1_1.f.a(v0_15, v1_1.g, 1);
	            } else {
	                tz.f();
	                long v2_2 = v0_8.b.iterator();
	                while (v2_2.hasNext()) {
	                    if (v1_1.a(((uh) v2_2.next()), v1_1.d, 1)) {
	                    }
	                }
	            }
	            this.ab.postDelayed(new apz(this), 20000);
	            return;
	        }
	        v0_8 = 0;
	    }
	
	
	    private void q()
	    {
	        this.ad = 0;
	        this.aa.a(0);
	        this.ac.a(0);
	        ape.a().a(this.ac);
	        if (this.b != null) {
	            this.ae = this.c.getString(b.cg);
	            this.b.b(this.ae);
	        }
	        return;
	    }
	
	
	    private void r()
	    {
	        this.b.a(this.c.getString(b.cT), new aqb(this));
	        return;
	    }
	
	
	    public final void a()
	    {
	        super.a();
	        this.b = 0;
	        this.c = 0;
	        return;
	    }
	
	
	    public final void a(android.app.Activity p2)
	    {
	        super.a(p2);
	        this.b = ((aqc) p2);
	        this.c = p2;
	        return;
	    }
	
	
	    public final void a(android.os.Bundle p7)
	    {
	        super.a(p7);
	        this.d = this.m.getString("ipAddress");
	        this.Z = this.m.getBoolean("optInDeviceId");
	        this.c(1);
	        this.ab = new android.os.Handler();
	        this.a = new blp("OffersChecker");
	        this.aa = new aqd(this.c, blf.d(this.c), this.d, this.a);
	        if (!this.Z) {
	            new android.app.AlertDialog$Builder(this.c).setMessage(b.da).setPositiveButton(b.cZ, new apx(this)).setNegativeButton(b.cY, new apw(this)).setCancelable(1).setOnCancelListener(new apv(this)).show();
	        } else {
	            this.p();
	        }
	        return;
	    }
	
	
	    public final void h_()
	    {
	        super.h_();
	        if (this.aa != null) {
	            this.aa.a(0);
	        }
	        return;
	    }
	
	
	    public final void j()
	    {
	        super.j();
	        if (!this.ad) {
	            if (this.ae != null) {
	                this.a(this.ae);
	            }
	        } else {
	            this.r();
	        }
	        return;
	    }
	
