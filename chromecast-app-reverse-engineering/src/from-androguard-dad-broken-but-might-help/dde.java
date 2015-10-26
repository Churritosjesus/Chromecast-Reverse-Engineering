	public java.lang.Integer a
	public dda b
	
	    public dde()
	    {
	        this.a = 0;
	        this.b = 0;
	        this.i = 0;
	        this.t = -1;
	        return;
	    }
	
	
	    protected final int a()
	    {
	        int v0 = super.a();
	        if (this.a != null) {
	            v0 += dep.b(1, this.a.intValue());
	        }
	        if (this.b != null) {
	            v0 += dep.b(2, this.b);
	        }
	        return v0;
	    }
	
	
	    public final synthetic dew a(deo p2)
	    {
	        while(true) {
	            dda v0_0 = p2.a();
	            switch (v0_0) {
	                case 0:
	                    break;
	                case 8:
	                    this.a = Integer.valueOf(p2.e());
	                    break;
	                case 18:
	                    if (this.b == null) {
	                        this.b = new dda();
	                    }
	                    p2.a(this.b);
	                    break;
	                default:
	                    if (!super.a(p2, v0_0)) {
	                        break;
	                    }
	            }
	        }
	        return this;
	    }
	
	
	    public final void a(dep p3)
	    {
	        if (this.a != null) {
	            p3.a(1, this.a.intValue());
	        }
	        if (this.b != null) {
	            p3.a(2, this.b);
	        }
	        super.a(p3);
	        return;
	    }
	
