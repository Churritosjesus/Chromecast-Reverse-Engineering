	public final android.support.v4.widget.DrawerLayout a
	public final android.widget.ArrayAdapter b
	public final mn c
	private java.util.List d
	private final blp e
	private final mm f
	private final baq g
	private  h
	private final com.google.android.gms.people.accountswitcherview.AccountSwitcherView i
	private final android.widget.ListView j
	private  k
	private final android.os.Handler l
	private com.google.android.gms.common.api.GoogleApiClient m
	
	    public bah(mm p9, baq p10, bat p11)
	    {
	        this.k = 0;
	        this.e = new blp("ChromecastDrawer", 0);
	        this.f = p9;
	        this.g = p10;
	        this.l = new android.os.Handler();
	        this.d = this.a(p11);
	        this.b = new bar(p9, this.d);
	        this.a = ((android.support.v4.widget.DrawerLayout) p9.findViewById(f.aW));
	        this.i = ((com.google.android.gms.people.accountswitcherview.AccountSwitcherView) p9.findViewById(f.bF));
	        bat v0_13 = this.a;
	        android.view.View v3_3 = v0_13.getResources().getDrawable(a.ev);
	        cqi v4_2 = fe.a(8388611, gt.g(v0_13));
	        if ((v4_2 & 3) == 3) {
	            v0_13.g = v3_3;
	            v0_13.invalidate();
	        }
	        if ((v4_2 & 5) == 5) {
	            v0_13.h = v3_3;
	            v0_13.invalidate();
	        }
	        bat v0_26;
	        bat v0_14 = this.a;
	        v0_14.a = p9.getResources().getColor(a.ds);
	        v0_14.invalidate();
	        bat v0_16 = new android.util.TypedValue();
	        p9.getTheme().resolveAttribute(a.dj, v0_16, 1);
	        android.view.View v3_7 = this.a;
	        v3_7.i = new android.graphics.drawable.ColorDrawable(v0_16.data);
	        v3_7.invalidate();
	        this.j = new android.widget.ListView(p9);
	        this.j.setAdapter(this.b);
	        this.j.setDividerHeight(0);
	        this.j.setOnItemClickListener(this);
	        this.j.setChoiceMode(1);
	        android.view.View v3_10 = new cqa();
	        v3_10.a = 158;
	        if (v3_10.a < 0) {
	            v0_26 = 0;
	        } else {
	            v0_26 = 1;
	        }
	        a.b(v0_26, "Must provide valid client application ID!");
	        bat v0_28 = new cpz(v3_10);
	        android.view.View v3_11 = com.google.android.apps.chromecast.app.SetupApplication.a();
	        if (!bls.a(v3_11)) {
	            if (android.text.TextUtils.isEmpty(com.google.android.apps.chromecast.app.SetupApplication.a().e)) {
	                bat v0_32 = bls.b(v3_11);
	                if (!android.text.TextUtils.isEmpty(v0_32)) {
	                    com.google.android.apps.chromecast.app.SetupApplication.a().a(v0_32);
	                }
	            }
	        } else {
	            this.m = new bwf(v3_11).a(cpx.b, v0_28).a(new bai(this)).a(this).b();
	            this.m.b();
	            bat v0_38 = this.i;
	            v0_38.j = this.m;
	            android.view.View v3_18 = v0_38.h;
	            v3_18.c = v0_38.j;
	            if (v3_18.c != null) {
	                v3_18.d = new cqm(v3_18.getContext(), v3_18.c);
	            }
	            v0_38.k = new cqj(v0_38.getContext(), v0_38.j);
	            v0_38.h.e = v0_38.k;
	        }
	        bat v0_40 = this.i;
	        android.view.View v3_22 = this.i;
	        if (com.google.android.gms.people.accountswitcherview.AccountSwitcherView.c()) {
	            cqi v4_18 = gt.r(v3_22);
	            if (v4_18 != null) {
	                v0_40.setForegroundGravity(55);
	                v0_40.p = new cqw();
	                v0_40.setForeground(v0_40.p);
	            }
	            if ((v0_40.q != null) && (gt.r(v0_40.q))) {
	                v0_40.q.setOnApplyWindowInsetsListener(0);
	                v0_40.q = 0;
	            }
	            if ((v4_18 != null) && (v3_22 != null)) {
	                v0_40.q = v3_22;
	                v0_40.q.setOnApplyWindowInsetsListener(new cqi(v0_40));
	            }
	        }
	        bat v0_41 = this.i;
	        android.view.View v3_24 = this.j;
	        if (v0_41.g.getChildCount() > 0) {
	            v0_41.g.removeAllViews();
	        }
	        v0_41.g.addView(v3_24);
	        v0_41.m = v3_24;
	        v0_41.g.setClipToPadding(0);
	        if ((v0_41.m != null) && (com.google.android.gms.people.accountswitcherview.AccountSwitcherView.c())) {
	            v0_41.m.setNestedScrollingEnabled(0);
	            v0_41.g.setNestedScrollingEnabled(0);
	            v0_41.setNestedScrollingEnabled(0);
	        }
	        this.i.a = new baj(this);
	        this.i.b = new bak(this, p9);
	        this.i.c = new bal(this, p9);
	        bat v0_46 = p9.d().a();
	        if (v0_46 != null) {
	            v0_46.b(1);
	        }
	        this.c = new bam(this, p9, this.a, b.bt, b.bo, p9);
	        this.a.f = this.c;
	        this.b(((bat) this.d.get(this.h)));
	        return;
	    }
	
	
	    static synthetic com.google.android.gms.common.api.GoogleApiClient a(bah p1, com.google.android.gms.common.api.GoogleApiClient p2)
	    {
	        p1.m = 0;
	        return 0;
	    }
	
	
	    private java.util.List a(bat p4)
	    {
	        int v0 = 0;
	        java.util.ArrayList v1_1 = new java.util.ArrayList(bat.values().length);
	        v1_1.add(bat.a);
	        if (blf.a()) {
	            v1_1.add(bat.b);
	        }
	        v1_1.add(bat.c);
	        v1_1.add(bat.d);
	        blf.b();
	        this.h = 0;
	        while (v0 < v1_1.size()) {
	            if (v1_1.get(v0) != p4) {
	                v0++;
	            } else {
	                this.h = v0;
	                break;
	            }
	        }
	        return v1_1;
	    }
	
	
	    private void a(android.view.View p4)
	    {
	        if (p4.getBackground() != null) {
	            p4.getBackground().setCallback(0);
	        }
	        if ((p4 instanceof android.view.ViewGroup)) {
	            int v2 = ((android.view.ViewGroup) p4).getChildCount();
	            int v1_1 = 0;
	            while (v1_1 < v2) {
	                this.a(((android.view.ViewGroup) p4).getChildAt(v1_1));
	                v1_1++;
	            }
	            if (!(p4 instanceof android.widget.AdapterView)) {
	                ((android.view.ViewGroup) p4).removeAllViews();
	            }
	        }
	        return;
	    }
	
	
	    static synthetic void a(bah p3)
	    {
	        if ((p3.m != null) && (p3.m.d())) {
	            cpx.c.a(p3.m, new cpq()).a(p3);
	        }
	        return;
	    }
	
	
	    private void a(boolean p5)
	    {
	        if (!p5) {
	            this.a.f(this.i);
	        } else {
	            this.l.postDelayed(new ban(this), 250);
	        }
	        this.j.setItemChecked(this.h, 1);
	        return;
	    }
	
	
	    static synthetic com.google.android.gms.people.accountswitcherview.AccountSwitcherView b(bah p1)
	    {
	        return p1.i;
	    }
	
	
	    private void b(bat p5)
	    {
	        if (p5 == this.d.get(this.h)) {
	            this.j.setItemChecked(this.h, 1);
	            this.a.f(this.i);
	        } else {
	            mm v0_2 = 0;
	            switch (bap.a[p5.ordinal()]) {
	                case 1:
	                    v0_2 = com.google.android.apps.chromecast.app.MainActivity;
	                    break;
	                case 2:
	                    this.a(1);
	                    blx.d(this.f);
	                    break;
	                case 3:
	                    v0_2 = com.google.android.apps.chromecast.app.mirror.CastScreenActivity;
	                    break;
	                case 4:
	                    this.k = 1;
	                    this.a(0);
	                    break;
	                case 5:
	                    blf.b();
	                    break;
	            }
	            if (v0_2 == null) {
	            } else {
	                this.f.startActivity(new android.content.Intent(this.f, v0_2));
	                this.f.finish();
	                this.f.overridePendingTransition(17432576, 17432577);
	            }
	        }
	        return;
	    }
	
	
	    static synthetic void c(bah p3)
	    {
	        p3.f.d().f();
	        if (p3.k == 1) {
	            bkq.a(p3.f, p3.g);
	        }
	        p3.i.a(0);
	        p3.k = 0;
	        return;
	    }
	
	
	    static synthetic android.support.v4.widget.DrawerLayout d(bah p1)
	    {
	        return p1.a;
	    }
	
	
	    static synthetic mm e(bah p1)
	    {
	        return p1.f;
	    }
	
	
	    public final void a()
	    {
	        if ((this.m != null) && ((!this.m.d()) && (!this.m.e()))) {
	            this.m.b();
	        }
	        return;
	    }
	
	
	    public final void a(android.content.res.Configuration p3)
	    {
	        mn v0 = this.c;
	        v0.c = v0.e();
	        v0.c();
	        return;
	    }
	
	
	    public final synthetic void a(bwm p10)
	    {
	        if (((cpr) p10).b().a()) {
	            String v3 = com.google.android.apps.chromecast.app.SetupApplication.a().e;
	            java.util.ArrayList v4_1 = new java.util.ArrayList();
	            java.util.ArrayList v5_0 = ((cpr) p10).c().iterator();
	            com.google.android.apps.chromecast.app.SetupApplication v1_0 = 0;
	            while (v5_0.hasNext()) {
	                String v0_15 = ((csq) v5_0.next());
	                v4_1.add(v0_15);
	                if (!v0_15.a().equals(v3)) {
	                    v0_15 = v1_0;
	                }
	                v1_0 = v0_15;
	            }
	            String v0_5 = new Object[1];
	            v0_5[0] = v4_1;
	            String v0_6 = this.i;
	            if (v0_6.i == null) {
	                v0_6.i = new cqs(v0_6.getContext(), v0_6.l, 0, 0);
	                v0_6.i.d = 0;
	                v0_6.i.a = v0_6.k;
	                v0_6.f.setAdapter(v0_6.i);
	                java.util.ArrayList v5_7 = v0_6.i;
	                java.util.List v6_3 = v0_6.n;
	                if (v5_7.b != v6_3) {
	                    v5_7.b = v6_3;
	                    v5_7.notifyDataSetChanged();
	                }
	                java.util.ArrayList v5_8 = v0_6.i;
	                java.util.List v6_4 = v0_6.o;
	                if (v5_8.c != v6_4) {
	                    v5_8.c = v6_4;
	                    v5_8.notifyDataSetChanged();
	                }
	            }
	            v0_6.e = v4_1;
	            if (v0_6.e == null) {
	                v0_6.d = 0;
	            }
	            v0_6.a(0, 0);
	            v0_6.i.a(v0_6.e);
	            String v0_7 = v0_6.h;
	            if ((v0_7.l == null) || (!v0_7.l.isRunning())) {
	                if (v0_7.f != null) {
	                    v0_7.f.clear();
	                } else {
	                    v0_7.f = new java.util.ArrayList();
	                }
	                if (0 != 0) {
	                    v0_7.f.add(0);
	                }
	                if (0 != 0) {
	                    v0_7.f.add(0);
	                }
	                v0_7.b();
	            } else {
	                v0_7.m = 0;
	                v0_7.n = 0;
	            }
	            if (v4_1.size() != 0) {
	                if (v1_0 == null) {
	                    String v0_10 = ((csq) v4_1.get(0));
	                    this.i.a(v0_10, 0);
	                    com.google.android.apps.chromecast.app.SetupApplication.a().a(v0_10.a());
	                } else {
	                    this.i.a(v1_0, 0);
	                }
	            } else {
	                if (v3 != null) {
	                    com.google.android.apps.chromecast.app.SetupApplication.a().a(0);
	                }
	            }
	        } else {
	            String v0_16 = new Object[1];
	            v0_16[0] = ((cpr) p10).b();
	        }
	        return;
	    }
	
	
	    public final void a(com.google.android.gms.common.ConnectionResult p3)
	    {
	        mm v0_1 = new Object[1];
	        v0_1[0] = p3;
	        bls.a(this.f, p3, new bao(this));
	        return;
	    }
	
	
	    public final boolean a(android.view.MenuItem p6)
	    {
	        int v2_1;
	        int v0 = 1;
	        int v2_0 = this.c;
	        if ((p6 == null) || ((p6.getItemId() != 16908332) || (!v2_0.d))) {
	            v2_1 = 0;
	        } else {
	            v2_0.d();
	            v2_1 = 1;
	        }
	        if (v2_1 == 0) {
	            v0 = 0;
	        }
	        return v0;
	    }
	
	
	    public final void b()
	    {
	        if ((this.m != null) && ((this.m.d()) || (this.m.e()))) {
	            this.m.c();
	        }
	        return;
	    }
	
	
	    public final void c()
	    {
	        this.m = 0;
	        this.i.b();
	        this.a(this.a);
	        this.a(this.i);
	        return;
	    }
	
	
	    public final void d()
	    {
	        if (this.e()) {
	            this.j.setItemChecked(this.h, 1);
	            this.a.f(this.i);
	        }
	        return;
	    }
	
	
	    public final boolean e()
	    {
	        return this.a.g(this.i);
	    }
	
	
	    public final void f()
	    {
	        this.a.e(this.i);
	        return;
	    }
	
	
	    public final void onItemClick(android.widget.AdapterView p5, android.view.View p6, int p7, long p8)
	    {
	        this.b(((bat) this.d.get(p7)));
	        ape.a().a(new apd(114, Integer.valueOf(p7)));
	        return;
	    }
	
