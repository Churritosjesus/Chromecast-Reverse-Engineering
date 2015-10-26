	public  a
	private android.os.Handler e
	private  f
	private java.lang.Runnable g
	
	    public bub(String p3, String p4, String p5, long p6)
	    {
	        this(p3, p4, p5);
	        this.e = new android.os.Handler(android.os.Looper.getMainLooper());
	        this.g = new buc(this);
	        this.f = 1000;
	        this.a(0);
	        return;
	    }
	
	
	    protected final void a(boolean p5)
	    {
	        if (this.a != p5) {
	            this.a = p5;
	            if (!p5) {
	                this.e.removeCallbacks(this.g);
	            } else {
	                this.e.postDelayed(this.g, this.f);
	            }
	        }
	        return;
	    }
	
	
	    public void c()
	    {
	        this.a(0);
	        return;
	    }
	
