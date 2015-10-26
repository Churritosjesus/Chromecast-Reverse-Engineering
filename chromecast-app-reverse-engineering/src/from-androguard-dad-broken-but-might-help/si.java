	private android.graphics.Rect a
	private  b
	private  c
	private  d
	private  e
	private java.lang.reflect.Field f
	private sj g
	
	    public si(android.content.Context p3, android.util.AttributeSet p4, int p5)
	    {
	        this(p3, 0, p5);
	        this.a = new android.graphics.Rect();
	        this.b = 0;
	        this.c = 0;
	        this.d = 0;
	        this.e = 0;
	        try {
	            this.f = android.widget.AbsListView.getDeclaredField("mIsChildViewEnabled");
	            this.f.setAccessible(1);
	        } catch (NoSuchFieldException v0_6) {
	            v0_6.printStackTrace();
	        }
	        return;
	    }
	
	
	    private void a(int p6, android.view.View p7)
	    {
	        int v0_0 = this.a;
	        v0_0.set(p7.getLeft(), p7.getTop(), p7.getRight(), p7.getBottom());
	        v0_0.left = (v0_0.left - this.b);
	        v0_0.top = (v0_0.top - this.c);
	        v0_0.right = (v0_0.right + this.d);
	        v0_0.bottom = (v0_0.bottom + this.e);
	        try {
	            int v0_2 = this.f.getBoolean(this);
	        } catch (int v0_6) {
	            v0_6.printStackTrace();
	            return;
	        }
	        if (p7.isEnabled() == v0_2) {
	            return;
	        } else {
	            int v0_3;
	            if (v0_2 != 0) {
	                v0_3 = 0;
	            } else {
	                v0_3 = 1;
	            }
	            this.f.set(this, Boolean.valueOf(v0_3));
	            if (p6 == -1) {
	                return;
	            } else {
	                this.refreshDrawableState();
	                return;
	            }
	        }
	    }
	
	
	    public final void a(int p8, android.view.View p9, float p10, float p11)
	    {
	        float v2_0;
	        int v0_0 = 1;
	        android.graphics.drawable.Drawable v3 = this.getSelector();
	        if ((v3 == null) || (p8 == -1)) {
	            v2_0 = 0;
	        } else {
	            v2_0 = 1;
	        }
	        if (v2_0 != 0) {
	            v3.setVisible(0, 0);
	        }
	        this.a(p8, p9);
	        if (v2_0 != 0) {
	            float v2_1 = this.a;
	            float v4 = v2_1.exactCenterX();
	            float v2_2 = v2_1.exactCenterY();
	            if (this.getVisibility() != 0) {
	                v0_0 = 0;
	            }
	            v3.setVisible(v0_0, 0);
	            bo.a(v3, v4, v2_2);
	        }
	        int v0_1 = this.getSelector();
	        if ((v0_1 != 0) && (p8 != -1)) {
	            bo.a(v0_1, p10, p11);
	        }
	        return;
	    }
	
	
	    public final void a(boolean p2)
	    {
	        if (this.g != null) {
	            this.g.a = p2;
	        }
	        return;
	    }
	
	
	    public boolean a()
	    {
	        return 0;
	    }
	
	
	    protected void dispatchDraw(android.graphics.Canvas p3)
	    {
	        if (!this.a.isEmpty()) {
	            android.graphics.drawable.Drawable v0_2 = this.getSelector();
	            if (v0_2 != null) {
	                v0_2.setBounds(this.a);
	                v0_2.draw(p3);
	            }
	        }
	        super.dispatchDraw(p3);
	        return;
	    }
	
	
	    public void drawableStateChanged()
	    {
	        int[] v0_0 = 1;
	        super.drawableStateChanged();
	        this.a(1);
	        android.graphics.drawable.Drawable v1 = this.getSelector();
	        if (v1 != null) {
	            if ((!this.a()) || (!this.isPressed())) {
	                v0_0 = 0;
	            }
	            if (v0_0 != null) {
	                v1.setState(this.getDrawableState());
	            }
	        }
	        return;
	    }
	
	
	    public void setSelector(android.graphics.drawable.Drawable p3)
	    {
	        int v0_0;
	        if (p3 == null) {
	            v0_0 = 0;
	        } else {
	            v0_0 = new sj(p3);
	        }
	        this.g = v0_0;
	        super.setSelector(this.g);
	        int v0_4 = new android.graphics.Rect();
	        if (p3 != null) {
	            p3.getPadding(v0_4);
	        }
	        this.b = v0_4.left;
	        this.c = v0_4.top;
	        this.d = v0_4.right;
	        this.e = v0_4.bottom;
	        return;
	    }
	
