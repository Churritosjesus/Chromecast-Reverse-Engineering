	 android.view.View a
	public android.graphics.drawable.Drawable b
	public android.graphics.drawable.Drawable c
	public android.graphics.drawable.Drawable d
	public  e
	public  f
	private  g
	private android.view.View h
	private android.view.View i
	private  j
	
	    public ActionBarContainer(android.content.Context p2)
	    {
	        this(p2, 0);
	        return;
	    }
	
	
	    public ActionBarContainer(android.content.Context p6, android.util.AttributeSet p7)
	    {
	        int v0_1;
	        this(p6, p7);
	        if (android.os.Build$VERSION.SDK_INT < 21) {
	            v0_1 = 0;
	        } else {
	            v0_1 = 1;
	        }
	        int v0_3;
	        if (v0_1 == 0) {
	            v0_3 = new rc(this);
	        } else {
	            v0_3 = new rd(this);
	        }
	        this.setBackgroundDrawable(v0_3);
	        int v0_6 = p6.obtainStyledAttributes(p7, oq.a);
	        this.b = v0_6.getDrawable(oq.b);
	        this.c = v0_6.getDrawable(oq.d);
	        this.j = v0_6.getDimensionPixelSize(oq.j, -1);
	        if (this.getId() == a.bu) {
	            this.e = 1;
	            this.d = v0_6.getDrawable(oq.c);
	        }
	        int v0_10;
	        v0_6.recycle();
	        if (!this.e) {
	            if ((this.b != null) || (this.c != null)) {
	                v0_10 = 0;
	            } else {
	                v0_10 = 1;
	            }
	        } else {
	            if (this.d != null) {
	                v0_10 = 0;
	            } else {
	                v0_10 = 1;
	            }
	        }
	        this.setWillNotDraw(v0_10);
	        return;
	    }
	
	
	    private static boolean a(android.view.View p2)
	    {
	        if ((p2 != null) && ((p2.getVisibility() != 8) && (p2.getMeasuredHeight() != 0))) {
	            int v0_2 = 0;
	        } else {
	            v0_2 = 1;
	        }
	        return v0_2;
	    }
	
	
	    private static int b(android.view.View p3)
	    {
	        int v0_1 = ((android.widget.FrameLayout$LayoutParams) p3.getLayoutParams());
	        return (v0_1.bottomMargin + (p3.getMeasuredHeight() + v0_1.topMargin));
	    }
	
	
	    public final void a(sm p3)
	    {
	        if (this.a != null) {
	            this.removeView(this.a);
	        }
	        this.a = p3;
	        if (p3 != null) {
	            this.addView(p3);
	            int v0_2 = p3.getLayoutParams();
	            v0_2.width = -1;
	            v0_2.height = -2;
	            p3.b = 0;
	        }
	        return;
	    }
	
	
	    public final void a(boolean p2)
	    {
	        int v0;
	        this.g = p2;
	        if (!p2) {
	            v0 = 262144;
	        } else {
	            v0 = 393216;
	        }
	        this.setDescendantFocusability(v0);
	        return;
	    }
	
	
	    protected void drawableStateChanged()
	    {
	        super.drawableStateChanged();
	        if ((this.b != null) && (this.b.isStateful())) {
	            this.b.setState(this.getDrawableState());
	        }
	        if ((this.c != null) && (this.c.isStateful())) {
	            this.c.setState(this.getDrawableState());
	        }
	        if ((this.d != null) && (this.d.isStateful())) {
	            this.d.setState(this.getDrawableState());
	        }
	        return;
	    }
	
	
	    public void jumpDrawablesToCurrentState()
	    {
	        if (android.os.Build$VERSION.SDK_INT >= 11) {
	            super.jumpDrawablesToCurrentState();
	            if (this.b != null) {
	                this.b.jumpToCurrentState();
	            }
	            if (this.c != null) {
	                this.c.jumpToCurrentState();
	            }
	            if (this.d != null) {
	                this.d.jumpToCurrentState();
	            }
	        }
	        return;
	    }
	
	
	    public void onFinishInflate()
	    {
	        super.onFinishInflate();
	        this.h = this.findViewById(a.aP);
	        this.i = this.findViewById(a.aU);
	        return;
	    }
	
	
	    public boolean onInterceptTouchEvent(android.view.MotionEvent p2)
	    {
	        if ((!this.g) && (!super.onInterceptTouchEvent(p2))) {
	            int v0_2 = 0;
	        } else {
	            v0_2 = 1;
	        }
	        return v0_2;
	    }
	
	
	    public void onLayout(boolean p9, int p10, int p11, int p12, int p13)
	    {
	        int v3_0;
	        android.graphics.drawable.Drawable v1 = 1;
	        this = super.onLayout(p9, p10, p11, p12, p13);
	        int v4_0 = this.a;
	        if ((v4_0 == 0) || (v4_0.getVisibility() == 8)) {
	            v3_0 = 0;
	        } else {
	            v3_0 = 1;
	        }
	        if ((v4_0 != 0) && (v4_0.getVisibility() != 8)) {
	            int v5_1 = this.getMeasuredHeight();
	            android.graphics.drawable.Drawable v0_3 = ((android.widget.FrameLayout$LayoutParams) v4_0.getLayoutParams());
	            v4_0.layout(p10, ((v5_1 - v4_0.getMeasuredHeight()) - v0_3.bottomMargin), p12, (v5_1 - v0_3.bottomMargin));
	        }
	        if (!this.e) {
	            android.graphics.drawable.Drawable v0_8;
	            if (this.b == null) {
	                v0_8 = 0;
	            } else {
	                if (this.h.getVisibility() != 0) {
	                    if ((this.i == null) || (this.i.getVisibility() != 0)) {
	                        this.b.setBounds(0, 0, 0, 0);
	                    } else {
	                        this.b.setBounds(this.i.getLeft(), this.i.getTop(), this.i.getRight(), this.i.getBottom());
	                    }
	                } else {
	                    this.b.setBounds(this.h.getLeft(), this.h.getTop(), this.h.getRight(), this.h.getBottom());
	                }
	                v0_8 = 1;
	            }
	            this.f = v3_0;
	            if ((v3_0 == 0) || (this.c == null)) {
	                v1 = v0_8;
	            } else {
	                this.c.setBounds(v4_0.getLeft(), v4_0.getTop(), v4_0.getRight(), v4_0.getBottom());
	            }
	        } else {
	            if (this.d == null) {
	                v1 = 0;
	            } else {
	                this.d.setBounds(0, 0, this.getMeasuredWidth(), this.getMeasuredHeight());
	            }
	        }
	        if (v1 != null) {
	            this.invalidate();
	        }
	        return;
	    }
	
	
	    public void onMeasure(int p5, int p6)
	    {
	        if ((this.h == null) && ((android.view.View$MeasureSpec.getMode(p6) == -2147483648) && (this.j >= 0))) {
	            p6 = android.view.View$MeasureSpec.makeMeasureSpec(Math.min(this.j, android.view.View$MeasureSpec.getSize(p6)), -2147483648);
	        }
	        super.onMeasure(p5, p6);
	        if (this.h != null) {
	            int v2_0 = android.view.View$MeasureSpec.getMode(p6);
	            if ((this.a != null) && ((this.a.getVisibility() != 8) && (v2_0 != 1073741824))) {
	                int v1_2;
	                if (android.support.v7.internal.widget.ActionBarContainer.a(this.h)) {
	                    if (android.support.v7.internal.widget.ActionBarContainer.a(this.i)) {
	                        v1_2 = 0;
	                    } else {
	                        v1_2 = android.support.v7.internal.widget.ActionBarContainer.b(this.i);
	                    }
	                } else {
	                    v1_2 = android.support.v7.internal.widget.ActionBarContainer.b(this.h);
	                }
	                int v0_19;
	                if (v2_0 != -2147483648) {
	                    v0_19 = 2147483647;
	                } else {
	                    v0_19 = android.view.View$MeasureSpec.getSize(p6);
	                }
	                this.setMeasuredDimension(this.getMeasuredWidth(), Math.min((v1_2 + android.support.v7.internal.widget.ActionBarContainer.b(this.a)), v0_19));
	            }
	        }
	        return;
	    }
	
	
	    public boolean onTouchEvent(android.view.MotionEvent p2)
	    {
	        super.onTouchEvent(p2);
	        return 1;
	    }
	
	
	    public void setVisibility(int p4)
	    {
	        int v0;
	        super.setVisibility(p4);
	        if (p4 != 0) {
	            v0 = 0;
	        } else {
	            v0 = 1;
	        }
	        if (this.b != null) {
	            this.b.setVisible(v0, 0);
	        }
	        if (this.c != null) {
	            this.c.setVisible(v0, 0);
	        }
	        if (this.d != null) {
	            this.d.setVisible(v0, 0);
	        }
	        return;
	    }
	
	
	    public android.view.ActionMode startActionModeForChild(android.view.View p2, android.view.ActionMode$Callback p3)
	    {
	        return 0;
	    }
	
	
	    protected boolean verifyDrawable(android.graphics.drawable.Drawable p2)
	    {
	        if (((p2 != this.b) || (this.e)) && (((p2 != this.c) || (!this.f)) && (((p2 != this.d) || (!this.e)) && (!super.verifyDrawable(p2))))) {
	            int v0_7 = 0;
	        } else {
	            v0_7 = 1;
	        }
	        return v0_7;
	    }
	
