	private static I C
	private final java.lang.Runnable A
	private final java.lang.Runnable B
	private final gl D
	public  a
	public  b
	public  c
	public  d
	public rj e
	private  f
	private android.support.v7.internal.widget.ContentFrameLayout g
	private android.support.v7.internal.widget.ActionBarContainer h
	private android.support.v7.internal.widget.ActionBarContainer i
	private se j
	private android.graphics.drawable.Drawable k
	private  l
	private  m
	private  n
	private  o
	private final android.graphics.Rect p
	private final android.graphics.Rect q
	private final android.graphics.Rect r
	private final android.graphics.Rect s
	private final android.graphics.Rect t
	private final android.graphics.Rect u
	private lr v
	private ih w
	private ih x
	private final iu y
	private final iu z
	
	    static ActionBarOverlayLayout()
	    {
	        int[] v0_1 = new int[2];
	        v0_1[0] = a.h;
	        v0_1[1] = 16842841;
	        android.support.v7.internal.widget.ActionBarOverlayLayout.C = v0_1;
	        return;
	    }
	
	
	    public ActionBarOverlayLayout(android.content.Context p2)
	    {
	        this(p2, 0);
	        return;
	    }
	
	
	    public ActionBarOverlayLayout(android.content.Context p2, android.util.AttributeSet p3)
	    {
	        this(p2, p3);
	        this.a = 0;
	        this.p = new android.graphics.Rect();
	        this.q = new android.graphics.Rect();
	        this.r = new android.graphics.Rect();
	        this.s = new android.graphics.Rect();
	        this.t = new android.graphics.Rect();
	        this.u = new android.graphics.Rect();
	        this.y = new rf(this);
	        this.z = new rg(this);
	        this.A = new rh(this);
	        this.B = new ri(this);
	        this.a(p2);
	        this.D = new gl(this);
	        return;
	    }
	
	
	    public static synthetic ih a(android.support.v7.internal.widget.ActionBarOverlayLayout p0, ih p1)
	    {
	        p0.w = p1;
	        return p1;
	    }
	
	
	    public static void a()
	    {
	        return;
	    }
	
	
	    private void a(android.content.Context p5)
	    {
	        lr v0_5;
	        int v1 = 1;
	        int v3_1 = this.getContext().getTheme().obtainStyledAttributes(android.support.v7.internal.widget.ActionBarOverlayLayout.C);
	        this.f = v3_1.getDimensionPixelSize(0, 0);
	        this.k = v3_1.getDrawable(1);
	        if (this.k != null) {
	            v0_5 = 0;
	        } else {
	            v0_5 = 1;
	        }
	        this.setWillNotDraw(v0_5);
	        v3_1.recycle();
	        if (p5.getApplicationInfo().targetSdkVersion >= 19) {
	            v1 = 0;
	        }
	        this.l = v1;
	        this.v = lr.a(p5, 0);
	        return;
	    }
	
	
	    public static synthetic void a(android.support.v7.internal.widget.ActionBarOverlayLayout p0)
	    {
	        p0.j();
	        return;
	    }
	
	
	    public static synthetic boolean a(android.support.v7.internal.widget.ActionBarOverlayLayout p1, boolean p2)
	    {
	        p1.n = 0;
	        return 0;
	    }
	
	
	    private static boolean a(android.view.View p5, android.graphics.Rect p6, boolean p7, boolean p8, boolean p9, boolean p10)
	    {
	        int v2 = 1;
	        int v1_0 = 0;
	        rk v0_1 = ((rk) p5.getLayoutParams());
	        if (v0_1.leftMargin != p6.left) {
	            v0_1.leftMargin = p6.left;
	            v1_0 = 1;
	        }
	        if ((p8) && (v0_1.topMargin != p6.top)) {
	            v0_1.topMargin = p6.top;
	            v1_0 = 1;
	        }
	        if (v0_1.rightMargin != p6.right) {
	            v0_1.rightMargin = p6.right;
	            v1_0 = 1;
	        }
	        if ((!p9) || (v0_1.bottomMargin == p6.bottom)) {
	            v2 = v1_0;
	        } else {
	            v0_1.bottomMargin = p6.bottom;
	        }
	        return v2;
	    }
	
	
	    public static synthetic ih b(android.support.v7.internal.widget.ActionBarOverlayLayout p0, ih p1)
	    {
	        p0.x = p1;
	        return p1;
	    }
	
	
	    public static synthetic iu b(android.support.v7.internal.widget.ActionBarOverlayLayout p1)
	    {
	        return p1.y;
	    }
	
	
	    private void b(int p5)
	    {
	        this.j();
	        float v0_1 = this.i.getHeight();
	        android.support.v7.internal.widget.ActionBarContainer v1_1 = Math.max(0, Math.min(p5, v0_1));
	        gt.b(this.i, ((float) (- v1_1)));
	        if ((this.h != null) && (this.h.getVisibility() != 8)) {
	            gt.b(this.h, ((float) ((int) ((((float) v1_1) / ((float) v0_1)) * ((float) this.h.getHeight())))));
	        }
	        return;
	    }
	
	
	    public static synthetic android.support.v7.internal.widget.ActionBarContainer c(android.support.v7.internal.widget.ActionBarOverlayLayout p1)
	    {
	        return p1.i;
	    }
	
	
	    public static synthetic android.support.v7.internal.widget.ActionBarContainer d(android.support.v7.internal.widget.ActionBarOverlayLayout p1)
	    {
	        return p1.h;
	    }
	
	
	    public static synthetic iu e(android.support.v7.internal.widget.ActionBarOverlayLayout p1)
	    {
	        return p1.z;
	    }
	
	
	    private void i()
	    {
	        if (this.g == null) {
	            String v0_14;
	            this.g = ((android.support.v7.internal.widget.ContentFrameLayout) this.findViewById(a.aQ));
	            this.i = ((android.support.v7.internal.widget.ActionBarContainer) this.findViewById(a.aR));
	            String v0_8 = this.findViewById(a.aP);
	            if (!(v0_8 instanceof se)) {
	                if (!(v0_8 instanceof android.support.v7.widget.Toolbar)) {
	                    throw new IllegalStateException(new StringBuilder("Can\'t make a decor toolbar out of ").append(v0_8.getClass().getSimpleName()).toString());
	                } else {
	                    v0_14 = ((android.support.v7.widget.Toolbar) v0_8).h();
	                }
	            } else {
	                v0_14 = ((se) v0_8);
	            }
	            this.j = v0_14;
	            this.h = ((android.support.v7.internal.widget.ActionBarContainer) this.findViewById(a.bu));
	        }
	        return;
	    }
	
	
	    private void j()
	    {
	        this.removeCallbacks(this.A);
	        this.removeCallbacks(this.B);
	        if (this.w != null) {
	            this.w.a();
	        }
	        if (this.x != null) {
	            this.x.a();
	        }
	        return;
	    }
	
	
	    public final void a(int p4)
	    {
	        int v0 = 1;
	        this.i();
	        switch (p4) {
	            case 2:
	            case 5:
	            default:
	                break;
	            case 2:
	            case 5:
	                break;
	            case 9:
	                this.b = 1;
	                if (this.getContext().getApplicationInfo().targetSdkVersion >= 19) {
	                    v0 = 0;
	                }
	                this.l = v0;
	                break;
	        }
	        return;
	    }
	
	
	    public final void a(android.view.Menu p2, qq p3)
	    {
	        this.i();
	        this.j.a(p2, p3);
	        return;
	    }
	
	
	    public final void a(android.view.Window$Callback p2)
	    {
	        this.i();
	        this.j.a(p2);
	        return;
	    }
	
	
	    public final void a(CharSequence p2)
	    {
	        this.i();
	        this.j.a(p2);
	        return;
	    }
	
	
	    public final void a(boolean p2)
	    {
	        if (p2 != this.m) {
	            this.m = p2;
	            if (!p2) {
	                this.j();
	                this.b(0);
	            }
	        }
	        return;
	    }
	
	
	    public final boolean b()
	    {
	        this.i();
	        return this.j.f();
	    }
	
	
	    public final boolean c()
	    {
	        this.i();
	        return this.j.g();
	    }
	
	
	    protected boolean checkLayoutParams(android.view.ViewGroup$LayoutParams p2)
	    {
	        return (p2 instanceof rk);
	    }
	
	
	    public final boolean d()
	    {
	        this.i();
	        return this.j.h();
	    }
	
	
	    public void draw(android.graphics.Canvas p6)
	    {
	        super.draw(p6);
	        if ((this.k != null) && (!this.l)) {
	            android.graphics.drawable.Drawable v0_4;
	            if (this.i.getVisibility() != 0) {
	                v0_4 = 0;
	            } else {
	                v0_4 = ((int) ((((float) this.i.getBottom()) + gt.l(this.i)) + 1056964608));
	            }
	            this.k.setBounds(0, v0_4, this.getWidth(), (this.k.getIntrinsicHeight() + v0_4));
	            this.k.draw(p6);
	        }
	        return;
	    }
	
	
	    public final boolean e()
	    {
	        this.i();
	        return this.j.i();
	    }
	
	
	    public final boolean f()
	    {
	        this.i();
	        return this.j.j();
	    }
	
	
	    protected boolean fitSystemWindows(android.graphics.Rect p12)
	    {
	        this.i();
	        gt.p(this);
	        int v0_1 = android.support.v7.internal.widget.ActionBarOverlayLayout.a(this.i, p12, 1, 1, 0, 1);
	        if (this.h != null) {
	            v0_1 |= android.support.v7.internal.widget.ActionBarOverlayLayout.a(this.h, p12, 1, 0, 1, 1);
	        }
	        this.s.set(p12);
	        tm.a(this, this.s, this.p);
	        if (!this.q.equals(this.p)) {
	            this.q.set(this.p);
	            v0_1 = 1;
	        }
	        if (v0_1 != 0) {
	            this.requestLayout();
	        }
	        return 1;
	    }
	
	
	    public final void g()
	    {
	        this.i();
	        this.j.k();
	        return;
	    }
	
	
	    protected synthetic android.view.ViewGroup$LayoutParams generateDefaultLayoutParams()
	    {
	        return new rk(-1, -1);
	    }
	
	
	    public synthetic android.view.ViewGroup$LayoutParams generateLayoutParams(android.util.AttributeSet p3)
	    {
	        return new rk(this.getContext(), p3);
	    }
	
	
	    protected android.view.ViewGroup$LayoutParams generateLayoutParams(android.view.ViewGroup$LayoutParams p2)
	    {
	        return new rk(p2);
	    }
	
	
	    public int getNestedScrollAxes()
	    {
	        return this.D.a;
	    }
	
	
	    public final void h()
	    {
	        this.i();
	        this.j.l();
	        return;
	    }
	
	
	    protected void onConfigurationChanged(android.content.res.Configuration p3)
	    {
	        if (android.os.Build$VERSION.SDK_INT >= 8) {
	            super.onConfigurationChanged(p3);
	        }
	        this.a(this.getContext());
	        gt.q(this);
	        return;
	    }
	
	
	    protected void onDetachedFromWindow()
	    {
	        super.onDetachedFromWindow();
	        this.j();
	        return;
	    }
	
	
	    protected void onLayout(boolean p12, int p13, int p14, int p15, int p16)
	    {
	        int v2 = this.getChildCount();
	        int v3 = this.getPaddingLeft();
	        this.getPaddingRight();
	        int v4 = this.getPaddingTop();
	        int v5 = ((p16 - p14) - this.getPaddingBottom());
	        int v1_1 = 0;
	        while (v1_1 < v2) {
	            android.view.View v6 = this.getChildAt(v1_1);
	            if (v6.getVisibility() != 8) {
	                int v0_6;
	                int v0_4 = ((rk) v6.getLayoutParams());
	                int v7_1 = v6.getMeasuredWidth();
	                int v8_0 = v6.getMeasuredHeight();
	                int v9_1 = (v0_4.leftMargin + v3);
	                if (v6 != this.h) {
	                    v0_6 = (v0_4.topMargin + v4);
	                } else {
	                    v0_6 = ((v5 - v8_0) - v0_4.bottomMargin);
	                }
	                v6.layout(v9_1, v0_6, (v7_1 + v9_1), (v8_0 + v0_6));
	            }
	            v1_1++;
	        }
	        return;
	    }
	
	
	    protected void onMeasure(int p14, int p15)
	    {
	        int v11;
	        int v12;
	        int v10;
	        this.i();
	        this.measureChildWithMargins(this.i, p14, 0, p15, 0);
	        int v0_3 = ((rk) this.i.getLayoutParams());
	        int v8_0 = Math.max(0, ((this.i.getMeasuredWidth() + v0_3.leftMargin) + v0_3.rightMargin));
	        int v9_0 = Math.max(0, (v0_3.bottomMargin + (this.i.getMeasuredHeight() + v0_3.topMargin)));
	        int v7_0 = tm.a(0, gt.j(this.i));
	        if (this.h == null) {
	            v10 = v7_0;
	            v11 = v8_0;
	            v12 = v9_0;
	        } else {
	            this.measureChildWithMargins(this.h, p14, 0, p15, 0);
	            int v0_12 = ((rk) this.h.getLayoutParams());
	            v10 = tm.a(v7_0, gt.j(this.h));
	            v11 = Math.max(v8_0, ((this.h.getMeasuredWidth() + v0_12.leftMargin) + v0_12.rightMargin));
	            v12 = Math.max(v9_0, (v0_12.bottomMargin + (this.h.getMeasuredHeight() + v0_12.topMargin)));
	        }
	        int v1_14;
	        if ((gt.p(this) & 256) == 0) {
	            v1_14 = 0;
	        } else {
	            v1_14 = 1;
	        }
	        int v0_22;
	        if (v1_14 == 0) {
	            if (this.i.getVisibility() == 8) {
	                v0_22 = 0;
	            } else {
	                v0_22 = this.i.getMeasuredHeight();
	            }
	        } else {
	            v0_22 = this.f;
	            if ((this.c) && (this.i.a != null)) {
	                v0_22 += this.f;
	            }
	        }
	        this.r.set(this.p);
	        this.t.set(this.s);
	        if ((this.b) || (v1_14 != 0)) {
	            int v1_15 = this.t;
	            v1_15.top = (v0_22 + v1_15.top);
	            int v0_25 = this.t;
	            v0_25.bottom = v0_25.bottom;
	        } else {
	            int v1_17 = this.r;
	            v1_17.top = (v0_22 + v1_17.top);
	            int v0_27 = this.r;
	            v0_27.bottom = v0_27.bottom;
	        }
	        android.support.v7.internal.widget.ActionBarOverlayLayout.a(this.g, this.r, 1, 1, 1, 1);
	        if (!this.u.equals(this.t)) {
	            this.u.set(this.t);
	            this.g.a(this.t);
	        }
	        this.measureChildWithMargins(this.g, p14, 0, p15, 0);
	        int v0_35 = ((rk) this.g.getLayoutParams());
	        int v1_27 = Math.max(v11, ((this.g.getMeasuredWidth() + v0_35.leftMargin) + v0_35.rightMargin));
	        int v0_38 = Math.max(v12, (v0_35.bottomMargin + (this.g.getMeasuredHeight() + v0_35.topMargin)));
	        int v2_29 = tm.a(v10, gt.j(this.g));
	        this.setMeasuredDimension(gt.a(Math.max((v1_27 + (this.getPaddingLeft() + this.getPaddingRight())), this.getSuggestedMinimumWidth()), p14, v2_29), gt.a(Math.max((v0_38 + (this.getPaddingTop() + this.getPaddingBottom())), this.getSuggestedMinimumHeight()), p15, (v2_29 << 16)));
	        return;
	    }
	
	
	    public boolean onNestedFling(android.view.View p11, float p12, float p13, boolean p14)
	    {
	        int v1 = 0;
	        if ((this.m) && (p14)) {
	            this.v.a(0, 0, 0, ((int) p13), 0, 0, -2147483648, 2147483647);
	            if (this.v.d() > this.i.getHeight()) {
	                v1 = 1;
	            }
	            if (v1 == 0) {
	                this.j();
	                this.A.run();
	            } else {
	                this.j();
	                this.B.run();
	            }
	            this.n = 1;
	            v1 = 1;
	        }
	        return v1;
	    }
	
	
	    public boolean onNestedPreFling(android.view.View p2, float p3, float p4)
	    {
	        return 0;
	    }
	
	
	    public void onNestedPreScroll(android.view.View p1, int p2, int p3, int[] p4)
	    {
	        return;
	    }
	
	
	    public void onNestedScroll(android.view.View p2, int p3, int p4, int p5, int p6)
	    {
	        this.o = (this.o + p4);
	        this.b(this.o);
	        return;
	    }
	
	
	    public void onNestedScrollAccepted(android.view.View p2, android.view.View p3, int p4)
	    {
	        rj v0_2;
	        this.D.a = p4;
	        if (this.i == null) {
	            v0_2 = 0;
	        } else {
	            v0_2 = (- ((int) gt.l(this.i)));
	        }
	        this.o = v0_2;
	        this.j();
	        if (this.e != null) {
	            this.e.j();
	        }
	        return;
	    }
	
	
	    public boolean onStartNestedScroll(android.view.View p2, android.view.View p3, int p4)
	    {
	        if (((p4 & 2) != 0) && (this.i.getVisibility() == 0)) {
	            boolean v0_3 = this.m;
	        } else {
	            v0_3 = 0;
	        }
	        return v0_3;
	    }
	
	
	    public void onStopNestedScroll(android.view.View p5)
	    {
	        if ((this.m) && (!this.n)) {
	            if (this.o > this.i.getHeight()) {
	                this.j();
	                this.postDelayed(this.B, 600);
	            } else {
	                this.j();
	                this.postDelayed(this.A, 600);
	            }
	        }
	        return;
	    }
	
	
	    public void onWindowSystemUiVisibilityChanged(int p7)
	    {
	        int v1 = 1;
	        if (android.os.Build$VERSION.SDK_INT >= 16) {
	            super.onWindowSystemUiVisibilityChanged(p7);
	        }
	        int v3_1;
	        this.i();
	        int v4 = (this.d ^ p7);
	        this.d = p7;
	        if ((p7 & 4) != 0) {
	            v3_1 = 0;
	        } else {
	            v3_1 = 1;
	        }
	        rj v0_4;
	        if ((p7 & 256) == 0) {
	            v0_4 = 0;
	        } else {
	            v0_4 = 1;
	        }
	        if (this.e != null) {
	            if (v0_4 != null) {
	                v1 = 0;
	            }
	            this.e.f(v1);
	            if ((v3_1 == 0) && (v0_4 != null)) {
	                this.e.i();
	            } else {
	                this.e.h();
	            }
	        }
	        if (((v4 & 256) != 0) && (this.e != null)) {
	            gt.q(this);
	        }
	        return;
	    }
	
	
	    protected void onWindowVisibilityChanged(int p2)
	    {
	        super.onWindowVisibilityChanged(p2);
	        this.a = p2;
	        if (this.e != null) {
	            this.e.c(p2);
	        }
	        return;
	    }
	
	
	    public boolean shouldDelayChildPressedState()
	    {
	        return 0;
	    }
	
