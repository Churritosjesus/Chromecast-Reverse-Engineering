	private final blp e
	private  f
	private  g
	private  h
	private  i
	private  j
	private  k
	
	    public DiscoveryActivity()
	    {
	        this.e = new blp("DiscoveryActivity");
	        return;
	    }
	
	
	    public static synthetic void a(com.google.android.apps.chromecast.app.DiscoveryActivity p0)
	    {
	        p0.g();
	        return;
	    }
	
	
	    public static synthetic boolean a(com.google.android.apps.chromecast.app.DiscoveryActivity p1, boolean p2)
	    {
	        p1.i = 1;
	        return 1;
	    }
	
	
	    private void g()
	    {
	        if ((this.k) && (this.i)) {
	            android.content.Intent v0_4 = bkh.a().h.a(Integer.valueOf(this.g), 0, 0);
	            if (v0_4 != null) {
	                this.g = v0_4.b.intValue();
	                if (!this.h) {
	                    this.startActivityForResult(com.google.android.apps.chromecast.app.tutorial.TutorialActivity.a(this, v0_4), 1);
	                } else {
	                    android.preference.PreferenceManager.getDefaultSharedPreferences(com.google.android.apps.chromecast.app.SetupApplication.a()).edit().putInt("warmWelcomeVersion", this.g).apply();
	                    this.h();
	                }
	            } else {
	                this.h();
	            }
	        }
	        return;
	    }
	
	
	    private void h()
	    {
	        ana v0_6;
	        ana v0_1 = this.getIntent().getDataString();
	        if ((v0_1 == null) || (!v0_1.contains("apps"))) {
	            if (((v0_1 == null) || (!v0_1.contains("backdrop"))) && ((!this.j) && (!"android.intent.action.VIEW".equals(this.getIntent().getAction())))) {
	                v0_6 = com.google.android.apps.chromecast.app.SetupApplication.h();
	            } else {
	                v0_6 = ana.b;
	            }
	        } else {
	            v0_6 = ana.c;
	        }
	        bkh.a().i.a("appLaunch", Integer.valueOf(1));
	        String v1_8 = new android.content.Intent(this, com.google.android.apps.chromecast.app.MainActivity);
	        v1_8.addFlags(32768);
	        v1_8.putExtra("tabIndex", v0_6.ordinal());
	        this.startActivity(v1_8);
	        this.overridePendingTransition(a.de, a.df);
	        this.finish();
	        return;
	    }
	
	
	    public final void e()
	    {
	        android.preference.PreferenceManager.getDefaultSharedPreferences(this).getInt("appVersion", 0);
	        android.preference.PreferenceManager.getDefaultSharedPreferences(this).edit().putInt("appVersion", this.f).apply();
	        bkh.a().e = this;
	        bkh.a().b();
	        atf.a(this).a(new amj(this), new amk(this));
	        return;
	    }
	
	
	    public final void f()
	    {
	        this.k = 1;
	        bkh.a().e = 0;
	        this.g();
	        return;
	    }
	
	
	    protected void onActivityResult(int p4, int p5, android.content.Intent p6)
	    {
	        if (p4 != 1) {
	            super.onActivityResult(p4, p5, p6);
	        } else {
	            android.preference.PreferenceManager.getDefaultSharedPreferences(com.google.android.apps.chromecast.app.SetupApplication.a()).edit().putInt("warmWelcomeVersion", this.g).commit();
	            this.h();
	        }
	        return;
	    }
	
	
	    public void onCreate(android.os.Bundle p4)
	    {
	        super.onCreate(p4);
	        this.setContentView(a.fr);
	        if (p4 == null) {
	            this.g = android.preference.PreferenceManager.getDefaultSharedPreferences(com.google.android.apps.chromecast.app.SetupApplication.a()).getInt("warmWelcomeVersion", 0);
	        } else {
	            this.i = p4.getBoolean("environmentLoaded");
	            this.k = p4.getBoolean("containerLoaded");
	            this.g = p4.getInt("lastTutorialVersion");
	            this.h = p4.getBoolean("skipTutorial");
	            this.j = p4.getBoolean("openDevicesTab");
	        }
	        try {
	            this.f = this.getPackageManager().getPackageInfo(this.getPackageName(), 0).versionCode;
	        } catch (android.content.pm.PackageManager$NameNotFoundException v0) {
	        }
	        return;
	    }
	
	
	    protected void onDestroy()
	    {
	        super.onDestroy();
	        bkh.a().e = 0;
	        return;
	    }
	
	
	    public void onResume()
	    {
	        super.onResume();
	        if (com.google.android.apps.chromecast.app.SetupApplication.a().b) {
	            this.e();
	        } else {
	            bol.a(this);
	            this.h = 1;
	            this.j = 1;
	        }
	        return;
	    }
	
	
	    protected void onSaveInstanceState(android.os.Bundle p5)
	    {
	        super.onSaveInstanceState(p5);
	        p5.putBoolean("environmentLoaded", this.i);
	        p5.putBoolean("containerLoaded", this.k);
	        p5.putLong("lastTutorialVersion", ((long) this.g));
	        p5.putBoolean("skipTutorial", this.h);
	        p5.putBoolean("openDevicesTab", this.j);
	        return;
	    }
	
