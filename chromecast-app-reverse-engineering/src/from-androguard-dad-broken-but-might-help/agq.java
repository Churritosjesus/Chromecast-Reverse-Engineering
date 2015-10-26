	public static final enum agq a
	public static final enum agq b
	private static enum agq c
	private static final synthetic Lagq d
	
	    static agq()
	    {
	        agq.a = new agq("GET", 0);
	        agq.b = new agq("POST", 1);
	        agq.c = new agq("DELETE", 2);
	        agq[] v0_7 = new agq[3];
	        v0_7[0] = agq.a;
	        v0_7[1] = agq.b;
	        v0_7[2] = agq.c;
	        agq.d = v0_7;
	        return;
	    }
	
	
	    private agq(String p1, int p2)
	    {
	        this(p1, p2);
	        return;
	    }
	
	
	    public static agq valueOf(String p1)
	    {
	        return ((agq) Enum.valueOf(agq, p1));
	    }
	
	
	    public static agq[] values()
	    {
	        return ((agq[]) agq.d.clone());
	    }
	
