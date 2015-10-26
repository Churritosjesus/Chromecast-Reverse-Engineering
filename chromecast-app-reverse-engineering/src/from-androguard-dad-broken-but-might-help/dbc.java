	private static bridge Ldbc e
	public java.lang.String a
	public java.lang.String b
	public java.lang.Float c
	public  d
	private java.lang.String f
	
	    public dbc()
	    {
	        this.a = 0;
	        this.f = 0;
	        this.b = 0;
	        this.c = 0;
	        this.d = -2147483648;
	        this.t = -1;
	        return;
	    }
	
	
	    public static dbc[] b()
	    {
	        if (dbc.e == null) {
	            if (dbc.e == null) {
	                dbc[] v0_3 = new dbc[0];
	                dbc.e = v0_3;
	            }
	        }
	        return dbc.e;
	    }
	
	
	    protected final int a()
	    {
	        int v0 = super.a();
	        if (this.a != null) {
	            v0 += dep.b(1, this.a);
	        }
	        if (this.f != null) {
	            v0 += dep.b(2, this.f);
	        }
	        if (this.b != null) {
	            v0 += dep.b(3, this.b);
	        }
	        if (this.c != null) {
	            this.c.floatValue();
	            v0 += (dep.b(4) + 4);
	        }
	        if (this.d != -2147483648) {
	            v0 += dep.b(5, this.d);
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
	                    this.f = p2.d();
	                    break;
	                case 26:
	                    this.b = p2.d();
	                    break;
	                case 37:
	                    this.c = Float.valueOf(Float.intBitsToFloat(p2.f()));
	                    break;
	                case 40:
	                    int v0_1 = p2.e();
	                    switch (v0_1) {
	                        case 0:
	                        case 1:
	                            this.d = v0_1;
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
	
	
	    public final void a(dep p5)
	    {
	        if (this.a != null) {
	            p5.a(1, this.a);
	        }
	        if (this.f != null) {
	            p5.a(2, this.f);
	        }
	        if (this.b != null) {
	            p5.a(3, this.b);
	        }
	        if (this.c != null) {
	            int v0_8 = this.c.floatValue();
	            p5.c(4, 5);
	            int v0_9 = Float.floatToIntBits(v0_8);
	            if (p5.a.remaining() >= 4) {
	                p5.a.putInt(v0_9);
	            } else {
	                throw new deq(p5.a.position(), p5.a.limit());
	            }
	        }
	        if (this.d != -2147483648) {
	            p5.a(5, this.d);
	        }
	        super.a(p5);
	        return;
	    }
	
