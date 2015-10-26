	private static final I b
	private static final java.util.Set c
	private static final java.util.List d
	private aqw Z
	public afm a
	private android.view.View aa
	private android.widget.ViewFlipper ab
	private android.widget.ListView ac
	private android.widget.TextView ad
	private art ae
	private dcj af
	private android.support.v7.widget.SwitchCompat ag
	private  ah
	private final blp ai
	private  aj
	
	    static arp()
	    {
	        java.util.List v0_0 = new int[14];
	        v0_0 = {1, 2, 3, 4, 7, 9, 10, 11, 13, 14, 12, 16, 17, 18};
	        arp.b = v0_0;
	        String v1_1 = new Integer[4];
	        v1_1[0] = Integer.valueOf(14);
	        v1_1[1] = Integer.valueOf(13);
	        v1_1[2] = Integer.valueOf(12);
	        v1_1[3] = Integer.valueOf(16);
	        arp.c = new java.util.HashSet(java.util.Arrays.asList(v1_1));
	        java.util.List v0_3 = new String[1];
	        v0_3[0] = "user_photos";
	        arp.d = java.util.Arrays.asList(v0_3);
	        return;
	    }
	
	
	    public arp()
	    {
	        this.ah = 1;
	        this.ai = new blp("BackdropSettingFragment", 0);
	        this.aj = 0;
	        return;
	    }
	
	
	    public static arp a(dcj p4)
	    {
	        arp v0_1 = new arp();
	        android.os.Bundle v1_1 = new android.os.Bundle();
	        if (p4 != null) {
	            v1_1.putByteArray("userSettingMetadata", dcj.a(p4));
	        }
	        v0_1.f(v1_1);
	        return v0_1;
	    }
	
	
	    static synthetic bbw a(arp p7, dcm p8, dcj p9)
	    {
	        return new bbw(blf.z(p7.y), p7.Z.r(), p8, p9.j, new arr(p7), new ars(p7));
	    }
	
	
	    static synthetic blp a(arp p1)
	    {
	        return p1.ai;
	    }
	
	
	    static synthetic dcm a(arp p4, afb p5)
	    {
	        if ((p5.d != null) && ((p5.h != null) && (p5.a != null))) {
	            dcm v0_4 = new dcm();
	            v0_4.b = p5.d;
	            v0_4.a = p5.h;
	            v0_4.c = Long.valueOf(p5.a.getTime());
	        } else {
	            dcm v0_6 = new Object[3];
	            v0_6[0] = p5.d;
	            v0_6[1] = p5.h;
	            v0_6[2] = p5.a;
	            v0_4 = 0;
	        }
	        return v0_4;
	    }
	
	
	    static synthetic aqw b(arp p1)
	    {
	        return p1.Z;
	    }
	
	
	    public static java.util.List b(dcj p1)
	    {
	        if ((p1.m == null) || (p1.m.length <= 0)) {
	            java.util.List v0_3 = arp.d;
	        } else {
	            v0_3 = java.util.Arrays.asList(p1.m);
	        }
	        return v0_3;
	    }
	
	
	    private void q()
	    {
	        if (this.af != null) {
	            this.ab.setDisplayedChild(0);
	            this.Z.c(this.af.c);
	        } else {
	            this.ab.setDisplayedChild(1);
	            ((android.widget.TextView) this.N.findViewById(f.dd)).setText(b.dC);
	        }
	        if (this.ab.getDisplayedChild() == 0) {
	            this.ae.clear();
	            dcj[] v4 = this.af.i;
	            int v5 = v4.length;
	            int v3_4 = 0;
	            while (v3_4 < v5) {
	                int v0_22;
	                dcj v6 = v4[v3_4];
	                int v0_20 = v6.a;
	                if (v0_20 == 0) {
	                    v0_22 = 0;
	                } else {
	                    int v7 = v0_20.intValue();
	                    int v0_21 = 0;
	                    while (v0_21 < arp.b.length) {
	                        if (arp.b[v0_21] != v7) {
	                            v0_21++;
	                        } else {
	                            v0_22 = 1;
	                        }
	                    }
	                }
	                if (v0_22 != 0) {
	                    this.ae.add(v6);
	                }
	                v3_4++;
	            }
	            if ((this.af.d == null) || (this.ad == null)) {
	                if (this.ad != null) {
	                    this.ad.setVisibility(8);
	                }
	                this.ac.setHeaderDividersEnabled(0);
	            } else {
	                this.ad.setText(this.af.d);
	                this.ad.setVisibility(0);
	                this.ac.setHeaderDividersEnabled(1);
	            }
	        }
	        return;
	    }
	
	
	    private boolean r()
	    {
	        int v0 = 1;
	        String[] v3 = this.af.k;
	        if ((v3 != null) && (v3.length > 0)) {
	            int v2_2 = 0;
	            while (v2_2 < v3.length) {
	                if (!this.Z.h().s().a(v3[v2_2])) {
	                    v2_2++;
	                }
	            }
	            v0 = 0;
	        }
	        return v0;
	    }
	
	
	    private boolean s()
	    {
	        if ((this.af != null) && ((this.af.b != null) && (!this.Z.h().s().a(this.af.j)))) {
	            int v0_7 = 0;
	        } else {
	            v0_7 = 1;
	        }
	        return v0_7;
	    }
	
	
	    public final android.view.View a(android.view.LayoutInflater p9, android.view.ViewGroup p10, android.os.Bundle p11)
	    {
	        int v5;
	        int v6 = 0;
	        int v0_0 = this.af;
	        if ((v0_0 == 0) || (v0_0.s == null)) {
	            if ((v0_0 != 0) && (v0_0.i != null)) {
	                dcj[] v1_2 = v0_0.i;
	                int v0_1 = 0;
	                while (v0_1 < v1_2.length) {
	                    boolean v3_0 = v1_2[v0_1];
	                    if ((v3_0.a == null) || (!arp.c.contains(v3_0.a))) {
	                        v0_1++;
	                    } else {
	                        v5 = 1;
	                        this.ae = new art(this.y, this, 17367043, new java.util.ArrayList(), v5);
	                        dcj[] v1_4 = p9.inflate(a.fE, p10, 0);
	                        this.aa = v1_4.findViewById(f.aO);
	                        this.ab = ((android.widget.ViewFlipper) v1_4.findViewById(f.eu));
	                        this.ac = ((android.widget.ListView) v1_4.findViewById(f.dD));
	                        if (v5 == 0) {
	                            this.ad = ((android.widget.TextView) p9.inflate(a.fw, 0));
	                            this.ac.addHeaderView(this.ad, 0, 0);
	                        }
	                        if (v5 != 0) {
	                            int v0_19 = blx.a(this.y);
	                            boolean v2_3 = this.e();
	                            int v0_23 = ((android.widget.FrameLayout$LayoutParams) this.ac.getLayoutParams());
	                            v0_23.width = Math.min((v0_19 - (v2_3.getDimensionPixelSize(a.dE) << 1)), v2_3.getDimensionPixelSize(a.dD));
	                            this.ac.setLayoutParams(v0_23);
	                            this.ac.setVerticalScrollBarEnabled(0);
	                            this.ac.setDivider(new android.graphics.drawable.ColorDrawable(0));
	                            this.ac.setDividerHeight(this.e().getDimensionPixelSize(a.dN));
	                        }
	                        this.ac.setAdapter(this.ae);
	                        if (this.s()) {
	                            v6 = 8;
	                        }
	                        this.aa.setVisibility(v6);
	                        return v1_4;
	                    }
	                }
	            }
	            v5 = 0;
	        } else {
	            v5 = v0_0.s.booleanValue();
	        }
	    }
	
	
	    public final void a()
	    {
	        super.a();
	        this.a = 0;
	        return;
	    }
	
	
	    public final void a(int p2, int p3, android.content.Intent p4)
	    {
	        super.a(p2, p3, p4);
	        if (this.a != null) {
	            this.a.a(p2, p3, p4);
	        }
	        return;
	    }
	
	
	    public final void a(android.app.Activity p2)
	    {
	        super.a(p2);
	        if (!afv.a()) {
	            afv.a(p2.getApplicationContext());
	        }
	        if (this.a == null) {
	            this.a = new aik();
	        }
	        this.Z = ((aqw) p2);
	        return;
	    }
	
	
	    public final void a(android.os.Bundle p6)
	    {
	        super.a(p6);
	        if (p6 == null) {
	            p6 = this.m;
	        }
	        if (p6 != null) {
	            dev v0_1 = p6.getByteArray("userSettingMetadata");
	            if ((this.af == null) && (v0_1 != null)) {
	                try {
	                    this.af = dcj.a(v0_1);
	                } catch (dev v0_3) {
	                    blp v1_1 = this.ai;
	                    Object[] v3_1 = new Object[1];
	                    v3_1[0] = v0_3;
	                    v1_1.a("Could not load user setting metadata: %s", v3_1);
	                }
	            }
	        }
	        return;
	    }
	
	
	    public final void a(android.view.Menu p3, android.view.MenuInflater p4)
	    {
	        p4.inflate(a.gW, p3);
	        this.ag = asr.a(p3.findItem(f.bJ), this, Boolean.valueOf(this.s()));
	        super.a(p3, p4);
	        this.q();
	        return;
	    }
	
	
	    public final void a_(int p4)
	    {
	        android.support.v7.widget.SwitchCompat v0_1 = this.Z.h();
	        if (p4 != 4) {
	            if (p4 != 1) {
	                if ((p4 == 2) && (this.af != null)) {
	                    if (this.af.j != null) {
	                        if (this.ag == null) {
	                            if (this.ag == null) {
	                                this.q();
	                            }
	                        } else {
	                            this.ag.setChecked(this.s());
	                        }
	                    }
	                    this.ae.notifyDataSetChanged();
	                }
	            } else {
	                this.q();
	            }
	        } else {
	            if (this.af != null) {
	                this.af = v0_1.b(this.af.j);
	                this.q();
	            } else {
	                this.af = v0_1.t().b;
	                if (this.af != null) {
	                    this.q();
	                } else {
	                    this.y.b.c();
	                    android.widget.Toast.makeText(this.y, this.a(b.aa), 1).show();
	                }
	            }
	        }
	        return;
	    }
	
	
	    public final void e(android.os.Bundle p3)
	    {
	        super.e(p3);
	        if (this.af != null) {
	            p3.putByteArray("userSettingMetadata", dcj.a(this.af));
	        }
	        this.ah = 0;
	        return;
	    }
	
	
	    public final void j()
	    {
	        int v0_0 = 1;
	        super.j();
	        this.Z.h().a(this);
	        this.ah = 1;
	        if ((this.af == null) || (this.af.b == null)) {
	            v0_0 = 0;
	        }
	        if (this.ag == null) {
	            this.d(v0_0);
	        } else {
	            if (v0_0 == 0) {
	                this.ag.setVisibility(8);
	                this.ag = 0;
	            } else {
	                this.ag.setVisibility(0);
	                this.ag.setChecked(this.s());
	                this.ag.setOnCheckedChangeListener(this);
	            }
	        }
	        this.q();
	        return;
	    }
	
	
	    public final void k()
	    {
	        super.k();
	        this.Z.h().b(this);
	        return;
	    }
	
	
	    public final void l()
	    {
	        super.l();
	        android.widget.Toast v0_2 = this.Z.h().s();
	        if ((this.ah) && ((this.af != null) && ((this.af.j != null) && ((!this.r()) && (v0_2.a(this.af.j)))))) {
	            v0_2.a(this.af.j, 0);
	            this.Z.h().b(2);
	            android.widget.Toast v0_6 = this.y.getApplicationContext();
	            Object[] v2_1 = new Object[1];
	            v2_1[0] = this.af.c;
	            android.widget.Toast.makeText(v0_6, this.a(b.ai, v2_1), 0).show();
	        }
	        return;
	    }
	
	
	    public final void onCheckedChanged(android.widget.CompoundButton p4, boolean p5)
	    {
	        int v0_0 = 0;
	        if (p4 == this.ag) {
	            this.q();
	            if (!this.aj) {
	                if (p5) {
	                    v0_0 = 8;
	                }
	                this.aa.setVisibility(v0_0);
	            } else {
	                this.aj = 0;
	            }
	            this.Z.h().s().a(this.af.j, p5);
	            this.Z.h().d.a();
	            ape.a().a(new apd(76).a(this.af.b.intValue()));
	        }
	        return;
	    }
	
	
	    public final void p()
	    {
	        boolean v0 = this.r();
	        if ((this.ag != null) && (this.ag.isChecked() != v0)) {
	            this.aj = 1;
	            this.ag.setChecked(v0);
	            this.Z.h().s().a(this.af.j, v0);
	        }
	        return;
	    }
	
