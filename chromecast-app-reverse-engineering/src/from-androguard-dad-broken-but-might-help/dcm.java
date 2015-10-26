	public java.lang.String a
	public java.lang.String b
	public java.lang.Long c
	private java.lang.String d
	private java.lang.String e
	
	    public dcm()
	    {
	        this.a = 0;
	        this.d = 0;
	        this.b = 0;
	        this.c = 0;
	        this.e = 0;
	        this.t = -1;
	        return;
	    }
	
	
	    protected final int a()
	    {
	        int v0 = super.a();
	        if (this.a != null) {
	            v0 += dep.b(1, this.a);
	        }
	        if (this.d != null) {
	            v0 += dep.b(2, this.d);
	        }
	        if (this.b != null) {
	            v0 += dep.b(3, this.b);
	        }
	        if (this.c != null) {
	            v0 += dep.b(4, this.c.longValue());
	        }
	        if (this.e != null) {
	            v0 += dep.b(5, this.e);
	        }
	        return v0;
	    }
	
	
	    public final synthetic dew a(deo p3)
	    {
	        while(true) {
	            String v0_0 = p3.a();
	            switch (v0_0) {
	                case 0:
	                    break;
	                case 10:
	                    this.a = p3.d();
	                    break;
	                case 18:
	                    this.d = p3.d();
	                    break;
	                case 26:
	                    this.b = p3.d();
	                    break;
	                case 32:
	                    this.c = Long.valueOf(p3.b());
	                    break;
	                case 42:
	                    this.e = p3.d();
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
	        if (this.d != null) {
	            p5.a(2, this.d);
	        }
	        if (this.b != null) {
	            p5.a(3, this.b);
	        }
	        if (this.c != null) {
	            p5.a(4, this.c.longValue());
	        }
	        if (this.e != null) {
	            p5.a(5, this.e);
	        }
	        super.a(p5);
	        return;
	    }
	
