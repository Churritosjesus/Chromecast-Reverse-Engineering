	 android.os.Handler a
	public  b
	public java.lang.String d
	public final  e
	public java.lang.String f
	public  g
	public azv h
	private blp i
	private final aph j
	private final java.util.concurrent.ExecutorService k
	
	    public bdu(String p8, int p9, String p10, int p11, aph p12)
	    {
	        this(p8, p9, p10, p11, p12, java.util.concurrent.Executors.newSingleThreadExecutor());
	        return;
	    }
	
	
	    public bdu(String p4, int p5, String p6, int p7, aph p8, java.util.concurrent.ExecutorService p9)
	    {
	        this(p5);
	        this.i = new blp("HttpDeviceConnector", 0);
	        this.a = new android.os.Handler();
	        this.d = p4;
	        this.f = p6;
	        this.e = p7;
	        this.h = com.google.android.apps.chromecast.app.SetupApplication.a().l();
	        this.j = p8;
	        this.k = p9;
	        return;
	    }
	
	
	    static synthetic void a(bdu p0, String p1, long p2, bfp p4, int p5, bff p6)
	    {
	        p0.a(p1, p2, p4, p5, p6);
	        return;
	    }
	
	
	    public final void a()
	    {
	        this.b = android.os.SystemClock.elapsedRealtime();
	        return;
	    }
	
	
	    public final void a(int p8, bdn p9)
	    {
	        this.a("reboot", this.d(), new bfi(this.d, p8), this.e, new bey(this, p9));
	        return;
	    }
	
	
	    public final void a(int p18, java.util.Locale p19, boolean p20, bdn p21)
	    {
	        long v8 = this.d();
	        bdq v6_1 = new bdq(this.d, p18, this.c);
	        if (p19 != null) {
	            v6_1.b = blj.a(p19);
	        }
	        this.a("getDeviceInfo", v8, v6_1, this.e, new bdv(this, p21, v6_1, p20, v8, p21));
	        return;
	    }
	
	
	    void a(long p12, android.content.Context p14, bdn p15)
	    {
	        this.a("scanNetworks", p12, new bfm(this.d), this.e, new bdz(this, p15, p12, p14, p15));
	        return;
	    }
	
	
	    public final void a(android.content.Context p11, String p12, bdn p13)
	    {
	        long v4 = this.d();
	        if (!android.text.TextUtils.isEmpty(p12)) {
	            String v0_2 = new java.util.HashMap(1);
	            v0_2.put("country_code", com.google.android.apps.chromecast.app.SetupApplication.a().c);
	            this.a("setCountryCode", v4, new bfo(this.d, 0, v0_2, this.c), this.e, new beu(this, p13, v4, p11, p13));
	        } else {
	            this.a(v4, p11, p13);
	        }
	        return;
	    }
	
	
	    public final void a(bdn p8)
	    {
	        long v2 = this.d();
	        bdq v4_1 = new bdq(this.d, 160, this.c);
	        v4_1.h = 1;
	        this.a("pollSetupState", v2, v4_1, this.e, new beq(this, p8, v4_1));
	        return;
	    }
	
	
	    public final void a(bdn p8, int p9)
	    {
	        this.a(new StringBuilder(21).append("playSound-").append(p9).toString(), this.d(), new bfh(this.d, p9), this.e, new bey(this, p8));
	        return;
	    }
	
	
	    void a(bfp p3, bff p4)
	    {
	        this.k.submit(new bem(this, p3, p4));
	        return;
	    }
	
	
	    public final void a(bfs p8, bdn p9)
	    {
	        this.a("connectToNetwork", this.d(), new bdd(this.d, p8), this.e, new bey(this, p9));
	        return;
	    }
	
	
	    void a(String p17, long p18, bfp p20, int p21, int p22, long p23, bff p25)
	    {
	        if (!this.a(p17, p18)) {
	            java.util.concurrent.ExecutorService v3_8;
	            int v5_0 = android.os.SystemClock.elapsedRealtime();
	            beh v2_2 = new Object[1];
	            v2_2[0] = p17;
	            beh v2_4 = new beh(this, p17, v5_0, p25, p18, p22, p20, p23, p21);
	            switch (ben.a[(p21 - 1)]) {
	                case 1:
	                    if ((!android.text.TextUtils.isEmpty(this.f)) && (!this.h.a(this.f, 1))) {
	                        v3_8 = 0;
	                    } else {
	                        v3_8 = 1;
	                    }
	                    if (v3_8 != null) {
	                    } else {
	                        Object[] v4_10 = new Object[2];
	                        v4_10[0] = p17;
	                        v4_10[1] = this.f;
	                    }
	                    break;
	                case 2:
	                    java.util.concurrent.ExecutorService v3_10;
	                    java.util.concurrent.ExecutorService v3_9 = this.h;
	                    if (!android.text.TextUtils.isEmpty(v3_9.j)) {
	                        v3_10 = v3_9.a(v3_9.j, 0);
	                    } else {
	                        v3_10 = 0;
	                    }
	                    if (v3_10 != null) {
	                        v3_8 = 0;
	                    } else {
	                        v3_8 = 1;
	                    }
	                    if (v3_8 != null) {
	                    } else {
	                        Object[] v4_7 = new Object[1];
	                        v4_7[0] = p17;
	                    }
	                    break;
	                case 3:
	                    if ((!android.text.TextUtils.isEmpty(this.f)) && (!this.h.a(this.f, 1))) {
	                        v3_8 = 0;
	                    } else {
	                        v3_8 = 1;
	                    }
	                    break;
	                default:
	                    v3_8 = 1;
	            }
	            if (v3_8 == null) {
	                if (p21 == bew.d) {
	                    String v6_2 = new apd(17);
	                    if (this.j != null) {
	                        v6_2.h = this.j;
	                    }
	                    if (this.g) {
	                        java.util.concurrent.ExecutorService v3_21 = new bfs();
	                        v3_21.a = this.f;
	                        v3_21.b = bfu.b;
	                        this.h.a(v3_21);
	                    }
	                    this.k.submit(new bej(this, v6_2, p17, p18, new java.util.concurrent.atomic.AtomicBoolean(0), p20, v2_4));
	                } else {
	                    v2_4.a(-1);
	                }
	            } else {
	                this.a(p20, v2_4);
	            }
	        }
	        return;
	    }
	
	
	    public void a(String p11, long p12, bfp p14, int p15, bff p16)
	    {
	        this.a(p11, p12, p14, p15, 1, 200, p16);
	        return;
	    }
	
	
	    public final void a(java.util.HashMap p8, bdf p9, bdn p10)
	    {
	        if ((p8 != null) && (!p8.isEmpty())) {
	            this.a("setDeviceInfo", this.d(), new bfo(this.d, p9, p8, this.c), this.e, new bey(this, p10));
	        } else {
	            this.a.post(new bef(this, p10));
	        }
	        return;
	    }
	
	
	    boolean a(String p9, long p10)
	    {
	        if ((this.b <= 0) || (p10 >= this.b)) {
	            int v0_2 = 0;
	        } else {
	            v0_2 = 1;
	        }
	        if (v0_2 != 0) {
	            Object[] v1_1 = new Object[1];
	            v1_1[0] = p9;
	        }
	        return v0_2;
	    }
	
	
	    public final void b(bdn p8)
	    {
	        long v2 = this.d();
	        bdq v4_1 = new bdq(this.d, 1, this.c);
	        v4_1.h = 1;
	        v4_1.i = 1;
	        this.a("refreshSetupState", v2, v4_1, bew.b, new bey(this, p8));
	        return;
	    }
	
	
	    public final boolean b()
	    {
	        return 1;
	    }
	
	
	    public final boolean c()
	    {
	        return 1;
	    }
	
	
	    public long d()
	    {
	        if (!android.text.TextUtils.isEmpty(this.d)) {
	            return android.os.SystemClock.elapsedRealtime();
	        } else {
	            throw new IllegalStateException("No IP Address");
	        }
	    }
	
	
	    public final void d(bdn p8)
	    {
	        long v2 = this.d();
	        bfb v4_1 = new bfb(this.d);
	        this.a("getLicense", v2, v4_1, this.e, new bec(this, p8, v4_1));
	        return;
	    }
	
