	private synthetic  a
	private synthetic cto b
	
	    ctp(cto p1, boolean p2)
	    {
	        this.b = p1;
	        this.a = p2;
	        return;
	    }
	
	
	    public final boolean a(ctk p7)
	    {
	        int v0 = 1;
	        if (!this.a) {
	            int v2_3;
	            if (p7.b != 0) {
	                v2_3 = 0;
	            } else {
	                v2_3 = 1;
	            }
	            if (v2_3 != 0) {
	                v0 = 0;
	            }
	        } else {
	            if ((p7.b + 43200000) < this.b.a.a()) {
	                v0 = 0;
	            }
	        }
	        return v0;
	    }
	
