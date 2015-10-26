	private synthetic java.lang.String a
	private synthetic java.lang.Runnable b
	private synthetic bqu c
	
	    bqw(bqu p1, String p2, Runnable p3)
	    {
	        this.c = p1;
	        this.a = p2;
	        this.b = p3;
	        return;
	    }
	
	
	    public final void run()
	    {
	        this.c.a.a(this.a);
	        if (this.b != null) {
	            this.b.run();
	        }
	        return;
	    }
	
