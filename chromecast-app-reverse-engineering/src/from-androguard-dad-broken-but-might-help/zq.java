	public  a
	public  b
	public lr c
	public android.view.animation.Interpolator d
	public final synthetic android.support.v7.widget.RecyclerView e
	private  f
	private  g
	
	    public zq(android.support.v7.widget.RecyclerView p3)
	    {
	        this.e = p3;
	        this.d = android.support.v7.widget.RecyclerView.i();
	        this.f = 0;
	        this.g = 0;
	        this.c = lr.a(p3.getContext(), android.support.v7.widget.RecyclerView.i());
	        return;
	    }
	
	
	    public static float a(float p4)
	    {
	        return ((float) Math.sin(((double) ((float) (((double) (p4 - 1056964608)) * 0.4712389167638204)))));
	    }
	
	
	    public final void a()
	    {
	        if (!this.f) {
	            this.e.removeCallbacks(this);
	            gt.a(this.e, this);
	        } else {
	            this.g = 1;
	        }
	        return;
	    }
	
	
	    public final void run()
	    {
	        this.g = 0;
	        this.f = 1;
	        android.support.v7.widget.RecyclerView.e(this.e);
	        lr v8 = this.c;
	        android.support.v7.widget.RecyclerView.d(this.e);
	        if (v8.e()) {
	            int v9 = v8.a();
	            int v10 = v8.b();
	            int v11 = (v9 - this.a);
	            int v12 = (v10 - this.b);
	            int v4_0 = 0;
	            int v2_0 = 0;
	            this.a = v9;
	            this.b = v10;
	            Object v3_0 = 0;
	            android.support.v7.widget.RecyclerView v1_7 = 0;
	            if (android.support.v7.widget.RecyclerView.f(this.e) != null) {
	                this.e.a();
	                android.support.v7.widget.RecyclerView.g(this.e);
	                a.a("RV Scroll");
	                if (v11 != 0) {
	                    v4_0 = android.support.v7.widget.RecyclerView.d(this.e).a(v11, this.e.a, this.e.n);
	                    v3_0 = (v11 - v4_0);
	                }
	                if (v12 != 0) {
	                    v2_0 = android.support.v7.widget.RecyclerView.d(this.e).b(v12, this.e.a, this.e.n);
	                    v1_7 = (v12 - v2_0);
	                }
	                a.b();
	                if (android.support.v7.widget.RecyclerView.h(this.e)) {
	                    int v6_0 = this.e.c.a();
	                    android.support.v7.widget.RecyclerView v5_13 = 0;
	                    while (v5_13 < v6_0) {
	                        int v7_3 = this.e.c.b(v5_13);
	                        lc v13_6 = this.e.a(v7_3);
	                        if ((v13_6 != null) && (v13_6.h != null)) {
	                            lc v13_8 = v13_6.h.a;
	                            int v14_3 = v7_3.getLeft();
	                            int v7_4 = v7_3.getTop();
	                            if ((v14_3 != v13_8.getLeft()) || (v7_4 != v13_8.getTop())) {
	                                v13_8.layout(v14_3, v7_4, (v13_8.getWidth() + v14_3), (v13_8.getHeight() + v7_4));
	                            }
	                        }
	                        v5_13++;
	                    }
	                }
	                android.support.v7.widget.RecyclerView.i(this.e);
	                this.e.a(0);
	            }
	            Object v3_3 = v2_0;
	            int v2_3 = v3_0;
	            if (!android.support.v7.widget.RecyclerView.j(this.e).isEmpty()) {
	                this.e.invalidate();
	            }
	            if (gt.a(this.e) != 2) {
	                android.support.v7.widget.RecyclerView.a(this.e, v11, v12);
	            }
	            if ((v2_3 != 0) || (v1_7 != null)) {
	                int v7_0;
	                int v6_4 = ((int) v8.b.d(v8.a));
	                if (v2_3 == v9) {
	                    v7_0 = 0;
	                } else {
	                    android.support.v7.widget.RecyclerView v5_26;
	                    if (v2_3 >= 0) {
	                        if (v2_3 <= 0) {
	                            v5_26 = 0;
	                        } else {
	                            v5_26 = v6_4;
	                        }
	                    } else {
	                        v5_26 = (- v6_4);
	                    }
	                    v7_0 = v5_26;
	                }
	                if (v1_7 == v10) {
	                    v6_4 = 0;
	                } else {
	                    if (v1_7 >= null) {
	                        if (v1_7 <= null) {
	                            v6_4 = 0;
	                        }
	                    } else {
	                        v6_4 = (- v6_4);
	                    }
	                }
	                if (gt.a(this.e) != 2) {
	                    android.support.v7.widget.RecyclerView v5_30 = this.e;
	                    if (v7_0 >= 0) {
	                        if (v7_0 > 0) {
	                            v5_30.c();
	                            v5_30.k.a(v7_0);
	                        }
	                    } else {
	                        v5_30.b();
	                        v5_30.i.a((- v7_0));
	                    }
	                    if (v6_4 >= 0) {
	                        if (v6_4 > 0) {
	                            v5_30.e();
	                            v5_30.l.a(v6_4);
	                        }
	                    } else {
	                        v5_30.d();
	                        v5_30.j.a((- v6_4));
	                    }
	                    if ((v7_0 != 0) || (v6_4 != 0)) {
	                        gt.d(v5_30);
	                    }
	                }
	                if (((v7_0 != 0) || ((v2_3 == v9) || (v8.c() == 0))) && ((v6_4 != 0) || ((v1_7 == v10) || (v8.d() == 0)))) {
	                    v8.f();
	                }
	            }
	            if ((v4_0 != 0) || (v3_3 != null)) {
	                this.e.c(v4_0, v3_3);
	            }
	            if (!android.support.v7.widget.RecyclerView.k(this.e)) {
	                this.e.invalidate();
	            }
	            if ((v12 == 0) || ((!android.support.v7.widget.RecyclerView.d(this.e).j()) || (v3_3 != v12))) {
	                int v2_5 = 0;
	            } else {
	                v2_5 = 1;
	            }
	            if ((v11 == 0) || ((!android.support.v7.widget.RecyclerView.d(this.e).i()) || (v4_0 != v11))) {
	                android.support.v7.widget.RecyclerView v1_23 = 0;
	            } else {
	                v1_23 = 1;
	            }
	            if (((v11 != 0) || (v12 != 0)) && ((v1_23 == null) && (v2_5 == 0))) {
	                android.support.v7.widget.RecyclerView v1_24 = 0;
	            } else {
	                v1_24 = 1;
	            }
	            if ((!v8.b.a(v8.a)) && (v1_24 != null)) {
	                this.a();
	            } else {
	                android.support.v7.widget.RecyclerView.b(this.e, 0);
	            }
	        }
	        this.f = 0;
	        if (this.g) {
	            this.a();
	        }
	        return;
	    }
	
