	private final  a
	private final  b
	private  c
	private  d
	private final java.lang.Object e
	
	    public cxs()
	    {
	        this(60, 2000);
	        return;
	    }
	
	
	    private cxs(int p3, long p4)
	    {
	        this.e = new Object();
	        this.b = 60;
	        this.c = ((double) this.b);
	        this.a = 2000;
	        return;
	    }
	
	
	    public final boolean a()
	    {
	        try {
	            double v2_0 = System.currentTimeMillis();
	        } catch (int v0_7) {
	            throw v0_7;
	        }
	        if (this.c < ((double) this.b)) {
	            double v4_4 = (((double) (v2_0 - this.d)) / ((double) this.a));
	            if (v4_4 > 0) {
	                this.c = Math.min(((double) this.b), (v4_4 + this.c));
	            }
	        }
	        int v0_6;
	        this.d = v2_0;
	        if (this.c < 1.0) {
	            cuh.b("No more tokens available.");
	            v0_6 = 0;
	        } else {
	            this.c = (this.c - 1.0);
	            v0_6 = 1;
	        }
	        return v0_6;
	    }
	
