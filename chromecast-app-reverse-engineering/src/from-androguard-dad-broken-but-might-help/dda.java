	private static bridge Ldda e
	public java.lang.Long a
	public java.lang.String b
	public  c
	public java.lang.String d
	private ddb f
	
	    public dda()
	    {
	        this.a = 0;
	        this.b = 0;
	        this.c = -2147483648;
	        this.f = 0;
	        this.d = 0;
	        this.i = 0;
	        this.t = -1;
	        return;
	    }
	
	
	    public static dda[] b()
	    {
	        if (dda.e == null) {
	            if (dda.e == null) {
	                dda[] v0_3 = new dda[0];
	                dda.e = v0_3;
	            }
	        }
	        return dda.e;
	    }
	
	
	    protected final int a()
	    {
	        int v0 = super.a();
	        if (this.a != null) {
	            this.a.longValue();
	            v0 += (dep.b(1) + 8);
	        }
	        if (this.b != null) {
	            v0 += dep.b(2, this.b);
	        }
	        if (this.c != -2147483648) {
	            v0 += dep.b(3, this.c);
	        }
	        if (this.f != null) {
	            v0 += dep.b(4, this.f);
	        }
	        if (this.d != null) {
	            v0 += dep.b(5, this.d);
	        }
	        return v0;
	    }
	
	
	    public final synthetic dew a(deo p3)
	    {
	        while(true) {
	            ddb v0_0 = p3.a();
	            switch (v0_0) {
	                case 0:
	                    break;
	                case 9:
	                    this.a = Long.valueOf(p3.g());
	                    break;
	                case 18:
	                    this.b = p3.d();
	                    break;
	                case 24:
	                    ddb v0_6 = p3.e();
	                    switch (v0_6) {
	                        case 0:
	                        case 1:
	                        case 2:
	                        case 3:
	                            this.c = v0_6;
	                            break;
	                        default:
	                    }
	                    break;
	                case 34:
	                    if (this.f == null) {
	                        this.f = new ddb();
	                    }
	                    p3.a(this.f);
	                    break;
	                case 42:
	                    this.d = p3.d();
	                    break;
	                default:
	                    if (!super.a(p3, v0_0)) {
	                        break;
	                    }
	            }
	        }
	        return this;
	    }
	
	
	    public final void a(dep p4)
	    {
	        if (this.a != null) {
	            int v0_2 = this.a.longValue();
	            p4.c(1, 1);
	            p4.a(v0_2);
	        }
	        if (this.b != null) {
	            p4.a(2, this.b);
	        }
	        if (this.c != -2147483648) {
	            p4.a(3, this.c);
	        }
	        if (this.f != null) {
	            p4.a(4, this.f);
	        }
	        if (this.d != null) {
	            p4.a(5, this.d);
	        }
	        super.a(p4);
	        return;
	    }
	
