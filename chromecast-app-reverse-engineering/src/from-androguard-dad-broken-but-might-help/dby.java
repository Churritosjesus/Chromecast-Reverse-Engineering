	private static bridge Ldby a
	private java.lang.String b
	private java.lang.Double c
	private java.lang.Double d
	
	    public dby()
	    {
	        this.b = 0;
	        this.c = 0;
	        this.d = 0;
	        this.t = -1;
	        return;
	    }
	
	
	    public static dby[] b()
	    {
	        if (dby.a == null) {
	            if (dby.a == null) {
	                dby[] v0_3 = new dby[0];
	                dby.a = v0_3;
	            }
	        }
	        return dby.a;
	    }
	
	
	    protected final int a()
	    {
	        int v0 = super.a();
	        if (this.b != null) {
	            v0 += dep.b(1, this.b);
	        }
	        if (this.c != null) {
	            this.c.doubleValue();
	            v0 += (dep.b(2) + 8);
	        }
	        if (this.d != null) {
	            this.d.doubleValue();
	            v0 += (dep.b(3) + 8);
	        }
	        return v0;
	    }
	
	
	    public final synthetic dew a(deo p3)
	    {
	        while(true) {
	            Double v0_0 = p3.a();
	            switch (v0_0) {
	                case 0:
	                    break;
	                case 10:
	                    this.b = p3.d();
	                    break;
	                case 17:
	                    this.c = Double.valueOf(Double.longBitsToDouble(p3.g()));
	                    break;
	                case 25:
	                    this.d = Double.valueOf(Double.longBitsToDouble(p3.g()));
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
	            p5.a(2, this.c.doubleValue());
	        }
	        if (this.d != null) {
	            p5.a(3, this.d.doubleValue());
	        }
	        super.a(p5);
	        return;
	    }
	
