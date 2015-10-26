	public static final enum dco a
	public static final enum dco b
	public static final enum dco c
	private static enum dco e
	private static enum dco f
	private static final synthetic Ldco g
	final  d
	
	    static dco()
	    {
	        dco.e = new dco("UNKNOWN", 0, 0);
	        dco.a = new dco("PRIMARY", 1, 1);
	        dco.b = new dco("SECONDARY", 2, 2);
	        dco.f = new dco("PERSONALIZED", 3, 3);
	        dco.c = new dco("PERSONALIZATION_FLOW", 4, 4);
	        dcp v0_11 = new dco[5];
	        v0_11[0] = dco.e;
	        v0_11[1] = dco.a;
	        v0_11[2] = dco.b;
	        v0_11[3] = dco.f;
	        v0_11[4] = dco.c;
	        dco.g = v0_11;
	        new dcp();
	        return;
	    }
	
	
	    private dco(String p1, int p2, int p3)
	    {
	        this(p1, p2);
	        this.d = p3;
	        return;
	    }
	
	
	    public static dco a(int p1)
	    {
	        dco v0;
	        switch (p1) {
	            case 0:
	                v0 = dco.e;
	                break;
	            case 1:
	                v0 = dco.a;
	                break;
	            case 2:
	                v0 = dco.b;
	                break;
	            case 3:
	                v0 = dco.f;
	                break;
	            case 4:
	                v0 = dco.c;
	                break;
	            default:
	                v0 = 0;
	        }
	        return v0;
	    }
	
	
	    public static dco valueOf(String p1)
	    {
	        return ((dco) Enum.valueOf(dco, p1));
	    }
	
	
	    public static dco[] values()
	    {
	        return ((dco[]) dco.g.clone());
	    }
	
