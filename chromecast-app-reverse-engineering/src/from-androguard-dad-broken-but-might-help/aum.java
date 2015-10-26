	private final blp n
	private final aea o
	private final java.lang.String p
	
	    public aum(String p7, String p8, dck p9, aea p10, adz p11)
	    {
	        String v1_1 = asr.a(p7, "/settings/device");
	        dbu v2_1 = new dbu();
	        v2_1.a = p8;
	        v2_1.b = p9;
	        byte[] v3_1 = new byte[v2_1.d()];
	        v2_1.a(dep.a(v3_1, 0, v3_1.length));
	        this("SaveDeviceBackdropSettingsRequest", v1_1, v3_1, p11);
	        this.n = new blp("SaveDeviceBackdropSettingsRequest");
	        this.i = asr.a(com.google.android.apps.chromecast.app.SetupApplication.a());
	        this.p = p8;
	        this.o = p10;
	        return;
	    }
	
	
	    protected final synthetic void a(Object p5)
	    {
	        if (((byte[]) p5) != null) {
	            try {
	                Integer v0_0 = dbv.a(((byte[]) p5));
	            } catch (Integer v0_2) {
	                int v1_1 = this.n;
	                Integer v0_4 = String.valueOf(v0_2.toString());
	                if (v0_4.length() == 0) {
	                    Integer v0_6 = new String("Could not save device backdrop settings: ");
	                } else {
	                    v0_6 = "Could not save device backdrop settings: ".concat(v0_4);
	                }
	                Object[] v2_2 = new Object[0];
	                v1_1.a(v0_6, v2_2);
	            }
	            if ((v0_0 != null) && (v0_0.d != null)) {
	                v0_0.d.intValue();
	            }
	        }
	        if (this.o != null) {
	            this.o.a(0);
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
	
