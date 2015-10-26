	static final java.lang.String b
	public static final Ljava.lang.String d
	private static final Ljava.lang.String f
	 java.util.Map a
	public blp c
	private java.util.Map e
	
	    static bli()
	    {
	        bli.b = java.util.Locale.ENGLISH.getLanguage();
	        String[] v0_2 = new String[4];
	        v0_2[0] = "Default";
	        v0_2[1] = "Production";
	        v0_2[2] = "Dogfood";
	        v0_2[3] = "Alpha";
	        bli.d = v0_2;
	        String[] v0_3 = new String[4];
	        v0_3[0] = "";
	        v0_3[1] = "prod";
	        v0_3[2] = "dogfood";
	        v0_3[3] = "alpha";
	        bli.f = v0_3;
	        return;
	    }
	
	
	    public bli(android.content.Context p4)
	    {
	        this.c = new blp("GtmContainerManager", 0);
	        this.e = new java.util.HashMap();
	        try {
	            blf.b();
	            this.a(p4, a.hk);
	        } catch (java.util.Map v0) {
	            Integer v2_1 = new Object[0];
	            this.c.a("Failed to load default container maps", v2_1);
	        }
	        this.a = new java.util.HashMap();
	        this.a.put("en", Integer.valueOf(a.hf));
	        this.a.put("es", Integer.valueOf(a.hg));
	        this.a.put("es-MX", Integer.valueOf(a.hh));
	        return;
	    }
	
	
	    public static int a()
	    {
	        return a.hk;
	    }
	
	
	    public static int a(String p1, int p2)
	    {
	        if (!p1.equals("prod")) {
	            if (!p1.equals("dogfood")) {
	                if (p1.equals("alpha")) {
	                    p2 = a.hi;
	                }
	            } else {
	                p2 = a.hj;
	            }
	        } else {
	            p2 = a.hk;
	        }
	        return p2;
	    }
	
	
	    public static String a(boolean p3)
	    {
	        String v0_2;
	        if (!p3) {
	            v0_2 = bli.d[1];
	        } else {
	            v0_2 = android.preference.PreferenceManager.getDefaultSharedPreferences(com.google.android.apps.chromecast.app.SetupApplication.a()).getString("ACM_LEVEL", "");
	            if (android.text.TextUtils.isEmpty(v0_2)) {
	            }
	        }
	        return v0_2;
	    }
	
	
	    public static String[] c()
	    {
	        return bli.d;
	    }
	
	
	    public static String[] d()
	    {
	        return bli.f;
	    }
	
	
	    public void a(android.content.Context p10, int p11)
	    {
	        java.io.InputStream v2 = p10.getResources().openRawResource(p11);
	        int v0_2 = new byte[v2.available()];
	        v2.read(v0_2);
	        String[] v3_2 = new String(v0_2).split("\n");
	        int v4 = v3_2.length;
	        int v0_4 = 0;
	        while (v0_4 < v4) {
	            String v5_1 = v3_2[v0_4].split(",");
	            this.e.put(v5_1[0], v5_1[1]);
	            v0_4++;
	        }
	        v2.close();
	        return;
	    }
	
	
	    public final String b()
	    {
	        int v0_3;
	        int v0_0 = java.util.Locale.getDefault();
	        if (!this.e.containsKey(blj.c(v0_0))) {
	            if (!this.e.containsKey(blj.b(v0_0))) {
	                if (!this.e.containsKey(bli.b)) {
	                    v0_3 = 0;
	                } else {
	                    v0_3 = ((String) this.e.get(bli.b));
	                }
	            } else {
	                v0_3 = ((String) this.e.get(blj.b(v0_0)));
	            }
	        } else {
	            v0_3 = ((String) this.e.get(blj.c(v0_0)));
	        }
	        return v0_3;
	    }
	
