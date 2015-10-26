	 java.util.concurrent.CountDownLatch a
	  b
	private java.lang.ref.WeakReference c
	private  d
	
	    public bpc(bpa p3, long p4)
	    {
	        this.c = new ref.WeakReference(p3);
	        this.d = p4;
	        this.a = new java.util.concurrent.CountDownLatch(1);
	        this.b = 0;
	        this.start();
	        return;
	    }
	
	
	    private void a()
	    {
	        int v0_2 = ((bpa) this.c.get());
	        if (v0_2 != 0) {
	            v0_2.a();
	            this.b = 1;
	        }
	        return;
	    }
	
	
	    public final void run()
	    {
	        try {
	            if (!this.a.await(this.d, java.util.concurrent.TimeUnit.MILLISECONDS)) {
	                this.a();
	            }
	        } catch (InterruptedException v0) {
	            this.a();
	        }
	        return;
	    }
	
