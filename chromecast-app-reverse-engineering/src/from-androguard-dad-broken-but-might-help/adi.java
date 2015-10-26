	private static final  b
	bridge  a
	private final java.util.concurrent.BlockingQueue c
	private final java.util.concurrent.BlockingQueue d
	private final adg e
	private final aeb f
	
	    static adi()
	    {
	        adi.b = aeg.a;
	        return;
	    }
	
	
	    public adi(java.util.concurrent.BlockingQueue p2, java.util.concurrent.BlockingQueue p3, adg p4, aeb p5)
	    {
	        this.a = 0;
	        this.c = p2;
	        this.d = p3;
	        this.e = p4;
	        this.f = p5;
	        return;
	    }
	
	
	    static synthetic java.util.concurrent.BlockingQueue a(adi p1)
	    {
	        return p1.d;
	    }
	
	
	    public final void run()
	    {
	        if (adi.b) {
	            aeb v1_0 = new Object[0];
	            aeg.a("start new dispatcher", v1_0);
	        }
	        android.os.Process.setThreadPriority(10);
	        this.e.a();
	        try {
	            do {
	                boolean v0_6 = ((ads) this.c.take());
	                v0_6.a("cache-queue-take");
	            } while(!this.a);
	            return;
	        } catch (boolean v0) {
	            if (this.a) {
	            }
	            return;
	        }
	        if (!v0_6.g) {
	            adj v4_1 = this.e.a(v0_6.b);
	            if (v4_1 != null) {
	                aeb v1_5;
	                if (v4_1.e >= System.currentTimeMillis()) {
	                    v1_5 = 0;
	                } else {
	                    v1_5 = 1;
	                }
	                if (v1_5 == null) {
	                    aeb v1_11;
	                    v0_6.a("cache-hit");
	                    ady v5_1 = v0_6.a(new adp(v4_1.a, v4_1.g));
	                    v0_6.a("cache-hit-parsed");
	                    if (v4_1.f >= System.currentTimeMillis()) {
	                        v1_11 = 0;
	                    } else {
	                        v1_11 = 1;
	                    }
	                    if (v1_11 != null) {
	                        v0_6.a("cache-hit-refresh-needed");
	                        v0_6.j = v4_1;
	                        v5_1.d = 1;
	                        this.f.a(v0_6, v5_1, new adj(this, v0_6));
	                    } else {
	                        this.f.a(v0_6, v5_1);
	                    }
	                } else {
	                    v0_6.a("cache-hit-expired");
	                    v0_6.j = v4_1;
	                    this.d.put(v0_6);
	                }
	            } else {
	                v0_6.a("cache-miss");
	                this.d.put(v0_6);
	            }
	        } else {
	            v0_6.b("cache-discard-canceled");
	        }
	        return;
	    }
	
