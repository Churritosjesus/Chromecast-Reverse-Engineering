	private static final java.lang.String f
	private static final I r
	private  A
	private  B
	private android.view.animation.Animation$AnimationListener C
	private final android.view.animation.Animation D
	private final android.view.animation.Animation E
	public me a
	public  b
	public  c
	public  d
	public li e
	private android.view.View g
	private  h
	private  i
	private  j
	private  k
	private  l
	private  m
	private  n
	private  o
	private  p
	private final android.view.animation.DecelerateInterpolator q
	private kh s
	private  t
	private android.view.animation.Animation u
	private android.view.animation.Animation v
	private android.view.animation.Animation w
	private android.view.animation.Animation x
	private  y
	private  z
	
	    static lw()
	    {
	        lw.f = lw.getSimpleName();
	        int[] v0_3 = new int[1];
	        v0_3[0] = 16842766;
	        lw.r = v0_3;
	        return;
	    }
	
	
	    public lw(android.content.Context p2)
	    {
	        this(p2, 0);
	        return;
	    }
	
	
	    public lw(android.content.Context p7, android.util.AttributeSet p8)
	    {
	        this(p7, p8);
	        this.b = 0;
	        this.i = -1082130432;
	        this.l = 0;
	        this.p = -1;
	        this.t = -1;
	        this.C = new lx(this);
	        this.D = new mc(this);
	        this.E = new md(this);
	        this.h = android.view.ViewConfiguration.get(p7).getScaledTouchSlop();
	        this.j = this.getResources().getInteger(17694721);
	        this.setWillNotDraw(0);
	        this.q = new android.view.animation.DecelerateInterpolator(1073741824);
	        float v0_14 = p7.obtainStyledAttributes(p8, lw.r);
	        this.setEnabled(v0_14.getBoolean(0, 1));
	        v0_14.recycle();
	        float v0_16 = this.getResources().getDisplayMetrics();
	        this.A = ((int) (v0_16.density * 1109393408));
	        this.B = ((int) (v0_16.density * 1109393408));
	        this.s = new kh(this.getContext(), -328966, 1101004800);
	        this.e = new li(this.getContext(), this);
	        this.e.a.v = -328966;
	        this.s.setImageDrawable(this.e);
	        this.s.setVisibility(8);
	        this.addView(this.s);
	        gt.a(this, 1);
	        this.y = (v0_16.density * 1115684864);
	        this.i = this.y;
	        return;
	    }
	
	
	    private static float a(android.view.MotionEvent p1, int p2)
	    {
	        float v0_1;
	        float v0_0 = gd.a(p1, p2);
	        if (v0_0 >= 0) {
	            v0_1 = gd.d(p1, v0_0);
	        } else {
	            v0_1 = -1082130432;
	        }
	        return v0_1;
	    }
	
	
	    private android.view.animation.Animation a(int p5, int p6)
	    {
	        ma v0_1 = new ma(this, p5, p6);
	        v0_1.setDuration(300);
	        this.s.a = 0;
	        this.s.clearAnimation();
	        this.s.startAnimation(v0_1);
	        return v0_1;
	    }
	
	
	    private void a(int p2)
	    {
	        this.s.getBackground().setAlpha(p2);
	        this.e.setAlpha(p2);
	        return;
	    }
	
	
	    private void a(int p3, boolean p4)
	    {
	        this.s.bringToFront();
	        this.s.offsetTopAndBottom(p3);
	        this.k = this.s.getTop();
	        if ((p4) && (android.os.Build$VERSION.SDK_INT < 11)) {
	            this.invalidate();
	        }
	        return;
	    }
	
	
	    private void a(android.view.MotionEvent p4)
	    {
	        int v0_0 = gd.b(p4);
	        if (gd.b(p4, v0_0) == this.p) {
	            int v0_1;
	            if (v0_0 != 0) {
	                v0_1 = 0;
	            } else {
	                v0_1 = 1;
	            }
	            this.p = gd.b(p4, v0_1);
	        }
	        return;
	    }
	
	
	    private void a(android.view.animation.Animation$AnimationListener p5)
	    {
	        this.v = new lz(this);
	        this.v.setDuration(150);
	        this.s.a = p5;
	        this.s.clearAnimation();
	        this.s.startAnimation(this.v);
	        return;
	    }
	
	
	    static synthetic void a(lw p1, float p2)
	    {
	        if (!lw.c()) {
	            gt.d(p1.s, p2);
	            gt.e(p1.s, p2);
	        } else {
	            p1.a(((int) (1132396544 * p2)));
	        }
	        return;
	    }
	
	
	    static synthetic void a(lw p1, int p2)
	    {
	        p1.a(255);
	        return;
	    }
	
	
	    static synthetic void a(lw p0, int p1, boolean p2)
	    {
	        p0.a(p1, p2);
	        return;
	    }
	
	
	    static synthetic void a(lw p1, android.view.animation.Animation$AnimationListener p2)
	    {
	        p1.a(0);
	        return;
	    }
	
	
	    private void a(boolean p5, boolean p6)
	    {
	        if (this.b != p5) {
	            this.z = p6;
	            this.a();
	            this.b = p5;
	            if (!this.b) {
	                this.a(this.C);
	            } else {
	                android.view.animation.Animation v1_0 = this.C;
	                this.c = this.k;
	                this.D.reset();
	                this.D.setDuration(200);
	                this.D.setInterpolator(this.q);
	                if (v1_0 != null) {
	                    this.s.a = v1_0;
	                }
	                this.s.clearAnimation();
	                this.s.startAnimation(this.D);
	            }
	        }
	        return;
	    }
	
	
	    private static boolean a(android.view.animation.Animation p1)
	    {
	        if ((p1 == null) || ((!p1.hasStarted()) || (p1.hasEnded()))) {
	            int v0_2 = 0;
	        } else {
	            v0_2 = 1;
	        }
	        return v0_2;
	    }
	
	
	    static synthetic boolean a(lw p1)
	    {
	        return p1.b;
	    }
	
	
	    static synthetic int b(lw p0, int p1)
	    {
	        p0.k = p1;
	        return p1;
	    }
	
	
	    static synthetic li b(lw p1)
	    {
	        return p1.e;
	    }
	
	
	    static synthetic void b(lw p3, float p4)
	    {
	        p3.a(((p3.c + ((int) (((float) (p3.d - p3.c)) * p4))) - p3.s.getTop()), 0);
	        return;
	    }
	
	
	    private static boolean c()
	    {
	        int v0_1;
	        if (android.os.Build$VERSION.SDK_INT >= 11) {
	            v0_1 = 0;
	        } else {
	            v0_1 = 1;
	        }
	        return v0_1;
	    }
	
	
	    static synthetic boolean c(lw p1)
	    {
	        return p1.z;
	    }
	
	
	    static synthetic me d(lw p1)
	    {
	        return p1.a;
	    }
	
	
	    static synthetic kh e(lw p1)
	    {
	        return p1.s;
	    }
	
	
	    static synthetic boolean f(lw p1)
	    {
	        return 0;
	    }
	
	
	    static synthetic int g(lw p1)
	    {
	        return p1.k;
	    }
	
	
	    static synthetic boolean h(lw p1)
	    {
	        return 0;
	    }
	
	
	    static synthetic float i(lw p1)
	    {
	        return p1.y;
	    }
	
	
	    public void a()
	    {
	        if (this.g == null) {
	            int v0_1 = 0;
	            while (v0_1 < this.getChildCount()) {
	                android.view.View v1_1 = this.getChildAt(v0_1);
	                if (v1_1.equals(this.s)) {
	                    v0_1++;
	                } else {
	                    this.g = v1_1;
	                    break;
	                }
	            }
	        }
	        return;
	    }
	
	
	    public final void a(boolean p5)
	    {
	        if ((!p5) || (this.b == p5)) {
	            this.a(p5, 0);
	        } else {
	            this.b = p5;
	            this.a((((int) (this.y + ((float) this.d))) - this.k), 1);
	            this.z = 0;
	            kh v0_5 = this.C;
	            this.s.setVisibility(0);
	            if (android.os.Build$VERSION.SDK_INT >= 11) {
	                this.e.setAlpha(255);
	            }
	            this.u = new ly(this);
	            this.u.setDuration(((long) this.j));
	            if (v0_5 != null) {
	                this.s.a = v0_5;
	            }
	            this.s.clearAnimation();
	            this.s.startAnimation(this.u);
	        }
	        return;
	    }
	
	
	    public boolean b()
	    {
	        int v0_2;
	        if (android.os.Build$VERSION.SDK_INT >= 14) {
	            v0_2 = gt.b(this.g, -1);
	        } else {
	            if (!(this.g instanceof android.widget.AbsListView)) {
	                if ((!gt.b(this.g, -1)) && (this.g.getScrollY() <= 0)) {
	                    v0_2 = 0;
	                } else {
	                    v0_2 = 1;
	                }
	            } else {
	                int v0_10 = ((android.widget.AbsListView) this.g);
	                if ((v0_10.getChildCount() <= 0) || ((v0_10.getFirstVisiblePosition() <= 0) && (v0_10.getChildAt(0).getTop() >= v0_10.getPaddingTop()))) {
	                    v0_2 = 0;
	                } else {
	                    v0_2 = 1;
	                }
	            }
	        }
	        return v0_2;
	    }
	
	
	    protected int getChildDrawingOrder(int p2, int p3)
	    {
	        if (this.t >= 0) {
	            if (p3 != (p2 - 1)) {
	                if (p3 >= this.t) {
	                    p3++;
	                }
	            } else {
	                p3 = this.t;
	            }
	        }
	        return p3;
	    }
	
	
	    public boolean onInterceptTouchEvent(android.view.MotionEvent p7)
	    {
	        li v0_0 = 0;
	        this.a();
	        int v1_0 = gd.a(p7);
	        if ((this.isEnabled()) && ((!this.b()) && (!this.b))) {
	            switch (v1_0) {
	                case 0:
	                    this.a((this.d - this.s.getTop()), 1);
	                    this.p = gd.b(p7, 0);
	                    this.o = 0;
	                    int v1_14 = lw.a(p7, this.p);
	                    if (v1_14 != -1082130432) {
	                        this.n = v1_14;
	                    }
	                    break;
	                case 1:
	                case 3:
	                    this.o = 0;
	                    this.p = -1;
	                    break;
	                case 2:
	                    if (this.p != -1) {
	                        int v1_3 = lw.a(p7, this.p);
	                        if (v1_3 != -1082130432) {
	                            if (((v1_3 - this.n) <= ((float) this.h)) || (this.o)) {
	                            } else {
	                                this.m = (this.n + ((float) this.h));
	                                this.o = 1;
	                                this.e.setAlpha(76);
	                            }
	                        }
	                    } else {
	                        android.util.Log.e(lw.f, "Got ACTION_MOVE event but don\'t have an active pointer id.");
	                    }
	                    break;
	                case 4:
	                case 5:
	                default:
	                    break;
	                case 4:
	                case 5:
	                    break;
	                case 6:
	                    this.a(p7);
	                    break;
	            }
	            v0_0 = this.o;
	        }
	        return v0_0;
	    }
	
	
	    protected void onLayout(boolean p8, int p9, int p10, int p11, int p12)
	    {
	        int v0_0 = this.getMeasuredWidth();
	        int v1_0 = this.getMeasuredHeight();
	        if (this.getChildCount() != 0) {
	            if (this.g == null) {
	                this.a();
	            }
	            if (this.g != null) {
	                int v2_3 = this.g;
	                kh v3_0 = this.getPaddingLeft();
	                int v4_0 = this.getPaddingTop();
	                v2_3.layout(v3_0, v4_0, (((v0_0 - this.getPaddingLeft()) - this.getPaddingRight()) + v3_0), (((v1_0 - this.getPaddingTop()) - this.getPaddingBottom()) + v4_0));
	                int v1_5 = this.s.getMeasuredWidth();
	                this.s.layout(((v0_0 / 2) - (v1_5 / 2)), this.k, ((v0_0 / 2) + (v1_5 / 2)), (this.k + this.s.getMeasuredHeight()));
	            }
	        }
	        return;
	    }
	
	
	    public void onMeasure(int p6, int p7)
	    {
	        super.onMeasure(p6, p7);
	        if (this.g == null) {
	            this.a();
	        }
	        if (this.g != null) {
	            this.g.measure(android.view.View$MeasureSpec.makeMeasureSpec(((this.getMeasuredWidth() - this.getPaddingLeft()) - this.getPaddingRight()), 1073741824), android.view.View$MeasureSpec.makeMeasureSpec(((this.getMeasuredHeight() - this.getPaddingTop()) - this.getPaddingBottom()), 1073741824));
	            this.s.measure(android.view.View$MeasureSpec.makeMeasureSpec(this.A, 1073741824), android.view.View$MeasureSpec.makeMeasureSpec(this.B, 1073741824));
	            if (!this.l) {
	                this.l = 1;
	                int v0_8 = (- this.s.getMeasuredHeight());
	                this.d = v0_8;
	                this.k = v0_8;
	            }
	            this.t = -1;
	            int v0_10 = 0;
	            while (v0_10 < this.getChildCount()) {
	                if (this.getChildAt(v0_10) != this.s) {
	                    v0_10++;
	                } else {
	                    this.t = v0_10;
	                    break;
	                }
	            }
	        }
	        return;
	    }
	
	
	    public boolean onTouchEvent(android.view.MotionEvent p13)
	    {
	        android.view.animation.Animation v0_33;
	        android.view.animation.Animation v0_0 = gd.a(p13);
	        if ((this.isEnabled()) && (!this.b())) {
	            switch (v0_0) {
	                case 0:
	                    this.p = gd.b(p13, 0);
	                    this.o = 0;
	                    break;
	                case 1:
	                case 3:
	                    if (this.p != -1) {
	                        android.view.animation.Animation v0_39 = ((gd.d(p13, gd.a(p13, this.p)) - this.m) * 1056964608);
	                        this.o = 0;
	                        if (v0_39 <= this.i) {
	                            this.b = 0;
	                            this.e.a(0, 0);
	                            android.view.animation.Animation v0_44 = new mb(this);
	                            this.c = this.k;
	                            this.E.reset();
	                            this.E.setDuration(200);
	                            this.E.setInterpolator(this.q);
	                            if (v0_44 != null) {
	                                this.s.a = v0_44;
	                            }
	                            this.s.clearAnimation();
	                            this.s.startAnimation(this.E);
	                            this.e.a(0);
	                        } else {
	                            this.a(1, 1);
	                        }
	                        this.p = -1;
	                        v0_33 = 0;
	                    } else {
	                        if (v0_0 == 1) {
	                            android.util.Log.e(lw.f, "Got ACTION_UP event but don\'t have an active pointer id.");
	                        }
	                        v0_33 = 0;
	                    }
	                    break;
	                case 2:
	                    android.view.animation.Animation v0_4 = gd.a(p13, this.p);
	                    if (v0_4 >= null) {
	                        android.view.animation.Animation v0_7 = ((gd.d(p13, v0_4) - this.m) * 1056964608);
	                        if (!this.o) {
	                        } else {
	                            this.e.a(1);
	                            int v1_7 = (v0_7 / this.i);
	                            if (v1_7 >= 0) {
	                                int v1_9 = Math.min(1065353216, Math.abs(v1_7));
	                                lm v2_9 = ((((float) Math.max((((double) v1_9) - 0.4), 0)) * 1084227584) / 1077936128);
	                                int v4_3 = this.y;
	                                float v3_6 = Math.max(0, (Math.min((Math.abs(v0_7) - this.i), (1073741824 * v4_3)) / v4_3));
	                                float v3_9 = (((float) (((double) (v3_6 / 1082130432)) - Math.pow(((double) (v3_6 / 1082130432)), 2.0))) * 1073741824);
	                                int v1_13 = (((int) ((v1_9 * v4_3) + ((v4_3 * v3_9) * 1073741824))) + this.d);
	                                if (this.s.getVisibility() != 0) {
	                                    this.s.setVisibility(0);
	                                }
	                                gt.d(this.s, 1065353216);
	                                gt.e(this.s, 1065353216);
	                                if (v0_7 >= this.i) {
	                                    if ((this.e.getAlpha() < 255) && (!lw.a(this.x))) {
	                                        this.x = this.a(this.e.getAlpha(), 255);
	                                    }
	                                } else {
	                                    if ((this.e.getAlpha() > 76) && (!lw.a(this.w))) {
	                                        this.w = this.a(this.e.getAlpha(), 76);
	                                    }
	                                    this.e.a(0, Math.min(1061997773, (1061997773 * v2_9)));
	                                    this.e.a(Math.min(1065353216, v2_9));
	                                }
	                                this.e.a.c((((-1098907648 + (v2_9 * 1053609165)) + (1073741824 * v3_9)) * 1056964608));
	                                this.a((v1_13 - this.k), 1);
	                            } else {
	                                v0_33 = 0;
	                            }
	                        }
	                    } else {
	                        android.util.Log.e(lw.f, "Got ACTION_MOVE event but have an invalid active pointer id.");
	                        v0_33 = 0;
	                    }
	                    break;
	                case 4:
	                default:
	                    break;
	                case 5:
	                    this.p = gd.b(p13, gd.b(p13));
	                    break;
	                case 6:
	                    this.a(p13);
	                    break;
	            }
	            v0_33 = 1;
	        } else {
	            v0_33 = 0;
	        }
	        return v0_33;
	    }
	
	
	    public void requestDisallowInterceptTouchEvent(boolean p1)
	    {
	        return;
	    }
	
