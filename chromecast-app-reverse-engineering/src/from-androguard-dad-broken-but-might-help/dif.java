	public static final enum dif a
	public static final enum dif b
	public static final enum dif c
	public static final enum dif d
	private static final synthetic Ldif e
	
	    static dif()
	    {
	        dif.a = new dif("SPDY_SYN_STREAM", 0);
	        dif.b = new dif("SPDY_REPLY", 1);
	        dif.c = new dif("SPDY_HEADERS", 2);
	        dif.d = new dif("HTTP_20_HEADERS", 3);
	        dif[] v0_9 = new dif[4];
	        v0_9[0] = dif.a;
	        v0_9[1] = dif.b;
	        v0_9[2] = dif.c;
	        v0_9[3] = dif.d;
	        dif.e = v0_9;
	        return;
	    }
	
	
	    private dif(String p1, int p2)
	    {
	        this(p1, p2);
	        return;
	    }
	
	
	    public static dif valueOf(String p1)
	    {
	        return ((dif) Enum.valueOf(dif, p1));
	    }
	
	
	    public static dif[] values()
	    {
	        return ((dif[]) dif.e.clone());
	    }
	
