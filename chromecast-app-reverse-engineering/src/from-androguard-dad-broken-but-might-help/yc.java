	private static java.lang.reflect.Method a
	public android.widget.PopupWindow b
	public yf c
	public  d
	  e
	public  f
	public android.view.View g
	public android.widget.AdapterView$OnItemClickListener h
	private android.content.Context i
	private android.widget.ListAdapter j
	private  k
	private  l
	private  m
	private  n
	private  o
	private  p
	private  q
	private android.database.DataSetObserver r
	private final yn s
	private final ym t
	private final yl u
	private final yj v
	private android.os.Handler w
	private android.graphics.Rect x
	private  y
	
	    static yc()
	    {
	        try {
	            Class[] v2_1 = new Class[1];
	            v2_1[0] = Boolean.TYPE;
	            yc.a = android.widget.PopupWindow.getDeclaredMethod("setClipToScreenEnabled", v2_1);
	        } catch (NoSuchMethodException v0) {
	        }
	        return;
	    }
	
	
	    public yc(android.content.Context p3)
	    {
	        this(p3, 0, a.J);
	        return;
	    }
	
	
	    public yc(android.content.Context p2, android.util.AttributeSet p3, int p4)
	    {
	        this(p2, p3, p4, 0);
	        return;
	    }
	
	
	    public yc(android.content.Context p5, android.util.AttributeSet p6, int p7, int p8)
	    {
	        this.k = -2;
	        this.l = -2;
	        this.d = 0;
	        this.p = 0;
	        this.q = 0;
	        this.e = 2147483647;
	        this.f = 0;
	        this.s = new yn(this);
	        this.t = new ym(this);
	        this.u = new yl(this);
	        this.v = new yj(this);
	        this.w = new android.os.Handler();
	        this.x = new android.graphics.Rect();
	        this.i = p5;
	        java.util.Locale v0_15 = p5.obtainStyledAttributes(p6, oq.an, p7, p8);
	        this.m = v0_15.getDimensionPixelOffset(oq.ao, 0);
	        this.n = v0_15.getDimensionPixelOffset(oq.ap, 0);
	        if (this.n != 0) {
	            this.o = 1;
	        }
	        v0_15.recycle();
	        this.b = new sb(p5, p6, p7);
	        this.b.setInputMethodMode(1);
	        ec.a(this.i.getResources().getConfiguration().locale);
	        return;
	    }
	
	
	    static synthetic yf a(yc p1)
	    {
	        return p1.c;
	    }
	
	
	    static synthetic android.widget.PopupWindow b(yc p1)
	    {
	        return p1.b;
	    }
	
	
	    static synthetic yn c(yc p1)
	    {
	        return p1.s;
	    }
	
	
	    static synthetic android.os.Handler d(yc p1)
	    {
	        return p1.w;
	    }
	
	
	    public final void a()
	    {
	        this.b.dismiss();
	        this.b.setContentView(0);
	        this.c = 0;
	        this.w.removeCallbacks(this.s);
	        return;
	    }
	
	
	    public final void a(int p3)
	    {
	        int v0_1 = this.b.getBackground();
	        if (v0_1 == 0) {
	            this.l = p3;
	        } else {
	            v0_1.getPadding(this.x);
	            this.l = ((this.x.left + this.x.right) + p3);
	        }
	        return;
	    }
	
	
	    public void a(android.widget.ListAdapter p3)
	    {
	        if (this.r != null) {
	            if (this.j != null) {
	                this.j.unregisterDataSetObserver(this.r);
	            }
	        } else {
	            this.r = new yk(this);
	        }
	        this.j = p3;
	        if (this.j != null) {
	            p3.registerDataSetObserver(this.r);
	        }
	        if (this.c != null) {
	            this.c.setAdapter(this.j);
	        }
	        return;
	    }
	
	
	    public final void a(android.widget.PopupWindow$OnDismissListener p2)
	    {
	        this.b.setOnDismissListener(p2);
	        return;
	    }
	
	
	    public final void a(boolean p3)
	    {
	        this.y = 1;
	        this.b.setFocusable(1);
	        return;
	    }
	
	
	    public final boolean b()
	    {
	        return this.b.isShowing();
	    }
	
	
	    public final void c()
	    {
	        if (this.c != null) {
	            this.b.getContentView();
	        } else {
	            android.os.Handler v0_4;
	            yj v1_0 = this.i;
	            new yd(this);
	            if (this.y) {
	                v0_4 = 0;
	            } else {
	                v0_4 = 1;
	            }
	            this.c = new yf(v1_0, v0_4);
	            this.c.setAdapter(this.j);
	            this.c.setOnItemClickListener(this.h);
	            this.c.setFocusable(1);
	            this.c.setFocusableInTouchMode(1);
	            this.c.setOnItemSelectedListener(new ye(this));
	            this.c.setOnScrollListener(this.u);
	            this.b.setContentView(this.c);
	        }
	        android.os.Handler v0_12 = 0;
	        yj v1_10 = this.b.getBackground();
	        if (v1_10 == null) {
	            this.x.setEmpty();
	        } else {
	            v1_10.getPadding(this.x);
	            v0_12 = (this.x.top + this.x.bottom);
	            if (!this.o) {
	                this.n = (- this.x.top);
	            }
	        }
	        android.os.Handler v0_17;
	        this.b.getInputMethodMode();
	        int v8 = this.b.getMaxAvailableHeight(this.g, this.n);
	        if (this.k != -1) {
	            yj v1_27;
	            switch (this.l) {
	                case -2:
	                    v1_27 = android.view.View$MeasureSpec.makeMeasureSpec((this.i.getResources().getDisplayMetrics().widthPixels - (this.x.left + this.x.right)), -2147483648);
	                    break;
	                case -1:
	                    v1_27 = android.view.View$MeasureSpec.makeMeasureSpec((this.i.getResources().getDisplayMetrics().widthPixels - (this.x.left + this.x.right)), 1073741824);
	                    break;
	                default:
	                    v1_27 = android.view.View$MeasureSpec.makeMeasureSpec(this.l, 1073741824);
	            }
	            int v4_1;
	            yf v10 = this.c;
	            int v3_5 = v10.getListPaddingTop();
	            int v4_0 = v10.getListPaddingBottom();
	            v10.getListPaddingLeft();
	            v10.getListPaddingRight();
	            int v2_13 = v10.getDividerHeight();
	            int v5_0 = v10.getDivider();
	            android.widget.ListAdapter v11 = v10.getAdapter();
	            if (v11 != null) {
	                v4_1 = (v4_0 + v3_5);
	                if ((v2_13 <= 0) || (v5_0 == 0)) {
	                    v2_13 = 0;
	                }
	                android.view.View v6 = 0;
	                int v5_1 = 0;
	                int v12 = v11.getCount();
	                int v9 = 0;
	                while (v9 < v12) {
	                    int v3_8;
	                    int v3_7 = v11.getItemViewType(v9);
	                    if (v3_7 == v5_1) {
	                        v3_8 = v6;
	                    } else {
	                        v3_8 = 0;
	                        v5_1 = v3_7;
	                    }
	                    int v3_11;
	                    v6 = v11.getView(v9, v3_8, v10);
	                    int v3_9 = v6.getLayoutParams();
	                    if ((v3_9 == 0) || (v3_9.height <= 0)) {
	                        v3_11 = android.view.View$MeasureSpec.makeMeasureSpec(0, 0);
	                    } else {
	                        v3_11 = android.view.View$MeasureSpec.makeMeasureSpec(v3_9.height, 1073741824);
	                    }
	                    int v3_13;
	                    v6.measure(v1_27, v3_11);
	                    if (v9 <= 0) {
	                        v3_13 = v4_1;
	                    } else {
	                        v3_13 = (v4_1 + v2_13);
	                    }
	                    v4_1 = (v6.getMeasuredHeight() + v3_13);
	                    if (v4_1 < v8) {
	                        v9++;
	                    } else {
	                        v4_1 = v8;
	                        break;
	                    }
	                }
	            } else {
	                v4_1 = (v4_0 + v3_5);
	            }
	            android.os.Handler v0_16;
	            if (v4_1 <= 0) {
	                v0_16 = 0;
	            } else {
	                v0_16 = (v0_12 + 0);
	            }
	            v0_17 = (v0_16 + v4_1);
	        } else {
	            v0_17 = (v0_12 + v8);
	        }
	        yj v1_34 = 0;
	        int v3_15 = this.e();
	        if (!this.b.isShowing()) {
	            if (this.l != -1) {
	                if (this.l != -2) {
	                    this.b.setWidth(this.l);
	                } else {
	                    this.b.setWidth(this.g.getWidth());
	                }
	            } else {
	                v1_34 = -1;
	            }
	            android.os.Handler v0_19;
	            if (this.k != -1) {
	                if (this.k != -2) {
	                    this.b.setHeight(this.k);
	                    v0_19 = 0;
	                } else {
	                    this.b.setHeight(v0_17);
	                    v0_19 = 0;
	                }
	            } else {
	                v0_19 = -1;
	            }
	            this.b.setWindowLayoutMode(v1_34, v0_19);
	            if (yc.a != null) {
	                try {
	                    yj v1_35 = this.b;
	                    int v2_17 = new Object[1];
	                    v2_17[0] = Boolean.valueOf(1);
	                    yc.a.invoke(v1_35, v2_17);
	                } catch (android.os.Handler v0) {
	                }
	            }
	            this.b.setOutsideTouchable(1);
	            this.b.setTouchInterceptor(this.t);
	            ln.a(this.b, this.g, this.m, this.n, this.d);
	            this.c.setSelection(-1);
	            if ((!this.y) || (this.c.isInTouchMode())) {
	                this.d();
	            }
	            if (!this.y) {
	                this.w.post(this.v);
	            }
	        } else {
	            int v4_15;
	            if (this.l != -1) {
	                if (this.l != -2) {
	                    v4_15 = this.l;
	                } else {
	                    v4_15 = this.g.getWidth();
	                }
	            } else {
	                v4_15 = -1;
	            }
	            int v5_3;
	            if (this.k != -1) {
	                if (this.k != -2) {
	                    v5_3 = this.k;
	                } else {
	                    v5_3 = v0_17;
	                }
	            } else {
	                if (v3_15 == 0) {
	                    v5_3 = -1;
	                } else {
	                    v5_3 = v0_17;
	                }
	                if (v3_15 == 0) {
	                    android.os.Handler v0_32;
	                    if (this.l != -1) {
	                        v0_32 = 0;
	                    } else {
	                        v0_32 = -1;
	                    }
	                    this.b.setWindowLayoutMode(v0_32, -1);
	                } else {
	                    android.os.Handler v0_34;
	                    if (this.l != -1) {
	                        v0_34 = 0;
	                    } else {
	                        v0_34 = -1;
	                    }
	                    this.b.setWindowLayoutMode(v0_34, 0);
	                }
	            }
	            this.b.setOutsideTouchable(1);
	            this.b.update(this.g, this.m, this.n, v4_15, v5_3);
	        }
	        return;
	    }
	
	
	    public final void d()
	    {
	        yf v0 = this.c;
	        if (v0 != null) {
	            yf.a(v0, 1);
	            v0.requestLayout();
	        }
	        return;
	    }
	
	
	    public final boolean e()
	    {
	        int v0_2;
	        if (this.b.getInputMethodMode() != 2) {
	            v0_2 = 0;
	        } else {
	            v0_2 = 1;
	        }
	        return v0_2;
	    }
	
