	private final dhg a
	private final dgx b
	
	    public dhk(dhg p1, dgx p2)
	    {
	        this.a = p1;
	        this.b = p2;
	        return;
	    }
	
	
	    public final dge a(dgc p7)
	    {
	        dhd v0_6;
	        if (dhg.c(p7)) {
	            if (!"chunked".equalsIgnoreCase(p7.a("Transfer-Encoding"))) {
	                dhd v0_3 = dhl.a(p7);
	                if (v0_3 == -1) {
	                    String v1_2 = this.b;
	                    if (v1_2.e == 4) {
	                        v1_2.e = 5;
	                        v0_6 = new dhd(v1_2);
	                    } else {
	                        throw new IllegalStateException(new StringBuilder("state: ").append(v1_2.e).toString());
	                    }
	                } else {
	                    v0_6 = this.b.a(v0_3);
	                }
	            } else {
	                String v1_6 = this.b;
	                StringBuilder v2_5 = this.a;
	                if (v1_6.e == 4) {
	                    v1_6.e = 5;
	                    v0_6 = new dha(v1_6, v2_5);
	                } else {
	                    throw new IllegalStateException(new StringBuilder("state: ").append(v1_6.e).toString());
	                }
	            }
	        } else {
	            v0_6 = this.b.a(0);
	        }
	        return new dhn(p7.f, dkk.a(v0_6));
	    }
	
	
	    public final dku a(dfy p5, long p6)
	    {
	        dhb v0_8;
	        if (!"chunked".equalsIgnoreCase(p5.a("Transfer-Encoding"))) {
	            if (p6 == -1) {
	                throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
	            } else {
	                String v1_3 = this.b;
	                if (v1_3.e == 1) {
	                    v1_3.e = 2;
	                    v0_8 = new dhb(v1_3, p6);
	                } else {
	                    throw new IllegalStateException(new StringBuilder("state: ").append(v1_3.e).toString());
	                }
	            }
	        } else {
	            String v1_7 = this.b;
	            if (v1_7.e == 1) {
	                v1_7.e = 2;
	                v0_8 = new dgz(v1_7);
	            } else {
	                throw new IllegalStateException(new StringBuilder("state: ").append(v1_7.e).toString());
	            }
	        }
	        return v0_8;
	    }
	
	
	    public final void a()
	    {
	        this.b.a();
	        return;
	    }
	
	
	    public final void a(dfy p6)
	    {
	        String v0_6;
	        this.a.b();
	        String v0_5 = this.a.c.b.b.type();
	        dgx v1_2 = this.a.c.g;
	        dfo v2_1 = new StringBuilder();
	        v2_1.append(p6.b);
	        v2_1.append(32);
	        if ((p6.e()) || (v0_5 != java.net.Proxy$Type.HTTP)) {
	            v0_6 = 0;
	        } else {
	            v0_6 = 1;
	        }
	        if (v0_6 == null) {
	            v2_1.append(a.a(p6.a()));
	        } else {
	            v2_1.append(p6.a());
	        }
	        v2_1.append(32);
	        v2_1.append(a.a(v1_2));
	        this.b.a(p6.c, v2_1.toString());
	        return;
	    }
	
	
	    public final void a(dhg p3)
	    {
	        dgi.b.a(this.b.b, p3);
	        return;
	    }
	
	
	    public final void a(dhp p5)
	    {
	        dkc v0_0 = this.b;
	        if (v0_0.e == 1) {
	            v0_0.e = 3;
	            p5.a(v0_0.d);
	            return;
	        } else {
	            throw new IllegalStateException(new StringBuilder("state: ").append(v0_0.e).toString());
	        }
	    }
	
	
	    public final dgd b()
	    {
	        return this.b.c();
	    }
	
	
	    public final void c()
	    {
	        if (!this.d()) {
	            java.net.Socket v0_1 = this.b;
	            v0_1.f = 2;
	            if (v0_1.e == 0) {
	                v0_1.e = 6;
	                v0_1.b.c.close();
	            }
	        } else {
	            java.net.Socket v0_4 = this.b;
	            v0_4.f = 1;
	            if (v0_4.e == 0) {
	                v0_4.f = 0;
	                dgi.b.a(v0_4.a, v0_4.b);
	            }
	        }
	        return;
	    }
	
	
	    public final boolean d()
	    {
	        int v0 = 0;
	        if ((!"close".equalsIgnoreCase(this.a.l.a("Connection"))) && (!"close".equalsIgnoreCase(this.a.f().a("Connection")))) {
	            int v2_6;
	            if (this.b.e != 6) {
	                v2_6 = 0;
	            } else {
	                v2_6 = 1;
	            }
	            if (v2_6 == 0) {
	                v0 = 1;
	            }
	        }
	        return v0;
	    }
	
