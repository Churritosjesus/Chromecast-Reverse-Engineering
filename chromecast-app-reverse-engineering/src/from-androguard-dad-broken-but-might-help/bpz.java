	private java.util.Map a
	
	    public bpz()
	    {
	        this.a = new java.util.HashMap();
	        return;
	    }
	
	
	    public final java.util.Map a(String p6)
	    {
	        java.util.HashMap v2_1 = new java.util.HashMap();
	        java.util.Iterator v3 = this.a.entrySet().iterator();
	        while (v3.hasNext()) {
	            Object v0_4 = ((java.util.Map$Entry) v3.next());
	            v2_1.put(new StringBuilder().append(p6).append(((String) v0_4.getKey())).toString(), v0_4.getValue());
	        }
	        return v2_1;
	    }
	
	
	    public final void a(String p2, String p3)
	    {
	        a.f(p2, "Name should be non-null");
	        this.a.put(p2, p3);
	        return;
	    }
	
	
	    public final String toString()
	    {
	        return cov.a(this.a);
	    }
	
