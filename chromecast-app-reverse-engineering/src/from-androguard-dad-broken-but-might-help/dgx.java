	final dfi a
	final dfh b
	final dkd c
	final dkc d
	  e
	  f
	private final java.net.Socket g
	
	    public dgx(dfi p2, dfh p3, java.net.Socket p4)
	    {
	        this.e = 0;
	        this.f = 0;
	        this.a = p2;
	        this.b = p3;
	        this.g = p4;
	        this.c = dkk.a(dkk.b(p4));
	        this.d = dkk.a(dkk.a(p4));
	        return;
	    }
	
	
	    static synthetic void a(dgx p2, dkh p3)
	    {
	        IllegalArgumentException v0_0 = p3.a;
	        String v1_0 = dkw.b;
	        if (v1_0 != null) {
	            p3.a = v1_0;
	            v0_0.n_();
	            v0_0.d();
	            return;
	        } else {
	            throw new IllegalArgumentException("delegate == null");
	        }
	    }
	
	
	    public final dkv a(long p4)
	    {
	        if (this.e == 4) {
	            this.e = 5;
	            return new dhc(this, p4);
	        } else {
	            throw new IllegalStateException(new StringBuilder("state: ").append(this.e).toString());
	        }
	    }
	
	
	    public final void a()
	    {
	        this.d.flush();
	        return;
	    }
	
	
	    public final void a(int p5, int p6)
	    {
	        if (p5 != 0) {
	            this.c.a().a(((long) p5), java.util.concurrent.TimeUnit.MILLISECONDS);
	        }
	        if (p6 != 0) {
	            this.d.a().a(((long) p6), java.util.concurrent.TimeUnit.MILLISECONDS);
	        }
	        return;
	    }
	
	
	    public final void a(dfo p5, String p6)
	    {
	        if (this.e == 0) {
	            this.d.b(p6).b("\r\n");
	            int v0_3 = 0;
	            String v1_3 = (p5.a.length / 2);
	            while (v0_3 < v1_3) {
	                this.d.b(p5.a(v0_3)).b(": ").b(p5.b(v0_3)).b("\r\n");
	                v0_3++;
	            }
	            this.d.b("\r\n");
	            this.e = 1;
	            return;
	        } else {
	            throw new IllegalStateException(new StringBuilder("state: ").append(this.e).toString());
	        }
	    }
	
	
	    public final void a(dfp p3)
	    {
	        while(true) {
	            String v0_1 = this.c.o();
	            if (v0_1.length() == 0) {
	                break;
	            }
	            dgi.b.a(p3, v0_1);
	        }
	        return;
	    }
	
	
	    public final boolean b()
	    {
	        java.io.IOException v0 = 0;
	        java.io.IOException v1 = 1;
	        try {
	            int v3 = this.g.getSoTimeout();
	        } catch (java.io.IOException v1) {
	            return v0;
	        } catch (java.io.IOException v0) {
	            v0 = v1;
	            return v0;
	        }
	        this.g.setSoTimeout(1);
	        if (!this.c.e()) {
	            this.g.setSoTimeout(v3);
	            v0 = 1;
	            return v0;
	        } else {
	            this.g.setSoTimeout(v3);
	            return v0;
	        }
	    }
	
	
	    public final dgd c()
	    {
	        if ((this.e != 1) && (this.e != 3)) {
	            throw new IllegalStateException(new StringBuilder("state: ").append(this.e).toString());
	        }
	        try {
	            do {
	                int v0_4 = dhv.a(this.c.o());
	                java.io.IOException v1_3 = new dgd();
	                v1_3.b = v0_4.a;
	                v1_3.c = v0_4.b;
	                v1_3.d = v0_4.c;
	                String v2_4 = new dfp();
	                this.a(v2_4);
	                v2_4.a(dhl.c, v0_4.a.toString());
	                v1_3.a(v2_4.a());
	            } while(v0_4.b == 100);
	            this.e = 4;
	            return v1_3;
	        } catch (int v0_6) {
	            java.io.IOException v1_5 = new java.io.IOException(new StringBuilder("unexpected end of stream on ").append(this.b).append(" (recycle count=").append(dgi.b.b(this.b)).append(")").toString());
	            v1_5.initCause(v0_6);
	            throw v1_5;
	        }
	        if (v0_4.b != 100) {
	        }
	        this.e = 4;
	        return v1_3;
	    }
	
