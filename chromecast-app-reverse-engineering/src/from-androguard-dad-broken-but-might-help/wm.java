	private static final I a
	private tf b
	private android.graphics.drawable.Drawable c
	
	    static wm()
	    {
	        int[] v0_1 = new int[1];
	        v0_1[0] = 16843015;
	        wm.a = v0_1;
	        return;
	    }
	
	
	    public wm(android.content.Context p2, android.util.AttributeSet p3)
	    {
	        this(p2, p3, a.y);
	        return;
	    }
	
	
	    private wm(android.content.Context p4, android.util.AttributeSet p5, int p6)
	    {
	        this(p4, p5, p6);
	        if (tf.a) {
	            tf v0_2 = th.a(this.getContext(), p5, wm.a, p6, 0);
	            this.setButtonDrawable(v0_2.a(0));
	            v0_2.a.recycle();
	            this.b = v0_2.a();
	        }
	        return;
	    }
	
	
	    public final int getCompoundPaddingLeft()
	    {
	        int v0 = super.getCompoundPaddingLeft();
	        if ((android.os.Build$VERSION.SDK_INT < 17) && (this.c != null)) {
	            v0 += this.c.getIntrinsicWidth();
	        }
	        return v0;
	    }
	
	
	    public final void setButtonDrawable(int p3)
	    {
	        if (this.b == null) {
	            super.setButtonDrawable(p3);
	        } else {
	            this.setButtonDrawable(this.b.a(p3, 0));
	        }
	        return;
	    }
	
	
	    public final void setButtonDrawable(android.graphics.drawable.Drawable p1)
	    {
	        super.setButtonDrawable(p1);
	        this.c = p1;
	        return;
	    }
	
