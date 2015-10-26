	private final java.util.Map a
	private final agm b
	private final  c
	private  d
	private  e
	private  f
	private ahc g
	
	    agz(java.io.OutputStream p3, agm p4, java.util.Map p5, long p6)
	    {
	        this(p3);
	        this.b = p4;
	        this.a = p5;
	        this.f = p6;
	        this.c = afv.g();
	        return;
	    }
	
	
	    private void a()
	    {
	        if (this.d > this.e) {
	            java.util.Iterator v1 = this.b.d.iterator();
	            while (v1.hasNext()) {
	                ago v0_7 = ((agn) v1.next());
	                if ((v0_7 instanceof ago)) {
	                    android.os.Handler v2_3 = this.b.a;
	                    if (v2_3 != null) {
	                        v2_3.post(new aha(this, ((ago) v0_7)));
	                    }
	                }
	            }
	            this.e = this.d;
	        }
	        return;
	    }
	
	
	    private void a(long p10)
	    {
	        if (this.g != null) {
	            long v0_1 = this.g;
	            v0_1.b = (v0_1.b + p10);
	            if ((v0_1.b >= (v0_1.c + v0_1.a)) || (v0_1.b >= v0_1.d)) {
	                v0_1.a();
	            }
	        }
	        this.d = (this.d + p10);
	        if ((this.d >= (this.e + this.c)) || (this.d >= this.f)) {
	            this.a();
	        }
	        return;
	    }
	
	
	    public final void a(aga p2)
	    {
	        int v0_0;
	        if (p2 == null) {
	            v0_0 = 0;
	        } else {
	            v0_0 = ((ahc) this.a.get(p2));
	        }
	        this.g = v0_0;
	        return;
	    }
	
	
	    public final void close()
	    {
	        super.close();
	        java.util.Iterator v1 = this.a.values().iterator();
	        while (v1.hasNext()) {
	            ((ahc) v1.next()).a();
	        }
	        this.a();
	        return;
	    }
	
	
	    public final void write(int p3)
	    {
	        this.out.write(p3);
	        this.a(1);
	        return;
	    }
	
	
	    public final void write(byte[] p3)
	    {
	        this.out.write(p3);
	        this.a(((long) p3.length));
	        return;
	    }
	
	
	    public final void write(byte[] p3, int p4, int p5)
	    {
	        this.out.write(p3, p4, p5);
	        this.a(((long) p5));
	        return;
	    }
	
