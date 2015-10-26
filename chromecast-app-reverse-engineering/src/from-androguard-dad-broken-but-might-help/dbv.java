	private static bridge Ldbv e
	public dcj a
	public dck b
	public java.lang.Long c
	public java.lang.Integer d
	private java.lang.String f
	private java.lang.Boolean g
	private java.lang.Boolean h
	private java.lang.String i
	private java.lang.String j
	
	    public dbv()
	    {
	        this.f = 0;
	        this.g = 0;
	        this.a = 0;
	        this.b = 0;
	        this.c = 0;
	        this.h = 0;
	        this.d = 0;
	        this.i = 0;
	        this.j = 0;
	        this.t = -1;
	        return;
	    }
	
	
	    public static dbv a(byte[] p1)
	    {
	        return ((dbv) dew.a(new dbv(), p1));
	    }
	
	
	    public static dbv[] b()
	    {
	        if (dbv.e == null) {
	            if (dbv.e == null) {
	                dbv[] v0_3 = new dbv[0];
	                dbv.e = v0_3;
	            }
	        }
	        return dbv.e;
	    }
	
	
	    protected final int a()
	    {
	        int v0 = super.a();
	        if (this.g != null) {
	            this.g.booleanValue();
	            v0 += (dep.b(1) + 1);
	        }
	        if (this.a != null) {
	            v0 += dep.b(2, this.a);
	        }
	        if (this.b != null) {
	            v0 += dep.b(3, this.b);
	        }
	        if (this.c != null) {
	            v0 += dep.b(4, this.c.longValue());
	        }
	        if (this.h != null) {
	            this.h.booleanValue();
	            v0 += (dep.b(5) + 1);
	        }
	        if (this.d != null) {
	            v0 += dep.b(6, this.d.intValue());
	        }
	        if (this.i != null) {
	            v0 += dep.b(7, this.i);
	        }
	        if (this.j != null) {
	            v0 += dep.b(8, this.j);
	        }
	        if (this.f != null) {
	            v0 += dep.b(9, this.f);
	        }
	        return v0;
	    }
	
	
	    public final synthetic dew a(deo p3)
	    {
	        while(true) {
	            Integer v0_0 = p3.a();
	            switch (v0_0) {
	                case 0:
	                    break;
	                case 8:
	                    this.g = Boolean.valueOf(p3.c());
	                    break;
	                case 18:
	                    if (this.a == null) {
	                        this.a = new dcj();
	                    }
	                    p3.a(this.a);
	                    break;
	                case 26:
	                    if (this.b == null) {
	                        this.b = new dck();
	                    }
	                    p3.a(this.b);
	                    break;
	                case 32:
	                    this.c = Long.valueOf(p3.b());
	                    break;
	                case 40:
	                    this.h = Boolean.valueOf(p3.c());
	                    break;
	                case 48:
	                    Integer v0_4 = p3.e();
	                    switch (v0_4) {
	                        case 0:
	                        case 1:
	                        case 2:
	                        case 3:
	                        case 4:
	                            this.d = Integer.valueOf(v0_4);
	                            break;
	                        default:
	                    }
	                    break;
	                case 58:
	                    this.i = p3.d();
	                    break;
	                case 66:
	                    this.j = p3.d();
	                    break;
	                case 74:
	                    this.f = p3.d();
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
	        if (this.g != null) {
	            p5.a(1, this.g.booleanValue());
	        }
	        if (this.a != null) {
	            p5.a(2, this.a);
	        }
	        if (this.b != null) {
	            p5.a(3, this.b);
	        }
	        if (this.c != null) {
	            p5.a(4, this.c.longValue());
	        }
	        if (this.h != null) {
	            p5.a(5, this.h.booleanValue());
	        }
	        if (this.d != null) {
	            p5.a(6, this.d.intValue());
	        }
	        if (this.i != null) {
	            p5.a(7, this.i);
	        }
	        if (this.j != null) {
	            p5.a(8, this.j);
	        }
	        if (this.f != null) {
	            p5.a(9, this.f);
	        }
	        super.a(p5);
	        return;
	    }
	
