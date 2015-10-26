	private static final  e
	private iu A
	private iu B
	private iw C
	 pf a
	 vr b
	 vs c
	  d
	private android.content.Context f
	private android.content.Context g
	private android.support.v7.internal.widget.ActionBarOverlayLayout h
	private android.support.v7.internal.widget.ActionBarContainer i
	private se j
	private android.support.v7.internal.widget.ActionBarContextView k
	private android.support.v7.internal.widget.ActionBarContainer l
	private android.view.View m
	private  n
	private  o
	private java.util.ArrayList p
	private  q
	private  r
	private  s
	private  t
	private  u
	private  v
	private  w
	private  x
	private pp y
	private  z
	
	    static pb()
	    {
	        int v0_1;
	        if (android.os.Build$VERSION.SDK_INT < 14) {
	            v0_1 = 0;
	        } else {
	            v0_1 = 1;
	        }
	        pb.e = v0_1;
	        return;
	    }
	
	
	    public pb(android.app.Activity p3, boolean p4)
	    {
	        new java.util.ArrayList();
	        this.p = new java.util.ArrayList();
	        this.s = 0;
	        this.t = 1;
	        this.x = 1;
	        this.A = new pc(this);
	        this.B = new pd(this);
	        this.C = new pe(this);
	        android.view.View v0_11 = p3.getWindow().getDecorView();
	        this.a(v0_11);
	        if (!p4) {
	            this.m = v0_11.findViewById(16908290);
	        }
	        return;
	    }
	
	
	    public pb(android.app.Dialog p3)
	    {
	        new java.util.ArrayList();
	        this.p = new java.util.ArrayList();
	        this.s = 0;
	        this.t = 1;
	        this.x = 1;
	        this.A = new pc(this);
	        this.B = new pd(this);
	        this.C = new pe(this);
	        this.a(p3.getWindow().getDecorView());
	        return;
	    }
	
	
	    static synthetic pp a(pb p1, pp p2)
	    {
	        p1.y = 0;
	        return 0;
	    }
	
	
	    private void a(int p5, int p6)
	    {
	        int v0_1 = this.j.m();
	        if ((p6 & 4) != 0) {
	            this.n = 1;
	        }
	        this.j.a(((v0_1 & (p6 ^ -1)) | (p5 & p6)));
	        return;
	    }
	
	
	    private void a(android.view.View p7)
	    {
	        this.h = ((android.support.v7.internal.widget.ActionBarOverlayLayout) p7.findViewById(a.bd));
	        if (this.h != null) {
	            IllegalStateException v0_4 = this.h;
	            v0_4.e = this;
	            if (v0_4.getWindowToken() != null) {
	                v0_4.e.c(v0_4.a);
	                if (v0_4.d != 0) {
	                    v0_4.onWindowSystemUiVisibilityChanged(v0_4.d);
	                    gt.q(v0_4);
	                }
	            }
	        }
	        IllegalStateException v0_10;
	        IllegalStateException v0_6 = p7.findViewById(a.aP);
	        if (!(v0_6 instanceof se)) {
	            if (!(v0_6 instanceof android.support.v7.widget.Toolbar)) {
	                IllegalStateException v0_7;
	                if (new StringBuilder("Can\'t make a decor toolbar out of ").append(v0_6).toString() == null) {
	                    v0_7 = "null";
	                } else {
	                    v0_7 = v0_6.getClass().getSimpleName();
	                }
	                throw new IllegalStateException(v0_7);
	            } else {
	                v0_10 = ((android.support.v7.widget.Toolbar) v0_6).h();
	            }
	        } else {
	            v0_10 = ((se) v0_6);
	        }
	        this.j = v0_10;
	        this.k = ((android.support.v7.internal.widget.ActionBarContextView) p7.findViewById(a.aU));
	        this.i = ((android.support.v7.internal.widget.ActionBarContainer) p7.findViewById(a.aR));
	        this.l = ((android.support.v7.internal.widget.ActionBarContainer) p7.findViewById(a.bu));
	        if ((this.j != null) && ((this.k != null) && (this.i != null))) {
	            IllegalStateException v0_28;
	            this.f = this.j.b();
	            this.q = 0;
	            if ((this.j.m() & 4) == 0) {
	                v0_28 = 0;
	            } else {
	                v0_28 = 1;
	            }
	            if (v0_28 != null) {
	                this.n = 1;
	            }
	            IllegalStateException v0_30 = ph.a(this.f);
	            // Both branches of the condition point to the same code.
	            // if (v0_30.a.getApplicationInfo().targetSdkVersion >= 14) {
	                this.h(v0_30.a());
	                IllegalStateException v0_33 = this.f.obtainStyledAttributes(0, oq.a, a.i, 0);
	                if (v0_33.getBoolean(oq.k, 0)) {
	                    if (this.h.b) {
	                        this.d = 1;
	                        this.h.a(1);
	                    } else {
	                        throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
	                    }
	                }
	                float v1_4 = v0_33.getDimensionPixelSize(oq.i, 0);
	                if (v1_4 != 0) {
	                    float v1_5 = ((float) v1_4);
	                    gt.f(this.i, v1_5);
	                    if (this.l != null) {
	                        gt.f(this.l, v1_5);
	                    }
	                }
	                v0_33.recycle();
	                return;
	            // }
	        } else {
	            throw new IllegalStateException(new StringBuilder().append(this.getClass().getSimpleName()).append(" can only be used with a compatible window decor layout").toString());
	        }
	    }
	
	
	    static synthetic boolean a(pb p1)
	    {
	        return p1.t;
	    }
	
	
	    static synthetic boolean a(boolean p1, boolean p2, boolean p3)
	    {
	        return pb.b(p1, p2, 0);
	    }
	
	
	    static synthetic android.view.View b(pb p1)
	    {
	        return p1.m;
	    }
	
	
	    private static boolean b(boolean p1, boolean p2, boolean p3)
	    {
	        int v0 = 1;
	        if ((!p3) && ((p1) || (p2))) {
	            v0 = 0;
	        }
	        return v0;
	    }
	
	
	    static synthetic android.support.v7.internal.widget.ActionBarContainer c(pb p1)
	    {
	        return p1.i;
	    }
	
	
	    static synthetic android.support.v7.internal.widget.ActionBarContainer d(pb p1)
	    {
	        return p1.l;
	    }
	
	
	    static synthetic int e(pb p1)
	    {
	        return p1.q;
	    }
	
	
	    static synthetic android.support.v7.internal.widget.ActionBarOverlayLayout f(pb p1)
	    {
	        return p1.h;
	    }
	
	
	    static synthetic boolean g(pb p1)
	    {
	        return p1.u;
	    }
	
	
	    private void h(boolean p6)
	    {
	        int v1 = 1;
	        this.r = p6;
	        if (this.r) {
	            this.i.a(0);
	            this.j.a(0);
	        } else {
	            this.j.a(0);
	            this.i.a(0);
	        }
	        int v0_7;
	        if (this.j.n() != 2) {
	            v0_7 = 0;
	        } else {
	            v0_7 = 1;
	        }
	        if ((this.r) || (v0_7 == 0)) {
	            android.support.v7.internal.widget.ActionBarOverlayLayout v3_3 = 0;
	        } else {
	            v3_3 = 1;
	        }
	        this.j.a(v3_3);
	        if ((this.r) || (v0_7 == 0)) {
	            v1 = 0;
	        }
	        this.h.c = v1;
	        return;
	    }
	
	
	    static synthetic boolean h(pb p1)
	    {
	        return p1.v;
	    }
	
	
	    static synthetic android.support.v7.internal.widget.ActionBarContextView i(pb p1)
	    {
	        return p1.k;
	    }
	
	
	    private void i(boolean p9)
	    {
	        if (!pb.b(this.u, this.v, this.w)) {
	            if (this.x) {
	                this.x = 0;
	                if (this.y != null) {
	                    this.y.b();
	                }
	                if ((this.s != 0) || ((!pb.e) || ((!this.z) && (!p9)))) {
	                    this.A.b(0);
	                } else {
	                    gt.c(this.i, 1065353216);
	                    this.i.a(1);
	                    pp v1_3 = new pp();
	                    ih v0_14 = ((float) (- this.i.getHeight()));
	                    if (p9) {
	                        float v2_1 = new int[2];
	                        v2_1 = {0, 0};
	                        this.i.getLocationInWindow(v2_1);
	                        v0_14 -= ((float) v2_1[1]);
	                    }
	                    float v2_6 = gt.o(this.i).c(v0_14);
	                    v2_6.a(this.C);
	                    v1_3.a(v2_6);
	                    if ((this.t) && (this.m != null)) {
	                        v1_3.a(gt.o(this.m).c(v0_14));
	                    }
	                    if ((this.l != null) && (this.l.getVisibility() == 0)) {
	                        gt.c(this.l, 1065353216);
	                        v1_3.a(gt.o(this.l).c(((float) this.l.getHeight())));
	                    }
	                    v1_3.a(android.view.animation.AnimationUtils.loadInterpolator(this.f, 17432581));
	                    v1_3.a(250);
	                    v1_3.a(this.A);
	                    this.y = v1_3;
	                    v1_3.a();
	                }
	            }
	        } else {
	            if (!this.x) {
	                this.x = 1;
	                if (this.y != null) {
	                    this.y.b();
	                }
	                this.i.setVisibility(0);
	                if ((this.s != 0) || ((!pb.e) || ((!this.z) && (!p9)))) {
	                    gt.c(this.i, 1065353216);
	                    gt.b(this.i, 0);
	                    if ((this.t) && (this.m != null)) {
	                        gt.b(this.m, 0);
	                    }
	                    if ((this.l != null) && (this.q == 1)) {
	                        gt.c(this.l, 1065353216);
	                        gt.b(this.l, 0);
	                        this.l.setVisibility(0);
	                    }
	                    this.B.b(0);
	                } else {
	                    gt.b(this.i, 0);
	                    ih v0_48 = ((float) (- this.i.getHeight()));
	                    if (p9) {
	                        pp v1_5 = new int[2];
	                        v1_5 = {0, 0};
	                        this.i.getLocationInWindow(v1_5);
	                        v0_48 -= ((float) v1_5[1]);
	                    }
	                    gt.b(this.i, v0_48);
	                    pp v1_10 = new pp();
	                    float v2_19 = gt.o(this.i).c(0);
	                    v2_19.a(this.C);
	                    v1_10.a(v2_19);
	                    if ((this.t) && (this.m != null)) {
	                        gt.b(this.m, v0_48);
	                        v1_10.a(gt.o(this.m).c(0));
	                    }
	                    if ((this.l != null) && (this.q == 1)) {
	                        gt.b(this.l, ((float) this.l.getHeight()));
	                        this.l.setVisibility(0);
	                        v1_10.a(gt.o(this.l).c(0));
	                    }
	                    v1_10.a(android.view.animation.AnimationUtils.loadInterpolator(this.f, 17432582));
	                    v1_10.a(250);
	                    v1_10.a(this.B);
	                    this.y = v1_10;
	                    v1_10.a();
	                }
	                if (this.h != null) {
	                    gt.q(this.h);
	                }
	            }
	        }
	        return;
	    }
	
	
	    static synthetic se j(pb p1)
	    {
	        return p1.j;
	    }
	
	
	    static synthetic android.content.Context k(pb p1)
	    {
	        return p1.f;
	    }
	
	
	    public final CharSequence a()
	    {
	        return this.j.e();
	    }
	
	
	    public final vr a(vs p5)
	    {
	        if (this.a != null) {
	            this.a.c();
	        }
	        this.h.a(0);
	        this.k.c();
	        int v0_5 = new pf(this, this.k.getContext(), p5);
	        if (!v0_5.e()) {
	            v0_5 = 0;
	        } else {
	            v0_5.d();
	            this.k.a(v0_5);
	            this.g(1);
	            if ((this.l != null) && ((this.q == 1) && (this.l.getVisibility() != 0))) {
	                this.l.setVisibility(0);
	                if (this.h != null) {
	                    gt.q(this.h);
	                }
	            }
	            this.k.sendAccessibilityEvent(32);
	            this.a = v0_5;
	        }
	        return v0_5;
	    }
	
	
	    public final void a(int p2)
	    {
	        this.a(this.f.getString(p2));
	        return;
	    }
	
	
	    public final void a(android.content.res.Configuration p2)
	    {
	        this.h(ph.a(this.f).a());
	        return;
	    }
	
	
	    public final void a(android.graphics.drawable.Drawable p2)
	    {
	        this.j.a(p2);
	        return;
	    }
	
	
	    public final void a(CharSequence p2)
	    {
	        this.j.b(p2);
	        return;
	    }
	
	
	    public final void a(boolean p2)
	    {
	        this.a(2, 2);
	        return;
	    }
	
	
	    public final int b()
	    {
	        return this.j.m();
	    }
	
	
	    public final void b(int p2)
	    {
	        this.j.c(p2);
	        return;
	    }
	
	
	    public final void b(CharSequence p2)
	    {
	        this.j.c(p2);
	        return;
	    }
	
	
	    public final void b(boolean p3)
	    {
	        int v0;
	        if (!p3) {
	            v0 = 0;
	        } else {
	            v0 = 4;
	        }
	        this.a(v0, 4);
	        return;
	    }
	
	
	    public final void c()
	    {
	        if (this.u) {
	            this.u = 0;
	            this.i(0);
	        }
	        return;
	    }
	
	
	    public final void c(int p1)
	    {
	        this.s = p1;
	        return;
	    }
	
	
	    public final void c(CharSequence p2)
	    {
	        this.j.a(p2);
	        return;
	    }
	
	
	    public final void c(boolean p2)
	    {
	        if (!this.n) {
	            this.b(p2);
	        }
	        return;
	    }
	
	
	    public final void d()
	    {
	        if (!this.u) {
	            this.u = 1;
	            this.i(0);
	        }
	        return;
	    }
	
	
	    public final void d(boolean p2)
	    {
	        this.z = p2;
	        if ((!p2) && (this.y != null)) {
	            this.y.b();
	        }
	        return;
	    }
	
	
	    public final android.content.Context e()
	    {
	        if (this.g == null) {
	            android.content.Context v0_2 = new android.util.TypedValue();
	            this.f.getTheme().resolveAttribute(a.m, v0_2, 1);
	            android.content.Context v0_3 = v0_2.resourceId;
	            if (v0_3 == null) {
	                this.g = this.f;
	            } else {
	                this.g = new android.view.ContextThemeWrapper(this.f, v0_3);
	            }
	        }
	        return this.g;
	    }
	
	
	    public final void e(boolean p4)
	    {
	        if (p4 != this.o) {
	            this.o = p4;
	            int v1 = this.p.size();
	            int v0_2 = 0;
	            while (v0_2 < v1) {
	                this.p.get(v0_2);
	                v0_2++;
	            }
	        }
	        return;
	    }
	
	
	    public final void f(boolean p1)
	    {
	        this.t = p1;
	        return;
	    }
	
	
	    public final void g(boolean p5)
	    {
	        int v2 = 0;
	        if (!p5) {
	            if (this.w) {
	                this.w = 0;
	                if (this.h != null) {
	                    android.support.v7.internal.widget.ActionBarOverlayLayout.a();
	                }
	                this.i(0);
	            }
	        } else {
	            if (!this.w) {
	                this.w = 1;
	                if (this.h != null) {
	                    android.support.v7.internal.widget.ActionBarOverlayLayout.a();
	                }
	                this.i(0);
	            }
	        }
	        android.support.v7.internal.widget.ActionBarContextView v0_5;
	        if (!p5) {
	            v0_5 = 0;
	        } else {
	            v0_5 = 8;
	        }
	        this.j.b(v0_5);
	        if (!p5) {
	            v2 = 8;
	        }
	        this.k.b(v2);
	        return;
	    }
	
	
	    public final boolean g()
	    {
	        if ((this.j == null) || (!this.j.c())) {
	            int v0_3 = 0;
	        } else {
	            this.j.d();
	            v0_3 = 1;
	        }
	        return v0_3;
	    }
	
	
	    public final void h()
	    {
	        if (this.v) {
	            this.v = 0;
	            this.i(1);
	        }
	        return;
	    }
	
	
	    public final void i()
	    {
	        if (!this.v) {
	            this.v = 1;
	            this.i(1);
	        }
	        return;
	    }
	
	
	    public final void j()
	    {
	        if (this.y != null) {
	            this.y.b();
	            this.y = 0;
	        }
	        return;
	    }
	
