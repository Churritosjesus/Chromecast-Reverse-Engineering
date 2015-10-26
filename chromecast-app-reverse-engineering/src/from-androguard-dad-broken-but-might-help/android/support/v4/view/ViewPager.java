	private static final ib T
	private static final I e
	private static final java.util.Comparator g
	private static final android.view.animation.Interpolator h
	private  A
	private  B
	private  C
	private  D
	private  E
	private  F
	private  G
	private  H
	private android.view.VelocityTracker I
	private  J
	private  K
	private  L
	private  M
	private lc N
	private lc O
	private  P
	private  Q
	private  R
	private java.util.ArrayList S
	private final java.lang.Runnable U
	private  V
	public gn a
	public  b
	public  c
	public hx d
	private  f
	private final java.util.ArrayList i
	private final hu j
	private final android.graphics.Rect k
	private  l
	private android.os.Parcelable m
	private java.lang.ClassLoader n
	private android.widget.Scroller o
	private hy p
	private  q
	private  r
	private  s
	private  t
	private  u
	private  v
	private  w
	private  x
	private  y
	private  z
	
	    static ViewPager()
	    {
	        ib v0_1 = new int[1];
	        v0_1[0] = 16842931;
	        android.support.v4.view.ViewPager.e = v0_1;
	        android.support.v4.view.ViewPager.g = new hq();
	        android.support.v4.view.ViewPager.h = new hr();
	        android.support.v4.view.ViewPager.T = new ib();
	        return;
	    }
	
	
	    public ViewPager(android.content.Context p5)
	    {
	        this(p5);
	        this.i = new java.util.ArrayList();
	        this.j = new hu();
	        this.k = new android.graphics.Rect();
	        this.l = -1;
	        this.m = 0;
	        this.n = 0;
	        this.s = -8388609;
	        this.t = 2139095039;
	        this.c = 1;
	        this.H = -1;
	        this.P = 1;
	        this.U = new hs(this);
	        this.V = 0;
	        this.d();
	        return;
	    }
	
	
	    public ViewPager(android.content.Context p5, android.util.AttributeSet p6)
	    {
	        this(p5, p6);
	        this.i = new java.util.ArrayList();
	        this.j = new hu();
	        this.k = new android.graphics.Rect();
	        this.l = -1;
	        this.m = 0;
	        this.n = 0;
	        this.s = -8388609;
	        this.t = 2139095039;
	        this.c = 1;
	        this.H = -1;
	        this.P = 1;
	        this.U = new hs(this);
	        this.V = 0;
	        this.d();
	        return;
	    }
	
	
	    private android.graphics.Rect a(android.graphics.Rect p5, android.view.View p6)
	    {
	        android.graphics.Rect v1_0;
	        if (p5 != null) {
	            v1_0 = p5;
	        } else {
	            v1_0 = new android.graphics.Rect();
	        }
	        android.view.ViewParent v0_6;
	        if (p6 != null) {
	            v1_0.left = p6.getLeft();
	            v1_0.right = p6.getRight();
	            v1_0.top = p6.getTop();
	            v1_0.bottom = p6.getBottom();
	            android.view.ViewParent v0_5 = p6.getParent();
	            while (((v0_5 instanceof android.view.ViewGroup)) && (v0_5 != this)) {
	                android.view.ViewParent v0_7 = ((android.view.ViewGroup) v0_5);
	                v1_0.left = (v1_0.left + v0_7.getLeft());
	                v1_0.right = (v1_0.right + v0_7.getRight());
	                v1_0.top = (v1_0.top + v0_7.getTop());
	                v1_0.bottom = (v1_0.bottom + v0_7.getBottom());
	                v0_5 = v0_7.getParent();
	            }
	            v0_6 = v1_0;
	        } else {
	            v1_0.set(0, 0, 0, 0);
	            v0_6 = v1_0;
	        }
	        return v0_6;
	    }
	
	
	    public static synthetic gn a(android.support.v4.view.ViewPager p1)
	    {
	        return p1.a;
	    }
	
	
	    private hu a(int p3, int p4)
	    {
	        hu v0_1 = new hu();
	        v0_1.b = p3;
	        v0_1.a = this.a.a(this, p3);
	        v0_1.d = 1065353216;
	        if ((p4 >= 0) && (p4 < this.i.size())) {
	            this.i.add(p4, v0_1);
	        } else {
	            this.i.add(v0_1);
	        }
	        return v0_1;
	    }
	
	
	    private hu a(android.view.View p5)
	    {
	        int v1 = 0;
	        while (v1 < this.i.size()) {
	            int v0_3 = ((hu) this.i.get(v1));
	            if (!this.a.a(p5, v0_3.a)) {
	                v1++;
	            }
	            return v0_3;
	        }
	        v0_3 = 0;
	        return v0_3;
	    }
	
	
	    private void a(int p11, float p12, int p13)
	    {
	        if (this.R > 0) {
	            int v4 = this.getScrollX();
	            int v1_0 = this.getPaddingLeft();
	            int v2_0 = this.getPaddingRight();
	            int v5 = this.getWidth();
	            int v6 = this.getChildCount();
	            int v3 = 0;
	            while (v3 < v6) {
	                int v2_1;
	                int v1_1;
	                android.view.View v7 = this.getChildAt(v3);
	                int v0_6 = ((hv) v7.getLayoutParams());
	                if (!v0_6.a) {
	                    v2_1 = v1_0;
	                    v1_1 = v2_0;
	                } else {
	                    int v0_10;
	                    switch ((v0_6.b & 7)) {
	                        case 1:
	                            v0_10 = Math.max(((v5 - v7.getMeasuredWidth()) / 2), v1_0);
	                            v2_1 = v1_0;
	                            v1_1 = v2_0;
	                            break;
	                        case 2:
	                        case 4:
	                        default:
	                            v0_10 = v1_0;
	                            v2_1 = v1_0;
	                            v1_1 = v2_0;
	                            break;
	                        case 3:
	                            v1_1 = v2_0;
	                            v2_1 = (v7.getWidth() + v1_0);
	                            v0_10 = v1_0;
	                            break;
	                        case 5:
	                            v0_10 = ((v5 - v2_0) - v7.getMeasuredWidth());
	                            v2_1 = v1_0;
	                            v1_1 = (v2_0 + v7.getMeasuredWidth());
	                            break;
	                    }
	                    int v0_17 = ((v0_10 + v4) - v7.getLeft());
	                    if (v0_17 != 0) {
	                        v7.offsetLeftAndRight(v0_17);
	                    }
	                }
	                v3++;
	                v1_0 = v2_1;
	                v2_0 = v1_1;
	            }
	        }
	        if (this.d != null) {
	            this.d.a(p11, p12, p13);
	        }
	        this.Q = 1;
	        return;
	    }
	
	
	    private void a(int p13, boolean p14, int p15, boolean p16)
	    {
	        int v1_0 = this.d(p13);
	        android.widget.Scroller v0_0 = 0;
	        if (v1_0 != 0) {
	            v0_0 = ((int) (((float) this.e()) * Math.max(this.s, Math.min(v1_0.e, this.t))));
	        }
	        if (!p14) {
	            if (p16) {
	                this.f(p13);
	            }
	            this.a(0);
	            this.scrollTo(v0_0, 0);
	            this.e(v0_0);
	        } else {
	            if (this.getChildCount() != 0) {
	                int v1_7 = this.getScrollX();
	                int v2_1 = this.getScrollY();
	                int v3_1 = (v0_0 - v1_7);
	                int v4 = (0 - v2_1);
	                if ((v3_1 != 0) || (v4 != 0)) {
	                    android.widget.Scroller v0_12;
	                    this.c(1);
	                    this.b(2);
	                    android.widget.Scroller v0_6 = this.e();
	                    int v5_0 = (v0_6 / 2);
	                    int v5_3 = ((((float) v5_0) * ((float) Math.sin(((double) ((float) (((double) (Math.min(1065353216, ((1065353216 * ((float) Math.abs(v3_1))) / ((float) v0_6))) - 1056964608)) * 0.4712389167638204)))))) + ((float) v5_0));
	                    int v6_5 = Math.abs(p15);
	                    if (v6_5 <= 0) {
	                        v0_12 = ((int) (((((float) Math.abs(v3_1)) / (((float) v0_6) + 0)) + 1065353216) * 1120403456));
	                    } else {
	                        v0_12 = (Math.round((1148846080 * Math.abs((v5_3 / ((float) v6_5))))) * 4);
	                    }
	                    this.o.startScroll(v1_7, v2_1, v3_1, v4, Math.min(v0_12, 600));
	                    gt.d(this);
	                } else {
	                    this.a(0);
	                    this.b();
	                    this.b(0);
	                }
	            } else {
	                this.c(0);
	            }
	            if (p16) {
	                this.f(p13);
	            }
	        }
	        return;
	    }
	
	
	    private void a(int p2, boolean p3, boolean p4)
	    {
	        this.a(p2, p3, p4, 0);
	        return;
	    }
	
	
	    private void a(int p5, boolean p6, boolean p7, int p8)
	    {
	        int v1 = 0;
	        if ((this.a != null) && (this.a.a() > 0)) {
	            if ((p7) || ((this.b != p5) || (this.i.size() == 0))) {
	                if (p5 >= 0) {
	                    if (p5 >= this.a.a()) {
	                        p5 = (this.a.a() - 1);
	                    }
	                } else {
	                    p5 = 0;
	                }
	                int v0_10 = this.c;
	                if ((p5 > (this.b + v0_10)) || (p5 < (this.b - v0_10))) {
	                    int v2_3 = 0;
	                    while (v2_3 < this.i.size()) {
	                        ((hu) this.i.get(v2_3)).c = 1;
	                        v2_3++;
	                    }
	                }
	                if (this.b != p5) {
	                    v1 = 1;
	                }
	                if (!this.P) {
	                    this.c(p5);
	                    this.a(p5, p6, p8, v1);
	                } else {
	                    this.b = p5;
	                    if (v1 != 0) {
	                        this.f(p5);
	                    }
	                    this.requestLayout();
	                }
	            } else {
	                this.c(0);
	            }
	        } else {
	            this.c(0);
	        }
	        return;
	    }
	
	
	    public static synthetic void a(android.support.v4.view.ViewPager p1, int p2)
	    {
	        p1.b(0);
	        return;
	    }
	
	
	    private void a(android.view.MotionEvent p4)
	    {
	        android.view.VelocityTracker v0_0 = gd.b(p4);
	        if (gd.b(p4, v0_0) == this.H) {
	            android.view.VelocityTracker v0_1;
	            if (v0_0 != null) {
	                v0_1 = 0;
	            } else {
	                v0_1 = 1;
	            }
	            this.D = gd.c(p4, v0_1);
	            this.H = gd.b(p4, v0_1);
	            if (this.I != null) {
	                this.I.clear();
	            }
	        }
	        return;
	    }
	
	
	    private void a(hu p12, int p13, hu p14)
	    {
	        float v5;
	        int v6 = this.a.a();
	        int v1_1 = this.e();
	        if (v1_1 <= 0) {
	            v5 = 0;
	        } else {
	            v5 = (0 / ((float) v1_1));
	        }
	        if (p14 != null) {
	            int v0_2 = p14.b;
	            if (v0_2 >= p12.b) {
	                if (v0_2 > p12.b) {
	                    int v3_0 = (this.i.size() - 1);
	                    float v2_1 = p14.e;
	                    int v1_8 = (v0_2 - 1);
	                    while ((v1_8 >= p12.b) && (v3_0 >= 0)) {
	                        int v0_7 = ((hu) this.i.get(v3_0));
	                        while ((v1_8 < v0_7.b) && (v3_0 > 0)) {
	                            v3_0--;
	                            v0_7 = ((hu) this.i.get(v3_0));
	                        }
	                        int v1_9 = v2_1;
	                        float v2_2 = v1_8;
	                        while (v2_2 > v0_7.b) {
	                            v2_2--;
	                            v1_9 -= (v5 + 1065353216);
	                        }
	                        int v1_10 = (v1_9 - (v0_7.d + v5));
	                        v0_7.e = v1_10;
	                        v2_1 = v1_10;
	                        v1_8 = (v2_2 - 1);
	                    }
	                }
	            } else {
	                int v3_2 = 0;
	                float v2_4 = ((p14.e + p14.d) + v5);
	                int v1_15 = (v0_2 + 1);
	                while ((v1_15 <= p12.b) && (v3_2 < this.i.size())) {
	                    int v0_41 = ((hu) this.i.get(v3_2));
	                    while ((v1_15 > v0_41.b) && (v3_2 < (this.i.size() - 1))) {
	                        v3_2++;
	                        v0_41 = ((hu) this.i.get(v3_2));
	                    }
	                    int v1_19 = v2_4;
	                    float v2_7 = v1_15;
	                    while (v2_7 < v0_41.b) {
	                        v2_7++;
	                        v1_19 = ((v5 + 1065353216) + v1_19);
	                    }
	                    v0_41.e = v1_19;
	                    v2_4 = (v1_19 + (v0_41.d + v5));
	                    v1_15 = (v2_7 + 1);
	                }
	            }
	        }
	        int v0_18;
	        float v4_6 = this.i.size();
	        float v2_5 = p12.e;
	        int v1_16 = (p12.b - 1);
	        if (p12.b != 0) {
	            v0_18 = -8388609;
	        } else {
	            v0_18 = p12.e;
	        }
	        int v0_20;
	        this.s = v0_18;
	        if (p12.b != (v6 - 1)) {
	            v0_20 = 2139095039;
	        } else {
	            v0_20 = ((p12.e + p12.d) - 1065353216);
	        }
	        this.t = v0_20;
	        int v3_5 = (p13 - 1);
	        while (v3_5 >= 0) {
	            int v0_36 = ((hu) this.i.get(v3_5));
	            while (v1_16 > v0_36.b) {
	                v1_16--;
	                v2_5 -= (v5 + 1065353216);
	            }
	            v2_5 -= (v0_36.d + v5);
	            v0_36.e = v2_5;
	            if (v0_36.b == 0) {
	                this.s = v2_5;
	            }
	            v1_16--;
	            v3_5--;
	        }
	        float v2_6 = ((p12.e + p12.d) + v5);
	        int v1_18 = (p12.b + 1);
	        int v3_6 = (p13 + 1);
	        while (v3_6 < v4_6) {
	            int v0_30 = ((hu) this.i.get(v3_6));
	            while (v1_18 < v0_30.b) {
	                v1_18++;
	                v2_6 += (v5 + 1065353216);
	            }
	            if (v0_30.b == (v6 - 1)) {
	                this.t = ((v0_30.d + v2_6) - 1065353216);
	            }
	            v0_30.e = v2_6;
	            v2_6 += (v0_30.d + v5);
	            v1_18++;
	            v3_6++;
	        }
	        return;
	    }
	
	
	    private void a(boolean p8)
	    {
	        Runnable v0_1;
	        if (this.V != 2) {
	            v0_1 = 0;
	        } else {
	            v0_1 = 1;
	        }
	        if (v0_1 != null) {
	            this.c(0);
	            this.o.abortAnimation();
	            int v1_2 = this.getScrollX();
	            int v3_0 = this.getScrollY();
	            boolean v5_1 = this.o.getCurrX();
	            int v6_1 = this.o.getCurrY();
	            if ((v1_2 != v5_1) || (v3_0 != v6_1)) {
	                this.scrollTo(v5_1, v6_1);
	                if (v5_1 != v1_2) {
	                    this.e(v5_1);
	                }
	            }
	        }
	        this.x = 0;
	        int v1_3 = 0;
	        int v3_1 = v0_1;
	        while (v1_3 < this.i.size()) {
	            Runnable v0_8 = ((hu) this.i.get(v1_3));
	            if (v0_8.c) {
	                v0_8.c = 0;
	                v3_1 = 1;
	            }
	            v1_3++;
	        }
	        if (v3_1 != 0) {
	            if (!p8) {
	                this.U.run();
	            } else {
	                gt.a(this, this.U);
	            }
	        }
	        return;
	    }
	
	
	    private boolean a(float p11)
	    {
	        float v0_7;
	        float v3_0 = 1;
	        boolean v2_0 = 0;
	        float v0_1 = (this.D - p11);
	        this.D = p11;
	        float v5 = (((float) this.getScrollX()) + v0_1);
	        int v7 = this.e();
	        int v4_0 = (((float) v7) * this.s);
	        float v0_6 = ((hu) this.i.get(0));
	        int v1_6 = ((hu) this.i.get((this.i.size() - 1)));
	        if (v0_6.b == 0) {
	            v0_7 = 1;
	        } else {
	            v4_0 = (v0_6.e * ((float) v7));
	            v0_7 = 0;
	        }
	        int v1_7;
	        if (v1_6.b == (this.a.a() - 1)) {
	            v1_7 = (((float) v7) * this.t);
	        } else {
	            v1_7 = (v1_6.e * ((float) v7));
	            v3_0 = 0;
	        }
	        if (v5 >= v4_0) {
	            if (v5 <= v1_7) {
	                v4_0 = v5;
	            } else {
	                if (v3_0 != 0) {
	                    v2_0 = this.O.a((Math.abs((v5 - v1_7)) / ((float) v7)));
	                }
	                v4_0 = v1_7;
	            }
	        } else {
	            if (v0_7 != 0) {
	                v2_0 = this.N.a((Math.abs((v4_0 - v5)) / ((float) v7)));
	            }
	        }
	        this.D = (this.D + (v4_0 - ((float) ((int) v4_0))));
	        this.scrollTo(((int) v4_0), this.getScrollY());
	        this.e(((int) v4_0));
	        return v2_0;
	    }
	
	
	    private boolean a(android.view.View p11, boolean p12, int p13, int p14, int p15)
	    {
	        int v2 = 1;
	        if (!(p11 instanceof android.view.ViewGroup)) {
	            if ((!p12) || (!gt.a(p11, (- p13)))) {
	                v2 = 0;
	            }
	        } else {
	            int v8 = p11.getScrollX();
	            int v9 = p11.getScrollY();
	            int v7 = (((android.view.ViewGroup) p11).getChildCount() - 1);
	            while (v7 >= 0) {
	                android.view.View v1 = ((android.view.ViewGroup) p11).getChildAt(v7);
	                if (((p14 + v8) < v1.getLeft()) || (((p14 + v8) >= v1.getRight()) || (((p15 + v9) < v1.getTop()) || (((p15 + v9) >= v1.getBottom()) || (!this.a(v1, 1, p13, ((p14 + v8) - v1.getLeft()), ((p15 + v9) - v1.getTop()))))))) {
	                    v7--;
	                }
	            }
	        }
	        return v2;
	    }
	
	
	    public static synthetic int b(android.support.v4.view.ViewPager p1)
	    {
	        return p1.b;
	    }
	
	
	    private hu b(android.view.View p3)
	    {
	        while(true) {
	            android.view.View v0_1;
	            android.view.View v0_0 = p3.getParent();
	            if (v0_0 == this) {
	                v0_1 = this.a(p3);
	            } else {
	                if ((v0_0 == null) || (!(v0_0 instanceof android.view.View))) {
	                    break;
	                }
	                p3 = ((android.view.View) v0_0);
	            }
	            return v0_1;
	        }
	        v0_1 = 0;
	        return v0_1;
	    }
	
	
	    private void b(int p2)
	    {
	        if (this.V != p2) {
	            this.V = p2;
	            if (this.d != null) {
	                this.d.b(p2);
	            }
	        }
	        return;
	    }
	
	
	    private void b(boolean p3)
	    {
	        android.view.ViewParent v0 = this.getParent();
	        if (v0 != null) {
	            v0.requestDisallowInterceptTouchEvent(1);
	        }
	        return;
	    }
	
	
	    private void c(int p19)
	    {
	        IllegalStateException v3_1;
	        boolean v4_1;
	        if (this.b == p19) {
	            v4_1 = 0;
	            v3_1 = 2;
	        } else {
	            int v2_2;
	            if (this.b >= p19) {
	                v2_2 = 17;
	            } else {
	                v2_2 = 66;
	            }
	            IllegalStateException v3_3 = this.d(this.b);
	            this.b = p19;
	            v4_1 = v3_3;
	            v3_1 = v2_2;
	        }
	        if ((this.a != null) && ((!this.x) && (this.getWindowToken() != null))) {
	            int v2_6 = this.c;
	            gn v11_0 = Math.max(0, (this.b - v2_6));
	            int v12 = this.a.a();
	            int v13 = Math.min((v12 - 1), (v2_6 + this.b));
	            if (v12 == this.f) {
	                int v5_3 = 0;
	                while (v5_3 < this.i.size()) {
	                    int v2_14 = ((hu) this.i.get(v5_3));
	                    if (v2_14.b < this.b) {
	                        v5_3++;
	                    } else {
	                        if (v2_14.b != this.b) {
	                            break;
	                        }
	                    }
	                    if ((v2_14 != 0) || (v12 <= 0)) {
	                        hu v10 = v2_14;
	                    } else {
	                        v10 = this.a(this.b, v5_3);
	                    }
	                    if (v10 != null) {
	                        int v2_18;
	                        int v8_2 = (v5_3 - 1);
	                        if (v8_2 < 0) {
	                            v2_18 = 0;
	                        } else {
	                            v2_18 = ((hu) this.i.get(v8_2));
	                        }
	                        int v6_6;
	                        int v14 = this.e();
	                        if (v14 > 0) {
	                            v6_6 = ((1073741824 - v10.d) + (((float) this.getPaddingLeft()) / ((float) v14)));
	                        } else {
	                            v6_6 = 0;
	                        }
	                        int v7_8 = 0;
	                        int v9_1 = (this.b - 1);
	                        int v8_3 = v5_3;
	                        int v5_4 = v8_2;
	                        while (v9_1 >= 0) {
	                            if ((v7_8 < v6_6) || (v9_1 >= v11_0)) {
	                                if ((v2_18 == 0) || (v9_1 != v2_18.b)) {
	                                    v7_8 += this.a(v9_1, (v5_4 + 1)).d;
	                                    v8_3++;
	                                    if (v5_4 < 0) {
	                                        v2_18 = 0;
	                                    } else {
	                                        v2_18 = ((hu) this.i.get(v5_4));
	                                    }
	                                } else {
	                                    v7_8 += v2_18.d;
	                                    v5_4--;
	                                    if (v5_4 < 0) {
	                                        v2_18 = 0;
	                                    } else {
	                                        v2_18 = ((hu) this.i.get(v5_4));
	                                    }
	                                }
	                            } else {
	                                if (v2_18 == 0) {
	                                    break;
	                                }
	                                if ((v9_1 == v2_18.b) && (!v2_18.c)) {
	                                    this.i.remove(v5_4);
	                                    this.a.a(this, v9_1, v2_18.a);
	                                    v5_4--;
	                                    v8_3--;
	                                    if (v5_4 < 0) {
	                                        v2_18 = 0;
	                                    } else {
	                                        v2_18 = ((hu) this.i.get(v5_4));
	                                    }
	                                }
	                            }
	                            v9_1--;
	                        }
	                        int v6_7 = v10.d;
	                        int v9_2 = (v8_3 + 1);
	                        if (v6_7 < 1073741824) {
	                            int v7_9;
	                            if (v9_2 >= this.i.size()) {
	                                v7_9 = 0;
	                            } else {
	                                v7_9 = ((hu) this.i.get(v9_2));
	                            }
	                            int v5_7;
	                            if (v14 > 0) {
	                                v5_7 = ((((float) this.getPaddingRight()) / ((float) v14)) + 1073741824);
	                            } else {
	                                v5_7 = 0;
	                            }
	                            int v2_43 = v7_9;
	                            int v7_10 = v9_2;
	                            int v9_3 = (this.b + 1);
	                            while (v9_3 < v12) {
	                                if ((v6_7 < v5_7) || (v9_3 <= v13)) {
	                                    if ((v2_43 == 0) || (v9_3 != v2_43.b)) {
	                                        int v2_48;
	                                        int v2_44 = this.a(v9_3, v7_10);
	                                        v7_10++;
	                                        if (v7_10 >= this.i.size()) {
	                                            v2_48 = 0;
	                                        } else {
	                                            v2_48 = ((hu) this.i.get(v7_10));
	                                        }
	                                        int v6_9 = v2_48;
	                                        int v2_51 = (v6_7 + v2_44.d);
	                                    } else {
	                                        int v2_55;
	                                        v7_10++;
	                                        if (v7_10 >= this.i.size()) {
	                                            v2_55 = 0;
	                                        } else {
	                                            v2_55 = ((hu) this.i.get(v7_10));
	                                        }
	                                        v6_9 = v2_55;
	                                        v2_51 = (v6_7 + v2_43.d);
	                                    }
	                                } else {
	                                    if (v2_43 == 0) {
	                                        break;
	                                    }
	                                    if ((v9_3 != v2_43.b) || (v2_43.c)) {
	                                        v6_9 = v2_43;
	                                        v2_51 = v6_7;
	                                    } else {
	                                        int v2_72;
	                                        this.i.remove(v7_10);
	                                        this.a.a(this, v9_3, v2_43.a);
	                                        if (v7_10 >= this.i.size()) {
	                                            v2_72 = 0;
	                                        } else {
	                                            v2_72 = ((hu) this.i.get(v7_10));
	                                        }
	                                        v6_9 = v2_72;
	                                        v2_51 = v6_7;
	                                    }
	                                }
	                                v9_3++;
	                                v2_43 = v6_9;
	                                v6_7 = v2_51;
	                            }
	                        }
	                        this.a(v10, v8_3, v4_1);
	                    }
	                    int v2_58;
	                    if (v10 == null) {
	                        v2_58 = 0;
	                    } else {
	                        v2_58 = v10.a;
	                    }
	                    this.a.b(this, this.b, v2_58);
	                    this.a.a(this);
	                    int v5_9 = this.getChildCount();
	                    boolean v4_3 = 0;
	                    while (v4_3 < v5_9) {
	                        int v6_12 = this.getChildAt(v4_3);
	                        int v2_67 = ((hv) v6_12.getLayoutParams());
	                        v2_67.f = v4_3;
	                        if ((!v2_67.a) && (v2_67.c == 0)) {
	                            int v6_13 = this.a(v6_12);
	                            if (v6_13 != 0) {
	                                v2_67.c = v6_13.d;
	                                v2_67.e = v6_13.b;
	                            }
	                        }
	                        v4_3++;
	                    }
	                    if (this.hasFocus()) {
	                        int v2_63;
	                        int v2_62 = this.findFocus();
	                        if (v2_62 == 0) {
	                            v2_63 = 0;
	                        } else {
	                            v2_63 = this.b(v2_62);
	                        }
	                        if ((v2_63 == 0) || (v2_63.b != this.b)) {
	                            int v2_65 = 0;
	                            while (v2_65 < this.getChildCount()) {
	                                boolean v4_6 = this.getChildAt(v2_65);
	                                int v5_10 = this.a(v4_6);
	                                if ((v5_10 != 0) && ((v5_10.b == this.b) && (v4_6.requestFocus(v3_1)))) {
	                                    break;
	                                }
	                                v2_65++;
	                            }
	                        }
	                    }
	                }
	                v2_14 = 0;
	            } else {
	                try {
	                    int v2_79 = this.getResources().getResourceName(this.getId());
	                } catch (int v2) {
	                    v2_79 = Integer.toHexString(this.getId());
	                }
	                throw new IllegalStateException(new StringBuilder("The application\'s PagerAdapter changed the adapter\'s contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: ").append(this.f).append(", found: ").append(v12).append(" Pager id: ").append(v2_79).append(" Pager class: ").append(this.getClass()).append(" Problematic adapter: ").append(this.a.getClass()).toString());
	            }
	        }
	        return;
	    }
	
	
	    private void c(boolean p2)
	    {
	        if (this.w != p2) {
	            this.w = p2;
	        }
	        return;
	    }
	
	
	    public static synthetic int[] c()
	    {
	        return android.support.v4.view.ViewPager.e;
	    }
	
	
	    private hu d(int p4)
	    {
	        int v1 = 0;
	        while (v1 < this.i.size()) {
	            int v0_3 = ((hu) this.i.get(v1));
	            if (v0_3.b != p4) {
	                v1++;
	            }
	            return v0_3;
	        }
	        v0_3 = 0;
	        return v0_3;
	    }
	
	
	    private void d()
	    {
	        this.setWillNotDraw(0);
	        this.setDescendantFocusability(262144);
	        this.setFocusable(1);
	        int v0_2 = this.getContext();
	        this.o = new android.widget.Scroller(v0_2, android.support.v4.view.ViewPager.h);
	        lc v1_2 = android.view.ViewConfiguration.get(v0_2);
	        float v2_3 = v0_2.getResources().getDisplayMetrics().density;
	        this.C = hf.a(v1_2);
	        this.J = ((int) (1137180672 * v2_3));
	        this.K = v1_2.getScaledMaximumFlingVelocity();
	        this.N = new lc(v0_2);
	        this.O = new lc(v0_2);
	        this.L = ((int) (1103626240 * v2_3));
	        this.M = ((int) (1073741824 * v2_3));
	        this.A = ((int) (1098907648 * v2_3));
	        gt.a(this, new hw(this));
	        if (gt.e(this) == 0) {
	            gt.c(this, 1);
	        }
	        return;
	    }
	
	
	    private int e()
	    {
	        return ((this.getMeasuredWidth() - this.getPaddingLeft()) - this.getPaddingRight());
	    }
	
	
	    private boolean e(int p8)
	    {
	        int v0_0 = 0;
	        if (this.i.size() != 0) {
	            String v1_2 = this.f();
	            int v2_0 = this.e();
	            int v4_1 = v1_2.b;
	            String v1_5 = (((((float) p8) / ((float) v2_0)) - v1_2.e) / (v1_2.d + (0 / ((float) v2_0))));
	            int v2_3 = ((int) (((float) v2_0) * v1_5));
	            this.Q = 0;
	            this.a(v4_1, v1_5, v2_3);
	            if (this.Q) {
	                v0_0 = 1;
	            } else {
	                throw new IllegalStateException("onPageScrolled did not call superclass implementation");
	            }
	        } else {
	            this.Q = 0;
	            this.a(0, 0, 0);
	            if (!this.Q) {
	                throw new IllegalStateException("onPageScrolled did not call superclass implementation");
	            }
	        }
	        return v0_0;
	    }
	
	
	    private hu f()
	    {
	        int v9;
	        int v1_0 = this.e();
	        if (v1_0 <= 0) {
	            v9 = 0;
	        } else {
	            v9 = (((float) this.getScrollX()) / ((float) v1_0));
	        }
	        int v1_1;
	        if (v1_0 <= 0) {
	            v1_1 = 0;
	        } else {
	            v1_1 = (0 / ((float) v1_0));
	        }
	        float v6_0 = 0;
	        float v7_0 = 0;
	        int v8 = -1;
	        int v2_1 = 0;
	        int v5_1 = 1;
	        hu v4_2 = 0;
	        while (v2_1 < this.i.size()) {
	            int v0_11;
	            int v2_2;
	            int v0_10 = ((hu) this.i.get(v2_1));
	            if ((v5_1 != 0) || (v0_10.b == (v8 + 1))) {
	                v0_11 = v2_1;
	                v2_2 = v0_10;
	            } else {
	                int v0_12 = this.j;
	                v0_12.e = ((v6_0 + v7_0) + v1_1);
	                v0_12.b = (v8 + 1);
	                v0_12.d = 1065353216;
	                v0_11 = (v2_1 - 1);
	                v2_2 = v0_12;
	            }
	            float v6_5 = v2_2.e;
	            if ((v5_1 == 0) && (v9 < v6_5)) {
	                break;
	            }
	            if ((v9 >= ((v2_2.d + v6_5) + v1_1)) && (v0_11 != (this.i.size() - 1))) {
	                v7_0 = v6_5;
	                v8 = v2_2.b;
	                v5_1 = 0;
	                v6_0 = v2_2.d;
	                v4_2 = v2_2;
	                v2_1 = (v0_11 + 1);
	            } else {
	                v4_2 = v2_2;
	                break;
	            }
	        }
	        return v4_2;
	    }
	
	
	    private void f(int p2)
	    {
	        if (this.d != null) {
	            this.d.a(p2);
	        }
	        return;
	    }
	
	
	    private void g()
	    {
	        this.y = 0;
	        this.z = 0;
	        if (this.I != null) {
	            this.I.recycle();
	            this.I = 0;
	        }
	        return;
	    }
	
	
	    private boolean g(int p10)
	    {
	        int v0_2;
	        String v2_0 = this.findFocus();
	        if (v2_0 != this) {
	            if (v2_0 != null) {
	                int v0_0 = v2_0.getParent();
	                while ((v0_0 instanceof android.view.ViewGroup)) {
	                    if (v0_0 != this) {
	                        v0_0 = v0_0.getParent();
	                    } else {
	                        int v0_1 = 1;
	                    }
	                    if (v0_1 == 0) {
	                        String v5_2 = new StringBuilder();
	                        v5_2.append(v2_0.getClass().getSimpleName());
	                        int v0_5 = v2_0.getParent();
	                        while ((v0_5 instanceof android.view.ViewGroup)) {
	                            v5_2.append(" => ").append(v0_5.getClass().getSimpleName());
	                            v0_5 = v0_5.getParent();
	                        }
	                        android.util.Log.e("ViewPager", new StringBuilder("arrowScroll tried to find focus based on non-child current focused view ").append(v5_2.toString()).toString());
	                        v0_2 = 0;
	                        int v0_8;
	                        int v1_2 = android.view.FocusFinder.getInstance().findNextFocus(this, v0_2, p10);
	                        if ((v1_2 == 0) || (v1_2 == v0_2)) {
	                            if ((p10 != 17) && (p10 != 1)) {
	                                if ((p10 != 66) && (p10 != 2)) {
	                                    v0_8 = 0;
	                                } else {
	                                    v0_8 = this.i();
	                                }
	                            } else {
	                                v0_8 = this.h();
	                            }
	                        } else {
	                            if (p10 != 17) {
	                                if (p10 != 66) {
	                                } else {
	                                    if ((v0_2 == 0) || (this.a(this.k, v1_2).left > this.a(this.k, v0_2).left)) {
	                                        v0_8 = v1_2.requestFocus();
	                                    } else {
	                                        v0_8 = this.i();
	                                    }
	                                }
	                            } else {
	                                if ((v0_2 == 0) || (this.a(this.k, v1_2).left < this.a(this.k, v0_2).left)) {
	                                    v0_8 = v1_2.requestFocus();
	                                } else {
	                                    v0_8 = this.h();
	                                }
	                            }
	                        }
	                        if (v0_8 != 0) {
	                            this.playSoundEffect(android.view.SoundEffectConstants.getContantForFocusDirection(p10));
	                        }
	                        return v0_8;
	                    }
	                }
	                v0_1 = 0;
	            }
	            v0_2 = v2_0;
	        } else {
	            v0_2 = 0;
	        }
	    }
	
	
	    private boolean h()
	    {
	        int v0 = 1;
	        if (this.b <= 0) {
	            v0 = 0;
	        } else {
	            this.a((this.b - 1), 1);
	        }
	        return v0;
	    }
	
	
	    private boolean i()
	    {
	        int v0 = 1;
	        if ((this.a == null) || (this.b >= (this.a.a() - 1))) {
	            v0 = 0;
	        } else {
	            this.a((this.b + 1), 1);
	        }
	        return v0;
	    }
	
	
	    public final void a()
	    {
	        int v0_2;
	        int v0_1 = this.a.a();
	        this.f = v0_1;
	        if ((this.i.size() >= ((this.c << 1) + 1)) || (this.i.size() >= v0_1)) {
	            v0_2 = 0;
	        } else {
	            v0_2 = 1;
	        }
	        int v4_3 = this.b;
	        int v3_4 = 0;
	        while (v3_4 < this.i.size()) {
	            this.i.get(v3_4);
	            v3_4++;
	        }
	        java.util.Collections.sort(this.i, android.support.v4.view.ViewPager.g);
	        if (v0_2 != 0) {
	            int v5_3 = this.getChildCount();
	            int v3_6 = 0;
	            while (v3_6 < v5_3) {
	                int v0_5 = ((hv) this.getChildAt(v3_6).getLayoutParams());
	                if (!v0_5.a) {
	                    v0_5.c = 0;
	                }
	                v3_6++;
	            }
	            this.a(v4_3, 0, 1);
	            this.requestLayout();
	        }
	        return;
	    }
	
	
	    public final void a(int p3)
	    {
	        int v0_1;
	        this.x = 0;
	        if (this.P) {
	            v0_1 = 0;
	        } else {
	            v0_1 = 1;
	        }
	        this.a(p3, v0_1, 0);
	        return;
	    }
	
	
	    public final void a(int p3, boolean p4)
	    {
	        this.x = 0;
	        this.a(p3, 1, 0);
	        return;
	    }
	
	
	    public final void a(gn p8)
	    {
	        if (this.a != null) {
	            this.a.a.unregisterObserver(this.p);
	            int v1_1 = 0;
	            while (v1_1 < this.i.size()) {
	                int v0_23 = ((hu) this.i.get(v1_1));
	                this.a.a(this, v0_23.b, v0_23.a);
	                v1_1++;
	            }
	            this.a.a(this);
	            this.i.clear();
	            int v1_2 = 0;
	            while (v1_2 < this.getChildCount()) {
	                if (!((hv) this.getChildAt(v1_2).getLayoutParams()).a) {
	                    this.removeViewAt(v1_2);
	                    v1_2--;
	                }
	                v1_2++;
	            }
	            this.b = 0;
	            this.scrollTo(0, 0);
	        }
	        this.a = p8;
	        this.f = 0;
	        if (this.a != null) {
	            if (this.p == null) {
	                this.p = new hy(this);
	            }
	            this.a.a(this.p);
	            this.x = 0;
	            int v0_13 = this.P;
	            this.P = 1;
	            this.f = this.a.a();
	            if (this.l < 0) {
	                if (v0_13 != 0) {
	                    this.requestLayout();
	                } else {
	                    this.b();
	                }
	            } else {
	                this.a(this.l, 0, 1);
	                this.l = -1;
	                this.m = 0;
	                this.n = 0;
	            }
	        }
	        return;
	    }
	
	
	    public void addFocusables(java.util.ArrayList p7, int p8, int p9)
	    {
	        int v1_0 = p7.size();
	        int v2 = this.getDescendantFocusability();
	        if (v2 != 393216) {
	            boolean v0_1 = 0;
	            while (v0_1 < this.getChildCount()) {
	                android.view.View v3_1 = this.getChildAt(v0_1);
	                if (v3_1.getVisibility() == 0) {
	                    int v4_1 = this.a(v3_1);
	                    if ((v4_1 != 0) && (v4_1.b == this.b)) {
	                        v3_1.addFocusables(p7, p8, p9);
	                    }
	                }
	                v0_1++;
	            }
	        }
	        if (((v2 != 262144) || (v1_0 == p7.size())) && (((this.isFocusable()) && (((p9 & 1) != 1) || ((!this.isInTouchMode()) || (this.isFocusableInTouchMode())))) && (p7 != null))) {
	            p7.add(this);
	        }
	        return;
	    }
	
	
	    public void addTouchables(java.util.ArrayList p5)
	    {
	        int v0 = 0;
	        while (v0 < this.getChildCount()) {
	            android.view.View v1_1 = this.getChildAt(v0);
	            if (v1_1.getVisibility() == 0) {
	                int v2_1 = this.a(v1_1);
	                if ((v2_1 != 0) && (v2_1.b == this.b)) {
	                    v1_1.addTouchables(p5);
	                }
	            }
	            v0++;
	        }
	        return;
	    }
	
	
	    public void addView(android.view.View p5, int p6, android.view.ViewGroup$LayoutParams p7)
	    {
	        String v1_0;
	        if (this.checkLayoutParams(p7)) {
	            v1_0 = p7;
	        } else {
	            v1_0 = this.generateLayoutParams(p7);
	        }
	        IllegalStateException v0_2 = ((hv) v1_0);
	        v0_2.a = (v0_2.a | (p5 instanceof ht));
	        if (!this.v) {
	            super.addView(p5, p6, v1_0);
	        } else {
	            if ((v0_2 == null) || (!v0_2.a)) {
	                v0_2.d = 1;
	                this.addViewInLayout(p5, p6, v1_0);
	            } else {
	                throw new IllegalStateException("Cannot add pager decor view during layout");
	            }
	        }
	        return;
	    }
	
	
	    public final void b()
	    {
	        this.c(this.b);
	        return;
	    }
	
	
	    public boolean canScrollHorizontally(int p6)
	    {
	        int v0 = 0;
	        if (this.a != null) {
	            int v2_1 = this.e();
	            int v3 = this.getScrollX();
	            if (p6 >= 0) {
	                if ((p6 > 0) && (v3 < ((int) (((float) v2_1) * this.t)))) {
	                    v0 = 1;
	                }
	            } else {
	                if (v3 > ((int) (((float) v2_1) * this.s))) {
	                    v0 = 1;
	                }
	            }
	        }
	        return v0;
	    }
	
	
	    protected boolean checkLayoutParams(android.view.ViewGroup$LayoutParams p2)
	    {
	        if ((!(p2 instanceof hv)) || (!super.checkLayoutParams(p2))) {
	            int v0_2 = 0;
	        } else {
	            v0_2 = 1;
	        }
	        return v0_2;
	    }
	
	
	    public void computeScroll()
	    {
	        if ((this.o.isFinished()) || (!this.o.computeScrollOffset())) {
	            this.a(1);
	        } else {
	            int v0_5 = this.getScrollX();
	            int v1 = this.getScrollY();
	            int v2_1 = this.o.getCurrX();
	            int v3_1 = this.o.getCurrY();
	            if ((v0_5 != v2_1) || (v1 != v3_1)) {
	                this.scrollTo(v2_1, v3_1);
	                if (!this.e(v2_1)) {
	                    this.o.abortAnimation();
	                    this.scrollTo(0, v3_1);
	                }
	            }
	            gt.d(this);
	        }
	        return;
	    }
	
	
	    public boolean dispatchKeyEvent(android.view.KeyEvent p5)
	    {
	        int v0 = 0;
	        if (super.dispatchKeyEvent(p5)) {
	            v0 = 1;
	        } else {
	            boolean v2_6;
	            if (p5.getAction() != 0) {
	                v2_6 = 0;
	            } else {
	                switch (p5.getKeyCode()) {
	                    case 21:
	                        v2_6 = this.g(17);
	                        break;
	                    case 22:
	                        v2_6 = this.g(66);
	                        break;
	                    case 61:
	                        if (android.os.Build$VERSION.SDK_INT < 11) {
	                        } else {
	                            if (!fi.a(p5)) {
	                                if (!fi.a(p5, 1)) {
	                                } else {
	                                    v2_6 = this.g(1);
	                                }
	                            } else {
	                                v2_6 = this.g(2);
	                            }
	                        }
	                        break;
	                    default:
	                }
	            }
	            if (v2_6) {
	            }
	        }
	        return v0;
	    }
	
	
	    public boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent p7)
	    {
	        int v0 = 0;
	        if (p7.getEventType() != 4096) {
	            int v2_1 = this.getChildCount();
	            int v1_1 = 0;
	            while (v1_1 < v2_1) {
	                boolean v3_0 = this.getChildAt(v1_1);
	                if (v3_0.getVisibility() == 0) {
	                    int v4_1 = this.a(v3_0);
	                    if ((v4_1 != 0) && ((v4_1.b == this.b) && (v3_0.dispatchPopulateAccessibilityEvent(p7)))) {
	                        v0 = 1;
	                        break;
	                    }
	                }
	                v1_1++;
	            }
	        } else {
	            v0 = super.dispatchPopulateAccessibilityEvent(p7);
	        }
	        return v0;
	    }
	
	
	    public void draw(android.graphics.Canvas p8)
	    {
	        super.draw(p8);
	        int v0_0 = 0;
	        int v1_0 = gt.a(this);
	        if ((v1_0 != 0) && ((v1_0 != 1) || ((this.a == null) || (this.a.a() <= 1)))) {
	            this.N.b();
	            this.O.b();
	        } else {
	            if (!this.N.a()) {
	                int v1_8 = p8.save();
	                int v0_3 = ((this.getHeight() - this.getPaddingTop()) - this.getPaddingBottom());
	                boolean v2_3 = this.getWidth();
	                p8.rotate(1132920832);
	                p8.translate(((float) ((- v0_3) + this.getPaddingTop())), (this.s * ((float) v2_3)));
	                this.N.a(v0_3, v2_3);
	                v0_0 = (this.N.a(p8) | 0);
	                p8.restoreToCount(v1_8);
	            }
	            if (!this.O.a()) {
	                int v1_11 = p8.save();
	                boolean v2_4 = this.getWidth();
	                int v3_7 = ((this.getHeight() - this.getPaddingTop()) - this.getPaddingBottom());
	                p8.rotate(1119092736);
	                p8.translate(((float) (- this.getPaddingTop())), ((- (this.t + 1065353216)) * ((float) v2_4)));
	                this.O.a(v3_7, v2_4);
	                v0_0 |= this.O.a(p8);
	                p8.restoreToCount(v1_11);
	            }
	        }
	        if (v0_0 != 0) {
	            gt.d(this);
	        }
	        return;
	    }
	
	
	    protected void drawableStateChanged()
	    {
	        super.drawableStateChanged();
	        return;
	    }
	
	
	    protected android.view.ViewGroup$LayoutParams generateDefaultLayoutParams()
	    {
	        return new hv();
	    }
	
	
	    public android.view.ViewGroup$LayoutParams generateLayoutParams(android.util.AttributeSet p3)
	    {
	        return new hv(this.getContext(), p3);
	    }
	
	
	    protected android.view.ViewGroup$LayoutParams generateLayoutParams(android.view.ViewGroup$LayoutParams p2)
	    {
	        return this.generateDefaultLayoutParams();
	    }
	
	
	    protected int getChildDrawingOrder(int p2, int p3)
	    {
	        return ((hv) ((android.view.View) this.S.get(p3)).getLayoutParams()).f;
	    }
	
	
	    protected void onAttachedToWindow()
	    {
	        super.onAttachedToWindow();
	        this.P = 1;
	        return;
	    }
	
	
	    protected void onDetachedFromWindow()
	    {
	        this.removeCallbacks(this.U);
	        super.onDetachedFromWindow();
	        return;
	    }
	
	
	    protected void onDraw(android.graphics.Canvas p1)
	    {
	        super.onDraw(p1);
	        return;
	    }
	
	
	    public boolean onInterceptTouchEvent(android.view.MotionEvent p14)
	    {
	        boolean v2 = 0;
	        boolean v0_1 = (p14.getAction() & 255);
	        if ((v0_1 != 3) && (v0_1 != 1)) {
	            if (v0_1) {
	                if (!this.y) {
	                    if (this.z) {
	                        return v2;
	                    }
	                } else {
	                    v2 = 1;
	                    return v2;
	                }
	            }
	            switch (v0_1) {
	                case 0:
	                    boolean v0_28 = p14.getX();
	                    this.F = v0_28;
	                    this.D = v0_28;
	                    boolean v0_29 = p14.getY();
	                    this.G = v0_29;
	                    this.E = v0_29;
	                    this.H = gd.b(p14, 0);
	                    this.z = 0;
	                    this.o.computeScrollOffset();
	                    if ((this.V != 2) || (Math.abs((this.o.getFinalX() - this.o.getCurrX())) <= this.M)) {
	                        this.a(0);
	                        this.y = 0;
	                    } else {
	                        this.o.abortAnimation();
	                        this.x = 0;
	                        this.b();
	                        this.y = 1;
	                        this.b(1);
	                        this.b(1);
	                    }
	                case 2:
	                    boolean v0_2 = this.H;
	                    if (v0_2 == -1) {
	                    } else {
	                        boolean v0_3 = gd.a(p14, v0_2);
	                        float v7 = gd.c(p14, v0_3);
	                        float v8 = (v7 - this.D);
	                        float v9 = Math.abs(v8);
	                        float v10 = gd.d(p14, v0_3);
	                        float v11 = Math.abs((v10 - this.G));
	                        if (v8 != 0) {
	                            boolean v0_10;
	                            boolean v0_7 = this.D;
	                            if (((v0_7 >= ((float) this.B)) || (v8 <= 0)) && ((v0_7 <= ((float) (this.getWidth() - this.B))) || (v8 >= 0))) {
	                                v0_10 = 0;
	                            } else {
	                                v0_10 = 1;
	                            }
	                            if ((!v0_10) && (this.a(this, 0, ((int) v8), ((int) v7), ((int) v10)))) {
	                                this.D = v7;
	                                this.E = v10;
	                                this.z = 1;
	                                return v2;
	                            }
	                        }
	                        if ((v9 <= ((float) this.C)) || ((1056964608 * v9) <= v11)) {
	                            if (v11 > ((float) this.C)) {
	                                this.z = 1;
	                            }
	                        } else {
	                            boolean v0_24;
	                            this.y = 1;
	                            this.b(1);
	                            this.b(1);
	                            if (v8 <= 0) {
	                                v0_24 = (this.F - ((float) this.C));
	                            } else {
	                                v0_24 = (this.F + ((float) this.C));
	                            }
	                            this.D = v0_24;
	                            this.E = v10;
	                            this.c(1);
	                        }
	                        if ((!this.y) || (!this.a(v7))) {
	                        } else {
	                            gt.d(this);
	                        }
	                    }
	                case 6:
	                    this.a(p14);
	                    break;
	            }
	            if (this.I == null) {
	                this.I = android.view.VelocityTracker.obtain();
	            }
	            this.I.addMovement(p14);
	            v2 = this.y;
	        } else {
	            this.y = 0;
	            this.z = 0;
	            this.H = -1;
	            if (this.I != null) {
	                this.I.recycle();
	                this.I = 0;
	            }
	        }
	        return v2;
	    }
	
	
	    protected void onLayout(boolean p18, int p19, int p20, int p21, int p22)
	    {
	        int v9 = this.getChildCount();
	        int v10_0 = (p21 - p19);
	        int v11 = (p22 - p20);
	        int v6_0 = this.getPaddingLeft();
	        int v2_0 = this.getPaddingTop();
	        int v5_0 = this.getPaddingRight();
	        int v3_0 = this.getPaddingBottom();
	        int v12_0 = this.getScrollX();
	        int v4_0 = 0;
	        android.view.View v8_0 = 0;
	        while (v8_0 < v9) {
	            int v5_2;
	            int v2_2;
	            int v1_20;
	            int v4_2;
	            int v13_1 = this.getChildAt(v8_0);
	            if (v13_1.getVisibility() == 8) {
	                v1_20 = v4_0;
	                v4_2 = v2_0;
	                v2_2 = v5_0;
	                v5_2 = v6_0;
	            } else {
	                int v1_19 = ((hv) v13_1.getLayoutParams());
	                if (!v1_19.a) {
	                } else {
	                    int v7_7;
	                    int v14_0 = (v1_19.b & 112);
	                    switch ((v1_19.b & 7)) {
	                        case 1:
	                            v7_7 = Math.max(((v10_0 - v13_1.getMeasuredWidth()) / 2), v6_0);
	                            break;
	                        case 2:
	                        case 4:
	                        default:
	                            v7_7 = v6_0;
	                            break;
	                        case 3:
	                            v7_7 = v6_0;
	                            v6_0 = (v13_1.getMeasuredWidth() + v6_0);
	                            break;
	                        case 5:
	                            int v1_23 = ((v10_0 - v5_0) - v13_1.getMeasuredWidth());
	                            v5_0 += v13_1.getMeasuredWidth();
	                            v7_7 = v1_23;
	                            break;
	                    }
	                    int v2_3;
	                    int v3_3;
	                    int v1_31;
	                    switch (v14_0) {
	                        case 16:
	                            v1_31 = Math.max(((v11 - v13_1.getMeasuredHeight()) / 2), v2_0);
	                            v3_3 = v2_0;
	                            v2_3 = v3_0;
	                            break;
	                        case 48:
	                            v2_3 = v3_0;
	                            v3_3 = (v13_1.getMeasuredHeight() + v2_0);
	                            v1_31 = v2_0;
	                            break;
	                        case 80:
	                            v1_31 = ((v11 - v3_0) - v13_1.getMeasuredHeight());
	                            v3_3 = v2_0;
	                            v2_3 = (v3_0 + v13_1.getMeasuredHeight());
	                            break;
	                        default:
	                            v1_31 = v2_0;
	                            v3_3 = v2_0;
	                            v2_3 = v3_0;
	                    }
	                    int v7_8 = (v7_7 + v12_0);
	                    v13_1.layout(v7_8, v1_31, (v13_1.getMeasuredWidth() + v7_8), (v13_1.getMeasuredHeight() + v1_31));
	                    v1_20 = (v4_0 + 1);
	                    v4_2 = v3_3;
	                    v3_0 = v2_3;
	                    v2_2 = v5_0;
	                    v5_2 = v6_0;
	                }
	            }
	            v8_0++;
	            v6_0 = v5_2;
	            v5_0 = v2_2;
	            v2_0 = v4_2;
	            v4_0 = v1_20;
	        }
	        int v7_0 = ((v10_0 - v6_0) - v5_0);
	        int v5_1 = 0;
	        while (v5_1 < v9) {
	            android.view.View v8_1 = this.getChildAt(v5_1);
	            if (v8_1.getVisibility() != 8) {
	                int v1_9 = ((hv) v8_1.getLayoutParams());
	                if (!v1_9.a) {
	                    int v10_3 = this.a(v8_1);
	                    if (v10_3 != 0) {
	                        int v10_7 = (((int) (v10_3.e * ((float) v7_0))) + v6_0);
	                        if (v1_9.d) {
	                            v1_9.d = 0;
	                            v8_1.measure(android.view.View$MeasureSpec.makeMeasureSpec(((int) (v1_9.c * ((float) v7_0))), 1073741824), android.view.View$MeasureSpec.makeMeasureSpec(((v11 - v2_0) - v3_0), 1073741824));
	                        }
	                        v8_1.layout(v10_7, v2_0, (v8_1.getMeasuredWidth() + v10_7), (v8_1.getMeasuredHeight() + v2_0));
	                    }
	                }
	            }
	            v5_1++;
	        }
	        this.q = v2_0;
	        this.r = (v11 - v3_0);
	        this.R = v4_0;
	        if (this.P) {
	            this.a(this.b, 0, 0, 0);
	        }
	        this.P = 0;
	        return;
	    }
	
	
	    protected void onMeasure(int p14, int p15)
	    {
	        this.setMeasuredDimension(android.support.v4.view.ViewPager.getDefaultSize(0, p14), android.support.v4.view.ViewPager.getDefaultSize(0, p15));
	        int v0_2 = this.getMeasuredWidth();
	        this.B = Math.min((v0_2 / 10), this.A);
	        int v3 = ((v0_2 - this.getPaddingLeft()) - this.getPaddingRight());
	        int v5_0 = ((this.getMeasuredHeight() - this.getPaddingTop()) - this.getPaddingBottom());
	        int v9 = this.getChildCount();
	        int v8 = 0;
	        while (v8 < v9) {
	            android.view.View v10 = this.getChildAt(v8);
	            if (v10.getVisibility() != 8) {
	                int v0_23 = ((hv) v10.getLayoutParams());
	                if ((v0_23 != 0) && (v0_23.a)) {
	                    int v7_2;
	                    int v6_0 = (v0_23.b & 7);
	                    int v4_1 = (v0_23.b & 112);
	                    int v2_2 = -2147483648;
	                    int v1_13 = -2147483648;
	                    if ((v4_1 != 48) && (v4_1 != 80)) {
	                        v7_2 = 0;
	                    } else {
	                        v7_2 = 1;
	                    }
	                    if ((v6_0 != 3) && (v6_0 != 5)) {
	                        int v6_1 = 0;
	                    } else {
	                        v6_1 = 1;
	                    }
	                    if (v7_2 == 0) {
	                        if (v6_1 != 0) {
	                            v1_13 = 1073741824;
	                        }
	                    } else {
	                        v2_2 = 1073741824;
	                    }
	                    int v4_9;
	                    int v2_3;
	                    if (v0_23.width == -2) {
	                        v4_9 = v2_2;
	                        v2_3 = v3;
	                    } else {
	                        v4_9 = 1073741824;
	                        if (v0_23.width == -1) {
	                            v2_3 = v3;
	                        } else {
	                            v2_3 = v0_23.width;
	                        }
	                    }
	                    int v0_24;
	                    if (v0_23.height == -2) {
	                        v0_24 = v5_0;
	                    } else {
	                        v1_13 = 1073741824;
	                        if (v0_23.height == -1) {
	                        } else {
	                            v0_24 = v0_23.height;
	                        }
	                    }
	                    v10.measure(android.view.View$MeasureSpec.makeMeasureSpec(v2_3, v4_9), android.view.View$MeasureSpec.makeMeasureSpec(v0_24, v1_13));
	                    if (v7_2 == 0) {
	                        if (v6_1 != 0) {
	                            v3 -= v10.getMeasuredWidth();
	                        }
	                    } else {
	                        v5_0 -= v10.getMeasuredHeight();
	                    }
	                }
	            }
	            v8++;
	        }
	        android.view.View$MeasureSpec.makeMeasureSpec(v3, 1073741824);
	        this.u = android.view.View$MeasureSpec.makeMeasureSpec(v5_0, 1073741824);
	        this.v = 1;
	        this.b();
	        this.v = 0;
	        int v2_1 = this.getChildCount();
	        int v1_8 = 0;
	        while (v1_8 < v2_1) {
	            int v4_0 = this.getChildAt(v1_8);
	            if (v4_0.getVisibility() != 8) {
	                int v0_15 = ((hv) v4_0.getLayoutParams());
	                if ((v0_15 == 0) || (!v0_15.a)) {
	                    v4_0.measure(android.view.View$MeasureSpec.makeMeasureSpec(((int) (v0_15.c * ((float) v3))), 1073741824), this.u);
	                }
	            }
	            v1_8++;
	        }
	        return;
	    }
	
	
	    protected boolean onRequestFocusInDescendants(int p9, android.graphics.Rect p10)
	    {
	        int v3_1;
	        int v2 = 1;
	        int v1 = -1;
	        int v0_0 = this.getChildCount();
	        if ((p9 & 2) == 0) {
	            v3_1 = (v0_0 - 1);
	            v0_0 = -1;
	        } else {
	            v1 = 1;
	            v3_1 = 0;
	        }
	        while (v3_1 != v0_0) {
	            boolean v5_0 = this.getChildAt(v3_1);
	            if (v5_0.getVisibility() == 0) {
	                int v6_1 = this.a(v5_0);
	                if ((v6_1 != 0) && ((v6_1.b == this.b) && (v5_0.requestFocus(p9, p10)))) {
	                    return v2;
	                }
	            }
	            v3_1 += v1;
	        }
	        v2 = 0;
	        return v2;
	    }
	
	
	    public void onRestoreInstanceState(android.os.Parcelable p4)
	    {
	        if ((p4 instanceof hz)) {
	            super.onRestoreInstanceState(((hz) p4).getSuperState());
	            if (this.a == null) {
	                this.l = ((hz) p4).a;
	                this.m = ((hz) p4).b;
	                this.n = ((hz) p4).c;
	            } else {
	                this.a(((hz) p4).a, 0, 1);
	            }
	        } else {
	            super.onRestoreInstanceState(p4);
	        }
	        return;
	    }
	
	
	    public android.os.Parcelable onSaveInstanceState()
	    {
	        hz v1_1 = new hz(super.onSaveInstanceState());
	        v1_1.a = this.b;
	        if (this.a != null) {
	            v1_1.b = 0;
	        }
	        return v1_1;
	    }
	
	
	    protected void onSizeChanged(int p7, int p8, int p9, int p10)
	    {
	        super.onSizeChanged(p7, p8, p9, p10);
	        if (p7 != p9) {
	            if ((p9 <= 0) || (this.i.isEmpty())) {
	                int v0_4;
	                int v0_3 = this.d(this.b);
	                if (v0_3 == 0) {
	                    v0_4 = 0;
	                } else {
	                    v0_4 = Math.min(v0_3.e, this.t);
	                }
	                int v0_7 = ((int) (v0_4 * ((float) ((p7 - this.getPaddingLeft()) - this.getPaddingRight()))));
	                if (v0_7 != this.getScrollX()) {
	                    this.a(0);
	                    this.scrollTo(v0_7, this.getScrollY());
	                }
	            } else {
	                int v1_14 = ((int) (((float) (((p7 - this.getPaddingLeft()) - this.getPaddingRight()) + 0)) * (((float) this.getScrollX()) / ((float) (((p9 - this.getPaddingLeft()) - this.getPaddingRight()) + 0)))));
	                this.scrollTo(v1_14, this.getScrollY());
	                if (!this.o.isFinished()) {
	                    this.o.startScroll(v1_14, 0, ((int) (this.d(this.b).e * ((float) p7))), 0, (this.o.getDuration() - this.o.timePassed()));
	                }
	            }
	        }
	        return;
	    }
	
	
	    public boolean onTouchEvent(android.view.MotionEvent p9)
	    {
	        boolean v0_58;
	        int v3_0 = 0;
	        if ((p9.getAction() != 0) || (p9.getEdgeFlags() == 0)) {
	            if ((this.a != null) && (this.a.a() != 0)) {
	                if (this.I == null) {
	                    this.I = android.view.VelocityTracker.obtain();
	                }
	                this.I.addMovement(p9);
	                switch ((p9.getAction() & 255)) {
	                    case 0:
	                        this.o.abortAnimation();
	                        this.x = 0;
	                        this.b();
	                        boolean v0_55 = p9.getX();
	                        this.F = v0_55;
	                        this.D = v0_55;
	                        boolean v0_56 = p9.getY();
	                        this.G = v0_56;
	                        this.E = v0_56;
	                        this.H = gd.b(p9, 0);
	                        break;
	                    case 1:
	                        if (!this.y) {
	                        } else {
	                            int v2_10;
	                            boolean v0_39 = this.I;
	                            v0_39.computeCurrentVelocity(1000, ((float) this.K));
	                            float v5_1 = ((int) gp.a(v0_39, this.H));
	                            this.x = 1;
	                            boolean v1_11 = this.e();
	                            int v2_5 = this.getScrollX();
	                            int v6_3 = this.f();
	                            boolean v0_41 = v6_3.b;
	                            if ((Math.abs(((int) (gd.c(p9, gd.a(p9, this.H)) - this.F))) <= this.L) || (Math.abs(v5_1) <= this.J)) {
	                                boolean v1_23;
	                                if (v0_41 < this.b) {
	                                    v1_23 = 1058642330;
	                                } else {
	                                    v1_23 = 1053609165;
	                                }
	                                v2_10 = ((int) ((((float) v0_41) + (((((float) v2_5) / ((float) v1_11)) - v6_3.e) / v6_3.d)) + v1_23));
	                            } else {
	                                if (v5_1 <= 0) {
	                                    v0_41++;
	                                }
	                                v2_10 = v0_41;
	                            }
	                            if (this.i.size() > 0) {
	                                v2_10 = Math.max(((hu) this.i.get(0)).b, Math.min(v2_10, ((hu) this.i.get((this.i.size() - 1))).b));
	                            }
	                            this.a(v2_10, 1, 1, v5_1);
	                            this.H = -1;
	                            this.g();
	                            v3_0 = (this.N.c() | this.O.c());
	                        }
	                        break;
	                    case 2:
	                        if (!this.y) {
	                            boolean v0_21 = gd.a(p9, this.H);
	                            boolean v1_3 = gd.c(p9, v0_21);
	                            int v2_2 = Math.abs((v1_3 - this.D));
	                            float v5_0 = gd.d(p9, v0_21);
	                            boolean v0_24 = Math.abs((v5_0 - this.E));
	                            if ((v2_2 > ((float) this.C)) && (v2_2 > v0_24)) {
	                                boolean v0_30;
	                                this.y = 1;
	                                this.b(1);
	                                if ((v1_3 - this.F) <= 0) {
	                                    v0_30 = (this.F - ((float) this.C));
	                                } else {
	                                    v0_30 = (this.F + ((float) this.C));
	                                }
	                                this.D = v0_30;
	                                this.E = v5_0;
	                                this.b(1);
	                                this.c(1);
	                                boolean v0_32 = this.getParent();
	                                if (v0_32) {
	                                    v0_32.requestDisallowInterceptTouchEvent(1);
	                                }
	                            }
	                        }
	                        if (!this.y) {
	                        } else {
	                            v3_0 = (this.a(gd.c(p9, gd.a(p9, this.H))) | 0);
	                        }
	                        break;
	                    case 3:
	                        if (this.y) {
	                            this.a(this.b, 1, 0, 0);
	                            this.H = -1;
	                            this.g();
	                            v3_0 = (this.N.c() | this.O.c());
	                        } else {
	                        }
	                    case 4:
	                    default:
	                        break;
	                    case 5:
	                        boolean v0_13 = gd.b(p9);
	                        this.D = gd.c(p9, v0_13);
	                        this.H = gd.b(p9, v0_13);
	                        break;
	                    case 6:
	                        this.a(p9);
	                        this.D = gd.c(p9, gd.a(p9, this.H));
	                        break;
	                }
	                if (v3_0 != 0) {
	                    gt.d(this);
	                }
	                v0_58 = 1;
	            } else {
	                v0_58 = 0;
	            }
	        } else {
	            v0_58 = 0;
	        }
	        return v0_58;
	    }
	
	
	    public void removeView(android.view.View p2)
	    {
	        if (!this.v) {
	            super.removeView(p2);
	        } else {
	            this.removeViewInLayout(p2);
	        }
	        return;
	    }
	
	
	    protected boolean verifyDrawable(android.graphics.drawable.Drawable p2)
	    {
	        if ((!super.verifyDrawable(p2)) && (p2 != null)) {
	            int v0_1 = 0;
	        } else {
	            v0_1 = 1;
	        }
	        return v0_1;
	    }
	
