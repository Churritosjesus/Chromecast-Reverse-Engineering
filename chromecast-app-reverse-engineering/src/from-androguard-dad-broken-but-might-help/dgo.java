	private final dgm a
	private final dgm b
	private final java.lang.reflect.Method c
	private final java.lang.reflect.Method d
	private final dgm e
	private final dgm f
	
	    public dgo(dgm p1, dgm p2, reflect.Method p3, reflect.Method p4, dgm p5, dgm p6)
	    {
	        this.a = p1;
	        this.b = p2;
	        this.c = p3;
	        this.d = p4;
	        this.e = p5;
	        this.f = p6;
	        return;
	    }
	
	
	    public final void a(java.net.Socket p5)
	    {
	        if (this.c != null) {
	            try {
	                Throwable v0_1 = this.c;
	                Object[] v2_1 = new Object[1];
	                v2_1[0] = p5;
	                v0_1.invoke(0, v2_1);
	            } catch (Throwable v0_2) {
	                throw new RuntimeException(v0_2.getCause());
	            } catch (Throwable v0_4) {
	                throw new RuntimeException(v0_4);
	            }
	        }
	        return;
	    }
	
	
	    public final void a(java.net.Socket p4, java.net.InetSocketAddress p5, int p6)
	    {
	        try {
	            p4.connect(p5, p6);
	            return;
	        } catch (SecurityException v0) {
	            java.io.IOException v1_1 = new java.io.IOException("Exception in connect");
	            v1_1.initCause(v0);
	            throw v1_1;
	        }
	    }
	
	
	    public final void a(javax.net.ssl.SSLSocket p8, String p9, java.util.List p10)
	    {
	        if (p9 != null) {
	            int v0_0 = this.a;
	            int v1_0 = new Object[1];
	            v1_0[0] = Boolean.valueOf(1);
	            v0_0.a(p8, v1_0);
	            int v0_1 = this.b;
	            int v1_1 = new Object[1];
	            v1_1[0] = p9;
	            v0_1.a(p8, v1_1);
	        }
	        if ((this.f != null) && (this.f.a(p8))) {
	            Object[] v3_1 = new Object[1];
	            djz v4_2 = new djz();
	            int v5 = p10.size();
	            int v1_2 = 0;
	            while (v1_2 < v5) {
	                int v0_8 = ((dfx) p10.get(v1_2));
	                if (v0_8 != dfx.a) {
	                    v4_2.b(v0_8.toString().length());
	                    v4_2.a(v0_8.toString());
	                }
	                v1_2++;
	            }
	            v3_1[0] = v4_2.p();
	            this.f.b(p8, v3_1);
	        }
	        return;
	    }
	
	
	    public final String b(javax.net.ssl.SSLSocket p4)
	    {
	        String v0_6;
	        if (this.e != null) {
	            if (this.e.a(p4)) {
	                java.nio.charset.Charset v2_1 = new Object[0];
	                String v0_5 = ((byte[]) this.e.b(p4, v2_1));
	                if (v0_5 == null) {
	                    v0_6 = 0;
	                } else {
	                    v0_6 = new String(v0_5, dgs.c);
	                }
	            } else {
	                v0_6 = 0;
	            }
	        } else {
	            v0_6 = 0;
	        }
	        return v0_6;
	    }
	
	
	    public final void b(java.net.Socket p5)
	    {
	        if (this.d != null) {
	            try {
	                Throwable v0_1 = this.d;
	                Object[] v2_1 = new Object[1];
	                v2_1[0] = p5;
	                v0_1.invoke(0, v2_1);
	            } catch (Throwable v0_2) {
	                throw new RuntimeException(v0_2.getCause());
	            } catch (Throwable v0_4) {
	                throw new RuntimeException(v0_4);
	            }
	        }
	        return;
	    }
	
