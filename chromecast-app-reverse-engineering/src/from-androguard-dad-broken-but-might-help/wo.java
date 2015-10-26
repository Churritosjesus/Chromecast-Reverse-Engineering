	private static final I a
	private te b
	private tf c
	
	    static wo()
	    {
	        int[] v0_1 = new int[1];
	        v0_1[0] = 16842964;
	        wo.a = v0_1;
	        return;
	    }
	
	
	    public wo(android.content.Context p2, android.util.AttributeSet p3)
	    {
	        this(p2, p3, a.H);
	        return;
	    }
	
	
	    private wo(android.content.Context p5, android.util.AttributeSet p6, int p7)
	    {
	        this(tc.a(p5), p6, p7);
	        if (tf.a) {
	            android.content.res.TypedArray v0_3 = th.a(this.getContext(), p6, wo.a, p7, 0);
	            if (v0_3.d(0)) {
	                tf v1_3 = v0_3.a().a(v0_3.e(0, -1));
	                if (v1_3 != null) {
	                    this.a(v1_3);
	                }
	            }
	            this.c = v0_3.a();
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
	
	
	    protected final void drawableStateChanged()
	    {
	        super.drawableStateChanged();
	        this.a();
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
	
