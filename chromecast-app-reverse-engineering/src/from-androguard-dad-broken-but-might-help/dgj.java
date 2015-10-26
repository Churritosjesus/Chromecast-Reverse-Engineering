	private java.lang.String a
	
	    public varargs dgj(String p2, Object[] p3)
	    {
	        this.a = String.format(p2, p3);
	        return;
	    }
	
	
	    public final void run()
	    {
	        String v0_1 = Thread.currentThread().getName();
	        Thread.currentThread().setName(this.a);
	        try {
	            this.a();
	            Thread.currentThread().setName(v0_1);
	            return;
	        } catch (Throwable v1_2) {
	            Thread.currentThread().setName(v0_1);
	            throw v1_2;
	        }
	    }
	
