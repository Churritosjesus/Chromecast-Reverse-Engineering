	public final java.util.Map a
	public final blp b
	
	    public ass()
	    {
	        this.a = new java.util.concurrent.ConcurrentHashMap();
	        this.b = new blp("CastConnectionManager");
	        return;
	    }
	
	
	    public final aqj a(aow p3)
	    {
	        aqj v0_3;
	        if (p3.a != null) {
	            v0_3 = ((aqj) this.a.get(p3.a));
	        } else {
	            v0_3 = 0;
	        }
	        return v0_3;
	    }
	
	
	    public final void b(aow p6)
	    {
	        java.util.Map v0_0 = this.a(p6);
	        if (v0_0 != null) {
	            String v1_1 = new Object[1];
	            v1_1[0] = p6.g();
	            v0_0.g();
	            v0_0.c();
	            this.a.remove(p6.a);
	            p6.b(0, 0);
	        }
	        return;
	    }
	
