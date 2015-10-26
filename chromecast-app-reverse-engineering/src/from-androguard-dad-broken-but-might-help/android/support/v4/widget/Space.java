	
	    public Space(android.content.Context p2)
	    {
	        this(p2, 0);
	        return;
	    }
	
	
	    public Space(android.content.Context p2, android.util.AttributeSet p3)
	    {
	        this(p2, p3, 0);
	        return;
	    }
	
	
	    public Space(android.content.Context p2, android.util.AttributeSet p3, int p4)
	    {
	        this(p2, p3, p4);
	        if (this.getVisibility() == 0) {
	            this.setVisibility(4);
	        }
	        return;
	    }
	
	
	    private static int a(int p2, int p3)
	    {
	        int v1 = android.view.View$MeasureSpec.getMode(p3);
	        int v0 = android.view.View$MeasureSpec.getSize(p3);
	        switch (v1) {
	            case -2147483648:
	                p2 = Math.min(p2, v0);
	            case 0:
	            default:
	                break;
	            case 1073741824:
	                p2 = v0;
	                break;
	        }
	        return p2;
	    }
	
	
	    public void draw(android.graphics.Canvas p1)
	    {
	        return;
	    }
	
	
	    protected void onMeasure(int p3, int p4)
	    {
	        this.setMeasuredDimension(android.support.v4.widget.Space.a(this.getSuggestedMinimumWidth(), p3), android.support.v4.widget.Space.a(this.getSuggestedMinimumHeight(), p4));
	        return;
	    }
	
