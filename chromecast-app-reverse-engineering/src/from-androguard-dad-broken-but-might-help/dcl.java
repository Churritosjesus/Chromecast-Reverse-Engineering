	public java.lang.String a
	public java.lang.String b
	public java.lang.Boolean c
	public dcm d
	public java.lang.String e
	private java.lang.Integer f
	
	    public dcl()
	    {
	        this.f = 0;
	        this.a = 0;
	        this.b = 0;
	        this.c = 0;
	        this.d = 0;
	        this.e = 0;
	        this.t = -1;
	        return;
	    }
	
	
	    protected final int a()
	    {
	        int v0 = super.a();
	        if (this.f != null) {
	            v0 += dep.b(1, this.f.intValue());
	        }
	        if (this.a != null) {
	            v0 += dep.b(2, this.a);
	        }
	        if (this.b != null) {
	            v0 += dep.b(3, this.b);
	        }
	        if (this.c != null) {
	            this.c.booleanValue();
	            v0 += (dep.b(4) + 1);
	        }
	        if (this.d != null) {
	            v0 += dep.b(5, this.d);
	        }
	        if (this.e != null) {
	            v0 += dep.b(6, this.e);
	        }
	        return v0;
	    }
	
	
	    public final synthetic dew a(deo p2)
	    {
	        while(true) {
	            dcm v0_0 = p2.a();
	            switch (v0_0) {
	                case 0:
	                    break;
	                case 8:
	                    dcm v0_10 = p2.e();
	                    switch (v0_10) {
	                        case 0:
	                        case 1:
	                        case 2:
	                        case 3:
	                        case 4:
	                        case 5:
	                        case 6:
	                        case 7:
	                        case 8:
	                        case 9:
	                        case 10:
	                        case 11:
	                        case 12:
	                        case 13:
	                        case 14:
	                        case 15:
	                        case 16:
	                        case 17:
	                        case 18:
	                        case 19:
	                        case 20:
	                        case 21:
	                        case 22:
	                        case 23:
	                        case 24:
	                        case 25:
	                        case 26:
	                        case 27:
	                        case 28:
	                        case 29:
	                        case 30:
	                        case 31:
	                        case 32:
	                        case 33:
	                        case 34:
	                        case 35:
	                        case 36:
	                        case 37:
	                        case 38:
	                        case 39:
	                        case 40:
	                        case 41:
	                        case 42:
	                        case 43:
	                        case 44:
	                        case 45:
	                        case 46:
	                        case 47:
	                        case 48:
	                            this.f = Integer.valueOf(v0_10);
	                            break;
	                        default:
	                    }
	                    break;
	                case 18:
	                    this.a = p2.d();
	                    break;
	                case 26:
	                    this.b = p2.d();
	                    break;
	                case 32:
	                    this.c = Boolean.valueOf(p2.c());
	                    break;
	                case 42:
	                    if (this.d == null) {
	                        this.d = new dcm();
	                    }
	                    p2.a(this.d);
	                    break;
	                case 50:
	                    this.e = p2.d();
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
	        if (this.f != null) {
	            p3.a(1, this.f.intValue());
	        }
	        if (this.a != null) {
	            p3.a(2, this.a);
	        }
	        if (this.b != null) {
	            p3.a(3, this.b);
	        }
	        if (this.c != null) {
	            p3.a(4, this.c.booleanValue());
	        }
	        if (this.d != null) {
	            p3.a(5, this.d);
	        }
	        if (this.e != null) {
	            p3.a(6, this.e);
	        }
	        super.a(p3);
	        return;
	    }
	
