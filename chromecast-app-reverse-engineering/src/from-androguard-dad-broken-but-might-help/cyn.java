	private static final java.lang.String b
	private final android.content.Context c
	
	    static cyn()
	    {
	        cyn.b = cip.d.toString();
	        return;
	    }
	
	
	    public cyn(android.content.Context p3)
	    {
	        String[] v1_1 = new String[0];
	        this(cyn.b, v1_1);
	        this.c = p3;
	        return;
	    }
	
	
	    public final cje a(java.util.Map p4)
	    {
	        try {
	            cje v0_1 = this.c.getPackageManager();
	            cje v0_4 = cyh.a(v0_1.getApplicationLabel(v0_1.getApplicationInfo(this.c.getPackageName(), 0)).toString());
	        } catch (cje v0_5) {
	            cuh.a("App name is not found.", v0_5);
	            v0_4 = cyh.f();
	        }
	        return v0_4;
	    }
	
	
	    public final boolean a()
	    {
	        return 1;
	    }
	
