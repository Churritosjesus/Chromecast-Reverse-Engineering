	public final java.net.Proxy a
	public final java.lang.String b
	public final  c
	public final javax.net.SocketFactory d
	public final javax.net.ssl.SSLSocketFactory e
	public final javax.net.ssl.HostnameVerifier f
	public final dfd g
	public final dfa h
	public final java.util.List i
	final java.util.List j
	public final java.net.ProxySelector k
	
	    public dez(String p4, int p5, javax.net.SocketFactory p6, javax.net.ssl.SSLSocketFactory p7, javax.net.ssl.HostnameVerifier p8, dfd p9, dfa p10, java.net.Proxy p11, java.util.List p12, java.util.List p13, java.net.ProxySelector p14)
	    {
	        if (p4 != null) {
	            if (p5 > 0) {
	                if (p10 != null) {
	                    if (p12 != null) {
	                        if (p14 != null) {
	                            this.a = p11;
	                            this.b = p4;
	                            this.c = p5;
	                            this.d = p6;
	                            this.e = p7;
	                            this.f = p8;
	                            this.g = p9;
	                            this.h = p10;
	                            this.i = dgs.a(p12);
	                            this.j = dgs.a(p13);
	                            this.k = p14;
	                            return;
	                        } else {
	                            throw new IllegalArgumentException("proxySelector == null");
	                        }
	                    } else {
	                        throw new IllegalArgumentException("protocols == null");
	                    }
	                } else {
	                    throw new IllegalArgumentException("authenticator == null");
	                }
	            } else {
	                throw new IllegalArgumentException(new StringBuilder("uriPort <= 0: ").append(p5).toString());
	            }
	        } else {
	            throw new NullPointerException("uriHost == null");
	        }
	    }
	
	
	    public final boolean equals(Object p4)
	    {
	        int v0 = 0;
	        if (((p4 instanceof dez)) && ((dgs.a(this.a, ((dez) p4).a)) && ((this.b.equals(((dez) p4).b)) && ((this.c == ((dez) p4).c) && ((dgs.a(this.e, ((dez) p4).e)) && ((dgs.a(this.f, ((dez) p4).f)) && ((dgs.a(this.g, ((dez) p4).g)) && ((dgs.a(this.h, ((dez) p4).h)) && ((dgs.a(this.i, ((dez) p4).i)) && ((dgs.a(this.j, ((dez) p4).j)) && (dgs.a(this.k, ((dez) p4).k)))))))))))) {
	            v0 = 1;
	        }
	        return v0;
	    }
	
	
	    public final int hashCode()
	    {
	        int v0_1;
	        int v1_0 = 0;
	        if (this.a == null) {
	            v0_1 = 0;
	        } else {
	            v0_1 = this.a.hashCode();
	        }
	        int v0_9;
	        dfd v2_3 = ((((((v0_1 + 527) * 31) + this.b.hashCode()) * 31) + this.c) * 31);
	        if (this.e == null) {
	            v0_9 = 0;
	        } else {
	            v0_9 = this.e.hashCode();
	        }
	        int v0_13;
	        dfd v2_4 = ((v0_9 + v2_3) * 31);
	        if (this.f == null) {
	            v0_13 = 0;
	        } else {
	            v0_13 = this.f.hashCode();
	        }
	        int v0_16 = ((v0_13 + v2_4) * 31);
	        if (this.g != null) {
	            v1_0 = this.g.hashCode();
	        }
	        return (((((((((v0_16 + v1_0) * 31) + this.h.hashCode()) * 31) + this.i.hashCode()) * 31) + this.j.hashCode()) * 31) + this.k.hashCode());
	    }
	
