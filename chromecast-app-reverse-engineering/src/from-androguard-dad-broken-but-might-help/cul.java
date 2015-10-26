	public static final enum cul a
	public static final enum cul b
	public static final enum cul c
	private static final synthetic Lcul d
	
	    static cul()
	    {
	        cul.a = new cul("NONE", 0);
	        cul.b = new cul("CONTAINER", 1);
	        cul.c = new cul("CONTAINER_DEBUG", 2);
	        cul[] v0_7 = new cul[3];
	        v0_7[0] = cul.a;
	        v0_7[1] = cul.b;
	        v0_7[2] = cul.c;
	        cul.d = v0_7;
	        return;
	    }
	
	
	    private cul(String p1, int p2)
	    {
	        this(p1, p2);
	        return;
	    }
	
	
	    public static cul valueOf(String p1)
	    {
	        return ((cul) Enum.valueOf(cul, p1));
	    }
	
	
	    public static cul[] values()
	    {
	        return ((cul[]) cul.d.clone());
	    }
	
