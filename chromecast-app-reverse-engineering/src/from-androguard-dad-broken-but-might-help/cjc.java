	private static bridge Lcjc c
	public java.lang.String a
	public cix b
	private cje d
	
	    public cjc()
	    {
	        this.a = "";
	        this.d = 0;
	        this.b = 0;
	        this.m = 0;
	        this.n = -1;
	        return;
	    }
	
	
	    public static cjc[] b()
	    {
	        if (cjc.c == null) {
	            if (cjc.c == null) {
	                cjc[] v0_3 = new cjc[0];
	                cjc.c = v0_3;
	            }
	        }
	        return cjc.c;
	    }
	
	
	    protected final int a()
	    {
	        int v0 = super.a();
	        if (!this.a.equals("")) {
	            v0 += cmk.b(1, this.a);
	        }
	        if (this.d != null) {
	            v0 += cmk.b(2, this.d);
	        }
	        if (this.b != null) {
	            v0 += cmk.b(3, this.b);
	        }
	        return v0;
	    }
	
	
	    public final synthetic cms a(cmj p2)
	    {
	        while(true) {
	            cix v0_0 = p2.a();
	            switch (v0_0) {
	                case 0:
	                    break;
	                case 10:
	                    this.a = p2.c();
	                    break;
	                case 18:
	                    if (this.d == null) {
	                        this.d = new cje();
	                    }
	                    p2.a(this.d);
	                    break;
	                case 26:
	                    if (this.b == null) {
	                        this.b = new cix();
	                    }
	                    p2.a(this.b);
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
	        if (!this.a.equals("")) {
	            p3.a(1, this.a);
	        }
	        if (this.d != null) {
	            p3.a(2, this.d);
	        }
	        if (this.b != null) {
	            p3.a(3, this.b);
	        }
	        super.a(p3);
	        return;
	    }
	
	
	    public final boolean equals(Object p4)
	    {
	        boolean v0 = 0;
	        if (p4 != this) {
	            if ((p4 instanceof cjc)) {
	                if (this.a != null) {
	                    if (!this.a.equals(((cjc) p4).a)) {
	                        return v0;
	                    }
	                } else {
	                    if (((cjc) p4).a != null) {
	                        return v0;
	                    }
	                }
	                if (this.d != null) {
	                    if (!this.d.equals(((cjc) p4).d)) {
	                        return v0;
	                    }
	                } else {
	                    if (((cjc) p4).d != null) {
	                        return v0;
	                    }
	                }
	                if (this.b != null) {
	                    if (!this.b.equals(((cjc) p4).b)) {
	                        return v0;
	                    }
	                } else {
	                    if (((cjc) p4).b != null) {
	                        return v0;
	                    }
	                }
	                v0 = this.a(((cjc) p4));
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
	        if (this.a != null) {
	            v0_2 = this.a.hashCode();
	        } else {
	            v0_2 = 0;
	        }
	        int v0_6;
	        cix v2_0 = ((v0_2 + 527) * 31);
	        if (this.d != null) {
	            v0_6 = this.d.hashCode();
	        } else {
	            v0_6 = 0;
	        }
	        int v0_8 = ((v0_6 + v2_0) * 31);
	        if (this.b != null) {
	            v1_0 = this.b.hashCode();
	        }
	        return (((v0_8 + v1_0) * 31) + this.c());
	    }
	
