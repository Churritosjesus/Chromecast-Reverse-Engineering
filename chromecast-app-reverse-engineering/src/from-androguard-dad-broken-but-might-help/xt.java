	final android.util.SparseIntArray a
	private  b
	
	    public xt()
	    {
	        this.a = new android.util.SparseIntArray();
	        this.b = 0;
	        return;
	    }
	
	
	    public int a(int p5, int p6)
	    {
	        int v1 = 0;
	        if (1 != p6) {
	            int v3 = 0;
	            int v0 = 0;
	            while (v3 < p5) {
	                v0++;
	                if (v0 != p6) {
	                    if (v0 > p6) {
	                        v0 = 1;
	                    }
	                } else {
	                    v0 = 0;
	                }
	                v3++;
	            }
	            if ((v0 + 1) <= p6) {
	                v1 = v0;
	            }
	        }
	        return v1;
	    }
	
	
	    public final int b(int p5, int p6)
	    {
	        int v3 = 0;
	        int v0 = 0;
	        int v1_0 = 0;
	        while (v3 < p5) {
	            v1_0++;
	            if (v1_0 != p6) {
	                if (v1_0 > p6) {
	                    v1_0 = 1;
	                    v0++;
	                }
	            } else {
	                v0++;
	                v1_0 = 0;
	            }
	            v3++;
	        }
	        if ((v1_0 + 1) > p6) {
	            v0++;
	        }
	        return v0;
	    }
	
