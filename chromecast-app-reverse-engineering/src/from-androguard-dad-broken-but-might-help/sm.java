	 java.lang.Runnable a
	public  b
	  c
	private sp d
	private sr e
	private  f
	private  g
	private  h
	
	    static sm()
	    {
	        new android.view.animation.DecelerateInterpolator();
	        return;
	    }
	
	
	    static synthetic sq a(sm p4, ml p5, boolean p6)
	    {
	        sq v1_1 = new sq(p4, p4.getContext(), p5, 1);
	        v1_1.setBackgroundDrawable(0);
	        v1_1.setLayoutParams(new android.widget.AbsListView$LayoutParams(-1, p4.g));
	        return v1_1;
	    }
	
	
	    static synthetic xu a(sm p1)
	    {
	        return 0;
	    }
	
	
	    private void a(int p7)
	    {
	        this.h = p7;
	        int v3 = 0.getChildCount();
	        int v2 = 0;
	        while (v2 < v3) {
	            Runnable v0_2;
	            sn v4_0 = 0.getChildAt(v2);
	            if (v2 != p7) {
	                v0_2 = 0;
	            } else {
	                v0_2 = 1;
	            }
	            v4_0.setSelected(v0_2);
	            if (v0_2 != null) {
	                Runnable v0_3 = 0.getChildAt(p7);
	                if (this.a != null) {
	                    this.removeCallbacks(this.a);
	                }
	                this.a = new sn(this, v0_3);
	                this.post(this.a);
	            }
	            v2++;
	        }
	        if ((this.e != null) && (p7 >= 0)) {
	            this.e.a(p7);
	        }
	        return;
	    }
	
	
	    private boolean a()
	    {
	        if ((this.e == null) || (this.e.getParent() != this)) {
	            int v0_3 = 0;
	        } else {
	            v0_3 = 1;
	        }
	        return v0_3;
	    }
	
	
	    private boolean b()
	    {
	        if (this.a()) {
	            this.removeView(this.e);
	            this.addView(0, new android.view.ViewGroup$LayoutParams(-2, -1));
	            this.a(this.e.n);
	        }
	        return 0;
	    }
	
	
	    public final void onAttachedToWindow()
	    {
	        super.onAttachedToWindow();
	        if (this.a != null) {
	            this.post(this.a);
	        }
	        return;
	    }
	
	
	    protected final void onConfigurationChanged(android.content.res.Configuration p7)
	    {
	        if (android.os.Build$VERSION.SDK_INT >= 8) {
	            super.onConfigurationChanged(p7);
	        }
	        int v1_1 = ph.a(this.getContext());
	        android.content.res.TypedArray v2_1 = v1_1.a.obtainStyledAttributes(0, oq.a, a.i, 0);
	        int v0_4 = v2_1.getLayoutDimension(oq.j, 0);
	        int v3_2 = v1_1.a.getResources();
	        if (!v1_1.a()) {
	            v0_4 = Math.min(v0_4, v3_2.getDimensionPixelSize(a.Z));
	        }
	        v2_1.recycle();
	        this.g = v0_4;
	        this.requestLayout();
	        this.f = v1_1.a.getResources().getDimensionPixelSize(a.aa);
	        return;
	    }
	
	
	    public final void onDetachedFromWindow()
	    {
	        super.onDetachedFromWindow();
	        if (this.a != null) {
	            this.removeCallbacks(this.a);
	        }
	        return;
	    }
	
	
	    public final void onMeasure(int p10, int p11)
	    {
	        int v0_0;
	        sr v1_0 = 1;
	        int v3_0 = android.view.View$MeasureSpec.getMode(p10);
	        if (v3_0 != 1073741824) {
	            v0_0 = 0;
	        } else {
	            v0_0 = 1;
	        }
	        this.setFillViewport(v0_0);
	        int v4_0 = 0.getChildCount();
	        if ((v4_0 <= 1) || ((v3_0 != 1073741824) && (v3_0 != -2147483648))) {
	            this.c = -1;
	        } else {
	            if (v4_0 <= 2) {
	                this.c = (android.view.View$MeasureSpec.getSize(p10) / 2);
	            } else {
	                this.c = ((int) (((float) android.view.View$MeasureSpec.getSize(p10)) * 1053609165));
	            }
	            this.c = Math.min(this.c, this.f);
	        }
	        int v3_11 = android.view.View$MeasureSpec.makeMeasureSpec(this.g, 1073741824);
	        if ((v0_0 != 0) || (!this.b)) {
	            v1_0 = 0;
	        }
	        if (v1_0 == null) {
	            this.b();
	        } else {
	            0.measure(0, v3_11);
	            if (0.getMeasuredWidth() <= android.view.View$MeasureSpec.getSize(p10)) {
	                this.b();
	            } else {
	                if (!this.a()) {
	                    if (this.e == null) {
	                        sr v1_5 = new sr(this.getContext(), 0, a.n);
	                        v1_5.setLayoutParams(new xv(-2, -1));
	                        v1_5.b(this);
	                        this.e = v1_5;
	                    }
	                    this.removeView(0);
	                    this.addView(this.e, new android.view.ViewGroup$LayoutParams(-2, -1));
	                    if (this.e.a == null) {
	                        this.e.a(new so(this));
	                    }
	                    if (this.a != null) {
	                        this.removeCallbacks(this.a);
	                        this.a = 0;
	                    }
	                    this.e.a(this.h);
	                }
	            }
	        }
	        sr v1_13 = this.getMeasuredWidth();
	        super.onMeasure(p10, v3_11);
	        int v2_10 = this.getMeasuredWidth();
	        if ((v0_0 != 0) && (v1_13 != v2_10)) {
	            this.a(this.h);
	        }
	        return;
	    }
	
