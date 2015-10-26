	private synthetic aer a
	
	    aeu(aer p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    public final void run()
	    {
	        java.util.Iterator v2 = this.a.c.values().iterator();
	        while (v2.hasNext()) {
	            int v1_2 = ((aev) v2.next());
	            java.util.Iterator v3 = v1_2.c.iterator();
	            while (v3.hasNext()) {
	                aey v0_11 = ((aex) v3.next());
	                if (v0_11.b != null) {
	                    if (v1_2.b != null) {
	                        v0_11.b.a(v1_2.b);
	                    } else {
	                        v0_11.a = v1_2.a;
	                        v0_11.b.a(v0_11, 0);
	                    }
	                }
	            }
	        }
	        this.a.c.clear();
	        this.a.d = 0;
	        return;
	    }
	
