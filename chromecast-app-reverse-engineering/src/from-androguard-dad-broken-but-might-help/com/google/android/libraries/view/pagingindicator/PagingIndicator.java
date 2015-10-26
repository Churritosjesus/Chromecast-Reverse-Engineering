	private final android.graphics.Path A
	private final android.graphics.Path B
	private final android.graphics.Path C
	private final android.graphics.RectF D
	private android.animation.ValueAnimator E
	private Landroid.animation.ValueAnimator F
	private android.animation.AnimatorSet G
	private czy H
	private Ldac I
	private final android.view.animation.Interpolator J
	private  K
	private  L
	private  M
	private  N
	private  O
	private  P
	private  Q
	private  R
	public android.support.v4.view.ViewPager a
	public hx b
	private  c
	private  d
	private  e
	private  f
	private  g
	private  h
	private  i
	private  j
	private  k
	private  l
	private  m
	private  n
	private  o
	private  p
	private  q
	private F r
	private F s
	private  t
	private  u
	private F v
	private  w
	private final android.graphics.Paint x
	private final android.graphics.Paint y
	private final android.graphics.Path z
	
	    static PagingIndicator()
	    {
	        com.google.android.libraries.view.pagingindicator.PagingIndicator.getSimpleName();
	        return;
	    }
	
	
	    public PagingIndicator(android.content.Context p3)
	    {
	        this(p3, 0, 0);
	        return;
	    }
	
	
	    public PagingIndicator(android.content.Context p2, android.util.AttributeSet p3)
	    {
	        this(p2, p3, 0);
	        return;
	    }
	
	
	    public PagingIndicator(android.content.Context p8, android.util.AttributeSet p9, int p10)
	    {
	        this(p8, p9, p10);
	        czs v0_3 = ((int) p8.getResources().getDisplayMetrics().scaledDensity);
	        int v1_1 = this.getContext().obtainStyledAttributes(p9, dai.a, p10, 0);
	        this.c = v1_1.getDimensionPixelSize(dai.d, (v0_3 * 8));
	        this.h = ((float) (this.c / 2));
	        this.i = (this.h / 1073741824);
	        this.d = v1_1.getDimensionPixelSize(dai.e, (v0_3 * 12));
	        this.e = ((long) v1_1.getInteger(dai.b, 400));
	        this.j = (this.e / 2);
	        this.f = v1_1.getColor(dai.f, -2130706433);
	        this.g = v1_1.getColor(dai.c, -1);
	        v1_1.recycle();
	        this.x = new android.graphics.Paint(1);
	        this.x.setColor(this.f);
	        this.y = new android.graphics.Paint(1);
	        this.y.setColor(this.g);
	        if (android.os.Build$VERSION.SDK_INT < 21) {
	            this.J = android.view.animation.AnimationUtils.loadInterpolator(p8, 17432580);
	        } else {
	            this.J = android.view.animation.AnimationUtils.loadInterpolator(p8, 17563661);
	        }
	        this.z = new android.graphics.Path();
	        this.A = new android.graphics.Path();
	        this.B = new android.graphics.Path();
	        this.C = new android.graphics.Path();
	        this.D = new android.graphics.RectF();
	        this.addOnAttachStateChangeListener(new czs(this));
	        return;
	    }
	
	
	    public static synthetic float a(com.google.android.libraries.view.pagingindicator.PagingIndicator p0, float p1)
	    {
	        p0.p = p1;
	        return p1;
	    }
	
	
	    public static synthetic android.support.v4.view.ViewPager a(com.google.android.libraries.view.pagingindicator.PagingIndicator p1)
	    {
	        return p1.a;
	    }
	
	
	    public static synthetic void a(com.google.android.libraries.view.pagingindicator.PagingIndicator p0, int p1)
	    {
	        p0.c(p1);
	        return;
	    }
	
	
	    public static synthetic void a(com.google.android.libraries.view.pagingindicator.PagingIndicator p1, int p2, float p3)
	    {
	        p1.s[p2] = p3;
	        p1.postInvalidateOnAnimation();
	        return;
	    }
	
	
	    public static synthetic boolean a(com.google.android.libraries.view.pagingindicator.PagingIndicator p0, boolean p1)
	    {
	        p0.w = p1;
	        return p1;
	    }
	
	
	    public static synthetic dac[] a(com.google.android.libraries.view.pagingindicator.PagingIndicator p0, dac[] p1)
	    {
	        p0.I = p1;
	        return p1;
	    }
	
	
	    public static synthetic float b(com.google.android.libraries.view.pagingindicator.PagingIndicator p1)
	    {
	        return p1.p;
	    }
	
	
	    public static synthetic float b(com.google.android.libraries.view.pagingindicator.PagingIndicator p0, float p1)
	    {
	        p0.t = p1;
	        return p1;
	    }
	
	
	    private void b()
	    {
	        float v0_0 = this.getPaddingLeft();
	        int v1 = this.getPaddingTop();
	        float v2_6 = (this.h + ((float) (v0_0 + ((((this.getWidth() - this.getPaddingRight()) - v0_0) - this.d()) / 2))));
	        float v0_4 = new float[this.n];
	        this.r = v0_4;
	        float v0_5 = 0;
	        while (v0_5 < this.n) {
	            this.r[v0_5] = (((float) ((this.c + this.d) * v0_5)) + v2_6);
	            v0_5++;
	        }
	        this.k = ((float) v1);
	        this.l = (((float) v1) + this.h);
	        this.m = ((float) (this.c + v1));
	        this.a();
	        return;
	    }
	
	
	    public static synthetic void b(com.google.android.libraries.view.pagingindicator.PagingIndicator p1, int p2, float p3)
	    {
	        p1.v[p2] = p3;
	        p1.postInvalidateOnAnimation();
	        return;
	    }
	
	
	    public static synthetic boolean b(com.google.android.libraries.view.pagingindicator.PagingIndicator p0, boolean p1)
	    {
	        p0.q = p1;
	        return p1;
	    }
	
	
	    public static synthetic float c(com.google.android.libraries.view.pagingindicator.PagingIndicator p0, float p1)
	    {
	        p0.u = p1;
	        return p1;
	    }
	
	
	    public static synthetic czy c(com.google.android.libraries.view.pagingindicator.PagingIndicator p1)
	    {
	        return p1.H;
	    }
	
	
	    private void c()
	    {
	        if (this.n > 0) {
	            int v0_3 = new float[(this.n - 1)];
	            this.s = v0_3;
	            java.util.Arrays.fill(this.s, 0);
	            int v0_6 = new float[this.n];
	            this.v = v0_6;
	            java.util.Arrays.fill(this.v, 0);
	            this.t = -1082130432;
	            this.u = -1082130432;
	            this.q = 1;
	        }
	        return;
	    }
	
	
	    private int d()
	    {
	        return ((this.n * this.c) + ((this.n - 1) * this.d));
	    }
	
	
	    public static synthetic long d(com.google.android.libraries.view.pagingindicator.PagingIndicator p2)
	    {
	        return p2.j;
	    }
	
	
	    public static synthetic android.view.animation.Interpolator e(com.google.android.libraries.view.pagingindicator.PagingIndicator p1)
	    {
	        return p1.J;
	    }
	
	
	    private void e()
	    {
	        if ((this.E != null) && (this.E.isRunning())) {
	            this.E.cancel();
	        }
	        this.f();
	        if ((this.H != null) && (this.H.isRunning())) {
	            this.H.cancel();
	        }
	        if (this.I != null) {
	            dac[] v1 = this.I;
	            int v2 = v1.length;
	            int v0_9 = 0;
	            while (v0_9 < v2) {
	                v1[v0_9].cancel();
	                v0_9++;
	            }
	        }
	        this.c();
	        return;
	    }
	
	
	    private void f()
	    {
	        if ((this.G != null) && (this.G.isRunning())) {
	            this.G.cancel();
	        }
	        return;
	    }
	
	
	    public static synthetic float[] f(com.google.android.libraries.view.pagingindicator.PagingIndicator p1)
	    {
	        return p1.r;
	    }
	
	
	    public static synthetic float g(com.google.android.libraries.view.pagingindicator.PagingIndicator p1)
	    {
	        return p1.h;
	    }
	
	
	    public static synthetic dac[] h(com.google.android.libraries.view.pagingindicator.PagingIndicator p1)
	    {
	        return p1.I;
	    }
	
	
	    public static synthetic float i(com.google.android.libraries.view.pagingindicator.PagingIndicator p1)
	    {
	        return p1.t;
	    }
	
	
	    public static synthetic float j(com.google.android.libraries.view.pagingindicator.PagingIndicator p1)
	    {
	        return p1.u;
	    }
	
	
	    public static synthetic void k(com.google.android.libraries.view.pagingindicator.PagingIndicator p0)
	    {
	        p0.f();
	        return;
	    }
	
	
	    public static synthetic void l(com.google.android.libraries.view.pagingindicator.PagingIndicator p2)
	    {
	        java.util.Arrays.fill(p2.s, 0);
	        p2.postInvalidateOnAnimation();
	        return;
	    }
	
	
	    public void a()
	    {
	        if (this.a == null) {
	            this.o = 0;
	        } else {
	            this.o = this.a.b;
	        }
	        if (this.n > 0) {
	            this.p = this.r[this.o];
	        }
	        return;
	    }
	
	
	    public final void a(int p14)
	    {
	        if (!this.w) {
	            this.a();
	        } else {
	            if ((p14 != this.o) && (this.n != 0)) {
	                int v2 = this.o;
	                this.o = p14;
	                if (android.os.Build$VERSION.SDK_INT < 16) {
	                    this.a();
	                    this.invalidate();
	                } else {
	                    android.animation.ValueAnimator v5_1;
	                    this.e();
	                    int v4 = Math.abs((p14 - v2));
	                    int v1_1 = this.r[p14];
	                    int v0_6 = new float[2];
	                    v0_6[0] = this.p;
	                    v0_6[1] = v1_1;
	                    android.animation.ValueAnimator v7 = android.animation.ValueAnimator.ofFloat(v0_6);
	                    if (p14 <= v2) {
	                        v5_1 = new czx(this, (v1_1 + ((this.p - v1_1) * 1048576000)));
	                    } else {
	                        v5_1 = new dag(this, (v1_1 - ((v1_1 - this.p) * 1048576000)));
	                    }
	                    int v0_14;
	                    this.H = new czy(this, v2, p14, v4, v5_1);
	                    v7.addUpdateListener(new czu(this));
	                    v7.addListener(new czv(this));
	                    if (!this.q) {
	                        v0_14 = 0;
	                    } else {
	                        v0_14 = (this.e / 4);
	                    }
	                    v7.setStartDelay(v0_14);
	                    v7.setDuration(((this.e * 3) / 4));
	                    v7.setInterpolator(this.J);
	                    this.E = v7;
	                    int v0_20 = new android.animation.ValueAnimator[v4];
	                    this.F = v0_20;
	                    int v1_5 = 0;
	                    while (v1_5 < v4) {
	                        int v0_27;
	                        android.animation.ValueAnimator[] v3_9 = this.F;
	                        if (p14 <= v2) {
	                            v0_27 = ((v2 - 1) - v1_5);
	                        } else {
	                            v0_27 = (v2 + v1_5);
	                        }
	                        long v6_2 = (((long) v1_5) * (this.e / 8));
	                        android.animation.ValueAnimator v5_3 = new float[2];
	                        v5_3 = {0, 1065353216};
	                        android.animation.ValueAnimator v5_4 = android.animation.ValueAnimator.ofFloat(v5_3);
	                        v5_4.addUpdateListener(new czw(this, v0_27));
	                        v5_4.setDuration(this.j);
	                        v5_4.setStartDelay(v6_2);
	                        v5_4.setInterpolator(this.J);
	                        v3_9[v1_5] = v5_4;
	                        v1_5++;
	                    }
	                    this.E.start();
	                    this.G = new android.animation.AnimatorSet();
	                    this.G.playTogether(this.F);
	                    this.G.start();
	                }
	            }
	        }
	        if (this.b != null) {
	            this.b.a(p14);
	        }
	        return;
	    }
	
	
	    public final void a(int p2, float p3, int p4)
	    {
	        if (this.b != null) {
	            this.b.a(p2, p3, p4);
	        }
	        return;
	    }
	
	
	    public final void b(int p2)
	    {
	        if (this.b != null) {
	            this.b.b(p2);
	        }
	        return;
	    }
	
	
	    public void c(int p1)
	    {
	        this.n = p1;
	        this.b();
	        this.c();
	        return;
	    }
	
	
	    public void clearAnimation()
	    {
	        super.clearAnimation();
	        if (android.os.Build$VERSION.SDK_INT >= 16) {
	            this.e();
	        }
	        return;
	    }
	
	
	    protected void onDraw(android.graphics.Canvas p13)
	    {
	        if ((this.a != null) && (this.n != 0)) {
	            this.z.rewind();
	            int v7 = 0;
	            while (v7 < this.n) {
	                android.graphics.Path v0_13;
	                if (v7 != (this.n - 1)) {
	                    v0_13 = (v7 + 1);
	                } else {
	                    v0_13 = v7;
	                }
	                if (android.os.Build$VERSION.SDK_INT < 21) {
	                    p13.drawCircle(this.r[v7], this.l, this.h, this.x);
	                } else {
	                    float v8;
	                    float v9 = this.r[v7];
	                    float v10 = this.r[v0_13];
	                    if (v7 != (this.n - 1)) {
	                        v8 = this.s[v7];
	                    } else {
	                        v8 = -1082130432;
	                    }
	                    float v11 = this.v[v7];
	                    this.A.rewind();
	                    if (((v8 == 0) || (v8 == -1082130432)) && ((v11 == 0) && ((v7 != this.o) || (this.q != 1)))) {
	                        this.A.addCircle(this.r[v7], this.l, this.h, android.graphics.Path$Direction.CW);
	                    }
	                    if ((v8 > 0) && ((v8 < 1056964608) && (this.t == -1082130432))) {
	                        this.B.rewind();
	                        this.B.moveTo(v9, this.m);
	                        this.D.set((v9 - this.h), this.k, (this.h + v9), this.m);
	                        this.B.arcTo(this.D, 1119092736, 1127481344, 1);
	                        this.K = ((this.h + v9) + (((float) this.d) * v8));
	                        this.L = this.l;
	                        this.O = (this.i + v9);
	                        this.P = this.k;
	                        this.Q = this.K;
	                        this.R = (this.L - this.i);
	                        this.B.cubicTo(this.O, this.P, this.Q, this.R, this.K, this.L);
	                        this.M = v9;
	                        this.N = this.m;
	                        this.O = this.K;
	                        this.P = (this.L + this.i);
	                        this.Q = (this.i + v9);
	                        this.R = this.m;
	                        this.B.cubicTo(this.O, this.P, this.Q, this.R, this.M, this.N);
	                        if (android.os.Build$VERSION.SDK_INT >= 21) {
	                            this.A.op(this.B, android.graphics.Path$Op.UNION);
	                        }
	                        this.C.rewind();
	                        this.C.moveTo(v10, this.m);
	                        this.D.set((v10 - this.h), this.k, (this.h + v10), this.m);
	                        this.C.arcTo(this.D, 1119092736, -1020002304, 1);
	                        this.K = ((v10 - this.h) - (((float) this.d) * v8));
	                        this.L = this.l;
	                        this.O = (v10 - this.i);
	                        this.P = this.k;
	                        this.Q = this.K;
	                        this.R = (this.L - this.i);
	                        this.C.cubicTo(this.O, this.P, this.Q, this.R, this.K, this.L);
	                        this.M = v10;
	                        this.N = this.m;
	                        this.O = this.K;
	                        this.P = (this.L + this.i);
	                        this.Q = (this.M - this.i);
	                        this.R = this.m;
	                        this.C.cubicTo(this.O, this.P, this.Q, this.R, this.M, this.N);
	                        if (android.os.Build$VERSION.SDK_INT >= 21) {
	                            this.A.op(this.C, android.graphics.Path$Op.UNION);
	                        }
	                    }
	                    if ((v8 > 1056964608) && ((v8 < 1065353216) && (this.t == -1082130432))) {
	                        this.A.moveTo(v9, this.m);
	                        this.D.set((v9 - this.h), this.k, (this.h + v9), this.m);
	                        this.A.arcTo(this.D, 1119092736, 1127481344, 1);
	                        this.K = ((this.h + v9) + ((float) (this.d / 2)));
	                        this.L = (this.l - (this.h * v8));
	                        this.O = (this.K - (this.h * v8));
	                        this.P = this.k;
	                        this.Q = (this.K - ((1065353216 - v8) * this.h));
	                        this.R = this.L;
	                        this.A.cubicTo(this.O, this.P, this.Q, this.R, this.K, this.L);
	                        this.M = v10;
	                        this.N = this.k;
	                        this.O = (this.K + ((1065353216 - v8) * this.h));
	                        this.P = this.L;
	                        this.Q = (this.K + (this.h * v8));
	                        this.R = this.k;
	                        this.A.cubicTo(this.O, this.P, this.Q, this.R, this.M, this.N);
	                        this.D.set((v10 - this.h), this.k, (this.h + v10), this.m);
	                        this.A.arcTo(this.D, 1132920832, 1127481344, 1);
	                        this.L = (this.l + (this.h * v8));
	                        this.O = (this.K + (this.h * v8));
	                        this.P = this.m;
	                        this.Q = (this.K + ((1065353216 - v8) * this.h));
	                        this.R = this.L;
	                        this.A.cubicTo(this.O, this.P, this.Q, this.R, this.K, this.L);
	                        this.M = v9;
	                        this.N = this.m;
	                        this.O = (this.K - ((1065353216 - v8) * this.h));
	                        this.P = this.L;
	                        this.Q = (this.K - (this.h * v8));
	                        this.R = this.N;
	                        this.A.cubicTo(this.O, this.P, this.Q, this.R, this.M, this.N);
	                    }
	                    if ((v8 == 1065353216) && (this.t == -1082130432)) {
	                        this.D.set((v9 - this.h), this.k, (this.h + v10), this.m);
	                        this.A.addRoundRect(this.D, this.h, this.h, android.graphics.Path$Direction.CW);
	                    }
	                    if (v11 > 925353388) {
	                        this.A.addCircle(v9, this.l, (this.h * v11), android.graphics.Path$Direction.CW);
	                    }
	                    this.z.op(this.A, android.graphics.Path$Op.UNION);
	                }
	                v7++;
	            }
	            if ((this.t != -1082130432) && (android.os.Build$VERSION.SDK_INT >= 21)) {
	                android.graphics.Path v0_8 = this.z;
	                this.A.rewind();
	                this.D.set(this.t, this.k, this.u, this.m);
	                this.A.addRoundRect(this.D, this.h, this.h, android.graphics.Path$Direction.CW);
	                v0_8.op(this.A, android.graphics.Path$Op.UNION);
	            }
	            p13.drawPath(this.z, this.x);
	            p13.drawCircle(this.p, this.l, this.h, this.y);
	        }
	        return;
	    }
	
	
	    protected void onMeasure(int p4, int p5)
	    {
	        int v0_2 = ((this.getPaddingTop() + this.c) + this.getPaddingBottom());
	        switch (android.view.View$MeasureSpec.getMode(p5)) {
	            case -2147483648:
	                v0_2 = Math.min(v0_2, android.view.View$MeasureSpec.getSize(p5));
	                break;
	            case 1073741824:
	                v0_2 = android.view.View$MeasureSpec.getSize(p5);
	                break;
	        }
	        int v1_6 = ((this.getPaddingLeft() + this.d()) + this.getPaddingRight());
	        switch (android.view.View$MeasureSpec.getMode(p4)) {
	            case -2147483648:
	                v1_6 = Math.min(v1_6, android.view.View$MeasureSpec.getSize(p4));
	                break;
	            case 1073741824:
	                v1_6 = android.view.View$MeasureSpec.getSize(p4);
	                break;
	        }
	        this.setMeasuredDimension(v1_6, v0_2);
	        this.b();
	        return;
	    }
	
	
	    protected void onSizeChanged(int p1, int p2, int p3, int p4)
	    {
	        this.setMeasuredDimension(p1, p2);
	        this.b();
	        return;
	    }
	
