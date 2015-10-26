	private synthetic acl a
	
	    acm(acl p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    public final void run()
	    {
	        this.a.a.invalidate();
	        return;
	    }
	
