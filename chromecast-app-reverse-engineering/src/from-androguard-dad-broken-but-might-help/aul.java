	private final blp n
	private final aea o
	private final java.lang.String p
	
	    public aul(String p5, String p6, String p7, dca p8, String p9, int p10, int p11, int p12, aea p13, adz p14)
	    {
	        String v1_1 = asr.a(p5, "/settings/preview");
	        byte[] v2_1 = new dcc();
	        v2_1.a = p7;
	        v2_1.b = p8;
	        v2_1.c = p9;
	        v2_1.d = Integer.valueOf(p10);
	        v2_1.e = Integer.valueOf(p11);
	        v2_1.f = Integer.valueOf(p12);
	        this("LoadPreviewRequest", v1_1, dcc.a(v2_1), p14);
	        this.n = new blp("LoadPreviewRequest");
	        this.i = asr.a(com.google.android.apps.chromecast.app.SetupApplication.a());
	        this.o = p13;
	        this.p = p6;
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
	                    v0_1 = dcd.a(((byte[]) p9));
	                } catch (String v0_2) {
	                    blp v2 = this.n;
	                    Object[] v4_1 = new Object[1];
	                    String v0_4 = String.valueOf(v0_2.toString());
	                    if (v0_4.length() == 0) {
	                        String v0_6 = new String("Could not load album preview: ");
	                    } else {
	                        v0_6 = "Could not load album preview: ".concat(v0_4);
	                    }
	                    v4_1[0] = v0_6;
	                    v2.a("LoadPreviewRequest", v4_1);
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
	
