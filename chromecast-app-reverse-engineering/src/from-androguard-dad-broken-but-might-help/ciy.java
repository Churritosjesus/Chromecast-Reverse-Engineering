	private static bridge Lciy c
	public  a
	public  b
	
	    public ciy()
	    {
	        this.a = 0;
	        this.b = 0;
	        this.m = 0;
	        this.n = -1;
	        return;
	    }
	
	
	    public static ciy[] b()
	    {
	        if (ciy.c == null) {
	            if (ciy.c == null) {
	                ciy[] v0_3 = new ciy[0];
	                ciy.c = v0_3;
	            }
	        }
	        return ciy.c;
	    }
	
	
	    protected final int a()
	    {
	        return ((super.a() + cmk.b(1, this.a)) + cmk.b(2, this.b));
	    }
	
	
	    public final synthetic cms a(cmj p2)
	    {
	        while(true) {
	            int v0_0 = p2.a();
	            switch (v0_0) {
	                case 0:
	                    break;
	                case 8:
	                    this.a = p2.e();
	                    break;
	                case 16:
	                    this.b = p2.e();
	                    break;
	                default:
	                    if (!this.a(p2, v0_0)) {
	                        break;
	                    }
	            }
	        }
	        return this;
	    }
	
	
	    public final void a(cmk p3)
	    {
	        p3.a(1, this.a);
	        p3.a(2, this.b);
	        super.a(p3);
	        return;
	    }
	
	
	    public final boolean equals(Object p4)
	    {
	        boolean v0 = 0;
	        if (p4 != this) {
	            if (((p4 instanceof ciy)) && ((this.a == ((ciy) p4).a) && (this.b == ((ciy) p4).b))) {
	                v0 = this.a(((ciy) p4));
	            }
	        } else {
	            v0 = 1;
	        }
	        return v0;
	    }
	
	
	    public final int hashCode()
	    {
	        return (((((this.a + 527) * 31) + this.b) * 31) + this.c());
	    }
	
