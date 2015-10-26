	public static final enum brs a
	public static final enum brs b
	private static enum brs c
	private static enum brs d
	private static enum brs e
	private static enum brs f
	private static final synthetic Lbrs g
	
	    static brs()
	    {
	        brs.a = new brs("NONE", 0);
	        brs.c = new brs("BATCH_BY_SESSION", 1);
	        brs.d = new brs("BATCH_BY_TIME", 2);
	        brs.e = new brs("BATCH_BY_BRUTE_FORCE", 3);
	        brs.b = new brs("BATCH_BY_COUNT", 4);
	        brs.f = new brs("BATCH_BY_SIZE", 5);
	        brs[] v0_13 = new brs[6];
	        v0_13[0] = brs.a;
	        v0_13[1] = brs.c;
	        v0_13[2] = brs.d;
	        v0_13[3] = brs.e;
	        v0_13[4] = brs.b;
	        v0_13[5] = brs.f;
	        brs.g = v0_13;
	        return;
	    }
	
	
	    private brs(String p1, int p2)
	    {
	        this(p1, p2);
	        return;
	    }
	
	
	    public static brs a(String p1)
	    {
	        brs v0_10;
	        if (!"BATCH_BY_SESSION".equalsIgnoreCase(p1)) {
	            if (!"BATCH_BY_TIME".equalsIgnoreCase(p1)) {
	                if (!"BATCH_BY_BRUTE_FORCE".equalsIgnoreCase(p1)) {
	                    if (!"BATCH_BY_COUNT".equalsIgnoreCase(p1)) {
	                        if (!"BATCH_BY_SIZE".equalsIgnoreCase(p1)) {
	                            v0_10 = brs.a;
	                        } else {
	                            v0_10 = brs.f;
	                        }
	                    } else {
	                        v0_10 = brs.b;
	                    }
	                } else {
	                    v0_10 = brs.e;
	                }
	            } else {
	                v0_10 = brs.d;
	            }
	        } else {
	            v0_10 = brs.c;
	        }
	        return v0_10;
	    }
	
	
	    public static brs valueOf(String p1)
	    {
	        return ((brs) Enum.valueOf(brs, p1));
	    }
	
	
	    public static brs[] values()
	    {
	        return ((brs[]) brs.g.clone());
	    }
	
