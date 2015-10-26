	private static java.lang.Object j
	private static cuv k
	bridge bpb a
	private bridge  b
	private bridge  c
	private bridge  d
	private bridge  e
	private final android.content.Context f
	private final cac g
	private final java.lang.Thread h
	private cuy i
	
	    static cuv()
	    {
	        cuv.j = new Object();
	        return;
	    }
	
	
	    private cuv(android.content.Context p3)
	    {
	        this(p3, 0, cad.c());
	        return;
	    }
	
	
	    private cuv(android.content.Context p3, cuy p4, cac p5)
	    {
	        this.b = 900000;
	        this.c = 30000;
	        this.d = 0;
	        this.i = new cuw(this);
	        this.g = p5;
	        if (p3 == null) {
	            this.f = p3;
	        } else {
	            this.f = p3.getApplicationContext();
	        }
	        this.h = new Thread(new cux(this));
	        return;
	    }
	
	
	    static synthetic android.content.Context a(cuv p1)
	    {
	        return p1.f;
	    }
	
	
	    static cuv a(android.content.Context p2)
	    {
	        if (cuv.k == null) {
	            if (cuv.k == null) {
	                Thread v0_3 = new cuv(p2);
	                cuv.k = v0_3;
	                v0_3.h.start();
	            }
	        }
	        return cuv.k;
	    }
	
	
	    static synthetic void b(cuv p2)
	    {
	        android.os.Process.setThreadPriority(10);
	        try {
	            while(true) {
	                p2.a = p2.i.a();
	                Thread.sleep(p2.b);
	                cuh.c("sleep interrupted in AdvertiserDataPoller thread; continuing");
	            }
	        } catch (String v0) {
	        }
	    }
	
	
	    void a()
	    {
	        if ((this.g.a() - this.e) >= this.c) {
	            this.h.interrupt();
	            this.e = this.g.a();
	        }
	        return;
	    }
	
