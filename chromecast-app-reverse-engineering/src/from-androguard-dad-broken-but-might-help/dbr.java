	private static bridge Ldbr e
	public java.lang.String a
	public java.lang.String b
	public java.lang.String c
	public java.lang.Long d
	
	    public dbr()
	    {
	        this.a = 0;
	        this.b = 0;
	        this.c = 0;
	        this.d = 0;
	        this.t = -1;
	        return;
	    }
	
	
	    public static dbr[] b()
	    {
	        if (dbr.e == null) {
	            if (dbr.e == null) {
	                dbr[] v0_3 = new dbr[0];
	                dbr.e = v0_3;
	            }
	        }
	        return dbr.e;
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
	        if (this.d != null) {
	            v0 += dep.b(4, this.d.longValue());
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
	                    this.a = p3.d();
	                    break;
	                case 18:
	                    this.b = p3.d();
	                    break;
	                case 26:
	                    this.c = p3.d();
	                    break;
	                case 32:
	                    this.d = Long.valueOf(p3.b());
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
	        if (this.a != null) {
	            p5.a(1, this.a);
	        }
	        if (this.b != null) {
	            p5.a(2, this.b);
	        }
	        if (this.c != null) {
	            p5.a(3, this.c);
	        }
	        if (this.d != null) {
	            p5.a(4, this.d.longValue());
	        }
	        super.a(p5);
	        return;
	    }
	
