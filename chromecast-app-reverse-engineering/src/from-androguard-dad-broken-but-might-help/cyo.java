	private static final java.lang.String b
	private final android.content.Context c
	
	    static cyo()
	    {
	        cyo.b = cip.e.toString();
	        return;
	    }
	
	
	    public cyo(android.content.Context p3)
	    {
	        String[] v1_1 = new String[0];
	        this(cyo.b, v1_1);
	        this.c = p3;
	        return;
	    }
	
	
	    public final cje a(java.util.Map p4)
	    {
	        try {
	            cje v0_5 = cyh.a(Integer.valueOf(this.c.getPackageManager().getPackageInfo(this.c.getPackageName(), 0).versionCode));
	        } catch (cje v0_6) {
	            cuh.a(new StringBuilder("Package name ").append(this.c.getPackageName()).append(" not found. ").append(v0_6.getMessage()).toString());
	            v0_5 = cyh.f();
	        }
	        return v0_5;
	    }
	
	
	    public final boolean a()
	    {
	        return 1;
	    }
	
