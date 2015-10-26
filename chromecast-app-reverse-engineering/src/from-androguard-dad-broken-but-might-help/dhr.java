	final dez a
	final java.net.URI b
	final dgr c
	private final dgk d
	private final dft e
	private java.net.Proxy f
	private java.net.InetSocketAddress g
	private java.util.List h
	private  i
	private java.util.List j
	private  k
	private final java.util.List l
	
	    public dhr(dez p3, java.net.URI p4, dft p5)
	    {
	        this.h = java.util.Collections.emptyList();
	        this.j = java.util.Collections.emptyList();
	        this.l = new java.util.ArrayList();
	        this.a = p3;
	        this.b = p4;
	        this.e = p5;
	        this.c = dgi.b.b(p5);
	        this.d = dgi.b.c(p5);
	        java.util.List v0_8 = p3.a;
	        if (v0_8 == null) {
	            this.h = new java.util.ArrayList();
	            java.util.List v0_13 = this.e.h.select(p4);
	            if (v0_13 != null) {
	                this.h.addAll(v0_13);
	            }
	            this.h.removeAll(java.util.Collections.singleton(java.net.Proxy.NO_PROXY));
	            this.h.add(java.net.Proxy.NO_PROXY);
	        } else {
	            this.h = java.util.Collections.singletonList(v0_8);
	        }
	        this.i = 0;
	        return;
	    }
	
	
	    private void a(java.net.Proxy p10)
	    {
	        int v1_5;
	        int v0_7;
	        this.j = new java.util.ArrayList();
	        if ((p10.type() != java.net.Proxy$Type.DIRECT) && (p10.type() != java.net.Proxy$Type.SOCKS)) {
	            int v0_4 = p10.address();
	            if ((v0_4 instanceof java.net.InetSocketAddress)) {
	                int v1_4;
	                int v0_5 = ((java.net.InetSocketAddress) v0_4);
	                int v1_3 = v0_5.getAddress();
	                if (v1_3 != 0) {
	                    v1_4 = v1_3.getHostAddress();
	                } else {
	                    v1_4 = v0_5.getHostName();
	                }
	                v0_7 = v1_4;
	                v1_5 = v0_5.getPort();
	            } else {
	                throw new IllegalArgumentException(new StringBuilder("Proxy.address() is not an InetSocketAddress: ").append(v0_4.getClass()).toString());
	            }
	        } else {
	            v0_7 = this.a.b;
	            v1_5 = dgs.a(this.b);
	        }
	        if ((v1_5 > 0) && (v1_5 <= 65535)) {
	            java.net.InetAddress[] v3_3 = this.d.a(v0_7);
	            int v4_0 = v3_3.length;
	            int v0_14 = 0;
	            while (v0_14 < v4_0) {
	                this.j.add(new java.net.InetSocketAddress(v3_3[v0_14], v1_5));
	                v0_14++;
	            }
	            this.k = 0;
	            return;
	        } else {
	            throw new java.net.SocketException(new StringBuilder("No route to ").append(v0_7).append(":").append(v1_5).append("; port is out of range").toString());
	        }
	    }
	
	
	    private boolean c()
	    {
	        int v0_1;
	        if (this.i >= this.h.size()) {
	            v0_1 = 0;
	        } else {
	            v0_1 = 1;
	        }
	        return v0_1;
	    }
	
	
	    private boolean d()
	    {
	        int v0_1;
	        if (this.k >= this.j.size()) {
	            v0_1 = 0;
	        } else {
	            v0_1 = 1;
	        }
	        return v0_1;
	    }
	
	
	    private boolean e()
	    {
	        int v0_2;
	        if (this.l.isEmpty()) {
	            v0_2 = 0;
	        } else {
	            v0_2 = 1;
	        }
	        return v0_2;
	    }
	
	
	    public final boolean a()
	    {
	        if ((!this.d()) && ((!this.c()) && (!this.e()))) {
	            int v0_3 = 0;
	        } else {
	            v0_3 = 1;
	        }
	        return v0_3;
	    }
	
	
	    public final dgf b()
	    {
	        while(true) {
	            java.net.Proxy v0_11;
	            if (this.d()) {
	                if (!this.d()) {
	                    break;
	                }
	                java.net.Proxy v0_7 = this.j;
	                java.util.List v1_1 = this.k;
	                this.k = (v1_1 + 1);
	                this.g = ((java.net.InetSocketAddress) v0_7.get(v1_1));
	                v0_11 = new dgf(this.a, this.f, this.g);
	                if (this.c.c(v0_11)) {
	                    this.l.add(v0_11);
	                }
	            } else {
	                if (this.c()) {
	                    if (this.c()) {
	                        java.net.Proxy v0_3 = this.h;
	                        java.util.List v1_0 = this.i;
	                        this.i = (v1_0 + 1);
	                        java.net.Proxy v0_5 = ((java.net.Proxy) v0_3.get(v1_0));
	                        this.a(v0_5);
	                        this.f = v0_5;
	                    } else {
	                        throw new java.net.SocketException(new StringBuilder("No route to ").append(this.a.b).append("; exhausted proxy configurations: ").append(this.h).toString());
	                    }
	                } else {
	                    if (this.e()) {
	                        v0_11 = ((dgf) this.l.remove(0));
	                    } else {
	                        throw new java.util.NoSuchElementException();
	                    }
	                }
	            }
	            return v0_11;
	        }
	        throw new java.net.SocketException(new StringBuilder("No route to ").append(this.a.b).append("; exhausted inet socket addresses: ").append(this.j).toString());
	    }
	
