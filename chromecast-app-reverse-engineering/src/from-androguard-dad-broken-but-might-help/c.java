	private static  n
	 b a
	  b
	  c
	  d
	  e
	 java.lang.String f
	  g
	  h
	 java.lang.CharSequence i
	  j
	 java.lang.CharSequence k
	 java.util.ArrayList l
	 java.util.ArrayList m
	private t o
	private b p
	private  q
	private  r
	
	    static c()
	    {
	        int v0_1;
	        if (android.os.Build$VERSION.SDK_INT < 21) {
	            v0_1 = 0;
	        } else {
	            v0_1 = 1;
	        }
	        c.n = v0_1;
	        return;
	    }
	
	
	    public c(t p2)
	    {
	        this.q = 1;
	        this.g = -1;
	        this.o = p2;
	        return;
	    }
	
	
	    private int a(boolean p3)
	    {
	        if (!this.r) {
	            this.r = 1;
	            if (!this.e) {
	                this.g = -1;
	            } else {
	                this.g = this.o.a(this);
	            }
	            this.o.a(this, p3);
	            return this.g;
	        } else {
	            throw new IllegalStateException("commit already called");
	        }
	    }
	
	
	    static synthetic ed a(c p4, f p5, boolean p6, j p7)
	    {
	        ed v0_1 = new ed();
	        java.util.ArrayList v1_0 = p7.N;
	        if ((v1_0 != null) && (p4.l != null)) {
	            a.a(v0_1, v1_0);
	            if (!p6) {
	                ei.a(v0_1, p4.m);
	            } else {
	                v0_1 = c.a(p4.l, p4.m, v0_1);
	            }
	        }
	        if (!p6) {
	            c.b(p5, v0_1, 1);
	        } else {
	            p4.a(p5, v0_1, 1);
	        }
	        return v0_1;
	    }
	
	
	    private ed a(f p5, j p6, boolean p7)
	    {
	        ed v0_1 = new ed();
	        if (this.l != null) {
	            a.a(v0_1, p6.N);
	            if (!p7) {
	                v0_1 = c.a(this.l, this.m, v0_1);
	            } else {
	                ei.a(v0_1, this.m);
	            }
	        }
	        if (!p7) {
	            c.b(p5, v0_1, 0);
	        } else {
	            this.a(p5, v0_1, 0);
	        }
	        return v0_1;
	    }
	
	
	    private static ed a(java.util.ArrayList p5, java.util.ArrayList p6, ed p7)
	    {
	        if (!p7.isEmpty()) {
	            ed v1_1 = new ed();
	            int v3 = p5.size();
	            int v2 = 0;
	            while (v2 < v3) {
	                int v0_4 = ((android.view.View) p7.get(p5.get(v2)));
	                if (v0_4 != 0) {
	                    v1_1.put(p6.get(v2), v0_4);
	                }
	                v2++;
	            }
	            p7 = v1_1;
	        }
	        return p7;
	    }
	
	
	    private f a(android.util.SparseArray p11, android.util.SparseArray p12, boolean p13)
	    {
	        int v7 = 0;
	        int v2_1 = new f(this);
	        v2_1.d = new android.view.View(this.o.h);
	        int v6 = 0;
	        int v8 = 0;
	        while (v6 < p11.size()) {
	            int v1_4;
	            if (!this.a(p11.keyAt(v6), v2_1, p13, p11, p12)) {
	                v1_4 = v8;
	            } else {
	                v1_4 = 1;
	            }
	            v6++;
	            v8 = v1_4;
	        }
	        while (v7 < p12.size()) {
	            int v1_2 = p12.keyAt(v7);
	            if ((p11.get(v1_2) == null) && (this.a(v1_2, v2_1, p13, p11, p12))) {
	                v8 = 1;
	            }
	            v7++;
	        }
	        if (v8 == 0) {
	            v2_1 = 0;
	        }
	        return v2_1;
	    }
	
	
	    private static Object a(Object p1, j p2, java.util.ArrayList p3, ed p4, android.view.View p5)
	    {
	        if ((p1 != 0) && (p1 != 0)) {
	            a.a(p3, p2.N);
	            if (p4 != null) {
	                p3.removeAll(p4.values());
	            }
	            if (!p3.isEmpty()) {
	                p3.add(p5);
	                a.b(((android.transition.Transition) p1), p3);
	            } else {
	                p1 = 0;
	            }
	        }
	        return p1;
	    }
	
	
	    private void a(int p4, j p5, String p6, int p7)
	    {
	        p5.x = this.o;
	        if (p6 != null) {
	            if ((p5.D == null) || (p6.equals(p5.D))) {
	                p5.D = p6;
	            } else {
	                throw new IllegalStateException(new StringBuilder("Can\'t change tag of fragment ").append(p5).append(": was ").append(p5.D).append(" now ").append(p6).toString());
	            }
	        }
	        if (p4 != 0) {
	            if ((p5.B == 0) || (p5.B == p4)) {
	                p5.B = p4;
	                p5.C = p4;
	            } else {
	                throw new IllegalStateException(new StringBuilder("Can\'t change container ID of fragment ").append(p5).append(": was ").append(p5.B).append(" now ").append(p4).toString());
	            }
	        }
	        IllegalStateException v0_7 = new b();
	        v0_7.c = p7;
	        v0_7.d = p5;
	        this.a(v0_7);
	        return;
	    }
	
	
	    private static void a(android.util.SparseArray p2, j p3)
	    {
	        if (p3 != null) {
	            int v0 = p3.C;
	            if ((v0 != 0) && ((!p3.E) && ((p3.f()) && ((p3.N != null) && (p2.get(v0) == null))))) {
	                p2.put(v0, p3);
	            }
	        }
	        return;
	    }
	
	
	    static synthetic void a(c p2, ed p3, f p4)
	    {
	        if ((p2.m != null) && (!p3.isEmpty())) {
	            android.view.View v0_5 = ((android.view.View) p3.get(p2.m.get(0)));
	            if (v0_5 != null) {
	                p4.c.a = v0_5;
	            }
	        }
	        return;
	    }
	
	
	    static synthetic void a(c p0, f p1, int p2, Object p3)
	    {
	        p0.a(p1, p2, p3);
	        return;
	    }
	
	
	    static synthetic void a(c p1, f p2, j p3, j p4, boolean p5, ed p6)
	    {
	        // Both branches of the condition point to the same code.
	        // if (!p5) {
	            return;
	        // }
	    }
	
	
	    private static void a(ed p2, String p3, String p4)
	    {
	        if ((p3 != null) && ((p4 != null) && (!p3.equals(p4)))) {
	            int v0_1 = 0;
	            while (v0_1 < p2.size()) {
	                if (!p3.equals(p2.c(v0_1))) {
	                    v0_1++;
	                } else {
	                    p2.a(v0_1, p4);
	                }
	            }
	            p2.put(p3, p4);
	        }
	        return;
	    }
	
	
	    private void a(f p6, int p7, Object p8)
	    {
	        if (this.o.c != null) {
	            int v1 = 0;
	            while (v1 < this.o.c.size()) {
	                android.view.View v0_8 = ((j) this.o.c.get(v1));
	                if ((v0_8.N != null) && ((v0_8.M != null) && (v0_8.C == p7))) {
	                    if (!v0_8.E) {
	                        a.a(p8, v0_8.N, 0);
	                        p6.b.remove(v0_8.N);
	                    } else {
	                        if (!p6.b.contains(v0_8.N)) {
	                            a.a(p8, v0_8.N, 1);
	                            p6.b.add(v0_8.N);
	                        }
	                    }
	                }
	                v1++;
	            }
	        }
	        return;
	    }
	
	
	    private void a(f p6, ed p7, boolean p8)
	    {
	        int v2;
	        if (this.m != null) {
	            v2 = this.m.size();
	        } else {
	            v2 = 0;
	        }
	        int v3 = 0;
	        while (v3 < v2) {
	            int v0_3 = ((String) this.l.get(v3));
	            String v1_7 = ((android.view.View) p7.get(((String) this.m.get(v3))));
	            if (v1_7 != null) {
	                String v1_8 = v1_7.getTransitionName();
	                if (!p8) {
	                    c.a(p6.a, v1_8, v0_3);
	                } else {
	                    c.a(p6.a, v0_3, v1_8);
	                }
	            }
	            v3++;
	        }
	        return;
	    }
	
	
	    private boolean a(int p30, f p31, boolean p32, android.util.SparseArray p33, android.util.SparseArray p34)
	    {
	        int v3_22;
	        android.view.ViewGroup v5_1 = ((android.view.ViewGroup) this.o.i.a(p30));
	        if (v5_1 != null) {
	            android.view.ViewGroup v18_0;
	            android.view.ViewGroup v10_1 = ((j) p34.get(p30));
	            f v11_1 = ((j) p33.get(p30));
	            if (v10_1 != null) {
	                int v3_2;
	                if (!p32) {
	                    v3_2 = 0;
	                } else {
	                    if (v10_1.V != j.e) {
	                        v3_2 = v10_1.V;
	                    } else {
	                        v3_2 = 0;
	                    }
	                }
	                v18_0 = a.a(v3_2);
	            } else {
	                v18_0 = 0;
	            }
	            if ((v10_1 != null) && (v11_1 != null)) {
	                int v3_4;
	                if (!p32) {
	                    v3_4 = 0;
	                } else {
	                    if (v11_1.W != j.e) {
	                        v3_4 = v11_1.W;
	                    } else {
	                        v3_4 = 0;
	                    }
	                }
	                Object v6 = a.a(v3_4);
	            } else {
	                v6 = 0;
	            }
	            android.transition.TransitionSet v4_3;
	            if (v11_1 != null) {
	                int v3_6;
	                if (!p32) {
	                    v3_6 = 0;
	                } else {
	                    if (v11_1.U != j.e) {
	                        v3_6 = v11_1.U;
	                    } else {
	                        v3_6 = 0;
	                    }
	                }
	                v4_3 = a.a(v3_6);
	            } else {
	                v4_3 = 0;
	            }
	            if ((v18_0 != null) || ((v6 != null) || (v4_3 != null))) {
	                int v3_10 = 0;
	                java.util.ArrayList v7_1 = new java.util.ArrayList();
	                if (v6 != null) {
	                    v3_10 = this.a(p31, v11_1, p32);
	                    v7_1.add(p31.d);
	                    v7_1.addAll(v3_10.values());
	                    // Both branches of the condition point to the same code.
	                    // if (!p32) {
	                    // }
	                }
	                java.util.ArrayList v23_1 = new java.util.ArrayList();
	                java.util.ArrayList v21_0 = c.a(v4_3, v11_1, v23_1, v3_10, p31.d);
	                if ((this.m != null) && (v3_10 != 0)) {
	                    int v3_12 = ((android.view.View) v3_10.get(this.m.get(0)));
	                    if (v3_12 != 0) {
	                        if (v21_0 != null) {
	                            a.a(v21_0, v3_12);
	                        }
	                        if (v6 != null) {
	                            a.a(v6, v3_12);
	                        }
	                    }
	                }
	                aj v17_0 = new a;
	                v17_0(this, v10_1);
	                if (v6 != null) {
	                    v5_1.getViewTreeObserver().addOnPreDrawListener(new d(this, v5_1, v6, v7_1, p31, p32, v10_1, v11_1));
	                }
	                java.util.ArrayList v15_1 = new java.util.ArrayList();
	                ed v16_1 = new ed();
	                int v3_16 = ((android.transition.Transition) v18_0);
	                android.transition.TransitionSet v4_9 = ((android.transition.Transition) v21_0);
	                int v8_6 = ((android.transition.Transition) v6);
	                // Both branches of the condition point to the same code.
	                // if ((v3_16 != 0) && (v4_9 == null)) {
	                    c v9_2 = new android.transition.TransitionSet();
	                    if (v3_16 != 0) {
	                        v9_2.addTransition(v3_16);
	                    }
	                    if (v4_9 != null) {
	                        v9_2.addTransition(v4_9);
	                    }
	                    if (v8_6 != 0) {
	                        v9_2.addTransition(v8_6);
	                    }
	                    android.transition.TransitionSet v4_10 = v9_2;
	                    if (v4_10 != null) {
	                        a.a(v18_0, v6, v5_1, v17_0, p31.d, p31.c, p31.a, v15_1, v16_1, v7_1);
	                        v5_1.getViewTreeObserver().addOnPreDrawListener(new e(this, v5_1, p31, p30, v4_10));
	                        a.a(v4_10, p31.d, 1);
	                        this.a(p31, p30, v4_10);
	                        android.transition.TransitionManager.beginDelayedTransition(v5_1, ((android.transition.Transition) v4_10));
	                        android.transition.Transition v28_1 = ((android.transition.Transition) v4_10);
	                        if (v28_1 != null) {
	                            v5_1.getViewTreeObserver().addOnPreDrawListener(new aj(v5_1, ((android.transition.Transition) v18_0), p31.d, v15_1, ((android.transition.Transition) v21_0), v23_1, ((android.transition.Transition) v6), v7_1, v16_1, p31.b, v28_1));
	                        }
	                    }
	                    if (v4_10 == null) {
	                        v3_22 = 0;
	                    } else {
	                        v3_22 = 1;
	                    }
	                // }
	            } else {
	                v3_22 = 0;
	            }
	        } else {
	            v3_22 = 0;
	        }
	        return v3_22;
	    }
	
	
	    private void b(android.util.SparseArray p7, android.util.SparseArray p8)
	    {
	        if (this.o.i.a()) {
	            b v3 = this.a;
	            while (v3 != null) {
	                switch (v3.c) {
	                    case 1:
	                        c.b(p8, v3.d);
	                        break;
	                    case 2:
	                        int v2;
	                        int v1_0 = v3.d;
	                        if (this.o.c == null) {
	                            v2 = v1_0;
	                        } else {
	                            v2 = v1_0;
	                            int v1_1 = 0;
	                            while (v1_1 < this.o.c.size()) {
	                                int v0_19 = ((j) this.o.c.get(v1_1));
	                                if ((v2 == 0) || (v0_19.C == v2.C)) {
	                                    if (v0_19 != v2) {
	                                        c.a(p7, v0_19);
	                                    } else {
	                                        v2 = 0;
	                                    }
	                                }
	                                v1_1++;
	                            }
	                        }
	                        c.b(p8, v2);
	                        break;
	                    case 3:
	                        c.a(p7, v3.d);
	                        break;
	                    case 4:
	                        c.a(p7, v3.d);
	                        break;
	                    case 5:
	                        c.b(p8, v3.d);
	                        break;
	                    case 6:
	                        c.a(p7, v3.d);
	                        break;
	                    case 7:
	                        c.b(p8, v3.d);
	                        break;
	                }
	                v3 = v3.a;
	            }
	        }
	        return;
	    }
	
	
	    private static void b(android.util.SparseArray p1, j p2)
	    {
	        if (p2 != null) {
	            int v0 = p2.C;
	            if (v0 != 0) {
	                p1.put(v0, p2);
	            }
	        }
	        return;
	    }
	
	
	    private static void b(f p5, ed p6, boolean p7)
	    {
	        int v3 = p6.size();
	        int v2 = 0;
	        while (v2 < v3) {
	            int v0_2 = ((String) p6.b(v2));
	            String v1_2 = ((android.view.View) p6.c(v2)).getTransitionName();
	            if (!p7) {
	                c.a(p5.a, v1_2, v0_2);
	            } else {
	                c.a(p5.a, v0_2, v1_2);
	            }
	            v2++;
	        }
	        return;
	    }
	
	
	    public final af a()
	    {
	        if (!this.e) {
	            this.q = 0;
	            return this;
	        } else {
	            throw new IllegalStateException("This transaction is already being added to the back stack");
	        }
	    }
	
	
	    public final af a(int p2)
	    {
	        this.c = 4097;
	        return this;
	    }
	
	
	    public final af a(int p2, j p3)
	    {
	        return this.b(p2, p3, 0);
	    }
	
	
	    public final af a(int p2, j p3, String p4)
	    {
	        this.a(p2, p3, p4, 1);
	        return this;
	    }
	
	
	    public final af a(j p3)
	    {
	        b v0_1 = new b();
	        v0_1.c = 3;
	        v0_1.d = p3;
	        this.a(v0_1);
	        return this;
	    }
	
	
	    public final af a(j p3, String p4)
	    {
	        this.a(0, p3, p4, 1);
	        return this;
	    }
	
	
	    public final af a(String p3)
	    {
	        if (this.q) {
	            this.e = 1;
	            this.f = p3;
	            return this;
	        } else {
	            throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
	        }
	    }
	
	
	    public final f a(boolean p12, f p13, android.util.SparseArray p14, android.util.SparseArray p15)
	    {
	        if (c.n) {
	            if (p13 != 0) {
	                if (!p12) {
	                    int v5_0 = this.m;
	                    if (v5_0 != 0) {
	                        int v2_0 = 0;
	                        while (v2_0 < v5_0.size()) {
	                            c.a(p13.a, ((String) v5_0.get(v2_0)), ((String) this.l.get(v2_0)));
	                            v2_0++;
	                        }
	                    }
	                }
	            } else {
	                if ((p14.size() != 0) || (p15.size() != 0)) {
	                    p13 = this.a(p14, p15, 1);
	                }
	            }
	        }
	        ed v7_1;
	        this.b(-1);
	        if (p13 == 0) {
	            v7_1 = this.d;
	        } else {
	            v7_1 = 0;
	        }
	        String v1_2;
	        if (p13 == 0) {
	            v1_2 = this.c;
	        } else {
	            v1_2 = 0;
	        }
	        b v6_1 = this.p;
	        while (v6_1 != null) {
	            int v5_1;
	            if (p13 == 0) {
	                v5_1 = v6_1.g;
	            } else {
	                v5_1 = 0;
	            }
	            int v0_16;
	            if (p13 == 0) {
	                v0_16 = v6_1.h;
	            } else {
	                v0_16 = 0;
	            }
	            switch (v6_1.c) {
	                case 1:
	                    int v2_16 = v6_1.d;
	                    v2_16.L = v0_16;
	                    this.o.a(v2_16, t.b(v1_2), v7_1);
	                    break;
	                case 2:
	                    int v2_14 = v6_1.d;
	                    if (v2_14 != 0) {
	                        v2_14.L = v0_16;
	                        this.o.a(v2_14, t.b(v1_2), v7_1);
	                    }
	                    if (v6_1.i == null) {
	                    } else {
	                        int v2_15 = 0;
	                        while (v2_15 < v6_1.i.size()) {
	                            int v0_28 = ((j) v6_1.i.get(v2_15));
	                            v0_28.L = v5_1;
	                            this.o.a(v0_28, 0);
	                            v2_15++;
	                        }
	                    }
	                    break;
	                case 3:
	                    int v0_21 = v6_1.d;
	                    v0_21.L = v5_1;
	                    this.o.a(v0_21, 0);
	                    break;
	                case 4:
	                    int v0_20 = v6_1.d;
	                    v0_20.L = v5_1;
	                    this.o.c(v0_20, t.b(v1_2), v7_1);
	                    break;
	                case 5:
	                    int v2_11 = v6_1.d;
	                    v2_11.L = v0_16;
	                    this.o.b(v2_11, t.b(v1_2), v7_1);
	                    break;
	                case 6:
	                    int v0_18 = v6_1.d;
	                    v0_18.L = v5_1;
	                    this.o.e(v0_18, t.b(v1_2), v7_1);
	                    break;
	                case 7:
	                    int v0_17 = v6_1.d;
	                    v0_17.L = v5_1;
	                    this.o.d(v0_17, t.b(v1_2), v7_1);
	                    break;
	                default:
	                    throw new IllegalArgumentException(new StringBuilder("Unknown cmd: ").append(v6_1.c).toString());
	            }
	            v6_1 = v6_1.b;
	        }
	        if (p12) {
	            this.o.a(this.o.g, t.b(v1_2), v7_1, 1);
	            p13 = 0;
	        }
	        if (this.g >= 0) {
	            String v1_4 = this.o;
	            int v0_12 = this.g;
	            v1_4.e.set(v0_12, 0);
	            if (v1_4.f == null) {
	                v1_4.f = new java.util.ArrayList();
	            }
	            v1_4.f.add(Integer.valueOf(v0_12));
	            this.g = -1;
	        }
	        return p13;
	    }
	
	
	    public final void a(android.util.SparseArray p4, android.util.SparseArray p5)
	    {
	        if (this.o.i.a()) {
	            b v2 = this.a;
	            while (v2 != null) {
	                switch (v2.c) {
	                    case 1:
	                        c.a(p4, v2.d);
	                        break;
	                    case 2:
	                        if (v2.i != null) {
	                            int v1 = (v2.i.size() - 1);
	                            while (v1 >= 0) {
	                                c.b(p5, ((j) v2.i.get(v1)));
	                                v1--;
	                            }
	                        }
	                        c.a(p4, v2.d);
	                        break;
	                    case 3:
	                        c.b(p5, v2.d);
	                        break;
	                    case 4:
	                        c.b(p5, v2.d);
	                        break;
	                    case 5:
	                        c.a(p4, v2.d);
	                        break;
	                    case 6:
	                        c.b(p5, v2.d);
	                        break;
	                    case 7:
	                        c.a(p4, v2.d);
	                        break;
	                }
	                v2 = v2.a;
	            }
	        }
	        return;
	    }
	
	
	    final void a(b p3)
	    {
	        if (this.a != null) {
	            p3.b = this.p;
	            this.p.a = p3;
	            this.p = p3;
	        } else {
	            this.p = p3;
	            this.a = p3;
	        }
	        p3.e = 0;
	        p3.f = 0;
	        p3.g = 0;
	        p3.h = 0;
	        this.b = (this.b + 1);
	        return;
	    }
	
	
	    public final void a(String p8, java.io.PrintWriter p9)
	    {
	        p9.print(p8);
	        p9.print("mName=");
	        p9.print(this.f);
	        p9.print(" mIndex=");
	        p9.print(this.g);
	        p9.print(" mCommitted=");
	        p9.println(this.r);
	        if (this.c != 0) {
	            p9.print(p8);
	            p9.print("mTransition=#");
	            p9.print(Integer.toHexString(this.c));
	            p9.print(" mTransitionStyle=#");
	            p9.println(Integer.toHexString(this.d));
	        }
	        if ((this.h != 0) || (this.i != null)) {
	            p9.print(p8);
	            p9.print("mBreadCrumbTitleRes=#");
	            p9.print(Integer.toHexString(this.h));
	            p9.print(" mBreadCrumbTitleText=");
	            p9.println(this.i);
	        }
	        if ((this.j != 0) || (this.k != null)) {
	            p9.print(p8);
	            p9.print("mBreadCrumbShortTitleRes=#");
	            p9.print(Integer.toHexString(this.j));
	            p9.print(" mBreadCrumbShortTitleText=");
	            p9.println(this.k);
	        }
	        if (this.a != null) {
	            p9.print(p8);
	            p9.println("Operations:");
	            String v4 = new StringBuilder().append(p8).append("    ").toString();
	            int v2_1 = 0;
	            b v3 = this.a;
	            while (v3 != null) {
	                int v0_35;
	                switch (v3.c) {
	                    case 0:
	                        v0_35 = "NULL";
	                        break;
	                    case 1:
	                        v0_35 = "ADD";
	                        break;
	                    case 2:
	                        v0_35 = "REPLACE";
	                        break;
	                    case 3:
	                        v0_35 = "REMOVE";
	                        break;
	                    case 4:
	                        v0_35 = "HIDE";
	                        break;
	                    case 5:
	                        v0_35 = "SHOW";
	                        break;
	                    case 6:
	                        v0_35 = "DETACH";
	                        break;
	                    case 7:
	                        v0_35 = "ATTACH";
	                        break;
	                    default:
	                        v0_35 = new StringBuilder("cmd=").append(v3.c).toString();
	                }
	                p9.print(p8);
	                p9.print("  Op #");
	                p9.print(v2_1);
	                p9.print(": ");
	                p9.print(v0_35);
	                p9.print(" ");
	                p9.println(v3.d);
	                if ((v3.e != 0) || (v3.f != 0)) {
	                    p9.print(p8);
	                    p9.print("enterAnim=#");
	                    p9.print(Integer.toHexString(v3.e));
	                    p9.print(" exitAnim=#");
	                    p9.println(Integer.toHexString(v3.f));
	                }
	                if ((v3.g != 0) || (v3.h != 0)) {
	                    p9.print(p8);
	                    p9.print("popEnterAnim=#");
	                    p9.print(Integer.toHexString(v3.g));
	                    p9.print(" popExitAnim=#");
	                    p9.println(Integer.toHexString(v3.h));
	                }
	                if ((v3.i != null) && (v3.i.size() > 0)) {
	                    int v0_60 = 0;
	                    while (v0_60 < v3.i.size()) {
	                        p9.print(v4);
	                        if (v3.i.size() != 1) {
	                            if (v0_60 == 0) {
	                                p9.println("Removed:");
	                            }
	                            p9.print(v4);
	                            p9.print("  #");
	                            p9.print(v0_60);
	                            p9.print(": ");
	                        } else {
	                            p9.print("Removed: ");
	                        }
	                        p9.println(v3.i.get(v0_60));
	                        v0_60++;
	                    }
	                }
	                v3 = v3.a;
	                v2_1++;
	            }
	        }
	        return;
	    }
	
	
	    public final int b()
	    {
	        return this.a(0);
	    }
	
	
	    public final af b(int p3, j p4, String p5)
	    {
	        if (p3 != 0) {
	            this.a(p3, p4, p5, 2);
	            return this;
	        } else {
	            throw new IllegalArgumentException("Must use non-zero containerViewId");
	        }
	    }
	
	
	    public final af b(j p3)
	    {
	        b v0_1 = new b();
	        v0_1.c = 6;
	        v0_1.d = p3;
	        this.a(v0_1);
	        return this;
	    }
	
	
	    final void b(int p5)
	    {
	        if (this.e) {
	            b v2 = this.a;
	            while (v2 != null) {
	                if (v2.d != null) {
	                    int v0_3 = v2.d;
	                    v0_3.w = (v0_3.w + p5);
	                }
	                if (v2.i != null) {
	                    int v1_2 = (v2.i.size() - 1);
	                    while (v1_2 >= 0) {
	                        int v0_11 = ((j) v2.i.get(v1_2));
	                        v0_11.w = (v0_11.w + p5);
	                        v1_2--;
	                    }
	                }
	                v2 = v2.a;
	            }
	        }
	        return;
	    }
	
	
	    public final int c()
	    {
	        return this.a(1);
	    }
	
	
	    public final af c(j p3)
	    {
	        b v0_1 = new b();
	        v0_1.c = 7;
	        v0_1.d = p3;
	        this.a(v0_1);
	        return this;
	    }
	
	
	    public final void run()
	    {
	        if ((!this.e) || (this.g >= 0)) {
	            int v10;
	            this.b(1);
	            if (!c.n) {
	                v10 = 0;
	            } else {
	                int v0_4 = new android.util.SparseArray();
	                String v1_1 = new android.util.SparseArray();
	                this.b(v0_4, v1_1);
	                v10 = this.a(v0_4, v1_1, 0);
	            }
	            int v9;
	            if (v10 == 0) {
	                v9 = this.d;
	            } else {
	                v9 = 0;
	            }
	            String v1_2;
	            if (v10 == 0) {
	                v1_2 = this.c;
	            } else {
	                v1_2 = 0;
	            }
	            b v8 = this.a;
	            while (v8 != null) {
	                int v7;
	                if (v10 == 0) {
	                    v7 = v8.e;
	                } else {
	                    v7 = 0;
	                }
	                t v3_0;
	                if (v10 == 0) {
	                    v3_0 = v8.f;
	                } else {
	                    v3_0 = 0;
	                }
	                switch (v8.c) {
	                    case 1:
	                        int v0_31 = v8.d;
	                        v0_31.L = v7;
	                        this.o.a(v0_31, 0);
	                        break;
	                    case 2:
	                        int v5;
	                        int v0_21 = v8.d;
	                        if (this.o.c == null) {
	                            v5 = v0_21;
	                        } else {
	                            int v4_2 = 0;
	                            v5 = v0_21;
	                            while (v4_2 < this.o.c.size()) {
	                                int v0_29 = ((j) this.o.c.get(v4_2));
	                                if ((v5 == 0) || (v0_29.C == v5.C)) {
	                                    if (v0_29 != v5) {
	                                        if (v8.i == null) {
	                                            v8.i = new java.util.ArrayList();
	                                        }
	                                        v8.i.add(v0_29);
	                                        v0_29.L = v3_0;
	                                        if (this.e) {
	                                            v0_29.w = (v0_29.w + 1);
	                                        }
	                                        this.o.a(v0_29, v1_2, v9);
	                                    } else {
	                                        v8.d = 0;
	                                        v5 = 0;
	                                    }
	                                }
	                                v4_2++;
	                            }
	                        }
	                        if (v5 == 0) {
	                        } else {
	                            v5.L = v7;
	                            this.o.a(v5, 0);
	                        }
	                        break;
	                    case 3:
	                        int v0_20 = v8.d;
	                        v0_20.L = v3_0;
	                        this.o.a(v0_20, v1_2, v9);
	                        break;
	                    case 4:
	                        int v0_19 = v8.d;
	                        v0_19.L = v3_0;
	                        this.o.b(v0_19, v1_2, v9);
	                        break;
	                    case 5:
	                        int v0_18 = v8.d;
	                        v0_18.L = v7;
	                        this.o.c(v0_18, v1_2, v9);
	                        break;
	                    case 6:
	                        int v0_17 = v8.d;
	                        v0_17.L = v3_0;
	                        this.o.d(v0_17, v1_2, v9);
	                        break;
	                    case 7:
	                        int v0_16 = v8.d;
	                        v0_16.L = v7;
	                        this.o.e(v0_16, v1_2, v9);
	                        break;
	                    default:
	                        throw new IllegalArgumentException(new StringBuilder("Unknown cmd: ").append(v8.c).toString());
	                }
	                v8 = v8.a;
	            }
	            this.o.a(this.o.g, v1_2, v9, 1);
	            if (this.e) {
	                int v0_11 = this.o;
	                if (v0_11.d == null) {
	                    v0_11.d = new java.util.ArrayList();
	                }
	                v0_11.d.add(this);
	            }
	            return;
	        } else {
	            throw new IllegalStateException("addToBackStack() called after commit()");
	        }
	    }
	
	
	    public final String toString()
	    {
	        String v0_1 = new StringBuilder(128);
	        v0_1.append("BackStackEntry{");
	        v0_1.append(Integer.toHexString(System.identityHashCode(this)));
	        if (this.g >= 0) {
	            v0_1.append(" #");
	            v0_1.append(this.g);
	        }
	        if (this.f != null) {
	            v0_1.append(" ");
	            v0_1.append(this.f);
	        }
	        v0_1.append("}");
	        return v0_1.toString();
	    }
	
