	private synthetic brb a
	
	    brc(brb p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    public final void uncaughtException(Thread p3, Throwable p4)
	    {
	        bql v0_1 = this.a.e;
	        if (v0_1 != null) {
	            v0_1.e("Job execution failed", p4);
	        }
	        return;
	    }
	
