	private synthetic android.support.v7.widget.RecyclerView a
	
	    public yy(android.support.v7.widget.RecyclerView p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    private void c(wj p2)
	    {
	        switch (p2.a) {
	            case 0:
	                android.support.v7.widget.RecyclerView.d(this.a).a();
	                break;
	            case 1:
	                android.support.v7.widget.RecyclerView.d(this.a).c();
	                break;
	            case 2:
	                android.support.v7.widget.RecyclerView.d(this.a).d();
	                break;
	            case 3:
	                android.support.v7.widget.RecyclerView.d(this.a).e();
	                break;
	        }
	        return;
	    }
	
	
	    public final zr a(int p7)
	    {
	        int v0 = 0;
	        android.view.View v3_0 = this.a;
	        int v4 = v3_0.c.b();
	        boolean v2_0 = 0;
	        while (v2_0 < v4) {
	            int v1_2 = android.support.v7.widget.RecyclerView.b(v3_0.c.c(v2_0));
	            if ((v1_2 == 0) || ((v1_2.n()) || (v1_2.b != p7))) {
	                v2_0++;
	            }
	            if ((v1_2 != 0) && (!this.a.c.a(v1_2.a))) {
	                v0 = v1_2;
	            }
	            return v0;
	        }
	        v1_2 = 0;
	    }
	
	
	    public final void a(int p3, int p4)
	    {
	        this.a.a(p3, p4, 1);
	        this.a.q = 1;
	        zp v0_3 = this.a.n;
	        v0_3.h = (v0_3.h + p4);
	        return;
	    }
	
	
	    public final void a(wj p1)
	    {
	        this.c(p1);
	        return;
	    }
	
	
	    public final void b(int p3, int p4)
	    {
	        this.a.a(p3, p4, 0);
	        this.a.q = 1;
	        return;
	    }
	
	
	    public final void b(wj p1)
	    {
	        this.c(p1);
	        return;
	    }
	
	
	    public final void c(int p10, int p11)
	    {
	        zl v2_0 = this.a;
	        int v3_0 = v2_0.c.b();
	        int v4_0 = (p10 + p11);
	        int v1_0 = 0;
	        while (v1_0 < v3_0) {
	            zi v0_11 = v2_0.c.c(v1_0);
	            zr v5 = android.support.v7.widget.RecyclerView.b(v0_11);
	            if ((v5 != null) && ((!v5.b()) && ((v5.b >= p10) && (v5.b < v4_0)))) {
	                v5.a(2);
	                if (v2_0.g()) {
	                    v5.a(64);
	                }
	                ((zi) v0_11.getLayoutParams()).e = 1;
	            }
	            v1_0++;
	        }
	        zl v2_1 = v2_0.a;
	        int v3_1 = (p10 + p11);
	        int v1_1 = (v2_1.c.size() - 1);
	        while (v1_1 >= 0) {
	            zi v0_8 = ((zr) v2_1.c.get(v1_1));
	            if (v0_8 != null) {
	                int v4_1 = v0_8.d();
	                if ((v4_1 >= p10) && (v4_1 < v3_1)) {
	                    v0_8.a(2);
	                    v2_1.b(v1_1);
	                }
	            }
	            v1_1--;
	        }
	        this.a.r = 1;
	        return;
	    }
	
	
	    public final void d(int p8, int p9)
	    {
	        android.support.v7.widget.RecyclerView v2 = this.a;
	        zl v3_0 = v2.c.b();
	        int v1_1 = 0;
	        while (v1_1 < v3_0) {
	            zp v4_3 = android.support.v7.widget.RecyclerView.b(v2.c.c(v1_1));
	            if ((v4_3 != null) && ((!v4_3.b()) && (v4_3.b >= p8))) {
	                v4_3.a(p9, 0);
	                v2.n.i = 1;
	            }
	            v1_1++;
	        }
	        zl v3_1 = v2.a;
	        zp v4_0 = v3_1.c.size();
	        int v1_3 = 0;
	        while (v1_3 < v4_0) {
	            int v0_4 = ((zr) v3_1.c.get(v1_3));
	            if ((v0_4 != 0) && (v0_4.d() >= p8)) {
	                v0_4.a(p9, 1);
	            }
	            v1_3++;
	        }
	        v2.requestLayout();
	        this.a.q = 1;
	        return;
	    }
	
	
	    public final void e(int p12, int p13)
	    {
	        int v0_1;
	        int v4_0;
	        int v3_0;
	        int v1 = -1;
	        android.support.v7.widget.RecyclerView v7 = this.a;
	        zl v8_0 = v7.c.b();
	        if (p12 >= p13) {
	            v0_1 = 1;
	            v3_0 = p12;
	            v4_0 = p13;
	        } else {
	            v0_1 = -1;
	            v3_0 = p13;
	            v4_0 = p12;
	        }
	        int v5_0 = 0;
	        while (v5_0 < v8_0) {
	            zp v9_3 = android.support.v7.widget.RecyclerView.b(v7.c.c(v5_0));
	            if ((v9_3 != null) && ((v9_3.b >= v4_0) && (v9_3.b <= v3_0))) {
	                if (v9_3.b != p12) {
	                    v9_3.a(v0_1, 0);
	                } else {
	                    v9_3.a((p13 - p12), 0);
	                }
	                v7.n.i = 1;
	            }
	            v5_0++;
	        }
	        int v3_1;
	        int v4_1;
	        zl v8_1 = v7.a;
	        if (p12 >= p13) {
	            v1 = 1;
	            v3_1 = p12;
	            v4_1 = p13;
	        } else {
	            v3_1 = p13;
	            v4_1 = p12;
	        }
	        zp v9_0 = v8_1.c.size();
	        int v5_1 = 0;
	        while (v5_1 < v9_0) {
	            int v0_6 = ((zr) v8_1.c.get(v5_1));
	            if ((v0_6 != 0) && ((v0_6.b >= v4_1) && (v0_6.b <= v3_1))) {
	                if (v0_6.b != p12) {
	                    v0_6.a(v1, 0);
	                } else {
	                    v0_6.a((p13 - p12), 0);
	                }
	            }
	            v5_1++;
	        }
	        v7.requestLayout();
	        this.a.q = 1;
	        return;
	    }
	
