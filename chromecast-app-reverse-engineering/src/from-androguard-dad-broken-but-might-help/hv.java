	public  a
	public  b
	public  c
	public  d
	public  e
	public  f
	
	    public hv()
	    {
	        this(-1, -1);
	        this.c = 0;
	        return;
	    }
	
	
	    public hv(android.content.Context p4, android.util.AttributeSet p5)
	    {
	        this(p4, p5);
	        this.c = 0;
	        android.content.res.TypedArray v0_2 = p4.obtainStyledAttributes(p5, android.support.v4.view.ViewPager.c());
	        this.b = v0_2.getInteger(0, 48);
	        v0_2.recycle();
	        return;
	    }
	
