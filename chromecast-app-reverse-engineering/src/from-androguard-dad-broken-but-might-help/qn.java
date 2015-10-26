	static final  a
	public android.view.View b
	public yc c
	public qq d
	public  e
	public  f
	private final android.content.Context g
	private final android.view.LayoutInflater h
	private final qa i
	private final qo j
	private final  k
	private final  l
	private final  m
	private final  n
	private android.view.ViewTreeObserver o
	private android.view.ViewGroup p
	private  q
	private  r
	
	    static qn()
	    {
	        qn.a = a.bN;
	        return;
	    }
	
	
	    public qn(android.content.Context p7, qa p8, android.view.View p9)
	    {
	        this(p7, p8, p9, 0, a.L);
	        return;
	    }
	
	
	    public qn(android.content.Context p8, qa p9, android.view.View p10, boolean p11, int p12)
	    {
	        this(p8, p9, p10, p11, p12, 0);
	        return;
	    }
	
	
	    public qn(android.content.Context p4, qa p5, android.view.View p6, boolean p7, int p8, int p9)
	    {
	        this.f = 0;
	        this.g = p4;
	        this.h = android.view.LayoutInflater.from(p4);
	        this.i = p5;
	        this.j = new qo(this, this.i);
	        this.k = p7;
	        this.m = p8;
	        this.n = p9;
	        int v0_4 = p4.getResources();
	        this.l = Math.max((v0_4.getDisplayMetrics().widthPixels / 2), v0_4.getDimensionPixelSize(a.ab));
	        this.b = p6;
	        p5.a(this, p4);
	        return;
	    }
	
	
	    static synthetic boolean a(qn p1)
	    {
	        return p1.k;
	    }
	
	
	    static synthetic android.view.LayoutInflater b(qn p1)
	    {
	        return p1.h;
	    }
	
	
	    static synthetic qa c(qn p1)
	    {
	        return p1.i;
	    }
	
	
	    public final void a(android.content.Context p1, qa p2)
	    {
	        return;
	    }
	
	
	    public final void a(qa p2, boolean p3)
	    {
	        if (p2 == this.i) {
	            this.d();
	            if (this.d != null) {
	                this.d.a(p2, p3);
	            }
	        }
	        return;
	    }
	
	
	    public final boolean a()
	    {
	        return 0;
	    }
	
	
	    public final boolean a(qu p8)
	    {
	        int v1 = 1;
	        if (!p8.hasVisibleItems()) {
	            v1 = 0;
	        } else {
	            qn v3_1 = new qn(this.g, p8, this.b);
	            v3_1.d = this.d;
	            int v4_1 = p8.size();
	            qq v0_3 = 0;
	            while (v0_3 < v4_1) {
	                android.graphics.drawable.Drawable v5_0 = p8.getItem(v0_3);
	                if ((!v5_0.isVisible()) || (v5_0.getIcon() == null)) {
	                    v0_3++;
	                } else {
	                    qq v0_4 = 1;
	                }
	                v3_1.e = v0_4;
	                if (!v3_1.c()) {
	                } else {
	                    if (this.d != null) {
	                        this.d.a_(p8);
	                    }
	                }
	            }
	            v0_4 = 0;
	        }
	        return v1;
	    }
	
	
	    public final void b()
	    {
	        if (this.c()) {
	            return;
	        } else {
	            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
	        }
	    }
	
	
	    public final void b(boolean p2)
	    {
	        this.q = 0;
	        if (this.j != null) {
	            this.j.notifyDataSetChanged();
	        }
	        return;
	    }
	
	
	    public final boolean b(qe p2)
	    {
	        return 0;
	    }
	
	
	    public final boolean c()
	    {
	        int v1 = 1;
	        int v2_0 = 0;
	        this.c = new yc(this.g, 0, this.m, this.n);
	        this.c.a(this);
	        this.c.h = this;
	        this.c.a(this.j);
	        this.c.a(1);
	        int v3_2 = this.b;
	        if (v3_2 == 0) {
	            v1 = 0;
	        } else {
	            int v0_7;
	            if (this.o != null) {
	                v0_7 = 0;
	            } else {
	                v0_7 = 1;
	            }
	            this.o = v3_2.getViewTreeObserver();
	            if (v0_7 != 0) {
	                this.o.addOnGlobalLayoutListener(this);
	            }
	            this.c.g = v3_2;
	            this.c.d = this.f;
	            if (!this.q) {
	                qo v7 = this.j;
	                int v8 = android.view.View$MeasureSpec.makeMeasureSpec(0, 0);
	                int v9 = android.view.View$MeasureSpec.makeMeasureSpec(0, 0);
	                int v10 = v7.getCount();
	                int v6_1 = 0;
	                int v3_4 = 0;
	                android.view.View v5_2 = 0;
	                while (v6_1 < v10) {
	                    int v0_13;
	                    int v0_12 = v7.getItemViewType(v6_1);
	                    if (v0_12 == v3_4) {
	                        v0_13 = v5_2;
	                    } else {
	                        v3_4 = v0_12;
	                        v0_13 = 0;
	                    }
	                    if (this.p == null) {
	                        this.p = new android.widget.FrameLayout(this.g);
	                    }
	                    v5_2 = v7.getView(v6_1, v0_13, this.p);
	                    v5_2.measure(v8, v9);
	                    int v0_14 = v5_2.getMeasuredWidth();
	                    if (v0_14 < this.l) {
	                        if (v0_14 <= v2_0) {
	                            v0_14 = v2_0;
	                        }
	                        v6_1++;
	                        v2_0 = v0_14;
	                    } else {
	                        v2_0 = this.l;
	                        break;
	                    }
	                }
	                this.r = v2_0;
	                this.q = 1;
	            }
	            this.c.a(this.r);
	            this.c.b.setInputMethodMode(2);
	            this.c.c();
	            this.c.c.setOnKeyListener(this);
	        }
	        return v1;
	    }
	
	
	    public final boolean c(qe p2)
	    {
	        return 0;
	    }
	
	
	    public final void d()
	    {
	        if (this.e()) {
	            this.c.a();
	        }
	        return;
	    }
	
	
	    public final boolean e()
	    {
	        if ((this.c == null) || (!this.c.b.isShowing())) {
	            int v0_4 = 0;
	        } else {
	            v0_4 = 1;
	        }
	        return v0_4;
	    }
	
	
	    public void onDismiss()
	    {
	        this.c = 0;
	        this.i.close();
	        if (this.o != null) {
	            if (!this.o.isAlive()) {
	                this.o = this.b.getViewTreeObserver();
	            }
	            this.o.removeGlobalOnLayoutListener(this);
	            this.o = 0;
	        }
	        return;
	    }
	
	
	    public void onGlobalLayout()
	    {
	        if (this.e()) {
	            yc v0_1 = this.b;
	            if ((v0_1 != null) && (v0_1.isShown())) {
	                if (this.e()) {
	                    this.c.c();
	                }
	            } else {
	                this.d();
	            }
	        }
	        return;
	    }
	
	
	    public void onItemClick(android.widget.AdapterView p5, android.view.View p6, int p7, long p8)
	    {
	        qe v0_0 = this.j;
	        qo.a(v0_0).a(v0_0.a(p7), 0, 0);
	        return;
	    }
	
	
	    public boolean onKey(android.view.View p3, int p4, android.view.KeyEvent p5)
	    {
	        int v0 = 1;
	        if ((p5.getAction() != 1) || (p4 != 82)) {
	            v0 = 0;
	        } else {
	            this.d();
	        }
	        return v0;
	    }
	
