	private  A
	private  B
	private  C
	private  D
	private  E
	private  F
	private  G
	private csq H
	private android.view.animation.Interpolator I
	private  J
	private csq K
	 crf a
	  b
	public com.google.android.gms.common.api.GoogleApiClient c
	public cqm d
	public cqj e
	public java.util.ArrayList f
	 crd g
	 crg h
	  i
	  j
	  k
	public android.animation.AnimatorSet l
	public csq m
	public csq n
	private crh o
	private csq p
	private  q
	private  r
	private  s
	private  t
	private android.view.VelocityTracker u
	private  v
	private  w
	private  x
	private  y
	private  z
	
	    public SelectedAccountNavigationView(android.content.Context p8, android.util.AttributeSet p9)
	    {
	        int v0_0 = 1;
	        this(p8, p9);
	        this.b = 0;
	        this.i = com.google.android.gms.people.accountswitcherview.AccountSwitcherView.c();
	        this.f = new java.util.ArrayList(2);
	        this.q = -1;
	        this.t = android.view.ViewConfiguration.get(p8).getScaledTouchSlop();
	        this.u = android.view.VelocityTracker.obtain();
	        this.v = android.view.ViewConfiguration.getMinimumFlingVelocity();
	        android.content.res.Resources v4_7 = p8.getResources();
	        this.y = ((float) v4_7.getDimensionPixelSize(a.hN));
	        this.z = ((float) v4_7.getDimensionPixelSize(a.hM));
	        if (android.os.Build$VERSION.SDK_INT >= 17) {
	            if (this.getResources().getConfiguration().getLayoutDirection() != 1) {
	                v0_0 = 0;
	            }
	            this.F = v0_0;
	        }
	        int v0_2;
	        if (!com.google.android.gms.people.accountswitcherview.AccountSwitcherView.c()) {
	            v0_2 = -1;
	        } else {
	            v0_2 = 17563661;
	        }
	        int v0_4;
	        if (v0_2 == -1) {
	            v0_4 = new android.view.animation.DecelerateInterpolator();
	        } else {
	            v0_4 = android.view.animation.AnimationUtils.loadInterpolator(p8, 17563661);
	        }
	        this.I = v0_4;
	        this.k = v4_7.getDimensionPixelSize(a.hO);
	        this.J = v4_7.getDimensionPixelSize(a.hL);
	        return;
	    }
	
	
	    public static synthetic android.animation.AnimatorSet a(com.google.android.gms.people.accountswitcherview.SelectedAccountNavigationView p1, android.animation.AnimatorSet p2)
	    {
	        p1.l = 0;
	        return 0;
	    }
	
	
	    public static synthetic crg a(com.google.android.gms.people.accountswitcherview.SelectedAccountNavigationView p1)
	    {
	        return p1.h;
	    }
	
	
	    private void a(android.view.MotionEvent p4)
	    {
	        int v0_0 = p4.getActionIndex();
	        if (p4.getPointerId(v0_0) == this.x) {
	            int v0_1;
	            if (v0_0 != 0) {
	                v0_1 = 0;
	            } else {
	                v0_1 = 1;
	            }
	            this.x = p4.getPointerId(v0_1);
	        }
	        return;
	    }
	
	
	    private static void a(android.view.View p2)
	    {
	        if (p2 != null) {
	            gt.a(p2, 0);
	            gt.b(p2, 0);
	            gt.d(p2, 1065353216);
	            gt.e(p2, 1065353216);
	            p2.setAlpha(1065353216);
	        }
	        return;
	    }
	
	
	    private void a(android.widget.ImageView p6, csq p7)
	    {
	        if ((p6 != null) && (this.e != null)) {
	            String v0_1 = p6.getContext();
	            p7.a();
	            p7.d();
	            p6.setImageBitmap(cqj.a(v0_1));
	            if (android.text.TextUtils.isEmpty(p7.c())) {
	                this.e.a(p6);
	            } else {
	                this.e.a(p6);
	                this.e.a(p6, p7.a(), p7.d(), 2);
	            }
	            p6.setVisibility(0);
	            String v0_8 = this.getContext();
	            Object[] v2_2 = new Object[1];
	            v2_2[0] = p7.a();
	            p6.setContentDescription(v0_8.getString(b.eB, v2_2));
	        }
	        return;
	    }
	
	
	    private static void a(android.widget.TextView p3, android.widget.TextView p4, csq p5)
	    {
	        int v0_0;
	        if (p3 == null) {
	            v0_0 = 0;
	        } else {
	            if (!android.text.TextUtils.isEmpty(p5.b())) {
	                v0_0 = 1;
	                p3.setText(p5.b());
	            } else {
	                p3.setText(p5.a());
	                v0_0 = 0;
	            }
	        }
	        if (p4 != null) {
	            if (v0_0 == 0) {
	                p4.setVisibility(8);
	            } else {
	                p4.setVisibility(0);
	                p4.setText(p5.a());
	            }
	        }
	        return;
	    }
	
	
	    public static synthetic void a(com.google.android.gms.people.accountswitcherview.SelectedAccountNavigationView p11, int p12)
	    {
	        if ((p11.f != null) && (p11.f.size() != 0)) {
	            int v1_0;
	            android.animation.AnimatorSet v3_1 = new android.animation.AnimatorSet();
	            if (p12 != 0) {
	                v1_0 = p11.h.i;
	            } else {
	                v1_0 = p11.h.h;
	            }
	            float[] v2_8;
	            v1_0.bringToFront();
	            android.animation.AnimatorSet v0_9 = ((csq) p11.f.get(p12));
	            int v5_1 = new float[2];
	            v5_1 = {1065353216, 0};
	            long v4_2 = (p11.y / p11.z);
	            int v5_5 = ((p11.y - p11.z) * 1056964608);
	            int v6_7 = (((float) (p11.h.e.getLeft() - v1_0.getLeft())) - ((p11.z - p11.y) * 1056964608));
	            android.animation.AnimatorSet$Builder v7_4 = v3_1.play(android.animation.ObjectAnimator.ofFloat(p11.h.e, "alpha", v5_1));
	            long v8_3 = new float[1];
	            v8_3[0] = v6_7;
	            float[] v2_4 = android.animation.ObjectAnimator.ofFloat(v1_0, "translationX", v8_3);
	            v2_4.setDuration(450);
	            long v8_6 = new float[1];
	            v8_6[0] = v5_5;
	            int v5_6 = android.animation.ObjectAnimator.ofFloat(v1_0, "translationY", v8_6);
	            v5_6.setDuration(450);
	            long v8_9 = new float[1];
	            v8_9[0] = v4_2;
	            int v6_10 = android.animation.ObjectAnimator.ofFloat(v1_0, "scaleY", v8_9);
	            v6_10.setDuration(300);
	            int v9_4 = new float[1];
	            v9_4[0] = v4_2;
	            int v1_1 = android.animation.ObjectAnimator.ofFloat(v1_0, "scaleX", v9_4);
	            v1_1.setDuration(300);
	            v7_4.with(v2_4).with(v5_6).with(v6_10).with(v1_1);
	            if (p12 != 0) {
	                v2_8 = p11.h.t;
	            } else {
	                v2_8 = p11.h.s;
	            }
	            int v1_7;
	            if (p12 != 0) {
	                v1_7 = p11.h.w;
	            } else {
	                v1_7 = p11.h.v;
	            }
	            if (v1_7 != 0) {
	                v1_7.setImageDrawable(p11.h.k.getDrawable());
	            }
	            if (v2_8 != null) {
	                v2_8.setVisibility(0);
	                long v4_7 = new float[1];
	                v4_7[0] = 1065353216;
	                int v1_11 = android.animation.ObjectAnimator.ofFloat(v2_8, "alpha", v4_7);
	                v1_11.setDuration(450);
	                int v5_9 = new float[1];
	                v5_9[0] = 1065353216;
	                long v4_10 = android.animation.ObjectAnimator.ofFloat(v2_8, "scaleY", v5_9);
	                v4_10.setDuration(450);
	                int v6_14 = new float[1];
	                v6_14[0] = 1065353216;
	                float[] v2_9 = android.animation.ObjectAnimator.ofFloat(v2_8, "scaleX", v6_14);
	                v2_9.setDuration(450);
	                v7_4.with(v1_11).with(v2_9).with(v4_10);
	            }
	            if ((p11.h.n != null) && (p11.h.c != null)) {
	                p11.h.n.setAlpha(0);
	                p11.h.n.setTranslationX(0);
	                p11 = p11.a(v0_9, v7_4, 150, 0);
	            }
	            if (p11.h.j != null) {
	                int v1_26 = p11.h.j;
	                long v4_12 = new float[1];
	                v4_12[0] = 0;
	                int v1_27 = android.animation.ObjectAnimator.ofFloat(v1_26, "alpha", v4_12);
	                v1_27.setDuration(300);
	                v7_4.with(v1_27);
	            }
	            if (p11.h.r != null) {
	                p11 = p11.a(p11.h, p11.h.r, v0_9);
	                p11.h.r.setVisibility(0);
	                android.animation.AnimatorSet v0_13 = p11.h.r;
	                float[] v2_17 = new float[1];
	                v2_17[0] = 1065353216;
	                android.animation.AnimatorSet v0_14 = android.animation.ObjectAnimator.ofFloat(v0_13, "alpha", v2_17);
	                v0_14.setDuration(300);
	                v7_4.with(v0_14);
	            }
	            v3_1.addListener(new cqy(p11));
	            int v1_33 = p11.p;
	            p11.p = ((csq) p11.f.get(p12));
	            p11.f.add(p12, v1_33);
	            p11.f.remove((p12 + 1));
	            v3_1.setInterpolator(p11.I);
	            p11.l = v3_1;
	            p11.l.start();
	        }
	        return;
	    }
	
	
	    private void a(crg p7, android.widget.ImageView p8, csq p9)
	    {
	        if (p8 != null) {
	            if (android.text.TextUtils.isEmpty(p9.e())) {
	                this.d.a(p8);
	                p8.setImageBitmap(cqm.a(this.getContext()));
	            } else {
	                this.d.a(p8);
	                cqm v1 = this.d;
	                v1.a(new cqn(v1, p8, p9.a(), p9.d(), p7.j.getMeasuredWidth()));
	            }
	        }
	        return;
	    }
	
	
	    private void a(csq p9, android.animation.AnimatorSet$Builder p10, int p11, int p12)
	    {
	        com.google.android.gms.people.accountswitcherview.SelectedAccountNavigationView.a(this.h.o, this.h.p, p9);
	        this.h.n.setVisibility(0);
	        android.animation.AnimatorSet$Builder v0_5 = this.h.n;
	        long v2_0 = new float[1];
	        v2_0[0] = 1065353216;
	        android.animation.AnimatorSet$Builder v0_6 = android.animation.ObjectAnimator.ofFloat(v0_5, "alpha", v2_0);
	        v0_6.setStartDelay(((long) p11));
	        v0_6.setDuration(150);
	        android.animation.ObjectAnimator v1_4 = this.h.c;
	        float[] v3_1 = new float[1];
	        v3_1[0] = 0;
	        android.animation.ObjectAnimator v1_5 = android.animation.ObjectAnimator.ofFloat(v1_4, "alpha", v3_1);
	        v1_5.setStartDelay(0);
	        v1_5.setDuration(150);
	        p10.with(v0_6).with(v1_5);
	        return;
	    }
	
	
	    public static synthetic void b(com.google.android.gms.people.accountswitcherview.SelectedAccountNavigationView p3)
	    {
	        if (p3.K != null) {
	            p3.p = p3.K;
	            p3.K = 0;
	        }
	        if ((p3.m != null) || (p3.n != null)) {
	            p3.f.clear();
	            if (p3.m != null) {
	                p3.f.add(p3.m);
	            }
	            if (p3.n != null) {
	                p3.f.add(p3.n);
	            }
	            p3.m = 0;
	            p3.n = 0;
	        }
	        return;
	    }
	
	
	    private void c()
	    {
	        if (this.h == null) {
	            this.a();
	        }
	        if (this.i) {
	            com.google.android.gms.people.accountswitcherview.SelectedAccountNavigationView.a(this.h.e);
	            com.google.android.gms.people.accountswitcherview.SelectedAccountNavigationView.a(this.h.h);
	            com.google.android.gms.people.accountswitcherview.SelectedAccountNavigationView.a(this.h.i);
	            com.google.android.gms.people.accountswitcherview.SelectedAccountNavigationView.a(this.h.c);
	            com.google.android.gms.people.accountswitcherview.SelectedAccountNavigationView.a(this.h.j);
	            com.google.android.gms.people.accountswitcherview.SelectedAccountNavigationView.a(this.h.r);
	            com.google.android.gms.people.accountswitcherview.SelectedAccountNavigationView.a(this.h.q);
	        }
	        android.view.View v0_16 = this.h;
	        csq v1 = this.p;
	        if (v0_16.b != null) {
	            cqj v2_1 = v0_16.b;
	            android.widget.ImageView v3_1 = this.getContext().getResources();
	            String v5_1 = new Object[1];
	            v5_1[0] = this.p.a();
	            v2_1.setContentDescription(v3_1.getString(b.eD, v5_1));
	        }
	        if (v0_16.k != null) {
	            cqj v2_3 = v0_16.k;
	            android.widget.ImageView v3_3 = this.getContext();
	            v1.a();
	            v1.d();
	            v2_3.setImageBitmap(cqj.a(v3_3));
	            if (android.text.TextUtils.isEmpty(v1.c())) {
	                this.e.a(v0_16.k);
	            } else {
	                this.e.a(v0_16.k);
	                this.e.a(v0_16.k, v1.a(), v1.d(), 2);
	            }
	        }
	        com.google.android.gms.people.accountswitcherview.SelectedAccountNavigationView.a(v0_16.f, v0_16.g, v1);
	        this.a(v0_16, v0_16.j, v1);
	        this.b();
	        if (this.i) {
	            if (this.h.q != null) {
	                this.h.q.setVisibility(8);
	            }
	            if (this.h.r != null) {
	                this.h.r.setVisibility(8);
	            }
	            if (this.h.n != null) {
	                this.h.n.setVisibility(8);
	            }
	            if (this.h.s != null) {
	                this.h.s.setAlpha(0);
	                this.h.s.setScaleX(1061997773);
	                this.h.s.setScaleY(1061997773);
	                this.h.s.setVisibility(8);
	            }
	            if (this.h.t != null) {
	                this.h.t.setAlpha(0);
	                this.h.t.setScaleX(1061997773);
	                this.h.t.setScaleY(1061997773);
	                this.h.t.setVisibility(8);
	            }
	        }
	        return;
	    }
	
	
	    public static synthetic void c(com.google.android.gms.people.accountswitcherview.SelectedAccountNavigationView p0)
	    {
	        p0.c();
	        return;
	    }
	
	
	    private void d()
	    {
	        com.google.android.gms.people.accountswitcherview.ExpanderView v0_1;
	        int v2 = 1;
	        if (this.b != 1) {
	            v0_1 = 1;
	        } else {
	            v0_1 = 0;
	        }
	        this.a(v0_1);
	        if (this.a != null) {
	            this.a.a();
	        }
	        if (this.b != 1) {
	            v2 = 0;
	        }
	        this.h.d.a(v2);
	        return;
	    }
	
	
	    public static synthetic void d(com.google.android.gms.people.accountswitcherview.SelectedAccountNavigationView p2)
	    {
	        if (p2.g != null) {
	            p2.g.a(p2.p);
	        }
	        return;
	    }
	
	
	    public static synthetic void e(com.google.android.gms.people.accountswitcherview.SelectedAccountNavigationView p0)
	    {
	        p0.d();
	        return;
	    }
	
	
	    public static synthetic boolean f(com.google.android.gms.people.accountswitcherview.SelectedAccountNavigationView p1)
	    {
	        return p1.i;
	    }
	
	
	    void a()
	    {
	        crc v1_0 = this.getContext();
	        if (this.q == -1) {
	            com.google.android.gms.people.accountswitcherview.ExpanderView v0_3;
	            if (!this.j) {
	                if (!com.google.android.gms.people.accountswitcherview.AccountSwitcherView.c()) {
	                    v0_3 = a.iu;
	                } else {
	                    v0_3 = a.it;
	                }
	            } else {
	                v0_3 = a.it;
	            }
	            this.q = v0_3;
	        }
	        if (this.o == null) {
	            this.o = new cre(this);
	        }
	        android.view.LayoutInflater.from(v1_0).inflate(this.q, this);
	        this.h = this.o.a(this);
	        if (this.i) {
	            this.h.h.setOnClickListener(new cra(this));
	            this.h.i.setOnClickListener(new crb(this));
	        }
	        if (this.h.d != null) {
	            this.h.d.setOnClickListener(new crc(this));
	        }
	        return;
	    }
	
	
	    public final void a(int p3)
	    {
	        int v0 = 1;
	        if (this.b != p3) {
	            this.b = p3;
	            if (this.h == null) {
	                this.a();
	            }
	            if (this.b != 1) {
	                v0 = 0;
	            }
	            this.h.d.a(v0);
	        }
	        return;
	    }
	
	
	    void a(android.view.View p3, int p4)
	    {
	        if (p3 != null) {
	            android.view.ViewGroup$MarginLayoutParams v0_1 = ((android.view.ViewGroup$MarginLayoutParams) p3.getLayoutParams());
	            v0_1.topMargin = (this.J + p4);
	            p3.setLayoutParams(v0_1);
	        }
	        return;
	    }
	
	
	    public final void a(csq p7)
	    {
	        if (this.h == null) {
	            this.a();
	        }
	        if (p7 != null) {
	            if ((this.l == null) || (!this.l.isRunning())) {
	                if ((this.h.j == null) || (this.h.j.getMeasuredWidth() != 0)) {
	                    if ((this.p != null) && (this.p.a().equals(p7.a()))) {
	                        this.p = p7;
	                        this.c();
	                    } else {
	                        csq v4 = this.p;
	                        this.p = p7;
	                        String v5 = this.p.a();
	                        int v1_1 = 0;
	                        while (v1_1 < this.f.size()) {
	                            if (!((csq) this.f.get(v1_1)).a().equals(v5)) {
	                                v1_1++;
	                            }
	                            if (v1_1 >= 0) {
	                                this.f.remove(v1_1);
	                            }
	                            if (v4 != null) {
	                                this.f.add(0, v4);
	                                while (this.f.size() > 2) {
	                                    this.f.remove((this.f.size() - 1));
	                                }
	                            }
	                            this.c();
	                        }
	                        v1_1 = -1;
	                    }
	                } else {
	                    this.H = p7;
	                    this.forceLayout();
	                }
	            } else {
	                this.K = p7;
	            }
	        } else {
	            this.p = 0;
	        }
	        return;
	    }
	
	
	    public void b()
	    {
	        if (this.i) {
	            if (this.h == null) {
	                this.a();
	            }
	            if ((this.h.j == null) || (this.h.j.getMeasuredWidth() != 0)) {
	                if (this.f.size() <= 0) {
	                    this.h.h.setVisibility(8);
	                } else {
	                    int v0_13 = ((csq) this.f.get(0));
	                    android.widget.ImageView v1_0 = this.h;
	                    this.h.h.setVisibility(0);
	                    this.a(this.h.l, v0_13);
	                    this.a(v1_0, v1_0.r, v0_13);
	                }
	                if (this.f.size() <= 1) {
	                    this.h.i.setVisibility(8);
	                } else {
	                    this.h.i.setVisibility(0);
	                    this.a(this.h.m, ((csq) this.f.get(1)));
	                }
	                this.A = -1082130432;
	            } else {
	                this.forceLayout();
	            }
	        }
	        return;
	    }
	
	
	    public boolean onInterceptTouchEvent(android.view.MotionEvent p3)
	    {
	        switch (p3.getAction()) {
	            case 0:
	                this.w = 0;
	                this.x = p3.getPointerId(0);
	                this.w = 0;
	                break;
	            case 6:
	                this.a(p3);
	                this.x = -1;
	                this.w = 0;
	                break;
	        }
	        return this.w;
	    }
	
	
	    public void onMeasure(int p2, int p3)
	    {
	        if (this.h == null) {
	            this.a();
	        }
	        if (this.h.j != null) {
	            this.h.j.measure(p2, p3);
	        }
	        if (this.h.a != null) {
	            this.h.a.measure(p2, p3);
	        }
	        if (this.H != null) {
	            this.a(this.H);
	            this.H = 0;
	        }
	        super.onMeasure(p2, p3);
	        return;
	    }
	
	
	    public boolean onTouchEvent(android.view.MotionEvent p15)
	    {
	        float v3_0 = 0;
	        android.view.View v0_0 = p15.getAction();
	        android.widget.TextView v4_0 = this.getParent();
	        switch (v0_0) {
	            case 0:
	                this.r = p15.getX();
	                this.s = p15.getY();
	                v3_0 = 1;
	                break;
	            case 1:
	                if (this.x >= 0) {
	                    if (!this.w) {
	                        this.d();
	                    } else {
	                        android.view.View v0_108;
	                        if (this.f.size() <= 1) {
	                            v0_108 = this.A;
	                        } else {
	                            v0_108 = ((float) this.B);
	                        }
	                        float v1_75 = this.h.e.getTranslationX();
	                        if (this.F) {
	                            v1_75 = Math.abs(v1_75);
	                        }
	                        android.view.View v0_112;
	                        if (v1_75 < (v0_108 * 1056964608)) {
	                            v0_112 = 0;
	                        } else {
	                            v0_112 = 1;
	                        }
	                        if ((v0_112 == null) && ((p15.getX(this.x) - this.r) > ((float) this.t))) {
	                            this.u.computeCurrentVelocity(1000);
	                            if (Math.abs(this.u.getXVelocity()) <= ((float) this.v)) {
	                                v0_112 = 0;
	                            } else {
	                                v0_112 = 1;
	                            }
	                        }
	                        if (v0_112 == null) {
	                            android.view.View v0_119 = new android.animation.AnimatorSet();
	                            float v1_84 = this.h.e;
	                            String v6_10 = new float[1];
	                            v6_10[0] = 1065353216;
	                            float v1_86 = v0_119.play(android.animation.ObjectAnimator.ofFloat(v1_84, "alpha", v6_10));
	                            android.animation.ObjectAnimator v5_13 = this.h.e;
	                            android.view.View v7_12 = new float[1];
	                            v7_12[0] = 0;
	                            android.animation.ObjectAnimator v5_14 = android.animation.ObjectAnimator.ofFloat(v5_13, "translationX", v7_12);
	                            String v6_13 = this.h.e;
	                            String v8_1 = new float[1];
	                            v8_1[0] = 0;
	                            String v6_14 = android.animation.ObjectAnimator.ofFloat(v6_13, "translationY", v8_1);
	                            android.view.View v7_15 = this.h.e;
	                            float[] v9_1 = new float[1];
	                            v9_1[0] = 1065353216;
	                            android.view.View v7_16 = android.animation.ObjectAnimator.ofFloat(v7_15, "scaleX", v9_1);
	                            String v8_4 = this.h.e;
	                            float[] v10_0 = new float[1];
	                            v10_0[0] = 1065353216;
	                            v1_86.with(v5_14).with(v6_14).with(v7_16).with(android.animation.ObjectAnimator.ofFloat(v8_4, "scaleY", v10_0));
	                            android.animation.ObjectAnimator v5_19 = this.h.q;
	                            android.view.View v7_17 = new float[1];
	                            v7_17[0] = ((float) this.G);
	                            v1_86.with(android.animation.ObjectAnimator.ofFloat(v5_19, "translationX", v7_17));
	                            if (this.h.r != null) {
	                                android.animation.ObjectAnimator v5_24 = this.h.r;
	                                android.view.View v7_18 = new float[1];
	                                v7_18[0] = 0;
	                                v1_86.with(android.animation.ObjectAnimator.ofFloat(v5_24, "alpha", v7_18));
	                            }
	                            if (this.h.j != null) {
	                                android.animation.ObjectAnimator v5_29 = this.h.j;
	                                android.view.View v7_19 = new float[1];
	                                v7_19[0] = 1065353216;
	                                v1_86.with(android.animation.ObjectAnimator.ofFloat(v5_29, "alpha", v7_19));
	                            }
	                            android.animation.ObjectAnimator v5_32 = this.h.i;
	                            android.view.View v7_20 = new float[1];
	                            v7_20[0] = 0;
	                            v1_86.with(android.animation.ObjectAnimator.ofFloat(v5_32, "translationX", v7_20));
	                            android.animation.ObjectAnimator v5_35 = this.h.h;
	                            android.view.View v7_21 = new float[1];
	                            v7_21[0] = 0;
	                            android.animation.ObjectAnimator v5_36 = android.animation.ObjectAnimator.ofFloat(v5_35, "translationX", v7_21);
	                            String v6_21 = this.h.n;
	                            String v8_8 = new float[1];
	                            v8_8[0] = ((float) (- this.getWidth()));
	                            String v6_22 = android.animation.ObjectAnimator.ofFloat(v6_21, "translationX", v8_8);
	                            android.view.View v7_24 = this.h.h;
	                            float[] v9_6 = new float[1];
	                            v9_6[0] = 1065353216;
	                            android.view.View v7_25 = android.animation.ObjectAnimator.ofFloat(v7_24, "alpha", v9_6);
	                            String v8_11 = this.h.c;
	                            float[] v10_1 = new float[1];
	                            v10_1[0] = 0;
	                            String v8_12 = android.animation.ObjectAnimator.ofFloat(v8_11, "translationX", v10_1);
	                            v1_86.with(v5_36).with(v7_25);
	                            android.animation.ObjectAnimator v5_39 = this.h.n;
	                            float[] v9_8 = new float[1];
	                            v9_8[0] = 0;
	                            android.animation.ObjectAnimator v5_40 = android.animation.ObjectAnimator.ofFloat(v5_39, "alpha", v9_8);
	                            android.view.View v7_28 = this.h.c;
	                            float[] v2_1 = new float[1];
	                            v2_1[0] = 1065353216;
	                            v1_86.with(v6_22).with(v5_40).with(v8_12).with(android.animation.ObjectAnimator.ofFloat(v7_28, "alpha", v2_1));
	                            v0_119.setDuration(100);
	                            v0_119.addListener(new cqx(this));
	                            v0_119.setInterpolator(this.I);
	                            this.l = v0_119;
	                            this.l.start();
	                        } else {
	                            android.view.View v0_128;
	                            float v1_94 = new android.animation.AnimatorSet();
	                            android.animation.ObjectAnimator v5_42 = (this.z / this.y);
	                            String v6_25 = ((this.z - this.y) * 1056964608);
	                            if (this.f.size() <= 1) {
	                                v0_128 = this.h.h.getLeft();
	                            } else {
	                                v0_128 = this.h.i.getLeft();
	                            }
	                            android.view.View v7_35 = (((this.z - this.y) * 1056964608) + ((float) (v0_128 - this.h.e.getLeft())));
	                            android.view.View v0_134 = this.h.e;
	                            float[] v9_10 = new float[1];
	                            v9_10[0] = v7_35;
	                            android.view.View v0_135 = android.animation.ObjectAnimator.ofFloat(v0_134, "translationX", v9_10);
	                            String v8_16 = this.h.e;
	                            float[] v10_2 = new float[1];
	                            v10_2[0] = v6_25;
	                            String v6_26 = android.animation.ObjectAnimator.ofFloat(v8_16, "translationY", v10_2);
	                            String v8_18 = this.h.e;
	                            float[] v10_3 = new float[1];
	                            v10_3[0] = v5_42;
	                            String v8_19 = android.animation.ObjectAnimator.ofFloat(v8_18, "scaleY", v10_3);
	                            float[] v9_14 = this.h.e;
	                            float[] v11 = new float[1];
	                            v11[0] = v5_42;
	                            android.animation.ObjectAnimator v5_44 = v1_94.play(v0_135).with(v6_26).with(android.animation.ObjectAnimator.ofFloat(v9_14, "scaleX", v11)).with(v8_19);
	                            if ((this.i) && (this.f.size() > 0)) {
	                                if (this.f.size() > 1) {
	                                    String v6_31 = this.h.i;
	                                    float[] v9_15 = new float[1];
	                                    v9_15[0] = ((float) (this.h.h.getLeft() - this.h.i.getLeft()));
	                                    v5_44.with(android.animation.ObjectAnimator.ofFloat(v6_31, "translationX", v9_15));
	                                }
	                                android.view.View v0_153;
	                                if (!this.F) {
	                                    v0_153 = ((float) (this.getWidth() - this.h.h.getLeft()));
	                                } else {
	                                    v0_153 = (((float) this.getLeft()) - (((float) this.h.h.getWidth()) + this.A));
	                                }
	                                String v6_41 = this.h.h;
	                                float[] v9_16 = new float[1];
	                                v9_16[0] = v0_153;
	                                android.view.View v0_156 = android.animation.ObjectAnimator.ofFloat(v6_41, "translationX", v9_16);
	                                String v6_43 = this.h.h;
	                                float[] v9_17 = new float[1];
	                                v9_17[0] = 0;
	                                v5_44.with(v0_156).with(android.animation.ObjectAnimator.ofFloat(v6_43, "alpha", v9_17));
	                                if (this.h.q != null) {
	                                    android.view.View v0_161 = this.h.q;
	                                    float[] v2_3 = new float[1];
	                                    v2_3[0] = 0;
	                                    v5_44.with(android.animation.ObjectAnimator.ofFloat(v0_161, "translationX", v2_3));
	                                }
	                                if (this.h.n != null) {
	                                    this.a(((csq) this.f.get(0)), v5_44, 0, 0);
	                                }
	                            }
	                            v1_94.addListener(new cqz(this));
	                            float[] v2_4 = this.p;
	                            this.p = ((csq) this.f.remove(0));
	                            this.f.add(v2_4);
	                            v1_94.setDuration(((long) ((1065353216 - (this.h.e.getTranslationX() / v7_35)) * 1138819072)));
	                            v1_94.setInterpolator(this.I);
	                            this.l = v1_94;
	                            this.l.start();
	                        }
	                    }
	                    this.w = 0;
	                    if (v4_0 != null) {
	                        v4_0.requestDisallowInterceptTouchEvent(0);
	                    }
	                    this.u.clear();
	                } else {
	                    android.util.Log.e("SelectedAccountNavigationView", "Got ACTION_UP event but have an invalid active pointer id.");
	                }
	                break;
	            case 2:
	                android.view.View v0_4 = p15.findPointerIndex(this.x);
	                if (v0_4 >= null) {
	                    float v1_0 = p15.getX(v0_4);
	                    android.animation.ObjectAnimator v5_1 = (v1_0 - this.r);
	                    android.view.View v0_6 = (p15.getY(v0_4) - this.s);
	                    if ((this.i) && ((this.f.size() > 0) && ((!this.w) && ((((v5_1 * v5_1) + (v0_6 * v0_6)) > ((float) (this.t * this.t))) && (Math.abs(v5_1) > Math.abs(v0_6)))))) {
	                        this.w = 1;
	                        if (v4_0 != null) {
	                            v4_0.requestDisallowInterceptTouchEvent(1);
	                        }
	                    }
	                    if (!this.w) {
	                    } else {
	                        android.view.View v0_11 = (v1_0 - this.r);
	                        if (this.A == -1082130432) {
	                            this.A = ((float) this.h.h.getLeft());
	                            this.B = this.h.i.getLeft();
	                            this.D = (this.h.e.getLeft() + this.h.e.getPaddingLeft());
	                            this.E = this.h.e.getWidth();
	                        }
	                        android.view.View v0_12;
	                        if (!this.F) {
	                            v0_12 = Math.max(v0_11, 0);
	                        } else {
	                            v0_12 = Math.min(v0_11, 0);
	                        }
	                        float v1_23;
	                        android.widget.TextView v4_6 = (this.z / this.y);
	                        android.animation.ObjectAnimator v5_4 = ((this.z - this.y) * 1056964608);
	                        if (this.f.size() <= 1) {
	                            v1_23 = this.A;
	                        } else {
	                            v1_23 = ((float) this.B);
	                        }
	                        float v1_26 = ((v1_23 - ((float) this.D)) + ((this.z - this.y) * 1056964608));
	                        String v6_9 = Math.min(1065353216, (v0_12 / v1_26));
	                        android.view.View v0_14 = Math.abs(v5_4);
	                        android.animation.ObjectAnimator v5_6 = Math.max(0, (1065353216 - v6_9));
	                        this.h.e.setTranslationX((v1_26 * v6_9));
	                        this.h.e.setTranslationY((Math.abs((v0_14 * v6_9)) * -1082130432));
	                        android.view.View v0_21 = Math.min(1065353216, Math.max(v4_6, (1065353216 - (v6_9 * v4_6))));
	                        this.h.e.setScaleX(v0_21);
	                        this.h.e.setScaleY(v0_21);
	                        if (this.h.q != null) {
	                            if (this.h.q.getVisibility() == 0) {
	                                this.h.q.setTranslationX(((((float) (- this.G)) * v6_9) + ((float) this.G)));
	                            } else {
	                                android.view.View v0_35;
	                                if (!this.F) {
	                                    v0_35 = ((- this.E) - this.D);
	                                } else {
	                                    v0_35 = (this.getWidth() - this.D);
	                                }
	                                this.G = v0_35;
	                                this.h.q.setTranslationX(((float) this.G));
	                                this.h.u.setImageDrawable(this.h.l.getDrawable());
	                                this.h.q.setVisibility(0);
	                            }
	                        }
	                        if (this.f.size() > 1) {
	                            this.h.i.setTranslationX(((this.A - ((float) this.B)) * v6_9));
	                        }
	                        if (this.f.size() > 0) {
	                            if (this.h.r != null) {
	                                if (this.h.r.getVisibility() == 0) {
	                                    this.h.r.setAlpha(v6_9);
	                                } else {
	                                    this.h.r.setAlpha(0);
	                                    this.h.r.setVisibility(0);
	                                }
	                            }
	                            if (this.h.j != null) {
	                                this.h.j.setAlpha((1065353216 - v6_9));
	                            }
	                            android.view.View v0_68;
	                            if (!this.F) {
	                                v0_68 = (((float) this.getWidth()) - this.A);
	                            } else {
	                                v0_68 = (((float) this.getLeft()) - (((float) this.h.h.getWidth()) + this.A));
	                            }
	                            this.h.h.setTranslationX((v0_68 * v6_9));
	                            this.h.h.setAlpha(v5_6);
	                            if (this.h.n != null) {
	                                if (this.h.n.getVisibility() == 0) {
	                                    if (v6_9 > 1051372203) {
	                                        this.h.n.setAlpha(Math.min(1065353216, ((v6_9 - 1051372203) * 1077936128)));
	                                    }
	                                    this.h.n.setTranslationX((((float) this.C) + (((float) (- this.C)) * v6_9)));
	                                } else {
	                                    android.view.View v0_89 = ((csq) this.f.get(0));
	                                    this.C = this.G;
	                                    this.h.n.setTranslationX(((float) this.C));
	                                    com.google.android.gms.people.accountswitcherview.SelectedAccountNavigationView.a(this.h.o, this.h.p, v0_89);
	                                    this.h.n.setAlpha(0);
	                                    this.h.n.setVisibility(0);
	                                }
	                            }
	                            if (this.h.c != null) {
	                                this.h.c.setTranslationX(this.h.e.getTranslationX());
	                                this.h.c.setAlpha(Math.max(0, (1065353216 - (1077936128 * v6_9))));
	                            }
	                        }
	                        this.u.addMovement(p15);
	                    }
	                } else {
	                    android.util.Log.e("SelectedAccountNavigationView", "Got ACTION_MOVE event but have an invalid active pointer id.");
	                }
	                break;
	            case 3:
	                if (v4_0 == null) {
	                } else {
	                    v4_0.requestDisallowInterceptTouchEvent(0);
	                }
	                break;
	            case 5:
	                this.x = p15.getPointerId(p15.getActionIndex());
	                break;
	            case 6:
	                this.a(p15);
	                break;
	            default:
	        }
	        return v3_0;
	    }
	
