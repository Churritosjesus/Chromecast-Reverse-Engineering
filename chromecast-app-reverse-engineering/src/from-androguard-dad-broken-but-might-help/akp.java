	public static final enum akp a
	public static final enum akp b
	public static final enum akp c
	private static final synthetic Lakp e
	final java.lang.String d
	
	    static akp()
	    {
	        akp.a = new akp("SUCCESS", 0, "success");
	        akp.b = new akp("CANCEL", 1, "cancel");
	        akp.c = new akp("ERROR", 2, "error");
	        akp[] v0_7 = new akp[3];
	        v0_7[0] = akp.a;
	        v0_7[1] = akp.b;
	        v0_7[2] = akp.c;
	        akp.e = v0_7;
	        return;
	    }
	
	
	    private akp(String p1, int p2, String p3)
	    {
	        this(p1, p2);
	        this.d = p3;
	        return;
	    }
	
	
	    public static akp valueOf(String p1)
	    {
	        return ((akp) Enum.valueOf(akp, p1));
	    }
	
	
	    public static akp[] values()
	    {
	        return ((akp[]) akp.e.clone());
	    }
	
