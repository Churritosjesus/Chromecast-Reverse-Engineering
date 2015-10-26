	 java.util.concurrent.atomic.AtomicBoolean a
	final java.util.concurrent.BlockingQueue b
	
	    ahz()
	    {
	        this.a = new java.util.concurrent.atomic.AtomicBoolean(0);
	        this.b = new java.util.concurrent.LinkedBlockingDeque();
	        return;
	    }
	
	
	    public final void onServiceConnected(android.content.ComponentName p2, android.os.IBinder p3)
	    {
	        try {
	            this.b.put(p3);
	        } catch (InterruptedException v0) {
	        }
	        return;
	    }
	
	
	    public final void onServiceDisconnected(android.content.ComponentName p1)
	    {
	        return;
	    }
	
