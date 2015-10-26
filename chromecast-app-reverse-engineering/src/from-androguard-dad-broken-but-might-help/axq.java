	final android.content.Context b
	final java.util.List c
	public android.support.v7.widget.RecyclerView d
	public bcm e
	final  f
	  g
	private final blp h
	private final  i
	private Ldau j
	private I k
	private final yz l
	private com.google.android.apps.chromecast.app.widget.SnappingRecyclerView m
	
	    public axq(android.content.Context p3, boolean p4)
	    {
	        this.h = new blp("ShelfAdapter");
	        this.c = new java.util.ArrayList();
	        this.d = 0;
	        this.b = p3;
	        this.i = p4;
	        this.f = blx.a(((android.app.Activity) p3));
	        this.l = new axr(this);
	        return;
	    }
	
	
	    private boolean b()
	    {
	        int v0_2;
	        if (this.c.size() <= 0) {
	            v0_2 = 0;
	        } else {
	            v0_2 = 1;
	        }
	        return v0_2;
	    }
	
	
	    public final int a()
	    {
	        int v0_0 = 0;
	        if (this.j != null) {
	            v0_0 = (this.j.length + 0);
	        }
	        if (this.i) {
	            v0_0++;
	        }
	        if (this.b()) {
	            v0_0++;
	        }
	        return v0_0;
	    }
	
	
	    public final int a(int p2)
	    {
	        if ((!this.b()) || (p2 != 0)) {
	            if ((!this.i) || (p2 != (this.a() - 1))) {
	                if (this.b()) {
	                    p2--;
	                }
	                if ((this.j == null) || (p2 >= this.j.length)) {
	                    throw new IllegalStateException();
	                } else {
	                    if (this.j[p2].a == null) {
	                        if (this.j[p2].c == null) {
	                            if (this.j[p2].d == null) {
	                                if (this.j[p2].b == null) {
	                                    throw new IllegalStateException();
	                                } else {
	                                    IllegalStateException v0_24 = 3;
	                                }
	                            } else {
	                                v0_24 = 2;
	                            }
	                        } else {
	                            v0_24 = 1;
	                        }
	                    } else {
	                        v0_24 = 0;
	                    }
	                }
	            } else {
	                v0_24 = 4;
	            }
	        } else {
	            v0_24 = 5;
	        }
	        return v0_24;
	    }
	
	
	    public final zr a(android.view.ViewGroup p6, int p7)
	    {
	        axw v0_21;
	        switch (p7) {
	            case 0:
	                v0_21 = new bau(android.view.LayoutInflater.from(this.b).inflate(a.fq, p6, 0));
	                break;
	            case 1:
	                v0_21 = new bax(android.view.LayoutInflater.from(this.b).inflate(a.fH, p6, 0));
	                break;
	            case 2:
	                v0_21 = new axy(android.view.LayoutInflater.from(this.b).inflate(a.fO, p6, 0));
	                break;
	            case 3:
	                v0_21 = new bbd(android.view.LayoutInflater.from(this.b).inflate(a.gC, p6, 0));
	                break;
	            case 4:
	                com.google.android.apps.chromecast.app.widget.SnappingRecyclerView v1_20 = android.view.LayoutInflater.from(this.b).inflate(a.fn, p6, 0);
	                v1_20.setOnClickListener(new axv(this));
	                v0_21 = new axw(this, v1_20);
	                break;
	            case 5:
	                this.m = ((com.google.android.apps.chromecast.app.widget.SnappingRecyclerView) android.view.LayoutInflater.from(this.b).inflate(a.gq, p6, 0));
	                this.m.a(this.l);
	                axw v0_6 = new xw(this.b);
	                v0_6.a(0);
	                this.m.a(v0_6);
	                com.google.android.apps.chromecast.app.widget.SnappingRecyclerView v1_4 = this.b.getResources();
	                axw v0_10 = blx.a(((android.app.Activity) this.b));
	                java.util.ArrayList v2_1 = v1_4.getDimensionPixelSize(a.dT);
	                this.g = Math.max((v1_4.getDimensionPixelSize(a.dS) + (v2_1 * 2)), Math.min((v1_4.getDimensionPixelSize(a.dR) + (v2_1 * 2)), v0_10));
	                this.m.a(new axt(this, v2_1));
	                this.m.s = this.g;
	                axw v0_17 = ((zi) this.m.getLayoutParams());
	                v0_17.height = ((int) (((float) this.g) * 1054567863));
	                this.m.setLayoutParams(v0_17);
	                axw v0_18 = this.m;
	                com.google.android.apps.chromecast.app.widget.SnappingRecyclerView v1_16 = new axu(this);
	                if (v0_18.p == null) {
	                    v0_18.p = new java.util.ArrayList();
	                }
	                v0_18.p.add(v1_16);
	                v0_21 = new axw(this, this.m);
	                break;
	            default:
	                throw new IllegalStateException();
	        }
	        return v0_21;
	    }
	
	
	    public final void a(bcd p6, int p7)
	    {
	        yz v0_1 = new Object[1];
	        v0_1[0] = Integer.valueOf(p7);
	        yz v0_3 = this.l.a();
	        try {
	            int v2_2 = this.c.indexOf(p6);
	        } catch (yz v0_12) {
	            throw v0_12;
	        }
	        if (v2_2 != -1) {
	            this.c.remove(v2_2);
	            if ((!this.c.isEmpty()) || (v0_3 <= null)) {
	                if ((v0_3 != 2147483647) || (this.l.a() == 2147483647)) {
	                    yz v0_7 = new Object[1];
	                    v0_7[0] = Integer.valueOf(p7);
	                    this.l.d(p7);
	                } else {
	                    this.l.a.a();
	                }
	            } else {
	                this.d(0);
	            }
	        }
	        return;
	    }
	
	
	    public final void a(java.util.List p4)
	    {
	        za v0_1 = new Object[1];
	        v0_1[0] = Integer.valueOf(p4.size());
	        try {
	            if ((!this.c.isEmpty()) || (p4.isEmpty())) {
	                if ((!p4.isEmpty()) || (this.c.isEmpty())) {
	                    if ((!p4.isEmpty()) && (!this.c.isEmpty())) {
	                        this.c.clear();
	                        this.c.addAll(p4);
	                        this.b(0);
	                        this.l.a.a();
	                    }
	                } else {
	                    this.c.clear();
	                    this.d(0);
	                    this.l.a.a();
	                }
	            } else {
	                this.c.addAll(p4);
	                this.c(0);
	                this.l.a.a();
	                if (this.d != null) {
	                    this.d.a(0);
	                }
	            }
	        } catch (za v0_26) {
	            throw v0_26;
	        }
	        return;
	    }
	
	
	    public final void a(zr p19, int p20)
	    {
	        int v8;
	        if (!this.b()) {
	            v8 = p20;
	        } else {
	            v8 = (p20 - 1);
	        }
	        switch (this.a(p20)) {
	            case 0:
	                xq v12_3 = this.j[v8].a;
	                int v6_13 = ((bau) p19).a.getResources().getDimensionPixelSize(a.dL);
	                ((bau) p19).k.a(com.google.android.apps.chromecast.app.SetupApplication.i().m, v12_3.a.a, 0, v6_13, v6_13);
	                int v2_95 = ((bau) p19).a;
	                baw v3_63 = ((bau) p19).a.getContext();
	                int v5_30 = new Object[1];
	                v5_30[0] = v12_3.b;
	                v2_95.setContentDescription(v3_63.getString(b.z, v5_30));
	                ((bau) p19).l.setText(v12_3.b);
	                if (v12_3.d != Boolean.TRUE) {
	                    ((bau) p19).n.setMaxLines(3);
	                    ((bau) p19).m.setVisibility(8);
	                } else {
	                    ((bau) p19).n.setMaxLines(2);
	                    ((bau) p19).m.setVisibility(0);
	                }
	                if (!android.text.TextUtils.isEmpty(v12_3.c)) {
	                    ((bau) p19).n.setVisibility(0);
	                    ((bau) p19).n.setText(v12_3.c);
	                } else {
	                    ((bau) p19).n.setVisibility(8);
	                }
	                int v2_108 = apg.a(125);
	                v2_108.b = v12_3.g;
	                int v2_109 = v2_108.a();
	                blx.a(((bau) p19).o, v12_3.e);
	                ((bau) p19).a.setOnClickListener(new bav(((bau) p19), v12_3, v2_109));
	                int v2_111 = ((bau) p19).a.getContext();
	                baw v3_77 = v2_111.getResources();
	                int v11_8 = v3_77.getDimensionPixelSize(a.dJ);
	                int v5_31 = ((blx.a(((android.app.Activity) v2_111)) - (v11_8 << 1)) - (v3_77.getDimensionPixelSize(a.dV) << 1));
	                int v6_15 = v3_77.getDimensionPixelSize(a.ec);
	                baw v3_78 = 0;
	                int v9_2 = 0;
	                int v7_10 = v12_3.h;
	                int v10_2 = v7_10.length;
	                String v4_42 = 0;
	                while (v4_42 < v10_2) {
	                    int v2_118;
	                    int v2_117 = v7_10[v4_42];
	                    if (!bau.a(v2_117.a)) {
	                        v2_118 = v9_2;
	                    } else {
	                        int v2_122;
	                        android.view.LayoutInflater v13_7 = ((v2_117.a.b.intValue() * v6_15) / v2_117.a.c.intValue());
	                        if (v9_2 != 0) {
	                            v2_122 = v11_8;
	                        } else {
	                            v2_122 = 0;
	                        }
	                        android.view.LayoutInflater v13_8 = (v13_7 + v2_122);
	                        if ((v3_78 + v13_8) > v5_31) {
	                            break;
	                        }
	                        v2_118 = (v9_2 + 1);
	                        v3_78 += v13_8;
	                    }
	                    v4_42++;
	                    v9_2 = v2_118;
	                }
	                if ((v3_78 == null) && ((v12_3.h.length > 0) && (bau.a(v12_3.h[0].a)))) {
	                    int v2_131 = v12_3.h[0];
	                    v3_78 = ((v2_131.a.b.intValue() * v6_15) / v2_131.a.c.intValue());
	                }
	                int v7_11;
	                if (v3_78 != null) {
	                    v7_11 = ((v5_31 * v6_15) / v3_78);
	                } else {
	                    v7_11 = 0;
	                }
	                if (v9_2 != 0) {
	                    ((bau) p19).p.setVisibility(0);
	                    ((bau) p19).p.removeAllViews();
	                    android.view.LayoutInflater v13_9 = android.view.LayoutInflater.from(((bau) p19).a.getContext());
	                    int v10_3 = 0;
	                    while (v10_3 < v9_2) {
	                        android.view.View v14_1 = v13_9.inflate(a.fP, 0);
	                        if (v10_3 != 0) {
	                            v14_1.setPadding(v11_8, 0, 0, 0);
	                        }
	                        String v15 = v12_3.g;
	                        dar v16 = v12_3.h[v10_3];
	                        int v2_146 = ((com.google.android.apps.chromecast.app.widget.ReusableImageView) v14_1.findViewById(f.al));
	                        String v4_46 = v2_146.getResources().getDimensionPixelSize(a.ef);
	                        if (!android.text.TextUtils.isEmpty(v16.b)) {
	                            baw v3_92 = ((android.widget.TextView) v14_1.findViewById(f.em));
	                            v3_92.setText(v16.b);
	                            v3_92.setPadding(0, v4_46, 0, 0);
	                            v2_146.setContentDescription(v16.b);
	                        }
	                        baw v3_96 = ((android.widget.TextView) v14_1.findViewById(f.ed));
	                        if ((v16.d == null) || (v16.d.e == null)) {
	                            v3_96.setVisibility(8);
	                        } else {
	                            v3_96.setText(v16.d.e);
	                            v3_96.setPadding(0, v4_46, 0, 0);
	                            v3_96.setVisibility(0);
	                        }
	                        if (bau.a(v16.a)) {
	                            v2_146.a(com.google.android.apps.chromecast.app.SetupApplication.i().m, v16.a.a, 0, ((v16.a.b.intValue() * v7_11) / v16.a.c.intValue()), v7_11);
	                            v2_146.setOnClickListener(new baw(((bau) p19), v16, v15, v8));
	                        }
	                        ((bau) p19).p.addView(v14_1);
	                        v10_3++;
	                    }
	                } else {
	                    ((bau) p19).p.setVisibility(8);
	                }
	                int v2_152 = apg.a(124).b(v8);
	                v2_152.b = this.j[v8].a.g;
	                v2_152.b();
	                break;
	            case 1:
	                int v10_1 = this.j[v8].c;
	                blx.a(((bax) p19).l, v10_1.c, v10_1.d, apg.a(127).b(v8).a());
	                int v2_49 = ((bax) p19).a;
	                baw v3_42 = ((bax) p19).a.getContext();
	                int v5_19 = new Object[2];
	                v5_19[0] = v10_1.a;
	                v5_19[1] = v10_1.b;
	                v2_49.setContentDescription(v3_42.getString(b.A, v5_19));
	                ((bax) p19).m.setText(v10_1.a);
	                if (!android.text.TextUtils.isEmpty(v10_1.b)) {
	                    ((bax) p19).n.setVisibility(0);
	                    ((bax) p19).n.setText(v10_1.b);
	                } else {
	                    ((bax) p19).n.setVisibility(8);
	                }
	                baw v3_48 = ((bax) p19).a.getResources();
	                int v2_61 = (blx.a(((android.app.Activity) ((bax) p19).a.getContext())) - (v3_48.getDimensionPixelSize(a.dV) << 1));
	                String v4_23 = v3_48.getDimensionPixelSize(a.dJ);
	                int v5_21 = v3_48.getDimensionPixelSize(a.dL);
	                baw v3_49 = v3_48.getDimensionPixelSize(a.dM);
	                int v11_7 = Math.min(v10_1.e.length, (v2_61 / (v5_21 + (v4_23 * 2))));
	                int v6_12 = Math.min(((v2_61 / v11_7) - (v4_23 * 2)), v3_49);
	                if (v11_7 != 0) {
	                    ((bax) p19).k.setVisibility(0);
	                    ((bax) p19).k.removeAllViews();
	                    int v9_1 = 0;
	                    while (v9_1 < v11_7) {
	                        xq v12_2 = v10_1.e[v9_1];
	                        android.view.LayoutInflater v13_0 = android.view.LayoutInflater.from(((bax) p19).a.getContext()).inflate(a.ft, 0);
	                        int v2_73 = ((android.widget.TextView) v13_0.findViewById(f.o));
	                        baw v3_54 = ((android.widget.TextView) v13_0.findViewById(f.m));
	                        String v4_28 = ((android.widget.TextView) v13_0.findViewById(f.bB));
	                        int v5_25 = new android.widget.LinearLayout$LayoutParams(v6_12, -2);
	                        v2_73.setLayoutParams(v5_25);
	                        v3_54.setLayoutParams(v5_25);
	                        v4_28.setLayoutParams(v5_25);
	                        v2_73.setText(v12_2.b);
	                        v3_54.setText(v12_2.c);
	                        blx.a(v4_28, v12_2.d);
	                        int v2_77 = apg.a(125);
	                        v2_77.b = v12_2.f;
	                        android.view.View v14_0 = v2_77.b(v8).a();
	                        ((com.google.android.apps.chromecast.app.widget.ReusableImageView) v13_0.findViewById(f.r)).a(com.google.android.apps.chromecast.app.SetupApplication.i().m, v12_2.a.a, 0, v6_12, v6_12);
	                        v13_0.setOnClickListener(new bay(((bax) p19), v12_2, v14_0));
	                        ((bax) p19).k.addView(v13_0);
	                        v9_1++;
	                    }
	                } else {
	                    ((bax) p19).k.setVisibility(8);
	                }
	                apg.a(124).b(v8).b();
	                break;
	            case 2:
	                int v9_0 = this.j[v8].d;
	                int v10_0 = this.k;
	                ((axy) p19).k.setText(v9_0.b);
	                int v2_16 = apg.a(118);
	                v2_16.b = v9_0.e;
	                int v11_0 = v2_16.a();
	                if (v9_0.a == null) {
	                    ((axy) p19).l.setVisibility(8);
	                } else {
	                    ((axy) p19).l.setVisibility(0);
	                    ((axy) p19).l.a(com.google.android.apps.chromecast.app.SetupApplication.i().m, v9_0.a.a, 1, 0, ((axy) p19).l.getResources().getDimensionPixelOffset(a.dY));
	                    ((axy) p19).l.setOnClickListener(new aya(((axy) p19), v9_0, v11_0));
	                    int v2_24 = ((axy) p19).l;
	                    baw v3_14 = ((axy) p19).l.getContext();
	                    int v5_3 = new Object[1];
	                    v5_3[0] = v9_0.d;
	                    v2_24.setContentDescription(v3_14.getString(b.E, v5_3));
	                }
	                if ((v9_0.f != 2) || (android.text.TextUtils.isEmpty(v9_0.c))) {
	                    blx.a(((axy) p19).n, v9_0.c, v9_0.d, v11_0);
	                } else {
	                    ((axy) p19).n.setText(v9_0.c);
	                    ((axy) p19).n.setOnClickListener(new ayb(((axy) p19)));
	                }
	                baw v3_30;
	                String v4_14;
	                baw v3_21 = ((axy) p19).a.getContext().getResources();
	                int v5_4 = v3_21.getDimensionPixelSize(a.dI);
	                int v7_2 = v3_21.getDimensionPixelSize(a.dH);
	                int v2_37 = ((android.widget.RelativeLayout$LayoutParams) ((axy) p19).m.getLayoutParams());
	                switch (v9_0.f) {
	                    case 1:
	                        v4_14 = v3_21.getDimensionPixelSize(a.dG);
	                        v3_30 = (v4_14 + v5_4);
	                        v2_37.height = (v3_30 + v7_2);
	                        ((axy) p19).m.a(((axy) p19).o);
	                        break;
	                    case 2:
	                        int v6_2 = v3_21.getDimensionPixelSize(a.dA);
	                        int v11_1 = (v6_2 + (v3_21.getDimensionPixelSize(a.dz) * 2));
	                        int v5_6 = (v11_1 + v3_21.getDimensionPixelSize(a.dB));
	                        String v4_13 = ((axy) p19).a.getContext();
	                        baw v3_27 = (blx.a(((android.app.Activity) v4_13)) / v11_1);
	                        int v11_6 = (((v9_0.g.length + v3_27) - 1) / v3_27);
	                        ((axy) p19).m.a(new xq(v4_13, v3_27));
	                        v2_37.height = (v5_6 * v11_6);
	                        v3_30 = v5_6;
	                        v4_14 = v6_2;
	                        break;
	                    default:
	                        v4_14 = v3_21.getDimensionPixelSize(a.dQ);
	                        v3_30 = (v4_14 + v5_4);
	                        v2_37.height = (v3_30 + v7_2);
	                        ((axy) p19).m.a(((axy) p19).o);
	                }
	                ((axy) p19).m.setLayoutParams(v2_37);
	                ((axy) p19).m.a(new axx(((axy) p19).m.getContext(), v9_0, v4_14, (v3_30 - v7_2)));
	                if ((v10_0 == 0) || (v10_0.length <= v8)) {
	                    ((axy) p19).m.o = new aye(((axy) p19), v8, v9_0);
	                } else {
	                    new android.os.Handler().post(new ayc(((axy) p19), v10_0, v8, v9_0));
	                }
	                int v2_45 = apg.a(116).b(v8);
	                v2_45.b = this.j[v8].d.e;
	                v2_45.b();
	                break;
	            case 3:
	                int v2_5 = this.j[v8].b;
	                ((bbd) p19).l.setText(v2_5.b);
	                if (!android.text.TextUtils.equals(((bbd) p19).m, v2_5.a.a)) {
	                    ((bbd) p19).m = v2_5.a.a;
	                    com.google.android.apps.chromecast.app.SetupApplication.i().a(((bbd) p19).m, ((bbd) p19).k, 0);
	                }
	                apg.a(124).b(v8).b();
	            case 4:
	            case 5:
	                break;
	            case 4:
	            case 5:
	                break;
	            default:
	                throw new IllegalStateException();
	        }
	        return;
	    }
	
	
	    public final void a(dau[] p2, int[] p3)
	    {
	        this.j = p2;
	        this.k = p3;
	        this.a.a();
	        return;
	    }
	
