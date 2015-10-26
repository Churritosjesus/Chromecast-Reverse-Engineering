	final java.util.Map a
	private final java.util.Map b
	private final java.util.Map c
	
	    public bti()
	    {
	        this.b = new java.util.HashMap();
	        this.a = new java.util.HashMap();
	        this.c = new java.util.HashMap();
	        return;
	    }
	
	
	    public final int a(String p2)
	    {
	        int v0_3;
	        int v0_2 = ((Integer) this.c.get(p2));
	        if (v0_2 == 0) {
	            v0_3 = 0;
	        } else {
	            v0_3 = v0_2.intValue();
	        }
	        return v0_3;
	    }
	
	
	    public final bti a(String p3, String p4, int p5)
	    {
	        this.b.put(p3, p4);
	        this.a.put(p4, p3);
	        this.c.put(p3, Integer.valueOf(p5));
	        return this;
	    }
	
