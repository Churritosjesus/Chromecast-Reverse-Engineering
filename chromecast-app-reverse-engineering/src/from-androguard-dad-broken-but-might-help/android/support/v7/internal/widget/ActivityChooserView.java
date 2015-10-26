	public final rv a
	public final android.widget.ImageView b
	public fb c
	public  d
	private final rw e
	private final xu f
	private final android.graphics.drawable.Drawable g
	private final android.widget.FrameLayout h
	private final android.widget.FrameLayout i
	private final android.widget.ImageView j
	private final  k
	private final android.database.DataSetObserver l
	private final android.view.ViewTreeObserver$OnGlobalLayoutListener m
	private yc n
	private  o
	private  p
	private  q
	
	    public ActivityChooserView(android.content.Context p2)
	    {
	        this(p2, 0);
	        return;
	    }
	
	
	    private ActivityChooserView(android.content.Context p3, android.util.AttributeSet p4)
	    {
	        this(p3, 0, 0);
	        return;
	    }
	
	
	    private ActivityChooserView(android.content.Context p5, android.util.AttributeSet p6, int p7)
	    {
	        this(p5, p6, 0);
	        this.l = new rr(this);
	        this.m = new rs(this);
	        this.p = 4;
	        int v0_5 = p5.obtainStyledAttributes(p6, oq.E, 0, 0);
	        this.p = v0_5.getInt(oq.G, 4);
	        int v1_4 = v0_5.getDrawable(oq.F);
	        v0_5.recycle();
	        android.view.LayoutInflater.from(this.getContext()).inflate(a.bF, this, 1);
	        this.e = new rw(this);
	        this.f = ((xu) this.findViewById(a.aX));
	        this.g = this.f.getBackground();
	        this.i = ((android.widget.FrameLayout) this.findViewById(a.be));
	        this.i.setOnClickListener(this.e);
	        this.i.setOnLongClickListener(this.e);
	        this.j = ((android.widget.ImageView) this.i.findViewById(a.bi));
	        int v0_25 = ((android.widget.FrameLayout) this.findViewById(a.bg));
	        v0_25.setOnClickListener(this.e);
	        v0_25.setOnTouchListener(new rt(this, v0_25));
	        this.h = v0_25;
	        this.b = ((android.widget.ImageView) v0_25.findViewById(a.bi));
	        this.b.setImageDrawable(v1_4);
	        this.a = new rv(this);
	        this.a.registerDataSetObserver(new ru(this));
	        int v0_32 = p5.getResources();
	        this.k = Math.max((v0_32.getDisplayMetrics().widthPixels / 2), v0_32.getDimensionPixelSize(a.ab));
	        return;
	    }
	
	
	    public static synthetic rv a(android.support.v7.internal.widget.ActivityChooserView p1)
	    {
	        return p1.a;
	    }
	
	
	    private void a(int p7)
	    {
	        if (this.a.a != null) {
	            yf v0_5;
	            this.getViewTreeObserver().addOnGlobalLayoutListener(this.m);
	            if (this.i.getVisibility() != 0) {
	                v0_5 = 0;
	            } else {
	                v0_5 = 1;
	            }
	            yc v3_3;
	            boolean v4_0 = this.a.a.a();
	            if (v0_5 == null) {
	                v3_3 = 0;
	            } else {
	                v3_3 = 1;
	            }
	            if ((p7 == 2147483647) || (v4_0 <= (v3_3 + p7))) {
	                this.a.a(0);
	                this.a.a(p7);
	            } else {
	                this.a.a(1);
	                this.a.a((p7 - 1));
	            }
	            yc v3_9 = this.d();
	            if (!v3_9.b.isShowing()) {
	                if ((!this.o) && (v0_5 != null)) {
	                    this.a.a(0, 0);
	                } else {
	                    this.a.a(1, v0_5);
	                }
	                v3_9.a(Math.min(this.a.a(), this.k));
	                v3_9.c();
	                if (this.c != null) {
	                    this.c.a(1);
	                }
	                v3_9.c.setContentDescription(this.getContext().getString(a.bV));
	            }
	            return;
	        } else {
	            throw new IllegalStateException("No data model. Did you call #setDataModel?");
	        }
	    }
	
	
	    public static synthetic void a(android.support.v7.internal.widget.ActivityChooserView p0, int p1)
	    {
	        p0.a(p1);
	        return;
	    }
	
	
	    public static synthetic boolean a(android.support.v7.internal.widget.ActivityChooserView p0, boolean p1)
	    {
	        p0.o = p1;
	        return p1;
	    }
	
	
	    public static synthetic yc b(android.support.v7.internal.widget.ActivityChooserView p1)
	    {
	        return p1.d();
	    }
	
	
	    public static synthetic void c(android.support.v7.internal.widget.ActivityChooserView p6)
	    {
	        if (p6.a.getCount() <= 0) {
	            p6.h.setEnabled(0);
	        } else {
	            p6.h.setEnabled(1);
	        }
	        xu v0_6 = p6.a.a.a();
	        int v1_2 = p6.a.a.c();
	        if ((v0_6 != 1) && ((v0_6 <= 1) || (v1_2 <= 0))) {
	            p6.i.setVisibility(8);
	        } else {
	            p6.i.setVisibility(0);
	            xu v0_11 = p6.a.a.b();
	            int v1_5 = p6.getContext().getPackageManager();
	            p6.j.setImageDrawable(v0_11.loadIcon(v1_5));
	            if (p6.d != 0) {
	                xu v0_12 = v0_11.loadLabel(v1_5);
	                int v1_6 = p6.getContext();
	                int v2_2 = p6.d;
	                Object[] v3_1 = new Object[1];
	                v3_1[0] = v0_12;
	                p6.i.setContentDescription(v1_6.getString(v2_2, v3_1));
	            }
	        }
	        if (p6.i.getVisibility() != 0) {
	            p6.f.setBackgroundDrawable(0);
	        } else {
	            p6.f.setBackgroundDrawable(p6.g);
	        }
	        return;
	    }
	
	
	    private yc d()
	    {
	        if (this.n == null) {
	            this.n = new yc(this.getContext());
	            this.n.a(this.a);
	            this.n.g = this;
	            this.n.a(1);
	            this.n.h = this.e;
	            this.n.a(this.e);
	        }
	        return this.n;
	    }
	
	
	    public static synthetic boolean d(android.support.v7.internal.widget.ActivityChooserView p1)
	    {
	        return p1.o;
	    }
	
	
	    public static synthetic android.widget.FrameLayout e(android.support.v7.internal.widget.ActivityChooserView p1)
	    {
	        return p1.i;
	    }
	
	
	    public static synthetic android.widget.FrameLayout f(android.support.v7.internal.widget.ActivityChooserView p1)
	    {
	        return p1.h;
	    }
	
	
	    public static synthetic int g(android.support.v7.internal.widget.ActivityChooserView p1)
	    {
	        return p1.p;
	    }
	
	
	    public static synthetic android.widget.PopupWindow$OnDismissListener h(android.support.v7.internal.widget.ActivityChooserView p1)
	    {
	        return 0;
	    }
	
	
	    public static synthetic android.database.DataSetObserver i(android.support.v7.internal.widget.ActivityChooserView p1)
	    {
	        return p1.l;
	    }
	
	
	    public final boolean a()
	    {
	        int v0_0 = 0;
	        if ((!this.d().b.isShowing()) && (this.q)) {
	            this.o = 0;
	            this.a(this.p);
	            v0_0 = 1;
	        }
	        return v0_0;
	    }
	
	
	    public final boolean b()
	    {
	        if (this.d().b.isShowing()) {
	            this.d().a();
	            int v0_4 = this.getViewTreeObserver();
	            if (v0_4.isAlive()) {
	                v0_4.removeGlobalOnLayoutListener(this.m);
	            }
	        }
	        return 1;
	    }
	
	
	    public final boolean c()
	    {
	        return this.d().b.isShowing();
	    }
	
	
	    protected final void onAttachedToWindow()
	    {
	        super.onAttachedToWindow();
	        int v0_1 = this.a.a;
	        if (v0_1 != 0) {
	            v0_1.registerObserver(this.l);
	        }
	        this.q = 1;
	        return;
	    }
	
	
	    protected final void onDetachedFromWindow()
	    {
	        super.onDetachedFromWindow();
	        int v0_1 = this.a.a;
	        if (v0_1 != 0) {
	            v0_1.unregisterObserver(this.l);
	        }
	        int v0_2 = this.getViewTreeObserver();
	        if (v0_2.isAlive()) {
	            v0_2.removeGlobalOnLayoutListener(this.m);
	        }
	        if (this.c()) {
	            this.b();
	        }
	        this.q = 0;
	        return;
	    }
	
	
	    protected final void onLayout(boolean p5, int p6, int p7, int p8, int p9)
	    {
	        this.f.layout(0, 0, (p8 - p6), (p9 - p7));
	        if (!this.c()) {
	            this.b();
	        }
	        return;
	    }
	
	
	    protected final void onMeasure(int p4, int p5)
	    {
	        int v0_0 = this.f;
	        if (this.i.getVisibility() != 0) {
	            p5 = android.view.View$MeasureSpec.makeMeasureSpec(android.view.View$MeasureSpec.getSize(p5), 1073741824);
	        }
	        this.measureChild(v0_0, p4, p5);
	        this.setMeasuredDimension(v0_0.getMeasuredWidth(), v0_0.getMeasuredHeight());
	        return;
	    }
	
