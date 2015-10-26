	public dbt Z
	final atc a
	private blp aa
	private final android.os.Handler ab
	private  ac
	private atw ad
	private java.lang.String ae
	private java.lang.String af
	private java.lang.String ag
	private dbr ah
	private java.lang.String ai
	private final java.lang.Runnable aj
	private final java.util.List ak
	public  b
	 atf c
	public asb d
	
	    public ash()
	    {
	        this.aj = new asi(this);
	        this.ak = new java.util.ArrayList();
	        this.ab = new android.os.Handler();
	        this.a = new atc();
	        return;
	    }
	
	
	    public static ash a(String p3, String p4, String p5, String p6)
	    {
	        ash v0_1 = new ash();
	        android.os.Bundle v1_1 = new android.os.Bundle();
	        v1_1.putString("backdropAppDeviceId", p3);
	        v1_1.putString("deviceName", p4);
	        v1_1.putString("deviceType", p5);
	        v1_1.putString("backdropDeviceCert", p6);
	        v0_1.f(v1_1);
	        return v0_1;
	    }
	
	
	    private void a(int p5, long p6, asp p8)
	    {
	        int v0_0;
	        if (p5 != 1) {
	            v0_0 = b.al;
	        } else {
	            v0_0 = b.Z;
	        }
	        this.c(this.y.getString(v0_0));
	        this.ad.a(p6);
	        this.b(1);
	        if (p8 != null) {
	            if (p5 != 2) {
	                p8.j();
	            } else {
	                p8.l();
	            }
	        }
	        return;
	    }
	
	
	    static synthetic void a(ash p0)
	    {
	        p0.u();
	        return;
	    }
	
	
	    static synthetic void a(ash p0, int p1, long p2, asp p4)
	    {
	        p0.a(p1, p2, p4);
	        return;
	    }
	
	
	    static synthetic void a(ash p0, String p1)
	    {
	        p0.c(p1);
	        return;
	    }
	
	
	    static synthetic boolean a(ash p1, boolean p2)
	    {
	        p1.b = 1;
	        return 1;
	    }
	
	
	    static synthetic atw b(ash p1)
	    {
	        return p1.ad;
	    }
	
	
	    static synthetic dbt c(ash p1)
	    {
	        return p1.Z;
	    }
	
	
	    private void c(String p3)
	    {
	        this.y.runOnUiThread(new aso(this, p3));
	        return;
	    }
	
	
	    static synthetic String d(ash p1)
	    {
	        return p1.ai;
	    }
	
	
	    static synthetic void e(ash p0)
	    {
	        p0.v();
	        return;
	    }
	
	
	    static synthetic atc f(ash p1)
	    {
	        return p1.a;
	    }
	
	
	    private void u()
	    {
	        this.ad.c(this.c, new asn(this));
	        this.ab.removeCallbacks(this.aj);
	        this.ab.postDelayed(this.aj, ((long) ((int) (((double) this.ac) * ((Math.random() / 2.0) + 0.75)))));
	        return;
	    }
	
	
	    private void v()
	    {
	        String v0_2 = com.google.android.apps.chromecast.app.SetupApplication.a().b().b(this.ae);
	        if (v0_2 != null) {
	            blp v1_3 = com.google.android.apps.chromecast.app.SetupApplication.a().j.a(v0_2);
	            if (v1_3 == null) {
	                blp v1_4 = this.aa;
	                aqt v3_1 = new Object[1];
	                v3_1[0] = v0_2.g();
	                v1_4.a("Settings updated for %s, but couldn\'t send the refresh request.", v3_1);
	            } else {
	                if (aqj.c != null) {
	                    String v0_5 = new Object[1];
	                    v0_5[0] = v1_3.b.g();
	                    v1_3.a("urn:x-cast:com.google.cast.sse", aqj.c, new aqt(v1_3));
	                }
	            }
	        }
	        return;
	    }
	
	
	    public final java.util.List a(int p2, String p3)
	    {
	        return this.a.a(p2, p3);
	    }
	
	
	    public final void a()
	    {
	        super.a();
	        this.c.c = 0;
	        return;
	    }
	
	
	    public final void a(int p18, int p19, int p20, boolean p21, int p22, String p23, int p24)
	    {
	        String v10;
	        asl v15_1 = new asl(this);
	        atf v16 = this.c;
	        String v5 = this.ag;
	        String v6 = this.ae;
	        if (!p21) {
	            v10 = this.a.b(p22, p23);
	        } else {
	            v10 = 0;
	        }
	        v16.a(new auh(v5, v6, 100, p19, p20, v10, p23, p22, p24, new asm(this, p21, p22, p23), v15_1));
	        return;
	    }
	
	
	    public final void a(int p5, int p6, android.content.Intent p7)
	    {
	        if (p5 != 1000) {
	            super.a(p5, p6, p7);
	        } else {
	            adf v1_0 = this.c;
	            if (p5 == 1000) {
	                if (p6 != -1) {
	                    try {
	                        if (!v1_0.k.isEmpty()) {
	                            atb v0_6 = ((atb) v1_0.k.get(0));
	                            v1_0.k.remove(v0_6);
	                            if (v0_6 != null) {
	                                v0_6.b(new adf("no permission granted"));
	                            }
	                        } else {
	                        }
	                    } catch (atb v0_7) {
	                        throw v0_7;
	                    }
	                } else {
	                    v1_0.a();
	                }
	            }
	        }
	        return;
	    }
	
	
	    public void a(int p21, dbt p22, asp p23)
	    {
	        java.io.IOException v4_1 = new dbt[1];
	        v4_1[0] = p22;
	        dcg v17_1 = new dcg();
	        v17_1.a = Integer.valueOf(p21);
	        v17_1.c = v4_1;
	        long v8 = this.ad.a();
	        try {
	            java.io.IOException v4_3 = this.c;
	            auf v18 = new auf;
	            v18(this.ag, v17_1, new asj(this, p21, v8, p23, p22), new ask(this, p21, v8, p23));
	            v4_3.a(v18);
	        } catch (java.io.IOException v4_4) {
	            blp v5_4 = this.aa;
	            Object[] v7_2 = new Object[1];
	            v7_2[0] = v4_4;
	            v5_4.a("Could not serialize device link data: %s", v7_2);
	            this.a(p21, v8, p23);
	        }
	        return;
	    }
	
	
	    public final void a(android.app.Activity p2)
	    {
	        super.a(p2);
	        this.c = atf.a(p2);
	        this.c.c = this;
	        return;
	    }
	
	
	    public final void a(android.os.Bundle p10)
	    {
	        super.a(p10);
	        this.c(1);
	        this.aa = new blp("BackdropStorage", 0);
	        this.ad = new atw(this.y);
	        this.ac = blf.v(this.y);
	        this.ag = blf.z(this.y);
	        if ((this.m != null) && (this.m.containsKey("castDeviceUserInfo"))) {
	            this.ah = new dbr();
	            try {
	                this.ah = ((dbr) dew.a(new dbr(), this.m.getByteArray("castDeviceUserInfo")));
	            } catch (atz v0) {
	                String v2_1 = new Object[0];
	                this.aa.a("Error deserializing UserDeviceAssociationRequest.", v2_1);
	            }
	            if ((this.ah.b != null) && (!this.ah.b.isEmpty())) {
	                this.ae = this.ah.b;
	            }
	        }
	        if ((this.m != null) && (this.m.containsKey("backdropAppDeviceId"))) {
	            this.ae = this.m.getString("backdropAppDeviceId");
	        }
	        if ((this.m != null) && (this.m.containsKey("backdropDeviceCert"))) {
	            this.af = this.m.getString("backdropDeviceCert");
	        }
	        if (this.ae != null) {
	            this.d = new asb(new atz(this.y, this.ae), this.c, blf.t(this.y), this.ac);
	            if (this.ah != null) {
	                this.Z = asr.a(this.ah, this.af);
	                this.ai = this.ah.a;
	            } else {
	                this.Z = asr.a(this.ae, this.m.getString("deviceName"), this.af);
	                this.ai = this.m.getString("deviceType");
	            }
	        }
	        if (p10 != null) {
	            this.ad.b(p10);
	            if (this.d != null) {
	                this.d.b.b(p10);
	            }
	            this.b(1);
	        }
	        return;
	    }
	
	
	    public final void a(asq p2)
	    {
	        this.ak.add(p2);
	        p2.a_(4);
	        p2.a_(2);
	        return;
	    }
	
	
	    public final boolean a(String p5)
	    {
	        int v0_8;
	        if (p5 == null) {
	            v0_8 = 0;
	        } else {
	            java.util.Iterator v3 = this.ad.a.iterator();
	            while (v3.hasNext()) {
	                if (((ast) v3.next()).b.equals(p5)) {
	                    int v0_3 = 1;
	                }
	                if (v0_3 == 0) {
	                } else {
	                    v0_8 = 1;
	                }
	            }
	            v0_3 = 0;
	        }
	        return v0_8;
	    }
	
	
	    public final dcj b(String p9)
	    {
	        int v0_4;
	        if (!android.text.TextUtils.isEmpty(p9)) {
	            int v0_2 = this.t().b;
	            if (v0_2 != 0) {
	                java.util.LinkedList v3_0 = new Object[1];
	                v3_0[0] = v0_2;
	                java.util.LinkedList v3_2 = new java.util.LinkedList();
	                v3_2.add(v0_2);
	                while (!v3_2.isEmpty()) {
	                    v0_4 = ((dcj) v3_2.remove());
	                    if (v0_4 != 0) {
	                        if ((android.text.TextUtils.isEmpty(v0_4.j)) || (!v0_4.j.equals(p9))) {
	                            dcj[] v4_4 = v0_4.i;
	                            int v5 = v4_4.length;
	                            int v0_6 = 0;
	                            while (v0_6 < v5) {
	                                v3_2.add(v4_4[v0_6]);
	                                v0_6++;
	                            }
	                        } else {
	                            Object[] v1_1 = new Object[1];
	                            v1_1[0] = v0_4;
	                        }
	                    }
	                }
	                v0_4 = 0;
	            } else {
	                v0_4 = 0;
	            }
	        } else {
	            v0_4 = 0;
	        }
	        return v0_4;
	    }
	
	
	    public final void b(int p3)
	    {
	        java.util.Iterator v1_1 = new java.util.ArrayList(this.ak).iterator();
	        while (v1_1.hasNext()) {
	            ((asq) v1_1.next()).a_(p3);
	        }
	        return;
	    }
	
	
	    public final void b(asq p2)
	    {
	        this.ak.remove(p2);
	        return;
	    }
	
	
	    public final void d_()
	    {
	        this.b(2);
	        this.b(4);
	        this.v();
	        return;
	    }
	
	
	    public final void e(android.os.Bundle p2)
	    {
	        super.e(p2);
	        this.ad.a(p2);
	        if (this.d != null) {
	            this.d.b.a(p2);
	        }
	        return;
	    }
	
	
	    public final void e_()
	    {
	        this.v();
	        return;
	    }
	
	
	    public final void f_()
	    {
	        this.b = 1;
	        return;
	    }
	
	
	    public final void g_()
	    {
	        super.g_();
	        if (this.d != null) {
	            asb v0_1 = this.d;
	            v0_1.i = 1;
	            v0_1.c = this;
	            v0_1.b();
	        }
	        this.u();
	        return;
	    }
	
	
	    public final void h_()
	    {
	        super.h_();
	        this.ab.removeCallbacks(this.aj);
	        if (this.d != null) {
	            Runnable v0_2 = this.d;
	            v0_2.i = 0;
	            v0_2.c = 0;
	            v0_2.g.removeCallbacks(v0_2.h);
	            v0_2.g.removeCallbacks(v0_2.j);
	            if ((v0_2.b.b()) && (!v0_2.e)) {
	                v0_2.j.run();
	            }
	        }
	        return;
	    }
	
	
	    public final java.util.List p()
	    {
	        java.util.List v0_2;
	        if (this.ad != null) {
	            v0_2 = this.ad.a;
	        } else {
	            v0_2 = 0;
	        }
	        return v0_2;
	    }
	
	
	    public final boolean q()
	    {
	        return this.ad.b;
	    }
	
	
	    public final boolean r()
	    {
	        return this.a(this.ae);
	    }
	
	
	    public final auq s()
	    {
	        int v0_1;
	        if (this.d == null) {
	            v0_1 = 0;
	        } else {
	            v0_1 = this.d.b.a;
	        }
	        return v0_1;
	    }
	
	
	    public final aur t()
	    {
	        int v0_1;
	        if (this.d == null) {
	            v0_1 = 0;
	        } else {
	            v0_1 = this.d.b.b;
	        }
	        return v0_1;
	    }
	
