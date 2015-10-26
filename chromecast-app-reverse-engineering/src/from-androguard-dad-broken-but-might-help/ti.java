	 android.support.v7.widget.Toolbar a
	 java.lang.CharSequence b
	 android.view.Window$Callback c
	  d
	private  e
	private android.view.View f
	private android.view.View g
	private android.graphics.drawable.Drawable h
	private android.graphics.drawable.Drawable i
	private android.graphics.drawable.Drawable j
	private  k
	private java.lang.CharSequence l
	private java.lang.CharSequence m
	private vu n
	private  o
	private final tf p
	private  q
	private android.graphics.drawable.Drawable r
	
	    public ti(android.support.v7.widget.Toolbar p3, boolean p4)
	    {
	        this(p3, p4, a.bT, a.ao);
	        return;
	    }
	
	
	    private ti(android.support.v7.widget.Toolbar p7, boolean p8, int p9, int p10)
	    {
	        tf v0_3;
	        this.o = 0;
	        this.q = 0;
	        this.a = p7;
	        this.b = p7.k;
	        this.l = p7.l;
	        if (this.b == null) {
	            v0_3 = 0;
	        } else {
	            v0_3 = 1;
	        }
	        this.k = v0_3;
	        this.j = p7.e();
	        if (!p8) {
	            tf v0_5 = 11;
	            if (this.a.e() != null) {
	                v0_5 = 15;
	            }
	            this.e = v0_5;
	            this.p = tf.a(p7.getContext());
	        } else {
	            tf v0_9 = th.a(p7.getContext(), 0, oq.a, a.i, 0);
	            android.content.res.TypedArray v2_4 = v0_9.c(oq.r);
	            if (!android.text.TextUtils.isEmpty(v2_4)) {
	                this.b(v2_4);
	            }
	            android.content.res.TypedArray v2_6 = v0_9.c(oq.p);
	            if (!android.text.TextUtils.isEmpty(v2_6)) {
	                this.c(v2_6);
	            }
	            android.content.res.TypedArray v2_8 = v0_9.a(oq.n);
	            if (v2_8 != null) {
	                this.i = v2_8;
	                this.p();
	            }
	            android.content.res.TypedArray v2_10 = v0_9.a(oq.m);
	            if ((this.j == null) && (v2_10 != null)) {
	                this.h = v2_10;
	                this.p();
	            }
	            android.content.res.TypedArray v2_12 = v0_9.a(oq.l);
	            if (v2_12 != null) {
	                this.a(v2_12);
	            }
	            this.a(v0_9.a(oq.h, 0));
	            android.content.res.TypedArray v2_16 = v0_9.e(oq.g, 0);
	            if (v2_16 != null) {
	                android.content.res.TypedArray v2_17 = android.view.LayoutInflater.from(this.a.getContext()).inflate(v2_16, this.a, 0);
	                if ((this.g != null) && ((this.e & 16) != 0)) {
	                    this.a.removeView(this.g);
	                }
	                this.g = v2_17;
	                if ((v2_17 != null) && ((this.e & 16) != 0)) {
	                    this.a.addView(this.g);
	                }
	                this.a((this.e | 16));
	            }
	            android.content.res.TypedArray v2_24 = v0_9.d(oq.j, 0);
	            if (v2_24 > null) {
	                android.support.v7.widget.Toolbar v3_13 = this.a.getLayoutParams();
	                v3_13.height = v2_24;
	                this.a.setLayoutParams(v3_13);
	            }
	            android.content.res.TypedArray v2_27 = v0_9.b(oq.f, -1);
	            android.support.v7.widget.Toolbar v3_15 = v0_9.b(oq.e, -1);
	            if ((v2_27 >= null) || (v3_15 >= null)) {
	                this.a.j.a(Math.max(v2_27, 0), Math.max(v3_15, 0));
	            }
	            android.content.res.TypedArray v2_30 = v0_9.e(oq.s, 0);
	            if (v2_30 != null) {
	                android.support.v7.widget.Toolbar v3_17 = this.a;
	                android.content.Context v4_6 = this.a.getContext();
	                v3_17.h = v2_30;
	                if (v3_17.b != null) {
	                    v3_17.b.setTextAppearance(v4_6, v2_30);
	                }
	            }
	            android.content.res.TypedArray v2_32 = v0_9.e(oq.q, 0);
	            if (v2_32 != null) {
	                android.support.v7.widget.Toolbar v3_19 = this.a;
	                android.content.Context v4_8 = this.a.getContext();
	                v3_19.i = v2_32;
	                if (v3_19.c != null) {
	                    v3_19.c.setTextAppearance(v4_8, v2_32);
	                }
	            }
	            android.content.res.TypedArray v2_34 = v0_9.e(oq.o, 0);
	            if (v2_34 != null) {
	                this.a.a(v2_34);
	            }
	            v0_9.a.recycle();
	            this.p = v0_9.a();
	        }
	        if (p9 != this.q) {
	            this.q = p9;
	            if (android.text.TextUtils.isEmpty(this.a.d())) {
	                this.c(this.q);
	            }
	        }
	        this.m = this.a.d();
	        tf v0_19 = this.p.a(p10, 0);
	        if (this.r != v0_19) {
	            this.r = v0_19;
	            this.r();
	        }
	        this.a.a(new tj(this));
	        return;
	    }
	
	
	    private void d(CharSequence p2)
	    {
	        this.b = p2;
	        if ((this.e & 8) != 0) {
	            this.a.a(p2);
	        }
	        return;
	    }
	
	
	    private void p()
	    {
	        android.graphics.drawable.Drawable v0_0 = 0;
	        if ((this.e & 2) != 0) {
	            if ((this.e & 1) == 0) {
	                v0_0 = this.h;
	            } else {
	                if (this.i == null) {
	                    v0_0 = this.h;
	                } else {
	                    v0_0 = this.i;
	                }
	            }
	        }
	        android.widget.ImageView v1_2 = this.a;
	        if (v0_0 == null) {
	            if ((v1_2.d != null) && (v1_2.d.getParent() != null)) {
	                v1_2.removeView(v1_2.d);
	            }
	        } else {
	            if (v1_2.d == null) {
	                v1_2.d = new android.widget.ImageView(v1_2.getContext());
	            }
	            if (v1_2.d.getParent() == null) {
	                v1_2.a(v1_2.d);
	                v1_2.b(v1_2.d);
	            }
	        }
	        if (v1_2.d != null) {
	            v1_2.d.setImageDrawable(v0_0);
	        }
	        return;
	    }
	
	
	    private void q()
	    {
	        if ((this.e & 4) != 0) {
	            if (!android.text.TextUtils.isEmpty(this.m)) {
	                this.a.c(this.m);
	            } else {
	                this.a.b(this.q);
	            }
	        }
	        return;
	    }
	
	
	    private void r()
	    {
	        if ((this.e & 4) != 0) {
	            android.graphics.drawable.Drawable v0_3;
	            if (this.j == null) {
	                v0_3 = this.r;
	            } else {
	                v0_3 = this.j;
	            }
	            this.a.a(v0_3);
	        }
	        return;
	    }
	
	
	    public final android.view.ViewGroup a()
	    {
	        return this.a;
	    }
	
	
	    public final void a(int p4)
	    {
	        android.support.v7.widget.Toolbar v0_1 = (this.e ^ p4);
	        this.e = p4;
	        if (v0_1 != null) {
	            if ((v0_1 & 4) != 0) {
	                if ((p4 & 4) == 0) {
	                    this.a.a(0);
	                } else {
	                    this.r();
	                    this.q();
	                }
	            }
	            if ((v0_1 & 3) != 0) {
	                this.p();
	            }
	            if ((v0_1 & 8) != 0) {
	                if ((p4 & 8) == 0) {
	                    this.a.a(0);
	                    this.a.b(0);
	                } else {
	                    this.a.a(this.b);
	                    this.a.b(this.l);
	                }
	            }
	            if (((v0_1 & 16) != 0) && (this.g != null)) {
	                if ((p4 & 16) == 0) {
	                    this.a.removeView(this.g);
	                } else {
	                    this.a.addView(this.g);
	                }
	            }
	        }
	        return;
	    }
	
	
	    public final void a(android.graphics.drawable.Drawable p1)
	    {
	        this.j = p1;
	        this.r();
	        return;
	    }
	
	
	    public final void a(android.view.Menu p7, qq p8)
	    {
	        if (this.n == null) {
	            this.n = new vu(this.a.getContext());
	        }
	        this.n.d = p8;
	        android.support.v7.widget.Toolbar v0_4 = this.a;
	        vu v1_2 = this.n;
	        if ((((qa) p7) != null) || (v0_4.a != null)) {
	            v0_4.f();
	            android.support.v7.widget.ActionMenuView v2_2 = v0_4.a.a;
	            if (v2_2 != ((qa) p7)) {
	                if (v2_2 != null) {
	                    v2_2.b(v0_4.n);
	                    v2_2.b(v0_4.o);
	                }
	                if (v0_4.o == null) {
	                    v0_4.o = new aar(v0_4);
	                }
	                v1_2.i = 1;
	                if (((qa) p7) == null) {
	                    v1_2.a(v0_4.f, 0);
	                    v0_4.o.a(v0_4.f, 0);
	                    v1_2.b(1);
	                    v0_4.o.b(1);
	                } else {
	                    ((qa) p7).a(v1_2, v0_4.f);
	                    ((qa) p7).a(v0_4.o, v0_4.f);
	                }
	                v0_4.a.a(v0_4.g);
	                v0_4.a.a(v1_2);
	                v0_4.n = v1_2;
	            }
	        }
	        return;
	    }
	
	
	    public final void a(android.view.Window$Callback p1)
	    {
	        this.c = p1;
	        return;
	    }
	
	
	    public final void a(CharSequence p2)
	    {
	        if (!this.k) {
	            this.d(p2);
	        }
	        return;
	    }
	
	
	    public final void a(qq p2, qb p3)
	    {
	        android.support.v7.widget.Toolbar v0 = this.a;
	        v0.p = p2;
	        v0.q = p3;
	        return;
	    }
	
	
	    public final void a(sm p3)
	    {
	        if ((this.f != null) && (this.f.getParent() == this.a)) {
	            this.a.removeView(this.f);
	        }
	        this.f = p3;
	        return;
	    }
	
	
	    public final void a(boolean p2)
	    {
	        android.support.v7.widget.Toolbar v0 = this.a;
	        v0.r = p2;
	        v0.requestLayout();
	        return;
	    }
	
	
	    public final android.content.Context b()
	    {
	        return this.a.getContext();
	    }
	
	
	    public final void b(int p3)
	    {
	        if (p3 != 8) {
	            if (p3 == 0) {
	                gt.o(this.a).a(1065353216).a(new tl(this));
	            }
	        } else {
	            gt.o(this.a).a(0).a(new tk(this));
	        }
	        return;
	    }
	
	
	    public final void b(CharSequence p2)
	    {
	        this.k = 1;
	        this.d(p2);
	        return;
	    }
	
	
	    public final void c(int p2)
	    {
	        String v0_2;
	        if (p2 != 0) {
	            v0_2 = this.a.getContext().getString(p2);
	        } else {
	            v0_2 = 0;
	        }
	        this.m = v0_2;
	        this.q();
	        return;
	    }
	
	
	    public final void c(CharSequence p2)
	    {
	        this.l = p2;
	        if ((this.e & 8) != 0) {
	            this.a.b(p2);
	        }
	        return;
	    }
	
	
	    public final boolean c()
	    {
	        int v0_3;
	        int v0_0 = this.a;
	        if ((v0_0.o == null) || (v0_0.o.a == null)) {
	            v0_3 = 0;
	        } else {
	            v0_3 = 1;
	        }
	        return v0_3;
	    }
	
	
	    public final void d()
	    {
	        this.a.c();
	        return;
	    }
	
	
	    public final void d(int p2)
	    {
	        this.a.setVisibility(p2);
	        return;
	    }
	
	
	    public final CharSequence e()
	    {
	        return this.a.k;
	    }
	
	
	    public final boolean f()
	    {
	        int v0_3;
	        int v0_0 = this.a;
	        if ((v0_0.getVisibility() != 0) || ((v0_0.a == null) || (!v0_0.a.b))) {
	            v0_3 = 0;
	        } else {
	            v0_3 = 1;
	        }
	        return v0_3;
	    }
	
	
	    public final boolean g()
	    {
	        return this.a.a();
	    }
	
	
	    public final boolean h()
	    {
	        int v0 = 1;
	        int v2_0 = this.a;
	        if (v2_0.a == null) {
	            v0 = 0;
	        } else {
	            int v2_5;
	            int v2_1 = v2_0.a;
	            if (v2_1.c == null) {
	                v2_5 = 0;
	            } else {
	                int v2_4;
	                int v2_2 = v2_1.c;
	                if ((v2_2.l == null) && (!v2_2.f())) {
	                    v2_4 = 0;
	                } else {
	                    v2_4 = 1;
	                }
	                if (v2_4 == 0) {
	                } else {
	                    v2_5 = 1;
	                }
	            }
	            if (v2_5 == 0) {
	            }
	        }
	        return v0;
	    }
	
	
	    public final boolean i()
	    {
	        return this.a.b();
	    }
	
	
	    public final boolean j()
	    {
	        int v0 = 1;
	        int v2_0 = this.a;
	        if (v2_0.a == null) {
	            v0 = 0;
	        } else {
	            int v2_4;
	            int v2_1 = v2_0.a;
	            if ((v2_1.c == null) || (!v2_1.c.c())) {
	                v2_4 = 0;
	            } else {
	                v2_4 = 1;
	            }
	            if (v2_4 == 0) {
	            }
	        }
	        return v0;
	    }
	
	
	    public final void k()
	    {
	        this.d = 1;
	        return;
	    }
	
	
	    public final void l()
	    {
	        android.support.v7.widget.ActionMenuView v0_0 = this.a;
	        if (v0_0.a != null) {
	            v0_0.a.c();
	        }
	        return;
	    }
	
	
	    public final int m()
	    {
	        return this.e;
	    }
	
	
	    public final int n()
	    {
	        return 0;
	    }
	
	
	    public final android.view.Menu o()
	    {
	        android.support.v7.widget.Toolbar v1 = this.a;
	        v1.f();
	        if (v1.a.a == null) {
	            android.view.Menu v0_4 = ((qa) v1.a.b());
	            if (v1.o == null) {
	                v1.o = new aar(v1);
	            }
	            v1.a.c.i = 1;
	            v0_4.a(v1.o, v1.f);
	        }
	        return v1.a.b();
	    }
	
