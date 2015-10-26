	private static final java.util.concurrent.atomic.AtomicInteger a
	
	    static cpb()
	    {
	        cpb.a = new java.util.concurrent.atomic.AtomicInteger();
	        return;
	    }
	
	
	    cpb()
	    {
	        return;
	    }
	
	
	    public final Thread newThread(Runnable p3)
	    {
	        return new cpc(p3, new StringBuilder("measurement-").append(cpb.a.incrementAndGet()).toString());
	    }
	
