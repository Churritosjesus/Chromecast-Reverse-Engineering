	public cqf a
	public cqh b
	public cqg c
	public csq d
	public java.util.List e
	public android.widget.ListView f
	public android.widget.FrameLayout g
	public com.google.android.gms.people.accountswitcherview.SelectedAccountNavigationView h
	public cqs i
	public com.google.android.gms.common.api.GoogleApiClient j
	public cqj k
	public  l
	public android.view.View m
	public  n
	public  o
	public cqw p
	public android.view.View q
	private com.google.android.gms.people.accountswitcherview.ShrinkingItem r
	private android.view.ViewGroup s
	private com.google.android.gms.people.accountswitcherview.ExpanderView t
	private  u
	private  v
	private  w
	private  x
	
	    public AccountSwitcherView(android.content.Context p2)
	    {
	        this(p2, 0);
	        return;
	    }
	
	
	    public AccountSwitcherView(android.content.Context p5, android.util.AttributeSet p6)
	    {
	        android.widget.FrameLayout v0_18;
	        this(p5, p6);
	        this.n = 1;
	        this.o = 1;
	        this.x = 0;
	        new android.util.TypedValue();
	        android.widget.FrameLayout v0_1 = new int[1];
	        v0_1[0] = a.hJ;
	        android.widget.FrameLayout v0_2 = p5.obtainStyledAttributes(p6, v0_1);
	        this.w = v0_2.getBoolean(0, com.google.android.gms.people.accountswitcherview.AccountSwitcherView.b(21));
	        v0_2.recycle();
	        android.view.LayoutInflater.from(p5).inflate(a.iq, this);
	        this.s = ((android.view.ViewGroup) this.findViewById(a.im));
	        this.s.setOnClickListener(this);
	        this.t = ((com.google.android.gms.people.accountswitcherview.ExpanderView) this.findViewById(a.hT));
	        this.t.setOnClickListener(this);
	        this.h = ((com.google.android.gms.people.accountswitcherview.SelectedAccountNavigationView) this.findViewById(a.il));
	        com.google.android.gms.people.accountswitcherview.SelectedAccountNavigationView v3_5 = this.h;
	        if ((!this.w) || (!com.google.android.gms.people.accountswitcherview.AccountSwitcherView.b(11))) {
	            v0_18 = 0;
	        } else {
	            v0_18 = 1;
	        }
	        v3_5.j = v0_18;
	        v3_5.i = v3_5.j;
	        this.h.a = this;
	        this.h.g = this;
	        this.f = ((android.widget.ListView) this.findViewById(a.hW));
	        this.f.setOnItemClickListener(this);
	        this.r = ((com.google.android.gms.people.accountswitcherview.ShrinkingItem) this.findViewById(a.hX));
	        this.l = -1;
	        this.g = ((android.widget.FrameLayout) this.findViewById(a.ie));
	        this.a(0);
	        return;
	    }
	
	
	    private void a(android.view.View p2, int p3)
	    {
	        p2.offsetTopAndBottom(p3);
	        this.u = p2.getTop();
	        return;
	    }
	
	
	    public static synthetic void a(com.google.android.gms.people.accountswitcherview.AccountSwitcherView p4, int p5)
	    {
	        p4.s.setPadding(p4.s.getPaddingLeft(), p5, p4.s.getPaddingRight(), p4.s.getPaddingBottom());
	        p4.p.a = p5;
	        com.google.android.gms.people.accountswitcherview.SelectedAccountNavigationView v1_2 = p4.h;
	        if (v1_2.h == null) {
	            v1_2.a();
	        }
	        android.view.View v2_2 = (v1_2.k + p5);
	        v1_2.setMinimumHeight(v2_2);
	        android.view.View v0_6 = v1_2.h.x.getLayoutParams();
	        if (v0_6 != null) {
	            v0_6.height = v2_2;
	        } else {
	            v0_6 = new android.view.ViewGroup$LayoutParams(-1, v2_2);
	        }
	        v1_2.h.x.setLayoutParams(v0_6);
	        v1_2.a(v1_2.h.e, p5);
	        v1_2.a(v1_2.h.q, p5);
	        v1_2.a(v1_2.h.h, p5);
	        v1_2.a(v1_2.h.i, p5);
	        v1_2.a(v1_2.h.s, p5);
	        v1_2.a(v1_2.h.t, p5);
	        return;
	    }
	
	
	    private void a(boolean p8)
	    {
	        switch (this.h.b) {
	            case 0:
	                if (!p8) {
	                    this.g.setAnimation(0);
	                } else {
	                    com.google.android.gms.people.accountswitcherview.ShrinkingItem v0_10 = new android.view.animation.AlphaAnimation(0, 1065353216);
	                    v0_10.setDuration(200);
	                    this.g.setAnimation(v0_10);
	                    this.a(0, new android.view.animation.AccelerateInterpolator(1061997773));
	                }
	                this.g.setVisibility(0);
	                this.r.setVisibility(8);
	                break;
	            case 1:
	                if (!p8) {
	                    this.g.setAnimation(0);
	                } else {
	                    com.google.android.gms.people.accountswitcherview.ShrinkingItem v0_4 = new android.view.animation.AlphaAnimation(1065353216, 0);
	                    v0_4.setDuration(200);
	                    v0_4.setStartOffset(133);
	                    this.a(1, new android.view.animation.DecelerateInterpolator(1061997773));
	                }
	                this.g.setVisibility(8);
	                this.r.setVisibility(0);
	                break;
	        }
	        return;
	    }
	
	
	    private void a(boolean p8, android.view.animation.Interpolator p9)
	    {
	        float v3_0;
	        float v0_0;
	        if (!p8) {
	            v0_0 = 0;
	            v3_0 = 1;
	        } else {
	            v0_0 = 1;
	            v3_0 = 0;
	        }
	        if (!com.google.android.gms.people.accountswitcherview.AccountSwitcherView.b(11)) {
	            com.google.android.gms.people.accountswitcherview.ShrinkingItem v1_1 = this.r;
	            v1_1.a = ((float) v0_0);
	            v1_1.requestLayout();
	        } else {
	            com.google.android.gms.people.accountswitcherview.ShrinkingItem v4_2 = this.r;
	            float[] v6_1 = new float[2];
	            v6_1[0] = ((float) v3_0);
	            v6_1[1] = ((float) v0_0);
	            float v0_3 = android.animation.ObjectAnimator.ofFloat(v4_2, "animatedHeightFraction", v6_1);
	            v0_3.setDuration(200);
	            v0_3.setInterpolator(p9);
	            v0_3.start();
	        }
	        return;
	    }
	
	
	    public static boolean b(int p1)
	    {
	        int v0_1;
	        if (android.os.Build$VERSION.SDK_INT < p1) {
	            v0_1 = 0;
	        } else {
	            v0_1 = 1;
	        }
	        return v0_1;
	    }
	
	
	    private void c(int p2)
	    {
	        this.g.offsetTopAndBottom(p2);
	        this.v = this.g.getTop();
	        return;
	    }
	
	
	    public static boolean c()
	    {
	        return com.google.android.gms.people.accountswitcherview.AccountSwitcherView.b(21);
	    }
	
	
	    private void d(int p2)
	    {
	        this.h.a(p2);
	        return;
	    }
	
	
	    public final void a()
	    {
	        this.a(1);
	        return;
	    }
	
	
	    public final void a(int p5)
	    {
	        int v0 = 1;
	        this.d(0);
	        this.a(0);
	        if (this.h.b != 1) {
	            v0 = 0;
	        }
	        this.t.a(v0);
	        return;
	    }
	
	
	    public final void a(csq p3)
	    {
	        this.a(p3, 1);
	        if (this.a != null) {
	            this.a.a(this.d);
	        }
	        return;
	    }
	
	
	    public void a(csq p4, boolean p5)
	    {
	        cqs v0_0 = this.d;
	        this.d = p4;
	        if (this.e == null) {
	            this.h.a(0);
	        } else {
	            this.e = cqs.a(this.e, v0_0, this.d);
	            if (!p5) {
	                this.h.a(this.d);
	            }
	            this.i.a(this.e);
	        }
	        return;
	    }
	
	
	    public final void b()
	    {
	        if (this.i != null) {
	            cqe v0_1 = this.i;
	            if (v0_1.e != null) {
	                v0_1.e.a();
	            }
	        }
	        return;
	    }
	
	
	    public int getNestedScrollAxes()
	    {
	        return 2;
	    }
	
	
	    public void onClick(android.view.View p5)
	    {
	        int v1 = 0;
	        if ((p5 != this.s) && (p5 == this.t)) {
	            com.google.android.gms.people.accountswitcherview.ExpanderView v0_4;
	            if (this.h.b != 1) {
	                v0_4 = 1;
	            } else {
	                v0_4 = 0;
	            }
	            this.d(v0_4);
	            if (this.h.b == 1) {
	                v1 = 1;
	            }
	            this.t.a(v1);
	            this.a(1);
	        }
	        return;
	    }
	
	
	    protected void onDetachedFromWindow()
	    {
	        super.onDetachedFromWindow();
	        if (this.q != null) {
	            this.q.setOnApplyWindowInsetsListener(0);
	            this.q = 0;
	        }
	        return;
	    }
	
	
	    public void onItemClick(android.widget.AdapterView p3, android.view.View p4, int p5, long p6)
	    {
	        if (this.i.getItemViewType(p5) != 0) {
	            if (this.i.getItemViewType(p5) != 1) {
	                if ((this.i.getItemViewType(p5) == 2) && (this.b != null)) {
	                    this.b.a();
	                }
	            } else {
	                if (this.c != null) {
	                    this.c.a();
	                }
	            }
	        } else {
	            this.a(this.i.a(p5), 0);
	            if (this.a != null) {
	                this.a.a(this.d);
	            }
	        }
	        return;
	    }
	
	
	    protected void onLayout(boolean p4, int p5, int p6, int p7, int p8)
	    {
	        this = super.onLayout(p4, p5, p6, p7, p8);
	        android.widget.FrameLayout v0_0 = this.h;
	        if (this.u != v0_0.getTop()) {
	            v0_0.offsetTopAndBottom((this.u - v0_0.getTop()));
	        }
	        if (this.v != this.g.getTop()) {
	            this.g.offsetTopAndBottom((this.v - this.g.getTop()));
	        }
	        return;
	    }
	
	
	    public void onMeasure(int p6, int p7)
	    {
	        super.onMeasure(p6, p7);
	        int v0_0 = 0;
	        while (v0_0 < this.getChildCount()) {
	            if (!this.getChildAt(v0_0).equals(this.g)) {
	                v0_0++;
	            } else {
	                this.g.setPadding(this.g.getPaddingLeft(), this.h.getMeasuredHeight(), this.g.getPaddingRight(), this.g.getPaddingBottom());
	                this.g.measure(p6, android.view.View$MeasureSpec.makeMeasureSpec(this.getHeight(), 1073741824));
	                break;
	            }
	        }
	        return;
	    }
	
	
	    public boolean onNestedFling(android.view.View p4, float p5, float p6, boolean p7)
	    {
	        int v0_4;
	        int v0_0 = this.h;
	        if ((p7) || ((p6 >= 0) || (v0_0.getBottom() >= 0))) {
	            if ((p7) && (p6 > 0)) {
	                if (v0_0.getTop() > (- v0_0.getMeasuredHeight())) {
	                    this.a(v0_0, ((- v0_0.getMeasuredHeight()) - v0_0.getTop()));
	                }
	                if (this.g.getTop() > (- v0_0.getMeasuredHeight())) {
	                    this.c(((- v0_0.getMeasuredHeight()) - this.g.getTop()));
	                }
	            }
	            v0_4 = 0;
	        } else {
	            this.a(v0_0, (- v0_0.getTop()));
	            this.c((- v0_0.getTop()));
	            v0_4 = 1;
	        }
	        return v0_4;
	    }
	
	
	    public void onNestedPreScroll(android.view.View p7, int p8, int p9, int[] p10)
	    {
	        int v2_0 = this.h;
	        if (this.h.b != 1) {
	            if ((p9 <= 0) || (v2_0.getBottom() <= 0)) {
	                int v0_3 = 0;
	            } else {
	                if (v2_0.getBottom() <= p9) {
	                    v0_3 = (- v2_0.getBottom());
	                } else {
	                    v0_3 = (- p9);
	                }
	            }
	            if (v0_3 != 0) {
	                if ((v2_0.getTop() + v0_3) >= (- v2_0.getMeasuredHeight())) {
	                    this.a(v2_0, v0_3);
	                } else {
	                    this.a(v2_0, ((- v2_0.getMeasuredHeight()) - v2_0.getTop()));
	                }
	                if ((this.g.getTop() + v0_3) >= (- v2_0.getMeasuredHeight())) {
	                    this.c(v0_3);
	                } else {
	                    this.c(((- v2_0.getMeasuredHeight()) - this.g.getTop()));
	                }
	                p10[0] = 0;
	                p10[1] = v0_3;
	            }
	        }
	        return;
	    }
	
	
	    public void onNestedScroll(android.view.View p4, int p5, int p6, int p7, int p8)
	    {
	        int v1_0 = this.h;
	        if ((p8 >= 0) || (v1_0.getTop() >= 0)) {
	            p8 = 0;
	        } else {
	            if (p8 <= v1_0.getTop()) {
	                p8 = v1_0.getTop();
	            }
	        }
	        if (p8 != 0) {
	            if ((v1_0.getTop() - p8) <= 0) {
	                this.a(v1_0, (- p8));
	            } else {
	                this.a(v1_0, (- v1_0.getTop()));
	            }
	            if ((this.g.getTop() - p8) <= v1_0.getMeasuredHeight()) {
	                this.c((- p8));
	            } else {
	                this.c((v1_0.getMeasuredHeight() - this.g.getTop()));
	            }
	        }
	        return;
	    }
	
	
	    public boolean onStartNestedScroll(android.view.View p2, android.view.View p3, int p4)
	    {
	        return 0;
	    }
	
	
	    public void setPadding(int p1, int p2, int p3, int p4)
	    {
	        super.setPadding(p1, p2, p3, p4);
	        return;
	    }
	
	
	    public void setPaddingRelative(int p1, int p2, int p3, int p4)
	    {
	        super.setPaddingRelative(p1, p2, p3, p4);
	        return;
	    }
	
