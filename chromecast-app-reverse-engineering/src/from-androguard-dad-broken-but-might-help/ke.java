	private static final  q
	private final kf a
	private final android.view.animation.Interpolator b
	private final android.view.View c
	private java.lang.Runnable d
	private F e
	private F f
	private  g
	private  h
	private F i
	private F j
	private F k
	private  l
	private  m
	private  n
	private  o
	private  p
	
	    static ke()
	    {
	        ke.q = android.view.ViewConfiguration.getTapTimeout();
	        return;
	    }
	
	
	    public ke(android.view.View p9)
	    {
	        this.a = new kf();
	        this.b = new android.view.animation.AccelerateInterpolator();
	        kf v0_4 = new float[2];
	        v0_4 = {0, 0};
	        this.e = v0_4;
	        kf v0_5 = new float[2];
	        v0_5 = {2139095039, 2139095039};
	        this.f = v0_5;
	        kf v0_6 = new float[2];
	        v0_6 = {0, 0};
	        this.i = v0_6;
	        kf v0_7 = new float[2];
	        v0_7 = {0, 0};
	        this.j = v0_7;
	        kf v0_8 = new float[2];
	        v0_8 = {2139095039, 2139095039};
	        this.k = v0_8;
	        this.c = p9;
	        kf v0_10 = android.content.res.Resources.getSystem().getDisplayMetrics();
	        int v1_4 = ((int) ((1153753088 * v0_10.density) + 1056964608));
	        kf v0_14 = ((int) ((v0_10.density * 1134395392) + 1056964608));
	        int v1_5 = ((float) v1_4);
	        this.k[0] = (((float) v1_4) / 1148846080);
	        this.k[1] = (v1_5 / 1148846080);
	        kf v0_15 = ((float) v0_14);
	        this.j[0] = (((float) v0_14) / 1148846080);
	        this.j[1] = (v0_15 / 1148846080);
	        this.g = 1;
	        this.f[0] = 2139095039;
	        this.f[1] = 2139095039;
	        this.e[0] = 1045220557;
	        this.e[1] = 1045220557;
	        this.i[0] = 981668463;
	        this.i[1] = 981668463;
	        this.h = ke.q;
	        this.a.a = 500;
	        this.a.b = 500;
	        return;
	    }
	
	
	    private float a(float p5, float p6)
	    {
	        float v0_0 = 0;
	        if (p6 != 0) {
	            switch (this.g) {
	                case 0:
	                case 1:
	                    if (p5 < p6) {
	                        if (p5 < 0) {
	                            if ((this.o) && (this.g == 1)) {
	                                v0_0 = 1065353216;
	                            }
	                        } else {
	                            v0_0 = (1065353216 - (p5 / p6));
	                        }
	                    }
	                    break;
	                case 2:
	                    if (p5 < 0) {
	                        v0_0 = (p5 / (- p6));
	                    }
	                    break;
	                default:
	            }
	        }
	        return v0_0;
	    }
	
	
	    static synthetic float a(float p2, float p3, float p4)
	    {
	        return ke.b(p2, 0, 1065353216);
	    }
	
	
	    private float a(int p6, float p7, float p8, float p9)
	    {
	        float v0_6;
	        float v0_7;
	        float v0_3 = ke.b((this.e[p6] * p8), 0, this.f[p6]);
	        float v0_5 = (this.a((p8 - p7), v0_3) - this.a(p7, v0_3));
	        if (v0_5 >= 0) {
	            if (v0_5 <= 0) {
	                v0_6 = 0;
	            } else {
	                v0_7 = this.b.getInterpolation(v0_5);
	                v0_6 = ke.b(v0_7, -1082130432, 1065353216);
	            }
	        } else {
	            v0_7 = (- this.b.getInterpolation((- v0_5)));
	        }
	        float v0_13;
	        if (v0_6 != 0) {
	            float v3_3 = this.j[p6];
	            float v4_1 = this.k[p6];
	            float v2_11 = (this.i[p6] * p9);
	            if (v0_6 <= 0) {
	                v0_13 = (- ke.b(((- v0_6) * v2_11), v3_3, v4_1));
	            } else {
	                v0_13 = ke.b((v0_6 * v2_11), v3_3, v4_1);
	            }
	        } else {
	            v0_13 = 0;
	        }
	        return v0_13;
	    }
	
	
	    private boolean a()
	    {
	        int v0_5;
	        int v0_0 = this.a;
	        boolean v1_2 = ((int) (v0_0.d / Math.abs(v0_0.d)));
	        if ((v1_2) && (this.b(v1_2))) {
	            v0_5 = 1;
	        } else {
	            // Both branches of the condition point to the same code.
	            // if (((int) (v0_0.c / Math.abs(v0_0.c))) == 0) {
	                v0_5 = 0;
	            // }
	        }
	        return v0_5;
	    }
	
	
	    static synthetic boolean a(ke p1)
	    {
	        return p1.o;
	    }
	
	
	    static synthetic boolean a(ke p1, boolean p2)
	    {
	        p1.m = 0;
	        return 0;
	    }
	
	
	    private static float b(float p1, float p2, float p3)
	    {
	        if (p1 <= p3) {
	            if (p1 >= p2) {
	                p3 = p1;
	            } else {
	                p3 = p2;
	            }
	        }
	        return p3;
	    }
	
	
	    private void b()
	    {
	        if (!this.m) {
	            kf v3 = this.a;
	            long v4 = android.view.animation.AnimationUtils.currentAnimationTimeMillis();
	            int v2 = ((int) (v4 - v3.e));
	            int v0_1 = v3.b;
	            if (v2 <= v0_1) {
	                if (v2 >= 0) {
	                    v0_1 = v2;
	                } else {
	                    v0_1 = 0;
	                }
	            }
	            v3.k = v0_1;
	            v3.j = v3.a(v4);
	            v3.i = v4;
	        } else {
	            this.o = 0;
	        }
	        return;
	    }
	
	
	    static synthetic boolean b(ke p1)
	    {
	        return p1.m;
	    }
	
	
	    static synthetic boolean b(ke p1, boolean p2)
	    {
	        p1.o = 0;
	        return 0;
	    }
	
	
	    static synthetic kf c(ke p1)
	    {
	        return p1.a;
	    }
	
	
	    static synthetic boolean c(ke p1, boolean p2)
	    {
	        p1.n = 0;
	        return 0;
	    }
	
	
	    static synthetic boolean d(ke p1)
	    {
	        return p1.a();
	    }
	
	
	    static synthetic boolean e(ke p1)
	    {
	        return p1.n;
	    }
	
	
	    static synthetic void f(ke p8)
	    {
	        android.view.MotionEvent v0_0 = android.os.SystemClock.uptimeMillis();
	        android.view.MotionEvent v0_1 = android.view.MotionEvent.obtain(v0_0, v0_0, 3, 0, 0, 0);
	        p8.c.onTouchEvent(v0_1);
	        v0_1.recycle();
	        return;
	    }
	
	
	    static synthetic android.view.View g(ke p1)
	    {
	        return p1.c;
	    }
	
	
	    public final ke a(boolean p2)
	    {
	        if ((this.p) && (!p2)) {
	            this.b();
	        }
	        this.p = p2;
	        return this;
	    }
	
	
	    public boolean onTouch(android.view.View p7, android.view.MotionEvent p8)
	    {
	        if (this.p) {
	            switch (gd.a(p8)) {
	                case 0:
	                    this.n = 1;
	                    this.l = 0;
	                    break;
	                case 1:
	                case 3:
	                    this.b();
	                    break;
	                case 2:
	                    break;
	                default:
	            }
	            android.view.View v0_3 = this.a(0, p8.getX(), ((float) p7.getWidth()), ((float) this.c.getWidth()));
	            Runnable v1_3 = this.a(1, p8.getY(), ((float) p7.getHeight()), ((float) this.c.getHeight()));
	            long v2_5 = this.a;
	            v2_5.c = v0_3;
	            v2_5.d = v1_3;
	            if ((!this.o) && (this.a())) {
	                if (this.d == null) {
	                    this.d = new kg(this);
	                }
	                this.o = 1;
	                this.m = 1;
	                if ((this.l) || (this.h <= 0)) {
	                    this.d.run();
	                } else {
	                    gt.a(this.c, this.d, ((long) this.h));
	                }
	                this.l = 1;
	            }
	        }
	        return 0;
	    }
	
