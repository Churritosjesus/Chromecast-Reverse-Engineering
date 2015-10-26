	private final blp n
	private final aea o
	private final java.lang.String p
	
	    public bbw(String p5, String p6, dcm p7, String p8, aea p9, adz p10)
	    {
	        String v1_1 = asr.a(p5, "/oauth-cb");
	        byte[] v2_1 = new dcl();
	        v2_1.e = p8;
	        v2_1.c = Boolean.valueOf(1);
	        v2_1.d = p7;
	        this("OAuthCallbackRequest", v1_1, dcl.a(v2_1), p10);
	        this.n = new blp("OAuthCallbackRequest");
	        this.p = p6;
	        this.o = p9;
	        return;
	    }
	
	
	    public bbw(String p5, String p6, String p7, String p8, String p9, aea p10, adz p11)
	    {
	        String v1_1 = asr.a(p5, "/oauth-cb");
	        byte[] v2_1 = new dcl();
	        v2_1.a = p7;
	        v2_1.b = p8;
	        v2_1.e = p9;
	        v2_1.c = Boolean.valueOf(1);
	        this("OAuthCallbackRequest", v1_1, dcl.a(v2_1), p11);
	        this.n = new blp("OAuthCallbackRequest");
	        this.i = asr.a(com.google.android.apps.chromecast.app.SetupApplication.a());
	        this.p = p6;
	        this.o = p10;
	        return;
	    }
	
	
	    protected final synthetic void a(Object p9)
	    {
	        if (this.o != null) {
	            String v0_1;
	            if (((byte[]) p9) == null) {
	                v0_1 = 0;
	            } else {
	                try {
	                    v0_1 = dbv.a(((byte[]) p9));
	                } catch (String v0_2) {
	                    blp v2 = this.n;
	                    Object[] v4_1 = new Object[1];
	                    String v0_4 = String.valueOf(v0_2.toString());
	                    if (v0_4.length() == 0) {
	                        String v0_6 = new String("Could not load device backdrop settings: ");
	                    } else {
	                        v0_6 = "Could not load device backdrop settings: ".concat(v0_4);
	                    }
	                    v4_1[0] = v0_6;
	                    v2.a("OAuthCallbackRequest", v4_1);
	                }
	            }
	            this.o.a(v0_1);
	        }
	        return;
	    }
	
	
	    public final String g()
	    {
	        return "oauth2:https://www.google.com/accounts/OAuthLogin";
	    }
	
	
	    public final String h()
	    {
	        return this.p;
	    }
	
