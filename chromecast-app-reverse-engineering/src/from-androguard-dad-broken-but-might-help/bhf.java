	private static final  d
	private com.google.android.apps.chromecast.app.DeviceSettingsActivity Z
	public java.util.ArrayList a
	private bmg aa
	private bmi ab
	private android.view.View ac
	private android.widget.TextView ad
	private android.view.View ae
	private android.widget.Spinner af
	private android.widget.Spinner ag
	private android.widget.Spinner ah
	private android.view.View ai
	private android.support.v7.widget.SwitchCompat aj
	private android.support.v7.widget.SwitchCompat ak
	private android.widget.CheckBox al
	private android.widget.CheckBox am
	private android.view.View an
	private android.widget.TextView ao
	private android.widget.CompoundButton ap
	private android.widget.TextView aq
	private android.widget.Button ar
	private android.view.View as
	private android.widget.TextView at
	private final android.os.Handler au
	private java.lang.Runnable av
	private blp aw
	public android.widget.ViewFlipper b
	public android.widget.TextView c
	
	    static bhf()
	    {
	        bhf.d = java.util.concurrent.TimeUnit.SECONDS.toMillis(5);
	        return;
	    }
	
	
	    public bhf()
	    {
	        this.au = new android.os.Handler();
	        this.aw = new blp("DeviceSettingsFragment", 0);
	        return;
	    }
	
	
	    static synthetic bmg a(bhf p0, bmg p1)
	    {
	        p0.aa = p1;
	        return p1;
	    }
	
	
	    static synthetic bmi a(bhf p0, bmi p1)
	    {
	        p0.ab = p1;
	        return p1;
	    }
	
	
	    static synthetic com.google.android.apps.chromecast.app.DeviceSettingsActivity a(bhf p1)
	    {
	        return p1.Z;
	    }
	
	
	    private String a(bdk p2)
	    {
	        String v0_3;
	        if (p2 != bdk.a) {
	            if (p2 != bdk.b) {
	                v0_3 = this.a(b.dQ);
	            } else {
	                v0_3 = this.a(b.dP);
	            }
	        } else {
	            v0_3 = this.a(b.dO);
	        }
	        return v0_3;
	    }
	
	
	    static synthetic java.util.ArrayList a(bhf p0, java.util.ArrayList p1)
	    {
	        p0.a = p1;
	        return p1;
	    }
	
	
	    private java.util.List a(bcz p5)
	    {
	        java.util.Collection v1_1 = new java.util.TreeMap();
	        if (this.Z.i.X != null) {
	            java.util.Iterator v2 = this.Z.i.X.iterator();
	            while (v2.hasNext()) {
	                String v0_12 = ((bcz) v2.next());
	                v1_1.put(v0_12.toString(), v0_12);
	            }
	        }
	        if ((p5 != null) && (p5.toString() != null)) {
	            v1_1.put(p5.toString(), p5);
	        }
	        return new java.util.ArrayList(v1_1.values());
	    }
	
	
	    private void a(int p4, int p5, String p6)
	    {
	        android.widget.TextView v0_2 = ((android.widget.TextView) this.ac.findViewById(p4));
	        if (!android.text.TextUtils.isEmpty(p6)) {
	            v0_2.setVisibility(0);
	            String v1_2 = new Object[1];
	            v1_2[0] = p6;
	            v0_2.setText(this.a(p5, v1_2));
	        } else {
	            v0_2.setVisibility(8);
	        }
	        return;
	    }
	
	
	    private void a(int p3, android.widget.Spinner p4)
	    {
	        this.ac.findViewById(p3).setOnClickListener(new bhl(this, p4));
	        return;
	    }
	
	
	    static synthetic void a(bhf p0, int p1)
	    {
	        p0.b(p1);
	        return;
	    }
	
	
	    static synthetic void a(bhf p4, bcz p5)
	    {
	        if (!p5.equals(p4.q().K)) {
	            int v0_4 = p4.ah.getSelectedItemPosition();
	            java.util.HashMap v1_1 = new java.util.HashMap();
	            v1_1.put("locale", p5);
	            if ((p4.q().d()) && (p4.q().J != null)) {
	                v1_1.put("time_format", p4.q().J);
	            }
	            p4.Z.a(v1_1, new bhk(p4, v0_4), 39);
	        }
	        return;
	    }
	
	
	    static synthetic void a(bhf p4, bdb p5)
	    {
	        if (!p5.equals(p4.q().I)) {
	            int v0_4 = p4.af.getSelectedItemPosition();
	            java.util.HashMap v1_1 = new java.util.HashMap();
	            v1_1.put("timezone", p5);
	            p4.Z.a(v1_1, new bhj(p4, v0_4), 38);
	        }
	        return;
	    }
	
	
	    static synthetic void a(bhf p4, bdk p5)
	    {
	        if (!p5.equals(p4.q().J)) {
	            int v0_4 = p4.ag.getSelectedItemPosition();
	            java.util.HashMap v1_1 = new java.util.HashMap();
	            v1_1.put("time_format", p5);
	            p4.Z.a(v1_1, new bhn(p4, v0_4), 62);
	        }
	        return;
	    }
	
	
	    static synthetic void a(bhf p0, String p1)
	    {
	        p0.c(p1);
	        return;
	    }
	
	
	    static synthetic void a(bhf p4, boolean p5)
	    {
	        apd v0_0 = p4.q();
	        if (p5 != v0_0.O) {
	            apd v0_3;
	            ape v1_2 = new java.util.HashMap();
	            v1_2.put("opt_in_stats", Boolean.valueOf(p5));
	            p4.Z.a(v1_2, new bhw(p4, v0_0), -1);
	            ape v1_3 = ape.a();
	            apd v2_3 = new apd(56);
	            if (!p5) {
	                v0_3 = 0;
	            } else {
	                v0_3 = 1;
	            }
	            v1_3.a(v2_3.a(v0_3));
	        }
	        return;
	    }
	
	
	    private void a(boolean p5)
	    {
	        if (this.ap != null) {
	            if (p5 != this.ap.isChecked()) {
	                this.ap.setOnCheckedChangeListener(0);
	                this.ap.setChecked(p5);
	                this.ap.setOnCheckedChangeListener(this);
	            }
	            android.widget.TextView v0_7 = this.Z.i;
	            if (p5 != v0_7.c()) {
	                android.widget.TextView v0_10;
	                String v1_3 = new java.util.HashMap();
	                v1_3.put("opt_in_opencast", Boolean.valueOf(p5));
	                this.Z.a(v1_3, new bia(this, v0_7), -1);
	                String v1_4 = ape.a();
	                apd v2_3 = new apd(72);
	                if (!p5) {
	                    v0_10 = 0;
	                } else {
	                    v0_10 = 1;
	                }
	                v1_4.a(v2_3.a(v0_10));
	            }
	            if (!p5) {
	                if (this.av != null) {
	                    this.au.removeCallbacks(this.av);
	                }
	                this.ap.setText(b.dg);
	                this.ao.setText(b.dg);
	                this.aq.setText("");
	            } else {
	                this.ap.setText(b.dh);
	                this.b(this.Z.i.R);
	            }
	        }
	        return;
	    }
	
	
	    static synthetic bmg b(bhf p1)
	    {
	        return p1.aa;
	    }
	
	
	    static synthetic void b(bhf p0, String p1)
	    {
	        p0.b(p1);
	        return;
	    }
	
	
	    static synthetic void b(bhf p4, boolean p5)
	    {
	        int v0_0 = p4.q();
	        if (p5 != v0_0.Q) {
	            java.util.HashMap v1_2 = new java.util.HashMap();
	            v1_2.put("opt_in_device_id", Boolean.valueOf(p5));
	            p4.Z.a(v1_2, new bhx(p4, v0_0), -1);
	        }
	        return;
	    }
	
	
	    private void b(String p5)
	    {
	        if (!android.text.TextUtils.isEmpty(p5)) {
	            Runnable v1_1 = new Object[1];
	            v1_1[0] = p5;
	            android.os.Handler v0_2 = this.a(b.dn, v1_1);
	            this.ao.setText(v0_2);
	            this.aq.setText(v0_2);
	        } else {
	            this.ao.setText(b.dl);
	            this.aq.setText(b.dl);
	            if (this.av == null) {
	                this.av = new bhy(this);
	            }
	            this.au.postDelayed(this.av, bhf.d);
	        }
	        return;
	    }
	
	
	    static synthetic bmi c(bhf p1)
	    {
	        return p1.ab;
	    }
	
	
	    private void c(int p2)
	    {
	        if (this.b.getDisplayedChild() != p2) {
	            this.b.setDisplayedChild(p2);
	        }
	        return;
	    }
	
	
	    static synthetic void c(bhf p4, boolean p5)
	    {
	        int v0_0 = p4.q();
	        if (p5 != v0_0.M) {
	            java.util.HashMap v1_2 = new java.util.HashMap();
	            v1_2.put("system_sound_effects", Boolean.valueOf(p5));
	            p4.Z.a(v1_2, new bhu(p4, v0_0), -1);
	        }
	        return;
	    }
	
	
	    private void c(String p3)
	    {
	        aow v0_2 = com.google.android.apps.chromecast.app.SetupApplication.a().b().c(this.Z.h);
	        if (v0_2 != null) {
	            v0_2.c.R = p3;
	            v0_2.p();
	        }
	        return;
	    }
	
	
	    static synthetic android.widget.Spinner d(bhf p1)
	    {
	        return p1.af;
	    }
	
	
	    static synthetic void d(bhf p4, boolean p5)
	    {
	        int v0_0 = p4.q();
	        if (p5 != v0_0.N) {
	            java.util.HashMap v1_2 = new java.util.HashMap();
	            v1_2.put("opt_in_audio_hdr", Boolean.valueOf(p5));
	            p4.Z.a(v1_2, new bhv(p4, v0_0), -1);
	        }
	        return;
	    }
	
	
	    static synthetic android.widget.Spinner e(bhf p1)
	    {
	        return p1.ah;
	    }
	
	
	    static synthetic void e(bhf p0, boolean p1)
	    {
	        p0.a(p1);
	        return;
	    }
	
	
	    static synthetic android.widget.Spinner f(bhf p1)
	    {
	        return p1.ag;
	    }
	
	
	    static synthetic android.support.v7.widget.SwitchCompat g(bhf p1)
	    {
	        return p1.aj;
	    }
	
	
	    static synthetic android.support.v7.widget.SwitchCompat h(bhf p1)
	    {
	        return p1.ak;
	    }
	
	
	    static synthetic android.widget.CheckBox i(bhf p1)
	    {
	        return p1.al;
	    }
	
	
	    static synthetic android.widget.CheckBox j(bhf p1)
	    {
	        return p1.am;
	    }
	
	
	    static synthetic void k(bhf p8)
	    {
	        if (p8.Z != null) {
	            bdu v0_2 = p8.Z.p;
	            bhz v7_1 = new bhz(p8);
	            long v2 = v0_2.d();
	            bdq v4_1 = new bdq(v0_2.d, 1024, v0_2.c);
	            v4_1.i = 1;
	            v0_2.a("getPinCode", v2, v4_1, bew.c, new bes(v0_2, v7_1, v4_1));
	        }
	        return;
	    }
	
	
	    static synthetic bdf l(bhf p1)
	    {
	        return p1.q();
	    }
	
	
	    static synthetic android.widget.CompoundButton m(bhf p1)
	    {
	        return p1.ap;
	    }
	
	
	    private void r()
	    {
	        if (this.s()) {
	            android.view.View v0_2 = this.ac.findViewById(f.D);
	            if (com.google.android.apps.chromecast.app.DeviceSettingsActivity.n()) {
	                if (this.Z.g.q()) {
	                    if (!this.Z.g.r()) {
	                        this.at.setText(b.dg);
	                    } else {
	                        this.at.setText(b.dh);
	                    }
	                } else {
	                    this.at.setText(b.dC);
	                    v0_2.setClickable(0);
	                    return;
	                }
	            } else {
	                this.at.setText(b.aj);
	            }
	            v0_2.setClickable(1);
	        }
	        return;
	    }
	
	
	    private boolean s()
	    {
	        if ((this.Z == null) || ((this.Z.g == null) || (!this.Z.s()))) {
	            int v0_5 = 0;
	        } else {
	            v0_5 = 1;
	        }
	        return v0_5;
	    }
	
	
	    public final android.view.View a(android.view.LayoutInflater p5, android.view.ViewGroup p6, android.os.Bundle p7)
	    {
	        if ((p7 != null) && (p7.containsKey("configuredNetworks"))) {
	            this.a = p7.getParcelableArrayList("configuredNetworks");
	        }
	        this.ac = p5.inflate(a.fU, p6, 0);
	        this.Z.c(this.e().getString(b.ba));
	        this.b = ((android.widget.ViewFlipper) this.ac.findViewById(f.aI));
	        this.ad = ((android.widget.TextView) this.ac.findViewById(f.ar));
	        this.ae = this.ac.findViewById(f.dF);
	        this.c = ((android.widget.TextView) this.ac.findViewById(f.as));
	        this.af = ((android.widget.Spinner) this.ac.findViewById(f.aL));
	        this.ag = ((android.widget.Spinner) this.ac.findViewById(f.aJ));
	        this.ah = ((android.widget.Spinner) this.ac.findViewById(f.aB));
	        this.ai = this.ac.findViewById(f.dE);
	        this.aj = ((android.support.v7.widget.SwitchCompat) this.ac.findViewById(f.be));
	        this.ak = ((android.support.v7.widget.SwitchCompat) this.ac.findViewById(f.bc));
	        this.an = this.ac.findViewById(f.cD);
	        this.an.setVisibility(8);
	        this.ap = ((android.widget.CompoundButton) this.ac.findViewById(f.bd));
	        this.ap.setOnCheckedChangeListener(this);
	        this.aq = ((android.widget.TextView) this.ac.findViewById(f.cB));
	        this.ao = ((android.widget.TextView) this.ac.findViewById(f.cC));
	        this.ar = ((android.widget.Button) this.ac.findViewById(f.bE));
	        this.al = ((android.widget.CheckBox) this.ac.findViewById(f.ap));
	        this.al.setOnCheckedChangeListener(new bhg(this));
	        this.as = this.ac.findViewById(f.D);
	        this.at = ((android.widget.TextView) this.ac.findViewById(f.E));
	        this.am = ((android.widget.CheckBox) this.ac.findViewById(f.ay));
	        this.am.setVisibility(8);
	        this.am.setOnCheckedChangeListener(new bhr(this));
	        this.d(1);
	        return this.ac;
	    }
	
	
	    public final void a()
	    {
	        super.a();
	        this.au.removeCallbacks(this.av);
	        this.Z = 0;
	        return;
	    }
	
	
	    public final void a(android.app.Activity p1)
	    {
	        super.a(p1);
	        this.Z = ((com.google.android.apps.chromecast.app.DeviceSettingsActivity) p1);
	        return;
	    }
	
	
	    public final void a(android.view.Menu p2, android.view.MenuInflater p3)
	    {
	        p3.inflate(a.gZ, p2);
	        p3.inflate(a.gX, p2);
	        super.a(p2, p3);
	        return;
	    }
	
	
	    public final void a(String p2)
	    {
	        this.ad.setText(p2);
	        return;
	    }
	
	
	    public final void a_(int p2)
	    {
	        if (p2 == 1) {
	            this.r();
	        }
	        return;
	    }
	
	
	    public void b(int p9)
	    {
	        int v3;
	        String v1_0 = 8;
	        if (p9 != 2) {
	            v3 = 0;
	        } else {
	            v3 = 1;
	        }
	        if ((p9 != 1) && (p9 != 2)) {
	            this.Z.c(this.e().getString(b.ba));
	            this.c(p9);
	        } else {
	            nh v0_2;
	            this.Z.c(this.e().getString(b.dm));
	            if (v3 == 0) {
	                v0_2 = 0;
	            } else {
	                v0_2 = 8;
	            }
	            this.ar.setVisibility(v0_2);
	            nh v0_4 = this.ac.findViewById(f.eB);
	            if (v3 != 0) {
	                v1_0 = 0;
	            }
	            v0_4.setVisibility(v1_0);
	            nh v0_6 = blx.a(this.y, this.Z.i);
	            int v5_6 = blx.b(this.y, this.Z.i);
	            int v6_1 = new Object[1];
	            v6_1[0] = v0_6;
	            String v1_7 = this.a(b.dj, v6_1);
	            Object[] v7_1 = new Object[2];
	            v7_1[0] = v0_6;
	            v7_1[1] = v5_6;
	            String v2_2 = this.a(b.di, v7_1);
	            if (v3 == 0) {
	                v1_7 = v2_2;
	            }
	            ((android.widget.TextView) this.ac.findViewById(f.eA)).setText(v1_7);
	            this.c(1);
	            this.Z.d().f();
	        }
	        return;
	    }
	
	
	    public final void e(android.os.Bundle p3)
	    {
	        p3.putParcelableArrayList("configuredNetworks", this.a);
	        return;
	    }
	
	
	    public final void g_()
	    {
	        super.g_();
	        if (this.s()) {
	            this.Z.g.a(this);
	        }
	        if (this.Z.i.X != null) {
	            this.p();
	        } else {
	            this.Z.u = 0;
	            com.google.android.apps.chromecast.app.DeviceSettingsActivity v0_7 = this.Z;
	            bic v2_0 = new Object[1];
	            v2_0[0] = this.Z.D();
	            v0_7.a(this.a(b.aR, v2_0), new bib(this));
	            this.Z.x();
	            this.Z.a(this.Z.p, new bic(this), 0, 1);
	        }
	        return;
	    }
	
	
	    public final void h_()
	    {
	        super.h_();
	        if (this.Z.g != null) {
	            this.Z.g.b(this);
	        }
	        return;
	    }
	
	
	    public final void onCheckedChanged(android.widget.CompoundButton p2, boolean p3)
	    {
	        if (p2 == this.ap) {
	            this.a(p3);
	            if (!p3) {
	                this.c(0);
	            }
	        }
	        return;
	    }
	
	
	    public final void p()
	    {
	        int v1 = 0;
	        int v4_0 = this.Z.i;
	        this.ad.setText(v4_0.b);
	        if (!v4_0.w) {
	            this.ae.setVisibility(0);
	            this.c.setText(v4_0.y);
	        } else {
	            this.ae.setVisibility(8);
	        }
	        this.an.setOnClickListener(new bif(this));
	        this.ar.setOnClickListener(new big(this));
	        this.ac.findViewById(f.aG).setOnClickListener(new bih(this));
	        this.ac.findViewById(f.dF).setOnClickListener(new bii(this));
	        android.view.View v0_14 = this.Z.i.I;
	        int v5_13 = new java.util.TreeSet();
	        if (this.Z.i.W != null) {
	            v5_13.addAll(this.Z.i.W);
	        }
	        if ((v0_14 != null) && ((v0_14.toString() != null) && (v0_14.b != null))) {
	            v5_13.add(v0_14);
	        }
	        String v6_9 = new java.util.ArrayList(v5_13);
	        int v5_15 = new bop(this.Z, v6_9);
	        this.af.setAdapter(v5_15);
	        if (v0_14 != null) {
	            com.google.android.apps.chromecast.app.DeviceSettingsActivity v7_2 = new Object[1];
	            v7_2[0] = v0_14;
	            android.view.View v0_15 = v5_15.getPosition(v0_14);
	            if (v0_15 != -1) {
	                this.af.setSelection(v0_15);
	            }
	        }
	        this.af.setOnItemSelectedListener(new bhh(this, v6_9));
	        this.a(f.aM, this.af);
	        android.view.View v0_20 = this.Z.i.K;
	        int v5_20 = this.a(v0_20);
	        String v6_11 = new android.widget.ArrayAdapter(this.Z, a.gJ, f.aY, v5_20);
	        v6_11.setDropDownViewResource(a.gL);
	        this.ah.setAdapter(v6_11);
	        if (v0_20 != null) {
	            com.google.android.apps.chromecast.app.DeviceSettingsActivity v7_6 = new Object[1];
	            v7_6[0] = v0_20;
	            android.view.View v0_21 = v6_11.getPosition(v0_20);
	            if (v0_21 != -1) {
	                this.ah.setSelection(v0_21);
	            }
	        }
	        android.view.View v0_25;
	        this.ah.setOnItemSelectedListener(new bhi(this, v5_20));
	        this.a(f.aC, this.ah);
	        if (!v4_0.d()) {
	            v0_25 = 8;
	        } else {
	            android.view.View v0_28 = this.Z.i.J;
	            int v5_23 = new java.util.ArrayList(2);
	            v5_23.add(this.a(bdk.a));
	            v5_23.add(this.a(bdk.b));
	            String v6_21 = new android.widget.ArrayAdapter(this.Z, a.gJ, v5_23);
	            v6_21.setDropDownViewResource(a.gL);
	            this.ag.setAdapter(v6_21);
	            if (v0_28 == bdk.b) {
	                this.ag.setSelection(1);
	            }
	            this.ag.setOnItemSelectedListener(new bhm(this));
	            this.a(f.aK, this.ag);
	            v0_25 = 0;
	        }
	        this.ac.findViewById(f.aK).setVisibility(v0_25);
	        this.a(f.az, b.aU, v4_0.u);
	        this.a(f.aD, b.aV, v4_0.p);
	        this.a(f.at, b.aJ, v4_0.c);
	        this.a(f.av, b.aS, v4_0.L);
	        this.al.setChecked(v4_0.O);
	        if (!v4_0.h) {
	            this.aj.setChecked(v4_0.M);
	            this.ak.setChecked(v4_0.N);
	            this.ac.findViewById(f.aH).setOnClickListener(new bho(this));
	            this.aj.setOnCheckedChangeListener(new bhp(this));
	            this.ac.findViewById(f.aw).setOnClickListener(new bhq(this));
	            this.ak.setOnCheckedChangeListener(new bhs(this));
	            ((android.widget.Button) this.ac.findViewById(f.bn)).setOnClickListener(new bht(this));
	            this.ai.setVisibility(0);
	        } else {
	            this.aj.setChecked(0);
	            this.ak.setChecked(0);
	            this.ai.setVisibility(8);
	        }
	        android.view.View v0_54;
	        if (v4_0.a > 5) {
	            v0_54 = 0;
	        } else {
	            v0_54 = 1;
	        }
	        if (v0_54 != null) {
	            this.am.setVisibility(0);
	            this.am.setChecked(v4_0.Q);
	        }
	        if (!v4_0.e()) {
	            this.an.setVisibility(8);
	        } else {
	            this.an.setVisibility(0);
	            this.a(v4_0.c());
	            android.view.View v0_63 = ((android.widget.ImageView) this.ac.findViewById(f.ez));
	            if (v0_63 != null) {
	                if (!v4_0.h) {
	                    v0_63.setImageResource(a.eB);
	                } else {
	                    v0_63.setImageResource(a.eA);
	                }
	            }
	        }
	        if (!this.s()) {
	            this.as.setVisibility(8);
	        } else {
	            this.r();
	            this.as.setVisibility(0);
	            android.view.View v0_68 = this.ac.findViewById(f.D);
	            v0_68.setOnClickListener(new bie(this));
	            if ((this.Z.g.q()) || (!com.google.android.apps.chromecast.app.DeviceSettingsActivity.n())) {
	                v1 = 1;
	            }
	            v0_68.setClickable(v1);
	        }
	        return;
	    }
	
	
	    bdf q()
	    {
	        return this.Z.i;
	    }
	
