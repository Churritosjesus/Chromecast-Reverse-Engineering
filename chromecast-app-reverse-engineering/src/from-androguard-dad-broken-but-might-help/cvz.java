	private final  a
	private final  b
	private final  c
	private  d
	private  e
	private final java.lang.Object f
	private final java.lang.String g
	private final cac h
	
	    public cvz(int p3, long p4, long p6, String p8, cac p9)
	    {
	        this.f = new Object();
	        this.c = 30;
	        this.d = ((double) this.c);
	        this.a = 900000;
	        this.b = 5000;
	        this.g = p8;
	        this.h = p9;
	        return;
	    }
	
	
	    public final boolean a()
	    {
	        int v0_0 = 0;
	        try {
	            String v2_1 = this.h.a();
	        } catch (int v0_1) {
	            throw v0_1;
	        }
	        if ((v2_1 - this.e) >= this.b) {
	            if (this.d < ((double) this.c)) {
	                double v4_8 = (((double) (v2_1 - this.e)) / ((double) this.a));
	                if (v4_8 > 0) {
	                    this.d = Math.min(((double) this.c), (v4_8 + this.d));
	                }
	            }
	            this.e = v2_1;
	            if (this.d < 1.0) {
	                cuh.b(new StringBuilder("Excessive ").append(this.g).append(" detected; call ignored.").toString());
	            } else {
	                this.d = (this.d - 1.0);
	                v0_0 = 1;
	            }
	        } else {
	            cuh.b(new StringBuilder("Excessive ").append(this.g).append(" detected; call ignored.").toString());
	        }
	        return v0_0;
	    }
	
