	private final java.net.HttpURLConnection a
	
	    public dhx(java.net.HttpURLConnection p2)
	    {
	        this(p2.getURL());
	        this.a = p2;
	        return;
	    }
	
	
	    public void addRequestProperty(String p2, String p3)
	    {
	        this.a.addRequestProperty(p2, p3);
	        return;
	    }
	
	
	    public void connect()
	    {
	        this.connected = 1;
	        this.a.connect();
	        return;
	    }
	
	
	    public void disconnect()
	    {
	        this.a.disconnect();
	        return;
	    }
	
	
	    public boolean getAllowUserInteraction()
	    {
	        return this.a.getAllowUserInteraction();
	    }
	
	
	    public String getCipherSuite()
	    {
	        int v0_1;
	        int v0_0 = this.a();
	        if (v0_0 == 0) {
	            v0_1 = 0;
	        } else {
	            v0_1 = v0_0.a;
	        }
	        return v0_1;
	    }
	
	
	    public int getConnectTimeout()
	    {
	        return this.a.getConnectTimeout();
	    }
	
	
	    public Object getContent()
	    {
	        return this.a.getContent();
	    }
	
	
	    public Object getContent(Class[] p2)
	    {
	        return this.a.getContent(p2);
	    }
	
	
	    public String getContentEncoding()
	    {
	        return this.a.getContentEncoding();
	    }
	
	
	    public int getContentLength()
	    {
	        return this.a.getContentLength();
	    }
	
	
	    public String getContentType()
	    {
	        return this.a.getContentType();
	    }
	
	
	    public long getDate()
	    {
	        return this.a.getDate();
	    }
	
	
	    public boolean getDefaultUseCaches()
	    {
	        return this.a.getDefaultUseCaches();
	    }
	
	
	    public boolean getDoInput()
	    {
	        return this.a.getDoInput();
	    }
	
	
	    public boolean getDoOutput()
	    {
	        return this.a.getDoOutput();
	    }
	
	
	    public java.io.InputStream getErrorStream()
	    {
	        return this.a.getErrorStream();
	    }
	
	
	    public long getExpiration()
	    {
	        return this.a.getExpiration();
	    }
	
	
	    public String getHeaderField(int p2)
	    {
	        return this.a.getHeaderField(p2);
	    }
	
	
	    public String getHeaderField(String p2)
	    {
	        return this.a.getHeaderField(p2);
	    }
	
	
	    public long getHeaderFieldDate(String p3, long p4)
	    {
	        return this.a.getHeaderFieldDate(p3, p4);
	    }
	
	
	    public int getHeaderFieldInt(String p2, int p3)
	    {
	        return this.a.getHeaderFieldInt(p2, p3);
	    }
	
	
	    public String getHeaderFieldKey(int p2)
	    {
	        return this.a.getHeaderFieldKey(p2);
	    }
	
	
	    public java.util.Map getHeaderFields()
	    {
	        return this.a.getHeaderFields();
	    }
	
	
	    public long getIfModifiedSince()
	    {
	        return this.a.getIfModifiedSince();
	    }
	
	
	    public java.io.InputStream getInputStream()
	    {
	        return this.a.getInputStream();
	    }
	
	
	    public boolean getInstanceFollowRedirects()
	    {
	        return this.a.getInstanceFollowRedirects();
	    }
	
	
	    public long getLastModified()
	    {
	        return this.a.getLastModified();
	    }
	
	
	    public java.security.cert.Certificate[] getLocalCertificates()
	    {
	        java.security.cert.Certificate[] v0_0 = 0;
	        java.util.List v1_0 = this.a();
	        if (v1_0 != null) {
	            java.util.List v1_1 = v1_0.c;
	            if (!v1_1.isEmpty()) {
	                java.security.cert.Certificate[] v0_2 = new java.security.cert.Certificate[v1_1.size()];
	                v0_0 = ((java.security.cert.Certificate[]) v1_1.toArray(v0_2));
	            }
	        }
	        return v0_0;
	    }
	
	
	    public java.security.Principal getLocalPrincipal()
	    {
	        javax.security.auth.x500.X500Principal v0_0 = 0;
	        int v1_0 = this.a();
	        if ((v1_0 != 0) && (!v1_0.c.isEmpty())) {
	            v0_0 = ((java.security.cert.X509Certificate) v1_0.c.get(0)).getSubjectX500Principal();
	        }
	        return v0_0;
	    }
	
	
	    public java.io.OutputStream getOutputStream()
	    {
	        return this.a.getOutputStream();
	    }
	
	
	    public java.security.Principal getPeerPrincipal()
	    {
	        javax.security.auth.x500.X500Principal v0_0 = 0;
	        int v1_0 = this.a();
	        if ((v1_0 != 0) && (!v1_0.b.isEmpty())) {
	            v0_0 = ((java.security.cert.X509Certificate) v1_0.b.get(0)).getSubjectX500Principal();
	        }
	        return v0_0;
	    }
	
	
	    public java.security.Permission getPermission()
	    {
	        return this.a.getPermission();
	    }
	
	
	    public int getReadTimeout()
	    {
	        return this.a.getReadTimeout();
	    }
	
	
	    public String getRequestMethod()
	    {
	        return this.a.getRequestMethod();
	    }
	
	
	    public java.util.Map getRequestProperties()
	    {
	        return this.a.getRequestProperties();
	    }
	
	
	    public String getRequestProperty(String p2)
	    {
	        return this.a.getRequestProperty(p2);
	    }
	
	
	    public int getResponseCode()
	    {
	        return this.a.getResponseCode();
	    }
	
	
	    public String getResponseMessage()
	    {
	        return this.a.getResponseMessage();
	    }
	
	
	    public java.security.cert.Certificate[] getServerCertificates()
	    {
	        java.security.cert.Certificate[] v0_0 = 0;
	        java.util.List v1_0 = this.a();
	        if (v1_0 != null) {
	            java.util.List v1_1 = v1_0.b;
	            if (!v1_1.isEmpty()) {
	                java.security.cert.Certificate[] v0_2 = new java.security.cert.Certificate[v1_1.size()];
	                v0_0 = ((java.security.cert.Certificate[]) v1_1.toArray(v0_2));
	            }
	        }
	        return v0_0;
	    }
	
	
	    public java.net.URL getURL()
	    {
	        return this.a.getURL();
	    }
	
	
	    public boolean getUseCaches()
	    {
	        return this.a.getUseCaches();
	    }
	
	
	    public void setAllowUserInteraction(boolean p2)
	    {
	        this.a.setAllowUserInteraction(p2);
	        return;
	    }
	
	
	    public void setChunkedStreamingMode(int p2)
	    {
	        this.a.setChunkedStreamingMode(p2);
	        return;
	    }
	
	
	    public void setConnectTimeout(int p2)
	    {
	        this.a.setConnectTimeout(p2);
	        return;
	    }
	
	
	    public void setDefaultUseCaches(boolean p2)
	    {
	        this.a.setDefaultUseCaches(p2);
	        return;
	    }
	
	
	    public void setDoInput(boolean p2)
	    {
	        this.a.setDoInput(p2);
	        return;
	    }
	
	
	    public void setDoOutput(boolean p2)
	    {
	        this.a.setDoOutput(p2);
	        return;
	    }
	
	
	    public void setFixedLengthStreamingMode(int p2)
	    {
	        this.a.setFixedLengthStreamingMode(p2);
	        return;
	    }
	
	
	    public void setIfModifiedSince(long p2)
	    {
	        this.a.setIfModifiedSince(p2);
	        return;
	    }
	
	
	    public void setInstanceFollowRedirects(boolean p2)
	    {
	        this.a.setInstanceFollowRedirects(p2);
	        return;
	    }
	
	
	    public void setReadTimeout(int p2)
	    {
	        this.a.setReadTimeout(p2);
	        return;
	    }
	
	
	    public void setRequestMethod(String p2)
	    {
	        this.a.setRequestMethod(p2);
	        return;
	    }
	
	
	    public void setRequestProperty(String p2, String p3)
	    {
	        this.a.setRequestProperty(p2, p3);
	        return;
	    }
	
	
	    public void setUseCaches(boolean p2)
	    {
	        this.a.setUseCaches(p2);
	        return;
	    }
	
	
	    public String toString()
	    {
	        return this.a.toString();
	    }
	
	
	    public boolean usingProxy()
	    {
	        return this.a.usingProxy();
	    }
	
