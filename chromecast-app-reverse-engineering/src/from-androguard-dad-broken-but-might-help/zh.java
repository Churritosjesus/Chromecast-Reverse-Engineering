	private  a
	public xb d
	public android.support.v7.widget.RecyclerView e
	
	    public zh()
	    {
	        this.a = 0;
	        return;
	    }
	
	
	    public static int a(int p4, int p5, int p6, boolean p7)
	    {
	        int v0_0 = 1073741824;
	        int v2_1 = Math.max(0, (p4 - p5));
	        if (!p7) {
	            if (p6 < 0) {
	                if (p6 != -1) {
	                    if (p6 != -2) {
	                        v0_0 = 0;
	                        p6 = 0;
	                    } else {
	                        v0_0 = -2147483648;
	                        p6 = v2_1;
	                    }
	                } else {
	                    p6 = v2_1;
	                }
	            }
	        } else {
	            if (p6 < 0) {
	                v0_0 = 0;
	                p6 = 0;
	            }
	        }
	        return android.view.View$MeasureSpec.makeMeasureSpec(p6, v0_0);
	    }
	
	
	    public static int a(android.view.View p1)
	    {
	        return ((zi) p1.getLayoutParams()).c.d();
	    }
	
	
	    public static void a(android.view.View p4, int p5, int p6, int p7, int p8)
	    {
	        int v0_2 = ((zi) p4.getLayoutParams()).d;
	        p4.layout((v0_2.left + p5), (v0_2.top + p6), (p7 - v0_2.right), (p8 - v0_2.bottom));
	        return;
	    }
	
	
	    public static synthetic boolean a(zh p1)
	    {
	        return p1.a;
	    }
	
	
	    public static synthetic boolean a(zh p1, boolean p2)
	    {
	        p1.a = 0;
	        return 0;
	    }
	
	
	    public static int b(android.view.View p3)
	    {
	        int v0_2 = ((zi) p3.getLayoutParams()).d;
	        return (v0_2.right + (p3.getMeasuredWidth() + v0_2.left));
	    }
	
	
	    public static int c(android.view.View p3)
	    {
	        int v0_2 = ((zi) p3.getLayoutParams()).d;
	        return (v0_2.bottom + (p3.getMeasuredHeight() + v0_2.top));
	    }
	
	
	    public static int d(android.view.View p1)
	    {
	        return ((zi) p1.getLayoutParams()).d.top;
	    }
	
	
	    public static int e(android.view.View p1)
	    {
	        return ((zi) p1.getLayoutParams()).d.bottom;
	    }
	
	
	    public static int f(android.view.View p1)
	    {
	        return ((zi) p1.getLayoutParams()).d.left;
	    }
	
	
	    public static int g(android.view.View p1)
	    {
	        return ((zi) p1.getLayoutParams()).d.right;
	    }
	
	
	    public int a(int p2, zl p3, zp p4)
	    {
	        return 0;
	    }
	
	
	    public int a(zl p3, zp p4)
	    {
	        int v0_0 = 1;
	        if ((this.e != null) && ((android.support.v7.widget.RecyclerView.f(this.e) != null) && (this.j()))) {
	            v0_0 = android.support.v7.widget.RecyclerView.f(this.e).a();
	        }
	        return v0_0;
	    }
	
	
	    public int a(zp p2)
	    {
	        return 0;
	    }
	
	
	    public zi a(android.content.Context p2, android.util.AttributeSet p3)
	    {
	        return new zi(p2, p3);
	    }
	
	
	    public zi a(android.view.ViewGroup$LayoutParams p2)
	    {
	        zi v0_3;
	        if (!(p2 instanceof zi)) {
	            if (!(p2 instanceof android.view.ViewGroup$MarginLayoutParams)) {
	                v0_3 = new zi(p2);
	            } else {
	                v0_3 = new zi(((android.view.ViewGroup$MarginLayoutParams) p2));
	            }
	        } else {
	            v0_3 = new zi(((zi) p2));
	        }
	        return v0_3;
	    }
	
	
	    public void a()
	    {
	        return;
	    }
	
	
	    public final void a(int p2, zl p3)
	    {
	        android.view.View v0 = this.f(p2);
	        this.d(p2);
	        p3.a(v0);
	        return;
	    }
	
	
	    public void a(android.os.Parcelable p1)
	    {
	        return;
	    }
	
	
	    public final void a(android.support.v7.widget.RecyclerView p2)
	    {
	        if (p2 != null) {
	            this.e = p2;
	            this.d = p2.c;
	        } else {
	            this.e = 0;
	            this.d = 0;
	        }
	        return;
	    }
	
	
	    public void a(android.support.v7.widget.RecyclerView p1, zl p2)
	    {
	        return;
	    }
	
	
	    void a(android.view.View p9, int p10, boolean p11)
	    {
	        String v3_0 = android.support.v7.widget.RecyclerView.b(p9);
	        if ((!p11) && (!v3_0.n())) {
	            this.e.n.a(p9);
	        } else {
	            this.e.n.b(p9);
	        }
	        IllegalArgumentException v0_6 = ((zi) p9.getLayoutParams());
	        if ((!v3_0.g()) && (!v3_0.e())) {
	            if (p9.getParent() != this.e) {
	                this.d.a(p9, p10, 0);
	                v0_6.e = 1;
	            } else {
	                zi v1_8;
	                zi v1_5 = this.d;
	                android.view.View v4_2 = v1_5.a.a(p9);
	                if (v4_2 != -1) {
	                    if (!v1_5.b.b(v4_2)) {
	                        v1_8 = (v4_2 - v1_5.b.d(v4_2));
	                    } else {
	                        v1_8 = -1;
	                    }
	                } else {
	                    v1_8 = -1;
	                }
	                if (p10 == -1) {
	                    p10 = this.d.a();
	                }
	                if (v1_8 != -1) {
	                    if (v1_8 != p10) {
	                        xb v2_2 = android.support.v7.widget.RecyclerView.d(this.e);
	                        android.view.View v4_4 = v2_2.f(v1_8);
	                        if (v4_4 != null) {
	                            v2_2.e(v1_8);
	                            zi v1_10 = ((zi) v4_4.getLayoutParams());
	                            boolean v5_2 = android.support.v7.widget.RecyclerView.b(v4_4);
	                            if (!v5_2.n()) {
	                                v2_2.e.n.a(v4_4);
	                            } else {
	                                v2_2.e.n.b(v4_4);
	                            }
	                            v2_2.d.a(v4_4, p10, v1_10, v5_2.n());
	                        } else {
	                            throw new IllegalArgumentException(new StringBuilder("Cannot move a child from non-existing index:").append(v1_8).toString());
	                        }
	                    }
	                } else {
	                    throw new IllegalStateException(new StringBuilder("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:").append(this.e.indexOfChild(p9)).toString());
	                }
	            }
	        } else {
	            if (!v3_0.e()) {
	                v3_0.h();
	            } else {
	                v3_0.f();
	            }
	            this.d.a(p9, p10, p9.getLayoutParams(), 0);
	        }
	        if (v0_6.f) {
	            v3_0.a.invalidate();
	            v0_6.f = 0;
	        }
	        return;
	    }
	
	
	    final void a(android.view.View p3, jd p4)
	    {
	        zl v0_0 = android.support.v7.widget.RecyclerView.b(p3);
	        if ((v0_0 != null) && ((!v0_0.n()) && (!this.d.a(v0_0.a)))) {
	            this.a(this.e.a, this.e.n, p3, p4);
	        }
	        return;
	    }
	
	
	    public void a(android.view.accessibility.AccessibilityEvent p5)
	    {
	        int v0_0 = 1;
	        jx v1_2 = iz.a(p5);
	        if (this.e != null) {
	            if ((!gt.b(this.e, 1)) && ((!gt.b(this.e, -1)) && ((!gt.a(this.e, -1)) && (!gt.a(this.e, 1))))) {
	                v0_0 = 0;
	            }
	            v1_2.a(v0_0);
	            if (android.support.v7.widget.RecyclerView.f(this.e) != null) {
	                v1_2.a(android.support.v7.widget.RecyclerView.f(this.e).a());
	            }
	        }
	        return;
	    }
	
	
	    public void a(String p2)
	    {
	        if (this.e != null) {
	            this.e.a(p2);
	        }
	        return;
	    }
	
	
	    public final void a(zl p7)
	    {
	        int v2 = p7.a.size();
	        int v1 = (v2 - 1);
	        while (v1 >= 0) {
	            android.support.v7.widget.RecyclerView v0_7 = ((zr) p7.a.get(v1)).a;
	            zr v3 = android.support.v7.widget.RecyclerView.b(v0_7);
	            if (!v3.b()) {
	                v3.a(0);
	                if (v3.o()) {
	                    this.e.removeDetachedView(v0_7, 0);
	                }
	                if (this.e.m != null) {
	                    this.e.m.c(v3);
	                }
	                v3.a(1);
	                p7.b(v0_7);
	            }
	            v1--;
	        }
	        p7.a.clear();
	        if (v2 > 0) {
	            this.e.invalidate();
	        }
	        return;
	    }
	
	
	    public void a(zl p7, zp p8, android.view.View p9, jd p10)
	    {
	        jm v0_1;
	        if (!this.j()) {
	            v0_1 = 0;
	        } else {
	            v0_1 = zh.a(p9);
	        }
	        int v2_1;
	        if (!this.i()) {
	            v2_1 = 0;
	        } else {
	            v2_1 = zh.a(p9);
	        }
	        p10.a(jm.a(v0_1, 1, v2_1, 1, 0, 0));
	        return;
	    }
	
	
	    public boolean a(zi p2)
	    {
	        int v0;
	        if (p2 == null) {
	            v0 = 0;
	        } else {
	            v0 = 1;
	        }
	        return v0;
	    }
	
	
	    public int b(int p2, zl p3, zp p4)
	    {
	        return 0;
	    }
	
	
	    public int b(zl p3, zp p4)
	    {
	        int v0_0 = 1;
	        if ((this.e != null) && ((android.support.v7.widget.RecyclerView.f(this.e) != null) && (this.i()))) {
	            v0_0 = android.support.v7.widget.RecyclerView.f(this.e).a();
	        }
	        return v0_0;
	    }
	
	
	    public int b(zp p2)
	    {
	        return 0;
	    }
	
	
	    public android.view.View b(int p6)
	    {
	        int v2 = this.n();
	        int v1 = 0;
	        while (v1 < v2) {
	            int v0_1 = this.f(v1);
	            boolean v3_0 = android.support.v7.widget.RecyclerView.b(v0_1);
	            if ((!v3_0) || ((v3_0.d() != p6) || ((v3_0.b()) || ((!this.e.n.j) && (v3_0.n()))))) {
	                v1++;
	            }
	            return v0_1;
	        }
	        v0_1 = 0;
	        return v0_1;
	    }
	
	
	    public void b()
	    {
	        return;
	    }
	
	
	    public int c(zp p2)
	    {
	        return 0;
	    }
	
	
	    public android.view.View c(int p2, zl p3, zp p4)
	    {
	        return 0;
	    }
	
	
	    public void c()
	    {
	        return;
	    }
	
	
	    public void c(int p1)
	    {
	        return;
	    }
	
	
	    public void c(zl p3, zp p4)
	    {
	        android.util.Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
	        return;
	    }
	
	
	    public int d(zp p2)
	    {
	        return 0;
	    }
	
	
	    public void d()
	    {
	        return;
	    }
	
	
	    public final void d(int p5)
	    {
	        if (this.f(p5) != null) {
	            xd v0_1 = this.d;
	            int v1 = v0_1.a(p5);
	            android.view.View v2_1 = v0_1.a.b(v1);
	            if (v2_1 != null) {
	                if (v0_1.b.c(v1)) {
	                    v0_1.c.remove(v2_1);
	                }
	                v0_1.a.a(v1);
	            }
	        }
	        return;
	    }
	
	
	    public int e(zp p2)
	    {
	        return 0;
	    }
	
	
	    public void e()
	    {
	        return;
	    }
	
	
	    public final void e(int p4)
	    {
	        this.f(p4);
	        xd v0_0 = this.d;
	        int v1 = v0_0.a(p4);
	        v0_0.b.c(v1);
	        v0_0.a.c(v1);
	        return;
	    }
	
	
	    public int f(zp p2)
	    {
	        return 0;
	    }
	
	
	    public final android.view.View f(int p2)
	    {
	        int v0_1;
	        if (this.d == null) {
	            v0_1 = 0;
	        } else {
	            v0_1 = this.d.b(p2);
	        }
	        return v0_1;
	    }
	
	
	    public boolean g()
	    {
	        return 0;
	    }
	
	
	    public android.os.Parcelable h()
	    {
	        return 0;
	    }
	
	
	    public boolean i()
	    {
	        return 0;
	    }
	
	
	    public boolean j()
	    {
	        return 0;
	    }
	
	
	    public final void m()
	    {
	        if (this.e != null) {
	            this.e.requestLayout();
	        }
	        return;
	    }
	
	
	    public final int n()
	    {
	        int v0_1;
	        if (this.d == null) {
	            v0_1 = 0;
	        } else {
	            v0_1 = this.d.a();
	        }
	        return v0_1;
	    }
	
	
	    public final int o()
	    {
	        int v0_1;
	        if (this.e == null) {
	            v0_1 = 0;
	        } else {
	            v0_1 = this.e.getWidth();
	        }
	        return v0_1;
	    }
	
	
	    public final int p()
	    {
	        int v0_1;
	        if (this.e == null) {
	            v0_1 = 0;
	        } else {
	            v0_1 = this.e.getHeight();
	        }
	        return v0_1;
	    }
	
	
	    public final int q()
	    {
	        int v0_1;
	        if (this.e == null) {
	            v0_1 = 0;
	        } else {
	            v0_1 = this.e.getPaddingLeft();
	        }
	        return v0_1;
	    }
	
	
	    public final int r()
	    {
	        int v0_1;
	        if (this.e == null) {
	            v0_1 = 0;
	        } else {
	            v0_1 = this.e.getPaddingTop();
	        }
	        return v0_1;
	    }
	
	
	    public final int s()
	    {
	        int v0_1;
	        if (this.e == null) {
	            v0_1 = 0;
	        } else {
	            v0_1 = this.e.getPaddingRight();
	        }
	        return v0_1;
	    }
	
	
	    public final int t()
	    {
	        int v0_1;
	        if (this.e == null) {
	            v0_1 = 0;
	        } else {
	            v0_1 = this.e.getPaddingBottom();
	        }
	        return v0_1;
	    }
	
