	private final android.net.http.AndroidHttpClient a
	private final  b
	private final  c
	private android.net.Uri d
	private  e
	private org.apache.http.client.methods.HttpRequestBase f
	private final java.util.HashMap g
	private bfc h
	private Lorg.apache.http.Header i
	private final blp j
	
	    static bfr()
	    {
	        java.util.concurrent.TimeUnit.SECONDS.toMillis(3);
	        java.util.concurrent.TimeUnit.SECONDS.toMillis(10);
	        return;
	    }
	
	
	    public bfr(android.net.http.AndroidHttpClient p4, int p5, int p6)
	    {
	        this.a = p4;
	        this.b = p5;
	        this.c = p6;
	        this.g = new java.util.HashMap();
	        this.j = new blp("SimpleHttpRequestImpl", 0);
	        return;
	    }
	
	
	    private void a(org.apache.http.client.methods.HttpRequestBase p9)
	    {
	        this.f = p9;
	        StringBuilder v4_0 = this.g.entrySet().iterator();
	        while (v4_0.hasNext()) {
	            bfc v0_31 = ((java.util.Map$Entry) v4_0.next());
	            this.f.addHeader(((String) v0_31.getKey()), ((String) v0_31.getValue()));
	        }
	        StringBuilder v4_2 = new org.apache.http.protocol.BasicHttpContext();
	        org.apache.http.params.HttpConnectionParams.setConnectionTimeout(this.a.getParams(), this.b);
	        org.apache.http.params.HttpConnectionParams.setSoTimeout(this.a.getParams(), this.c);
	        android.os.SystemClock.elapsedRealtime();
	        String v1_2 = 0;
	        bfc v0_7 = 0;
	        try {
	            while (v1_2 < 5) {
	                v0_7 = this.a.execute(this.f, v4_2);
	                int v3_4 = v0_7.getStatusLine().getStatusCode();
	                if ((v3_4 != 302) && (v3_4 != 301)) {
	                    break;
	                }
	                int v3_6 = v0_7.getHeaders("Location");
	                if ((v3_6 == 0) || (v3_6.length == 0)) {
	                    break;
	                }
	                try {
	                    this.f.setURI(new java.net.URI(v3_6[(v3_6.length - 1)].getValue()));
	                    v1_2++;
	                } catch (String v1) {
	                    Object[] v5_5 = new Object[0];
	                    this.j.a("Redirect failed. Unable to parse Location header into an URI", v5_5);
	                    int v3_7 = v0_7;
	                    bfc v0_15;
	                    bfc v0_11 = ((org.apache.http.client.methods.HttpUriRequest) v4_2.getAttribute("http.request"));
	                    if (!v0_11.getURI().isAbsolute()) {
	                        String v1_8 = String.valueOf(((org.apache.http.HttpHost) v4_2.getAttribute("http.target_host")).toURI());
	                        bfc v0_13 = String.valueOf(v0_11.getURI());
	                        v0_15 = new StringBuilder(((String.valueOf(v1_8).length() + 0) + String.valueOf(v0_13).length())).append(v1_8).append(v0_13).toString();
	                    } else {
	                        v0_15 = v0_11.toString();
	                    }
	                    bfc v0_19;
	                    android.net.Uri.parse(v0_15);
	                    if (v3_7 == 0) {
	                        v0_19 = 0;
	                    } else {
	                        this.i = v3_7.getAllHeaders();
	                        this.e = v3_7.getStatusLine().getStatusCode();
	                        int v3_11 = v3_7.getEntity();
	                        if (v3_11 == 0) {
	                        } else {
	                            bfc v0_21;
	                            bfc v0_20 = v3_11.getContentType();
	                            if (v0_20 == null) {
	                                v0_21 = 0;
	                            } else {
	                                v0_21 = v0_20.getValue();
	                            }
	                            String v1_11;
	                            if (!android.text.TextUtils.isEmpty(v0_21)) {
	                                v1_11 = v0_21;
	                            } else {
	                                v1_11 = "application/octet-stream";
	                            }
	                            byte[] v2_2 = new java.io.ByteArrayOutputStream();
	                            v3_11.writeTo(v2_2);
	                            v3_11.consumeContent();
	                            v2_2.close();
	                            v0_19 = new bfc(v2_2.toByteArray(), v1_11);
	                        }
	                    }
	                    this.f = 0;
	                    this.h = v0_19;
	                    return;
	                }
	                int v3_12 = v0_7.getEntity();
	                if (v3_12 != 0) {
	                    v3_12.consumeContent();
	                }
	            }
	        } catch (bfc v0) {
	            throw new java.util.concurrent.TimeoutException();
	        } catch (bfc v0) {
	            throw new java.io.IOException("client protocol error");
	        } catch (bfc v0) {
	            throw new java.net.MalformedURLException();
	        }
	        v3_7 = v0_7;
	    }
	
	
	    public final String a(String p6)
	    {
	        org.apache.http.Header[] v1 = this.i;
	        int v0_0 = 0;
	        while (v0_0 < v1.length) {
	            org.apache.http.Header v3 = v1[v0_0];
	            if (!v3.getName().equalsIgnoreCase(p6)) {
	                v0_0++;
	            } else {
	                int v0_1 = v3.getValue();
	            }
	            return v0_1;
	        }
	        v0_1 = 0;
	        return v0_1;
	    }
	
	
	    public final void a()
	    {
	        UnsupportedOperationException v0 = this.f;
	        if (v0 != null) {
	            try {
	                Object[] v3_1 = new Object[0];
	                this.j.a("aborting the HTTP request", v3_1);
	                v0.abort();
	            } catch (UnsupportedOperationException v0) {
	            }
	        }
	        return;
	    }
	
	
	    public final void a(android.net.Uri p3)
	    {
	        this.d = p3;
	        this.a(new org.apache.http.client.methods.HttpGet(this.d.toString()));
	        return;
	    }
	
	
	    public final void a(android.net.Uri p4, bfc p5)
	    {
	        this.d = p4;
	        org.apache.http.client.methods.HttpPost v0_1 = new org.apache.http.client.methods.HttpPost(this.d.toString());
	        if (p5 != null) {
	            org.apache.http.entity.ByteArrayEntity v1_3 = new org.apache.http.entity.ByteArrayEntity(p5.a);
	            v1_3.setContentType(p5.b);
	            v0_1.setEntity(v1_3);
	        }
	        this.a(v0_1);
	        return;
	    }
	
	
	    public final void a(String p2, String p3)
	    {
	        this.g.put(p2, p3);
	        return;
	    }
	
	
	    public final int b()
	    {
	        return this.e;
	    }
	
	
	    public final bfc c()
	    {
	        return this.h;
	    }
	
