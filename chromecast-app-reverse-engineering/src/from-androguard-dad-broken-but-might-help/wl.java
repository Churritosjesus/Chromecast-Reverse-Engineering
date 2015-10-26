	private static final I a
	private te b
	private tf c
	
	    static wl()
	    {
	        int[] v0_1 = new int[1];
	        v0_1[0] = 16842964;
	        wl.a = v0_1;
	        return;
	    }
	
	
	    public wl(android.content.Context p2, android.util.AttributeSet p3)
	    {
	        this(p2, p3, a.x);
	        return;
	    }
	
	
	    private wl(android.content.Context p7, android.util.AttributeSet p8, int p9)
	    {
	        this(p7, p8, p9);
	        if (tf.a) {
	            android.content.res.ColorStateList v0_2 = th.a(this.getContext(), p8, wl.a, p9, 0);
	            if (v0_2.d(0)) {
	                int v1_3 = v0_2.a().a(v0_2.e(0, -1));
	                if (v1_3 != 0) {
	                    this.a(v1_3);
	                }
	            }
	            this.c = v0_2.a();
	            v0_2.a.recycle();
	        }
	        android.content.res.ColorStateList v0_5 = p7.obtainStyledAttributes(p8, oq.O, p9, 0);
	        int v1_6 = v0_5.getResourceId(oq.P, -1);
	        v0_5.recycle();
	        if (v1_6 != -1) {
	            android.content.res.ColorStateList v0_7 = p7.obtainStyledAttributes(v1_6, oq.bH);
	            if (v0_7.hasValue(oq.bM)) {
	                this.setAllCaps(v0_7.getBoolean(oq.bM, 0));
	            }
	            v0_7.recycle();
	        }
	        android.content.res.ColorStateList v0_9 = p7.obtainStyledAttributes(p8, oq.O, p9, 0);
	        if (v0_9.hasValue(oq.Q)) {
	            this.setAllCaps(v0_9.getBoolean(oq.Q, 0));
	        }
	        v0_9.recycle();
	        int v1_15 = this.getTextColors();
	        if ((v1_15 != 0) && (!v1_15.isStateful())) {
	            android.content.res.ColorStateList v0_12;
	            if (android.os.Build$VERSION.SDK_INT >= 21) {
	                v0_12 = tb.a(p7, 16842808);
	            } else {
	                v0_12 = tb.c(p7, 16842808);
	            }
	            this.setTextColor(tb.a(v1_15.getDefaultColor(), v0_12));
	        }
	        return;
	    }
	
	
	    private void a()
	    {
	        if ((this.getBackground() != null) && (this.b != null)) {
	            tf.a(this, this.b);
	        }
	        return;
	    }
	
	
	    private void a(android.content.res.ColorStateList p3)
	    {
	        if (p3 == null) {
	            this.b = 0;
	        } else {
	            if (this.b == null) {
	                this.b = new te();
	            }
	            this.b.a = p3;
	            this.b.b = 1;
	        }
	        this.a();
	        return;
	    }
	
	
	    protected final void drawableStateChanged()
	    {
	        super.drawableStateChanged();
	        this.a();
	        return;
	    }
	
	
	    public final void onInitializeAccessibilityEvent(android.view.accessibility.AccessibilityEvent p2)
	    {
	        super.onInitializeAccessibilityEvent(p2);
	        p2.setClassName(android.widget.Button.getName());
	        return;
	    }
	
	
	    public final void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo p2)
	    {
	        super.onInitializeAccessibilityNodeInfo(p2);
	        p2.setClassName(android.widget.Button.getName());
	        return;
	    }
	
	
	    public final void setAllCaps(boolean p3)
	    {
	        int v0_0;
	        if (!p3) {
	            v0_0 = 0;
	        } else {
	            v0_0 = new pg(this.getContext());
	        }
	        this.setTransformationMethod(v0_0);
	        return;
	    }
	
	
	    public final void setBackgroundDrawable(android.graphics.drawable.Drawable p2)
	    {
	        super.setBackgroundDrawable(p2);
	        this.a(0);
	        return;
	    }
	
	
	    public final void setBackgroundResource(int p2)
	    {
	        int v0_1;
	        super.setBackgroundResource(p2);
	        if (this.c == null) {
	            v0_1 = 0;
	        } else {
	            v0_1 = this.c.a(p2);
	        }
	        this.a(v0_1);
	        return;
	    }
	
	
	    public final void setTextAppearance(android.content.Context p4, int p5)
	    {
	        super.setTextAppearance(p4, p5);
	        android.content.res.TypedArray v0_1 = p4.obtainStyledAttributes(p5, oq.bH);
	        if (v0_1.hasValue(oq.bM)) {
	            this.setAllCaps(v0_1.getBoolean(oq.bM, 0));
	        }
	        v0_1.recycle();
	        return;
	    }
	
