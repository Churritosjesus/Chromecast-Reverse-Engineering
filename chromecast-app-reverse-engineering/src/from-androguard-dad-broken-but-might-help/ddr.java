	public ddq a
	private final ddq b
	private  c
	
	    public ddr(ddq p2)
	    {
	        this.b = p2;
	        this.a = ((ddq) p2.a(ddt.e));
	        this.c = 0;
	        return;
	    }
	
	
	    private ddr b(ddn p5, ddp p6)
	    {
	        try {
	            Throwable v0_3 = ((ddq) this.b.f().a(p5, p6));
	        } catch (Throwable v0_4) {
	            ddq v1_0 = v0_4;
	            Throwable v0_6 = ((ddq) v1_0.a);
	            try {
	                throw v1_0;
	            } catch (ddq v1_1) {
	                ddq v1_2 = v0_6;
	                Throwable v0_7 = v1_1;
	                if (v1_2 != null) {
	                    this.a(v1_2);
	                }
	                throw v0_7;
	            }
	        } catch (Throwable v0_7) {
	            v1_2 = 0;
	        }
	        if (v0_3 != null) {
	            this.a(v0_3);
	        }
	        return this;
	    }
	
	
	    private ddr e()
	    {
	        ddr v0_1 = this.b.g();
	        v0_1.a(this.f());
	        return v0_1;
	    }
	
	
	    private ddq f()
	    {
	        this.a.a(ddt.d);
	        this.c = 1;
	        return this.a;
	    }
	
	
	    public final synthetic ddh a()
	    {
	        return this.e();
	    }
	
	
	    public final synthetic ddh a(ddn p2, ddp p3)
	    {
	        return this.b(p2, p3);
	    }
	
	
	    public final ddr a(ddq p3)
	    {
	        this.b();
	        this.a.a(ddt.c, p3);
	        return this;
	    }
	
	
	    public final void b()
	    {
	        if (this.c) {
	            int v0_3 = ((ddq) this.a.a(ddt.e));
	            v0_3.a(ddt.c, this.a);
	            this.a = v0_3;
	            this.c = 0;
	        }
	        return;
	    }
	
	
	    public final ddq c()
	    {
	        dej v0_0 = this.f();
	        if (v0_0.h()) {
	            return v0_0;
	        } else {
	            throw new dej();
	        }
	    }
	
	
	    public synthetic Object clone()
	    {
	        return this.e();
	    }
	
	
	    public final synthetic dea d()
	    {
	        return this.f();
	    }
	
	
	    public final boolean h()
	    {
	        return ddq.a(this.a, 0);
	    }
	
