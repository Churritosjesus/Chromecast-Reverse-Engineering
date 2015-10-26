	private final s a
	private final javax.net.ssl.SSLSocketFactory b
	
	    public aeq()
	    {
	        this(0);
	        return;
	    }
	
	
	    private aeq(s p2)
	    {
	        this(0, 0);
	        return;
	    }
	
	
	    private aeq(s p2, javax.net.ssl.SSLSocketFactory p3)
	    {
	        this.a = p2;
	        this.b = 0;
	        return;
	    }
	
	
	    private static org.apache.http.HttpEntity a(java.net.HttpURLConnection p4)
	    {
	        org.apache.http.entity.BasicHttpEntity v1_1 = new org.apache.http.entity.BasicHttpEntity();
	        try {
	            String v0_0 = p4.getInputStream();
	        } catch (String v0) {
	            v0_0 = p4.getErrorStream();
	        }
	        v1_1.setContent(v0_0);
	        v1_1.setContentLength(((long) p4.getContentLength()));
	        v1_1.setContentEncoding(p4.getContentEncoding());
	        v1_1.setContentType(p4.getContentType());
	        return v1_1;
	    }
	
	
	    private static void a(java.net.HttpURLConnection p3, ads p4)
	    {
	        byte[] v0 = p4.d();
	        if (v0 != null) {
	            p3.setDoOutput(1);
	            p3.addRequestProperty("Content-Type", p4.c());
	            java.io.DataOutputStream v1_3 = new java.io.DataOutputStream(p3.getOutputStream());
	            v1_3.write(v0);
	            v1_3.close();
	        }
	        return;
	    }
	
	
	    public java.net.HttpURLConnection a(java.net.URL p2)
	    {
	        return ((java.net.HttpURLConnection) p2.openConnection());
	    }
	
	
	    public final org.apache.http.HttpResponse a(ads p8, java.util.Map p9)
	    {
	        String v0_2;
	        String v1_0 = p8.b;
	        org.apache.http.message.BasicHttpResponse v3_1 = new java.util.HashMap();
	        v3_1.putAll(p8.a());
	        v3_1.putAll(p9);
	        if (this.a == null) {
	            v0_2 = v1_0;
	        } else {
	            v0_2 = this.a.b();
	            if (v0_2 == null) {
	                throw new java.io.IOException(new StringBuilder("URL blocked by rewriter: ").append(v1_0).toString());
	            }
	        }
	        java.util.Iterator v2_1 = new java.net.URL(v0_2);
	        String v1_1 = this.a(v2_1);
	        String v0_4 = p8.f();
	        v1_1.setConnectTimeout(v0_4);
	        v1_1.setReadTimeout(v0_4);
	        v1_1.setUseCaches(0);
	        v1_1.setDoInput(1);
	        if (("https".equals(v2_1.getProtocol())) && (this.b != null)) {
	            ((javax.net.ssl.HttpsURLConnection) v1_1).setSSLSocketFactory(this.b);
	        }
	        org.apache.http.message.BasicHeader v4_0 = v3_1.keySet().iterator();
	        while (v4_0.hasNext()) {
	            String v0_39 = ((String) v4_0.next());
	            v1_1.addRequestProperty(v0_39, ((String) v3_1.get(v0_39)));
	        }
	        switch (p8.a) {
	            case -1:
	                String v0_21 = p8.b();
	                if (v0_21 == null) {
	                } else {
	                    v1_1.setDoOutput(1);
	                    v1_1.setRequestMethod("POST");
	                    v1_1.addRequestProperty("Content-Type", p8.c());
	                    java.util.Iterator v2_7 = new java.io.DataOutputStream(v1_1.getOutputStream());
	                    v2_7.write(v0_21);
	                    v2_7.close();
	                }
	                break;
	            case 0:
	                v1_1.setRequestMethod("GET");
	                break;
	            case 1:
	                v1_1.setRequestMethod("POST");
	                aeq.a(v1_1, p8);
	                break;
	            case 2:
	                v1_1.setRequestMethod("PUT");
	                aeq.a(v1_1, p8);
	                break;
	            case 3:
	                v1_1.setRequestMethod("DELETE");
	                break;
	            case 4:
	                v1_1.setRequestMethod("HEAD");
	                break;
	            case 5:
	                v1_1.setRequestMethod("OPTIONS");
	                break;
	            case 6:
	                v1_1.setRequestMethod("TRACE");
	                break;
	            case 7:
	                v1_1.setRequestMethod("PATCH");
	                aeq.a(v1_1, p8);
	                break;
	            default:
	                throw new IllegalStateException("Unknown method type.");
	        }
	        String v0_23 = new org.apache.http.ProtocolVersion("HTTP", 1, 1);
	        if (v1_1.getResponseCode() != -1) {
	            org.apache.http.message.BasicHttpResponse v3_7 = new org.apache.http.message.BasicHttpResponse(new org.apache.http.message.BasicStatusLine(v0_23, v1_1.getResponseCode(), v1_1.getResponseMessage()));
	            v3_7.setEntity(aeq.a(v1_1));
	            java.util.Iterator v2_12 = v1_1.getHeaderFields().entrySet().iterator();
	            while (v2_12.hasNext()) {
	                String v0_29 = ((java.util.Map$Entry) v2_12.next());
	                if (v0_29.getKey() != null) {
	                    v3_7.addHeader(new org.apache.http.message.BasicHeader(((String) v0_29.getKey()), ((String) ((java.util.List) v0_29.getValue()).get(0))));
	                }
	            }
	            return v3_7;
	        } else {
	            throw new java.io.IOException("Could not retrieve response code from HttpUrlConnection.");
	        }
	    }
	
