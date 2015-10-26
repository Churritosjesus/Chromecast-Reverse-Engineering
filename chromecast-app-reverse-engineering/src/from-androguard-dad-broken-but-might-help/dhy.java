	private static final java.util.Set d
	private static final dga e
	final dft a
	public dhg b
	 dfn c
	private dfp f
	private  g
	private  h
	private java.io.IOException i
	private dfo j
	private dgf k
	
	    static dhy()
	    {
	        String v1_1 = new String[8];
	        v1_1[0] = "OPTIONS";
	        v1_1[1] = "GET";
	        v1_1[2] = "HEAD";
	        v1_1[3] = "POST";
	        v1_1[4] = "PUT";
	        v1_1[5] = "DELETE";
	        v1_1[6] = "TRACE";
	        v1_1[7] = "PATCH";
	        dhy.d = new java.util.LinkedHashSet(java.util.Arrays.asList(v1_1));
	        byte[] v6 = new byte[0];
	        if (v6 != null) {
	            dgs.a(((long) v6.length), 0, ((long) 0));
	            dhy.e = new dgb(0, 0, v6, 0);
	            return;
	        } else {
	            throw new NullPointerException("content == null");
	        }
	    }
	
	
	    public dhy(java.net.URL p3, dft p4)
	    {
	        this(p3);
	        this.f = new dfp();
	        this.g = -1;
	        this.a = p4;
	        return;
	    }
	
	
	    private dfo a()
	    {
	        if (this.j == null) {
	            dfo v0_6;
	            dfo v0_2 = this.c().f();
	            dfp v1_1 = v0_2.f.a();
	            String v2_1 = new StringBuilder();
	            dgn.a();
	            String v2_4 = v2_1.append(dgn.b()).append("-Response-Source").toString();
	            if (v0_2.h != null) {
	                if (v0_2.i != null) {
	                    v0_6 = new StringBuilder("CONDITIONAL_CACHE ").append(v0_2.h.c).toString();
	                } else {
	                    v0_6 = new StringBuilder("NETWORK ").append(v0_2.c).toString();
	                }
	            } else {
	                if (v0_2.i != null) {
	                    v0_6 = new StringBuilder("CACHE ").append(v0_2.c).toString();
	                } else {
	                    v0_6 = "NONE";
	                }
	            }
	            this.j = v1_1.a(v2_4, v0_6).a();
	        }
	        return this.j;
	    }
	
	
	    private dhg a(String p11, dfh p12, dhp p13, dgc p14)
	    {
	        int v0_1;
	        if (!a.p(p11)) {
	            v0_1 = 0;
	        } else {
	            v0_1 = dhy.e;
	        }
	        dft v1_3 = new dfz().a(this.getURL()).a(p11, v0_1);
	        dfy v2_1 = this.f.a();
	        int v0_3 = 0;
	        String v3_2 = (v2_1.a.length / 2);
	        while (v0_3 < v3_2) {
	            v1_3.b(v2_1.a(v0_3), v2_1.b(v0_3));
	            v0_3++;
	        }
	        int v0_4 = 0;
	        if (a.q(p11)) {
	            if (this.g == -1) {
	                if (this.chunkLength <= 0) {
	                    v0_4 = 1;
	                } else {
	                    v1_3.a("Transfer-Encoding", "chunked");
	                }
	            } else {
	                v1_3.a("Content-Length", Long.toString(this.g));
	            }
	            if (v2_1.a("Content-Type") == null) {
	                v1_3.a("Content-Type", "application/x-www-form-urlencoded");
	            }
	        }
	        String v3_11 = v0_4;
	        if (v2_1.a("User-Agent") == null) {
	            int v0_8 = System.getProperty("http.agent");
	            if (v0_8 == 0) {
	                v0_8 = new StringBuilder("Java").append(System.getProperty("java.version")).toString();
	            }
	            v1_3.a("User-Agent", v0_8);
	        }
	        dfy v2_3 = v1_3.a();
	        dft v1_4 = this.a;
	        if ((dgi.b.a(v1_4) != null) && (!this.getUseCaches())) {
	            v1_4 = this.a.b();
	            v1_4.k = 0;
	            v1_4.j = 0;
	        }
	        return new dhg(v1_4, v2_3, v3_11, 1, 0, p12, 0, p13, p14);
	    }
	
	
	    private void a(String p6, boolean p7)
	    {
	        java.util.List v1_1 = new java.util.ArrayList();
	        if (p7) {
	            v1_1.addAll(this.a.e);
	        }
	        boolean v2_1 = p6.split(",", -1);
	        String v3_0 = v2_1.length;
	        IllegalArgumentException v0_3 = 0;
	        while (v0_3 < v3_0) {
	            try {
	                v1_1.add(dfx.a(v2_1[v0_3]));
	                v0_3++;
	            } catch (IllegalArgumentException v0_11) {
	                throw new IllegalStateException(v0_11);
	            }
	        }
	        IllegalArgumentException v0_4 = this.a;
	        java.util.List v1_2 = dgs.a(v1_1);
	        if (v1_2.contains(dfx.b)) {
	            if (!v1_2.contains(dfx.a)) {
	                if (!v1_2.contains(0)) {
	                    v0_4.e = dgs.a(v1_2);
	                    return;
	                } else {
	                    throw new IllegalArgumentException("protocols must not contain null");
	                }
	            } else {
	                throw new IllegalArgumentException(new StringBuilder("protocols must not contain http/1.0: ").append(v1_2).toString());
	            }
	        } else {
	            throw new IllegalArgumentException(new StringBuilder("protocols doesn\'t contain http/1.1: ").append(v1_2).toString());
	        }
	    }
	
	
	    private boolean a(boolean p19)
	    {
	        try {
	            dhg v14 = this.b;
	        } catch (String v2_266) {
	            String v2_267 = v2_266.a();
	            this.i = v2_267;
	            throw v2_267;
	        } catch (String v2_249) {
	            java.util.List v12_4 = v2_249;
	            dfb v11_5 = this.b;
	            if (v11_5.e != null) {
	                if (v11_5.c != null) {
	                    v11_5.a(v11_5.e, v12_4.b);
	                }
	            }
	            if (v11_5.e != null) {
	                if (v11_5.e != null) {
	                    if (!v11_5.e.a()) {
	                        String v2_264 = 0;
	                        if (v2_264 == null) {
	                            String v2_265 = v12_4.b;
	                            this.i = v2_265;
	                            throw v2_265;
	                        } else {
	                            this.b = v2_264;
	                            String v2_230 = 0;
	                            return v2_230;
	                        }
	                    }
	                }
	                if (v11_5.b.u) {
	                    String v2_260 = v12_4.b;
	                    if (!(v2_260 instanceof java.net.ProtocolException)) {
	                        if (!(v2_260 instanceof java.io.InterruptedIOException)) {
	                            if ((v2_260 instanceof javax.net.ssl.SSLHandshakeException)) {
	                                if ((v2_260.getCause() instanceof java.security.cert.CertificateException)) {
	                                    String v2_262 = 0;
	                                    if (v2_262 != null) {
	                                        v2_264 = new dhg(v11_5.b, v11_5.l, v11_5.k, v11_5.r, v11_5.s, v11_5.i(), v11_5.e, ((dhp) v11_5.p), v11_5.g);
	                                    }
	                                }
	                            }
	                            if (!(v2_260 instanceof javax.net.ssl.SSLPeerUnverifiedException)) {
	                                v2_262 = 1;
	                            } else {
	                                v2_262 = 0;
	                            }
	                        } else {
	                            v2_262 = 0;
	                        }
	                    } else {
	                        v2_262 = 0;
	                    }
	                } else {
	                    v2_262 = 0;
	                }
	            } else {
	                if (v11_5.c == null) {
	                }
	            }
	        } catch (String v2_241) {
	            java.util.List v12_3 = v2_241;
	            dfb v11_3 = this.b;
	            long v10_4 = v11_3.p;
	            if (v11_3.e != null) {
	                if (v11_3.c != null) {
	                    v11_3.a(v11_3.e, v12_3);
	                }
	            }
	            if (v10_4 == 0) {
	                String v2_246 = 1;
	            } else {
	                if (!(v10_4 instanceof dhp)) {
	                    v2_246 = 0;
	                }
	            }
	            if (v11_3.e != null) {
	                if (v11_3.e != null) {
	                    if (!v11_3.e.a()) {
	                        String v2_248 = 0;
	                        if (v2_248 == null) {
	                            this.i = v12_3;
	                            throw v12_3;
	                        } else {
	                            this.b = v2_248;
	                            v2_230 = 0;
	                            return v2_230;
	                        }
	                    }
	                }
	                if (v11_3.b.u) {
	                    if (!(v12_3 instanceof java.net.ProtocolException)) {
	                        if (!(v12_3 instanceof java.io.InterruptedIOException)) {
	                            String v3_81 = 1;
	                        } else {
	                            v3_81 = 0;
	                        }
	                    } else {
	                        v3_81 = 0;
	                    }
	                } else {
	                    v3_81 = 0;
	                }
	                if (v3_81 == null) {
	                } else {
	                    if (v2_246 != null) {
	                        v2_248 = new dhg(v11_3.b, v11_3.l, v11_3.k, v11_3.r, v11_3.s, v11_3.i(), v11_3.e, ((dhp) v10_4), v11_3.g);
	                    }
	                }
	            } else {
	                if (v11_3.c == null) {
	                }
	            }
	        }
	        if (v14.u == null) {
	            if (v14.h == null) {
	                String v2_2 = v14.l;
	                String v3_0 = v2_2.c();
	                if (v2_2.a("Host") == null) {
	                    v3_0.a("Host", dhg.a(v2_2.a()));
	                }
	                if (((v14.c == null) || (v14.c.g != dfx.a)) && (v2_2.a("Connection") == null)) {
	                    v3_0.a("Connection", "Keep-Alive");
	                }
	                if (v2_2.a("Accept-Encoding") == null) {
	                    v14.j = 1;
	                    v3_0.a("Accept-Encoding", "gzip");
	                }
	                String v4_14 = v14.b.i;
	                if (v4_14 != null) {
	                    dhl.a(v3_0, v4_14.get(v2_2.b(), dhl.a(v3_0.a().c, 0)));
	                }
	                if (v2_2.a("User-Agent") == null) {
	                    v3_0.a("User-Agent", "okhttp/2.4.0");
	                }
	                dfd v8_0;
	                dfy v15 = v3_0.a();
	                String v2_6 = dgi.b.a(v14.b);
	                if (v2_6 == null) {
	                    v8_0 = 0;
	                } else {
	                    v8_0 = v2_6.l();
	                }
	                String v2_54;
	                dfa v9_1 = new dgw(System.currentTimeMillis(), v15, v8_0);
	                if (v9_1.c != null) {
	                    if ((!v9_1.b.e()) || (v9_1.c.e != null)) {
	                        if (dgv.a(v9_1.c, v9_1.b)) {
	                            long v10_0 = v9_1.b.d();
	                            if ((!v10_0.a) && (!dgw.a(v9_1.b))) {
	                                String v2_22;
	                                if (v9_1.d == null) {
	                                    v2_22 = 0;
	                                } else {
	                                    v2_22 = Math.max(0, (v9_1.j - v9_1.d.getTime()));
	                                }
	                                if (v9_1.l != -1) {
	                                    v2_22 = Math.max(v2_22, java.util.concurrent.TimeUnit.SECONDS.toMillis(((long) v9_1.l)));
	                                }
	                                String v2_33;
	                                java.util.List v12_1 = ((v2_22 + (v9_1.j - v9_1.i)) + (v9_1.a - v9_1.j));
	                                String v2_26 = v9_1.c.c();
	                                if (v2_26.c == -1) {
	                                    if (v9_1.h == null) {
	                                        if ((v9_1.f == null) || (v9_1.c.a.a().getQuery() != null)) {
	                                            v2_33 = 0;
	                                        } else {
	                                            String v2_35;
	                                            if (v9_1.d == null) {
	                                                v2_35 = v9_1.i;
	                                            } else {
	                                                v2_35 = v9_1.d.getTime();
	                                            }
	                                            String v2_37 = (v2_35 - v9_1.f.getTime());
	                                            if (v2_37 <= 0) {
	                                                v2_33 = 0;
	                                            } else {
	                                                v2_33 = (v2_37 / 10);
	                                            }
	                                        }
	                                    } else {
	                                        String v2_39;
	                                        if (v9_1.d == null) {
	                                            v2_39 = v9_1.j;
	                                        } else {
	                                            v2_39 = v9_1.d.getTime();
	                                        }
	                                        v2_33 = (v9_1.h.getTime() - v2_39);
	                                        if (v2_33 <= 0) {
	                                            v2_33 = 0;
	                                        }
	                                    }
	                                } else {
	                                    v2_33 = java.util.concurrent.TimeUnit.SECONDS.toMillis(((long) v2_26.c));
	                                }
	                                long v6_8;
	                                if (v10_0.c == -1) {
	                                    v6_8 = v2_33;
	                                } else {
	                                    v6_8 = Math.min(v2_33, java.util.concurrent.TimeUnit.SECONDS.toMillis(((long) v10_0.c)));
	                                }
	                                String v4_40;
	                                if (v10_0.h == -1) {
	                                    v4_40 = 0;
	                                } else {
	                                    v4_40 = java.util.concurrent.TimeUnit.SECONDS.toMillis(((long) v10_0.h));
	                                }
	                                String v2_46 = 0;
	                                dfb v11_1 = v9_1.c.c();
	                                if ((!v11_1.f) && (v10_0.g != -1)) {
	                                    v2_46 = java.util.concurrent.TimeUnit.SECONDS.toMillis(((long) v10_0.g));
	                                }
	                                if ((v11_1.a) || ((v12_1 + v4_40) >= (v2_46 + v6_8))) {
	                                    String v2_51 = v9_1.b.c();
	                                    if (v9_1.k == null) {
	                                        if (v9_1.f == null) {
	                                            if (v9_1.d != null) {
	                                                v2_51.a("If-Modified-Since", v9_1.e);
	                                            }
	                                        } else {
	                                            v2_51.a("If-Modified-Since", v9_1.g);
	                                        }
	                                    } else {
	                                        v2_51.a("If-None-Match", v9_1.k);
	                                    }
	                                    String v3_13 = v2_51.a();
	                                    if (!dgw.a(v3_13)) {
	                                        v2_54 = new dgv(v3_13, 0);
	                                    } else {
	                                        v2_54 = new dgv(v3_13, v9_1.c);
	                                    }
	                                } else {
	                                    String v3_14 = v9_1.c.a();
	                                    if ((v4_40 + v12_1) >= v6_8) {
	                                        v3_14.b("Warning", "110 HttpURLConnection \"Response is stale\"");
	                                    }
	                                    if (v12_1 > 86400000) {
	                                        if ((v9_1.c.c().c != -1) || (v9_1.h != null)) {
	                                            String v2_64 = 0;
	                                        } else {
	                                            v2_64 = 1;
	                                        }
	                                        if (v2_64 != null) {
	                                            v3_14.b("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
	                                        }
	                                    }
	                                    v2_54 = new dgv(0, v3_14.a());
	                                }
	                            } else {
	                                v2_54 = new dgv(v9_1.b, 0);
	                            }
	                        } else {
	                            v2_54 = new dgv(v9_1.b, 0);
	                        }
	                    } else {
	                        v2_54 = new dgv(v9_1.b, 0);
	                    }
	                } else {
	                    v2_54 = new dgv(v9_1.b, 0);
	                }
	                if ((v2_54.a != null) && (v9_1.b.d().i)) {
	                    v2_54 = new dgv(0, 0);
	                }
	                v14.u = v2_54;
	                v14.m = v14.u.a;
	                v14.n = v14.u.b;
	                if ((v8_0 != null) && (v14.n == null)) {
	                    dgs.a(v8_0.g);
	                }
	                if (v14.m == null) {
	                    if (v14.c != null) {
	                        dgi.b.a(v14.b.q, v14.c);
	                        v14.c = 0;
	                    }
	                    if (v14.n == null) {
	                        String v2_84 = new dgd();
	                        v2_84.a = v14.l;
	                        String v2_85 = v2_84.c(dhg.a(v14.g));
	                        v2_85.b = dfx.b;
	                        v2_85.c = 504;
	                        v2_85.d = "Unsatisfiable Request (only-if-cached)";
	                        v2_85.g = dhg.a;
	                        v14.o = v2_85.a();
	                    } else {
	                        String v2_88 = v14.n.a();
	                        v2_88.a = v14.l;
	                        v14.o = v2_88.c(dhg.a(v14.g)).b(dhg.a(v14.n)).a();
	                    }
	                    v14.o = v14.b(v14.o);
	                } else {
	                    if (v14.c == null) {
	                        if (v14.c == null) {
	                            if (v14.e == null) {
	                                java.net.ProxySelector v13_0 = v14.b;
	                                String v4_59 = v14.m;
	                                String v3_39 = v4_59.a().getHost();
	                                if ((v3_39 != null) && (v3_39.length() != 0)) {
	                                    long v6_10 = 0;
	                                    javax.net.ssl.HostnameVerifier v7_0 = 0;
	                                    dfd v8_1 = 0;
	                                    if (v4_59.e()) {
	                                        v6_10 = v13_0.m;
	                                        v7_0 = v13_0.n;
	                                        v8_1 = v13_0.o;
	                                    }
	                                    v14.d = new dez(v3_39, dgs.a(v4_59.a()), v13_0.l, v6_10, v7_0, v8_1, v13_0.p, v13_0.d, v13_0.e, v13_0.f, v13_0.h);
	                                    v14.e = new dhr(v14.d, v14.m.b(), v14.b);
	                                } else {
	                                    throw new dho(new java.net.UnknownHostException(v4_59.a().toString()));
	                                }
	                            }
	                            String v2_104 = v14.a();
	                            dgi.b.a(v14.b, v2_104, v14, v14.m);
	                            v14.c = v2_104;
	                            v14.f = v14.c.b;
	                        } else {
	                            throw new IllegalStateException();
	                        }
	                    }
	                    v14.h = dgi.b.a(v14.c, v14);
	                    if ((v14.r) && ((v14.c()) && (v14.p == null))) {
	                        String v2_112 = dhl.a(v15);
	                        if (!v14.k) {
	                            v14.h.a(v14.m);
	                            v14.p = v14.h.a(v14.m, v2_112);
	                        } else {
	                            if (v2_112 <= 2147483647) {
	                                if (v2_112 == -1) {
	                                    v14.p = new dhp();
	                                } else {
	                                    v14.h.a(v14.m);
	                                    v14.p = new dhp(((int) v2_112));
	                                }
	                            } else {
	                                throw new IllegalStateException("Use setFixedLengthStreamingMode() or setChunkedStreamingMode() for requests larger than 2 GiB.");
	                            }
	                        }
	                    }
	                }
	            } else {
	                throw new IllegalStateException();
	            }
	        }
	        String v2_121;
	        this.k = this.b.f;
	        if (this.b.c == null) {
	            v2_121 = 0;
	        } else {
	            v2_121 = this.b.c.i;
	        }
	        this.c = v2_121;
	        if (p19) {
	            String v4_74 = this.b;
	            if (v4_74.o == null) {
	                if ((v4_74.m != null) || (v4_74.n != null)) {
	                    if (v4_74.m != null) {
	                        String v3_55;
	                        if (!v4_74.s) {
	                            if (v4_74.r) {
	                                if ((v4_74.q != null) && (v4_74.q.b().b > 0)) {
	                                    v4_74.q.d();
	                                }
	                                if (v4_74.i == -1) {
	                                    if ((dhl.a(v4_74.m) == -1) && ((v4_74.p instanceof dhp))) {
	                                        v4_74.m = v4_74.m.c().a("Content-Length", Long.toString(((dhp) v4_74.p).a.b)).a();
	                                    }
	                                    v4_74.h.a(v4_74.m);
	                                }
	                                if (v4_74.p == null) {
	                                    v3_55 = v4_74.j();
	                                } else {
	                                    if (v4_74.q == null) {
	                                        v4_74.p.close();
	                                    } else {
	                                        v4_74.q.close();
	                                    }
	                                    if (!(v4_74.p instanceof dhp)) {
	                                    } else {
	                                        v4_74.h.a(((dhp) v4_74.p));
	                                    }
	                                }
	                            } else {
	                                String v3_49 = new dhj(v4_74, 0, v4_74.m);
	                                int v5_23 = v4_74.m;
	                                v3_49.b = (v3_49.b + 1);
	                                if (v3_49.a > 0) {
	                                    String v2_167 = ((s) v3_49.c.b.g.get((v3_49.a - 1)));
	                                    long v6_20 = v3_49.c.c.b.a;
	                                    if ((v5_23.a().getHost().equals(v6_20.b)) && (dgs.a(v5_23.a()) == v6_20.c)) {
	                                        if (v3_49.b > 1) {
	                                            throw new IllegalStateException(new StringBuilder("network interceptor ").append(v2_167).append(" must call proceed() exactly once").toString());
	                                        }
	                                    } else {
	                                        throw new IllegalStateException(new StringBuilder("network interceptor ").append(v2_167).append(" must retain the same host and port").toString());
	                                    }
	                                }
	                                String v2_180;
	                                if (v3_49.a >= v3_49.c.b.g.size()) {
	                                    dhg.a(v3_49.c).a(v5_23);
	                                    v3_49.c.m = v5_23;
	                                    if ((v3_49.c.c()) && (v5_23.d != null)) {
	                                        String v2_178 = dkk.a(dhg.a(v3_49.c).a(v5_23, v5_23.d.a()));
	                                        v5_23.d.a(v2_178);
	                                        v2_178.close();
	                                    }
	                                    v2_180 = v3_49.c.j();
	                                    String v3_50 = v2_180.c;
	                                    if (((v3_50 == 204) || (v3_50 == 205)) && (v2_180.g.a() > 0)) {
	                                        throw new java.net.ProtocolException(new StringBuilder("HTTP ").append(v3_50).append(" had non-zero Content-Length: ").append(v2_180.g.a()).toString());
	                                    }
	                                } else {
	                                    long v6_33 = new dhj(v3_49.c, (v3_49.a + 1), v5_23);
	                                    String v2_189 = ((s) v3_49.c.b.g.get(v3_49.a));
	                                    String v3_54 = v2_189.k();
	                                    if (v6_33.b == 1) {
	                                        v2_180 = v3_54;
	                                    } else {
	                                        throw new IllegalStateException(new StringBuilder("network interceptor ").append(v2_189).append(" must call proceed() exactly once").toString());
	                                    }
	                                }
	                                v3_55 = v2_180;
	                            }
	                        } else {
	                            v4_74.h.a(v4_74.m);
	                        }
	                        String v2_217;
	                        String v3_66;
	                        v4_74.a(v3_55.f);
	                        if (v4_74.n == null) {
	                            String v2_210 = v3_55.a();
	                            v2_210.a = v4_74.l;
	                            v4_74.o = v2_210.c(dhg.a(v4_74.g)).b(dhg.a(v4_74.n)).a(dhg.a(v3_55)).a();
	                            if (!dhg.c(v4_74.o)) {
	                                v2_230 = 1;
	                                return v2_230;
	                            } else {
	                                v4_74.g();
	                                String v3_64 = v4_74.t;
	                                v2_217 = v4_74.o;
	                                if (v3_64 != null) {
	                                    int v5_45 = v3_64.n();
	                                    if (v5_45 != 0) {
	                                        javax.net.ssl.HostnameVerifier v7_10 = new dhi(v4_74, v2_217.g.c(), v3_64, dkk.a(v5_45));
	                                        String v3_65 = v2_217.a();
	                                        v3_65.g = new dhn(v2_217.f, dkk.a(v7_10));
	                                        v2_217 = v3_65.a();
	                                        v3_66 = v4_74;
	                                    } else {
	                                        v3_66 = v4_74;
	                                    }
	                                } else {
	                                    v3_66 = v4_74;
	                                }
	                            }
	                        } else {
	                            String v2_207;
	                            if (v3_55.c != 304) {
	                                String v2_205 = v4_74.n.f.b("Last-Modified");
	                                if (v2_205 != null) {
	                                    int v5_39 = v3_55.f.b("Last-Modified");
	                                    if ((v5_39 != 0) && (v5_39.getTime() < v2_205.getTime())) {
	                                        v2_207 = 1;
	                                        if (v2_207 == null) {
	                                            dgs.a(v4_74.n.g);
	                                        } else {
	                                            String v2_220 = v4_74.n.a();
	                                            v2_220.a = v4_74.l;
	                                            v4_74.o = v2_220.c(dhg.a(v4_74.g)).a(dhg.a(v4_74.n.f, v3_55.f)).b(dhg.a(v4_74.n)).a(dhg.a(v3_55)).a();
	                                            v3_55.g.close();
	                                            v4_74.h();
	                                            dgi.b.a(v4_74.b);
	                                            dhg.a(v4_74.o);
	                                            v2_217 = v4_74.o;
	                                            v3_66 = v4_74;
	                                        }
	                                        v4_74.o = v3_66.b(v2_217);
	                                    }
	                                }
	                                v2_207 = 0;
	                            } else {
	                                v2_207 = 1;
	                            }
	                        }
	                    }
	                } else {
	                    throw new IllegalStateException("call sendRequest() first!");
	                }
	            }
	        }
	    }
	
	
	    private void b()
	    {
	        if (this.i == null) {
	            if (this.b == null) {
	                this.connected = 1;
	                try {
	                    if (this.doOutput) {
	                        if (!this.method.equals("GET")) {
	                            if (!a.q(this.method)) {
	                                throw new java.net.ProtocolException(new StringBuilder().append(this.method).append(" does not support writing").toString());
	                            }
	                        } else {
	                            this.method = "POST";
	                        }
	                    }
	                } catch (java.net.ProtocolException v0_11) {
	                    this.i = v0_11;
	                    throw v0_11;
	                }
	                this.b = this.a(this.method, 0, 0, 0);
	            }
	            return;
	        } else {
	            throw this.i;
	        }
	    }
	
	
	    private dhg c()
	    {
	        dfy v0_49;
	        this.b();
	        if (!this.b.e()) {
	            while(true) {
	                if (!this.a(1)) {
	                } else {
	                    dgc v3 = this.b.f();
	                    dfy v2_0 = this.b;
	                    if (v2_0.o != null) {
	                        dfy v0_8;
	                        if (v2_0.f == null) {
	                            v0_8 = v2_0.b.d;
	                        } else {
	                            v0_8 = v2_0.f.b;
	                        }
	                        dfy v2_2;
	                        switch (v2_0.o.c) {
	                            case 300:
	                            case 301:
	                            case 302:
	                            case 303:
	                                if (!v2_0.b.t) {
	                                    v2_2 = 0;
	                                } else {
	                                    dfy v0_22 = v2_0.o.a("Location");
	                                    if (v0_22 == null) {
	                                    } else {
	                                        dfh v4_9 = new java.net.URL(v2_0.l.a(), v0_22);
	                                        if (((!v4_9.getProtocol().equals("https")) && (!v4_9.getProtocol().equals("http"))) || ((!v4_9.getProtocol().equals(v2_0.l.a().getProtocol())) && (!v2_0.b.s))) {
	                                        } else {
	                                            dfy v0_32 = v2_0.l.c();
	                                            if (a.q(v2_0.l.b)) {
	                                                v0_32.a("GET", 0);
	                                                v0_32.a("Transfer-Encoding");
	                                                v0_32.a("Content-Length");
	                                                v0_32.a("Content-Type");
	                                            }
	                                            if (!v2_0.b(v4_9)) {
	                                                v0_32.a("Authorization");
	                                            }
	                                            v2_2 = v0_32.a(v4_9).a();
	                                        }
	                                    }
	                                }
	                                break;
	                            case 307:
	                            case 308:
	                                if ((!v2_0.l.b.equals("GET")) && (!v2_0.l.b.equals("HEAD"))) {
	                                }
	                                break;
	                            case 401:
	                                v2_2 = dhl.a(v2_0.b.p, v2_0.o, v0_8);
	                                break;
	                            case 407:
	                                if (v0_8.type() != java.net.Proxy$Type.HTTP) {
	                                    break;
	                                }
	                                break;
	                            default:
	                        }
	                        if (v2_2 != null) {
	                            dfy v0_36 = (this.h + 1);
	                            this.h = v0_36;
	                            if (v0_36 <= 20) {
	                                this.url = v2_2.a();
	                                this.f = v2_2.c.a();
	                                dfy v0_41 = this.b.d();
	                                if (!v2_2.b.equals(this.method)) {
	                                    v0_41 = 0;
	                                }
	                                if ((v0_41 == null) || ((v0_41 instanceof dhp))) {
	                                    if (!this.b.b(v2_2.a())) {
	                                        this.b.h();
	                                    }
	                                    this.b = this.a(v2_2.b, this.b.i(), ((dhp) v0_41), v3);
	                                } else {
	                                    throw new java.net.HttpRetryException("Cannot retry streamed HTTP body", this.responseCode);
	                                }
	                            } else {
	                                throw new java.net.ProtocolException(new StringBuilder("Too many follow-up requests: ").append(this.h).toString());
	                            }
	                        } else {
	                            this.b.h();
	                            v0_49 = this.b;
	                        }
	                    } else {
	                        throw new IllegalStateException();
	                    }
	                }
	            }
	            throw new java.net.ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
	        } else {
	            v0_49 = this.b;
	        }
	        return v0_49;
	    }
	
	
	    public final void addRequestProperty(String p3, String p4)
	    {
	        if (!this.connected) {
	            if (p3 != null) {
	                if (p4 != null) {
	                    if ((!"X-Android-Transports".equals(p3)) && (!"X-Android-Protocols".equals(p3))) {
	                        this.f.a(p3, p4);
	                    } else {
	                        this.a(p4, 1);
	                    }
	                } else {
	                    dgn.a();
	                    dgn.a(new StringBuilder("Ignoring header ").append(p3).append(" because its value was null.").toString());
	                }
	                return;
	            } else {
	                throw new NullPointerException("field == null");
	            }
	        } else {
	            throw new IllegalStateException("Cannot add request property after connection is made");
	        }
	    }
	
	
	    public final void connect()
	    {
	        this.b();
	        while (!this.a(0)) {
	        }
	        return;
	    }
	
	
	    public final void disconnect()
	    {
	        if (this.b != null) {
	            java.io.IOException v0_1 = this.b;
	            if (v0_1.h != null) {
	                try {
	                    v0_1.h.a(v0_1);
	                } catch (java.io.IOException v0) {
	                }
	            }
	        }
	        return;
	    }
	
	
	    public final int getConnectTimeout()
	    {
	        return this.a.v;
	    }
	
	
	    public final java.io.InputStream getErrorStream()
	    {
	        java.io.InputStream v0 = 0;
	        try {
	            dge v1_0 = this.c();
	        } catch (dge v1) {
	            return v0;
	        }
	        if ((!dhg.c(v1_0.f())) || (v1_0.f().c < 400)) {
	            return v0;
	        } else {
	            v0 = v1_0.f().g.b();
	            return v0;
	        }
	    }
	
	
	    public final String getHeaderField(int p2)
	    {
	        try {
	            int v0_1 = this.a().b(p2);
	        } catch (int v0) {
	            v0_1 = 0;
	        }
	        return v0_1;
	    }
	
	
	    public final String getHeaderField(String p2)
	    {
	        try {
	            int v0_1;
	            if (p2 != null) {
	                v0_1 = this.a().a(p2);
	            } else {
	                v0_1 = dhv.a(this.c().f()).toString();
	            }
	        } catch (int v0) {
	            v0_1 = 0;
	        }
	        return v0_1;
	    }
	
	
	    public final String getHeaderFieldKey(int p2)
	    {
	        try {
	            int v0_1 = this.a().a(p2);
	        } catch (int v0) {
	            v0_1 = 0;
	        }
	        return v0_1;
	    }
	
	
	    public final java.util.Map getHeaderFields()
	    {
	        try {
	            java.util.Map v0_1 = dhl.a(this.a(), dhv.a(this.c().f()).toString());
	        } catch (java.util.Map v0) {
	            v0_1 = java.util.Collections.emptyMap();
	        }
	        return v0_1;
	    }
	
	
	    public final java.io.InputStream getInputStream()
	    {
	        if (this.doInput) {
	            java.io.InputStream v0_1 = this.c();
	            if (this.getResponseCode() < 400) {
	                return v0_1.f().g.b();
	            } else {
	                throw new java.io.FileNotFoundException(this.url.toString());
	            }
	        } else {
	            throw new java.net.ProtocolException("This protocol does not support input");
	        }
	    }
	
	
	    public final java.io.OutputStream getOutputStream()
	    {
	        this.connect();
	        String v1_0 = this.b;
	        java.io.OutputStream v0_0 = v1_0.q;
	        if (v0_0 == null) {
	            java.io.OutputStream v0_1 = v1_0.d();
	            if (v0_1 == null) {
	                v0_0 = 0;
	            } else {
	                v0_0 = dkk.a(v0_1);
	                v1_0.q = v0_0;
	            }
	        }
	        if (v0_0 != null) {
	            if (!this.b.e()) {
	                return v0_0.c();
	            } else {
	                throw new java.net.ProtocolException("cannot write request body after response has been read");
	            }
	        } else {
	            throw new java.net.ProtocolException(new StringBuilder("method does not support a request body: ").append(this.method).toString());
	        }
	    }
	
	
	    public final java.security.Permission getPermission()
	    {
	        String v1_0 = this.getURL().getHost();
	        String v0_2 = dgs.a(this.getURL());
	        if (this.usingProxy()) {
	            String v0_6 = ((java.net.InetSocketAddress) this.a.d.address());
	            v1_0 = v0_6.getHostName();
	            v0_2 = v0_6.getPort();
	        }
	        return new java.net.SocketPermission(new StringBuilder().append(v1_0).append(":").append(v0_2).toString(), "connect, resolve");
	    }
	
	
	    public final int getReadTimeout()
	    {
	        return this.a.w;
	    }
	
	
	    public final java.util.Map getRequestProperties()
	    {
	        if (!this.connected) {
	            return dhl.a(this.f.a(), 0);
	        } else {
	            throw new IllegalStateException("Cannot access request header fields after connection is set");
	        }
	    }
	
	
	    public final String getRequestProperty(String p5)
	    {
	        int v0_3;
	        if (p5 != null) {
	            dfp v3 = this.f;
	            int v2 = (v3.a.size() - 2);
	            while (v2 >= 0) {
	                if (!p5.equalsIgnoreCase(((String) v3.a.get(v2)))) {
	                    v2 -= 2;
	                } else {
	                    v0_3 = ((String) v3.a.get((v2 + 1)));
	                }
	            }
	            v0_3 = 0;
	        } else {
	            v0_3 = 0;
	        }
	        return v0_3;
	    }
	
	
	    public final int getResponseCode()
	    {
	        return this.c().f().c;
	    }
	
	
	    public final String getResponseMessage()
	    {
	        return this.c().f().d;
	    }
	
	
	    public final void setConnectTimeout(int p11)
	    {
	        IllegalArgumentException v0_0 = this.a;
	        String v1_0 = java.util.concurrent.TimeUnit.MILLISECONDS;
	        if (((long) p11) >= 0) {
	            if (v1_0 != null) {
	                long v4_1 = v1_0.toMillis(((long) p11));
	                if (v4_1 <= 2147483647) {
	                    if ((v4_1 != 0) || (((long) p11) <= 0)) {
	                        v0_0.v = ((int) v4_1);
	                        return;
	                    } else {
	                        throw new IllegalArgumentException("Timeout too small.");
	                    }
	                } else {
	                    throw new IllegalArgumentException("Timeout too large.");
	                }
	            } else {
	                throw new IllegalArgumentException("unit == null");
	            }
	        } else {
	            throw new IllegalArgumentException("timeout < 0");
	        }
	    }
	
	
	    public final void setFixedLengthStreamingMode(int p3)
	    {
	        this.setFixedLengthStreamingMode(((long) p3));
	        return;
	    }
	
	
	    public final void setFixedLengthStreamingMode(long p4)
	    {
	        if (!this.connected) {
	            if (this.chunkLength <= 0) {
	                if (p4 >= 0) {
	                    this.g = p4;
	                    this.fixedContentLength = ((int) Math.min(p4, 2147483647));
	                    return;
	                } else {
	                    throw new IllegalArgumentException("contentLength < 0");
	                }
	            } else {
	                throw new IllegalStateException("Already in chunked mode");
	            }
	        } else {
	            throw new IllegalStateException("Already connected");
	        }
	    }
	
	
	    public final void setIfModifiedSince(long p8)
	    {
	        super.setIfModifiedSince(p8);
	        if (this.ifModifiedSince == 0) {
	            this.f.a("If-Modified-Since");
	        } else {
	            this.f.c("If-Modified-Since", dhe.a(new java.util.Date(this.ifModifiedSince)));
	        }
	        return;
	    }
	
	
	    public final void setInstanceFollowRedirects(boolean p2)
	    {
	        this.a.t = p2;
	        return;
	    }
	
	
	    public final void setReadTimeout(int p11)
	    {
	        IllegalArgumentException v0_0 = this.a;
	        String v1_0 = java.util.concurrent.TimeUnit.MILLISECONDS;
	        if (((long) p11) >= 0) {
	            if (v1_0 != null) {
	                long v4_1 = v1_0.toMillis(((long) p11));
	                if (v4_1 <= 2147483647) {
	                    if ((v4_1 != 0) || (((long) p11) <= 0)) {
	                        v0_0.w = ((int) v4_1);
	                        return;
	                    } else {
	                        throw new IllegalArgumentException("Timeout too small.");
	                    }
	                } else {
	                    throw new IllegalArgumentException("Timeout too large.");
	                }
	            } else {
	                throw new IllegalArgumentException("unit == null");
	            }
	        } else {
	            throw new IllegalArgumentException("timeout < 0");
	        }
	    }
	
	
	    public final void setRequestMethod(String p4)
	    {
	        if (dhy.d.contains(p4)) {
	            this.method = p4;
	            return;
	        } else {
	            throw new java.net.ProtocolException(new StringBuilder("Expected one of ").append(dhy.d).append(" but was ").append(p4).toString());
	        }
	    }
	
	
	    public final void setRequestProperty(String p3, String p4)
	    {
	        if (!this.connected) {
	            if (p3 != null) {
	                if (p4 != null) {
	                    if ((!"X-Android-Transports".equals(p3)) && (!"X-Android-Protocols".equals(p3))) {
	                        this.f.c(p3, p4);
	                    } else {
	                        this.a(p4, 0);
	                    }
	                } else {
	                    dgn.a();
	                    dgn.a(new StringBuilder("Ignoring header ").append(p3).append(" because its value was null.").toString());
	                }
	                return;
	            } else {
	                throw new NullPointerException("field == null");
	            }
	        } else {
	            throw new IllegalStateException("Cannot set request property after connection is made");
	        }
	    }
	
	
	    public final boolean usingProxy()
	    {
	        int v0_2;
	        if (this.k == null) {
	            v0_2 = this.a.d;
	        } else {
	            v0_2 = this.k.b;
	        }
	        if ((v0_2 == 0) || (v0_2.type() == java.net.Proxy$Type.DIRECT)) {
	            int v0_5 = 0;
	        } else {
	            v0_5 = 1;
	        }
	        return v0_5;
	    }
	
