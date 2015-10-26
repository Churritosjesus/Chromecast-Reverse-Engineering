	private synthetic java.net.Socket a
	
	    dkn(java.net.Socket p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    protected final void a()
	    {
	        try {
	            this.a.close();
	        } catch (Exception v0_1) {
	            dkk.a().log(java.util.logging.Level.WARNING, new StringBuilder("Failed to close timed out socket ").append(this.a).toString(), v0_1);
	        }
	        return;
	    }
	
