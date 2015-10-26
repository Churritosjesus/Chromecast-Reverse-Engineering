	private org.apache.http.client.HttpClient a
	
	    public cmf()
	    {
	        return;
	    }
	
	
	    public final java.io.InputStream a(String p4)
	    {
	        String v0_1 = new org.apache.http.params.BasicHttpParams();
	        org.apache.http.params.HttpConnectionParams.setConnectionTimeout(v0_1, 20000);
	        org.apache.http.params.HttpConnectionParams.setSoTimeout(v0_1, 20000);
	        this.a = new org.apache.http.impl.client.DefaultHttpClient(v0_1);
	        String v0_3 = this.a.execute(new org.apache.http.client.methods.HttpGet(p4));
	        java.io.IOException v1_6 = v0_3.getStatusLine().getStatusCode();
	        if (v1_6 != 200) {
	            String v0_7 = new StringBuilder("Bad response: ").append(v1_6).toString();
	            if (v1_6 != 404) {
	                throw new java.io.IOException(v0_7);
	            } else {
	                throw new java.io.FileNotFoundException(v0_7);
	            }
	        } else {
	            cuh.e("Success response");
	            return v0_3.getEntity().getContent();
	        }
	    }
	
	
	    public final void a()
	    {
	        org.apache.http.conn.ClientConnectionManager v0_0 = this.a;
	        if ((v0_0 != null) && (v0_0.getConnectionManager() != null)) {
	            v0_0.getConnectionManager().shutdown();
	        }
	        return;
	    }
	
