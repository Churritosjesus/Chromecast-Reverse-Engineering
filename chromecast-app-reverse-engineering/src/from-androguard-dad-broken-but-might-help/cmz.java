	private static bridge Lcmz a
	private java.lang.String b
	private java.lang.String c
	
	    public cmz()
	    {
	        this.b = "";
	        this.c = "";
	        this.m = 0;
	        this.n = -1;
	        return;
	    }
	
	
	    public static cmz[] b()
	    {
	        if (cmz.a == null) {
	            if (cmz.a == null) {
	                cmz[] v0_3 = new cmz[0];
	                cmz.a = v0_3;
	            }
	        }
	        return cmz.a;
	    }
	
	
	    protected final int a()
	    {
	        int v0 = super.a();
	        if (!this.b.equals("")) {
	            v0 += cmk.b(1, this.b);
	        }
	        if (!this.c.equals("")) {
	            v0 += cmk.b(2, this.c);
	        }
	        return v0;
	    }
	
	
	    public final synthetic cms a(cmj p2)
	    {
	        while(true) {
	            String v0_0 = p2.a();
	            switch (v0_0) {
	                case 0:
	                    break;
	                case 10:
	                    this.b = p2.c();
	                    break;
	                case 18:
	                    this.c = p2.c();
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
	        if (!this.b.equals("")) {
	            p3.a(1, this.b);
	        }
	        if (!this.c.equals("")) {
	            p3.a(2, this.c);
	        }
	        super.a(p3);
	        return;
	    }
	
	
	    public final boolean equals(Object p4)
	    {
	        boolean v0 = 0;
	        if (p4 != this) {
	            if ((p4 instanceof cmz)) {
	                if (this.b != null) {
	                    if (!this.b.equals(((cmz) p4).b)) {
	                        return v0;
	                    }
	                } else {
	                    if (((cmz) p4).b != null) {
	                        return v0;
	                    }
	                }
	                if (this.c != null) {
	                    if (!this.c.equals(((cmz) p4).c)) {
	                        return v0;
	                    }
	                } else {
	                    if (((cmz) p4).c != null) {
	                        return v0;
	                    }
	                }
	                v0 = this.a(((cmz) p4));
	            }
	        } else {
	            v0 = 1;
	        }
	        return v0;
	    }
	
	
	    public final int hashCode()
	    {
	        int v0_2;
	        int v1_0 = 0;
	        if (this.b != null) {
	            v0_2 = this.b.hashCode();
	        } else {
	            v0_2 = 0;
	        }
	        int v0_4 = ((v0_2 + 527) * 31);
	        if (this.c != null) {
	            v1_0 = this.c.hashCode();
	        }
	        return (((v0_4 + v1_0) * 31) + this.c());
	    }
	
