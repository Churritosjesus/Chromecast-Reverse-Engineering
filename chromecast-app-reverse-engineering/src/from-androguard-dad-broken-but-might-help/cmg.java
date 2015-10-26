	private java.net.HttpURLConnection a
	
	    public cmg()
	    {
	        return;
	    }
	
	
	    public final java.io.InputStream a(String p4)
	    {
	        String v0_3 = ((java.net.HttpURLConnection) new java.net.URL(p4).openConnection());
	        v0_3.setReadTimeout(20000);
	        v0_3.setConnectTimeout(20000);
	        this.a = v0_3;
	        String v0_4 = this.a;
	        java.io.IOException v1_1 = v0_4.getResponseCode();
	        if (v1_1 != 200) {
	            String v0_8 = new StringBuilder("Bad response: ").append(v1_1).toString();
	            if (v1_1 != 404) {
	                throw new java.io.IOException(v0_8);
	            } else {
	                throw new java.io.FileNotFoundException(v0_8);
	            }
	        } else {
	            return v0_4.getInputStream();
	        }
	    }
	
	
	    public final void a()
	    {
	        java.net.HttpURLConnection v0 = this.a;
	        if (v0 != null) {
	            v0.disconnect();
	        }
	        return;
	    }
	
