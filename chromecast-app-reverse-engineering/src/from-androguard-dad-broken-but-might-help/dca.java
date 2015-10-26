	private static bridge Ldca c
	public java.lang.String a
	public java.lang.String b
	private java.lang.String d
	private java.lang.Long e
	
	    public dca()
	    {
	        this.a = 0;
	        this.b = 0;
	        this.d = 0;
	        this.e = 0;
	        this.t = -1;
	        return;
	    }
	
	
	    public static dca[] b()
	    {
	        if (dca.c == null) {
	            if (dca.c == null) {
	                dca[] v0_3 = new dca[0];
	                dca.c = v0_3;
	            }
	        }
	        return dca.c;
	    }
	
	
	    protected final int a()
	    {
	        int v0 = super.a();
	        if (this.a != null) {
	            v0 += dep.b(1, this.a);
	        }
	        if (this.d != null) {
	            v0 += dep.b(2, this.d);
	        }
	        if (this.e != null) {
	            v0 += dep.b(3, this.e.longValue());
	        }
	        if (this.b != null) {
	            v0 += dep.b(4, this.b);
	        }
	        return v0;
	    }
	
	
	    public final synthetic dew a(deo p3)
	    {
	        while(true) {
	            String v0_0 = p3.a();
	            switch (v0_0) {
	                case 0:
	                    break;
	                case 10:
	                    this.a = p3.d();
	                    break;
	                case 18:
	                    this.d = p3.d();
	                    break;
	                case 24:
	                    this.e = Long.valueOf(p3.b());
	                    break;
	                case 34:
	                    this.b = p3.d();
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
	        if (this.d != null) {
	            p5.a(2, this.d);
	        }
	        if (this.e != null) {
	            p5.a(3, this.e.longValue());
	        }
	        if (this.b != null) {
	            p5.a(4, this.b);
	        }
	        super.a(p5);
	        return;
	    }
	
