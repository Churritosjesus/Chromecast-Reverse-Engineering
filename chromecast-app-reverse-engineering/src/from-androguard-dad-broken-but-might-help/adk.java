	private synthetic android.os.Handler a
	
	    adk(aeb p1, android.os.Handler p2)
	    {
	        this.a = p2;
	        return;
	    }
	
	
	    public final void execute(Runnable p2)
	    {
	        this.a.post(p2);
	        return;
	    }
	
