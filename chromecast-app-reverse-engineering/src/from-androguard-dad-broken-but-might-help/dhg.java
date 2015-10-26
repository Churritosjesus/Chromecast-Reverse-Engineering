	public static final dge a
	public final dft b
	public dfh c
	public dez d
	public dhr e
	public dgf f
	public final dgc g
	public dhw h
	public  i
	public  j
	public final  k
	public final dfy l
	public dfy m
	public dgc n
	public dgc o
	public dku p
	public dkc q
	public final  r
	public final  s
	public s t
	public dgv u
	
	    static dhg()
	    {
	        dhg.a = new dhh();
	        return;
	    }
	
	
	    public dhg(dft p3, dfy p4, boolean p5, boolean p6, boolean p7, dfh p8, dhr p9, dhp p10, dgc p11)
	    {
	        this.i = -1;
	        this.b = p3;
	        this.l = p4;
	        this.k = p5;
	        this.r = p6;
	        this.s = p7;
	        this.c = p8;
	        this.e = p9;
	        this.p = p10;
	        this.g = p11;
	        if (p8 == null) {
	            this.f = 0;
	        } else {
	            dgi.b.b(p8, this);
	            this.f = p8.b;
	        }
	        return;
	    }
	
	
	    public static dfo a(dfo p7, dfo p8)
	    {
	        int v0_0 = 0;
	        dfp v2_1 = new dfp();
	        String v3_0 = (p7.a.length / 2);
	        int v1_2 = 0;
	        while (v1_2 < v3_0) {
	            String v4_4 = p7.a(v1_2);
	            String v5 = p7.b(v1_2);
	            if (((!"Warning".equalsIgnoreCase(v4_4)) || (!v5.startsWith("1"))) && ((!dhl.a(v4_4)) || (p8.a(v4_4) == null))) {
	                v2_1.a(v4_4, v5);
	            }
	            v1_2++;
	        }
	        int v1_5 = (p8.a.length / 2);
	        while (v0_0 < v1_5) {
	            String v3_1 = p8.a(v0_0);
	            if ((!"Content-Length".equalsIgnoreCase(v3_1)) && (dhl.a(v3_1))) {
	                v2_1.a(v3_1, p8.b(v0_0));
	            }
	            v0_0++;
	        }
	        return v2_1.a();
	    }
	
	
	    public static dgc a(dgc p2)
	    {
	        if ((p2 != null) && (p2.g != null)) {
	            dgd v0_1 = p2.a();
	            v0_1.g = 0;
	            p2 = v0_1.a();
	        }
	        return p2;
	    }
	
	
	    public static synthetic dhw a(dhg p1)
	    {
	        return p1.h;
	    }
	
	
	    public static String a(java.net.URL p2)
	    {
	        String v0_1;
	        if (dgs.a(p2) == dgs.a(p2.getProtocol())) {
	            v0_1 = p2.getHost();
	        } else {
	            v0_1 = new StringBuilder().append(p2.getHost()).append(":").append(p2.getPort()).toString();
	        }
	        return v0_1;
	    }
	
	
	    public static boolean c(dgc p6)
	    {
	        int v0 = 0;
	        if (!p6.a.b.equals("HEAD")) {
	            boolean v2_3 = p6.c;
	            if (((v2_3 >= 100) && (v2_3 < 200)) || ((v2_3 == 204) || (v2_3 == 304))) {
	                if ((dhl.a(p6) != -1) || ("chunked".equalsIgnoreCase(p6.a("Transfer-Encoding")))) {
	                    v0 = 1;
	                }
	            } else {
	                v0 = 1;
	            }
	        }
	        return v0;
	    }
	
	
	    public dfh a()
	    {
	        dhq v1_0 = this.b.q;
	        while(true) {
	            java.net.Socket v0_2 = v1_0.a(this.d);
	            if (v0_2 == null) {
	                break;
	            }
	            if ((!this.m.b.equals("GET")) && (!dgi.b.c(v0_2))) {
	                dgs.a(v0_2.c);
	            }
	            return v0_2;
	        }
	        try {
	            v0_2 = new dfh(v1_0, this.e.b());
	        } catch (java.net.Socket v0_5) {
	            throw new dhq(v0_5);
	        }
	        return v0_2;
	    }
	
	
	    public final void a(dfo p4)
	    {
	        java.net.CookieHandler v0_1 = this.b.i;
	        if (v0_1 != null) {
	            v0_1.put(this.l.b(), dhl.a(p4, 0));
	        }
	        return;
	    }
	
	
	    public void a(dhr p5, java.io.IOException p6)
	    {
	        if (dgi.b.b(this.c) <= 0) {
	            dgf v0_3 = this.c.b;
	            if ((v0_3.b.type() != java.net.Proxy$Type.DIRECT) && (p5.a.k != null)) {
	                p5.a.k.connectFailed(p5.b, v0_3.b.address(), p6);
	            }
	            p5.c.a(v0_3);
	        }
	        return;
	    }
	
	
	    public dgc b(dgc p5)
	    {
	        if ((this.j) && (("gzip".equalsIgnoreCase(this.o.a("Content-Encoding"))) && (p5.g != null))) {
	            dkd v0_5 = new dki(p5.g.c());
	            dfo v1_8 = p5.f.a().a("Content-Encoding").a("Content-Length").a();
	            dgd v2_4 = p5.a().a(v1_8);
	            v2_4.g = new dhn(v1_8, dkk.a(v0_5));
	            p5 = v2_4.a();
	        }
	        return p5;
	    }
	
	
	    public final void b()
	    {
	        if (this.i == -1) {
	            this.i = System.currentTimeMillis();
	            return;
	        } else {
	            throw new IllegalStateException();
	        }
	    }
	
	
	    public final boolean b(java.net.URL p4)
	    {
	        int v0_4;
	        int v0_1 = this.l.a();
	        if ((!v0_1.getHost().equals(p4.getHost())) || ((dgs.a(v0_1) != dgs.a(p4)) || (!v0_1.getProtocol().equals(p4.getProtocol())))) {
	            v0_4 = 0;
	        } else {
	            v0_4 = 1;
	        }
	        return v0_4;
	    }
	
	
	    public final boolean c()
	    {
	        return a.q(this.l.b);
	    }
	
	
	    public final dku d()
	    {
	        if (this.u != null) {
	            return this.p;
	        } else {
	            throw new IllegalStateException();
	        }
	    }
	
	
	    public final boolean e()
	    {
	        int v0_1;
	        if (this.o == null) {
	            v0_1 = 0;
	        } else {
	            v0_1 = 1;
	        }
	        return v0_1;
	    }
	
	
	    public final dgc f()
	    {
	        if (this.o != null) {
	            return this.o;
	        } else {
	            throw new IllegalStateException();
	        }
	    }
	
	
	    public void g()
	    {
	        boolean v0_1 = dgi.b.a(this.b);
	        if (v0_1) {
	            if (dgv.a(this.o, this.m)) {
	                dhg.a(this.o);
	                this.t = v0_1.m();
	            } else {
	                boolean v0_4 = this.m.b;
	                // Both branches of the condition point to the same code.
	                // if ((!v0_4.equals("POST")) && ((!v0_4.equals("PATCH")) && ((!v0_4.equals("PUT")) && (!v0_4.equals("DELETE"))))) {
	                // }
	            }
	        }
	        return;
	    }
	
	
	    public final void h()
	    {
	        if ((this.h != null) && (this.c != null)) {
	            this.h.c();
	        }
	        this.c = 0;
	        return;
	    }
	
	
	    public final dfh i()
	    {
	        dfh v0 = 0;
	        if (this.q == null) {
	            if (this.p != null) {
	                dgs.a(this.p);
	            }
	        } else {
	            dgs.a(this.q);
	        }
	        if (this.o != null) {
	            dgs.a(this.o.g);
	            if ((this.h == null) || ((this.c == null) || (this.h.d()))) {
	                if ((this.c != null) && (!dgi.b.a(this.c))) {
	                    this.c = 0;
	                }
	                java.net.Socket v1_14 = this.c;
	                this.c = 0;
	                v0 = v1_14;
	            } else {
	                dgs.a(this.c.c);
	                this.c = 0;
	            }
	        } else {
	            if (this.c != null) {
	                dgs.a(this.c.c);
	            }
	            this.c = 0;
	        }
	        return v0;
	    }
	
	
	    public dgc j()
	    {
	        this.h.a();
	        dgc v0_2 = this.h.b();
	        v0_2.a = this.m;
	        v0_2.e = this.c.i;
	        dgc v0_5 = v0_2.a(dhl.a, Long.toString(this.i)).a(dhl.b, Long.toString(System.currentTimeMillis())).a();
	        if (!this.s) {
	            dgi v1_6 = v0_5.a();
	            v1_6.g = this.h.a(v0_5);
	            v0_5 = v1_6.a();
	        }
	        dgi.b.a(this.c, v0_5.b);
	        return v0_5;
	    }
	
