	private java.lang.Long a
	
	    public dcy()
	    {
	        this.a = 0;
	        this.i = 0;
	        this.t = -1;
	        return;
	    }
	
	
	    protected final int a()
	    {
	        int v0 = super.a();
	        if (this.a != null) {
	            v0 += dep.b(1, this.a.longValue());
	        }
	        return v0;
	    }
	
	
	    public final synthetic dew a(deo p3)
	    {
	        while(true) {
	            Long v0_0 = p3.a();
	            switch (v0_0) {
	                case 0:
	                    break;
	                case 8:
	                    this.a = Long.valueOf(p3.b());
	                    break;
	                default:
	                    if (!super.a(p3, v0_0)) {
	                        break;
	                    }
	            }
	        }
	        return this;
	    }
	
	
	    public final void a(dep p5)
	    {
	        if (this.a != null) {
	            p5.a(1, this.a.longValue());
	        }
	        super.a(p5);
	        return;
	    }
	
