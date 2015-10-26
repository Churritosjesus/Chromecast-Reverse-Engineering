	public java.lang.String a
	public java.lang.Integer b
	public java.lang.Integer c
	
	    public dbj()
	    {
	        this.a = 0;
	        this.b = 0;
	        this.c = 0;
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
	            v0 += dep.b(2, this.b.intValue());
	        }
	        if (this.c != null) {
	            v0 += dep.b(3, this.c.intValue());
	        }
	        return v0;
	    }
	
	
	    public final synthetic dew a(deo p2)
	    {
	        while(true) {
	            Integer v0_0 = p2.a();
	            switch (v0_0) {
	                case 0:
	                    break;
	                case 10:
	                    this.a = p2.d();
	                    break;
	                case 16:
	                    this.b = Integer.valueOf(p2.e());
	                    break;
	                case 24:
	                    this.c = Integer.valueOf(p2.e());
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
	            p3.a(2, this.b.intValue());
	        }
	        if (this.c != null) {
	            p3.a(3, this.c.intValue());
	        }
	        super.a(p3);
	        return;
	    }
	
