	public static final enum ahp a
	public static final enum ahp b
	private static enum ahp c
	private static enum ahp d
	private static enum ahp e
	private static enum ahp f
	private static final synthetic Lahp g
	
	    static ahp()
	    {
	        ahp.c = new ahp("EXPLICIT", 0);
	        ahp.a = new ahp("TIMER", 1);
	        ahp.d = new ahp("SESSION_CHANGE", 2);
	        ahp.e = new ahp("PERSISTED_EVENTS", 3);
	        ahp.b = new ahp("EVENT_THRESHOLD", 4);
	        ahp.f = new ahp("EAGER_FLUSHING_EVENT", 5);
	        ahp[] v0_13 = new ahp[6];
	        v0_13[0] = ahp.c;
	        v0_13[1] = ahp.a;
	        v0_13[2] = ahp.d;
	        v0_13[3] = ahp.e;
	        v0_13[4] = ahp.b;
	        v0_13[5] = ahp.f;
	        ahp.g = v0_13;
	        return;
	    }
	
	
	    private ahp(String p1, int p2)
	    {
	        this(p1, p2);
	        return;
	    }
	
	
	    public static ahp valueOf(String p1)
	    {
	        return ((ahp) Enum.valueOf(ahp, p1));
	    }
	
	
	    public static ahp[] values()
	    {
	        return ((ahp[]) ahp.g.clone());
	    }
	
