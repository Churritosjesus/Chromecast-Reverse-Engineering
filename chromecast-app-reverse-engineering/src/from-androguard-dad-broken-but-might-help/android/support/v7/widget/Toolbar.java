	private  A
	private  B
	private  C
	private  D
	private  E
	private final java.util.ArrayList F
	private final I G
	private final wg H
	private ti I
	private final java.lang.Runnable J
	public android.support.v7.widget.ActionMenuView a
	public android.widget.TextView b
	public android.widget.TextView c
	public android.widget.ImageView d
	public android.view.View e
	public android.content.Context f
	public  g
	public  h
	public  i
	public final sl j
	public java.lang.CharSequence k
	public java.lang.CharSequence l
	public wg m
	public vu n
	public aar o
	public qq p
	public qb q
	public  r
	private android.widget.ImageButton s
	private android.graphics.drawable.Drawable t
	private java.lang.CharSequence u
	private android.widget.ImageButton v
	private  w
	private  x
	private  y
	private  z
	
	    public Toolbar(android.content.Context p2)
	    {
	        this(p2, 0);
	        return;
	    }
	
	
	    public Toolbar(android.content.Context p2, android.util.AttributeSet p3)
	    {
	        this(p2, p3, a.T);
	        return;
	    }
	
	
	    public Toolbar(android.content.Context p9, android.util.AttributeSet p10, int p11)
	    {
	        this(p9, p10, p11);
	        this.j = new sl();
	        this.C = 8388627;
	        this.F = new java.util.ArrayList();
	        th v0_6 = new int[2];
	        this.G = v0_6;
	        this.H = new aao(this);
	        this.J = new aap(this);
	        th v0_12 = th.a(this.getContext(), p10, oq.cb, p11, 0);
	        this.h = v0_12.e(oq.cv, 0);
	        this.i = v0_12.e(oq.co, 0);
	        this.C = v0_12.a.getInteger(oq.cc, this.C);
	        this.w = 48;
	        android.content.res.TypedArray v1_9 = v0_12.b(oq.cu, 0);
	        this.B = v1_9;
	        this.A = v1_9;
	        this.z = v1_9;
	        this.y = v1_9;
	        android.content.res.TypedArray v1_11 = v0_12.b(oq.cs, -1);
	        if (v1_11 >= null) {
	            this.y = v1_11;
	        }
	        android.content.res.TypedArray v1_13 = v0_12.b(oq.cr, -1);
	        if (v1_13 >= null) {
	            this.z = v1_13;
	        }
	        android.content.res.TypedArray v1_15 = v0_12.b(oq.ct, -1);
	        if (v1_15 >= null) {
	            this.A = v1_15;
	        }
	        android.content.res.TypedArray v1_17 = v0_12.b(oq.cq, -1);
	        if (v1_17 >= null) {
	            this.B = v1_17;
	        }
	        this.x = v0_12.c(oq.cj, -1);
	        android.content.res.TypedArray v1_21 = v0_12.b(oq.ci, -2147483648);
	        boolean v2_2 = v0_12.b(oq.cf, -2147483648);
	        sl v3_2 = v0_12.c(oq.cg, 0);
	        int v4_2 = v0_12.c(oq.ch, 0);
	        sl v5 = this.j;
	        v5.h = 0;
	        if (v3_2 != -2147483648) {
	            v5.e = v3_2;
	            v5.a = v3_2;
	        }
	        if (v4_2 != -2147483648) {
	            v5.f = v4_2;
	            v5.b = v4_2;
	        }
	        if ((v1_21 != -2147483648) || (v2_2 != -2147483648)) {
	            this.j.a(v1_21, v2_2);
	        }
	        this.t = v0_12.a(oq.ce);
	        this.u = v0_12.c(oq.cd);
	        android.content.res.TypedArray v1_27 = v0_12.c(oq.cp);
	        if (!android.text.TextUtils.isEmpty(v1_27)) {
	            this.a(v1_27);
	        }
	        android.content.res.TypedArray v1_29 = v0_12.c(oq.cn);
	        if (!android.text.TextUtils.isEmpty(v1_29)) {
	            this.b(v1_29);
	        }
	        this.f = this.getContext();
	        this.a(v0_12.e(oq.cm, 0));
	        android.content.res.TypedArray v1_34 = v0_12.a(oq.cl);
	        if (v1_34 != null) {
	            this.a(v1_34);
	        }
	        android.content.res.TypedArray v1_36 = v0_12.c(oq.ck);
	        if (!android.text.TextUtils.isEmpty(v1_36)) {
	            this.c(v1_36);
	        }
	        v0_12.a.recycle();
	        v0_12.a();
	        return;
	    }
	
	
	    private int a(android.view.View p9, int p10)
	    {
	        int v1_0;
	        int v0_1 = ((aas) p9.getLayoutParams());
	        int v4_0 = p9.getMeasuredHeight();
	        if (p10 <= 0) {
	            v1_0 = 0;
	        } else {
	            v1_0 = ((v4_0 - p10) / 2);
	        }
	        int v3_1 = (v0_1.a & 112);
	        switch (v3_1) {
	            case 16:
	            case 48:
	            case 80:
	                break;
	            case 16:
	            case 48:
	            case 80:
	                break;
	            case 16:
	            case 48:
	            case 80:
	                break;
	            default:
	                v3_1 = (this.C & 112);
	        }
	        int v0_4;
	        switch (v3_1) {
	            case 48:
	                v0_4 = (this.getPaddingTop() - v1_0);
	                break;
	            case 80:
	                v0_4 = ((((this.getHeight() - this.getPaddingBottom()) - v4_0) - v0_1.bottomMargin) - v1_0);
	                break;
	            default:
	                int v0_6;
	                int v3_4 = this.getPaddingTop();
	                int v5_0 = this.getPaddingBottom();
	                int v6 = this.getHeight();
	                int v1_5 = ((((v6 - v3_4) - v5_0) - v4_0) / 2);
	                if (v1_5 >= v0_1.topMargin) {
	                    int v4_3 = ((((v6 - v5_0) - v4_0) - v1_5) - v3_4);
	                    if (v4_3 >= v0_1.bottomMargin) {
	                        v0_6 = v1_5;
	                    } else {
	                        v0_6 = Math.max(0, (v1_5 - (v0_1.bottomMargin - v4_3)));
	                    }
	                } else {
	                    v0_6 = v0_1.topMargin;
	                }
	                v0_4 = (v0_6 + v3_4);
	        }
	        return v0_4;
	    }
	
	
	    private int a(android.view.View p8, int p9, int p10, int p11, int p12, int[] p13)
	    {
	        int v0_1 = ((android.view.ViewGroup$MarginLayoutParams) p8.getLayoutParams());
	        int v1_1 = (v0_1.leftMargin - p13[0]);
	        int v2_2 = (v0_1.rightMargin - p13[1]);
	        int v3_2 = (Math.max(0, v1_1) + Math.max(0, v2_2));
	        p13[0] = Math.max(0, (- v1_1));
	        p13[1] = Math.max(0, (- v2_2));
	        p8.measure(android.support.v7.widget.Toolbar.getChildMeasureSpec(p9, (((this.getPaddingLeft() + this.getPaddingRight()) + v3_2) + p10), v0_1.width), android.support.v7.widget.Toolbar.getChildMeasureSpec(p11, ((((this.getPaddingTop() + this.getPaddingBottom()) + v0_1.topMargin) + v0_1.bottomMargin) + p12), v0_1.height));
	        return (p8.getMeasuredWidth() + v3_2);
	    }
	
	
	    private int a(android.view.View p7, int p8, int[] p9, int p10)
	    {
	        int v0_1 = ((aas) p7.getLayoutParams());
	        int v1_1 = (v0_1.leftMargin - p9[0]);
	        int v2_2 = (Math.max(0, v1_1) + p8);
	        p9[0] = Math.max(0, (- v1_1));
	        int v1_4 = this.a(p7, p10);
	        int v3_1 = p7.getMeasuredWidth();
	        p7.layout(v2_2, v1_4, (v2_2 + v3_1), (p7.getMeasuredHeight() + v1_4));
	        return ((v0_1.rightMargin + v3_1) + v2_2);
	    }
	
	
	    private static aas a(android.view.ViewGroup$LayoutParams p1)
	    {
	        aas v0_4;
	        if (!(p1 instanceof aas)) {
	            if (!(p1 instanceof mk)) {
	                if (!(p1 instanceof android.view.ViewGroup$MarginLayoutParams)) {
	                    v0_4 = new aas(p1);
	                } else {
	                    v0_4 = new aas(((android.view.ViewGroup$MarginLayoutParams) p1));
	                }
	            } else {
	                v0_4 = new aas(((mk) p1));
	            }
	        } else {
	            v0_4 = new aas(((aas) p1));
	        }
	        return v0_4;
	    }
	
	
	    public static synthetic wg a(android.support.v7.widget.Toolbar p1)
	    {
	        return p1.m;
	    }
	
	
	    public static synthetic void a(android.support.v7.widget.Toolbar p6, boolean p7)
	    {
	        int v3 = p6.getChildCount();
	        int v2 = 0;
	        while (v2 < v3) {
	            android.view.View v4 = p6.getChildAt(v2);
	            if ((((aas) v4.getLayoutParams()).b != 2) && (v4 != p6.a)) {
	                int v0_4;
	                if (!p7) {
	                    v0_4 = 0;
	                } else {
	                    v0_4 = 8;
	                }
	                v4.setVisibility(v0_4);
	            }
	            v2++;
	        }
	        return;
	    }
	
	
	    private void a(android.view.View p6, int p7, int p8, int p9, int p10, int p11)
	    {
	        int v0_1 = ((android.view.ViewGroup$MarginLayoutParams) p6.getLayoutParams());
	        int v1_5 = android.support.v7.widget.Toolbar.getChildMeasureSpec(p7, ((((this.getPaddingLeft() + this.getPaddingRight()) + v0_1.leftMargin) + v0_1.rightMargin) + p8), v0_1.width);
	        int v0_3 = android.support.v7.widget.Toolbar.getChildMeasureSpec(p9, (((this.getPaddingTop() + this.getPaddingBottom()) + v0_1.topMargin) + v0_1.bottomMargin), v0_1.height);
	        int v2_8 = android.view.View$MeasureSpec.getMode(v0_3);
	        if ((v2_8 != 1073741824) && (p11 >= 0)) {
	            if (v2_8 != 0) {
	                p11 = Math.min(android.view.View$MeasureSpec.getSize(v0_3), p11);
	            }
	            v0_3 = android.view.View$MeasureSpec.makeMeasureSpec(p11, 1073741824);
	        }
	        p6.measure(v1_5, v0_3);
	        return;
	    }
	
	
	    private void a(java.util.List p7, int p8)
	    {
	        int v0_0 = 1;
	        int v1_0 = 0;
	        if (gt.g(this) != 1) {
	            v0_0 = 0;
	        }
	        android.view.View v2_1 = this.getChildCount();
	        int v3_1 = fe.a(p8, gt.g(this));
	        p7.clear();
	        if (v0_0 == 0) {
	            while (v1_0 < v2_1) {
	                boolean v4_0 = this.getChildAt(v1_0);
	                int v0_2 = ((aas) v4_0.getLayoutParams());
	                if ((v0_2.b == 0) && ((this.c(v4_0)) && (this.c(v0_2.a) == v3_1))) {
	                    p7.add(v4_0);
	                }
	                v1_0++;
	            }
	        } else {
	            int v1_1 = (v2_1 - 1);
	            while (v1_1 >= 0) {
	                android.view.View v2_2 = this.getChildAt(v1_1);
	                int v0_7 = ((aas) v2_2.getLayoutParams());
	                if ((v0_7.b == 0) && ((this.c(v2_2)) && (this.c(v0_7.a) == v3_1))) {
	                    p7.add(v2_2);
	                }
	                v1_1--;
	            }
	        }
	        return;
	    }
	
	
	    private int b(android.view.View p7, int p8, int[] p9, int p10)
	    {
	        int v0_1 = ((aas) p7.getLayoutParams());
	        int v1_1 = (v0_1.rightMargin - p9[1]);
	        int v2_2 = (p8 - Math.max(0, v1_1));
	        p9[1] = Math.max(0, (- v1_1));
	        int v1_4 = this.a(p7, p10);
	        int v3_1 = p7.getMeasuredWidth();
	        p7.layout((v2_2 - v3_1), v1_4, v2_2, (p7.getMeasuredHeight() + v1_4));
	        return (v2_2 - (v0_1.leftMargin + v3_1));
	    }
	
	
	    public static synthetic void b(android.support.v7.widget.Toolbar p4)
	    {
	        if (p4.v == null) {
	            p4.v = new android.widget.ImageButton(p4.getContext(), 0, a.S);
	            p4.v.setImageDrawable(p4.t);
	            p4.v.setContentDescription(p4.u);
	            android.widget.ImageButton v0_5 = android.support.v7.widget.Toolbar.g();
	            v0_5.a = (8388611 | (p4.w & 112));
	            v0_5.b = 2;
	            p4.v.setLayoutParams(v0_5);
	            p4.v.setOnClickListener(new aaq(p4));
	        }
	        return;
	    }
	
	
	    private int c(int p3)
	    {
	        int v1 = gt.g(this);
	        int v0_1 = (fe.a(p3, v1) & 7);
	        switch (v0_1) {
	            case 1:
	            case 3:
	            case 5:
	                break;
	            case 2:
	            case 4:
	            default:
	                if (v1 != 1) {
	                    v0_1 = 3;
	                } else {
	                    v0_1 = 5;
	                }
	            case 1:
	            case 3:
	            case 5:
	                break;
	            case 1:
	            case 3:
	            case 5:
	                break;
	        }
	        return v0_1;
	    }
	
	
	    public static synthetic android.widget.ImageButton c(android.support.v7.widget.Toolbar p1)
	    {
	        return p1.v;
	    }
	
	
	    private boolean c(android.view.View p3)
	    {
	        if ((p3 == null) || ((p3.getParent() != this) || (p3.getVisibility() == 8))) {
	            int v0_2 = 0;
	        } else {
	            v0_2 = 1;
	        }
	        return v0_2;
	    }
	
	
	    public static synthetic int d(android.support.v7.widget.Toolbar p1)
	    {
	        return p1.w;
	    }
	
	
	    private static int d(android.view.View p2)
	    {
	        int v0_1 = ((android.view.ViewGroup$MarginLayoutParams) p2.getLayoutParams());
	        return (ft.b(v0_1) + ft.a(v0_1));
	    }
	
	
	    private static int e(android.view.View p2)
	    {
	        int v0_1 = ((android.view.ViewGroup$MarginLayoutParams) p2.getLayoutParams());
	        return (v0_1.bottomMargin + v0_1.topMargin);
	    }
	
	
	    public static aas g()
	    {
	        return new aas(-2, -2);
	    }
	
	
	    private int i()
	    {
	        return this.j.a;
	    }
	
	
	    private int j()
	    {
	        return this.j.b;
	    }
	
	
	    private void k()
	    {
	        if (this.s == null) {
	            this.s = new android.widget.ImageButton(this.getContext(), 0, a.S);
	            aas v0_3 = android.support.v7.widget.Toolbar.g();
	            v0_3.a = (8388611 | (this.w & 112));
	            this.s.setLayoutParams(v0_3);
	        }
	        return;
	    }
	
	
	    public final void a(int p3)
	    {
	        if (this.g != p3) {
	            this.g = p3;
	            if (p3 != 0) {
	                this.f = new android.view.ContextThemeWrapper(this.getContext(), p3);
	            } else {
	                this.f = this.getContext();
	            }
	        }
	        return;
	    }
	
	
	    public final void a(android.graphics.drawable.Drawable p2)
	    {
	        if (p2 == null) {
	            if ((this.s != null) && (this.s.getParent() != null)) {
	                this.removeView(this.s);
	            }
	        } else {
	            this.k();
	            if (this.s.getParent() == null) {
	                this.a(this.s);
	                this.b(this.s);
	            }
	        }
	        if (this.s != null) {
	            this.s.setImageDrawable(p2);
	        }
	        return;
	    }
	
	
	    public final void a(android.view.View$OnClickListener p2)
	    {
	        this.k();
	        this.s.setOnClickListener(p2);
	        return;
	    }
	
	
	    public void a(android.view.View p3)
	    {
	        aas v0_1;
	        aas v0_0 = p3.getLayoutParams();
	        if (v0_0 != null) {
	            if (this.checkLayoutParams(v0_0)) {
	                v0_1 = ((aas) v0_0);
	            } else {
	                v0_1 = android.support.v7.widget.Toolbar.a(v0_0);
	            }
	        } else {
	            v0_1 = android.support.v7.widget.Toolbar.g();
	        }
	        v0_1.b = 1;
	        this.addView(p3, v0_1);
	        return;
	    }
	
	
	    public final void a(CharSequence p4)
	    {
	        if (android.text.TextUtils.isEmpty(p4)) {
	            if ((this.b != null) && (this.b.getParent() != null)) {
	                this.removeView(this.b);
	            }
	        } else {
	            if (this.b == null) {
	                android.widget.TextView v0_6 = this.getContext();
	                this.b = new android.widget.TextView(v0_6);
	                this.b.setSingleLine();
	                this.b.setEllipsize(android.text.TextUtils$TruncateAt.END);
	                if (this.h != 0) {
	                    this.b.setTextAppearance(v0_6, this.h);
	                }
	            }
	            if (this.b.getParent() == null) {
	                this.a(this.b);
	                this.b(this.b);
	            }
	        }
	        if (this.b != null) {
	            this.b.setText(p4);
	        }
	        this.k = p4;
	        return;
	    }
	
	
	    public final boolean a()
	    {
	        int v0 = 1;
	        if (this.a == null) {
	            v0 = 0;
	        } else {
	            int v2_4;
	            int v2_1 = this.a;
	            if ((v2_1.c == null) || (!v2_1.c.f())) {
	                v2_4 = 0;
	            } else {
	                v2_4 = 1;
	            }
	            if (v2_4 == 0) {
	            }
	        }
	        return v0;
	    }
	
	
	    public final void b(int p2)
	    {
	        int v0_0;
	        if (p2 == 0) {
	            v0_0 = 0;
	        } else {
	            v0_0 = this.getContext().getText(p2);
	        }
	        this.c(v0_0);
	        return;
	    }
	
	
	    public void b(android.view.View p3)
	    {
	        if ((((aas) p3.getLayoutParams()).b != 2) && (p3 != this.a)) {
	            int v0_5;
	            if (this.e == null) {
	                v0_5 = 0;
	            } else {
	                v0_5 = 8;
	            }
	            p3.setVisibility(v0_5);
	        }
	        return;
	    }
	
	
	    public final void b(CharSequence p4)
	    {
	        if (android.text.TextUtils.isEmpty(p4)) {
	            if ((this.c != null) && (this.c.getParent() != null)) {
	                this.removeView(this.c);
	            }
	        } else {
	            if (this.c == null) {
	                android.widget.TextView v0_6 = this.getContext();
	                this.c = new android.widget.TextView(v0_6);
	                this.c.setSingleLine();
	                this.c.setEllipsize(android.text.TextUtils$TruncateAt.END);
	                if (this.i != 0) {
	                    this.c.setTextAppearance(v0_6, this.i);
	                }
	            }
	            if (this.c.getParent() == null) {
	                this.a(this.c);
	                this.b(this.c);
	            }
	        }
	        if (this.c != null) {
	            this.c.setText(p4);
	        }
	        this.l = p4;
	        return;
	    }
	
	
	    public final boolean b()
	    {
	        int v0 = 1;
	        if (this.a == null) {
	            v0 = 0;
	        } else {
	            int v2_4;
	            int v2_1 = this.a;
	            if ((v2_1.c == null) || (!v2_1.c.b())) {
	                v2_4 = 0;
	            } else {
	                v2_4 = 1;
	            }
	            if (v2_4 == 0) {
	            }
	        }
	        return v0;
	    }
	
	
	    public final void c()
	    {
	        qe v0_2;
	        if (this.o != null) {
	            v0_2 = this.o.a;
	        } else {
	            v0_2 = 0;
	        }
	        if (v0_2 != null) {
	            v0_2.collapseActionView();
	        }
	        return;
	    }
	
	
	    public final void c(CharSequence p2)
	    {
	        if (!android.text.TextUtils.isEmpty(p2)) {
	            this.k();
	        }
	        if (this.s != null) {
	            this.s.setContentDescription(p2);
	        }
	        return;
	    }
	
	
	    protected boolean checkLayoutParams(android.view.ViewGroup$LayoutParams p2)
	    {
	        if ((!super.checkLayoutParams(p2)) || (!(p2 instanceof aas))) {
	            int v0_2 = 0;
	        } else {
	            v0_2 = 1;
	        }
	        return v0_2;
	    }
	
	
	    public final CharSequence d()
	    {
	        int v0_1;
	        if (this.s == null) {
	            v0_1 = 0;
	        } else {
	            v0_1 = this.s.getContentDescription();
	        }
	        return v0_1;
	    }
	
	
	    public final android.graphics.drawable.Drawable e()
	    {
	        int v0_1;
	        if (this.s == null) {
	            v0_1 = 0;
	        } else {
	            v0_1 = this.s.getDrawable();
	        }
	        return v0_1;
	    }
	
	
	    public void f()
	    {
	        if (this.a == null) {
	            this.a = new android.support.v7.widget.ActionMenuView(this.getContext());
	            this.a.a(this.g);
	            this.a.f = this.H;
	            android.support.v7.widget.ActionMenuView v0_5 = this.a;
	            int v2_0 = this.q;
	            v0_5.d = this.p;
	            v0_5.e = v2_0;
	            android.support.v7.widget.ActionMenuView v0_6 = android.support.v7.widget.Toolbar.g();
	            v0_6.a = (8388613 | (this.w & 112));
	            this.a.setLayoutParams(v0_6);
	            this.a(this.a);
	        }
	        return;
	    }
	
	
	    protected synthetic android.view.ViewGroup$LayoutParams generateDefaultLayoutParams()
	    {
	        return android.support.v7.widget.Toolbar.g();
	    }
	
	
	    public synthetic android.view.ViewGroup$LayoutParams generateLayoutParams(android.util.AttributeSet p3)
	    {
	        return new aas(this.getContext(), p3);
	    }
	
	
	    protected synthetic android.view.ViewGroup$LayoutParams generateLayoutParams(android.view.ViewGroup$LayoutParams p2)
	    {
	        return android.support.v7.widget.Toolbar.a(p2);
	    }
	
	
	    public final se h()
	    {
	        if (this.I == null) {
	            this.I = new ti(this, 1);
	        }
	        return this.I;
	    }
	
	
	    protected void onDetachedFromWindow()
	    {
	        super.onDetachedFromWindow();
	        this.removeCallbacks(this.J);
	        return;
	    }
	
	
	    public boolean onHoverEvent(android.view.MotionEvent p6)
	    {
	        int v0 = gd.a(p6);
	        if (v0 == 9) {
	            this.E = 0;
	        }
	        if (!this.E) {
	            int v1_1 = super.onHoverEvent(p6);
	            if ((v0 == 9) && (v1_1 == 0)) {
	                this.E = 1;
	            }
	        }
	        if ((v0 == 10) || (v0 == 3)) {
	            this.E = 0;
	        }
	        return 1;
	    }
	
	
	    protected void onLayout(boolean p24, int p25, int p26, int p27, int p28)
	    {
	        int v5_0;
	        if (gt.g(this) != 1) {
	            v5_0 = 0;
	        } else {
	            v5_0 = 1;
	        }
	        int v4_4;
	        int v12 = this.getWidth();
	        android.widget.TextView v13_0 = this.getHeight();
	        int v6_0 = this.getPaddingLeft();
	        int v14 = this.getPaddingRight();
	        int v15_0 = this.getPaddingTop();
	        int v16_0 = this.getPaddingBottom();
	        int v3_3 = (v12 - v14);
	        int[] v17 = this.G;
	        v17[1] = 0;
	        v17[0] = 0;
	        int v18 = gt.n(this);
	        if (!this.c(this.s)) {
	            v4_4 = v6_0;
	        } else {
	            if (v5_0 == 0) {
	                v4_4 = this.a(this.s, v6_0, v17, v18);
	            } else {
	                v3_3 = this.b(this.s, v3_3, v17, v18);
	                v4_4 = v6_0;
	            }
	        }
	        if (this.c(this.v)) {
	            if (v5_0 == 0) {
	                v4_4 = this.a(this.v, v4_4, v17, v18);
	            } else {
	                v3_3 = this.b(this.v, v3_3, v17, v18);
	            }
	        }
	        if (this.c(this.a)) {
	            if (v5_0 == 0) {
	                v3_3 = this.b(this.a, v3_3, v17, v18);
	            } else {
	                v4_4 = this.a(this.a, v4_4, v17, v18);
	            }
	        }
	        v17[0] = Math.max(0, (this.i() - v4_4));
	        v17[1] = Math.max(0, (this.j() - ((v12 - v14) - v3_3)));
	        int v4_7 = Math.max(v4_4, this.i());
	        int v3_4 = Math.min(v3_3, ((v12 - v14) - this.j()));
	        if (this.c(this.e)) {
	            if (v5_0 == 0) {
	                v4_7 = this.a(this.e, v4_7, v17, v18);
	            } else {
	                v3_4 = this.b(this.e, v3_4, v17, v18);
	            }
	        }
	        int v8_6;
	        int v7_20;
	        if (!this.c(this.d)) {
	            v7_20 = v3_4;
	            v8_6 = v4_7;
	        } else {
	            if (v5_0 == 0) {
	                v7_20 = v3_4;
	                v8_6 = this.a(this.d, v4_7, v17, v18);
	            } else {
	                v7_20 = this.b(this.d, v3_4, v17, v18);
	                v8_6 = v4_7;
	            }
	        }
	        int v19_0 = this.c(this.b);
	        boolean v20 = this.c(this.c);
	        int v4_9 = 0;
	        if (v19_0 != 0) {
	            int v3_10 = ((aas) this.b.getLayoutParams());
	            v4_9 = ((v3_10.bottomMargin + (v3_10.topMargin + this.b.getMeasuredHeight())) + 0);
	        }
	        int v11_0;
	        if (!v20) {
	            v11_0 = v4_9;
	        } else {
	            int v3_15 = ((aas) this.c.getLayoutParams());
	            v11_0 = ((v3_15.bottomMargin + (v3_15.topMargin + this.c.getMeasuredHeight())) + v4_9);
	        }
	        if ((v19_0 != 0) || (v20)) {
	            int v9_8;
	            if (v19_0 == 0) {
	                v9_8 = this.c;
	            } else {
	                v9_8 = this.b;
	            }
	            int v4_12;
	            if (!v20) {
	                v4_12 = this.b;
	            } else {
	                v4_12 = this.c;
	            }
	            int v9_13;
	            int v3_24 = ((aas) v9_8.getLayoutParams());
	            int v4_14 = ((aas) v4_12.getLayoutParams());
	            if (((v19_0 == 0) || (this.b.getMeasuredWidth() <= 0)) && ((!v20) || (this.c.getMeasuredWidth() <= 0))) {
	                v9_13 = 0;
	            } else {
	                v9_13 = 1;
	            }
	            int v10_6;
	            switch ((this.C & 112)) {
	                case 48:
	                    v10_6 = ((v3_24.topMargin + this.getPaddingTop()) + this.A);
	                    break;
	                case 80:
	                    v10_6 = ((((v13_0 - v16_0) - v4_14.bottomMargin) - this.B) - v11_0);
	                    break;
	                default:
	                    int v3_32;
	                    int v10_10 = ((((v13_0 - v15_0) - v16_0) - v11_0) / 2);
	                    if (v10_10 >= (v3_24.topMargin + this.A)) {
	                        int v11_3 = ((((v13_0 - v16_0) - v11_0) - v10_10) - v15_0);
	                        if (v11_3 >= (v3_24.bottomMargin + this.B)) {
	                            v3_32 = v10_10;
	                        } else {
	                            v3_32 = Math.max(0, (v10_10 - ((v4_14.bottomMargin + this.B) - v11_3)));
	                        }
	                    } else {
	                        v3_32 = (v3_24.topMargin + this.A);
	                    }
	                    v10_6 = (v15_0 + v3_32);
	            }
	            if (v5_0 == 0) {
	                int v3_35;
	                if (v9_13 == 0) {
	                    v3_35 = 0;
	                } else {
	                    v3_35 = this.y;
	                }
	                int v5_2;
	                int v4_29;
	                int v3_36 = (v3_35 - v17[0]);
	                v8_6 += Math.max(0, v3_36);
	                v17[0] = Math.max(0, (- v3_36));
	                if (v19_0 == 0) {
	                    v5_2 = v8_6;
	                    v4_29 = v10_6;
	                } else {
	                    int v3_41 = ((aas) this.b.getLayoutParams());
	                    int v4_32 = (this.b.getMeasuredWidth() + v8_6);
	                    int v5_5 = (this.b.getMeasuredHeight() + v10_6);
	                    this.b.layout(v8_6, v10_6, v4_32, v5_5);
	                    v5_2 = (v4_32 + this.z);
	                    v4_29 = (v3_41.bottomMargin + v5_5);
	                }
	                int v3_44;
	                if (!v20) {
	                    v3_44 = v8_6;
	                } else {
	                    int v4_34 = (v4_29 + ((aas) this.c.getLayoutParams()).topMargin);
	                    int v10_15 = (this.c.getMeasuredWidth() + v8_6);
	                    this.c.layout(v8_6, v4_34, v10_15, (this.c.getMeasuredHeight() + v4_34));
	                    v3_44 = (this.z + v10_15);
	                }
	                if (v9_13 != 0) {
	                    v8_6 = Math.max(v5_2, v3_44);
	                }
	            } else {
	                int v3_48;
	                if (v9_13 == 0) {
	                    v3_48 = 0;
	                } else {
	                    v3_48 = this.y;
	                }
	                int v7_24;
	                int v3_49 = (v3_48 - v17[1]);
	                int v4_41 = (v7_20 - Math.max(0, v3_49));
	                v17[1] = Math.max(0, (- v3_49));
	                if (v19_0 == 0) {
	                    v7_24 = v4_41;
	                } else {
	                    int v3_54 = ((aas) this.b.getLayoutParams());
	                    int v5_9 = (v4_41 - this.b.getMeasuredWidth());
	                    int v7_27 = (this.b.getMeasuredHeight() + v10_6);
	                    this.b.layout(v5_9, v10_6, v4_41, v7_27);
	                    v10_6 = (v7_27 + v3_54.bottomMargin);
	                    v7_24 = (v5_9 - this.z);
	                }
	                int v3_56;
	                if (!v20) {
	                    v3_56 = v4_41;
	                } else {
	                    int v5_12 = (((aas) this.c.getLayoutParams()).topMargin + v10_6);
	                    this.c.layout((v4_41 - this.c.getMeasuredWidth()), v5_12, v4_41, (this.c.getMeasuredHeight() + v5_12));
	                    v3_56 = (v4_41 - this.z);
	                }
	                int v3_60;
	                if (v9_13 == 0) {
	                    v3_60 = v4_41;
	                } else {
	                    v3_60 = Math.min(v7_24, v3_56);
	                }
	                v7_20 = v3_60;
	            }
	        }
	        this.a(this.F, 3);
	        int v9_14 = this.F.size();
	        int v4_43 = 0;
	        int v5_15 = v8_6;
	        while (v4_43 < v9_14) {
	            v5_15 = this.a(((android.view.View) this.F.get(v4_43)), v5_15, v17, v18);
	            v4_43++;
	        }
	        this.a(this.F, 5);
	        int v8_7 = this.F.size();
	        int v4_45 = 0;
	        int v11_12 = v7_20;
	        while (v4_45 < v8_7) {
	            int v7_30 = this.b(((android.view.View) this.F.get(v4_45)), v11_12, v17, v18);
	            v4_45++;
	            v11_12 = v7_30;
	        }
	        this.a(this.F, 1);
	        android.widget.TextView v13_6 = this.F;
	        int v8_8 = v17[0];
	        int v7_28 = v17[1];
	        int v15_1 = v13_6.size();
	        int v9_15 = v7_28;
	        int v10_20 = v8_8;
	        int v7_29 = 0;
	        int v8_9 = 0;
	        while (v7_29 < v15_1) {
	            int v3_82 = ((android.view.View) v13_6.get(v7_29));
	            int v4_54 = ((aas) v3_82.getLayoutParams());
	            int v10_21 = (v4_54.leftMargin - v10_20);
	            int v4_56 = (v4_54.rightMargin - v9_15);
	            int v16_2 = Math.max(0, v10_21);
	            int v19_1 = Math.max(0, v4_56);
	            v10_20 = Math.max(0, (- v10_21));
	            v9_15 = Math.max(0, (- v4_56));
	            v7_29++;
	            v8_9 += ((v3_82.getMeasuredWidth() + v16_2) + v19_1);
	        }
	        int v3_75 = (((((v12 - v6_0) - v14) / 2) + v6_0) - (v8_9 / 2));
	        int v4_49 = (v3_75 + v8_9);
	        if (v3_75 >= v5_15) {
	            if (v4_49 > v11_12) {
	                v3_75 -= (v4_49 - v11_12);
	            }
	        } else {
	            v3_75 = v5_15;
	        }
	        int v6_1 = this.F.size();
	        int v4_52 = 0;
	        int v5_16 = v3_75;
	        while (v4_52 < v6_1) {
	            v5_16 = this.a(((android.view.View) this.F.get(v4_52)), v5_16, v17, v18);
	            v4_52++;
	        }
	        this.F.clear();
	        return;
	    }
	
	
	    protected void onMeasure(int p14, int p15)
	    {
	        int v7_0;
	        int v8_0;
	        int[] v10 = this.G;
	        if (!tm.a(this)) {
	            v7_0 = 1;
	            v8_0 = 0;
	        } else {
	            v7_0 = 0;
	            v8_0 = 1;
	        }
	        int v11_0;
	        int v9_0;
	        int v0_3 = 0;
	        if (!this.c(this.s)) {
	            v9_0 = 0;
	            v11_0 = 0;
	        } else {
	            this.a(this.s, p14, 0, p15, 0, this.x);
	            v0_3 = (this.s.getMeasuredWidth() + android.support.v7.widget.Toolbar.d(this.s));
	            v9_0 = tm.a(0, gt.j(this.s));
	            v11_0 = Math.max(0, (this.s.getMeasuredHeight() + android.support.v7.widget.Toolbar.e(this.s)));
	        }
	        if (this.c(this.v)) {
	            this.a(this.v, p14, 0, p15, 0, this.x);
	            v0_3 = (this.v.getMeasuredWidth() + android.support.v7.widget.Toolbar.d(this.v));
	            v11_0 = Math.max(v11_0, (this.v.getMeasuredHeight() + android.support.v7.widget.Toolbar.e(this.v)));
	            v9_0 = tm.a(v9_0, gt.j(this.v));
	        }
	        int v1_21;
	        int v1_20 = this.j;
	        if (!v1_20.g) {
	            v1_21 = v1_20.a;
	        } else {
	            v1_21 = v1_20.b;
	        }
	        int v3_7 = (Math.max(v1_21, v0_3) + 0);
	        v10[v8_0] = Math.max(0, (v1_21 - v0_3));
	        int v0_12 = 0;
	        if (this.c(this.a)) {
	            this.a(this.a, p14, v3_7, p15, 0, this.x);
	            v0_12 = (this.a.getMeasuredWidth() + android.support.v7.widget.Toolbar.d(this.a));
	            v11_0 = Math.max(v11_0, (this.a.getMeasuredHeight() + android.support.v7.widget.Toolbar.e(this.a)));
	            v9_0 = tm.a(v9_0, gt.j(this.a));
	        }
	        int v1_33;
	        int v1_32 = this.j;
	        if (!v1_32.g) {
	            v1_33 = v1_32.b;
	        } else {
	            v1_33 = v1_32.a;
	        }
	        int v3_8 = (v3_7 + Math.max(v1_33, v0_12));
	        v10[v7_0] = Math.max(0, (v1_33 - v0_12));
	        if (this.c(this.e)) {
	            v3_8 += this.a(this.e, p14, v3_8, p15, 0, v10);
	            v11_0 = Math.max(v11_0, (this.e.getMeasuredHeight() + android.support.v7.widget.Toolbar.e(this.e)));
	            v9_0 = tm.a(v9_0, gt.j(this.e));
	        }
	        if (this.c(this.d)) {
	            v3_8 += this.a(this.d, p14, v3_8, p15, 0, v10);
	            v11_0 = Math.max(v11_0, (this.d.getMeasuredHeight() + android.support.v7.widget.Toolbar.e(this.d)));
	            v9_0 = tm.a(v9_0, gt.j(this.d));
	        }
	        int v8_1 = this.getChildCount();
	        int v7_1 = 0;
	        int v12 = v11_0;
	        int v11_1 = v9_0;
	        while (v7_1 < v8_1) {
	            int v0_50;
	            int v1_52;
	            int v1_51 = this.getChildAt(v7_1);
	            if ((((aas) v1_51.getLayoutParams()).b != 0) || (!this.c(v1_51))) {
	                v0_50 = v11_1;
	                v1_52 = v12;
	            } else {
	                v3_8 += this.a(v1_51, p14, v3_8, p15, 0, v10);
	                int v2_39 = Math.max(v12, (v1_51.getMeasuredHeight() + android.support.v7.widget.Toolbar.e(v1_51)));
	                v0_50 = tm.a(v11_1, gt.j(v1_51));
	                v1_52 = v2_39;
	            }
	            v7_1++;
	            v11_1 = v0_50;
	            v12 = v1_52;
	        }
	        int v1_40 = 0;
	        int v0_37 = 0;
	        int v9_1 = (this.A + this.B);
	        int v2_22 = (this.y + this.z);
	        if (this.c(this.b)) {
	            this.a(this.b, p14, (v3_8 + v2_22), p15, v9_1, v10);
	            v1_40 = (android.support.v7.widget.Toolbar.d(this.b) + this.b.getMeasuredWidth());
	            v0_37 = (this.b.getMeasuredHeight() + android.support.v7.widget.Toolbar.e(this.b));
	            v11_1 = tm.a(v11_1, gt.j(this.b));
	        }
	        if (this.c(this.c)) {
	            v1_40 = Math.max(v1_40, this.a(this.c, p14, (v3_8 + v2_22), p15, (v9_1 + v0_37), v10));
	            v0_37 += (this.c.getMeasuredHeight() + android.support.v7.widget.Toolbar.e(this.c));
	            v11_1 = tm.a(v11_1, gt.j(this.c));
	        }
	        int v1_50;
	        int v1_43 = (v1_40 + v3_8);
	        int v0_42 = Math.max(v12, v0_37);
	        int v1_44 = (v1_43 + (this.getPaddingLeft() + this.getPaddingRight()));
	        int v0_43 = (v0_42 + (this.getPaddingTop() + this.getPaddingBottom()));
	        int v2_36 = gt.a(Math.max(v1_44, this.getSuggestedMinimumWidth()), p14, (-16777216 & v11_1));
	        int v0_45 = gt.a(Math.max(v0_43, this.getSuggestedMinimumHeight()), p15, (v11_1 << 16));
	        if (this.r) {
	            int v3_11 = this.getChildCount();
	            int v1_49 = 0;
	            while (v1_49 < v3_11) {
	                int v4_19 = this.getChildAt(v1_49);
	                if ((!this.c(v4_19)) || ((v4_19.getMeasuredWidth() <= 0) || (v4_19.getMeasuredHeight() <= 0))) {
	                    v1_49++;
	                } else {
	                    v1_50 = 0;
	                }
	            }
	            v1_50 = 1;
	        } else {
	            v1_50 = 0;
	        }
	        if (v1_50 != 0) {
	            v0_45 = 0;
	        }
	        this.setMeasuredDimension(v2_36, v0_45);
	        return;
	    }
	
	
	    protected void onRestoreInstanceState(android.os.Parcelable p3)
	    {
	        android.view.MenuItem v0_2;
	        super.onRestoreInstanceState(((aat) p3).getSuperState());
	        if (this.a == null) {
	            v0_2 = 0;
	        } else {
	            v0_2 = this.a.a;
	        }
	        if ((((aat) p3).a != 0) && ((this.o != null) && (v0_2 != null))) {
	            android.view.MenuItem v0_4 = v0_2.findItem(((aat) p3).a);
	            if (v0_4 != null) {
	                fx.b(v0_4);
	            }
	        }
	        if (((aat) p3).b) {
	            this.removeCallbacks(this.J);
	            this.post(this.J);
	        }
	        return;
	    }
	
	
	    public void onRtlPropertiesChanged(int p5)
	    {
	        int v0_0 = 1;
	        if (android.os.Build$VERSION.SDK_INT >= 17) {
	            super.onRtlPropertiesChanged(p5);
	        }
	        sl v1_1 = this.j;
	        if (p5 != 1) {
	            v0_0 = 0;
	        }
	        if (v0_0 != v1_1.g) {
	            v1_1.g = v0_0;
	            if (!v1_1.h) {
	                v1_1.a = v1_1.e;
	                v1_1.b = v1_1.f;
	            } else {
	                if (v0_0 == 0) {
	                    int v0_4;
	                    if (v1_1.c == -2147483648) {
	                        v0_4 = v1_1.e;
	                    } else {
	                        v0_4 = v1_1.c;
	                    }
	                    int v0_6;
	                    v1_1.a = v0_4;
	                    if (v1_1.d == -2147483648) {
	                        v0_6 = v1_1.f;
	                    } else {
	                        v0_6 = v1_1.d;
	                    }
	                    v1_1.b = v0_6;
	                } else {
	                    int v0_8;
	                    if (v1_1.d == -2147483648) {
	                        v0_8 = v1_1.e;
	                    } else {
	                        v0_8 = v1_1.d;
	                    }
	                    int v0_10;
	                    v1_1.a = v0_8;
	                    if (v1_1.c == -2147483648) {
	                        v0_10 = v1_1.f;
	                    } else {
	                        v0_10 = v1_1.c;
	                    }
	                    v1_1.b = v0_10;
	                }
	            }
	        }
	        return;
	    }
	
	
	    protected android.os.Parcelable onSaveInstanceState()
	    {
	        aat v0_1 = new aat(super.onSaveInstanceState());
	        if ((this.o != null) && (this.o.a != null)) {
	            v0_1.a = this.o.a.getItemId();
	        }
	        v0_1.b = this.a();
	        return v0_1;
	    }
	
	
	    public boolean onTouchEvent(android.view.MotionEvent p5)
	    {
	        int v0 = gd.a(p5);
	        if (v0 == 0) {
	            this.D = 0;
	        }
	        if (!this.D) {
	            int v1_1 = super.onTouchEvent(p5);
	            if ((v0 == 0) && (v1_1 == 0)) {
	                this.D = 1;
	            }
	        }
	        if ((v0 == 1) || (v0 == 3)) {
	            this.D = 0;
	        }
	        return 1;
	    }
	
