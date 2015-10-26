	private static  a
	private static  b
	private static  c
	private aep d
	private aek e
	
	    static aej()
	    {
	        aej.a = aeg.a;
	        aej.b = 3000;
	        aej.c = 4096;
	        return;
	    }
	
	
	    public aej(aep p3)
	    {
	        this(p3, new aek(aej.c));
	        return;
	    }
	
	
	    private aej(aep p1, aek p2)
	    {
	        this.d = p1;
	        this.e = p2;
	        return;
	    }
	
	
	    private static java.util.Map a(org.apache.http.Header[] p4)
	    {
	        java.util.TreeMap v1_1 = new java.util.TreeMap(String.CASE_INSENSITIVE_ORDER);
	        int v0_1 = 0;
	        while (v0_1 < p4.length) {
	            v1_1.put(p4[v0_1].getName(), p4[v0_1].getValue());
	            v0_1++;
	        }
	        return v1_1;
	    }
	
	
	    private static void a(String p6, ads p7, aef p8)
	    {
	        aef v0_0 = p7.i;
	        String v1_0 = p7.f();
	        try {
	            v0_0.a(p8);
	            String v2_0 = new Object[2];
	            v2_0[0] = p6;
	            String v1_1 = Integer.valueOf(v1_0);
	            v2_0[1] = v1_1;
	            p7.a(String.format("%s-retry [timeout=%s]", v2_0));
	            return;
	        } catch (aef v0_3) {
	            Object[] v3_1 = new Object[2];
	            v3_1[0] = p6;
	            v3_1[1] = Integer.valueOf(v1_1);
	            p7.a(String.format("%s-timeout-giveup [timeout=%s]", v3_1));
	            throw v0_3;
	        }
	    }
	
	
	    private byte[] a(org.apache.http.HttpEntity p8)
	    {
	        afa v2_1 = new afa(this.e, ((int) p8.getContentLength()));
	        byte[] v1_1 = 0;
	        try {
	            byte[] v0_1 = p8.getContent();
	        } catch (byte[] v0_5) {
	            try {
	                p8.consumeContent();
	            } catch (aek v3) {
	                Object[] v4_5 = new Object[0];
	                aeg.a("Error occured when calling consumingContent", v4_5);
	            }
	            this.e.a(v1_1);
	            v2_1.close();
	            throw v0_5;
	        }
	        if (v0_1 != null) {
	            v1_1 = this.e.a(1024);
	            while(true) {
	                aek v3_1 = v0_1.read(v1_1);
	                if (v3_1 == -1) {
	                    break;
	                }
	                v2_1.write(v1_1, 0, v3_1);
	            }
	            byte[] v0_2 = v2_1.toByteArray();
	            try {
	                p8.consumeContent();
	            } catch (aek v3) {
	                Object[] v4_3 = new Object[0];
	                aeg.a("Error occured when calling consumingContent", v4_3);
	            }
	            this.e.a(v1_1);
	            v2_1.close();
	            return v0_2;
	        } else {
	            throw new aed();
	        }
	    }
	
	
	    public final adp a(ads p19)
	    {
	        long v16 = android.os.SystemClock.elapsedRealtime();
	        while(true) {
	            adp v3_0 = 0;
	            java.util.Map v6 = java.util.Collections.emptyMap();
	            int v2_1 = new java.util.HashMap();
	            adf v4_0 = p19.j;
	            if (v4_0 != null) {
	                if (v4_0.b != null) {
	                    v2_1.put("If-None-Match", v4_0.b);
	                }
	                if (v4_0.d > 0) {
	                    v2_1.put("If-Modified-Since", org.apache.http.impl.cookie.DateUtils.formatDate(new java.util.Date(v4_0.d)));
	                }
	            }
	            org.apache.http.HttpResponse v15 = this.d.a(p19, v2_1);
	            try {
	                adp v3_8;
	                adp v3_1 = v15.getStatusLine();
	                adf v4_3 = v3_1.getStatusCode();
	                v6 = aej.a(v15.getAllHeaders());
	            } catch (int v2_2) {
	                byte[] v5_6 = 0;
	                v3_0 = v15;
	                if (v3_0 == null) {
	                    throw new adq(v2_2);
	                } else {
	                    adf v4_5 = v3_0.getStatusLine().getStatusCode();
	                    adp v3_14 = new Object[2];
	                    v3_14[0] = Integer.valueOf(v4_5);
	                    v3_14[1] = p19.b;
	                    aeg.c("Unexpected response code %d for %s", v3_14);
	                    if (v5_6 == null) {
	                        throw new ado(0);
	                    } else {
	                        adp v3_17 = new adp(v4_5, v5_6, v6, 0, (android.os.SystemClock.elapsedRealtime() - v16));
	                        if (v4_5 != 401) {
	                            if (v4_5 != 403) {
	                                break;
	                            }
	                        }
	                        aej.a("auth", p19, new adf(v3_17));
	                    }
	                }
	            }
	            if (v4_3 != 304) {
	                if (v15.getEntity() == null) {
	                    v5_6 = new byte[0];
	                } else {
	                    v5_6 = this.a(v15.getEntity());
	                }
	                try {
	                    long v8_3 = (android.os.SystemClock.elapsedRealtime() - v16);
	                } catch (int v2_2) {
	                    v3_0 = v15;
	                }
	                if ((aej.a) || (v8_3 > ((long) aej.b))) {
	                    int v2_14;
	                    Object[] v10_2 = new Object[5];
	                    v10_2[0] = p19;
	                    v10_2[1] = Long.valueOf(v8_3);
	                    if (v5_6 == null) {
	                        v2_14 = "null";
	                    } else {
	                        v2_14 = Integer.valueOf(v5_6.length);
	                    }
	                    v10_2[2] = v2_14;
	                    v10_2[3] = Integer.valueOf(v3_1.getStatusCode());
	                    v10_2[4] = Integer.valueOf(p19.i.b());
	                    aeg.b("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", v10_2);
	                }
	                if ((v4_3 >= 200) && (v4_3 <= 299)) {
	                    v3_8 = new adp(v4_3, v5_6, v6, 0, (android.os.SystemClock.elapsedRealtime() - v16));
	                } else {
	                    throw new java.io.IOException();
	                }
	            } else {
	                int v2_22 = p19.j;
	                if (v2_22 != 0) {
	                    v2_22.g.putAll(v6);
	                    v3_8 = new adp(304, v2_22.a, v2_22.g, 1, (android.os.SystemClock.elapsedRealtime() - v16));
	                } else {
	                    v3_8 = new adp(304, 0, v6, 1, (android.os.SystemClock.elapsedRealtime() - v16));
	                }
	            }
	            return v3_8;
	        }
	        throw new aed(v3_17);
	    }
	
