	public static final dfk a
	public static final dfk b
	public static final dfk c
	private static final Ldfg h
	final  d
	final Ljava.lang.String e
	final Ljava.lang.String f
	public final  g
	
	    static dfk()
	    {
	        dfk v0_1 = new dfg[14];
	        v0_1[0] = dfg.m;
	        v0_1[1] = dfg.n;
	        v0_1[2] = dfg.h;
	        v0_1[3] = dfg.j;
	        v0_1[4] = dfg.i;
	        v0_1[5] = dfg.k;
	        v0_1[6] = dfg.l;
	        v0_1[7] = dfg.d;
	        v0_1[8] = dfg.c;
	        v0_1[9] = dfg.f;
	        v0_1[10] = dfg.g;
	        v0_1[11] = dfg.b;
	        v0_1[12] = dfg.e;
	        v0_1[13] = dfg.a;
	        dfk.h = v0_1;
	        dgg[] v2_15 = new dfl(1);
	        dgg v3_10 = dfk.h;
	        if (v2_15.a) {
	            String[] v4 = new String[v3_10.length];
	            dfk v0_4 = 0;
	            while (v0_4 < v3_10.length) {
	                v4[v0_4] = v3_10[v0_4].o;
	                v0_4++;
	            }
	            v2_15.b = v4;
	            dfk v0_5 = new dgg[3];
	            v0_5[0] = dgg.a;
	            v0_5[1] = dgg.b;
	            v0_5[2] = dgg.c;
	            dfk.a = v2_15.a(v0_5).a(1).a();
	            dfk v0_10 = new dfl(dfk.a);
	            dgg[] v2_17 = new dgg[1];
	            v2_17[0] = dgg.c;
	            dfk.b = v0_10.a(v2_17).a(1).a();
	            dfk.c = new dfl(0).a();
	            return;
	        } else {
	            throw new IllegalStateException("no cipher suites for cleartext connections");
	        }
	    }
	
	
	    dfk(dfl p2)
	    {
	        this.d = p2.a;
	        this.e = p2.b;
	        this.f = p2.c;
	        this.g = p2.d;
	        return;
	    }
	
	
	    private java.util.List a()
	    {
	        dgg[] v1 = new dgg[this.f.length];
	        java.util.List v0_2 = 0;
	        while (v0_2 < this.f.length) {
	            v1[v0_2] = dgg.a(this.f[v0_2]);
	            v0_2++;
	        }
	        return dgs.a(v1);
	    }
	
	
	    private static boolean a(String[] p8, String[] p9)
	    {
	        int v0 = 1;
	        if ((p8 != null) && ((p9 != null) && ((p8.length != 0) && (p9.length != 0)))) {
	            int v3 = 0;
	            while (v3 < p8.length) {
	                int v2_2 = 0;
	                while (v2_2 < p9.length) {
	                    if (!dgs.a(p8[v3], p9[v2_2])) {
	                        v2_2++;
	                    } else {
	                        int v2_3 = 1;
	                    }
	                    if (v2_3 == 0) {
	                        v3++;
	                    }
	                }
	                v2_3 = 0;
	            }
	            v0 = 0;
	        } else {
	            v0 = 0;
	        }
	        return v0;
	    }
	
	
	    static synthetic String[] a(dfk p1)
	    {
	        return p1.e;
	    }
	
	
	    static synthetic String[] b(dfk p1)
	    {
	        return p1.f;
	    }
	
	
	    public final boolean a(javax.net.ssl.SSLSocket p4)
	    {
	        int v0_0 = 0;
	        if ((this.d) && (dfk.a(this.f, p4.getEnabledProtocols()))) {
	            if (this.e != null) {
	                v0_0 = dfk.a(this.e, p4.getEnabledCipherSuites());
	            } else {
	                if (p4.getEnabledCipherSuites().length > 0) {
	                    v0_0 = 1;
	                }
	            }
	        }
	        return v0_0;
	    }
	
	
	    public final boolean equals(Object p5)
	    {
	        int v0 = 0;
	        if ((p5 instanceof dfk)) {
	            if (p5 != this) {
	                if ((this.d == ((dfk) p5).d) && ((!this.d) || ((java.util.Arrays.equals(this.e, ((dfk) p5).e)) && ((java.util.Arrays.equals(this.f, ((dfk) p5).f)) && (this.g == ((dfk) p5).g))))) {
	                    v0 = 1;
	                }
	            } else {
	                v0 = 1;
	            }
	        }
	        return v0;
	    }
	
	
	    public final int hashCode()
	    {
	        int v0_0 = 17;
	        if (this.d) {
	            int v0_7;
	            int v1_3 = ((((java.util.Arrays.hashCode(this.e) + 527) * 31) + java.util.Arrays.hashCode(this.f)) * 31);
	            if (!this.g) {
	                v0_7 = 1;
	            } else {
	                v0_7 = 0;
	            }
	            v0_0 = (v0_7 + v1_3);
	        }
	        return v0_0;
	    }
	
	
	    public final String toString()
	    {
	        String v0_1;
	        if (!this.d) {
	            v0_1 = "ConnectionSpec()";
	        } else {
	            String v0_6;
	            if (this.e != null) {
	                String v1_0 = new dfg[this.e.length];
	                String v0_5 = 0;
	                while (v0_5 < this.e.length) {
	                    v1_0[v0_5] = dfg.a(this.e[v0_5]);
	                    v0_5++;
	                }
	                v0_6 = dgs.a(v1_0);
	            } else {
	                v0_6 = 0;
	            }
	            String v0_7;
	            if (v0_6 != null) {
	                v0_7 = v0_6.toString();
	            } else {
	                v0_7 = "[use default]";
	            }
	            v0_1 = new StringBuilder("ConnectionSpec(cipherSuites=").append(v0_7).append(", tlsVersions=").append(this.a()).append(", supportsTlsExtensions=").append(this.g).append(")").toString();
	        }
	        return v0_1;
	    }
	
