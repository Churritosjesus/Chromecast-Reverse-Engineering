	private static final java.util.Set a
	private final aqw b
	private final asz c
	private final  d
	private final android.content.Context e
	private final atf f
	
	    static art()
	    {
	        java.util.List v1_1 = new Integer[3];
	        v1_1[0] = Integer.valueOf(13);
	        v1_1[1] = Integer.valueOf(14);
	        v1_1[2] = Integer.valueOf(16);
	        art.a = new java.util.HashSet(java.util.Arrays.asList(v1_1));
	        return;
	    }
	
	
	    public art(android.content.Context p2, asz p3, int p4, java.util.List p5, boolean p6)
	    {
	        this(p2, 17367043, p5);
	        this.e = p2;
	        this.c = p3;
	        this.b = ((aqw) p2);
	        this.d = p6;
	        this.f = atf.a(p2);
	        return;
	    }
	
	
	    private android.view.View a(android.view.View p14, dcj p15)
	    {
	        android.view.View v0_1 = ((asa) p14.getTag());
	        v0_1.a();
	        if (p15.a.intValue() != 9) {
	            int v4_1 = v0_1.a(p15.c);
	            String v1_3 = p15.h;
	            if (v1_3 != null) {
	                v4_1.c.setVisibility(0);
	                v4_1.h = v4_1.j.f.a(v1_3, v4_1.c, 0);
	            }
	            String v1_7;
	            if (p15.a.intValue() != 3) {
	                v1_7 = 0;
	            } else {
	                v1_7 = 1;
	            }
	            arv v5_4 = p15.b;
	            if ((v1_7 != null) && (v5_4 != null)) {
	                v4_1.d.setVisibility(0);
	                v4_1.d.setChecked(v4_1.j.b.h().s().a(v5_4.intValue()));
	                v4_1.j.b.h().d.a();
	                art.a(v5_4);
	            }
	            v4_1.a(new arv(this, p15, v0_1.f));
	            if (((p15.i == null) || (p15.i.length <= 0)) && (android.text.TextUtils.isEmpty(p15.o))) {
	                if (p15.a.intValue() != 12) {
	                    String v1_24;
	                    if (p15.a.intValue() != 2) {
	                        v1_24 = 0;
	                    } else {
	                        v1_24 = 1;
	                    }
	                    if ((v1_24 != null) && (p15.j != null)) {
	                        String v1_35;
	                        v0_1.g.setVisibility(0);
	                        v0_1.f.setVisibility(0);
	                        String v1_32 = v0_1.j.b.h().s().a(p15.j);
	                        v0_1.f.setChecked(v1_32);
	                        v0_1.f.setOnCheckedChangeListener(this);
	                        v0_1.f.setTag(p15);
	                        if (v1_32 == null) {
	                            v1_35 = v0_1.j.getContext().getString(b.D);
	                        } else {
	                            v1_35 = v0_1.j.getContext().getString(b.B);
	                        }
	                        v0_1.f.setContentDescription(v1_35);
	                        v0_1.g.setContentDescription(v1_35);
	                    }
	                } else {
	                    v0_1.b.setText(p15.d);
	                    v0_1.b.setVisibility(0);
	                }
	            } else {
	                String v1_41;
	                if (!v0_1.j.b.h().s().a(p15.j)) {
	                    v1_41 = b.dg;
	                } else {
	                    v1_41 = b.dh;
	                }
	                v0_1.b.setText(v1_41);
	                v0_1.b.setVisibility(0);
	            }
	        } else {
	            if (p15.a.intValue() == 9) {
	                v0_1.i.setVisibility(0);
	                String v1_48 = ((android.view.LayoutInflater) v0_1.j.getContext().getSystemService("layout_inflater"));
	                arv v5_7 = p15.i;
	                boolean v6_6 = v5_7.length;
	                int v4_11 = 0;
	                while (v4_11 < v6_6) {
	                    android.widget.RadioGroup v7_1 = v5_7[v4_11];
	                    android.view.View v8_1 = v1_48.inflate(a.fA, 0);
	                    asa v9_2 = new asa(v0_1.j, v8_1);
	                    v8_1.setTag(v9_2);
	                    asa v9_4 = v9_2.a().a(v7_1.c);
	                    art v10_2 = v7_1.d;
	                    if ((!android.text.TextUtils.isEmpty(v10_2)) && (v9_4.a != null)) {
	                        v9_4.a.setVisibility(0);
	                        v9_4.a.setText(v10_2);
	                    }
	                    art v10_3 = v7_1.b;
	                    if (v10_3 != null) {
	                        v9_4.e.setVisibility(0);
	                        v9_4.e.setChecked(v9_4.j.b.h().s().a(v10_3.intValue()));
	                    }
	                    ary v11_7 = new ary(v0_1.j, p15, v7_1);
	                    if (v9_4.e.getVisibility() == 0) {
	                        v9_4.e.setOnClickListener(v11_7);
	                        v9_4.a(v11_7);
	                    }
	                    v0_1.i.addView(v8_1);
	                    v4_11++;
	                }
	            }
	            v0_1.a(p15.c);
	        }
	        p14.setClickable(1);
	        return p14;
	    }
	
	
	    static synthetic aqw a(art p1)
	    {
	        return p1.b;
	    }
	
	
	    static synthetic void a(art p2, dcj p3)
	    {
	        aqw v0_0 = 0;
	        if (p3.i[0].a != null) {
	            v0_0 = p3.i[0].a.intValue();
	        }
	        if (v0_0 != 7) {
	            if (v0_0 != 10) {
	                p2.b.b(p3, "backdrop_child");
	            } else {
	                p2.b.b(p3);
	            }
	        } else {
	            p2.b.a(p3);
	        }
	        return;
	    }
	
	
	    static synthetic void a(art p0, dcj p1, boolean p2)
	    {
	        p0.a(p1, p2);
	        return;
	    }
	
	
	    static synthetic void a(art p0, Integer p1)
	    {
	        art.a(p1);
	        return;
	    }
	
	
	    private void a(dcj p3, boolean p4)
	    {
	        asz v0_2 = this.b.h().s();
	        if (v0_2.a(p3.j) != p4) {
	            v0_2.a(p3.j, p4);
	            this.b.h().d.a();
	            art.a(p3.b);
	            if (this.c != null) {
	                this.c.p();
	            }
	        }
	        return;
	    }
	
	
	    private static void a(Integer p3)
	    {
	        ape.a().a(new apd(76).a(p3.intValue()));
	        return;
	    }
	
	
	    private static android.view.View b(android.view.View p2, dcj p3)
	    {
	        if (android.text.TextUtils.isEmpty(p3.c)) {
	            p2.setVisibility(8);
	        } else {
	            ((android.widget.TextView) p2).setText(p3.c);
	            p2.setVisibility(0);
	        }
	        return p2;
	    }
	
	
	    private android.view.View c(android.view.View p6, dcj p7)
	    {
	        android.widget.TextView v0_1 = ((arz) p6.getTag());
	        v0_1.a.setVisibility(8);
	        if (v0_1.g != null) {
	            v0_1.a.setImageResource(17170445);
	            v0_1.g.a();
	        }
	        v0_1.b.setVisibility(8);
	        if (v0_1.h != null) {
	            v0_1.b.setImageResource(17170445);
	            v0_1.h.a();
	        }
	        v0_1.f.setVisibility(8);
	        v0_1.d.setVisibility(8);
	        v0_1.e.setVisibility(8);
	        v0_1.c.setVisibility(8);
	        if ((p7.n != null) && (p7.n.length > 0)) {
	            aru v1_16 = p7.n[0];
	            if (v1_16 != null) {
	                v0_1.a.setVisibility(0);
	                v0_1.g = v0_1.i.f.a(v1_16, v0_1.a, 0);
	            }
	        }
	        aru v1_18 = p7.h;
	        if (v1_18 != null) {
	            v0_1.b.setVisibility(0);
	            v0_1.h = v0_1.i.f.a(v1_18, v0_1.b, 0);
	        }
	        aru v1_20 = p7.d;
	        if (!android.text.TextUtils.isEmpty(v1_20)) {
	            v0_1.f.setVisibility(0);
	            v0_1.f.setText(v1_20);
	        }
	        aru v1_22 = android.text.TextUtils.join("\n\n", p7.e);
	        if (!android.text.TextUtils.isEmpty(v1_22)) {
	            v0_1.d.setVisibility(0);
	            v0_1.d.setText(v1_22);
	        }
	        aru v1_24 = android.text.TextUtils.join("\n\n", p7.f);
	        if (!android.text.TextUtils.isEmpty(v1_24)) {
	            v0_1.e.setVisibility(0);
	            v0_1.e.setText(v1_24);
	        }
	        aru v1_25 = p7.c;
	        if (!android.text.TextUtils.isEmpty(v1_25)) {
	            v0_1.c.setVisibility(0);
	            v0_1.c.setText(v1_25);
	        }
	        v0_1.c.setOnClickListener(new aru(this, p7));
	        return p6;
	    }
	
	
	    public final int getItemViewType(int p4)
	    {
	        int v0_5;
	        int v0_1 = ((dcj) this.getItem(p4));
	        if (!art.a.contains(v0_1.a)) {
	            if (v0_1.a.intValue() != 17) {
	                if (v0_1.a.intValue() != 18) {
	                    if (!this.d) {
	                        v0_5 = 0;
	                    } else {
	                        v0_5 = 1;
	                    }
	                } else {
	                    v0_5 = 4;
	                }
	            } else {
	                v0_5 = 3;
	            }
	        } else {
	            v0_5 = 2;
	        }
	        return v0_5;
	    }
	
	
	    public final android.view.View getView(int p6, android.view.View p7, android.view.ViewGroup p8)
	    {
	        IllegalStateException v0_1 = ((dcj) this.getItem(p6));
	        String v1_1 = android.view.LayoutInflater.from(this.e);
	        int v2_0 = this.getItemViewType(p6);
	        if (p7 != null) {
	            switch (v2_0) {
	                case 0:
	                case 1:
	                    p7 = this.a(p7, v0_1);
	                    break;
	                case 2:
	                    p7 = this.c(p7, v0_1);
	                    break;
	                case 3:
	                    p7 = art.b(p7, v0_1);
	                case 4:
	                    break;
	                default:
	                    throw new IllegalStateException(new StringBuilder(30).append("Unknown item type: ").append(v2_0).toString());
	            }
	        } else {
	            switch (v2_0) {
	                case 0:
	                    String v1_10 = v1_1.inflate(a.fA, 0);
	                    v1_10.setTag(new asa(this, v1_10));
	                    p7 = this.a(v1_10, v0_1);
	                    break;
	                case 1:
	                    String v1_9 = v1_1.inflate(a.fB, 0);
	                    v1_9.setTag(new asa(this, v1_9));
	                    p7 = this.a(v1_9, v0_1);
	                    break;
	                case 2:
	                    String v1_8 = v1_1.inflate(a.fC, 0);
	                    v1_8.setTag(new arz(this, v1_8));
	                    p7 = this.c(v1_8, v0_1);
	                    break;
	                case 3:
	                    p7 = art.b(v1_1.inflate(a.fD, 0), v0_1);
	                    break;
	                case 4:
	                    p7 = v1_1.inflate(a.fX, 0);
	                    break;
	                default:
	                    throw new IllegalStateException(new StringBuilder(30).append("Unknown item type: ").append(v2_0).toString());
	            }
	        }
	        return p7;
	    }
	
	
	    public final int getViewTypeCount()
	    {
	        return 5;
	    }
	
	
	    public final void onCheckedChanged(android.widget.CompoundButton p2, boolean p3)
	    {
	        dcj v0_1 = ((dcj) p2.getTag());
	        if (v0_1 != null) {
	            this.a(v0_1, p3);
	        }
	        return;
	    }
	
