	public final java.lang.String a
	public final java.lang.String b
	public final java.lang.String c
	public final  d
	
	    public ast(dbr p3)
	    {
	        long v0_5;
	        this.a = p3.a;
	        this.b = p3.b;
	        this.c = p3.c;
	        if (p3.d != null) {
	            v0_5 = p3.d.longValue();
	        } else {
	            v0_5 = 0;
	        }
	        this.d = v0_5;
	        return;
	    }
	
	
	    public ast(dbt p3, String p4)
	    {
	        this.a = p4;
	        this.b = p3.a;
	        this.c = p3.b;
	        this.d = System.currentTimeMillis();
	        return;
	    }
	
	
	    public final String toString()
	    {
	        return this.c;
	    }
	
