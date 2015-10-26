	private final java.lang.String a
	private final org.apache.http.client.HttpClient b
	private final android.content.Context c
	private cxx d
	
	    cxw(org.apache.http.client.HttpClient p10, android.content.Context p11, cxx p12)
	    {
	        String v0_0 = 0;
	        this.c = p11.getApplicationContext();
	        String v4_0 = java.util.Locale.getDefault();
	        if ((v4_0 != null) && ((v4_0.getLanguage() != null) && (v4_0.getLanguage().length() != 0))) {
	            String v0_2 = new StringBuilder();
	            v0_2.append(v4_0.getLanguage().toLowerCase());
	            if ((v4_0.getCountry() != null) && (v4_0.getCountry().length() != 0)) {
	                v0_2.append("-").append(v4_0.getCountry().toLowerCase());
	            }
	            v0_0 = v0_2.toString();
	        }
	        Object[] v7_1 = new Object[6];
	        v7_1[0] = "GoogleTagManager";
	        v7_1[1] = "4.00";
	        v7_1[2] = android.os.Build$VERSION.RELEASE;
	        v7_1[3] = v0_0;
	        v7_1[4] = android.os.Build.MODEL;
	        v7_1[5] = android.os.Build.ID;
	        this.a = String.format("%s/%s (Linux; U; Android %s; %s; %s Build/%s)", v7_1);
	        this.b = p10;
	        this.d = p12;
	        return;
	    }
	
	
	    private static java.net.URL a(cvk p2)
	    {
	        try {
	            int v0_1 = new java.net.URL(p2.c);
	        } catch (int v0) {
	            cuh.a("Error trying to parse the GTM url.");
	            v0_1 = 0;
	        }
	        return v0_1;
	    }
	
	
	    private org.apache.http.HttpEntityEnclosingRequest a(java.net.URL p6)
	    {
	        try {
	            int v0_1 = new org.apache.http.message.BasicHttpEntityEnclosingRequest("GET", p6.toURI().toString());
	            try {
	                v0_1.addHeader("User-Agent", this.a);
	            } catch (java.net.URISyntaxException v1_1) {
	                cuh.b(new StringBuilder("Exception sending hit: ").append(v1_1.getClass().getSimpleName()).toString());
	                cuh.b(v1_1.getMessage());
	            }
	            return v0_1;
	        } catch (int v0_2) {
	            v0_1 = 0;
	            v1_1 = v0_2;
	        }
	    }
	
	
	    private static void a(org.apache.http.HttpEntityEnclosingRequest p6)
	    {
	        StringBuffer v1_1 = new StringBuffer();
	        String v2_0 = p6.getAllHeaders();
	        int v3 = v2_0.length;
	        StringBuffer v0_0 = 0;
	        while (v0_0 < v3) {
	            v1_1.append(v2_0[v0_0].toString()).append("\n");
	            v0_0++;
	        }
	        v1_1.append(p6.getRequestLine().toString()).append("\n");
	        if (p6.getEntity() != null) {
	            try {
	                StringBuffer v0_6 = p6.getEntity().getContent();
	            } catch (StringBuffer v0) {
	                cuh.e("Error Writing hit to log...");
	            }
	            if (v0_6 != null) {
	                String v2_2 = v0_6.available();
	                if (v2_2 > null) {
	                    String v2_3 = new byte[v2_2];
	                    v0_6.read(v2_3);
	                    v1_1.append("POST:\n");
	                    v1_1.append(new String(v2_3)).append("\n");
	                }
	            }
	        }
	        cuh.e(v1_1.toString());
	        return;
	    }
	
	
	    public final void a(java.util.List p11)
	    {
	        int v5 = Math.min(p11.size(), 40);
	        int v1_1 = 1;
	        int v4 = 0;
	        while (v4 < v5) {
	            int v0_2;
	            v0_2 = ((cvk) p11.get(v4));
	            cxx v2_0 = cxw.a(v0_2);
	            if (v2_0 != null) {
	                StringBuilder v6_0 = this.a(v2_0);
	                if (v6_0 != null) {
	                    String v7_1 = new org.apache.http.HttpHost(v2_0.getHost(), v2_0.getPort(), v2_0.getProtocol());
	                    v6_0.addHeader("Host", v7_1.toHostString());
	                    cxw.a(v6_0);
	                    try {
	                        if (v1_1 != 0) {
	                            cwg.a(this.c);
	                            v1_1 = 0;
	                        }
	                        cxx v2_5 = this.b.execute(v7_1, v6_0);
	                        StringBuilder v6_2 = v2_5.getStatusLine().getStatusCode();
	                        String v7_2 = v2_5.getEntity();
	                        if (v7_2 != null) {
	                            v7_2.consumeContent();
	                        }
	                        if (v6_2 == 200) {
	                            this.d.a(v0_2);
	                            v0_2 = v1_1;
	                        } else {
	                            cuh.b(new StringBuilder("Bad response: ").append(v2_5.getStatusLine().getStatusCode()).toString());
	                            this.d.c(v0_2);
	                            v0_2 = v1_1;
	                        }
	                    } catch (cxx v2_12) {
	                        cuh.b(new StringBuilder("Exception sending hit: ").append(v2_12.getClass().getSimpleName()).toString());
	                        cuh.b(v2_12.getMessage());
	                        this.d.c(v0_2);
	                        v0_2 = v1_1;
	                    } catch (cxx v2) {
	                        cuh.b("ClientProtocolException sending hit; discarding hit...");
	                        this.d.b(v0_2);
	                        v0_2 = v1_1;
	                    }
	                } else {
	                    this.d.b(v0_2);
	                    v0_2 = v1_1;
	                }
	            } else {
	                cuh.b("No destination: discarding hit.");
	                this.d.b(v0_2);
	                v0_2 = v1_1;
	            }
	            v4++;
	            v1_1 = v0_2;
	        }
	        return;
	    }
	
	
	    public final boolean a()
	    {
	        int v0_5;
	        int v0_3 = ((android.net.ConnectivityManager) this.c.getSystemService("connectivity")).getActiveNetworkInfo();
	        if ((v0_3 != 0) && (v0_3.isConnected())) {
	            v0_5 = 1;
	        } else {
	            cuh.e("...no network connectivity");
	            v0_5 = 0;
	        }
	        return v0_5;
	    }
	
