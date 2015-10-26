	private final clt a
	private final java.util.concurrent.ExecutorService b
	
	    public cth(clt p1, java.util.concurrent.ExecutorService p2)
	    {
	        this.a = p1;
	        this.b = p2;
	        return;
	    }
	
	
	    static synthetic s a(cth p1)
	    {
	        return p1.a.e;
	    }
	
	
	    public final void a(String p3, String p4, ctd p5)
	    {
	        this.b.submit(new ctj(this, p3, p4, p5));
	        return;
	    }
	
	
	    public final void a(String p3, java.util.List p4, ctd p5)
	    {
	        this.b.submit(new cti(this, p4, p3, p5));
	        return;
	    }
	
