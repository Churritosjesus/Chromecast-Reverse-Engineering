	public java.util.Map a
	
	    public bpw()
	    {
	        this.a = new java.util.HashMap(4);
	        return;
	    }
	
	
	    public final synthetic void a(cov p3)
	    {
	        ((bpw) p3).a.putAll(this.a);
	        return;
	    }
	
	
	    public final String toString()
	    {
	        java.util.HashMap v1_1 = new java.util.HashMap();
	        java.util.Iterator v2 = this.a.entrySet().iterator();
	        while (v2.hasNext()) {
	            String v0_5 = ((java.util.Map$Entry) v2.next());
	            v1_1.put(new StringBuilder("metric").append(v0_5.getKey()).toString(), v0_5.getValue());
	        }
	        return bpw.a(v1_1);
	    }
	
