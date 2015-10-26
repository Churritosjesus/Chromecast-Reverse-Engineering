	private ei d
	
	    public ed()
	    {
	        return;
	    }
	
	
	    private ei a()
	    {
	        if (this.d == null) {
	            this.d = new ee(this);
	        }
	        return this.d;
	    }
	
	
	    public java.util.Set entrySet()
	    {
	        ek v0_0 = this.a();
	        if (v0_0.a == null) {
	            v0_0.a = new ek(v0_0);
	        }
	        return v0_0.a;
	    }
	
	
	    public java.util.Set keySet()
	    {
	        el v0_0 = this.a();
	        if (v0_0.b == null) {
	            v0_0.b = new el(v0_0);
	        }
	        return v0_0.b;
	    }
	
	
	    public void putAll(java.util.Map p6)
	    {
	        Object v0_1 = (this.c + p6.size());
	        if (this.a.length < v0_1) {
	            java.util.Iterator v1_3 = this.a;
	            Object v2_0 = this.b;
	            super.a(v0_1);
	            if (this.c > 0) {
	                System.arraycopy(v1_3, 0, this.a, 0, this.c);
	                System.arraycopy(v2_0, 0, this.b, 0, (this.c << 1));
	            }
	            ep.a(v1_3, v2_0, this.c);
	        }
	        java.util.Iterator v1_4 = p6.entrySet().iterator();
	        while (v1_4.hasNext()) {
	            Object v0_9 = ((java.util.Map$Entry) v1_4.next());
	            this.put(v0_9.getKey(), v0_9.getValue());
	        }
	        return;
	    }
	
	
	    public java.util.Collection values()
	    {
	        en v0_0 = this.a();
	        if (v0_0.c == null) {
	            v0_0.c = new en(v0_0);
	        }
	        return v0_0.c;
	    }
	
