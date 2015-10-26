	private sh a
	
	    public FitWindowsLinearLayout(android.content.Context p1)
	    {
	        this(p1);
	        return;
	    }
	
	
	    public FitWindowsLinearLayout(android.content.Context p1, android.util.AttributeSet p2)
	    {
	        this(p1, p2);
	        return;
	    }
	
	
	    public final void a(sh p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    protected boolean fitSystemWindows(android.graphics.Rect p2)
	    {
	        if (this.a != null) {
	            this.a.a(p2);
	        }
	        return super.fitSystemWindows(p2);
	    }
	
