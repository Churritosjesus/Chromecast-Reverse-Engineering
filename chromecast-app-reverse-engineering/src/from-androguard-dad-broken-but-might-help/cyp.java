	private static final java.lang.String b
	private final android.content.Context c
	
	    static cyp()
	    {
	        cyp.b = cip.R.toString();
	        return;
	    }
	
	
	    public cyp(android.content.Context p3)
	    {
	        String[] v1_1 = new String[0];
	        this(cyp.b, v1_1);
	        this.c = p3;
	        return;
	    }
	
	
	    public final cje a(java.util.Map p4)
	    {
	        try {
	            cje v0_4 = cyh.a(this.c.getPackageManager().getPackageInfo(this.c.getPackageName(), 0).versionName);
	        } catch (cje v0_5) {
	            cuh.a(new StringBuilder("Package name ").append(this.c.getPackageName()).append(" not found. ").append(v0_5.getMessage()).toString());
	            v0_4 = cyh.f();
	        }
	        return v0_4;
	    }
	
	
	    public final boolean a()
	    {
	        return 1;
	    }
	
