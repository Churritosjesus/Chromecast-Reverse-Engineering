	private  a
	private  b
	private  c
	
	    public ciu()
	    {
	        this.a = 1;
	        this.b = 0;
	        this.c = 0;
	        this.m = 0;
	        this.n = -1;
	        return;
	    }
	
	
	    protected final int a()
	    {
	        int v0 = super.a();
	        if (this.a != 1) {
	            v0 += cmk.b(1, this.a);
	        }
	        if (this.b != 0) {
	            v0 += cmk.b(2, this.b);
	        }
	        if (this.c != 0) {
	            v0 += cmk.b(3, this.c);
	        }
	        return v0;
	    }
	
	
	    public final synthetic cms a(cmj p2)
	    {
	        while(true) {
	            int v0_0 = p2.a();
	            switch (v0_0) {
	                case 0:
	                    break;
	                case 8:
	                    int v0_3 = p2.e();
	                    switch (v0_3) {
	                        case 1:
	                        case 2:
	                        case 3:
	                            this.a = v0_3;
	                            break;
	                        default:
	                    }
	                    break;
	                case 16:
	                    this.b = p2.e();
	                    break;
	                case 24:
	                    this.c = p2.e();
	                    break;
	                default:
	                    if (!this.a(p2, v0_0)) {
	                        break;
	                    }
	            }
	        }
	        return this;
	    }
	
	
	    public final void a(cmk p3)
	    {
	        if (this.a != 1) {
	            p3.a(1, this.a);
	        }
	        if (this.b != 0) {
	            p3.a(2, this.b);
	        }
	        if (this.c != 0) {
	            p3.a(3, this.c);
	        }
	        super.a(p3);
	        return;
	    }
	
	
	    public final boolean equals(Object p4)
	    {
	        boolean v0 = 0;
	        if (p4 != this) {
	            if (((p4 instanceof ciu)) && ((this.a == ((ciu) p4).a) && ((this.b == ((ciu) p4).b) && (this.c == ((ciu) p4).c)))) {
	                v0 = this.a(((ciu) p4));
	            }
	        } else {
	            v0 = 1;
	        }
	        return v0;
	    }
	
	
	    public final int hashCode()
	    {
	        return (((((((this.a + 527) * 31) + this.b) * 31) + this.c) * 31) + this.c());
	    }
	
