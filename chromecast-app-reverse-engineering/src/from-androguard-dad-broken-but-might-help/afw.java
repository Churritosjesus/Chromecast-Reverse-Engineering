	private final java.util.concurrent.atomic.AtomicInteger a
	
	    afw()
	    {
	        this.a = new java.util.concurrent.atomic.AtomicInteger(0);
	        return;
	    }
	
	
	    public final Thread newThread(Runnable p5)
	    {
	        return new Thread(p5, new StringBuilder(24).append("FacebookSdk #").append(this.a.incrementAndGet()).toString());
	    }
	
