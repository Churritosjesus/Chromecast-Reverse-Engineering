	private final aea n
	private final java.lang.String o
	
	    public aup(String p5, String p6, String p7, aea p8, adz p9)
	    {
	        String v1_1 = asr.a(p5, "/third-party-revocation");
	        byte[] v2_1 = new dcl();
	        v2_1.e = p7;
	        v2_1.c = Boolean.valueOf(1);
	        this("ThirdPartyRevocationRequest", v1_1, dcl.a(v2_1), p9);
	        this.o = p6;
	        this.n = p8;
	        return;
	    }
	
	
	    protected final synthetic void a(Object p6)
	    {
	        if (this.n != null) {
	            String v0_1;
	            if (((byte[]) p6) == null) {
	                v0_1 = 0;
	            } else {
	                try {
	                    v0_1 = dbv.a(((byte[]) p6));
	                } catch (String v0_2) {
	                    String v0_4 = String.valueOf(v0_2.toString());
	                    if (v0_4.length() == 0) {
	                        String v0_6 = new String("Could not load device backdrop settings: ");
	                    } else {
	                        v0_6 = "Could not load device backdrop settings: ".concat(v0_4);
	                    }
	                    android.util.Log.w("ThirdPartyRevocationRequest", v0_6);
	                }
	            }
	            this.n.a(v0_1);
	        }
	        return;
	    }
	
	
	    public final String g()
	    {
	        return "oauth2:https://www.google.com/accounts/OAuthLogin";
	    }
	
	
	    public final String h()
	    {
	        return this.o;
	    }
	
