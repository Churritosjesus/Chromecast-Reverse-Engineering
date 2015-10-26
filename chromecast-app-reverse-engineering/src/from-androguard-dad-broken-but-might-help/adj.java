	private synthetic ads a
	private synthetic adi b
	
	    adj(adi p1, ads p2)
	    {
	        this.b = p1;
	        this.a = p2;
	        return;
	    }
	
	
	    public final void run()
	    {
	        try {
	            adi.a(this.b).put(this.a);
	        } catch (InterruptedException v0) {
	        }
	        return;
	    }
	
