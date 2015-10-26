	private java.util.Map a
	
	    public bqa(String p2)
	    {
	        this.a = new java.util.HashMap();
	        this.a("&pa", p2);
	        return;
	    }
	
	
	    public final java.util.Map a()
	    {
	        return new java.util.HashMap(this.a);
	    }
	
	
	    public final void a(String p2, String p3)
	    {
	        a.f(p2, "Name should be non-null");
	        this.a.put(p2, p3);
	        return;
	    }
	
	
	    public final String toString()
	    {
	        java.util.HashMap v2_1 = new java.util.HashMap();
	        java.util.Iterator v3 = this.a.entrySet().iterator();
	        while (v3.hasNext()) {
	            Object v0_5 = ((java.util.Map$Entry) v3.next());
	            if (!((String) v0_5.getKey()).startsWith("&")) {
	                v2_1.put(v0_5.getKey(), v0_5.getValue());
	            } else {
	                v2_1.put(((String) v0_5.getKey()).substring(1), v0_5.getValue());
	            }
	        }
	        return cov.a(v2_1);
	    }
	
