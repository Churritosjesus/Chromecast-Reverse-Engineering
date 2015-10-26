	private static final android.view.animation.Interpolator v
	  a
	public  b
	  c
	public F d
	public F e
	public F f
	public F g
	public  h
	 android.view.VelocityTracker i
	public  j
	public  k
	public  l
	 android.view.View m
	  n
	private I o
	private I p
	private I q
	private  r
	private lr s
	private final mi t
	private final android.view.ViewGroup u
	private final java.lang.Runnable w
	
	    static mf()
	    {
	        mf.v = new mg();
	        return;
	    }
	
	
	    private mf(android.content.Context p4, android.view.ViewGroup p5, mi p6)
	    {
	        this.c = -1;
	        this.w = new mh(this);
	        if (p5 != null) {
	            if (p6 != null) {
	                this.u = p5;
	                this.t = p6;
	                lr v0_3 = android.view.ViewConfiguration.get(p4);
	                this.k = ((int) ((p4.getResources().getDisplayMetrics().density * 1101004800) + 1056964608));
	                this.b = v0_3.getScaledTouchSlop();
	                this.r = ((float) v0_3.getScaledMaximumFlingVelocity());
	                this.j = ((float) v0_3.getScaledMinimumFlingVelocity());
	                this.s = lr.a(p4, mf.v);
	                return;
	            } else {
	                throw new IllegalArgumentException("Callback may not be null");
	            }
	        } else {
	            throw new IllegalArgumentException("Parent view may not be null");
	        }
	    }
	
	
	    private static float a(float p3, float p4, float p5)
	    {
	        float v1_0 = Math.abs(p3);
	        if (v1_0 >= p4) {
	            if (v1_0 <= p5) {
	                p5 = p3;
	            } else {
	                if (p3 <= 0) {
	                    p5 = (- p5);
	                }
	            }
	        } else {
	            p5 = 0;
	        }
	        return p5;
	    }
	
	
	    private int a(int p10, int p11, int p12)
	    {
	        int v0_20;
	        if (p10 != 0) {
	            int v0_15;
	            int v0_1 = this.u.getWidth();
	            int v1_0 = (v0_1 / 2);
	            int v0_9 = ((((float) Math.sin(((double) ((float) (((double) (Math.min(1065353216, (((float) Math.abs(p10)) / ((float) v0_1))) - 1056964608)) * 0.4712389167638204))))) * ((float) v1_0)) + ((float) v1_0));
	            int v1_2 = Math.abs(p11);
	            if (v1_2 <= 0) {
	                v0_15 = ((int) (((((float) Math.abs(p10)) / ((float) p12)) + 1065353216) * 1132462080));
	            } else {
	                v0_15 = (Math.round((Math.abs((v0_9 / ((float) v1_2))) * 1148846080)) * 4);
	            }
	            v0_20 = Math.min(v0_15, 600);
	        } else {
	            v0_20 = 0;
	        }
	        return v0_20;
	    }
	
	
	    public static mf a(android.view.ViewGroup p2, float p3, mi p4)
	    {
	        mf v0_1 = new mf(p2.getContext(), p2, p4);
	        v0_1.b = ((int) ((float) v0_1.b));
	        return v0_1;
	    }
	
	
	    private void a(float p5, float p6)
	    {
	        this.n = 1;
	        this.t.a(this.m, p5);
	        this.n = 0;
	        if (this.a == 1) {
	            this.a(0);
	        }
	        return;
	    }
	
	
	    private void a(float p12, float p13, int p14)
	    {
	        int v0_0 = 0;
	        if ((this.d == null) || (this.d.length <= p14)) {
	            int[] v2_4 = new float[(p14 + 1)];
	            int v3_1 = new float[(p14 + 1)];
	            int v4_1 = new float[(p14 + 1)];
	            int v5_1 = new float[(p14 + 1)];
	            int v6_1 = new int[(p14 + 1)];
	            int[] v7_1 = new int[(p14 + 1)];
	            int[] v8_1 = new int[(p14 + 1)];
	            if (this.d != null) {
	                System.arraycopy(this.d, 0, v2_4, 0, this.d.length);
	                System.arraycopy(this.e, 0, v3_1, 0, this.e.length);
	                System.arraycopy(this.f, 0, v4_1, 0, this.f.length);
	                System.arraycopy(this.g, 0, v5_1, 0, this.g.length);
	                System.arraycopy(this.o, 0, v6_1, 0, this.o.length);
	                System.arraycopy(this.p, 0, v7_1, 0, this.p.length);
	                System.arraycopy(this.q, 0, v8_1, 0, this.q.length);
	            }
	            this.d = v2_4;
	            this.e = v3_1;
	            this.f = v4_1;
	            this.g = v5_1;
	            this.o = v6_1;
	            this.p = v7_1;
	            this.q = v8_1;
	        }
	        int[] v2_5 = this.d;
	        this.f[p14] = p12;
	        v2_5[p14] = p12;
	        int[] v2_6 = this.e;
	        this.g[p14] = p13;
	        v2_6[p14] = p13;
	        if (((int) p12) < (this.u.getLeft() + this.k)) {
	            v0_0 = 1;
	        }
	        if (((int) p13) < (this.u.getTop() + this.k)) {
	            v0_0 |= 4;
	        }
	        if (((int) p12) > (this.u.getRight() - this.k)) {
	            v0_0 |= 2;
	        }
	        if (((int) p13) > (this.u.getBottom() - this.k)) {
	            v0_0 |= 8;
	        }
	        this.o[p14] = v0_0;
	        this.h = (this.h | (1 << p14));
	        return;
	    }
	
	
	    private boolean a(float p5, float p6, int p7, int p8)
	    {
	        int v0 = 0;
	        float v1_0 = Math.abs(p5);
	        float v2_0 = Math.abs(p6);
	        if ((((this.o[p7] & p8) == p8) && (((this.l & p8) != 0) && (((this.q[p7] & p8) != p8) && (((this.p[p7] & p8) != p8) && ((v1_0 > ((float) this.b)) || (v2_0 > ((float) this.b))))))) && (((this.p[p7] & p8) == 0) && (v1_0 > ((float) this.b)))) {
	            v0 = 1;
	        }
	        return v0;
	    }
	
	
	    private boolean a(android.view.View p5, float p6, float p7)
	    {
	        int v0 = 0;
	        if (p5 != null) {
	            float v2_2;
	            if (this.t.c(p5) <= 0) {
	                v2_2 = 0;
	            } else {
	                v2_2 = 1;
	            }
	            if ((v2_2 != 0) && (Math.abs(p6) > ((float) this.b))) {
	                v0 = 1;
	            }
	        }
	        return v0;
	    }
	
	
	    private static int b(int p1, int p2, int p3)
	    {
	        int v0 = Math.abs(p1);
	        if (v0 >= p2) {
	            if (v0 <= p3) {
	                p3 = p1;
	            } else {
	                if (p1 <= 0) {
	                    p3 = (- p3);
	                }
	            }
	        } else {
	            p3 = 0;
	        }
	        return p3;
	    }
	
	
	    private void b()
	    {
	        this.i.computeCurrentVelocity(1000, this.r);
	        this.a(mf.a(gp.a(this.i, this.c), this.j, this.r), mf.a(gp.b(this.i, this.c), this.j, this.r));
	        return;
	    }
	
	
	    private void b(float p4, float p5, int p6)
	    {
	        int v0 = 1;
	        if (!this.a(p4, p5, p6, 1)) {
	            v0 = 0;
	        }
	        if (this.a(p5, p4, p6, 4)) {
	            v0 |= 4;
	        }
	        if (this.a(p4, p5, p6, 2)) {
	            v0 |= 2;
	        }
	        if (this.a(p5, p4, p6, 8)) {
	            v0 |= 8;
	        }
	        if (v0 != 0) {
	            mi v1_7 = this.p;
	            v1_7[p6] = (v1_7[p6] | v0);
	            this.t.a(v0, p6);
	        }
	        return;
	    }
	
	
	    private void b(int p4)
	    {
	        if (this.d != null) {
	            this.d[p4] = 0;
	            this.e[p4] = 0;
	            this.f[p4] = 0;
	            this.g[p4] = 0;
	            this.o[p4] = 0;
	            this.p[p4] = 0;
	            this.q[p4] = 0;
	            this.h = (this.h & ((1 << p4) ^ -1));
	        }
	        return;
	    }
	
	
	    private boolean b(android.view.View p3, int p4)
	    {
	        int v0 = 1;
	        if ((p3 != this.m) || (this.c != p4)) {
	            if ((p3 == null) || (!this.t.a(p3))) {
	                v0 = 0;
	            } else {
	                this.c = p4;
	                this.a(p3, p4);
	            }
	        }
	        return v0;
	    }
	
	
	    private void c(android.view.MotionEvent p7)
	    {
	        int v1 = gd.c(p7);
	        int v0 = 0;
	        while (v0 < v1) {
	            int v2 = gd.b(p7, v0);
	            float[] v3_0 = gd.c(p7, v0);
	            float v4 = gd.d(p7, v0);
	            this.f[v2] = v3_0;
	            this.g[v2] = v4;
	            v0++;
	        }
	        return;
	    }
	
	
	    public final android.view.View a(int p4, int p5)
	    {
	        int v1 = (this.u.getChildCount() - 1);
	        while (v1 >= 0) {
	            int v0_3 = this.u.getChildAt(v1);
	            if ((p4 < v0_3.getLeft()) || ((p4 >= v0_3.getRight()) || ((p5 < v0_3.getTop()) || (p5 >= v0_3.getBottom())))) {
	                v1--;
	            }
	            return v0_3;
	        }
	        v0_3 = 0;
	        return v0_3;
	    }
	
	
	    public final void a()
	    {
	        this.c = -1;
	        if (this.d != null) {
	            java.util.Arrays.fill(this.d, 0);
	            java.util.Arrays.fill(this.e, 0);
	            java.util.Arrays.fill(this.f, 0);
	            java.util.Arrays.fill(this.g, 0);
	            java.util.Arrays.fill(this.o, 0);
	            java.util.Arrays.fill(this.p, 0);
	            java.util.Arrays.fill(this.q, 0);
	            this.h = 0;
	        }
	        if (this.i != null) {
	            this.i.recycle();
	            this.i = 0;
	        }
	        return;
	    }
	
	
	    final void a(int p3)
	    {
	        this.u.removeCallbacks(this.w);
	        if (this.a != p3) {
	            this.a = p3;
	            this.t.a(p3);
	            if (this.a == 0) {
	                this.m = 0;
	            }
	        }
	        return;
	    }
	
	
	    public final void a(android.view.View p4, int p5)
	    {
	        if (p4.getParent() == this.u) {
	            this.m = p4;
	            this.c = p5;
	            this.t.b(p4);
	            this.a(1);
	            return;
	        } else {
	            throw new IllegalArgumentException(new StringBuilder("captureChildView: parameter must be a descendant of the ViewDragHelper\'s tracked parent view (").append(this.u).append(")").toString());
	        }
	    }
	
	
	    boolean a(int p15, int p16, int p17, int p18)
	    {
	        int v1_18;
	        int v2 = this.m.getLeft();
	        int v3 = this.m.getTop();
	        int v4 = (p15 - v2);
	        int v5 = (p16 - v3);
	        if ((v4 != 0) || (v5 != 0)) {
	            int v6_6;
	            float v7_0 = this.m;
	            int v8_0 = mf.b(p17, ((int) this.j), ((int) this.r));
	            int v9 = mf.b(p18, ((int) this.j), ((int) this.r));
	            int v1_6 = Math.abs(v4);
	            mi v10_0 = Math.abs(v5);
	            int v6_4 = Math.abs(v8_0);
	            int v11 = Math.abs(v9);
	            int v12 = (v6_4 + v11);
	            int v13 = (v1_6 + v10_0);
	            if (v8_0 == 0) {
	                v6_6 = (((float) v1_6) / ((float) v13));
	            } else {
	                v6_6 = (((float) v6_4) / ((float) v12));
	            }
	            int v1_12;
	            if (v9 == 0) {
	                v1_12 = (((float) v10_0) / ((float) v13));
	            } else {
	                v1_12 = (((float) v11) / ((float) v12));
	            }
	            this.s.a(v2, v3, v4, v5, ((int) ((v1_12 * ((float) this.a(v5, v9, 0))) + (v6_6 * ((float) this.a(v4, v8_0, this.t.c(v7_0)))))));
	            this.a(2);
	            v1_18 = 1;
	        } else {
	            this.s.f();
	            this.a(0);
	            v1_18 = 0;
	        }
	        return v1_18;
	    }
	
	
	    public final boolean a(android.view.MotionEvent p13)
	    {
	        int v0 = 1;
	        int v2_0 = gd.a(p13);
	        int v3_0 = gd.b(p13);
	        if (v2_0 == 0) {
	            this.a();
	        }
	        if (this.i == null) {
	            this.i = android.view.VelocityTracker.obtain();
	        }
	        this.i.addMovement(p13);
	        switch (v2_0) {
	            case 0:
	                int v2_14 = p13.getX();
	                int v3_7 = p13.getY();
	                android.view.View v4_7 = gd.b(p13, 0);
	                this.a(v2_14, v3_7, v4_7);
	                int v2_16 = this.a(((int) v2_14), ((int) v3_7));
	                if ((v2_16 == this.m) && (this.a == 2)) {
	                    this.b(v2_16, v4_7);
	                }
	                if ((this.o[v4_7] & this.l) == 0) {
	                } else {
	                    this.t.c();
	                }
	                break;
	            case 1:
	            case 3:
	                this.a();
	                break;
	            case 2:
	                if ((this.d == null) || (this.e == null)) {
	                } else {
	                    android.view.View v4_6 = gd.c(p13);
	                    int v3_6 = 0;
	                    while (v3_6 < v4_6) {
	                        int v2_11;
	                        int v5_2 = gd.b(p13, v3_6);
	                        int v2_8 = gd.c(p13, v3_6);
	                        android.view.View v6_1 = gd.d(p13, v3_6);
	                        int v7_2 = (v2_8 - this.d[v5_2]);
	                        float v8_2 = (v6_1 - this.e[v5_2]);
	                        android.view.View v6_3 = this.a(((int) v2_8), ((int) v6_1));
	                        if ((v6_3 == null) || (!this.a(v6_3, v7_2, v8_2))) {
	                            v2_11 = 0;
	                        } else {
	                            v2_11 = 1;
	                        }
	                        if (v2_11 != 0) {
	                            int v9 = v6_3.getLeft();
	                            int v10_2 = this.t.b(v6_3, (((int) v7_2) + v9));
	                            v6_3.getTop();
	                            this.t.d(v6_3);
	                            int v11_3 = this.t.c(v6_3);
	                            if ((v11_3 == 0) || ((v11_3 > 0) && (v10_2 == v9))) {
	                                break;
	                            }
	                        }
	                        this.b(v7_2, v8_2, v5_2);
	                        if ((this.a == 1) || ((v2_11 != 0) && (this.b(v6_3, v5_2)))) {
	                            break;
	                        }
	                        v3_6++;
	                    }
	                    this.c(p13);
	                }
	                break;
	            case 4:
	            default:
	                break;
	            case 5:
	                int v2_2 = gd.b(p13, v3_0);
	                android.view.View v4_3 = gd.c(p13, v3_0);
	                int v3_1 = gd.d(p13, v3_0);
	                this.a(v4_3, v3_1, v2_2);
	                if (this.a != 0) {
	                    if (this.a != 2) {
	                    } else {
	                        int v3_3 = this.a(((int) v4_3), ((int) v3_1));
	                        if (v3_3 != this.m) {
	                        } else {
	                            this.b(v3_3, v2_2);
	                        }
	                    }
	                } else {
	                    if ((this.o[v2_2] & this.l) == 0) {
	                    } else {
	                        this.t.c();
	                    }
	                }
	                break;
	            case 6:
	                this.b(gd.b(p13, v3_0));
	                break;
	        }
	        if (this.a != 1) {
	            v0 = 0;
	        }
	        return v0;
	    }
	
	
	    public final boolean a(android.view.View p3, int p4, int p5)
	    {
	        this.m = p3;
	        this.c = -1;
	        boolean v0_1 = this.a(p4, p5, 0, 0);
	        if ((!v0_1) && ((this.a == 0) && (this.m != null))) {
	            this.m = 0;
	        }
	        return v0_1;
	    }
	
	
	    public final boolean a(boolean p9)
	    {
	        int v0 = 0;
	        if (this.a == 2) {
	            int v1_2 = this.s.e();
	            Runnable v2_1 = this.s.a();
	            int v3_1 = this.s.b();
	            int v4_2 = (v2_1 - this.m.getLeft());
	            android.view.View v5_2 = (v3_1 - this.m.getTop());
	            if (v4_2 != 0) {
	                this.m.offsetLeftAndRight(v4_2);
	            }
	            if (v5_2 != null) {
	                this.m.offsetTopAndBottom(v5_2);
	            }
	            if ((v4_2 != 0) || (v5_2 != null)) {
	                this.t.a(this.m, v2_1);
	            }
	            if ((v1_2 != 0) && ((v2_1 == this.s.c()) && (v3_1 == this.s.d()))) {
	                this.s.f();
	                v1_2 = 0;
	            }
	            if (v1_2 == 0) {
	                this.u.post(this.w);
	            }
	        }
	        if (this.a == 2) {
	            v0 = 1;
	        }
	        return v0;
	    }
	
	
	    public final void b(android.view.MotionEvent p10)
	    {
	        int v0_0 = 0;
	        int v3_0 = gd.a(p10);
	        boolean v4_0 = gd.b(p10);
	        if (v3_0 == 0) {
	            this.a();
	        }
	        if (this.i == null) {
	            this.i = android.view.VelocityTracker.obtain();
	        }
	        this.i.addMovement(p10);
	        switch (v3_0) {
	            case 0:
	                mi v1_9 = p10.getX();
	                android.view.View v2_10 = p10.getY();
	                int v0_18 = gd.b(p10, 0);
	                int v3_19 = this.a(((int) v1_9), ((int) v2_10));
	                this.a(v1_9, v2_10, v0_18);
	                this.b(v3_19, v0_18);
	                if ((this.o[v0_18] & this.l) == 0) {
	                } else {
	                    this.t.c();
	                }
	                break;
	            case 1:
	                if (this.a == 1) {
	                    this.b();
	                }
	                this.a();
	                break;
	            case 2:
	                if (this.a != 1) {
	                    mi v1_4 = gd.c(p10);
	                    while (v0_0 < v1_4) {
	                        int v3_6 = gd.b(p10, v0_0);
	                        boolean v4_6 = gd.c(p10, v0_0);
	                        android.view.View v5_10 = gd.d(p10, v0_0);
	                        android.view.View v6_8 = (v4_6 - this.d[v3_6]);
	                        float v7_2 = (v5_10 - this.e[v3_6]);
	                        this.b(v6_8, v7_2, v3_6);
	                        if (this.a == 1) {
	                            break;
	                        }
	                        boolean v4_8 = this.a(((int) v4_6), ((int) v5_10));
	                        if ((this.a(v4_8, v6_8, v7_2)) && (this.b(v4_8, v3_6))) {
	                            break;
	                        }
	                        v0_0++;
	                    }
	                    this.c(p10);
	                } else {
	                    int v0_11 = gd.a(p10, this.c);
	                    mi v1_7 = ((int) (gd.c(p10, v0_11) - this.f[this.c]));
	                    android.view.View v2_8 = ((int) (gd.d(p10, v0_11) - this.g[this.c]));
	                    int v0_16 = (this.m.getLeft() + v1_7);
	                    this.m.getTop();
	                    int v3_13 = this.m.getLeft();
	                    boolean v4_10 = this.m.getTop();
	                    if (v1_7 != null) {
	                        v0_16 = this.t.b(this.m, v0_16);
	                        this.m.offsetLeftAndRight((v0_16 - v3_13));
	                    }
	                    if (v2_8 != null) {
	                        this.m.offsetTopAndBottom((this.t.d(this.m) - v4_10));
	                    }
	                    if ((v1_7 != null) || (v2_8 != null)) {
	                        this.t.a(this.m, v0_16);
	                    }
	                    this.c(p10);
	                }
	                break;
	            case 3:
	                if (this.a == 1) {
	                    this.a(0, 0);
	                }
	                this.a();
	            case 4:
	            default:
	                break;
	            case 5:
	                mi v1_1 = gd.b(p10, v4_0);
	                int v3_2 = gd.c(p10, v4_0);
	                boolean v4_4 = gd.d(p10, v4_0);
	                this.a(v3_2, v4_4, v1_1);
	                if (this.a != 0) {
	                    int v3_3 = ((int) v3_2);
	                    boolean v4_5 = ((int) v4_4);
	                    android.view.View v5_9 = this.m;
	                    if ((v5_9 != null) && ((v3_3 >= v5_9.getLeft()) && ((v3_3 < v5_9.getRight()) && ((v4_5 >= v5_9.getTop()) && (v4_5 < v5_9.getBottom()))))) {
	                        v0_0 = 1;
	                    }
	                    if (v0_0 == 0) {
	                    } else {
	                        this.b(this.m, v1_1);
	                    }
	                } else {
	                    this.b(this.a(((int) v3_2), ((int) v4_4)), v1_1);
	                    if ((this.o[v1_1] & this.l) == 0) {
	                    } else {
	                        this.t.c();
	                    }
	                }
	                break;
	            case 6:
	                int v3_1 = gd.b(p10, v4_0);
	                if ((this.a == 1) && (v3_1 == this.c)) {
	                    android.view.View v2_2 = gd.c(p10);
	                    while (v0_0 < v2_2) {
	                        boolean v4_2 = gd.b(p10, v0_0);
	                        if ((v4_2 == this.c) || ((this.a(((int) gd.c(p10, v0_0)), ((int) gd.d(p10, v0_0))) != this.m) || (!this.b(this.m, v4_2)))) {
	                            v0_0++;
	                        } else {
	                            int v0_1 = this.c;
	                        }
	                        if (v0_1 == -1) {
	                            this.b();
	                        }
	                    }
	                    v0_1 = -1;
	                }
	                this.b(v3_1);
	                break;
	        }
	        return;
	    }
	
