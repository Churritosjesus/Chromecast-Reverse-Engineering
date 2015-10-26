	private static cuq g
	public final ctw a
	final cxt b
	final java.util.concurrent.ConcurrentMap c
	private final cut d
	private final android.content.Context e
	private final czb f
	
	    private cuq(android.content.Context p4, cut p5, ctw p6, cxt p7)
	    {
	        if (p4 != null) {
	            this.e = p4.getApplicationContext();
	            this.b = p7;
	            this.d = p5;
	            this.c = new java.util.concurrent.ConcurrentHashMap();
	            this.a = p6;
	            this.a.a(new cur(this));
	            this.a.a(new cyk(this.e));
	            this.f = new czb();
	            if (android.os.Build$VERSION.SDK_INT >= 14) {
	                this.e.registerComponentCallbacks(new cus(this));
	            }
	            return;
	        } else {
	            throw new NullPointerException("context cannot be null");
	        }
	    }
	
	
	    public static cuq a(android.content.Context p5)
	    {
	        try {
	            if (cuq.g == null) {
	                if (p5 != null) {
	                    cuq.g = new cuq(p5, new cut(), new ctw(new czg(p5)), cum.a());
	                } else {
	                    cuh.a("TagManager.getInstance requires non-null context.");
	                    throw new NullPointerException();
	                }
	            }
	        } catch (cut v0_7) {
	            throw v0_7;
	        }
	        return cuq.g;
	    }
	
	
	    static synthetic void a(cuq p2, String p3)
	    {
	        java.util.Iterator v1 = p2.c.keySet().iterator();
	        while (v1.hasNext()) {
	            ((ctn) v1.next()).a(p3);
	        }
	        return;
	    }
	
	
	    public final bwj a(String p12, int p13)
	    {
	        cto v7 = this.d.a(this.e, this, 0, p12, p13, this.f);
	        v7.l.a(new ctr(v7));
	        v7.q.a(new cts(v7));
	        clz v6_1 = v7.l.a(v7.h);
	        if (v6_1 != null) {
	            v7.m = new ctn(v7.j, v7.g, new ctk(v7.i, v7.j.a, v7.k, 0, v6_1), v7.f);
	        }
	        v7.r = new ctp(v7, 0);
	        if (!v7.e()) {
	            v7.l.b();
	        } else {
	            v7.q.a(0, "");
	        }
	        return v7;
	    }
	
