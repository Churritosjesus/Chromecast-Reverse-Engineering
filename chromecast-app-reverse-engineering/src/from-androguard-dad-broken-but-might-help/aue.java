	private final blp n
	private final aea o
	private final java.lang.String p
	
	    public aue(String p12, String p13, long p14, String p16, String p17, aea p18, adz p19)
	    {
	        aec v2_8;
	        int v6_0 = new Object[4];
	        v6_0[0] = aue.c(p13);
	        if (p14 != 0) {
	            v2_8 = new StringBuilder(22).append("\'").append(p14).append("\'").toString();
	        } else {
	            v2_8 = "";
	        }
	        v6_0[1] = v2_8;
	        v6_0[2] = aue.c(p16);
	        v6_0[3] = aue.c(p17);
	        aec v2_12 = android.net.Uri.encode(String.format(java.util.Locale.US, "[%s,,,%s,%s,%s,,1]", v6_0), "utf-8");
	        Object[] v5_2 = new Object[2];
	        v5_2[0] = blj.c();
	        v5_2[1] = v2_12;
	        this("DeviceBackdropSettings", asr.a(p12, String.format("/settings/device?hl=%s&f.req=%s", v5_2)), p19);
	        this.n = new blp("DeviceBackdropSettings");
	        this.i = asr.a(com.google.android.apps.chromecast.app.SetupApplication.a());
	        this.o = p18;
	        this.p = p13;
	        return;
	    }
	
	
	    private static String c(String p2)
	    {
	        String v0_6;
	        if (!android.text.TextUtils.isEmpty(p2)) {
	            v0_6 = new StringBuilder((String.valueOf(p2).length() + 2)).append("\'").append(p2).append("\'").toString();
	        } else {
	            v0_6 = "";
	        }
	        return v0_6;
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
	                    v2.a("DeviceBackdropSettings", v4_1);
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
	
