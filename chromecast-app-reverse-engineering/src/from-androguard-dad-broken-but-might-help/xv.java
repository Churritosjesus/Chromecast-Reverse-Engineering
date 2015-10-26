	public  g
	public  h
	
	    public xv(int p2, int p3)
	    {
	        this(p2, p3);
	        this.h = -1;
	        this.g = 0;
	        return;
	    }
	
	
	    public xv(android.content.Context p5, android.util.AttributeSet p6)
	    {
	        this(p5, p6);
	        this.h = -1;
	        android.content.res.TypedArray v0_1 = p5.obtainStyledAttributes(p6, oq.ak);
	        this.g = v0_1.getFloat(oq.am, 0);
	        this.h = v0_1.getInt(oq.al, -1);
	        v0_1.recycle();
	        return;
	    }
	
	
	    public xv(android.view.ViewGroup$LayoutParams p2)
	    {
	        this(p2);
	        this.h = -1;
	        return;
	    }
	
