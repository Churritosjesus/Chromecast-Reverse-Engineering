	public  a
	public ciz b
	public cjd c
	
	    public clv()
	    {
	        this.a = 0;
	        this.b = 0;
	        this.c = 0;
	        this.m = 0;
	        this.n = -1;
	        return;
	    }
	
	
	    protected final int a()
	    {
	        int v0_1 = (super.a() + cmk.b(1, this.a));
	        if (this.b != null) {
	            v0_1 += cmk.b(2, this.b);
	        }
	        if (this.c != null) {
	            v0_1 += cmk.b(3, this.c);
	        }
	        return v0_1;
	    }
	
	
	    public final synthetic cms a(cmj p3)
	    {
	        while(true) {
	            cjd v0_0 = p3.a();
	            switch (v0_0) {
	                case 0:
	                    break;
	                case 8:
	                    this.a = p3.f();
	                    break;
	                case 18:
	                    if (this.b == null) {
	                        this.b = new ciz();
	                    }
	                    p3.a(this.b);
	                    break;
	                case 26:
	                    if (this.c == null) {
	                        this.c = new cjd();
	                    }
	                    p3.a(this.c);
	                    break;
	                default:
	                    if (!this.a(p3, v0_0)) {
	                        break;
	                    }
	            }
	        }
	        return this;
	    }
	
	
	    public final void a(cmk p5)
	    {
	        p5.a(1, this.a);
	        if (this.b != null) {
	            p5.a(2, this.b);
	        }
	        if (this.c != null) {
	            p5.a(3, this.c);
	        }
	        super.a(p5);
	        return;
	    }
	
	
	    public final boolean equals(Object p7)
	    {
	        boolean v0 = 0;
	        if (p7 != this) {
	            if (((p7 instanceof clv)) && (this.a == ((clv) p7).a)) {
	                if (this.b != null) {
	                    if (!this.b.equals(((clv) p7).b)) {
	                        return v0;
	                    }
	                } else {
	                    if (((clv) p7).b != null) {
	                        return v0;
	                    }
	                }
	                if (this.c != null) {
	                    if (!this.c.equals(((clv) p7).c)) {
	                        return v0;
	                    }
	                } else {
	                    if (((clv) p7).c != null) {
	                        return v0;
	                    }
	                }
	                v0 = this.a(((clv) p7));
	            }
	        } else {
	            v0 = 1;
	        }
	        return v0;
	    }
	
	
	    public final int hashCode()
	    {
	        int v0_5;
	        int v1_0 = 0;
	        cjd v2_2 = ((((int) (this.a ^ (this.a >> 32))) + 527) * 31);
	        if (this.b != null) {
	            v0_5 = this.b.hashCode();
	        } else {
	            v0_5 = 0;
	        }
	        int v0_7 = ((v0_5 + v2_2) * 31);
	        if (this.c != null) {
	            v1_0 = this.c.hashCode();
	        }
	        return (((v0_7 + v1_0) * 31) + this.c());
	    }
	
