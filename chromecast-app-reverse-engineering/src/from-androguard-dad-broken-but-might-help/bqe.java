	private final java.lang.Object a
	private final cks b
	
	    bqe(cks p1, Object p2)
	    {
	        a.c(p1);
	        this.b = p1;
	        this.a = p2;
	        return;
	    }
	
	
	    static bqe a(String p3, int p4, int p5)
	    {
	        return new bqe(cks.a(p3, Integer.valueOf(p5)), Integer.valueOf(p4));
	    }
	
	
	    static bqe a(String p3, long p4, long p6)
	    {
	        return new bqe(cks.a(p3, Long.valueOf(p6)), Long.valueOf(p4));
	    }
	
	
	    static bqe a(String p2, String p3, String p4)
	    {
	        return new bqe(cks.a(p2, p4), p3);
	    }
	
	
	    static bqe a(String p3, boolean p4)
	    {
	        return new bqe(cks.a(p3, p4), Boolean.valueOf(p4));
	    }
	
	
	    public final Object a()
	    {
	        if ((!byk.a) || (!cks.b())) {
	            Object v0_2 = this.a;
	        } else {
	            v0_2 = this.b.d();
	        }
	        return v0_2;
	    }
	
