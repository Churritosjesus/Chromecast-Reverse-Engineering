	private static final java.lang.Object a
	private static final ckk b
	private static java.util.concurrent.ExecutorService c
	
	    static ckc()
	    {
	        ckc.a = new Object();
	        ckc.b = new ckk();
	        return;
	    }
	
	
	    public ckc()
	    {
	        return;
	    }
	
	
	    static synthetic bwj a(ckc p1, com.google.android.gms.common.api.GoogleApiClient p2, ckh p3)
	    {
	        return p1.a(p2, p3);
	    }
	
	
	    private final bwj a(com.google.android.gms.common.api.GoogleApiClient p3, ckh p4)
	    {
	        if (ckc.c == null) {
	            ckc.c = java.util.concurrent.Executors.newSingleThreadExecutor();
	        }
	        ckc.c.execute(new ckd(this, p3, p4));
	        return p4;
	    }
	
	
	    static synthetic ckk a()
	    {
	        return ckc.b;
	    }
	
	
	    static synthetic void a(com.google.android.gms.clearcut.LogEventParcelable p2)
	    {
	        if ((p2.e != null) && (p2.d.b.length == 0)) {
	            p2.d.b = p2.e.a();
	        }
	        p2.c = cms.a(p2.d);
	        return;
	    }
	
	
	    public final bwj a(com.google.android.gms.common.api.GoogleApiClient p3, com.google.android.gms.clearcut.LogEventParcelable p4)
	    {
	        ckc.b.a();
	        bwj v0_2 = new cki(this, p4, p3);
	        v0_2.a(new ckg(this));
	        return this.a(p3, v0_2);
	    }
	
	
	    public final void a(com.google.android.gms.common.api.GoogleApiClient p5)
	    {
	        Throwable v0_1 = new cke(this, p5, p5);
	        try {
	            if (ckc.c != null) {
	                ckc.c.execute(new ckf(this, p5, v0_1));
	            } else {
	                p5.a(v0_1);
	            }
	        } catch (Throwable v0_2) {
	            throw v0_2;
	        }
	        return;
	    }
	
