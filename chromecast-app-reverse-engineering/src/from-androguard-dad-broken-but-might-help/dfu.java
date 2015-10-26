	
	    dfu()
	    {
	        return;
	    }
	
	
	    public final dhw a(dfh p3, dhg p4)
	    {
	        dhk v0_2;
	        if (p3.f == null) {
	            v0_2 = new dhk(p4, p3.e);
	        } else {
	            v0_2 = new dhu(p4, p3.f);
	        }
	        return v0_2;
	    }
	
	
	    public final s a(dft p2)
	    {
	        return p2.j;
	    }
	
	
	    public final void a(dfh p3, dfx p4)
	    {
	        if (p4 != null) {
	            p3.g = p4;
	            return;
	        } else {
	            throw new IllegalArgumentException("protocol == null");
	        }
	    }
	
	
	    public final void a(dfh p3, Object p4)
	    {
	        if (!p3.e()) {
	            if (p3.k == p4) {
	                p3.k = 0;
	                p3.c.close();
	            } else {
	            }
	            return;
	        } else {
	            throw new IllegalStateException();
	        }
	    }
	
	
	    public final void a(dfi p4, dfh p5)
	    {
	        if ((!p5.e()) && (p5.a())) {
	            if (p5.b()) {
	                try {
	                    dgn.a().b(p5.c);
	                    try {
	                        p4.a(p5);
	                        p5.j = (p5.j + 1);
	                    } catch (long v0_14) {
	                        throw v0_14;
	                    }
	                    if (p5.f == null) {
	                        p5.h = System.nanoTime();
	                    } else {
	                        throw new IllegalStateException("spdyConnection != null");
	                    }
	                } catch (long v0_4) {
	                    dgn.a();
	                    dgn.a(new StringBuilder("Unable to untagSocket(): ").append(v0_4).toString());
	                    dgs.a(p5.c);
	                }
	            } else {
	                dgs.a(p5.c);
	            }
	        }
	        return;
	    }
	
	
	    public final void a(dfk p5, javax.net.ssl.SSLSocket p6, boolean p7)
	    {
	        String[] v0_0 = 0;
	        if (p5.e != null) {
	            v0_0 = ((String[]) dgs.a(String, p5.e, p6.getEnabledCipherSuites()));
	        }
	        if ((!p7) || (!java.util.Arrays.asList(p6.getSupportedCipherSuites()).contains("TLS_FALLBACK_SCSV"))) {
	            String[] v1_5 = v0_0;
	        } else {
	            if (v0_0 == null) {
	                v0_0 = p6.getEnabledCipherSuites();
	            }
	            v1_5 = new String[(v0_0.length + 1)];
	            System.arraycopy(v0_0, 0, v1_5, 0, v0_0.length);
	            v1_5[(v1_5.length - 1)] = "TLS_FALLBACK_SCSV";
	        }
	        String[] v0_9 = new dfl(p5).a(v1_5).b(((String[]) dgs.a(String, p5.f, p6.getEnabledProtocols()))).a();
	        p6.setEnabledProtocols(v0_9.f);
	        String[] v0_10 = v0_9.e;
	        if (v0_10 != null) {
	            p6.setEnabledCipherSuites(v0_10);
	        }
	        return;
	    }
	
	
	    public final void a(dfp p4, String p5)
	    {
	        String v0_1 = p5.indexOf(":", 1);
	        if (v0_1 == -1) {
	            if (!p5.startsWith(":")) {
	                p4.b("", p5);
	            } else {
	                p4.b("", p5.substring(1));
	            }
	        } else {
	            p4.b(p5.substring(0, v0_1), p5.substring((v0_1 + 1)));
	        }
	        return;
	    }
	
	
	    public final void a(dft p11, dfh p12, dhg p13, dfy p14)
	    {
	        p12.a(p13);
	        if (!p12.d) {
	            java.util.List v6 = p12.b.a.j;
	            dgf v1_0 = p11.v;
	            int v2_0 = p11.w;
	            java.net.Socket v3_0 = p11.x;
	            boolean v7 = p11.u;
	            if (!p12.d) {
	                Throwable v0_9;
	                Throwable v0_5 = new dhs(p12, p12.a);
	                if (p12.b.a.e == null) {
	                    if (v6.contains(dfk.c)) {
	                        java.net.Socket v3_1 = p12.b;
	                        v0_9 = new dht(v3_1, dhs.a(v2_0, v1_0, v3_1));
	                    } else {
	                        throw new dhq(new java.net.UnknownServiceException(new StringBuilder("CLEARTEXT communication not supported: ").append(v6).toString()));
	                    }
	                } else {
	                    v0_9 = v0_5.a(v1_0, v2_0, v3_0, p14, p12.b, v6, v7);
	                }
	                Throwable v0_12;
	                p12.c = v0_9.a;
	                p12.i = v0_9.c;
	                if (v0_9.b != null) {
	                    v0_12 = v0_9.b;
	                } else {
	                    v0_12 = dfx.b;
	                }
	                p12.g = v0_12;
	                try {
	                    if ((p12.g != dfx.c) && (p12.g != dfx.d)) {
	                        p12.e = new dgx(p12.a, p12, p12.c);
	                    } else {
	                        p12.c.setSoTimeout(0);
	                        Throwable v0_19 = new djj(p12.b.a.b, 1, p12.c);
	                        v0_19.d = p12.g;
	                        p12.f = new djb(v0_19);
	                        Throwable v0_20 = p12.f;
	                        v0_20.i.a();
	                        v0_20.i.b(v0_20.e);
	                        dgf v1_20 = v0_20.e.c(65536);
	                        if (v1_20 != 65536) {
	                            v0_20.i.a(0, ((long) (v1_20 - 65536)));
	                        }
	                    }
	                } catch (Throwable v0_22) {
	                    throw new dhq(v0_22);
	                }
	                p12.d = 1;
	                if (p12.e()) {
	                    if (p12.e()) {
	                        if (p12.b()) {
	                            p11.q.a(p12);
	                        }
	                    } else {
	                        throw new IllegalArgumentException();
	                    }
	                }
	                p11.c.b(p12.b);
	            } else {
	                throw new IllegalStateException("already connected");
	            }
	        }
	        Throwable v0_28 = p11.w;
	        dgf v1_26 = p11.x;
	        if (p12.d) {
	            if (p12.e != null) {
	                try {
	                    p12.c.setSoTimeout(v0_28);
	                    p12.e.a(v0_28, v1_26);
	                } catch (Throwable v0_29) {
	                    throw new dhq(v0_29);
	                }
	            }
	            return;
	        } else {
	            throw new IllegalStateException("setTimeouts - not connected");
	        }
	    }
	
	
	    public final boolean a(dfh p2)
	    {
	        return p2.a();
	    }
	
	
	    public final int b(dfh p2)
	    {
	        return p2.j;
	    }
	
	
	    public final dgr b(dft p2)
	    {
	        return p2.c;
	    }
	
	
	    public final void b(dfh p1, dhg p2)
	    {
	        p1.a(p2);
	        return;
	    }
	
	
	    public final dgk c(dft p2)
	    {
	        return dft.a(p2);
	    }
	
	
	    public final boolean c(dfh p2)
	    {
	        int v0_1;
	        if (p2.e == null) {
	            v0_1 = 1;
	        } else {
	            v0_1 = p2.e.b();
	        }
	        return v0_1;
	    }
	
