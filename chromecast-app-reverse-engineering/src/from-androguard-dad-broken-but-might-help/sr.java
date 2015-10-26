	private  A
	private android.graphics.Rect B
	private yg w
	private ta x
	private sv y
	private  z
	
	    sr(android.content.Context p3, android.util.AttributeSet p4, int p5)
	    {
	        this(p3, 0, p5, -1);
	        return;
	    }
	
	
	    private sr(android.content.Context p6, android.util.AttributeSet p7, int p8, int p9)
	    {
	        this(p6, p7, p8);
	        this.B = new android.graphics.Rect();
	        th v0_3 = th.a(p6, p7, oq.bo, p8, 0);
	        if (v0_3.d(oq.bp)) {
	            this.setBackgroundDrawable(v0_3.a(oq.bp));
	        }
	        switch (v0_3.a(oq.bv, 0)) {
	            case 0:
	                this.x = new su(this);
	                break;
	            case 1:
	                int v1_7 = new sw(this, p6, p7, p8);
	                v0_3.d(oq.bq, -2);
	                v1_7.b.setBackgroundDrawable(v0_3.a(oq.bs));
	                this.x = v1_7;
	                this.w = new ss(this, this, v1_7);
	                break;
	        }
	        this.z = v0_3.a(oq.br, 17);
	        this.x.a(v0_3.a.getString(oq.bu));
	        this.A = v0_3.a(oq.bt, 0);
	        v0_3.a.recycle();
	        if (this.y != null) {
	            this.x.a(this.y);
	            this.y = 0;
	        }
	        v0_3.a();
	        return;
	    }
	
	
	    private android.view.View a(int p3, boolean p4)
	    {
	        android.view.View v0_2;
	        if (this.m) {
	            v0_2 = this.a.getView(p3, 0, this);
	            this.a(v0_2, p4);
	        } else {
	            v0_2 = this.e.a(p3);
	            if (v0_2 == null) {
	            } else {
	                this.a(v0_2, p4);
	            }
	        }
	        return v0_2;
	    }
	
	
	    static synthetic ta a(sr p1)
	    {
	        return p1.x;
	    }
	
	
	    private void a(android.view.View p7, boolean p8)
	    {
	        int v0_0 = p7.getLayoutParams();
	        if (v0_0 == 0) {
	            v0_0 = this.generateDefaultLayoutParams();
	        }
	        if (p8) {
	            this.addViewInLayout(p7, 0, v0_0);
	        }
	        p7.setSelected(this.hasFocus());
	        if (this.A) {
	            p7.setEnabled(this.isEnabled());
	        }
	        p7.measure(android.view.ViewGroup.getChildMeasureSpec(this.c, (this.d.left + this.d.right), v0_0.width), android.view.ViewGroup.getChildMeasureSpec(this.b, (this.d.top + this.d.bottom), v0_0.height));
	        int v0_5 = (this.d.top + ((((this.getMeasuredHeight() - this.d.bottom) - this.d.top) - p7.getMeasuredHeight()) / 2));
	        p7.layout(0, v0_5, (p7.getMeasuredWidth() + 0), (p7.getMeasuredHeight() + v0_5));
	        return;
	    }
	
	
	    public final void a(android.widget.SpinnerAdapter p3)
	    {
	        super.a(p3);
	        this.e.a();
	        if ((this.getContext().getApplicationInfo().targetSdkVersion < 21) || ((p3 == null) || (p3.getViewTypeCount() == 1))) {
	            if (this.x == null) {
	                this.y = new sv(p3);
	            } else {
	                this.x.a(new sv(p3));
	            }
	            return;
	        } else {
	            throw new IllegalArgumentException("Spinner adapter view type count must be 1");
	        }
	    }
	
	
	    public final void a(rz p3)
	    {
	        throw new RuntimeException("setOnItemClickListener cannot be used with a spinner.");
	    }
	
	
	    final void b(rz p1)
	    {
	        super.a(p1);
	        return;
	    }
	
	
	    public final int getBaseline()
	    {
	        int v0_0 = -1;
	        android.view.View v1 = 0;
	        if (this.getChildCount() <= 0) {
	            if ((this.a != null) && (this.a.getCount() > 0)) {
	                v1 = this.a(0, 0);
	                this.e.a(0, v1);
	            }
	        } else {
	            v1 = this.getChildAt(0);
	        }
	        if (v1 != null) {
	            qz v2_5 = v1.getBaseline();
	            if (v2_5 >= null) {
	                v0_0 = (v1.getTop() + v2_5);
	            }
	        }
	        return v0_0;
	    }
	
	
	    public final void onClick(android.content.DialogInterface p1, int p2)
	    {
	        this.a(p2);
	        p1.dismiss();
	        return;
	    }
	
	
	    protected final void onDetachedFromWindow()
	    {
	        super.onDetachedFromWindow();
	        if ((this.x != null) && (this.x.b())) {
	            this.x.a();
	        }
	        return;
	    }
	
	
	    protected final void onLayout(boolean p11, int p12, int p13, int p14, int p15)
	    {
	        this = super.onLayout(p11, p12, p13, p14, p15);
	        this.k = 1;
	        int v0_1 = this.d.left;
	        int v3_5 = (((this.getRight() - this.getLeft()) - this.d.left) - this.d.right);
	        if (this.m) {
	            this.e();
	        }
	        if (this.r != 0) {
	            if (this.n >= 0) {
	                this.b(this.n);
	            }
	            int v4_0 = this.getChildCount();
	            android.view.View v1_7 = 0;
	            while (v1_7 < v4_0) {
	                this.e.a((this.f + v1_7), this.getChildAt(v1_7));
	                v1_7++;
	            }
	            this.removeAllViewsInLayout();
	            this.f = this.p;
	            if (this.a != null) {
	                android.view.View v1_11 = this.a(this.p, 1);
	                int v4_1 = v1_11.getMeasuredWidth();
	                switch ((fe.a(this.z, gt.g(this)) & 7)) {
	                    case 1:
	                        v0_1 = ((v0_1 + (v3_5 / 2)) - (v4_1 / 2));
	                        break;
	                    case 5:
	                        v0_1 = ((v0_1 + v3_5) - v4_1);
	                        break;
	                }
	                v1_11.offsetLeftAndRight(v0_1);
	            }
	            this.e.a();
	            this.invalidate();
	            this.f();
	            this.m = 0;
	            this.i = 0;
	            this.c(this.p);
	        } else {
	            this.a();
	        }
	        this.k = 0;
	        return;
	    }
	
	
	    protected final void onMeasure(int p14, int p15)
	    {
	        int v0_0 = 0;
	        super.onMeasure(p14, p15);
	        if ((this.x != null) && (android.view.View$MeasureSpec.getMode(p14) == -2147483648)) {
	            int v6 = this.getMeasuredWidth();
	            android.widget.SpinnerAdapter v7 = this.a;
	            android.graphics.drawable.Drawable v8 = this.getBackground();
	            if (v7 != null) {
	                int v9 = android.view.View$MeasureSpec.makeMeasureSpec(0, 0);
	                int v10 = android.view.View$MeasureSpec.makeMeasureSpec(0, 0);
	                int v1_3 = Math.max(0, this.n);
	                int v11 = Math.min(v7.getCount(), (v1_3 + 15));
	                int v5 = Math.max(0, (v1_3 - (15 - (v11 - v1_3))));
	                android.view.View v3_4 = 0;
	                int v4_1 = 0;
	                int v1_6 = 0;
	                while (v5 < v11) {
	                    int v1_9;
	                    int v0_5 = v7.getItemViewType(v5);
	                    if (v0_5 == v1_6) {
	                        v0_5 = v1_6;
	                        v1_9 = v3_4;
	                    } else {
	                        v1_9 = 0;
	                    }
	                    v3_4 = v7.getView(v5, v1_9, this);
	                    if (v3_4.getLayoutParams() == null) {
	                        v3_4.setLayoutParams(new android.view.ViewGroup$LayoutParams(-2, -2));
	                    }
	                    v3_4.measure(v9, v10);
	                    v4_1 = Math.max(v4_1, v3_4.getMeasuredWidth());
	                    v5++;
	                    v1_6 = v0_5;
	                }
	                if (v8 == null) {
	                    v0_0 = v4_1;
	                } else {
	                    v8.getPadding(this.B);
	                    v0_0 = ((this.B.left + this.B.right) + v4_1);
	                }
	            }
	            this.setMeasuredDimension(Math.min(Math.max(v6, v0_0), android.view.View$MeasureSpec.getSize(p14)), this.getMeasuredHeight());
	        }
	        return;
	    }
	
	
	    public final void onRestoreInstanceState(android.os.Parcelable p3)
	    {
	        super.onRestoreInstanceState(((sy) p3).getSuperState());
	        if (((sy) p3).c) {
	            android.view.ViewTreeObserver v0_2 = this.getViewTreeObserver();
	            if (v0_2 != null) {
	                v0_2.addOnGlobalLayoutListener(new st(this));
	            }
	        }
	        return;
	    }
	
	
	    public final android.os.Parcelable onSaveInstanceState()
	    {
	        int v0_4;
	        sy v1_1 = new sy(super.onSaveInstanceState());
	        if ((this.x == null) || (!this.x.b())) {
	            v0_4 = 0;
	        } else {
	            v0_4 = 1;
	        }
	        v1_1.c = v0_4;
	        return v1_1;
	    }
	
	
	    public final boolean onTouchEvent(android.view.MotionEvent p2)
	    {
	        if ((this.w == null) || (!this.w.onTouch(this, p2))) {
	            int v0_3 = super.onTouchEvent(p2);
	        } else {
	            v0_3 = 1;
	        }
	        return v0_3;
	    }
	
	
	    public final boolean performClick()
	    {
	        int v0 = super.performClick();
	        if (v0 == 0) {
	            v0 = 1;
	            if (!this.x.b()) {
	                this.x.c();
	            }
	        }
	        return v0;
	    }
	
	
	    public final void setEnabled(boolean p4)
	    {
	        super.setEnabled(p4);
	        if (this.A) {
	            int v1 = this.getChildCount();
	            int v0_1 = 0;
	            while (v0_1 < v1) {
	                this.getChildAt(v0_1).setEnabled(p4);
	                v0_1++;
	            }
	        }
	        return;
	    }
	
