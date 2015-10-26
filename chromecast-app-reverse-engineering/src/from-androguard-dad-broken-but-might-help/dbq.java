	private static bridge Ldbq f
	public java.lang.Long a
	public java.lang.String b
	public java.lang.String c
	public java.lang.Integer d
	public java.lang.String e
	private java.lang.String g
	private java.lang.String h
	private java.lang.String i
	
	    public dbq()
	    {
	        this.a = 0;
	        this.b = 0;
	        this.c = 0;
	        this.d = 0;
	        this.g = 0;
	        this.h = 0;
	        this.i = 0;
	        this.e = 0;
	        this.t = -1;
	        return;
	    }
	
	
	    public static dbq[] b()
	    {
	        if (dbq.f == null) {
	            if (dbq.f == null) {
	                dbq[] v0_3 = new dbq[0];
	                dbq.f = v0_3;
	            }
	        }
	        return dbq.f;
	    }
	
	
	    protected final int a()
	    {
	        int v0 = super.a();
	        if (this.a != null) {
	            v0 += dep.b(1, this.a.longValue());
	        }
	        if (this.b != null) {
	            v0 += dep.b(2, this.b);
	        }
	        if (this.c != null) {
	            v0 += dep.b(3, this.c);
	        }
	        if (this.d != null) {
	            v0 += dep.b(4, this.d.intValue());
	        }
	        if (this.g != null) {
	            v0 += dep.b(5, this.g);
	        }
	        if (this.h != null) {
	            v0 += dep.b(6, this.h);
	        }
	        if (this.i != null) {
	            v0 += dep.b(7, this.i);
	        }
	        if (this.e != null) {
	            v0 += dep.b(8, this.e);
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
	                case 8:
	                    this.a = Long.valueOf(p3.b());
	                    break;
	                case 18:
	                    this.b = p3.d();
	                    break;
	                case 26:
	                    this.c = p3.d();
	                    break;
	                case 32:
	                    this.d = Integer.valueOf(p3.e());
	                    break;
	                case 42:
	                    this.g = p3.d();
	                    break;
	                case 50:
	                    this.h = p3.d();
	                    break;
	                case 58:
	                    this.i = p3.d();
	                    break;
	                case 66:
	                    this.e = p3.d();
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
	            p5.a(1, this.a.longValue());
	        }
	        if (this.b != null) {
	            p5.a(2, this.b);
	        }
	        if (this.c != null) {
	            p5.a(3, this.c);
	        }
	        if (this.d != null) {
	            p5.a(4, this.d.intValue());
	        }
	        if (this.g != null) {
	            p5.a(5, this.g);
	        }
	        if (this.h != null) {
	            p5.a(6, this.h);
	        }
	        if (this.i != null) {
	            p5.a(7, this.i);
	        }
	        if (this.e != null) {
	            p5.a(8, this.e);
	        }
	        super.a(p5);
	        return;
	    }
	
