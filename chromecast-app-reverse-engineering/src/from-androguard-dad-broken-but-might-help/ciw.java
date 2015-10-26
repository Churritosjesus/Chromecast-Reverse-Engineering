	private static bridge Lciw f
	public java.lang.String a
	public  b
	public  c
	public  d
	public  e
	
	    public ciw()
	    {
	        this.a = "";
	        this.b = 0;
	        this.c = 2147483647;
	        this.d = 0;
	        this.e = 0;
	        this.m = 0;
	        this.n = -1;
	        return;
	    }
	
	
	    public static ciw[] b()
	    {
	        if (ciw.f == null) {
	            if (ciw.f == null) {
	                ciw[] v0_3 = new ciw[0];
	                ciw.f = v0_3;
	            }
	        }
	        return ciw.f;
	    }
	
	
	    protected final int a()
	    {
	        int v0 = super.a();
	        if (!this.a.equals("")) {
	            v0 += cmk.b(1, this.a);
	        }
	        if (this.b != 0) {
	            v0 += cmk.b(2, this.b);
	        }
	        if (this.c != 2147483647) {
	            v0 += cmk.b(3, this.c);
	        }
	        if (this.d) {
	            v0 += (cmk.c(4) + 1);
	        }
	        if (this.e != 0) {
	            v0 += cmk.b(5, this.e);
	        }
	        return v0;
	    }
	
	
	    public final synthetic cms a(cmj p3)
	    {
	        while(true) {
	            long v0_0 = p3.a();
	            switch (v0_0) {
	                case 0:
	                    break;
	                case 10:
	                    this.a = p3.c();
	                    break;
	                case 16:
	                    this.b = p3.f();
	                    break;
	                case 24:
	                    this.c = p3.f();
	                    break;
	                case 32:
	                    this.d = p3.b();
	                    break;
	                case 40:
	                    this.e = p3.f();
	                    break;
	                default:
	                    if (!this.a(p3, v0_0)) {
	                        break;
	                    }
	            }
	        }
	        return this;
	    }
	
	
	    public final void a(cmk p7)
	    {
	        if (!this.a.equals("")) {
	            p7.a(1, this.a);
	        }
	        if (this.b != 0) {
	            p7.a(2, this.b);
	        }
	        if (this.c != 2147483647) {
	            p7.a(3, this.c);
	        }
	        if (this.d) {
	            p7.a(4, this.d);
	        }
	        if (this.e != 0) {
	            p7.a(5, this.e);
	        }
	        super.a(p7);
	        return;
	    }
	
	
	    public final boolean equals(Object p7)
	    {
	        boolean v0 = 0;
	        if (p7 != this) {
	            if ((p7 instanceof ciw)) {
	                if (this.a != null) {
	                    if (!this.a.equals(((ciw) p7).a)) {
	                        return v0;
	                    }
	                } else {
	                    if (((ciw) p7).a != null) {
	                        return v0;
	                    }
	                }
	                if ((this.b == ((ciw) p7).b) && ((this.c == ((ciw) p7).c) && ((this.d == ((ciw) p7).d) && (this.e == ((ciw) p7).e)))) {
	                    v0 = this.a(((ciw) p7));
	                }
	            }
	        } else {
	            v0 = 1;
	        }
	        return v0;
	    }
	
	
	    public final int hashCode()
	    {
	        int v0_2;
	        if (this.a != null) {
	            v0_2 = this.a.hashCode();
	        } else {
	            v0_2 = 0;
	        }
	        int v0_9;
	        if (!this.d) {
	            v0_9 = 1237;
	        } else {
	            v0_9 = 1231;
	        }
	        return (((((v0_9 + ((((((v0_2 + 527) * 31) + ((int) (this.b ^ (this.b >> 32)))) * 31) + ((int) (this.c ^ (this.c >> 32)))) * 31)) * 31) + ((int) (this.e ^ (this.e >> 32)))) * 31) + this.c());
	    }
	
