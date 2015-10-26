	public static final enum ahq a
	public static final enum ahq b
	public static final enum ahq c
	private static enum ahq d
	private static final synthetic Lahq e
	
	    static ahq()
	    {
	        ahq.a = new ahq("SUCCESS", 0);
	        ahq.b = new ahq("SERVER_ERROR", 1);
	        ahq.c = new ahq("NO_CONNECTIVITY", 2);
	        ahq.d = new ahq("UNKNOWN_ERROR", 3);
	        ahq[] v0_9 = new ahq[4];
	        v0_9[0] = ahq.a;
	        v0_9[1] = ahq.b;
	        v0_9[2] = ahq.c;
	        v0_9[3] = ahq.d;
	        ahq.e = v0_9;
	        return;
	    }
	
	
	    private ahq(String p1, int p2)
	    {
	        this(p1, p2);
	        return;
	    }
	
	
	    public static ahq valueOf(String p1)
	    {
	        return ((ahq) Enum.valueOf(ahq, p1));
	    }
	
	
	    public static ahq[] values()
	    {
	        return ((ahq[]) ahq.e.clone());
	    }
	
