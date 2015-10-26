	public blp a
	public atz b
	public asg c
	 atf d
	  e
	 java.lang.Long f
	 android.os.Handler g
	final java.lang.Runnable h
	  i
	final java.lang.Runnable j
	private final  k
	private final  l
	
	    public asb(atz p4, atf p5, long p6, long p8)
	    {
	        this.h = new asc(this);
	        this.i = 0;
	        this.j = new asd(this);
	        this.b = p4;
	        this.d = p5;
	        this.g = new android.os.Handler();
	        this.a = new blp("BackdropSettingsManager", 0);
	        this.k = p6;
	        this.l = p8;
	        return;
	    }
	
	
	    private static long a(long p6)
	    {
	        return ((long) ((int) (((double) p6) * ((Math.random() / 2.0) + 0.75))));
	    }
	
	
	    static synthetic void a(asb p1)
	    {
	        p1.e = 0;
	        if (p1.f == null) {
	            if (p1.c != null) {
	                p1.i = 1;
	                p1.c();
	            }
	        } else {
	            if (p1.c != null) {
	                p1.a();
	            } else {
	                p1.j.run();
	            }
	        }
	        return;
	    }
	
	
	    private void c()
	    {
	        if (this.i) {
	            this.g.removeCallbacks(this.h);
	            long v0_3 = asb.a(this.l);
	            android.os.Handler v2_1 = new Object[1];
	            v2_1[0] = Long.valueOf(v0_3);
	            this.g.postDelayed(this.h, v0_3);
	        }
	        return;
	    }
	
	
	    public final void a()
	    {
	        this.f = Long.valueOf(this.b.a());
	        if (!this.e) {
	            long v0_5 = asb.a(this.k);
	            android.os.Handler v2_1 = new Object[1];
	            v2_1[0] = Long.valueOf(v0_5);
	            this.g.removeCallbacks(this.h);
	            this.i = 0;
	            this.g.removeCallbacks(this.j);
	            this.g.postDelayed(this.j, v0_5);
	        }
	        return;
	    }
	
	
	    void b()
	    {
	        if (this.e) {
	            this.c();
	        } else {
	            asf v0_3;
	            asf v0_1 = this.b;
	            if ((v0_1.g == 0) || ((v0_1.g + aun.f) <= android.os.SystemClock.elapsedRealtime())) {
	                v0_3 = 1;
	            } else {
	                v0_3 = 0;
	            }
	            if (v0_3 == null) {
	            } else {
	                this.e = 1;
	                this.b.c(this.d, new asf(this));
	            }
	        }
	        return;
	    }
	
