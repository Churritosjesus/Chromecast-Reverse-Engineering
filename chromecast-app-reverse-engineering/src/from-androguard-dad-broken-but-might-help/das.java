	public dax a
	public java.lang.Boolean b
	
	    public das()
	    {
	        this.a = 0;
	        this.b = 0;
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
	            this.b.booleanValue();
	            v0 += (dep.b(2) + 1);
	        }
	        return v0;
	    }
	
	
	    public final synthetic dew a(deo p2)
	    {
	        while(true) {
	            dax v0_0 = p2.a();
	            switch (v0_0) {
	                case 0:
	                    break;
	                case 10:
	                    if (this.a == null) {
	                        this.a = new dax();
	                    }
	                    p2.a(this.a);
	                    break;
	                case 16:
	                    this.b = Boolean.valueOf(p2.c());
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
	            p3.a(2, this.b.booleanValue());
	        }
	        super.a(p3);
	        return;
	    }
	
