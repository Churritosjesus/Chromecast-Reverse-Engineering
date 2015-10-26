	public static final enum adu a
	public static final enum adu b
	private static enum adu c
	private static enum adu d
	private static final synthetic Ladu e
	
	    static adu()
	    {
	        adu.a = new adu("LOW", 0);
	        adu.b = new adu("NORMAL", 1);
	        adu.c = new adu("HIGH", 2);
	        adu.d = new adu("IMMEDIATE", 3);
	        adu[] v0_9 = new adu[4];
	        v0_9[0] = adu.a;
	        v0_9[1] = adu.b;
	        v0_9[2] = adu.c;
	        v0_9[3] = adu.d;
	        adu.e = v0_9;
	        return;
	    }
	
	
	    private adu(String p1, int p2)
	    {
	        this(p1, p2);
	        return;
	    }
	
	
	    public static adu valueOf(String p1)
	    {
	        return ((adu) Enum.valueOf(adu, p1));
	    }
	
	
	    public static adu[] values()
	    {
	        return ((adu[]) adu.e.clone());
	    }
	
