	private static android.net.wifi.WifiManager u
	private bah e
	private android.widget.Button f
	private android.widget.Button g
	private android.widget.TextView h
	private android.widget.Toast i
	private final android.os.Handler j
	private  k
	private  l
	private  m
	private  n
	private  o
	private  p
	private bbn q
	private final ua r
	private tx s
	private final op t
	private final java.lang.Runnable v
	private android.content.BroadcastReceiver w
	
	    public CastScreenActivity()
	    {
	        this.j = new android.os.Handler();
	        this.r = new bbk(this);
	        this.t = new bbv();
	        this.v = new bbe(this);
	        this.w = new bbh(this);
	        return;
	    }
	
	
	    public static synthetic android.widget.Toast a(com.google.android.apps.chromecast.app.mirror.CastScreenActivity p0, android.widget.Toast p1)
	    {
	        p0.i = p1;
	        return p1;
	    }
	
	
	    public static synthetic void a(com.google.android.apps.chromecast.app.mirror.CastScreenActivity p0)
	    {
	        p0.i();
	        return;
	    }
	
	
	    public static synthetic void a(com.google.android.apps.chromecast.app.mirror.CastScreenActivity p2, String p3, int p4)
	    {
	        p2.runOnUiThread(new bbf(p2, p3, 0));
	        return;
	    }
	
	
	    public static synthetic boolean a(com.google.android.apps.chromecast.app.mirror.CastScreenActivity p1, boolean p2)
	    {
	        p1.o = 0;
	        return 0;
	    }
	
	
	    public static synthetic void b(com.google.android.apps.chromecast.app.mirror.CastScreenActivity p0)
	    {
	        p0.h();
	        return;
	    }
	
	
	    public static synthetic boolean b(com.google.android.apps.chromecast.app.mirror.CastScreenActivity p1, boolean p2)
	    {
	        p1.p = 0;
	        return 0;
	    }
	
	
	    public static synthetic android.app.PendingIntent c(com.google.android.apps.chromecast.app.mirror.CastScreenActivity p3)
	    {
	        return android.app.PendingIntent.getActivity(p3, 0, new android.content.Intent(p3, com.google.android.apps.chromecast.app.mirror.CastScreenActivity), 0);
	    }
	
	
	    public static synthetic bbn d(com.google.android.apps.chromecast.app.mirror.CastScreenActivity p1)
	    {
	        return p1.q;
	    }
	
	
	    public static synthetic android.widget.Toast e(com.google.android.apps.chromecast.app.mirror.CastScreenActivity p1)
	    {
	        return p1.i;
	    }
	
	
	    public static synthetic void f(com.google.android.apps.chromecast.app.mirror.CastScreenActivity p0)
	    {
	        p0.j();
	        return;
	    }
	
	
	    public static synthetic android.net.wifi.WifiManager g()
	    {
	        return com.google.android.apps.chromecast.app.mirror.CastScreenActivity.u;
	    }
	
	
	    public static synthetic boolean g(com.google.android.apps.chromecast.app.mirror.CastScreenActivity p1)
	    {
	        return p1.o;
	    }
	
	
	    private void h()
	    {
	        this.j.removeCallbacks(this.v);
	        this.l = 0;
	        return;
	    }
	
	
	    public static synthetic void h(com.google.android.apps.chromecast.app.mirror.CastScreenActivity p1)
	    {
	        if ((!p1.m) && ((!p1.p) && ((com.google.android.apps.chromecast.app.SetupApplication.a().d) && ((p1.q.a()) && (!p1.q.b()))))) {
	            p1.startMirroring(0);
	        }
	        return;
	    }
	
	
	    private void i()
	    {
	        if (this.k) {
	            this.h();
	            boolean v0_1 = tz.a();
	            if (v0_1) {
	                t v1_0 = v0_1.iterator();
	                while (v1_0.hasNext()) {
	                    boolean v0_10 = ((uh) v1_0.next());
	                    if ((!v0_10.b()) && (v0_10.a(this.s))) {
	                        return;
	                    }
	                }
	            }
	            boolean v0_4 = this.b.a("android.support.v7.mediarouter:MediaRouteChooserDialogFragment");
	            if (v0_4) {
	                ((i) v0_4).a(0);
	                boolean v0_7 = this.getString(b.at);
	                tx v2_1 = new Object[1];
	                v2_1[0] = v0_7;
	                bbj.a(this.getString(b.as, v2_1), v0_7, blf.F(this)).a(this.b, "castScreenAlertDialog");
	            }
	        }
	        return;
	    }
	
	
	    public static synthetic boolean i(com.google.android.apps.chromecast.app.mirror.CastScreenActivity p1)
	    {
	        return p1.p;
	    }
	
	
	    private void j()
	    {
	        String v0_1;
	        android.widget.TextView v1_0 = 8;
	        int v3_0 = this.q.b();
	        if (v3_0 == 0) {
	            v0_1 = 0;
	        } else {
	            v0_1 = 8;
	        }
	        this.f.setVisibility(v0_1);
	        if (v3_0 != 0) {
	            v1_0 = 0;
	        }
	        this.g.setVisibility(v1_0);
	        if (v3_0 != 0) {
	            String v0_5;
	            android.widget.TextView v1_1 = this.h;
	            String v0_3 = this.q;
	            if ((v0_3.a != null) && (v0_3.a.booleanValue())) {
	                if ((v0_3.b == null) || (android.text.TextUtils.isEmpty(v0_3.b.e))) {
	                    v0_5 = this.getString(b.aw);
	                } else {
	                    Object[] v4_2 = new Object[1];
	                    v4_2[0] = v0_3.b.e;
	                    v0_5 = this.getString(b.av, v4_2);
	                }
	            } else {
	                v0_5 = this.getString(b.au);
	            }
	            v1_1.setText(v0_5);
	            this.o = 0;
	        }
	        if (this.i != null) {
	            this.i.cancel();
	            this.i = 0;
	        }
	        return;
	    }
	
	
	    private void startMirroring()
	    {
	        this.m = 1;
	        t v0_1 = this.b;
	        oo v1_0 = tz.d();
	        if ((!v1_0.b()) && (v1_0.a(this.s))) {
	            if (v0_1.a("android.support.v7.mediarouter:MediaRouteControllerDialogFragment") == null) {
	                this.t.c().a(v0_1, "android.support.v7.mediarouter:MediaRouteControllerDialogFragment");
	            }
	        } else {
	            if (v0_1.a("android.support.v7.mediarouter:MediaRouteChooserDialogFragment") == null) {
	                this.h();
	                this.j.postDelayed(this.v, 10000);
	                this.l = (android.os.SystemClock.elapsedRealtime() + 10000);
	                oo v1_9 = op.b();
	                v1_9.a(this.s);
	                v1_9.a(v0_1, "android.support.v7.mediarouter:MediaRouteChooserDialogFragment");
	            }
	        }
	        return;
	    }
	
	
	    public final void a(com.google.android.gms.cast.CastDevice p2, com.google.android.gms.cast.CastDevice p3)
	    {
	        this.runOnUiThread(new bbg(this));
	        return;
	    }
	
	
	    public final java.util.ArrayList b_()
	    {
	        int v0_1;
	        com.google.android.gms.cast.CastDevice v1 = this.q.b;
	        if (v1 == null) {
	            v0_1 = 0;
	        } else {
	            v0_1 = new java.util.ArrayList(1);
	            v0_1.add(new bko(v1));
	        }
	        return v0_1;
	    }
	
	
	    public void disconnectMirroring(android.view.View p2)
	    {
	        this.q.c();
	        return;
	    }
	
	
	    public final android.content.Intent e()
	    {
	        return com.google.android.apps.chromecast.app.HelpActivity.a(this, blf.O(this));
	    }
	
	
	    public void onBackPressed()
	    {
	        if (!this.e.e()) {
	            super.onBackPressed();
	        } else {
	            this.e.d();
	        }
	        return;
	    }
	
	
	    public void onConfigurationChanged(android.content.res.Configuration p2)
	    {
	        super.onConfigurationChanged(p2);
	        this.e.a(p2);
	        return;
	    }
	
	
	    public void onCreate(android.os.Bundle p4)
	    {
	        android.net.wifi.WifiManager v0_18;
	        boolean v1 = 0;
	        super.onCreate(p4);
	        this.setContentView(a.gi);
	        this.a(((android.support.v7.widget.Toolbar) this.findViewById(f.eo)));
	        this.d().a().a(b.bp);
	        this.q = bbn.a(this);
	        this.e = new bah(this, this, bat.b);
	        this.f = ((android.widget.Button) this.findViewById(f.cc));
	        this.g = ((android.widget.Button) this.findViewById(f.aP));
	        this.h = ((android.widget.TextView) this.findViewById(f.cd));
	        if (p4 == null) {
	            v0_18 = 0;
	        } else {
	            v0_18 = p4.getBoolean("chooserShown", 0);
	        }
	        android.net.wifi.WifiManager v0_20;
	        this.m = v0_18;
	        if (p4 == null) {
	            v0_20 = 0;
	        } else {
	            v0_20 = p4.getBoolean("warningShown", 0);
	        }
	        this.n = v0_20;
	        if (p4 != null) {
	            v1 = p4.getBoolean("wifiShown", 0);
	        }
	        this.p = v1;
	        com.google.android.apps.chromecast.app.mirror.CastScreenActivity.u = ((android.net.wifi.WifiManager) this.getSystemService("wifi"));
	        return;
	    }
	
	
	    protected void onDestroy()
	    {
	        this.e.c();
	        super.onDestroy();
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
	        if (!this.e.a(p2)) {
	            v0_2 = super.onOptionsItemSelected(p2);
	        } else {
	            v0_2 = 1;
	        }
	        return v0_2;
	    }
	
	
	    public void onPause()
	    {
	        super.onPause();
	        this.k = 0;
	        this.q.b(this);
	        try {
	            this.unregisterReceiver(this.w);
	        } catch (IllegalArgumentException v0) {
	        }
	        return;
	    }
	
	
	    protected void onPostCreate(android.os.Bundle p2)
	    {
	        super.onPostCreate(p2);
	        this.e.c.c();
	        return;
	    }
	
	
	    public void onResume()
	    {
	        super.onResume();
	        this.k = 1;
	        this.q.a(this);
	        if ((this.l != 0) && (android.os.SystemClock.elapsedRealtime() >= this.l)) {
	            this.i();
	        }
	        if (!this.m) {
	            this.registerReceiver(this.w, new android.content.IntentFilter("android.net.wifi.WIFI_STATE_CHANGED"));
	        }
	        this.j();
	        return;
	    }
	
	
	    public void onSaveInstanceState(android.os.Bundle p3)
	    {
	        p3.putBoolean("chooserShown", this.m);
	        p3.putBoolean("warningShown", this.n);
	        p3.putBoolean("wifiShown", this.p);
	        super.onSaveInstanceState(p3);
	        return;
	    }
	
	
	    public void onStart()
	    {
	        super.onStart();
	        this.e.a();
	        this.s = new ty().a(a.c(blf.G(this))).a(a.c(blf.H(this))).a();
	        this.q.d.a(this.s, this.r, 1);
	        t v0_8 = this.b;
	        if (v0_8.a("castScreenAlertDialog") == null) {
	            if ((blf.D(this)) || ((this.q.b()) || ((this.n) || (android.preference.PreferenceManager.getDefaultSharedPreferences(this.getApplicationContext()).getBoolean("CAST_SCREEN_DO_NOT_SHOW_WARNING", 0))))) {
	                this.o = 1;
	            } else {
	                new bbi().a(v0_8, "castScreenAlertDialog");
	                this.n = 1;
	            }
	        }
	        return;
	    }
	
	
	    public void onStop()
	    {
	        this.q.d.a(this.r);
	        this.e.b();
	        super.onStop();
	        return;
	    }
	
	
	    public void showTips(android.view.View p2)
	    {
	        this.startActivity(com.google.android.apps.chromecast.app.HelpActivity.a(this, blf.E(this)));
	        return;
	    }
	
	
	    public void startMirroring(android.view.View p4)
	    {
	        bbl v0_1 = com.google.android.apps.chromecast.app.mirror.CastScreenActivity.u.getWifiState();
	        if ((v0_1 == 3) || (v0_1 == 2)) {
	            this.p = 0;
	            this.startMirroring();
	        } else {
	            this.p = 1;
	            new bbl().a(this.b, "castScreenWifiDialog");
	        }
	        return;
	    }
	
