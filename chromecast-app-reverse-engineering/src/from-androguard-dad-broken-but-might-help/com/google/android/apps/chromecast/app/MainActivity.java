	public android.app.AlertDialog e
	public bah f
	private  g
	private final java.util.List h
	private android.view.View i
	private ayz j
	private axd k
	private bcn l
	private alm m
	private android.net.wifi.WifiManager n
	private android.support.v4.view.ViewPager o
	private anb p
	private ama q
	private  r
	private android.content.BroadcastReceiver s
	private blp t
	private  u
	
	    public MainActivity()
	    {
	        this.g = 0;
	        this.h = new java.util.ArrayList(3);
	        this.t = new blp("MainActivity");
	        return;
	    }
	
	
	    public static synthetic int a(com.google.android.apps.chromecast.app.MainActivity p0, int p1)
	    {
	        p0.g = p1;
	        return p1;
	    }
	
	
	    public static synthetic ama a(com.google.android.apps.chromecast.app.MainActivity p0, ama p1)
	    {
	        p0.q = p1;
	        return p1;
	    }
	
	
	    public static synthetic android.app.AlertDialog a(com.google.android.apps.chromecast.app.MainActivity p1, android.app.AlertDialog p2)
	    {
	        p1.e = 0;
	        return 0;
	    }
	
	
	    public static synthetic java.util.List a(com.google.android.apps.chromecast.app.MainActivity p1)
	    {
	        return p1.h;
	    }
	
	
	    public static synthetic boolean a(com.google.android.apps.chromecast.app.MainActivity p0, boolean p1)
	    {
	        p0.r = p1;
	        return p1;
	    }
	
	
	    public static synthetic int b(com.google.android.apps.chromecast.app.MainActivity p1, int p2)
	    {
	        p1.u = 0;
	        return 0;
	    }
	
	
	    public static synthetic ama b(com.google.android.apps.chromecast.app.MainActivity p1)
	    {
	        return p1.q;
	    }
	
	
	    public static synthetic blp c(com.google.android.apps.chromecast.app.MainActivity p1)
	    {
	        return p1.t;
	    }
	
	
	    public static synthetic bah d(com.google.android.apps.chromecast.app.MainActivity p1)
	    {
	        return p1.f;
	    }
	
	
	    public static synthetic alm e(com.google.android.apps.chromecast.app.MainActivity p1)
	    {
	        return p1.m;
	    }
	
	
	    public static synthetic bcn f(com.google.android.apps.chromecast.app.MainActivity p1)
	    {
	        return p1.l;
	    }
	
	
	    public static synthetic boolean g(com.google.android.apps.chromecast.app.MainActivity p1)
	    {
	        return p1.r;
	    }
	
	
	    public static synthetic ayz h(com.google.android.apps.chromecast.app.MainActivity p1)
	    {
	        return p1.j;
	    }
	
	
	    public static synthetic void i(com.google.android.apps.chromecast.app.MainActivity p0)
	    {
	        p0.n();
	        return;
	    }
	
	
	    private void n()
	    {
	        if (this.q != null) {
	            this.q.q();
	        }
	        return;
	    }
	
	
	    public final ayz a()
	    {
	        af v1_0 = this.b;
	        ayz v0_2 = ((ayz) v1_0.a("scannerFragment"));
	        if (v0_2 == null) {
	            v0_2 = new ayz();
	            v1_0.a().a(v0_2, "scannerFragment").b();
	        }
	        return v0_2;
	    }
	
	
	    public final void a(ana p4)
	    {
	        int v0_1 = this.h.indexOf(p4);
	        if (v0_1 == -1) {
	            v0_1 = 0;
	        }
	        this.o.a(v0_1);
	        return;
	    }
	
	
	    public final void a(String p5, String p6, dbb p7)
	    {
	        af v0_1 = apg.a(119);
	        v0_1.c = p5;
	        v0_1.b = p6;
	        v0_1.b();
	        this.b.a().a(f.bk, awr.a(p5, p7, 0), "detailsFragment").a(4097).a("MainActivity").b();
	        return;
	    }
	
	
	    public final java.util.ArrayList b_()
	    {
	        java.util.ArrayList v1_1 = new java.util.ArrayList();
	        java.util.Iterator v2 = this.m.d().iterator();
	        while (v2.hasNext()) {
	            v1_1.add(new bko(((aow) v2.next())));
	        }
	        return v1_1;
	    }
	
	
	    public final android.content.Intent e()
	    {
	        android.content.Intent v0_4;
	        if (this.h.get(this.g) != ana.b) {
	            v0_4 = com.google.android.apps.chromecast.app.HelpActivity.a(this, this.getString(b.dG));
	        } else {
	            v0_4 = new android.content.Intent(this, com.google.android.apps.chromecast.app.HelpActivity);
	            v0_4.putExtra("stringTitle", this.getString(b.bk));
	            String v1_5 = new String[2];
	            v1_5[0] = this.getString(b.dF);
	            v1_5[1] = this.getString(b.dG);
	            v0_4.putExtra("urlPatternLink", v1_5);
	            v0_4.putExtra("stringBody", this.getString(b.bj));
	        }
	        return v0_4;
	    }
	
	
	    public void enableWifi(android.view.View p5)
	    {
	        ape.a().a(new apd(10).a(1));
	        android.widget.Toast.makeText(this, b.dB, 0).show();
	        this.registerReceiver(new amz(this), new android.content.IntentFilter("android.net.wifi.supplicant.CONNECTION_CHANGE"));
	        this.n.setWifiEnabled(1);
	        this.n();
	        return;
	    }
	
	
	    public final axd g()
	    {
	        return this.k;
	    }
	
	
	    public final bcn h()
	    {
	        return this.l;
	    }
	
	
	    public final void i()
	    {
	        this.i.setVisibility(0);
	        return;
	    }
	
	
	    public final void j()
	    {
	        this.i.setVisibility(8);
	        return;
	    }
	
	
	    public final boolean k()
	    {
	        int v0_2;
	        int v0_1 = this.n.getWifiState();
	        if ((v0_1 != 3) && (v0_1 != 2)) {
	            v0_2 = 0;
	        } else {
	            v0_2 = 1;
	        }
	        return v0_2;
	    }
	
	
	    public final void l()
	    {
	        if (!com.google.android.apps.chromecast.app.SetupApplication.f()) {
	            this.u = (this.u + 1);
	            if (this.u == 7) {
	                com.google.android.apps.chromecast.app.SetupApplication.b(1);
	                android.widget.Toast.makeText(this, b.aI, 0).show();
	                this.startActivity(com.google.android.apps.chromecast.app.SetupApplication.a(this, ana.b));
	            }
	        }
	        return;
	    }
	
	
	    public final void m()
	    {
	        this.startActivity(new android.content.Intent(this, com.google.android.apps.chromecast.app.MainActivity));
	        this.finish();
	        this.overridePendingTransition(0, 0);
	        return;
	    }
	
	
	    public void onBackPressed()
	    {
	        if (!this.f.e()) {
	            super.onBackPressed();
	        } else {
	            this.f.d();
	        }
	        return;
	    }
	
	
	    public void onConfigurationChanged(android.content.res.Configuration p2)
	    {
	        super.onConfigurationChanged(p2);
	        this.f.a(p2);
	        return;
	    }
	
	
	    public void onCreate(android.os.Bundle p6)
	    {
	        super.onCreate(p6);
	        android.support.v4.view.ViewPager v0_0 = android.preference.PreferenceManager.getDefaultSharedPreferences(this);
	        if (v0_0.getBoolean("content_whatson_enabled", 1)) {
	            this.h.add(ana.a);
	        }
	        this.h.add(ana.b);
	        if (v0_0.getBoolean("content_getapps_enabled", 1)) {
	            this.h.add(ana.c);
	        }
	        this.setContentView(a.gh);
	        if (!android.preference.PreferenceManager.getDefaultSharedPreferences(this).getBoolean("content_search_enabled", 1)) {
	            this.i = this.findViewById(f.eo);
	            android.support.v4.view.ViewPager v0_9 = ((android.support.v7.widget.Toolbar) this.i);
	            v0_9.a(v0_9.getContext().getText(b.M));
	            this.a(((android.support.v7.widget.Toolbar) this.i));
	            this.findViewById(f.dv).setVisibility(8);
	            this.i.setOnClickListener(new amw(this));
	        } else {
	            this.findViewById(f.eo).setVisibility(8);
	            this.i = this.findViewById(f.dv);
	            int v1_11 = this.findViewById(f.du);
	            android.support.v4.view.ViewPager v0_22 = ((android.widget.ImageView) this.findViewById(f.aX));
	            int v2_4 = new ams(this, v0_22, v1_11);
	            v0_22.setOnClickListener(new amv(this));
	            blx.a(this, ((android.support.v7.widget.SearchView) this.i.findViewById(f.f)), v1_11, v2_4);
	        }
	        this.f = new bah(this, this, bat.a);
	        this.j = this.a();
	        int v1_13 = this.b;
	        if (((aqu) v1_13.a("backdropScannerFragment")) == null) {
	            v1_13.a().a(new aqu(), "backdropScannerFragment").b();
	        }
	        this.k = new axd(this, com.google.android.apps.chromecast.app.SetupApplication.i());
	        this.l = new bcn(com.google.android.apps.chromecast.app.SetupApplication.i(), blr.c(this), p6);
	        this.m = com.google.android.apps.chromecast.app.SetupApplication.a().b();
	        android.support.v4.view.ViewPager v0_40 = this.m;
	        int v1_18 = this.l;
	        v0_40.f.add(v1_18);
	        int v2_8 = v0_40.g.iterator();
	        while (v2_8.hasNext()) {
	            android.support.v4.view.ViewPager v0_75 = ((aow) v2_8.next());
	            if (!android.text.TextUtils.isEmpty(v0_75.q)) {
	                v1_18.a(v0_75);
	            }
	        }
	        int v2_9;
	        this.n = ((android.net.wifi.WifiManager) this.getSystemService("wifi"));
	        this.r = blr.a(this);
	        this.s = new amx(this);
	        if (com.google.android.apps.chromecast.app.SetupApplication.a().b) {
	            if (p6 == null) {
	                if (this.getIntent() == null) {
	                    v2_9 = ana.a;
	                } else {
	                    v2_9 = ana.values()[this.getIntent().getIntExtra("tabIndex", ana.a.ordinal())];
	                }
	            } else {
	                v2_9 = ana.values()[p6.getInt("tabIndex", ana.a.ordinal())];
	            }
	        } else {
	            v2_9 = ana.b;
	        }
	        if ((this.getIntent() == null) || (!"android.intent.action.SEARCH".equals(this.getIntent().getAction()))) {
	            android.support.v4.view.ViewPager v0_63 = ((com.google.android.apps.chromecast.app.widget.SlidingTabLayout) this.findViewById(f.dS));
	            this.o = ((android.support.v4.view.ViewPager) this.findViewById(f.cL));
	            this.p = new anb(this);
	            this.o.a(this.p);
	            bod v3_7 = v0_63.f;
	            v3_7.a = new amo(this);
	            v3_7.invalidate();
	            v0_63.a = a.gO;
	            v0_63.b = f.eg;
	            int v1_34 = this.o;
	            v0_63.f.removeAllViews();
	            v0_63.c = v1_34;
	            if (v1_34 != 0) {
	                v1_34.d = new bod(v0_63);
	                v0_63.a();
	            }
	            v0_63.d = new amq(this);
	            v0_63.e = new amr(this);
	            this.g = this.h.indexOf(v2_9);
	            if (this.g == -1) {
	                this.g = 0;
	            }
	            this.o.a(this.g);
	        } else {
	            this.b.a().a(new bgb(), 0).b();
	        }
	        com.google.android.apps.chromecast.app.SetupApplication.a().f.add(this);
	        return;
	    }
	
	
	    public void onDestroy()
	    {
	        super.onDestroy();
	        com.google.android.apps.chromecast.app.SetupApplication.a().f.remove(this);
	        this.m.f.remove(this.l);
	        return;
	    }
	
	
	    public void onGetHelpClicked(android.view.View p2)
	    {
	        this.startActivity(this.e());
	        return;
	    }
	
	
	    public boolean onKeyDown(int p2, android.view.KeyEvent p3)
	    {
	        boolean v0_1;
	        if (!blx.a(p2)) {
	            v0_1 = super.onKeyDown(p2, p3);
	        } else {
	            v0_1 = 1;
	        }
	        return v0_1;
	    }
	
	
	    public boolean onKeyUp(int p2, android.view.KeyEvent p3)
	    {
	        boolean v0_1;
	        if (!blx.a(p2, this)) {
	            v0_1 = super.onKeyUp(p2, p3);
	        } else {
	            v0_1 = 1;
	        }
	        return v0_1;
	    }
	
	
	    public boolean onOptionsItemSelected(android.view.MenuItem p2)
	    {
	        boolean v0_2;
	        if (!this.f.a(p2)) {
	            v0_2 = super.onOptionsItemSelected(p2);
	        } else {
	            v0_2 = 1;
	        }
	        return v0_2;
	    }
	
	
	    public void onPause()
	    {
	        this.j.a = 0;
	        this.unregisterReceiver(this.s);
	        super.onPause();
	        return;
	    }
	
	
	    protected void onPostCreate(android.os.Bundle p2)
	    {
	        super.onPostCreate(p2);
	        this.f.c.c();
	        return;
	    }
	
	
	    public void onRestoreInstanceState(android.os.Bundle p6)
	    {
	        super.onRestoreInstanceState(p6);
	        blp v1_0 = this.k;
	        v1_0.l = p6.getLong("lastUpdatedTime");
	        try {
	            if (!p6.containsKey("browseContent")) {
	                if (p6.containsKey("getAppsContent")) {
	                    v1_0.d = dat.a(p6.getByteArray("getAppsContent"));
	                }
	            } else {
	                v1_0.c = dat.a(p6.getByteArray("browseContent"));
	                v1_0.e = p6.getIntArray("browseScrollPositions");
	            }
	        } catch (dat v0_13) {
	            blp v1_1 = v1_0.f;
	            Object[] v3_1 = new Object[1];
	            v3_1[0] = v0_13;
	            v1_1.a("Error parsing content bundle: %s", v3_1);
	        }
	        return;
	    }
	
	
	    public void onResume()
	    {
	        super.onResume();
	        this.getWindow().setSoftInputMode(3);
	        this.u = 0;
	        this.registerReceiver(this.s, new android.content.IntentFilter("android.net.wifi.STATE_CHANGE"));
	        ayz v0_5 = ((android.widget.TextView) this.findViewById(a.br));
	        if (v0_5 != null) {
	            v0_5.setText("");
	            v0_5.clearFocus();
	        }
	        if ((com.google.android.apps.chromecast.app.SetupApplication.a().b) && (this.k())) {
	            ayz v0_9 = this.j;
	            v0_9.b = 1;
	            v0_9.p();
	        }
	        return;
	    }
	
	
	    public void onSaveInstanceState(android.os.Bundle p6)
	    {
	        java.util.concurrent.ScheduledFuture v0_0 = this.k;
	        if (v0_0.c != null) {
	            p6.putByteArray("browseContent", dat.a(v0_0.c));
	            p6.putIntArray("browseScrollPositions", v0_0.e);
	        }
	        if (v0_0.d != null) {
	            p6.putByteArray("getAppsContent", dat.a(v0_0.d));
	        }
	        p6.putLong("lastUpdatedTime", v0_0.l);
	        java.util.concurrent.ScheduledFuture v0_1 = this.l;
	        android.preference.PreferenceManager.getDefaultSharedPreferences(com.google.android.apps.chromecast.app.SetupApplication.a()).edit().putString("hiddenOffers", android.text.TextUtils.join(",", v0_1.d.toArray())).commit();
	        if (v0_1.c != null) {
	            int v1_12 = new java.util.ArrayList(v0_1.c.size());
	            v1_12.addAll(v0_1.c);
	            p6.putParcelableArrayList("getAppsOffers", v1_12);
	        }
	        if (v0_1.b != null) {
	            v0_1.b.cancel(0);
	        }
	        super.onSaveInstanceState(p6);
	        return;
	    }
	
	
	    protected void onStart()
	    {
	        int v0_0 = 1;
	        super.onStart();
	        this.f.a();
	        Runnable v1_1 = this.k;
	        atf v2_1 = atf.a(v1_1.a);
	        if (v2_1.f != null) {
	            java.util.Set v3_2 = blx.a(v2_1.a, v2_1.g);
	            if ((v3_2.size() != v2_1.f.b.length) || (!v3_2.containsAll(java.util.Arrays.asList(v2_1.f.b)))) {
	                String[] v5_4 = new String[v3_2.size()];
	                v2_1.f.b = v5_4;
	                v3_2.toArray(v2_1.f.b);
	                v2_1.b();
	            } else {
	                v0_0 = 0;
	            }
	        }
	        v1_1.n = v0_0;
	        v1_1.o.post(v1_1.p);
	        return;
	    }
	
	
	    public void onStop()
	    {
	        this.f.b();
	        Runnable v0_1 = this.k;
	        v0_1.o.removeCallbacks(v0_1.p);
	        super.onStop();
	        return;
	    }
	
