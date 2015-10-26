	static  a
	private static  l
	private static android.view.animation.Interpolator y
	private static android.view.animation.Interpolator z
	 java.util.ArrayList b
	 java.util.ArrayList c
	 java.util.ArrayList d
	 java.util.ArrayList e
	 java.util.ArrayList f
	  g
	 m h
	 q i
	  j
	 java.lang.String k
	private java.util.ArrayList m
	private Ljava.lang.Runnable n
	private  o
	private java.util.ArrayList p
	private java.util.ArrayList q
	private j r
	private  s
	private  t
	private  u
	private android.os.Bundle v
	private android.util.SparseArray w
	private java.lang.Runnable x
	
	    static t()
	    {
	        android.view.animation.AccelerateInterpolator v0_0 = 0;
	        t.a = 0;
	        if (android.os.Build$VERSION.SDK_INT >= 11) {
	            v0_0 = 1;
	        }
	        t.l = v0_0;
	        t.y = new android.view.animation.DecelerateInterpolator(1075838976);
	        t.z = new android.view.animation.DecelerateInterpolator(1069547520);
	        new android.view.animation.AccelerateInterpolator(1075838976);
	        new android.view.animation.AccelerateInterpolator(1069547520);
	        return;
	    }
	
	
	    t()
	    {
	        this.g = 0;
	        this.v = 0;
	        this.w = 0;
	        this.x = new u(this);
	        return;
	    }
	
	
	    private static android.view.animation.Animation a(float p4, float p5)
	    {
	        android.view.animation.AlphaAnimation v0_1 = new android.view.animation.AlphaAnimation(p4, p5);
	        v0_1.setInterpolator(t.z);
	        v0_1.setDuration(220);
	        return v0_1;
	    }
	
	
	    private static android.view.animation.Animation a(float p12, float p13, float p14, float p15)
	    {
	        android.view.animation.AnimationSet v9_1 = new android.view.animation.AnimationSet(0);
	        android.view.animation.AlphaAnimation v0_2 = new android.view.animation.ScaleAnimation(p12, p13, p12, p13, 1, 1056964608, 1, 1056964608);
	        v0_2.setInterpolator(t.y);
	        v0_2.setDuration(220);
	        v9_1.addAnimation(v0_2);
	        android.view.animation.AlphaAnimation v0_4 = new android.view.animation.AlphaAnimation(p14, p15);
	        v0_4.setInterpolator(t.z);
	        v0_4.setDuration(220);
	        v9_1.addAnimation(v0_4);
	        return v9_1;
	    }
	
	
	    private android.view.animation.Animation a(j p7, int p8, boolean p9, int p10)
	    {
	        int v0_2;
	        j.i();
	        if (p7.L == 0) {
	            if (p8 != 0) {
	                int v0_3 = -1;
	                switch (p8) {
	                    case 4097:
	                        if (!p9) {
	                            v0_3 = 2;
	                        } else {
	                            v0_3 = 1;
	                        }
	                        break;
	                    case 4099:
	                        if (!p9) {
	                            v0_3 = 6;
	                        } else {
	                            v0_3 = 5;
	                        }
	                        break;
	                    case 8194:
	                        if (!p9) {
	                            v0_3 = 4;
	                        } else {
	                            v0_3 = 3;
	                        }
	                        break;
	                }
	                if (v0_3 >= 0) {
	                    switch (v0_3) {
	                        case 1:
	                            v0_2 = t.a(1066401792, 1065353216, 0, 1065353216);
	                            break;
	                        case 2:
	                            v0_2 = t.a(1065353216, 1064933786, 1065353216, 0);
	                            break;
	                        case 3:
	                            v0_2 = t.a(1064933786, 1065353216, 0, 1065353216);
	                            break;
	                        case 4:
	                            v0_2 = t.a(1065353216, 1065982362, 1065353216, 0);
	                            break;
	                        case 5:
	                            v0_2 = t.a(0, 1065353216);
	                            break;
	                        case 6:
	                            v0_2 = t.a(1065353216, 0);
	                            break;
	                        default:
	                            if (p10 != 0) {
	                                if (p10 != 0) {
	                                    v0_2 = 0;
	                                } else {
	                                    v0_2 = 0;
	                                }
	                            } else {
	                                if (this.h.getWindow() == null) {
	                                } else {
	                                    p10 = this.h.getWindow().getAttributes().windowAnimations;
	                                }
	                            }
	                    }
	                } else {
	                    v0_2 = 0;
	                }
	            } else {
	                v0_2 = 0;
	            }
	        } else {
	            v0_2 = android.view.animation.AnimationUtils.loadAnimation(this.h, p7.L);
	            if (v0_2 == 0) {
	            }
	        }
	        return v0_2;
	    }
	
	
	    private j a(android.os.Bundle p6, String p7)
	    {
	        j v0_7;
	        String v1_0 = p6.getInt(p7, -1);
	        if (v1_0 != -1) {
	            if (v1_0 >= this.b.size()) {
	                this.a(new IllegalStateException(new StringBuilder("Fragment no longer exists for key ").append(p7).append(": index ").append(v1_0).toString()));
	            }
	            v0_7 = ((j) this.b.get(v1_0));
	            if (v0_7 == null) {
	                this.a(new IllegalStateException(new StringBuilder("Fragment no longer exists for key ").append(p7).append(": index ").append(v1_0).toString()));
	            }
	        } else {
	            v0_7 = 0;
	        }
	        return v0_7;
	    }
	
	
	    private void a(int p4, c p5)
	    {
	        try {
	            if (this.e == null) {
	                this.e = new java.util.ArrayList();
	            }
	        } catch (int v0_7) {
	            throw v0_7;
	        }
	        int v0_4 = this.e.size();
	        if (p4 >= v0_4) {
	            while (v0_4 < p4) {
	                this.e.add(0);
	                if (this.f == null) {
	                    this.f = new java.util.ArrayList();
	                }
	                this.f.add(Integer.valueOf(v0_4));
	                v0_4++;
	            }
	            this.e.add(p5);
	        } else {
	            this.e.set(p4, p5);
	        }
	        return;
	    }
	
	
	    private void a(RuntimeException p6)
	    {
	        android.util.Log.e("FragmentManager", p6.getMessage());
	        android.util.Log.e("FragmentManager", "Activity state:");
	        String v1_4 = new java.io.PrintWriter(new eg("FragmentManager"));
	        if (this.h == null) {
	            try {
	                String[] v3_1 = new String[0];
	                this.a("  ", 0, v1_4, v3_1);
	            } catch (Exception v0_6) {
	                android.util.Log.e("FragmentManager", "Failed dumping state", v0_6);
	            }
	        } else {
	            try {
	                String[] v4_1 = new String[0];
	                this.h.dump("  ", 0, v1_4, v4_1);
	            } catch (Exception v0_8) {
	                android.util.Log.e("FragmentManager", "Failed dumping state", v0_8);
	            }
	        }
	        throw p6;
	    }
	
	
	    public static int b(int p1)
	    {
	        int v0 = 0;
	        switch (p1) {
	            case 4097:
	                v0 = 8194;
	                break;
	            case 4099:
	                v0 = 4099;
	                break;
	            case 8194:
	                v0 = 4097;
	                break;
	        }
	        return v0;
	    }
	
	
	    private void b(j p7)
	    {
	        this.a(p7, this.g, 0, 0, 0);
	        return;
	    }
	
	
	    private void c(j p3)
	    {
	        if (p3.O != null) {
	            if (this.w != null) {
	                this.w.clear();
	            } else {
	                this.w = new android.util.SparseArray();
	            }
	            p3.O.saveHierarchyState(this.w);
	            if (this.w.size() > 0) {
	                p3.j = this.w;
	                this.w = 0;
	            }
	        }
	        return;
	    }
	
	
	    private void r()
	    {
	        if (!this.j) {
	            if (this.k == null) {
	                return;
	            } else {
	                throw new IllegalStateException(new StringBuilder("Can not perform this action inside of ").append(this.k).toString());
	            }
	        } else {
	            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
	        }
	    }
	
	
	    public final int a(c p3)
	    {
	        try {
	            if ((this.f != null) && (this.f.size() > 0)) {
	                int v0_6 = ((Integer) this.f.remove((this.f.size() - 1))).intValue();
	                this.e.set(v0_6, p3);
	            } else {
	                if (this.e == null) {
	                    this.e = new java.util.ArrayList();
	                }
	                v0_6 = this.e.size();
	                this.e.add(p3);
	            }
	        } catch (int v0_11) {
	            throw v0_11;
	        }
	        return v0_6;
	    }
	
	
	    public final af a()
	    {
	        return new c(this);
	    }
	
	
	    public final android.view.View a(android.view.View p10, String p11, android.content.Context p12, android.util.AttributeSet p13)
	    {
	        android.view.View v0_20;
	        if ("fragment".equals(p11)) {
	            String v6;
	            android.view.View v0_3 = p13.getAttributeValue(0, "class");
	            String v1_1 = p12.obtainStyledAttributes(p13, z.a);
	            if (v0_3 != null) {
	                v6 = v0_3;
	            } else {
	                v6 = v1_1.getString(0);
	            }
	            int v7 = v1_1.getResourceId(1, -1);
	            String v8 = v1_1.getString(2);
	            v1_1.recycle();
	            if (j.b(this.h, v6)) {
	                String v1_2;
	                if (p10 == null) {
	                    v1_2 = 0;
	                } else {
	                    v1_2 = p10.getId();
	                }
	                if ((v1_2 != -1) || ((v7 != -1) || (v8 != null))) {
	                    android.view.View v0_8;
	                    if (v7 == -1) {
	                        v0_8 = 0;
	                    } else {
	                        v0_8 = this.a(v7);
	                    }
	                    if ((v0_8 == null) && (v8 != null)) {
	                        v0_8 = this.a(v8);
	                    }
	                    if ((v0_8 == null) && (v1_2 != -1)) {
	                        v0_8 = this.a(v1_2);
	                    }
	                    String v1_4;
	                    if (v0_8 != null) {
	                        if (!v0_8.u) {
	                            v0_8.u = 1;
	                            if (!v0_8.H) {
	                                v0_8.K = 1;
	                            }
	                            v1_4 = v0_8;
	                        } else {
	                            throw new IllegalArgumentException(new StringBuilder().append(p13.getPositionDescription()).append(": Duplicate id 0x").append(Integer.toHexString(v7)).append(", tag ").append(v8).append(", or parent id 0x").append(Integer.toHexString(v1_2)).append(" with another fragment for ").append(v6).toString());
	                        }
	                    } else {
	                        android.view.View v0_11;
	                        String v4_2 = j.a(p12, v6);
	                        v4_2.t = 1;
	                        if (v7 == 0) {
	                            v0_11 = v1_2;
	                        } else {
	                            v0_11 = v7;
	                        }
	                        v4_2.B = v0_11;
	                        v4_2.C = v1_2;
	                        v4_2.D = v8;
	                        v4_2.u = 1;
	                        v4_2.x = this;
	                        v4_2.K = 1;
	                        this.a(v4_2, 1);
	                        v1_4 = v4_2;
	                    }
	                    if ((this.g > 0) || (!v1_4.t)) {
	                        this.b(v1_4);
	                    } else {
	                        this.a(v1_4, 1, 0, 0, 0);
	                    }
	                    if (v1_4.N != null) {
	                        if (v7 != 0) {
	                            v1_4.N.setId(v7);
	                        }
	                        if (v1_4.N.getTag() == null) {
	                            v1_4.N.setTag(v8);
	                        }
	                        v0_20 = v1_4.N;
	                    } else {
	                        throw new IllegalStateException(new StringBuilder("Fragment ").append(v6).append(" did not create a view.").toString());
	                    }
	                } else {
	                    throw new IllegalArgumentException(new StringBuilder().append(p13.getPositionDescription()).append(": Must specify unique android:id, android:tag, or have a parent with an id for ").append(v6).toString());
	                }
	            } else {
	                v0_20 = 0;
	            }
	        } else {
	            v0_20 = 0;
	        }
	        return v0_20;
	    }
	
	
	    public final j a(int p4)
	    {
	        int v0_8;
	        if (this.c == null) {
	            if (this.b != null) {
	                int v1_1 = (this.b.size() - 1);
	                while (v1_1 >= 0) {
	                    v0_8 = ((j) this.b.get(v1_1));
	                    if ((v0_8 != 0) && (v0_8.B == p4)) {
	                        return v0_8;
	                    } else {
	                        v1_1--;
	                    }
	                }
	            }
	            v0_8 = 0;
	        } else {
	            int v1_0 = (this.c.size() - 1);
	            while (v1_0 >= 0) {
	                v0_8 = ((j) this.c.get(v1_0));
	                if ((v0_8 == 0) || (v0_8.B != p4)) {
	                    v1_0--;
	                }
	            }
	        }
	        return v0_8;
	    }
	
	
	    public final j a(String p4)
	    {
	        if ((this.c == null) || (p4 == null)) {
	            if ((this.b != null) && (p4 != null)) {
	                int v1_1 = (this.b.size() - 1);
	                while (v1_1 >= 0) {
	                    int v0_8 = ((j) this.b.get(v1_1));
	                    if ((v0_8 != 0) && (p4.equals(v0_8.D))) {
	                        return v0_8;
	                    } else {
	                        v1_1--;
	                    }
	                }
	            }
	            v0_8 = 0;
	        } else {
	            int v1_0 = (this.c.size() - 1);
	            while (v1_0 >= 0) {
	                v0_8 = ((j) this.c.get(v1_0));
	                if ((v0_8 == 0) || (!p4.equals(v0_8.D))) {
	                    v1_0--;
	                }
	            }
	        }
	        return v0_8;
	    }
	
	
	    public final void a(int p4, int p5)
	    {
	        if (p4 >= 0) {
	            this.a(new x(this, p4, 1), 0);
	            return;
	        } else {
	            throw new IllegalArgumentException(new StringBuilder("Bad id: ").append(p4).toString());
	        }
	    }
	
	
	    final void a(int p9, int p10, int p11, boolean p12)
	    {
	        if ((this.h != null) || (p9 == 0)) {
	            if ((p12) || (this.g != p9)) {
	                this.g = p9;
	                if (this.b != null) {
	                    int v6 = 0;
	                    int v7_0 = 0;
	                    while (v6 < this.b.size()) {
	                        int v1_3;
	                        int v1_2 = ((j) this.b.get(v6));
	                        if (v1_2 == 0) {
	                            v1_3 = v7_0;
	                        } else {
	                            this.a(v1_2, p9, p10, p11, 0);
	                            if (v1_2.R == null) {
	                            } else {
	                                v1_3 = (v7_0 | v1_2.R.a());
	                            }
	                        }
	                        v6++;
	                        v7_0 = v1_3;
	                    }
	                    if (v7_0 == 0) {
	                        this.g();
	                    }
	                    if ((this.s) && ((this.h != null) && (this.g == 5))) {
	                        this.h.a_();
	                        this.s = 0;
	                    }
	                }
	            }
	            return;
	        } else {
	            throw new IllegalStateException("No activity");
	        }
	    }
	
	
	    final void a(int p2, boolean p3)
	    {
	        this.a(p2, 0, 0, 0);
	        return;
	    }
	
	
	    public final void a(android.content.res.Configuration p4)
	    {
	        if (this.c != null) {
	            int v1 = 0;
	            while (v1 < this.c.size()) {
	                t v0_6 = ((j) this.c.get(v1));
	                if (v0_6 != null) {
	                    v0_6.onConfigurationChanged(p4);
	                    if (v0_6.z != null) {
	                        v0_6.z.a(p4);
	                    }
	                }
	                v1++;
	            }
	        }
	        return;
	    }
	
	
	    final void a(android.os.Parcelable p10, java.util.ArrayList p11)
	    {
	        int v2 = 0;
	        if ((p10 != null) && (((aa) p10).a != null)) {
	            if (p11 != null) {
	                int v1_0 = 0;
	                while (v1_0 < p11.size()) {
	                    c v0_31 = ((j) p11.get(v1_0));
	                    java.util.ArrayList v3_11 = ((aa) p10).a[v0_31.k];
	                    v3_11.k = v0_31;
	                    v0_31.j = 0;
	                    v0_31.w = 0;
	                    v0_31.u = 0;
	                    v0_31.q = 0;
	                    v0_31.n = 0;
	                    if (v3_11.j != null) {
	                        v3_11.j.setClassLoader(this.h.getClassLoader());
	                        v0_31.j = v3_11.j.getSparseParcelableArray("android:view_state");
	                        v0_31.i = v3_11.j;
	                    }
	                    v1_0++;
	                }
	            }
	            this.b = new java.util.ArrayList(((aa) p10).a.length);
	            if (this.p != null) {
	                this.p.clear();
	            }
	            c v0_6 = 0;
	            while (v0_6 < ((aa) p10).a.length) {
	                java.util.ArrayList v3_8 = ((aa) p10).a[v0_6];
	                if (v3_8 == null) {
	                    this.b.add(0);
	                    if (this.p == null) {
	                        this.p = new java.util.ArrayList();
	                    }
	                    this.p.add(Integer.valueOf(v0_6));
	                } else {
	                    int v1_28;
	                    int v1_26 = this.h;
	                    String v4_13 = this.r;
	                    if (v3_8.k == null) {
	                        if (v3_8.i != null) {
	                            v3_8.i.setClassLoader(v1_26.getClassLoader());
	                        }
	                        v3_8.k = j.a(v1_26, v3_8.a, v3_8.i);
	                        if (v3_8.j != null) {
	                            v3_8.j.setClassLoader(v1_26.getClassLoader());
	                            v3_8.k.i = v3_8.j;
	                        }
	                        v3_8.k.a(v3_8.b, v4_13);
	                        v3_8.k.t = v3_8.c;
	                        v3_8.k.v = 1;
	                        v3_8.k.B = v3_8.d;
	                        v3_8.k.C = v3_8.e;
	                        v3_8.k.D = v3_8.f;
	                        v3_8.k.G = v3_8.g;
	                        v3_8.k.F = v3_8.h;
	                        v3_8.k.x = v1_26.b;
	                        v1_28 = v3_8.k;
	                    } else {
	                        v1_28 = v3_8.k;
	                    }
	                    this.b.add(v1_28);
	                    v3_8.k = 0;
	                }
	                v0_6++;
	            }
	            if (p11 != null) {
	                java.util.ArrayList v3_0 = 0;
	                while (v3_0 < p11.size()) {
	                    c v0_28 = ((j) p11.get(v3_0));
	                    if (v0_28.o >= 0) {
	                        if (v0_28.o >= this.b.size()) {
	                            android.util.Log.w("FragmentManager", new StringBuilder("Re-attaching retained fragment ").append(v0_28).append(" target no longer exists: ").append(v0_28.o).toString());
	                            v0_28.n = 0;
	                        } else {
	                            v0_28.n = ((j) this.b.get(v0_28.o));
	                        }
	                    }
	                    v3_0++;
	                }
	            }
	            if (((aa) p10).b == null) {
	                this.c = 0;
	            } else {
	                this.c = new java.util.ArrayList(((aa) p10).b.length);
	                int v1_7 = 0;
	                while (v1_7 < ((aa) p10).b.length) {
	                    c v0_23 = ((j) this.b.get(((aa) p10).b[v1_7]));
	                    if (v0_23 == null) {
	                        this.a(new IllegalStateException(new StringBuilder("No instantiated fragment for index #").append(((aa) p10).b[v1_7]).toString()));
	                    }
	                    v0_23.q = 1;
	                    if (!this.c.contains(v0_23)) {
	                        this.c.add(v0_23);
	                        v1_7++;
	                    } else {
	                        throw new IllegalStateException("Already added!");
	                    }
	                }
	            }
	            if (((aa) p10).c == null) {
	                this.d = 0;
	            } else {
	                this.d = new java.util.ArrayList(((aa) p10).c.length);
	                while (v2 < ((aa) p10).c.length) {
	                    c v0_20 = ((aa) p10).c[v2].a(this);
	                    this.d.add(v0_20);
	                    if (v0_20.g >= 0) {
	                        this.a(v0_20.g, v0_20);
	                    }
	                    v2++;
	                }
	            }
	        }
	        return;
	    }
	
	
	    public final void a(j p7)
	    {
	        if (p7.P) {
	            if (!this.o) {
	                p7.P = 0;
	                this.a(p7, this.g, 0, 0, 0);
	            } else {
	                this.u = 1;
	            }
	        }
	        return;
	    }
	
	
	    public final void a(j p7, int p8, int p9)
	    {
	        t v0_1;
	        if (p7.w <= 0) {
	            v0_1 = 0;
	        } else {
	            v0_1 = 1;
	        }
	        t v0_2;
	        if (v0_1 != null) {
	            v0_2 = 0;
	        } else {
	            v0_2 = 1;
	        }
	        if ((!p7.F) || (v0_2 != null)) {
	            if (this.c != null) {
	                this.c.remove(p7);
	            }
	            if ((p7.I) && (p7.J)) {
	                this.s = 1;
	            }
	            int v2_5;
	            p7.q = 0;
	            p7.r = 1;
	            if (v0_2 == null) {
	                v2_5 = 1;
	            } else {
	                v2_5 = 0;
	            }
	            this.a(p7, v2_5, p8, p9, 0);
	        }
	        return;
	    }
	
	
	    final void a(j p11, int p12, int p13, int p14, boolean p15)
	    {
	        if (((!p11.q) || (p11.F)) && (p12 > 1)) {
	            p12 = 1;
	        }
	        if ((p11.r) && (p12 > p11.f)) {
	            p12 = p11.f;
	        }
	        if ((p11.P) && ((p11.f < 4) && (p12 > 3))) {
	            p12 = 3;
	        }
	        if (p11.f >= p12) {
	            if (p11.f <= p12) {
	                p11.f = p12;
	            } else {
	                switch (p11.f) {
	                    case 1:
	                        break;
	                    case 2:
	                        if (p12 >= 2) {
	                        } else {
	                            if ((p11.N != null) && ((!this.h.isFinishing()) && (p11.j == null))) {
	                                this.c(p11);
	                            }
	                            if (p11.z != null) {
	                                p11.z.a(1, 0);
	                            }
	                            p11.K = 0;
	                            p11.d();
	                            if (p11.K) {
	                                if (p11.R != null) {
	                                    p11.R.e();
	                                }
	                                if ((p11.N != null) && (p11.M != null)) {
	                                    if ((this.g <= 0) || (this.t)) {
	                                        android.view.View v0_34 = 0;
	                                    } else {
	                                        v0_34 = this.a(p11, p13, 0, p14);
	                                    }
	                                    if (v0_34 != null) {
	                                        p11.g = p11.N;
	                                        p11.h = p12;
	                                        v0_34.setAnimationListener(new y(this, p11));
	                                        p11.N.startAnimation(v0_34);
	                                    }
	                                    p11.M.removeView(p11.N);
	                                }
	                                p11.M = 0;
	                                p11.N = 0;
	                                p11.O = 0;
	                            } else {
	                                throw new ay(new StringBuilder("Fragment ").append(p11).append(" did not call through to super.onDestroyView()").toString());
	                            }
	                        }
	                        break;
	                    case 3:
	                        if (p12 >= 3) {
	                        } else {
	                            p11.o();
	                        }
	                        break;
	                    case 4:
	                        if (p12 >= 4) {
	                        } else {
	                            if (p11.z != null) {
	                                p11.z.o();
	                            }
	                            p11.K = 0;
	                            p11.h_();
	                            if (p11.K) {
	                            } else {
	                                throw new ay(new StringBuilder("Fragment ").append(p11).append(" did not call through to super.onStop()").toString());
	                            }
	                        }
	                        break;
	                    case 5:
	                        if (p12 >= 5) {
	                        } else {
	                            if (p11.z != null) {
	                                p11.z.n();
	                            }
	                            p11.K = 0;
	                            p11.k();
	                            if (p11.K) {
	                                p11.s = 0;
	                            } else {
	                                throw new ay(new StringBuilder("Fragment ").append(p11).append(" did not call through to super.onPause()").toString());
	                            }
	                        }
	                        break;
	                    default:
	                }
	                if (p12 > 0) {
	                } else {
	                    if ((this.t) && (p11.g != null)) {
	                        android.view.View v0_40 = p11.g;
	                        p11.g = 0;
	                        v0_40.clearAnimation();
	                    }
	                    if (p11.g == null) {
	                        if (!p11.H) {
	                            if (p11.z != null) {
	                                p11.z.p();
	                            }
	                            p11.K = 0;
	                            p11.l();
	                            if (!p11.K) {
	                                throw new ay(new StringBuilder("Fragment ").append(p11).append(" did not call through to super.onDestroy()").toString());
	                            }
	                        }
	                        p11.K = 0;
	                        p11.a();
	                        if (p11.K) {
	                            if (p15) {
	                            } else {
	                                if (p11.H) {
	                                    p11.y = 0;
	                                    p11.A = 0;
	                                    p11.x = 0;
	                                    p11.z = 0;
	                                } else {
	                                    if (p11.k < 0) {
	                                    } else {
	                                        this.b.set(p11.k, 0);
	                                        if (this.p == null) {
	                                            this.p = new java.util.ArrayList();
	                                        }
	                                        this.p.add(Integer.valueOf(p11.k));
	                                        this.h.a(p11.l);
	                                        p11.k = -1;
	                                        p11.l = 0;
	                                        p11.q = 0;
	                                        p11.r = 0;
	                                        p11.s = 0;
	                                        p11.t = 0;
	                                        p11.u = 0;
	                                        p11.v = 0;
	                                        p11.w = 0;
	                                        p11.x = 0;
	                                        p11.z = 0;
	                                        p11.y = 0;
	                                        p11.B = 0;
	                                        p11.C = 0;
	                                        p11.D = 0;
	                                        p11.E = 0;
	                                        p11.F = 0;
	                                        p11.H = 0;
	                                        p11.R = 0;
	                                        p11.S = 0;
	                                        p11.T = 0;
	                                    }
	                                }
	                            }
	                        } else {
	                            throw new ay(new StringBuilder("Fragment ").append(p11).append(" did not call through to super.onDetach()").toString());
	                        }
	                    } else {
	                        p11.h = p12;
	                        p12 = 1;
	                    }
	                }
	            }
	        } else {
	            if ((!p11.t) || (p11.u)) {
	                if (p11.g != null) {
	                    p11.g = 0;
	                    this.a(p11, p11.h, 0, 0, 1);
	                }
	                switch (p11.f) {
	                    case 0:
	                        if (p11.i != null) {
	                            p11.i.setClassLoader(this.h.getClassLoader());
	                            p11.j = p11.i.getSparseParcelableArray("android:view_state");
	                            p11.n = this.a(p11.i, "android:target_state");
	                            if (p11.n != null) {
	                                p11.p = p11.i.getInt("android:target_req_state", 0);
	                            }
	                            p11.Q = p11.i.getBoolean("android:user_visible_hint", 1);
	                            if (!p11.Q) {
	                                p11.P = 1;
	                                if (p12 > 3) {
	                                    p12 = 3;
	                                }
	                            }
	                        }
	                        android.view.View v0_81;
	                        p11.y = this.h;
	                        p11.A = this.r;
	                        if (this.r == null) {
	                            v0_81 = this.h.b;
	                        } else {
	                            v0_81 = this.r.z;
	                        }
	                        p11.x = v0_81;
	                        p11.K = 0;
	                        p11.a(this.h);
	                        if (p11.K) {
	                            if (!p11.H) {
	                                android.view.View v0_86 = p11.i;
	                                if (p11.z != null) {
	                                    p11.z.j = 0;
	                                }
	                                p11.K = 0;
	                                p11.a(v0_86);
	                                if (p11.K) {
	                                    if (v0_86 != null) {
	                                        android.view.View v0_87 = v0_86.getParcelable("android:support:fragments");
	                                        if (v0_87 != null) {
	                                            if (p11.z == null) {
	                                                p11.n();
	                                            }
	                                            p11.z.a(v0_87, 0);
	                                            p11.z.j();
	                                        }
	                                    }
	                                } else {
	                                    throw new ay(new StringBuilder("Fragment ").append(p11).append(" did not call through to super.onCreate()").toString());
	                                }
	                            }
	                            p11.H = 0;
	                            if (p11.t) {
	                                p11.N = p11.b(p11.b(p11.i), 0, p11.i);
	                                if (p11.N == null) {
	                                    p11.O = 0;
	                                } else {
	                                    p11.O = p11.N;
	                                    if (android.os.Build$VERSION.SDK_INT < 11) {
	                                        p11.N = aw.a(p11.N);
	                                    } else {
	                                        gt.a(p11.N, 0);
	                                    }
	                                    if (p11.E) {
	                                        p11.N.setVisibility(8);
	                                    }
	                                    p11.a(p11.N, p11.i);
	                                }
	                            } else {
	                                if (p12 <= 1) {
	                                    if (p12 <= 3) {
	                                        if (p12 <= 4) {
	                                        } else {
	                                            p11.s = 1;
	                                            if (p11.z != null) {
	                                                p11.z.j = 0;
	                                                p11.z.h();
	                                            }
	                                            p11.K = 0;
	                                            p11.j();
	                                            if (p11.K) {
	                                                if (p11.z != null) {
	                                                    p11.z.m();
	                                                    p11.z.h();
	                                                }
	                                                p11.i = 0;
	                                                p11.j = 0;
	                                            } else {
	                                                throw new ay(new StringBuilder("Fragment ").append(p11).append(" did not call through to super.onResume()").toString());
	                                            }
	                                        }
	                                    } else {
	                                        if (p11.z != null) {
	                                            p11.z.j = 0;
	                                            p11.z.h();
	                                        }
	                                        p11.K = 0;
	                                        p11.g_();
	                                        if (p11.K) {
	                                            if (p11.z != null) {
	                                                p11.z.l();
	                                            }
	                                            if (p11.R == null) {
	                                            } else {
	                                                p11.R.f();
	                                            }
	                                        } else {
	                                            throw new ay(new StringBuilder("Fragment ").append(p11).append(" did not call through to super.onStart()").toString());
	                                        }
	                                    }
	                                } else {
	                                    if (!p11.t) {
	                                        android.view.View v0_104;
	                                        if (p11.C == 0) {
	                                            v0_104 = 0;
	                                        } else {
	                                            v0_104 = ((android.view.ViewGroup) this.i.a(p11.C));
	                                            if ((v0_104 == null) && (!p11.v)) {
	                                                this.a(new IllegalArgumentException(new StringBuilder("No view found for id 0x").append(Integer.toHexString(p11.C)).append(" (").append(p11.e().getResourceName(p11.C)).append(") for fragment ").append(p11).toString()));
	                                            }
	                                        }
	                                        p11.M = v0_104;
	                                        p11.N = p11.b(p11.b(p11.i), v0_104, p11.i);
	                                        if (p11.N == null) {
	                                            p11.O = 0;
	                                        } else {
	                                            p11.O = p11.N;
	                                            if (android.os.Build$VERSION.SDK_INT < 11) {
	                                                p11.N = aw.a(p11.N);
	                                            } else {
	                                                gt.a(p11.N, 0);
	                                            }
	                                            if (v0_104 != null) {
	                                                android.os.Bundle v1_64 = this.a(p11, p13, 1, p14);
	                                                if (v1_64 != null) {
	                                                    p11.N.startAnimation(v1_64);
	                                                }
	                                                v0_104.addView(p11.N);
	                                            }
	                                            if (p11.E) {
	                                                p11.N.setVisibility(8);
	                                            }
	                                            p11.a(p11.N, p11.i);
	                                        }
	                                    }
	                                    android.view.View v0_110 = p11.i;
	                                    if (p11.z != null) {
	                                        p11.z.j = 0;
	                                    }
	                                    p11.K = 0;
	                                    p11.d(v0_110);
	                                    if (p11.K) {
	                                        if (p11.z != null) {
	                                            p11.z.k();
	                                        }
	                                        if (p11.N != null) {
	                                            if (p11.j != null) {
	                                                p11.O.restoreHierarchyState(p11.j);
	                                                p11.j = 0;
	                                            }
	                                            p11.K = 0;
	                                            p11.K = 1;
	                                            if (!p11.K) {
	                                                throw new ay(new StringBuilder("Fragment ").append(p11).append(" did not call through to super.onViewStateRestored()").toString());
	                                            }
	                                        }
	                                        p11.i = 0;
	                                    } else {
	                                        throw new ay(new StringBuilder("Fragment ").append(p11).append(" did not call through to super.onActivityCreated()").toString());
	                                    }
	                                }
	                            }
	                        } else {
	                            throw new ay(new StringBuilder("Fragment ").append(p11).append(" did not call through to super.onAttach()").toString());
	                        }
	                    default:
	                }
	            }
	        }
	        return;
	    }
	
	
	    public final void a(j p4, boolean p5)
	    {
	        if (this.c == null) {
	            this.c = new java.util.ArrayList();
	        }
	        if (p4.k < 0) {
	            if ((this.p != null) && (this.p.size() > 0)) {
	                p4.a(((Integer) this.p.remove((this.p.size() - 1))).intValue(), this.r);
	                this.b.set(p4.k, p4);
	            } else {
	                if (this.b == null) {
	                    this.b = new java.util.ArrayList();
	                }
	                p4.a(this.b.size(), this.r);
	                this.b.add(p4);
	            }
	        }
	        if (!p4.F) {
	            if (!this.c.contains(p4)) {
	                this.c.add(p4);
	                p4.q = 1;
	                p4.r = 0;
	                if ((p4.I) && (p4.J)) {
	                    this.s = 1;
	                }
	                if (p5) {
	                    this.b(p4);
	                }
	            } else {
	                throw new IllegalStateException(new StringBuilder("Fragment already added: ").append(p4).toString());
	            }
	        }
	        return;
	    }
	
	
	    public final void a(Runnable p3, boolean p4)
	    {
	        if (!p4) {
	            this.r();
	        }
	        try {
	            if ((!this.t) && (this.h != null)) {
	                if (this.m == null) {
	                    this.m = new java.util.ArrayList();
	                }
	                this.m.add(p3);
	                if (this.m.size() == 1) {
	                    this.h.a.removeCallbacks(this.x);
	                    this.h.a.post(this.x);
	                }
	                return;
	            } else {
	                throw new IllegalStateException("Activity has been destroyed");
	            }
	        } catch (android.os.Handler v0_14) {
	            throw v0_14;
	        }
	    }
	
	
	    public final void a(String p3, int p4)
	    {
	        this.a(new w(this, p3, 1), 0);
	        return;
	    }
	
	
	    public final void a(String p7, java.io.FileDescriptor p8, java.io.PrintWriter p9, String[] p10)
	    {
	        int v1 = 0;
	        String v3_0 = new StringBuilder().append(p7).append("    ").toString();
	        if (this.b != null) {
	            String v4_0 = this.b.size();
	            if (v4_0 > null) {
	                p9.print(p7);
	                p9.print("Active Fragments in ");
	                p9.print(Integer.toHexString(System.identityHashCode(this)));
	                p9.println(":");
	                int v2_1 = 0;
	                while (v2_1 < v4_0) {
	                    String v0_84 = ((j) this.b.get(v2_1));
	                    p9.print(p7);
	                    p9.print("  #");
	                    p9.print(v2_1);
	                    p9.print(": ");
	                    p9.println(v0_84);
	                    if (v0_84 != null) {
	                        v0_84.a(v3_0, p8, p9, p10);
	                    }
	                    v2_1++;
	                }
	            }
	        }
	        if (this.c != null) {
	            String v4_1 = this.c.size();
	            if (v4_1 > null) {
	                p9.print(p7);
	                p9.println("Added Fragments:");
	                int v2_2 = 0;
	                while (v2_2 < v4_1) {
	                    String v0_79 = ((j) this.c.get(v2_2));
	                    p9.print(p7);
	                    p9.print("  #");
	                    p9.print(v2_2);
	                    p9.print(": ");
	                    p9.println(v0_79.toString());
	                    v2_2++;
	                }
	            }
	        }
	        if (this.q != null) {
	            String v4_2 = this.q.size();
	            if (v4_2 > null) {
	                p9.print(p7);
	                p9.println("Fragments Created Menus:");
	                int v2_3 = 0;
	                while (v2_3 < v4_2) {
	                    String v0_74 = ((j) this.q.get(v2_3));
	                    p9.print(p7);
	                    p9.print("  #");
	                    p9.print(v2_3);
	                    p9.print(": ");
	                    p9.println(v0_74.toString());
	                    v2_3++;
	                }
	            }
	        }
	        if (this.d != null) {
	            String v4_3 = this.d.size();
	            if (v4_3 > null) {
	                p9.print(p7);
	                p9.println("Back Stack:");
	                int v2_4 = 0;
	                while (v2_4 < v4_3) {
	                    String v0_70 = ((c) this.d.get(v2_4));
	                    p9.print(p7);
	                    p9.print("  #");
	                    p9.print(v2_4);
	                    p9.print(": ");
	                    p9.println(v0_70.toString());
	                    v0_70.a(v3_0, p9);
	                    v2_4++;
	                }
	            }
	        }
	        if (this.e != null) {
	            String v3_1 = this.e.size();
	            if (v3_1 > null) {
	                p9.print(p7);
	                p9.println("Back Stack Indices:");
	                int v2_5 = 0;
	                while (v2_5 < v3_1) {
	                    String v0_65 = ((c) this.e.get(v2_5));
	                    p9.print(p7);
	                    p9.print("  #");
	                    p9.print(v2_5);
	                    p9.print(": ");
	                    p9.println(v0_65);
	                    v2_5++;
	                }
	            }
	        }
	        if ((this.f != null) && (this.f.size() > 0)) {
	            p9.print(p7);
	            p9.print("mAvailBackStackIndices: ");
	            p9.println(java.util.Arrays.toString(this.f.toArray()));
	        }
	        if (this.m != null) {
	            int v2_6 = this.m.size();
	            if (v2_6 > 0) {
	                p9.print(p7);
	                p9.println("Pending Actions:");
	                while (v1 < v2_6) {
	                    String v0_61 = ((Runnable) this.m.get(v1));
	                    p9.print(p7);
	                    p9.print("  #");
	                    p9.print(v1);
	                    p9.print(": ");
	                    p9.println(v0_61);
	                    v1++;
	                }
	            }
	        }
	        p9.print(p7);
	        p9.println("FragmentManager misc state:");
	        p9.print(p7);
	        p9.print("  mActivity=");
	        p9.println(this.h);
	        p9.print(p7);
	        p9.print("  mContainer=");
	        p9.println(this.i);
	        if (this.r != null) {
	            p9.print(p7);
	            p9.print("  mParent=");
	            p9.println(this.r);
	        }
	        p9.print(p7);
	        p9.print("  mCurState=");
	        p9.print(this.g);
	        p9.print(" mStateSaved=");
	        p9.print(this.j);
	        p9.print(" mDestroyed=");
	        p9.println(this.t);
	        if (this.s) {
	            p9.print(p7);
	            p9.print("  mNeedMenuInvalidate=");
	            p9.println(this.s);
	        }
	        if (this.k != null) {
	            p9.print(p7);
	            p9.print("  mNoTransactionsBecause=");
	            p9.println(this.k);
	        }
	        if ((this.p != null) && (this.p.size() > 0)) {
	            p9.print(p7);
	            p9.print("  mAvailIndices: ");
	            p9.println(java.util.Arrays.toString(this.p.toArray()));
	        }
	        return;
	    }
	
	
	    public final void a(m p3, q p4, j p5)
	    {
	        if (this.h == null) {
	            this.h = p3;
	            this.i = p4;
	            this.r = p5;
	            return;
	        } else {
	            throw new IllegalStateException("Already attached");
	        }
	    }
	
	
	    public final boolean a(android.view.Menu p8)
	    {
	        int v3;
	        if (this.c == null) {
	            v3 = 0;
	        } else {
	            int v1 = 0;
	            v3 = 0;
	            while (v1 < this.c.size()) {
	                boolean v0_5 = ((j) this.c.get(v1));
	                if (v0_5) {
	                    int v4_1;
	                    if (v0_5.E) {
	                        v4_1 = 0;
	                    } else {
	                        if ((!v0_5.I) || (!v0_5.J)) {
	                            v4_1 = 0;
	                        } else {
	                            v0_5.a(p8);
	                            v4_1 = 1;
	                        }
	                        if (v0_5.z != null) {
	                            v4_1 |= v0_5.z.a(p8);
	                        }
	                    }
	                    if (v4_1 != 0) {
	                        v3 = 1;
	                    }
	                }
	                v1++;
	            }
	        }
	        return v3;
	    }
	
	
	    public final boolean a(android.view.Menu p9, android.view.MenuInflater p10)
	    {
	        j v3_0;
	        int v5 = 0;
	        java.util.ArrayList v1_0 = 0;
	        if (this.c == null) {
	            v3_0 = 0;
	        } else {
	            int v4 = 0;
	            v3_0 = 0;
	            while (v4 < this.c.size()) {
	                int v0_13;
	                int v0_12 = ((j) this.c.get(v4));
	                if (v0_12 == 0) {
	                    v0_13 = v3_0;
	                } else {
	                    int v6_1;
	                    if (v0_12.E) {
	                        v6_1 = 0;
	                    } else {
	                        if ((!v0_12.I) || (!v0_12.J)) {
	                            v6_1 = 0;
	                        } else {
	                            v0_12.a(p9, p10);
	                            v6_1 = 1;
	                        }
	                        if (v0_12.z != null) {
	                            v6_1 |= v0_12.z.a(p9, p10);
	                        }
	                    }
	                    if (v6_1 == 0) {
	                    } else {
	                        if (v1_0 == null) {
	                            v1_0 = new java.util.ArrayList();
	                        }
	                        v1_0.add(v0_12);
	                        v0_13 = 1;
	                    }
	                }
	                v4++;
	                v3_0 = v0_13;
	            }
	        }
	        if (this.q != null) {
	            while (v5 < this.q.size()) {
	                if ((v1_0 == null) || (!v1_0.contains(((j) this.q.get(v5))))) {
	                    j.m();
	                }
	                v5++;
	            }
	        }
	        this.q = v1_0;
	        return v3_0;
	    }
	
	
	    public final boolean a(android.view.MenuItem p6)
	    {
	        int v2 = 0;
	        if (this.c != null) {
	            int v1 = 0;
	            while (v1 < this.c.size()) {
	                int v0_5 = ((j) this.c.get(v1));
	                if (v0_5 != 0) {
	                    int v0_8;
	                    if (v0_5.E) {
	                        v0_8 = 0;
	                    } else {
	                        if ((!v0_5.I) || ((!v0_5.J) || (!v0_5.a(p6)))) {
	                            if ((v0_5.z == null) || (!v0_5.z.a(p6))) {
	                            } else {
	                                v0_8 = 1;
	                            }
	                        } else {
	                            v0_8 = 1;
	                        }
	                    }
	                    if (v0_8 != 0) {
	                        v2 = 1;
	                        break;
	                    }
	                }
	                v1++;
	            }
	        }
	        return v2;
	    }
	
	
	    final boolean a(String p11, int p12, int p13)
	    {
	        int v3_0 = 0;
	        if (this.d != null) {
	            if ((p11 != null) || ((p12 >= 0) || ((p13 & 1) != 0))) {
	                int v0_2 = -1;
	                if ((p11 != null) || (p12 >= 0)) {
	                    f v1_0 = (this.d.size() - 1);
	                    while (v1_0 >= null) {
	                        int v0_7 = ((c) this.d.get(v1_0));
	                        if (((p11 != null) && (p11.equals(v0_7.f))) || ((p12 >= 0) && (p12 == v0_7.g))) {
	                            break;
	                        }
	                        v1_0--;
	                    }
	                    if (v1_0 < null) {
	                        return v3_0;
	                    } else {
	                        if ((p13 & 1) != 0) {
	                            v1_0--;
	                            while (v1_0 >= null) {
	                                int v0_12 = ((c) this.d.get(v1_0));
	                                if (((p11 == null) || (!p11.equals(v0_12.f))) && ((p12 < 0) || (p12 != v0_12.g))) {
	                                    break;
	                                }
	                                v1_0--;
	                            }
	                        }
	                        v0_2 = v1_0;
	                    }
	                }
	                if (v0_2 == (this.d.size() - 1)) {
	                    return v3_0;
	                } else {
	                    java.util.ArrayList v6_1 = new java.util.ArrayList();
	                    f v1_6 = (this.d.size() - 1);
	                    while (v1_6 > v0_2) {
	                        v6_1.add(this.d.remove(v1_6));
	                        v1_6--;
	                    }
	                    int v7 = (v6_1.size() - 1);
	                    android.util.SparseArray v8_1 = new android.util.SparseArray();
	                    android.util.SparseArray v9_1 = new android.util.SparseArray();
	                    f v1_7 = 0;
	                    while (v1_7 <= v7) {
	                        ((c) v6_1.get(v1_7)).a(v8_1, v9_1);
	                        v1_7++;
	                    }
	                    f v5_4 = 0;
	                    int v4_1 = 0;
	                    while (v4_1 <= v7) {
	                        f v1_8;
	                        if (v4_1 != v7) {
	                            v1_8 = 0;
	                        } else {
	                            v1_8 = 1;
	                        }
	                        f v1_9 = ((c) v6_1.get(v4_1)).a(v1_8, v5_4, v8_1, v9_1);
	                        v4_1++;
	                        v5_4 = v1_9;
	                    }
	                }
	            } else {
	                int v0_23 = (this.d.size() - 1);
	                if (v0_23 < 0) {
	                    return v3_0;
	                } else {
	                    int v0_25 = ((c) this.d.remove(v0_23));
	                    f v1_12 = new android.util.SparseArray();
	                    int v3_2 = new android.util.SparseArray();
	                    v0_25.a(v1_12, v3_2);
	                    v0_25.a(1, 0, v1_12, v3_2);
	                }
	            }
	            v3_0 = 1;
	        }
	        return v3_0;
	    }
	
	
	    public final void b(android.view.Menu p4)
	    {
	        if (this.c != null) {
	            int v1 = 0;
	            while (v1 < this.c.size()) {
	                t v0_6 = ((j) this.c.get(v1));
	                if ((v0_6 != null) && ((!v0_6.E) && (v0_6.z != null))) {
	                    v0_6.z.b(p4);
	                }
	                v1++;
	            }
	        }
	        return;
	    }
	
	
	    public final void b(j p4, int p5, int p6)
	    {
	        if (!p4.E) {
	            p4.E = 1;
	            if (p4.N != null) {
	                boolean v0_3 = this.a(p4, p5, 0, p6);
	                if (v0_3) {
	                    p4.N.startAnimation(v0_3);
	                }
	                p4.N.setVisibility(8);
	            }
	            if ((p4.q) && ((p4.I) && (p4.J))) {
	                this.s = 1;
	            }
	            j.g();
	        }
	        return;
	    }
	
	
	    public final boolean b()
	    {
	        return this.h();
	    }
	
	
	    public final boolean b(android.view.MenuItem p6)
	    {
	        int v2 = 0;
	        if (this.c != null) {
	            int v1 = 0;
	            while (v1 < this.c.size()) {
	                int v0_5 = ((j) this.c.get(v1));
	                if (v0_5 != 0) {
	                    if ((v0_5.E) || ((v0_5.z == null) || (!v0_5.z.b(p6)))) {
	                        int v0_8 = 0;
	                    } else {
	                        v0_8 = 1;
	                    }
	                    if (v0_8 != 0) {
	                        v2 = 1;
	                        break;
	                    }
	                }
	                v1++;
	            }
	        }
	        return v2;
	    }
	
	
	    public final boolean b(String p3, int p4)
	    {
	        this.r();
	        this.h();
	        return this.a(p3, -1, 1);
	    }
	
	
	    public final void c()
	    {
	        this.a(new v(this), 0);
	        return;
	    }
	
	
	    public final void c(j p5, int p6, int p7)
	    {
	        if (p5.E) {
	            p5.E = 0;
	            if (p5.N != null) {
	                boolean v0_2 = this.a(p5, p6, 1, p7);
	                if (v0_2) {
	                    p5.N.startAnimation(v0_2);
	                }
	                p5.N.setVisibility(0);
	            }
	            if ((p5.q) && ((p5.I) && (p5.J))) {
	                this.s = 1;
	            }
	            j.g();
	        }
	        return;
	    }
	
	
	    public final void d(j p7, int p8, int p9)
	    {
	        if (!p7.F) {
	            p7.F = 1;
	            if (p7.q) {
	                if (this.c != null) {
	                    this.c.remove(p7);
	                }
	                if ((p7.I) && (p7.J)) {
	                    this.s = 1;
	                }
	                p7.q = 0;
	                this.a(p7, 1, p8, p9, 0);
	            }
	        }
	        return;
	    }
	
	
	    public final boolean d()
	    {
	        this.r();
	        this.h();
	        return this.a(0, -1, 0);
	    }
	
	
	    public final int e()
	    {
	        int v0_1;
	        if (this.d == null) {
	            v0_1 = 0;
	        } else {
	            v0_1 = this.d.size();
	        }
	        return v0_1;
	    }
	
	
	    public final void e(j p7, int p8, int p9)
	    {
	        if (p7.F) {
	            p7.F = 0;
	            if (!p7.q) {
	                if (this.c == null) {
	                    this.c = new java.util.ArrayList();
	                }
	                if (!this.c.contains(p7)) {
	                    this.c.add(p7);
	                    p7.q = 1;
	                    if ((p7.I) && (p7.J)) {
	                        this.s = 1;
	                    }
	                    this.a(p7, this.g, p8, p9, 0);
	                } else {
	                    throw new IllegalStateException(new StringBuilder("Fragment already added: ").append(p7).toString());
	                }
	            }
	        }
	        return;
	    }
	
	
	    public final java.util.List f()
	    {
	        return this.b;
	    }
	
	
	    final void g()
	    {
	        if (this.b != null) {
	            int v1 = 0;
	            while (v1 < this.b.size()) {
	                int v0_6 = ((j) this.b.get(v1));
	                if (v0_6 != 0) {
	                    this.a(v0_6);
	                }
	                v1++;
	            }
	        }
	        return;
	    }
	
	
	    public final boolean h()
	    {
	        if (!this.o) {
	            if (android.os.Looper.myLooper() == this.h.a.getLooper()) {
	                int v1_2 = 0;
	                while ((this.m != null) && (this.m.size() != 0)) {
	                    int v3_6 = this.m.size();
	                    if ((this.n == null) || (this.n.length < v3_6)) {
	                        int v1_7 = new Runnable[v3_6];
	                        this.n = v1_7;
	                    }
	                    this.m.toArray(this.n);
	                    this.m.clear();
	                    this.h.a.removeCallbacks(this.x);
	                    this.o = 1;
	                    int v1_12 = 0;
	                    while (v1_12 < v3_6) {
	                        this.n[v1_12].run();
	                        this.n[v1_12] = 0;
	                        v1_12++;
	                    }
	                    this.o = 0;
	                    v1_2 = 1;
	                }
	                if (this.u) {
	                    int v3_7 = 0;
	                    int v4_5 = 0;
	                    while (v3_7 < this.b.size()) {
	                        boolean v0_7 = ((j) this.b.get(v3_7));
	                        if ((v0_7) && (v0_7.R != null)) {
	                            v4_5 |= v0_7.R.a();
	                        }
	                        v3_7++;
	                    }
	                    if (v4_5 == 0) {
	                        this.u = 0;
	                        this.g();
	                    }
	                }
	                return v1_2;
	            } else {
	                throw new IllegalStateException("Must be called from main thread of process");
	            }
	        } else {
	            throw new IllegalStateException("Recursive entry to executePendingTransactions");
	        }
	    }
	
	
	    final android.os.Parcelable i()
	    {
	        g[] v2 = 0;
	        this.h();
	        if (t.l) {
	            this.j = 1;
	        }
	        if ((this.b != null) && (this.b.size() > 0)) {
	            String v6_0 = this.b.size();
	            ad[] v7 = new ad[v6_0];
	            int v5_0 = 0;
	            android.os.Bundle v1_0 = 0;
	            while (v5_0 < v6_0) {
	                int v0_26;
	                int v0_25 = ((j) this.b.get(v5_0));
	                if (v0_25 == 0) {
	                    v0_26 = v1_0;
	                } else {
	                    if (v0_25.k < 0) {
	                        this.a(new IllegalStateException(new StringBuilder("Failure saving state: active ").append(v0_25).append(" has cleared index: ").append(v0_25.k).toString()));
	                    }
	                    String v8_12 = new ad(v0_25);
	                    v7[v5_0] = v8_12;
	                    if ((v0_25.f <= 0) || (v8_12.j != null)) {
	                        v8_12.j = v0_25.i;
	                    } else {
	                        if (this.v == null) {
	                            this.v = new android.os.Bundle();
	                        }
	                        android.os.Bundle v1_13;
	                        v0_25.g(this.v);
	                        if (this.v.isEmpty()) {
	                            v1_13 = 0;
	                        } else {
	                            v1_13 = this.v;
	                            this.v = 0;
	                        }
	                        if (v0_25.N != null) {
	                            this.c(v0_25);
	                        }
	                        if (v0_25.j != null) {
	                            if (v1_13 == null) {
	                                v1_13 = new android.os.Bundle();
	                            }
	                            v1_13.putSparseParcelableArray("android:view_state", v0_25.j);
	                        }
	                        if (!v0_25.Q) {
	                            if (v1_13 == null) {
	                                v1_13 = new android.os.Bundle();
	                            }
	                            v1_13.putBoolean("android:user_visible_hint", v0_25.Q);
	                        }
	                        v8_12.j = v1_13;
	                        if (v0_25.n != null) {
	                            if (v0_25.n.k < 0) {
	                                this.a(new IllegalStateException(new StringBuilder("Failure saving state: ").append(v0_25).append(" has target not in fragment manager: ").append(v0_25.n).toString()));
	                            }
	                            if (v8_12.j == null) {
	                                v8_12.j = new android.os.Bundle();
	                            }
	                            android.os.Bundle v1_24 = v8_12.j;
	                            int v10_5 = v0_25.n;
	                            if (v10_5.k < 0) {
	                                this.a(new IllegalStateException(new StringBuilder("Fragment ").append(v10_5).append(" is not currently in the FragmentManager").toString()));
	                            }
	                            v1_24.putInt("android:target_state", v10_5.k);
	                            if (v0_25.p != 0) {
	                                v8_12.j.putInt("android:target_req_state", v0_25.p);
	                                v0_26 = 1;
	                                v5_0++;
	                                v1_0 = v0_26;
	                            }
	                        }
	                    }
	                    v0_26 = 1;
	                }
	            }
	            if (v1_0 != null) {
	                android.os.Bundle v1_1;
	                if (this.c == null) {
	                    v1_1 = 0;
	                } else {
	                    int v5_1 = this.c.size();
	                    if (v5_1 <= 0) {
	                    } else {
	                        v1_1 = new int[v5_1];
	                        int v3_1 = 0;
	                        while (v3_1 < v5_1) {
	                            v1_1[v3_1] = ((j) this.c.get(v3_1)).k;
	                            if (v1_1[v3_1] < null) {
	                                this.a(new IllegalStateException(new StringBuilder("Failure saving state: active ").append(this.c.get(v3_1)).append(" has cleared index: ").append(v1_1[v3_1]).toString()));
	                            }
	                            v3_1++;
	                        }
	                    }
	                }
	                if (this.d != null) {
	                    int v5_2 = this.d.size();
	                    if (v5_2 > 0) {
	                        v2 = new g[v5_2];
	                        int v3_2 = 0;
	                        while (v3_2 < v5_2) {
	                            v2[v3_2] = new g(((c) this.d.get(v3_2)));
	                            v3_2++;
	                        }
	                    }
	                }
	                int v0_10 = new aa();
	                v0_10.a = v7;
	                v0_10.b = v1_1;
	                v0_10.c = v2;
	                v2 = v0_10;
	            }
	        }
	        return v2;
	    }
	
	
	    public final void j()
	    {
	        this.j = 0;
	        this.a(1, 0);
	        return;
	    }
	
	
	    public final void k()
	    {
	        this.j = 0;
	        this.a(2, 0);
	        return;
	    }
	
	
	    public final void l()
	    {
	        this.j = 0;
	        this.a(4, 0);
	        return;
	    }
	
	
	    public final void m()
	    {
	        this.j = 0;
	        this.a(5, 0);
	        return;
	    }
	
	
	    public final void n()
	    {
	        this.a(4, 0);
	        return;
	    }
	
	
	    public final void o()
	    {
	        this.j = 1;
	        this.a(3, 0);
	        return;
	    }
	
	
	    public final void p()
	    {
	        this.t = 1;
	        this.h();
	        this.a(0, 0);
	        this.h = 0;
	        this.i = 0;
	        this.r = 0;
	        return;
	    }
	
	
	    public final void q()
	    {
	        if (this.c != null) {
	            int v1 = 0;
	            while (v1 < this.c.size()) {
	                t v0_6 = ((j) this.c.get(v1));
	                if (v0_6 != null) {
	                    v0_6.onLowMemory();
	                    if (v0_6.z != null) {
	                        v0_6.z.q();
	                    }
	                }
	                v1++;
	            }
	        }
	        return;
	    }
	
	
	    public final String toString()
	    {
	        String v0_1 = new StringBuilder(128);
	        v0_1.append("FragmentManager{");
	        v0_1.append(Integer.toHexString(System.identityHashCode(this)));
	        v0_1.append(" in ");
	        if (this.r == null) {
	            a.a(this.h, v0_1);
	        } else {
	            a.a(this.r, v0_1);
	        }
	        v0_1.append("}}");
	        return v0_1.toString();
	    }
	
