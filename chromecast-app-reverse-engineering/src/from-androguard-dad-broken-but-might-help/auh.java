	private final aea n
	private final java.lang.String o
	
	    public auh(String p8, String p9, int p10, int p11, int p12, String p13, String p14, int p15, int p16, aea p17, adz p18)
	    {
	        aec v1_1;
	        if (p13 != null) {
	            Object[] v4_1 = new Object[8];
	            v4_1[0] = Integer.valueOf(p11);
	            v4_1[1] = Integer.valueOf(p12);
	            v4_1[2] = Integer.valueOf(p10);
	            v4_1[3] = p13;
	            v4_1[4] = Boolean.valueOf(1);
	            v4_1[5] = Integer.valueOf(p15);
	            v4_1[6] = p14;
	            v4_1[7] = Integer.valueOf(p16);
	            v1_1 = String.format(java.util.Locale.US, "[,\"%d\",\"%d\",\"%d\",,\"%s\",%b,,\"%d\",\"%s\",\"%d\"]", v4_1);
	        } else {
	            Object[] v4_3 = new Object[7];
	            v4_3[0] = Integer.valueOf(p11);
	            v4_3[1] = Integer.valueOf(p12);
	            v4_3[2] = Integer.valueOf(p10);
	            v4_3[3] = Boolean.valueOf(1);
	            v4_3[4] = Integer.valueOf(p15);
	            v4_3[5] = p14;
	            v4_3[6] = Integer.valueOf(p16);
	            v1_1 = String.format(java.util.Locale.US, "[,\"%d\",\"%d\",\"%d\",,,%b,,\"%d\",\"%s\",\"%d\"]", v4_3);
	        }
	        Object[] v4_5 = new Object[1];
	        v4_5[0] = android.net.Uri.encode(v1_1, "utf-8");
	        this("LoadAlbums", asr.a(p8, String.format("/photo-album-metadata?f.req=%s", v4_5)), p18);
	        this.i = asr.a(com.google.android.apps.chromecast.app.SetupApplication.a());
	        this.n = p17;
	        this.o = p9;
	        return;
	    }
	
	
	    protected final synthetic void a(Object p6)
	    {
	        if (this.n != null) {
	            String v0_4;
	            if (((byte[]) p6) == null) {
	                v0_4 = 0;
	            } else {
	                try {
	                    v0_4 = ((dbz) dew.a(new dbz(), ((byte[]) p6)));
	                } catch (String v0_5) {
	                    String v0_7 = String.valueOf(v0_5.toString());
	                    if (v0_7.length() == 0) {
	                        String v0_9 = new String("Could not load albums: ");
	                    } else {
	                        v0_9 = "Could not load albums: ".concat(v0_7);
	                    }
	                    android.util.Log.w("LoadAlbums", v0_9);
	                }
	            }
	            this.n.a(v0_4);
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
	
