	private static final I j
	private static final  k
	private static kq z
	public  a
	public final mf b
	public final mf c
	public  d
	public  e
	public kt f
	public android.graphics.drawable.Drawable g
	public android.graphics.drawable.Drawable h
	public android.graphics.drawable.Drawable i
	private final kp l
	private  m
	private  n
	private android.graphics.Paint o
	private final kx p
	private final kx q
	private  r
	private  s
	private  t
	private  u
	private  v
	private  w
	private java.lang.Object x
	private  y
	
	    static DrawerLayout()
	    {
	        ks v0_0 = 1;
	        int v2_0 = new int[1];
	        v2_0[0] = 16842931;
	        android.support.v4.widget.DrawerLayout.j = v2_0;
	        if (android.os.Build$VERSION.SDK_INT < 19) {
	            v0_0 = 0;
	        }
	        android.support.v4.widget.DrawerLayout.k = v0_0;
	        if (android.os.Build$VERSION.SDK_INT < 21) {
	            android.support.v4.widget.DrawerLayout.z = new ks();
	        } else {
	            android.support.v4.widget.DrawerLayout.z = new kr();
	        }
	        return;
	    }
	
	
	    public DrawerLayout(android.content.Context p2)
	    {
	        this(p2, 0);
	        return;
	    }
	
	
	    public DrawerLayout(android.content.Context p2, android.util.AttributeSet p3)
	    {
	        this(p2, p3, 0);
	        return;
	    }
	
	
	    public DrawerLayout(android.content.Context p6, android.util.AttributeSet p7, int p8)
	    {
	        this(p6, p7, p8);
	        this.l = new kp(this);
	        this.a = -1728053248;
	        this.o = new android.graphics.Paint();
	        this.s = 1;
	        this.setDescendantFocusability(262144);
	        android.graphics.drawable.Drawable v0_8 = this.getResources().getDisplayMetrics().density;
	        this.m = ((int) ((1115684864 * v0_8) + 1056964608));
	        android.graphics.drawable.Drawable v0_9 = (v0_8 * 1137180672);
	        this.p = new kx(this, 3);
	        this.q = new kx(this, 5);
	        this.b = mf.a(this, 1065353216, this.p);
	        this.b.l = 1;
	        this.b.j = v0_9;
	        this.p.b = this.b;
	        this.c = mf.a(this, 1065353216, this.q);
	        this.c.l = 2;
	        this.c.j = v0_9;
	        this.q.b = this.c;
	        this.setFocusableInTouchMode(1);
	        gt.c(this, 1);
	        gt.a(this, new ko(this));
	        hk.a(this, 0);
	        if (gt.r(this)) {
	            android.support.v4.widget.DrawerLayout.z.a(this);
	            this.i = android.support.v4.widget.DrawerLayout.z.a(p6);
	        }
	        return;
	    }
	
	
	    public static synthetic android.view.View a(android.support.v4.widget.DrawerLayout p1)
	    {
	        return p1.d();
	    }
	
	
	    private void a(int p4, int p5)
	    {
	        int v1 = fe.a(p5, gt.g(this));
	        if (v1 != 3) {
	            if (v1 == 5) {
	                this.u = p4;
	            }
	        } else {
	            this.t = p4;
	        }
	        if (p4 != 0) {
	            android.view.View v0_2;
	            if (v1 != 3) {
	                v0_2 = this.c;
	            } else {
	                v0_2 = this.b;
	            }
	            v0_2.a();
	        }
	        switch (p4) {
	            case 1:
	                android.view.View v0_4 = this.b(v1);
	                if (v0_4 == null) {
	                } else {
	                    this.f(v0_4);
	                }
	                break;
	            case 2:
	                android.view.View v0_3 = this.b(v1);
	                if (v0_3 == null) {
	                } else {
	                    this.e(v0_3);
	                }
	                break;
	        }
	        return;
	    }
	
	
	    private void a(boolean p10)
	    {
	        int v4 = this.getChildCount();
	        int v2 = 0;
	        int v1 = 0;
	        while (v2 < v4) {
	            boolean v5_0 = this.getChildAt(v2);
	            int v0_3 = ((ku) v5_0.getLayoutParams());
	            if ((android.support.v4.widget.DrawerLayout.d(v5_0)) && ((!p10) || (v0_3.c))) {
	                mf v6_2 = v5_0.getWidth();
	                if (!this.a(v5_0, 3)) {
	                    v1 |= this.c.a(v5_0, this.getWidth(), v5_0.getTop());
	                } else {
	                    v1 |= this.b.a(v5_0, (- v6_2), v5_0.getTop());
	                }
	                v0_3.c = 0;
	            }
	            v2++;
	        }
	        this.p.a();
	        this.q.a();
	        if (v1 != 0) {
	            this.invalidate();
	        }
	        return;
	    }
	
	
	    public static synthetic int[] a()
	    {
	        return android.support.v4.widget.DrawerLayout.j;
	    }
	
	
	    public static float b(android.view.View p1)
	    {
	        return ((ku) p1.getLayoutParams()).b;
	    }
	
	
	    public static synthetic boolean b()
	    {
	        return android.support.v4.widget.DrawerLayout.k;
	    }
	
	
	    private android.view.View c()
	    {
	        int v3 = this.getChildCount();
	        int v2 = 0;
	        while (v2 < v3) {
	            android.view.View v1 = this.getChildAt(v2);
	            if (!((ku) v1.getLayoutParams()).d) {
	                v2++;
	            } else {
	                int v0_1 = v1;
	            }
	            return v0_1;
	        }
	        v0_1 = 0;
	        return v0_1;
	    }
	
	
	    public static String c(int p2)
	    {
	        String v0_2;
	        if ((p2 & 3) != 3) {
	            if ((p2 & 5) != 5) {
	                v0_2 = Integer.toHexString(p2);
	            } else {
	                v0_2 = "RIGHT";
	            }
	        } else {
	            v0_2 = "LEFT";
	        }
	        return v0_2;
	    }
	
	
	    private android.view.View d()
	    {
	        int v2 = this.getChildCount();
	        int v1 = 0;
	        while (v1 < v2) {
	            int v0_1 = this.getChildAt(v1);
	            if ((!android.support.v4.widget.DrawerLayout.d(v0_1)) || (!this.h(v0_1))) {
	                v1++;
	            }
	            return v0_1;
	        }
	        v0_1 = 0;
	        return v0_1;
	    }
	
	
	    public static boolean d(android.view.View p2)
	    {
	        int v0_5;
	        if ((fe.a(((ku) p2.getLayoutParams()).a, gt.g(p2)) & 7) == 0) {
	            v0_5 = 0;
	        } else {
	            v0_5 = 1;
	        }
	        return v0_5;
	    }
	
	
	    public static synthetic boolean i(android.view.View p2)
	    {
	        if ((gt.e(p2) == 4) || (gt.e(p2) == 2)) {
	            int v0_2 = 0;
	        } else {
	            v0_2 = 1;
	        }
	        return v0_2;
	    }
	
	
	    private static boolean j(android.view.View p1)
	    {
	        int v0_3;
	        if (((ku) p1.getLayoutParams()).a != 0) {
	            v0_3 = 0;
	        } else {
	            v0_3 = 1;
	        }
	        return v0_3;
	    }
	
	
	    public final int a(android.view.View p3)
	    {
	        int v0_1;
	        int v0_0 = this.c(p3);
	        if (v0_0 != 3) {
	            if (v0_0 != 5) {
	                v0_1 = 0;
	            } else {
	                v0_1 = this.u;
	            }
	        } else {
	            v0_1 = this.t;
	        }
	        return v0_1;
	    }
	
	
	    public final void a(int p2)
	    {
	        this.a(p2, 3);
	        this.a(p2, 5);
	        return;
	    }
	
	
	    public final void a(android.view.View p3, float p4)
	    {
	        kt v0_1 = ((ku) p3.getLayoutParams());
	        if (p4 != v0_1.b) {
	            v0_1.b = p4;
	            if (this.f != null) {
	                this.f.a(p4);
	            }
	        }
	        return;
	    }
	
	
	    public void a(android.view.View p5, boolean p6)
	    {
	        int v1 = this.getChildCount();
	        int v0 = 0;
	        while (v0 < v1) {
	            android.view.View v2 = this.getChildAt(v0);
	            if (((p6) || (android.support.v4.widget.DrawerLayout.d(v2))) && ((!p6) || (v2 != p5))) {
	                gt.c(v2, 4);
	            } else {
	                gt.c(v2, 1);
	            }
	            v0++;
	        }
	        return;
	    }
	
	
	    public final void a(Object p2, boolean p3)
	    {
	        int v0_1;
	        this.x = p2;
	        this.y = p3;
	        if ((p3) || (this.getBackground() != null)) {
	            v0_1 = 0;
	        } else {
	            v0_1 = 1;
	        }
	        this.setWillNotDraw(v0_1);
	        this.requestLayout();
	        return;
	    }
	
	
	    public final boolean a(android.view.View p2, int p3)
	    {
	        int v0_2;
	        if ((this.c(p2) & p3) != p3) {
	            v0_2 = 0;
	        } else {
	            v0_2 = 1;
	        }
	        return v0_2;
	    }
	
	
	    public void addView(android.view.View p2, int p3, android.view.ViewGroup$LayoutParams p4)
	    {
	        super.addView(p2, p3, p4);
	        if ((this.c() == null) && (!android.support.v4.widget.DrawerLayout.d(p2))) {
	            gt.c(p2, 1);
	        } else {
	            gt.c(p2, 4);
	        }
	        if (!android.support.v4.widget.DrawerLayout.k) {
	            gt.a(p2, this.l);
	        }
	        return;
	    }
	
	
	    public final android.view.View b(int p6)
	    {
	        int v2 = (fe.a(p6, gt.g(this)) & 7);
	        int v3 = this.getChildCount();
	        int v1 = 0;
	        while (v1 < v3) {
	            int v0_3 = this.getChildAt(v1);
	            if ((this.c(v0_3) & 7) != v2) {
	                v1++;
	            }
	            return v0_3;
	        }
	        v0_3 = 0;
	        return v0_3;
	    }
	
	
	    public final int c(android.view.View p3)
	    {
	        return fe.a(((ku) p3.getLayoutParams()).a, gt.g(this));
	    }
	
	
	    protected boolean checkLayoutParams(android.view.ViewGroup$LayoutParams p2)
	    {
	        if ((!(p2 instanceof ku)) || (!super.checkLayoutParams(p2))) {
	            int v0_2 = 0;
	        } else {
	            v0_2 = 1;
	        }
	        return v0_2;
	    }
	
	
	    public void computeScroll()
	    {
	        int v3 = this.getChildCount();
	        float v2 = 0;
	        boolean v1_1 = 0;
	        while (v1_1 < v3) {
	            v2 = Math.max(v2, ((ku) this.getChildAt(v1_1).getLayoutParams()).b);
	            v1_1++;
	        }
	        this.n = v2;
	        if ((this.b.a(1) | this.c.a(1)) != 0) {
	            gt.d(this);
	        }
	        return;
	    }
	
	
	    public final void d(int p5)
	    {
	        IllegalArgumentException v0_0 = this.b(8388611);
	        if (v0_0 != null) {
	            this.e(v0_0);
	            return;
	        } else {
	            throw new IllegalArgumentException(new StringBuilder("No drawer view found with gravity ").append(android.support.v4.widget.DrawerLayout.c(8388611)).toString());
	        }
	    }
	
	
	    protected boolean drawChild(android.graphics.Canvas p12, android.view.View p13, long p14)
	    {
	        int v4_0 = this.getHeight();
	        int v5_0 = android.support.v4.widget.DrawerLayout.j(p13);
	        int v1_0 = 0;
	        float v2_0 = this.getWidth();
	        int v6 = p12.save();
	        if (v5_0 != 0) {
	            boolean v7_0 = this.getChildCount();
	            android.graphics.drawable.Drawable v3_0 = 0;
	            while (v3_0 < v7_0) {
	                int v0_29;
	                android.view.View v8 = this.getChildAt(v3_0);
	                if ((v8 == p13) || (v8.getVisibility() != 0)) {
	                    v0_29 = v2_0;
	                } else {
	                    int v0_23;
	                    int v0_22 = v8.getBackground();
	                    if (v0_22 == 0) {
	                        v0_23 = 0;
	                    } else {
	                        if (v0_22.getOpacity() != -1) {
	                            v0_23 = 0;
	                        } else {
	                            v0_23 = 1;
	                        }
	                    }
	                    if ((v0_23 == 0) || ((!android.support.v4.widget.DrawerLayout.d(v8)) || (v8.getHeight() < v4_0))) {
	                    } else {
	                        if (!this.a(v8, 3)) {
	                            v0_29 = v8.getLeft();
	                            if (v0_29 >= v2_0) {
	                            }
	                        } else {
	                            int v0_30 = v8.getRight();
	                            if (v0_30 <= v1_0) {
	                                v0_30 = v1_0;
	                            }
	                            v1_0 = v0_30;
	                            v0_29 = v2_0;
	                        }
	                    }
	                }
	                v3_0++;
	                v2_0 = v0_29;
	            }
	            p12.clipRect(v1_0, 0, v2_0, this.getHeight());
	        }
	        int v0_2 = v2_0;
	        boolean v7_1 = super.drawChild(p12, p13, p14);
	        p12.restoreToCount(v6);
	        if ((this.n <= 0) || (v5_0 == 0)) {
	            if ((this.g == null) || (!this.a(p13, 3))) {
	                if ((this.h != null) && (this.a(p13, 5))) {
	                    int v0_10 = this.h.getIntrinsicWidth();
	                    int v1_1 = p13.getLeft();
	                    float v2_8 = Math.max(0, Math.min((((float) (this.getWidth() - v1_1)) / ((float) this.c.k)), 1065353216));
	                    this.h.setBounds((v1_1 - v0_10), p13.getTop(), v1_1, p13.getBottom());
	                    this.h.setAlpha(((int) (1132396544 * v2_8)));
	                    this.h.draw(p12);
	                }
	            } else {
	                int v0_15 = this.g.getIntrinsicWidth();
	                int v1_5 = p13.getRight();
	                float v2_14 = Math.max(0, Math.min((((float) v1_5) / ((float) this.b.k)), 1065353216));
	                this.g.setBounds(v1_5, p13.getTop(), (v0_15 + v1_5), p13.getBottom());
	                this.g.setAlpha(((int) (1132396544 * v2_14)));
	                this.g.draw(p12);
	            }
	        } else {
	            this.o.setColor(((((int) (((float) ((this.a & -16777216) >> 24)) * this.n)) << 24) | (this.a & 16777215)));
	            p12.drawRect(((float) v1_0), 0, ((float) v0_2), ((float) this.getHeight()), this.o);
	        }
	        return v7_1;
	    }
	
	
	    public final void e(android.view.View p4)
	    {
	        if (android.support.v4.widget.DrawerLayout.d(p4)) {
	            if (!this.s) {
	                if (!this.a(p4, 3)) {
	                    this.c.a(p4, (this.getWidth() - p4.getWidth()), p4.getTop());
	                } else {
	                    this.b.a(p4, 0, p4.getTop());
	                }
	            } else {
	                mf v0_7 = ((ku) p4.getLayoutParams());
	                v0_7.b = 1065353216;
	                v0_7.d = 1;
	                this.a(p4, 1);
	            }
	            this.invalidate();
	            return;
	        } else {
	            throw new IllegalArgumentException(new StringBuilder("View ").append(p4).append(" is not a sliding drawer").toString());
	        }
	    }
	
	
	    public final boolean e(int p2)
	    {
	        int v0_2;
	        int v0_1 = this.b(8388611);
	        if (v0_1 == 0) {
	            v0_2 = 0;
	        } else {
	            v0_2 = this.g(v0_1);
	        }
	        return v0_2;
	    }
	
	
	    public final void f(android.view.View p4)
	    {
	        if (android.support.v4.widget.DrawerLayout.d(p4)) {
	            if (!this.s) {
	                if (!this.a(p4, 3)) {
	                    this.c.a(p4, this.getWidth(), p4.getTop());
	                } else {
	                    this.b.a(p4, (- p4.getWidth()), p4.getTop());
	                }
	            } else {
	                mf v0_7 = ((ku) p4.getLayoutParams());
	                v0_7.b = 0;
	                v0_7.d = 0;
	            }
	            this.invalidate();
	            return;
	        } else {
	            throw new IllegalArgumentException(new StringBuilder("View ").append(p4).append(" is not a sliding drawer").toString());
	        }
	    }
	
	
	    public final boolean g(android.view.View p4)
	    {
	        if (android.support.v4.widget.DrawerLayout.d(p4)) {
	            return ((ku) p4.getLayoutParams()).d;
	        } else {
	            throw new IllegalArgumentException(new StringBuilder("View ").append(p4).append(" is not a drawer").toString());
	        }
	    }
	
	
	    protected android.view.ViewGroup$LayoutParams generateDefaultLayoutParams()
	    {
	        return new ku(-1, -1);
	    }
	
	
	    public android.view.ViewGroup$LayoutParams generateLayoutParams(android.util.AttributeSet p3)
	    {
	        return new ku(this.getContext(), p3);
	    }
	
	
	    protected android.view.ViewGroup$LayoutParams generateLayoutParams(android.view.ViewGroup$LayoutParams p2)
	    {
	        ku v0_3;
	        if (!(p2 instanceof ku)) {
	            if (!(p2 instanceof android.view.ViewGroup$MarginLayoutParams)) {
	                v0_3 = new ku(p2);
	            } else {
	                v0_3 = new ku(((android.view.ViewGroup$MarginLayoutParams) p2));
	            }
	        } else {
	            v0_3 = new ku(((ku) p2));
	        }
	        return v0_3;
	    }
	
	
	    public final boolean h(android.view.View p4)
	    {
	        if (android.support.v4.widget.DrawerLayout.d(p4)) {
	            int v0_5;
	            if (((ku) p4.getLayoutParams()).b <= 0) {
	                v0_5 = 0;
	            } else {
	                v0_5 = 1;
	            }
	            return v0_5;
	        } else {
	            throw new IllegalArgumentException(new StringBuilder("View ").append(p4).append(" is not a drawer").toString());
	        }
	    }
	
	
	    protected void onAttachedToWindow()
	    {
	        super.onAttachedToWindow();
	        this.s = 1;
	        return;
	    }
	
	
	    protected void onDetachedFromWindow()
	    {
	        super.onDetachedFromWindow();
	        this.s = 1;
	        return;
	    }
	
	
	    public void onDraw(android.graphics.Canvas p5)
	    {
	        super.onDraw(p5);
	        if ((this.y) && (this.i != null)) {
	            android.graphics.drawable.Drawable v0_3 = android.support.v4.widget.DrawerLayout.z.a(this.x);
	            if (v0_3 > null) {
	                this.i.setBounds(0, 0, this.getWidth(), v0_3);
	                this.i.draw(p5);
	            }
	        }
	        return;
	    }
	
	
	    public boolean onInterceptTouchEvent(android.view.MotionEvent p10)
	    {
	        int v0_16;
	        int v2 = 0;
	        int v0_0 = gd.a(p10);
	        int v4_2 = (this.c.a(p10) | this.b.a(p10));
	        switch (v0_0) {
	            case 0:
	                int v0_17 = p10.getX();
	                int v3_3 = p10.getY();
	                this.v = v0_17;
	                this.w = v3_3;
	                if (this.n <= 0) {
	                    v0_16 = 0;
	                } else {
	                    int v0_19 = this.b.a(((int) v0_17), ((int) v3_3));
	                    if ((v0_19 == 0) || (!android.support.v4.widget.DrawerLayout.j(v0_19))) {
	                    } else {
	                        v0_16 = 1;
	                    }
	                }
	                this.e = 0;
	                break;
	            case 1:
	            case 3:
	                this.a(1);
	                this.e = 0;
	                v0_16 = 0;
	                break;
	            case 2:
	                mf v5_0 = this.b;
	                int v3_2 = 0;
	                while (v3_2 < v5_0.d.length) {
	                    int v0_5;
	                    if ((v5_0.h & (1 << v3_2)) == 0) {
	                        v0_5 = 0;
	                    } else {
	                        v0_5 = 1;
	                    }
	                    int v0_6;
	                    if (v0_5 == 0) {
	                        v0_6 = 0;
	                    } else {
	                        if ((((v5_0.f[v3_2] - v5_0.d[v3_2]) * (v5_0.f[v3_2] - v5_0.d[v3_2])) + ((v5_0.g[v3_2] - v5_0.e[v3_2]) * (v5_0.g[v3_2] - v5_0.e[v3_2]))) <= ((float) (v5_0.b * v5_0.b))) {
	                            v0_6 = 0;
	                        } else {
	                            v0_6 = 1;
	                        }
	                    }
	                    if (v0_6 == 0) {
	                        v3_2++;
	                    } else {
	                        int v0_2 = 1;
	                    }
	                    if (v0_2 == 0) {
	                    } else {
	                        this.p.a();
	                        this.q.a();
	                        v0_16 = 0;
	                    }
	                }
	                v0_2 = 0;
	                break;
	            default:
	        }
	        if ((v4_2 != 0) || (v0_16 != 0)) {
	            v2 = 1;
	        } else {
	            int v4_3 = this.getChildCount();
	            int v3_5 = 0;
	            while (v3_5 < v4_3) {
	                if (!((ku) this.getChildAt(v3_5).getLayoutParams()).c) {
	                    v3_5++;
	                } else {
	                    int v0_21 = 1;
	                }
	                if ((v0_21 != 0) || (this.e)) {
	                }
	            }
	            v0_21 = 0;
	        }
	        return v2;
	    }
	
	
	    public boolean onKeyDown(int p3, android.view.KeyEvent p4)
	    {
	        boolean v0 = 1;
	        if (p3 != 4) {
	            v0 = super.onKeyDown(p3, p4);
	        } else {
	            int v1_2;
	            if (this.d() == null) {
	                v1_2 = 0;
	            } else {
	                v1_2 = 1;
	            }
	            if (v1_2 == 0) {
	            } else {
	                fi.b(p4);
	            }
	        }
	        return v0;
	    }
	
	
	    public boolean onKeyUp(int p4, android.view.KeyEvent p5)
	    {
	        int v0 = 0;
	        if (p4 != 4) {
	            v0 = super.onKeyUp(p4, p5);
	        } else {
	            android.view.View v1_1 = this.d();
	            if ((v1_1 != null) && (this.a(v1_1) == 0)) {
	                this.a(0);
	            }
	            if (v1_1 != null) {
	                v0 = 1;
	            }
	        }
	        return v0;
	    }
	
	
	    protected void onLayout(boolean p15, int p16, int p17, int p18, int p19)
	    {
	        this.r = 1;
	        int v6 = (p18 - p16);
	        int v7 = this.getChildCount();
	        int v5 = 0;
	        while (v5 < v7) {
	            android.view.View v8 = this.getChildAt(v5);
	            if (v8.getVisibility() != 8) {
	                int v0_6 = ((ku) v8.getLayoutParams());
	                if (!android.support.v4.widget.DrawerLayout.j(v8)) {
	                    int v1_9;
	                    int v2_1;
	                    int v9_0 = v8.getMeasuredWidth();
	                    int v10_0 = v8.getMeasuredHeight();
	                    if (!this.a(v8, 3)) {
	                        v2_1 = (v6 - ((int) (((float) v9_0) * v0_6.b)));
	                        v1_9 = (((float) (v6 - v2_1)) / ((float) v9_0));
	                    } else {
	                        v2_1 = (((int) (((float) v9_0) * v0_6.b)) + (- v9_0));
	                        v1_9 = (((float) (v9_0 + v2_1)) / ((float) v9_0));
	                    }
	                    int v3_5;
	                    if (v1_9 == v0_6.b) {
	                        v3_5 = 0;
	                    } else {
	                        v3_5 = 1;
	                    }
	                    switch ((v0_6.a & 112)) {
	                        case 16:
	                            int v11_2 = (p19 - p17);
	                            int v4_5 = ((v11_2 - v10_0) / 2);
	                            if (v4_5 >= v0_6.topMargin) {
	                                if ((v4_5 + v10_0) > (v11_2 - v0_6.bottomMargin)) {
	                                    v4_5 = ((v11_2 - v0_6.bottomMargin) - v10_0);
	                                }
	                            } else {
	                                v4_5 = v0_6.topMargin;
	                            }
	                            v8.layout(v2_1, v4_5, (v9_0 + v2_1), (v10_0 + v4_5));
	                            break;
	                        case 80:
	                            int v4_2 = (p19 - p17);
	                            v8.layout(v2_1, ((v4_2 - v0_6.bottomMargin) - v8.getMeasuredHeight()), (v9_0 + v2_1), (v4_2 - v0_6.bottomMargin));
	                            break;
	                        default:
	                            v8.layout(v2_1, v0_6.topMargin, (v9_0 + v2_1), (v10_0 + v0_6.topMargin));
	                    }
	                    if (v3_5 != 0) {
	                        this.a(v8, v1_9);
	                    }
	                    int v0_9;
	                    if (v0_6.b <= 0) {
	                        v0_9 = 4;
	                    } else {
	                        v0_9 = 0;
	                    }
	                    if (v8.getVisibility() != v0_9) {
	                        v8.setVisibility(v0_9);
	                    }
	                } else {
	                    v8.layout(v0_6.leftMargin, v0_6.topMargin, (v0_6.leftMargin + v8.getMeasuredWidth()), (v0_6.topMargin + v8.getMeasuredHeight()));
	                }
	            }
	            v5++;
	        }
	        this.r = 0;
	        this.s = 0;
	        return;
	    }
	
	
	    protected void onMeasure(int p13, int p14)
	    {
	        String v1_0 = 300;
	        int v4 = 0;
	        int v3_0 = android.view.View$MeasureSpec.getMode(p13);
	        int v5_0 = android.view.View$MeasureSpec.getMode(p14);
	        String v2_0 = android.view.View$MeasureSpec.getSize(p13);
	        int v0_0 = android.view.View$MeasureSpec.getSize(p14);
	        if ((v3_0 == 1073741824) && (v5_0 == 1073741824)) {
	            v1_0 = v0_0;
	        } else {
	            if (!this.isInEditMode()) {
	                throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
	            } else {
	                if ((v3_0 != -2147483648) && (v3_0 == 0)) {
	                    v2_0 = 300;
	                }
	                if ((v5_0 == -2147483648) || (v5_0 != 0)) {
	                }
	            }
	        }
	        int v3_1;
	        this.setMeasuredDimension(v2_0, v1_0);
	        if ((this.x == null) || (!gt.r(this))) {
	            v3_1 = 0;
	        } else {
	            v3_1 = 1;
	        }
	        int v5_1 = gt.g(this);
	        int v6_1 = this.getChildCount();
	        while (v4 < v6_1) {
	            android.view.View v7_1 = this.getChildAt(v4);
	            if (v7_1.getVisibility() != 8) {
	                int v0_8 = ((ku) v7_1.getLayoutParams());
	                if (v3_1 != 0) {
	                    int v8_2 = fe.a(v0_8.a, v5_1);
	                    if (!gt.r(v7_1)) {
	                        android.support.v4.widget.DrawerLayout.z.a(v0_8, this.x, v8_2);
	                    } else {
	                        android.support.v4.widget.DrawerLayout.z.a(v7_1, this.x, v8_2);
	                    }
	                }
	                if (!android.support.v4.widget.DrawerLayout.j(v7_1)) {
	                    if (!android.support.v4.widget.DrawerLayout.d(v7_1)) {
	                        throw new IllegalStateException(new StringBuilder("Child ").append(v7_1).append(" at index ").append(v4).append(" does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY").toString());
	                    } else {
	                        int v8_6 = (this.c(v7_1) & 7);
	                        if ((v8_6 & 0) == 0) {
	                            v7_1.measure(android.support.v4.widget.DrawerLayout.getChildMeasureSpec(p13, ((this.m + v0_8.leftMargin) + v0_8.rightMargin), v0_8.width), android.support.v4.widget.DrawerLayout.getChildMeasureSpec(p14, (v0_8.topMargin + v0_8.bottomMargin), v0_8.height));
	                        } else {
	                            throw new IllegalStateException(new StringBuilder("Child drawer has absolute gravity ").append(android.support.v4.widget.DrawerLayout.c(v8_6)).append(" but this DrawerLayout").append(" already has a drawer view along that edge").toString());
	                        }
	                    }
	                } else {
	                    v7_1.measure(android.view.View$MeasureSpec.makeMeasureSpec(((v2_0 - v0_8.leftMargin) - v0_8.rightMargin), 1073741824), android.view.View$MeasureSpec.makeMeasureSpec(((v1_0 - v0_8.topMargin) - v0_8.bottomMargin), 1073741824));
	                }
	            }
	            v4++;
	        }
	        return;
	    }
	
	
	    protected void onRestoreInstanceState(android.os.Parcelable p3)
	    {
	        super.onRestoreInstanceState(((kv) p3).getSuperState());
	        if (((kv) p3).a != 0) {
	            int v0_3 = this.b(((kv) p3).a);
	            if (v0_3 != 0) {
	                this.e(v0_3);
	            }
	        }
	        this.a(((kv) p3).b, 3);
	        this.a(((kv) p3).c, 5);
	        return;
	    }
	
	
	    protected android.os.Parcelable onSaveInstanceState()
	    {
	        kv v1_1 = new kv(super.onSaveInstanceState());
	        int v0_1 = this.c();
	        if (v0_1 != 0) {
	            v1_1.a = ((ku) v0_1.getLayoutParams()).a;
	        }
	        v1_1.b = this.t;
	        v1_1.c = this.u;
	        return v1_1;
	    }
	
	
	    public boolean onTouchEvent(android.view.MotionEvent p8)
	    {
	        int v0 = 0;
	        this.b.b(p8);
	        this.c.b(p8);
	        switch ((p8.getAction() & 255)) {
	            case 0:
	                int v2_11 = p8.getX();
	                int v3_6 = p8.getY();
	                this.v = v2_11;
	                this.w = v3_6;
	                this.e = 0;
	                break;
	            case 1:
	                int v2_4 = p8.getX();
	                int v3_0 = p8.getY();
	                int v4_1 = this.b.a(((int) v2_4), ((int) v3_0));
	                if ((v4_1 == 0) || ((!android.support.v4.widget.DrawerLayout.j(v4_1)) || ((((v2_4 - this.v) * (v2_4 - this.v)) + ((v3_0 - this.w) * (v3_0 - this.w))) >= ((float) (this.b.b * this.b.b))))) {
	                    v0 = 1;
	                } else {
	                    int v2_9 = this.c();
	                    if (v2_9 == 0) {
	                    } else {
	                        if (this.a(v2_9) == 2) {
	                            v0 = 1;
	                        }
	                    }
	                }
	                this.a(v0);
	            case 2:
	            default:
	                break;
	            case 3:
	                this.a(1);
	                this.e = 0;
	                break;
	        }
	        return 1;
	    }
	
	
	    public void requestDisallowInterceptTouchEvent(boolean p2)
	    {
	        super.requestDisallowInterceptTouchEvent(p2);
	        if (p2) {
	            this.a(1);
	        }
	        return;
	    }
	
	
	    public void requestLayout()
	    {
	        if (!this.r) {
	            super.requestLayout();
	        }
	        return;
	    }
	
