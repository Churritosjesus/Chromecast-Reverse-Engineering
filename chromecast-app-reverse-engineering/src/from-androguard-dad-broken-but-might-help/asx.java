	private static final java.lang.String b
	private final blp Z
	private aqw aa
	private ard ab
	private ark ac
	private  ad
	private android.widget.CompoundButton ae
	private lw af
	private android.view.View ag
	private android.widget.ViewFlipper ah
	private android.view.View ai
	private android.widget.TextView aj
	private android.widget.ListView ak
	private  al
	private dcj am
	private  an
	private  c
	private android.view.MenuItem d
	
	    static asx()
	    {
	        asx.b = 0;
	        return;
	    }
	
	
	    public asx()
	    {
	        this.Z = new blp("PhotosFragment", 0);
	        this.al = 1;
	        this.an = 0;
	        return;
	    }
	
	
	    static synthetic int a(asx p1)
	    {
	        return p1.c;
	    }
	
	
	    public static asx a(dcj p1)
	    {
	        return asx.a(p1, "");
	    }
	
	
	    public static asx a(dcj p4, String p5)
	    {
	        asx v0_1 = new asx();
	        android.os.Bundle v1_1 = new android.os.Bundle();
	        v1_1.putString("photoSettingDescription", p4.d);
	        v1_1.putByteArray("settingMetadata", dcj.a(p4));
	        v1_1.putString("targetUser", p5);
	        v1_1.putString(0, p4.c);
	        v0_1.f(v1_1);
	        return v0_1;
	    }
	
	
	    static synthetic void a(asx p0, int p1)
	    {
	        p0.b(p1);
	        return;
	    }
	
	
	    private void a(boolean p6)
	    {
	        android.widget.TextView v0_2;
	        this.ak.setFocusable(p6);
	        int v3_0 = this.ab.f;
	        if ((!p6) || (v3_0 != 0)) {
	            v0_2 = 0;
	        } else {
	            v0_2 = 1;
	        }
	        this.af.setEnabled(v0_2);
	        if ((!p6) || ((v3_0 == 0) || (this.af.b))) {
	            if (this.ai == null) {
	                this.ai = ((android.view.LayoutInflater) this.y.getSystemService("layout_inflater")).inflate(a.gl, 0);
	                this.aj = ((android.widget.TextView) this.ai.findViewById(f.cl));
	                this.ah.addView(this.ai, 1);
	            }
	            this.aj.setText(b.bO);
	            this.ah.setDisplayedChild(1);
	        } else {
	            this.ah.setDisplayedChild(0);
	            ((android.widget.TextView) this.N.findViewById(f.dd)).setText(b.cJ);
	        }
	        return;
	    }
	
	
	    private void b(int p3)
	    {
	        if (!this.ab.f) {
	            this.af.a(1);
	            this.ab.h = p3;
	            this.ab.a();
	        }
	        return;
	    }
	
	
	    private void b(boolean p3)
	    {
	        asb v0_2 = this.aa.h().s();
	        if (v0_2.a(this.am.j) != p3) {
	            v0_2.a(this.am.j, p3);
	            this.aa.h().d.a();
	        }
	        return;
	    }
	
	
	    public final android.view.View a(android.view.LayoutInflater p12, android.view.ViewGroup p13, android.os.Bundle p14)
	    {
	        android.view.View v9 = p12.inflate(a.fz, p13, 0);
	        int v0_2 = blx.a(this.y);
	        boolean v1_0 = this.e();
	        int v6 = Math.min((v0_2 - (v1_0.getDimensionPixelSize(a.dE) << 1)), v1_0.getDimensionPixelSize(a.dD));
	        this.ak = ((android.widget.ListView) v9.findViewById(16908298));
	        int v0_9 = ((android.widget.FrameLayout$LayoutParams) this.ak.getLayoutParams());
	        v0_9.width = v6;
	        this.ak.setLayoutParams(v0_9);
	        this.af = ((lw) v9.findViewById(f.dm));
	        boolean v1_3 = this.af;
	        ash v2_4 = new int[4];
	        v2_4[0] = a.du;
	        v2_4[1] = a.dv;
	        v2_4[2] = a.dw;
	        v2_4[3] = a.dx;
	        asx v3_2 = v1_3.getResources();
	        dcj v4_0 = new int[4];
	        int v0_17 = 0;
	        while (v0_17 < 4) {
	            v4_0[v0_17] = v3_2.getColor(v2_4[v0_17]);
	            v0_17++;
	        }
	        v1_3.a();
	        int v0_18 = v1_3.e;
	        v0_18.a.a(v4_0);
	        v0_18.a.a(0);
	        this.af.a = new asy(this);
	        try {
	            int v0_36;
	            this.am = dcj.a(this.m.getByteArray("settingMetadata"));
	            this.ah = ((android.widget.ViewFlipper) v9.findViewById(16908292));
	            this.ag = v9.findViewById(f.aO);
	        } catch (int v0_33) {
	            boolean v1_9 = this.Z;
	            asx v3_3 = new Object[1];
	            v3_3[0] = v0_33;
	            v1_9.a("Could not load user setting metadata: %s", v3_3);
	            this.x.c();
	            int v0_35 = v9;
	            return v0_35;
	        }
	        if (!this.aa.h().s().a(this.am.j)) {
	            v0_36 = 0;
	        } else {
	            v0_36 = 8;
	        }
	        this.ag.setVisibility(v0_36);
	        this.aa.c(this.m.getString(0));
	        this.ab = new ard(this.y, this.aa.h(), this, this.am, this.m.getString("targetUser"), v6, this.c);
	        this.aa.h().a(this.ab);
	        this.ak.setAdapter(this.ab);
	        this.d(1);
	        this.ad = this.aa.h().s().a(this.am.j);
	        if (p14 != null) {
	            this.c = p14.getInt("sortOptionState");
	            this.ad = p14.getBoolean("photoSettingsState", this.ad);
	            if (p14.getBoolean("userRequestedRefresh", 0)) {
	                this.af.a(1);
	                this.b(this.c);
	            }
	        }
	        v0_35 = v9;
	        return v0_35;
	    }
	
	
	    public final void a()
	    {
	        super.a();
	        this.aa = 0;
	        return;
	    }
	
	
	    public final void a(android.app.Activity p1)
	    {
	        super.a(p1);
	        this.aa = ((aqw) p1);
	        return;
	    }
	
	
	    public final void a(android.view.Menu p11, android.view.MenuInflater p12)
	    {
	        p11.findItem(f.bS).setVisible(1);
	        if ((this.am.i[0].p != null) && (this.am.i[0].p.length > 0)) {
	            p12.inflate(a.hc, p11);
	            p11.findItem(f.bW).setVisible(1);
	            android.view.SubMenu v2 = p11.findItem(f.bW).getSubMenu();
	            dcf[] v3 = this.am.i[0].p;
	            int v4 = v3.length;
	            int v0_19 = 0;
	            while (v0_19 < v4) {
	                boolean v5_0 = v3[v0_19];
	                android.view.MenuItem v6_2 = v2.add(f.dT, v5_0.a.intValue(), 0, v5_0.b).setCheckable(1);
	                if ((v5_0.c != null) && (v5_0.c.booleanValue())) {
	                    v6_2.setChecked(1);
	                    this.d = v6_2;
	                }
	                v0_19++;
	            }
	            v2.setGroupCheckable(f.dT, 1, 1);
	        }
	        p12.inflate(a.gW, p11);
	        this.ae = asr.a(p11.findItem(f.bJ), this, Boolean.valueOf(this.ad));
	        return;
	    }
	
	
	    public final void a(android.view.View p7, int p8)
	    {
	        ape v0_2 = ((android.widget.CheckBox) p7.findViewById(f.Y));
	        v0_2.toggle();
	        apd v1_0 = this.ab;
	        ape v0_3 = v0_2.isChecked();
	        int v2_0 = v1_0.b(p8);
	        try {
	            String v4_2 = v1_0.a(String.valueOf(v2_0.a), v2_0.e);
	        } catch (ape v0_8) {
	            throw v0_8;
	        }
	        if (v0_3 == null) {
	            v1_0.a.remove(v4_2);
	            v1_0.i.remove(String.valueOf(v2_0.a));
	        } else {
	            ape v0_7 = new dca();
	            if (v2_0.a != null) {
	                v0_7.a = String.valueOf(v2_0.a);
	            }
	            v0_7.b = v2_0.e;
	            v1_0.a.put(v4_2, v0_7);
	        }
	        dca[] v5_6 = new dca[v1_0.a.size()];
	        v1_0.b.s().c(v1_0.g).b = ((dca[]) v1_0.a.values().toArray(v5_6));
	        v1_0.b.d.a();
	        if (v1_0.e != null) {
	            v1_0.e.p();
	        }
	        ape v0_21;
	        if (this.ab.a.size() == 0) {
	            v0_21 = 0;
	        } else {
	            v0_21 = 1;
	        }
	        this.b(v0_21);
	        ape.a().a(new apd(76).a(this.am.b.intValue()));
	        return;
	    }
	
	
	    public final void a(String p4, String p5, int p6, Long p7, String p8, int p9)
	    {
	        this.ac = ark.a(p4, p5, p6, p7, p8, p9);
	        this.ac.a(this.y.b, "backdropPreviewFragment");
	        return;
	    }
	
	
	    public final boolean a(android.view.MenuItem p4)
	    {
	        boolean v0 = 1;
	        if (p4.getItemId() != f.bS) {
	            if (p4.getItemId() != f.bW) {
	                if (p4.getGroupId() != f.dT) {
	                    v0 = super.a(p4);
	                } else {
	                    if (this.d != p4) {
	                        this.d.setChecked(0);
	                        p4.setChecked(1);
	                        this.c = p4.getItemId();
	                        this.d = p4;
	                        this.b(this.c);
	                    } else {
	                        this.b(this.c);
	                    }
	                }
	            } else {
	                this.d.setChecked(1);
	            }
	        } else {
	            this.b(this.c);
	        }
	        return v0;
	    }
	
	
	    public final void a_(int p3)
	    {
	        if (p3 != 2) {
	            if (p3 == 3) {
	                this.ab.notifyDataSetChanged();
	            }
	        } else {
	            if ((this.aa.h().s().a(this.am.j)) && (this.ae != null)) {
	                this.ae.setChecked(1);
	            }
	            boolean v0_11;
	            if (this.ae != null) {
	                v0_11 = this.ae.isChecked();
	            } else {
	                v0_11 = this.ad;
	            }
	            this.a(v0_11);
	        }
	        return;
	    }
	
	
	    public final void b()
	    {
	        if ((this.ae != null) && (!this.ae.isChecked())) {
	            int v0_3 = 0;
	        } else {
	            v0_3 = 1;
	        }
	        this.a(v0_3);
	        return;
	    }
	
	
	    public final void c()
	    {
	        int v0 = 0;
	        this.af.a(0);
	        if ((this.ae == null) || (this.ae.isChecked())) {
	            v0 = 1;
	        }
	        this.a(v0);
	        return;
	    }
	
	
	    public final void e(android.os.Bundle p3)
	    {
	        super.e(p3);
	        if (this.ae != null) {
	            p3.putBoolean("photoSettingsState", this.ae.isChecked());
	            p3.putBoolean("userRequestedRefresh", this.af.b);
	            p3.putInt("sortOptionState", this.c);
	        }
	        this.al = 0;
	        return;
	    }
	
	
	    public final void j()
	    {
	        super.j();
	        this.aa.h().a(this);
	        this.ab.d = this;
	        this.ab.c = this;
	        return;
	    }
	
	
	    public final void k()
	    {
	        super.k();
	        this.aa.h().b(this);
	        this.ab.d = 0;
	        this.ab.c = 0;
	        return;
	    }
	
	
	    public final void l()
	    {
	        super.l();
	        android.widget.Toast v0_2 = this.aa.h().s();
	        if ((this.al) && ((v0_2.a(this.am.j)) && ((this.ab.a.size() == 0) && (!this.y.isFinishing())))) {
	            this.aa.h().s().a(this.am.j, 0);
	            this.aa.h().b(2);
	            android.widget.Toast.makeText(this.y.getApplicationContext(), b.cK, 0).show();
	        }
	        this.aa.h().b(this.ab);
	        this.af = 0;
	        this.ah = 0;
	        this.aj = 0;
	        this.ab = 0;
	        return;
	    }
	
	
	    public final void onCheckedChanged(android.widget.CompoundButton p4, boolean p5)
	    {
	        ape v0_0 = 0;
	        if (p4 == this.ae) {
	            this.b(p5);
	            this.a(p5);
	            if (!this.an) {
	                if (p5) {
	                    v0_0 = 8;
	                }
	                this.ag.setVisibility(v0_0);
	                ape.a().a(new apd(76).a(this.am.b.intValue()));
	            } else {
	                this.an = 0;
	            }
	        }
	        return;
	    }
	
	
	    public final void p()
	    {
	        int v0_3;
	        if (this.ab.a.size() <= 0) {
	            v0_3 = 0;
	        } else {
	            v0_3 = 1;
	        }
	        if (this.ae.isChecked() != v0_3) {
	            this.an = 1;
	            this.ae.setChecked(v0_3);
	            this.aa.h().s().a(this.am.j, v0_3);
	        }
	        return;
	    }
	
