	public java.lang.String a
	public dck b
	private java.lang.Integer c
	private java.lang.Long d
	private java.lang.String e
	private java.lang.String f
	private java.lang.Boolean g
	private java.lang.Integer h
	
	    public dbu()
	    {
	        this.a = 0;
	        this.b = 0;
	        this.c = 0;
	        this.d = 0;
	        this.e = 0;
	        this.f = 0;
	        this.g = 0;
	        this.h = 0;
	        this.t = -1;
	        return;
	    }
	
	
	    protected final int a()
	    {
	        int v0 = super.a();
	        if (this.a != null) {
	            v0 += dep.b(1, this.a);
	        }
	        if (this.b != null) {
	            v0 += dep.b(2, this.b);
	        }
	        if (this.c != null) {
	            v0 += dep.b(3, this.c.intValue());
	        }
	        if (this.d != null) {
	            v0 += dep.b(4, this.d.longValue());
	        }
	        if (this.e != null) {
	            v0 += dep.b(5, this.e);
	        }
	        if (this.f != null) {
	            v0 += dep.b(6, this.f);
	        }
	        if (this.h != null) {
	            v0 += dep.b(7, this.h.intValue());
	        }
	        if (this.g != null) {
	            this.g.booleanValue();
	            v0 += (dep.b(8) + 1);
	        }
	        return v0;
	    }
	
	
	    public final synthetic dew a(deo p3)
	    {
	        while(true) {
	            Integer v0_0 = p3.a();
	            switch (v0_0) {
	                case 0:
	                    break;
	                case 10:
	                    this.a = p3.d();
	                    break;
	                case 18:
	                    if (this.b == null) {
	                        this.b = new dck();
	                    }
	                    p3.a(this.b);
	                    break;
	                case 24:
	                    this.c = Integer.valueOf(p3.e());
	                    break;
	                case 32:
	                    this.d = Long.valueOf(p3.b());
	                    break;
	                case 42:
	                    this.e = p3.d();
	                    break;
	                case 50:
	                    this.f = p3.d();
	                    break;
	                case 56:
	                    Integer v0_3 = p3.e();
	                    switch (v0_3) {
	                        case 0:
	                        case 1:
	                            this.h = Integer.valueOf(v0_3);
	                            break;
	                        default:
	                    }
	                    break;
	                case 64:
	                    this.g = Boolean.valueOf(p3.c());
	                    break;
	                default:
	                    if (!dey.a(p3, v0_0)) {
	                        break;
	                    }
	            }
	        }
	        return this;
	    }
	
	
	    public final void a(dep p5)
	    {
	        if (this.a != null) {
	            p5.a(1, this.a);
	        }
	        if (this.b != null) {
	            p5.a(2, this.b);
	        }
	        if (this.c != null) {
	            p5.a(3, this.c.intValue());
	        }
	        if (this.d != null) {
	            p5.a(4, this.d.longValue());
	        }
	        if (this.e != null) {
	            p5.a(5, this.e);
	        }
	        if (this.f != null) {
	            p5.a(6, this.f);
	        }
	        if (this.h != null) {
	            p5.a(7, this.h.intValue());
	        }
	        if (this.g != null) {
	            p5.a(8, this.g.booleanValue());
	        }
	        super.a(p5);
	        return;
	    }
	
