	private static bridge Ldbk e
	public java.lang.String a
	public dbj b
	public java.lang.String c
	public java.lang.Integer d
	private java.lang.String f
	private java.lang.String g
	
	    public dbk()
	    {
	        this.a = 0;
	        this.b = 0;
	        this.c = 0;
	        this.f = 0;
	        this.g = 0;
	        this.d = 0;
	        this.t = -1;
	        return;
	    }
	
	
	    public static dbk[] b()
	    {
	        if (dbk.e == null) {
	            if (dbk.e == null) {
	                dbk[] v0_3 = new dbk[0];
	                dbk.e = v0_3;
	            }
	        }
	        return dbk.e;
	    }
	
	
	    protected final int a()
	    {
	        int v0 = super.a();
	        if (this.a != null) {
	            v0 += dep.b(1, this.a);
	        }
	        if (this.b != null) {
	            v0 += dep.b(2, this.b);
	        }
	        if (this.c != null) {
	            v0 += dep.b(3, this.c);
	        }
	        if (this.f != null) {
	            v0 += dep.b(4, this.f);
	        }
	        if (this.g != null) {
	            v0 += dep.b(5, this.g);
	        }
	        if (this.d != null) {
	            v0 += dep.b(6, this.d.intValue());
	        }
	        return v0;
	    }
	
	
	    public final synthetic dew a(deo p2)
	    {
	        while(true) {
	            dbj v0_0 = p2.a();
	            switch (v0_0) {
	                case 0:
	                    break;
	                case 10:
	                    this.a = p2.d();
	                    break;
	                case 18:
	                    if (this.b == null) {
	                        this.b = new dbj();
	                    }
	                    p2.a(this.b);
	                    break;
	                case 26:
	                    this.c = p2.d();
	                    break;
	                case 34:
	                    this.f = p2.d();
	                    break;
	                case 42:
	                    this.g = p2.d();
	                    break;
	                case 48:
	                    this.d = Integer.valueOf(p2.e());
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
	            p3.a(2, this.b);
	        }
	        if (this.c != null) {
	            p3.a(3, this.c);
	        }
	        if (this.f != null) {
	            p3.a(4, this.f);
	        }
	        if (this.g != null) {
	            p3.a(5, this.g);
	        }
	        if (this.d != null) {
	            p3.a(6, this.d.intValue());
	        }
	        super.a(p3);
	        return;
	    }
	
