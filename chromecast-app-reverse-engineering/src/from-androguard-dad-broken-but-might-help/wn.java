	private static final I a
	private tf b
	
	    static wn()
	    {
	        int[] v0_1 = new int[1];
	        v0_1[0] = 16843016;
	        wn.a = v0_1;
	        return;
	    }
	
	
	    public wn(android.content.Context p2, android.util.AttributeSet p3)
	    {
	        this(p2, p3, 16843720);
	        return;
	    }
	
	
	    private wn(android.content.Context p5, android.util.AttributeSet p6, int p7)
	    {
	        this(p5, p6, 16843720);
	        if (tf.a) {
	            tf v0_2 = th.a(this.getContext(), p6, wn.a, 16843720, 0);
	            this.setCheckMarkDrawable(v0_2.a(0));
	            v0_2.a.recycle();
	            this.b = v0_2.a();
	        }
	        return;
	    }
	
	
	    public final void setCheckMarkDrawable(int p3)
	    {
	        if (this.b == null) {
	            super.setCheckMarkDrawable(p3);
	        } else {
	            this.setCheckMarkDrawable(this.b.a(p3, 0));
	        }
	        return;
	    }
	
