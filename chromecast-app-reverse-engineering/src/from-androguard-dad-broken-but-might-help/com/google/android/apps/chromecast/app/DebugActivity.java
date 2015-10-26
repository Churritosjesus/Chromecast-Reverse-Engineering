	private bah e
	
	    public DebugActivity()
	    {
	        return;
	    }
	
	
	    public static synthetic int a(String p1, String[] p2)
	    {
	        return com.google.android.apps.chromecast.app.DebugActivity.b(p1, p2);
	    }
	
	
	    public static synthetic void a(com.google.android.apps.chromecast.app.DebugActivity p2)
	    {
	        bkh.a().g.f.clear();
	        android.preference.PreferenceManager.getDefaultSharedPreferences(com.google.android.apps.chromecast.app.SetupApplication.a()).edit().remove("IGNORED_ANNOUNCEMENT_CARDS").apply();
	        return;
	    }
	
	
	    private static int b(String p2, String[] p3)
	    {
	        int v0 = 0;
	        while (v0 < p3.length) {
	            if (!p3[v0].equals(p2)) {
	                v0++;
	            }
	            return v0;
	        }
	        v0 = -1;
	        return v0;
	    }
	
	
	    public final java.util.ArrayList b_()
	    {
	        return 0;
	    }
	
	
	    public final android.content.Intent e()
	    {
	        return 0;
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
	
	
	    public void onCreate(android.os.Bundle p9)
	    {
	        super.onCreate(p9);
	        this.setContentView(a.fR);
	        this.a(((android.support.v7.widget.Toolbar) this.findViewById(f.eo)));
	        this.e = new bah(this, this, bat.e);
	        this.d().a().a(b.aG);
	        android.widget.Switch v0_11 = ((android.widget.Spinner) this.findViewById(f.dB));
	        v0_11.setAdapter(new android.widget.ArrayAdapter(this, 17367049, bld.b));
	        v0_11.setOnItemSelectedListener(new alf(this));
	        v0_11.setSelection(bld.a.indexOf(blf.y(this)));
	        android.widget.Switch v0_14 = ((android.widget.Spinner) this.findViewById(f.an));
	        alj v1_8 = blj.e();
	        v1_8.add(0, new blm("", "Default"));
	        android.content.SharedPreferences v2_4 = new android.widget.ArrayAdapter(this, 17367048, v1_8);
	        v2_4.setDropDownViewResource(17367049);
	        v0_14.setAdapter(v2_4);
	        android.content.SharedPreferences v2_5 = blf.B(this);
	        if (v2_5 != null) {
	            v0_14.setSelection(v1_8.indexOf(blj.a(v1_8, v2_5)));
	        }
	        v0_14.setOnItemSelectedListener(new alg(this, v0_14));
	        alj v1_13 = new alh(this);
	        android.content.SharedPreferences v2_7 = v1_13.b();
	        android.widget.Switch v0_17 = ((android.widget.Spinner) this.findViewById(f.l));
	        v0_17.setAdapter(new android.widget.ArrayAdapter(this, 17367049, v1_13.c()));
	        String v3_5 = com.google.android.apps.chromecast.app.DebugActivity.b(v2_7, v1_13.d());
	        if (v3_5 >= null) {
	            v0_17.setSelection(v3_5);
	        }
	        v0_17.setOnItemSelectedListener(new alk(this, v0_17, v1_13, v2_7));
	        v0_17.setVisibility(0);
	        ((android.widget.Button) this.findViewById(f.do)).setOnClickListener(new ali(this));
	        android.widget.Switch v0_23 = ((android.widget.Switch) this.findViewById(f.ef));
	        v0_23.setVisibility(8);
	        this.findViewById(f.H).setVisibility(8);
	        v0_23.setChecked(android.preference.PreferenceManager.getDefaultSharedPreferences(this).getBoolean("PREF_BLE_ENABLED", blf.C(this)));
	        v0_23.setOnCheckedChangeListener(new alj(this));
	        return;
	    }
	
	
	    protected void onDestroy()
	    {
	        this.e.c();
	        super.onDestroy();
	        return;
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
	
	
	    public void onPostCreate(android.os.Bundle p2)
	    {
	        super.onPostCreate(p2);
	        this.e.c.c();
	        return;
	    }
	
	
	    public void onResume()
	    {
	        super.onResume();
	        android.widget.TextView v0_2 = ((android.widget.TextView) this.findViewById(f.bD));
	        int v1_0 = com.google.android.apps.chromecast.app.SetupApplication.a();
	        if (!v1_0.k()) {
	            v0_2.setText(b.bG);
	        } else {
	            Object[] v3_1 = new Object[2];
	            v3_1[0] = Long.valueOf(java.util.concurrent.TimeUnit.MILLISECONDS.toSeconds((android.os.SystemClock.elapsedRealtime() - v1_0.k)));
	            v3_1[1] = v1_0.l;
	            v0_2.setText(this.getString(b.bF, v3_1));
	        }
	        return;
	    }
	
	
	    public void onStart()
	    {
	        super.onStart();
	        this.e.a();
	        return;
	    }
	
	
	    public void onStop()
	    {
	        this.e.b();
	        super.onStop();
	        return;
	    }
	
