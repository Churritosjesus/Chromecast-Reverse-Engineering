	private static final I a
	private te b
	private tf c
	
	    static wk()
	    {
	        int[] v0_1 = new int[2];
	        v0_1 = {16842964, 16843126};
	        wk.a = v0_1;
	        return;
	    }
	
	
	    public wk(android.content.Context p2)
	    {
	        this(p2, 0);
	        return;
	    }
	
	
	    public wk(android.content.Context p2, android.util.AttributeSet p3)
	    {
	        this(p2, p3, a.w);
	        return;
	    }
	
	
	    public wk(android.content.Context p6, android.util.AttributeSet p7, int p8)
	    {
	        this(tc.a(p6), p7, p8);
	        if (tf.a) {
	            android.content.res.TypedArray v0_3 = th.a(this.getContext(), p7, wk.a, p8, 0);
	            this.c = v0_3.a();
	            if (v0_3.d(0)) {
	                android.graphics.drawable.Drawable v1_4 = v0_3.a().a(v0_3.e(0, -1));
	                if (v1_4 != null) {
	                    this.a(v1_4);
	                }
	            }
	            if (v0_3.d(1)) {
	                this.setDropDownBackgroundDrawable(v0_3.a(1));
	            }
	            v0_3.a.recycle();
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
	
	
	    protected void drawableStateChanged()
	    {
	        super.drawableStateChanged();
	        this.a();
	        return;
	    }
	
	
	    public void setBackgroundDrawable(android.graphics.drawable.Drawable p2)
	    {
	        super.setBackgroundDrawable(p2);
	        this.a(0);
	        return;
	    }
	
	
	    public void setBackgroundResource(int p2)
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
	
	
	    public void setDropDownBackgroundResource(int p3)
	    {
	        this.setDropDownBackgroundDrawable(this.c.a(p3, 0));
	        return;
	    }
	
