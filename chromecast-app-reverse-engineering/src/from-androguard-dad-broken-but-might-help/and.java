	private  A
	private  B
	private  C
	private  D
	private  E
	private  F
	private azg G
	private bfs H
	private bfs I
	private bdm J
	private aop K
	private  L
	private  M
	private  N
	private final  O
	private  e
	private  f
	private android.widget.TextView g
	public java.lang.String h
	public bdf i
	public java.lang.String j
	public java.lang.String k
	public  l
	public bdj m
	public bfs n
	public java.lang.String o
	public bdu p
	public java.lang.String q
	public java.util.ArrayList r
	public android.widget.ViewFlipper s
	public blp t
	public  u
	private android.content.DialogInterface$OnCancelListener v
	private android.content.DialogInterface$OnCancelListener w
	private android.os.Handler x
	private java.lang.Runnable y
	private azv z
	
	    public and(String p3, boolean p4)
	    {
	        this.e = -1;
	        this.f = 0;
	        this.w = new ane(this);
	        this.t = new blp(p3, 0);
	        this.O = p4;
	        return;
	    }
	
	
	    static synthetic long a(and p1, long p2)
	    {
	        p1.M = p2;
	        return p2;
	    }
	
	
	    private android.app.AlertDialog$Builder a(String p3, boolean p4, aoo p5)
	    {
	        int v0_5;
	        if (!this.isFinishing()) {
	            v0_5 = new android.app.AlertDialog$Builder(this).setMessage(p3).setCancelable(1).setOnCancelListener(new aoe(this, p4, p5));
	        } else {
	            if (p5 != null) {
	                if (p4) {
	                    this.y();
	                }
	                p5.b();
	            }
	            v0_5 = 0;
	        }
	        return v0_5;
	    }
	
	
	    static synthetic bdf a(and p1)
	    {
	        return p1.i;
	    }
	
	
	    static synthetic bdf a(and p0, bdf p1)
	    {
	        p0.i = p1;
	        return p1;
	    }
	
	
	    static synthetic java.util.ArrayList a(and p0, java.util.ArrayList p1)
	    {
	        p0.r = p1;
	        return p1;
	    }
	
	
	    static synthetic void a(and p6, bdf p7, long p8, apd p10)
	    {
	        android.os.Handler v0_0 = p7.G;
	        if (v0_0 != null) {
	            Runnable v1_0 = new Object[1];
	            v1_0[0] = v0_0.name();
	        } else {
	            v0_0 = bdj.a;
	        }
	        switch (aoh.a[v0_0.ordinal()]) {
	            case 1:
	            case 2:
	            case 3:
	            case 4:
	            case 5:
	            case 6:
	                ape.a().a(p10.a(v0_0.r));
	                p6.b(p7.u);
	                break;
	            case 7:
	            case 8:
	                ape.a().a(p10.a(v0_0.r));
	                long v2_16 = new Object[2];
	                v2_16[0] = p6.D();
	                v2_16[1] = p6.H.a;
	                Runnable v1_14 = p6.getString(b.aN, v2_16);
	                Object[] v3_16 = new Object[1];
	                v3_16[0] = Integer.valueOf(v0_0.r);
	                p6.a(v1_14, p6.getString(b.aX, v3_16));
	                break;
	            case 9:
	                ape.a().a(p10.a(v0_0.r));
	                long v2_12 = new Object[2];
	                v2_12[0] = p6.D();
	                v2_12[1] = p6.H.a;
	                Runnable v1_11 = p6.getString(b.aL, v2_12);
	                Object[] v3_12 = new Object[1];
	                v3_12[0] = Integer.valueOf(v0_0.r);
	                p6.a(v1_11, p6.getString(b.aX, v3_12));
	                break;
	            case 10:
	                ape.a().a(p10.a(v0_0.r));
	                long v2_8 = new Object[2];
	                v2_8[0] = p6.D();
	                v2_8[1] = p6.H.a;
	                Runnable v1_8 = p6.getString(b.aM, v2_8);
	                Object[] v3_8 = new Object[1];
	                v3_8[0] = Integer.valueOf(v0_0.r);
	                p6.a(v1_8, p6.getString(b.aX, v3_8));
	                break;
	            case 11:
	                ape.a().a(p10.a(v0_0.r));
	                long v2_4 = new Object[2];
	                v2_4[0] = p6.D();
	                v2_4[1] = p6.H.a;
	                Runnable v1_5 = p6.getString(b.aK, v2_4);
	                Object[] v3_4 = new Object[1];
	                v3_4[0] = Integer.valueOf(v0_0.r);
	                p6.a(v1_5, p6.getString(b.aX, v3_4));
	                break;
	            default:
	                if (android.os.SystemClock.elapsedRealtime() < p8) {
	                    p6.m = v0_0;
	                    p6.x.postDelayed(p6.y, ((long) p6.D));
	                } else {
	                    ape.a().a(p10.a(0));
	                    p6.a(p6.getString(b.aB), p6.getString(b.aY));
	                }
	        }
	        return;
	    }
	
	
	    static synthetic void a(and p9, bdj p10, bdf p11)
	    {
	        bdu v0_1 = com.google.android.apps.chromecast.app.SetupApplication.a().b();
	        String v1_1 = v0_1.c(p9.h);
	        if (v1_1 != null) {
	            if (p11 == null) {
	                if (v1_1.q()) {
	                    v0_1.a(v1_1);
	                }
	            } else {
	                v1_1.a(p11);
	                v1_1.p();
	                v0_1.b(v1_1);
	            }
	        }
	        bdu v0_4;
	        String v1_2 = android.preference.PreferenceManager.getDefaultSharedPreferences(p9);
	        if (!p9.i.h) {
	            v0_4 = "hendrixDiscovered";
	        } else {
	            v0_4 = "nonhendrixDiscovered";
	        }
	        v1_2.edit().putBoolean(v0_4, 1).apply();
	        if (p10 == null) {
	            bdu v0_6 = p9.p;
	            anx v7_1 = new anx(p9);
	            long v2_1 = v0_6.d();
	            bdq v4_1 = new bdq(v0_6.d, 128, v0_6.c);
	            v4_1.i = 1;
	            v0_6.a("getSetupState", v2_1, v4_1, v0_6.e, new ber(v0_6, v7_1, v4_1));
	        } else {
	            p9.m = p10;
	            bdu v0_7 = new Object[1];
	            v0_7[0] = p10;
	            p9.K.a();
	            p9.y();
	        }
	        return;
	    }
	
	
	    static synthetic void a(and p4, bdm p5, int p6, String p7)
	    {
	        ani v0_4;
	        apd v1_1 = new Object[1];
	        v1_1[0] = p4.D();
	        p4.a(p4.getString(b.aZ, v1_1), p4.w);
	        if (p6 != bfk.b) {
	            if (!p4.O) {
	                v0_4 = 40;
	            } else {
	                v0_4 = 30;
	            }
	        } else {
	            if (!p4.O) {
	                v0_4 = 41;
	            } else {
	                v0_4 = 31;
	            }
	        }
	        apd v1_4 = new apd(v0_4);
	        v1_4.h = p4.A();
	        p4.x();
	        p5.a(p6, new ani(p4, v1_4, p6, p7));
	        return;
	    }
	
	
	    static synthetic void a(and p1, String p2)
	    {
	        p1.b(0);
	        return;
	    }
	
	
	    static synthetic void a(and p0, String p1, int p2, int p3, String p4, boolean p5)
	    {
	        p0.a(p1, p2, p3, p4, p5);
	        return;
	    }
	
	
	    static synthetic void a(and p0, String p1, String p2)
	    {
	        p0.a(p1, p2);
	        return;
	    }
	
	
	    public static void a(android.view.Menu p1, int p2, boolean p3)
	    {
	        android.view.MenuItem v0 = p1.findItem(p2);
	        if (v0 != null) {
	            v0.setVisible(p3);
	            v0.setEnabled(p3);
	        }
	        return;
	    }
	
	
	    private void a(bdf p5)
	    {
	        this.G.a(this.p, this.i, new anv(this, p5));
	        return;
	    }
	
	
	    private void a(bdm p4, int p5, String p6, String p7)
	    {
	        new android.app.AlertDialog$Builder(this).setMessage(p6).setPositiveButton(b.db, new anh(this, p4, p5, p7)).setNegativeButton(b.H, 0).setCancelable(1).show();
	        return;
	    }
	
	
	    private void a(String p6, int p7, int p8, String p9, boolean p10)
	    {
	        android.app.AlertDialog$Builder v0_0 = new Object[1];
	        v0_0[0] = p9;
	        com.google.android.apps.chromecast.app.SetupApplication.a().c(p9);
	        this.w();
	        this.y = 0;
	        android.app.AlertDialog$Builder v0_5 = new android.app.AlertDialog$Builder(this).setTitle(b.aC);
	        android.app.AlertDialog$Builder v1_2 = new String[2];
	        v1_2[0] = this.getString(p7);
	        v1_2[1] = this.getString(p8);
	        android.app.AlertDialog$Builder v0_8 = v0_5.setView(blx.a(this, p6, v1_2)).setCancelable(1).setOnCancelListener(new any(this, p10));
	        if (!p10) {
	            v0_8.setPositiveButton(b.dd, new aob(this)).setNegativeButton(b.dc, new aoa(this));
	        } else {
	            v0_8.setPositiveButton(b.I, new anz(this));
	        }
	        v0_8.show();
	        return;
	    }
	
	
	    private void a(String p7, String p8)
	    {
	        this.a(p7, b.dF, b.dG, p8, 0);
	        return;
	    }
	
	
	    static synthetic boolean a(and p2, aop p3)
	    {
	        int v0_2;
	        if (p2.i.a <= 7) {
	            v0_2 = 1;
	        } else {
	            com.google.android.apps.chromecast.app.SetupApplication.a().c("App needs to be updated");
	            p2.w();
	            blx.a(p2, new aok(p2, p3));
	            v0_2 = 0;
	        }
	        return v0_2;
	    }
	
	
	    static synthetic boolean a(and p1, ayq p2)
	    {
	        p2.b();
	        return 1;
	    }
	
	
	    static synthetic String b(and p1)
	    {
	        return p1.h;
	    }
	
	
	    static synthetic void b(and p10, bdf p11)
	    {
	        ans v0_1;
	        if (!p10.O) {
	            v0_1 = 45;
	        } else {
	            v0_1 = 23;
	        }
	        ans v0_4;
	        apd v2_1 = new apd(v0_1);
	        v2_1.h = p10.A();
	        ant v4_0 = android.os.SystemClock.elapsedRealtime();
	        if (!p10.O) {
	            v0_4 = p10.B;
	        } else {
	            v0_4 = p10.A;
	        }
	        ant v4_1 = (v4_0 + ((long) v0_4));
	        ayq v3_1 = new ayq(p10.getApplicationContext());
	        ans v0_8 = new ans(p10, v2_1, v3_1, v4_1, p11);
	        p10.x.postDelayed(v0_8, ((long) p10.C));
	        v3_1.a(new ayy(new ant(p10, v0_8, v3_1, v2_1, p11)));
	        v3_1.b();
	        return;
	    }
	
	
	    static synthetic void b(and p6, String p7)
	    {
	        if (!android.text.TextUtils.isEmpty(p7)) {
	            android.webkit.WebView v0_3 = ((android.webkit.WebView) p6.getLayoutInflater().inflate(a.gg, 0));
	            v0_3.setWebViewClient(new aog(p6, v0_3));
	            v0_3.loadDataWithBaseURL(0, p7, "text/html", "utf-8", 0);
	        } else {
	            p6.e(p6.getString(b.bI));
	        }
	        return;
	    }
	
	
	    static synthetic void b(and p6, String p7, String p8)
	    {
	        p6.a(p7, b.dF, b.dG, p8, 1);
	        return;
	    }
	
	
	    private void b(String p8)
	    {
	        anp v0_1;
	        if (!this.O) {
	            v0_1 = 44;
	        } else {
	            v0_1 = 22;
	        }
	        ape v2_1 = new apd(v0_1);
	        v2_1.h = this.A();
	        anp v0_4 = new anp(this, v2_1, p8, android.os.SystemClock.elapsedRealtime());
	        if (!this.L) {
	            this.z.a(this.I.a, v0_4, 0);
	        } else {
	            if (this.z.a(this.I) != null) {
	                aph v1_5;
	                ape v2_3 = ape.a();
	                if (!this.O) {
	                    v1_5 = 54;
	                } else {
	                    v1_5 = 29;
	                }
	                apd v3_2 = new apd(v1_5);
	                v3_2.h = this.A();
	                v2_3.a(v3_2);
	            } else {
	                v0_4.a(0);
	            }
	        }
	        return;
	    }
	
	
	    static synthetic void c(and p0, bdf p1)
	    {
	        p0.a(p1);
	        return;
	    }
	
	
	    static synthetic boolean c(and p1)
	    {
	        return p1.O;
	    }
	
	
	    static synthetic java.util.ArrayList d(and p1)
	    {
	        return p1.r;
	    }
	
	
	    static synthetic void d(and p5, bdf p6)
	    {
	        p5.p.a(0, 0, 1, new anu(p5, p6));
	        return;
	    }
	
	
	    static synthetic void e(and p0)
	    {
	        p0.g();
	        return;
	    }
	
	
	    static synthetic void f(and p6)
	    {
	        android.os.Handler v0_1 = (android.os.SystemClock.elapsedRealtime() + ((long) p6.E));
	        p6.M = (android.os.SystemClock.elapsedRealtime() + ((long) p6.F));
	        p6.m = 0;
	        long v2_6 = new apd(21);
	        v2_6.h = p6.A();
	        p6.y = new ann(p6, v2_6, v0_1);
	        p6.x.postDelayed(p6.y, ((long) p6.D));
	        return;
	    }
	
	
	    static synthetic aop g(and p1)
	    {
	        return p1.K;
	    }
	
	
	    private void g()
	    {
	        this.x();
	        if (!this.i.w) {
	            bdm v0_5;
	            apd v1_1 = new Object[1];
	            v1_1[0] = this.H.a;
	            this.a(this.getString(b.bb, v1_1), this.w);
	            if (!this.O) {
	                v0_5 = 42;
	            } else {
	                v0_5 = 19;
	            }
	            bdm v0_9 = new apd(v0_5).a(this.H.b.j);
	            v0_9.h = this.A();
	            if ((!this.L) && (this.e != -1)) {
	                v0_9.a(((long) this.e));
	            }
	            ape.a().a(v0_9);
	            if (this.H.g) {
	                bdm v0_13;
	                apd v1_10 = ape.a();
	                if (!this.O) {
	                    v0_13 = 51;
	                } else {
	                    v0_13 = 28;
	                }
	                bfs v2_4 = new apd(v0_13);
	                v2_4.h = this.A();
	                v1_10.a(v2_4);
	            }
	            bdm v0_16;
	            if (!this.O) {
	                v0_16 = 43;
	            } else {
	                v0_16 = 20;
	            }
	            apd v1_12 = new apd(v0_16);
	            v1_12.h = this.A();
	            this.J.a(this.H, new anm(this, v1_12));
	        } else {
	            this.a(this.getString(b.aT), this.w);
	            this.a(0);
	        }
	        return;
	    }
	
	
	    static synthetic int h(and p1)
	    {
	        return p1.F;
	    }
	
	
	    static synthetic long i(and p2)
	    {
	        return p2.M;
	    }
	
	
	    static synthetic Runnable j(and p1)
	    {
	        return p1.y;
	    }
	
	
	    static synthetic int k(and p1)
	    {
	        return p1.D;
	    }
	
	
	    static synthetic android.os.Handler l(and p1)
	    {
	        return p1.x;
	    }
	
	
	    static synthetic bdm m(and p1)
	    {
	        return p1.J;
	    }
	
	
	    static synthetic bfs n(and p1)
	    {
	        return p1.I;
	    }
	
	
	    static synthetic bdu o(and p1)
	    {
	        return p1.p;
	    }
	
	
	    static synthetic void p(and p5)
	    {
	        p5.p.a(1198, 0, 0, new anq(p5));
	        return;
	    }
	
	
	    static synthetic boolean q(and p1)
	    {
	        return p1.L;
	    }
	
	
	    static synthetic bfs r(and p1)
	    {
	        return p1.H;
	    }
	
	
	    static synthetic int s(and p1)
	    {
	        return p1.C;
	    }
	
	
	    static synthetic azg t(and p1)
	    {
	        return p1.G;
	    }
	
	
	    public aph A()
	    {
	        return 0;
	    }
	
	
	    public final bdb B()
	    {
	        bdb v0_6;
	        Object[] v1_0 = java.util.TimeZone.getDefault();
	        if (this.i.W == null) {
	            bdb v0_5 = new Object[1];
	            v0_5[0] = v1_0.getID();
	            v0_6 = 0;
	        } else {
	            java.util.Iterator v2 = this.i.W.iterator();
	            while (v2.hasNext()) {
	                v0_6 = ((bdb) v2.next());
	                if (v0_6.a.equals(v1_0.getID())) {
	                    Object[] v1_2 = new Object[1];
	                    v1_2[0] = v0_6;
	                }
	            }
	        }
	        return v0_6;
	    }
	
	
	    public final bcz C()
	    {
	        bcz v0_9;
	        Object[] v1_0 = blj.c();
	        java.util.Locale v2 = java.util.Locale.getDefault();
	        if (this.i.X == null) {
	            bcz v0_8 = new Object[1];
	            v0_8[0] = v2.getDisplayName();
	            v0_9 = 0;
	        } else {
	            boolean v3_0 = this.i.X.iterator();
	            while (v3_0.hasNext()) {
	                v0_9 = ((bcz) v3_0.next());
	                if (v0_9.a.equals(v1_0)) {
	                    Object[] v1_4 = new Object[1];
	                    v1_4[0] = v0_9;
	                }
	            }
	            Object[] v1_1 = this.i.X.iterator();
	            while (v1_1.hasNext()) {
	                v0_9 = ((bcz) v1_1.next());
	                if (v0_9.a.equals(v2.getLanguage())) {
	                    Object[] v1_3 = new Object[1];
	                    v1_3[0] = v0_9;
	                }
	            }
	        }
	        return v0_9;
	    }
	
	
	    public final String D()
	    {
	        return this.i.b;
	    }
	
	
	    public final String E()
	    {
	        return blx.a(this, this.i);
	    }
	
	
	    public final bdf F()
	    {
	        return this.i;
	    }
	
	
	    protected final void a(int p8, String p9, apd p10, boolean p11, aoo p12)
	    {
	        if (p8 != -99) {
	            if (p10 != null) {
	                p10.h = this.A();
	                ape.a().a(p10.a(0));
	            }
	            int v1_1;
	            int v0_3 = 0;
	            switch (p8) {
	                case -9:
	                    if (!blr.e(this)) {
	                        v1_1 = b.aO;
	                    } else {
	                        v1_1 = b.aP;
	                        v0_3 = blr.f(this);
	                    }
	                    break;
	                case -8:
	                    v1_1 = b.aO;
	                    break;
	                case -7:
	                case -6:
	                case -5:
	                case -4:
	                case -3:
	                default:
	                    v1_1 = b.bw;
	                    break;
	                case -2:
	                    v1_1 = b.bA;
	                    break;
	                case -1:
	                    v1_1 = b.bv;
	                    break;
	            }
	            this.w();
	            int v2_0 = new Object[1];
	            v2_0[0] = Integer.valueOf(p8);
	            int v1_3 = this.getString(v1_1, v2_0);
	            ank v3_2 = String.valueOf(p9).concat(": %s (%d)");
	            Object[] v4_2 = new Object[2];
	            v4_2[0] = v1_3;
	            v4_2[1] = Integer.valueOf(p8);
	            com.google.android.apps.chromecast.app.SetupApplication.a().c(String.format(java.util.Locale.ROOT, v3_2, v4_2));
	            int v1_4 = this.a(v1_3, p11, p12);
	            if (v1_4 != 0) {
	                int v2_4 = new anj(this, p12, p11);
	                if (v0_3 == 0) {
	                    v1_4.setPositiveButton(b.I, v2_4);
	                } else {
	                    v1_4.setTitle(b.aQ);
	                    v1_4.setNegativeButton(b.H, v2_4);
	                    v1_4.setPositiveButton(b.K, new ank(this, v0_3));
	                }
	                v1_4.show();
	            }
	        }
	        return;
	    }
	
	
	    public final void a(android.os.Bundle p9)
	    {
	        android.widget.ViewFlipper v7 = 0;
	        this.s = ((android.widget.ViewFlipper) this.findViewById(f.ev));
	        this.g = ((android.widget.TextView) this.findViewById(f.dd));
	        if (p9 != null) {
	            this.h = p9.getString("device");
	            this.j = p9.getString("deviceIpAddress");
	            this.i = ((bdf) p9.getParcelable("deviceConfiguration"));
	            this.k = p9.getString("wifiDeviceIp");
	            this.n = ((bfs) p9.getParcelable("androidNetwork"));
	            this.r = p9.getParcelableArrayList("scannedNetworks");
	        }
	        if (this.h == null) {
	            this.h = this.getIntent().getStringExtra("device");
	        }
	        if (this.j == null) {
	            this.j = this.getIntent().getStringExtra("deviceIpAddress");
	        }
	        if (this.i == null) {
	            this.i = ((bdf) this.getIntent().getParcelableExtra("deviceConfiguration"));
	        }
	        if (this.n == null) {
	            this.n = blr.b(this);
	        }
	        if (this.k == null) {
	            this.k = this.j;
	        }
	        if (!this.i.w) {
	            this.e = blr.d(this);
	        }
	        if ((!this.O) || (this.i.w)) {
	            android.widget.ViewFlipper v0_40 = 0;
	        } else {
	            v0_40 = 1;
	        }
	        String v3_2;
	        this.l = v0_40;
	        this.o = this.getIntent().getStringExtra("hotspotSsid");
	        this.z = com.google.android.apps.chromecast.app.SetupApplication.a().l();
	        if (this.n != null) {
	            v3_2 = this.n.a;
	        } else {
	            v3_2 = 0;
	        }
	        int v4_1;
	        if (!this.l) {
	            v4_1 = bew.a;
	        } else {
	            v4_1 = bew.d;
	        }
	        this.p = new bdu(this.k, this.i.a, v3_2, v4_1, this.A());
	        android.widget.ViewFlipper v0_47 = this.getResources();
	        this.A = v0_47.getInteger(a.fd);
	        this.B = v0_47.getInteger(a.fe);
	        this.C = v0_47.getInteger(a.ff);
	        this.x = new android.os.Handler();
	        this.D = v0_47.getInteger(a.fh);
	        this.E = v0_47.getInteger(a.fi);
	        this.F = v0_47.getInteger(a.fg);
	        this.d().a().b(1);
	        if (p9 != null) {
	            android.widget.ViewFlipper v0_52 = p9.getInt("viewIndex", 0);
	            if (v0_52 != 1) {
	                v7 = v0_52;
	            }
	            this.f = v7;
	        }
	        this.s.setDisplayedChild(this.f);
	        return;
	    }
	
	
	    public final void a(aop p7)
	    {
	        String v0_1 = com.google.android.apps.chromecast.app.SetupApplication.a().d();
	        if ((v0_1 == null) || (this.i.U == null)) {
	            this.w();
	            if (!this.isFinishing()) {
	                String v0_7 = new android.app.AlertDialog$Builder(this);
	                Object[] v1_13 = this.getString(b.an);
	                String v2_4 = new String[2];
	                v2_4[0] = this.getString(b.dF);
	                v2_4[1] = this.getString(b.dG);
	                String v0_11 = v0_7.setView(blx.a(this, v1_13, v2_4)).setPositiveButton(b.I, new aom(this)).setCancelable(1).setOnCancelListener(new aol(this));
	                if (com.google.android.apps.chromecast.app.SetupApplication.f()) {
	                    v0_11.setNeutralButton(b.dW, new aon(this, p7));
	                }
	                v0_11.show();
	            }
	        } else {
	            String v0_2 = v0_1.a(this.i.U.a, this.i.V);
	            if (v0_2 == null) {
	            } else {
	                String v0_3 = a.a(this.i, v0_2);
	                if (!android.text.TextUtils.isEmpty(v0_3.c)) {
	                    this.q = v0_3.c;
	                }
	                if (!v0_3.a) {
	                    com.google.android.apps.chromecast.app.SetupApplication.a().c("Could not authenticate device");
	                    Object[] v1_11 = new Object[1];
	                    v1_11[0] = v0_3.b;
	                } else {
	                    p7.a();
	                }
	            }
	        }
	        return;
	    }
	
	
	    public final void a(bdm p5, aop p6, boolean p7, boolean p8)
	    {
	        int v0_1;
	        if (!this.O) {
	            v0_1 = 36;
	        } else {
	            v0_1 = 18;
	        }
	        apd v1_1 = new apd(v0_1);
	        v1_1.h = this.A();
	        int v0_3 = 10222;
	        if (p7) {
	            v0_3 = 14318;
	        }
	        p5.a(v0_3, java.util.Locale.getDefault(), p8, new aoi(this, v1_1, p6));
	        return;
	    }
	
	
	    public final void a(bdm p3, String p4, aop p5)
	    {
	        aoj v0_1;
	        if (!this.O) {
	            v0_1 = 53;
	        } else {
	            v0_1 = 52;
	        }
	        p3.a(this, p4, new aoj(this, new apd(v0_1), p5));
	        return;
	    }
	
	
	    public final void a(bdm p7, java.util.HashMap p8, bfs p9, aop p10)
	    {
	        this.G = new azg(this.h, this.O, this.A());
	        this.G.d = p8;
	        if (this.O) {
	            com.google.android.apps.chromecast.app.SetupApplication.a().g = this.G;
	        }
	        this.J = p7;
	        this.K = p10;
	        this.u = 0;
	        if (p9 == null) {
	            this.g();
	        } else {
	            this.I = p9;
	            this.H = new bfs(p9);
	            if (this.H.b.k) {
	                try {
	                    this.H.e = bfs.a(this.H.e, this.i.r);
	                    this.H.f = 1;
	                } catch (android.app.AlertDialog$Builder v0_14) {
	                    String v3_1 = new Object[0];
	                    this.t.a(v0_14, "Failed to encrypt password", v3_1);
	                    this.e(this.getString(b.bu));
	                    return;
	                }
	            }
	            if (this.n != null) {
	                if (p9.a.equals(this.n.a)) {
	                    this.L = 0;
	                } else {
	                    this.L = 1;
	                    android.app.AlertDialog$Builder v0_22 = new android.app.AlertDialog$Builder(this).setTitle(b.ed);
	                    int v2_3 = new Object[2];
	                    v2_3[0] = this.n.a;
	                    v2_3[1] = p9.a;
	                    v0_22.setMessage(this.getString(b.ec, v2_3)).setPositiveButton(b.I, new anl(this)).setNegativeButton(b.H, 0).setCancelable(1).show();
	                }
	            } else {
	                this.L = 1;
	            }
	        }
	        return;
	    }
	
	
	    public final void a(String p3, android.content.DialogInterface$OnCancelListener p4)
	    {
	        this.g.setText(p3);
	        if (this.s.getDisplayedChild() != 1) {
	            this.s.setDisplayedChild(1);
	        }
	        this.v = p4;
	        this.d().f();
	        return;
	    }
	
	
	    public final void a(java.util.HashMap p5, aop p6, int p7)
	    {
	        int v0_1;
	        if (p7 == -1) {
	            v0_1 = 0;
	        } else {
	            v0_1 = new apd(p7);
	        }
	        this.x();
	        this.p.a(p5, this.i, new ang(this, v0_1, p6));
	        return;
	    }
	
	
	    public final boolean a(android.view.MenuItem p7, bdm p8, String p9)
	    {
	        boolean v0 = 1;
	        java.util.ArrayList v1_0 = p7.getItemId();
	        if (v1_0 != 16908332) {
	            if (v1_0 != f.bR) {
	                if (v1_0 != f.bT) {
	                    if (v1_0 != f.bM) {
	                        if (v1_0 != f.bN) {
	                            if (v1_0 != f.bU) {
	                                if (v1_0 != f.bV) {
	                                    v0 = super.onOptionsItemSelected(p7);
	                                } else {
	                                    bkq.a(this, this);
	                                }
	                            } else {
	                                bkq.a(this, this.b_());
	                            }
	                        } else {
	                            this.startActivity(new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(this.getString(b.cH))));
	                        }
	                    } else {
	                        this.a(this.getString(b.bH), this.w);
	                        this.x();
	                        p8.d(new aof(this));
	                    }
	                } else {
	                    android.net.Uri v3_3 = new Object[1];
	                    v3_3[0] = this.i.b;
	                    this.a(p8, bfk.b, this.getString(b.aF, v3_3), p9);
	                }
	            } else {
	                android.net.Uri v3_4 = new Object[1];
	                v3_4[0] = this.i.b;
	                this.a(p8, bfk.a, this.getString(b.aE, v3_4), p9);
	            }
	        } else {
	            this.finish();
	        }
	        return v0;
	    }
	
	
	    public final boolean a(bfs p4)
	    {
	        int v0 = 0;
	        if (!android.text.TextUtils.isEmpty(p4.a)) {
	            switch (aoh.b[p4.b.ordinal()]) {
	                case 1:
	                    break;
	                case 2:
	                case 3:
	                    if ((!android.text.TextUtils.isEmpty(p4.e)) && (p4.e.length() >= 5)) {
	                    } else {
	                        this.e(this.getString(b.dX));
	                    }
	                    break;
	                case 4:
	                case 5:
	                case 6:
	                case 7:
	                    if ((!android.text.TextUtils.isEmpty(p4.e)) && (p4.e.length() >= 8)) {
	                    } else {
	                        this.e(this.getString(b.ex));
	                    }
	                    break;
	                default:
	                    this.e(this.getString(b.cd));
	            }
	            v0 = 1;
	        } else {
	            this.e(this.getString(b.bL));
	        }
	        return v0;
	    }
	
	
	    public final java.util.ArrayList b_()
	    {
	        java.util.ArrayList v0_1 = new java.util.ArrayList();
	        v0_1.add(new bko(this.i.b, this.i.c, this.j, this.i.F));
	        return v0_1;
	    }
	
	
	    public android.content.Intent e()
	    {
	        return 0;
	    }
	
	
	    public final void e(String p5)
	    {
	        this.w();
	        android.app.AlertDialog$Builder v0_1 = this.a(p5, 0, 0);
	        if (v0_1 != null) {
	            v0_1.setPositiveButton(b.I, new aod(this, 0));
	            v0_1.show();
	        }
	        return;
	    }
	
	
	    public void onBackPressed()
	    {
	        if (this.s.getDisplayedChild() != 1) {
	            super.onBackPressed();
	        } else {
	            if (this.y != null) {
	                this.x.removeCallbacks(this.y);
	            }
	            this.u = 1;
	            this.v();
	            if (this.v == null) {
	                this.w();
	            } else {
	                this.v.onCancel(0);
	            }
	        }
	        return;
	    }
	
	
	    public void onCreate(android.os.Bundle p1)
	    {
	        super.onCreate(p1);
	        return;
	    }
	
	
	    public boolean onKeyDown(int p2, android.view.KeyEvent p3)
	    {
	        boolean v0_1;
	        if (!blx.a(p2)) {
	            v0_1 = super.onKeyDown(p2, p3);
	        } else {
	            v0_1 = 1;
	        }
	        return v0_1;
	    }
	
	
	    public boolean onKeyUp(int p2, android.view.KeyEvent p3)
	    {
	        boolean v0_1;
	        if (!blx.a(p2, this)) {
	            v0_1 = super.onKeyUp(p2, p3);
	        } else {
	            v0_1 = 1;
	        }
	        return v0_1;
	    }
	
	
	    public void onPause()
	    {
	        super.onPause();
	        return;
	    }
	
	
	    public boolean onPrepareOptionsMenu(android.view.Menu p4)
	    {
	        int v0_2;
	        if (this.s.getDisplayedChild() == 1) {
	            v0_2 = 0;
	        } else {
	            v0_2 = 1;
	        }
	        and.a(p4, f.bR, v0_2);
	        and.a(p4, f.bT, v0_2);
	        and.a(p4, f.bM, v0_2);
	        and.a(p4, f.bN, v0_2);
	        and.a(p4, f.bU, bkq.a());
	        return 1;
	    }
	
	
	    public void onSaveInstanceState(android.os.Bundle p3)
	    {
	        super.onSaveInstanceState(p3);
	        p3.putString("device", this.h);
	        p3.putString("deviceIpAddress", this.j);
	        p3.putParcelable("deviceConfiguration", this.i);
	        p3.putString("wifiDeviceIp", this.k);
	        p3.putParcelable("androidNetwork", this.n);
	        p3.putInt("viewIndex", this.f);
	        p3.putParcelableArrayList("scannedNetworks", this.r);
	        return;
	    }
	
	
	    public void onStop()
	    {
	        super.onStop();
	        this.u = 1;
	        this.v();
	        this.z.a();
	        return;
	    }
	
	
	    public final boolean t()
	    {
	        if ((this.r == null) || (this.r.isEmpty())) {
	            int v0_3 = 0;
	        } else {
	            v0_3 = 1;
	        }
	        return v0_3;
	    }
	
	
	    public final java.util.List u()
	    {
	        return this.r;
	    }
	
	
	    public void v()
	    {
	        this.p.b = android.os.SystemClock.elapsedRealtime();
	        return;
	    }
	
	
	    public final void w()
	    {
	        if (this.s.getDisplayedChild() == 1) {
	            this.s.setDisplayedChild(this.f);
	            this.d().f();
	        }
	        return;
	    }
	
	
	    public final void x()
	    {
	        this.N = this.getRequestedOrientation();
	        android.view.Window v0_1 = blx.c(this);
	        if (v0_1 != -1) {
	            this.setRequestedOrientation(v0_1);
	        }
	        this.getWindow().addFlags(128);
	        return;
	    }
	
	
	    public final void y()
	    {
	        this.setRequestedOrientation(this.N);
	        this.getWindow().clearFlags(128);
	        return;
	    }
	
	
	    public final bdu z()
	    {
	        return this.p;
	    }
	
