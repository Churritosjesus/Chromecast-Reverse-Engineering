	public static final enum ahw a
	public static final enum ahw b
	private static final synthetic Lahw c
	
	    static ahw()
	    {
	        ahw.a = new ahw("MOBILE_INSTALL_EVENT", 0);
	        ahw.b = new ahw("CUSTOM_APP_EVENTS", 1);
	        ahw[] v0_5 = new ahw[2];
	        v0_5[0] = ahw.a;
	        v0_5[1] = ahw.b;
	        ahw.c = v0_5;
	        return;
	    }
	
	
	    private ahw(String p1, int p2)
	    {
	        this(p1, p2);
	        return;
	    }
	
	
	    public static ahw valueOf(String p1)
	    {
	        return ((ahw) Enum.valueOf(ahw, p1));
	    }
	
	
	    public static ahw[] values()
	    {
	        return ((ahw[]) ahw.c.clone());
	    }
	
