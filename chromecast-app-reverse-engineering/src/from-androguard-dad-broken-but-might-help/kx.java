	final  a
	public mf b
	final synthetic android.support.v4.widget.DrawerLayout c
	private final java.lang.Runnable d
	
	    public kx(android.support.v4.widget.DrawerLayout p2, int p3)
	    {
	        this.c = p2;
	        this.d = new ky(this);
	        this.a = p3;
	        return;
	    }
	
	
	    public final void a()
	    {
	        this.c.removeCallbacks(this.d);
	        return;
	    }
	
	
	    public final void a(int p10)
	    {
	        int v1_3;
	        android.support.v4.widget.DrawerLayout v4 = this.c;
	        android.view.View v5 = this.b.m;
	        int v1_2 = v4.b.a;
	        float v6_1 = v4.c.a;
	        if ((v1_2 != 1) && (v6_1 != 1)) {
	            if ((v1_2 != 2) && (v6_1 != 2)) {
	                v1_3 = 0;
	            } else {
	                v1_3 = 2;
	            }
	        } else {
	            v1_3 = 1;
	        }
	        if ((v5 != null) && (p10 == 0)) {
	            boolean v0_2 = ((ku) v5.getLayoutParams());
	            if (v0_2.b != 0) {
	                if (v0_2.b == 1065353216) {
	                    boolean v0_6 = ((ku) v5.getLayoutParams());
	                    if (!v0_6.d) {
	                        v0_6.d = 1;
	                        if (v4.f != null) {
	                            v4.f.a();
	                        }
	                        v4.a(v5, 1);
	                        if (v4.hasWindowFocus()) {
	                            v4.sendAccessibilityEvent(32);
	                        }
	                        v5.requestFocus();
	                    }
	                }
	            } else {
	                boolean v0_11 = ((ku) v5.getLayoutParams());
	                if (v0_11.d) {
	                    v0_11.d = 0;
	                    if (v4.f != null) {
	                        v4.f.b();
	                    }
	                    v4.a(v5, 0);
	                    if (v4.hasWindowFocus()) {
	                        boolean v0_15 = v4.getRootView();
	                        if (v0_15) {
	                            v0_15.sendAccessibilityEvent(32);
	                        }
	                    }
	                }
	            }
	        }
	        if (v1_3 != v4.d) {
	            v4.d = v1_3;
	        }
	        return;
	    }
	
	
	    public final void a(int p3, int p4)
	    {
	        android.view.View v0_2;
	        if ((p3 & 1) != 1) {
	            v0_2 = this.c.b(5);
	        } else {
	            v0_2 = this.c.b(3);
	        }
	        if ((v0_2 != null) && (this.c.a(v0_2) == 0)) {
	            this.b.a(v0_2, p4);
	        }
	        return;
	    }
	
	
	    public final void a(android.view.View p7, float p8)
	    {
	        android.support.v4.widget.DrawerLayout v0_3;
	        String v1_0 = android.support.v4.widget.DrawerLayout.b(p7);
	        int v2_0 = p7.getWidth();
	        if (!this.c.a(p7, 3)) {
	            v0_3 = this.c.getWidth();
	            if ((p8 < 0) || ((p8 == 0) && (v1_0 > 1056964608))) {
	                v0_3 -= v2_0;
	            }
	        } else {
	            if ((p8 <= 0) && ((p8 != 0) || (v1_0 <= 1056964608))) {
	                v0_3 = (- v2_0);
	            } else {
	                v0_3 = 0;
	            }
	        }
	        String v1_2 = this.b;
	        int v2_1 = p7.getTop();
	        if (v1_2.n) {
	            v1_2.a(v0_3, v2_1, ((int) gp.a(v1_2.i, v1_2.c)), ((int) gp.b(v1_2.i, v1_2.c)));
	            this.c.invalidate();
	            return;
	        } else {
	            throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
	        }
	    }
	
	
	    public final void a(android.view.View p4, int p5)
	    {
	        android.support.v4.widget.DrawerLayout v0_2;
	        android.support.v4.widget.DrawerLayout v0_0 = p4.getWidth();
	        if (!this.c.a(p4, 3)) {
	            v0_2 = (((float) (this.c.getWidth() - p5)) / ((float) v0_0));
	        } else {
	            v0_2 = (((float) (v0_0 + p5)) / ((float) v0_0));
	        }
	        android.support.v4.widget.DrawerLayout v0_5;
	        this.c.a(p4, v0_2);
	        if (v0_2 != 0) {
	            v0_5 = 0;
	        } else {
	            v0_5 = 4;
	        }
	        p4.setVisibility(v0_5);
	        this.c.invalidate();
	        return;
	    }
	
	
	    public final boolean a(android.view.View p3)
	    {
	        if ((!android.support.v4.widget.DrawerLayout.d(p3)) || ((!this.c.a(p3, this.a)) || (this.c.a(p3) != 0))) {
	            int v0_5 = 0;
	        } else {
	            v0_5 = 1;
	        }
	        return v0_5;
	    }
	
	
	    public final int b(android.view.View p3, int p4)
	    {
	        int v0_5;
	        if (!this.c.a(p3, 3)) {
	            int v0_3 = this.c.getWidth();
	            v0_5 = Math.max((v0_3 - p3.getWidth()), Math.min(p4, v0_3));
	        } else {
	            v0_5 = Math.max((- p3.getWidth()), Math.min(p4, 0));
	        }
	        return v0_5;
	    }
	
	
	    void b()
	    {
	        android.view.View v0_0 = 3;
	        if (this.a == 3) {
	            v0_0 = 5;
	        }
	        android.view.View v0_1 = this.c.b(v0_0);
	        if (v0_1 != null) {
	            this.c.f(v0_1);
	        }
	        return;
	    }
	
	
	    public final void b(android.view.View p3)
	    {
	        ((ku) p3.getLayoutParams()).c = 0;
	        this.b();
	        return;
	    }
	
	
	    public final int c(android.view.View p2)
	    {
	        int v0_1;
	        if (!android.support.v4.widget.DrawerLayout.d(p2)) {
	            v0_1 = 0;
	        } else {
	            v0_1 = p2.getWidth();
	        }
	        return v0_1;
	    }
	
	
	    public final void c()
	    {
	        this.c.postDelayed(this.d, 160);
	        return;
	    }
	
	
	    public final int d(android.view.View p2)
	    {
	        return p2.getTop();
	    }
	
