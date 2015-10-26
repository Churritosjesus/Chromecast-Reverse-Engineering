	private final java.lang.reflect.Method a
	private final java.lang.reflect.Method b
	private final java.lang.reflect.Method c
	private final java.lang.Class d
	private final java.lang.Class e
	
	    public dgp(reflect.Method p1, reflect.Method p2, reflect.Method p3, Class p4, Class p5)
	    {
	        this.a = p1;
	        this.b = p2;
	        this.c = p3;
	        this.d = p4;
	        this.e = p5;
	        return;
	    }
	
	
	    public final void a(javax.net.ssl.SSLSocket p5)
	    {
	        try {
	            AssertionError v0_0 = this.c;
	            Object[] v2_1 = new Object[1];
	            v2_1[0] = p5;
	            v0_0.invoke(0, v2_1);
	            return;
	        } catch (AssertionError v0) {
	            throw new AssertionError();
	        } catch (AssertionError v0) {
	        }
	    }
	
	
	    public final void a(javax.net.ssl.SSLSocket p6, String p7, java.util.List p8)
	    {
	        int v2_1 = new java.util.ArrayList(p8.size());
	        Object[] v3_0 = p8.size();
	        AssertionError v1_1 = 0;
	        while (v1_1 < v3_0) {
	            IllegalAccessException v0_6 = ((dfx) p8.get(v1_1));
	            if (v0_6 != dfx.a) {
	                v2_1.add(v0_6.toString());
	            }
	            v1_1++;
	        }
	        try {
	            IllegalAccessException v0_2 = dgn.getClassLoader();
	            AssertionError v1_3 = new Class[2];
	            v1_3[0] = this.d;
	            v1_3[1] = this.e;
	            IllegalAccessException v0_3 = reflect.Proxy.newProxyInstance(v0_2, v1_3, new dgq(v2_1));
	            AssertionError v1_4 = this.a;
	            Object[] v3_6 = new Object[2];
	            v3_6[0] = p6;
	            v3_6[1] = v0_3;
	            v1_4.invoke(0, v3_6);
	            return;
	        } catch (IllegalAccessException v0_4) {
	            throw new AssertionError(v0_4);
	        } catch (IllegalAccessException v0_4) {
	        }
	    }
	
	
	    public final String b(javax.net.ssl.SSLSocket p6)
	    {
	        try {
	            String v0_4;
	            String v0_0 = this.b;
	            String v3_1 = new Object[1];
	            v3_1[0] = p6;
	            String v0_3 = ((dgq) reflect.Proxy.getInvocationHandler(v0_0.invoke(0, v3_1)));
	        } catch (String v0) {
	            throw new AssertionError();
	        } catch (String v0) {
	        }
	        if ((dgq.a(v0_3)) || (dgq.b(v0_3) != null)) {
	            if (!dgq.a(v0_3)) {
	                v0_4 = dgq.b(v0_3);
	            } else {
	                v0_4 = 0;
	            }
	        } else {
	            dgi.a.log(java.util.logging.Level.INFO, "ALPN callback dropped: SPDY and HTTP/2 are disabled. Is alpn-boot on the boot class path?");
	            v0_4 = 0;
	        }
	        return v0_4;
	    }
	
