	private static bridge Ldcf d
	public java.lang.Integer a
	public java.lang.String b
	public java.lang.Boolean c
	
	    public dcf()
	    {
	        this.a = 0;
	        this.b = 0;
	        this.c = 0;
	        this.t = -1;
	        return;
	    }
	
	
	    public static dcf[] b()
	    {
	        if (dcf.d == null) {
	            if (dcf.d == null) {
	                dcf[] v0_3 = new dcf[0];
	                dcf.d = v0_3;
	            }
	        }
	        return dcf.d;
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
	        if (this.c != null) {
	            this.c.booleanValue();
	            v0 += (dep.b(3) + 1);
	        }
	        return v0;
	    }
	
	
	    public final synthetic dew a(deo p2)
	    {
	        while(true) {
	            Boolean v0_0 = p2.a();
	            switch (v0_0) {
	                case 0:
	                    break;
	                case 8:
	                    this.a = Integer.valueOf(p2.e());
	                    break;
	                case 18:
	                    this.b = p2.d();
	                    break;
	                case 24:
	                    this.c = Boolean.valueOf(p2.c());
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
	            p3.a(1, this.a.intValue());
	        }
	        if (this.b != null) {
	            p3.a(2, this.b);
	        }
	        if (this.c != null) {
	            p3.a(3, this.c.booleanValue());
	        }
	        super.a(p3);
	        return;
	    }
	
