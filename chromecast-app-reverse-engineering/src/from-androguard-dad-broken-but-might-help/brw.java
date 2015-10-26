	public static final enum brw a
	private static enum brw b
	private static final synthetic Lbrw c
	
	    static brw()
	    {
	        brw.b = new brw("NONE", 0);
	        brw.a = new brw("GZIP", 1);
	        brw[] v0_5 = new brw[2];
	        v0_5[0] = brw.b;
	        v0_5[1] = brw.a;
	        brw.c = v0_5;
	        return;
	    }
	
	
	    private brw(String p1, int p2)
	    {
	        this(p1, p2);
	        return;
	    }
	
	
	    public static brw a(String p1)
	    {
	        brw v0_2;
	        if (!"GZIP".equalsIgnoreCase(p1)) {
	            v0_2 = brw.b;
	        } else {
	            v0_2 = brw.a;
	        }
	        return v0_2;
	    }
	
	
	    public static brw valueOf(String p1)
	    {
	        return ((brw) Enum.valueOf(brw, p1));
	    }
	
	
	    public static brw[] values()
	    {
	        return ((brw[]) brw.c.clone());
	    }
	
