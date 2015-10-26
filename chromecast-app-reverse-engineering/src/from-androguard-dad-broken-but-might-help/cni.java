	public static final bvz a
	public static cnd b
	private static final bwe c
	private static final bwd d
	
	    static cni()
	    {
	        cni.c = new bwe();
	        cni.d = new cnj();
	        com.google.android.gms.common.api.Scope[] v4_1 = new com.google.android.gms.common.api.Scope[0];
	        cni.a = new bvz("LocationServices.API", cni.d, cni.c, v4_1);
	        cni.b = new cnd();
	        new cne();
	        new cnl();
	        return;
	    }
	
	
	    public static cod a(com.google.android.gms.common.api.GoogleApiClient p4)
	    {
	        cod v0_0;
	        String v1 = 1;
	        if (p4 == null) {
	            v0_0 = 0;
	        } else {
	            v0_0 = 1;
	        }
	        a.b(v0_0, "GoogleApiClient parameter is required.");
	        cod v0_3 = ((cod) p4.a(cni.c));
	        if (v0_3 == null) {
	            v1 = 0;
	        }
	        a.a(v1, "GoogleApiClient is not configured to use the LocationServices.API Api. Pass thisinto GoogleApiClient.Builder#addApi() to use this feature.");
	        return v0_3;
	    }
	
