	  a
	 yq b
	 ya c
	private xz f
	private  g
	private  h
	private  i
	private  j
	private  k
	private  l
	private  m
	private xx n
	
	    private xw(int p5, boolean p6)
	    {
	        this.h = 0;
	        this.i = 0;
	        this.j = 0;
	        this.k = 1;
	        this.l = -1;
	        this.m = -2147483648;
	        this.c = 0;
	        this.n = new xx(this);
	        this.a(1);
	        this.a(0);
	        if (0 != this.h) {
	            this.h = 0;
	            this.m();
	        }
	        return;
	    }
	
	
	    public xw(android.content.Context p3)
	    {
	        this(1, 0);
	        return;
	    }
	
	
	    private int a(int p4, zl p5, zp p6, boolean p7)
	    {
	        int v0_3;
	        int v0_2 = (this.b.c() - p4);
	        if (v0_2 <= 0) {
	            v0_3 = 0;
	        } else {
	            v0_3 = (- this.d((- v0_2), p5, p6));
	            if (p7) {
	                int v1_1 = (this.b.c() - (p4 + v0_3));
	                if (v1_1 > 0) {
	                    this.b.a(v1_1);
	                    v0_3 += v1_1;
	                }
	            }
	        }
	        return v0_3;
	    }
	
	
	    private int a(zl p9, xz p10, zp p11, boolean p12)
	    {
	        int v1 = p10.c;
	        if (p10.g != -2147483648) {
	            if (p10.c < 0) {
	                p10.g = (p10.g + p10.c);
	            }
	            this.a(p9, p10);
	        }
	        int v0_5 = (p10.c + p10.h);
	        int v2_3 = new xy();
	        while ((v0_5 > 0) && (p10.a(p11))) {
	            v2_3.a = 0;
	            v2_3.b = 0;
	            v2_3.c = 0;
	            v2_3.d = 0;
	            this.a(p9, p11, p10, v2_3);
	            if (v2_3.b) {
	                break;
	            }
	            p10.b = (p10.b + (v2_3.a * p10.f));
	            if ((!v2_3.c) || ((this.f.j != null) || (!p11.j))) {
	                p10.c = (p10.c - v2_3.a);
	                v0_5 -= v2_3.a;
	            }
	            if (p10.g != -2147483648) {
	                p10.g = (p10.g + v2_3.a);
	                if (p10.c < 0) {
	                    p10.g = (p10.g + p10.c);
	                }
	                this.a(p9, p10);
	            }
	            if ((p12) && (v2_3.d)) {
	                break;
	            }
	        }
	        return (v1 - p10.c);
	    }
	
	
	    private android.view.View a(int p8, int p9, boolean p10, boolean p11)
	    {
	        int v0_2;
	        this.l();
	        int v3 = this.b.b();
	        int v4 = this.b.c();
	        if (p9 <= p8) {
	            v0_2 = -1;
	        } else {
	            v0_2 = 1;
	        }
	        int v2 = 0;
	        while (p8 != p9) {
	            int v1 = this.f(p8);
	            int v5_1 = this.b.a(v1);
	            int v6_1 = this.b.b(v1);
	            if ((v5_1 >= v4) || (v6_1 <= v3)) {
	                v1 = v2;
	            } else {
	                if ((p10) && ((v5_1 < v3) || (v6_1 > v4))) {
	                    if ((!p11) || (v2 != 0)) {
	                    }
	                } else {
	                    return v1;
	                }
	            }
	            p8 += v0_2;
	            v2 = v1;
	        }
	        v1 = v2;
	        return v1;
	    }
	
	
	    private android.view.View a(boolean p4, boolean p5)
	    {
	        android.view.View v0_2;
	        if (!this.i) {
	            v0_2 = this.a(0, this.n(), p4, 1);
	        } else {
	            v0_2 = this.a((this.n() - 1), -1, p4, 1);
	        }
	        return v0_2;
	    }
	
	
	    private void a(int p4, int p5)
	    {
	        xz v0_2;
	        this.f.c = (this.b.c() - p5);
	        if (!this.i) {
	            v0_2 = 1;
	        } else {
	            v0_2 = -1;
	        }
	        this.f.e = v0_2;
	        this.f.d = p4;
	        this.f.f = 1;
	        this.f.b = p5;
	        this.f.g = -2147483648;
	        return;
	    }
	
	
	    private void a(int p7, int p8, boolean p9, zp p10)
	    {
	        int v0_6;
	        int v0_0 = -1;
	        xz v1_0 = 1;
	        this.f.h = this.g(p10);
	        this.f.f = p7;
	        if (p7 != 1) {
	            int v2_2 = this.v();
	            int v3_1 = this.f;
	            v3_1.h = (v3_1.h + this.b.b());
	            if (!this.i) {
	                v1_0 = -1;
	            }
	            this.f.e = v1_0;
	            this.f.d = (xw.a(v2_2) + this.f.e);
	            this.f.b = this.b.a(v2_2);
	            v0_6 = ((- this.b.a(v2_2)) + this.b.b());
	        } else {
	            int v2_3 = this.f;
	            v2_3.h = (v2_3.h + this.b.f());
	            int v2_4 = this.w();
	            if (!this.i) {
	                v0_0 = 1;
	            }
	            this.f.e = v0_0;
	            this.f.d = (xw.a(v2_4) + this.f.e);
	            this.f.b = this.b.b(v2_4);
	            v0_6 = (this.b.b(v2_4) - this.b.c());
	        }
	        this.f.c = p8;
	        if (p9) {
	            xz v1_14 = this.f;
	            v1_14.c = (v1_14.c - v0_6);
	        }
	        this.f.g = v0_6;
	        return;
	    }
	
	
	    private void a(xx p3)
	    {
	        this.a(p3.a, p3.b);
	        return;
	    }
	
	
	    private void a(zl p2, int p3, int p4)
	    {
	        if (p3 != p4) {
	            if (p4 > p3) {
	                int v0 = (p4 - 1);
	                while (v0 >= p3) {
	                    this.a(v0, p2);
	                    v0--;
	                }
	                return;
	            }
	            while (p3 > p4) {
	                this.a(p3, p2);
	                p3--;
	            }
	        }
	        return;
	    }
	
	
	    private void a(zl p7, xz p8)
	    {
	        if (p8.a) {
	            if (p8.f != -1) {
	                int v2_1 = p8.g;
	                if (v2_1 >= 0) {
	                    int v3_0 = this.n();
	                    if (!this.i) {
	                        int v0_3 = 0;
	                        while (v0_3 < v3_0) {
	                            if (this.b.b(this.f(v0_3)) <= v2_1) {
	                                v0_3++;
	                            } else {
	                                this.a(p7, 0, v0_3);
	                                break;
	                            }
	                        }
	                    } else {
	                        int v0_4 = (v3_0 - 1);
	                        while (v0_4 >= 0) {
	                            if (this.b.b(this.f(v0_4)) <= v2_1) {
	                                v0_4--;
	                            } else {
	                                this.a(p7, (v3_0 - 1), v0_4);
	                                break;
	                            }
	                        }
	                    }
	                }
	            } else {
	                int v0_5 = p8.g;
	                int v2_2 = this.n();
	                if (v0_5 >= 0) {
	                    int v3_3 = (this.b.d() - v0_5);
	                    if (!this.i) {
	                        int v0_7 = (v2_2 - 1);
	                        while (v0_7 >= 0) {
	                            if (this.b.a(this.f(v0_7)) >= v3_3) {
	                                v0_7--;
	                            } else {
	                                this.a(p7, (v2_2 - 1), v0_7);
	                                break;
	                            }
	                        }
	                    } else {
	                        int v0_8 = 0;
	                        while (v0_8 < v2_2) {
	                            if (this.b.a(this.f(v0_8)) >= v3_3) {
	                                v0_8++;
	                            } else {
	                                this.a(p7, 0, v0_8);
	                                break;
	                            }
	                        }
	                    }
	                }
	            }
	        }
	        return;
	    }
	
	
	    private void a(zl p10, zp p11, int p12, int p13)
	    {
	        if ((p11.l) && ((this.n() != 0) && ((!p11.j) && (this.g())))) {
	            int v3 = 0;
	            xz v2_0 = 0;
	            java.util.List v5 = p10.d;
	            int v6 = v5.size();
	            int v7 = xw.a(this.f(0));
	            int v4 = 0;
	            while (v4 < v6) {
	                int v1_8;
	                int v0_23;
	                int v0_22 = ((zr) v5.get(v4));
	                if (v0_22.n()) {
	                    v0_23 = v2_0;
	                    v1_8 = v3;
	                } else {
	                    int v1_10;
	                    if (v0_22.d() >= v7) {
	                        v1_10 = 0;
	                    } else {
	                        v1_10 = 1;
	                    }
	                    int v1_11;
	                    if (v1_10 == this.i) {
	                        v1_11 = 1;
	                    } else {
	                        v1_11 = -1;
	                    }
	                    if (v1_11 != -1) {
	                        v0_23 = (this.b.c(v0_22.a) + v2_0);
	                        v1_8 = v3;
	                    } else {
	                        v1_8 = (this.b.c(v0_22.a) + v3);
	                        v0_23 = v2_0;
	                    }
	                }
	                v4++;
	                v3 = v1_8;
	                v2_0 = v0_23;
	            }
	            this.f.j = v5;
	            if (v3 > 0) {
	                this.b(xw.a(this.v()), p12);
	                this.f.h = v3;
	                this.f.c = 0;
	                this.f.a(0);
	                this.a(p10, this.f, p11, 0);
	            }
	            if (v2_0 > null) {
	                this.a(xw.a(this.w()), p13);
	                this.f.h = v2_0;
	                this.f.c = 0;
	                this.f.a(0);
	                this.a(p10, this.f, p11, 0);
	            }
	            this.f.j = 0;
	        }
	        return;
	    }
	
	
	    private int b(int p5, zl p6, zp p7, boolean p8)
	    {
	        int v0_3;
	        int v0_2 = (p5 - this.b.b());
	        if (v0_2 <= 0) {
	            v0_3 = 0;
	        } else {
	            v0_3 = (- this.d(v0_2, p6, p7));
	            if (p8) {
	                int v1_1 = ((p5 + v0_3) - this.b.b());
	                if (v1_1 > 0) {
	                    this.b.a((- v1_1));
	                    v0_3 -= v1_1;
	                }
	            }
	        }
	        return v0_3;
	    }
	
	
	    private android.view.View b(boolean p4, boolean p5)
	    {
	        android.view.View v0_3;
	        if (!this.i) {
	            v0_3 = this.a((this.n() - 1), -1, p4, 1);
	        } else {
	            v0_3 = this.a(0, this.n(), p4, 1);
	        }
	        return v0_3;
	    }
	
	
	    private void b(int p4, int p5)
	    {
	        xz v0_3;
	        this.f.c = (p5 - this.b.b());
	        this.f.d = p4;
	        if (!this.i) {
	            v0_3 = -1;
	        } else {
	            v0_3 = 1;
	        }
	        this.f.e = v0_3;
	        this.f.f = -1;
	        this.f.b = p5;
	        this.f.g = -2147483648;
	        return;
	    }
	
	
	    private void b(xx p3)
	    {
	        this.b(p3.a, p3.b);
	        return;
	    }
	
	
	    private int d(int p6, zl p7, zp p8)
	    {
	        if ((this.n() != 0) && (p6 != 0)) {
	            xz v0_2;
	            this.f.a = 1;
	            this.l();
	            if (p6 <= 0) {
	                v0_2 = -1;
	            } else {
	                v0_2 = 1;
	            }
	            int v3 = Math.abs(p6);
	            this.a(v0_2, v3, 1, p8);
	            int v1_3 = (this.f.g + this.a(p7, this.f, p8, 0));
	            if (v1_3 >= 0) {
	                if (v3 > v1_3) {
	                    p6 = (v0_2 * v1_3);
	                }
	                this.b.a((- p6));
	                this.f.i = p6;
	            } else {
	                p6 = 0;
	            }
	        } else {
	            p6 = 0;
	        }
	        return p6;
	    }
	
	
	    private android.view.View d(zl p2, zp p3)
	    {
	        android.view.View v0_1;
	        if (!this.i) {
	            v0_1 = this.g(p2, p3);
	        } else {
	            v0_1 = this.f(p2, p3);
	        }
	        return v0_1;
	    }
	
	
	    private android.view.View e(zl p2, zp p3)
	    {
	        android.view.View v0_1;
	        if (!this.i) {
	            v0_1 = this.f(p2, p3);
	        } else {
	            v0_1 = this.g(p2, p3);
	        }
	        return v0_1;
	    }
	
	
	    private android.view.View f(zl p7, zp p8)
	    {
	        return this.a(p7, p8, 0, this.n(), p8.a());
	    }
	
	
	    private int g(zp p4)
	    {
	        int v1_1;
	        int v0_0 = 0;
	        if (p4.a == -1) {
	            v1_1 = 0;
	        } else {
	            v1_1 = 1;
	        }
	        if (v1_1 != 0) {
	            v0_0 = this.b.e();
	        }
	        return v0_0;
	    }
	
	
	    private android.view.View g(zl p7, zp p8)
	    {
	        return this.a(p7, p8, (this.n() - 1), -1, p8.a());
	    }
	
	
	    private int h(zp p10)
	    {
	        int v2_0 = 0;
	        if (this.n() != 0) {
	            float v0_2;
	            this.l();
	            yq v3 = this.b;
	            if (this.k) {
	                v0_2 = 0;
	            } else {
	                v0_2 = 1;
	            }
	            float v0_4;
	            android.view.View v4 = this.a(v0_2, 1);
	            if (this.k) {
	                v0_4 = 0;
	            } else {
	                v0_4 = 1;
	            }
	            float v0_5 = this.b(v0_4, 1);
	            float v1_1 = this.k;
	            int v5_0 = this.i;
	            if ((this.n() != 0) && ((p10.a() != 0) && ((v4 != null) && (v0_5 != 0)))) {
	                int v6_3 = Math.min(zh.a(v4), zh.a(v0_5));
	                int v7_2 = Math.max(zh.a(v4), zh.a(v0_5));
	                if (v5_0 == 0) {
	                    v2_0 = Math.max(0, v6_3);
	                } else {
	                    v2_0 = Math.max(0, ((p10.a() - v7_2) - 1));
	                }
	                if (v1_1 != 0) {
	                    v2_0 = Math.round((((((float) Math.abs((v3.b(v0_5) - v3.a(v4)))) / ((float) (Math.abs((zh.a(v4) - zh.a(v0_5))) + 1))) * ((float) v2_0)) + ((float) (v3.b() - v3.a(v4)))));
	                }
	            }
	        }
	        return v2_0;
	    }
	
	
	    private int i(zp p7)
	    {
	        int v2 = 0;
	        if (this.n() != 0) {
	            int v0_2;
	            this.l();
	            yq v3 = this.b;
	            if (this.k) {
	                v0_2 = 0;
	            } else {
	                v0_2 = 1;
	            }
	            int v0_4;
	            android.view.View v4 = this.a(v0_2, 1);
	            if (this.k) {
	                v0_4 = 0;
	            } else {
	                v0_4 = 1;
	            }
	            int v0_5 = this.b(v0_4, 1);
	            if ((this.n() != 0) && ((p7.a() != 0) && ((v4 != null) && (v0_5 != 0)))) {
	                if (this.k) {
	                    v2 = Math.min(v3.e(), (v3.b(v0_5) - v3.a(v4)));
	                } else {
	                    v2 = (Math.abs((zh.a(v4) - zh.a(v0_5))) + 1);
	                }
	            }
	        }
	        return v2;
	    }
	
	
	    private int j(zp p7)
	    {
	        int v2_0 = 0;
	        if (this.n() != 0) {
	            float v0_2;
	            this.l();
	            yq v3 = this.b;
	            if (this.k) {
	                v0_2 = 0;
	            } else {
	                v0_2 = 1;
	            }
	            float v0_4;
	            android.view.View v4 = this.a(v0_2, 1);
	            if (this.k) {
	                v0_4 = 0;
	            } else {
	                v0_4 = 1;
	            }
	            float v0_5 = this.b(v0_4, 1);
	            if ((this.n() != 0) && ((p7.a() != 0) && ((v4 != null) && (v0_5 != 0)))) {
	                if (this.k) {
	                    v2_0 = ((int) ((((float) (v3.b(v0_5) - v3.a(v4))) / ((float) (Math.abs((zh.a(v4) - zh.a(v0_5))) + 1))) * ((float) p7.a())));
	                } else {
	                    v2_0 = p7.a();
	                }
	            }
	        }
	        return v2_0;
	    }
	
	
	    private void u()
	    {
	        int v0 = 1;
	        if ((this.a != 1) && (this.k())) {
	            if (this.h) {
	                v0 = 0;
	            }
	        } else {
	            v0 = this.h;
	        }
	        this.i = v0;
	        return;
	    }
	
	
	    private android.view.View v()
	    {
	        android.view.View v0_1;
	        if (!this.i) {
	            v0_1 = 0;
	        } else {
	            v0_1 = (this.n() - 1);
	        }
	        return this.f(v0_1);
	    }
	
	
	    private android.view.View w()
	    {
	        android.view.View v0_2;
	        if (!this.i) {
	            v0_2 = (this.n() - 1);
	        } else {
	            v0_2 = 0;
	        }
	        return this.f(v0_2);
	    }
	
	
	    public final int a(int p3, zl p4, zp p5)
	    {
	        int v0_1;
	        if (this.a != 1) {
	            v0_1 = this.d(p3, p4, p5);
	        } else {
	            v0_1 = 0;
	        }
	        return v0_1;
	    }
	
	
	    public final int a(zp p2)
	    {
	        return this.h(p2);
	    }
	
	
	    android.view.View a(zl p8, zp p9, int p10, int p11, int p12)
	    {
	        int v1;
	        boolean v2 = 0;
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
	            int v0_13;
	            int v3 = this.f(p10);
	            int v0_4 = xw.a(v3);
	            if ((v0_4 < 0) || (v0_4 >= p12)) {
	                v0_13 = v2;
	                v3 = v4;
	            } else {
	                if (!((zi) v3.getLayoutParams()).c.n()) {
	                    if ((this.b.a(v3) < v6) && (this.b.b(v3) >= v5)) {
	                        return v3;
	                    } else {
	                        if (v2) {
	                        } else {
	                            v0_13 = v3;
	                            v3 = v4;
	                        }
	                    }
	                } else {
	                    if (v4 != 0) {
	                    } else {
	                        v0_13 = v2;
	                    }
	                }
	            }
	            p10 += v1;
	            v2 = v0_13;
	            v4 = v3;
	        }
	        if (!v2) {
	            v3 = v4;
	        } else {
	            v3 = v2;
	        }
	        return v3;
	    }
	
	
	    public final void a(int p4)
	    {
	        if ((p4 == 0) || (p4 == 1)) {
	            this.a(0);
	            if (p4 != this.a) {
	                this.a = p4;
	                this.b = 0;
	                this.m();
	            }
	            return;
	        } else {
	            throw new IllegalArgumentException(new StringBuilder("invalid orientation:").append(p4).toString());
	        }
	    }
	
	
	    public final void a(android.os.Parcelable p2)
	    {
	        if ((p2 instanceof ya)) {
	            this.c = ((ya) p2);
	            this.m();
	        }
	        return;
	    }
	
	
	    public final void a(android.support.v7.widget.RecyclerView p1, zl p2)
	    {
	        super.a(p1, p2);
	        return;
	    }
	
	
	    public final void a(android.view.accessibility.AccessibilityEvent p6)
	    {
	        int v1 = -1;
	        super.a(p6);
	        if (this.n() > 0) {
	            android.view.View v0_3;
	            jx v2 = iz.a(p6);
	            android.view.View v0_2 = this.a(0, this.n(), 0, 1);
	            if (v0_2 != null) {
	                v0_3 = xw.a(v0_2);
	            } else {
	                v0_3 = -1;
	            }
	            v2.b(v0_3);
	            android.view.View v0_6 = this.a((this.n() - 1), -1, 0, 1);
	            if (v0_6 != null) {
	                v1 = xw.a(v0_6);
	            }
	            v2.c(v1);
	        }
	        return;
	    }
	
	
	    public final void a(String p2)
	    {
	        if (this.c == null) {
	            super.a(p2);
	        }
	        return;
	    }
	
	
	    void a(zl p1, zp p2, xx p3)
	    {
	        return;
	    }
	
	
	    void a(zl p12, zp p13, xz p14, xy p15)
	    {
	        android.view.View v6 = p14.a(p12);
	        if (v6 != null) {
	            boolean v0_1 = ((zi) v6.getLayoutParams());
	            if (p14.j != null) {
	                int v1_2;
	                if (p14.f != -1) {
	                    v1_2 = 0;
	                } else {
	                    v1_2 = 1;
	                }
	                if (this.i != v1_2) {
	                    super.a(v6, 0, 1);
	                } else {
	                    super.a(v6, -1, 1);
	                }
	            } else {
	                int v1_4;
	                if (p14.f != -1) {
	                    v1_4 = 0;
	                } else {
	                    v1_4 = 1;
	                }
	                if (this.i != v1_4) {
	                    super.a(v6, 0, 0);
	                } else {
	                    super.a(v6, -1, 0);
	                }
	            }
	            boolean v4_4;
	            int v3_7;
	            int v1_14;
	            int v2_9;
	            int v1_6 = ((zi) v6.getLayoutParams());
	            int v2_2 = this.e.c(v6);
	            v6.measure(zh.a(this.o(), (((v2_2.left + v2_2.right) + 0) + (((this.q() + this.s()) + v1_6.leftMargin) + v1_6.rightMargin)), v1_6.width, this.i()), zh.a(this.p(), (((v2_2.bottom + v2_2.top) + 0) + (((this.r() + this.t()) + v1_6.topMargin) + v1_6.bottomMargin)), v1_6.height, this.j()));
	            p15.a = this.b.c(v6);
	            if (this.a != 1) {
	                v3_7 = this.r();
	                v1_14 = (this.b.d(v6) + v3_7);
	                if (p14.f != -1) {
	                    v4_4 = p14.b;
	                    v2_9 = (p14.b + p15.a);
	                } else {
	                    v2_9 = p14.b;
	                    v4_4 = (p14.b - p15.a);
	                }
	            } else {
	                int v2_10;
	                int v1_18;
	                if (!this.k()) {
	                    v2_10 = this.q();
	                    v1_18 = (this.b.d(v6) + v2_10);
	                } else {
	                    v1_18 = (this.o() - this.s());
	                    v2_10 = (v1_18 - this.b.d(v6));
	                }
	                if (p14.f != -1) {
	                    v3_7 = p14.b;
	                    v4_4 = v2_10;
	                    v2_9 = v1_18;
	                    v1_14 = (p14.b + p15.a);
	                } else {
	                    v3_7 = (p14.b - p15.a);
	                    v4_4 = v2_10;
	                    v2_9 = v1_18;
	                    v1_14 = p14.b;
	                }
	            }
	            xw.a(v6, (v4_4 + v0_1.leftMargin), (v3_7 + v0_1.topMargin), (v2_9 - v0_1.rightMargin), (v1_14 - v0_1.bottomMargin));
	            if ((v0_1.c.n()) || (v0_1.c.l())) {
	                p15.c = 1;
	            }
	            p15.d = v6.isFocusable();
	        } else {
	            p15.b = 1;
	        }
	        return;
	    }
	
	
	    public final int b(int p2, zl p3, zp p4)
	    {
	        int v0_1;
	        if (this.a != 0) {
	            v0_1 = this.d(p2, p3, p4);
	        } else {
	            v0_1 = 0;
	        }
	        return v0_1;
	    }
	
	
	    public final int b(zp p2)
	    {
	        return this.h(p2);
	    }
	
	
	    public final android.view.View b(int p3)
	    {
	        android.view.View v0_1;
	        android.view.View v0_0 = this.n();
	        if (v0_0 != null) {
	            int v1_3 = (p3 - xw.a(this.f(0)));
	            if ((v1_3 >= 0) && (v1_3 < v0_0)) {
	                v0_1 = this.f(v1_3);
	                if (xw.a(v0_1) == p3) {
	                    return v0_1;
	                }
	            }
	            v0_1 = super.b(p3);
	        } else {
	            v0_1 = 0;
	        }
	        return v0_1;
	    }
	
	
	    public final int c(zp p2)
	    {
	        return this.i(p2);
	    }
	
	
	    public final android.view.View c(int p10, zl p11, zp p12)
	    {
	        android.view.View v0 = 0;
	        this.u();
	        if (this.n() != 0) {
	            int v3;
	            switch (p10) {
	                case 1:
	                    v3 = -1;
	                    break;
	                case 2:
	                    v3 = 1;
	                    break;
	                case 17:
	                    if (this.a != 0) {
	                        v3 = -2147483648;
	                    } else {
	                        v3 = -1;
	                    }
	                    break;
	                case 33:
	                    if (this.a != 1) {
	                        v3 = -2147483648;
	                    } else {
	                        v3 = -1;
	                    }
	                    break;
	                case 66:
	                    if (this.a != 0) {
	                        v3 = -2147483648;
	                    } else {
	                        v3 = 1;
	                    }
	                    break;
	                case 130:
	                    if (this.a != 1) {
	                        v3 = -2147483648;
	                    } else {
	                        v3 = 1;
	                    }
	                    break;
	                default:
	                    v3 = -2147483648;
	            }
	            if (v3 != -2147483648) {
	                boolean v2_0;
	                this.l();
	                if (v3 != -1) {
	                    v2_0 = this.d(p11, p12);
	                } else {
	                    v2_0 = this.e(p11, p12);
	                }
	                if (v2_0) {
	                    android.view.View v1_13;
	                    this.l();
	                    this.a(v3, ((int) (1051260355 * ((float) this.b.e()))), 0, p12);
	                    this.f.g = -2147483648;
	                    this.f.a = 0;
	                    this.a(p11, this.f, p12, 1);
	                    if (v3 != -1) {
	                        v1_13 = this.w();
	                    } else {
	                        v1_13 = this.v();
	                    }
	                    if ((v1_13 != v2_0) && (v1_13.isFocusable())) {
	                        v0 = v1_13;
	                    }
	                }
	            }
	        }
	        return v0;
	    }
	
	
	    public final void c(int p3)
	    {
	        this.l = p3;
	        this.m = -2147483648;
	        if (this.c != null) {
	            this.c.a = -1;
	        }
	        this.m();
	        return;
	    }
	
	
	    public void c(zl p12, zp p13)
	    {
	        if ((this.c != null) && (this.c.a())) {
	            this.l = this.c.a;
	        }
	        int v0_34;
	        this.l();
	        this.f.a = 0;
	        this.u();
	        int v0_6 = this.n;
	        v0_6.a = -1;
	        v0_6.b = -2147483648;
	        v0_6.c = 0;
	        this.n.c = this.i;
	        boolean v4_0 = this.n;
	        if ((!p13.j) && (this.l != -1)) {
	            if ((this.l >= 0) && (this.l < p13.a())) {
	                v4_0.a = this.l;
	                if ((this.c == null) || (!this.c.a())) {
	                    if (this.m != -2147483648) {
	                        v4_0.c = this.i;
	                        if (!this.i) {
	                            v4_0.b = (this.b.b() + this.m);
	                        } else {
	                            v4_0.b = (this.b.c() - this.m);
	                        }
	                    } else {
	                        int v0_26 = this.b(this.l);
	                        if (v0_26 == 0) {
	                            if (this.n() > 0) {
	                                int v0_30;
	                                if (this.l >= xw.a(this.f(0))) {
	                                    v0_30 = 0;
	                                } else {
	                                    v0_30 = 1;
	                                }
	                                int v0_31;
	                                if (v0_30 != this.i) {
	                                    v0_31 = 0;
	                                } else {
	                                    v0_31 = 1;
	                                }
	                                v4_0.c = v0_31;
	                            }
	                            v4_0.a();
	                        } else {
	                            if (this.b.c(v0_26) <= this.b.e()) {
	                                if ((this.b.a(v0_26) - this.b.b()) >= 0) {
	                                    if ((this.b.c() - this.b.b(v0_26)) >= 0) {
	                                        int v0_32;
	                                        if (!v4_0.c) {
	                                            v0_32 = this.b.a(v0_26);
	                                        } else {
	                                            v0_32 = (this.b.b(v0_26) + this.b.a());
	                                        }
	                                        v4_0.b = v0_32;
	                                    } else {
	                                        v4_0.b = this.b.c();
	                                        v4_0.c = 1;
	                                        v0_34 = 1;
	                                        if (v0_34 == 0) {
	                                            int v0_66;
	                                            if (this.n() == 0) {
	                                                v0_66 = 0;
	                                            } else {
	                                                int v3_25;
	                                                if (this.e != null) {
	                                                    int v0_51 = this.e.getFocusedChild();
	                                                    if ((v0_51 != 0) && (!this.d.a(v0_51))) {
	                                                        v3_25 = v0_51;
	                                                    } else {
	                                                        v3_25 = 0;
	                                                    }
	                                                } else {
	                                                    v3_25 = 0;
	                                                }
	                                                if (v3_25 != 0) {
	                                                    int v0_56;
	                                                    int v0_53 = ((zi) v3_25.getLayoutParams());
	                                                    if ((v0_53.c.n()) || ((v0_53.c.d() < 0) || (v0_53.c.d() >= p13.a()))) {
	                                                        v0_56 = 0;
	                                                    } else {
	                                                        v0_56 = 1;
	                                                    }
	                                                    if (v0_56 != 0) {
	                                                        int v0_69 = v4_0.d.b.a();
	                                                        if (v0_69 < 0) {
	                                                            v4_0.a = xw.a(v3_25);
	                                                            if (!v4_0.c) {
	                                                                int v6_17 = v4_0.d.b.a(v3_25);
	                                                                java.util.ArrayList v7_3 = (v6_17 - v4_0.d.b.b());
	                                                                v4_0.b = v6_17;
	                                                                if (v7_3 > null) {
	                                                                    int v0_74 = ((v4_0.d.b.c() - Math.min(0, ((v4_0.d.b.c() - v0_69) - v4_0.d.b.b(v3_25)))) - (v6_17 + v4_0.d.b.c(v3_25)));
	                                                                    if (v0_74 < 0) {
	                                                                        v4_0.b = (v4_0.b - Math.min(v7_3, (- v0_74)));
	                                                                    }
	                                                                }
	                                                            } else {
	                                                                int v0_79 = ((v4_0.d.b.c() - v0_69) - v4_0.d.b.b(v3_25));
	                                                                v4_0.b = (v4_0.d.b.c() - v0_79);
	                                                                if (v0_79 > 0) {
	                                                                    int v6_32 = (v4_0.b - v4_0.d.b.c(v3_25));
	                                                                    java.util.ArrayList v7_7 = v4_0.d.b.b();
	                                                                    int v3_42 = (v6_32 - (Math.min((v4_0.d.b.a(v3_25) - v7_7), 0) + v7_7));
	                                                                    if (v3_42 < 0) {
	                                                                        v4_0.b = (Math.min(v0_79, (- v3_42)) + v4_0.b);
	                                                                    }
	                                                                }
	                                                            }
	                                                        } else {
	                                                            v4_0.a(v3_25);
	                                                        }
	                                                        v0_66 = 1;
	                                                        if (v0_66 == 0) {
	                                                            v4_0.a();
	                                                            v4_0.a = 0;
	                                                        }
	                                                        int v3_46;
	                                                        int v0_82 = this.g(p13);
	                                                        if (this.f.i < 0) {
	                                                            v3_46 = v0_82;
	                                                            v0_82 = 0;
	                                                        } else {
	                                                            v3_46 = 0;
	                                                        }
	                                                        int v3_47 = (v3_46 + this.b.b());
	                                                        int v0_83 = (v0_82 + this.b.f());
	                                                        if ((p13.j) && ((this.l != -1) && (this.m != -2147483648))) {
	                                                            boolean v4_9 = this.b(this.l);
	                                                            if (v4_9) {
	                                                                boolean v4_12;
	                                                                if (!this.i) {
	                                                                    v4_12 = (this.m - (this.b.a(v4_9) - this.b.b()));
	                                                                } else {
	                                                                    v4_12 = ((this.b.c() - this.b.b(v4_9)) - this.m);
	                                                                }
	                                                                if (v4_12) {
	                                                                    v0_83 -= v4_12;
	                                                                } else {
	                                                                    v3_47 += v4_12;
	                                                                }
	                                                            }
	                                                        }
	                                                        this.a(p12, p13, this.n);
	                                                        boolean v4_17 = (this.n() - 1);
	                                                        while (v4_17) {
	                                                            int v6_55 = this.f(v4_17);
	                                                            java.util.ArrayList v7_13 = android.support.v7.widget.RecyclerView.b(v6_55);
	                                                            if (!v7_13.b()) {
	                                                                if ((!v7_13.j()) || ((v7_13.n()) || (v7_13.l()))) {
	                                                                    this.e(v4_17);
	                                                                    int v6_56 = android.support.v7.widget.RecyclerView.b(v6_55);
	                                                                    v6_56.j = p12;
	                                                                    if ((v6_56.l()) && (android.support.v7.widget.RecyclerView.h(p12.e))) {
	                                                                        if (p12.b == null) {
	                                                                            p12.b = new java.util.ArrayList();
	                                                                        }
	                                                                        p12.b.add(v6_56);
	                                                                    } else {
	                                                                        if ((!v6_56.j()) || (v6_56.n())) {
	                                                                            p12.a.add(v6_56);
	                                                                        } else {
	                                                                            android.support.v7.widget.RecyclerView.f(p12.e);
	                                                                            throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.");
	                                                                        }
	                                                                    }
	                                                                } else {
	                                                                    android.support.v7.widget.RecyclerView.f(this.e);
	                                                                    this.d(v4_17);
	                                                                    p12.a(v7_13);
	                                                                }
	                                                            }
	                                                            v4_17--;
	                                                        }
	                                                        int v3_51;
	                                                        int v0_86;
	                                                        if (!this.n.c) {
	                                                            this.a(this.n);
	                                                            this.f.h = v0_83;
	                                                            this.a(p12, this.f, p13, 0);
	                                                            v0_86 = this.f.b;
	                                                            boolean v4_23 = this.f.d;
	                                                            if (this.f.c > 0) {
	                                                                v3_47 += this.f.c;
	                                                            }
	                                                            this.b(this.n);
	                                                            this.f.h = v3_47;
	                                                            int v3_48 = this.f;
	                                                            v3_48.d = (v3_48.d + this.f.e);
	                                                            this.a(p12, this.f, p13, 0);
	                                                            v3_51 = this.f.b;
	                                                            if (this.f.c > 0) {
	                                                                int v6_53 = this.f.c;
	                                                                this.a(v4_23, v0_86);
	                                                                this.f.h = v6_53;
	                                                                this.a(p12, this.f, p13, 0);
	                                                                v0_86 = this.f.b;
	                                                            }
	                                                        } else {
	                                                            this.b(this.n);
	                                                            this.f.h = v3_47;
	                                                            this.a(p12, this.f, p13, 0);
	                                                            int v3_54 = this.f.b;
	                                                            int v6_54 = this.f.d;
	                                                            if (this.f.c > 0) {
	                                                                v0_83 += this.f.c;
	                                                            }
	                                                            int v0_95;
	                                                            this.a(this.n);
	                                                            this.f.h = v0_83;
	                                                            int v0_90 = this.f;
	                                                            v0_90.d = (v0_90.d + this.f.e);
	                                                            this.a(p12, this.f, p13, 0);
	                                                            boolean v4_35 = this.f.b;
	                                                            if (this.f.c <= 0) {
	                                                                v0_95 = v3_54;
	                                                            } else {
	                                                                int v0_97 = this.f.c;
	                                                                this.b(v6_54, v3_54);
	                                                                this.f.h = v0_97;
	                                                                this.a(p12, this.f, p13, 0);
	                                                                v0_95 = this.f.b;
	                                                            }
	                                                            v3_51 = v0_95;
	                                                            v0_86 = v4_35;
	                                                        }
	                                                        if (this.n() > 0) {
	                                                            if (!this.i) {
	                                                                int v1_1 = this.b(v3_51, p12, p13, 1);
	                                                                int v3_56 = (v3_51 + v1_1);
	                                                                int v0_100 = (v0_86 + v1_1);
	                                                                int v1_2 = this.a(v0_100, p12, p13, 0);
	                                                                v3_51 = (v3_56 + v1_2);
	                                                                v0_86 = (v0_100 + v1_2);
	                                                            } else {
	                                                                int v1_3 = this.a(v0_86, p12, p13, 1);
	                                                                int v3_57 = (v3_51 + v1_3);
	                                                                int v0_101 = (v0_86 + v1_3);
	                                                                int v1_4 = this.b(v3_57, p12, p13, 0);
	                                                                v3_51 = (v3_57 + v1_4);
	                                                                v0_86 = (v0_101 + v1_4);
	                                                            }
	                                                        }
	                                                        this.a(p12, p13, v3_51, v0_86);
	                                                        if (!p13.j) {
	                                                            this.l = -1;
	                                                            this.m = -2147483648;
	                                                            int v0_103 = this.b;
	                                                            v0_103.b = v0_103.e();
	                                                        }
	                                                        this.g = 0;
	                                                        this.c = 0;
	                                                        return;
	                                                    }
	                                                }
	                                                if (!this.g) {
	                                                    int v0_59;
	                                                    if (!v4_0.c) {
	                                                        v0_59 = this.e(p12, p13);
	                                                    } else {
	                                                        v0_59 = this.d(p12, p13);
	                                                    }
	                                                    if (v0_59 == 0) {
	                                                    } else {
	                                                        v4_0.a(v0_59);
	                                                        if ((!p13.j) && (this.g())) {
	                                                            if ((this.b.a(v0_59) < this.b.c()) && (this.b.b(v0_59) >= this.b.b())) {
	                                                                int v0_61 = 0;
	                                                            } else {
	                                                                v0_61 = 1;
	                                                            }
	                                                            if (v0_61 != 0) {
	                                                                int v0_64;
	                                                                if (!v4_0.c) {
	                                                                    v0_64 = this.b.b();
	                                                                } else {
	                                                                    v0_64 = this.b.c();
	                                                                }
	                                                                v4_0.b = v0_64;
	                                                            }
	                                                        }
	                                                        v0_66 = 1;
	                                                    }
	                                                }
	                                            }
	                                        }
	                                    }
	                                } else {
	                                    v4_0.b = this.b.b();
	                                    v4_0.c = 0;
	                                }
	                            } else {
	                                v4_0.a();
	                            }
	                        }
	                        v0_34 = 1;
	                    }
	                } else {
	                    v4_0.c = this.c.c;
	                    if (!v4_0.c) {
	                        v4_0.b = (this.b.b() + this.c.b);
	                    } else {
	                        v4_0.b = (this.b.c() - this.c.b);
	                    }
	                    v0_34 = 1;
	                }
	            } else {
	                this.l = -1;
	                this.m = -2147483648;
	                v0_34 = 0;
	            }
	        } else {
	            v0_34 = 0;
	        }
	    }
	
	
	    public final int d(zp p2)
	    {
	        return this.i(p2);
	    }
	
	
	    public final int e(zp p2)
	    {
	        return this.j(p2);
	    }
	
	
	    public final int f(zp p2)
	    {
	        return this.j(p2);
	    }
	
	
	    public zi f()
	    {
	        return new zi(-2, -2);
	    }
	
	
	    public boolean g()
	    {
	        if ((this.c != null) || (this.g)) {
	            int v0_2 = 0;
	        } else {
	            v0_2 = 1;
	        }
	        return v0_2;
	    }
	
	
	    public final android.os.Parcelable h()
	    {
	        ya v0_2;
	        if (this.c == null) {
	            v0_2 = new ya();
	            if (this.n() <= 0) {
	                v0_2.a = -1;
	            } else {
	                this.l();
	                int v1_3 = (this.g ^ this.i);
	                v0_2.c = v1_3;
	                if (v1_3 == 0) {
	                    int v1_4 = this.v();
	                    v0_2.a = xw.a(v1_4);
	                    v0_2.b = (this.b.a(v1_4) - this.b.b());
	                } else {
	                    int v1_7 = this.w();
	                    v0_2.b = (this.b.c() - this.b.b(v1_7));
	                    v0_2.a = xw.a(v1_7);
	                }
	            }
	        } else {
	            v0_2 = new ya(this.c);
	        }
	        return v0_2;
	    }
	
	
	    public final boolean i()
	    {
	        int v0_1;
	        if (this.a != 0) {
	            v0_1 = 0;
	        } else {
	            v0_1 = 1;
	        }
	        return v0_1;
	    }
	
	
	    public final boolean j()
	    {
	        int v0 = 1;
	        if (this.a != 1) {
	            v0 = 0;
	        }
	        return v0;
	    }
	
	
	    protected final boolean k()
	    {
	        int v0 = 1;
	        if (gt.g(this.e) != 1) {
	            v0 = 0;
	        }
	        return v0;
	    }
	
	
	    final void l()
	    {
	        if (this.f == null) {
	            this.f = new xz();
	        }
	        if (this.b == null) {
	            ys v0_6;
	            switch (this.a) {
	                case 0:
	                    v0_6 = new yr(this);
	                    break;
	                case 1:
	                    v0_6 = new ys(this);
	                    break;
	                default:
	                    throw new IllegalArgumentException("invalid orientation");
	            }
	            this.b = v0_6;
	        }
	        return;
	    }
	
