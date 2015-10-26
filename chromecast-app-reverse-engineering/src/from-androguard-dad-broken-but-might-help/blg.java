	public static final enum blg a
	public static final enum blg b
	public static final enum blg c
	private static final synthetic Lblg d
	
	    static blg()
	    {
	        blg.a = new blg("DO_NOT_SHOW", 0);
	        blg.b = new blg("SHOW_DEFAULT_ON", 1);
	        blg.c = new blg("SHOW_DEFAULT_OFF", 2);
	        blg[] v0_7 = new blg[3];
	        v0_7[0] = blg.a;
	        v0_7[1] = blg.b;
	        v0_7[2] = blg.c;
	        blg.d = v0_7;
	        return;
	    }
	
	
	    private blg(String p1, int p2)
	    {
	        this(p1, p2);
	        return;
	    }
	
	
	    public static blg valueOf(String p1)
	    {
	        return ((blg) Enum.valueOf(blg, p1));
	    }
	
	
	    public static blg[] values()
	    {
	        return ((blg[]) blg.d.clone());
	    }
	
