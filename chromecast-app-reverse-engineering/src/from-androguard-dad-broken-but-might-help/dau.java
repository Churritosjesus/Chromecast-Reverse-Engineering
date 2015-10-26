	private static bridge Ldau e
	public daq a
	public dbn b
	public dav c
	public dbf d
	
	    public dau()
	    {
	        this.a = 0;
	        this.b = 0;
	        this.c = 0;
	        this.d = 0;
	        this.t = -1;
	        return;
	    }
	
	
	    public static dau[] b()
	    {
	        if (dau.e == null) {
	            if (dau.e == null) {
	                dau[] v0_3 = new dau[0];
	                dau.e = v0_3;
	            }
	        }
	        return dau.e;
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
	            v0 += dep.b(4, this.d);
	        }
	        return v0;
	    }
	
	
	    public final synthetic dew a(deo p2)
	    {
	        while(true) {
	            dbf v0_0 = p2.a();
	            switch (v0_0) {
	                case 0:
	                    break;
	                case 10:
	                    if (this.a == null) {
	                        this.a = new daq();
	                    }
	                    p2.a(this.a);
	                    break;
	                case 18:
	                    if (this.b == null) {
	                        this.b = new dbn();
	                    }
	                    p2.a(this.b);
	                    break;
	                case 26:
	                    if (this.c == null) {
	                        this.c = new dav();
	                    }
	                    p2.a(this.c);
	                    break;
	                case 34:
	                    if (this.d == null) {
	                        this.d = new dbf();
	                    }
	                    p2.a(this.d);
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
	        if (this.d != null) {
	            p3.a(4, this.d);
	        }
	        super.a(p3);
	        return;
	    }
	
