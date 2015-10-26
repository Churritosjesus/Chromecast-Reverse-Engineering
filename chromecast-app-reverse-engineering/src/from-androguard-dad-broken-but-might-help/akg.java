	public static final enum akg a
	private static enum akg d
	private static enum akg e
	private static final synthetic Lakg f
	final  b
	final  c
	
	    static akg()
	    {
	        akg.a = new akg("NATIVE_WITH_FALLBACK", 0, 1, 1);
	        akg.d = new akg("NATIVE_ONLY", 1, 1, 0);
	        akg.e = new akg("WEB_ONLY", 2, 0, 1);
	        akg[] v0_7 = new akg[3];
	        v0_7[0] = akg.a;
	        v0_7[1] = akg.d;
	        v0_7[2] = akg.e;
	        akg.f = v0_7;
	        return;
	    }
	
	
	    private akg(String p1, int p2, boolean p3, boolean p4)
	    {
	        this(p1, p2);
	        this.b = p3;
	        this.c = p4;
	        return;
	    }
	
	
	    public static akg valueOf(String p1)
	    {
	        return ((akg) Enum.valueOf(akg, p1));
	    }
	
	
	    public static akg[] values()
	    {
	        return ((akg[]) akg.f.clone());
	    }
	
