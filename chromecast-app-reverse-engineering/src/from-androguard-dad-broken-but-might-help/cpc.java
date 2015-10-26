	
	    cpc(Runnable p1, String p2)
	    {
	        this(p1, p2);
	        return;
	    }
	
	
	    public final void run()
	    {
	        android.os.Process.setThreadPriority(10);
	        super.run();
	        return;
	    }
	
