	public static final enum ags a
	public static final enum ags b
	public static final enum ags c
	public static final enum ags d
	public static final enum ags e
	public static final enum ags f
	public static final enum ags g
	public static final enum ags h
	private static final synthetic Lags i
	
	    static ags()
	    {
	        ags.a = new ags("REQUESTS", 0);
	        ags.b = new ags("INCLUDE_ACCESS_TOKENS", 1);
	        ags.c = new ags("INCLUDE_RAW_RESPONSES", 2);
	        ags.d = new ags("CACHE", 3);
	        ags.e = new ags("APP_EVENTS", 4);
	        ags.f = new ags("DEVELOPER_ERRORS", 5);
	        ags.g = new ags("GRAPH_API_DEBUG_WARNING", 6);
	        ags.h = new ags("GRAPH_API_DEBUG_INFO", 7);
	        ags[] v0_17 = new ags[8];
	        v0_17[0] = ags.a;
	        v0_17[1] = ags.b;
	        v0_17[2] = ags.c;
	        v0_17[3] = ags.d;
	        v0_17[4] = ags.e;
	        v0_17[5] = ags.f;
	        v0_17[6] = ags.g;
	        v0_17[7] = ags.h;
	        ags.i = v0_17;
	        return;
	    }
	
	
	    private ags(String p1, int p2)
	    {
	        this(p1, p2);
	        return;
	    }
	
	
	    public static ags valueOf(String p1)
	    {
	        return ((ags) Enum.valueOf(ags, p1));
	    }
	
	
	    public static ags[] values()
	    {
	        return ((ags[]) ags.i.clone());
	    }
	
