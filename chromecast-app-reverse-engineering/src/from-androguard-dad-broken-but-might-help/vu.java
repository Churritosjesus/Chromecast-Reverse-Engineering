	 android.view.View f
	public  g
	public  h
	public  i
	 wa j
	 vv k
	public vx l
	final wb m
	private  n
	private  o
	private  p
	private  q
	private  r
	private  s
	private  t
	private final android.util.SparseBooleanArray u
	private android.view.View v
	private vw w
	
	    public vu(android.content.Context p3)
	    {
	        this(p3, a.bD, a.bC);
	        this.u = new android.util.SparseBooleanArray();
	        this.m = new wb(this);
	        return;
	    }
	
	
	    public final android.view.View a(qe p4, android.view.View p5, android.view.ViewGroup p6)
	    {
	        android.view.View v0 = p4.getActionView();
	        if ((v0 == null) || (p4.i())) {
	            v0 = super.a(p4, p5, p6);
	        }
	        we v1_2;
	        if (!p4.isActionViewExpanded()) {
	            v1_2 = 0;
	        } else {
	            v1_2 = 8;
	        }
	        v0.setVisibility(v1_2);
	        we v1_3 = v0.getLayoutParams();
	        if (!((android.support.v7.widget.ActionMenuView) p6).checkLayoutParams(v1_3)) {
	            v0.setLayoutParams(((android.support.v7.widget.ActionMenuView) p6).a(v1_3));
	        }
	        return v0;
	    }
	
	
	    public final qr a(android.view.ViewGroup p3)
	    {
	        qr v1 = super.a(p3);
	        ((android.support.v7.widget.ActionMenuView) v1).a(this);
	        return v1;
	    }
	
	
	    public final void a(android.content.Context p8, qa p9)
	    {
	        int v0_0 = 1;
	        super.a(p8, p9);
	        android.content.res.Resources v2 = p8.getResources();
	        android.view.View v3_0 = ph.a(p8);
	        if (!this.o) {
	            if ((android.os.Build$VERSION.SDK_INT < 19) && (hf.b(android.view.ViewConfiguration.get(v3_0.a)))) {
	                v0_0 = 0;
	            }
	            this.n = v0_0;
	        }
	        if (!this.s) {
	            this.p = (v3_0.a.getResources().getDisplayMetrics().widthPixels / 2);
	        }
	        if (!this.h) {
	            this.g = v3_0.a.getResources().getInteger(a.bA);
	        }
	        int v0_11 = this.p;
	        if (!this.n) {
	            this.f = 0;
	        } else {
	            if (this.f == null) {
	                this.f = new vy(this, this.a);
	                this.f.measure(android.view.View$MeasureSpec.makeMeasureSpec(0, 0), android.view.View$MeasureSpec.makeMeasureSpec(0, 0));
	            }
	            v0_11 -= this.f.getMeasuredWidth();
	        }
	        this.q = v0_11;
	        this.t = ((int) (1113587712 * v2.getDisplayMetrics().density));
	        this.v = 0;
	        return;
	    }
	
	
	    public final void a(android.support.v7.widget.ActionMenuView p2)
	    {
	        this.e = p2;
	        p2.a = this.c;
	        return;
	    }
	
	
	    public final void a(qa p1, boolean p2)
	    {
	        this.d();
	        super.a(p1, p2);
	        return;
	    }
	
	
	    public final void a(qe p2, qs p3)
	    {
	        p3.a(p2, 0);
	        ((android.support.v7.internal.view.menu.ActionMenuItemView) p3).a = ((android.support.v7.widget.ActionMenuView) this.e);
	        if (this.w == null) {
	            this.w = new vw(this);
	        }
	        ((android.support.v7.internal.view.menu.ActionMenuItemView) p3).b = this.w;
	        return;
	    }
	
	
	    public final void a(boolean p3)
	    {
	        if (!p3) {
	            this.c.a(0);
	        } else {
	            super.a(0);
	        }
	        return;
	    }
	
	
	    public final boolean a()
	    {
	        java.util.ArrayList v13 = this.c.h();
	        int v14 = v13.size();
	        int v7_0 = this.g;
	        int v9_0 = this.q;
	        int v15 = android.view.View$MeasureSpec.makeMeasureSpec(0, 0);
	        int v2_3 = ((android.view.ViewGroup) this.e);
	        int v6_0 = 0;
	        int v5_0 = 0;
	        int v4_0 = 0;
	        int v10_0 = 0;
	        while (v10_0 < v14) {
	            int v3_10 = ((qe) v13.get(v10_0));
	            if (!v3_10.h()) {
	                if (!v3_10.g()) {
	                    v4_0 = 1;
	                } else {
	                    v5_0++;
	                }
	            } else {
	                v6_0++;
	            }
	            if ((!this.i) || (!v3_10.isActionViewExpanded())) {
	                int v3_12 = v7_0;
	            } else {
	                v3_12 = 0;
	            }
	            v10_0++;
	            v7_0 = v3_12;
	        }
	        if ((this.n) && ((v4_0 != 0) || ((v6_0 + v5_0) > v7_0))) {
	            v7_0--;
	        }
	        int v5_2;
	        int v10_1 = (v7_0 - v6_0);
	        android.util.SparseBooleanArray v16 = this.u;
	        v16.clear();
	        int v3_4 = 0;
	        if (!this.r) {
	            v5_2 = 0;
	        } else {
	            v3_4 = (v9_0 / this.t);
	            v5_2 = (((v9_0 % this.t) / v3_4) + this.t);
	        }
	        int v12 = 0;
	        int v7_1 = 0;
	        int v4_7 = v3_4;
	        while (v12 < v14) {
	            int v7_2;
	            int v3_8;
	            int v6_4;
	            int v3_7 = ((qe) v13.get(v12));
	            if (!v3_7.h()) {
	                if (!v3_7.g()) {
	                    v3_7.d(0);
	                    v6_4 = v7_1;
	                    v3_8 = v9_0;
	                    v7_2 = v10_1;
	                } else {
	                    int v6_6;
	                    int v17 = v3_7.getGroupId();
	                    int v18_0 = v16.get(v17);
	                    if (((v10_1 <= 0) && (v18_0 == 0)) || ((v9_0 <= 0) || ((this.r) && (v4_7 <= 0)))) {
	                        v6_6 = 0;
	                    } else {
	                        v6_6 = 1;
	                    }
	                    int v8_1;
	                    int v11_0;
	                    int v7_3;
	                    if (v6_6 == 0) {
	                        v11_0 = v6_6;
	                        v8_1 = v7_1;
	                        v7_3 = v4_7;
	                    } else {
	                        int v11_1 = this.a(v3_7, this.v, v2_3);
	                        if (this.v == null) {
	                            this.v = v11_1;
	                        }
	                        int v6_7;
	                        int v4_8;
	                        if (!this.r) {
	                            v11_1.measure(v15, v15);
	                            v6_7 = v4_7;
	                            v4_8 = v6_6;
	                        } else {
	                            int v19 = android.support.v7.widget.ActionMenuView.a(v11_1, v5_2, v4_7, v15, 0);
	                            if (v19 != 0) {
	                                v4_8 = v6_6;
	                            } else {
	                                v4_8 = 0;
	                            }
	                            v6_7 = (v4_7 - v19);
	                        }
	                        int v8_7 = v11_1.getMeasuredWidth();
	                        v9_0 -= v8_7;
	                        if (v7_1 == 0) {
	                            v7_1 = v8_7;
	                        }
	                        if (!this.r) {
	                            int v8_10;
	                            if ((v9_0 + v7_1) <= 0) {
	                                v8_10 = 0;
	                            } else {
	                                v8_10 = 1;
	                            }
	                            v11_0 = (v4_8 & v8_10);
	                            v8_1 = v7_1;
	                            v7_3 = v6_7;
	                        } else {
	                            int v8_11;
	                            if (v9_0 < 0) {
	                                v8_11 = 0;
	                            } else {
	                                v8_11 = 1;
	                            }
	                            v11_0 = (v4_8 & v8_11);
	                            v8_1 = v7_1;
	                            v7_3 = v6_7;
	                        }
	                    }
	                    if ((v11_0 == 0) || (v17 == 0)) {
	                        if (v18_0 == 0) {
	                            int v4_11 = v10_1;
	                        } else {
	                            v16.put(v17, 0);
	                            int v6_8 = v10_1;
	                            int v10_2 = 0;
	                            while (v10_2 < v12) {
	                                int v4_15 = ((qe) v13.get(v10_2));
	                                if (v4_15.getGroupId() == v17) {
	                                    if (v4_15.f()) {
	                                        v6_8++;
	                                    }
	                                    v4_15.d(0);
	                                }
	                                v10_2++;
	                            }
	                            v4_11 = v6_8;
	                        }
	                    } else {
	                        v16.put(v17, 1);
	                        v4_11 = v10_1;
	                    }
	                    if (v11_0 != 0) {
	                        v4_11--;
	                    }
	                    v3_7.d(v11_0);
	                    v6_4 = v8_1;
	                    v3_8 = v9_0;
	                    v7_2 = v4_11;
	                    v4_7 = v7_3;
	                }
	            } else {
	                int v6_10 = this.a(v3_7, this.v, v2_3);
	                if (this.v == null) {
	                    this.v = v6_10;
	                }
	                if (!this.r) {
	                    v6_10.measure(v15, v15);
	                } else {
	                    v4_7 -= android.support.v7.widget.ActionMenuView.a(v6_10, v5_2, v4_7, v15, 0);
	                }
	                v6_4 = v6_10.getMeasuredWidth();
	                int v8_16 = (v9_0 - v6_4);
	                if (v7_1 != 0) {
	                    v6_4 = v7_1;
	                }
	                int v7_4 = v3_7.getGroupId();
	                if (v7_4 != 0) {
	                    v16.put(v7_4, 1);
	                }
	                v3_7.d(1);
	                v3_8 = v8_16;
	                v7_2 = v10_1;
	            }
	            v12++;
	            v9_0 = v3_8;
	            v10_1 = v7_2;
	            v7_1 = v6_4;
	        }
	        return 1;
	    }
	
	
	    public final boolean a(android.view.ViewGroup p3, int p4)
	    {
	        boolean v0_1;
	        if (p3.getChildAt(p4) != this.f) {
	            v0_1 = super.a(p3, p4);
	        } else {
	            v0_1 = 0;
	        }
	        return v0_1;
	    }
	
	
	    public final boolean a(qe p2)
	    {
	        return p2.f();
	    }
	
	
	    public final boolean a(qu p8)
	    {
	        android.content.Context v0_7;
	        if (p8.hasVisibleItems()) {
	            android.content.Context v0_1 = p8;
	            while (v0_1.k != this.c) {
	                v0_1 = ((qu) v0_1.k);
	            }
	            android.content.Context v0_4;
	            android.view.MenuItem v5 = v0_1.getItem();
	            android.content.Context v0_3 = ((android.view.ViewGroup) this.e);
	            if (v0_3 == null) {
	                v0_4 = 0;
	            } else {
	                int v6 = v0_3.getChildCount();
	                int v4 = 0;
	                while (v4 < v6) {
	                    android.content.Context v2_1 = v0_3.getChildAt(v4);
	                    if ((!(v2_1 instanceof qs)) || (((qs) v2_1).a() != v5)) {
	                        v4++;
	                    } else {
	                        v0_4 = v2_1;
	                    }
	                }
	            }
	            if (v0_4 == null) {
	                if (this.f != null) {
	                    v0_4 = this.f;
	                } else {
	                    v0_7 = 0;
	                    return v0_7;
	                }
	            }
	            p8.getItem().getItemId();
	            this.k = new vv(this, this.b, p8);
	            this.k.b = v0_4;
	            this.k.b();
	            super.a(p8);
	            v0_7 = 1;
	        } else {
	            v0_7 = 0;
	        }
	        return v0_7;
	    }
	
	
	    public final void b(boolean p7)
	    {
	        android.view.View v1_0 = 1;
	        we v2_0 = 0;
	        ((android.view.View) this.e).getParent();
	        super.b(p7);
	        ((android.view.View) this.e).requestLayout();
	        if (this.c != null) {
	            android.support.v7.widget.ActionMenuView v0_5 = this.c;
	            v0_5.i();
	            java.util.ArrayList v4 = v0_5.d;
	            int v5 = v4.size();
	            int v3_0 = 0;
	            while (v3_0 < v5) {
	                android.support.v7.widget.ActionMenuView v0_30 = ((qe) v4.get(v3_0)).d;
	                if (v0_30 != null) {
	                    v0_30.b = this;
	                }
	                v3_0++;
	            }
	        }
	        android.support.v7.widget.ActionMenuView v0_7;
	        if (this.c == null) {
	            v0_7 = 0;
	        } else {
	            v0_7 = this.c.j();
	        }
	        if ((this.n) && (v0_7 != null)) {
	            int v3_2 = v0_7.size();
	            if (v3_2 != 1) {
	                if (v3_2 <= 0) {
	                    v1_0 = 0;
	                }
	                v2_0 = v1_0;
	            } else {
	                android.support.v7.widget.ActionMenuView v0_12;
	                if (((qe) v0_7.get(0)).isActionViewExpanded()) {
	                    v0_12 = 0;
	                } else {
	                    v0_12 = 1;
	                }
	                v2_0 = v0_12;
	            }
	        }
	        if (v2_0 == null) {
	            if ((this.f != null) && (this.f.getParent() == this.e)) {
	                ((android.view.ViewGroup) this.e).removeView(this.f);
	            }
	        } else {
	            if (this.f == null) {
	                this.f = new vy(this, this.a);
	            }
	            android.support.v7.widget.ActionMenuView v0_23 = ((android.view.ViewGroup) this.f.getParent());
	            if (v0_23 != this.e) {
	                if (v0_23 != null) {
	                    v0_23.removeView(this.f);
	                }
	                android.support.v7.widget.ActionMenuView v0_25 = ((android.support.v7.widget.ActionMenuView) this.e);
	                v0_25.addView(this.f, v0_25.a());
	            }
	        }
	        ((android.support.v7.widget.ActionMenuView) this.e).b = this.n;
	        return;
	    }
	
	
	    public final boolean b()
	    {
	        int v5 = 1;
	        if ((!this.n) || ((this.f()) || ((this.c == null) || ((this.e == null) || ((this.l != null) || (this.c.j().isEmpty())))))) {
	            v5 = 0;
	        } else {
	            this.l = new vx(this, new wa(this, this.b, this.c, this.f, 1));
	            ((android.view.View) this.e).post(this.l);
	            super.a(0);
	        }
	        return v5;
	    }
	
	
	    public final void c(boolean p2)
	    {
	        this.n = 1;
	        this.o = 1;
	        return;
	    }
	
	
	    public final boolean c()
	    {
	        if ((this.l == null) || (this.e == null)) {
	            int v0_2 = this.j;
	            if (v0_2 == 0) {
	                int v0_3 = 0;
	            } else {
	                v0_2.d();
	                v0_3 = 1;
	            }
	        } else {
	            ((android.view.View) this.e).removeCallbacks(this.l);
	            this.l = 0;
	            v0_3 = 1;
	        }
	        return v0_3;
	    }
	
	
	    public final boolean d()
	    {
	        return (this.c() | this.e());
	    }
	
	
	    public final boolean e()
	    {
	        int v0_1;
	        if (this.k == null) {
	            v0_1 = 0;
	        } else {
	            this.k.d();
	            v0_1 = 1;
	        }
	        return v0_1;
	    }
	
	
	    public final boolean f()
	    {
	        if ((this.j == null) || (!this.j.e())) {
	            int v0_3 = 0;
	        } else {
	            v0_3 = 1;
	        }
	        return v0_3;
	    }
	
