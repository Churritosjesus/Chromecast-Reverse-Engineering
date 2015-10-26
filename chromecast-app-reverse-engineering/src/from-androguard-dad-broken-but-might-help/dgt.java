	private synthetic java.lang.String a
	private synthetic  b
	
	    dgt(String p1, boolean p2)
	    {
	        this.a = p1;
	        this.b = p2;
	        return;
	    }
	
	
	    public final Thread newThread(Runnable p3)
	    {
	        Thread v0_1 = new Thread(p3, this.a);
	        v0_1.setDaemon(this.b);
	        return v0_1;
	    }
	
