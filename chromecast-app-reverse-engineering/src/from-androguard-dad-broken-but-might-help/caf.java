	private  a
	private final java.util.concurrent.BlockingQueue b
	
	    public caf()
	    {
	        this.a = 0;
	        this.b = new java.util.concurrent.LinkedBlockingQueue();
	        return;
	    }
	
	
	    public final android.os.IBinder a()
	    {
	        if (android.os.Looper.myLooper() != android.os.Looper.getMainLooper()) {
	            if (!this.a) {
	                this.a = 1;
	                return ((android.os.IBinder) this.b.take());
	            } else {
	                throw new IllegalStateException();
	            }
	        } else {
	            throw new IllegalStateException("BlockingServiceConnection.getService() called on main thread");
	        }
	    }
	
	
	    public final void onServiceConnected(android.content.ComponentName p2, android.os.IBinder p3)
	    {
	        this.b.add(p3);
	        return;
	    }
	
	
	    public final void onServiceDisconnected(android.content.ComponentName p1)
	    {
	        return;
	    }
	
