	private static final android.view.animation.Interpolator ai
	private static final  s
	private static final Ljava.lang.Class t
	private final java.util.ArrayList A
	private s B
	private  C
	private  D
	private  E
	private  F
	private  G
	private final  H
	private final android.view.accessibility.AccessibilityManager I
	private  J
	private  K
	private  L
	private android.view.VelocityTracker M
	private  N
	private  O
	private  P
	private  Q
	private  R
	private final  S
	private final  T
	private  U
	private final zq V
	private zd W
	public final zl a
	private  aa
	private zs ab
	private final I ac
	private final gj ad
	private final I ae
	private final I af
	private final I ag
	private java.lang.Runnable ah
	public wh b
	public xb c
	public yz d
	public zh e
	public  f
	public  g
	public  h
	public lc i
	public lc j
	public lc k
	public lc l
	public zc m
	public final zp n
	public zj o
	public java.util.List p
	public  q
	public  r
	private final zm u
	private zn v
	private  w
	private final java.lang.Runnable x
	private final android.graphics.Rect y
	private final java.util.ArrayList z
	
	    static RecyclerView()
	    {
	        if ((android.os.Build$VERSION.SDK_INT != 18) && ((android.os.Build$VERSION.SDK_INT != 19) && (android.os.Build$VERSION.SDK_INT != 20))) {
	            int v0_3 = 0;
	        } else {
	            v0_3 = 1;
	        }
	        android.support.v7.widget.RecyclerView.s = v0_3;
	        int v0_5 = new Class[4];
	        v0_5[0] = android.content.Context;
	        v0_5[1] = android.util.AttributeSet;
	        v0_5[2] = Integer.TYPE;
	        v0_5[3] = Integer.TYPE;
	        android.support.v7.widget.RecyclerView.t = v0_5;
	        android.support.v7.widget.RecyclerView.ai = new yw();
	        return;
	    }
	
	
	    public RecyclerView(android.content.Context p2)
	    {
	        this(p2, 0);
	        return;
	    }
	
	
	    public RecyclerView(android.content.Context p2, android.util.AttributeSet p3)
	    {
	        this(p2, p3, 0);
	        return;
	    }
	
	
	    public RecyclerView(android.content.Context p10, android.util.AttributeSet p11, int p12)
	    {
	        IllegalStateException v0_29;
	        this(p10, p11, p12);
	        this.u = new zm(this);
	        this.a = new zl(this);
	        this.x = new yu(this);
	        this.y = new android.graphics.Rect();
	        this.z = new java.util.ArrayList();
	        this.A = new java.util.ArrayList();
	        this.h = 0;
	        this.J = 0;
	        this.m = new xe();
	        this.K = 0;
	        this.L = -1;
	        this.U = 1;
	        this.V = new zq(this);
	        this.n = new zp();
	        this.q = 0;
	        this.r = 0;
	        this.W = new ze(this);
	        this.aa = 0;
	        IllegalStateException v0_22 = new int[2];
	        this.ac = v0_22;
	        IllegalStateException v0_23 = new int[2];
	        this.ae = v0_23;
	        IllegalStateException v0_24 = new int[2];
	        this.af = v0_24;
	        IllegalStateException v0_25 = new int[2];
	        this.ag = v0_25;
	        this.ah = new yv(this);
	        this.setFocusableInTouchMode(1);
	        if (android.os.Build$VERSION.SDK_INT < 16) {
	            v0_29 = 0;
	        } else {
	            v0_29 = 1;
	        }
	        IllegalStateException v0_33;
	        this.H = v0_29;
	        IllegalStateException v0_30 = android.view.ViewConfiguration.get(p10);
	        this.R = v0_30.getScaledTouchSlop();
	        this.S = v0_30.getScaledMinimumFlingVelocity();
	        this.T = v0_30.getScaledMaximumFlingVelocity();
	        if (gt.a(this) != 2) {
	            v0_33 = 0;
	        } else {
	            v0_33 = 1;
	        }
	        this.setWillNotDraw(v0_33);
	        this.m.h = this.W;
	        this.b = new wh(new yy(this));
	        this.c = new xb(new yx(this));
	        if (gt.e(this) == 0) {
	            gt.c(this, 1);
	        }
	        this.I = ((android.view.accessibility.AccessibilityManager) this.getContext().getSystemService("accessibility"));
	        this.ab = new zs(this);
	        gt.a(this, this.ab);
	        if (p11 != null) {
	            IllegalStateException v0_47 = p10.obtainStyledAttributes(p11, vq.a, p12, 0);
	            String v3_10 = v0_47.getString(vq.b);
	            v0_47.recycle();
	            if (v3_10 != null) {
	                IllegalStateException v0_48 = v3_10.trim();
	                if (v0_48.length() != 0) {
	                    String v2_8;
	                    if (v0_48.charAt(0) != 46) {
	                        if (!v0_48.contains(".")) {
	                            v2_8 = new StringBuilder().append(android.support.v7.widget.RecyclerView.getPackage().getName()).append(46).append(v0_48).toString();
	                        } else {
	                            v2_8 = v0_48;
	                        }
	                    } else {
	                        v2_8 = new StringBuilder().append(p10.getPackageName()).append(v0_48).toString();
	                    }
	                    try {
	                        IllegalStateException v0_54;
	                        if (!this.isInEditMode()) {
	                            v0_54 = p10.getClassLoader();
	                        } else {
	                            v0_54 = this.getClass().getClassLoader();
	                        }
	                    } catch (IllegalStateException v0_69) {
	                        throw new IllegalStateException(new StringBuilder().append(p11.getPositionDescription()).append(": Unable to find LayoutManager ").append(v2_8).toString(), v0_69);
	                    } catch (IllegalStateException v0_68) {
	                        throw new IllegalStateException(new StringBuilder().append(p11.getPositionDescription()).append(": Could not instantiate the LayoutManager: ").append(v2_8).toString(), v0_68);
	                    } catch (IllegalStateException v0_66) {
	                        throw new IllegalStateException(new StringBuilder().append(p11.getPositionDescription()).append(": Cannot access non-public constructor ").append(v2_8).toString(), v0_66);
	                    } catch (IllegalStateException v0_67) {
	                        throw new IllegalStateException(new StringBuilder().append(p11.getPositionDescription()).append(": Could not instantiate the LayoutManager: ").append(v2_8).toString(), v0_67);
	                    } catch (IllegalStateException v0_65) {
	                        throw new IllegalStateException(new StringBuilder().append(p11.getPositionDescription()).append(": Class is not a LayoutManager ").append(v2_8).toString(), v0_65);
	                    }
	                    Class v5_1 = v0_54.loadClass(v2_8).asSubclass(zh);
	                    try {
	                        String v4_1 = v5_1.getConstructor(android.support.v7.widget.RecyclerView.t);
	                        IllegalStateException v0_59 = new Object[4];
	                        v0_59[0] = p10;
	                        v0_59[1] = p11;
	                        v0_59[2] = Integer.valueOf(p12);
	                        v0_59[3] = Integer.valueOf(0);
	                        String v3_17 = v4_1;
	                    } catch (IllegalStateException v0) {
	                        try {
	                            String v4_3 = new Class[0];
	                            reflect.Constructor v8 = v3_17;
	                            v3_17 = v5_1.getConstructor(v4_3);
	                            v0_59 = v8;
	                        } catch (NoSuchMethodException v1_1) {
	                            v1_1.initCause(v0_59);
	                            throw new IllegalStateException(new StringBuilder().append(p11.getPositionDescription()).append(": Error creating LayoutManager ").append(v2_8).toString(), v1_1);
	                        }
	                    }
	                    v3_17.setAccessible(1);
	                    this.a(((zh) v3_17.newInstance(v0_59)));
	                }
	            }
	        }
	        this.ad = new gj(this);
	        this.setNestedScrollingEnabled(1);
	        return;
	    }
	
	
	    public static synthetic void a(android.support.v7.widget.RecyclerView p0, int p1)
	    {
	        p0.detachViewFromParent(p1);
	        return;
	    }
	
	
	    public static synthetic void a(android.support.v7.widget.RecyclerView p0, int p1, int p2)
	    {
	        p0.d(p1, p2);
	        return;
	    }
	
	
	    public static synthetic void a(android.support.v7.widget.RecyclerView p0, android.view.View p1)
	    {
	        android.support.v7.widget.RecyclerView.b(p1);
	        return;
	    }
	
	
	    public static synthetic void a(android.support.v7.widget.RecyclerView p0, android.view.View p1, int p2, android.view.ViewGroup$LayoutParams p3)
	    {
	        p0.attachViewToParent(p1, p2, p3);
	        return;
	    }
	
	
	    private void a(android.view.MotionEvent p5)
	    {
	        int v0_0 = gd.b(p5);
	        if (gd.b(p5, v0_0) == this.L) {
	            int v0_1;
	            if (v0_0 != 0) {
	                v0_1 = 0;
	            } else {
	                v0_1 = 1;
	            }
	            this.L = gd.b(p5, v0_1);
	            int v1_4 = ((int) (gd.c(p5, v0_1) + 1056964608));
	            this.P = v1_4;
	            this.N = v1_4;
	            int v0_4 = ((int) (gd.d(p5, v0_1) + 1056964608));
	            this.Q = v0_4;
	            this.O = v0_4;
	        }
	        return;
	    }
	
	
	    private void a(ed p9)
	    {
	        java.util.List v7 = this.n.e;
	        int v6 = (v7.size() - 1);
	        while (v6 >= 0) {
	            int v5_1 = ((android.view.View) v7.get(v6));
	            zl v1_0 = android.support.v7.widget.RecyclerView.b(v5_1);
	            int v0_7 = ((zg) this.n.b.remove(v1_0));
	            if (!this.n.j) {
	                this.n.c.remove(v1_0);
	            }
	            if (p9.remove(v5_1) == null) {
	                if (v0_7 == 0) {
	                    this.a(new zg(v1_0, v5_1.getLeft(), v5_1.getTop(), v5_1.getRight(), v5_1.getBottom()));
	                } else {
	                    this.a(v0_7);
	                }
	            } else {
	                zl v1_1 = this.a;
	                int v0_11 = this.e.d;
	                int v2_7 = v0_11.a.a(v5_1);
	                if (v2_7 >= 0) {
	                    if (v0_11.b.c(v2_7)) {
	                        v0_11.c.remove(v5_1);
	                    }
	                    v0_11.a.a(v2_7);
	                }
	                v1_1.a(v5_1);
	            }
	            v6--;
	        }
	        v7.clear();
	        return;
	    }
	
	
	    private void a(zg p8)
	    {
	        boolean v0_1 = p8.a.a;
	        this.a(p8.a);
	        int v2 = p8.b;
	        int v3 = p8.c;
	        int v4 = v0_1.getLeft();
	        int v5 = v0_1.getTop();
	        if ((p8.a.n()) || ((v2 == v4) && (v3 == v5))) {
	            p8.a.a(0);
	            this.m.a(p8.a);
	            this.s();
	        } else {
	            p8.a.a(0);
	            v0_1.layout(v4, v5, (v0_1.getWidth() + v4), (v0_1.getHeight() + v5));
	            if (this.m.a(p8.a, v2, v3, v4, v5)) {
	                this.s();
	            }
	        }
	        return;
	    }
	
	
	    private void a(zr p7)
	    {
	        java.util.List v0_1;
	        android.view.View v2 = p7.a;
	        if (v2.getParent() != this) {
	            v0_1 = 0;
	        } else {
	            v0_1 = 1;
	        }
	        this.a.b(this.a(v2));
	        if (!p7.o()) {
	            if (v0_1 != null) {
	                java.util.List v0_2 = this.c;
	                String v1_2 = v0_2.a.a(v2);
	                if (v1_2 >= null) {
	                    v0_2.b.a(v1_2);
	                    v0_2.c.add(v2);
	                } else {
	                    throw new IllegalArgumentException(new StringBuilder("view is not a child, cannot hide ").append(v2).toString());
	                }
	            } else {
	                this.c.a(v2, -1, 1);
	            }
	        } else {
	            this.c.a(v2, -1, v2.getLayoutParams(), 1);
	        }
	        return;
	    }
	
	
	    private boolean a(int p12, int p13, android.view.MotionEvent p14)
	    {
	        float v3_0 = 0;
	        int v1_0 = 0;
	        int v2_0 = 0;
	        float v0_0 = 0;
	        this.k();
	        if (this.d != null) {
	            this.a();
	            this.q();
	            a.a("RV Scroll");
	            if (p12 != 0) {
	                v2_0 = this.e.a(p12, this.a, this.n);
	                v3_0 = (p12 - v2_0);
	            }
	            if (p13 != 0) {
	                v0_0 = this.e.b(p13, this.a, this.n);
	                v1_0 = (p13 - v0_0);
	            }
	            a.b();
	            if (this.g()) {
	                lc v6_0 = this.c.a();
	                boolean v5_0 = 0;
	                while (v5_0 < v6_0) {
	                    int v7_11 = this.c.b(v5_0);
	                    int v4_18 = this.a(v7_11);
	                    if ((v4_18 != 0) && (v4_18.h != null)) {
	                        int v4_20;
	                        int v4_19 = v4_18.h;
	                        if (v4_19 == 0) {
	                            v4_20 = 0;
	                        } else {
	                            v4_20 = v4_19.a;
	                        }
	                        if (v4_20 != 0) {
	                            int v8_11 = v7_11.getLeft();
	                            int v7_12 = v7_11.getTop();
	                            if ((v8_11 != v4_20.getLeft()) || (v7_12 != v4_20.getTop())) {
	                                v4_20.layout(v8_11, v7_12, (v4_20.getWidth() + v8_11), (v4_20.getHeight() + v7_12));
	                            }
	                        }
	                    }
	                    v5_0++;
	                }
	            }
	            this.r();
	            this.a(0);
	        }
	        int v4_8 = v1_0;
	        int v1_2 = v2_0;
	        int v2_2 = v0_0;
	        if (!this.z.isEmpty()) {
	            this.invalidate();
	        }
	        if (!this.dispatchNestedScroll(v1_2, v2_2, v3_0, v4_8, this.ae)) {
	            if (gt.a(this) != 2) {
	                if (p14 != null) {
	                    boolean v5_3 = p14.getX();
	                    float v3_2 = ((float) v3_0);
	                    lc v6_1 = p14.getY();
	                    int v4_9 = ((float) v4_8);
	                    float v0_7 = 0;
	                    if (v3_2 >= 0) {
	                        if (v3_2 > 0) {
	                            this.c();
	                            if (this.k.a((v3_2 / ((float) this.getWidth())), (v6_1 / ((float) this.getHeight())))) {
	                                v0_7 = 1;
	                            }
	                        }
	                    } else {
	                        this.b();
	                        if (this.i.a(((- v3_2) / ((float) this.getWidth())), (1065353216 - (v6_1 / ((float) this.getHeight()))))) {
	                            v0_7 = 1;
	                        }
	                    }
	                    if (v4_9 >= 0) {
	                        if (v4_9 > 0) {
	                            this.e();
	                            if (this.l.a((v4_9 / ((float) this.getHeight())), (1065353216 - (v5_3 / ((float) this.getWidth()))))) {
	                                v0_7 = 1;
	                            }
	                        }
	                    } else {
	                        this.d();
	                        if (this.j.a(((- v4_9) / ((float) this.getHeight())), (v5_3 / ((float) this.getWidth())))) {
	                            v0_7 = 1;
	                        }
	                    }
	                    if ((v0_7 != 0) || ((v3_2 != 0) || (v4_9 != 0))) {
	                        gt.d(this);
	                    }
	                }
	                this.d(p12, p13);
	            }
	        } else {
	            this.P = (this.P - this.ae[0]);
	            this.Q = (this.Q - this.ae[1]);
	            if (p14 != null) {
	                p14.offsetLocation(((float) this.ae[0]), ((float) this.ae[1]));
	            }
	            float v0_19 = this.ag;
	            v0_19[0] = (v0_19[0] + this.ae[0]);
	            float v0_20 = this.ag;
	            v0_20[1] = (v0_20[1] + this.ae[1]);
	        }
	        if ((v1_2 != 0) || (v2_2 != 0)) {
	            this.c(v1_2, v2_2);
	        }
	        if (!this.awakenScrollBars()) {
	            this.invalidate();
	        }
	        if ((v1_2 == 0) && (v2_2 == 0)) {
	            float v0_22 = 0;
	        } else {
	            v0_22 = 1;
	        }
	        return v0_22;
	    }
	
	
	    public static synthetic boolean a(android.support.v7.widget.RecyclerView p1)
	    {
	        return p1.g;
	    }
	
	
	    public static synthetic boolean a(android.support.v7.widget.RecyclerView p1, boolean p2)
	    {
	        p1.aa = 0;
	        return 0;
	    }
	
	
	    private long b(zr p3)
	    {
	        return ((long) p3.b);
	    }
	
	
	    public static zr b(android.view.View p1)
	    {
	        zr v0_2;
	        if (p1 != null) {
	            v0_2 = ((zi) p1.getLayoutParams()).c;
	        } else {
	            v0_2 = 0;
	        }
	        return v0_2;
	    }
	
	
	    private void b(int p3)
	    {
	        if (p3 != this.K) {
	            this.K = p3;
	            if (p3 != 2) {
	                this.m();
	            }
	            if (this.o != null) {
	                this.o.a(p3);
	            }
	            if (this.p != null) {
	                int v1 = (this.p.size() - 1);
	                while (v1 >= 0) {
	                    ((zj) this.p.get(v1)).a(p3);
	                    v1--;
	                }
	            }
	        }
	        return;
	    }
	
	
	    public static synthetic void b(android.support.v7.widget.RecyclerView p0, int p1)
	    {
	        p0.b(p1);
	        return;
	    }
	
	
	    public static synthetic void b(android.support.v7.widget.RecyclerView p0, android.view.View p1)
	    {
	        android.support.v7.widget.RecyclerView.b(p1);
	        return;
	    }
	
	
	    public static synthetic boolean b(android.support.v7.widget.RecyclerView p1)
	    {
	        return p1.h;
	    }
	
	
	    public static synthetic boolean b(android.support.v7.widget.RecyclerView p1, boolean p2)
	    {
	        p1.G = 1;
	        return 1;
	    }
	
	
	    public static synthetic boolean c(android.support.v7.widget.RecyclerView p1)
	    {
	        return p1.E;
	    }
	
	
	    public static synthetic boolean c(android.support.v7.widget.RecyclerView p5, android.view.View p6)
	    {
	        int v0 = 1;
	        p5.a();
	        zr v2_0 = p5.c;
	        zl v3_1 = v2_0.a.a(p6);
	        if (v3_1 != -1) {
	            if (!v2_0.b.b(v3_1)) {
	                v0 = 0;
	            } else {
	                v2_0.b.c(v3_1);
	                v2_0.c.remove(p6);
	                v2_0.a.a(v3_1);
	            }
	        } else {
	            v2_0.c.remove(p6);
	        }
	        if (v0 != 0) {
	            zr v2_3 = android.support.v7.widget.RecyclerView.b(p6);
	            p5.a.b(v2_3);
	            p5.a.a(v2_3);
	        }
	        p5.a(0);
	        return v0;
	    }
	
	
	    public static synthetic zh d(android.support.v7.widget.RecyclerView p1)
	    {
	        return p1.e;
	    }
	
	
	    private void d(int p3, int p4)
	    {
	        int v0_0 = 0;
	        if ((this.i != null) && ((!this.i.a()) && (p3 > 0))) {
	            v0_0 = this.i.c();
	        }
	        if ((this.k != null) && ((!this.k.a()) && (p3 < 0))) {
	            v0_0 |= this.k.c();
	        }
	        if ((this.j != null) && ((!this.j.a()) && (p4 > 0))) {
	            v0_0 |= this.j.c();
	        }
	        if ((this.l != null) && ((!this.l.a()) && (p4 < 0))) {
	            v0_0 |= this.l.c();
	        }
	        if (v0_0 != 0) {
	            gt.d(this);
	        }
	        return;
	    }
	
	
	    private void e(int p5, int p6)
	    {
	        int v2 = android.view.View$MeasureSpec.getMode(p5);
	        int v3 = android.view.View$MeasureSpec.getMode(p6);
	        int v1 = android.view.View$MeasureSpec.getSize(p5);
	        int v0 = android.view.View$MeasureSpec.getSize(p6);
	        switch (v2) {
	            case -2147483648:
	            case 1073741824:
	                break;
	            case -2147483648:
	            case 1073741824:
	                break;
	            default:
	                v1 = gt.m(this);
	        }
	        switch (v3) {
	            case -2147483648:
	            case 1073741824:
	                break;
	            case -2147483648:
	            case 1073741824:
	                break;
	            default:
	                v0 = gt.n(this);
	        }
	        this.setMeasuredDimension(v1, v0);
	        return;
	    }
	
	
	    public static synthetic void e(android.support.v7.widget.RecyclerView p0)
	    {
	        p0.k();
	        return;
	    }
	
	
	    public static synthetic yz f(android.support.v7.widget.RecyclerView p1)
	    {
	        return p1.d;
	    }
	
	
	    private boolean f(int p7, int p8)
	    {
	        int v0 = 0;
	        int v3 = this.c.a();
	        if (v3 != 0) {
	            int v2_1 = 0;
	            while (v2_1 < v3) {
	                int v4_2 = android.support.v7.widget.RecyclerView.b(this.c.b(v2_1));
	                if (!v4_2.b()) {
	                    int v4_3 = v4_2.d();
	                    if ((v4_3 < p7) || (v4_3 > p8)) {
	                        v0 = 1;
	                        break;
	                    }
	                }
	                v2_1++;
	            }
	        } else {
	            if ((p7 != 0) || (p8 != 0)) {
	                v0 = 1;
	            }
	        }
	        return v0;
	    }
	
	
	    public static synthetic void g(android.support.v7.widget.RecyclerView p0)
	    {
	        p0.q();
	        return;
	    }
	
	
	    public static synthetic boolean h(android.support.v7.widget.RecyclerView p1)
	    {
	        return p1.g();
	    }
	
	
	    public static synthetic android.view.animation.Interpolator i()
	    {
	        return android.support.v7.widget.RecyclerView.ai;
	    }
	
	
	    public static synthetic void i(android.support.v7.widget.RecyclerView p0)
	    {
	        p0.r();
	        return;
	    }
	
	
	    public static synthetic java.util.ArrayList j(android.support.v7.widget.RecyclerView p1)
	    {
	        return p1.z;
	    }
	
	
	    public static synthetic boolean j()
	    {
	        return android.support.v7.widget.RecyclerView.s;
	    }
	
	
	    private void k()
	    {
	        this.x.run();
	        return;
	    }
	
	
	    public static synthetic boolean k(android.support.v7.widget.RecyclerView p1)
	    {
	        return p1.awakenScrollBars();
	    }
	
	
	    private void l()
	    {
	        this.b(0);
	        this.m();
	        return;
	    }
	
	
	    public static synthetic void l(android.support.v7.widget.RecyclerView p6)
	    {
	        if (!p6.h) {
	            p6.h = 1;
	            zl v2_0 = p6.c.b();
	            int v1_3 = 0;
	            while (v1_3 < v2_0) {
	                int v3_3 = android.support.v7.widget.RecyclerView.b(p6.c.c(v1_3));
	                if ((v3_3 != 0) && (!v3_3.b())) {
	                    v3_3.a(512);
	                }
	                v1_3++;
	            }
	            zl v2_1 = p6.a;
	            int v3_0 = v2_1.c.size();
	            int v1_5 = 0;
	            while (v1_5 < v3_0) {
	                int v0_3 = ((zr) v2_1.c.get(v1_5));
	                if (v0_3 != 0) {
	                    v0_3.a(512);
	                }
	                v1_5++;
	            }
	        }
	        return;
	    }
	
	
	    private void m()
	    {
	        zh v0_0 = this.V;
	        v0_0.e.removeCallbacks(v0_0);
	        v0_0.c.f();
	        // Both branches of the condition point to the same code.
	        // if (this.e == null) {
	            return;
	        // }
	    }
	
	
	    public static synthetic boolean m(android.support.v7.widget.RecyclerView p1)
	    {
	        return p1.H;
	    }
	
	
	    private void n()
	    {
	        int v0_0 = 0;
	        if (this.i != null) {
	            v0_0 = this.i.c();
	        }
	        if (this.j != null) {
	            v0_0 |= this.j.c();
	        }
	        if (this.k != null) {
	            v0_0 |= this.k.c();
	        }
	        if (this.l != null) {
	            v0_0 |= this.l.c();
	        }
	        if (v0_0 != 0) {
	            gt.d(this);
	        }
	        return;
	    }
	
	
	    public static synthetic boolean n(android.support.v7.widget.RecyclerView p1)
	    {
	        return p1.f;
	    }
	
	
	    private void o()
	    {
	        this.l = 0;
	        this.j = 0;
	        this.k = 0;
	        this.i = 0;
	        return;
	    }
	
	
	    public static synthetic boolean o(android.support.v7.widget.RecyclerView p1)
	    {
	        return p1.C;
	    }
	
	
	    public static synthetic Runnable p(android.support.v7.widget.RecyclerView p1)
	    {
	        return p1.x;
	    }
	
	
	    private void p()
	    {
	        if (this.M != null) {
	            this.M.clear();
	        }
	        this.stopNestedScroll();
	        this.n();
	        this.b(0);
	        return;
	    }
	
	
	    public static synthetic android.view.accessibility.AccessibilityManager q(android.support.v7.widget.RecyclerView p1)
	    {
	        return p1.I;
	    }
	
	
	    private void q()
	    {
	        this.J = (this.J + 1);
	        return;
	    }
	
	
	    public static synthetic zs r(android.support.v7.widget.RecyclerView p1)
	    {
	        return p1.ab;
	    }
	
	
	    private void r()
	    {
	        this.J = (this.J - 1);
	        if (this.J <= 0) {
	            this.J = 0;
	            int v0_3 = this.F;
	            this.F = 0;
	            if ((v0_3 != 0) && ((this.I != null) && (this.I.isEnabled()))) {
	                android.view.accessibility.AccessibilityEvent v1_4 = android.view.accessibility.AccessibilityEvent.obtain();
	                v1_4.setEventType(2048);
	                iz.a(v1_4, v0_3);
	                this.sendAccessibilityEventUnchecked(v1_4);
	            }
	        }
	        return;
	    }
	
	
	    public static synthetic s s(android.support.v7.widget.RecyclerView p1)
	    {
	        return 0;
	    }
	
	
	    private void s()
	    {
	        if ((!this.aa) && (this.C)) {
	            gt.a(this, this.ah);
	            this.aa = 1;
	        }
	        return;
	    }
	
	
	    private void t()
	    {
	        int v2 = 1;
	        if (this.h) {
	            this.b.a();
	            this.w();
	            this.e.b();
	        }
	        if ((this.m == null) || (!this.e.g())) {
	            this.b.e();
	        } else {
	            this.b.b();
	        }
	        if (((!this.q) || (this.r)) && ((!this.q) && ((!this.r) || (!this.g())))) {
	            int v0_13 = 0;
	        } else {
	            v0_13 = 1;
	        }
	        if (((this.g) && ((this.m != null) && ((this.h) || ((v0_13 != 0) || (zh.a(this.e)))))) && (!this.h)) {
	            int v3_6 = 1;
	        } else {
	            v3_6 = 0;
	        }
	        this.n.k = v3_6;
	        if ((!this.n.k) || ((v0_13 == 0) || (this.h))) {
	            v2 = 0;
	        } else {
	            if ((this.m == null) || (!this.e.g())) {
	                int v0_18 = 0;
	            } else {
	                v0_18 = 1;
	            }
	            if (v0_18 == 0) {
	            }
	        }
	        this.n.l = v2;
	        return;
	    }
	
	
	    private void u()
	    {
	        int v1 = 0;
	        int v3_0 = this.c.b();
	        zl v2_0 = 0;
	        while (v2_0 < v3_0) {
	            ((zi) this.c.c(v2_0).getLayoutParams()).e = 1;
	            v2_0++;
	        }
	        zl v2_1 = this.a;
	        int v3_1 = v2_1.c.size();
	        while (v1 < v3_1) {
	            int v0_7 = ((zi) ((zr) v2_1.c.get(v1)).a.getLayoutParams());
	            if (v0_7 != 0) {
	                v0_7.e = 1;
	            }
	            v1++;
	        }
	        return;
	    }
	
	
	    private void v()
	    {
	        int v1 = 0;
	        int v2_0 = this.c.b();
	        int v0_1 = 0;
	        while (v0_1 < v2_0) {
	            zl v3_3 = android.support.v7.widget.RecyclerView.b(this.c.c(v0_1));
	            if (!v3_3.b()) {
	                v3_3.a();
	            }
	            v0_1++;
	        }
	        zl v3_0 = this.a;
	        int v4_0 = v3_0.c.size();
	        int v2_1 = 0;
	        while (v2_1 < v4_0) {
	            ((zr) v3_0.c.get(v2_1)).a();
	            v2_1++;
	        }
	        int v4_1 = v3_0.a.size();
	        int v2_2 = 0;
	        while (v2_2 < v4_1) {
	            ((zr) v3_0.a.get(v2_2)).a();
	            v2_2++;
	        }
	        if (v3_0.b != null) {
	            int v2_3 = v3_0.b.size();
	            while (v1 < v2_3) {
	                ((zr) v3_0.b.get(v1)).a();
	                v1++;
	            }
	        }
	        return;
	    }
	
	
	    private void w()
	    {
	        yz v1_0 = this.c.b();
	        int v0_1 = 0;
	        while (v0_1 < v1_0) {
	            zr v2_2 = android.support.v7.widget.RecyclerView.b(this.c.c(v0_1));
	            if ((v2_2 != null) && (!v2_2.b())) {
	                v2_2.a(6);
	            }
	            v0_1++;
	        }
	        this.u();
	        int v0_2 = this.a;
	        // Both branches of the condition point to the same code.
	        // if (v0_2.e.d == null) {
	            v0_2.b();
	            return;
	        // }
	    }
	
	
	    public final zr a(android.view.View p4)
	    {
	        IllegalArgumentException v0_0 = p4.getParent();
	        if ((v0_0 == null) || (v0_0 == this)) {
	            return android.support.v7.widget.RecyclerView.b(p4);
	        } else {
	            throw new IllegalArgumentException(new StringBuilder("View ").append(p4).append(" is not a direct child of ").append(this).toString());
	        }
	    }
	
	
	    public final void a()
	    {
	        if (!this.D) {
	            this.D = 1;
	            this.E = 0;
	        }
	        return;
	    }
	
	
	    public final void a(int p3)
	    {
	        this.l();
	        if (this.e != null) {
	            this.e.c(p3);
	            this.awakenScrollBars();
	        } else {
	            android.util.Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
	        }
	        return;
	    }
	
	
	    public final void a(int p14, int p15)
	    {
	        if (this.e != null) {
	            int v3;
	            if (this.e.i()) {
	                v3 = p14;
	            } else {
	                v3 = 0;
	            }
	            int v4;
	            if (this.e.j()) {
	                v4 = p15;
	            } else {
	                v4 = 0;
	            }
	            if ((v3 != 0) || (v4 != 0)) {
	                int v0_5;
	                zq v7 = this.V;
	                int v5_0 = Math.abs(v3);
	                int v6 = Math.abs(v4);
	                if (v5_0 <= v6) {
	                    v0_5 = 0;
	                } else {
	                    v0_5 = 1;
	                }
	                int v2_3;
	                int v8_2 = ((int) Math.sqrt(((double) 0)));
	                float v9_1 = ((int) Math.sqrt(((double) ((v3 * v3) + (v4 * v4)))));
	                if (v0_5 == 0) {
	                    v2_3 = v7.e.getHeight();
	                } else {
	                    v2_3 = v7.e.getWidth();
	                }
	                int v0_11;
	                float v10_2 = (v2_3 / 2);
	                float v9_8 = ((zq.a(Math.min(1065353216, ((((float) v9_1) * 1065353216) / ((float) v2_3)))) * ((float) v10_2)) + ((float) v10_2));
	                if (v8_2 <= 0) {
	                    int v0_6;
	                    if (v0_5 == 0) {
	                        v0_6 = v6;
	                    } else {
	                        v0_6 = v5_0;
	                    }
	                    v0_11 = ((int) (((((float) v0_6) / ((float) v2_3)) + 1065353216) * 1133903872));
	                } else {
	                    v0_11 = (Math.round((1148846080 * Math.abs((v9_8 / ((float) v8_2))))) * 4);
	                }
	                int v5_1 = Math.min(v0_11, 2000);
	                int v0_15 = android.support.v7.widget.RecyclerView.ai;
	                if (v7.d != v0_15) {
	                    v7.d = v0_15;
	                    v7.c = lr.a(v7.e.getContext(), v0_15);
	                }
	                v7.e.b(2);
	                v7.b = 0;
	                v7.a = 0;
	                v7.c.a(0, 0, v3, v4, v5_1);
	                v7.a();
	            }
	        } else {
	            android.util.Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
	        }
	        return;
	    }
	
	
	    public final void a(int p9, int p10, boolean p11)
	    {
	        int v1_0 = (p9 + p10);
	        zl v2_0 = this.c.b();
	        int v0_1 = 0;
	        while (v0_1 < v2_0) {
	            zp v3_3 = android.support.v7.widget.RecyclerView.b(this.c.c(v0_1));
	            if ((v3_3 != null) && (!v3_3.b())) {
	                if (v3_3.b < v1_0) {
	                    if (v3_3.b >= p9) {
	                        int v4_6 = (p9 - 1);
	                        int v5 = (- p10);
	                        v3_3.a(8);
	                        v3_3.a(v5, p11);
	                        v3_3.b = v4_6;
	                        this.n.i = 1;
	                    }
	                } else {
	                    v3_3.a((- p10), p11);
	                    this.n.i = 1;
	                }
	            }
	            v0_1++;
	        }
	        zl v2_1 = this.a;
	        zp v3_0 = (p9 + p10);
	        int v1_1 = (v2_1.c.size() - 1);
	        while (v1_1 >= 0) {
	            int v0_7 = ((zr) v2_1.c.get(v1_1));
	            if (v0_7 != 0) {
	                if (v0_7.d() < v3_0) {
	                    if (v0_7.d() >= p9) {
	                        v0_7.a(8);
	                        v2_1.b(v1_1);
	                    }
	                } else {
	                    v0_7.a((- p10), p11);
	                }
	            }
	            v1_1--;
	        }
	        this.requestLayout();
	        return;
	    }
	
	
	    public final void a(String p3)
	    {
	        if (!this.f()) {
	            return;
	        } else {
	            if (p3 != null) {
	                throw new IllegalStateException(p3);
	            } else {
	                throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling");
	            }
	        }
	    }
	
	
	    public final void a(yz p5)
	    {
	        if (this.d != null) {
	            this.d.a.unregisterObserver(this.u);
	        }
	        if (this.m != null) {
	            this.m.d();
	        }
	        if (this.e != null) {
	            int v1_1 = this.e;
	            yz v2_0 = this.a;
	            zp v0_7 = (v1_1.n() - 1);
	            while (v0_7 >= null) {
	                if (!android.support.v7.widget.RecyclerView.b(v1_1.f(v0_7)).b()) {
	                    v1_1.a(v0_7, v2_0);
	                }
	                v0_7--;
	            }
	            this.e.a(this.a);
	        }
	        this.a.a();
	        this.b.a();
	        zp v0_11 = this.d;
	        this.d = p5;
	        if (p5 != null) {
	            p5.a.registerObserver(this.u);
	        }
	        int v1_4 = this.a;
	        yz v2_2 = this.d;
	        v1_4.a();
	        int v1_5 = v1_4.c();
	        if (v0_11 != null) {
	            v1_5.c = (v1_5.c - 1);
	        }
	        if (v1_5.c == 0) {
	            v1_5.a.clear();
	        }
	        if (v2_2 != null) {
	            v1_5.c = (v1_5.c + 1);
	        }
	        this.n.i = 1;
	        this.w();
	        this.requestLayout();
	        return;
	    }
	
	
	    public final void a(zc p3)
	    {
	        if (this.m != null) {
	            this.m.d();
	            this.m.h = 0;
	        }
	        this.m = p3;
	        if (this.m != null) {
	            this.m.h = this.W;
	        }
	        return;
	    }
	
	
	    public final void a(zf p3)
	    {
	        if (this.e != null) {
	            this.e.a("Cannot add item decoration during a scroll  or layout");
	        }
	        if (this.z.isEmpty()) {
	            this.setWillNotDraw(0);
	        }
	        this.z.add(p3);
	        this.u();
	        this.requestLayout();
	        return;
	    }
	
	
	    public final void a(zh p4)
	    {
	        if (p4 != this.e) {
	            if (this.e != null) {
	                if (this.C) {
	                    this.e.a(this, this.a);
	                }
	                this.e.a(0);
	            }
	            this.a.a();
	            zh v0_6 = this.c;
	            v0_6.b.a();
	            v0_6.c.clear();
	            v0_6.a.b();
	            this.e = p4;
	            if (p4 != null) {
	                if (p4.e == null) {
	                    this.e.a(this);
	                } else {
	                    throw new IllegalArgumentException(new StringBuilder("LayoutManager ").append(p4).append(" is already attached to a RecyclerView: ").append(p4.e).toString());
	                }
	            }
	            this.requestLayout();
	        }
	        return;
	    }
	
	
	    public final void a(boolean p3)
	    {
	        if (this.D) {
	            if ((p3) && ((this.E) && ((this.e != null) && (this.d != null)))) {
	                this.h();
	            }
	            this.D = 0;
	            this.E = 0;
	        }
	        return;
	    }
	
	
	    public void addFocusables(java.util.ArrayList p1, int p2, int p3)
	    {
	        super.addFocusables(p1, p2, p3);
	        return;
	    }
	
	
	    public final void b()
	    {
	        if (this.i == null) {
	            this.i = new lc(this.getContext());
	            if (!this.w) {
	                this.i.a(this.getMeasuredHeight(), this.getMeasuredWidth());
	            } else {
	                this.i.a(((this.getMeasuredHeight() - this.getPaddingTop()) - this.getPaddingBottom()), ((this.getMeasuredWidth() - this.getPaddingLeft()) - this.getPaddingRight()));
	            }
	        }
	        return;
	    }
	
	
	    public boolean b(int p12, int p13)
	    {
	        int v1 = 0;
	        if (this.e != null) {
	            lr v0_2 = this.e.i();
	            int v2_1 = this.e.j();
	            if ((v0_2 == null) || (Math.abs(p12) < this.S)) {
	                p12 = 0;
	            }
	            if ((v2_1 == 0) || (Math.abs(p13) < this.S)) {
	                p13 = 0;
	            }
	            if (((p12 != 0) || (p13 != 0)) && (!this.dispatchNestedPreFling(((float) p12), ((float) p13)))) {
	                if ((v0_2 == null) && (v2_1 == 0)) {
	                    lr v0_3 = 0;
	                } else {
	                    v0_3 = 1;
	                }
	                this.dispatchNestedFling(((float) p12), ((float) p13), v0_3);
	                if (v0_3 != null) {
	                    int v3_5 = Math.max((- this.T), Math.min(p12, this.T));
	                    int v4_3 = Math.max((- this.T), Math.min(p13, this.T));
	                    zq v10 = this.V;
	                    v10.e.b(2);
	                    v10.b = 0;
	                    v10.a = 0;
	                    v10.c.a(0, 0, v3_5, v4_3, -2147483648, 2147483647, -2147483648, 2147483647);
	                    v10.a();
	                    v1 = 1;
	                }
	            }
	        } else {
	            android.util.Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
	        }
	        return v1;
	    }
	
	
	    public final android.graphics.Rect c(android.view.View p8)
	    {
	        android.graphics.Rect v0_2;
	        android.graphics.Rect v0_1 = ((zi) p8.getLayoutParams());
	        if (v0_1.e) {
	            android.graphics.Rect v2 = v0_1.d;
	            v2.set(0, 0, 0, 0);
	            int v5 = this.z.size();
	            int v3 = 0;
	            while (v3 < v5) {
	                this.y.set(0, 0, 0, 0);
	                ((zf) this.z.get(v3)).a(this.y, p8, this);
	                v2.left = (v2.left + this.y.left);
	                v2.top = (v2.top + this.y.top);
	                v2.right = (v2.right + this.y.right);
	                v2.bottom = (v2.bottom + this.y.bottom);
	                v3++;
	            }
	            v0_1.e = 0;
	            v0_2 = v2;
	        } else {
	            v0_2 = v0_1.d;
	        }
	        return v0_2;
	    }
	
	
	    public final void c()
	    {
	        if (this.k == null) {
	            this.k = new lc(this.getContext());
	            if (!this.w) {
	                this.k.a(this.getMeasuredHeight(), this.getMeasuredWidth());
	            } else {
	                this.k.a(((this.getMeasuredHeight() - this.getPaddingTop()) - this.getPaddingBottom()), ((this.getMeasuredWidth() - this.getPaddingLeft()) - this.getPaddingRight()));
	            }
	        }
	        return;
	    }
	
	
	    public final void c(int p3, int p4)
	    {
	        this.onScrollChanged(this.getScrollX(), this.getScrollY(), this.getScrollX(), this.getScrollY());
	        if (this.o != null) {
	            this.o.a(this, p3, p4);
	        }
	        if (this.p != null) {
	            int v1_1 = (this.p.size() - 1);
	            while (v1_1 >= 0) {
	                ((zj) this.p.get(v1_1)).a(this, p3, p4);
	                v1_1--;
	            }
	        }
	        return;
	    }
	
	
	    public boolean checkLayoutParams(android.view.ViewGroup$LayoutParams p2)
	    {
	        if ((!(p2 instanceof zi)) || (!this.e.a(((zi) p2)))) {
	            int v0_3 = 0;
	        } else {
	            v0_3 = 1;
	        }
	        return v0_3;
	    }
	
	
	    public int computeHorizontalScrollExtent()
	    {
	        int v0_2;
	        if (!this.e.i()) {
	            v0_2 = 0;
	        } else {
	            v0_2 = this.e.c(this.n);
	        }
	        return v0_2;
	    }
	
	
	    public int computeHorizontalScrollOffset()
	    {
	        int v0_2;
	        if (!this.e.i()) {
	            v0_2 = 0;
	        } else {
	            v0_2 = this.e.a(this.n);
	        }
	        return v0_2;
	    }
	
	
	    public int computeHorizontalScrollRange()
	    {
	        int v0_2;
	        if (!this.e.i()) {
	            v0_2 = 0;
	        } else {
	            v0_2 = this.e.e(this.n);
	        }
	        return v0_2;
	    }
	
	
	    public int computeVerticalScrollExtent()
	    {
	        int v0_2;
	        if (!this.e.j()) {
	            v0_2 = 0;
	        } else {
	            v0_2 = this.e.d(this.n);
	        }
	        return v0_2;
	    }
	
	
	    public int computeVerticalScrollOffset()
	    {
	        int v0_2;
	        if (!this.e.j()) {
	            v0_2 = 0;
	        } else {
	            v0_2 = this.e.b(this.n);
	        }
	        return v0_2;
	    }
	
	
	    public int computeVerticalScrollRange()
	    {
	        int v0_2;
	        if (!this.e.j()) {
	            v0_2 = 0;
	        } else {
	            v0_2 = this.e.f(this.n);
	        }
	        return v0_2;
	    }
	
	
	    public final void d()
	    {
	        if (this.j == null) {
	            this.j = new lc(this.getContext());
	            if (!this.w) {
	                this.j.a(this.getMeasuredWidth(), this.getMeasuredHeight());
	            } else {
	                this.j.a(((this.getMeasuredWidth() - this.getPaddingLeft()) - this.getPaddingRight()), ((this.getMeasuredHeight() - this.getPaddingTop()) - this.getPaddingBottom()));
	            }
	        }
	        return;
	    }
	
	
	    public boolean dispatchNestedFling(float p3, float p4, boolean p5)
	    {
	        boolean v0_1;
	        boolean v0_0 = this.ad;
	        if ((!v0_0.c) || (v0_0.b == null)) {
	            v0_1 = 0;
	        } else {
	            v0_1 = ic.a(v0_0.b, v0_0.a, p3, p4, p5);
	        }
	        return v0_1;
	    }
	
	
	    public boolean dispatchNestedPreFling(float p3, float p4)
	    {
	        boolean v0_1;
	        boolean v0_0 = this.ad;
	        if ((!v0_0.c) || (v0_0.b == null)) {
	            v0_1 = 0;
	        } else {
	            v0_1 = ic.a(v0_0.b, v0_0.a, p3, p4);
	        }
	        return v0_1;
	    }
	
	
	    public boolean dispatchNestedPreScroll(int p8, int p9, int[] p10, int[] p11)
	    {
	        int v0 = 1;
	        int v1 = 0;
	        int v4_0 = this.ad;
	        if ((!v4_0.c) || (v4_0.b == null)) {
	            v0 = 0;
	            v1 = v0;
	        } else {
	            if ((p8 == 0) && (p9 == 0)) {
	                if (p11 == null) {
	                } else {
	                    p11[0] = 0;
	                    p11[1] = 0;
	                }
	            } else {
	                int v3_0;
	                int v2_2;
	                if (p11 == null) {
	                    v2_2 = 0;
	                    v3_0 = 0;
	                } else {
	                    v4_0.a.getLocationInWindow(p11);
	                    v3_0 = p11[0];
	                    v2_2 = p11[1];
	                }
	                if (p10 == null) {
	                    if (v4_0.d == null) {
	                        int[] v5_2 = new int[2];
	                        v4_0.d = v5_2;
	                    }
	                    p10 = v4_0.d;
	                }
	                p10[0] = 0;
	                p10[1] = 0;
	                ic.a(v4_0.b, v4_0.a, p8, p9, p10);
	                if (p11 != null) {
	                    v4_0.a.getLocationInWindow(p11);
	                    p11[0] = (p11[0] - v3_0);
	                    p11[1] = (p11[1] - v2_2);
	                }
	                if ((p10[0] != 0) || (p10[1] != 0)) {
	                }
	            }
	        }
	        return v1;
	    }
	
	
	    public boolean dispatchNestedScroll(int p10, int p11, int p12, int p13, int[] p14)
	    {
	        int v0_4;
	        gj v8 = this.ad;
	        if ((!v8.c) || (v8.b == null)) {
	            v0_4 = 0;
	        } else {
	            if ((p10 == 0) && ((p11 == 0) && ((p12 == 0) && (p13 == 0)))) {
	                if (p14 == null) {
	                } else {
	                    p14[0] = 0;
	                    p14[1] = 0;
	                }
	            } else {
	                int v6;
	                int v7;
	                if (p14 == null) {
	                    v6 = 0;
	                    v7 = 0;
	                } else {
	                    v8.a.getLocationInWindow(p14);
	                    v6 = p14[1];
	                    v7 = p14[0];
	                }
	                ic.a(v8.b, v8.a, p10, p11, p12, p13);
	                if (p14 != null) {
	                    v8.a.getLocationInWindow(p14);
	                    p14[0] = (p14[0] - v7);
	                    p14[1] = (p14[1] - v6);
	                }
	                v0_4 = 1;
	            }
	        }
	        return v0_4;
	    }
	
	
	    protected void dispatchRestoreInstanceState(android.util.SparseArray p1)
	    {
	        this.dispatchThawSelfOnly(p1);
	        return;
	    }
	
	
	    protected void dispatchSaveInstanceState(android.util.SparseArray p1)
	    {
	        this.dispatchFreezeSelfOnly(p1);
	        return;
	    }
	
	
	    public void draw(android.graphics.Canvas p8)
	    {
	        int v2 = 1;
	        int v1_0 = 0;
	        super.draw(p8);
	        int v3_0 = this.z.size();
	        int v0_1 = 0;
	        while (v0_1 < v3_0) {
	            this.z.get(v0_1);
	            v0_1++;
	        }
	        if ((this.i == null) || (this.i.a())) {
	            int v0_5 = 0;
	        } else {
	            int v0_7;
	            int v3_1 = p8.save();
	            if (!this.w) {
	                v0_7 = 0;
	            } else {
	                v0_7 = this.getPaddingBottom();
	            }
	            p8.rotate(1132920832);
	            p8.translate(((float) (v0_7 + (- this.getHeight()))), 0);
	            if ((this.i == null) || (!this.i.a(p8))) {
	                v0_5 = 0;
	            } else {
	                v0_5 = 1;
	            }
	            p8.restoreToCount(v3_1);
	        }
	        if ((this.j != null) && (!this.j.a())) {
	            boolean v4_4 = p8.save();
	            if (this.w) {
	                p8.translate(((float) this.getPaddingLeft()), ((float) this.getPaddingTop()));
	            }
	            if ((this.j == null) || (!this.j.a(p8))) {
	                int v3_11 = 0;
	            } else {
	                v3_11 = 1;
	            }
	            v0_5 |= v3_11;
	            p8.restoreToCount(v4_4);
	        }
	        if ((this.k != null) && (!this.k.a())) {
	            int v3_16;
	            boolean v4_5 = p8.save();
	            float v5_2 = this.getWidth();
	            if (!this.w) {
	                v3_16 = 0;
	            } else {
	                v3_16 = this.getPaddingTop();
	            }
	            int v3_22;
	            p8.rotate(1119092736);
	            p8.translate(((float) (- v3_16)), ((float) (- v5_2)));
	            if ((this.k == null) || (!this.k.a(p8))) {
	                v3_22 = 0;
	            } else {
	                v3_22 = 1;
	            }
	            v0_5 |= v3_22;
	            p8.restoreToCount(v4_5);
	        }
	        if ((this.l != null) && (!this.l.a())) {
	            int v3_26 = p8.save();
	            p8.rotate(1127481344);
	            if (!this.w) {
	                p8.translate(((float) (- this.getWidth())), ((float) (- this.getHeight())));
	            } else {
	                p8.translate(((float) ((- this.getWidth()) + this.getPaddingRight())), ((float) ((- this.getHeight()) + this.getPaddingBottom())));
	            }
	            if ((this.l != null) && (this.l.a(p8))) {
	                v1_0 = 1;
	            }
	            v0_5 |= v1_0;
	            p8.restoreToCount(v3_26);
	        }
	        if ((v0_5 != 0) || ((this.m == null) || ((this.z.size() <= 0) || (!this.m.b())))) {
	            v2 = v0_5;
	        }
	        if (v2 != 0) {
	            gt.d(this);
	        }
	        return;
	    }
	
	
	    public boolean drawChild(android.graphics.Canvas p2, android.view.View p3, long p4)
	    {
	        return super.drawChild(p2, p3, p4);
	    }
	
	
	    public final void e()
	    {
	        if (this.l == null) {
	            this.l = new lc(this.getContext());
	            if (!this.w) {
	                this.l.a(this.getMeasuredWidth(), this.getMeasuredHeight());
	            } else {
	                this.l.a(((this.getMeasuredWidth() - this.getPaddingLeft()) - this.getPaddingRight()), ((this.getMeasuredHeight() - this.getPaddingTop()) - this.getPaddingBottom()));
	            }
	        }
	        return;
	    }
	
	
	    public final boolean f()
	    {
	        int v0_1;
	        if (this.J <= 0) {
	            v0_1 = 0;
	        } else {
	            v0_1 = 1;
	        }
	        return v0_1;
	    }
	
	
	    public android.view.View focusSearch(android.view.View p4, int p5)
	    {
	        android.view.View v0_1 = android.view.FocusFinder.getInstance().findNextFocus(this, p4, p5);
	        if ((v0_1 == null) && ((this.d != null) && ((this.e != null) && (!this.f())))) {
	            this.a();
	            v0_1 = this.e.c(p5, this.a, this.n);
	            this.a(0);
	        }
	        if (v0_1 == null) {
	            v0_1 = super.focusSearch(p4, p5);
	        }
	        return v0_1;
	    }
	
	
	    public boolean g()
	    {
	        if ((this.m == null) || (!this.m.m)) {
	            int v0_3 = 0;
	        } else {
	            v0_3 = 1;
	        }
	        return v0_3;
	    }
	
	
	    public android.view.ViewGroup$LayoutParams generateDefaultLayoutParams()
	    {
	        if (this.e != null) {
	            return this.e.f();
	        } else {
	            throw new IllegalStateException("RecyclerView has no LayoutManager");
	        }
	    }
	
	
	    public android.view.ViewGroup$LayoutParams generateLayoutParams(android.util.AttributeSet p3)
	    {
	        if (this.e != null) {
	            return this.e.a(this.getContext(), p3);
	        } else {
	            throw new IllegalStateException("RecyclerView has no LayoutManager");
	        }
	    }
	
	
	    public android.view.ViewGroup$LayoutParams generateLayoutParams(android.view.ViewGroup$LayoutParams p3)
	    {
	        if (this.e != null) {
	            return this.e.a(p3);
	        } else {
	            throw new IllegalStateException("RecyclerView has no LayoutManager");
	        }
	    }
	
	
	    public int getBaseline()
	    {
	        int v0_1;
	        if (this.e == null) {
	            v0_1 = super.getBaseline();
	        } else {
	            v0_1 = -1;
	        }
	        return v0_1;
	    }
	
	
	    protected int getChildDrawingOrder(int p2, int p3)
	    {
	        return super.getChildDrawingOrder(p2, p3);
	    }
	
	
	    public final void h()
	    {
	        if (this.d != null) {
	            if (this.e != null) {
	                zc v0_8;
	                this.n.e.clear();
	                this.a();
	                this.q();
	                this.t();
	                zr v1_0 = this.n;
	                if ((!this.n.k) || ((!this.r) || (!this.g()))) {
	                    v0_8 = 0;
	                } else {
	                    v0_8 = new ed();
	                }
	                v1_0.d = v0_8;
	                this.r = 0;
	                this.q = 0;
	                this.n.j = this.n.l;
	                this.n.f = this.d.a();
	                int v4_0 = this.ac;
	                int v5_0 = this.c.a();
	                if (v5_0 != 0) {
	                    zr v2_0 = 2147483647;
	                    zr v1_5 = -2147483648;
	                    int v3_0 = 0;
	                    while (v3_0 < v5_0) {
	                        zr v1_6;
	                        zc v0_16;
	                        zc v0_15 = android.support.v7.widget.RecyclerView.b(this.c.b(v3_0));
	                        if (v0_15.b()) {
	                            v0_16 = v1_5;
	                            v1_6 = v2_0;
	                        } else {
	                            v0_16 = v0_15.d();
	                            if (v0_16 < v2_0) {
	                                v2_0 = v0_16;
	                            }
	                            if (v0_16 <= v1_5) {
	                            } else {
	                                v1_6 = v2_0;
	                            }
	                        }
	                        v3_0++;
	                        v2_0 = v1_6;
	                        v1_5 = v0_16;
	                    }
	                    v4_0[0] = v2_0;
	                    v4_0[1] = v1_5;
	                } else {
	                    v4_0[0] = 0;
	                    v4_0[1] = 0;
	                }
	                if (this.n.k) {
	                    this.n.b.clear();
	                    this.n.c.clear();
	                    int v10_0 = this.c.a();
	                    int v6_1 = 0;
	                    while (v6_1 < v10_0) {
	                        zr v1_32 = android.support.v7.widget.RecyclerView.b(this.c.b(v6_1));
	                        if ((!v1_32.b()) && (!v1_32.j())) {
	                            int v5_9 = v1_32.a;
	                            this.n.b.put(v1_32, new zg(v1_32, v5_9.getLeft(), v5_9.getTop(), v5_9.getRight(), v5_9.getBottom()));
	                        }
	                        v6_1++;
	                    }
	                }
	                int v6_2;
	                if (!this.n.l) {
	                    this.v();
	                    this.b.e();
	                    if (this.n.d != null) {
	                        zr v1_7 = this.c.a();
	                        zc v0_30 = 0;
	                        while (v0_30 < v1_7) {
	                            zr v2_4 = android.support.v7.widget.RecyclerView.b(this.c.b(v0_30));
	                            if ((v2_4.l()) && ((!v2_4.n()) && (!v2_4.b()))) {
	                                this.n.d.put(Long.valueOf(this.b(v2_4)), v2_4);
	                                this.n.b.remove(v2_4);
	                            }
	                            v0_30++;
	                        }
	                    }
	                    v6_2 = 0;
	                } else {
	                    zr v1_8 = this.c.b();
	                    zc v0_32 = 0;
	                    while (v0_32 < v1_8) {
	                        zr v2_39 = android.support.v7.widget.RecyclerView.b(this.c.c(v0_32));
	                        if ((!v2_39.b()) && (v2_39.c == -1)) {
	                            v2_39.c = v2_39.b;
	                        }
	                        v0_32++;
	                    }
	                    if (this.n.d != null) {
	                        zr v1_9 = this.c.a();
	                        zc v0_36 = 0;
	                        while (v0_36 < v1_9) {
	                            zr v2_36 = android.support.v7.widget.RecyclerView.b(this.c.b(v0_36));
	                            if ((v2_36.l()) && ((!v2_36.n()) && (!v2_36.b()))) {
	                                this.n.d.put(Long.valueOf(this.b(v2_36)), v2_36);
	                                this.n.b.remove(v2_36);
	                            }
	                            v0_36++;
	                        }
	                    }
	                    zc v0_38 = this.n.i;
	                    this.n.i = 0;
	                    this.e.c(this.a, this.n);
	                    this.n.i = v0_38;
	                    int v3_10 = new ed();
	                    zr v1_13 = 0;
	                    while (v1_13 < this.c.a()) {
	                        int v4_8 = this.c.b(v1_13);
	                        if (!android.support.v7.widget.RecyclerView.b(v4_8).b()) {
	                            zr v2_32 = 0;
	                            while (v2_32 < this.n.b.size()) {
	                                if (((zr) this.n.b.b(v2_32)).a != v4_8) {
	                                    v2_32++;
	                                } else {
	                                    zc v0_160 = 1;
	                                }
	                                if (v0_160 == null) {
	                                    v3_10.put(v4_8, new android.graphics.Rect(v4_8.getLeft(), v4_8.getTop(), v4_8.getRight(), v4_8.getBottom()));
	                                }
	                            }
	                            v0_160 = 0;
	                        }
	                        v1_13++;
	                    }
	                    this.v();
	                    this.b.c();
	                    v6_2 = v3_10;
	                }
	                zc v0_50;
	                this.n.f = this.d.a();
	                this.n.h = 0;
	                this.n.j = 0;
	                this.e.c(this.a, this.n);
	                this.n.i = 0;
	                this.v = 0;
	                if ((!this.n.k) || (this.m == null)) {
	                    v0_50 = 0;
	                } else {
	                    v0_50 = 1;
	                }
	                this.n.k = v0_50;
	                if (this.n.k) {
	                    int v10_1;
	                    if (this.n.d == null) {
	                        v10_1 = 0;
	                    } else {
	                        v10_1 = new ed();
	                    }
	                    int v12 = this.c.a();
	                    int v11_0 = 0;
	                    while (v11_0 < v12) {
	                        zr v1_31 = android.support.v7.widget.RecyclerView.b(this.c.b(v11_0));
	                        if (!v1_31.b()) {
	                            int v5_6 = v1_31.a;
	                            zr v2_30 = this.b(v1_31);
	                            if ((v10_1 == 0) || (this.n.d.get(Long.valueOf(v2_30)) == null)) {
	                                this.n.c.put(v1_31, new zg(v1_31, v5_6.getLeft(), v5_6.getTop(), v5_6.getRight(), v5_6.getBottom()));
	                            } else {
	                                v10_1.put(Long.valueOf(v2_30), v1_31);
	                            }
	                        }
	                        v11_0++;
	                    }
	                    this.a(v6_2);
	                    zr v1_18 = (this.n.b.size() - 1);
	                    while (v1_18 >= null) {
	                        if (!this.n.c.containsKey(((zr) this.n.b.b(v1_18)))) {
	                            zc v0_141 = ((zg) this.n.b.c(v1_18));
	                            this.n.b.d(v1_18);
	                            this.a.b(v0_141.a);
	                            this.a(v0_141);
	                        }
	                        v1_18--;
	                    }
	                    zc v0_64 = this.n.c.size();
	                    if (v0_64 > null) {
	                        int v11_1 = (v0_64 - 1);
	                        while (v11_1 >= 0) {
	                            zr v1_30 = ((zr) this.n.c.b(v11_1));
	                            zc v0_126 = ((zg) this.n.c.c(v11_1));
	                            if ((this.n.b.isEmpty()) || (!this.n.b.containsKey(v1_30))) {
	                                int v3_15;
	                                this.n.c.d(v11_1);
	                                if (v6_2 == 0) {
	                                    v3_15 = 0;
	                                } else {
	                                    v3_15 = ((android.graphics.Rect) v6_2.get(v1_30.a));
	                                }
	                                int v4_5 = v0_126.b;
	                                int v5_5 = v0_126.c;
	                                if ((v3_15 == 0) || ((v3_15.left == v4_5) && (v3_15.top == v5_5))) {
	                                    v1_30.a(0);
	                                    this.m.b(v1_30);
	                                    this.s();
	                                } else {
	                                    v1_30.a(0);
	                                    if (this.m.a(v1_30, v3_15.left, v3_15.top, v4_5, v5_5)) {
	                                        this.s();
	                                    }
	                                }
	                            }
	                            v11_1--;
	                        }
	                    }
	                    int v11_2 = this.n.c.size();
	                    int v6_3 = 0;
	                    while (v6_3 < v11_2) {
	                        zr v1_28 = ((zr) this.n.c.b(v6_3));
	                        int v5_3 = ((zg) this.n.c.c(v6_3));
	                        int v3_13 = ((zg) this.n.b.get(v1_28));
	                        if ((v3_13 != 0) && ((v5_3 != 0) && ((v3_13.b != v5_3.b) || (v3_13.c != v5_3.c)))) {
	                            v1_28.a(0);
	                            if (this.m.a(v1_28, v3_13.b, v3_13.c, v5_3.b, v5_3.c)) {
	                                this.s();
	                            }
	                        }
	                        v6_3++;
	                    }
	                    zc v0_70;
	                    if (this.n.d == null) {
	                        v0_70 = 0;
	                    } else {
	                        v0_70 = this.n.d.size();
	                    }
	                    int v11_3 = (v0_70 - 1);
	                    while (v11_3 >= 0) {
	                        zr v2_7 = ((Long) this.n.d.b(v11_3)).longValue();
	                        zr v1_26 = ((zr) this.n.d.get(Long.valueOf(v2_7)));
	                        if ((!v1_26.b()) && ((this.a.b != null) && (this.a.b.contains(v1_26)))) {
	                            int v5_1;
	                            int v6_4;
	                            zr v2_9 = ((zr) v10_1.get(Long.valueOf(v2_7)));
	                            v1_26.a(0);
	                            this.a(v1_26);
	                            v1_26.g = v2_9;
	                            this.a.b(v1_26);
	                            int v3_11 = v1_26.a.getLeft();
	                            int v4_3 = v1_26.a.getTop();
	                            if ((v2_9 != null) && (!v2_9.b())) {
	                                v5_1 = v2_9.a.getLeft();
	                                v6_4 = v2_9.a.getTop();
	                                v2_9.a(0);
	                                v2_9.h = v1_26;
	                            } else {
	                                v6_4 = v4_3;
	                                v5_1 = v3_11;
	                            }
	                            this.m.a(v1_26, v2_9, v3_11, v4_3, v5_1, v6_4);
	                            this.s();
	                        }
	                        v11_3--;
	                    }
	                }
	                this.a(0);
	                this.e.a(this.a);
	                this.n.g = this.n.f;
	                this.h = 0;
	                this.n.k = 0;
	                this.n.l = 0;
	                this.r();
	                zh.a(this.e, 0);
	                if (this.a.b != null) {
	                    this.a.b.clear();
	                }
	                this.n.d = 0;
	                if (this.f(this.ac[0], this.ac[1])) {
	                    this.c(0, 0);
	                }
	            } else {
	                android.util.Log.e("RecyclerView", "No layout manager attached; skipping layout");
	            }
	        } else {
	            android.util.Log.e("RecyclerView", "No adapter attached; skipping layout");
	        }
	        return;
	    }
	
	
	    public boolean hasNestedScrollingParent()
	    {
	        return this.ad.a();
	    }
	
	
	    public boolean isAttachedToWindow()
	    {
	        return this.C;
	    }
	
	
	    public boolean isNestedScrollingEnabled()
	    {
	        return this.ad.c;
	    }
	
	
	    protected void onAttachedToWindow()
	    {
	        super.onAttachedToWindow();
	        this.J = 0;
	        this.C = 1;
	        this.g = 0;
	        this.aa = 0;
	        return;
	    }
	
	
	    protected void onDetachedFromWindow()
	    {
	        super.onDetachedFromWindow();
	        if (this.m != null) {
	            this.m.d();
	        }
	        this.g = 0;
	        this.l();
	        this.C = 0;
	        if (this.e != null) {
	            this.e.a(this, this.a);
	        }
	        this.removeCallbacks(this.ah);
	        return;
	    }
	
	
	    public void onDraw(android.graphics.Canvas p4)
	    {
	        super.onDraw(p4);
	        int v1 = this.z.size();
	        int v0_1 = 0;
	        while (v0_1 < v1) {
	            this.z.get(v0_1);
	            v0_1++;
	        }
	        return;
	    }
	
	
	    public boolean onGenericMotionEvent(android.view.MotionEvent p9)
	    {
	        float v1_0 = 0;
	        if ((this.e != null) && (((gd.d(p9) & 2) != 0) && (p9.getAction() == 8))) {
	            int v0_6;
	            if (!this.e.j()) {
	                v0_6 = 0;
	            } else {
	                v0_6 = (- gd.e(p9, 9));
	            }
	            int v2_3;
	            if (!this.e.i()) {
	                v2_3 = 0;
	            } else {
	                v2_3 = gd.e(p9, 10);
	            }
	            if ((v0_6 != 0) || (v2_3 != 0)) {
	                if (this.U != 1) {
	                    v1_0 = this.U;
	                } else {
	                    android.util.TypedValue v3_5 = new android.util.TypedValue();
	                    if (this.getContext().getTheme().resolveAttribute(16842829, v3_5, 1)) {
	                        this.U = v3_5.getDimension(this.getContext().getResources().getDisplayMetrics());
	                    }
	                }
	                this.a(((int) (v2_3 * v1_0)), ((int) (v0_6 * v1_0)), p9);
	            }
	        }
	        return 0;
	    }
	
	
	    public boolean onInterceptTouchEvent(android.view.MotionEvent p11)
	    {
	        int v1_0 = -1;
	        int v2_0 = 1;
	        int v5_0 = p11.getAction();
	        if ((v5_0 == 3) || (v5_0 == 0)) {
	            this.B = 0;
	        }
	        int v6_0 = this.A.size();
	        int v4_0 = 0;
	        while (v4_0 < v6_0) {
	            int v0_5 = ((s) this.A.get(v4_0));
	            if ((!v0_5.a()) || (v5_0 == 3)) {
	                v4_0++;
	            } else {
	                this.B = v0_5;
	                int v0_2 = 1;
	            }
	            if (v0_2 == 0) {
	                if (this.e != null) {
	                    int v0_9 = this.e.i();
	                    int v4_2 = this.e.j();
	                    if (this.M == null) {
	                        this.M = android.view.VelocityTracker.obtain();
	                    }
	                    this.M.addMovement(p11);
	                    int v5_4 = gd.a(p11);
	                    int v6_1 = gd.b(p11);
	                    switch (v5_4) {
	                        case 0:
	                            this.L = gd.b(p11, 0);
	                            int v1_10 = ((int) (p11.getX() + 1056964608));
	                            this.P = v1_10;
	                            this.N = v1_10;
	                            int v1_13 = ((int) (p11.getY() + 1056964608));
	                            this.Q = v1_13;
	                            this.O = v1_13;
	                            if (this.K == 2) {
	                                this.getParent().requestDisallowInterceptTouchEvent(1);
	                                this.b(1);
	                            }
	                            int v0_26;
	                            if (v0_9 == 0) {
	                                v0_26 = 0;
	                            } else {
	                                v0_26 = 1;
	                            }
	                            if (v4_2 != 0) {
	                                v0_26 |= 2;
	                            }
	                            this.startNestedScroll(v0_26);
	                            break;
	                        case 1:
	                            this.M.clear();
	                            this.stopNestedScroll();
	                            break;
	                        case 2:
	                            int v5_6 = gd.a(p11, this.L);
	                            if (v5_6 >= 0) {
	                                if (this.K == 1) {
	                                } else {
	                                    int v0_18;
	                                    int v6_5 = (((int) (gd.c(p11, v5_6) + 1056964608)) - this.N);
	                                    int v5_10 = (((int) (gd.d(p11, v5_6) + 1056964608)) - this.O);
	                                    if ((v0_9 == 0) || (Math.abs(v6_5) <= this.R)) {
	                                        v0_18 = 0;
	                                    } else {
	                                        int v0_19;
	                                        if (v6_5 >= 0) {
	                                            v0_19 = 1;
	                                        } else {
	                                            v0_19 = -1;
	                                        }
	                                        this.P = ((v0_19 * this.R) + this.N);
	                                        v0_18 = 1;
	                                    }
	                                    if ((v4_2 != 0) && (Math.abs(v5_10) > this.R)) {
	                                        if (v5_10 >= 0) {
	                                            v1_0 = 1;
	                                        }
	                                        this.Q = (this.O + (v1_0 * this.R));
	                                        v0_18 = 1;
	                                    }
	                                    if (v0_18 == 0) {
	                                    } else {
	                                        this.b(1);
	                                    }
	                                }
	                            } else {
	                                android.util.Log.e("RecyclerView", new StringBuilder("Error processing scroll; pointer index for id ").append(this.L).append(" not found. Did any MotionEvents get skipped?").toString());
	                                v2_0 = 0;
	                            }
	                            break;
	                        case 3:
	                            this.p();
	                        case 4:
	                        default:
	                            break;
	                        case 5:
	                            this.L = gd.b(p11, v6_1);
	                            int v0_13 = ((int) (gd.c(p11, v6_1) + 1056964608));
	                            this.P = v0_13;
	                            this.N = v0_13;
	                            int v0_16 = ((int) (gd.d(p11, v6_1) + 1056964608));
	                            this.Q = v0_16;
	                            this.O = v0_16;
	                            break;
	                        case 6:
	                            this.a(p11);
	                            break;
	                    }
	                    if (this.K != 1) {
	                        v2_0 = 0;
	                    }
	                } else {
	                    v2_0 = 0;
	                }
	            } else {
	                this.p();
	            }
	            return v2_0;
	        }
	        v0_2 = 0;
	    }
	
	
	    protected void onLayout(boolean p2, int p3, int p4, int p5, int p6)
	    {
	        this.a();
	        a.a("RV OnLayout");
	        this.h();
	        a.b();
	        this.a(0);
	        this.g = 1;
	        return;
	    }
	
	
	    protected void onMeasure(int p4, int p5)
	    {
	        if (this.G) {
	            this.a();
	            this.t();
	            if (!this.n.l) {
	                this.b.e();
	                this.n.j = 0;
	            } else {
	                this.n.j = 1;
	            }
	            this.G = 0;
	            this.a(0);
	        }
	        if (this.d == null) {
	            this.n.f = 0;
	        } else {
	            this.n.f = this.d.a();
	        }
	        if (this.e != null) {
	            this.e.e.e(p4, p5);
	        } else {
	            this.e(p4, p5);
	        }
	        this.n.j = 0;
	        return;
	    }
	
	
	    protected void onRestoreInstanceState(android.os.Parcelable p3)
	    {
	        this.v = ((zn) p3);
	        super.onRestoreInstanceState(this.v.getSuperState());
	        if ((this.e != null) && (this.v.a != null)) {
	            this.e.a(this.v.a);
	        }
	        return;
	    }
	
	
	    protected android.os.Parcelable onSaveInstanceState()
	    {
	        zn v0_1 = new zn(super.onSaveInstanceState());
	        if (this.v == null) {
	            if (this.e == null) {
	                v0_1.a = 0;
	            } else {
	                v0_1.a = this.e.h();
	            }
	        } else {
	            zn.a(v0_1, this.v);
	        }
	        return v0_1;
	    }
	
	
	    protected void onSizeChanged(int p1, int p2, int p3, int p4)
	    {
	        super.onSizeChanged(p1, p2, p3, p4);
	        if ((p1 != p3) || (p2 != p4)) {
	            this.o();
	        }
	        return;
	    }
	
	
	    public boolean onTouchEvent(android.view.MotionEvent p13)
	    {
	        int v0_1;
	        int v2 = 0;
	        int v0_0 = p13.getAction();
	        if (this.B == null) {
	            if (v0_0 != 0) {
	                float v5_1 = this.A.size();
	                String v4_2 = 0;
	                while (v4_2 < v5_1) {
	                    int v0_5 = ((s) this.A.get(v4_2));
	                    if (!v0_5.a()) {
	                        v4_2++;
	                    } else {
	                        this.B = v0_5;
	                        v0_1 = 1;
	                        if (v0_1 == 0) {
	                            if (this.e != null) {
	                                float v5_2 = this.e.i();
	                                boolean v6_1 = this.e.j();
	                                if (this.M == null) {
	                                    this.M = android.view.VelocityTracker.obtain();
	                                }
	                                this.M.addMovement(p13);
	                                android.view.MotionEvent v7 = android.view.MotionEvent.obtain(p13);
	                                int v0_13 = gd.a(p13);
	                                String v4_3 = gd.b(p13);
	                                if (v0_13 == 0) {
	                                    int v8_0 = this.ag;
	                                    this.ag[1] = 0;
	                                    v8_0[0] = 0;
	                                }
	                                v7.offsetLocation(((float) this.ag[0]), ((float) this.ag[1]));
	                                switch (v0_13) {
	                                    case 0:
	                                        int v0_48;
	                                        this.L = gd.b(p13, 0);
	                                        int v0_44 = ((int) (p13.getX() + 1056964608));
	                                        this.P = v0_44;
	                                        this.N = v0_44;
	                                        int v0_47 = ((int) (p13.getY() + 1056964608));
	                                        this.Q = v0_47;
	                                        this.O = v0_47;
	                                        if (v5_2 == 0) {
	                                            v0_48 = 0;
	                                        } else {
	                                            v0_48 = 1;
	                                        }
	                                        if (v6_1) {
	                                            v0_48 |= 2;
	                                        }
	                                        this.startNestedScroll(v0_48);
	                                        break;
	                                    case 1:
	                                        String v4_30;
	                                        this.M.computeCurrentVelocity(1000, ((float) this.T));
	                                        if (v5_2 == 0) {
	                                            v4_30 = 0;
	                                        } else {
	                                            v4_30 = (- gp.a(this.M, this.L));
	                                        }
	                                        int v0_35;
	                                        if (!v6_1) {
	                                            v0_35 = 0;
	                                        } else {
	                                            v0_35 = (- gp.b(this.M, this.L));
	                                        }
	                                        if (((v4_30 == 0) && (v0_35 == 0)) || (!this.b(((int) v4_30), ((int) v0_35)))) {
	                                            this.b(0);
	                                        }
	                                        this.M.clear();
	                                        this.n();
	                                        break;
	                                    case 2:
	                                        int v0_22 = gd.a(p13, this.L);
	                                        if (v0_22 >= 0) {
	                                            int v8_4 = ((int) (gd.c(p13, v0_22) + 1056964608));
	                                            int v9_4 = ((int) (gd.d(p13, v0_22) + 1056964608));
	                                            int v1_3 = (this.P - v8_4);
	                                            int v0_27 = (this.Q - v9_4);
	                                            if (this.dispatchNestedPreScroll(v1_3, v0_27, this.af, this.ae)) {
	                                                v1_3 -= this.af[0];
	                                                v0_27 -= this.af[1];
	                                                v7.offsetLocation(((float) this.ae[0]), ((float) this.ae[1]));
	                                                String v4_13 = this.ag;
	                                                v4_13[0] = (v4_13[0] + this.ae[0]);
	                                                String v4_14 = this.ag;
	                                                v4_14[1] = (v4_14[1] + this.ae[1]);
	                                            }
	                                            if (this.K != 1) {
	                                                if ((v5_2 == 0) || (Math.abs(v1_3) <= this.R)) {
	                                                    String v4_17 = 0;
	                                                } else {
	                                                    if (v1_3 <= 0) {
	                                                        v1_3 += this.R;
	                                                    } else {
	                                                        v1_3 -= this.R;
	                                                    }
	                                                    v4_17 = 1;
	                                                }
	                                                if ((v6_1) && (Math.abs(v0_27) > this.R)) {
	                                                    if (v0_27 <= 0) {
	                                                        v0_27 += this.R;
	                                                    } else {
	                                                        v0_27 -= this.R;
	                                                    }
	                                                    v4_17 = 1;
	                                                }
	                                                if (v4_17 != null) {
	                                                    this.b(1);
	                                                }
	                                            }
	                                            if (this.K != 1) {
	                                            } else {
	                                                this.P = (v8_4 - this.ae[0]);
	                                                this.Q = (v9_4 - this.ae[1]);
	                                                if (v5_2 == 0) {
	                                                    v1_3 = 0;
	                                                }
	                                                if (!v6_1) {
	                                                    v0_27 = 0;
	                                                }
	                                                if (!this.a(v1_3, v0_27, v7)) {
	                                                } else {
	                                                    this.getParent().requestDisallowInterceptTouchEvent(1);
	                                                }
	                                            }
	                                        } else {
	                                            android.util.Log.e("RecyclerView", new StringBuilder("Error processing scroll; pointer index for id ").append(this.L).append(" not found. Did any MotionEvents get skipped?").toString());
	                                        }
	                                        break;
	                                    case 3:
	                                        this.p();
	                                    case 4:
	                                    default:
	                                        break;
	                                    case 5:
	                                        this.L = gd.b(p13, v4_3);
	                                        int v0_17 = ((int) (gd.c(p13, v4_3) + 1056964608));
	                                        this.P = v0_17;
	                                        this.N = v0_17;
	                                        int v0_20 = ((int) (gd.d(p13, v4_3) + 1056964608));
	                                        this.Q = v0_20;
	                                        this.O = v0_20;
	                                        break;
	                                    case 6:
	                                        this.a(p13);
	                                        break;
	                                }
	                                v7.recycle();
	                                v2 = 1;
	                            }
	                        } else {
	                            this.p();
	                            v2 = 1;
	                        }
	                        return v2;
	                    }
	                }
	            }
	            v0_1 = 0;
	        } else {
	            if (v0_0 != 0) {
	                if ((v0_0 == 3) || (v0_0 == 1)) {
	                    this.B = 0;
	                }
	                v0_1 = 1;
	            } else {
	                this.B = 0;
	            }
	        }
	    }
	
	
	    public void removeDetachedView(android.view.View p5, boolean p6)
	    {
	        String v0_0 = android.support.v7.widget.RecyclerView.b(p5);
	        if (v0_0 != null) {
	            if (!v0_0.o()) {
	                if (!v0_0.b()) {
	                    throw new IllegalArgumentException(new StringBuilder("Called removeDetachedView with a view which is not flagged as tmp detached.").append(v0_0).toString());
	                }
	            } else {
	                v0_0.i();
	            }
	        }
	        android.support.v7.widget.RecyclerView.b(p5);
	        super.removeDetachedView(p5, p6);
	        return;
	    }
	
	
	    public void requestChildFocus(android.view.View p7, android.view.View p8)
	    {
	        int v0_1;
	        if (!this.f()) {
	            v0_1 = 0;
	        } else {
	            v0_1 = 1;
	        }
	        if ((v0_1 == 0) && (p8 != null)) {
	            this.y.set(0, 0, p8.getWidth(), p8.getHeight());
	            int v0_3 = p8.getLayoutParams();
	            if ((v0_3 instanceof zi)) {
	                int v0_4 = ((zi) v0_3);
	                if (!v0_4.e) {
	                    int v0_5 = v0_4.d;
	                    android.graphics.Rect v3_3 = this.y;
	                    v3_3.left = (v3_3.left - v0_5.left);
	                    android.graphics.Rect v3_4 = this.y;
	                    v3_4.right = (v3_4.right + v0_5.right);
	                    android.graphics.Rect v3_5 = this.y;
	                    v3_5.top = (v3_5.top - v0_5.top);
	                    android.graphics.Rect v3_6 = this.y;
	                    v3_6.bottom = (v0_5.bottom + v3_6.bottom);
	                }
	            }
	            int v0_11;
	            this.offsetDescendantRectToMyCoords(p8, this.y);
	            this.offsetRectIntoDescendantCoords(p7, this.y);
	            if (this.g) {
	                v0_11 = 0;
	            } else {
	                v0_11 = 1;
	            }
	            this.requestChildRectangleOnScreen(p7, this.y, v0_11);
	        }
	        super.requestChildFocus(p7, p8);
	        return;
	    }
	
	
	    public boolean requestChildRectangleOnScreen(android.view.View p14, android.graphics.Rect p15, boolean p16)
	    {
	        int v1_7;
	        int v3_0 = this.e;
	        int v4 = v3_0.q();
	        int v5 = v3_0.r();
	        int v6 = (v3_0.o() - v3_0.s());
	        int v7_0 = (v3_0.p() - v3_0.t());
	        int v8 = (p14.getLeft() + p15.left);
	        int v9 = (p14.getTop() + p15.top);
	        int v10 = (v8 + p15.width());
	        int v11_0 = (v9 + p15.height());
	        int v1_5 = Math.min(0, (v8 - v4));
	        int v2_1 = Math.min(0, (v9 - v5));
	        int v0_9 = Math.max(0, (v10 - v6));
	        int v7_2 = Math.max(0, (v11_0 - v7_0));
	        if (gt.g(v3_0.e) != 1) {
	            int v0_10;
	            if (v1_5 == 0) {
	                v0_10 = Math.min((v8 - v4), v0_9);
	            } else {
	                v0_10 = v1_5;
	            }
	            v1_7 = v0_10;
	        } else {
	            if (v0_9 == 0) {
	                v0_9 = Math.max(v1_5, (v10 - v6));
	            }
	            v1_7 = v0_9;
	        }
	        int v0_13;
	        if (v2_1 == 0) {
	            v0_13 = Math.min((v9 - v5), v7_2);
	        } else {
	            v0_13 = v2_1;
	        }
	        if ((v1_7 == 0) && (v0_13 == 0)) {
	            int v0_14 = 0;
	        } else {
	            if (!p16) {
	                this.a(v1_7, v0_13);
	            } else {
	                this.scrollBy(v1_7, v0_13);
	            }
	            v0_14 = 1;
	        }
	        return v0_14;
	    }
	
	
	    public void requestDisallowInterceptTouchEvent(boolean p4)
	    {
	        int v1 = this.A.size();
	        int v0_1 = 0;
	        while (v0_1 < v1) {
	            this.A.get(v0_1);
	            v0_1++;
	        }
	        super.requestDisallowInterceptTouchEvent(p4);
	        return;
	    }
	
	
	    public void requestLayout()
	    {
	        if (this.D) {
	            this.E = 1;
	        } else {
	            super.requestLayout();
	        }
	        return;
	    }
	
	
	    public void scrollBy(int p4, int p5)
	    {
	        if (this.e != null) {
	            boolean v1_2 = this.e.i();
	            boolean v2_1 = this.e.j();
	            if ((v1_2) || (v2_1)) {
	                if (!v1_2) {
	                    p4 = 0;
	                }
	                if (!v2_1) {
	                    p5 = 0;
	                }
	                this.a(p4, p5, 0);
	            }
	        } else {
	            android.util.Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
	        }
	        return;
	    }
	
	
	    public void scrollTo(int p3, int p4)
	    {
	        throw new UnsupportedOperationException("RecyclerView does not support scrolling to an absolute position.");
	    }
	
	
	    public void sendAccessibilityEventUnchecked(android.view.accessibility.AccessibilityEvent p3)
	    {
	        int v0_0 = 0;
	        if (this.f()) {
	            int v1_1;
	            if (p3 == null) {
	                v1_1 = 0;
	            } else {
	                v1_1 = iz.b(p3);
	            }
	            if (v1_1 != 0) {
	                v0_0 = v1_1;
	            }
	            this.F = (v0_0 | this.F);
	            v0_0 = 1;
	        }
	        if (v0_0 == 0) {
	            super.sendAccessibilityEventUnchecked(p3);
	        }
	        return;
	    }
	
	
	    public void setClipToPadding(boolean p2)
	    {
	        if (p2 != this.w) {
	            this.o();
	        }
	        this.w = p2;
	        super.setClipToPadding(p2);
	        if (this.g) {
	            this.requestLayout();
	        }
	        return;
	    }
	
	
	    public void setNestedScrollingEnabled(boolean p3)
	    {
	        gj v0 = this.ad;
	        if (v0.c) {
	            gt.t(v0.a);
	        }
	        v0.c = p3;
	        return;
	    }
	
	
	    public boolean startNestedScroll(int p6)
	    {
	        android.view.View v0_4;
	        android.view.View v3_0 = this.ad;
	        if (!v3_0.a()) {
	            if (v3_0.c) {
	                android.view.ViewParent v1 = v3_0.a.getParent();
	                android.view.View v0_3 = v3_0.a;
	                while (v1 != null) {
	                    if (!ic.a(v1, v0_3, v3_0.a, p6)) {
	                        if ((v1 instanceof android.view.View)) {
	                            v0_3 = ((android.view.View) v1);
	                        }
	                        v1 = v1.getParent();
	                    } else {
	                        v3_0.b = v1;
	                        ic.b(v1, v0_3, v3_0.a, p6);
	                        v0_4 = 1;
	                    }
	                    return v0_4;
	                }
	            }
	            v0_4 = 0;
	        } else {
	            v0_4 = 1;
	        }
	        return v0_4;
	    }
	
	
	    public void stopNestedScroll()
	    {
	        gj v0 = this.ad;
	        if (v0.b != null) {
	            ic.a(v0.b, v0.a);
	            v0.b = 0;
	        }
	        return;
	    }
	
