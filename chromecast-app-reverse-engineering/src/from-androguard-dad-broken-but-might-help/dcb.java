	private static bridge Ldcb a
	private java.lang.String b
	private java.lang.Long c
	
	    public dcb()
	    {
	        this.b = 0;
	        this.c = 0;
	        this.t = -1;
	        return;
	    }
	
	
	    public static dcb[] b()
	    {
	        if (dcb.a == null) {
	            if (dcb.a == null) {
	                dcb[] v0_3 = new dcb[0];
	                dcb.a = v0_3;
	            }
	        }
	        return dcb.a;
	    }
	
	
	    protected final int a()
	    {
	        int v0 = super.a();
	        if (this.b != null) {
	            v0 += dep.b(1, this.b);
	        }
	        if (this.c != null) {
	            v0 += dep.b(2, this.c.longValue());
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
	                case 10:
	                    this.b = p3.d();
	                    break;
	                case 16:
	                    this.c = Long.valueOf(p3.b());
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
	        if (this.b != null) {
	            p5.a(1, this.b);
	        }
	        if (this.c != null) {
	            p5.a(2, this.c.longValue());
	        }
	        super.a(p5);
	        return;
	    }
	
