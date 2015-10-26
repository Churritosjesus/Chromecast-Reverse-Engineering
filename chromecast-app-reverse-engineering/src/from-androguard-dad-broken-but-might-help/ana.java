	public static final enum ana a
	public static final enum ana b
	public static final enum ana c
	private static final synthetic Lana f
	public  d
	public java.lang.Class e
	
	    static ana()
	    {
	        ana.a = new ana("BROWSE", 0, b.dY, awn);
	        ana.b = new ana("DEVICES", 1, b.bM, ama);
	        ana.c = new ana("GET_APPS", 2, b.bz, baz);
	        ana[] v0_7 = new ana[3];
	        v0_7[0] = ana.a;
	        v0_7[1] = ana.b;
	        v0_7[2] = ana.c;
	        ana.f = v0_7;
	        return;
	    }
	
	
	    private ana(String p1, int p2, int p3, Class p4)
	    {
	        this(p1, p2);
	        this.d = p3;
	        this.e = p4;
	        return;
	    }
	
	
	    public static ana valueOf(String p1)
	    {
	        return ((ana) Enum.valueOf(ana, p1));
	    }
	
	
	    public static ana[] values()
	    {
	        return ((ana[]) ana.f.clone());
	    }
	
