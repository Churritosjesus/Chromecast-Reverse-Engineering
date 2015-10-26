	private final dft a
	
	    public dfv(dft p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    public final java.net.HttpURLConnection a(java.net.URL p2)
	    {
	        return this.a(p2, this.a.d);
	    }
	
	
	    final java.net.HttpURLConnection a(java.net.URL p5, java.net.Proxy p6)
	    {
	        String v0_0 = p5.getProtocol();
	        IllegalArgumentException v1_0 = this.a;
	        StringBuilder v2_1 = new dft(v1_0);
	        if (v2_1.h == null) {
	            v2_1.h = java.net.ProxySelector.getDefault();
	        }
	        if (v2_1.i == null) {
	            v2_1.i = java.net.CookieHandler.getDefault();
	        }
	        if (v2_1.l == null) {
	            v2_1.l = javax.net.SocketFactory.getDefault();
	        }
	        if (v2_1.m == null) {
	            v2_1.m = v1_0.a();
	        }
	        if (v2_1.n == null) {
	            v2_1.n = djt.a;
	        }
	        if (v2_1.o == null) {
	            v2_1.o = dfd.a;
	        }
	        if (v2_1.p == null) {
	            v2_1.p = dgu.a;
	        }
	        if (v2_1.q == null) {
	            v2_1.q = dfi.a();
	        }
	        if (v2_1.e == null) {
	            v2_1.e = dft.a;
	        }
	        if (v2_1.f == null) {
	            v2_1.f = dft.b;
	        }
	        if (v2_1.r == null) {
	            v2_1.r = dgk.a;
	        }
	        String v0_4;
	        v2_1.d = p6;
	        if (!v0_0.equals("http")) {
	            if (!v0_0.equals("https")) {
	                throw new IllegalArgumentException(new StringBuilder("Unexpected protocol: ").append(v0_0).toString());
	            } else {
	                v0_4 = new dhz(p5, v2_1);
	            }
	        } else {
	            v0_4 = new dhy(p5, v2_1);
	        }
	        return v0_4;
	    }
	
	
	    public final synthetic Object clone()
	    {
	        return new dfv(this.a.b());
	    }
	
	
	    public final java.net.URLStreamHandler createURLStreamHandler(String p2)
	    {
	        if ((p2.equals("http")) || (p2.equals("https"))) {
	            int v0_5 = new dfw(this, p2);
	        } else {
	            v0_5 = 0;
	        }
	        return v0_5;
	    }
	
