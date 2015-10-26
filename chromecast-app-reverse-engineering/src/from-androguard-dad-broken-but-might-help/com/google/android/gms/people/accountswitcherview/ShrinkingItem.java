	  a
	
	    public ShrinkingItem(android.content.Context p2, android.util.AttributeSet p3)
	    {
	        this(p2, p3);
	        this.a = 1065353216;
	        return;
	    }
	
	
	    public ShrinkingItem(android.content.Context p2, android.util.AttributeSet p3, int p4)
	    {
	        this(p2, p3, p4);
	        this.a = 1065353216;
	        return;
	    }
	
	
	    protected void onMeasure(int p4, int p5)
	    {
	        super.onMeasure(p4, p5);
	        int v0_0 = this.getMeasuredHeight();
	        if (this.a != 1065353216) {
	            v0_0 = Math.round((((float) v0_0) * this.a));
	        }
	        this.setMeasuredDimension(android.view.View$MeasureSpec.getSize(p4), v0_0);
	        return;
	    }
	
