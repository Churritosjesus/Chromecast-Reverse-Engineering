	final synthetic acb a
	
	    acp(acb p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    protected final synthetic Object doInBackground(Object[] p6)
	    {
	        java.util.ArrayList v1 = ((java.util.ArrayList[]) p6)[0];
	        java.util.ArrayList v2_1 = new java.util.ArrayList();
	        acq v3_0 = v1.iterator();
	        while (v3_0.hasNext()) {
	            String v0_6 = ((ada) v3_0.next());
	            if (v0_6 != null) {
	                v2_1.add(this.a.a(v0_6.g()));
	            }
	        }
	        this.a.g().a(v2_1, new acq(this, v1));
	        return 0;
	    }
	
