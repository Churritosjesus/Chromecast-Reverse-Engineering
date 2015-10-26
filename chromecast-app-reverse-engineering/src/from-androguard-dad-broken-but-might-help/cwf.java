	private static final java.lang.String b
	private final android.content.Context c
	
	    static cwf()
	    {
	        cwf.b = cip.A.toString();
	        return;
	    }
	
	
	    public cwf(android.content.Context p3)
	    {
	        String[] v1_1 = new String[0];
	        this(cwf.b, v1_1);
	        this.c = p3;
	        return;
	    }
	
	
	    public final cje a(java.util.Map p3)
	    {
	        cje v0_3;
	        cje v0_2 = android.provider.Settings$Secure.getString(this.c.getContentResolver(), "android_id");
	        if (v0_2 != null) {
	            v0_3 = cyh.a(v0_2);
	        } else {
	            v0_3 = cyh.f();
	        }
	        return v0_3;
	    }
	
	
	    public final boolean a()
	    {
	        return 1;
	    }
	
