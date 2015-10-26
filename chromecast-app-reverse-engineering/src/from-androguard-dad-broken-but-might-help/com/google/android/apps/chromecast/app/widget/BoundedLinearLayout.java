	private final  a
	private final  b
	
	    public BoundedLinearLayout(android.content.Context p2)
	    {
	        this(p2);
	        this.a = -1;
	        this.b = -1;
	        return;
	    }
	
	
	    public BoundedLinearLayout(android.content.Context p4, android.util.AttributeSet p5)
	    {
	        this(p4, p5);
	        android.content.res.TypedArray v0_1 = p4.obtainStyledAttributes(p5, anc.a);
	        this.a = v0_1.getDimensionPixelSize(anc.c, -1);
	        this.b = v0_1.getDimensionPixelSize(anc.b, -1);
	        v0_1.recycle();
	        return;
	    }
	
	
	    protected void onMeasure(int p3, int p4)
	    {
	        int v0_0 = android.view.View$MeasureSpec.getSize(p3);
	        if ((this.a > 0) && (this.a < v0_0)) {
	            p3 = android.view.View$MeasureSpec.makeMeasureSpec(this.a, android.view.View$MeasureSpec.getMode(p3));
	        }
	        int v0_2 = android.view.View$MeasureSpec.getSize(p4);
	        if ((this.b > 0) && (this.b < v0_2)) {
	            p4 = android.view.View$MeasureSpec.makeMeasureSpec(this.b, android.view.View$MeasureSpec.getMode(p4));
	        }
	        super.onMeasure(p3, p4);
	        return;
	    }
	
