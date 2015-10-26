	private  a
	private java.lang.String b
	private java.lang.String c
	
	    public cmw()
	    {
	        this.a = 0;
	        this.b = "";
	        this.c = "";
	        this.m = 0;
	        this.n = -1;
	        return;
	    }
	
	
	    protected final int a()
	    {
	        int v0 = super.a();
	        if (this.a != 0) {
	            v0 += cmk.b(1, this.a);
	        }
	        if (!this.b.equals("")) {
	            v0 += cmk.b(2, this.b);
	        }
	        if (!this.c.equals("")) {
	            v0 += cmk.b(3, this.c);
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
	                case 8:
	                    String v0_3 = p2.e();
	                    switch (v0_3) {
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
	                            this.a = v0_3;
	                            break;
	                        default:
	                    }
	                    break;
	                case 18:
	                    this.b = p2.c();
	                    break;
	                case 26:
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
	        if (this.a != 0) {
	            p3.a(1, this.a);
	        }
	        if (!this.b.equals("")) {
	            p3.a(2, this.b);
	        }
	        if (!this.c.equals("")) {
	            p3.a(3, this.c);
	        }
	        super.a(p3);
	        return;
	    }
	
	
	    public final boolean equals(Object p4)
	    {
	        boolean v0 = 0;
	        if (p4 != this) {
	            if (((p4 instanceof cmw)) && (this.a == ((cmw) p4).a)) {
	                if (this.b != null) {
	                    if (!this.b.equals(((cmw) p4).b)) {
	                        return v0;
	                    }
	                } else {
	                    if (((cmw) p4).b != null) {
	                        return v0;
	                    }
	                }
	                if (this.c != null) {
	                    if (!this.c.equals(((cmw) p4).c)) {
	                        return v0;
	                    }
	                } else {
	                    if (((cmw) p4).c != null) {
	                        return v0;
	                    }
	                }
	                v0 = this.a(((cmw) p4));
	            }
	        } else {
	            v0 = 1;
	        }
	        return v0;
	    }
	
	
	    public final int hashCode()
	    {
	        int v0_4;
	        int v1_0 = 0;
	        String v2_0 = ((this.a + 527) * 31);
	        if (this.b != null) {
	            v0_4 = this.b.hashCode();
	        } else {
	            v0_4 = 0;
	        }
	        int v0_6 = ((v0_4 + v2_0) * 31);
	        if (this.c != null) {
	            v1_0 = this.c.hashCode();
	        }
	        return (((v0_6 + v1_0) * 31) + this.c());
	    }
	
