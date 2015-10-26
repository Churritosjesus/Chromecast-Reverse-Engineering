	public static blq k
	final atf b
	final java.util.List c
	public final java.util.List d
	final ash e
	final bbn f
	final bob g
	final android.content.Context h
	final android.os.Handler i
	final  j
	private dal l
	private final java.util.List m
	private final blp n
	private final  o
	private final  p
	
	    public bmu(android.content.Context p3, atf p4, java.util.List p5, java.util.List p6, java.util.List p7, ash p8, bbn p9, bob p10, int p11)
	    {
	        this.b = p4;
	        this.m = p5;
	        this.c = p6;
	        this.d = p7;
	        this.e = p8;
	        this.f = p9;
	        this.g = p10;
	        this.n = new blp("SetupCastDeviceAdapter");
	        this.h = p3;
	        this.i = new android.os.Handler();
	        this.j = p11;
	        this.o = ((p11 * 9) / 16);
	        this.p = blf.s(this.h);
	        bmu.k = atf.a(this.h).d;
	        this.a(this.m);
	        return;
	    }
	
	
	    static synthetic int a(bmu p1, int p2)
	    {
	        if (p1.l != null) {
	            p2--;
	        }
	        return p2;
	    }
	
	
	    private android.view.View$OnClickListener a(dak p7, Long p8)
	    {
	        blp v0_2;
	        switch (p7.c) {
	            case 0:
	                try {
	                    v0_2 = new bmz(this, android.content.Intent.parseUri(p7.b, 1));
	                } catch (blp v0) {
	                    blp v0_5 = this.n;
	                    Object[] v2_1 = new Object[2];
	                    v2_1[0] = p7.b;
	                    v2_1[1] = p8;
	                    v0_5.a("Failed to parse android intent: %s | for card: %ld", v2_1);
	                    v0_2 = 0;
	                }
	                break;
	            case 1:
	                v0_2 = new bna(this, p8);
	                break;
	            default:
	        }
	        return v0_2;
	    }
	
	
	    private void a(android.view.View p13, aow p14)
	    {
	        java.util.List v7 = p14.o().b;
	        if ((v7 != null) && (!v7.isEmpty())) {
	            p13.setVisibility(0);
	            android.view.View[] v8 = new android.view.View[4];
	            v8[0] = p13.findViewById(f.dw);
	            v8[1] = p13.findViewById(f.dx);
	            v8[2] = p13.findViewById(f.dy);
	            v8[3] = p13.findViewById(f.dz);
	            int v6 = 0;
	            while (v6 < 4) {
	                android.view.View v9 = v8[v6];
	                if (v6 < v7.size()) {
	                    dcw v2_7 = ((dcw) v7.get(v6));
	                    if ((v2_7.b() != dco.c) || (!android.text.TextUtils.isEmpty(p14.j))) {
	                        blx.a(v9, v2_7.a);
	                        v9.setOnClickListener(new bnk(this, v2_7, p14, v2_7.b, p13));
	                    } else {
	                        v9.setVisibility(8);
	                    }
	                } else {
	                    v9.setVisibility(8);
	                }
	                v6++;
	            }
	        } else {
	            p13.setVisibility(8);
	        }
	        return;
	    }
	
	
	    private void a(Iterable p3)
	    {
	        java.util.Iterator v1 = p3.iterator();
	        while (v1.hasNext()) {
	            this.a(((aow) v1.next()));
	        }
	        return;
	    }
	
	
	    private aow h(int p3)
	    {
	        aow v0_3;
	        if (this.l != null) {
	            v0_3 = ((aow) this.m.get((p3 - 1)));
	        } else {
	            v0_3 = ((aow) this.m.get(p3));
	        }
	        return v0_3;
	    }
	
	
	    public final int a()
	    {
	        int v0_1 = this.m.size();
	        if (this.l != null) {
	            v0_1++;
	        }
	        if (!this.c.isEmpty()) {
	            v0_1++;
	        }
	        if (!this.d.isEmpty()) {
	            v0_1++;
	        }
	        Object[] v1_6 = new Object[1];
	        v1_6[0] = Integer.valueOf(v0_1);
	        return v0_1;
	    }
	
	
	    public final int a(int p7)
	    {
	        Object[] v0_0 = 2;
	        if ((p7 != 0) || (this.l == null)) {
	            if ((this.c.isEmpty()) || (p7 != (this.a() - 1))) {
	                if ((this.d.isEmpty()) || (p7 != this.b())) {
	                    if (!this.h(p7).q()) {
	                        v0_0 = 1;
	                    } else {
	                        v0_0 = 0;
	                    }
	                } else {
	                    v0_0 = 5;
	                }
	            } else {
	                v0_0 = 4;
	            }
	        } else {
	            switch (this.l.e) {
	                case 0:
	                    break;
	                case 1:
	                    v0_0 = 3;
	                    break;
	                default:
	                    blp v3_3 = this.n;
	                    Object[] v2_1 = new Object[1];
	                    v2_1[0] = Integer.valueOf(this.l.e);
	                    v3_3.a("Unhandled announcement type: %d", v2_1);
	            }
	        }
	        return v0_0;
	    }
	
	
	    public final zr a(android.view.ViewGroup p6, int p7)
	    {
	        bnu v0_1;
	        switch (p7) {
	            case 0:
	                v0_1 = new boa(android.view.LayoutInflater.from(this.h).inflate(a.gk, p6, 0));
	                break;
	            case 1:
	                v0_1 = new boc(android.view.LayoutInflater.from(this.h).inflate(a.fv, p6, 0));
	                v0_1.n.setLayoutParams(new android.widget.RelativeLayout$LayoutParams(this.j, this.o));
	                break;
	            case 2:
	                v0_1 = new bnt(android.view.LayoutInflater.from(this.h).inflate(a.fo, p6, 0));
	                break;
	            case 3:
	                v0_1 = new bnt(android.view.LayoutInflater.from(this.h).inflate(a.fp, p6, 0));
	                break;
	            case 4:
	                v0_1 = new bny(this);
	                break;
	            case 5:
	                v0_1 = new bnu(this, android.view.LayoutInflater.from(this.h).inflate(a.gd, p6, 0));
	                break;
	            default:
	                bnu v0_7 = this.n;
	                int v2_8 = new Object[1];
	                v2_8[0] = Integer.valueOf(p7);
	                v0_7.b("Unknown view type: %d", v2_8);
	                v0_1 = 0;
	        }
	        return v0_1;
	    }
	
	
	    public final void a(int p6, int p7)
	    {
	        int v0_0 = 1;
	        if (this.l != null) {
	            p6++;
	            p7++;
	        }
	        Object[] v2_2 = new Object[3];
	        v2_2[0] = Integer.valueOf(p6);
	        v2_2[1] = Integer.valueOf(p7);
	        if (this.l == null) {
	            v0_0 = 0;
	        }
	        v2_2[2] = Boolean.valueOf(v0_0);
	        this.a.d(p6, p7);
	        return;
	    }
	
	
	    public final void a(long p4)
	    {
	        int v0_1 = new Object[1];
	        v0_1[0] = Long.valueOf(p4);
	        if ((this.l != null) && (this.l.a.longValue() == p4)) {
	            this.l = 0;
	            this.d(0);
	        }
	        return;
	    }
	
	
	    void a(aow p5)
	    {
	        if (p5.m) {
	            this.i.removeCallbacks(p5.r);
	            this.i.postDelayed(p5.r, this.p);
	        }
	        return;
	    }
	
	
	    public final void a(dal p4)
	    {
	        dal v0_1 = new Object[1];
	        v0_1[0] = p4;
	        dal v0_2 = this.l;
	        this.l = p4;
	        if (p4 == null) {
	            if (v0_2 != null) {
	                this.d(0);
	            }
	        } else {
	            if (v0_2 != this.l) {
	                if (v0_2 != null) {
	                    this.b(0);
	                } else {
	                    this.c(0);
	                }
	            }
	        }
	        return;
	    }
	
	
	    public final void a(zr p13, int p14)
	    {
	        if (!(p13 instanceof boa)) {
	            if (!(p13 instanceof boc)) {
	                if (!(p13 instanceof bnt)) {
	                    if (!(p13 instanceof bny)) {
	                        if (!(p13 instanceof bnu)) {
	                            String v0_5 = this.n;
	                            String v2_1 = new Object[2];
	                            v2_1[0] = p13.getClass();
	                            v2_1[1] = Integer.valueOf(p14);
	                            v0_5.a("Unknown view holder: %s, at position: %d", v2_1);
	                        } else {
	                            String v0_6 = ((bnu) p13).k;
	                            bnq v1_1 = this.h;
	                            int v3_3 = new Object[1];
	                            v3_3[0] = Integer.valueOf(this.d.size());
	                            v0_6.setText(v1_1.getString(b.de, v3_3));
	                            if (((bnu) p13).n) {
	                                ((bnu) p13).l.setLayoutParams(new android.widget.LinearLayout$LayoutParams(this.j, (this.h.getResources().getDimensionPixelSize(a.dC) * this.d.size())));
	                            }
	                            ((bnu) p13).l.setAdapter(new bnd(this, this.h, a.fx, this.d));
	                        }
	                    } else {
	                        String v0_15 = ((bny) p13).k;
	                        bnq v1_8 = this.h;
	                        int v3_8 = new Object[1];
	                        v3_8[0] = Integer.valueOf(this.c.size());
	                        v0_15.setText(v1_8.getString(b.bC, v3_8));
	                        if (((bny) p13).n) {
	                            ((bny) p13).l.setLayoutParams(new android.widget.LinearLayout$LayoutParams(this.j, (this.h.getResources().getDimensionPixelSize(a.dU) * this.c.size())));
	                        }
	                        ((bny) p13).l.setAdapter(new bnb(this, this.h, a.gc, this.c, ((bny) p13)));
	                    }
	                } else {
	                    blx.a(((bnt) p13).o, this.l.k);
	                    ((bnt) p13).k.setText(this.l.g);
	                    String v0_27 = ((bnt) p13).a.getResources();
	                    if (this.l.j != 1) {
	                        ((bnt) p13).p.setBackgroundColor(v0_27.getColor(a.do));
	                    } else {
	                        ((bnt) p13).p.setBackgroundColor(v0_27.getColor(a.dr));
	                    }
	                    ((bnt) p13).m.setVisibility(8);
	                    ((bnt) p13).n.setVisibility(8);
	                    if (android.text.TextUtils.isEmpty(this.l.f)) {
	                        ((bnt) p13).l.setVisibility(8);
	                    } else {
	                        String v0_30;
	                        ((bnt) p13).l.setVisibility(0);
	                        if (((bnt) p13).e != 3) {
	                            v0_30 = bks.a(v0_27.getDimensionPixelSize(a.dP), v0_27.getDimensionPixelSize(a.dO), this.l.f);
	                        } else {
	                            v0_30 = bks.a(this.j, 0, this.l.f);
	                        }
	                        this.b.a(v0_30, new bnj(this, ((bnt) p13)));
	                    }
	                    if (this.l.h != null) {
	                        String v0_36 = this.a(this.l.h, this.l.a);
	                        if (v0_36 != null) {
	                            blx.a(((bnt) p13).m, this.l.h.a);
	                            ((bnt) p13).m.setOnClickListener(v0_36);
	                            ((bnt) p13).m.setVisibility(0);
	                        }
	                    }
	                    if (this.l.i != null) {
	                        String v0_42 = this.a(this.l.i, this.l.a);
	                        if (v0_42 != null) {
	                            blx.a(((bnt) p13).n, this.l.i.a);
	                            ((bnt) p13).n.setOnClickListener(v0_42);
	                            ((bnt) p13).n.setVisibility(0);
	                        }
	                    }
	                }
	            } else {
	                int v3_12 = this.h(p14);
	                if (v3_12 != 0) {
	                    String v0_49;
	                    String v0_45 = new Object[2];
	                    v0_45[0] = v3_12.g();
	                    v0_45[1] = Integer.valueOf(p14);
	                    int v4_5 = v3_12.o();
	                    int v5_5 = ((boc) p13).m.getResources();
	                    if (!android.text.TextUtils.isEmpty(v3_12.t)) {
	                        v0_49 = v3_12.t;
	                    } else {
	                        v0_49 = v3_12.g();
	                    }
	                    ((boc) p13).k.setText(v0_49);
	                    String v0_50 = 0;
	                    bnq v1_49 = 0;
	                    if (!v3_12.d) {
	                        ((boc) p13).t.setVisibility(8);
	                    } else {
	                        if (v3_12.c.h) {
	                            v0_50 = 0;
	                        } else {
	                            v0_50 = 1;
	                        }
	                        if ((v3_12.e()) || ((v3_12.d()) || (android.text.TextUtils.isEmpty(v3_12.o)))) {
	                            v1_49 = 0;
	                        } else {
	                            v1_49 = 1;
	                        }
	                        ((boc) p13).t.setVisibility(0);
	                        ((boc) p13).t.setOnClickListener(new bnm(this, v3_12, ((boc) p13)));
	                    }
	                    ((boc) p13).u.setVisibility(8);
	                    if (v3_12.s()) {
	                        ((boc) p13).x.setOnClickListener(new bns(this, v3_12));
	                        ((boc) p13).w.setOnClickListener(new bmw(this, v3_12));
	                        ((boc) p13).y.setOnClickListener(new bmx(this, v3_12, ((boc) p13)));
	                        ((boc) p13).z.setOnClickListener(new bmy(this, v3_12, ((boc) p13)));
	                    }
	                    if ((!blf.r(this.h)) || ((!v3_12.d()) || (!v3_12.m))) {
	                        ((boc) p13).D.setVisibility(8);
	                        ((boc) p13).y.setVisibility(8);
	                        ((boc) p13).z.setVisibility(8);
	                    } else {
	                        String v2_48 = ((boc) p13).v;
	                        int v6_19 = this.h;
	                        String v8_1 = new Object[2];
	                        v8_1[0] = Integer.valueOf((v3_12.l.size() - v3_12.n));
	                        v8_1[1] = Integer.valueOf(v3_12.l.size());
	                        v2_48.setText(v6_19.getString(b.W, v8_1));
	                        ((boc) p13).D.setVisibility(0);
	                        ((boc) p13).y.setVisibility(0);
	                        ((boc) p13).z.setVisibility(0);
	                        ((boc) p13).y.setEnabled(v3_12.k());
	                        ((boc) p13).z.setEnabled(v3_12.l());
	                    }
	                    if ((!blf.r(this.h)) || ((!v3_12.d()) || ((v3_12.m) || (!v3_12.s())))) {
	                        ((boc) p13).w.setVisibility(8);
	                    } else {
	                        ((boc) p13).w.setVisibility(0);
	                    }
	                    ((boc) p13).s.setImageResource(v3_12.h());
	                    if (android.text.TextUtils.isEmpty(v4_5.h)) {
	                        String v2_65;
	                        String v0_53;
	                        if (!v3_12.e()) {
	                            v2_65 = ((boc) p13).n;
	                            if (v0_50 == null) {
	                                if (v1_49 == null) {
	                                    v0_53 = bnw.d;
	                                } else {
	                                    v0_53 = bnw.c;
	                                }
	                            } else {
	                                if (v1_49 == null) {
	                                    v0_53 = bnw.b;
	                                } else {
	                                    v0_53 = bnw.a;
	                                }
	                            }
	                        } else {
	                            v2_65 = ((boc) p13).n;
	                            v0_53 = bnw.e;
	                        }
	                        v2_65.a(v0_53);
	                        ((boc) p13).p.setVisibility(8);
	                    } else {
	                        ((boc) p13).n.setBackgroundColor(v5_5.getColor(17170444));
	                        String v0_57 = bks.a(0, this.o, v3_12.o().h);
	                        String v2_72 = bks.a(((boc) p13).n.getWidth(), ((boc) p13).n.getHeight(), v3_12.o().i);
	                        int v6_33 = ((boc) p13).n;
	                        if (!android.text.TextUtils.equals(v0_57, v6_33.f)) {
	                            v6_33.f = v0_57;
	                        }
	                        if (!android.text.TextUtils.equals(v2_72, v6_33.g)) {
	                            v6_33.g = v2_72;
	                        }
	                        int v6_35 = new Object[3];
	                        v6_35[0] = v3_12.g();
	                        v6_35[1] = v0_57;
	                        v6_35[2] = v2_72;
	                        this.b.a(v0_57, new bng(this, v3_12, v0_57, ((boc) p13)));
	                        if (!android.text.TextUtils.isEmpty(v2_72)) {
	                            this.b.a(v2_72, new bnh(this, v3_12, v2_72, ((boc) p13)));
	                        }
	                        ((boc) p13).p.setVisibility(0);
	                    }
	                    ((boc) p13).n.j = "233637DE".equals(v3_12.o);
	                    String v0_63 = v4_5.c;
	                    if (!android.text.TextUtils.isEmpty(v0_63)) {
	                        ((boc) p13).o.setVisibility(0);
	                        ((boc) p13).o.setOnClickListener(new bnn(this, v0_63, v4_5));
	                    } else {
	                        ((boc) p13).o.setVisibility(8);
	                        ((boc) p13).o.setOnClickListener(0);
	                    }
	                    String v0_66 = v4_5.f;
	                    if (android.text.TextUtils.isEmpty(v0_66)) {
	                        if (!v3_12.d()) {
	                            if (!v3_12.e()) {
	                                v0_66 = v3_12.p;
	                            } else {
	                                v0_66 = v5_5.getString(b.ax);
	                            }
	                        } else {
	                            v0_66 = v5_5.getString(b.Q);
	                        }
	                    }
	                    if (android.text.TextUtils.isEmpty(v0_66)) {
	                        v0_66 = v5_5.getString(b.ad);
	                    }
	                    String v0_79;
	                    blx.a(((boc) p13).q, v0_66);
	                    blx.a(((boc) p13).r, v4_5.g);
	                    int v4_6 = v4_5.g;
	                    ((boc) p13).m.setContentDescription(new StringBuilder(((String.valueOf(v0_66).length() + 1) + String.valueOf(v4_6).length())).append(v0_66).append(" ").append(v4_6).toString());
	                    this.a(((boc) p13).A, v3_12);
	                    if (this.f != null) {
	                        v0_79 = this.f.b;
	                    } else {
	                        v0_79 = 0;
	                    }
	                    if ((!v3_12.e()) || ((v0_79 == null) || (!v0_79.b.equals(v3_12.b.b)))) {
	                        ((boc) p13).B.setVisibility(8);
	                    } else {
	                        blx.a(((boc) p13).B, b.bi);
	                        ((boc) p13).B.setOnClickListener(new bno(this));
	                        ((boc) p13).A.setVisibility(0);
	                    }
	                    if (v1_49 == null) {
	                        ((boc) p13).C.setVisibility(8);
	                    } else {
	                        ((boc) p13).C.setVisibility(0);
	                        ((boc) p13).C.findViewById(f.ei).setOnClickListener(new bnp(this, v3_12));
	                        String v2_94 = v3_12.o().d;
	                        String v0_93 = ((android.widget.ImageButton) ((boc) p13).C.findViewById(f.cQ));
	                        if ((v2_94 != null) && (v2_94.a())) {
	                            bnq v1_63;
	                            v0_93.setVisibility(0);
	                            if (v2_94.a != 1) {
	                                v1_63 = 0;
	                            } else {
	                                v1_63 = 1;
	                            }
	                            bnq v1_64;
	                            if (v1_63 == null) {
	                                v1_64 = a.eJ;
	                            } else {
	                                v1_64 = a.eH;
	                            }
	                            v0_93.setImageResource(v1_64);
	                            v0_93.setOnClickListener(new bnq(this, v3_12));
	                        } else {
	                            v0_93.setVisibility(8);
	                        }
	                        String v0_95 = ((boc) p13).C.findViewById(f.ew);
	                        if (v2_94 == null) {
	                            v0_95.setVisibility(8);
	                        } else {
	                            v0_95.setVisibility(0);
	                            v0_95.setOnClickListener(new bnr(this, v3_12));
	                        }
	                    }
	                    String v0_96 = v3_12.g();
	                    bnq v1_74 = v3_12.c.R;
	                    if (!android.text.TextUtils.isEmpty(v1_74)) {
	                        String v2_96 = this.h;
	                        int v4_9 = new Object[1];
	                        v4_9[0] = v1_74;
	                        bnq v1_75 = v2_96.getString(b.ch, v4_9);
	                        ((boc) p13).l.setText(v1_75);
	                        ((boc) p13).l.setVisibility(0);
	                        v0_96 = new StringBuilder(((String.valueOf(v0_96).length() + 1) + String.valueOf(v1_75).length())).append(v0_96).append(" ").append(v1_75).toString();
	                    } else {
	                        ((boc) p13).l.setVisibility(8);
	                    }
	                    ((boc) p13).n.setContentDescription(v0_96);
	                }
	            }
	        } else {
	            String v0_100 = this.h(p14);
	            ((boa) p13).k.setText(v0_100.g());
	            bnq v1_79 = ((boa) p13).o;
	            switch (bnl.a[(v0_100.c.b() - 1)]) {
	                case 1:
	                    v1_79.setImageResource(a.eo);
	                    break;
	                case 2:
	                    v1_79.setImageResource(a.ep);
	                    break;
	                default:
	                    v1_79.setImageResource(a.eq);
	            }
	            v1_79.setContentDescription(blx.a(this.h, v0_100.c));
	            bnq v1_81 = new bmv(this, v0_100, ((boa) p13));
	            ((boa) p13).l.setOnClickListener(v1_81);
	            ((boa) p13).n.setOnClickListener(v1_81);
	            ((boa) p13).o.setOnClickListener(v1_81);
	            ((boa) p13).m.setOnClickListener(new bni(this, v0_100));
	        }
	        return;
	    }
	
	
	    public final void a(boolean p4)
	    {
	        if (!p4) {
	            int v0_1 = new Object[1];
	            v0_1[0] = Integer.valueOf((this.a() - 1));
	            this.b((this.a() - 1));
	        } else {
	            int v0_4 = new Object[1];
	            v0_4[0] = Integer.valueOf((this.a() - 1));
	            this.d((this.a() - 1));
	        }
	        return;
	    }
	
	
	    public int b()
	    {
	        int v0_3;
	        if (!this.c.isEmpty()) {
	            v0_3 = (this.a() - 2);
	        } else {
	            v0_3 = (this.a() - 1);
	        }
	        return v0_3;
	    }
	
	
	    public final void e(int p5)
	    {
	        Boolean v0_0 = 0;
	        if (this.l != null) {
	            p5++;
	        }
	        Object[] v2_2 = new Object[2];
	        v2_2[0] = Integer.valueOf(p5);
	        if (this.l != null) {
	            v0_0 = 1;
	        }
	        v2_2[1] = Boolean.valueOf(v0_0);
	        super.b(p5);
	        return;
	    }
	
	
	    public final void f(int p5)
	    {
	        Boolean v0_0 = 0;
	        if (this.l != null) {
	            p5++;
	        }
	        Object[] v2_2 = new Object[2];
	        v2_2[0] = Integer.valueOf(p5);
	        if (this.l != null) {
	            v0_0 = 1;
	        }
	        v2_2[1] = Boolean.valueOf(v0_0);
	        super.c(p5);
	        return;
	    }
	
	
	    public final void g(int p5)
	    {
	        Boolean v0_0 = 0;
	        if (this.l != null) {
	            p5++;
	        }
	        Object[] v2_2 = new Object[2];
	        v2_2[0] = Integer.valueOf(p5);
	        if (this.l != null) {
	            v0_0 = 1;
	        }
	        v2_2[1] = Boolean.valueOf(v0_0);
	        super.d(p5);
	        return;
	    }
	
