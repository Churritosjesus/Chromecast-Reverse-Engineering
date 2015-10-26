	public java.lang.String a
	public dca b
	public java.lang.String c
	public java.lang.Integer d
	public java.lang.Integer e
	public java.lang.Integer f
	
	    public dcc()
	    {
	        this.a = 0;
	        this.b = 0;
	        this.c = 0;
	        this.d = 0;
	        this.e = 0;
	        this.f = 0;
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
	            v0 += dep.b(3, this.c);
	        }
	        if (this.d != null) {
	            v0 += dep.b(4, this.d.intValue());
	        }
	        if (this.e != null) {
	            v0 += dep.b(5, this.e.intValue());
	        }
	        if (this.f != null) {
	            v0 += dep.b(6, this.f.intValue());
	        }
	        return v0;
	    }
	
	
	    public final synthetic dew a(deo p2)
	    {
	        while(true) {
	            dca v0_0 = p2.a();
	            switch (v0_0) {
	                case 0:
	                    break;
	                case 10:
	                    this.a = p2.d();
	                    break;
	                case 18:
	                    if (this.b == null) {
	                        this.b = new dca();
	                    }
	                    p2.a(this.b);
	                    break;
	                case 26:
	                    this.c = p2.d();
	                    break;
	                case 32:
	                    this.d = Integer.valueOf(p2.e());
	                    break;
	                case 40:
	                    this.e = Integer.valueOf(p2.e());
	                    break;
	                case 48:
	                    this.f = Integer.valueOf(p2.e());
	                    break;
	                default:
	                    if (!dey.a(p2, v0_0)) {
	                        break;
	                    }
	            }
	        }
	        return this;
	    }
	
	
	    public final void a(dep p3)
	    {
	        if (this.a != null) {
	            p3.a(1, this.a);
	        }
	        if (this.b != null) {
	            p3.a(2, this.b);
	        }
	        if (this.c != null) {
	            p3.a(3, this.c);
	        }
	        if (this.d != null) {
	            p3.a(4, this.d.intValue());
	        }
	        if (this.e != null) {
	            p3.a(5, this.e.intValue());
	        }
	        if (this.f != null) {
	            p3.a(6, this.f.intValue());
	        }
	        super.a(p3);
	        return;
	    }
	
