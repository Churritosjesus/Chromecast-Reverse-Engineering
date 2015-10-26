	public final android.view.WindowInsets a
	
	    public iy(android.view.WindowInsets p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    public final int a()
	    {
	        return this.a.getSystemWindowInsetLeft();
	    }
	
	
	    public final ix a(int p3, int p4, int p5, int p6)
	    {
	        return new iy(this.a.replaceSystemWindowInsets(p3, p4, p5, p6));
	    }
	
	
	    public final int b()
	    {
	        return this.a.getSystemWindowInsetTop();
	    }
	
	
	    public final int c()
	    {
	        return this.a.getSystemWindowInsetRight();
	    }
	
	
	    public final int d()
	    {
	        return this.a.getSystemWindowInsetBottom();
	    }
	
