	private synthetic android.view.View a
	private synthetic sm b
	
	    sn(sm p1, android.view.View p2)
	    {
	        this.b = p1;
	        this.a = p2;
	        return;
	    }
	
	
	    public final void run()
	    {
	        this.b.smoothScrollTo((this.a.getLeft() - ((this.b.getWidth() - this.a.getWidth()) / 2)), 0);
	        this.b.a = 0;
	        return;
	    }
	
