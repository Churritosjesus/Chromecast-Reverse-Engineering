	private static bridge Ldap d
	public java.lang.String a
	public java.lang.String b
	public java.lang.String c
	private java.lang.String e
	private java.lang.String f
	private java.lang.String g
	private java.lang.String h
	private  i
	
	    public dap()
	    {
	        this.a = 0;
	        this.e = 0;
	        this.b = 0;
	        this.f = 0;
	        this.c = 0;
	        this.g = 0;
	        this.h = 0;
	        this.i = -2147483648;
	        this.t = -1;
	        return;
	    }
	
	
	    public static dap[] b()
	    {
	        if (dap.d == null) {
	            if (dap.d == null) {
	                dap[] v0_3 = new dap[0];
	                dap.d = v0_3;
	            }
	        }
	        return dap.d;
	    }
	
	
	    protected final int a()
	    {
	        int v0 = super.a();
	        if (this.a != null) {
	            v0 += dep.b(1, this.a);
	        }
	        if (this.e != null) {
	            v0 += dep.b(2, this.e);
	        }
	        if (this.b != null) {
	            v0 += dep.b(3, this.b);
	        }
	        if (this.f != null) {
	            v0 += dep.b(4, this.f);
	        }
	        if (this.c != null) {
	            v0 += dep.b(5, this.c);
	        }
	        if (this.g != null) {
	            v0 += dep.b(6, this.g);
	        }
	        if (this.h != null) {
	            v0 += dep.b(7, this.h);
	        }
	        if (this.i != -2147483648) {
	            v0 += dep.b(8, this.i);
	        }
	        return v0;
	    }
	
	
	    public final synthetic dew a(deo p2)
	    {
	        while(true) {
	            int v0_0 = p2.a();
	            switch (v0_0) {
	                case 0:
	                    break;
	                case 10:
	                    this.a = p2.d();
	                    break;
	                case 18:
	                    this.e = p2.d();
	                    break;
	                case 26:
	                    this.b = p2.d();
	                    break;
	                case 34:
	                    this.f = p2.d();
	                    break;
	                case 42:
	                    this.c = p2.d();
	                    break;
	                case 50:
	                    this.g = p2.d();
	                    break;
	                case 58:
	                    this.h = p2.d();
	                    break;
	                case 64:
	                    int v0_1 = p2.e();
	                    switch (v0_1) {
	                        case 0:
	                            this.i = v0_1;
	                            break;
	                        default:
	                    }
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
	            p3.a(2, this.e);
	        }
	        if (this.b != null) {
	            p3.a(3, this.b);
	        }
	        if (this.f != null) {
	            p3.a(4, this.f);
	        }
	        if (this.c != null) {
	            p3.a(5, this.c);
	        }
	        if (this.g != null) {
	            p3.a(6, this.g);
	        }
	        if (this.h != null) {
	            p3.a(7, this.h);
	        }
	        if (this.i != -2147483648) {
	            p3.a(8, this.i);
	        }
	        super.a(p3);
	        return;
	    }
	
