	private android.database.DataSetObserver A
	 android.widget.SpinnerAdapter a
	  b
	  c
	final android.graphics.Rect d
	final qz e
	private  w
	private  x
	private  y
	private  z
	
	    qy(android.content.Context p3, android.util.AttributeSet p4, int p5)
	    {
	        this(p3, p4, p5);
	        this.w = 0;
	        this.x = 0;
	        this.y = 0;
	        this.z = 0;
	        this.d = new android.graphics.Rect();
	        this.e = new qz(this);
	        this.setFocusable(1);
	        this.setWillNotDraw(0);
	        return;
	    }
	
	
	    static synthetic void a(qy p1, android.view.View p2, boolean p3)
	    {
	        p1.removeDetachedView(p2, 1);
	        return;
	    }
	
	
	    final void a()
	    {
	        this.m = 0;
	        this.i = 0;
	        this.removeAllViewsInLayout();
	        this.t = -1;
	        this.u = -0.0;
	        this.b(-1);
	        this.c(-1);
	        this.invalidate();
	        return;
	    }
	
	
	    public final void a(int p1)
	    {
	        this.c(p1);
	        this.requestLayout();
	        this.invalidate();
	        return;
	    }
	
	
	    public void a(android.widget.SpinnerAdapter p5)
	    {
	        int v0_0 = -1;
	        if (this.a != null) {
	            this.a.unregisterDataSetObserver(this.A);
	            this.a();
	        }
	        this.a = p5;
	        this.t = -1;
	        this.u = -0.0;
	        if (this.a == null) {
	            this.d();
	            this.a();
	            this.f();
	        } else {
	            this.s = this.r;
	            this.r = this.a.getCount();
	            this.d();
	            this.A = new ry(this);
	            this.a.registerDataSetObserver(this.A);
	            if (this.r > 0) {
	                v0_0 = 0;
	            }
	            this.b(v0_0);
	            this.c(v0_0);
	            if (this.r == 0) {
	                this.f();
	            }
	        }
	        this.requestLayout();
	        return;
	    }
	
	
	    public final android.view.View b()
	    {
	        if ((this.r <= 0) || (this.p < 0)) {
	            android.view.View v0_2 = 0;
	        } else {
	            v0_2 = this.getChildAt((this.p - this.f));
	        }
	        return v0_2;
	    }
	
	
	    public final synthetic android.widget.Adapter c()
	    {
	        return this.a;
	    }
	
	
	    protected android.view.ViewGroup$LayoutParams generateDefaultLayoutParams()
	    {
	        return new android.view.ViewGroup$LayoutParams(-1, -2);
	    }
	
	
	    protected void onMeasure(int p9, int p10)
	    {
	        int v6 = android.view.View$MeasureSpec.getMode(p9);
	        int v0_0 = this.getPaddingLeft();
	        int v2_0 = this.getPaddingTop();
	        int v3_0 = this.getPaddingRight();
	        int v4 = this.getPaddingBottom();
	        if (v0_0 <= 0) {
	            v0_0 = 0;
	        }
	        int v0_1;
	        this.d.left = v0_0;
	        if (v2_0 <= 0) {
	            v0_1 = 0;
	        } else {
	            v0_1 = v2_0;
	        }
	        int v0_2;
	        this.d.top = v0_1;
	        if (v3_0 <= 0) {
	            v0_2 = 0;
	        } else {
	            v0_2 = v3_0;
	        }
	        int v0_3;
	        this.d.right = v0_2;
	        if (v4 <= 0) {
	            v0_3 = 0;
	        } else {
	            v0_3 = v4;
	        }
	        this.d.bottom = v0_3;
	        if (this.m) {
	            this.e();
	        }
	        int v2_4;
	        int v0_11;
	        int v3_2;
	        int v2_3 = this.n;
	        if ((v2_3 < 0) || ((this.a == null) || (v2_3 >= this.a.getCount()))) {
	            v3_2 = 1;
	            v0_11 = 0;
	            v2_4 = 0;
	        } else {
	            int v0_9 = this.e.a(v2_3);
	            if (v0_9 == 0) {
	                v0_9 = this.a.getView(v2_3, 0, this);
	            }
	            if (v0_9 == 0) {
	            } else {
	                this.e.a(v2_3, v0_9);
	                if (v0_9.getLayoutParams() == null) {
	                    this.v = 1;
	                    v0_9.setLayoutParams(this.generateDefaultLayoutParams());
	                    this.v = 0;
	                }
	                this.measureChild(v0_9, p9, p10);
	                v2_4 = ((v0_9.getMeasuredHeight() + this.d.top) + this.d.bottom);
	                v0_11 = ((v0_9.getMeasuredWidth() + this.d.left) + this.d.right);
	                v3_2 = 0;
	            }
	        }
	        if (v3_2 != 0) {
	            v2_4 = (this.d.top + this.d.bottom);
	            if (v6 == 0) {
	                v0_11 = (this.d.left + this.d.right);
	            }
	        }
	        this.setMeasuredDimension(gt.a(Math.max(v0_11, this.getSuggestedMinimumWidth()), p9, 0), gt.a(Math.max(v2_4, this.getSuggestedMinimumHeight()), p10, 0));
	        this.b = p10;
	        this.c = p9;
	        return;
	    }
	
	
	    public void onRestoreInstanceState(android.os.Parcelable p6)
	    {
	        super.onRestoreInstanceState(((ra) p6).getSuperState());
	        if (((ra) p6).a >= 0) {
	            this.m = 1;
	            this.i = 1;
	            this.h = ((ra) p6).a;
	            this.g = ((ra) p6).b;
	            this.j = 0;
	            this.requestLayout();
	        }
	        return;
	    }
	
	
	    public android.os.Parcelable onSaveInstanceState()
	    {
	        ra v1_1 = new ra(super.onSaveInstanceState());
	        v1_1.a = this.o;
	        if (v1_1.a < 0) {
	            v1_1.b = -1;
	        } else {
	            v1_1.b = this.n;
	        }
	        return v1_1;
	    }
	
	
	    public void requestLayout()
	    {
	        if (!this.v) {
	            super.requestLayout();
	        }
	        return;
	    }
	
