	private static com.google.android.apps.chromecast.app.SetupApplication m
	private static  n
	public android.content.SharedPreferences a
	public  b
	public java.lang.String c
	public  d
	public java.lang.String e
	final java.util.List f
	public azg g
	public  h
	public android.net.http.AndroidHttpClient i
	public final ass j
	public  k
	public java.lang.String l
	private final blp o
	private bkg p
	private  q
	private alm r
	private bli s
	private java.lang.String t
	private azv u
	private aor v
	
	    static SetupApplication()
	    {
	        com.google.android.apps.chromecast.app.SetupApplication.n = 0;
	        return;
	    }
	
	
	    public SetupApplication()
	    {
	        this.f = new java.util.ArrayList();
	        this.h = 1;
	        this.t = 0;
	        this.j = new ass();
	        this.o = new blp("SetupApplication", 0);
	        return;
	    }
	
	
	    public static android.content.Intent a(android.content.Context p3, ana p4)
	    {
	        android.content.Intent v0_1 = new android.content.Intent(p3, com.google.android.apps.chromecast.app.MainActivity);
	        v0_1.setFlags(67108864);
	        v0_1.putExtra("tabIndex", p4.ordinal());
	        return v0_1;
	    }
	
	
	    public static com.google.android.apps.chromecast.app.SetupApplication a()
	    {
	        return com.google.android.apps.chromecast.app.SetupApplication.m;
	    }
	
	
	    public static boolean a(int p1)
	    {
	        if ((p1 != -1) && ((p1 != -2) && ((p1 != -6) && (p1 != -8)))) {
	            int v0_4 = 0;
	        } else {
	            v0_4 = 1;
	        }
	        return v0_4;
	    }
	
	
	    public static String b(String p3)
	    {
	        String v0_5;
	        String v1 = String.valueOf(blf.A(com.google.android.apps.chromecast.app.SetupApplication.m.getApplicationContext()));
	        String v0_3 = String.valueOf(p3);
	        if (v0_3.length() == 0) {
	            v0_5 = new String(v1);
	        } else {
	            v0_5 = v1.concat(v0_3);
	        }
	        return v0_5;
	    }
	
	
	    public static void b(int p1)
	    {
	        com.google.android.apps.chromecast.app.SetupApplication.n = 1;
	        return;
	    }
	
	
	    public static boolean f()
	    {
	        int v0_1;
	        if (com.google.android.apps.chromecast.app.SetupApplication.n == 0) {
	            v0_1 = 0;
	        } else {
	            v0_1 = 1;
	        }
	        return v0_1;
	    }
	
	
	    public static boolean g()
	    {
	        int v0_3;
	        if (android.text.TextUtils.isEmpty(com.google.android.apps.chromecast.app.SetupApplication.m.c)) {
	            v0_3 = 0;
	        } else {
	            v0_3 = 1;
	        }
	        return v0_3;
	    }
	
	
	    public static ana h()
	    {
	        ana v0_3;
	        if (!android.preference.PreferenceManager.getDefaultSharedPreferences(com.google.android.apps.chromecast.app.SetupApplication.m).getBoolean("content_default_getapps", 0)) {
	            v0_3 = ana.a;
	        } else {
	            v0_3 = ana.c;
	        }
	        return v0_3;
	    }
	
	
	    public static atf i()
	    {
	        return atf.a(com.google.android.apps.chromecast.app.SetupApplication.m);
	    }
	
	
	    private String m()
	    {
	        String v0_0 = this.getApplicationContext();
	        String v1_0 = v0_0.getPackageName();
	        if (v1_0 != null) {
	            try {
	                String v0_3 = v0_0.getPackageManager().getPackageInfo(v1_0, 0).versionName;
	            } catch (String v0) {
	                throw new IllegalArgumentException("invalid application context");
	            }
	            if (v0_3 != null) {
	                String v0_7 = new StringBuilder(((String.valueOf(v1_0).length() + 1) + String.valueOf(v0_3).length())).append(v1_0).append("/").append(v0_3).toString();
	                String v1_5 = System.getProperty("http.agent");
	                if (v1_5 != null) {
	                    String v2_5 = v1_5.indexOf(40);
	                    if (v2_5 > null) {
	                        String v1_7 = String.valueOf(v1_5.substring(v2_5));
	                        v0_7 = new StringBuilder(((String.valueOf(v0_7).length() + 1) + String.valueOf(v1_7).length())).append(v0_7).append(" ").append(v1_7).toString();
	                    }
	                }
	                return v0_7;
	            } else {
	                throw new IllegalArgumentException("invalid application context");
	            }
	        } else {
	            throw new IllegalArgumentException("invalid application context");
	        }
	    }
	
	
	    public final void a(String p3)
	    {
	        if ((p3 == 0) || (!p3.equals(this.e))) {
	            aoq v0_3 = this.a.edit();
	            if (!android.text.TextUtils.isEmpty(p3)) {
	                v0_3.putString("current_account_name", p3);
	            } else {
	                p3 = 0;
	                v0_3.remove("current_account_name");
	            }
	            v0_3.apply();
	            this.e = p3;
	            java.util.Iterator v1_3 = this.f.iterator();
	            while (v1_3.hasNext()) {
	                ((aoq) v1_3.next()).m();
	            }
	        }
	        return;
	    }
	
	
	    public final alm b()
	    {
	        if (this.r == null) {
	            this.r = new alm(bkl.a(), android.preference.PreferenceManager.getDefaultSharedPreferences(this));
	        }
	        return this.r;
	    }
	
	
	    public final bli c()
	    {
	        if (this.s == null) {
	            this.s = new bli(this.getApplicationContext());
	        }
	        return this.s;
	    }
	
	
	    public final void c(String p3)
	    {
	        this.k = android.os.SystemClock.elapsedRealtime();
	        this.l = p3;
	        return;
	    }
	
	
	    public final bkg d()
	    {
	        try {
	            if (!this.q) {
	                try {
	                    this.p = new bkg(this);
	                } catch (int v0_4) {
	                    Object[] v3_3 = new Object[0];
	                    this.o.a(v0_4, "Failed to create certificate validator", v3_3);
	                } catch (int v0_3) {
	                    Object[] v3_1 = new Object[0];
	                    this.o.a(v0_3, "Failed to create certificate validator", v3_1);
	                }
	                this.q = 1;
	            }
	        } catch (int v0_6) {
	            throw v0_6;
	        }
	        return this.p;
	    }
	
	
	    public final String e()
	    {
	        if (this.t == null) {
	            try {
	                this.t = this.getPackageManager().getPackageInfo(this.getPackageName(), 0).versionName;
	            } catch (String v0) {
	                this.t = "??";
	            }
	        }
	        return this.t;
	    }
	
	
	    public final void j()
	    {
	        Throwable v0_0 = atf.a(this);
	        v0_0.k.clear();
	        v0_0.l.a(new atg(v0_0));
	        v0_0.d.a();
	        v0_0.f = 0;
	        return;
	    }
	
	
	    public final boolean k()
	    {
	        if ((this.k <= 0) || ((android.os.SystemClock.elapsedRealtime() - this.k) >= java.util.concurrent.TimeUnit.MINUTES.toMillis(30))) {
	            int v0_5 = 0;
	        } else {
	            v0_5 = 1;
	        }
	        return v0_5;
	    }
	
	
	    public final azv l()
	    {
	        if (this.u == null) {
	            this.u = new azv(this.getApplicationContext());
	        }
	        return this.u;
	    }
	
	
	    public final void onCreate()
	    {
	        boolean v0_0 = 1;
	        super.onCreate();
	        com.google.android.apps.chromecast.app.SetupApplication.m = this;
	        com.google.android.apps.chromecast.app.SetupApplication.n = blf.a(this.getApplicationContext());
	        this.i = android.net.http.AndroidHttpClient.newInstance(this.m());
	        String v2_4 = ape.a();
	        android.content.Context v3_0 = this.getApplicationContext();
	        v2_4.b = v3_0;
	        v2_4.c = android.preference.PreferenceManager.getDefaultSharedPreferences(v3_0);
	        if ((!v2_4.c.getBoolean("ANALYTICS_ENABLED", 1)) || (!blf.L(v3_0))) {
	            v0_0 = 0;
	        }
	        v2_4.f = v0_0;
	        v2_4.d = new bwf(v3_0).a(bvh.b).a(v2_4).b();
	        v2_4.e = new bvh(v2_4.b, "CHROMECAST_APP_LOG", 0, 0);
	        v2_4.g = v2_4.a.nextInt();
	        this.v = new aor();
	        this.registerActivityLifecycleCallbacks(this.v);
	        this.a = android.preference.PreferenceManager.getDefaultSharedPreferences(this.getApplicationContext());
	        this.d = this.a.getBoolean("CAST_SCREEN_LAUNCHED", 0);
	        this.e = this.a.getString("current_account_name", 0);
	        if (this.e == null) {
	            this.a(bls.b(this));
	        }
	        this.b = this.a.getBoolean("TERMS_ACCEPTED", 0);
	        return;
	    }
	
	
	    public void onTrimMemory(int p1)
	    {
	        super.onTrimMemory(p1);
	        return;
	    }
	
