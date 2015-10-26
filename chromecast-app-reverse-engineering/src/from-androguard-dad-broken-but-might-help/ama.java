	private ayz Z
	private android.os.Handler a
	private alm aa
	private ash ab
	private android.content.SharedPreferences ac
	private  ad
	private final blp ae
	private com.google.android.apps.chromecast.app.SetupApplication af
	private bbn ag
	private android.view.View ah
	private android.widget.ViewFlipper b
	private android.support.v7.widget.RecyclerView c
	private bmu d
	
	    public ama()
	    {
	        this.ae = new blp("DevicesFragment");
	        return;
	    }
	
	
	    static synthetic alm a(ama p1)
	    {
	        return p1.aa;
	    }
	
	
	    static synthetic void a(ama p0, aow p1, int p2)
	    {
	        p0.a(p1, p2);
	        return;
	    }
	
	
	    private void a(aow p11, int p12)
	    {
	        if (!p11.s) {
	            new android.os.Handler().post(new amd(this, p11));
	            if (!p11.q()) {
	                this.a(com.google.android.apps.chromecast.app.DeviceSettingsActivity.a(this.y, p11.f(), p11.n(), p11.c, p12, p11.a(), p11.j, p11.k));
	            } else {
	                this.a(com.google.android.apps.chromecast.app.setup.DeviceSetupActivity.a(this.y, p11.f(), p11.n(), p11.c, p12, p11.a(), p11.f, p11.e));
	            }
	        }
	        return;
	    }
	
	
	    private void a(String p6, String p7)
	    {
	        android.app.AlertDialog$Builder v0_1 = new amg(this);
	        int v1_1 = new android.app.AlertDialog$Builder(this.y);
	        Object[] v3_1 = new Object[2];
	        v3_1[0] = p6;
	        v3_1[1] = p7;
	        v1_1.setMessage(this.a(b.bJ, v3_1)).setPositiveButton(b.J, v0_1).setNegativeButton(b.H, 0).show();
	        return;
	    }
	
	
	    static synthetic blp b(ama p1)
	    {
	        return p1.ae;
	    }
	
	
	    static synthetic ash c(ama p1)
	    {
	        return p1.ab;
	    }
	
	
	    static synthetic bmu d(ama p1)
	    {
	        return p1.d;
	    }
	
	
	    static synthetic android.support.v7.widget.RecyclerView e(ama p1)
	    {
	        return p1.c;
	    }
	
	
	    static synthetic android.os.Handler f(ama p1)
	    {
	        return p1.a;
	    }
	
	
	    private boolean t()
	    {
	        int v0 = 0;
	        if (android.provider.Settings$Secure.getInt(this.y.getContentResolver(), "location_mode", 0) == 0) {
	            v0 = 1;
	        }
	        return v0;
	    }
	
	
	    private static boolean u()
	    {
	        int v0_1;
	        if (android.os.Build$VERSION.SDK_INT <= 22) {
	            v0_1 = 0;
	        } else {
	            v0_1 = 1;
	        }
	        return v0_1;
	    }
	
	
	    private void v()
	    {
	        if ((!this.t()) || ((!ama.u()) || ((this.aa.a(aoz.b)) || (this.aa.a(aoz.c))))) {
	            this.ah.setVisibility(8);
	        } else {
	            this.ah.setVisibility(0);
	        }
	        return;
	    }
	
	
	    public final android.view.View a(android.view.LayoutInflater p13, android.view.ViewGroup p14, android.os.Bundle p15)
	    {
	        android.view.View v10 = p13.inflate(a.fW, p14, 0);
	        this.af = com.google.android.apps.chromecast.app.SetupApplication.a();
	        this.a = new android.os.Handler();
	        this.ac = android.preference.PreferenceManager.getDefaultSharedPreferences(this.y);
	        this.ad = this.ac.getBoolean("FIRST_RUN", 1);
	        this.ag = bbn.a(this.y);
	        this.b = ((android.widget.ViewFlipper) v10.findViewById(f.ev));
	        android.support.v7.widget.RecyclerView v1_2 = this.y.b;
	        this.ab = ((ash) v1_2.a("backdropStorage"));
	        if (this.ab == null) {
	            this.ab = new ash();
	            v1_2.a().a(this.ab, "backdropStorage").b();
	        }
	        android.view.View v0_49;
	        this.aa = com.google.android.apps.chromecast.app.SetupApplication.a().b();
	        this.Z = ((ami) this.y).a();
	        this.ah = v10.findViewById(f.g);
	        this.v();
	        this.ah.setOnClickListener(this);
	        this.c = ((android.support.v7.widget.RecyclerView) v10.findViewById(f.aA));
	        this.c.f = 1;
	        this.c.a(new xw(this.y));
	        int v11 = blx.a(this.y);
	        android.view.View v0_36 = this.e();
	        int v9 = Math.min((v11 - (v0_36.getDimensionPixelSize(a.dE) << 1)), v0_36.getDimensionPixelSize(a.dD));
	        this.ah.getLayoutParams().width = v9;
	        this.d = new bmu(this.y, atf.a(this.y), this.aa.g, this.aa.h, this.aa.m, this.ab, this.ag, new amb(this), v9);
	        android.view.View v0_43 = new Object[3];
	        v0_43[0] = Integer.valueOf(this.aa.g.size());
	        v0_43[1] = Integer.valueOf(this.aa.m.size());
	        v0_43[2] = Integer.valueOf(this.aa.h.size());
	        this.aa.d = this.d;
	        this.aa.a(this, blr.c(this.y));
	        android.support.v7.widget.RecyclerView v1_18 = bkh.a();
	        android.view.View v0_46 = v1_18.g;
	        int v2_18 = this.d;
	        v0_46.d.add(v2_18);
	        v2_18.a(v0_46.b());
	        if (v1_18.d == null) {
	            v0_49 = 0;
	        } else {
	            v0_49 = 1;
	        }
	        if (v0_49 == null) {
	            v1_18.b();
	        }
	        this.c.a(this.d);
	        this.c.a(new amh(this, this.e().getDimensionPixelSize(a.dF), ((v11 - v9) / 2)));
	        android.view.View v0_53 = new xe();
	        v0_53.m = 0;
	        this.c.a(v0_53);
	        v10.findViewById(f.dG).setOnClickListener(this);
	        v10.findViewById(f.dH).setOnClickListener(this);
	        return v10;
	    }
	
	
	    public final void a(com.google.android.gms.cast.CastDevice p5, com.google.android.gms.cast.CastDevice p6)
	    {
	        if (((p5 != null) || (p6 != null)) && ((p5 == null) || (!p5.equals(p6)))) {
	            java.util.Iterator v1 = this.aa.g.iterator();
	            while (v1.hasNext()) {
	                aow v0_5 = ((aow) v1.next());
	                if ((v0_5.e()) && ((p5 != null) && (p5.b.equals(v0_5.b.b)))) {
	                    v0_5.p();
	                }
	            }
	        }
	        return;
	    }
	
	
	    public final void a_(int p3)
	    {
	        if (p3 == 1) {
	            this.aa.a(this.ab.p());
	        }
	        return;
	    }
	
	
	    public final void d()
	    {
	        super.d();
	        aqj v0_1 = new Object[3];
	        v0_1[0] = Integer.valueOf(this.aa.g.size());
	        v0_1[1] = Integer.valueOf(this.aa.m.size());
	        v0_1[2] = Integer.valueOf(this.aa.h.size());
	        aqj v0_2 = this.aa;
	        if (v0_2.d == this.d) {
	            v0_2.d = 0;
	        }
	        aqj v0_3 = this.aa;
	        v0_3.e.remove(this);
	        if (v0_3.e.size() == 0) {
	            java.util.Iterator v1_13 = v0_3.c.a.values().iterator();
	            while (v1_13.hasNext()) {
	                aqj v0_9 = ((aqj) v1_13.next());
	                Object[] v2_5 = new Object[1];
	                v2_5[0] = v0_9.b.c.b;
	                v0_9.g();
	            }
	        }
	        this.ag = 0;
	        return;
	    }
	
	
	    public final void j()
	    {
	        super.j();
	        this.v();
	        this.d.a.a();
	        this.ab.a(this);
	        if (this.ab.p() != null) {
	            this.aa.a(this.ab.p());
	        }
	        this.Z.a = this;
	        if (this.ag != null) {
	            this.ag.a(this);
	            this.ag.d();
	        }
	        this.q();
	        return;
	    }
	
	
	    public final void k()
	    {
	        super.k();
	        this.ab.b(this);
	        this.Z.a = 0;
	        if (this.ag != null) {
	            this.ag.b(this);
	        }
	        super.k();
	        return;
	    }
	
	
	    public final void l()
	    {
	        super.l();
	        java.util.ArrayList v1_0 = bkh.a().g;
	        int v0_1 = 0;
	        while (v0_1 < v1_0.d.size()) {
	            if (v1_0.d.get(v0_1) != this.d) {
	                v0_1++;
	            } else {
	                v1_0.d.remove(v0_1);
	                break;
	            }
	        }
	        return;
	    }
	
	
	    public final void onClick(android.view.View p6)
	    {
	        String v0_1;
	        String v1_0 = 1;
	        int v3 = p6.getId();
	        if (v3 != f.dG) {
	            v0_1 = 0;
	        } else {
	            v0_1 = 1;
	        }
	        if (v3 != f.dH) {
	            v1_0 = 0;
	        }
	        if ((v0_1 != null) || (v1_0 != null)) {
	            if ((!this.t()) || (!ama.u())) {
	                this.a(com.google.android.apps.chromecast.app.NoDevicesActivity.a(this.y, v1_0));
	            } else {
	                String v1_2;
	                if (v0_1 == null) {
	                    v1_2 = this.a(b.bd);
	                } else {
	                    v1_2 = this.a(b.bc);
	                }
	                String v0_5;
	                if (v0_1 == null) {
	                    v0_5 = this.a(b.be);
	                } else {
	                    v0_5 = this.a(b.bg);
	                }
	                this.a(v1_2, v0_5);
	            }
	        }
	        if (v3 == f.g) {
	            this.a(this.a(b.bc), this.a(b.bg));
	        }
	        return;
	    }
	
	
	    public final void p()
	    {
	        this.q();
	        return;
	    }
	
	
	    public final void q()
	    {
	        android.widget.ViewFlipper v0_17;
	        if (((com.google.android.apps.chromecast.app.MainActivity) this.y).k()) {
	            if ((this.aa.g.size() != 0) || ((this.aa.h.size() != 0) || (this.aa.m.size() != 0))) {
	                if ((!this.ad) || ((this.aa.b() != 1) || (!this.aa.c()))) {
	                    v0_17 = 1;
	                } else {
	                    v0_17 = 0;
	                }
	            } else {
	                if (!this.Z.c) {
	                    v0_17 = 0;
	                } else {
	                    v0_17 = 2;
	                }
	            }
	        } else {
	            v0_17 = 3;
	        }
	        if (this.b.getDisplayedChild() != v0_17) {
	            this.b.setDisplayedChild(v0_17);
	        }
	        return;
	    }
	
	
	    public final void r()
	    {
	        int v2 = 0;
	        if (this.af.h) {
	            java.util.Iterator v4_1;
	            boolean v5 = this.ad;
	            this.af.h = 0;
	            this.ad = 0;
	            this.ac.edit().putBoolean("FIRST_RUN", this.ad).apply();
	            if (this.aa.b() != 1) {
	                v4_1 = 0;
	            } else {
	                v4_1 = ((aow) this.aa.g.get(0));
	            }
	            if ((v4_1 == null) || (!v4_1.q())) {
	                boolean v0_14 = 0;
	            } else {
	                v0_14 = 1;
	            }
	            bke v3_1;
	            ape v6 = ape.a();
	            if (!v0_14) {
	                v3_1 = 0;
	            } else {
	                v3_1 = 1;
	            }
	            v6.a(50, Integer.valueOf(v3_1), Long.valueOf(this.Z.d));
	            if (!v0_14) {
	                bke v3_3 = bkh.a().g;
	                if (v5) {
	                    v3_3.c = 1;
	                    v3_3.a();
	                }
	                boolean v0_16 = this.aa;
	                if (!v0_16.g.isEmpty()) {
	                    java.util.Iterator v4_4 = v0_16.g.iterator();
	                    while (v4_4.hasNext()) {
	                        if (((aow) v4_4.next()).q()) {
	                        }
	                    }
	                    v2 = 1;
	                }
	                if (v2 == 0) {
	                    if ((!this.aa.a()) && (!this.aa.c())) {
	                        v3_3.a = 1;
	                        v3_3.a();
	                    }
	                } else {
	                    v3_3.b = 1;
	                    v3_3.a = 1;
	                    v3_3.a();
	                }
	            } else {
	                this.a(v4_1, -1);
	            }
	        }
	        this.q();
	        return;
	    }
	
	
	    public final void s()
	    {
	        this.v();
	        azg v7 = com.google.android.apps.chromecast.app.SetupApplication.a().g;
	        if (v7 != null) {
	            bdf v1_0 = this.aa.g.iterator();
	            while (v1_0.hasNext()) {
	                aow v6_1 = ((aow) v1_0.next());
	                if ((v6_1.q()) && ((v6_1.f().equals(v7.a)) && ((v6_1.c.G == bdj.o) && (!v6_1.s)))) {
	                    bdu v0_11 = v7.a();
	                    if (v0_11 == null) {
	                        v0_11 = v6_1.c.b;
	                    }
	                    v6_1.s = 1;
	                    v6_1.t = v0_11;
	                    v7.a(new bdu(v6_1.n(), v6_1.c.a, 0, bew.a, 0), v6_1.c, new ame(this, v6_1, v7));
	                    break;
	                }
	            }
	        }
	        ((com.google.android.apps.chromecast.app.MainActivity) this.y).f.b.notifyDataSetChanged();
	        this.q();
	        return;
	    }
	
