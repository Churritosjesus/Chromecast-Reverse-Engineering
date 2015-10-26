	private synthetic java.lang.String a
	private synthetic dfv b
	
	    dfw(dfv p1, String p2)
	    {
	        this.b = p1;
	        this.a = p2;
	        return;
	    }
	
	
	    protected final int getDefaultPort()
	    {
	        AssertionError v0_6;
	        if (!this.a.equals("http")) {
	            if (!this.a.equals("https")) {
	                throw new AssertionError();
	            } else {
	                v0_6 = 443;
	            }
	        } else {
	            v0_6 = 80;
	        }
	        return v0_6;
	    }
	
	
	    protected final java.net.URLConnection openConnection(java.net.URL p2)
	    {
	        return this.b.a(p2);
	    }
	
	
	    protected final java.net.URLConnection openConnection(java.net.URL p2, java.net.Proxy p3)
	    {
	        return this.b.a(p2, p3);
	    }
	
