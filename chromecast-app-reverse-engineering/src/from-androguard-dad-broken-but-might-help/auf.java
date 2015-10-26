	private static final java.lang.String n
	private static final java.lang.String o
	private static  q
	private static  r
	private final aea p
	private final java.lang.String s
	
	    public auf(String p6, dcg p7, aea p8, adz p9)
	    {
	        long v0_2;
	        if (p7.a.intValue() != 1) {
	            v0_2 = auf.o;
	        } else {
	            v0_2 = auf.n;
	        }
	        String v1_2 = asr.a(p6, "/devices");
	        byte[] v2_1 = new byte[p7.d()];
	        p7.a(dep.a(v2_1, 0, v2_1.length));
	        this(v0_2, v1_2, v2_1, new aug(p9));
	        this.i = asr.a(com.google.android.apps.chromecast.app.SetupApplication.a());
	        this.s = p7.b;
	        this.p = p8;
	        auf.q = p7.a.intValue();
	        auf.r = android.os.SystemClock.elapsedRealtime();
	        return;
	    }
	
	
	    static synthetic void a(int p1)
	    {
	        auf.b(1);
	        return;
	    }
	
	
	    private static void b(int p6)
	    {
	        apd v0_2;
	        long v2_1 = (android.os.SystemClock.elapsedRealtime() - auf.r);
	        ape v1 = ape.a();
	        if (auf.q != 1) {
	            v0_2 = 81;
	        } else {
	            v0_2 = 74;
	        }
	        v1.a(new apd(v0_2).a(p6).b(v2_1));
	        return;
	    }
	
	
	    protected final synthetic void a(Object p8)
	    {
	        auf.b(0);
	        if (this.p != null) {
	            String v0_5;
	            if (((byte[]) p8) == null) {
	                v0_5 = 0;
	            } else {
	                try {
	                    v0_5 = ((dch) dew.a(new dch(), ((byte[]) p8)));
	                } catch (String v0_6) {
	                    if (auf.q != 1) {
	                        String v0_8 = "UnlinkDevice";
	                    } else {
	                        v0_8 = "LinkDevice";
	                    }
	                    String v2_2 = String.valueOf(v0_6.toString());
	                    android.util.Log.w("LinkDevice", new StringBuilder(((String.valueOf(v0_8).length() + 50) + String.valueOf(v2_2).length())).append("Could not load devices association response for ").append(v0_8).append(": ").append(v2_2).toString());
	                }
	            }
	            this.p.a(v0_5);
	        }
	        return;
	    }
	
	
	    public final String g()
	    {
	        String v0_1;
	        if (auf.q != 1) {
	            v0_1 = "oauth2:https://www.google.com/accounts/OAuthLogin https://www.googleapis.com/auth/grants.audit";
	        } else {
	            v0_1 = "oauth2:https://www.google.com/accounts/OAuthLogin";
	        }
	        return v0_1;
	    }
	
	
	    public final String h()
	    {
	        return this.s;
	    }
	
