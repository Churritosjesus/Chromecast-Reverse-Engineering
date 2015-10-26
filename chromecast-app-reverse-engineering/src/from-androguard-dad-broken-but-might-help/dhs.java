	private final dfh a
	private final dfi b
	
	    public dhs(dfh p1, dfi p2)
	    {
	        this.a = p1;
	        this.b = p2;
	        return;
	    }
	
	
	    public static java.net.Socket a(int p5, int p6, dgf p7)
	    {
	        dhq v1_0 = dgn.a();
	        try {
	            java.net.Socket v0_2;
	            java.net.InetSocketAddress v2_0 = p7.b;
	        } catch (java.net.Socket v0_4) {
	            throw new dhq(v0_4);
	        }
	        if ((v2_0.type() != java.net.Proxy$Type.DIRECT) && (v2_0.type() != java.net.Proxy$Type.HTTP)) {
	            v0_2 = new java.net.Socket(v2_0);
	        } else {
	            v0_2 = p7.a.d.createSocket();
	        }
	        v0_2.setSoTimeout(p5);
	        v1_0.a(v0_2, p7.c, p6);
	        return v0_2;
	    }
	
	
	    public final dht a(int p15, int p16, int p17, dfy p18, dgf p19, java.util.List p20, boolean p21)
	    {
	        dez v7 = p19.a;
	        dgh v8_1 = new dgh(p20);
	        boolean v4_0 = 0;
	        while(true) {
	            int v2_5;
	            Object[] v9_0 = dhs.a(p16, p15, p19);
	            if ((p19.a.e == null) || (p19.b.type() != java.net.Proxy$Type.HTTP)) {
	                v2_5 = 0;
	            } else {
	                v2_5 = 1;
	            }
	            if (v2_5 != 0) {
	                try {
	                    int v2_15;
	                    String v3_1 = p18.a().getHost();
	                    dht v5_0 = dgs.a(p18.a());
	                } catch (int v2_54) {
	                    throw new dhq(v2_54);
	                }
	                if (v5_0 != dgs.a("https")) {
	                    v2_15 = new StringBuilder().append(v3_1).append(":").append(v5_0).toString();
	                } else {
	                    v2_15 = v3_1;
	                }
	                int v2_17 = new dfz().a(new java.net.URL("https", v3_1, v5_0, "/")).a("Host", v2_15).a("Proxy-Connection", "Keep-Alive");
	                String v3_5 = p18.a("User-Agent");
	                if (v3_5 != null) {
	                    v2_17.a("User-Agent", v3_5);
	                }
	                String v3_7 = p18.a("Proxy-Authorization");
	                if (v3_7 != null) {
	                    v2_17.a("Proxy-Authorization", v3_7);
	                }
	                int v2_18 = v2_17.a();
	                dht v5_6 = new dgx(this.b, this.a, v9_0);
	                v5_6.a(p16, p17);
	                String v3_9 = v2_18.a();
	                reflect.Method v6_9 = new StringBuilder("CONNECT ").append(v3_9.getHost()).append(":").append(dgs.a(v3_9)).append(" HTTP/1.1").toString();
	                do {
	                    v5_6.a(v2_18.c, v6_9);
	                    v5_6.a();
	                    String v3_14 = v5_6.c();
	                    v3_14.a = v2_18;
	                    int v10_5 = v3_14.a();
	                    int v2_19 = dhl.a(v10_5);
	                    if (v2_19 == -1) {
	                        v2_19 = 0;
	                    }
	                    int v2_20 = v5_6.a(v2_19);
	                    dgs.b(v2_20, 2147483647, java.util.concurrent.TimeUnit.MILLISECONDS);
	                    v2_20.close();
	                    switch (v10_5.c) {
	                        case 200:
	                            if (v5_6.c.b().b > 0) {
	                                throw new java.io.IOException("TLS tunnel buffered too many bytes!");
	                            }
	                            break;
	                        case 407:
	                            v2_18 = dhl.a(p19.a.h, v10_5, p19.b);
	                            break;
	                        default:
	                            throw new java.io.IOException(new StringBuilder("Unexpected response code for CONNECT: ").append(v10_5.c).toString());
	                    }
	                } while(v2_18 != 0);
	            }
	            try {
	                int v2_32 = ((javax.net.ssl.SSLSocket) v7.e.createSocket(v9_0, v7.b, v7.c, 1));
	                try {
	                    dht v5_9 = v8_1.a(v2_32);
	                    reflect.Method v6_12 = dgn.a();
	                    String v3_19 = 0;
	                } catch (String v3_28) {
	                    dht v5_8 = v3_28;
	                    reflect.Method v6_11 = v2_32;
	                    if (!p21) {
	                        String v3_29 = 0;
	                    } else {
	                        v8_1.b = 1;
	                        if ((v5_8 instanceof java.net.ProtocolException)) {
	                            int v2_44 = 0;
	                        } else {
	                            if ((v5_8 instanceof java.io.InterruptedIOException)) {
	                            } else {
	                                if ((v5_8 instanceof javax.net.ssl.SSLHandshakeException)) {
	                                    if ((v5_8.getCause() instanceof java.security.cert.CertificateException)) {
	                                    }
	                                }
	                                if ((v5_8 instanceof javax.net.ssl.SSLPeerUnverifiedException)) {
	                                } else {
	                                    if (!(v5_8 instanceof javax.net.ssl.SSLHandshakeException)) {
	                                        if (!(v5_8 instanceof javax.net.ssl.SSLProtocolException)) {
	                                        }
	                                    }
	                                    if (!v8_1.a) {
	                                    } else {
	                                        v2_44 = 1;
	                                    }
	                                }
	                            }
	                        }
	                        if (v2_44 == 0) {
	                        } else {
	                            v3_29 = 1;
	                        }
	                    }
	                    dgs.a(v6_11);
	                    dgs.a(v9_0);
	                    if (v4_0) {
	                        if (dhq.a != null) {
	                            try {
	                                Object[] v9_2 = new Object[1];
	                                v9_2[0] = v4_0.b;
	                                dhq.a.invoke(v5_8, v9_2);
	                            } catch (int v2) {
	                            } catch (int v2) {
	                            }
	                        }
	                        v4_0.b = v5_8;
	                        int v2_48 = v4_0;
	                    } else {
	                        v2_48 = new dhq(v5_8);
	                    }
	                    if (v3_29 != null) {
	                        v4_0 = v2_48;
	                    } else {
	                        throw v2_48;
	                    }
	                }
	                try {
	                    if (v5_9.g) {
	                        v6_12.a(v2_32, v7.b, v7.i);
	                    }
	                    v2_32.startHandshake();
	                    int v10_11 = dfn.a(v2_32.getSession());
	                    if (v5_9.g) {
	                        dht v5_11 = v6_12.b(v2_32);
	                        if (v5_11 != null) {
	                            v3_19 = dfx.a(v5_11);
	                        }
	                    }
	                    v6_12.a(v2_32);
	                    if (v7.f.verify(v7.b, v2_32.getSession())) {
	                        v7.g.a(v7.b, v10_11.b);
	                        return new dht(p19, v2_32, v3_19, v10_11);
	                    } else {
	                        String v3_24 = ((java.security.cert.X509Certificate) v2_32.getSession().getPeerCertificates()[0]);
	                        throw new javax.net.ssl.SSLPeerUnverifiedException(new StringBuilder("Hostname ").append(v7.b).append(" not verified:\n    certificate: ").append(dfd.a(v3_24)).append("\n    DN: ").append(v3_24.getSubjectDN().getName()).append("\n    subjectAltNames: ").append(djt.a(v3_24)).toString());
	                    }
	                } catch (String v3_20) {
	                    v6_12.a(v2_32);
	                    throw v3_20;
	                }
	            } catch (int v2_33) {
	                v5_8 = v2_33;
	                v6_11 = 0;
	            }
	        }
	        throw new java.io.IOException("Failed to authenticate with proxy");
	    }
	
