	private static  f
	private  g
	private  h
	private I i
	private Landroid.view.View j
	private android.util.SparseIntArray k
	private android.util.SparseIntArray l
	private xt m
	private android.graphics.Rect n
	
	    static xq()
	    {
	        xq.f = android.view.View$MeasureSpec.makeMeasureSpec(0, 0);
	        return;
	    }
	
	
	    public xq(android.content.Context p4, int p5)
	    {
	        this(p4);
	        this.g = 0;
	        this.h = -1;
	        this.k = new android.util.SparseIntArray();
	        this.l = new android.util.SparseIntArray();
	        this.m = new xr();
	        this.n = new android.graphics.Rect();
	        if (p5 != this.h) {
	            this.g = 1;
	            if (p5 > 0) {
	                this.h = p5;
	                this.m.a.clear();
	            } else {
	                throw new IllegalArgumentException(new StringBuilder("Span count should be at least 1. Provided ").append(p5).toString());
	            }
	        }
	        return;
	    }
	
	
	    private static int a(int p2, int p3, int p4)
	    {
	        if ((p3 != 0) || (p4 != 0)) {
	            int v0 = android.view.View$MeasureSpec.getMode(p2);
	            if ((v0 == -2147483648) || (v0 == 1073741824)) {
	                p2 = android.view.View$MeasureSpec.makeMeasureSpec(((android.view.View$MeasureSpec.getSize(p2) - p3) - p4), v0);
	            }
	        }
	        return p2;
	    }
	
	
	    private int a(zl p4, zp p5, int p6)
	    {
	        int v0_2;
	        if (p5.j) {
	            int v0_1 = p4.a(p6);
	            if (v0_1 != -1) {
	                v0_2 = this.m.b(v0_1, this.h);
	            } else {
	                android.util.Log.w("GridLayoutManager", new StringBuilder("Cannot find span size for pre layout position. ").append(p6).toString());
	                v0_2 = 0;
	            }
	        } else {
	            v0_2 = this.m.b(p6, this.h);
	        }
	        return v0_2;
	    }
	
	
	    private void a(android.view.View p5, int p6, int p7)
	    {
	        int v0_0 = this.n;
	        if (this.e != null) {
	            v0_0.set(this.e.c(p5));
	        } else {
	            v0_0.set(0, 0, 0, 0);
	        }
	        int v0_2 = ((zi) p5.getLayoutParams());
	        p5.measure(xq.a(p6, (v0_2.leftMargin + this.n.left), (v0_2.rightMargin + this.n.right)), xq.a(p7, (v0_2.topMargin + this.n.top), (v0_2.bottomMargin + this.n.bottom)));
	        return;
	    }
	
	
	    private void a(zl p9, zp p10, int p11, boolean p12)
	    {
	        int v0_0;
	        int v1;
	        if (!p12) {
	            v0_0 = (p11 - 1);
	            v1 = -1;
	            p11 = -1;
	        } else {
	            v1 = 1;
	            v0_0 = 0;
	        }
	        if ((this.a != 1) || (!this.k())) {
	            int v5_2 = 0;
	            int v4_1 = 1;
	        } else {
	            v5_2 = (this.h - 1);
	            v4_1 = -1;
	        }
	        int v6 = v5_2;
	        int v5_3 = v0_0;
	        while (v5_3 != p11) {
	            int v7_0 = this.j[v5_3];
	            int v0_3 = ((xs) v7_0.getLayoutParams());
	            xs.a(v0_3, this.c(p9, p10, xq.a(v7_0)));
	            if ((v4_1 != -1) || (xs.b(v0_3) <= 1)) {
	                xs.b(v0_3, v6);
	            } else {
	                xs.b(v0_3, (v6 - (xs.b(v0_3) - 1)));
	            }
	            v6 += (xs.b(v0_3) * v4_1);
	            v5_3 += v1;
	        }
	        return;
	    }
	
	
	    private int b(zl p4, zp p5, int p6)
	    {
	        int v0_2;
	        if (p5.j) {
	            v0_2 = this.l.get(p6, -1);
	            if (v0_2 == -1) {
	                int v0_3 = p4.a(p6);
	                if (v0_3 != -1) {
	                    v0_2 = this.m.a(v0_3, this.h);
	                } else {
	                    android.util.Log.w("GridLayoutManager", new StringBuilder("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:").append(p6).toString());
	                    v0_2 = 0;
	                }
	            }
	        } else {
	            v0_2 = this.m.a(p6, this.h);
	        }
	        return v0_2;
	    }
	
	
	    private int c(zl p5, zp p6, int p7)
	    {
	        int v0 = 1;
	        if (p6.j) {
	            String v1_2 = this.k.get(p7, -1);
	            if (v1_2 == -1) {
	                if (p5.a(p7) == -1) {
	                    android.util.Log.w("GridLayoutManager", new StringBuilder("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:").append(p7).toString());
	                }
	            } else {
	                v0 = v1_2;
	            }
	        }
	        return v0;
	    }
	
	
	    private static int g(int p1)
	    {
	        int v0_1;
	        if (p1 >= 0) {
	            v0_1 = android.view.View$MeasureSpec.makeMeasureSpec(p1, 1073741824);
	        } else {
	            v0_1 = xq.f;
	        }
	        return v0_1;
	    }
	
	
	    public final int a(zl p2, zp p3)
	    {
	        int v0_4;
	        if (this.a != 0) {
	            if (p3.a() > 0) {
	                v0_4 = this.a(p2, p3, (p3.a() - 1));
	            } else {
	                v0_4 = 0;
	            }
	        } else {
	            v0_4 = this.h;
	        }
	        return v0_4;
	    }
	
	
	    final android.view.View a(zl p8, zp p9, int p10, int p11, int p12)
	    {
	        int v1;
	        int v2 = 0;
	        this.l();
	        int v5 = this.b.b();
	        int v6 = this.b.c();
	        if (p11 <= p10) {
	            v1 = -1;
	        } else {
	            v1 = 1;
	        }
	        int v4 = 0;
	        while (p10 != p11) {
	            int v0_14;
	            int v3 = this.f(p10);
	            int v0_4 = xq.a(v3);
	            if ((v0_4 < 0) || ((v0_4 >= p12) || (this.b(p8, p9, v0_4) != 0))) {
	                v0_14 = v2;
	                v3 = v4;
	            } else {
	                if (!((zi) v3.getLayoutParams()).c.n()) {
	                    if ((this.b.a(v3) < v6) && (this.b.b(v3) >= v5)) {
	                        return v3;
	                    } else {
	                        if (v2 != 0) {
	                        } else {
	                            v0_14 = v3;
	                            v3 = v4;
	                        }
	                    }
	                } else {
	                    if (v4 != 0) {
	                    } else {
	                        v0_14 = v2;
	                    }
	                }
	            }
	            p10 += v1;
	            v2 = v0_14;
	            v4 = v3;
	        }
	        if (v2 == 0) {
	            v3 = v4;
	        } else {
	            v3 = v2;
	        }
	        return v3;
	    }
	
	
	    public final zi a(android.content.Context p2, android.util.AttributeSet p3)
	    {
	        return new xs(p2, p3);
	    }
	
	
	    public final zi a(android.view.ViewGroup$LayoutParams p2)
	    {
	        xs v0_2;
	        if (!(p2 instanceof android.view.ViewGroup$MarginLayoutParams)) {
	            v0_2 = new xs(p2);
	        } else {
	            v0_2 = new xs(((android.view.ViewGroup$MarginLayoutParams) p2));
	        }
	        return v0_2;
	    }
	
	
	    public final void a()
	    {
	        this.m.a.clear();
	        return;
	    }
	
	
	    public final void a(zl p9, zp p10, android.view.View p11, jd p12)
	    {
	        jm v0_0 = p11.getLayoutParams();
	        if ((v0_0 instanceof xs)) {
	            int v6_1 = ((xs) v0_0);
	            int v2 = this.a(p9, p10, v6_1.c.d());
	            if (this.a != 0) {
	                if ((this.h <= 1) || (v6_1.b != this.h)) {
	                    int v6_2 = 0;
	                } else {
	                    v6_2 = 1;
	                }
	                p12.a(jm.a(v2, 1, v6_1.a, v6_1.b, v6_2, 0));
	            } else {
	                if ((this.h <= 1) || (v6_1.b != this.h)) {
	                    int v4_3 = 0;
	                } else {
	                    v4_3 = 1;
	                }
	                p12.a(jm.a(v6_1.a, v6_1.b, v2, 1, v4_3, 0));
	            }
	        } else {
	            super.a(p11, p12);
	        }
	        return;
	    }
	
	
	    final void a(zl p9, zp p10, xx p11)
	    {
	        int v0_3;
	        int v2 = 0;
	        super.a(p9, p10, p11);
	        if (this.a != 1) {
	            v0_3 = ((this.p() - this.t()) - this.r());
	        } else {
	            v0_3 = ((this.o() - this.s()) - this.q());
	        }
	        if ((this.i == null) || ((this.i.length != (this.h + 1)) || (this.i[(this.i.length - 1)] != v0_3))) {
	            int[] v3_11 = new int[(this.h + 1)];
	            this.i = v3_11;
	        }
	        this.i[0] = 0;
	        int v4_5 = (v0_3 / this.h);
	        int v5 = (v0_3 % this.h);
	        int v0_6 = 1;
	        int v1_1 = 0;
	        while (v0_6 <= this.h) {
	            int[] v3_17;
	            int[] v3_16 = (v1_1 + v5);
	            if ((v3_16 <= null) || ((this.h - v3_16) >= v5)) {
	                v1_1 = v3_16;
	                v3_17 = v4_5;
	            } else {
	                v1_1 = (v3_16 - this.h);
	                v3_17 = (v4_5 + 1);
	            }
	            v2 += v3_17;
	            this.i[v0_6] = v2;
	            v0_6++;
	        }
	        if ((p10.a() > 0) && (!p10.j)) {
	            int v0_10 = this.b(p9, p10, p11.a);
	            while ((v0_10 > 0) && (p11.a > 0)) {
	                p11.a = (p11.a - 1);
	                v0_10 = this.b(p9, p10, p11.a);
	            }
	        }
	        if ((this.j == null) || (this.j.length != this.h)) {
	            int v0_16 = new android.view.View[this.h];
	            this.j = v0_16;
	        }
	        return;
	    }
	
	
	    final void a(zl p16, zp p17, xz p18, xy p19)
	    {
	        int v3_1;
	        if (p18.e != 1) {
	            v3_1 = 0;
	        } else {
	            v3_1 = 1;
	        }
	        int v4_0 = 0;
	        int v2_3 = this.h;
	        if (v3_1 == 0) {
	            v2_3 = (this.b(p16, p17, p18.d) + this.c(p16, p17, p18.d));
	        }
	        while ((v4_0 < this.h) && ((p18.a(p17)) && (v2_3 > 0))) {
	            int v5_4 = p18.d;
	            int v6_0 = this.c(p16, p17, v5_4);
	            if (v6_0 <= this.h) {
	                v2_3 -= v6_0;
	                if (v2_3 < 0) {
	                    break;
	                }
	                int v5_5 = p18.a(p16);
	                if (v5_5 == 0) {
	                    break;
	                }
	                this.j[v4_0] = v5_5;
	                v4_0++;
	            } else {
	                throw new IllegalArgumentException(new StringBuilder("Item at position ").append(v5_4).append(" requires ").append(v6_0).append(" spans but GridLayoutManager has only ").append(this.h).append(" spans.").toString());
	            }
	        }
	        if (v4_0 != 0) {
	            int v5_6 = 0;
	            this.a(p16, p17, v4_0, v3_1);
	            int v6_1 = 0;
	            while (v6_1 < v4_0) {
	                int v7_8 = this.j[v6_1];
	                if (p18.j != null) {
	                    if (v3_1 == 0) {
	                        super.a(v7_8, 0, 1);
	                    } else {
	                        super.a(v7_8, -1, 1);
	                    }
	                } else {
	                    if (v3_1 == 0) {
	                        super.a(v7_8, 0, 0);
	                    } else {
	                        super.a(v7_8, -1, 0);
	                    }
	                }
	                int v2_37 = ((xs) v7_8.getLayoutParams());
	                int v8_13 = android.view.View$MeasureSpec.makeMeasureSpec((this.i[(xs.a(v2_37) + xs.b(v2_37))] - this.i[xs.a(v2_37)]), 1073741824);
	                if (this.a != 1) {
	                    this.a(v7_8, xq.g(v2_37.width), v8_13);
	                } else {
	                    this.a(v7_8, v8_13, xq.g(v2_37.height));
	                }
	                int v2_43 = this.b.c(v7_8);
	                if (v2_43 <= v5_6) {
	                    v2_43 = v5_6;
	                }
	                v6_1++;
	                v5_6 = v2_43;
	            }
	            int v6_2 = xq.g(v5_6);
	            int v3_2 = 0;
	            while (v3_2 < v4_0) {
	                int v7_7 = this.j[v3_2];
	                if (this.b.c(v7_7) != v5_6) {
	                    int v2_24 = ((xs) v7_7.getLayoutParams());
	                    int v2_28 = android.view.View$MeasureSpec.makeMeasureSpec((this.i[(xs.a(v2_24) + xs.b(v2_24))] - this.i[xs.a(v2_24)]), 1073741824);
	                    if (this.a != 1) {
	                        this.a(v7_7, v6_2, v2_28);
	                    } else {
	                        this.a(v7_7, v2_28, v6_2);
	                    }
	                }
	                v3_2++;
	            }
	            int v5_7;
	            int v6_5;
	            p19.a = v5_6;
	            int v3_3 = 0;
	            int v2_8 = 0;
	            if (this.a != 1) {
	                if (p18.f != -1) {
	                    v6_5 = p18.b;
	                    v5_7 = (v5_6 + v6_5);
	                } else {
	                    int v6_6 = p18.b;
	                    v6_5 = (v6_6 - v5_6);
	                    v5_7 = v6_6;
	                }
	            } else {
	                if (p18.f != -1) {
	                    v3_3 = p18.b;
	                    v2_8 = (v3_3 + v5_6);
	                    v5_7 = 0;
	                    v6_5 = 0;
	                } else {
	                    v2_8 = p18.b;
	                    v3_3 = (v2_8 - v5_6);
	                    v5_7 = 0;
	                    v6_5 = 0;
	                }
	            }
	            int v8_1 = 0;
	            int v7_4 = v6_5;
	            int v6_7 = v5_7;
	            int v5_9 = v3_3;
	            int v3_5 = v2_8;
	            while (v8_1 < v4_0) {
	                boolean v9_1 = this.j[v8_1];
	                int v2_13 = ((xs) v9_1.getLayoutParams());
	                if (this.a != 1) {
	                    v5_9 = (this.i[xs.a(v2_13)] + this.r());
	                    v3_5 = (this.b.d(v9_1) + v5_9);
	                } else {
	                    v7_4 = (this.i[xs.a(v2_13)] + this.q());
	                    v6_7 = (this.b.d(v9_1) + v7_4);
	                }
	                xq.a(v9_1, (v2_13.leftMargin + v7_4), (v2_13.topMargin + v5_9), (v6_7 - v2_13.rightMargin), (v3_5 - v2_13.bottomMargin));
	                if ((v2_13.c.n()) || (v2_13.c.l())) {
	                    p19.c = 1;
	                }
	                p19.d = (p19.d | v9_1.isFocusable());
	                v8_1++;
	            }
	            java.util.Arrays.fill(this.j, 0);
	        } else {
	            p19.b = 1;
	        }
	        return;
	    }
	
	
	    public final boolean a(zi p2)
	    {
	        return (p2 instanceof xs);
	    }
	
	
	    public final int b(zl p3, zp p4)
	    {
	        int v0_4;
	        if (this.a != 1) {
	            if (p4.a() > 0) {
	                v0_4 = this.a(p3, p4, (p4.a() - 1));
	            } else {
	                v0_4 = 0;
	            }
	        } else {
	            v0_4 = this.h;
	        }
	        return v0_4;
	    }
	
	
	    public final void b()
	    {
	        this.m.a.clear();
	        return;
	    }
	
	
	    public final void c()
	    {
	        this.m.a.clear();
	        return;
	    }
	
	
	    public final void c(zl p8, zp p9)
	    {
	        if (p9.j) {
	            int v3 = this.n();
	            int v1 = 0;
	            while (v1 < v3) {
	                int v0_6 = ((xs) this.f(v1).getLayoutParams());
	                int v4_1 = v0_6.c.d();
	                this.k.put(v4_1, v0_6.b);
	                this.l.put(v4_1, v0_6.a);
	                v1++;
	            }
	        }
	        super.c(p8, p9);
	        this.k.clear();
	        this.l.clear();
	        if (!p9.j) {
	            this.g = 0;
	        }
	        return;
	    }
	
	
	    public final void d()
	    {
	        this.m.a.clear();
	        return;
	    }
	
	
	    public final void e()
	    {
	        this.m.a.clear();
	        return;
	    }
	
	
	    public final zi f()
	    {
	        return new xs(-2, -2);
	    }
	
	
	    public final boolean g()
	    {
	        if ((this.c != null) || (this.g)) {
	            int v0_2 = 0;
	        } else {
	            v0_2 = 1;
	        }
	        return v0_2;
	    }
	
