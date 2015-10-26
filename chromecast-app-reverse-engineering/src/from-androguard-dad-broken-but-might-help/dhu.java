	private static final java.util.List a
	private static final java.util.List b
	private final dhg c
	private final djb d
	private djn e
	
	    static dhu()
	    {
	        java.util.List v0_1 = new dke[5];
	        v0_1[0] = dke.a("connection");
	        v0_1[1] = dke.a("host");
	        v0_1[2] = dke.a("keep-alive");
	        v0_1[3] = dke.a("proxy-connection");
	        v0_1[4] = dke.a("transfer-encoding");
	        dhu.a = dgs.a(v0_1);
	        java.util.List v0_4 = new dke[8];
	        v0_4[0] = dke.a("connection");
	        v0_4[1] = dke.a("host");
	        v0_4[2] = dke.a("keep-alive");
	        v0_4[3] = dke.a("proxy-connection");
	        v0_4[4] = dke.a("te");
	        v0_4[5] = dke.a("transfer-encoding");
	        v0_4[6] = dke.a("encoding");
	        v0_4[7] = dke.a("upgrade");
	        dhu.b = dgs.a(v0_4);
	        return;
	    }
	
	
	    public dhu(dhg p1, djb p2)
	    {
	        this.c = p1;
	        this.d = p2;
	        return;
	    }
	
	
	    private static boolean a(dfx p1, dke p2)
	    {
	        AssertionError v0_5;
	        if (p1 != dfx.c) {
	            if (p1 != dfx.d) {
	                throw new AssertionError(p1);
	            } else {
	                v0_5 = dhu.b.contains(p2);
	            }
	        } else {
	            v0_5 = dhu.a.contains(p2);
	        }
	        return v0_5;
	    }
	
	
	    public final dge a(dgc p4)
	    {
	        return new dhn(p4.f, dkk.a(this.e.f));
	    }
	
	
	    public final dku a(dfy p2, long p3)
	    {
	        return this.e.d();
	    }
	
	
	    public final void a()
	    {
	        this.e.d().close();
	        return;
	    }
	
	
	    public final void a(dfy p15)
	    {
	        if (this.e == null) {
	            this.c.b();
	            boolean v4 = this.c.c();
	            int v0_6 = a.a(this.c.c.g);
	            djb v5 = this.d;
	            dfx v6 = this.d.a;
	            dfo v7 = p15.c;
	            java.util.ArrayList v8_1 = new java.util.ArrayList(((v7.a.length / 2) + 10));
	            v8_1.add(new die(die.b, p15.b));
	            v8_1.add(new die(die.c, a.a(p15.a())));
	            int v1_10 = dhg.a(p15.a());
	            if (dfx.c != v6) {
	                if (dfx.d != v6) {
	                    throw new AssertionError();
	                } else {
	                    v8_1.add(new die(die.e, v1_10));
	                }
	            } else {
	                v8_1.add(new die(die.g, v0_6));
	                v8_1.add(new die(die.f, v1_10));
	            }
	            v8_1.add(new die(die.d, p15.a().getProtocol()));
	            java.util.LinkedHashSet v9_5 = new java.util.LinkedHashSet();
	            int v10 = (v7.a.length / 2);
	            int v3_9 = 0;
	            while (v3_9 < v10) {
	                dke v11 = dke.a(v7.a(v3_9).toLowerCase(java.util.Locale.US));
	                die v12_0 = v7.b(v3_9);
	                if ((!dhu.a(v6, v11)) && ((!v11.equals(die.b)) && ((!v11.equals(die.c)) && ((!v11.equals(die.d)) && ((!v11.equals(die.e)) && ((!v11.equals(die.f)) && (!v11.equals(die.g)))))))) {
	                    if (!v9_5.add(v11)) {
	                        int v1_17 = 0;
	                        while (v1_17 < v8_1.size()) {
	                            if (!((die) v8_1.get(v1_17)).h.equals(v11)) {
	                                v1_17++;
	                            } else {
	                                v8_1.set(v1_17, new die(v11, new StringBuilder(((die) v8_1.get(v1_17)).i.a()).append(0).append(v12_0).toString()));
	                                break;
	                            }
	                        }
	                    } else {
	                        v8_1.add(new die(v11, v12_0));
	                    }
	                }
	                v3_9++;
	            }
	            this.e = v5.a(0, v8_1, v4, 1);
	            this.e.h.a(((long) this.c.b.w), java.util.concurrent.TimeUnit.MILLISECONDS);
	        }
	        return;
	    }
	
	
	    public final void a(dhg p3)
	    {
	        if (this.e != null) {
	            this.e.a(dia.h);
	        }
	        return;
	    }
	
	
	    public final void a(dhp p2)
	    {
	        p2.a(this.e.d());
	        return;
	    }
	
	
	    public final dgd b()
	    {
	        java.util.List v6 = this.e.c();
	        dfx v7 = this.d.a;
	        String v2_0 = 0;
	        String v1_0 = "HTTP/1.1";
	        dfp v8_1 = new dfp();
	        v8_1.c(dhl.c, v7.toString());
	        int v9 = v6.size();
	        int v5 = 0;
	        while (v5 < v9) {
	            dke v10 = ((die) v6.get(v5)).h;
	            String v11 = ((die) v6.get(v5)).i.a();
	            int v0_20 = v1_0;
	            String v1_5 = 0;
	            while (v1_5 < v11.length()) {
	                int v4_2 = v11.indexOf(0, v1_5);
	                if (v4_2 == -1) {
	                    v4_2 = v11.length();
	                }
	                String v1_7 = v11.substring(v1_5, v4_2);
	                if (!v10.equals(die.a)) {
	                    if (!v10.equals(die.g)) {
	                        if (!dhu.a(v7, v10)) {
	                            v8_1.a(v10.a(), v1_7);
	                        }
	                        v1_7 = v2_0;
	                    } else {
	                        v0_20 = v1_7;
	                        v1_7 = v2_0;
	                    }
	                }
	                v2_0 = v1_7;
	                v1_5 = (v4_2 + 1);
	            }
	            v5++;
	            v1_0 = v0_20;
	        }
	        if (v2_0 != null) {
	            int v0_9 = dhv.a(new StringBuilder().append(v1_0).append(" ").append(v2_0).toString());
	            String v1_3 = new dgd();
	            v1_3.b = v7;
	            v1_3.c = v0_9.b;
	            v1_3.d = v0_9.c;
	            return v1_3.a(v8_1.a());
	        } else {
	            throw new java.net.ProtocolException("Expected \':status\' header not present");
	        }
	    }
	
	
	    public final void c()
	    {
	        return;
	    }
	
	
	    public final boolean d()
	    {
	        return 1;
	    }
	
