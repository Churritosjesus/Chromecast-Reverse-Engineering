	private static final java.lang.String b
	private static final java.lang.String c
	
	    static cws()
	    {
	        cws.b = cip.F.toString();
	        cws.c = cit.s.toString();
	        return;
	    }
	
	
	    public cws()
	    {
	        this(cws.b);
	        return;
	    }
	
	
	    protected final boolean a(String p3, String p4, java.util.Map p5)
	    {
	        int v0_5;
	        if (!cyh.d(((cje) p5.get(cws.c))).booleanValue()) {
	            v0_5 = 64;
	        } else {
	            v0_5 = 66;
	        }
	        try {
	            int v0_8 = java.util.regex.Pattern.compile(p4, v0_5).matcher(p3).find();
	        } catch (int v0) {
	            v0_8 = 0;
	        }
	        return v0_8;
	    }
	
