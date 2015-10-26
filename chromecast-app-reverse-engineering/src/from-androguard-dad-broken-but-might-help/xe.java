	 java.util.ArrayList a
	 java.util.ArrayList b
	 java.util.ArrayList c
	 java.util.ArrayList d
	 java.util.ArrayList e
	 java.util.ArrayList f
	 java.util.ArrayList g
	private java.util.ArrayList n
	private java.util.ArrayList o
	private java.util.ArrayList p
	private java.util.ArrayList q
	
	    public xe()
	    {
	        this.n = new java.util.ArrayList();
	        this.o = new java.util.ArrayList();
	        this.p = new java.util.ArrayList();
	        this.q = new java.util.ArrayList();
	        this.a = new java.util.ArrayList();
	        this.b = new java.util.ArrayList();
	        this.c = new java.util.ArrayList();
	        this.d = new java.util.ArrayList();
	        this.e = new java.util.ArrayList();
	        this.f = new java.util.ArrayList();
	        this.g = new java.util.ArrayList();
	        return;
	    }
	
	
	    private static void a(java.util.List p2)
	    {
	        int v1 = (p2.size() - 1);
	        while (v1 >= 0) {
	            gt.o(((zr) p2.get(v1)).a).a();
	            v1--;
	        }
	        return;
	    }
	
	
	    private void a(java.util.List p4, zr p5)
	    {
	        int v1 = (p4.size() - 1);
	        while (v1 >= 0) {
	            int v0_3 = ((xn) p4.get(v1));
	            if ((this.a(v0_3, p5)) && ((v0_3.a == null) && (v0_3.b == null))) {
	                p4.remove(v0_3);
	            }
	            v1--;
	        }
	        return;
	    }
	
	
	    private void a(xn p2)
	    {
	        if (p2.a != null) {
	            this.a(p2, p2.a);
	        }
	        if (p2.b != null) {
	            this.a(p2, p2.b);
	        }
	        return;
	    }
	
	
	    private boolean a(xn p6, zr p7)
	    {
	        int v0 = 0;
	        if (p6.b != p7) {
	            if (p6.a == p7) {
	                p6.a = 0;
	                v0 = 1;
	                gt.c(p7.a, 1065353216);
	                gt.a(p7.a, 0);
	                gt.b(p7.a, 0);
	                this.a(p7, v0);
	                v0 = 1;
	            }
	        } else {
	            p6.b = 0;
	        }
	        return v0;
	    }
	
	
	    public final void a()
	    {
	        int v1_2;
	        if (this.n.isEmpty()) {
	            v1_2 = 0;
	        } else {
	            v1_2 = 1;
	        }
	        int v3_2;
	        if (this.p.isEmpty()) {
	            v3_2 = 0;
	        } else {
	            v3_2 = 1;
	        }
	        int v4_2;
	        if (this.q.isEmpty()) {
	            v4_2 = 0;
	        } else {
	            v4_2 = 1;
	        }
	        java.util.ArrayList v5_2;
	        if (this.o.isEmpty()) {
	            v5_2 = 0;
	        } else {
	            v5_2 = 1;
	        }
	        if ((v1_2 != 0) || ((v3_2 != 0) || ((v5_2 != null) || (v4_2 != 0)))) {
	            long v8_0 = this.n.iterator();
	            while (v8_0.hasNext()) {
	                android.view.View v0_27 = ((zr) v8_0.next());
	                ih v9_1 = gt.o(v0_27.a);
	                this.f.add(v0_27);
	                v9_1.a(this.j).a(0).a(new xi(this, v0_27, v9_1)).b();
	            }
	            this.n.clear();
	            if (v3_2 != 0) {
	                android.view.View v0_5 = new java.util.ArrayList();
	                v0_5.addAll(this.p);
	                this.b.add(v0_5);
	                this.p.clear();
	                long v8_5 = new xf(this, v0_5);
	                if (v1_2 == 0) {
	                    v8_5.run();
	                } else {
	                    gt.a(((xo) v0_5.get(0)).a.a, v8_5, this.j);
	                }
	            }
	            if (v4_2 != 0) {
	                android.view.View v0_11 = new java.util.ArrayList();
	                v0_11.addAll(this.q);
	                this.c.add(v0_11);
	                this.q.clear();
	                long v8_10 = new xg(this, v0_11);
	                if (v1_2 == 0) {
	                    v8_10.run();
	                } else {
	                    gt.a(((xn) v0_11.get(0)).a.a, v8_10, this.j);
	                }
	            }
	            if (v5_2 != null) {
	                java.util.ArrayList v5_4 = new java.util.ArrayList();
	                v5_4.addAll(this.o);
	                this.a.add(v5_4);
	                this.o.clear();
	                xh v12_1 = new xh(this, v5_4);
	                if ((v1_2 == 0) && ((v3_2 == 0) && (v4_2 == 0))) {
	                    v12_1.run();
	                } else {
	                    long v10_2;
	                    if (v1_2 == 0) {
	                        v10_2 = 0;
	                    } else {
	                        v10_2 = this.j;
	                    }
	                    long v8_11;
	                    if (v3_2 == 0) {
	                        v8_11 = 0;
	                    } else {
	                        v8_11 = this.k;
	                    }
	                    android.view.View v0_21;
	                    if (v4_2 == 0) {
	                        v0_21 = 0;
	                    } else {
	                        v0_21 = this.l;
	                    }
	                    gt.a(((zr) v5_4.get(0)).a, v12_1, (v10_2 + Math.max(v8_11, v0_21)));
	                }
	            }
	        }
	        return;
	    }
	
	
	    public final boolean a(zr p2)
	    {
	        this.c(p2);
	        this.n.add(p2);
	        return 1;
	    }
	
	
	    public final boolean a(zr p8, int p9, int p10, int p11, int p12)
	    {
	        int v0_3;
	        int v0_0 = p8.a;
	        int v2_2 = ((int) (((float) p9) + gt.k(p8.a)));
	        int v3_2 = ((int) (((float) p10) + gt.l(p8.a)));
	        this.c(p8);
	        zr v1_4 = (p11 - v2_2);
	        int v4_0 = (p12 - v3_2);
	        if ((v1_4 != null) || (v4_0 != 0)) {
	            if (v1_4 != null) {
	                gt.a(v0_0, ((float) (- v1_4)));
	            }
	            if (v4_0 != 0) {
	                gt.b(v0_0, ((float) (- v4_0)));
	            }
	            this.p.add(new xo(p8, v2_2, v3_2, p11, p12));
	            v0_3 = 1;
	        } else {
	            this.e(p8);
	            v0_3 = 0;
	        }
	        return v0_3;
	    }
	
	
	    public final boolean a(zr p9, zr p10, int p11, int p12, int p13, int p14)
	    {
	        android.view.View v0_1 = gt.k(p9.a);
	        int v1_1 = gt.l(p9.a);
	        zr v2_1 = gt.f(p9.a);
	        this.c(p9);
	        int v3_3 = ((int) (((float) (p13 - p11)) - v0_1));
	        int v4_3 = ((int) (((float) (p14 - p12)) - v1_1));
	        gt.a(p9.a, v0_1);
	        gt.b(p9.a, v1_1);
	        gt.c(p9.a, v2_1);
	        if ((p10 != null) && (p10.a != null)) {
	            this.c(p10);
	            gt.a(p10.a, ((float) (- v3_3)));
	            gt.b(p10.a, ((float) (- v4_3)));
	            gt.c(p10.a, 0);
	        }
	        this.q.add(new xn(p9, p10, p11, p12, p13, p14));
	        return 1;
	    }
	
	
	    public final boolean b()
	    {
	        if ((this.o.isEmpty()) && ((this.q.isEmpty()) && ((this.p.isEmpty()) && ((this.n.isEmpty()) && ((this.e.isEmpty()) && ((this.f.isEmpty()) && ((this.d.isEmpty()) && ((this.g.isEmpty()) && ((this.b.isEmpty()) && ((this.a.isEmpty()) && (this.c.isEmpty()))))))))))) {
	            int v0_22 = 0;
	        } else {
	            v0_22 = 1;
	        }
	        return v0_22;
	    }
	
	
	    public final boolean b(zr p3)
	    {
	        this.c(p3);
	        gt.c(p3.a, 0);
	        this.o.add(p3);
	        return 1;
	    }
	
	
	    void c()
	    {
	        if (!this.b()) {
	            this.e();
	        }
	        return;
	    }
	
	
	    public final void c(zr p8)
	    {
	        android.view.View v4 = p8.a;
	        gt.o(v4).a();
	        int v1_0 = (this.p.size() - 1);
	        while (v1_0 >= 0) {
	            if (((xo) this.p.get(v1_0)).a == p8) {
	                gt.b(v4, 0);
	                gt.a(v4, 0);
	                this.e(p8);
	                this.p.remove(v1_0);
	            }
	            v1_0--;
	        }
	        this.a(this.q, p8);
	        if (this.n.remove(p8)) {
	            gt.c(v4, 1065353216);
	            this.d(p8);
	        }
	        if (this.o.remove(p8)) {
	            gt.c(v4, 1065353216);
	            this.f(p8);
	        }
	        int v1_1 = (this.c.size() - 1);
	        while (v1_1 >= 0) {
	            java.util.ArrayList v0_36 = ((java.util.ArrayList) this.c.get(v1_1));
	            this.a(v0_36, p8);
	            if (v0_36.isEmpty()) {
	                this.c.remove(v1_1);
	            }
	            v1_1--;
	        }
	        int v3 = (this.b.size() - 1);
	        while (v3 >= 0) {
	            java.util.ArrayList v0_30 = ((java.util.ArrayList) this.b.get(v3));
	            int v2_1 = (v0_30.size() - 1);
	            while (v2_1 >= 0) {
	                if (((xo) v0_30.get(v2_1)).a != p8) {
	                    v2_1--;
	                } else {
	                    gt.b(v4, 0);
	                    gt.a(v4, 0);
	                    this.e(p8);
	                    v0_30.remove(v2_1);
	                    if (!v0_30.isEmpty()) {
	                        break;
	                    }
	                    this.b.remove(v3);
	                    break;
	                }
	            }
	            v3--;
	        }
	        int v1_2 = (this.a.size() - 1);
	        while (v1_2 >= 0) {
	            java.util.ArrayList v0_24 = ((java.util.ArrayList) this.a.get(v1_2));
	            if (v0_24.remove(p8)) {
	                gt.c(v4, 1065353216);
	                this.f(p8);
	                if (v0_24.isEmpty()) {
	                    this.a.remove(v1_2);
	                }
	            }
	            v1_2--;
	        }
	        this.f.remove(p8);
	        this.d.remove(p8);
	        this.g.remove(p8);
	        this.e.remove(p8);
	        this.c();
	        return;
	    }
	
	
	    public final void d()
	    {
	        int v1_0 = (this.p.size() - 1);
	        while (v1_0 >= 0) {
	            int v0_55 = ((xo) this.p.get(v1_0));
	            int v2_5 = v0_55.a.a;
	            gt.b(v2_5, 0);
	            gt.a(v2_5, 0);
	            this.e(v0_55.a);
	            this.p.remove(v1_0);
	            v1_0--;
	        }
	        int v1_1 = (this.n.size() - 1);
	        while (v1_1 >= 0) {
	            this.d(((zr) this.n.get(v1_1)));
	            this.n.remove(v1_1);
	            v1_1--;
	        }
	        int v1_2 = (this.o.size() - 1);
	        while (v1_2 >= 0) {
	            int v0_45 = ((zr) this.o.get(v1_2));
	            gt.c(v0_45.a, 1065353216);
	            this.f(v0_45);
	            this.o.remove(v1_2);
	            v1_2--;
	        }
	        int v1_3 = (this.q.size() - 1);
	        while (v1_3 >= 0) {
	            this.a(((xn) this.q.get(v1_3)));
	            v1_3--;
	        }
	        this.q.clear();
	        if (this.b()) {
	            int v3_0 = (this.b.size() - 1);
	            while (v3_0 >= 0) {
	                int v0_37 = ((java.util.ArrayList) this.b.get(v3_0));
	                int v2_2 = (v0_37.size() - 1);
	                while (v2_2 >= 0) {
	                    int v1_21 = ((xo) v0_37.get(v2_2));
	                    android.view.View v4_2 = v1_21.a.a;
	                    gt.b(v4_2, 0);
	                    gt.a(v4_2, 0);
	                    this.e(v1_21.a);
	                    v0_37.remove(v2_2);
	                    if (v0_37.isEmpty()) {
	                        this.b.remove(v0_37);
	                    }
	                    v2_2--;
	                }
	                v3_0--;
	            }
	            int v3_1 = (this.a.size() - 1);
	            while (v3_1 >= 0) {
	                int v0_33 = ((java.util.ArrayList) this.a.get(v3_1));
	                int v2_1 = (v0_33.size() - 1);
	                while (v2_1 >= 0) {
	                    int v1_14 = ((zr) v0_33.get(v2_1));
	                    gt.c(v1_14.a, 1065353216);
	                    this.f(v1_14);
	                    v0_33.remove(v2_1);
	                    if (v0_33.isEmpty()) {
	                        this.a.remove(v0_33);
	                    }
	                    v2_1--;
	                }
	                v3_1--;
	            }
	            int v3_2 = (this.c.size() - 1);
	            while (v3_2 >= 0) {
	                int v0_29 = ((java.util.ArrayList) this.c.get(v3_2));
	                int v2_0 = (v0_29.size() - 1);
	                while (v2_0 >= 0) {
	                    this.a(((xn) v0_29.get(v2_0)));
	                    if (v0_29.isEmpty()) {
	                        this.c.remove(v0_29);
	                    }
	                    v2_0--;
	                }
	                v3_2--;
	            }
	            xe.a(this.f);
	            xe.a(this.e);
	            xe.a(this.d);
	            xe.a(this.g);
	            this.e();
	        }
	        return;
	    }
	
