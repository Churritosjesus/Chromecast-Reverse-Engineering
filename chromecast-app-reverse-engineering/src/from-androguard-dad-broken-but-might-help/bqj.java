	private final  a
	private final  b
	private  c
	private  d
	private final java.lang.Object e
	private final java.lang.String f
	
	    private bqj(int p3, long p4, String p6)
	    {
	        this.e = new Object();
	        this.b = 60;
	        this.c = ((double) this.b);
	        this.a = 2000;
	        this.f = p6;
	        return;
	    }
	
	
	    public bqj(String p5)
	    {
	        this(60, 2000, p5);
	        return;
	    }
	
	
	    public final boolean a()
	    {
	        try {
	            String v2_0 = System.currentTimeMillis();
	        } catch (int v0_11) {
	            throw v0_11;
	        }
	        if (this.c < ((double) this.b)) {
	            double v4_4 = (((double) (v2_0 - this.d)) / ((double) this.a));
	            if (v4_4 > 0) {
	                this.c = Math.min(((double) this.b), (v4_4 + this.c));
	            }
	        }
	        int v0_10;
	        this.d = v2_0;
	        if (this.c < 1.0) {
	            bqk.a(new StringBuilder("Excessive ").append(this.f).append(" detected; call ignored.").toString());
	            v0_10 = 0;
	        } else {
	            this.c = (this.c - 1.0);
	            v0_10 = 1;
	        }
	        return v0_10;
	    }
	
