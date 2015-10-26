	private static final B c
	private final java.lang.String a
	private final bqr b
	
	    static bqn()
	    {
	        bqn.c = "\n".getBytes();
	        return;
	    }
	
	
	    bqn(brb p10)
	    {
	        this(p10);
	        String v3_1 = bqs.a(java.util.Locale.getDefault());
	        Object[] v7_1 = new Object[6];
	        v7_1[0] = "GoogleAnalytics";
	        v7_1[1] = "4.5.0";
	        v7_1[2] = android.os.Build$VERSION.RELEASE;
	        v7_1[3] = v3_1;
	        v7_1[4] = android.os.Build.MODEL;
	        v7_1[5] = android.os.Build.ID;
	        this.a = String.format("%s/%s (Linux; U; Android %s; %s; %s Build/%s)", v7_1);
	        this.b = new bqr(p10.c);
	        return;
	    }
	
	
	    private int a(java.net.URL p5)
	    {
	        a.c(p5);
	        this.b("GET request", p5);
	        try {
	            java.net.HttpURLConnection v1 = this.b(p5);
	            v1.connect();
	            this.a(v1);
	            int v0_1 = v1.getResponseCode();
	        } catch (int v0_2) {
	            this.d("Network GET connection error", v0_2);
	            if (v1 != null) {
	                v1.disconnect();
	            }
	            v0_1 = 0;
	            return v0_1;
	        } catch (int v0_3) {
	            if (v1 != null) {
	                v1.disconnect();
	            }
	            throw v0_3;
	        }
	        if (v0_1 == 200) {
	            this.d.c().e();
	        }
	        this.b("GET status", Integer.valueOf(v0_1));
	        if (v1 == null) {
	            return v0_1;
	        } else {
	            v1.disconnect();
	            return v0_1;
	        }
	    }
	
	
	    private int a(java.net.URL p6, byte[] p7)
	    {
	        java.io.IOException v1_0 = 0;
	        a.c(p6);
	        a.c(p7);
	        this.b("POST bytes, url", Integer.valueOf(p7.length), p6);
	        if (bqn.p()) {
	            this.a("Post payload\n", new String(p7));
	        }
	        try {
	            int v2_4 = this.b(p6);
	            try {
	                v2_4.setDoOutput(1);
	                v2_4.setFixedLengthStreamingMode(p7.length);
	                v2_4.connect();
	                v1_0 = v2_4.getOutputStream();
	                v1_0.write(p7);
	                this.a(v2_4);
	                int v0_7 = v2_4.getResponseCode();
	            } catch (int v0_4) {
	                this.d("Network POST connection error", v0_4);
	                if (v1_0 != null) {
	                    try {
	                        v1_0.close();
	                    } catch (int v0_8) {
	                        this.e("Error closing http post connection output stream", v0_8);
	                    }
	                }
	                if (v2_4 != 0) {
	                    v2_4.disconnect();
	                }
	                v0_7 = 0;
	                return v0_7;
	            }
	            if (v0_7 == 200) {
	                this.d.c().e();
	            }
	            this.b("POST status", Integer.valueOf(v0_7));
	            if (v1_0 != null) {
	                try {
	                    v1_0.close();
	                } catch (java.io.IOException v1_3) {
	                    this.e("Error closing http post connection output stream", v1_3);
	                }
	            }
	            if (v2_4 == 0) {
	                return v0_7;
	            } else {
	                v2_4.disconnect();
	                return v0_7;
	            }
	        } catch (int v0_5) {
	            v2_4 = 0;
	            if (v1_0 != null) {
	                try {
	                    v1_0.close();
	                } catch (java.io.IOException v1_2) {
	                    this.e("Error closing http post connection output stream", v1_2);
	                }
	            }
	            if (v2_4 != 0) {
	                v2_4.disconnect();
	            }
	            throw v0_5;
	        } catch (int v0_5) {
	        } catch (int v0_4) {
	            v2_4 = 0;
	        }
	    }
	
	
	    private java.net.URL a(bsi p3)
	    {
	        String v1_2;
	        if (!p3.f) {
	            v1_2 = new StringBuilder().append(brz.i()).append(brz.j()).toString();
	        } else {
	            v1_2 = new StringBuilder().append(brz.h()).append(brz.j()).toString();
	        }
	        try {
	            int v0_12 = new java.net.URL(v1_2);
	        } catch (int v0_13) {
	            this.e("Error trying to parse the hardcoded host url", v0_13);
	            v0_12 = 0;
	        }
	        return v0_12;
	    }
	
	
	    private java.net.URL a(bsi p3, String p4)
	    {
	        String v1_3;
	        if (!p3.f) {
	            v1_3 = new StringBuilder().append(brz.i()).append(brz.j()).append("?").append(p4).toString();
	        } else {
	            v1_3 = new StringBuilder().append(brz.h()).append(brz.j()).append("?").append(p4).toString();
	        }
	        try {
	            int v0_16 = new java.net.URL(v1_3);
	        } catch (int v0_17) {
	            this.e("Error trying to parse the hardcoded host url", v0_17);
	            v0_16 = 0;
	        }
	        return v0_16;
	    }
	
	
	    private static void a(StringBuilder p1, String p2, String p3)
	    {
	        if (p1.length() != 0) {
	            p1.append(38);
	        }
	        p1.append(java.net.URLEncoder.encode(p2, "UTF-8"));
	        p1.append(61);
	        p1.append(java.net.URLEncoder.encode(p3, "UTF-8"));
	        return;
	    }
	
	
	    private void a(java.net.HttpURLConnection p4)
	    {
	        try {
	            String v1_0 = p4.getInputStream();
	            java.io.IOException v0_1 = new byte[1024];
	        } catch (java.io.IOException v0_2) {
	            if (v1_0 != null) {
	                try {
	                    v1_0.close();
	                } catch (String v1_1) {
	                    this.e("Error closing http connection input stream", v1_1);
	                }
	            }
	            throw v0_2;
	        }
	        while (v1_0.read(v0_1) > 0) {
	        }
	        if (v1_0 != null) {
	            try {
	                v1_0.close();
	            } catch (java.io.IOException v0_3) {
	                this.e("Error closing http connection input stream", v0_3);
	            }
	        }
	        return;
	    }
	
	
	    private int b(java.net.URL p9, byte[] p10)
	    {
	        int v1_0 = 0;
	        a.c(p9);
	        a.c(p10);
	        try {
	            int v0_1 = new java.io.ByteArrayOutputStream();
	            String v2_1 = new java.util.zip.GZIPOutputStream(v0_1);
	            v2_1.write(p10);
	            v2_1.close();
	            v0_1.close();
	            int v0_2 = v0_1.toByteArray();
	            this.a("POST compressed size, ratio %, url", Integer.valueOf(v0_2.length), Long.valueOf(((100 * ((long) v0_2.length)) / ((long) p10.length))), p9);
	        } catch (int v0_3) {
	            String v2_7 = 0;
	            try {
	                this.d("Network compressed POST connection error", v0_3);
	            } catch (int v0_4) {
	                int v3_9 = v2_7;
	                if (v1_0 != 0) {
	                    try {
	                        v1_0.close();
	                    } catch (int v1_2) {
	                        this.e("Error closing http compressed post connection output stream", v1_2);
	                    }
	                }
	                if (v3_9 != 0) {
	                    v3_9.disconnect();
	                }
	                throw v0_4;
	            }
	            if (v1_0 != 0) {
	                try {
	                    v1_0.close();
	                } catch (int v0_6) {
	                    this.e("Error closing http compressed post connection output stream", v0_6);
	                }
	            }
	            if (v2_7 != null) {
	                v2_7.disconnect();
	            }
	            int v0_5 = 0;
	            return v0_5;
	        } catch (int v0_4) {
	            v3_9 = 0;
	        }
	        if (v0_2.length > p10.length) {
	            this.c("Compressed payload is larger then uncompressed. compressed, uncompressed", Integer.valueOf(v0_2.length), Integer.valueOf(p10.length));
	        }
	        if (bqn.p()) {
	            this.a("Post payload", new StringBuilder("\n").append(new String(p10)).toString());
	        }
	        v3_9 = this.b(p9);
	        try {
	            v3_9.setDoOutput(1);
	            v3_9.addRequestProperty("Content-Encoding", "gzip");
	            v3_9.setFixedLengthStreamingMode(v0_2.length);
	            v3_9.connect();
	            String v2_11 = v3_9.getOutputStream();
	            try {
	                v2_11.write(v0_2);
	                v2_11.close();
	            } catch (int v0_4) {
	                v1_0 = v2_11;
	            } catch (int v0_3) {
	                v1_0 = v2_11;
	                v2_7 = v3_9;
	            }
	            this.a(v3_9);
	            v0_5 = v3_9.getResponseCode();
	            if (v0_5 == 200) {
	                this.d.c().e();
	            }
	            this.b("POST status", Integer.valueOf(v0_5));
	            if (v3_9 == 0) {
	                return v0_5;
	            } else {
	                v3_9.disconnect();
	                return v0_5;
	            }
	        } catch (int v0_4) {
	        } catch (int v0_3) {
	            v2_7 = v3_9;
	        }
	    }
	
	
	    private java.net.HttpURLConnection b(java.net.URL p4)
	    {
	        java.net.HttpURLConnection v0_0 = p4.openConnection();
	        if ((v0_0 instanceof java.net.HttpURLConnection)) {
	            java.net.HttpURLConnection v0_1 = ((java.net.HttpURLConnection) v0_0);
	            v0_1.setDefaultUseCaches(0);
	            v0_1.setConnectTimeout(((Integer) bqd.w.a()).intValue());
	            v0_1.setReadTimeout(((Integer) bqd.x.a()).intValue());
	            v0_1.setInstanceFollowRedirects(0);
	            v0_1.setRequestProperty("User-Agent", this.a);
	            v0_1.setDoInput(1);
	            return v0_1;
	        } else {
	            throw new java.io.IOException("Failed to obtain http connection");
	        }
	    }
	
	
	    private java.util.List b(java.util.List p10)
	    {
	        java.util.ArrayList v4_1 = new java.util.ArrayList(p10.size());
	        java.util.Iterator v5 = p10.iterator();
	        while (v5.hasNext()) {
	            int v1_1;
	            int v0_3 = ((bsi) v5.next());
	            a.c(v0_3);
	            if (v0_3.f) {
	                v1_1 = 0;
	            } else {
	                v1_1 = 1;
	            }
	            int v1_13;
	            String v6_0 = this.a(v0_3, v1_1);
	            if (v6_0 != null) {
	                if (v6_0.length() > ((Integer) bqd.o.a()).intValue()) {
	                    int v1_6 = this.a(v0_3, 0);
	                    if (v1_6 != 0) {
	                        String v6_1 = v1_6.getBytes();
	                        if (v6_1.length <= ((Integer) bqd.s.a()).intValue()) {
	                            int v1_11 = this.a(v0_3);
	                            if (v1_11 != 0) {
	                                if (this.a(v1_11, v6_1) == 200) {
	                                    v1_13 = 1;
	                                    if (v1_13 == 0) {
	                                        break;
	                                    }
	                                    v4_1.add(Long.valueOf(v0_3.c));
	                                    if (v4_1.size() >= brz.f()) {
	                                        break;
	                                    }
	                                }
	                            } else {
	                                this.f("Failed to build collect POST endpoint url");
	                            }
	                        } else {
	                            this.d.a().a(v0_3, "Hit payload exceeds size limit");
	                            v1_13 = 1;
	                        }
	                    } else {
	                        this.d.a().a(v0_3, "Error formatting hit for POST upload");
	                        v1_13 = 1;
	                    }
	                } else {
	                    int v1_19 = this.a(v0_3, v6_0);
	                    if (v1_19 != 0) {
	                        if (this.a(v1_19) != 200) {
	                            v1_13 = 0;
	                        } else {
	                            v1_13 = 1;
	                        }
	                    } else {
	                        this.f("Failed to build collect GET endpoint url");
	                    }
	                }
	                v1_13 = 0;
	            } else {
	                this.d.a().a(v0_3, "Error formatting hit for upload");
	                v1_13 = 1;
	            }
	        }
	        return v4_1;
	    }
	
	
	    static synthetic byte[] c()
	    {
	        return bqn.c;
	    }
	
	
	    private java.net.URL d()
	    {
	        try {
	            int v0_7 = new java.net.URL(new StringBuilder().append(brz.h()).append(((String) bqd.n.a())).toString());
	        } catch (int v0_8) {
	            this.e("Error trying to parse the hardcoded host url", v0_8);
	            v0_7 = 0;
	        }
	        return v0_7;
	    }
	
	
	    final String a(bsi p7, boolean p8)
	    {
	        a.c(p7);
	        StringBuilder v2_1 = new StringBuilder();
	        try {
	            long v3_0 = p7.a.entrySet().iterator();
	        } catch (String v0_19) {
	            this.e("Failed to encode name or value", v0_19);
	            String v0_16 = 0;
	            return v0_16;
	        }
	        while (v3_0.hasNext()) {
	            String v0_18 = ((java.util.Map$Entry) v3_0.next());
	            String v1_7 = ((String) v0_18.getKey());
	            if ((!"ht".equals(v1_7)) && ((!"qt".equals(v1_7)) && ((!"AppUID".equals(v1_7)) && ((!"z".equals(v1_7)) && (!"_gmsv".equals(v1_7)))))) {
	                bqn.a(v2_1, v1_7, ((String) v0_18.getValue()));
	            }
	        }
	        bqn.a(v2_1, "ht", String.valueOf(p7.d));
	        bqn.a(v2_1, "qt", String.valueOf((this.d.c.a() - p7.d)));
	        if (byk.a) {
	            bqn.a(v2_1, "_gmsv", this.d.c().b);
	        }
	        if (p8) {
	            String v0_15;
	            String v0_13 = bqs.a(p7.a("_s", "0"));
	            if (v0_13 == 0) {
	                v0_15 = String.valueOf(p7.c);
	            } else {
	                v0_15 = String.valueOf(v0_13);
	            }
	            bqn.a(v2_1, "z", v0_15);
	        }
	        v0_16 = v2_1.toString();
	        return v0_16;
	    }
	
	
	    public final java.util.List a(java.util.List p9)
	    {
	        java.util.Set v1_2;
	        int v4_3;
	        Integer v2_0 = 1;
	        brb.i();
	        this.r();
	        a.c(p9);
	        if ((!this.m().k().isEmpty()) && (this.b.a((((long) ((Integer) bqd.v.a()).intValue()) * 1000)))) {
	            if (brs.a(((String) bqd.p.a())) == brs.a) {
	                v1_2 = 0;
	            } else {
	                v1_2 = 1;
	            }
	            if (brw.a(((String) bqd.q.a())) != brw.a) {
	                v4_3 = 0;
	            } else {
	                v4_3 = 1;
	            }
	        } else {
	            v1_2 = 0;
	        }
	        bqr v0_16;
	        if (v1_2 == null) {
	            v0_16 = this.b(p9);
	        } else {
	            if (p9.isEmpty()) {
	                v2_0 = 0;
	            }
	            a.b(v2_0);
	            this.a("Uploading batched hits. compression, count", Boolean.valueOf(v4_3), Integer.valueOf(p9.size()));
	            Integer v2_4 = new bqo(this);
	            java.util.Set v1_5 = new java.util.ArrayList();
	            int v3_1 = p9.iterator();
	            while (v3_1.hasNext()) {
	                bqr v0_21 = ((bsi) v3_1.next());
	                if (!v2_4.a(v0_21)) {
	                    break;
	                }
	                v1_5.add(Long.valueOf(v0_21.c));
	            }
	            if (v2_4.a != 0) {
	                bqr v0_23 = this.d();
	                if (v0_23 != null) {
	                    bqr v0_24;
	                    if (v4_3 == 0) {
	                        v0_24 = this.a(v0_23, v2_4.b.toByteArray());
	                    } else {
	                        v0_24 = this.b(v0_23, v2_4.b.toByteArray());
	                    }
	                    if (200 != v0_24) {
	                        this.a("Network error uploading hits. status code", Integer.valueOf(v0_24));
	                        if (this.m().k().contains(Integer.valueOf(v0_24))) {
	                            this.e("Server instructed the client to stop batching");
	                            this.b.a();
	                        }
	                    } else {
	                        this.a("Batched upload completed. Hits batched", Integer.valueOf(v2_4.a));
	                        v0_16 = v1_5;
	                        return v0_16;
	                    }
	                } else {
	                    this.f("Failed to build batching endpoint url");
	                }
	                v0_16 = java.util.Collections.emptyList();
	            } else {
	                v0_16 = v1_5;
	            }
	        }
	        return v0_16;
	    }
	
	
	    protected final void a()
	    {
	        this.a("Network initialized. User agent", this.a);
	        return;
	    }
	
	
	    public final boolean b()
	    {
	        brb.i();
	        this.r();
	        try {
	            int v0_4 = ((android.net.ConnectivityManager) this.d.a.getSystemService("connectivity")).getActiveNetworkInfo();
	        } catch (int v0) {
	            v0_4 = 0;
	        }
	        if ((v0_4 != 0) && (v0_4.isConnected())) {
	            int v0_6 = 1;
	        } else {
	            this.b("No network connectivity");
	            v0_6 = 0;
	        }
	        return v0_6;
	    }
	
