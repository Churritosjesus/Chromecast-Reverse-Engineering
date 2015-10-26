	private  a
	private  b
	private  c
	private sa d
	  f
	  g
	  h
	  i
	  j
	  k
	 rz l
	  m
	  n
	  o
	  p
	  q
	  r
	  s
	  t
	  u
	  v
	
	    rx(android.content.Context p5, android.util.AttributeSet p6, int p7)
	    {
	        this(p5, p6, p7);
	        this.f = 0;
	        this.h = -0.0;
	        this.i = 0;
	        this.k = 0;
	        this.n = -1;
	        this.o = -0.0;
	        this.p = -1;
	        this.q = -0.0;
	        this.t = -1;
	        this.u = -0.0;
	        this.v = 0;
	        return;
	    }
	
	
	    private long a(int p3)
	    {
	        long v0_1;
	        long v0_0 = this.c();
	        if ((v0_0 != 0) && (p3 >= 0)) {
	            v0_1 = v0_0.getItemId(p3);
	        } else {
	            v0_1 = -0.0;
	        }
	        return v0_1;
	    }
	
	
	    static synthetic android.os.Parcelable a(rx p1)
	    {
	        return p1.onSaveInstanceState();
	    }
	
	
	    static synthetic void a(rx p0, android.os.Parcelable p1)
	    {
	        p0.onRestoreInstanceState(p1);
	        return;
	    }
	
	
	    static synthetic void b(rx p0)
	    {
	        return;
	    }
	
	
	    public void a(rz p1)
	    {
	        this.l = p1;
	        return;
	    }
	
	
	    public final boolean a(android.view.View p4, int p5, long p6)
	    {
	        int v0 = 1;
	        if (this.l == null) {
	            v0 = 0;
	        } else {
	            this.playSoundEffect(0);
	            if (p4 != null) {
	                p4.sendAccessibilityEvent(1);
	            }
	        }
	        return v0;
	    }
	
	
	    public void addView(android.view.View p3)
	    {
	        throw new UnsupportedOperationException("addView(View) is not supported in AdapterView");
	    }
	
	
	    public void addView(android.view.View p3, int p4)
	    {
	        throw new UnsupportedOperationException("addView(View, int) is not supported in AdapterView");
	    }
	
	
	    public void addView(android.view.View p3, int p4, android.view.ViewGroup$LayoutParams p5)
	    {
	        throw new UnsupportedOperationException("addView(View, int, LayoutParams) is not supported in AdapterView");
	    }
	
	
	    public void addView(android.view.View p3, android.view.ViewGroup$LayoutParams p4)
	    {
	        throw new UnsupportedOperationException("addView(View, LayoutParams) is not supported in AdapterView");
	    }
	
	
	    final void b(int p3)
	    {
	        this.p = p3;
	        this.q = this.a(p3);
	        return;
	    }
	
	
	    final void c(int p3)
	    {
	        this.n = p3;
	        this.o = this.a(p3);
	        if ((this.i) && ((this.j == 0) && (p3 >= 0))) {
	            this.g = p3;
	            this.h = this.o;
	        }
	        return;
	    }
	
	
	    protected boolean canAnimate()
	    {
	        if ((!super.canAnimate()) || (this.r <= 0)) {
	            int v0_2 = 0;
	        } else {
	            v0_2 = 1;
	        }
	        return v0_2;
	    }
	
	
	    final void d()
	    {
	        boolean v0_2;
	        int v1 = 1;
	        boolean v0_0 = this.c();
	        if ((v0_0) && (v0_0.getCount() != 0)) {
	            v0_2 = 0;
	        } else {
	            v0_2 = 1;
	        }
	        int v3;
	        if (v0_2) {
	            v3 = 0;
	        } else {
	            v3 = 1;
	        }
	        if ((v3 == 0) || (!this.c)) {
	            boolean v0_4 = 0;
	        } else {
	            v0_4 = 1;
	        }
	        super.setFocusableInTouchMode(v0_4);
	        if ((v3 == 0) || (!this.b)) {
	            v1 = 0;
	        }
	        super.setFocusable(v1);
	        return;
	    }
	
	
	    public boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent p3)
	    {
	        int v0_2;
	        int v0_0 = this.b();
	        if ((v0_0 == 0) || ((v0_0.getVisibility() != 0) || (!v0_0.dispatchPopulateAccessibilityEvent(p3)))) {
	            v0_2 = 0;
	        } else {
	            v0_2 = 1;
	        }
	        return v0_2;
	    }
	
	
	    protected void dispatchRestoreInstanceState(android.util.SparseArray p1)
	    {
	        this.dispatchThawSelfOnly(p1);
	        return;
	    }
	
	
	    protected void dispatchSaveInstanceState(android.util.SparseArray p1)
	    {
	        this.dispatchFreezeSelfOnly(p1);
	        return;
	    }
	
	
	    final void e()
	    {
	        int v2_0;
	        int v9 = this.r;
	        if (v9 <= 0) {
	            v2_0 = 0;
	        } else {
	            if (!this.i) {
	                v2_0 = 0;
	            } else {
	                int v5;
	                this.i = 0;
	                int v10 = this.r;
	                if (v10 == 0) {
	                    v5 = -1;
	                } else {
	                    long v12 = this.h;
	                    if (v12 == -0.0) {
	                    } else {
	                        int v3_3 = Math.min((v10 - 1), Math.max(0, this.g));
	                        long v14_1 = (100 + android.os.SystemClock.uptimeMillis());
	                        int v2_5 = 0;
	                        android.widget.Adapter v11 = this.c();
	                        if (v11 == null) {
	                        } else {
	                            int v4_2 = v3_3;
	                            v5 = v3_3;
	                            while (android.os.SystemClock.uptimeMillis() <= v14_1) {
	                                if (v11.getItemId(v5) != v12) {
	                                    int v8;
	                                    if (v3_3 != (v10 - 1)) {
	                                        v8 = 0;
	                                    } else {
	                                        v8 = 1;
	                                    }
	                                    int v7_5;
	                                    if (v4_2 != 0) {
	                                        v7_5 = 0;
	                                    } else {
	                                        v7_5 = 1;
	                                    }
	                                    if ((v8 != 0) && (v7_5 != 0)) {
	                                        break;
	                                    }
	                                    if ((v7_5 == 0) && ((v2_5 == 0) || (v8 != 0))) {
	                                        if ((v8 != 0) || ((v2_5 == 0) && (v7_5 == 0))) {
	                                            v4_2--;
	                                            v2_5 = 1;
	                                            v5 = v4_2;
	                                        }
	                                    } else {
	                                        v3_3++;
	                                        v2_5 = 0;
	                                        v5 = v3_3;
	                                    }
	                                }
	                            }
	                        }
	                    }
	                }
	                if ((v5 < 0) || (v5 != v5)) {
	                } else {
	                    this.c(v5);
	                    v2_0 = 1;
	                }
	            }
	            if (v2_0 == 0) {
	                int v3_4 = this.n;
	                if (v3_4 >= v9) {
	                    v3_4 = (v9 - 1);
	                }
	                if (v3_4 < 0) {
	                    v3_4 = 0;
	                }
	                // Both branches of the condition point to the same code.
	                // if (v3_4 >= 0) {
	                    if (v3_4 >= 0) {
	                        this.c(v3_4);
	                        this.f();
	                        v2_0 = 1;
	                    }
	                // }
	            }
	        }
	        if (v2_0 == 0) {
	            this.p = -1;
	            this.q = -0.0;
	            this.n = -1;
	            this.o = -0.0;
	            this.i = 0;
	            this.f();
	        }
	        return;
	    }
	
	
	    final void f()
	    {
	        if ((this.p != this.t) || (this.q != this.u)) {
	            if ((this.p != -1) && ((this.isShown()) && (!this.isInTouchMode()))) {
	                this.sendAccessibilityEvent(4);
	            }
	            this.t = this.p;
	            this.u = this.q;
	        }
	        return;
	    }
	
	
	    protected void onDetachedFromWindow()
	    {
	        super.onDetachedFromWindow();
	        this.removeCallbacks(this.d);
	        return;
	    }
	
	
	    protected void onLayout(boolean p2, int p3, int p4, int p5, int p6)
	    {
	        this.a = this.getHeight();
	        return;
	    }
	
	
	    public void removeAllViews()
	    {
	        throw new UnsupportedOperationException("removeAllViews() is not supported in AdapterView");
	    }
	
	
	    public void removeView(android.view.View p3)
	    {
	        throw new UnsupportedOperationException("removeView(View) is not supported in AdapterView");
	    }
	
	
	    public void removeViewAt(int p3)
	    {
	        throw new UnsupportedOperationException("removeViewAt(int) is not supported in AdapterView");
	    }
	
	
	    public void setFocusable(boolean p4)
	    {
	        int v0_2;
	        int v2 = 1;
	        int v0_0 = this.c();
	        if ((v0_0 != 0) && (v0_0.getCount() != 0)) {
	            v0_2 = 0;
	        } else {
	            v0_2 = 1;
	        }
	        this.b = p4;
	        if (!p4) {
	            this.c = 0;
	        }
	        if ((!p4) || (v0_2 != 0)) {
	            v2 = 0;
	        }
	        super.setFocusable(v2);
	        return;
	    }
	
	
	    public void setFocusableInTouchMode(boolean p4)
	    {
	        int v0_2;
	        int v2 = 1;
	        int v0_0 = this.c();
	        if ((v0_0 != 0) && (v0_0.getCount() != 0)) {
	            v0_2 = 0;
	        } else {
	            v0_2 = 1;
	        }
	        this.c = p4;
	        if (p4) {
	            this.b = 1;
	        }
	        if ((!p4) || (v0_2 != 0)) {
	            v2 = 0;
	        }
	        super.setFocusableInTouchMode(v2);
	        return;
	    }
	
	
	    public void setOnClickListener(android.view.View$OnClickListener p3)
	    {
	        throw new RuntimeException("Don\'t call setOnClickListener for an AdapterView. You probably want setOnItemClickListener instead");
	    }
	
