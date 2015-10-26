	private static ape h
	public final java.util.Random a
	public android.content.Context b
	public android.content.SharedPreferences c
	public com.google.android.gms.common.api.GoogleApiClient d
	public bvh e
	public  f
	public  g
	private final blp i
	private final java.util.Queue j
	
	    static ape()
	    {
	        ape.h = 0;
	        return;
	    }
	
	
	    private ape()
	    {
	        this.i = new blp("ClearcutAnalytics");
	        this.j = new java.util.concurrent.ConcurrentLinkedQueue();
	        this.a = new java.util.Random();
	        this.f = 1;
	        return;
	    }
	
	
	    public static ape a()
	    {
	        if (ape.h == null) {
	            ape.h = new ape();
	        }
	        return ape.h;
	    }
	
	
	    static synthetic blp a(ape p1)
	    {
	        return p1.i;
	    }
	
	
	    private void b()
	    {
	        try {
	            while (!this.j.isEmpty()) {
	                bvj v9_1 = new bvj(this.e, new apf(this, ((apd) this.j.poll())));
	                com.google.android.gms.common.api.GoogleApiClient v10 = this.d;
	                if (!v9_1.g) {
	                    v9_1.g = 1;
	                    bvh.j(v9_1.h).a(v10, new com.google.android.gms.clearcut.LogEventParcelable(new com.google.android.gms.playlog.internal.PlayLoggerContext(bvh.h(v9_1.h), bvh.i(v9_1.h), v9_1.a, v9_1.b, v9_1.c, v9_1.d, bvh.g(v9_1.h)), v9_1.f, v9_1.e));
	                } else {
	                    throw new IllegalStateException("do not reuse LogEventBuilder");
	                }
	            }
	        } catch (com.google.android.gms.playlog.internal.PlayLoggerContext v0_12) {
	            throw v0_12;
	        }
	        return;
	    }
	
	
	    public final int a(String p4)
	    {
	        int v0_1 = this.a.nextInt();
	        apd v1_1 = new apg();
	        v1_1.a = 111;
	        v1_1.e = p4;
	        this.a(v1_1.c(v0_1).a());
	        return v0_1;
	    }
	
	
	    public final void a(int p1)
	    {
	        return;
	    }
	
	
	    public final void a(int p3, Integer p4)
	    {
	        this.a(new apd(15, p4));
	        return;
	    }
	
	
	    public final void a(int p7, Integer p8, Long p9)
	    {
	        apd v0_1 = new apd(p7, p8);
	        v0_1.b((android.os.SystemClock.elapsedRealtime() - p9.longValue()));
	        this.a(v0_1);
	        return;
	    }
	
	
	    public final void a(android.os.Bundle p1)
	    {
	        this.b();
	        return;
	    }
	
	
	    public final void a(apd p5)
	    {
	        if (p5.c == null) {
	            p5.c = Long.valueOf((android.os.SystemClock.elapsedRealtime() - p5.b));
	        }
	        p5.i = Integer.valueOf(ape.a().g);
	        if (this.f) {
	            this.j.add(p5);
	            if (this.d.d()) {
	                this.b();
	            } else {
	                this.d.b();
	            }
	        }
	        return;
	    }
	
	
	    public final void b(int p2)
	    {
	        this.a(new apd(p2));
	        return;
	    }
	
