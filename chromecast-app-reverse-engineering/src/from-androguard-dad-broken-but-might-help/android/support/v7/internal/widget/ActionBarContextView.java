	public java.lang.CharSequence g
	public java.lang.CharSequence h
	public android.view.View i
	public  j
	public pp k
	public  l
	private android.view.View m
	private android.widget.LinearLayout n
	private android.widget.TextView o
	private android.widget.TextView p
	private  q
	private  r
	private android.graphics.drawable.Drawable s
	private  t
	private  u
	
	    public ActionBarContextView(android.content.Context p2)
	    {
	        this(p2, 0);
	        return;
	    }
	
	
	    public ActionBarContextView(android.content.Context p2, android.util.AttributeSet p3)
	    {
	        this(p2, p3, a.q);
	        return;
	    }
	
	
	    public ActionBarContextView(android.content.Context p4, android.util.AttributeSet p5, int p6)
	    {
	        this(p4, p5, p6);
	        android.content.res.TypedArray v0_1 = th.a(p4, p5, oq.x, p6, 0);
	        this.setBackgroundDrawable(v0_1.a(oq.y));
	        this.q = v0_1.e(oq.D, 0);
	        this.r = v0_1.e(oq.C, 0);
	        this.e = v0_1.d(oq.B, 0);
	        this.s = v0_1.a(oq.z);
	        this.t = v0_1.e(oq.A, a.bE);
	        v0_1.a.recycle();
	        return;
	    }
	
	
	    private void d()
	    {
	        int v4 = 8;
	        int v1 = 1;
	        if (this.n == null) {
	            android.view.LayoutInflater.from(this.getContext()).inflate(a.bB, this);
	            this.n = ((android.widget.LinearLayout) this.getChildAt((this.getChildCount() - 1)));
	            this.o = ((android.widget.TextView) this.n.findViewById(a.aT));
	            this.p = ((android.widget.TextView) this.n.findViewById(a.aS));
	            if (this.q != 0) {
	                this.o.setTextAppearance(this.getContext(), this.q);
	            }
	            if (this.r != 0) {
	                this.p.setTextAppearance(this.getContext(), this.r);
	            }
	        }
	        android.widget.LinearLayout v0_21;
	        this.o.setText(this.g);
	        this.p.setText(this.h);
	        if (android.text.TextUtils.isEmpty(this.g)) {
	            v0_21 = 0;
	        } else {
	            v0_21 = 1;
	        }
	        if (android.text.TextUtils.isEmpty(this.h)) {
	            v1 = 0;
	        }
	        android.widget.LinearLayout v3_9;
	        if (v1 == 0) {
	            v3_9 = 8;
	        } else {
	            v3_9 = 0;
	        }
	        this.p.setVisibility(v3_9);
	        if ((v0_21 != null) || (v1 != 0)) {
	            v4 = 0;
	        }
	        this.n.setVisibility(v4);
	        if (this.n.getParent() == null) {
	            this.addView(this.n);
	        }
	        return;
	    }
	
	
	    public final void a(int p1)
	    {
	        this.e = p1;
	        return;
	    }
	
	
	    public final void a(android.view.View p1)
	    {
	        return;
	    }
	
	
	    public final void a(CharSequence p1)
	    {
	        this.g = p1;
	        this.d();
	        return;
	    }
	
	
	    public final void a(vr p6)
	    {
	        if (this.i != null) {
	            if (this.i.getParent() == null) {
	                this.addView(this.i);
	            }
	        } else {
	            this.i = android.view.LayoutInflater.from(this.getContext()).inflate(this.t, this, 0);
	            this.addView(this.i);
	        }
	        this.i.findViewById(a.aW).setOnClickListener(new re(this, p6));
	        android.support.v7.widget.ActionMenuView v0_11 = ((qa) p6.b());
	        if (this.c != null) {
	            this.c.d();
	        }
	        this.c = new vu(this.getContext());
	        this.c.c(1);
	        android.view.ViewGroup$LayoutParams v1_10 = new android.view.ViewGroup$LayoutParams(-2, -1);
	        v0_11.a(this.c, this.a);
	        this.b = ((android.support.v7.widget.ActionMenuView) this.c.a(this));
	        this.b.setBackgroundDrawable(0);
	        this.addView(this.b, v1_10);
	        this.u = 1;
	        return;
	    }
	
	
	    public final void a(boolean p2)
	    {
	        if (p2 != this.j) {
	            this.requestLayout();
	        }
	        this.j = p2;
	        return;
	    }
	
	
	    public final boolean a()
	    {
	        int v0_1;
	        if (this.c == null) {
	            v0_1 = 0;
	        } else {
	            v0_1 = this.c.b();
	        }
	        return v0_1;
	    }
	
	
	    public void b()
	    {
	        pp v0 = this.k;
	        if (v0 != null) {
	            this.k = 0;
	            v0.b();
	        }
	        return;
	    }
	
	
	    public final bridge synthetic void b(int p1)
	    {
	        super.b(p1);
	        return;
	    }
	
	
	    public final void b(android.view.View p3)
	    {
	        if (this.l == 2) {
	            this.c();
	        }
	        this.l = 0;
	        return;
	    }
	
	
	    public final void b(CharSequence p1)
	    {
	        this.h = p1;
	        this.d();
	        return;
	    }
	
	
	    public final void c()
	    {
	        this.b();
	        this.removeAllViews();
	        this.m = 0;
	        this.b = 0;
	        this.u = 0;
	        return;
	    }
	
	
	    public final void c(android.view.View p1)
	    {
	        return;
	    }
	
	
	    public final void d(android.view.View p2)
	    {
	        if (this.m != null) {
	            this.removeView(this.m);
	        }
	        this.m = p2;
	        if (this.n != null) {
	            this.removeView(this.n);
	            this.n = 0;
	        }
	        if (p2 != null) {
	            this.addView(p2);
	        }
	        this.requestLayout();
	        return;
	    }
	
	
	    protected android.view.ViewGroup$LayoutParams generateDefaultLayoutParams()
	    {
	        return new android.view.ViewGroup$MarginLayoutParams(-1, -2);
	    }
	
	
	    public android.view.ViewGroup$LayoutParams generateLayoutParams(android.util.AttributeSet p3)
	    {
	        return new android.view.ViewGroup$MarginLayoutParams(this.getContext(), p3);
	    }
	
	
	    public void onDetachedFromWindow()
	    {
	        super.onDetachedFromWindow();
	        if (this.c != null) {
	            this.c.c();
	            this.c.e();
	        }
	        return;
	    }
	
	
	    public void onInitializeAccessibilityEvent(android.view.accessibility.AccessibilityEvent p3)
	    {
	        if (android.os.Build$VERSION.SDK_INT >= 14) {
	            if (p3.getEventType() != 32) {
	                super.onInitializeAccessibilityEvent(p3);
	            } else {
	                p3.setSource(this);
	                p3.setClassName(this.getClass().getName());
	                p3.setPackageName(this.getContext().getPackageName());
	                p3.setContentDescription(this.g);
	            }
	        }
	        return;
	    }
	
	
	    protected void onLayout(boolean p11, int p12, int p13, int p14, int p15)
	    {
	        int v1_0;
	        boolean v3 = tm.a(this);
	        if (!v3) {
	            v1_0 = this.getPaddingLeft();
	        } else {
	            v1_0 = ((p14 - p12) - this.getPaddingRight());
	        }
	        int v4 = this.getPaddingTop();
	        int v5 = (((p15 - p13) - this.getPaddingTop()) - this.getPaddingBottom());
	        if ((this.i != null) && (this.i.getVisibility() != 8)) {
	            int v2_3;
	            int v0_10 = ((android.view.ViewGroup$MarginLayoutParams) this.i.getLayoutParams());
	            if (!v3) {
	                v2_3 = v0_10.leftMargin;
	            } else {
	                v2_3 = v0_10.rightMargin;
	            }
	            int v0_11;
	            if (!v3) {
	                v0_11 = v0_10.rightMargin;
	            } else {
	                v0_11 = v0_10.leftMargin;
	            }
	            int v1_2 = android.support.v7.internal.widget.ActionBarContextView.a(v1_0, v2_3, v3);
	            v1_0 = android.support.v7.internal.widget.ActionBarContextView.a((v1_2 + android.support.v7.internal.widget.ActionBarContextView.a(this.i, v1_2, v4, v5, v3)), v0_11, v3);
	            if (this.u) {
	                this.l = 1;
	                gt.a(this.i, ((float) ((- this.i.getWidth()) - ((android.view.ViewGroup$MarginLayoutParams) this.i.getLayoutParams()).leftMargin)));
	                int v0_24 = gt.o(this.i).b(0);
	                v0_24.a(200);
	                v0_24.a(this);
	                v0_24.a(new android.view.animation.DecelerateInterpolator());
	                pp v6_3 = new pp();
	                v6_3.a(v0_24);
	                if (this.b != null) {
	                    int v0_27 = this.b.getChildCount();
	                    if (v0_27 > 0) {
	                        int v2_10 = (v0_27 - 1);
	                        while (v2_10 >= 0) {
	                            int v0_42 = this.b.getChildAt(v2_10);
	                            gt.e(v0_42, 0);
	                            ih v7_1 = gt.o(v0_42);
	                            int v0_45 = ((android.view.View) v7_1.a.get());
	                            if (v0_45 != 0) {
	                                ih.b.d(v7_1, v0_45, 1065353216);
	                            }
	                            v7_1.a(300);
	                            v6_3.a(v7_1);
	                            v2_10--;
	                        }
	                    }
	                }
	                this.k = v6_3;
	                this.k.a();
	                this.u = 0;
	            }
	        }
	        if ((this.n != null) && ((this.m == null) && (this.n.getVisibility() != 8))) {
	            v1_0 += android.support.v7.internal.widget.ActionBarContextView.a(this.n, v1_0, v4, v5, v3);
	        }
	        if (this.m != null) {
	            android.support.v7.internal.widget.ActionBarContextView.a(this.m, v1_0, v4, v5, v3);
	        }
	        int v0_40;
	        if (!v3) {
	            v0_40 = ((p14 - p12) - this.getPaddingRight());
	        } else {
	            v0_40 = this.getPaddingLeft();
	        }
	        if (this.b != null) {
	            int v1_6;
	            if (v3) {
	                v1_6 = 0;
	            } else {
	                v1_6 = 1;
	            }
	            android.support.v7.internal.widget.ActionBarContextView.a(this.b, v0_40, v4, v5, v1_6);
	        }
	        return;
	    }
	
	
	    protected void onMeasure(int p13, int p14)
	    {
	        int v4 = 1073741824;
	        int v3 = 0;
	        if (android.view.View$MeasureSpec.getMode(p13) == 1073741824) {
	            if (android.view.View$MeasureSpec.getMode(p14) != 0) {
	                int v1_0;
	                int v7 = android.view.View$MeasureSpec.getSize(p13);
	                if (this.e <= 0) {
	                    v1_0 = android.view.View$MeasureSpec.getSize(p14);
	                } else {
	                    v1_0 = this.e;
	                }
	                int v8 = (this.getPaddingTop() + this.getPaddingBottom());
	                int v0_8 = ((v7 - this.getPaddingLeft()) - this.getPaddingRight());
	                android.view.View v6_0 = (v1_0 - v8);
	                int v2_2 = android.view.View$MeasureSpec.makeMeasureSpec(v6_0, -2147483648);
	                if (this.i != null) {
	                    int v0_11 = ((android.view.ViewGroup$MarginLayoutParams) this.i.getLayoutParams());
	                    v0_8 = (android.support.v7.internal.widget.ActionBarContextView.a(this.i, v0_8, v2_2, 0) - (v0_11.rightMargin + v0_11.leftMargin));
	                }
	                if ((this.b != null) && (this.b.getParent() == this)) {
	                    v0_8 = android.support.v7.internal.widget.ActionBarContextView.a(this.b, v0_8, v2_2, 0);
	                }
	                if ((this.n != null) && (this.m == null)) {
	                    if (!this.j) {
	                        v0_8 = android.support.v7.internal.widget.ActionBarContextView.a(this.n, v0_8, v2_2, 0);
	                    } else {
	                        int v2_4;
	                        this.n.measure(android.view.View$MeasureSpec.makeMeasureSpec(0, 0), v2_2);
	                        android.widget.LinearLayout v9_12 = this.n.getMeasuredWidth();
	                        if (v9_12 > v0_8) {
	                            v2_4 = 0;
	                        } else {
	                            v2_4 = 1;
	                        }
	                        if (v2_4 != 0) {
	                            v0_8 -= v9_12;
	                        }
	                        int v2_5;
	                        if (v2_4 == 0) {
	                            v2_5 = 8;
	                        } else {
	                            v2_5 = 0;
	                        }
	                        this.n.setVisibility(v2_5);
	                    }
	                }
	                if (this.m != null) {
	                    int v2_9;
	                    android.widget.LinearLayout v9_14 = this.m.getLayoutParams();
	                    if (v9_14.width == -2) {
	                        v2_9 = -2147483648;
	                    } else {
	                        v2_9 = 1073741824;
	                    }
	                    if (v9_14.width >= 0) {
	                        v0_8 = Math.min(v9_14.width, v0_8);
	                    }
	                    if (v9_14.height == -2) {
	                        v4 = -2147483648;
	                    }
	                    int v5_2;
	                    if (v9_14.height < 0) {
	                        v5_2 = v6_0;
	                    } else {
	                        v5_2 = Math.min(v9_14.height, v6_0);
	                    }
	                    this.m.measure(android.view.View$MeasureSpec.makeMeasureSpec(v0_8, v2_9), android.view.View$MeasureSpec.makeMeasureSpec(v5_2, v4));
	                }
	                if (this.e > 0) {
	                    this.setMeasuredDimension(v7, v1_0);
	                } else {
	                    int v2_11 = this.getChildCount();
	                    int v1_1 = 0;
	                    while (v3 < v2_11) {
	                        int v0_18 = (this.getChildAt(v3).getMeasuredHeight() + v8);
	                        if (v0_18 <= v1_1) {
	                            v0_18 = v1_1;
	                        }
	                        v3++;
	                        v1_1 = v0_18;
	                    }
	                    this.setMeasuredDimension(v7, v1_1);
	                }
	                return;
	            } else {
	                throw new IllegalStateException(new StringBuilder().append(this.getClass().getSimpleName()).append(" can only be used with android:layout_height=\"wrap_content\"").toString());
	            }
	        } else {
	            throw new IllegalStateException(new StringBuilder().append(this.getClass().getSimpleName()).append(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)").toString());
	        }
	    }
	
	
	    public boolean shouldDelayChildPressedState()
	    {
	        return 0;
	    }
	
