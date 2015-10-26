	private static bridge Ldba c
	public java.lang.String a
	public java.lang.String b
	private java.lang.String d
	private java.lang.Boolean e
	private java.lang.String f
	
	    public dba()
	    {
	        this.a = 0;
	        this.d = 0;
	        this.e = 0;
	        this.f = 0;
	        this.b = 0;
	        this.t = -1;
	        return;
	    }
	
	
	    public static dba[] b()
	    {
	        if (dba.c == null) {
	            if (dba.c == null) {
	                dba[] v0_3 = new dba[0];
	                dba.c = v0_3;
	            }
	        }
	        return dba.c;
	    }
	
	
	    protected final int a()
	    {
	        int v0 = super.a();
	        if (this.a != null) {
	            v0 += dep.b(1, this.a);
	        }
	        if (this.e != null) {
	            this.e.booleanValue();
	            v0 += (dep.b(2) + 1);
	        }
	        if (this.f != null) {
	            v0 += dep.b(3, this.f);
	        }
	        if (this.b != null) {
	            v0 += dep.b(4, this.b);
	        }
	        if (this.d != null) {
	            v0 += dep.b(5, this.d);
	        }
	        return v0;
	    }
	
	
	    public final synthetic dew a(deo p2)
	    {
	        while(true) {
	            String v0_0 = p2.a();
	            switch (v0_0) {
	                case 0:
	                    break;
	                case 10:
	                    this.a = p2.d();
	                    break;
	                case 16:
	                    this.e = Boolean.valueOf(p2.c());
	                    break;
	                case 26:
	                    this.f = p2.d();
	                    break;
	                case 34:
	                    this.b = p2.d();
	                    break;
	                case 42:
	                    this.d = p2.d();
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
	        if (this.e != null) {
	            p3.a(2, this.e.booleanValue());
	        }
	        if (this.f != null) {
	            p3.a(3, this.f);
	        }
	        if (this.b != null) {
	            p3.a(4, this.b);
	        }
	        if (this.d != null) {
	            p3.a(5, this.d);
	        }
	        super.a(p3);
	        return;
	    }
	
