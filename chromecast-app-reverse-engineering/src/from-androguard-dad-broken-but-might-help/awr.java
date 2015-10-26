	private android.view.View Z
	private final blp a
	private android.view.View aa
	private android.view.View ab
	private android.widget.ScrollView ac
	private android.view.ViewGroup ad
	private android.view.ViewGroup ae
	private android.view.ViewGroup af
	private com.google.android.apps.chromecast.app.widget.ReusableImageView ag
	private android.widget.TextView ah
	private android.widget.TextView ai
	private android.widget.TextView aj
	private android.widget.TextView ak
	private com.google.android.apps.chromecast.app.widget.ReusableImageView al
	private android.view.View am
	private atf an
	private  ao
	private  ap
	private final android.view.ViewTreeObserver$OnScrollChangedListener aq
	private  b
	private dbb c
	private java.lang.String d
	
	    public awr()
	    {
	        this.a = new blp("ContentDetailsActivity");
	        this.aq = new aws(this);
	        return;
	    }
	
	
	    static synthetic android.widget.ScrollView a(awr p1)
	    {
	        return p1.ac;
	    }
	
	
	    public static awr a(String p3, dbb p4, boolean p5)
	    {
	        android.os.Bundle v0_1 = new android.os.Bundle();
	        v0_1.putString("contentId", p3);
	        v0_1.putBoolean("fromSearch", p5);
	        if (p4 != null) {
	            v0_1.putByteArray("contentDetails", dbb.a(p4));
	        }
	        awr v1_4 = new awr();
	        v1_4.f(v0_1);
	        return v1_4;
	    }
	
	
	    static synthetic void a(awr p3, int p4)
	    {
	        float v0_1 = p3.al.getHeight();
	        if (p4 < 0) {
	            p4 = 0;
	        }
	        p3.al.setTranslationY(((float) (p4 / 2)));
	        p3.am.setTranslationY(((float) (p4 / 2)));
	        if (p4 >= (v0_1 - p3.b)) {
	            p3.aa.setTranslationY(((float) ((v0_1 - p3.b) - p4)));
	        } else {
	            p3.aa.setTranslationY(0);
	        }
	        return;
	    }
	
	
	    static synthetic void a(awr p0, dbb p1)
	    {
	        p0.a(p1);
	        return;
	    }
	
	
	    private void a(dbb p15)
	    {
	        if (p15 != null) {
	            android.view.View v6_0;
	            blx.a(this.ak, p15.f);
	            blx.a(this.ai, p15.d);
	            blx.a(this.aj, p15.e);
	            blx.a(this.ah, p15.g);
	            if ((p15.a == null) || (android.text.TextUtils.isEmpty(p15.a.a))) {
	                v6_0 = 0;
	            } else {
	                v6_0 = 1;
	            }
	            if ((p15.c == null) || (android.text.TextUtils.isEmpty(p15.c.a))) {
	                this.ag.setVisibility(8);
	                this.Z.setMinimumHeight(0);
	            } else {
	                this.ag.setVisibility(0);
	                int v0_15 = this.e();
	                int v8_0 = v0_15.getDimensionPixelSize(a.eg);
	                int v4_0 = v0_15.getDimensionPixelSize(a.dK);
	                String v5_0 = ((p15.c.c.intValue() * v4_0) / p15.c.b.intValue());
	                this.ag.a(this.an.m, p15.c.a, 0, v4_0, v5_0);
	                if ((v6_0 != null) && (p15.c.b.intValue() < p15.c.c.intValue())) {
	                    this.ag.setTranslationY(0);
	                    this.Z.setMinimumHeight((v5_0 + v8_0));
	                } else {
	                    this.ag.setTranslationY(((float) (v8_0 * 2)));
	                    this.Z.setMinimumHeight(((v8_0 * 3) + v5_0));
	                }
	            }
	            if (v6_0 == null) {
	                this.aa.setBackgroundResource(0);
	                this.aa.setBackgroundColor(this.e().getColor(a.dq));
	                this.al.setLayoutParams(new android.widget.RelativeLayout$LayoutParams(this.ao, this.b));
	            } else {
	                this.aa.setBackgroundResource(a.ek);
	                this.al.a(this.an.m, p15.a.a, 0, this.ao, ((int) (((float) blx.b(this.y)) * 1058013184)));
	                if (android.text.TextUtils.isEmpty(p15.b)) {
	                    this.am.setVisibility(8);
	                } else {
	                    this.am.setVisibility(0);
	                    int v0_42 = new awz(this, p15);
	                    this.al.setOnClickListener(v0_42);
	                    this.am.setOnClickListener(v0_42);
	                }
	            }
	            this.aa.setTranslationY(0);
	            this.ad.setVisibility(8);
	            int v1_29 = p15.h;
	            int v0_45 = 0;
	            while (v0_45 < v1_29.length) {
	                int v4_3 = v1_29[v0_45];
	                if ((v4_3.d != 1) || (v4_3.c == null)) {
	                    v0_45++;
	                } else {
	                    this.ad.setVisibility(0);
	                    ((android.widget.TextView) this.ad.findViewById(f.dk)).setText(v4_3.a);
	                    int v0_52 = ((android.widget.ImageView) this.ad.findViewById(f.en));
	                    if (v4_3.c.floatValue() < 1058642330) {
	                        v0_52.setImageResource(a.eZ);
	                    } else {
	                        v0_52.setImageResource(a.ew);
	                    }
	                    if (android.text.TextUtils.isEmpty(v4_3.b)) {
	                        break;
	                    }
	                    this.ad.setOnClickListener(new axa(this, v4_3));
	                    break;
	                }
	            }
	            this.ae.removeAllViews();
	            if (p15.j.length == 0) {
	                this.ae.addView(this.y.getLayoutInflater().inflate(a.gT, 0));
	            }
	            String v7_1 = p15.j;
	            int v8_1 = v7_1.length;
	            android.view.View v6_1 = 0;
	            while (v6_1 < v8_1) {
	                int v1_48;
	                String v9_1 = v7_1[v6_1];
	                android.view.View v10 = this.y.getLayoutInflater().inflate(a.gD, 0);
	                ((com.google.android.apps.chromecast.app.widget.ReusableImageView) v10.findViewById(f.n)).a(this.an.m, v9_1.a.a, 0, 0, 0);
	                int v0_83 = ((android.widget.Button) v10.findViewById(f.ex));
	                dbd[] v2_12 = v9_1.b;
	                int v4_6 = v9_1.c;
	                String v5_7 = v9_1.e;
	                if (!this.m.getBoolean("fromSearch", 0)) {
	                    v1_48 = 123;
	                } else {
	                    v1_48 = 134;
	                }
	                int v1_49 = apg.a(v1_48);
	                v1_49.c = this.d;
	                v1_49.b = v9_1.d;
	                blx.a(v0_83, v2_12, v4_6, v5_7, v1_49.a());
	                this.ae.addView(v10);
	                v6_1++;
	            }
	            this.af.removeAllViews();
	            if (p15.i != null) {
	                dbd[] v2_8 = p15.i;
	                int v4_4 = v2_8.length;
	                int v1_42 = 0;
	                while (v1_42 < v4_4) {
	                    String v5_4 = v2_8[v1_42];
	                    android.view.View v6_3 = this.y.getLayoutInflater().inflate(a.fM, 0);
	                    ((android.widget.TextView) v6_3.findViewById(f.ca)).setText(v5_4.a);
	                    ((android.widget.TextView) v6_3.findViewById(f.cb)).setText(v5_4.b);
	                    this.af.addView(v6_3);
	                    v1_42++;
	                }
	            }
	            this.ab.setVisibility(8);
	            this.ac.setVisibility(0);
	        } else {
	            android.widget.Toast.makeText(this.y, b.aH, 0).show();
	            this.x.c();
	        }
	        return;
	    }
	
	
	    private void a(String p6)
	    {
	        Object[] v0_1 = new aww(this, p6);
	        if (!this.m.getBoolean("fromSearch", 0)) {
	            this.an.a(p6, v0_1, 0);
	        } else {
	            this.an.a(p6, v0_1, 1);
	        }
	        Object[] v0_2 = new Object[1];
	        v0_2[0] = p6;
	        return;
	    }
	
	
	    static synthetic int b(awr p1)
	    {
	        return p1.ap;
	    }
	
	
	    static synthetic int b(awr p0, int p1)
	    {
	        p0.ap = p1;
	        return p1;
	    }
	
	
	    static synthetic android.widget.TextView c(awr p1)
	    {
	        return p1.ak;
	    }
	
	
	    static synthetic blp d(awr p1)
	    {
	        return p1.a;
	    }
	
	
	    static synthetic String e(awr p1)
	    {
	        return p1.d;
	    }
	
	
	    public final android.view.View a(android.view.LayoutInflater p8, android.view.ViewGroup p9, android.os.Bundle p10)
	    {
	        android.view.View v1 = p8.inflate(a.fN, p9, 0);
	        this.ao = blx.a(this.y);
	        this.b = this.e().getDimensionPixelOffset(a.eh);
	        this.aa = v1.findViewById(f.eo);
	        this.ab = v1.findViewById(f.dX);
	        this.Z = v1.findViewById(f.bp);
	        this.ac = ((android.widget.ScrollView) v1.findViewById(f.ds));
	        this.ad = ((android.view.ViewGroup) v1.findViewById(f.dq));
	        this.ae = ((android.view.ViewGroup) v1.findViewById(f.df));
	        this.af = ((android.view.ViewGroup) v1.findViewById(f.bZ));
	        this.ag = ((com.google.android.apps.chromecast.app.widget.ReusableImageView) v1.findViewById(f.bf));
	        this.al = ((com.google.android.apps.chromecast.app.widget.ReusableImageView) v1.findViewById(f.ao));
	        this.am = v1.findViewById(f.ep);
	        this.ah = ((android.widget.TextView) v1.findViewById(f.aZ));
	        this.ai = ((android.widget.TextView) v1.findViewById(f.em));
	        this.aj = ((android.widget.TextView) v1.findViewById(f.ec));
	        this.ak = ((android.widget.TextView) v1.findViewById(f.aq));
	        if (p10 == null) {
	            this.ap = this.e().getInteger(a.fa);
	        } else {
	            this.ap = p10.getInt("descMaxLines");
	        }
	        this.ak.setMaxLines(this.ap);
	        this.ak.setOnClickListener(new awt(this));
	        this.an = atf.a(this.y);
	        this.d = this.m.getString("contentId");
	        android.os.Handler v0_53 = 0;
	        if ((p10 == null) || (!p10.containsKey("contentDetails"))) {
	            if (!this.m.containsKey("contentDetails")) {
	                if (this.d == null) {
	                    Object[] v4_0 = new Object[0];
	                    this.a.a("Details activity started without a content ID or details", v4_0);
	                    this.x.c();
	                } else {
	                    this.a(this.d);
	                }
	            } else {
	                v0_53 = this.m.getByteArray("contentDetails");
	                if (this.d != null) {
	                    this.a(this.d);
	                }
	            }
	        } else {
	            v0_53 = p10.getByteArray("contentDetails");
	        }
	        if (v0_53 != null) {
	            try {
	                this.c = ((dbb) dew.a(new dbb(), v0_53));
	                this.a(this.c);
	            } catch (android.os.Handler v0_59) {
	                awv v2_19 = this.a;
	                Object[] v4_1 = new Object[1];
	                v4_1[0] = v0_59;
	                v2_19.a("Error parsing saved content details: %s", v4_1);
	            }
	        }
	        android.os.Handler v0_62 = ((android.support.v4.widget.DrawerLayout) this.y.findViewById(f.aW));
	        if (v0_62 != null) {
	            v0_62.a(1);
	        }
	        this.ac.getViewTreeObserver().addOnScrollChangedListener(this.aq);
	        new android.os.Handler().post(new awv(this));
	        return v1;
	    }
	
	
	    public final void d()
	    {
	        super.d();
	        ((aov) this.y).i();
	        this.ac.getViewTreeObserver().removeOnScrollChangedListener(this.aq);
	        android.support.v4.widget.DrawerLayout v0_6 = ((android.support.v4.widget.DrawerLayout) this.y.findViewById(f.aW));
	        if (v0_6 != null) {
	            v0_6.a(0);
	        }
	        return;
	    }
	
	
	    public final void e(android.os.Bundle p3)
	    {
	        super.e(p3);
	        if (this.c != null) {
	            p3.putByteArray("contentDetails", dbb.a(this.c));
	        }
	        p3.putInt("descMaxLines", this.ap);
	        return;
	    }
	
	
	    public final void j()
	    {
	        super.j();
	        mj v0_2 = ((android.support.v7.widget.Toolbar) this.N.findViewById(f.eo));
	        ((mm) this.y).a(v0_2);
	        v0_2.a("");
	        v0_2.a(new awy(this));
	        mj v0_6 = ((mm) this.y).d().a();
	        v0_6.b(1);
	        v0_6.a(1);
	        return;
	    }
	
