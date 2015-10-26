	private final aea n
	
	    public auk(String p3, aea p4, adz p5)
	    {
	        this("LoadDevices", asr.a(p3, "/devices"), p5);
	        this.i = asr.a(com.google.android.apps.chromecast.app.SetupApplication.a());
	        this.n = p4;
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
	                    v0_1 = dbs.a(((byte[]) p6));
	                } catch (String v0_2) {
	                    String v0_4 = String.valueOf(v0_2.toString());
	                    if (v0_4.length() == 0) {
	                        String v0_6 = new String("Could not load backdrop device list: ");
	                    } else {
	                        v0_6 = "Could not load backdrop device list: ".concat(v0_4);
	                    }
	                    android.util.Log.w("LoadDevices", v0_6);
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
	        return 0;
	    }
	
