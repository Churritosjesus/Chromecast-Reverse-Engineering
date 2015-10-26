	private apd Z
	private  a
	private bjk aa
	private  ab
	private  ac
	private  ad
	private  ae
	private android.os.Handler af
	private final java.lang.Runnable ag
	private  b
	private  c
	private final blp d
	
	    public bjh()
	    {
	        this.ad = 0;
	        this.ae = 0;
	        this.ag = new bji(this);
	        this.d = new blp("PollOtaFragment");
	        return;
	    }
	
	
	    static synthetic android.os.Handler a(bjh p1)
	    {
	        return p1.af;
	    }
	
	
	    public static bjh a(long p4, int p6, int p7)
	    {
	        bjh v0_1 = new bjh();
	        android.os.Bundle v1_1 = new android.os.Bundle();
	        v1_1.putLong("pollDelay", p4);
	        v1_1.putInt("percentDoneThreshold", p6);
	        v1_1.putInt("numErrorsAllowed", p7);
	        v0_1.f(v1_1);
	        return v0_1;
	    }
	
	
	    private void a(boolean p3)
	    {
	        ape.a().a(this.Z);
	        if (!p3) {
	            this.aa.i();
	        } else {
	            this.aa.j();
	        }
	        return;
	    }
	
	
	    static synthetic bjk b(bjh p1)
	    {
	        return p1.aa;
	    }
	
	
	    private void b(int p2)
	    {
	        this.ab = p2;
	        this.aa.b(p2);
	        return;
	    }
	
	
	    static synthetic blp c(bjh p1)
	    {
	        return p1.d;
	    }
	
	
	    private boolean p()
	    {
	        int v0_1;
	        if (this.ad >= this.c) {
	            v0_1 = 0;
	        } else {
	            v0_1 = 1;
	        }
	        return v0_1;
	    }
	
	
	    public final void a()
	    {
	        super.a();
	        this.aa = 0;
	        return;
	    }
	
	
	    public final void a(android.app.Activity p1)
	    {
	        super.a(p1);
	        this.aa = ((bjk) p1);
	        return;
	    }
	
	
	    public final void a(android.os.Bundle p5)
	    {
	        super.a(p5);
	        this.Z = new apd(32);
	        int v0_2 = this.m;
	        this.a = v0_2.getLong("pollDelay");
	        this.b = v0_2.getInt("percentDoneThreshold");
	        this.c = v0_2.getInt("numErrorsAllowed");
	        if (p5 != null) {
	            this.ac = p5.getBoolean("otaReadyToApply");
	            this.b(p5.getInt("otaPercent"));
	            this.ad = p5.getInt("errorCount");
	        }
	        return;
	    }
	
	
	    public final synthetic void a(Object p6)
	    {
	        if (this.af != null) {
	            android.os.Handler v0_1 = ((bdf) p6).G;
	            switch (bjj.a[v0_1.ordinal()]) {
	                case 1:
	                    this.ad = 0;
	                    this.ac = ((bdf) p6).s;
	                    this.b(((bdf) p6).t);
	                    if (!this.p()) {
	                        this.a(0);
	                    } else {
	                        this.ae = 0;
	                        this.af.postDelayed(this.ag, this.a);
	                    }
	                    break;
	                case 2:
	                    this.a(1);
	                    break;
	                default:
	                    Runnable v1_3 = new Object[1];
	                    v1_3[0] = Integer.valueOf(v0_1.r);
	                    this.aa.k();
	            }
	        }
	        return;
	    }
	
	
	    public final void b_(int p5)
	    {
	        if ((this.af != null) && (p5 != -99)) {
	            if ((!this.ac) && (this.ab < this.b)) {
	                if ((!this.ae) || ((this.ab <= 0) || ((p5 != -1) && (p5 != -2)))) {
	                    if (this.ad >= this.c) {
	                        Object[] v0_9 = new Object[1];
	                        v0_9[0] = Integer.valueOf(p5);
	                        this.aa.k();
	                    } else {
	                        this.ad = (this.ad + 1);
	                        Object[] v0_14 = new Object[2];
	                        v0_14[0] = Integer.valueOf(p5);
	                        v0_14[1] = Integer.valueOf(this.ad);
	                        this.af.postDelayed(this.ag, this.a);
	                    }
	                } else {
	                    Object[] v0_16 = new Object[1];
	                    v0_16[0] = Integer.valueOf(p5);
	                    this.a(0);
	                }
	            } else {
	                this.a(0);
	            }
	        }
	        return;
	    }
	
	
	    public final void e(android.os.Bundle p3)
	    {
	        super.e(p3);
	        p3.putInt("otaPercent", this.ab);
	        p3.putBoolean("otaReadyToApply", this.ac);
	        p3.putInt("errorCount", this.ad);
	        return;
	    }
	
	
	    public final void g_()
	    {
	        super.g_();
	        this.af = new android.os.Handler();
	        if (this.p()) {
	            this.ae = 1;
	            this.ag.run();
	        }
	        return;
	    }
	
	
	    public final void h_()
	    {
	        super.h_();
	        this.af.removeCallbacks(this.ag);
	        this.af = 0;
	        return;
	    }
	
